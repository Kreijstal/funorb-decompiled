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
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          var7 = wi.a((byte) -98, param1);
          if (null == bg.field_p) {
            bg.field_p = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              L3: {
                if (vh.field_N == null) {
                  break L3;
                } else {
                  if (vh.field_N.field_k.length >= var7) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              vh.field_N = new wq(var7);
              break L2;
            }
            L4: {
              L5: {
                vh.field_N.field_l = 0;
                vh.field_N.a(param5, -1, param4, param1);
                vh.field_N.f((byte) -74, var7);
                vh.field_N.a(18146, var15);
                if (null == bn.field_r) {
                  break L5;
                } else {
                  if ((bn.field_r.field_k.length ^ -1) <= -101) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              bn.field_r = new wq(100);
              break L4;
            }
            L6: {
              bn.field_r.field_l = 0;
              bn.field_r.a(21, 10);
              if (param2 > 115) {
                break L6;
              } else {
                int discarded$1 = tm.a(-128, (byte) -47);
                break L6;
              }
            }
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if (4 <= var11) {
                bn.field_r.b((byte) 122, param1);
                bn.field_r.a(param3, param6, 19775);
                param0.a(bn.field_r.field_k, -1, 0, bn.field_r.field_l);
                param0.a(vh.field_N.field_k, -1, 0, vh.field_N.field_l);
                return;
              } else {
                bn.field_r.a(var15[var11], (byte) -79);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = bg.field_p.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static void a(byte param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var6 = 0;
        pg var6_ref = null;
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
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (oa.field_Ub == 0) {
            break L0;
          } else {
            L1: {
              var2 = ue.a(false);
              var4 = oa.field_Ub;
              if (fk.field_b == 0.0) {
                break L1;
              } else {
                var4 = (int)((double)var4 + ji.field_e.nextGaussian() * fk.field_b);
                if (0 <= var4) {
                  break L1;
                } else {
                  var4 = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (0 >= k.field_h.field_l) {
                break L2;
              } else {
                var18 = new byte[k.field_h.field_l];
                var16 = var18;
                var14 = var16;
                var11 = var14;
                var8 = var11;
                var19 = var8;
                var6 = 0;
                L3: while (true) {
                  if (var18.length <= var6) {
                    var6_ref = new pg(var2 - -(long)var4, k.field_h.field_l, var19);
                    hg.field_a.a((nm) (Object) var6_ref, (byte) 3);
                    k.field_h.field_l = 0;
                    break L2;
                  } else {
                    var8[var6] = k.field_h.field_k[var6];
                    var6++;
                    continue L3;
                  }
                }
              }
            }
            var9 = (pg) (Object) hg.field_a.d(-62);
            var13 = var9;
            if (var13 == null) {
              break L0;
            } else {
              if ((var13.field_j ^ -1L) > (var2 ^ -1L)) {
                var13.b((byte) 111);
                var10 = 0;
                var6 = var10;
                L4: while (true) {
                  if (var10 >= var13.field_r) {
                    k.field_h.field_l = var13.field_r;
                    break L0;
                  } else {
                    k.field_h.field_k[var10] = var9.field_l[var10];
                    var10++;
                    continue L4;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L5: {
          if (param0 == 110) {
            break L5;
          } else {
            field_b = null;
            break L5;
          }
        }
        cr.a(param1, 10000);
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
            Object var3 = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            field_h = "Ninja skills!";
            field_e = "Waiting for graphics";
            field_f = new vl();
            field_d = "Strong: balls destroy bricks without bouncing.";
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
