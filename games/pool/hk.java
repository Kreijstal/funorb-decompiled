/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends kb {
    private long field_k;
    static String field_u;
    private long[] field_o;
    static String[] field_n;
    private long field_m;
    private long field_p;
    static dd field_r;
    static String field_q;
    private int field_l;
    private int field_j;
    static vh field_t;
    static boolean field_s;

    final static boolean b(int param0) {
        int var1 = 10 % ((param0 - -65) / 42);
        return gk.field_kb;
    }

    final int b(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pool.field_O;
        var4 = 53 % ((param1 - 46) / 44);
        if (((hk) this).field_p <= ((hk) this).field_m) {
          var5 = 0;
          L0: while (true) {
            L1: {
              var5++;
              ((hk) this).field_p = ((hk) this).field_p + param0;
              if (var5 >= 10) {
                break L1;
              } else {
                if (((hk) this).field_m > ((hk) this).field_p) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (~((hk) this).field_p <= ~((hk) this).field_m) {
                break L2;
              } else {
                ((hk) this).field_p = ((hk) this).field_m;
                break L2;
              }
            }
            return var5;
          }
        } else {
          ((hk) this).field_k = ((hk) this).field_k + (-((hk) this).field_m + ((hk) this).field_p);
          ((hk) this).field_m = ((hk) this).field_m + (((hk) this).field_p + -((hk) this).field_m);
          ((hk) this).field_p = ((hk) this).field_p + param0;
          return 1;
        }
    }

    final static qp a(vh param0, vh param1, sf param2, vh param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        qp[] var11 = null;
        int var12 = 0;
        sf var13_ref_sf = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ap var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        qp stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        qp stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var17 = Pool.field_O;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (null != param2.field_F) {
                  stackOut_6_0 = param2.field_F.length;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null == param2.field_D) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = param2.field_D.length;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int + var6;
                var8 = new String[var7];
                var25 = new char[var7];
                var23 = var25;
                var21 = var23;
                var19 = var21;
                var9 = var19;
                var24 = new int[var7];
                var22 = var24;
                var20 = var22;
                var18 = var20;
                var10 = var18;
                var11 = new qp[var7];
                if (null != param2.field_F) {
                  var12 = 0;
                  L4: while (true) {
                    if (param2.field_F.length <= var12) {
                      break L3;
                    } else {
                      var13_ref_sf = jp.field_N.a((byte) -55, param2.field_F[var12]);
                      var8[var12] = var13_ref_sf.field_G;
                      var9[var12] = param2.field_w[var12];
                      var11[var12] = hk.a(param0, param1, var13_ref_sf, param3, (byte) 125);
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (null != param2.field_D) {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L6: while (true) {
                    if (var14 >= param2.field_D.length) {
                      break L5;
                    } else {
                      L7: {
                        var15 = param2.field_D[var14];
                        if (var15 != -1) {
                          L8: {
                            var16 = o.field_x.a(127, var15);
                            var8[var12 + var14] = var16.e(0);
                            var9[var12 + var14] = param2.field_A[var14];
                            if (var9[var14 + var12] > 0) {
                              break L8;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var12 - -var14] = (char)var13;
                              break L8;
                            }
                          }
                          var10[var12 - -var14] = param2.field_D[var14];
                          break L7;
                        } else {
                          var8[var12 + var14] = w.field_m;
                          var9[var14 + var12] = param2.field_A[var14];
                          var10[var12 + var14] = param2.field_D[var14];
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L9: {
                if (param4 > 73) {
                  break L9;
                } else {
                  hk.c((byte) -82);
                  break L9;
                }
              }
              stackOut_27_0 = new qp(0L, param0, param3, param1, var11, var24, var8, var25);
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("hk.K(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param3 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param4 + 41);
        }
        return stackIn_28_0;
    }

    final long a(int param0) {
        ((hk) this).field_m = ((hk) this).field_m + this.a(false);
        if (((hk) this).field_m < ((hk) this).field_p) {
            return (((hk) this).field_p - ((hk) this).field_m) / 1000000L;
        }
        if (param0 != 31) {
            java.applet.Applet discarded$0 = hk.d(-46);
        }
        return 0L;
    }

    public static void c(byte param0) {
        field_n = null;
        field_u = null;
        field_q = null;
        field_r = null;
        if (param0 != 122) {
            hk.c(-66);
        }
        field_t = null;
    }

    final void b(byte param0) {
        ((hk) this).field_k = 0L;
        if (~((hk) this).field_p < ~((hk) this).field_m) {
            ((hk) this).field_m = ((hk) this).field_m + (((hk) this).field_p - ((hk) this).field_m);
        }
        if (param0 != 26) {
            Object var3 = null;
            qp discarded$0 = hk.a((vh) null, (vh) null, (sf) null, (vh) null, (byte) 20);
        }
    }

    final static java.applet.Applet d(int param0) {
        if (param0 < 54) {
            return null;
        }
        if (oc.field_t != null) {
            return oc.field_t;
        }
        return (java.applet.Applet) (Object) ni.field_ib;
    }

    final static void c(int param0) {
        int var1 = ml.b(27);
    }

    final static g a(di param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        g stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        g stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4 = param0.b(param2, -31413);
            var3 = var4;
            if (param1 >= 85) {
              if (var4 != null) {
                stackOut_6_0 = new g(var4);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (g) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("hk.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 < 44) {
            hk.c((byte) -91);
        }
        int var7 = -512;
        int var9 = 320;
        if (param2 * var7 + param5 * var9 < 0) {
            if (var7 * param1 + param4 * var9 < 0) {
                return true;
            }
        }
        var7 = 512;
        var9 = 320;
        if (param5 * var9 + param2 * var7 > -1) {
            if (-1 > param4 * var9 + param1 * var7) {
                return true;
            }
        }
        int var8 = -512;
        var9 = 240;
        if (var8 * param6 - -(var9 * param5) < 0) {
            if (var8 * param3 - -(param4 * var9) < 0) {
                return true;
            }
        }
        var8 = 512;
        var9 = 240;
        if (param5 * var9 + var8 * param6 < 0) {
            if (0 > var9 * param4 + var8 * param3) {
                return true;
            }
        }
        return false;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Pool.field_O;
        long var2 = System.nanoTime();
        long var4 = -((hk) this).field_k + var2;
        ((hk) this).field_k = var2;
        if (-5000000000L < var4) {
            if (!(5000000000L <= var4)) {
                ((hk) this).field_o[((hk) this).field_j] = var4;
                if (!(((hk) this).field_l >= 1)) {
                    ((hk) this).field_l = ((hk) this).field_l + 1;
                }
                ((hk) this).field_j = (((hk) this).field_j + 1) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; ((hk) this).field_l >= var8; var8++) {
            var6 = var6 + ((hk) this).field_o[(10 + ((hk) this).field_j + -var8) % 10];
        }
        return var6 / (long)((hk) this).field_l;
    }

    hk() {
        ((hk) this).field_o = new long[10];
        ((hk) this).field_p = 0L;
        ((hk) this).field_l = 1;
        ((hk) this).field_j = 0;
        ((hk) this).field_k = 0L;
        ((hk) this).field_m = 0L;
        ((hk) this).field_m = System.nanoTime();
        ((hk) this).field_p = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Solicitation";
        field_q = "You now have <%0> lives";
        field_r = new dd(360, 240);
    }
}
