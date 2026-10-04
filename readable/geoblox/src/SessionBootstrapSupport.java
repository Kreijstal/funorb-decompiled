/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SessionBootstrapSupport {
    static String loginCreateTooltipText;
    static String bonusAmountTemplateText;

    final static int greatestCommonDivisor(int left, int right, int methodGuard) {
        int swapOrRemainder = 0;
        RuntimeException gcdFailureForContext = null;
        int clientControlFlowGuard = 0;
        int gcdBeforeReturn = 0;
        RuntimeException caughtGcdFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (right > left) {
            swapOrRemainder = left;
            left = right;
            right = swapOrRemainder;
          }
          while (right != 0) {
            swapOrRemainder = left % right;
            left = right;
            right = swapOrRemainder;
          }
          if (methodGuard > -120) {
            SessionBootstrapSupport.clearSessionBootstrapTexts(6);
          }
          gcdBeforeReturn = left;
          return gcdBeforeReturn;
        } catch (java.lang.RuntimeException gcdFailure) {
          caughtGcdFailure = gcdFailure;
          gcdFailureForContext = caughtGcdFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) gcdFailureForContext), "ic.B(" + left + ',' + right + ',' + methodGuard + ')');
        }
    }

    public static void clearSessionBootstrapTexts(int methodGuard) {
        if (methodGuard != 16424) {
            return;
        }
        loginCreateTooltipText = null;
        bonusAmountTemplateText = null;
    }

    final static void initializeSessionServices(int gameCrc, long instanceId, int outgoingBufferCapacity, int clientId, boolean memberAccountMode, boolean responseExtensionEnabled, int languageId, int alternateServerPort, int incomingBufferCapacity, String serverHost, int serverNumber, PlatformTaskDispatcher taskDispatcher, int methodGuard, int serverPort) {
        try {
            RuntimeException bootstrapFailureBeforeContext = null;
            StringBuilder bootstrapMessagePrefix = null;
            String serverHostDescription = null;
            StringBuilder bootstrapMessageBeforeDispatcher = null;
            String taskDispatcherDescription = null;
            Throwable caughtBootstrapOrSeedFailure = null;
            IOException seedFileOpenFailure = null;
            RuntimeException bootstrapFailureForContext = null;
            try {
              LogoCompositor.sessionPacketBuffer = new PacketBuffer(incomingBufferCapacity);
              CacheReference.outgoingSessionBuffer = new PacketBuffer(outgoingBufferCapacity);
              GameplayEntity.sessionTaskDispatcher = taskDispatcher;
              ClientRenderingState.sessionClientId = clientId;
              SessionInstanceState.clientInstanceId = instanceId;
              NetworkArchiveRequest.sessionServerPort = serverPort;
              TextInputRenderer.alternateSessionServerPort = alternateServerPort;
              MessageDialog.loginHeaderInt = gameCrc;
              FontLoadingSupport.memberAccountMode = memberAccountMode;
              EmailAvailabilityValidator.sessionServerNumber = serverNumber;
              MultiHandleSliderWidget.sessionServerHost = serverHost;
              GameGraphicsResources.loginResponseExtensionEnabled = responseExtensionEnabled;
              FullscreenEntrySupport.sessionLanguageId = languageId;
              if (GameplayEntity.sessionTaskDispatcher.randomSeedFile != null) {
                try {
                  CacheFileState.randomSeedFile = new BufferedRandomAccessFile(GameplayEntity.sessionTaskDispatcher.randomSeedFile, 64, 0);
                } catch (java.io.IOException seedIoFailure) {
                  caughtBootstrapOrSeedFailure = seedIoFailure;
                  seedFileOpenFailure = (IOException) (Object) caughtBootstrapOrSeedFailure;
                  throw new RuntimeException(seedFileOpenFailure.toString());
                }
              }
              if (methodGuard == 64) {
                return;
              }
              loginCreateTooltipText = (String) null;
              return;
            } catch (java.lang.RuntimeException bootstrapFailure) {
              caughtBootstrapOrSeedFailure = bootstrapFailure;
              bootstrapFailureForContext = (RuntimeException) (Object) caughtBootstrapOrSeedFailure;
              bootstrapFailureBeforeContext = bootstrapFailureForContext;
              bootstrapMessagePrefix = new StringBuilder().append("ic.A(").append(gameCrc).append(',').append(instanceId).append(',').append(outgoingBufferCapacity).append(',').append(clientId).append(',').append(memberAccountMode).append(',').append(responseExtensionEnabled).append(',').append(languageId).append(',').append(alternateServerPort).append(',').append(incomingBufferCapacity).append(',');
              if (serverHost == null) {
                serverHostDescription = "null";
              } else {
                serverHostDescription = "{...}";
              }
              bootstrapMessageBeforeDispatcher = ((StringBuilder) (Object) bootstrapMessagePrefix).append(serverHostDescription).append(',').append(serverNumber).append(',');
              if (taskDispatcher == null) {
                taskDispatcherDescription = "null";
              } else {
                taskDispatcherDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) bootstrapFailureBeforeContext), ((StringBuilder) (Object) bootstrapMessageBeforeDispatcher).append(taskDispatcherDescription).append(',').append(methodGuard).append(',').append(serverPort).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBootstrapFailure) {
            throw uncheckedBootstrapFailure;
        } catch (Throwable checkedBootstrapFailure) {
            throw new RuntimeException(checkedBootstrapFailure);
        }
    }

    final static void persistSessionSeedBytes(byte methodGuard) {
        try {
            Exception ignoredSeedWriteFailure = null;
            Throwable caughtSeedWriteFailure = null;
            if (methodGuard != 65) {
              bonusAmountTemplateText = (String) null;
            }
            if (null != CacheFileState.randomSeedFile) {
              try {
                CacheFileState.randomSeedFile.seek(22, 0L);
                CacheFileState.randomSeedFile.write(24, LogoCompositor.sessionPacketBuffer.position, LogoCompositor.sessionPacketBuffer.bytes, false);
              } catch (java.lang.Exception seedWriteFailure) {
                caughtSeedWriteFailure = seedWriteFailure;
                ignoredSeedWriteFailure = (Exception) (Object) caughtSeedWriteFailure;
              }
            }
            LogoCompositor.sessionPacketBuffer.position = LogoCompositor.sessionPacketBuffer.position + 24;
        } catch (RuntimeException | Error uncheckedSeedFailure) {
            throw uncheckedSeedFailure;
        } catch (Throwable checkedSeedFailure) {
            throw new RuntimeException(checkedSeedFailure);
        }
    }

    static {
        loginCreateTooltipText = "Create your own free Jagex account";
        bonusAmountTemplateText = "Bonus: <%0>";
    }
}
