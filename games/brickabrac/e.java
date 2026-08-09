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
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        og stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        og[] var11 = null;
        int var12 = 0;
        kn var13_ref_kn = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wd var16 = null;
        int var17 = 0;
        mf var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param2.field_x != null) {
                  stackIn_7_0 = param2.field_x.length;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (param2.field_v != null) {
                  stackIn_10_0 = param2.field_v.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int + var6;
                var8 = new String[var7];
                if (param3 == 4) {
                  break L3;
                } else {
                  var18 = (mf) null;
                  e.a((mf) null, 30);
                  break L3;
                }
              }
              L4: {
                var22 = new char[var7];
                var20 = var22;
                var9 = var20;
                var21 = new int[var7];
                var19 = var21;
                var10 = var19;
                var11 = new og[var7];
                if (param2.field_x == null) {
                  break L4;
                } else {
                  var12 = 0;
                  L5: while (true) {
                    if (param2.field_x.length <= var12) {
                      break L4;
                    } else {
                      var13_ref_kn = pj.field_c.a(param2.field_x[var12], (byte) 124);
                      var8[var12] = var13_ref_kn.field_D;
                      var9[var12] = param2.field_w[var12];
                      var11[var12] = e.a(param0, param1, var13_ref_kn, 4, param4);
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param2.field_v == null) {
                  break L6;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param2.field_v.length <= var14) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param2.field_v[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = ng.field_c;
                          var9[var14 + var12] = param2.field_u[var14];
                          var10[var12 + var14] = param2.field_v[var14];
                          break L8;
                        } else {
                          L9: {
                            var16 = nh.field_c.a(var15, true);
                            var8[var14 + var12] = var16.h(-3);
                            var9[var14 + var12] = param2.field_u[var14];
                            if (var9[var12 - -var14] <= 0) {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10[var12 - -var14] = param2.field_v[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                }
              }
              stackIn_28_0 = new og(0L, param4, param1, param0, var11, var21, var8, var22);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_32_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (og) ((Object) stackIn_3_0);
        } else {
          return stackIn_28_0;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var3 = sa.a(param0, -4097);
        var4 = BrickABrac.c(2048, param0);
        var5 = sa.a(param2, param1 + -4097);
        var6 = BrickABrac.c(2048, param2);
        var7 = (int)((long)var3 * (long)var5 >> -1929878448);
        var8 = (int)((long)var6 * (long)var3 >> 1605052880);
        if (param1 != 0) {
          e.a(118, 72, 44);
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
        jp var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new jp(param0.a(104, "final_frame.jpg", ""), (java.awt.Component) ((Object) kj.field_D));
            var3 = var2.field_D;
            int var5 = -121 % ((-17 - param1) / 52);
            var4 = var2.field_C;
            jf.d(-99);
            vq.field_I = new jp(var3, var4 * 3 / 4);
            vq.field_I.g();
            var2.d(0, 0);
            pi.field_t = new jp(var3, -vq.field_I.field_C + var4);
            pi.field_t.g();
            var2.d(0, -vq.field_I.field_C);
            pi.field_t.field_F = vq.field_I.field_C;
            sc.b(-104);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "e.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    e(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_m = param4;
        this.field_o = param0;
        this.field_k = param2;
        this.field_p = param5;
        this.field_i = param1;
        this.field_n = param3;
    }

    static {
        field_j = "Friends";
    }
}
