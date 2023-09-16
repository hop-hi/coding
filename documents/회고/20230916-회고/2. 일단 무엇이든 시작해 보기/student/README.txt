
# gradle PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
keytool -importcert -keystore D:/install/openjdk-15.0.2_windows-x64_bin/jdk-15.0.2/lib/security/cacerts -storepass changeit -trustcacerts -alias maven-1 -file "C:/Users/218001_D/Downloads/maven-2022.cer"