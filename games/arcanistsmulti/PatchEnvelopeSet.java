/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PatchEnvelopeSet {
    int field_n;
    byte[] field_l;
    static long field_a;
    byte[] field_h;
    static String field_c;
    int field_g;
    int field_e;
    int field_i;
    static int[] field_k;
    int field_m;
    int field_d;
    static String field_f;
    static int[] field_o;
    static String field_b;
    int field_j;

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 <= 75) {
          return;
        }
        field_c = null;
        field_o = null;
        field_b = null;
    }

    final static String formatDisplayName(boolean param0, CharSequence param1, boolean param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = GameDetailsRenderer.field_c;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = Js5ArchiveManager.normalizeNameForLookup(param1, -13);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!GradientBarButton.isNameSeparator((byte) 117, var4.charAt(0)) &&
                !GradientBarButton.isNameSeparator((byte) 118, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                var6 = 0;
                if (!param2) {
                  stackIn_21_0 = (String) null;
                  return stackIn_21_0;
                }
                while (var6 < param1.length()) {
                  var7 = param1.charAt(var6);
                  if (GradientBarButton.isNameSeparator((byte) 123, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (2 <= var5 &&
                    !param0) {
                    stackIn_29_0 = FrameAndQuickChatHelpers.field_e;
                    return stackIn_29_0;
                  }
                  var6++;
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_34_0 = GridContainer.field_H;
                return stackIn_34_0;
              }
              stackIn_18_0 = GridContainer.field_H;
              return stackIn_18_0;
            }
            stackIn_13_0 = GameDetailsRenderer.field_c;
            return stackIn_13_0;
          }
          stackIn_8_0 = GameDetailsRenderer.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("ba.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void openSimpleDialog(int param0) {
        if (param0 < 80) {
          PatchEnvelopeSet.releaseStatics((byte) 114);
        }
        SupportPageHelpers.field_e.setContent((byte) -92, (UiComponent) (new ThreeButtonPanel()));
    }

    final static void showLoadingDialog(int param0) {
        if (param0 != 0) {
          PatchEnvelopeSet.openSimpleDialog(-120);
        }
        ClientException.field_b.deactivatePanels(-120);
        if (null == ModalStackHelpers.field_c) {
          ModalStackHelpers.field_c = new LoadingProgressDialog(ClientException.field_b, MusicPatch.field_o);
        }
        ClientException.field_b.pushPanel(ModalStackHelpers.field_c, param0 + 15637);
    }

    final static void closeNetworkResources(int param0) {
        try {
          int var1_int = 0;
          int var3 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (GrowableIntList.field_c != null) {
              GrowableIntList.field_c.closeConnection(param0 ^ 16700264);
            }
            if (null != MainMenuDialog.field_yb) {
              MainMenuDialog.field_yb.stop((byte) 90);
            }
            if (null != TutorialCaptionGlobals.field_e) {
              try {
                TutorialCaptionGlobals.field_e.close((byte) -101);
              } catch (IOException iOException) {
              }
            }
            if (null != LoginLoadingHelpers.field_b) {
              for (var1_int = 0; var1_int < LoginLoadingHelpers.field_b.length; var1_int++) {
                if (null != LoginLoadingHelpers.field_b[var1_int]) {
                  try {
                    LoginLoadingHelpers.field_b[var1_int].close((byte) -101);
                  } catch (IOException var2_ref) {
                  }
                }
              }
            }
            if (param0 != 11670) {
              field_f = (String) null;
            }
          } catch (RuntimeException runtimeException) {
            throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ba.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void finishLoadingDialog(int param0) {
        int var1 = -96 / ((param0 + 52) / 63);
        if (null != ClientException.field_b) {
          ClientException.field_b.removeClosedPanels((byte) 83);
        }
        if (ModalStackHelpers.field_c != null) {
          ModalStackHelpers.field_c.markComplete((byte) 61);
        }
        SceneListPanel.resetLobbyState((byte) -102);
    }

    final static String decodeCp1252String(int param0, int param1, byte param2, byte[] param3) {
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var12 = new char[param1];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param2 >= -122) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          while (var6 < param1) {
            var7 = param3[param0 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = IntrusiveDequeCursor.field_a[-128 + var7];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var10[incrementValue$0] = (char)var7;
            }
            var6++;
          }
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("ba.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_c = "Players";
        field_f = "Please wait...";
        field_k = new int[8192];
        field_b = "Reading Book of Flame";
    }
}
