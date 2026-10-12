/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fi extends tc {
    private int field_n;
    static at field_u;
    private boolean field_p;
    private int field_t;
    private int field_q;
    private int field_k;
    static long field_s;
    jd field_r;
    private int field_o;
    private int field_m;
    static String field_l;

    final static me b(int param0, int param1) {
        int var3 = 0;
        me[] var2;
        int var4;
        me[] var5;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = uj.c((byte) 105);
        var2 = var5;
        for (var3 = param0; var5.length > var3; var3++) {
          if (var5[var3].field_b == param1) {
            return var5[var3];
          }
        }
        return null;
    }

    final void a(jd param0, int param1, int param2, int param3, int param4, ha param5) {
        String var7 = null;
        int var8 = 0;
        int var13 = 0;
        tu stackIn_3_0;
        String stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int[][] stackIn_3_4;
        int stackIn_4_5 = 0;
        tu stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int[][] stackIn_8_4;
        int stackIn_9_5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          uf.field_j.b();
          qn.b();
          fe.b(0, 0, 134, 61, io.field_m, nd.field_b, 0, 0);
          qt.field_e.b(2, 2);
          qn.b(5, 5, 124, 18, 0, 192);
          qn.b(5, 25, 30, 30, 0, 192);
          var7 = this.field_r.field_K;
          qn.f(5, param2, 95, 23);
          stackIn_3_0 = en.field_E;
          stackIn_3_1 = var7;
          stackIn_3_2 = 10 - (this.field_q >> 1);
          stackIn_3_3 = 17;
          stackIn_3_4 = op.field_c;
          if (param5.field_wb) {
            stackIn_4_5 = 1;
          } else {
            stackIn_4_5 = 0;
          }
          ((tu) (Object) stackIn_3_0).b(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4[stackIn_4_5][this.field_r.field_O], -1);
          qn.a();
          var8 = this.field_r.g((byte) 122);
          if (var8 < 0) {
            var8 = 0;
          }
          stackIn_8_0 = en.field_E;
          stackIn_8_1 = var8 + "/" + this.field_r.field_t;
          stackIn_8_2 = 126;
          stackIn_8_3 = 18;
          stackIn_8_4 = op.field_c;
          if (!param5.field_wb) {
            stackIn_9_5 = 0;
          } else {
            stackIn_9_5 = 1;
          }
          ((tu) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4[stackIn_9_5][this.field_r.field_O], -1);
          if (param1 == this.field_r.field_O) {
            qn.b(99, 25, 30, 30, 0, 128);
            qn.b(53, 25, 30, 30, 0, 128);
            var9 = this.field_r.l(-27014);
            cp.field_e[eb.a((byte) -97, ~var9 & 3)].a(56, 25);
          } else {
            if (param0 == null) {
              qn.b(99, 25, 30, 30, 0, 128);
            } else {
              qn.b(37, 25, 92, 30, 0, 128);
              ro.field_rb[param0.g(0)].a(43, 32);
              sg.field_b[this.a(param0.g(0), this.field_r.g(param2 - 5), -46)].a(75, 32);
            }
          }
          ro.field_rb[this.field_r.g(0)].a(106, 32);
          en.field_E.c(-param5.a(param5.field_v * this.field_r.field_w + this.field_r.field_J, param2 - 9, this.field_r) + 100 + "%", 20, 45, 16777215, -1);
          vb.field_t.b(68, 60, nd.field_b[-1 + nd.field_b.length]);
          so.field_b.a(param2 + 5600);
          var9Lifetime1 = this.field_k - param3 - 75;
          var10 = this.field_t - (param4 + 80);
          uf.field_j.e(var9Lifetime1, var10, -this.field_m + 32 << 3);
          var11 = bw.field_m[this.field_r.field_N][12];
          if (var11 != -1) {
            bd.a(32 - this.field_m << 3, true, var9Lifetime1 + 96, e.field_b, 40, 60 + var10);
            if (var11 < lb.field_e.length) {
              lb.field_e[var11].a(var9Lifetime1 + 101, var10 + 58, -this.field_m + 32 << 3);
            }
          }
          var12 = this.field_r.f(param2 + 11);
          if (var12 != -1) {
            bd.a(-this.field_m + 32 << 3, true, var9Lifetime1, e.field_b, 40, var10 + 60);
            ii.field_a[var12].c(var9Lifetime1 + 8, 60 + var10, 24, 24, -this.field_m + 32 << 3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_23_0 = var7_ref;
          stackIn_23_1 = new StringBuilder().append("fi.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = fk.field_d[param1][param0];
        int var5 = fk.field_d[param0][param1];
        if (var5 < var4) {
          if (-var5 + var4 <= 45) {
            return 1;
          }
          return 0;
        }
        if (param2 != -46) {
          return 26;
        }
        if (var4 >= var5) {
          return 2;
        }
        if (45 < -var4 + var5) {
          return 4;
        }
        return 3;
    }

    public static void a(int param0) {
        field_l = null;
        field_u = null;
        if (param0 > -24) {
          field_s = 68L;
        }
    }

    final void a(byte param0, boolean param1) {
        int var4;
        ha var5;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1) {
          if (this.field_m > 0) {
            this.field_m = this.field_m - 4;
          } else {
            if (this.field_o > 0) {
              if (this.field_p) {
                if (this.field_q < this.field_o) {
                  this.field_q = this.field_q + 1;
                }
                if (this.field_q >= this.field_o) {
                  this.field_n = this.field_n - 1;
                  if (this.field_n <= 0) {
                    this.field_n = 50;
                    this.field_p = false;
                  }
                }
              } else {
                if (this.field_q > 0) {
                  this.field_q = this.field_q - 1;
                }
                if (this.field_q <= 0) {
                  this.field_n = this.field_n - 1;
                  if (this.field_n <= 0) {
                    this.field_n = 50;
                    this.field_p = true;
                  }
                }
              }
            }
          }
        } else {
          if (this.field_m < 32) {
            this.field_m = this.field_m + 4;
          }
          if (this.field_m >= 32) {
            this.d(108);
          }
        }
        if (param0 > -100) {
          var5 = (ha) null;
          this.a((jd) null, -88, 39, -11, 35, (ha) null);
        }
    }

    fi(jd param0, int param1, int param2) {
        try {
          this.field_k = param1;
          this.field_m = 32;
          this.field_p = false;
          this.field_q = 0;
          this.field_r = param0;
          this.field_t = param2;
          this.field_o = -110 + rs.field_n.a(this.field_r.field_K);
          if (this.field_o < 0) {
            this.field_o = 0;
          }
          this.field_n = 100;
          this.field_o = this.field_o << 1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, boolean param5, int param6, ha param7, Random param8) {
        ne[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_26_0;
        ne[] stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_4 = 0;
        Object stackIn_31_0;
        ne[] stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_32_5 = 0;
        int stackIn_35_0;
        ne[] stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        int stackIn_36_4 = 0;
        int stackIn_41_0 = 0;
        boolean stackIn_43_1 = false;
        int stackIn_44_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Random var14 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var9_int = -param0 + param4;
          var10 = -param3 + param6;
          if (param1 != 101) {
            var14 = (Random) null;
            fi.a(-20, (byte) 51, -30, 104, -20, false, -76, (ha) null, (Random) null);
          }
          var11 = 0;
          var12 = 0;
          while (true) {
            if (var10 == var11 &&
              var9_int == var12) {
              return;
            }
            if (param7.field_Eb[var12 + param0 + (var11 + param3) * param7.field_v] != null &&
              param7.field_Eb[var12 + (param0 + (var11 + param3) * param7.field_v)].field_h == param2) {
              return;
            }
            if (param7.field_Eb[param0 + var12 + (var11 + param3) * param7.field_v] == null) {
              param7.field_Eb[param7.field_v * (var11 + param3) + (param0 + var12)] = new ne(param2, param7);
            } else {
              if (param7.field_Eb[param7.field_v * (var11 + param3) + (var12 + param0)].field_h == 4 ||
                6 == param7.field_Eb[(var11 + param3) * param7.field_v + (var12 + param0)].field_h &&
                param5) {
                if (param2 == 1) {
                  param7.field_Eb[(param3 + var11) * param7.field_v + var12 + param0] = new ne(10, param7);
                } else {
                  param7.field_Eb[(param3 + var11) * param7.field_v + param0 + var12] = new ne(param2, param7);
                }
              }
            }
            if (var9_int != var12) {
              stackIn_22_0 = param7.field_Eb;
              stackIn_22_1 = param7.field_v * (var11 + param3) + (param0 + var12);
              if (var9_int > 0) {
                stackIn_23_2 = 1;
              } else {
                stackIn_23_2 = -1;
              }
              if (stackIn_22_0[stackIn_22_1 + stackIn_23_2] != null) {
                stackIn_26_0 = param2;
                stackIn_26_1 = param7.field_Eb;
                stackIn_26_2 = param0;
                stackIn_26_3 = var12;
                if (var9_int <= 0) {
                  stackIn_27_4 = -1;
                } else {
                  stackIn_27_4 = 1;
                }
                if (stackIn_26_0 == stackIn_26_1[stackIn_26_2 + (stackIn_26_3 + (stackIn_27_4 + param7.field_v * (var11 + param3)))].field_h) {
                  return;
                }
              }
            }
            if (var10 != var11) {
              stackIn_31_0 = null;
              stackIn_31_1 = param7.field_Eb;
              stackIn_31_2 = param7.field_v;
              stackIn_31_3 = param3;
              stackIn_31_4 = var11;
              if (var10 > 0) {
                stackIn_32_5 = 1;
              } else {
                stackIn_32_5 = -1;
              }
              if (stackIn_31_0 != stackIn_31_1[stackIn_31_2 * (stackIn_31_3 + (stackIn_31_4 + stackIn_32_5)) + param0 + var12]) {
                stackIn_35_0 = ~param2;
                stackIn_35_1 = param7.field_Eb;
                stackIn_35_2 = var12 + param0;
                stackIn_35_3 = param7.field_v;
                if (var10 > 0) {
                  stackIn_36_4 = 1;
                } else {
                  stackIn_36_4 = -1;
                }
                if (stackIn_35_0 == ~stackIn_35_1[stackIn_35_2 + stackIn_35_3 * (stackIn_36_4 + param3 + var11)].field_h) {
                  return;
                }
              }
            }
            if (-var12 + var9_int <= 0) {
              stackIn_41_0 = -(var9_int - var12);
            } else {
              stackIn_41_0 = -var12 + var9_int;
            }
            stackIn_43_1 = false;
            if (-var11 + var10 <= 0) {
              stackIn_44_2 = -(var10 - var11);
            } else {
              stackIn_44_2 = var10 - var11;
            }
            if (-var12 + var9_int > 0) {
              stackIn_47_3 = var9_int - var12;
            } else {
              stackIn_47_3 = -(var9_int - var12);
            }
            if (stackIn_41_0 > ns.a(stackIn_43_1, stackIn_44_2 + stackIn_47_3, param8) &&
              var12 != var9_int) {
              stackIn_51_0 = var12;
              if (0 >= var9_int) {
                stackIn_52_1 = -1;
              } else {
                stackIn_52_1 = 1;
              }
              var12 = stackIn_51_0 + stackIn_52_1;
              continue;
            }
            if (var11 == var10) {
              continue;
            }
            stackIn_57_0 = var11;
            if (var10 <= 0) {
              stackIn_58_1 = -1;
            } else {
              stackIn_58_1 = 1;
            }
            var11 = stackIn_57_0 + stackIn_58_1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_62_0 = var9;
          stackIn_62_1 = new StringBuilder().append("fi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (param8 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    static {
        field_u = new at();
        field_l = "Rock";
    }
}
