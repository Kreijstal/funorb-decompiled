/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kb extends kn {
    static ol field_O;
    private boolean field_T;
    private int field_W;
    private boolean field_U;
    private int field_V;
    private int field_N;
    private int field_Q;
    static boolean field_S;
    static String field_P;
    static String field_R;

    final static void f(byte param0) {
        if (param0 == 100) {
          if (an.field_c) {
            wb.g(wb.field_i, wb.field_a, -wb.field_i + wb.field_j, -wb.field_a + wb.field_b);
            rh.field_c.a(false, false);
          }
          return;
        }
    }

    final static boolean j(int param0) {
        if (param0 >= -21) {
          return true;
        }
        return !pi.field_c.b((byte) 98) ? true : false;
    }

    public static void i(int param0) {
        field_P = null;
        if (param0 != -15237) {
          field_O = (ol) null;
          field_R = null;
          field_O = null;
          return;
        }
        field_R = null;
        field_O = null;
    }

    final void h(int param0) {
        super.h(param0 ^ 0);
        if (param0 == -15616) {
          this.field_M.a(0, 34, this.field_C, this.field_y, 0);
          this.field_N = this.field_u;
          this.field_Q = this.field_r;
          return;
        }
    }

    final void a(int param0, int param1, mf param2, int param3) {
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if ((!(this.field_M instanceof fb) ||
            ((fb) (this.field_M)).field_H) &&
            this.field_q == 1) {
            var5_int = -this.field_W + (hn.field_k - param0);
            var6 = -param3 + (rf.field_b - this.field_V);
            if (var5_int != this.field_u ||
              var6 != this.field_r) {
              this.field_r = var6;
              this.field_u = var5_int;
              if (this.field_p instanceof gk) {
                ((gk) (this.field_p)).a(param0, param3, this, (byte) 30);
              }
            }
          } else {
            if (this.field_U) {
              if (this.field_N != this.field_u) {
                var5_int = -this.field_u + this.field_N;
                stackIn_13_1 = this.field_u;
                if (Math.abs(var5_int) > 2) {
                  stackIn_14_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_14_2 = 1;
                  } else {
                    stackIn_14_2 = -1;
                  }
                }
                this.field_u = stackIn_13_1 + stackIn_14_2;
              }
              if (this.field_Q != this.field_r) {
                var5_int = this.field_Q - this.field_r;
                stackIn_18_1 = this.field_r;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int <= 0) {
                    stackIn_21_2 = -1;
                  } else {
                    stackIn_21_2 = 1;
                  }
                } else {
                  stackIn_21_2 = var5_int >> 1;
                }
                this.field_r = stackIn_18_1 + stackIn_21_2;
              }
            }
          }
          super.a(param0, -14, param2, param3);
          if (param1 <= -6) {
            return;
          }
          var7 = (String) null;
          kb.a((String) null, 11, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("kb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param1 <= 23) {
          kb.j(15);
        }
        if (param0 <= 0) {
          var2 = 2;
          if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (-256 > param0) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 < -16) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (-4 > param0) {
            param0 = param0 >> 2;
            var2 += 2;
          }
          if (param0 < -2) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 1;
        if (param0 > 65535) {
          var2Lifetime1 += 16;
          param0 = param0 >> 16;
        }
        if (255 < param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 > 15) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (3 < param0) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 > 1) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var5 = Chess.field_G;
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
          param0 = param0.substring(0, var4) + param2 + param0.substring(param3.length() + var4);
          var4 = param0.indexOf(param3, param2.length() + var4);
        }
        if (param1 == 0) {
          return param0;
        }
        field_P = (String) null;
        return param0;
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "kb.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_T) {
            return true;
          }
          if (!this.a(param2, param5, param6, (byte) -117, param1)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          if (1 == param0) {
            this.field_W = -param6 + (param1 - this.field_u);
            this.field_V = param2 + (-this.field_r - param5);
            vj.field_a = this;
          }
          this.field_q = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("kb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private kb(int param0, int param1, int param2, int param3, jm param4, rg param5, mf param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_N = 2147483647;
        this.field_Q = 2147483647;
        try {
          this.field_M = param6;
          this.field_U = param7 ? true : false;
          this.field_T = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Chess.field_G;
          try {
            try {
              var3 = (String) (u.a(true, "getcookies", param1));
              if (param0 != -2147483648) {
                kb.j(11);
              }
              var4 = gl.a((byte) -118, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("kb.J(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, param0, param2, -13)) {
            this.a(param0, param2, param1, false);
            this.a(param0, (byte) -67, param2, param1);
            discarded$64 = param2.append(" revert=").append(this.field_U);
            if (2147483647 != this.field_N &&
              this.field_Q != 2147483647) {
              discarded$65 = param2.append(" to ").append(this.field_N).append(',').append(this.field_Q);
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kb.WA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_R = "Waiting for <%0> to start the game...";
        field_S = false;
    }
}
