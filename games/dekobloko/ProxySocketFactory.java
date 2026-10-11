/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ProxySocketFactory extends SocketFactory {
    static IndexedSprite[][] indexedSpriteArrayArrayState0003;
    static int integerState0732;
    static String stringState0493;
    static boolean booleanState0169;
    private java.net.ProxySelector proxySelectorState0001;
    static char[] characterArrayState0008;
    static String stringState0494;
    static String stringState0495;
    static CodecSupport002 codecSupport002State0001;

    final java.net.Socket computeSocket1679(int integerArgument1) throws IOException {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        java.net.ProxySelector stackProxySelectorLocal3;
        java.net.URI stackURILocal4;
        java.net.URI stackURILocal5;
        StringBuilder stackStringBuilderLocal6;
        java.net.URI stackURILocal7 = null;
        java.net.URI stackURILocal8 = null;
        String stackStringLocal9 = null;
        java.net.ProxySelector stackProxySelectorLocal10;
        java.net.URI stackURILocal11;
        java.net.URI stackURILocal12;
        StringBuilder stackStringBuilderLocal13;
        java.net.URI stackURILocal14;
        java.net.URI stackURILocal15;
        String stackStringLocal16;
        java.net.Socket stackSocketLocal17 = null;
        Throwable caughtExceptionLocal18 = null;
        List listLocal19 = null;
        List listLocal20 = null;
        int integerLocal21 = 0;
        java.net.URISyntaxException uRISyntaxExceptionLocal22 = null;
        Object[] objectArrayLocal23 = null;
        Object objectLocal24 = null;
        Object[] objectArrayLocal25 = null;
        Object objectLocal26 = null;
        java.net.Proxy proxyLocal27 = null;
        java.net.Socket socketLocal28 = null;
        DiagnosticSupport001 diagnosticSupport001Local29 = null;
        IOException iOExceptionLocal30 = null;
        int integerLocal31 = 0;
        integerLocal31 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIntegerLocal2 = (443 != this.integerState0927) ? 0 : 1;
        integerLocal21 = stackIntegerLocal2;
        try {
          stackProxySelectorLocal3 = this.proxySelectorState0001;
          stackURILocal4 = null;
          stackURILocal5 = null;
          stackStringBuilderLocal6 = new StringBuilder();
          if (integerLocal21 != 0) {
            stackURILocal7 = null;
            stackURILocal8 = null;
            stackStringLocal9 = "https";
          } else {
            stackURILocal7 = null;
            stackURILocal8 = null;
            stackStringLocal9 = "http";
          }
          listLocal19 = ((java.net.ProxySelector) (Object) stackProxySelectorLocal3).select(new java.net.URI(((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal9).append("://").append(this.stringState0614).toString()));
          stackProxySelectorLocal10 = this.proxySelectorState0001;
          stackURILocal11 = null;
          stackURILocal12 = null;
          stackStringBuilderLocal13 = new StringBuilder();
          if (integerLocal21 == 0) {
            stackURILocal14 = null;
            stackURILocal15 = null;
            stackStringLocal16 = "https";
          } else {
            stackURILocal14 = null;
            stackURILocal15 = null;
            stackStringLocal16 = "http";
          }
          listLocal20 = ((java.net.ProxySelector) (Object) stackProxySelectorLocal10).select(new java.net.URI(((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal16).append("://").append(this.stringState0614).toString()));
        } catch (java.net.URISyntaxException caughtParameterLocal32) {
          caughtExceptionLocal18 = caughtParameterLocal32;
          uRISyntaxExceptionLocal22 = (java.net.URISyntaxException) (Object) caughtExceptionLocal18;
          return this.computeSocket2027(2);
        }
        listLocal19.addAll((Collection) ((Object) listLocal20));
        objectArrayLocal23 = listLocal19.toArray();
        if (integerArgument1 >= -2) {
          ProxySocketFactory.performAction1681(true);
        }
        objectLocal24 = null;
        objectArrayLocal25 = objectArrayLocal23;
        for (integerLocal1 = 0; objectArrayLocal25.length > integerLocal1; integerLocal1++) {
          objectLocal26 = objectArrayLocal25[integerLocal1];
          proxyLocal27 = (java.net.Proxy) (objectLocal26);
          try {
            if (false) throw (DiagnosticSupport001) null;
            socketLocal28 = this.computeSocket1678((byte) -86, proxyLocal27);
            if (socketLocal28 != null) {
              stackSocketLocal17 = socketLocal28;
              return stackSocketLocal17;
            }
          } catch (DiagnosticSupport001 caughtParameterLocal33) {
            caughtExceptionLocal18 = caughtParameterLocal33;
            diagnosticSupport001Local29 = (DiagnosticSupport001) (Object) caughtExceptionLocal18;
            objectLocal24 = diagnosticSupport001Local29;
          } catch (java.io.IOException caughtParameterLocal34) {
            caughtExceptionLocal18 = caughtParameterLocal34;
            iOExceptionLocal30 = (IOException) (Object) caughtExceptionLocal18;
          }
        }
        if (objectLocal24 == null) {
          return this.computeSocket2027(2);
        }
        throw ProxySocketFactory.<RuntimeException>computeRuntimeException1677((Throwable) objectLocal24);
    }

    private final java.net.Socket computeSocket1678(byte byteArgument1, java.net.Proxy proxyArgument2) throws IOException {
        java.net.Socket stackSocketLocal1 = null;
        java.net.Socket stackSocketLocal2 = null;
        java.net.Socket stackSocketLocal3 = null;
        Object stackObjectLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        Throwable caughtExceptionLocal8 = null;
        java.net.SocketAddress socketAddressLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        java.net.InetSocketAddress inetSocketAddressLocal11 = null;
        Object objectLocal12 = null;
        Class classLocal13 = null;
        Exception exceptionLocal14 = null;
        java.lang.reflect.Method methodLocal15 = null;
        Object objectLocal16 = null;
        java.lang.reflect.Method methodLocal17 = null;
        java.lang.reflect.Method methodLocal18 = null;
        java.lang.reflect.Method methodLocal19 = null;
        String stringLocal20 = null;
        String stringLocal21 = null;
        Class classLocal22 = null;
        try {
          if (proxyArgument2.type() == java.net.Proxy.Type.DIRECT) {
            stackSocketLocal1 = this.computeSocket2027(2);
            return stackSocketLocal1;
          }
          if (byteArgument1 >= -82) {
            stackSocketLocal2 = (java.net.Socket) null;
            return stackSocketLocal2;
          }
          socketAddressLocal9 = proxyArgument2.address();
          if (!((Object) socketAddressLocal9 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          inetSocketAddressLocal11 = (java.net.InetSocketAddress) ((Object) socketAddressLocal9);
          if (proxyArgument2.type() != java.net.Proxy.Type.HTTP) {
            if (proxyArgument2.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            objectLocal12 = new java.net.Socket(proxyArgument2);
            ((java.net.Socket) (objectLocal12)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.stringState0614, this.integerState0927)));
            stackObjectLocal4 = objectLocal12;
            return (java.net.Socket) (stackObjectLocal4);
          }
          objectLocal12 = null;
          try {
            classLocal22 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            classLocal13 = classLocal22;
            methodLocal15 = classLocal22.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            methodLocal15.setAccessible(true);
            objectLocal16 = methodLocal15.invoke((Object) null, new Object[]{inetSocketAddressLocal11.getHostName(), new Integer(inetSocketAddressLocal11.getPort())});
            if (objectLocal16 != null) {
              methodLocal17 = classLocal13.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              methodLocal17.setAccessible(true);
              if (((Boolean) (methodLocal17.invoke(objectLocal16, new Object[]{}))).booleanValue()) {
                methodLocal18 = classLocal13.getDeclaredMethod("getHeaderName", new Class[]{});
                methodLocal18.setAccessible(true);
                methodLocal19 = classLocal22.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                methodLocal19.setAccessible(true);
                stringLocal20 = (String) (methodLocal18.invoke(objectLocal16, new Object[]{}));
                stringLocal21 = (String) (methodLocal19.invoke(objectLocal16, new Object[]{new java.net.URL("https://" + this.stringState0614 + "/"), "https"}));
                objectLocal12 = stringLocal20 + ": " + stringLocal21;
              }
            }
          } catch (java.lang.Exception caughtParameterLocal23) {
            caughtExceptionLocal8 = caughtParameterLocal23;
            exceptionLocal14 = (Exception) (Object) caughtExceptionLocal8;
          }
          stackSocketLocal3 = this.computeSocket1680((String) (objectLocal12), inetSocketAddressLocal11.getPort(), inetSocketAddressLocal11.getHostName(), 1323);
          return stackSocketLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal24) {
          caughtExceptionLocal8 = caughtParameterLocal24;
          runtimeExceptionLocal10 = (RuntimeException) (Object) caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal10;
          stackStringBuilderLocal6 = new StringBuilder().append("sc.I(").append(byteArgument1).append(',');
          if (proxyArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    private final java.net.Socket computeSocket1680(String stringArgument1, int integerArgument2, String stringArgument3, int integerArgument4) throws IOException {
        java.net.Socket stackSocketLocal1 = null;
        Object stackObjectLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        OutputStream outputStreamLocal10 = null;
        BufferedReader bufferedReaderLocal11 = null;
        String stringLocal12 = null;
        int integerLocal13 = 0;
        String stringLocal14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        java.net.Socket socketLocal17 = null;
        String stringLocal18 = null;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          socketLocal17 = new java.net.Socket(stringArgument3, integerArgument2);
          socketLocal17.setSoTimeout(10000);
          outputStreamLocal10 = socketLocal17.getOutputStream();
          if (stringArgument1 == null) {
            outputStreamLocal10.write(("CONNECT " + this.stringState0614 + ":" + this.integerState0927 + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            outputStreamLocal10.write(("CONNECT " + this.stringState0614 + ":" + this.integerState0927 + " HTTP/1.0\n" + stringArgument1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          outputStreamLocal10.flush();
          if (integerArgument4 != 1323) {
            this.proxySelectorState0001 = (java.net.ProxySelector) null;
          }
          boolean frameRemainderLocal19 = true;
          bufferedReaderLocal11 = new BufferedReader((Reader) ((Object) new InputStreamReader(socketLocal17.getInputStream())));
          stringLocal12 = bufferedReaderLocal11.readLine();
          if (stringLocal12 != null) {
            if ((!stringLocal12.startsWith("HTTP/1.0 200") &&
              !stringLocal12.startsWith("HTTP/1.1 200")) &&
              (frameRemainderLocal19 = (stringLocal12.startsWith("HTTP/1.0 407") ||
              stringLocal12.startsWith("HTTP/1.1 407")))) {
              integerLocal13 = 0;
              stringLocal12 = bufferedReaderLocal11.readLine();
              stringLocal14 = "proxy-authenticate: ";
              while (stringLocal12 != null) {
                if (integerLocal13 < 50) {
                  if (!stringLocal12.toLowerCase().startsWith(stringLocal14)) {
                    stringLocal12 = bufferedReaderLocal11.readLine();
                    integerLocal13++;
                    continue;
                  }
                  stringLocal18 = stringLocal12.substring(stringLocal14.length()).trim();
                  stringLocal12 = stringLocal18;
                  integerLocal15 = stringLocal18.indexOf(' ');
                  if (integerLocal15 != -1) {
                    stringLocal12 = stringLocal18.substring(0, integerLocal15);
                  }
                  throw new DiagnosticSupport001(stringLocal12);
                }
                break;
              }
              throw new DiagnosticSupport001("");
            }
            if (frameRemainderLocal19) {
              stackSocketLocal1 = socketLocal17;
              return stackSocketLocal1;
            }
          }
          outputStreamLocal10.close();
          bufferedReaderLocal11.close();
          socketLocal17.close();
          stackObjectLocal2 = null;
          return (java.net.Socket) (stackObjectLocal2);
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal8 = caughtParameterLocal20;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal9;
          stackStringBuilderLocal4 = new StringBuilder().append("sc.J(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static boolean computeBoolean1682(byte byteArgument1) {
        int integerLocal1 = 0;
        MixedSupport075 mixedSupport075Local2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        MixedSupport075 mixedSupport075Local5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport075Local5 = (MixedSupport075) (MixedSupport002.nodeDequeState0001.computeHashNode1970((byte) -95));
          mixedSupport075Local2 = mixedSupport075Local5;
          if (mixedSupport075Local2 == null) {
            return false;
          }
          if (byteArgument1 > -57) {
            stringState0494 = (String) null;
          }
          for (integerLocal1 = 0; integerLocal1 < mixedSupport075Local2.integerState0407; integerLocal1++) {
            if (mixedSupport075Local5.asyncTaskArrayState0002[integerLocal1] != null &&
              0 == mixedSupport075Local5.asyncTaskArrayState0002[integerLocal1].integerState0510) {
              return false;
            }
            if (null != mixedSupport075Local5.asyncTaskArrayState0001[integerLocal1] &&
              mixedSupport075Local5.asyncTaskArrayState0001[integerLocal1].integerState0510 == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal3 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "sc.H(" + byteArgument1 + ')');
        }
    }

    ProxySocketFactory() {
        this.proxySelectorState0001 = java.net.ProxySelector.getDefault();
    }

    public static void performAction1681(boolean booleanArgument1) {
        indexedSpriteArrayArrayState0003 = (IndexedSprite[][]) null;
        stringState0494 = null;
        if (booleanArgument1) {
          stringState0493 = (String) null;
        }
        stringState0493 = null;
        stringState0495 = null;
        characterArrayState0008 = null;
        codecSupport002State0001 = null;
    }

    static {
        stringState0493 = "Cancel rematch";
        integerState0732 = 0;
        booleanState0169 = true;
        indexedSpriteArrayArrayState0003 = new IndexedSprite[8][];
        characterArrayState0008 = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        stringState0495 = "Waiting for sound effects";
        stringState0494 = "Cancel";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException computeRuntimeException1677(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
