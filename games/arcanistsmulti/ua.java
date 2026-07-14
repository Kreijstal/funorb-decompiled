/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends kl {
    static String field_H;
    static eg field_K;
    static boolean field_J;
    private int[] field_O;
    private int field_N;
    static int field_P;
    static String field_S;
    private int[] field_I;
    private int field_Q;
    int field_R;
    private int[] field_L;
    private int field_M;

    private final void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 0) {
            field_K = null;
        }
        int var4 = null != ((ua) this).field_O ? ((ua) this).field_O.length : 0;
        qm[] var5 = new qm[var4 * param2];
        if (null != ((ua) this).field_z) {
            if (0 < ((ua) this).field_z.length) {
                if (0 < var5.length) {
                    if (0 < param1) {
                        for (var6 = 0; var4 > var6; var6++) {
                            sf.a((Object[]) (Object) ((ua) this).field_z, var6 * param1, (Object[]) (Object) var5, var6 * param2, Math.min(param1, param2));
                        }
                    }
                }
            }
        }
        ((ua) this).field_z = var5;
    }

    final static void g(int param0) {
        pm.field_b = new sa(mf.field_d, be.field_l, wj.field_b, pg.field_c, (kc) (Object) ec.field_g, nj.field_d);
        if (param0 != -19741) {
            field_J = true;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 92) {
            return;
        }
        int var4 = null == ((ua) this).field_L ? 0 : ((ua) this).field_L.length;
        int[] var5 = new int[var4 * param2];
        if (((ua) this).field_I != null) {
            if (0 < ((ua) this).field_I.length) {
                if (0 < var5.length) {
                    if (!(-1 <= (param1 ^ -1))) {
                        sf.a(((ua) this).field_I, 0, var5, 0, var4 * Math.min(param1, param2));
                    }
                }
            }
        }
        ((ua) this).field_I = var5;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = null == ((ua) this).field_L ? 0 : ((ua) this).field_L.length;
        qm[] var5 = new qm[param0 * var4];
        if (((ua) this).field_z != null) {
            if (((ua) this).field_z.length > 0) {
                if ((var5.length ^ -1) < -1) {
                    if ((param1 ^ -1) < -1) {
                        sf.a((Object[]) (Object) ((ua) this).field_z, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        ((ua) this).field_z = var5;
        if (param2 != -8734) {
            Object var6 = null;
            this.a(29, (int[]) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 > -49) {
            return;
        }
        this.a(param0, param1, param2, param3, -79);
    }

    final void a(qm param0, int param1, int param2) {
        int var4 = ((ua) this).field_N % ((ua) this).field_L.length;
        if (param1 <= 115) {
            return;
        }
        int var5 = ((ua) this).field_N / ((ua) this).field_L.length;
        ((ua) this).field_I[((ua) this).field_N] = param2;
        ((ua) this).field_z[((ua) this).field_N] = param0;
        if (param0 != null) {
            this.a(var5, param0, 14881, var4);
        }
        ((ua) this).field_N = ((ua) this).field_N + 1;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qm var5 = null;
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = 0;
          var3 = 0;
          if (param0 >= 17) {
            break L0;
          } else {
            ua.f(-24);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (((ua) this).field_z.length <= var2) {
              break L2;
            } else {
              if (var3 >= ((ua) this).field_O.length) {
                break L2;
              } else {
                var4 = 0;
                L3: while (true) {
                  if (((ua) this).field_z.length > var2) {
                    if (var4 < ((ua) this).field_L.length) {
                      var2++;
                      var5 = ((ua) this).field_z[var2];
                      if (var5 != null) {
                        this.a(var3, var5, 14881, var4);
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var4 = null == ((ua) this).field_O ? 0 : ((ua) this).field_O.length;
        int[] var5 = new int[param0 * var4];
        if (param2 < 92) {
            return;
        }
        if (((ua) this).field_I != null) {
            if (((ua) this).field_I.length > 0) {
                if (var5.length > 0) {
                    if (!((param1 ^ -1) >= -1)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            sf.a(((ua) this).field_I, var6 * param1, var5, var6 * param0, Math.min(param1, param0));
                        }
                    }
                }
            }
        }
        ((ua) this).field_I = var5;
    }

    private final void a(int[] param0, int param1) {
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = ((ua) this).field_L == null ? 0 : ((ua) this).field_L.length;
        int var4 = param0.length;
        if (param1 != 9443) {
            return;
        }
        ((ua) this).field_L = param0;
        int[] var5 = param0;
        int var6 = 0;
        int var7 = 0;
        while (var6 < var5.length) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.a(0, var3, var4);
        this.c(var4, var3, 103);
    }

    private final void a(int param0, qm param1, int param2, int param3) {
        int var5 = 0;
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
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var20 = ArcanistsMulti.field_G ? 1 : 0;
          if (param2 == 14881) {
            break L0;
          } else {
            var21 = null;
            String discarded$1 = ua.a((CharSequence[]) null, 110);
            break L0;
          }
        }
        L1: {
          var5 = ((ua) this).field_L[((ua) this).field_L.length + -1];
          var6 = ((ua) this).field_O[((ua) this).field_O.length - 1];
          stackOut_2_0 = ((ua) this).field_v;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (param3 > 0) {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = ((ua) this).field_L[-1 + param3];
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = stackIn_3_0;
            stackOut_3_1 = 0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_5_0 * stackIn_5_1 / var5;
          if ((param0 ^ -1) >= -1) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = ((ua) this).field_O[-1 + param0];
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          L4: {
            var8 = stackIn_8_0 * ((ua) this).field_k / var6;
            var9 = ((ua) this).field_v * ((ua) this).field_L[param3] / var5;
            var10 = ((ua) this).field_O[param0] * ((ua) this).field_k / var6;
            var11 = ((ua) this).field_L.length * param0 + param3;
            var12 = 48 & ((ua) this).field_I[var11];
            var13 = 192 & ((ua) this).field_I[var11];
            var14 = param1.field_n;
            var15 = param1.field_j;
            var16 = param1.field_v;
            var17 = param1.field_k;
            if (var16 >= var9 - var7) {
              break L4;
            } else {
              if (-1 != (1 & ((ua) this).field_I[var11] ^ -1)) {
                var16 = var9 - var7;
                var14 = var7;
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (var9 - var7 >= var16) {
              break L5;
            } else {
              if ((4 & ((ua) this).field_I[var11]) != -1) {
                var16 = -var7 + var9;
                var14 = var7;
                break L3;
              } else {
                break L5;
              }
            }
          }
          if (-17 != var12) {
            if ((var12 ^ -1) != -33) {
              var14 = var7;
              break L3;
            } else {
              var14 = var9 + -var16;
              break L3;
            }
          } else {
            var14 = var7 + (var9 + -var16) >> 564793313;
            break L3;
          }
        }
        L6: {
          L7: {
            if (var17 >= var10 - var8) {
              break L7;
            } else {
              if (0 != (2 & ((ua) this).field_I[var11])) {
                var15 = var8;
                var17 = var10 + -var8;
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (var10 + -var8 >= var17) {
              break L8;
            } else {
              if ((8 & ((ua) this).field_I[var11]) == 0) {
                break L8;
              } else {
                var15 = var8;
                var17 = -var8 + var10;
                break L6;
              }
            }
          }
          if (64 != var13) {
            if (var13 != 128) {
              var15 = var8;
              break L6;
            } else {
              var15 = -var17 + var10;
              break L6;
            }
          } else {
            var15 = -var17 + var8 + var10 >> 110223969;
            break L6;
          }
        }
        var18 = ((ua) this).field_Q;
        var19 = ((ua) this).field_M;
        param1.a(-(var19 * 2) + var17, var19 + var15, var16 - var18 * 2, var18 + var14, -109);
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.a(param0, (byte) -122, param2, param3)) {
          return true;
        } else {
          var5 = param3;
          if (-99 == var5) {
            return ((ua) this).a(((ua) this).field_L.length, param0, (byte) 9);
          } else {
            if (99 != var5) {
              if (-97 == var5) {
                return ((ua) this).a(param0, -103);
              } else {
                if ((var5 ^ -1) != -98) {
                  if (param1 < -120) {
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return ((ua) this).a((byte) -128, param0);
                }
              }
            } else {
              return ((ua) this).a(29787, ((ua) this).field_L.length, param0);
            }
          }
        }
    }

    final static String a(CharSequence[] param0, int param1) {
        int var2 = 27 / ((-52 - param1) / 40);
        return vh.a(param0.length, 0, param0, true);
    }

    ua(int param0, int param1, int param2, int param3, pf param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        ((ua) this).field_R = 92;
        ((ua) this).field_N = 0;
        int[] var10 = new int[param5];
        int[] var8 = var10;
        sf.a(var10, 0, param5, 1);
        int[] var9 = new int[param6];
        sf.a(var9, 0, param6, 1);
        this.a(var10, 9443);
        this.a(0, var9);
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8 = 71 % ((-42 - param4) / 35);
        return this.a(param0, param1, param2, param3, 91, param5, param6);
    }

    private final void a(int param0, int[] param1) {
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = null == ((ua) this).field_O ? 0 : ((ua) this).field_O.length;
        int var4 = param1.length;
        ((ua) this).field_O = param1;
        int[] var5 = param1;
        int var6 = 0;
        int var7 = param0;
        while (var5.length > var6) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.b(var4, var3, param0 + -8734);
        this.a((byte) 119, var3, var4);
    }

    public static void f(int param0) {
        field_S = null;
        field_H = null;
        field_K = null;
        if (param0 != -1) {
            field_H = null;
        }
    }

    final void d(int param0, int param1, int param2) {
        ((ua) this).field_Q = param2;
        ((ua) this).field_M = param1;
        if (param0 != 0) {
            field_P = -123;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = false;
        field_H = "Names cannot start or end with space or underscore";
    }
}
