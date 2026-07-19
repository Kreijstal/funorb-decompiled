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
        field_c = (byte[][][]) null;
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
        byte[] var21 = null;
        int[] var22 = null;
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
              var21 = lk.field_e[var2];
              if (!qe.field_f[var2]) {
                var10 = new int[var3];
                var22 = var10;
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var3) {
                    var1[var2] = new hj(bo.field_b, ih.field_o, la.field_j[var2], wb.field_g[var2], nk.field_K[var2], ad.field_d[var2], var22);
                    var2++;
                    continue L0;
                  } else {
                    var10[var6] = dd.field_E[pk.a((int) var21[var6], 255)];
                    var6++;
                    continue L1;
                  }
                }
              } else {
                var15 = wc.field_i[var2];
                var11 = var15;
                var9 = var11;
                var5 = var9;
                var17 = new int[var3];
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var3) {
                    var1[var2] = (hj) ((Object) new uc(bo.field_b, ih.field_o, la.field_j[var2], wb.field_g[var2], nk.field_K[var2], ad.field_d[var2], var17));
                    var2++;
                    continue L0;
                  } else {
                    var6_ref_int__[var7] = kc.a(pk.a(-16777216, var15[var7] << -549001128), dd.field_E[pk.a((int) var21[var7], 255)]);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return (hj[]) null;
        }
    }

    final void a(Object param0, byte param1) {
        int fieldTemp$0 = 0;
        try {
            if (this.field_e == this.field_d) {
                this.a((byte) 14);
            }
            if (param1 != 6) {
                ql var4 = (ql) null;
                ei.a(((int[]) (this.field_b[5]))[6], -83, (String) null, 82, -33, (ql) null);
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_b[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ei.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, ql param5) {
        try {
            param5.b(param2, 1 + param0, param4 + param1, 8, -1, 114);
            param5.a(param2, param0, param4, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ei.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
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
        int decompiledRegionSelector0 = 0;
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
            if (param4 == 19) {
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
                    var12 = -var8 + (1 + var10) >> 1530335297;
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
                    var12 = -var7 + (var9 + 1) >> 677518465;
                    L8: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
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
                    var12 = -var8 + var10 + 1 >> 1808314945;
                    L10: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
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
                    var12 = 1 - (-var9 + var7) >> -1479562239;
                    L12: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5), "ei.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0) {
            ((boolean[]) (this.field_b[23]))[18] = false;
        }
        for (var2 = 1; var2 < this.field_e; var2++) {
            this.a((byte) -108, (hd) (this.field_b[var2]), var2);
        }
    }

    final void a(boolean param0, int param1) {
        int var4 = HoldTheLine.field_D;
        this.field_e = this.field_e - 1;
        int var3 = param1;
        if (!param0) {
            return;
        }
        while (this.field_e > var3) {
            this.field_b[var3] = this.field_b[var3 - -1];
            var3++;
        }
    }

    private final void a(byte param0, hd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -108) {
                break L1;
              } else {
                this.field_b = (Object[]) null;
                break L1;
              }
            }
            var4_int = param2 + -1;
            L2: while (true) {
              if (0 > var4_int) {
                this.field_b[0] = param1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-1 >= (((hd) (this.field_b[var4_int])).a((byte) -101, param1) ^ -1)) {
                  this.field_b[1 + var4_int] = this.field_b[var4_int];
                  var4_int--;
                  continue L2;
                } else {
                  this.field_b[1 + var4_int] = param1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ei.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public ei() {
        this.field_e = 0;
        this.field_b = new Object[10];
        this.field_d = 10;
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        this.field_d = this.field_d + 10;
        Object[] var5 = new Object[this.field_d];
        Object[] var2 = var5;
        for (var3 = 0; var3 < this.field_e; var3++) {
            var5[var3] = this.field_b[var3];
        }
        if (param0 < 7) {
            ((long[]) (((Object[]) (this.field_b[12]))[6]))[0] = -121L;
        }
        this.field_b = var2;
    }

    static {
        field_f = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
