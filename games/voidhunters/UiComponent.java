/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiComponent extends IntrusiveNode {
    int textOffsetY;
    String tooltip;
    static byte[] field_o;
    int width;
    boolean hovered;
    static String field_m;
    static int field_k;
    int height;
    UiListener listener;
    UiRenderer renderer;
    TextLayout textLayout;
    int pressedButton;
    int y;
    int x;
    String text;
    int textOffsetX;

    boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -15834) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("shb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    String getTooltip(byte param0) {
        if (param0 != 125) {
          this.height = -57;
        }
        return !this.hovered ? null : this.tooltip;
    }

    final boolean beginDebugVisit(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 122 % ((58 - param2) / 57);
          if (param0.containsKey(this)) {
            discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("shb.CB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPoint(OpenGlFaceAttachment.field_b, param1, PlayerGameData.field_b, param0, (byte) 22) ? 1 : 0;
          if (param2 != -981) {
            this.hovered = true;
          }
          stackIn_5_0 = (this.hovered) ? 0 : 1;
          if (var5_int != 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_13_1 = (var5_int != 0);
            this.hovered = stackIn_13_1;
            if (this.listener != null) {
              if (!(this.listener instanceof UiHoverListener)) {
                return;
              }
              ((UiHoverListener) (this.listener)).onHoverChanged(var5_int != 0, -18572, this);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("shb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void refreshLayout(boolean param0) {
        if (param0) {
          this.textOffsetX = 85;
        }
        this.setBounds(this.x, this.width, this.height, 1, this.y);
    }

    boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            return true;
          }
          if (!this.containsPoint(param2, param1, param0, param5, (byte) 22)) {
            return false;
          }
          this.pressedButton = param3;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("shb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param2 < 47) {
          this.toString();
        }
        if (param1 == 0 &&
          this.renderer != null) {
          this.renderer.drawComponent(95, this, param0, param3, true);
        }
    }

    void handleMouseRelease(byte param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        try {
          int var7_int = -47 % ((52 - param0) / 52);
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "shb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean containsPoint(int param0, int param1, int param2, int param3, byte param4) {
        boolean stackIn_8_0 = false;
        if (param4 != 22) {
          this.textOffsetX = -9;
        }
        stackIn_8_0 = (param2 >= param1 + this.x) && (param0 >= this.y + param3) && (param2 < this.width + this.x + param1) && (param0 < param3 - (-this.y - this.height));
        return stackIn_8_0;
    }

    void clearFocus(byte param0) {
        if (param0 != -34) {
          field_m = (String) null;
        }
    }

    boolean hasFocus(byte param0) {
        if (param0 != -120) {
          this.handleMouseWheel(82, -5, -122, (UiComponent) null, 99, 29, -31);
          return false;
        }
        return false;
    }

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        if (param0 <= 61) {
          field_k = -86;
        }
        field_m = null;
    }

    boolean handleMouseWheel(int param0, int param1, int param2, UiComponent param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6006) {
            this.refreshLayout(false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("shb.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.y = param4;
        this.height = param2;
        this.x = param0;
        if (param3 != 1) {
          this.updatePointer(123, 5, 45, (UiComponent) null);
        }
        this.width = param1;
    }

    UiComponent(String param0, UiListener param1) {
        this(param0, GetDebrisMax.field_s.field_n, param1);
    }

    final void draw(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = VoidHunters.field_G;
        int var4 = this.getMaxDrawLayer(param0 ^ 0);
        for (var5_int = param0; var5_int <= var4; var5_int++) {
          this.drawLayer(param2, var5_int, param0 + 93, param1);
        }
        String var5 = EmailSyntaxValidator.d((byte) 106);
        if (var5 != null) {
          GetDebrisMax.field_s.drawTooltip((byte) 27, var5, GetBombletSprayReload.field_r, SetTestActionLag.field_o);
        }
    }

    boolean requestFocus(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          this.appendDebugTree(true, (Hashtable) null, -65, (StringBuilder) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("shb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugVisit(param1, param2, (byte) 122, param3)) {
            this.appendDebugProperties(95, param2, param1, param3);
          }
          if (param0) {
            this.getMaxDrawLayer(103);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("shb.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    int getMaxDrawLayer(int param0) {
        if (param0 != 0) {
          this.beginDebugVisit((Hashtable) null, -120, (byte) 105, (StringBuilder) null);
          return 0;
        }
        return 0;
    }

    final boolean dispatchKey(int param0, int param1, char param2) {
        if (this.hasFocus((byte) -120) &&
          this.handleKey(-15834, param1, this, param2)) {
          return true;
        }
        int var4 = param1;
        if (var4 == 80) {
          return this.requestFocus(param0 ^ -9445, this);
        }
        if (param0 != -9445) {
          this.processPointerInput((byte) 31, 104, -76, false);
          return false;
        }
        return false;
    }

    public final String toString() {
        return this.appendDebugTree(false, new Hashtable(), 0, new StringBuilder()).toString();
    }

    final void appendDebugProperties(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (null != this.text) {
            discarded$1 = param3.append(" text=\"").append(this.text).append('"');
          }
          if (this.hovered) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.hasFocus((byte) -120)) {
            discarded$3 = param3.append(" focused");
          }
          if (null != this.renderer) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.renderer instanceof UiComponent)) {
              discarded$5 = param3.append(this.renderer);
            } else {
              param3 = this.appendDebugTree(false, param2, 1 + param1, param3);
            }
          }
          if (param0 < 59) {
            this.containsPoint(-49, 49, 80, 34, (byte) -121);
          }
          if (this.listener != null) {
            discarded$6 = param3.append(" listener=");
            if (!(this.listener instanceof UiComponent)) {
              discarded$7 = param3.append(this.listener);
            } else {
              param3 = this.appendDebugTree(false, param2, 1 + param1, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("shb.IB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean processPointerInput(byte param0, int param1, int param2, boolean param3) {
        int var5;
        UiDraggableContainer var6;
        int var7;
        var7 = VoidHunters.field_G;
        this.updatePointer(param2, param1, -981, this);
        var5 = this.hasFocus((byte) -120) ? 1 : 0;
        if (param3) {
          if (GetPointDefenceLaserPulsetime.field_o != 0 &&
            var5 != 0) {
            this.handleMouseWheel(param1, -6006, GetPointDefenceLaserPulsetime.field_o, this, PlayerGameData.field_b, param2, OpenGlFaceAttachment.field_b);
          }
          if (SetDebrisPartitioned.field_o != 0) {
            if (!this.handleMousePress(Particle.field_H, param1, AppletCookieWriter.field_a, SetDebrisPartitioned.field_o, this, param2, (byte) -105)) {
              if (var5 != 0) {
                this.clearFocus((byte) -34);
              }
            } else {
              param3 = false;
            }
          }
          if (GpuVertexNormal.field_b == 0 &&
            CombatHelpText.field_b != 0) {
            this.handleMouseRelease((byte) 118, param1, OpenGlFaceAttachment.field_b, param2, this, PlayerGameData.field_b);
            var6 = SetBombletSprayRandomness.field_p;
            if (var6 != null) {
              if (var6.listener instanceof UiDropListener) {
                ((UiDropListener) (var6.listener)).onDrop((byte) -70, var6, (UiDropTargetContainer) null);
              }
              SetBombletSprayRandomness.field_p = null;
            }
          }
        } else {
          if (var5 != 0 &&
            SetDebrisPartitioned.field_o != 0) {
            this.clearFocus((byte) -34);
          }
        }
        if (param0 != -5) {
          this.draw(-58, -39, -116);
        }
        CombatHelpText.field_b = GpuVertexNormal.field_b;
        UiTextField.updateTooltip(this.getTooltip((byte) 125), 5757);
        return param3;
    }

    protected UiComponent() {
        this.textOffsetY = 0;
        this.textOffsetX = 0;
    }

    UiComponent(String param0, UiRenderer param1, UiListener param2) {
        UiTextRenderer var4 = null;
        this.textOffsetY = 0;
        this.textOffsetX = 0;
        try {
          this.listener = param2;
          this.text = param0;
          this.renderer = param1;
          if (this.renderer instanceof UiTextRenderer) {
            var4 = (UiTextRenderer) ((Object) this.renderer);
            this.width = var4.getPreferredWidth(-2, this);
            this.height = var4.getPreferredHeight(this, (byte) 66);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "shb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiComponent(int param0, int param1, int param2, int param3, UiRenderer param4, UiListener param5) {
        this.textOffsetY = 0;
        this.textOffsetX = 0;
        try {
          this.y = param1;
          this.renderer = param4;
          this.x = param0;
          this.height = param3;
          this.width = param2;
          this.listener = param5;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "shb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new byte[]{(byte)3};
        field_m = "Please send me news and updates (I can unsubscribe at any time)";
        field_k = 0;
    }
}
