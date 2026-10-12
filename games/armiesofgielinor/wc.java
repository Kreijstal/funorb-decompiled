/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wc extends nl {
    private int field_O;
    private boolean field_P;
    static String field_R;
    static String field_K;
    private int field_L;
    private boolean field_I;
    private int field_N;
    static RgbSprite[] field_Q;
    static RgbSprite field_J;
    private int field_M;

    final boolean a(int param0, int param1, int param2, int param3, Widget param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, 108, param4, param5, param6) ? 1 : 0;
          if (param3 < 103) {
            this.field_N = 62;
          }
          if (var8_int != 0 &&
            this.field_I) {
            return true;
          }
          if (!this.containsPointer(1, param1, param5, param0, param2)) {
            stackIn_8_0 = var8_int;
            return stackIn_8_0 != 0;
          }
          if (1 == param6) {
            this.field_L = -this.y + (param5 - param2);
            bn.field_f = this;
            this.field_N = -param1 - this.x + param0;
          }
          this.field_q = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("wc.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, Widget param3) {
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_E instanceof fw) ||
            ((fw) (this.field_E)).field_I) &&
            this.field_q == 1) {
            var5_int = -param1 + (AiPlanningStrategy.pointerX - this.field_N);
            var6 = -this.field_L + (ko.pointerY - param2);
            if (this.x != var5_int ||
              this.y != var6) {
              this.x = var5_int;
              this.y = var6;
              if (this.field_x instanceof fr) {
                ((fr) (this.field_x)).a(this, param2, param0 ^ -32678, param1);
              }
            }
          } else {
            if (!this.field_P) {
              super.a(param0, param1, param2, param3);
              return;
            }
            if (this.field_O != this.x) {
              var5_int = -this.x + this.field_O;
              stackIn_18_1 = this.x;
              if (2 < Math.abs(var5_int)) {
                stackIn_19_2 = var5_int >> 1;
              } else {
                if (var5_int > 0) {
                  stackIn_19_2 = 1;
                } else {
                  stackIn_19_2 = -1;
                }
              }
              this.x = stackIn_18_1 + stackIn_19_2;
            }
            if (this.y != this.field_M) {
              var5_int = -this.y + this.field_M;
              stackIn_25_1 = this.y;
              if (2 < Math.abs(var5_int)) {
                stackIn_26_2 = var5_int >> 1;
              } else {
                if (var5_int <= 0) {
                  stackIn_26_2 = -1;
                } else {
                  stackIn_26_2 = 1;
                }
              }
              this.y = stackIn_25_1 + stackIn_26_2;
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("wc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_R = null;
        field_K = null;
        field_J = null;
        if (param0 != 0) {
          field_K = (String) null;
        }
        field_Q = null;
    }

    final static void a(boolean param0, int param1) {
        td.a(param0, false, 108);
        if (param1 != -49) {
          field_J = (RgbSprite) null;
        }
    }

    final static qc c(boolean param0) {
        if (param0) {
          field_R = (String) null;
        }
        return (qc) ((Object) new uk());
    }

    final void b(boolean param0) {
        if (!param0) {
          this.field_O = -119;
        }
        super.b(param0);
        this.field_E.setBounds(0, this.width, 0, 8192, this.height);
        this.field_M = this.y;
        this.field_O = this.x;
    }

    final void a(int param0, Widget param1, int param2, byte param3, int param4, int param5) {
        try {
          int var7_int = -116 / ((-58 - param3) / 53);
          super.a(param0, param1, param2, (byte) 73, param4, param5);
          this.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wc.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 26477) {
            this.field_P = false;
          }
          if (this.a(param3, param0, (byte) 61, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, param0, -56, param1);
            discarded$62 = param1.append(" revert=").append(this.field_P);
            if (2147483647 != this.field_O &&
              this.field_M != 2147483647) {
              discarded$63 = param1.append(" to ").append(this.field_O).append(',').append(this.field_M);
            }
          }
          stackIn_9_0 = (StringBuilder) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wc.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          return;
        }
        if (null != ad.field_I) {
          op.a(-116, ad.field_I);
        }
        if (null != tn.activeContextMenu) {
          tn.activeContextMenu.draw((byte) -108, param0);
        }
        SummonRequest.a(param0, (byte) -89);
        if (Spell.field_b != null) {
          Spell.field_b.draw(param0, 20);
        }
        qh.a(param0, 0);
    }

    wc(int param0, int param1, int param2, int param3, WidgetPainter param4, qo param5, Widget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_O = 2147483647;
        this.field_M = 2147483647;
        try {
          this.field_P = param7 ? true : false;
          this.field_I = param8 ? true : false;
          this.field_E = param6;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_long = (long)param1;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 + (var6 - 65));
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(1 + (var6 - 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("wc.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_K = "Public chat is unavailable while setting up a rated game.";
        field_R = "Kick <%0> from this game";
    }
}
