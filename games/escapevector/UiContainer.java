/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiContainer extends UiComponent implements UiContainerMarker {
    static boolean[] field_E;
    static java.awt.Image field_z;
    static ResourceArchive field_B;
    static String field_D;
    IntrusiveDeque field_A;
    static int field_y;
    static AudioOutput field_C;
    static int[] field_F;

    private final void f(byte param0) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_A);
        if (param0 != 6) {
          UiContainer.e((byte) -76);
        }
        UiComponent var3 = (UiComponent) (var2.first(param0 ^ 9));
        while (var3 != null) {
          var3.refreshLayout(0);
          var3 = (UiComponent) (var2.next(53));
        }
    }

    public static void releaseStatics(byte guard) {
        field_C = null;
        field_z = null;
        field_D = null;
        field_F = null;
        if (guard != -68) {
          field_F = (int[]) null;
        }
        field_B = null;
        field_E = null;
    }

    final boolean isFocused(int guard) {
        if (guard != 0) {
          return false;
        }
        return this.a(true) != null ? true : false;
    }

    void drawLayer(int screenY, byte guard, int layer, int screenX) {
        int var7 = EscapeVector.obfuscationControl;
        if (guard <= 85) {
          StringBuilder var8 = (StringBuilder) null;
          this.appendDebugTree(37, (Hashtable) null, (StringBuilder) null, 58);
        }
        if (layer == 0 &&
          null != this.painter) {
          this.painter.drawWidget(screenX, screenY, -42, (UiComponent) (this), true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
        UiComponent var6 = (UiComponent) (var5.last(-31616));
        while (var6 != null) {
          var6.drawLayer(screenY + this.y, (byte) 127, layer, this.x + screenX);
          var6 = (UiComponent) (var5.previous((byte) 59));
        }
    }

    UiContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (UiListener) null);
        this.field_A = new IntrusiveDeque();
    }

    final static boolean e(byte param0) {
        int var1 = -82 % ((34 - param0) / 63);
        boolean stackIn_4_0 = (!aj.b(-105)) && (0 < Js5NetworkRequest.field_x);
        return stackIn_4_0;
    }

    final int maximumRenderLayer(int guard) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.field_A);
        if (guard != 12050) {
          return 121;
        }
        UiComponent var4 = (UiComponent) (var3.first(15));
        while (var4 != null) {
          int var5 = var4.maximumRenderLayer(12050);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (UiComponent) (var3.next(56));
        }
        return var2;
    }

    final String getTooltip(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_A);
        if (guard != 1) {
          Hashtable var6 = (Hashtable) null;
          this.a((StringBuilder) null, -16, (Hashtable) null, 72);
        }
        UiComponent var3 = (UiComponent) (var2.first(15));
        while (var3 != null) {
          String var4 = var3.getTooltip(1);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiComponent) (var2.next(guard + 57));
        }
        return null;
    }

    final boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        String stackIn_16_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (guard != 3) {
            return false;
          }
          IntrusiveDequeCursor var8 = new IntrusiveDequeCursor(this.field_A);
          UiComponent var9 = (UiComponent) (var8.first(guard ^ 12));
          while (var9 != null) {
            if (var9.isLinked((byte) 48)) {
              if (!var9.onPointerPressed(this.y + offsetY, pointerX, (byte) 3, pointerY, this.x + offsetX, root, button)) {
                var9 = (UiComponent) (var8.next(108));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var8_ref;
          StringBuilder stackIn_15_1 = new StringBuilder().append("bj.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(button).append(')').toString());
        }
    }

    boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        boolean stackIn_16_0 = false;
        String stackIn_20_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
          UiComponent var8 = (UiComponent) (var5.first(15));
          if (guard <= 0) {
            return false;
          }
          while (var8 != null) {
            if (var8.isLinked((byte) 48)) {
              if (var8.isFocused(0) &&
                var8.onFocusedKey(root, character, keyCode, 37)) {
                return true;
              }
              var8 = (UiComponent) (var5.next(54));
              continue;
            }
            break;
          }
          int var6 = keyCode;
          if (80 != var6) {
            return false;
          }
          if (!ScoreSubmission.field_h[81]) {
            stackIn_16_0 = this.a(root, true);
          } else {
            stackIn_16_0 = this.a((byte) 22, root);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5_ref;
          StringBuilder stackIn_19_1 = new StringBuilder().append("bj.G(");
          if (root == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final void setBounds(int width, int y, int x, boolean guard, int height) {
        super.setBounds(width, y, x, guard, height);
        if (!guard) {
          return;
        }
        this.f((byte) 6);
    }

    final boolean onMouseWheel(int offsetX, int rotation, byte guard, int pointerY, int pointerX, UiComponent root, int offsetY) {
        String stackIn_17_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (guard >= -103) {
            field_B = (ResourceArchive) null;
          }
          IntrusiveDequeCursor var8 = new IntrusiveDequeCursor(this.field_A);
          UiComponent var9 = (UiComponent) (var8.first(15));
          while (var9 != null) {
            if (var9.isLinked((byte) 48)) {
              if (var9.isFocused(0) &&
                var9.onMouseWheel(offsetX, rotation, (byte) -127, pointerY, pointerX, root, offsetY)) {
                return true;
              }
              var9 = (UiComponent) (var8.next(102));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var8_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("bj.JA(").append(offsetX).append(',').append(rotation).append(',').append(guard).append(',').append(pointerY).append(',').append(pointerX).append(',');
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(offsetY).append(')').toString());
        }
    }

    void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        String stackIn_9_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          super.updateHover(guard, offsetY, offsetX, root);
          IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
          UiComponent var6 = (UiComponent) (var5.first(15));
          while (var6 != null) {
            if (var6.isLinked((byte) 48)) {
              var6.updateHover(-14472, this.y + offsetY, offsetX + this.x, root);
              var6 = (UiComponent) (var5.next(57));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_8_0 = runtimeException;
          StringBuilder stackIn_8_1 = new StringBuilder().append("bj.Q(").append(guard).append(',').append(offsetY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void clearFocus(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_A);
        UiComponent var3 = (UiComponent) (var2.first(15));
        while (var3 != null) {
          var3.clearFocus(111);
          var3 = (UiComponent) (var2.next(25));
        }
        if (guard < 46) {
          UiComponent var5 = (UiComponent) null;
          this.onFocusedKey((UiComponent) null, 'c', -45, -89);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = -53 / ((param0 - 70) / 45);
        int var3 = param2 / 2500;
        var3 = NameAvailabilityValidator.scaleCampaignBonus(106, param1, var3);
        return var3;
    }

    final boolean a(byte param0, UiComponent param1) {
        String stackIn_23_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.field_A.isEmpty(param0 ^ -106)) {
            return false;
          }
          IntrusiveDequeCursor var8 = new IntrusiveDequeCursor(this.field_A);
          if (param0 != 22) {
            return true;
          }
          UiComponent var4 = (UiComponent) (var8.last(-31616));
          while (var4 != null) {
            if (var4.isFocused(0)) {
              IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
              var5.lastFrom((byte) 55, (IntrusiveNode) (var4));
              UiComponent var6 = (UiComponent) (var5.previous((byte) 47));
              while (var6 != null) {
                if (var6.focusNext(-4659, param1)) {
                  return true;
                }
                var6 = (UiComponent) (var5.previous((byte) 80));
              }
            }
            var4 = (UiComponent) (var8.previous((byte) 74));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("bj.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(UiComponent param0, boolean param1) {
        String stackIn_23_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.field_A.isEmpty(-97)) {
            return false;
          }
          IntrusiveDequeCursor var9 = new IntrusiveDequeCursor(this.field_A);
          if (!param1) {
            UiComponent var8 = (UiComponent) null;
            this.onPointerPressed(31, -112, (byte) -74, 114, -25, (UiComponent) null, -91);
          }
          UiComponent var4 = (UiComponent) (var9.first(15));
          while (var4 != null) {
            if (var4.isFocused(0)) {
              IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
              var5.firstFrom(-12818, var4);
              UiComponent var6 = (UiComponent) (var5.next(125));
              while (var6 != null) {
                if (!var6.focusNext(-4659, param0)) {
                  var6 = (UiComponent) (var5.next(80));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiComponent) (var9.next(98));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("bj.PA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean focusNext(int guard, UiComponent root) {
        String stackIn_15_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.field_A);
          if (guard != -4659) {
            UiContainer.e((byte) 13);
          }
          UiComponent var4 = (UiComponent) (var3.first(15));
          while (var4 != null) {
            if (var4.focusNext(-4659, root)) {
              return true;
            }
            var4 = (UiComponent) (var3.next(guard + 4779));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var3_ref;
          StringBuilder stackIn_14_1 = new StringBuilder().append("bj.M(").append(guard).append(',');
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    UiComponent a(boolean param0) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_A);
        if (!param0) {
          field_y = 52;
        }
        UiComponent var3 = (UiComponent) (var2.first(15));
        while (var3 != null) {
          if (var3.isFocused(0)) {
            return var3;
          }
          var3 = (UiComponent) (var2.next(78));
        }
        return null;
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
          if (param3 <= 95) {
            field_D = (String) null;
          }
          UiComponent var6 = (UiComponent) (var5.first(15));
          while (var6 != null) {
            StringBuilder discarded$3 = param0.append('\n');
            for (int var7 = 0; param1 >= var7; var7++) {
              StringBuilder discarded$4 = param0.append(' ');
            }
            var6.appendDebugTree(0, param2, param0, param1 + 1);
            var6 = (UiComponent) (var5.next(31));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("bj.IA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(UiComponent param0, boolean param1) {
        try {
          if (param1) {
            UiComponent var4 = (UiComponent) null;
            this.a((byte) -114, (UiComponent) null);
          }
          this.field_A.addLast(-12328, param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bj.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void onPointerReleased(int pointerY, int offsetY, int pointerX, int offsetX, UiComponent root, byte guard) {
        String stackIn_10_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          IntrusiveDequeCursor var7 = new IntrusiveDequeCursor(this.field_A);
          UiComponent var8_ref_hm = (UiComponent) (var7.first(15));
          while (var8_ref_hm != null) {
            if (var8_ref_hm.isLinked((byte) 48)) {
              var8_ref_hm.onPointerReleased(pointerY, this.x + offsetY, pointerX, offsetX + this.y, root, (byte) -113);
              var8_ref_hm = (UiComponent) (var7.next(29));
              continue;
            }
            break;
          }
          int var8 = -114 % ((-39 - guard) / 45);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_9_0 = runtimeException;
          StringBuilder stackIn_9_1 = new StringBuilder().append("bj.MA(").append(pointerY).append(',').append(offsetY).append(',').append(pointerX).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(int guard, Hashtable visited, StringBuilder output, int depth) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        try {
          if (guard != 0) {
            this.drawLayer(-82, (byte) 105, -122, -83);
          }
          if (this.beginDebugDescription(depth, visited, output, false)) {
            this.appendDebugBody(visited, output, depth, 1);
            this.a(output, depth, visited, 115);
          }
          StringBuilder stackIn_5_0 = (StringBuilder) (output);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("bj.AA(").append(guard).append(',');
          if (visited == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (output == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(depth).append(')').toString());
        }
    }

    static {
        field_D = "TNT";
        field_F = new int[]{15, 19};
        field_y = 0;
    }
}
