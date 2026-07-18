/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private static long[] field_c;
    static boolean[] field_b;
    static String field_h;
    static vl field_f;
    static int field_a;
    static String field_e;
    static String field_d;
    static int field_g;

    final static void a(wq param0, int param1, byte param2, java.math.BigInteger param3, int param4, byte[] param5, java.math.BigInteger param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = wi.a((byte) -98, param1);
              if (null == bg.field_p) {
                bg.field_p = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (vh.field_N == null) {
                      break L4;
                    } else {
                      if (vh.field_N.field_k.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  vh.field_N = new wq(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    vh.field_N.field_l = 0;
                    vh.field_N.a(param5, -1, param4, param1);
                    vh.field_N.f((byte) -74, var7_int);
                    vh.field_N.a(18146, var15);
                    if (null == bn.field_r) {
                      break L6;
                    } else {
                      if (bn.field_r.field_k.length >= 100) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  bn.field_r = new wq(100);
                  break L5;
                }
                L7: {
                  bn.field_r.field_l = 0;
                  bn.field_r.a(21, 10);
                  if (param2 > 115) {
                    break L7;
                  } else {
                    int discarded$1 = tm.a(-128, (byte) -47);
                    break L7;
                  }
                }
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (4 <= var11) {
                    bn.field_r.b((byte) 122, param1);
                    bn.field_r.a(param3, param6, 19775);
                    param0.a(bn.field_r.field_k, -1, 0, bn.field_r.field_l);
                    param0.a(vh.field_N.field_k, -1, 0, vh.field_N.field_l);
                    break L0;
                  } else {
                    bn.field_r.a(var15[var11], (byte) -79);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = bg.field_p.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("tm.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final static void a() {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        pg var6_ref_pg = null;
        int var7 = 0;
        byte[] var8 = null;
        pg var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        pg var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (oa.field_Ub == 0) {
                break L1;
              } else {
                L2: {
                  var2_long = ue.a(false);
                  var4 = oa.field_Ub;
                  if (fk.field_b == 0.0) {
                    break L2;
                  } else {
                    var4 = (int)((double)var4 + ji.field_e.nextGaussian() * fk.field_b);
                    if (0 <= var4) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= k.field_h.field_l) {
                    break L3;
                  } else {
                    var18 = new byte[k.field_h.field_l];
                    var16 = var18;
                    var14 = var16;
                    var11 = var14;
                    var8 = var11;
                    var19 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var18.length <= var6) {
                        var6_ref_pg = new pg(var2_long - -(long)var4, k.field_h.field_l, var19);
                        hg.field_a.a((nm) (Object) var6_ref_pg, (byte) 3);
                        k.field_h.field_l = 0;
                        break L3;
                      } else {
                        var8[var6] = k.field_h.field_k[var6];
                        var6++;
                        continue L4;
                      }
                    }
                  }
                }
                var9 = (pg) (Object) hg.field_a.d(-62);
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if (~var13.field_j > ~var2_long) {
                    var13.b((byte) 111);
                    var10 = 0;
                    var6 = var10;
                    L5: while (true) {
                      if (var10 >= var13.field_r) {
                        k.field_h.field_l = var13.field_r;
                        break L1;
                      } else {
                        k.field_h.field_k[var10] = var9.field_l[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            cr.a(0, 10000);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "tm.D(" + 110 + ',' + 0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            var2 = md.field_r;
        }
        if (param1 != 18) {
            Object var3 = null;
            tm.a((wq) null, 46, (byte) -64, (java.math.BigInteger) null, -75, (byte[]) null, (java.math.BigInteger) null);
        }
        if (param0 == 1) {
            var2 = md.field_v;
        }
        if (!(param0 != 2)) {
            var2 = to.field_a;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_h = "Ninja skills!";
            field_e = "Waiting for graphics";
            field_f = new vl();
            field_d = "Strong: balls destroy bricks without bouncing.";
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_c[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
