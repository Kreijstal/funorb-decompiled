/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class OptionsScreen extends MenuScreen {
    static String cancel;
    static String createMoreSuggestions;
    static int field_I;
    private static int field_H;
    static UiComponent field_L;

    final static void a(PacketBuffer param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = Pool.field_O;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (ServerListLauncher.field_c != null) {
              try {
                ServerListLauncher.field_c.seek(0, 0L);
                ServerListLauncher.field_c.readFully(param1 + 114, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.a(var2, (byte) 0, param1, 24);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.a(var2, (byte) 0, param1, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("be.FB(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        createMoreSuggestions = null;
        if (param0 != -89) {
          field_H = -35;
        }
        field_L = null;
        cancel = null;
    }

    final static void f(int param0) {
        NetworkGameClient.field_z = false;
        ProjectedVertex.field_e = false;
        LoginEncryptionSupport.a(param0, (byte) 111);
        TimeTrialSelectScreen.field_I = IntrusiveDequeCursor.field_c;
        TabbedPane.field_Lb = IntrusiveDequeCursor.field_c;
    }

    final boolean hasButtonBackdrop(int param0, int param1) {
        if (param0 != -13676) {
          field_L = (UiComponent) null;
        }
        return param1 == this.itemIds.length - 1 ? true : false;
    }

    final int getButtonTop(byte param0, int param1) {
        if (param0 != 6) {
          this.getButtonTop((byte) 113, 90);
        }
        return this.buttonSpacing * param1 + (this.buttonTop + (param1 != -1 + this.itemIds.length ? 0 : 20));
    }

    final static void a(int param0, int param1, int param2, int param3, SceneNode[] param4, int param5, MeshBuilder param6) {
        int[] var8 = null;
        int[] var7 = null;
        int[] var9 = null;
        int[] var7Lifetime1;
        try {
          var8 = TransformSupport.identityTransform(-31121);
          var7 = var8;
          var8[param3] = param1;
          var8[0] = param5;
          var8[2] = param2;
          param4[0 + param0] = SceneNodeFactory.createSceneNode(param6, var8, (byte) 101);
          var9 = TransformRotationSupport.rotateTransformHalfTurnZ((byte) 10, LobbyPanelLayoutSupport.a((byte) 94, var8));
          var7Lifetime1 = var9;
          param4[param0 + 1] = SceneNodeFactory.createSceneNode(param6, var9, (byte) 101);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "be.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    OptionsScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(FreePlayRules.field_k, param0, param1, param2, param3, param4, param5);
    }

    final void drawScreen(int param0) {
        if (param0 <= 36) {
          cancel = (String) null;
        }
        super.drawScreen(92);
    }

    static {
        cancel = "Cancel";
        field_H = 3;
        createMoreSuggestions = "More suggestions";
        field_I = 1 << field_H;
    }
}
