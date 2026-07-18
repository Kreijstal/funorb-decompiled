/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    short[] field_A;
    short[] field_J;
    byte field_G;
    int[] field_r;
    static nh[] field_n;
    short[] field_D;
    short[] field_E;
    int[] field_p;
    int[] field_c;
    int field_j;
    short field_q;
    short[] field_B;
    static sf field_Q;
    short[] field_v;
    short[] field_L;
    byte[] field_O;
    int[] field_x;
    int[] field_y;
    short[] field_M;
    short[] field_l;
    static String field_g;
    int field_I;
    short[] field_a;
    short[] field_w;
    static int[] field_t;
    short[] field_h;
    int[] field_u;
    short[] field_P;
    short[] field_R;
    short[] field_k;
    short[] field_e;
    short[] field_K;
    int field_C;
    short field_m;
    private boolean field_F;
    short field_H;
    int field_d;
    int field_N;
    int field_s;
    int[] field_o;
    short[] field_z;
    int[] field_b;
    int[] field_i;
    static String field_f;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var5 = param2; ((ja) this).field_q > var5; var5++) {
            ((ja) this).field_J[var5] = (short)(((ja) this).field_J[var5] + param0);
            ((ja) this).field_w[var5] = (short)(((ja) this).field_w[var5] + param3);
            ((ja) this).field_P[var5] = (short)(((ja) this).field_P[var5] + param1);
        }
        this.c(param2 ^ 17503);
    }

    final static void a(fg param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 32;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= sf.field_e) {
                    int dupTemp$4 = param0.a((byte) -99);
                    fm.field_e[dupTemp$4] = fm.field_e[dupTemp$4] + 1;
                    var3 = 0;
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= sf.field_e) {
                        sf.field_e = var3;
                        int fieldTemp$5 = sf.field_e;
                        sf.field_e = sf.field_e + 1;
                        mi.field_c[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param0.field_a != mi.field_c[var4].field_a) {
                              break L5;
                            } else {
                              var5 = mi.field_c[var4].a((byte) -79);
                              if (fm.field_e[var5] > ee.field_a) {
                                fm.field_e[var5] = fm.field_e[var5] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var3;
                          var3++;
                          mi.field_c[incrementValue$6] = mi.field_c[var4];
                          break L4;
                        }
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param0.field_a != mi.field_c[var3].field_a) {
                        break L6;
                      } else {
                        int dupTemp$7 = mi.field_c[var3].a((byte) -93);
                        fm.field_e[dupTemp$7] = fm.field_e[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                fm.field_e[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ja.F(");
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
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -60 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_Q = null;
        field_t = null;
        int var1 = -38;
        field_f = null;
        field_n = null;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = dg.a(-20870, param0);
        int var4 = u.a(param0, (byte) 74);
        int var5 = dg.a(-20870, param1);
        int var6 = u.a(param1, (byte) 74);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((ja) this).field_F) {
          ((ja) this).field_F = true;
          var2 = param0;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((ja) this).field_q) {
              ((ja) this).field_d = var3;
              ((ja) this).field_C = var7;
              ((ja) this).field_s = var2;
              ((ja) this).field_j = var4;
              ((ja) this).field_I = var5;
              ((ja) this).field_N = var6;
              return;
            } else {
              L1: {
                var9 = ((ja) this).field_J[var8];
                var10 = ((ja) this).field_w[var8];
                var11 = ((ja) this).field_P[var8];
                if (var3 <= var10) {
                  break L1;
                } else {
                  var3 = var10;
                  break L1;
                }
              }
              L2: {
                if (var5 < var9) {
                  var5 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 > var6) {
                  var6 = var10;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var2 > var9) {
                  var2 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var7 < var11) {
                  var7 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var6 = 0; var6 < ((ja) this).field_q; var6++) {
            ((ja) this).field_J[var6] = (short)(param2 * ((ja) this).field_J[var6] / param4);
            ((ja) this).field_w[var6] = (short)(((ja) this).field_w[var6] * param0 / param4);
            ((ja) this).field_P[var6] = (short)(((ja) this).field_P[var6] * param1 / param4);
        }
        if (param3 > -32) {
            ((ja) this).field_d = 30;
        }
        this.c(17503);
    }

    private final void c(int param0) {
        if (param0 != 17503) {
            ((ja) this).field_C = 87;
        }
        ((ja) this).field_F = false;
    }

    ja() {
        ((ja) this).field_F = false;
        ((ja) this).field_G = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "FULL ACCESS";
        field_f = "Continue";
    }
}
