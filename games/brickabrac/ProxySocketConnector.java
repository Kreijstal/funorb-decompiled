/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ProxySocketConnector extends SocketConnector {
    static String field_h;
    static int rankingRowCount;
    static QuickChatParameterType field_i;
    private java.net.ProxySelector proxySelector;
    static UiComponent field_n;
    static int fullscreenDialogCenterX;
    static boolean field_g;
    static UiComponent field_j;

    final java.net.Socket connect(int obfuscationGuard) throws IOException {
        int candidateIndex = 0;
        int httpsPortFlag = 0;
        java.net.ProxySelector primarySelector;
        java.net.URI unusedPrimaryUri;
        java.net.URI unusedPrimaryUriAlias;
        StringBuilder primaryUriBuilder;
        java.net.URI unusedSchemeUri = null;
        java.net.URI unusedSchemeUriAlias = null;
        String primaryScheme = null;
        java.net.ProxySelector secondarySelector;
        java.net.URI unusedSecondaryUri;
        java.net.URI unusedSecondaryUriAlias;
        StringBuilder secondaryUriBuilder;
        java.net.URI unusedFallbackUri;
        java.net.URI unusedFallbackUriAlias;
        String secondaryScheme;
        java.net.Socket connectedSocket = null;
        Throwable caughtFailure = null;
        List primaryCandidates = null;
        List secondaryCandidates = null;
        int isHttpsPort = 0;
        java.net.URISyntaxException invalidTargetUri = null;
        Object[] candidateArray = null;
        Object authenticationFailure = null;
        Object[] candidates = null;
        Object candidateObject = null;
        java.net.Proxy candidateProxy = null;
        java.net.Socket candidateSocket = null;
        ProxyAuthenticationRequiredException proxyAuthenticationFailure = null;
        IOException proxyIoFailure = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        httpsPortFlag = (443 != this.targetPort) ? 0 : 1;
        isHttpsPort = httpsPortFlag;
        try {
          primarySelector = this.proxySelector;
          unusedPrimaryUri = null;
          unusedPrimaryUriAlias = null;
          primaryUriBuilder = new StringBuilder();
          if (isHttpsPort == 0) {
            unusedSchemeUri = null;
            unusedSchemeUriAlias = null;
            primaryScheme = "http";
          } else {
            unusedSchemeUri = null;
            unusedSchemeUriAlias = null;
            primaryScheme = "https";
          }
          primaryCandidates = ((java.net.ProxySelector) (Object) primarySelector).select(new java.net.URI(((StringBuilder) (Object) primaryUriBuilder).append(primaryScheme).append("://").append(this.targetHost).toString()));
          secondarySelector = this.proxySelector;
          unusedSecondaryUri = null;
          unusedSecondaryUriAlias = null;
          secondaryUriBuilder = new StringBuilder();
          if (isHttpsPort != 0) {
            unusedFallbackUri = null;
            unusedFallbackUriAlias = null;
            secondaryScheme = "http";
          } else {
            unusedFallbackUri = null;
            unusedFallbackUriAlias = null;
            secondaryScheme = "https";
          }
          secondaryCandidates = ((java.net.ProxySelector) (Object) secondarySelector).select(new java.net.URI(((StringBuilder) (Object) secondaryUriBuilder).append(secondaryScheme).append("://").append(this.targetHost).toString()));
        } catch (java.net.URISyntaxException caughtInvalidTargetUri) {
          caughtFailure = caughtInvalidTargetUri;
          invalidTargetUri = (java.net.URISyntaxException) (Object) caughtFailure;
          return this.connectDirect((byte) -76);
        }
        primaryCandidates.addAll((Collection) ((Object) secondaryCandidates));
        candidateArray = primaryCandidates.toArray();
        authenticationFailure = null;
        candidates = candidateArray;
        for (candidateIndex = obfuscationGuard; candidates.length > candidateIndex; candidateIndex++) {
          candidateObject = candidates[candidateIndex];
          candidateProxy = (java.net.Proxy) (candidateObject);
          try {
            if (false) throw (ProxyAuthenticationRequiredException) null;
            candidateSocket = this.connectViaProxy(obfuscationGuard + 8, candidateProxy);
            if (candidateSocket != null) {
              connectedSocket = candidateSocket;
              return connectedSocket;
            }
          } catch (ProxyAuthenticationRequiredException caughtAuthenticationFailure) {
            caughtFailure = caughtAuthenticationFailure;
            proxyAuthenticationFailure = (ProxyAuthenticationRequiredException) (Object) caughtFailure;
            authenticationFailure = proxyAuthenticationFailure;
          } catch (java.io.IOException caughtProxyIoFailure) {
            caughtFailure = caughtProxyIoFailure;
            proxyIoFailure = (IOException) (Object) caughtFailure;
          }
        }
        if (authenticationFailure != null) {
          throw ProxySocketConnector.<RuntimeException>$cfr$sneakyThrow((Throwable) authenticationFailure);
        }
        return this.connectDirect((byte) -76);
    }

    public static void b(byte param0) {
        if (param0 == -54) {
          field_i = null;
          field_j = null;
          field_h = null;
          field_n = null;
          return;
        }
        field_h = (String) null;
        field_i = null;
        field_j = null;
        field_h = null;
        field_n = null;
    }

    private final java.net.Socket connectHttpProxy(int obfuscationGuard, int proxyPort, String proxyHost, String authorizationHeader) throws IOException {
        java.net.Socket connectedSocket = null;
        Object failedConnection = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String proxyHostSummary = null;
        StringBuilder headerContextBuilder = null;
        String authorizationSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        OutputStream proxyOutput = null;
        BufferedReader proxyReader = null;
        String unusedStatusReference = null;
        int headerLinesSearched = 0;
        String authenticationHeaderPrefix = null;
        int schemeSeparator = 0;
        int unusedGameFlag = 0;
        java.net.Socket proxySocket = null;
        String statusLine = null;
        String authenticationValue = null;
        String unusedStatusAlias;
        String unusedHeaderPrefix;
        String unusedHeaderPrefixAlias;
        String headerOrAuthenticationScheme;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          proxySocket = new java.net.Socket(proxyHost, proxyPort);
          proxySocket.setSoTimeout(10000);
          proxyOutput = proxySocket.getOutputStream();
          if (authorizationHeader == null) {
            proxyOutput.write(("CONNECT " + this.targetHost + ":" + this.targetPort + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            proxyOutput.write(("CONNECT " + this.targetHost + ":" + this.targetPort + " HTTP/1.0\n" + authorizationHeader + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          proxyOutput.flush();
          proxyReader = new BufferedReader((Reader) ((Object) new InputStreamReader(proxySocket.getInputStream())));
          statusLine = proxyReader.readLine();
          unusedStatusReference = statusLine;
          unusedStatusAlias = statusLine;
          if (obfuscationGuard >= -61) {
            ProxySocketConnector.roundUpToEight((byte) -52, 76);
          }
          boolean acceptedOrAuthenticationStatus = true;
          if (statusLine != null) {
            if ((!statusLine.startsWith("HTTP/1.0 200") &&
              !statusLine.startsWith("HTTP/1.1 200")) &&
              (acceptedOrAuthenticationStatus = (statusLine.startsWith("HTTP/1.0 407") ||
              statusLine.startsWith("HTTP/1.1 407")))) {
              headerLinesSearched = 0;
              authenticationHeaderPrefix = "proxy-authenticate: ";
              unusedHeaderPrefix = authenticationHeaderPrefix;
              unusedHeaderPrefixAlias = authenticationHeaderPrefix;
              headerOrAuthenticationScheme = proxyReader.readLine();
              while (headerOrAuthenticationScheme != null) {
                if (headerLinesSearched < 50) {
                  if (!headerOrAuthenticationScheme.toLowerCase().startsWith(authenticationHeaderPrefix)) {
                    headerLinesSearched++;
                    headerOrAuthenticationScheme = proxyReader.readLine();
                    continue;
                  }
                  authenticationValue = headerOrAuthenticationScheme.substring(authenticationHeaderPrefix.length()).trim();
                  headerOrAuthenticationScheme = authenticationValue;
                  headerOrAuthenticationScheme = authenticationValue;
                  headerOrAuthenticationScheme = authenticationValue;
                  schemeSeparator = authenticationValue.indexOf(' ');
                  if (schemeSeparator != -1) {
                    headerOrAuthenticationScheme = authenticationValue.substring(0, schemeSeparator);
                  }
                  throw new ProxyAuthenticationRequiredException(headerOrAuthenticationScheme);
                }
                break;
              }
              throw new ProxyAuthenticationRequiredException("");
            }
            if (acceptedOrAuthenticationStatus) {
              connectedSocket = proxySocket;
              return connectedSocket;
            }
          }
          proxyOutput.close();
          proxyReader.close();
          proxySocket.close();
          failedConnection = null;
          return (java.net.Socket) (failedConnection);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wi.F(").append(obfuscationGuard).append(',').append(proxyPort).append(',');
          if (proxyHost == null) {
            proxyHostSummary = "null";
          } else {
            proxyHostSummary = "{...}";
          }
          headerContextBuilder = ((StringBuilder) (Object) contextBuilder).append(proxyHostSummary).append(',');
          if (authorizationHeader == null) {
            authorizationSummary = "null";
          } else {
            authorizationSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) headerContextBuilder).append(authorizationSummary).append(')').toString());
        }
    }

    final static int roundUpToEight(byte obfuscationGuard, int value) {
        int alignedValue = 0;
        int padding = 0;
        int guardedAlignedValue;
        if ((value & 7) != 0) {
          padding = -(value & 7) + 8;
        }
        if (obfuscationGuard <= -71) {
          alignedValue = padding + value;
          return alignedValue;
        }
        ProxySocketConnector.b((byte) -125);
        guardedAlignedValue = padding + value;
        return guardedAlignedValue;
    }

    private final java.net.Socket connectViaProxy(int obfuscationGuard, java.net.Proxy proxy) throws IOException {
        java.net.SocketAddress proxyAddress = null;
        RuntimeException failure = null;
        java.net.InetSocketAddress proxyEndpoint = null;
        Object socketOrAuthorizationHeader = null;
        Class authenticationInfoClass = null;
        java.lang.reflect.Method cachedAuthenticationLookup = null;
        Object cachedAuthentication = null;
        java.lang.reflect.Method preemptiveAuthorizationQuery = null;
        java.lang.reflect.Method headerNameQuery = null;
        java.lang.reflect.Method headerValueQuery = null;
        String authorizationHeaderName = null;
        String authorizationHeaderValue = null;
        Class loadedAuthenticationClass = null;
        java.net.Socket directSocket = null;
        java.net.Socket disabledProxyResult = null;
        java.net.Socket httpSocket = null;
        Object socksSocket = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String proxySummary = null;
        Throwable caughtFailure = null;
        Exception authenticationLookupFailure = null;
        try {
          if (proxy.type() == java.net.Proxy.Type.DIRECT) {
            directSocket = this.connectDirect((byte) -76);
            return directSocket;
          }
          proxyAddress = proxy.address();
          if (obfuscationGuard != 8) {
            disabledProxyResult = (java.net.Socket) null;
            return disabledProxyResult;
          }
          if (!((Object) proxyAddress instanceof java.net.InetSocketAddress)) {
            return null;
          }
          proxyEndpoint = (java.net.InetSocketAddress) ((Object) proxyAddress);
          if (proxy.type() != java.net.Proxy.Type.HTTP) {
            if (proxy.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            socketOrAuthorizationHeader = new java.net.Socket(proxy);
            ((java.net.Socket) (socketOrAuthorizationHeader)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.targetHost, this.targetPort)));
            socksSocket = socketOrAuthorizationHeader;
            return (java.net.Socket) (socksSocket);
          }
          socketOrAuthorizationHeader = null;
          try {
            loadedAuthenticationClass = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            authenticationInfoClass = loadedAuthenticationClass;
            cachedAuthenticationLookup = loadedAuthenticationClass.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            cachedAuthenticationLookup.setAccessible(true);
            cachedAuthentication = cachedAuthenticationLookup.invoke((Object) null, new Object[]{proxyEndpoint.getHostName(), new Integer(proxyEndpoint.getPort())});
            if (cachedAuthentication != null) {
              preemptiveAuthorizationQuery = authenticationInfoClass.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              preemptiveAuthorizationQuery.setAccessible(true);
              if (((Boolean) (preemptiveAuthorizationQuery.invoke(cachedAuthentication, new Object[]{}))).booleanValue()) {
                headerNameQuery = authenticationInfoClass.getDeclaredMethod("getHeaderName", new Class[]{});
                headerNameQuery.setAccessible(true);
                headerValueQuery = loadedAuthenticationClass.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                headerValueQuery.setAccessible(true);
                authorizationHeaderName = (String) (headerNameQuery.invoke(cachedAuthentication, new Object[]{}));
                authorizationHeaderValue = (String) (headerValueQuery.invoke(cachedAuthentication, new Object[]{new java.net.URL("https://" + this.targetHost + "/"), "https"}));
                socketOrAuthorizationHeader = authorizationHeaderName + ": " + authorizationHeaderValue;
              }
            }
          } catch (java.lang.Exception caughtAuthenticationLookupFailure) {
            caughtFailure = caughtAuthenticationLookupFailure;
            authenticationLookupFailure = (Exception) (Object) caughtFailure;
          }
          httpSocket = this.connectHttpProxy(-83, proxyEndpoint.getPort(), proxyEndpoint.getHostName(), (String) (socketOrAuthorizationHeader));
          return httpSocket;
        } catch (java.lang.RuntimeException caughtProxyFailure) {
          caughtFailure = caughtProxyFailure;
          failure = (RuntimeException) (Object) caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wi.H(").append(obfuscationGuard).append(',');
          if (proxy == null) {
            proxySummary = "null";
          } else {
            proxySummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(proxySummary).append(')').toString());
        }
    }

    ProxySocketConnector() {
        this.proxySelector = java.net.ProxySelector.getDefault();
    }

    final static int c(int param0) {
        if (param0 != 1) {
          field_j = (UiComponent) null;
          return PowerUp.keyboardIdleTicks;
        }
        return PowerUp.keyboardIdleTicks;
    }

    static {
        field_h = "Connection lost. <%0>";
        field_i = new QuickChatParameterType(8, 0, 4, 1);
        field_g = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
