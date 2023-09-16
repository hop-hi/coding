package com.mh.coding.level4;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class NIOServerTest {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("0.0.0.0");
			ServerSocketChannel acceptor = ServerSocketChannel.open();
			acceptor.socket().bind(new InetSocketAddress(addr.getHostName(), 9999));
			SocketChannel channel = acceptor.accept();
			// NIO Buffer ==> DirectByteBuffer
			ByteBuffer buffer = ByteBuffer.allocate(1000);
			channel.read(buffer);
			System.out.println(buffer.toString());
			byte[] byteArr = "하이....\n".getBytes(StandardCharsets.UTF_8);
			ByteBuffer byteBuffer = ByteBuffer.wrap(byteArr);  // HeapByteBuffer를 반환한다.
			channel.write(byteBuffer);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
