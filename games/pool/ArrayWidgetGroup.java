/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArrayWidgetGroup extends UiWidget implements ChildWidgetOwner {
    static Sprite[] field_G;
    static boolean field_H;
    static Atan2Support[][] field_K;
    static String field_I;
    static int field_M;
    UiWidget[] children;
    static String gameoptPleaseselectoption1;

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        int var6 = 0;
        UiWidget[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        UiWidget var7 = null;
        int var8 = 0;
        UiWidget[] var9 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          if (null == this.children) {
            return false;
          }
          var9 = this.children;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.hasKeyboardFocus(-117) &&
              var7.handleKeyInput(param0, param1, param2, param3)) {
              return true;
            }
          }
          var5_int = param1;
          if (var5_int != 80) {
            if (!param2) {
              return false;
            }
            return true;
          }
          if (!TextLineLayout.field_c[81]) {
            stackIn_17_0 = this.requestNextChildFocus(param3, -3094);
          } else {
            stackIn_17_0 = this.requestPreviousChildFocus(param3, (byte) 89);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("fm.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final boolean focusBackwardFromFocused(int param0, int param1, UiWidget param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiWidget var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          if (this.children == null) {
            return false;
          }
          if (param1 != 2676) {
            return true;
          }
          var4_int = this.children.length - 1;
          while (0 <= var4_int) {
            var5 = this.children[var4_int];
            if (null != var5 &&
              var5.hasKeyboardFocus(param1 - 2568)) {
              for (var4_int = var4_int - param0; var4_int >= 0; var4_int = var4_int - param0) {
                var6 = this.children[var4_int];
                if (null != var6 &&
                  var6.requestKeyboardFocus(param2, (byte) -106)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("fm.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int getLastRenderPass(int param0) {
        int var4 = 0;
        int var2;
        UiWidget[] var3;
        UiWidget var5;
        int var7;
        int var6;
        var7 = Pool.field_O;
        if (param0 <= 33) {
          return 77;
        }
        var2 = 0;
        var3 = this.children;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.getLastRenderPass(73);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    public static void releaseStatics(int param0) {
        field_I = null;
        field_K = (Atan2Support[][]) null;
        if (param0 != 16) {
          return;
        }
        field_G = null;
        gameoptPleaseselectoption1 = null;
    }

    private final UiWidget findFocusTarget(int param0) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var5;
        UiWidget[] var6;
        var5 = Pool.field_O;
        if (this.children == null) {
          return null;
        }
        if (param0 != 15041) {
          return (UiWidget) null;
        }
        var6 = this.children;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.hasKeyboardFocus(124)) {
            return var4;
          }
        }
        return null;
    }

    private final void appendChildrenDiagnostics(Hashtable param0, StringBuilder param1, int param2, byte param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        UiWidget var7 = null;
        int var9 = 0;
        UiWidget[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Pool.field_O;
        try {
          if (this.children == null) {
            return;
          }
          var10 = this.children;
          if (param3 <= 96) {
            this.children = (UiWidget[]) null;
          }
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$4 = param1.append('\n');
            for (var8 = 0; var8 <= param2; var8++) {
              discarded$6 = param1.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param1.append("null");
            } else {
              var7.appendWidgetDiagnostics(param1, 1 + param2, param0, 61);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("fm.PA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(UiWidget param0, byte param1) {
        int var5 = 0;
        UiWidget[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        UiWidget var6 = null;
        int var7 = 0;
        UiWidget[] var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var8 = this.children;
          var3 = var8;
          var4 = -24 % ((param1 + 43) / 47);
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 != null &&
              var6.requestKeyboardFocus(param0, (byte) 32)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fm.M(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handlePointerWheel(UiWidget param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var9 = 0;
        UiWidget[] var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var10 = null;
        int var11 = 0;
        UiWidget[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pool.field_O;
        try {
          if (param4 >= -126) {
            field_K = (Atan2Support[][]) null;
          }
          if (this.children == null) {
            return false;
          }
          var12 = this.children;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.hasKeyboardFocus(-85) &&
              var10.handlePointerWheel(param0, param1, param2, param3, (byte) -127, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("fm.WA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void clearKeyboardFocus(byte param0) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var5;
        UiWidget[] var6;
        var5 = Pool.field_O;
        var6 = this.children;
        var2 = var6;
        if (param0 != 99) {
          field_I = (String) null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.clearKeyboardFocus((byte) 99);
          }
        }
    }

    void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5;
        UiWidget var6;
        int var7;
        int var5Lifetime1;
        var7 = Pool.field_O;
        if (param0 == 0 &&
          this.renderer != null) {
          this.renderer.paintWidget(true, param2, (byte) 51, param3, (UiWidget) (this));
        }
        if (null != this.children) {
          for (var5 = -1 + this.children.length; var5 >= 0; var5--) {
            var6 = this.children[var5];
            if (var6 != null) {
              var6.renderWidget(param0, (byte) -98, this.widgetX + param2, this.widgetY + param3);
            }
          }
        }
        var5Lifetime1 = 93 / ((param1 + 42) / 53);
    }

    private final boolean requestPreviousChildFocus(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -98 % ((49 - param1) / 35);
          stackIn_1_0 = this.focusBackwardFromFocused(1, 2676, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("fm.QA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static TriangleMesh a(int param0, CipherPacketBuffer param1) {
        int var7 = 0;
        TriangleMesh stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int var6 = 0;
        try {
          var2_int = param1.readBits(8, 74);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param0 != -16336) {
            ArrayWidgetGroup.releaseStatics(-31);
          }
          var3 = FullscreenErrorDialog.readBooleanBit((byte) 118, param1) ? 1 : 0;
          var4 = FullscreenErrorDialog.readBooleanBit((byte) 118, param1) ? 1 : 0;
          var5 = new TriangleMesh();
          var5.vertexCount = (short)param1.readBits(16, 98);
          var5.vertexX = LobbyGame.a(16, var5.vertexX, (byte) 127, param1);
          var5.vertexY = LobbyGame.a(16, var5.vertexY, (byte) 99, param1);
          var5.vertexZ = LobbyGame.a(16, var5.vertexZ, (byte) 123, param1);
          var5.field_d = (short)param1.readBits(16, 69);
          var5.field_y = LobbyGame.a(16, var5.field_y, (byte) 122, param1);
          var5.field_r = LobbyGame.a(16, var5.field_r, (byte) 111, param1);
          var5.field_u = LobbyGame.a(16, var5.field_u, (byte) 109, param1);
          if (var3 != 0) {
            var5.field_o = (short)param1.readBits(16, param0 + 16375);
            var5.field_Q = LobbyGame.a(16, var5.field_Q, (byte) 109, param1);
            var5.field_p = LobbyGame.a(16, var5.field_p, (byte) 121, param1);
            var5.field_j = LobbyGame.a(16, var5.field_j, (byte) 120, param1);
            var5.field_x = LobbyGame.a(16, var5.field_x, (byte) 109, param1);
            var5.field_w = LobbyGame.a(16, var5.field_w, (byte) 110, param1);
            var5.field_O = LobbyGame.a(16, var5.field_O, (byte) 118, param1);
          }
          if (var4 != 0) {
            param1.readBits(16, param0 ^ -16283);
            var5.field_v = LobbyGame.a(16, var5.field_v, (byte) 94, param1);
            var5.field_a = LobbyGame.a(16, var5.field_a, (byte) 118, param1);
            var5.field_i = LobbyGame.a(16, var5.field_i, (byte) 111, param1);
            var5.field_P = LobbyGame.a(16, var5.field_P, (byte) 104, param1);
            var5.field_z = LobbyGame.a(16, var5.field_z, (byte) 102, param1);
          }
          if (FullscreenErrorDialog.readBooleanBit((byte) 118, param1)) {
            var5.field_H = LobbyGame.a(16, var5.field_H, (byte) 110, param1);
          }
          if (FullscreenErrorDialog.readBooleanBit((byte) 118, param1)) {
            var5.field_K = AwtEventQueueSupport.readPackedByteArray(50, 16, param1, var5.field_K);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_K.length; var7++) {
              if ((var5.field_K[var7] & 255) > var6) {
                var6 = 255 & var5.field_K[var7];
              }
            }
            if (0 != var6) {
              var5.field_I = (byte)(1 + var6);
            } else {
              var5.field_K = null;
            }
          }
          stackIn_24_0 = var5;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("fm.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final StringBuilder appendWidgetDiagnostics(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginWidgetDiagnosticVisit(param1, param2, param0, -1)) {
            this.appendWidgetDiagnosticProperties(1, param2, param0, param1);
            this.appendChildrenDiagnostics(param2, param0, param1, (byte) 108);
          }
          if (param3 >= 13) {
            stackIn_7_0 = (StringBuilder) (param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fm.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(PacketBuffer param0, boolean param1, int param2, int param3, int param4) {
        param0.writeByte(12, false);
        param0.writeShort((byte) -81, 17);
        if (!param1) {
          return;
        }
        try {
          param0.writeShort((byte) -81, param2);
          param0.writeShort((byte) -81, param4);
          param0.writeByte(param3, false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ArrayWidgetGroup(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
    }

    private final boolean focusForwardFromFocused(int param0, UiWidget param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiWidget var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiWidget var6Lifetime1;
        UiWidget var6Lifetime2;
        var7 = Pool.field_O;
        try {
          if (null == this.children) {
            return false;
          }
          if (param2 != -9478) {
            this.children = (UiWidget[]) null;
          }
          var4_int = 0;
          while (this.children.length > var4_int) {
            var5 = this.children[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.hasKeyboardFocus(103)) {
              for (var4_int = var4_int + param0; var4_int < this.children.length; var4_int = var4_int + param0) {
                var6Lifetime2 = this.children[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.requestKeyboardFocus(param1, (byte) -112)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("fm.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final String getHoverText(int param0) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var6;
        StringBuilder var7;
        String var5;
        var6 = Pool.field_O;
        if (null == this.children) {
          return null;
        }
        if (param0 >= -10) {
          var7 = (StringBuilder) null;
          this.appendChildrenDiagnostics((Hashtable) null, (StringBuilder) null, -53, (byte) -52);
        }
        var2 = this.children;
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.getHoverText(-47);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, byte param4, UiWidget param5) {
        int var8 = 0;
        UiWidget[] var7 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Pool.field_O;
        try {
          if (this.children == null) {
            return;
          }
          var11 = this.children;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.handlePointerRelease(param0 + this.widgetX, param1, this.widgetY + param2, param3, (byte) 86, param5);
            }
          }
          if (param4 < 62) {
            field_I = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("fm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void setWidgetBounds(int param0, int param1, int param2, boolean param3, int param4) {
        super.setWidgetBounds(param0, param1, param2, param3, param4);
        this.f((byte) -125);
    }

    private final boolean requestNextChildFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3094) {
            var4 = (UiWidget) null;
            this.handlePointerPress((UiWidget) null, 110, true, -117, 91, 109, -124);
          }
          stackIn_3_0 = this.focusForwardFromFocused(1, param0, param1 ^ 10512);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fm.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        UiWidget[] var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var10 = null;
        int var11 = 0;
        UiWidget[] var12 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pool.field_O;
        try {
          if (null == this.children) {
            return false;
          }
          if (!param2) {
            return true;
          }
          var12 = this.children;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.handlePointerPress(param0, param1 + this.widgetX, param2, param3, param4, this.widgetY + param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("fm.AA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    abstract void f(byte param0);

    final static Class a(boolean param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (!param0) {
            field_K = (Atan2Support[][]) null;
          }
          if (param1.equals("I")) {
            stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (param1.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param1.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param1.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param1.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param1.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param1.equals("C")) {
            stackIn_31_0 = Class.forName(param1);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("fm.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        int var6 = 0;
        UiWidget[] var5 = null;
        UiWidget var7 = null;
        int var8 = 0;
        UiWidget[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pool.field_O;
        try {
          if (param1 != 958) {
            field_K = (Atan2Support[][]) null;
          }
          super.updatePointerState(param0, param1 + 0, param2, param3);
          if (this.children == null) {
            return;
          }
          var9 = this.children;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.updatePointerState(param0, 958, param2 + this.widgetX, this.widgetY + param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("fm.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(int param0) {
        int var2 = -51 / ((7 - param0) / 48);
        return null != this.findFocusTarget(15041) ? true : false;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = Pool.field_O;
        int var1_intLifetime1;
        try {
          MessageScreen.field_J.resetTiming((byte) 26);
          for (var1_int = param0; var1_int < 32; var1_int++) {
            FullscreenDisplayMode.field_l[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            ClientException.field_f[var1_intLifetime1] = 0L;
          }
          DiskCacheWorker.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fm.AB(" + param0 + ')');
        }
    }

    static {
        field_H = false;
        gameoptPleaseselectoption1 = "Please select an option in the '<%0>' row.";
    }
}
