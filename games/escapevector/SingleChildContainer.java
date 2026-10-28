/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildContainer extends UiComponent implements UiContainerMarker {
    static String[] field_A;
    static int field_B;
    UiComponent child;
    static boolean field_y;
    static int field_z;

    private final boolean focusChildIfUnfocused(UiComponent root, int guard) {
        String stackIn_12_2 = null;
        try {
          if (guard != -812) {
            return false;
          }
          boolean stackIn_8_0 = (null != this.child) && (!this.child.isFocused(guard + 812)) && (this.child.focusNext(-4659, root));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("r.CA(");
          if (root == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    void onPointerReleased(int pointerY, int offsetY, int pointerX, int offsetX, UiComponent root, byte guard) {
        String stackIn_7_2 = null;
        try {
          int var7_int = 76 / ((guard + 39) / 45);
          if (this.child != null) {
            this.child.onPointerReleased(pointerY, offsetY + this.x, pointerX, offsetX + this.y, root, (byte) 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("r.MA(").append(pointerY).append(',').append(offsetY).append(',').append(pointerX).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    private final boolean focusChildIfUnfocused(int guard, UiComponent root) {
        String stackIn_11_2 = null;
        try {
          if (guard > -67) {
            UiComponent var4 = (UiComponent) null;
            boolean discarded$1 = this.focusChildIfUnfocused((UiComponent) null, -59);
          }
          boolean stackIn_7_0 = (null != this.child) && (!this.child.isFocused(0)) && (this.child.focusNext(-4659, root));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("r.OA(").append(guard).append(',');
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void appendChildDebugTree(int depth, byte guard, Hashtable visited, StringBuilder output) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          StringBuilder discarded$4 = output.append('\n');
          for (int var5_int = 0; depth >= var5_int; var5_int++) {
            StringBuilder discarded$6 = output.append(' ');
          }
          if (guard < 61) {
            this.child = (UiComponent) null;
          }
          if (this.child != null) {
            this.child.appendDebugTree(0, visited, output, 1 + depth);
          } else {
            StringBuilder discarded$5 = output.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("r.FA(").append(depth).append(',').append(guard).append(',');
          if (visited == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (output == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void layoutChild(int guard) {
        if (guard != -6844) {
          return;
        }
        if (null != this.child) {
          this.child.refreshLayout(guard ^ -6844);
        }
    }

    SingleChildContainer(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int maximumRenderLayer(int guard) {
        if (guard != 12050) {
          UiComponent var3 = (UiComponent) null;
          this.focusNext(-87, (UiComponent) null);
        }
        return null != this.child ? this.child.maximumRenderLayer(12050) : 0;
    }

    boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        String stackIn_10_2 = null;
        try {
          if (guard != 3) {
            this.child = (UiComponent) null;
          }
          boolean stackIn_6_0 = (null != this.child) && (this.child.onPointerPressed(this.y + offsetY, pointerX, (byte) 3, pointerY, offsetX + this.x, root, button));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var8;
          StringBuilder stackIn_9_1 = new StringBuilder().append("r.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(button).append(')').toString());
        }
    }

    final boolean focusNext(int guard, UiComponent root) {
        String stackIn_11_2 = null;
        try {
          if (guard != -4659) {
            return true;
          }
          boolean stackIn_7_0 = (null != this.child) && (this.child.focusNext(-4659, root));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("r.M(").append(guard).append(',');
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(int guard, Hashtable visited, StringBuilder output, int depth) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        try {
          if (guard != 0) {
            UiComponent var6 = (UiComponent) null;
            boolean discarded$1 = this.focusChildIfUnfocused(71, (UiComponent) null);
          }
          if (this.beginDebugDescription(depth, visited, output, false)) {
            this.appendDebugBody(visited, output, depth, 1);
            this.appendChildDebugTree(depth, (byte) 91, visited, output);
          }
          StringBuilder stackIn_5_0 = (StringBuilder) (output);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("r.AA(").append(guard).append(',');
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

    final static String a(String param0, int param1, String[] param2) {
        String stackIn_29_2 = null;
        String stackIn_32_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.length();
          if (param1 != -63) {
            SavedDataWrite var12 = (SavedDataWrite) null;
            SingleChildContainer.writeSavedData(-19, (SavedDataWrite) null, 121);
          }
          int var4 = var3_int;
          int var5 = 0;
          while (true) {
            int var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (on.a(param0.charAt(var5), false)) {
                  continue;
                }
                break;
              }
              String var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!fk.a(false, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              int var8 = gn.a(16777215, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param2[var8].length() - (var5 - var6_int));
              continue;
            }
            break;
          }
          StringBuilder var6 = new StringBuilder(var4);
          int var7 = 0;
          int var5Lifetime1 = 0;
          while (true) {
            int var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              StringBuilder discarded$0 = var6.append(param0.substring(var7));
              String stackIn_25_0 = var6.toString();
              return stackIn_25_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (on.a(param0.charAt(var5Lifetime1), false)) {
                continue;
              }
              break;
            }
            String var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!fk.a(false, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            int var10 = gn.a(16777215, (CharSequence) ((Object) var9));
            StringBuilder discarded$1 = var6.append(param0.substring(var7, var8Lifetime1));
            StringBuilder discarded$2 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_28_0 = var3;
          StringBuilder stackIn_28_1 = new StringBuilder().append("r.KA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          StringBuilder stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void setBounds(int width, int y, int x, boolean guard, int height) {
        super.setBounds(width, y, x, guard, height);
        this.layoutChild(-6844);
    }

    final boolean onMouseWheel(int offsetX, int rotation, byte guard, int pointerY, int pointerX, UiComponent root, int offsetY) {
        String stackIn_11_2 = null;
        try {
          if (guard > -103) {
            String[] var9 = (String[]) null;
            SingleChildContainer.a((String) null, -44, (String[]) null);
          }
          boolean stackIn_7_0 = (null != this.child) && (this.child.isFocused(0)) && (this.child.onMouseWheel(offsetX, rotation, (byte) -115, pointerY, pointerX, root, offsetY));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var8;
          StringBuilder stackIn_10_1 = new StringBuilder().append("r.JA(").append(offsetX).append(',').append(rotation).append(',').append(guard).append(',').append(pointerY).append(',').append(pointerX).append(',');
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(offsetY).append(')').toString());
        }
    }

    void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        String stackIn_9_2 = null;
        try {
          super.updateHover(guard ^ 0, offsetY, offsetX, root);
          if (this.child != null) {
            this.child.updateHover(guard + 0, this.y + offsetY, this.x + offsetX, root);
          }
          if (guard != -14472) {
            String[] var6 = (String[]) null;
            SingleChildContainer.a((String) null, 17, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("r.Q(").append(guard).append(',').append(offsetY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (0 == layer &&
          null != this.painter) {
          this.painter.drawWidget(screenX, screenY, -33, (UiComponent) (this), true);
        }
        if (null != this.child) {
          this.child.drawLayer(screenY + this.y, (byte) 112, layer, screenX + this.x);
        }
        if (guard <= 85) {
          field_y = false;
        }
    }

    UiComponent focusedChild(int guard) {
        UiComponent var2 = this.child;
        if (var2 != null &&
          var2.isFocused(0)) {
          return var2;
        }
        if (guard == 0) {
          return null;
        }
        return (UiComponent) null;
    }

    final static void writeSavedData(int guard, SavedDataWrite write, int opcode) {
        String stackIn_9_2 = null;
        try {
          CipherPacketBuffer var5 = QuickChatDynamicCommand.outgoingPackets;
          var5.writeCipheredOpcode(opcode, true);
          var5.position = var5.position + 1;
          int var4 = var5.position;
          var5.writeByte(1, -123);
          if (write.payload != null) {
            var5.writeByte(write.payload.length, -123);
            var5.writeBytes(write.payload.length, (byte) 21, 0, write.payload);
          } else {
            var5.writeByte(0, -123);
          }
          var5.appendCrc32(var4, -38);
          var5.position = var5.position - 4;
          write.crc32 = var5.readInt(-5053);
          var5.backpatchByteLength(-80, -var4 + var5.position);
          if (guard >= -80) {
            SingleChildContainer.releaseStatics((byte) 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("r.IA(").append(guard).append(',');
          if (write == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(opcode).append(')').toString());
        }
    }

    String getTooltip(int guard) {
        String var2 = super.getTooltip(guard);
        if (this.child != null) {
          String var3 = this.child.getTooltip(1);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    public static void releaseStatics(byte guard) {
        field_A = null;
        if (guard != 58) {
          SavedDataWrite var2 = (SavedDataWrite) null;
          SingleChildContainer.writeSavedData(-124, (SavedDataWrite) null, 82);
        }
    }

    final void clearFocus(int guard) {
        if (this.child != null) {
          this.child.clearFocus(61);
        }
        if (guard <= 46) {
          this.drawLayer(-54, (byte) 0, -102, 84);
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        boolean stackIn_12_0 = false;
        String stackIn_16_2 = null;
        try {
          if (guard < 0) {
            this.child = (UiComponent) null;
          }
          if (this.child != null &&
            this.child.isFocused(0) &&
            this.child.onFocusedKey(root, character, keyCode, 35)) {
            return true;
          }
          int var5_int = keyCode;
          if (var5_int != 80) {
            return false;
          }
          if (ScoreSubmission.field_h[81]) {
            stackIn_12_0 = this.focusChildIfUnfocused(-106, root);
          } else {
            stackIn_12_0 = this.focusChildIfUnfocused(root, -812);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("r.G(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final boolean isFocused(int guard) {
        if (guard != 0) {
          UiComponent var3 = (UiComponent) null;
          boolean discarded$0 = this.focusChildIfUnfocused(-85, (UiComponent) null);
        }
        return null != this.focusedChild(0) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13202) {
          return;
        }
        SoftwareRasterizer.a(param0, param2 + 7, param3 - 1, 2, param4);
        SoftwareRasterizer.a(param3 + param0, param2, 4, 16, param4);
        SoftwareRasterizer.a(param3 + (param0 + 5), 7 + param2, 63 - param3, 2, param4);
    }

    static {
        field_B = 480;
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
