/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class SocketConnector {
    int port;
    static Random field_i;
    String host;
    static String field_h;
    static String field_b;
    static int field_c;
    static int[] field_f;
    static long field_g;
    static String field_d;

    final static boolean isSessionDisconnected(int param0) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -25945) {
            field_b = (String) null;
          }
          stackIn_8_0 = (DisplayNameForm.field_R >= 10) && (!PacketBuffer.field_r) && (!MusicCrossfadeStream.isLoginReplyPending(0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "ca.L(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_b = null;
        field_h = null;
        field_d = null;
        if (param0 != 0) {
          return;
        }
        try {
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ca.J(" + param0 + ')');
        }
    }

    final static void positionPopupMenu(int param0) {
        int var1_int = 0;
        int var2 = 0;
        try {
          var1_int = EditableTextWidget.getPopupMenuWidth((byte) -102);
          var2 = DraggableWidget.getMessagePopupHeight(32768);
          ReflectionCheck.field_o.drawFrame(ValidationStatusIcon.field_Q - BufferedSocket.field_b, TextureCache.field_j - MusicPatch.field_D, (byte) -21, (MusicPatch.field_D << 1) + var1_int, var2 + (BufferedSocket.field_b << 1));
          if (param0 >= -2) {
            SocketConnector.advanceLobbyTransitions(false, (byte) 121);
          }
          UiWidget.drawPopupMenuItems(true);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ca.G(" + param0 + ')');
        }
    }

    final static void orbitCamera(float param0, float param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (MenuScreen.field_g == 2) {
            return;
          }
          LoadingResourceHelpers.field_d = LoadingResourceHelpers.field_d + param0;
          if (MenuScreen.field_g == 1) {
            MenuScreen.field_g = 0;
          }
          if (LoadingResourceHelpers.field_d < 64.0f) {
            LoadingResourceHelpers.field_d = 64.0f;
          }
          if (LoadingResourceHelpers.field_d > 440.0f) {
            LoadingResourceHelpers.field_d = 440.0f;
          }
          NodeHashTable.field_h = NodeHashTable.field_h + param1;
          LobbyResourceHelpers.field_g[0] = (double)LoadingResourceHelpers.field_d * Math.sin((double)NodeHashTable.field_h);
          LobbyResourceHelpers.field_g[2] = (double)LoadingResourceHelpers.field_d * Math.cos((double)NodeHashTable.field_h);
          CameraAndChatHelpers.updateCameraMatrix(param2 ^ 2505);
          Archive.field_a = LruTextureCache.field_e;
          if (param2 == -2452) {
            return;
          }
          field_i = (Random) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "ca.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final java.net.Socket connectDirect(int param0) throws IOException {
        RuntimeException var2 = null;
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_5_0 = new java.net.Socket(this.host, this.port);
            return stackIn_5_0;
          }
          stackIn_2_0 = (java.net.Socket) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "ca.K(" + param0 + ')');
        }
    }

    abstract java.net.Socket connect(byte param0) throws IOException;

    final static void advanceLobbyTransitions(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        try {
          if (param0 ||
            AccountWelcomePanel.field_N == null) {
            StripedProgressBar.field_S = false;
          }
          if (param0) {
            if (0 >= DialWidget.field_ab) {
              if (MusicPatch.field_t <= 0) {
                if (MiscTextGlobals.field_f > 0) {
                  MiscTextGlobals.field_f = MiscTextGlobals.field_f - 1;
                }
              } else {
                MusicPatch.field_t = MusicPatch.field_t - 1;
              }
            } else {
              DialWidget.field_ab = DialWidget.field_ab - 1;
            }
          } else {
            if (AccountWelcomePanel.field_N == null) {
              if (GameKeyHandler.field_a != null) {
                if (DialWidget.field_ab <= 0) {
                  if (MiscTextGlobals.field_f <= 0) {
                    if (AnimationPlayer.field_f > MusicPatch.field_t) {
                      if (MusicPatch.field_t == 0) {
                        SharedPanelFactory.createSharedPanels(true, (byte) -128);
                      }
                      MusicPatch.field_t = MusicPatch.field_t + 1;
                    }
                  } else {
                    MiscTextGlobals.field_f = MiscTextGlobals.field_f - 1;
                  }
                } else {
                  DialWidget.field_ab = DialWidget.field_ab - 1;
                }
              } else {
                StripedProgressBar.field_S = false;
                if (MusicPatch.field_t > 0) {
                  MusicPatch.field_t = MusicPatch.field_t - 1;
                } else {
                  if (MiscTextGlobals.field_f > 0) {
                    MiscTextGlobals.field_f = MiscTextGlobals.field_f - 1;
                  } else {
                    if (DialWidget.field_ab < AnimationPlayer.field_f) {
                      if (0 == DialWidget.field_ab) {
                        SocketJs5Transport.buildLobbyRoot(false);
                      }
                      DialWidget.field_ab = DialWidget.field_ab + 1;
                    }
                  }
                }
              }
            } else {
              if (DialWidget.field_ab > 0) {
                DialWidget.field_ab = DialWidget.field_ab - 1;
              } else {
                if (MusicPatch.field_t <= 0) {
                  if (MiscTextGlobals.field_f < AnimationPlayer.field_f) {
                    if (MiscTextGlobals.field_f == 0) {
                      SharedPanelFactory.createSharedPanels(false, (byte) -128);
                    }
                    MiscTextGlobals.field_f = MiscTextGlobals.field_f + 1;
                  }
                } else {
                  MusicPatch.field_t = MusicPatch.field_t - 1;
                }
              }
            }
          }
          if (param1 == 16) {
            return;
          }
          SocketConnector.positionPopupMenu(-74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "ca.I(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_i = new Random();
        field_h = "Shortcut Reference";
        field_b = "Decline invitation to <%0>'s game";
        field_f = new int[4];
        field_d = "(1 player wants to join)";
    }
}
