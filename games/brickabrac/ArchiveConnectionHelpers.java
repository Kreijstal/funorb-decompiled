/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ArchiveConnectionHelpers {
    static int field_b;
    static int field_a;
    static long[] tickTimes;

    public static void a(int param0) {
        tickTimes = null;
        if (param0 != 30000) {
          ArchiveConnectionHelpers.a(21);
        }
    }

    final static int pollArchiveConnection(int obfuscationGuard) {
        try {
          int connectionFailureStatus = 0;
          int timeoutFailureStatus = 0;
          int rejectedReplyStatus = 0;
          int connectedStatus = 0;
          int pendingStatus = 0;
          Throwable caughtIoFailure = null;
          int replyCode = 0;
          IOException ioFailure = null;
          PacketBuffer handshake = null;
          if (PacketReceiveHelpers.archiveFetchClient.failureCount >= 4) {
            if (-1 == PacketReceiveHelpers.archiveFetchClient.lastError) {
              return 3;
            }
            if (PacketReceiveHelpers.archiveFetchClient.lastError != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (obfuscationGuard == ~GameplayScreen.archiveConnectionPhase) {
              IndexedSpriteGeometry.archiveSocketTask = DialogMessagePanel.field_P.requestSocketConnection(LevelMetadata.archiveHost, (byte) 120, ByteArrayPoolHelpers.archiveConnectPort);
              GameplayScreen.archiveConnectionPhase = GameplayScreen.archiveConnectionPhase + 1;
            }
            if (1 == GameplayScreen.archiveConnectionPhase) {
              if (IndexedSpriteGeometry.archiveSocketTask.status == 2) {
                connectionFailureStatus = Brick.handleArchiveConnectionFailure((byte) 41, -1);
                return connectionFailureStatus;
              }
              if (IndexedSpriteGeometry.archiveSocketTask.status == 1) {
                GameplayScreen.archiveConnectionPhase = GameplayScreen.archiveConnectionPhase + 1;
              }
            }
            if (GameplayScreen.archiveConnectionPhase == 2) {
              MouseInput.pendingArchiveTransport = new BufferedSocket((java.net.Socket) (IndexedSpriteGeometry.archiveSocketTask.result), DialogMessagePanel.field_P);
              handshake = new PacketBuffer(13);
              GrowableIntList.writeServiceHeader(TextFieldWidget.serviceHeaderWordOne, 12, SoftwareFramebuffer.serviceHeaderWordTwo, CanvasViewGlobals.serviceHeaderByte, handshake);
              handshake.writeByte(obfuscationGuard ^ 119, 15);
              handshake.writeInt(ArcticBackground.archiveHandshakeWord, (byte) -79);
              MouseInput.pendingArchiveTransport.write(handshake.data, true, 13, 0);
              GameplayScreen.archiveConnectionPhase = GameplayScreen.archiveConnectionPhase + 1;
              LoginCredentials.archiveReplyDeadlineMillis = MonotonicTime.nowMillis(false) + 30000L;
            }
            if (GameplayScreen.archiveConnectionPhase == 3) {
              if (MouseInput.pendingArchiveTransport.available(10434) > 0) {
                replyCode = MouseInput.pendingArchiveTransport.readByte(0);
                if (replyCode != 0) {
                  rejectedReplyStatus = Brick.handleArchiveConnectionFailure((byte) 90, replyCode);
                  return rejectedReplyStatus;
                }
                GameplayScreen.archiveConnectionPhase = GameplayScreen.archiveConnectionPhase + 1;
              } else {
                if (LoginCredentials.archiveReplyDeadlineMillis < MonotonicTime.nowMillis(false)) {
                  timeoutFailureStatus = Brick.handleArchiveConnectionFailure((byte) -85, -2);
                  return timeoutFailureStatus;
                }
              }
            }
            if (GameplayScreen.archiveConnectionPhase != 4) {
              pendingStatus = -1;
              return pendingStatus;
            }
            PacketReceiveHelpers.archiveFetchClient.attachTransport(MouseInput.pendingArchiveTransport, GamePresentationHelpers.field_a, 12);
            MouseInput.pendingArchiveTransport = null;
            GameplayScreen.archiveConnectionPhase = 0;
            IndexedSpriteGeometry.archiveSocketTask = null;
            connectedStatus = 0;
            return connectedStatus;
          } catch (java.io.IOException caughtParameter) {
            caughtIoFailure = caughtParameter;
            ioFailure = (IOException) (Object) caughtIoFailure;
            return Brick.handleArchiveConnectionFailure((byte) -111, -3);
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    static {
        field_a = 0;
        field_b = field_a;
        tickTimes = new long[32];
    }
}
