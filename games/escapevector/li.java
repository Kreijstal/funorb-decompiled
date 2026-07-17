/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li {
    private int field_B;
    private int field_f;
    static int[] field_u;
    private int field_K;
    static ed field_r;
    private oe field_n;
    static String field_p;
    private int field_H;
    private cn field_C;
    static String field_O;
    private sa field_D;
    private int[] field_w;
    private int field_N;
    private int field_a;
    private int field_t;
    private int field_y;
    private int[] field_e;
    boolean field_L;
    private int field_g;
    private wd field_j;
    private int field_x;
    private boolean[] field_s;
    int field_v;
    private int field_J;
    private int field_m;
    int field_c;
    private int field_q;
    private int[] field_o;
    private int field_l;
    boolean field_d;
    private pe field_M;
    private int field_b;
    private int field_F;
    private boolean field_I;
    private int field_G;
    private int field_k;
    private pe field_z;
    private int field_i;
    private boolean field_E;
    private int field_h;
    private int field_A;

    private final void f(int param0, int param1, int param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        if (param0 <= 85) {
            return;
        }
        int var4 = ((li) this).field_n.field_Mb * ((li) this).field_v;
        int var5 = ((li) this).field_v * ((li) this).field_n.field_D;
        int var6 = (((li) this).field_f + -var4) / 2;
        int var7 = (-var5 + ((li) this).field_H) / 2;
        this.a(var6, (byte) 104, var5, var4, var7);
        var7 = var7 + param1;
        var6 = var6 + param2;
        for (var8 = 0; var8 < ((li) this).field_n.field_D; var8++) {
            for (var9 = 0; ((li) this).field_n.field_Mb > var9; var9++) {
                this.b(var9, (byte) 99, var7 - -(((li) this).field_v * var8), ((li) this).field_v * var9 + var6, var8);
            }
        }
    }

    private final boolean[] a(int[] param0, int param1, int param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        boolean[] stackIn_9_0 = null;
        boolean[] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_28_0 = null;
        boolean[] stackOut_8_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var18 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (null == ((li) this).field_s) {
                  ((li) this).field_s = new boolean[param1 * param2];
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0 != ((li) this).field_w) {
                ((li) this).field_s = this.a(0, ((li) this).field_s);
                var5_int = ((li) this).field_B / param1;
                var6 = ((li) this).field_N / param2;
                var7 = 0;
                L2: while (true) {
                  if (param2 <= var7) {
                    stackOut_28_0 = ((li) this).field_s;
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    var8 = var7 * var6;
                    var9 = param1 * var7;
                    var10 = 0;
                    L3: while (true) {
                      if (param1 <= var10) {
                        var7++;
                        continue L2;
                      } else {
                        var11 = var10 * var5_int;
                        var12 = 0;
                        L4: while (true) {
                          L5: {
                            if (var6 <= var12) {
                              break L5;
                            } else {
                              var13 = var8 - -var12;
                              if (((li) this).field_N > var13) {
                                var14 = param0[var13];
                                var15 = var10 + var9;
                                var16 = 0;
                                L6: while (true) {
                                  L7: {
                                    if (var5_int <= var16) {
                                      break L7;
                                    } else {
                                      var17 = var16 + var11;
                                      if (var17 < ((li) this).field_B) {
                                        int discarded$2 = -2;
                                        ((li) this).field_s[var15] = df.a(((li) this).field_s[var15], this.c(var14, var17));
                                        var16++;
                                        continue L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var12++;
                                  continue L4;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          var10++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                int discarded$3 = 0;
                stackOut_8_0 = this.g();
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("li.IA(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 44 + param2 + 44 + 109 + 41);
        }
        return stackIn_29_0;
    }

    final void a(sa param0, int param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        sa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              L1: {
                if (1 != param0.field_n) {
                  break L1;
                } else {
                  ((li) this).field_D = null;
                  break L1;
                }
              }
              if (((li) this).field_C.a(param1 ^ -4348)) {
                return;
              } else {
                if (param1 == 4236) {
                  var3 = ((li) this).field_C.a(false);
                  L2: while (true) {
                    if (var3 == null) {
                      break L0;
                    } else {
                      var4 = (sa) (Object) var3;
                      if (var4.field_j == param0.field_j) {
                        var4.c((byte) -60);
                        return;
                      } else {
                        var3 = ((li) this).field_C.b((byte) 70);
                        continue L2;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("li.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    private final ed a(int param0, int param1) {
        ih var3 = fh.field_g;
        int var4 = var3.field_r - -var3.field_x;
        int var5 = var4 / 2;
        int var6 = (-var5 + var4) / 2;
        ed var7 = new ed(var4, var4);
        var7.g();
        em.a(var6, var6, var5, var5, param0);
        md.field_D.a(110);
        return var7;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        this.f(98, param1, param2);
        this.a(false, param1, param2);
        int discarded$0 = 109;
        this.d(param1, param2);
        this.b(89, param1, param2);
        if (param3 != 4) {
            this.a(-104, 44, -51, -65, 36, -11, -3);
        }
        if (param0) {
            this.e(-124, param1, param2);
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = em.field_i[param3];
        int var6 = 16711680;
        int var7 = 16;
        int var8 = 65280;
        int var9 = 8;
        int var10 = 255;
        int var11 = 0;
        int var12 = this.a(var6, param0, 256, param2, var5, var7);
        int var13 = this.a(var8, param0, 256, param2, var5, var9);
        int var14 = this.a(var10, param0, 256, param2, var5, var11);
        int var15 = 0;
        var15 = var15 | var6 & var12 << var7;
        var15 = var15 | var13 << var9 & var8;
        var15 = var15 | var14 << var11 & var10;
        em.field_i[param3] = var15;
    }

    public static void a(int param0) {
        field_u = null;
        field_p = null;
        field_O = null;
        int var1 = 30 / ((param0 - -2) / 47);
        field_r = null;
    }

    private final void e() {
        int var2 = (((li) this).field_f - ((li) this).field_j.a(true)) / 2;
        int var3 = (((li) this).field_f - ((li) this).field_v * ((li) this).field_n.field_Mb) / 2;
        int var4 = ((li) this).field_n.field_Mb * ((li) this).field_v;
        int var5 = 8;
        int var6 = var5 + var3 + var4;
        int var7 = var6 - var2;
        ((li) this).field_j.a((byte) -93, var7);
    }

    final boolean b(byte param0) {
        if (param0 >= -101) {
            return true;
        }
        return ((li) this).field_I;
    }

    final void b(int param0, boolean param1, int param2, int param3) {
        if (!((li) this).field_I) {
            return;
        }
        if (!(!((li) this).field_L)) {
            em.b(0, 0, ((li) this).field_f, ((li) this).field_H);
        }
        this.a(param2, -32279, param0);
        if (!((li) this).field_E) {
            this.a(param1, param0, param2, param3 ^ 4);
            return;
        }
        int var5 = ((li) this).field_n.field_Mb * ((li) this).field_v;
        int discarded$0 = 56;
        int var6 = this.f();
        int var7 = var6 - var5;
        if (param3 > var6) {
            this.a(param1, param0, -var6 + param2, 4);
            this.a(param1, param0, param2 + -var7, 4);
        } else {
            this.a(param1, param0, var7 + param2, 4);
            this.a(param1, param0, var6 + param2, param3 + 4);
        }
    }

    private final tc[] a(cn param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        tc[] var4 = null;
        int var5 = 0;
        hg var6 = null;
        tc var7 = null;
        int var8 = 0;
        tc[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        tc[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.c((byte) 62);
            var4 = new tc[var3_int];
            var5 = 0;
            var6 = param0.a(false);
            L1: while (true) {
              if (var6 == null) {
                stackOut_4_0 = (tc[]) var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var7 = (tc) (Object) var6;
                int incrementValue$2 = var5;
                var5++;
                var4[incrementValue$2] = var7;
                var6 = param0.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("li.K(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 0 + 41);
        }
        return stackIn_5_0;
    }

    private final int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = (param5 & param4) >>> param0;
        int var9 = (param4 & param3) >>> param0;
        int var10 = -var8 + var9;
        if (!(param6 > 1)) {
            return var8;
        }
        int var11 = var8 + var10 * param1 / (-1 + param6);
        if (param2 <= 117) {
            this.f(-52, -118, -38);
        }
        return var11;
    }

    private final int d() {
        int var2 = 1;
        int var3 = ((li) this).field_a / ((li) this).field_n.field_Mb;
        int var4 = ((li) this).field_K / ((li) this).field_n.field_D;
        var2 = var3;
        if (!(var4 >= var3)) {
            var2 = var4;
        }
        return var2;
    }

    private final int[] a(int[] param0, int param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_6_0 = null;
        int[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_13_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              var4_int = ((li) this).field_v * param1;
              if (var4_int >= 0) {
                var5 = 0;
                var6 = var4_int;
                L1: while (true) {
                  if (var5 >= ((li) this).field_o.length) {
                    stackOut_13_0 = ((li) this).field_o;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    L2: {
                      if (((li) this).field_e.length > var6) {
                        ((li) this).field_o[var5] = ((li) this).field_e[var6];
                        break L2;
                      } else {
                        ((li) this).field_o[var5] = ((li) this).field_e[((li) this).field_e.length + -1];
                        break L2;
                      }
                    }
                    var5++;
                    var6++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (int[]) (Object) stackIn_6_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("li.W(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + 1 + 41);
        }
        return stackIn_14_0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.a(param4, (byte) -119, param5, param0);
        int var8 = this.a(param3, (byte) -119, param5, param0);
        int var9 = -param1 + 256;
        int var10 = param1;
        int var11 = var7 * var9 + var8 * var10 >> 8;
        return var11;
    }

    private final void a(int[] param0, int param1, int param2, int param3, boolean[] param4, int param5, byte param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var25 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (param3 > 256) {
                  break L1;
                } else {
                  L2: {
                    if (param6 < -62) {
                      break L2;
                    } else {
                      this.a(false);
                      break L2;
                    }
                  }
                  var10_int = param8 * ((li) this).field_f + param2;
                  if (var10_int < 0) {
                    return;
                  } else {
                    L3: {
                      if (param0 == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    var11 = stackIn_13_0;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= param7) {
                        break L0;
                      } else {
                        L5: {
                          var13 = var12 + param8;
                          if (((li) this).field_M.field_a > var13) {
                            break L5;
                          } else {
                            if (var13 >= ((li) this).field_z.field_a) {
                              break L5;
                            } else {
                              L6: {
                                var14 = param1 * var12;
                                var15 = var12 * ((li) this).field_f + var10_int;
                                var16 = param5;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  var16 = param0[var12];
                                  break L6;
                                }
                              }
                              L7: {
                                var17 = 0;
                                if (var11 != 0) {
                                  L8: {
                                    if (var13 % ((li) this).field_i != 0) {
                                      stackOut_23_0 = 0;
                                      stackIn_24_0 = stackOut_23_0;
                                      break L8;
                                    } else {
                                      stackOut_22_0 = 1;
                                      stackIn_24_0 = stackOut_22_0;
                                      break L8;
                                    }
                                  }
                                  var17 = stackIn_24_0;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var18 = 0;
                              L9: while (true) {
                                if (var18 >= param1) {
                                  break L5;
                                } else {
                                  L10: {
                                    var19 = param2 - -var18;
                                    if (((li) this).field_M.field_b > var19) {
                                      break L10;
                                    } else {
                                      if (var19 >= ((li) this).field_z.field_b) {
                                        break L10;
                                      } else {
                                        var20 = var15 + var18;
                                        if (var20 < 0) {
                                          break L10;
                                        } else {
                                          if (em.field_i.length <= var20) {
                                            break L10;
                                          } else {
                                            L11: {
                                              var21 = var14 + var18;
                                              var22 = 1;
                                              if (param4 == null) {
                                                break L11;
                                              } else {
                                                var22 = param4[var21] ? 1 : 0;
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              var23 = param5;
                                              if (var22 != 0) {
                                                var23 = var16;
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              var24 = 0;
                                              if (var11 == 0) {
                                                break L13;
                                              } else {
                                                if (var17 != 0) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (0 != var19 % ((li) this).field_h) {
                                                      stackOut_40_0 = 0;
                                                      stackIn_41_0 = stackOut_40_0;
                                                      break L14;
                                                    } else {
                                                      stackOut_39_0 = 1;
                                                      stackIn_41_0 = stackOut_39_0;
                                                      break L14;
                                                    }
                                                  }
                                                  var24 = stackIn_41_0;
                                                  break L13;
                                                }
                                              }
                                            }
                                            L15: {
                                              if (var22 == 0) {
                                                break L15;
                                              } else {
                                                L16: {
                                                  if (var24 != 0) {
                                                    break L16;
                                                  } else {
                                                    if (var17 == 0) {
                                                      break L15;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                var23 = ((li) this).field_A;
                                                break L15;
                                              }
                                            }
                                            if (param3 == 256) {
                                              em.field_i[var20] = var23;
                                              break L10;
                                            } else {
                                              this.a(param3, false, var23, var20);
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var18++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var10 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var10;
            stackOut_53_1 = new StringBuilder().append("li.T(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          L18: {
            stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param4 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L18;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L18;
            }
          }
          throw t.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (!(((li) this).field_d)) {
            return;
        }
        int var6 = param3 + param0;
        int var7 = param2 + param4;
        int var8 = 6;
        fk.a(var6 - -var8, ((li) this).field_F, 73, 0, ((li) this).field_g, -var8 + param4, param0 - var8, 0, var7 - -var8);
        ih var9 = fh.field_g;
        int var10 = var9.field_x + var9.field_r;
        int var11 = -var8 + (param4 - (var10 - -var9.field_x));
        int var12 = 15658734;
        String var13 = null == ((li) this).field_D ? sj.field_k : af.field_b;
        var9.c(var13, ((li) this).field_f / 2, var11, var12, -1);
        this.d(111);
    }

    private final void d(int param0) {
        if (!(((li) this).field_j != null)) {
            return;
        }
        int var3 = -13;
        int var2 = (((li) this).field_H - ((li) this).field_v * ((li) this).field_n.field_D) / 2;
        int var4 = ((li) this).field_v * ((li) this).field_n.field_D;
        int var5 = ((li) this).field_j.b((byte) -90);
        int var6 = (-var5 + var4) / 2 + var2;
        ((li) this).field_j.a(var6, 3);
    }

    private final boolean c(int param0, int param1) {
        return 0 != (1 << param1 & param0);
    }

    private final void b(int param0, int param1, int param2) {
        sa var7 = null;
        int var8 = EscapeVector.field_A;
        cn var4 = ((li) this).field_n.field_k;
        if (var4 == null) {
            return;
        }
        if (var4.a(-116)) {
            return;
        }
        int var5 = this.a((byte) -29, ((li) this).field_x);
        hg var6 = var4.a(false);
        while (var6 != null) {
            var7 = (sa) (Object) var6;
            if (var7.field_r) {
                this.a(param2, var7.field_k, ((li) this).field_l, var5, param1, var7.field_g, 4);
            }
            var6 = var4.b((byte) 70);
        }
    }

    private final void d(int param0, int param1) {
        sa var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        if (((li) this).field_C.a(-103)) {
            return;
        }
        hg var4 = ((li) this).field_C.a(false);
        while (var4 != null) {
            var5 = (sa) (Object) var4;
            var6 = this.a((byte) -29, ((li) this).field_m);
            this.a(param1, var5.field_k, ((li) this).field_G, var6, param0, var5.field_g, 4);
            var4 = ((li) this).field_C.b((byte) 70);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = (((li) this).field_f + -(((li) this).field_n.field_Mb * ((li) this).field_v)) / 2;
        int var9 = (((li) this).field_H + -(((li) this).field_v * ((li) this).field_n.field_D)) / 2;
        int var10 = param1 * ((li) this).field_v / ((li) this).field_B;
        int var11 = ((li) this).field_v * param5 / ((li) this).field_N;
        int var12 = var8 + var10;
        if (param6 != 4) {
            ((li) this).field_n = null;
        }
        int var13 = var11 + var9;
        int var14 = ((li) this).field_v * ((li) this).field_t;
        var14 = 20 < var14 ? 20 : var14;
        int var15 = var14;
        int var16 = var14;
        this.a((int[]) null, var15, var12 + param0, param3, (boolean[]) null, param2, (byte) -72, var16, var13 - -param4);
    }

    private final void c() {
        ih var2 = fh.field_g;
        int var3 = 16777215;
        int var4 = 16777215;
        ((li) this).field_j.a(var4, var2, var3, 125);
    }

    private final String[] b(cn param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        hg var6 = null;
        sj var7 = null;
        int var8 = 0;
        String[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.c((byte) 73);
            var4 = new String[var3_int];
            var5 = 0;
            var6 = param0.a(false);
            L1: while (true) {
              if (var6 == null) {
                stackOut_4_0 = (String[]) var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var7 = (sj) (Object) var6;
                int incrementValue$2 = var5;
                var5++;
                var4[incrementValue$2] = var7.field_g;
                var6 = param0.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("li.G(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 11125 + 41);
        }
        return stackIn_5_0;
    }

    private final void b() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        ((li) this).field_o = new int[((li) this).field_v];
        int var2 = ((li) this).field_n.field_D * ((li) this).field_v;
        ((li) this).field_e = new int[var2];
        for (var3 = 0; var3 < ((li) this).field_e.length; var3++) {
            var4 = this.a(16, var3, (byte) 122, ((li) this).field_k, 16711680, ((li) this).field_b, ((li) this).field_e.length);
            var5 = this.a(8, var3, (byte) 120, ((li) this).field_k, 65280, ((li) this).field_b, ((li) this).field_e.length);
            var6 = this.a(0, var3, (byte) 118, ((li) this).field_k, 255, ((li) this).field_b, ((li) this).field_e.length);
            var7 = 16770546 & var4 << 16;
            var7 = var7 | (-1442840321 & var5) << 8;
            var7 = var7 | 255 & var6;
            ((li) this).field_e[var3] = var7;
        }
    }

    final void a(byte param0) {
        ((li) this).b(0, true, 0, 0);
        if (param0 != -120) {
            li.a(80);
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = ((li) this).field_c;
        var3 = var3 % param1;
        param1 = param1 / 2;
        int var4 = param1 <= var3 ? 1 : 0;
        if (!(var4 == 0)) {
            var3 = var3 - param1;
        }
        if (var4 != 0) {
            return var3 * 255 / param1;
        }
        return -(255 * var3 / param1) + 255;
    }

    final void e(byte param0) {
        if (param0 != -101) {
            return;
        }
        ((li) this).field_I = !((li) this).field_I ? true : false;
    }

    private final boolean[] g() {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        for (var2 = 0; ((li) this).field_s.length > var2; var2++) {
            ((li) this).field_s[var2] = true;
        }
        return ((li) this).field_s;
    }

    private final void c(int param0) {
        Vector var2 = null;
        int var3 = 0;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (((li) this).field_n == null) {
          return;
        } else {
          var2 = ((li) this).field_n.field_kb;
          var3 = var2.size();
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              return;
            } else {
              var5 = (sa) var2.elementAt(var4);
              if (var5 != null) {
                L1: {
                  var6 = var5.field_n;
                  if (mf.a(var6, -64)) {
                    break L1;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      if (var6 == -6) {
                        break L1;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                }
                if (-2 != var6) {
                  ((li) this).field_C.a(-12328, (hg) (Object) var5);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    private final int f() {
        int var2 = ((li) this).field_n.field_Mb * ((li) this).field_v;
        int var3 = var2 / 2;
        int var4 = ((li) this).field_n.field_t >> 16;
        var4 = ((li) this).field_v * var4 / ((li) this).field_B;
        int var5 = 1 + var3 + -var4;
        return var5;
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = ((li) this).field_n.field_H >> 16;
        int var5 = ((li) this).field_n.field_p >> 16;
        this.a(param2, var4, ((li) this).field_y, 256, param1, var5, 4);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = ((li) this).field_n.field_Mb * ((li) this).field_v;
        int var5 = ((li) this).field_n.field_D * ((li) this).field_v;
        int var6 = (((li) this).field_f - var4) / 2 - -param0;
        int var7 = var4 + var6;
        int var8 = (((li) this).field_H - var5) / 2 - -param2;
        int var9 = var8 - -var5;
        ((li) this).field_M.field_a = var8;
        ((li) this).field_M.field_b = var6;
        ((li) this).field_z.field_b = var7;
        ((li) this).field_z.field_a = var9;
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        return (param3 & param0) >> param2;
    }

    private final boolean[] a(int param0, boolean[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        boolean[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1.length <= var3_int) {
                stackOut_4_0 = (boolean[]) param1;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param1[var3_int] = false;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("li.Q(").append(0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        if (null == ((li) this).field_D) {
            return;
        }
        if (((li) this).field_n.field_ec) {
            return;
        }
        int var4 = this.a((byte) -29, ((li) this).field_J);
        this.a(param2, ((li) this).field_D.field_k, ((li) this).field_q, var4, param1, ((li) this).field_D.field_g, 4);
    }

    private final void a(boolean param0) {
        String var2 = null;
        cn var3 = null;
        cn var4 = null;
        cn var5 = null;
        var2 = sf.field_n;
        var3 = new cn();
        var4 = new cn();
        var3.a(-12328, (hg) (Object) new sj(qj.field_d));
        if (param0) {
          L0: {
            var4.a(-12328, (hg) (Object) new tc(new ed[1], 0));
            if (null != ((li) this).field_D) {
              var3.a(-12328, (hg) (Object) new sj(gk.field_b));
              var4.a(-12328, (hg) (Object) new tc(new ed[1], 0));
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = ((li) this).field_n.field_k;
            if (var5 == null) {
              break L1;
            } else {
              if (var5.a(-103)) {
                break L1;
              } else {
                var3.a(-12328, (hg) (Object) new sj(wd.field_q));
                var4.a(-12328, (hg) (Object) new tc(new ed[1], 0));
                break L1;
              }
            }
          }
          L2: {
            if (((li) this).field_C == null) {
              break L2;
            } else {
              if (((li) this).field_C.a(-111)) {
                break L2;
              } else {
                var3.a(-12328, (hg) (Object) new sj(vb.field_a));
                var4.a(-12328, (hg) (Object) new tc(new ed[1], 0));
                break L2;
              }
            }
          }
          int discarded$4 = 0;
          int discarded$5 = 11125;
          ((li) this).field_j = new wd(var2, this.a(var4), this.b(var3));
          int discarded$6 = -112;
          this.c();
          int discarded$7 = 126;
          this.e();
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, byte param1, int param2, int param3, int param4) {
        int[] var8 = null;
        int[] var9 = null;
        boolean[] var10 = null;
        int[][] var11 = ((li) this).field_n.field_V;
        int[][] var6 = var11;
        int var7 = param4 * ((li) this).field_n.field_Mb - -param0;
        if (!(var11 != null)) {
            return;
        }
        if (var7 >= 0) {
            if (var11.length <= var7) {
                return;
            }
            var8 = var11[var7];
            int discarded$0 = 1;
            var9 = this.a(var8, param4);
            int discarded$1 = 109;
            var10 = this.a(var8, ((li) this).field_v, ((li) this).field_v);
            this.a(var9, ((li) this).field_v, param3, 256, var10, ((li) this).field_F, (byte) -99, ((li) this).field_v, param2);
            return;
        }
    }

    li(oe param0, sa param1, boolean param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((li) this).field_B = 32;
        ((li) this).field_w = si.field_v;
        ((li) this).field_f = 640;
        ((li) this).field_K = 349;
        ((li) this).field_H = 480;
        ((li) this).field_N = 32;
        ((li) this).field_a = 402;
        ((li) this).field_C = new cn();
        ((li) this).field_L = true;
        ((li) this).field_g = 4755528;
        ((li) this).field_y = 15658734;
        ((li) this).field_m = 100;
        ((li) this).field_c = 0;
        ((li) this).field_J = 100;
        ((li) this).field_t = 2;
        ((li) this).field_v = 1;
        ((li) this).field_d = true;
        ((li) this).field_I = false;
        ((li) this).field_q = 16711680;
        ((li) this).field_x = 100;
        ((li) this).field_l = 16711680;
        ((li) this).field_F = 1;
        ((li) this).field_k = 998158;
        ((li) this).field_G = 16776960;
        ((li) this).field_b = 3568436;
        ((li) this).field_M = new pe(0, 0);
        ((li) this).field_z = new pe(((li) this).field_f, ((li) this).field_H);
        ((li) this).field_i = 4;
        ((li) this).field_h = 4;
        ((li) this).field_A = 1138193;
        try {
          L0: {
            L1: {
              ((li) this).field_D = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((li) this).field_E = stackIn_4_1 != 0;
            ((li) this).field_n = param0;
            this.c(0);
            int discarded$2 = -105;
            ((li) this).field_v = this.d();
            int discarded$3 = 100;
            this.b();
            this.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("li.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_p = "Rock Buster";
        field_O = "Back";
    }
}
