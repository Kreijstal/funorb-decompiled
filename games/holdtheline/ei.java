/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static byte[][][] field_c;
    static String[] field_f;
    int field_e;
    private int field_d;
    static go[] field_a;
    Object[] field_b;

    public static void b(boolean param0) {
        field_c = null;
        field_f = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static hj[] a(int param0) {
        hj[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = HoldTheLine.field_D;
        if (param0 >= 51) {
          var1 = new hj[vn.field_d];
          var2 = 0;
          L0: while (true) {
            if (vn.field_d <= var2) {
              tk.a(false);
              return var1;
            } else {
              var3 = nk.field_K[var2] * ad.field_d[var2];
              var24 = lk.field_e[var2];
              if (!qe.field_f[var2]) {
                var10 = new int[var3];
                var26 = var10;
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var3) {
                    var1[var2] = new hj(bo.field_b, ih.field_o, la.field_j[var2], wb.field_g[var2], nk.field_K[var2], ad.field_d[var2], var26);
                    var2++;
                    continue L0;
                  } else {
                    var10[var6] = dd.field_E[pk.a((int) var24[var6], 255)];
                    var6++;
                    continue L1;
                  }
                }
              } else {
                var23 = wc.field_i[var2];
                var19 = var23;
                var15 = var19;
                var11 = var15;
                var9 = var11;
                var5 = var9;
                var25 = new int[var3];
                var21 = var25;
                var17 = var21;
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var3) {
                    var1[var2] = (hj) (Object) new uc(bo.field_b, ih.field_o, la.field_j[var2], wb.field_g[var2], nk.field_K[var2], ad.field_d[var2], var25);
                    var2++;
                    continue L0;
                  } else {
                    var6_ref_int__[var7] = kc.a(pk.a(-16777216, var23[var7] << -549001128), dd.field_E[pk.a((int) var24[var7], 255)]);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(Object param0, byte param1) {
        if (((ei) this).field_e == ((ei) this).field_d) {
            this.a((byte) 14);
        }
        if (param1 != 6) {
            Object var4 = null;
            ei.a(((int[]) ((ei) this).field_b[5])[6], -83, (String) null, 82, -33, (ql) null);
        }
        ((ei) this).field_e = ((ei) this).field_e + 1;
        ((ei) this).field_b[((ei) this).field_e] = param0;
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, ql param5) {
        param5.b(param2, 1 + param0, param4 + param1, 8, -1, 114);
        param5.a(param2, param0, param4, param3, -1);
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = HoldTheLine.field_D;
        var5 = param2 + param1;
        if (param4 == 19) {
          L0: {
            var6 = param0 + param3;
            if (param2 <= tc.field_d) {
              stackOut_4_0 = tc.field_d;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param2;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (param3 > tc.field_a) {
              stackOut_7_0 = param3;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = tc.field_a;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (var5 >= tc.field_e) {
              stackOut_10_0 = tc.field_e;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = var5;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (var6 < tc.field_i) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = tc.field_i;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_14_0;
            if (param2 < tc.field_d) {
              break L4;
            } else {
              if (param2 < tc.field_e) {
                var11 = param2 + tc.field_j * var8;
                var12 = -var8 + (1 + var10) >> 1530335297;
                L5: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L4;
                  } else {
                    tc.field_b[var11] = 16777215;
                    var11 = var11 + 2 * tc.field_j;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L6: {
            if (tc.field_a > param3) {
              break L6;
            } else {
              if (var6 < tc.field_i) {
                var11 = tc.field_j * param3 - -var7;
                var12 = -var7 + (var9 + 1) >> 677518465;
                L7: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L6;
                  } else {
                    tc.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (var5 < tc.field_d) {
              break L8;
            } else {
              if (tc.field_e > var5) {
                var11 = var5 + tc.field_j * (var8 - -(1 & var5 + -param2));
                var12 = -var8 + var10 + 1 >> 1808314945;
                L9: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L8;
                  } else {
                    tc.field_b[var11] = 16777215;
                    var11 = var11 + tc.field_j * 2;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L10: {
            if (tc.field_a > param3) {
              break L10;
            } else {
              if (tc.field_i <= var6) {
                break L10;
              } else {
                var11 = var7 + (tc.field_j * var6 + (var6 - param3 & 1));
                var12 = 1 - (-var9 + var7) >> -1479562239;
                L11: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L10;
                  } else {
                    tc.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0) {
            ((boolean[]) ((ei) this).field_b[23])[18] = false;
        }
        for (var2 = 1; var2 < ((ei) this).field_e; var2++) {
            this.a((byte) -108, (hd) ((ei) this).field_b[var2], var2);
        }
    }

    final void a(boolean param0, int param1) {
        int var4 = HoldTheLine.field_D;
        ((ei) this).field_e = ((ei) this).field_e - 1;
        int var3 = param1;
        if (!param0) {
            return;
        }
        while (((ei) this).field_e > var3) {
            ((ei) this).field_b[var3] = ((ei) this).field_b[var3 - -1];
            var3++;
        }
    }

    private final void a(byte param0, hd param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if (param0 != -108) {
            ((ei) this).field_b = null;
        }
        for (var4 = param2 + -1; 0 <= var4; var4--) {
            if (-1 < (((hd) ((ei) this).field_b[var4]).a((byte) -101, param1) ^ -1)) {
                ((ei) this).field_b[1 + var4] = (Object) (Object) param1;
                return;
            }
            ((ei) this).field_b[1 + var4] = ((ei) this).field_b[var4];
        }
        ((ei) this).field_b[0] = (Object) (Object) param1;
    }

    public ei() {
        ((ei) this).field_e = 0;
        ((ei) this).field_b = new Object[10];
        ((ei) this).field_d = 10;
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        ((ei) this).field_d = ((ei) this).field_d + 10;
        Object[] var5 = new Object[((ei) this).field_d];
        Object[] var2 = var5;
        for (var3 = 0; var3 < ((ei) this).field_e; var3++) {
            var5[var3] = ((ei) this).field_b[var3];
        }
        if (param0 < 7) {
            ((long[]) ((Object[]) ((ei) this).field_b[12])[6])[0] = -121L;
        }
        ((ei) this).field_b = var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
