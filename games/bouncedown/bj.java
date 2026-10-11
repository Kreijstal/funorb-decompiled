/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj extends ak {
    private boolean field_D;
    private int field_H;
    private int field_C;
    static ng field_E;
    private int field_G;
    private boolean field_F;
    private int field_B;

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
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
          if (this.a(param2, param3, (byte) 14, param0)) {
            this.a(param0, param3, param2, 32362);
            this.a(param2, (byte) 12, param0, param3);
            discarded$64 = param3.append(" revert=").append(this.field_F);
            if (this.field_G != 2147483647 &&
              this.field_C != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_G).append(',').append(this.field_C);
            }
          }
          if (param1) {
            stackIn_8_0 = (StringBuilder) (param3);
            return stackIn_8_0;
          }
          stackIn_6_0 = (StringBuilder) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("bj.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_E = null;
        if (param0 > -107) {
          field_E = (ng) null;
        }
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, (int) (char)param4, param5);
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "bj.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(wi param0, byte param1, int param2, si param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          hh var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = Bounce.field_N;
          try {
            var18 = new hh();
            var18.field_j = param0.d((byte) -109);
            var18.field_g = param0.j(-3);
            var18.field_n = new mk[var18.field_j];
            var18.field_o = new int[var18.field_j];
            var18.field_i = new int[var18.field_j];
            var18.field_l = new int[var18.field_j];
            var18.field_m = new byte[var18.field_j][][];
            var18.field_s = new mk[var18.field_j];
            if (param1 >= -123) {
              bj.k(26);
            }
            for (var5 = 0; var18.field_j > var5; var5++) {
              try {
                var6_int = param0.d((byte) -77);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param0.b(true);
                    var8 = param0.b(true);
                    var9 = param0.d((byte) -82);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param0.b(true);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param0.j(-3);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a((byte) 124, var13, var21[var12_int], 0);
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var17 < var9) {
                      var12[var17] = pf.a(var10[var17], -1);
                      var17++;
                    }
                    var18.field_s[var5] = param3.a(var8, pf.a(var20, -1), 8532, var12);
                    var18.field_m[var5] = var21;
                  }
                } else {
                  var16 = param0.b(true);
                  dupTemp$1 = param0.b(true);
                  var15 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.j(-3);
                  }
                  var18.field_o[var5] = var6_int;
                  var18.field_l[var5] = var9;
                  var18.field_n[var5] = param3.a(var15, pf.a(var16, -1), (byte) 48);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_i[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_i[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_i[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_i[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_i[var5] = -5;
              }
            }
            ob.field_c.a(1, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("bj.GA(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        int stackIn_16_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if (param0 != -1) {
            return;
          }
          if ((!(this.field_x instanceof wd) ||
            ((wd) (this.field_x)).field_y) &&
            this.field_u == 1) {
            var5_int = -param1 + (-this.field_B + uc.field_C);
            var6 = ll.field_y - this.field_H - param2;
            if (this.field_r != var5_int ||
              var6 != this.field_i) {
              this.field_r = var5_int;
              this.field_i = var6;
              if (this.field_n instanceof ni) {
                ((ni) (this.field_n)).a(param2, (byte) -98, param1, this);
              }
            }
          } else {
            if (!this.field_F) {
              super.a(param0 ^ 0, param1, param2, param3);
              return;
            }
            if (this.field_r != this.field_G) {
              var5_int = -this.field_r + this.field_G;
              stackIn_16_1 = this.field_r;
              if (Math.abs(var5_int) <= 2) {
                if (var5_int > 0) {
                  stackIn_19_2 = 1;
                } else {
                  stackIn_19_2 = -1;
                }
              } else {
                stackIn_19_2 = var5_int >> 1;
              }
              this.field_r = stackIn_16_1 + stackIn_19_2;
            }
            if (this.field_C != this.field_i) {
              var5_int = this.field_C - this.field_i;
              stackIn_26_1 = this.field_i;
              if (Math.abs(var5_int) > 2) {
                stackIn_27_2 = var5_int >> 1;
              } else {
                if (var5_int <= 0) {
                  stackIn_27_2 = -1;
                } else {
                  stackIn_27_2 = 1;
                }
              }
              this.field_i = stackIn_26_1 + stackIn_27_2;
            }
          }
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("bj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void i(int param0) {
        super.i(-41);
        this.field_x.b(this.field_m, 80, this.field_k, 0, 0);
        this.field_G = this.field_r;
        this.field_C = this.field_i;
        if (param0 >= -21) {
          bj.a((byte) 10, 120);
        }
    }

    final static String j(int param0) {
        if (param0 != 44) {
          bj.k(19);
        }
        if (null == ja.field_b) {
          return "";
        }
        return ja.field_b;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Bounce.field_N;
        try {
          Bounce.a(va.field_b, q.field_M, 22668, 0, w.field_d, param1, true);
          if (param0 != -125) {
            field_E = (ng) null;
          }
          for (var2_int = 0; var2_int < q.field_M; var2_int++) {
            w.field_f[var2_int + param1] = var2_int;
          }
          Bounce.a(mg.field_n, q.field_M + param1, 22668, param1, uc.field_A, param1 + param1, false);
          if (param1 < q.field_M) {
            q.field_M = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "bj.LA(" + param0 + ',' + param1 + ')');
        }
    }

    private bj(int param0, int param1, int param2, int param3, fc param4, sk param5, lk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_C = 2147483647;
        this.field_G = 2147483647;
        try {
          this.field_D = param8 ? true : false;
          this.field_F = param7 ? true : false;
          this.field_x = param6;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_D) {
            return true;
          }
          if (!this.c(param3, param4 ^ 28455, param6, param2, param5)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          this.field_u = param0;
          if (param0 != 1) {
            return true;
          }
          this.field_H = -param6 + (-this.field_i + param5);
          nd.field_A = this;
          this.field_B = -param2 + (param3 - this.field_r);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("bj.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_E = null;
    }
}
