/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends nm {
    int field_k;
    static jp[] field_l;
    static String field_j;
    int field_o;
    int field_p;
    int field_n;
    int field_m;
    int field_i;
    static jp[] field_q;

    final static og a(mh param0, mh param1, kn param2, int param3, mh param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        og[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        kn var13 = null;
        int var14 = 0;
        int var15 = 0;
        wd var16 = null;
        int var17 = 0;
        Object var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int[] var23 = null;
        char[] var24 = null;
        int[] var25 = null;
        char[] var26 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0;
        int stackOut_3_0;
        int stackOut_7_0;
        int stackOut_6_0;
        var17 = BrickABrac.field_J ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (param2.field_x != null) {
              stackOut_4_0 = param2.field_x.length;
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
            if (param2.field_v != null) {
              stackOut_7_0 = param2.field_v.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 + var6;
            var8 = new String[var7];
            if (param3 == 4) {
              break L2;
            } else {
              var18 = null;
              e.a((mf) null, 30);
              break L2;
            }
          }
          var26 = new char[var7];
          var24 = var26;
          var22 = var24;
          var20 = var22;
          var9 = var20;
          var25 = new int[var7];
          var23 = var25;
          var21 = var23;
          var19 = var21;
          var10 = var19;
          var11 = new og[var7];
          if (param2.field_x != null) {
            var12 = 0;
            L3: while (true) {
              if (param2.field_x.length > var12) {
                var13 = pj.field_c.a(param2.field_x[var12], (byte) 124);
                var8[var12] = var13.field_D;
                var9[var12] = param2.field_w[var12];
                var11[var12] = e.a(param0, param1, var13, 4, param4);
                var12++;
                continue L3;
              } else {
                L4: {
                  if (param2.field_v == null) {
                    break L4;
                  } else {
                    var12 = var5;
                    var13_int = 49;
                    var14 = 0;
                    L5: while (true) {
                      if (param2.field_v.length <= var14) {
                        break L4;
                      } else {
                        var15 = param2.field_v[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = ng.field_c;
                          var9[var14 + var12] = param2.field_u[var14];
                          var10[var12 + var14] = param2.field_v[var14];
                          var14++;
                          continue L5;
                        } else {
                          L6: {
                            var16 = nh.field_c.a(var15, true);
                            var8[var14 + var12] = var16.h(-3);
                            var9[var14 + var12] = param2.field_u[var14];
                            if (var9[var12 - -var14] <= 0) {
                              var13_int = (char)(var13_int + 1);
                              var9[var14 + var12] = (char)var13_int;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var10[var12 - -var14] = param2.field_v[var14];
                          var14++;
                          var14++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                return new og(0L, param4, param1, param0, var11, var25, var8, var26);
              }
            }
          } else {
            L7: {
              if (param2.field_v == null) {
                break L7;
              } else {
                var12 = var5;
                var13_int = 49;
                var14 = 0;
                L8: while (true) {
                  if (param2.field_v.length <= var14) {
                    break L7;
                  } else {
                    var15 = param2.field_v[var14];
                    if (var15 == -1) {
                      var8[var14 + var12] = ng.field_c;
                      var9[var14 + var12] = param2.field_u[var14];
                      var10[var12 + var14] = param2.field_v[var14];
                      var14++;
                      continue L8;
                    } else {
                      L9: {
                        var16 = nh.field_c.a(var15, true);
                        var8[var14 + var12] = var16.h(-3);
                        var9[var14 + var12] = param2.field_u[var14];
                        if (var9[var12 - -var14] <= 0) {
                          var13_int = (char)(var13_int + 1);
                          var9[var14 + var12] = (char)var13_int;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var10[var12 - -var14] = param2.field_v[var14];
                      var14++;
                      var14++;
                      continue L8;
                    }
                  }
                }
              }
            }
            return new og(0L, param4, param1, param0, var11, var25, var8, var26);
          }
        } else {
          return null;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = sa.a(param0, -4097);
        var4 = BrickABrac.c(2048, param0);
        var5 = sa.a(param2, param1 + -4097);
        var6 = BrickABrac.c(2048, param2);
        var7 = (int)((long)var3 * (long)var5 >> -1929878448);
        var8 = (int)((long)var6 * (long)var3 >> 1605052880);
        if (param1 != 0) {
          int[] discarded$1 = e.a(118, 72, 44);
          var9 = (int)((long)var5 * (long)var4 >> 1930303504);
          var10 = (int)((long)var4 * (long)var6 >> -171352944);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var9 = (int)((long)var5 * (long)var4 >> 1930303504);
          var10 = (int)((long)var4 * (long)var6 >> -171352944);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        int var1 = -115 % ((5 - param0) / 58);
        field_q = null;
    }

    final static void a(mf param0, int param1) {
        jp var2 = new jp(param0.a(104, "final_frame.jpg", ""), (java.awt.Component) (Object) kj.field_D);
        int var3 = var2.field_D;
        int var5 = -121 % ((-17 - param1) / 52);
        int var4 = var2.field_C;
        jf.d(-99);
        vq.field_I = new jp(var3, var4 * 3 / 4);
        vq.field_I.g();
        var2.d(0, 0);
        pi.field_t = new jp(var3, -vq.field_I.field_C + var4);
        pi.field_t.g();
        var2.d(0, -vq.field_I.field_C);
        pi.field_t.field_F = vq.field_I.field_C;
        sc.b(-104);
    }

    e(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((e) this).field_m = param4;
        ((e) this).field_o = param0;
        ((e) this).field_k = param2;
        ((e) this).field_p = param5;
        ((e) this).field_i = param1;
        ((e) this).field_n = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Friends";
    }
}
