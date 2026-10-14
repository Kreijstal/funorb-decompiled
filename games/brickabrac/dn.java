/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dn extends SingleChildWidget {
    static UiComponent field_K;
    private int field_H;
    static String field_J;
    private int field_O;
    private int field_G;
    private int field_I;
    static UiComponent field_N;
    private boolean field_L;
    private boolean field_M;

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.handlePointerPress(focusRoot, pointerX, parentX, parentY, button, pointerY, obfuscationGuard) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_M) {
            return true;
          }
          if (!this.containsPoint(pointerY, parentY, parentX, obfuscationGuard ^ 3, pointerX)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          this.pressedButton = button;
          if (1 != button) {
            return true;
          }
          this.field_H = -parentY + (-this.y + pointerY);
          gd.field_c = this;
          this.field_G = -parentX - this.x + pointerX;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("dn.MA(");
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, String param1, ml param2, int param3, TextFont param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          if (param0 != 25293) {
            field_N = (UiComponent) null;
          }
          for (var7 = 1; var7 < param1.length(); var7++) {
            var8 = param1.charAt(var7);
            if (60 == var8) {
              var6 = param2.field_g[0] + (var5_int >> 8) + param4.measureText(param1.substring(0, var7));
            }
            if (-1 != var6) {
              param2.field_g[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param3;
              }
              param2.field_g[var7] = (var5_int >> 8) - (-param2.field_g[0] - param4.measureText(param1.substring(0, var7 + 1))) - param4.getAdvance((char) var8);
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        super.a((byte) -39);
        this.child.setBounds(this.height, 0, 0, (byte) -119, this.width);
        if (param0 > -7) {
          dn.g(1);
        }
        this.field_I = this.x;
        this.field_O = this.y;
    }

    private dn(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, Widget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_O = 2147483647;
        this.field_I = 2147483647;
        try {
          this.field_L = param7 ? true : false;
          this.child = param6;
          this.field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int stackIn_11_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.child instanceof FocusableWidget) ||
            ((FocusableWidget) (this.child)).enabled) &&
            1 == this.pressedButton) {
            var5_int = MusicPatch.pointerX - this.field_G - parentX;
            var6 = po.pointerY + (-this.field_H - parentY);
            if (this.x == var5_int &&
              var6 == this.y) {
              super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
              return;
            }
            this.y = var6;
            this.x = var5_int;
            if (this.listener instanceof li) {
              ((li) (this.listener)).a((byte) -68, parentY, parentX, this);
            }
          } else {
            if (this.field_L) {
              if (this.x != this.field_I) {
                var5_int = this.field_I - this.x;
                stackIn_11_1 = this.x;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_14_2 = -1;
                  } else {
                    stackIn_14_2 = 1;
                  }
                } else {
                  stackIn_14_2 = var5_int >> 1;
                }
                this.x = stackIn_11_1 + stackIn_14_2;
              }
              if (this.field_O != this.y) {
                var5_int = this.field_O - this.y;
                stackIn_19_1 = this.y;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int <= 0) {
                    stackIn_22_2 = -1;
                  } else {
                    stackIn_22_2 = 1;
                  }
                } else {
                  stackIn_22_2 = var5_int >> 1;
                }
                this.y = stackIn_19_1 + stackIn_22_2;
              }
            }
          }
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("dn.WA(");
          if (focusRoot == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != 1) {
          dn.g(-43);
        }
        field_N = null;
        field_K = null;
    }

    final static um g(int param0) {
        if (param0 != -23009) {
          field_J = (String) null;
        }
        if (CappedUrlRequest.field_e == null) {
          CappedUrlRequest.field_e = new um(QuickChatMenu.field_Yb, 20, 0, 0, 0, 11579568, -1, 0, 0, QuickChatMenu.field_Yb.ascent, -1, 2147483647, true);
        }
        return CappedUrlRequest.field_e;
    }

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        try {
          super.handlePointerRelease(pointerY, pointerX, parentY, focusRoot, obfuscationGuard, parentX);
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dn.GA(" + pointerY + ',' + pointerX + ',' + parentY + ',' + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ')');
        }
    }

    final static void requestSpectateGame(int gameId, int obfuscationGuard, int opcode) {
        int guardArithmetic = -51 / ((-23 - obfuscationGuard) / 62);
        BitPacketBuffer packet = k.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-100, 3);
        packet.writeByte(-15, 10);
        packet.writeShort((byte) 122, gameId);
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
            this.a(param3, true, param1, param0);
            discarded$64 = param3.append(" revert=").append(this.field_L);
            if (this.field_I != 2147483647 &&
              this.field_O != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_I).append(',').append(this.field_O);
            }
          }
          if (param2 != 24) {
            var6 = (StringBuilder) null;
            this.a(-94, (Hashtable) null, 17, (StringBuilder) null);
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("dn.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_J = "<%0> is already on your ignore list.";
    }
}
