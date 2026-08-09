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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
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
            var13 = new int[4];
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
                    vh.field_N.a(18146, var13);
                    if (null == bn.field_r) {
                      break L6;
                    } else {
                      if ((bn.field_r.field_k.length ^ -1) <= -101) {
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
                    tm.a(-128, (byte) -47);
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
                    bn.field_r.a(var13[var11], (byte) -79);
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
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("tm.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param6 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
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
        byte[] var17 = null;
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
                    var14 = new byte[k.field_h.field_l];
                    var11 = var14;
                    var8 = var11;
                    var17 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var14.length <= var6) {
                        var6_ref_pg = new pg(var2_long - -(long)var4, k.field_h.field_l, var17);
                        hg.field_a.a(var6_ref_pg, (byte) 3);
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
                var9 = (pg) ((Object) hg.field_a.d(-62));
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if ((var13.field_j ^ -1L) > (var2_long ^ -1L)) {
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
            L6: {
              if (param0 == 110) {
                break L6;
              } else {
                field_b = (boolean[]) null;
                break L6;
              }
            }
            cr.a(param1, 10000);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "tm.D(" + param0 + ',' + param1 + ')');
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
        if (!(-1 != (param0 ^ -1))) {
            var2 = md.field_r;
        }
        if (param1 != 18) {
            java.math.BigInteger var3 = (java.math.BigInteger) null;
            tm.a((wq) null, 46, (byte) -64, (java.math.BigInteger) null, -75, (byte[]) null, (java.math.BigInteger) null);
        }
        if ((param0 ^ -1) == -2) {
            var2 = md.field_v;
        }
        if (!((param0 ^ -1) != -3)) {
            var2 = to.field_a;
        }
        return var2;
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_c = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                field_h = "Ninja skills!";
                field_e = "Waiting for graphics";
                field_f = new vl();
                field_d = "Strong: balls destroy bricks without bouncing.";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    field_c[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0) == 1L) {
                      var0 = -3932672073523589310L ^ var0 >>> 393436801;
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
}
