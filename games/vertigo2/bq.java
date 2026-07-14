/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends ji {
    static cr field_B;
    private int field_y;
    static String field_A;
    static String[] field_G;
    static int field_E;
    private boolean field_z;
    static String field_C;
    static String field_H;
    static int[] field_D;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public bq() {
        super(1, false);
        ((bq) this).field_y = 4096;
        ((bq) this).field_z = true;
    }

    final static void a(aa param0, int param1) {
        ql.field_L.b((cr) (Object) param0, param1 ^ -120);
        if (param1 != -1) {
            bq.g(-18);
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_G = null;
        if (param0 <= 7) {
            field_G = null;
        }
        field_A = null;
        field_D = null;
        field_H = null;
        field_B = null;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
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
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var29 = null;
        int[][] var35 = null;
        int[][] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        L0: {
          var21 = Vertigo2.field_L ? 1 : 0;
          if (param0 == -3780) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: {
          var41 = ((bq) this).field_v.a(param1, -2);
          var35 = var41;
          var29 = var35;
          var23 = var29;
          var22 = var23;
          var3 = var22;
          if (!((bq) this).field_v.field_c) {
            break L1;
          } else {
            var42 = ((bq) this).a(0, -1, -1 + param1 & fk.field_x);
            var5 = ((bq) this).a(0, -1, param1);
            var43 = ((bq) this).a(0, -1, 1 + param1 & fk.field_x);
            var44 = var41[0];
            var45 = var41[1];
            var46 = var41[2];
            var10 = 0;
            L2: while (true) {
              if (var10 >= we.field_M) {
                break L1;
              } else {
                L3: {
                  var14 = (-var42[var10] + var43[var10]) * ((bq) this).field_y;
                  var15 = (var5[1 + var10 & rm.field_z] + -var5[var10 + -1 & rm.field_z]) * ((bq) this).field_y;
                  var16 = var15 >> 958383596;
                  var17 = var14 >> 1233262572;
                  var18 = var16 * var16 >> -752775700;
                  var19 = var17 * var17 >> 1199701964;
                  var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)));
                  if (-1 != (var20 ^ -1)) {
                    var11 = var15 / var20;
                    var12 = var14 / var20;
                    var13 = 16777216 / var20;
                    break L3;
                  } else {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (!((bq) this).field_z) {
                    break L4;
                  } else {
                    var13 = (var13 >> -2008517247) + 2048;
                    var11 = (var11 >> -141644575) + 2048;
                    var12 = 2048 + (var12 >> -972630783);
                    break L4;
                  }
                }
                var44[var10] = var11;
                var45[var10] = var12;
                var46[var10] = var13;
                var10++;
                continue L2;
              }
            }
          }
        }
        return var22;
    }

    final static void h(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        jp var4_ref_jp = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        jp var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = Vertigo2.field_L ? 1 : 0;
        tf.field_o = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = cg.field_b.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = tf.field_o[9] >> 1865500264;
              var4 = tf.field_o[10] >> -1110081560;
              var5 = tf.field_o[11] >> 1638730184;
              var6 = hm.field_F << -901694492;
              var7 = 0;
              var8 = nf.a((byte) -28, var6) >> -1588055800;
              var9 = fk.a((byte) -118, var6) >> 259698824;
              if (ed.field_n == -1) {
                break L1;
              } else {
                if (-1 != gb.field_d) {
                  var9 = -128;
                  var7 = -320 + ed.field_n;
                  var8 = 240 - gb.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
              var8 = (int)((double)var8 * var10);
              var9 = (int)((double)var9 * var10);
              var7 = (int)((double)var7 * var10);
              var12 = -var3 + var7;
              var13 = var8 - var4;
              var14 = -var5 + var9;
              if (param0 < -97) {
                break L2;
              } else {
                bq.g(19);
                break L2;
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var13 * var13 + var12 * var12));
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var14 = (int)((double)var14 * var10);
            var15 = 0;
            L3: while (true) {
              if (cg.field_b.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (var17_int >= cg.field_b.length) {
                    var23[var16] = -2147483648;
                    var17 = cg.field_b[var16];
                    c.a(var16, -3797);
                    var18 = 0;
                    L5: while (true) {
                      if ((var18 ^ -1) <= -4) {
                        ti.a(ba.field_g, (byte) -53, false, false, true, tf.field_o, var17);
                        pb.a(var12, var8, var13, var17, var7, var14, var9, 73);
                        var15++;
                        continue L3;
                      } else {
                        ba.field_g[var18] = ba.field_g[var18] + jg.field_j[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_jp = cg.field_b[var3];
            var4_ref_jp.a((byte) 117);
            c.a(var3, -3797);
            var5 = var4_ref_jp.field_D + var4_ref_jp.field_S >> -1956838559;
            var6 = var4_ref_jp.field_E + var4_ref_jp.field_t >> 1483501601;
            var7 = var4_ref_jp.field_B + var4_ref_jp.field_k >> -225308543;
            var8 = tf.field_o[9] >> 67895810;
            var9 = tf.field_o[10] >> 1118853442;
            var10_int = tf.field_o[11] >> 650033538;
            var11 = ba.field_g[4] * var9 + (var8 * ba.field_g[3] + ba.field_g[5] * var10_int) >> -1215364050;
            var12 = ba.field_g[8] * var10_int + ba.field_g[7] * var9 + var8 * ba.field_g[6] >> 351844046;
            var13 = ba.field_g[9] * var8 - (-(ba.field_g[10] * var9) - ba.field_g[11] * var10_int) >> -1401476946;
            var2[var3] = var13 * var7 + (var5 * var11 + var12 * var6) >> 611473168;
            var3++;
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          var4 = param1;
          if (var4 == 0) {
            ((bq) this).field_y = param2.a((byte) -11);
            break L0;
          } else {
            if (var4 != 1) {
              break L0;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if ((param2.h(-11) ^ -1) != -2) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((bq) this).field_z = stackIn_7_1 != 0;
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 110) {
            break L2;
          } else {
            field_C = null;
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"All scores", "My scores", "Best each"};
        field_E = 0;
        field_C = "This password contains repeated characters, and would be easy to guess";
        field_H = "Co-op";
        field_D = new int[128];
    }
}
