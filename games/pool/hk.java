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
              if ((((hk) this).field_p ^ -1L) <= (((hk) this).field_m ^ -1L)) {
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
        int var5 = 0;
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = Pool.field_O;
        if (param2 != null) {
          L0: {
            if (null != param2.field_F) {
              stackOut_4_0 = param2.field_F.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null == param2.field_D) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param2.field_D.length;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 + var6;
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
              L3: while (true) {
                if (param2.field_F.length <= var12) {
                  break L2;
                } else {
                  var13_ref_sf = jp.field_N.a((byte) -55, param2.field_F[var12]);
                  var8[var12] = var13_ref_sf.field_G;
                  var9[var12] = param2.field_w[var12];
                  var11[var12] = hk.a(param0, param1, var13_ref_sf, param3, (byte) 125);
                  var12++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != param2.field_D) {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L5: while (true) {
                if (var14 >= param2.field_D.length) {
                  break L4;
                } else {
                  var15 = param2.field_D[var14];
                  if (0 != (var15 ^ -1)) {
                    L6: {
                      var16 = o.field_x.a(127, var15);
                      var8[var12 + var14] = var16.e(0);
                      var9[var12 + var14] = param2.field_A[var14];
                      if (var9[var14 + var12] > 0) {
                        break L6;
                      } else {
                        var13 = (char)(var13 + 1);
                        var9[var12 - -var14] = (char)var13;
                        break L6;
                      }
                    }
                    var10[var12 - -var14] = param2.field_D[var14];
                    var14++;
                    continue L5;
                  } else {
                    var8[var12 + var14] = w.field_m;
                    var9[var14 + var12] = param2.field_A[var14];
                    var10[var12 + var14] = param2.field_D[var14];
                    var14++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          L7: {
            if (param4 > 73) {
              break L7;
            } else {
              hk.c((byte) -82);
              break L7;
            }
          }
          return new qp(0L, param0, param3, param1, var11, var24, var8, var25);
        } else {
          return null;
        }
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
        if ((((hk) this).field_p ^ -1L) < (((hk) this).field_m ^ -1L)) {
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
        if (param0 != 1527590113) {
            return;
        }
        int var2 = ok.k((byte) 59);
        db.field_Vb.a((kp.field_d << -1641319199) + var1, ba.field_wb - qe.field_o, -6316, kk.field_z - kp.field_d, (qe.field_o << 1527590113) + var2);
        jj.h(-9395);
    }

    final static g a(di param0, byte param1, int param2) {
        byte[] var4 = param0.b(param2, -31413);
        byte[] var3 = var4;
        if (param1 < 85) {
            return null;
        }
        if (var4 == null) {
            return null;
        }
        return new g(var4);
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 < 44) {
            hk.c((byte) -91);
        }
        int var7 = -512;
        int var9 = 320;
        if (-1 < (param2 * var7 + param5 * var9 ^ -1)) {
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
            if (-1 < (var8 * param3 - -(param4 * var9) ^ -1)) {
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
                if (!((((hk) this).field_l ^ -1) <= -2)) {
                    ((hk) this).field_l = ((hk) this).field_l + 1;
                }
                ((hk) this).field_j = (((hk) this).field_j + 1) % 10;
            }
        }
        long var6 = 0L;
        if (param0) {
            boolean discarded$0 = hk.b(85);
        }
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
