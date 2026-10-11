/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tj extends kf {
    static String field_y;
    static int field_C;
    private int field_E;
    private int field_x;
    private int field_z;
    static int field_w;
    private boolean field_D;
    private int field_A;
    private boolean field_B;
    static int field_G;

    private tj(int param0, int param1, int param2, int param3, de param4, qg param5, uj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_E = 2147483647;
        this.field_z = 2147483647;
        try {
          this.field_B = param8 ? true : false;
          this.field_t = param6;
          this.field_D = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_B) {
            return true;
          }
          if (!this.a(param3, param2, param1, param5, -12790)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          if (1 == param6) {
            il.field_k = this;
            this.field_A = param5 - (this.field_s + param2);
            this.field_x = param1 - this.field_j - param3;
          }
          this.field_l = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("tj.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_l = 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tj.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1, re param2, vc param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = StarCannon.field_A;
        try {
          if (param3 != null &&
            null != param3.field_o &&
            param2 != null &&
            param2.field_n == param3.field_i) {
            var4_int = param2.field_o.length;
            var5 = param3.field_o[param0].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param2.field_k == ~param3.field_g[param0][var6] &&
                mc.a(param3.field_n[param0][var6], 0)) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param2.field_o[var7] != param3.field_o[param0][var4_int * var6 + var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_18_0 = var6;
                  return stackIn_18_0;
                }
              }
            }
            if (param1 != -1) {
              var9 = (CharSequence) null;
              tj.a((byte) -65, true, (CharSequence) null);
            }
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("tj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(byte param0, dg param1, int param2) {
        ia var5 = null;
        int var4 = 0;
        try {
          var5 = d.field_b;
          var5.d((byte) 100, param2);
          var5.field_g = var5.field_g + 1;
          var4 = var5.field_g;
          var5.a(1, -70);
          var5.a(param1.field_k, -57);
          var5.d(5918, param1.field_f);
          var5.c((byte) -97, param1.field_h);
          if (param0 != 69) {
            field_G = 121;
          }
          var5.c((byte) -109, param1.field_m);
          var5.c((byte) -89, param1.field_g);
          var5.c((byte) -88, param1.field_i);
          var5.b((byte) -128, var4);
          var5.b(var5.field_g - var4, 31700);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_t instanceof dk) ||
            ((dk) (this.field_t)).field_u) &&
            this.field_l == 1) {
            var5_int = -this.field_A + (pe.field_d - param1);
            var6 = -param3 + (la.field_c - this.field_x);
            if (var5_int != this.field_s ||
              var6 != this.field_j) {
              this.field_j = var6;
              this.field_s = var5_int;
              if (this.field_g instanceof wb) {
                ((wb) (this.field_g)).a(this, (byte) 117, param1, param3);
              }
            }
          } else {
            if (this.field_D) {
              if (this.field_s != this.field_z) {
                var5_int = -this.field_s + this.field_z;
                stackIn_17_1 = this.field_s;
                if (2 < Math.abs(var5_int)) {
                  stackIn_18_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_18_2 = 1;
                  } else {
                    stackIn_18_2 = -1;
                  }
                }
                this.field_s = stackIn_17_1 + stackIn_18_2;
              }
              if (this.field_E != this.field_j) {
                var5_int = -this.field_j + this.field_E;
                stackIn_23_1 = this.field_j;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int > 0) {
                    stackIn_26_2 = 1;
                  } else {
                    stackIn_26_2 = -1;
                  }
                } else {
                  stackIn_26_2 = var5_int >> 1;
                }
                this.field_j = stackIn_23_1 + stackIn_26_2;
              }
            }
          }
          if (param0 < 27) {
            return;
          }
          super.a(98, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("tj.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    final static id[] h(int param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        id[] var1 = new id[bj.field_b];
        int var2Lifetime1;
        for (var2 = 0; var2 < bj.field_b; var2++) {
          var1[var2] = new id(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], og.field_c[var2], of.field_g);
        }
        var2Lifetime1 = -67 / ((-49 - param0) / 58);
        rc.b((byte) 123);
        return var1;
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 >= -113) {
          tj.g(104);
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            if (param0 > -58) {
              field_C = 43;
            }
            var4 = ni.a(127, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!dk.a((byte) -121, var4.charAt(0)) &&
                !dk.a((byte) -127, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (dk.a((byte) -122, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    return false;
                  }
                }
                if (0 >= var5) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 0, param1, param3)) {
            this.a(param0, param1, param3, 19103);
            this.a(param0, param3, -349, param1);
            discarded$64 = param1.append(" revert=").append(this.field_D);
            if (2147483647 != this.field_z &&
              this.field_E != 2147483647) {
              discarded$65 = param1.append(" to ").append(this.field_z).append(',').append(this.field_E);
            }
          }
          if (param2 == 39) {
            stackIn_8_0 = (StringBuilder) (param1);
            return stackIn_8_0;
          }
          stackIn_6_0 = (StringBuilder) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("tj.SA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0) {
        super.f(-77);
        this.field_t.a(0, this.field_i, (byte) 122, this.field_f, 0);
        this.field_E = this.field_j;
        this.field_z = this.field_s;
        int var2 = 98 / ((47 - param0) / 52);
    }

    static {
        field_y = "Password: ";
    }
}
