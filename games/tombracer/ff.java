/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ff implements dv {
    int field_k;
    dt[] field_G;
    int field_E;
    hca[] field_H;
    wd[] field_y;
    private int field_r;
    private mt field_d;
    static String field_N;
    int field_L;
    int field_K;
    private int field_O;
    int field_A;
    sma field_e;
    String[] field_l;
    int field_C;
    BitSet[] field_x;
    private int field_o;
    int field_b;
    boolean[] field_I;
    int[] field_v;
    kqa field_c;
    boolean field_h;
    ds field_D;
    private String[] field_J;
    static jpa[] field_j;
    int[] field_g;
    private boolean field_s;
    int field_P;
    long[] field_F;
    private int field_f;
    cfa field_i;
    private boolean[] field_n;
    private boolean[] field_q;
    static int field_w;
    private int field_B;
    int field_z;
    private wea[] field_u;
    private boolean field_M;
    private int field_m;
    private int field_a;
    static iu field_p;
    int field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        la var6 = this.field_G[param1].a(true, param0);
        if (var6 == null) {
            throw new IllegalStateException("Could not resync player to room: " + param1 + ", " + param0);
        }
        this.field_G[param1].field_c = param3;
        var6.a((byte) 88, param4);
        var6.i((byte) -65);
        if (param2 == 1) {
            return;
        }
        this.field_k = 37;
    }

    final void b(boolean param0, int param1, int param2) {
        this.field_s = false;
        dt var4 = this.field_G[param2];
        if (!param0) {
            return;
        }
        var4.m(9262).a(var4, param1, 104);
        if (!(var4.k(-19271))) {
            this.n(121, param2);
        }
    }

    final int i(int param0) {
        if (param0 != 0) {
            this.a(68, (byte) -44);
            return this.field_r;
        }
        return this.field_r;
    }

    final boolean b(int param0, int param1) {
        if (param1 != 0) {
            this.field_n = (boolean[]) null;
            return this.field_n[param0];
        }
        return this.field_n[param0];
    }

    private final void c(int param0) {
        this.c((byte) -89);
        if (param0 == 22640) {
            return;
        }
        this.c(96);
    }

    public static void f(int param0) {
        boolean discarded$0 = false;
        field_N = null;
        field_p = null;
        if (param0 != 0) {
            discarded$0 = ff.h(88);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final boolean a(boolean param0, int param1, int param2) {
        hca var4 = this.field_H[param1];
        if (param0) {
            return false;
        }
        la var5 = var4.f((byte) -85);
        if (var5 == null) {
            return true;
        }
        int var6 = var5.c(74);
        if (param2 == var6) {
            return false;
        }
        if (param2 == var6 - -1) {
            return false;
        }
        return true;
    }

    final void a(boolean param0, la param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0) {
              if (param1.o((byte) -82)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = param1.c(91);
                var4 = 0;
                L1: while (true) {
                  L2: {
                    if (var4 >= this.field_G.length) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        L3: {
                          if (this.field_G[var4] == null) {
                            break L3;
                          } else {
                            var5 = this.field_G[var4].a(param0, var3_int);
                            if (var5 == null) {
                              break L3;
                            } else {
                              param1.a(var5, (byte) 126);
                              break L3;
                            }
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("ff.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void k(int param0, int param1) {
        this.field_o = param0;
        this.field_D.a(this.field_o, false);
        this.field_D.a((byte) 74);
        if (!((this.field_o ^ -1) > param1)) {
            this.field_v[this.field_o] = this.field_v[this.field_o] + 1;
        }
    }

    final int a(String param0, byte param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 62) {
                break L1;
              } else {
                discarded$2 = this.d(-118);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_H.length <= var3_int) {
                    break L4;
                  } else {
                    stackOut_5_0 = faa.a(param0, 109, this.field_l[var3_int]);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0) {
                        stackOut_8_0 = var3_int;
                        stackIn_9_0 = stackOut_8_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3_int++;
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = -2;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ff.PA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_9_0;
        }
    }

    final boolean k(int param0) {
        if (param0 != -25319) {
            this.field_s = true;
            return this.field_K == 2 ? true : false;
        }
        return this.field_K == 2 ? true : false;
    }

    final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 > 54) {
            break L0;
          } else {
            this.field_n = (boolean[]) null;
            break L0;
          }
        }
        var2 = -1;
        var3 = -1;
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= this.field_H.length) {
              break L2;
            } else {
              var5 = this.field_v[var4];
              stackOut_4_0 = -1;
              stackOut_4_1 = var3;
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (var6 != 0) {
                if (stackIn_7_0 > stackIn_7_1) {
                  return -1;
                } else {
                  return var3;
                }
              } else {
                L3: {
                  L4: {
                    if (stackIn_5_0 == stackIn_5_1) {
                      break L4;
                    } else {
                      if ((var5 ^ -1) < (var2 ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = var5;
                  var3 = var4;
                  break L3;
                }
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          if ((var2 ^ -1) > (this.field_L ^ -1)) {
            return -1;
          } else {
            return var3;
          }
        }
    }

    final void h(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 45) {
            return;
        }
        int var3 = 0;
        do {
            if (this.field_H.length <= var3) {
                return;
            }
            this.field_G[var3].d(119, param0);
            var3++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    final la a(int param0, int param1) {
        if (param0 != 0) {
            this.field_A = -127;
            return this.field_H[param1].f((byte) 106);
        }
        return this.field_H[param1].f((byte) 106);
    }

    final void d(byte param0, int param1) {
        if (!this.f((byte) -107, param1)) {
            if (!(!this.l(13, param1))) {
                return;
            }
            this.field_m = this.field_m | 1 << param1;
            this.n(38, param1);
            int var3 = 27 / ((51 - param0) / 43);
            this.field_P = this.field_P - 1;
            return;
        }
    }

    private final void n(int param0, int param1) {
        this.field_q[param1] = true;
        if (param0 >= 29) {
            return;
        }
        this.a(-104, 79, -8, 3, -72);
    }

    public final void a(kh param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_h = uha.a(5907, param0);
                this.field_z = uma.a(32, param0, -26803);
                this.field_A = param0.b((byte) 44, 32);
                this.field_C = param0.b((byte) 44, 32);
                this.field_y = (wd[]) ((Object) gha.a(this.field_y, 1, 8, -16499, nfa.field_q, param0));
                this.field_u = (wea[]) ((Object) gha.a(this.field_u, 1, 8, -16499, kba.field_u, param0));
                this.field_v = fa.a(0, param0, 8, this.field_v);
                this.field_o = uma.a(32, param0, -26803);
                this.field_q = c.a(8, this.field_q, (byte) 93, param0);
                this.field_P = param0.b((byte) 44, 32);
                this.field_s = uha.a(5907, param0);
                if (!uha.a(5907, param0)) {
                  break L2;
                } else {
                  L3: {
                    if (null != this.field_i) {
                      break L3;
                    } else {
                      this.field_i = new cfa();
                      break L3;
                    }
                  }
                  this.field_i.a(param0, false);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_i = null;
              break L1;
            }
            this.field_E = uma.a(32, param0, -26803);
            this.field_I = c.a(8, this.field_I, (byte) -41, param0);
            if (!param1) {
              this.c(22640);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ff.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void d(int param0, int param1) {
        if (msa.field_a == param1) {
            if (!(null != rba.field_a)) {
                return;
            }
            if (param0 != 0) {
                return;
            }
            aoa.a(108, 13);
            aoa.a(84, 14);
            aoa.a(43, 15);
            return;
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_2_0 = false;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            if (var2 >= this.field_H.length) {
              break L1;
            } else {
              stackOut_2_0 = this.field_q[var2];
              stackIn_7_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var3 != 0) {
                return stackIn_7_0;
              } else {
                if (stackIn_3_0) {
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return false;
                }
              }
            }
          }
          return true;
        }
    }

    final String e(int param0, int param1) {
        if (param1 != 23807) {
            return (String) null;
        }
        if (-1 < (param0 ^ -1)) {
            return dpa.field_c;
        }
        return this.field_J[param0];
    }

    final boolean j(int param0) {
        int discarded$7 = 0;
        if (param0 != -1878) {
            discarded$7 = this.i(-41, -61);
            if (-2 != (this.field_k ^ -1)) {
                return false;
            }
            if (-3 == (this.field_K ^ -1)) {
                return false;
            }
            return true;
        }
        if (-2 != (this.field_k ^ -1)) {
            return false;
        }
        if (-3 == (this.field_K ^ -1)) {
            return false;
        }
        return true;
    }

    final boolean e(byte param0, int param1) {
        if (param0 >= -56) {
            this.c((byte) 52);
            if (this.f((byte) -102, param1)) {
                return false;
            }
            if (!this.field_G[param1].e(-31170)) {
                return false;
            }
            return true;
        }
        if (this.f((byte) -102, param1)) {
            return false;
        }
        if (!this.field_G[param1].e(-31170)) {
            return false;
        }
        return true;
    }

    final static boolean h(int param0) {
        if (param0 != 1) {
            field_w = 88;
            return du.field_e;
        }
        return du.field_e;
    }

    final void a(byte param0) {
        int var2 = 0;
        if (this.field_z < 0) {
            this.field_A = this.field_A + 1;
            this.field_C = this.field_A + (this.field_f + 1);
            this.field_D.a((byte) 108);
            this.c((byte) -89);
            var2 = -128 % ((80 - param0) / 37);
            this.field_o = -1;
            this.field_s = true;
            return;
        }
        var2 = -128 % ((80 - param0) / 37);
        this.field_o = -1;
        this.field_s = true;
    }

    final boolean g(int param0, int param1) {
        if (param0 < 68) {
            return false;
        }
        return -1 > (1 << param1 & this.field_t ^ -1) ? true : false;
    }

    final boolean g(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.k(37);
            return this.field_s;
        }
        return this.field_s;
    }

    final dda a(boolean param0, int param1) {
        if (!param0) {
            return (dda) null;
        }
        return this.field_G[param1].m(9262).a(104);
    }

    final void m(int param0, int param1) {
        if (!this.f((byte) -82, param1)) {
            if (!(!this.l(13, param1))) {
                return;
            }
            this.field_B = this.field_B | param0 << param1;
            this.n(40, param1);
            this.field_P = this.field_P - 1;
            return;
        }
    }

    final boolean a(int param0) {
        wd[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int var6 = 0;
        wd[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = this.field_y;
        var2 = var7;
        var4 = -71 % ((param0 - -68) / 44);
        var3 = 0;
        L0: while (true) {
          L1: {
            if ((var3 ^ -1) <= (var7.length ^ -1)) {
              break L1;
            } else {
              var5 = var7[var3];
              stackOut_2_0 = var5.b(56) ^ -1;
              stackIn_7_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var6 != 0) {
                return stackIn_7_0 != 0;
              } else {
                if (stackIn_3_0 != 0) {
                  var3++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return false;
                }
              }
            }
          }
          return true;
        }
    }

    final void a(int param0, byte param1) {
        this.field_z = param0;
        this.field_h = true;
        if (param1 > 100) {
            return;
        }
        this.field_C = 80;
    }

    final int i(int param0, int param1) {
        if (param0 != 1) {
            this.a(21, (byte) 42);
            return this.field_H[param1].f((byte) 87).c(-79);
        }
        return this.field_H[param1].f((byte) 87).c(-79);
    }

    final boolean l(int param0, int param1) {
        if (param0 != 13) {
            this.field_C = -75;
            return (1 << param1 & this.field_m) > 0 ? true : false;
        }
        return (1 << param1 & this.field_m) > 0 ? true : false;
    }

    private final void a(byte param0, int param1) {
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4 = 16 % ((54 - param0) / 35);
        tu var7 = this.field_d.a((ff) (this), -25077);
        tu var3 = var7;
        this.field_G[param1] = new dt(var7, this.field_H[param1], this.field_O, this.field_a);
        int var5 = 0;
        do {
            if (this.field_G[param1].l(-106) <= var5) {
                return;
            }
            this.field_G[param1].a(-28088, var5, this.field_u[this.field_A].a(1024, var5, this.field_C, this.field_G[param1]));
            var5++;
            if (var6 != 0) {
                return;
            }
        } while (var6 == 0);
    }

    final boolean b(byte param0, int param1) {
        if (param0 != 90) {
            this.field_m = 124;
            if (this.f((byte) -91, param1)) {
                return false;
            }
            if (!this.field_G[param1].b(param0 + -90)) {
                return false;
            }
            return true;
        }
        if (this.f((byte) -91, param1)) {
            return false;
        }
        if (!this.field_G[param1].b(param0 + -90)) {
            return false;
        }
        return true;
    }

    final boolean f(byte param0, int param1) {
        if (param0 > -73) {
            this.field_O = 117;
            return (1 << param1 & this.field_B) > 0 ? true : false;
        }
        return (1 << param1 & this.field_B) > 0 ? true : false;
    }

    final boolean a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          if (param1) {
            break L0;
          } else {
            field_w = -127;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if ((this.field_k ^ -1) >= (var3 ^ -1)) {
              break L2;
            } else {
              stackOut_3_0 = var3 ^ -1;
              stackIn_12_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var4 != 0) {
                return stackIn_12_0 != 0;
              } else {
                L3: {
                  L4: {
                    if (stackIn_4_0 != (param0 ^ -1)) {
                      break L4;
                    } else {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!this.f((byte) -122, var3)) {
                    return false;
                  } else {
                    break L3;
                  }
                }
                var3++;
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return true;
        }
    }

    final String c(int param0, int param1) {
        if (param1 > param0) {
            return dpa.field_c;
        }
        return this.field_l[param0];
    }

    final int j(int param0, int param1) {
        if (param0 != 0) {
            this.field_a = 20;
            return dna.b(this.field_G[param1].a(true), 255);
        }
        return dna.b(this.field_G[param1].a(true), 255);
    }

    final dt f(int param0, int param1) {
        if (param0 < param1) {
            return null;
        }
        return this.field_G[param0];
    }

    final void a(byte param0, pi param1) {
        int discarded$0 = 0;
        dt var3 = null;
        try {
            if (param0 <= 14) {
                discarded$0 = this.b((byte) -115);
            }
            var3 = this.field_G[param1.a(3)];
            var3.m(9262).a(var3, param1, false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ff.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(byte param0, int param1) {
        String discarded$0 = null;
        if (param0 != 115) {
            discarded$0 = this.e(-62, 55);
            return this.field_G[param1].field_c;
        }
        return this.field_G[param1].field_c;
    }

    final boolean d(int param0) {
        if (param0 > -61) {
            this.field_z = -104;
            return this.field_M;
        }
        return this.field_M;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var4 = 0;
        la var5 = null;
        la var22 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= this.field_G.length) {
              var2 = 0;
              break L1;
            } else {
              this.field_H[var2].t((byte) 126);
              this.a((byte) -36, var2);
              var2++;
              if (var4 != 0) {
                break L1;
              } else {
                if (var4 == 0) {
                  continue L0;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var2 >= this.field_G.length) {
                          break L4;
                        } else {
                          var5 = this.field_G[var2].a(-88);
                          if (var4 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (var5 != null) {
                                var5.i((byte) -89);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var2++;
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_c.a(false);
                      var2 = 0;
                      break L3;
                    }
                    if (param0 != -89) {
                      return;
                    } else {
                      L6: while (true) {
                        L7: {
                          L8: {
                            L9: {
                              if ((var2 ^ -1) <= (this.field_q.length ^ -1)) {
                                break L9;
                              } else {
                                this.field_q[var2] = this.f((byte) -81, var2);
                                var2++;
                                if (var4 != 0) {
                                  break L8;
                                } else {
                                  if (var4 == 0) {
                                    continue L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (0 == this.field_K) {
                              this.field_i = new cfa((ff) (this));
                              this.field_i.b(param0 + 28713);
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                          this.field_E = 0;
                          break L7;
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
          L10: while (true) {
            L11: {
              L12: {
                if (var2 >= this.field_G.length) {
                  break L12;
                } else {
                  var22 = this.field_G[var2].a(-88);
                  if (var4 != 0) {
                    break L11;
                  } else {
                    L13: {
                      if (var22 != null) {
                        var22.i((byte) -89);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var2++;
                    if (var4 == 0) {
                      continue L10;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              this.field_c.a(false);
              var2 = 0;
              break L11;
            }
            if (param0 != -89) {
              return;
            } else {
              L14: while (true) {
                L15: {
                  L16: {
                    if ((var2 ^ -1) <= (this.field_q.length ^ -1)) {
                      if (0 == this.field_K) {
                        this.field_i = new cfa((ff) (this));
                        this.field_i.b(param0 + 28713);
                        break L16;
                      } else {
                        break L15;
                      }
                    } else {
                      this.field_q[var2] = this.f((byte) -81, var2);
                      var2++;
                      if (var4 != 0) {
                        break L16;
                      } else {
                        if (var4 == 0) {
                          continue L14;
                        } else {
                          L17: {
                            if (0 == this.field_K) {
                              this.field_i = new cfa((ff) (this));
                              this.field_i.b(param0 + 28713);
                              this.field_E = 0;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  this.field_E = 0;
                  break L15;
                }
                return;
              }
            }
          }
        }
    }

    final int e(int param0) {
        if (param0 != 2) {
            return 69;
        }
        return this.field_o;
    }

    final boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 57) {
          L0: {
            if ((this.field_K ^ -1) == -1) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (this.field_K != 2) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    ff(String[] param0, int param1, int param2, int param3, int param4, int param5, int param6, BitSet[] param7, boolean[] param8, mt param9, ou param10) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        this.field_s = true;
        this.field_z = -1;
        this.field_E = -1;
        try {
          L0: {
            L1: {
              L2: {
                this.field_L = param4;
                this.field_d = param9;
                this.field_l = param0;
                this.field_K = param5;
                if (param10 == null) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if ((this.field_K ^ -1) != -1) {
                        break L4;
                      } else {
                        var12_int = this.field_l.length * (-1 + param4) - -1;
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var12_int = 1;
                    break L3;
                  }
                  this.field_u = new wea[var12_int];
                  var13 = 0;
                  L5: while (true) {
                    if ((var13 ^ -1) <= (var12_int ^ -1)) {
                      break L2;
                    } else {
                      this.field_u[var13] = param10.a((byte) 58);
                      var13++;
                      if (var14 != 0) {
                        break L1;
                      } else {
                        if (var14 == 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              this.field_J = new String[this.field_l.length];
              break L1;
            }
            var12_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (var12_int >= this.field_l.length) {
                    break L8;
                  } else {
                    this.field_J[var12_int] = "<col=" + jm.field_k[var12_int] + ">" + this.field_l[var12_int] + "</col>";
                    var12_int++;
                    if (var14 != 0) {
                      break L7;
                    } else {
                      if (var14 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                this.field_k = param0.length;
                this.field_a = param3;
                this.field_O = param2;
                this.field_n = param8;
                this.field_f = param1;
                this.field_x = param7;
                this.field_C = this.field_f;
                this.field_P = this.field_k;
                this.field_v = new int[this.field_P];
                this.field_H = new hca[this.field_P];
                this.field_y = new wd[this.field_P];
                break L7;
              }
              var12_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (this.field_H.length <= var12_int) {
                      break L11;
                    } else {
                      this.field_H[var12_int] = new hca(var12_int);
                      this.field_y[var12_int] = new wd(this.field_H[var12_int]);
                      var12_int++;
                      if (var14 != 0) {
                        break L10;
                      } else {
                        if (var14 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  var12_int = this.field_K;
                  break L10;
                }
                L12: {
                  L13: {
                    L14: {
                      L15: {
                        if (var12_int != 0) {
                          break L15;
                        } else {
                          if (var14 == 0) {
                            this.field_r = -1;
                            if (var14 == 0) {
                              break L12;
                            } else {
                              break L14;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (var12_int != 1) {
                          break L16;
                        } else {
                          if (var14 == 0) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (3 == var12_int) {
                        break L13;
                      } else {
                        if (2 == var12_int) {
                          this.field_r = -1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_r = param6;
                    if (var14 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                  this.field_r = pl.a((byte) 64);
                  if (var14 == 0) {
                    break L12;
                  } else {
                    this.field_r = -1;
                    break L12;
                  }
                }
                L17: {
                  this.field_G = new dt[this.field_k];
                  this.field_q = new boolean[this.field_H.length];
                  this.field_o = -1;
                  this.field_c = new kqa((ff) (this));
                  this.field_e = new sma((ff) (this));
                  if (this.field_K != 0) {
                    break L17;
                  } else {
                    this.field_i = new cfa((ff) (this));
                    this.field_i.b(28624);
                    this.field_E = 0;
                    break L17;
                  }
                }
                this.field_D = new ds(this.field_k);
                this.field_g = new int[this.field_k];
                this.field_F = new long[this.field_k];
                this.field_I = new boolean[this.field_k];
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var12 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var12);
            stackOut_37_1 = new StringBuilder().append("ff.<init>(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L18;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L18;
            }
          }
          L19: {
            stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param7 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L19;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L19;
            }
          }
          L20: {
            stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param8 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L20;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L20;
            }
          }
          L21: {
            stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param9 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L21;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L21;
            }
          }
          L22: {
            stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param10 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L22;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L22;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
    }

    static {
        field_N = "Options";
        field_w = 256;
    }
}
