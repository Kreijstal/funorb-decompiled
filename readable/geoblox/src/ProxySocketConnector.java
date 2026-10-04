/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ProxySocketConnector extends SocketConnector {
    static Sprite logoGlowRaster;
    static int gameplayOriginScreenId;
    private java.net.ProxySelector proxySelector;
    static TextTemplateArgumentType textTemplateArgumentTypeEight;
    static ResourceArchive instrumentPatchArchive;

    final static void selectThemeRenderAssets(byte methodGuard) {
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard <= 75) {
          instrumentPatchArchive = (ResourceArchive) null;
        }
        if (GameScreen.selectedThemeId == 4) {
          MatchScoringSupport.selectedThemeForeground = DisplayNamePanel.bakingForegroundSprite;
          SpawnQuotaSupport.selectedThemeBackground = FifoResponseToken.bakingBackgroundSprite;
        } else {
          if (GameScreen.selectedThemeId == 1) {
            SpawnQuotaSupport.selectedThemeBackground = GzipInflater.sunBackgroundSprite;
            MatchScoringSupport.selectedThemeForeground = PacketByteCipher.sunForegroundSprite;
          } else {
            if (GameScreen.selectedThemeId == 3) {
              MatchScoringSupport.selectedThemeForeground = UsernameAvailabilityQuery.germsForegroundSprite;
              SpawnQuotaSupport.selectedThemeBackground = SharedBufferPools.germsBackgroundSprite;
            } else {
              if (GameScreen.selectedThemeId != 0) {
                if (6 != GameScreen.selectedThemeId) {
                  if (GameScreen.selectedThemeId != 5) {
                    if (2 == GameScreen.selectedThemeId) {
                      SpawnQuotaSupport.selectedThemeBackground = ValidationMessageWidget.sweetsBackgroundSprite;
                      MatchScoringSupport.selectedThemeForeground = SessionInstanceState.sweetsForegroundSprite;
                    }
                  } else {
                    SpawnQuotaSupport.selectedThemeBackground = AlternateLongAndTextLoginPayload.sportsBackgroundSprite;
                    MatchScoringSupport.selectedThemeForeground = LabeledChildWidget.sportsForegroundSprite;
                  }
                } else {
                  MatchScoringSupport.selectedThemeForeground = GameSoundResources.spaceForegroundSprite;
                  SpawnQuotaSupport.selectedThemeBackground = LoginPayload.spaceBackgroundSprite;
                }
              } else {
                SpawnQuotaSupport.selectedThemeBackground = CachedArchiveSource.jewelsBackgroundSprite;
                MatchScoringSupport.selectedThemeForeground = MidiPcmStream.jewelsForegroundSprite;
              }
            }
          }
        }
    }

    public static void releaseProxyConnectorSharedResources(int methodGuard) {
        if (methodGuard != 1353) {
            return;
        }
        instrumentPatchArchive = null;
        logoGlowRaster = null;
        textTemplateArgumentTypeEight = null;
    }

    private final java.net.Socket connectThroughProxy(java.net.Proxy proxy, byte methodGuard) throws IOException {
        java.net.Socket directSocketBeforeReturn = null;
        Object socksSocketBeforeReturn = null;
        java.net.Socket tunnelSocketBeforeReturn = null;
        RuntimeException connectionFailureBeforeDescription = null;
        StringBuilder connectionMessagePrefix = null;
        String proxyDescription = null;
        Throwable caughtProxyOrReflectionFailure = null;
        java.net.SocketAddress proxyAddress = null;
        RuntimeException connectionFailureForContext = null;
        java.net.InetSocketAddress proxyEndpoint = null;
        Object socksSocketOrAuthorizationHeader = null;
        Class authenticationInfoClass = null;
        Exception ignoredAuthenticationReflectionFailure = null;
        java.lang.reflect.Method lookupProxyAuthMethod = null;
        Object cachedProxyAuthentication = null;
        java.lang.reflect.Method supportsPreemptiveAuthorizationMethod = null;
        java.lang.reflect.Method getAuthenticationHeaderNameMethod = null;
        java.lang.reflect.Method getAuthenticationHeaderValueMethod = null;
        String authenticationHeaderName = null;
        String authenticationHeaderValue = null;
        Class resolvedAuthenticationInfoClass = null;
        try {
          if (proxy.type() == java.net.Proxy.Type.DIRECT) {
            directSocketBeforeReturn = this.connectDirect(1);
            return directSocketBeforeReturn;
          }
          proxyAddress = proxy.address();
          if (methodGuard != -18) {
            logoGlowRaster = (Sprite) null;
          }
          if (!((Object) proxyAddress instanceof java.net.InetSocketAddress)) {
            return null;
          }
          proxyEndpoint = (java.net.InetSocketAddress) ((Object) proxyAddress);
          if (proxy.type() != java.net.Proxy.Type.HTTP) {
            if (proxy.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            socksSocketOrAuthorizationHeader = new java.net.Socket(proxy);
            ((java.net.Socket) (socksSocketOrAuthorizationHeader)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.destinationHost, this.destinationPort)));
            socksSocketBeforeReturn = socksSocketOrAuthorizationHeader;
            return (java.net.Socket) (socksSocketBeforeReturn);
          }
          socksSocketOrAuthorizationHeader = null;
          try {
            resolvedAuthenticationInfoClass = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            authenticationInfoClass = resolvedAuthenticationInfoClass;
            lookupProxyAuthMethod = resolvedAuthenticationInfoClass.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            lookupProxyAuthMethod.setAccessible(true);
            cachedProxyAuthentication = lookupProxyAuthMethod.invoke((Object) null, new Object[]{proxyEndpoint.getHostName(), new Integer(proxyEndpoint.getPort())});
            if (cachedProxyAuthentication != null) {
              supportsPreemptiveAuthorizationMethod = authenticationInfoClass.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              supportsPreemptiveAuthorizationMethod.setAccessible(true);
              if (((Boolean) (supportsPreemptiveAuthorizationMethod.invoke(cachedProxyAuthentication, new Object[]{}))).booleanValue()) {
                getAuthenticationHeaderNameMethod = authenticationInfoClass.getDeclaredMethod("getHeaderName", new Class[]{});
                getAuthenticationHeaderNameMethod.setAccessible(true);
                getAuthenticationHeaderValueMethod = resolvedAuthenticationInfoClass.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                getAuthenticationHeaderValueMethod.setAccessible(true);
                authenticationHeaderName = (String) (getAuthenticationHeaderNameMethod.invoke(cachedProxyAuthentication, new Object[]{}));
                authenticationHeaderValue = (String) (getAuthenticationHeaderValueMethod.invoke(cachedProxyAuthentication, new Object[]{new java.net.URL("https://" + this.destinationHost + "/"), "https"}));
                socksSocketOrAuthorizationHeader = authenticationHeaderName + ": " + authenticationHeaderValue;
              }
            }
          } catch (java.lang.Exception authenticationReflectionFailure) {
            caughtProxyOrReflectionFailure = authenticationReflectionFailure;
            ignoredAuthenticationReflectionFailure = (Exception) (Object) caughtProxyOrReflectionFailure;
          }
          tunnelSocketBeforeReturn = this.connectHttpTunnel((byte) -60, (String) (socksSocketOrAuthorizationHeader), proxyEndpoint.getPort(), proxyEndpoint.getHostName());
          return tunnelSocketBeforeReturn;
        } catch (java.lang.RuntimeException proxyConnectionFailure) {
          caughtProxyOrReflectionFailure = proxyConnectionFailure;
          connectionFailureForContext = (RuntimeException) (Object) caughtProxyOrReflectionFailure;
          connectionFailureBeforeDescription = connectionFailureForContext;
          connectionMessagePrefix = new StringBuilder().append("cd.L(");
          if (proxy == null) {
            proxyDescription = "null";
          } else {
            proxyDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) connectionFailureBeforeDescription), ((StringBuilder) (Object) connectionMessagePrefix).append(proxyDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final java.net.Socket connectUsingSystemProxies(int firstProxyIndex) throws IOException {
        int destinationUsesHttpsBeforeSelection = 0;
        java.net.ProxySelector selectorBeforePrimaryLookup;
        java.net.URI unusedPrimaryUriBeforeScheme;
        java.net.URI unusedPrimaryUriAllocationBeforeScheme;
        StringBuilder primaryUriBuilder;
        java.net.URI unusedPrimaryUriAfterScheme = null;
        java.net.URI unusedPrimaryUriAllocationAfterScheme = null;
        String primaryScheme = null;
        java.net.ProxySelector selectorBeforeSecondaryLookup;
        java.net.URI unusedSecondaryUriBeforeScheme;
        java.net.URI unusedSecondaryUriAllocationBeforeScheme;
        StringBuilder secondaryUriBuilder;
        java.net.URI unusedSecondaryUriAfterScheme;
        java.net.URI unusedSecondaryUriAllocationAfterScheme;
        String secondaryScheme;
        java.net.Socket connectedSocketBeforeReturn = null;
        Throwable caughtSelectionOrConnectionFailure = null;
        List primaryProxyList = null;
        List secondaryProxyList = null;
        int destinationUsesHttps = 0;
        java.net.URISyntaxException ignoredProxyUriFailure = null;
        Object[] allocatedProxyArray = null;
        Object lastAuthenticationFailure = null;
        Object[] proxyCandidates = null;
        int proxyIndex = 0;
        Object proxyCandidateBeforeCast = null;
        java.net.Proxy proxyCandidate = null;
        java.net.Socket connectedSocket = null;
        ProxyAuthenticationRequiredException authenticationFailureToRetain = null;
        IOException ignoredProxyIoFailure = null;
        int clientControlSnapshot = 0;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        destinationUsesHttpsBeforeSelection = (this.destinationPort != 443) ? 0 : 1;
        destinationUsesHttps = destinationUsesHttpsBeforeSelection;
        try {
          selectorBeforePrimaryLookup = this.proxySelector;
          unusedPrimaryUriBeforeScheme = null;
          unusedPrimaryUriAllocationBeforeScheme = null;
          primaryUriBuilder = new StringBuilder();
          if (destinationUsesHttps == 0) {
            unusedPrimaryUriAfterScheme = null;
            unusedPrimaryUriAllocationAfterScheme = null;
            primaryScheme = "http";
          } else {
            unusedPrimaryUriAfterScheme = null;
            unusedPrimaryUriAllocationAfterScheme = null;
            primaryScheme = "https";
          }
          primaryProxyList = ((java.net.ProxySelector) (Object) selectorBeforePrimaryLookup).select(new java.net.URI(((StringBuilder) (Object) primaryUriBuilder).append(primaryScheme).append("://").append(this.destinationHost).toString()));
          selectorBeforeSecondaryLookup = this.proxySelector;
          unusedSecondaryUriBeforeScheme = null;
          unusedSecondaryUriAllocationBeforeScheme = null;
          secondaryUriBuilder = new StringBuilder();
          if (destinationUsesHttps != 0) {
            unusedSecondaryUriAfterScheme = null;
            unusedSecondaryUriAllocationAfterScheme = null;
            secondaryScheme = "http";
          } else {
            unusedSecondaryUriAfterScheme = null;
            unusedSecondaryUriAllocationAfterScheme = null;
            secondaryScheme = "https";
          }
          secondaryProxyList = ((java.net.ProxySelector) (Object) selectorBeforeSecondaryLookup).select(new java.net.URI(((StringBuilder) (Object) secondaryUriBuilder).append(secondaryScheme).append("://").append(this.destinationHost).toString()));
        } catch (java.net.URISyntaxException proxyUriFailure) {
          caughtSelectionOrConnectionFailure = proxyUriFailure;
          ignoredProxyUriFailure = (java.net.URISyntaxException) (Object) caughtSelectionOrConnectionFailure;
          return this.connectDirect(1);
        }
        primaryProxyList.addAll((Collection) ((Object) secondaryProxyList));
        allocatedProxyArray = primaryProxyList.toArray();
        lastAuthenticationFailure = null;
        proxyCandidates = allocatedProxyArray;
        proxyIndex = firstProxyIndex;
        while (proxyIndex < proxyCandidates.length) {
          proxyCandidateBeforeCast = proxyCandidates[proxyIndex];
          proxyCandidate = (java.net.Proxy) (proxyCandidateBeforeCast);
          try {
              if (false) throw (ProxyAuthenticationRequiredException) null;
            connectedSocket = this.connectThroughProxy(proxyCandidate, (byte) -18);
            if (connectedSocket != null) {
              connectedSocketBeforeReturn = connectedSocket;
              return connectedSocketBeforeReturn;
            }
            proxyIndex++;
          } catch (ProxyAuthenticationRequiredException proxyAuthenticationFailure) {
            caughtSelectionOrConnectionFailure = proxyAuthenticationFailure;
            authenticationFailureToRetain = (ProxyAuthenticationRequiredException) (Object) caughtSelectionOrConnectionFailure;
            lastAuthenticationFailure = authenticationFailureToRetain;
            proxyIndex++;
          } catch (java.io.IOException proxyIoFailure) {
            caughtSelectionOrConnectionFailure = proxyIoFailure;
            ignoredProxyIoFailure = (IOException) (Object) caughtSelectionOrConnectionFailure;
            proxyIndex++;
          }
        }
        if (lastAuthenticationFailure != null) {
          throw ProxySocketConnector.<RuntimeException>$cfr$sneakyThrow((Throwable) lastAuthenticationFailure);
        }
        return this.connectDirect(1);
    }

    private final java.net.Socket connectHttpTunnel(byte methodGuard, String authorizationHeader, int proxyPort, String proxyHost) throws IOException {
        java.net.Socket acceptedSocketBeforeReturn = null;
        Object nullSocketAfterRejectedResponse = null;
        RuntimeException tunnelFailureBeforeDescription = null;
        StringBuilder tunnelMessagePrefix = null;
        String authorizationHeaderDescription = null;
        StringBuilder messageBeforeProxyHost = null;
        String proxyHostDescription = null;
        RuntimeException caughtTunnelFailure = null;
        RuntimeException tunnelFailureForContext = null;
        OutputStream proxyOutputStream = null;
        BufferedReader proxyResponseReader = null;
        String statusLineOrChallengeHeaderOrScheme = null;
        int unusedGuardRemainder = 0;
        int scannedHeaderCount = 0;
        String authenticateHeaderPrefix = null;
        int authenticationSchemeSeparator = 0;
        int clientControlSnapshot = 0;
        java.net.Socket proxySocket = null;
        String trimmedAuthenticationChallenge = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          proxySocket = new java.net.Socket(proxyHost, proxyPort);
          proxySocket.setSoTimeout(10000);
          proxyOutputStream = proxySocket.getOutputStream();
          if (authorizationHeader == null) {
            proxyOutputStream.write(("CONNECT " + this.destinationHost + ":" + this.destinationPort + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            proxyOutputStream.write(("CONNECT " + this.destinationHost + ":" + this.destinationPort + " HTTP/1.0\n" + authorizationHeader + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          connectResponseAcceptance: {
            proxyOutputStream.flush();
            proxyResponseReader = new BufferedReader((Reader) ((Object) new InputStreamReader(proxySocket.getInputStream())));
            unusedGuardRemainder = -22 % ((3 - methodGuard) / 53);
            statusLineOrChallengeHeaderOrScheme = proxyResponseReader.readLine();
            if (statusLineOrChallengeHeaderOrScheme != null) {
              if ((!statusLineOrChallengeHeaderOrScheme.startsWith("HTTP/1.0 200")) &&
                  (!statusLineOrChallengeHeaderOrScheme.startsWith("HTTP/1.1 200"))) {
                if ((!statusLineOrChallengeHeaderOrScheme.startsWith("HTTP/1.0 407")) &&
                    (!statusLineOrChallengeHeaderOrScheme.startsWith("HTTP/1.1 407"))) {
                  break connectResponseAcceptance;
                }
                scannedHeaderCount = 0;
                authenticateHeaderPrefix = "proxy-authenticate: ";
                statusLineOrChallengeHeaderOrScheme = authenticateHeaderPrefix;
                statusLineOrChallengeHeaderOrScheme = authenticateHeaderPrefix;
                statusLineOrChallengeHeaderOrScheme = proxyResponseReader.readLine();
                while (statusLineOrChallengeHeaderOrScheme != null) {
                  if (scannedHeaderCount < 50) {
                    if (!statusLineOrChallengeHeaderOrScheme.toLowerCase().startsWith(authenticateHeaderPrefix)) {
                      statusLineOrChallengeHeaderOrScheme = proxyResponseReader.readLine();
                      scannedHeaderCount++;
                      continue;
                    }
                    trimmedAuthenticationChallenge = statusLineOrChallengeHeaderOrScheme.substring(authenticateHeaderPrefix.length()).trim();
                    statusLineOrChallengeHeaderOrScheme = trimmedAuthenticationChallenge;
                    statusLineOrChallengeHeaderOrScheme = trimmedAuthenticationChallenge;
                    statusLineOrChallengeHeaderOrScheme = trimmedAuthenticationChallenge;
                    authenticationSchemeSeparator = trimmedAuthenticationChallenge.indexOf(' ');
                    if (authenticationSchemeSeparator != -1) {
                      statusLineOrChallengeHeaderOrScheme = trimmedAuthenticationChallenge.substring(0, authenticationSchemeSeparator);
                    }
                    throw new ProxyAuthenticationRequiredException(statusLineOrChallengeHeaderOrScheme);
                  }
                  break;
                }
                throw new ProxyAuthenticationRequiredException("");
              }
              acceptedSocketBeforeReturn = proxySocket;
              return acceptedSocketBeforeReturn;
            }
          }
          proxyOutputStream.close();
          proxyResponseReader.close();
          proxySocket.close();
          nullSocketAfterRejectedResponse = null;
          return (java.net.Socket) (nullSocketAfterRejectedResponse);
        } catch (java.lang.RuntimeException tunnelFailure) {
          caughtTunnelFailure = tunnelFailure;
          tunnelFailureForContext = caughtTunnelFailure;
          tunnelFailureBeforeDescription = tunnelFailureForContext;
          tunnelMessagePrefix = new StringBuilder().append("cd.J(").append(methodGuard).append(',');
          if (authorizationHeader == null) {
            authorizationHeaderDescription = "null";
          } else {
            authorizationHeaderDescription = "{...}";
          }
          messageBeforeProxyHost = ((StringBuilder) (Object) tunnelMessagePrefix).append(authorizationHeaderDescription).append(',').append(proxyPort).append(',');
          if (proxyHost == null) {
            proxyHostDescription = "null";
          } else {
            proxyHostDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) tunnelFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeProxyHost).append(proxyHostDescription).append(')').toString());
        }
    }

    static int andInt(int left, int right) {
        return left & right;
    }

    ProxySocketConnector() {
        this.proxySelector = java.net.ProxySelector.getDefault();
    }

    static {
        gameplayOriginScreenId = -1;
        logoGlowRaster = new Sprite(270, 70);
        textTemplateArgumentTypeEight = new TextTemplateArgumentType(8, 0, 4, 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
