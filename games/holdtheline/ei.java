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

    public static void b() {
        field_c = null;
        field_f = null;
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
                  var6_ref_int__[var7] = kc.a(pk.a(-16777216, var23[var7] << 24), dd.field_E[pk.a((int) var24[var7], 255)]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(Object param0, byte param1) {
        try {
            if (((ei) this).field_e == ((ei) this).field_d) {
                int discarded$0 = 14;
                this.a();
            }
            if (param1 != 6) {
                Object var4 = null;
                ei.a(((int[]) ((ei) this).field_b[5])[6], -83, (String) null, 82, -33, (ql) null);
            }
            int fieldTemp$1 = ((ei) this).field_e;
            ((ei) this).field_e = ((ei) this).field_e + 1;
            ((ei) this).field_b[fieldTemp$1] = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ei.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, ql param5) {
        try {
            param5.b(param2, 1 + param0, param4 + param1, 8, -1, 114);
            param5.a(param2, param0, param4, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ei.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
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
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = param2 + param1;
            L1: {
              var6 = param0 + param3;
              if (param2 <= tc.field_d) {
                stackOut_5_0 = tc.field_d;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = param2;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_6_0;
              if (param3 > tc.field_a) {
                stackOut_8_0 = param3;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = tc.field_a;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_9_0;
              if (var5_int >= tc.field_e) {
                stackOut_11_0 = tc.field_e;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = var5_int;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_12_0;
              if (var6 < tc.field_i) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = tc.field_i;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_15_0;
              if (param2 < tc.field_d) {
                break L5;
              } else {
                if (param2 < tc.field_e) {
                  var11 = param2 + tc.field_j * var8;
                  var12 = -var8 + (1 + var10) >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      tc.field_b[var11] = 16777215;
                      var11 = var11 + 2 * tc.field_j;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (tc.field_a > param3) {
                break L7;
              } else {
                if (var6 < tc.field_i) {
                  var11 = tc.field_j * param3 - -var7;
                  var12 = -var7 + (var9 + 1) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      tc.field_b[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (var5_int < tc.field_d) {
                break L9;
              } else {
                if (tc.field_e > var5_int) {
                  var11 = var5_int + tc.field_j * (var8 - -(1 & var5_int + -param2));
                  var12 = -var8 + var10 + 1 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      tc.field_b[var11] = 16777215;
                      var11 = var11 + tc.field_j * 2;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (tc.field_a > param3) {
                break L11;
              } else {
                if (tc.field_i <= var6) {
                  break L11;
                } else {
                  var11 = var7 + (tc.field_j * var6 + (var6 - param3 & 1));
                  var12 = 1 - (-var9 + var7) >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      tc.field_b[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var5, "ei.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 19 + 41);
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param2 + -1;
            L1: while (true) {
              if (0 > var4_int) {
                ((ei) this).field_b[0] = (Object) (Object) param1;
                break L0;
              } else {
                if (((hd) ((ei) this).field_b[var4_int]).a((byte) -101, param1) >= 0) {
                  ((ei) this).field_b[1 + var4_int] = ((ei) this).field_b[var4_int];
                  var4_int--;
                  continue L1;
                } else {
                  ((ei) this).field_b[1 + var4_int] = (Object) (Object) param1;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ei.A(").append(-108).append(44);
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
    }

    public ei() {
        ((ei) this).field_e = 0;
        ((ei) this).field_b = new Object[10];
        ((ei) this).field_d = 10;
    }

    private final void a() {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        ((ei) this).field_d = ((ei) this).field_d + 10;
        Object[] var5 = new Object[((ei) this).field_d];
        Object[] var2 = var5;
        for (var3 = 0; var3 < ((ei) this).field_e; var3++) {
            var5[var3] = ((ei) this).field_b[var3];
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
