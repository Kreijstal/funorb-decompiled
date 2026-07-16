/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static boolean[] field_g;
    static int[] field_b;
    static String field_c;
    static String field_f;
    static je field_a;
    static hl field_d;
    static of field_h;
    static String field_e;

    final static void a(boolean param0, byte param1, oh[] param2, int param3, oh[] param4, int param5, int param6, jb param7, int param8, String param9, boolean param10, int param11, int param12, int param13, int param14) {
        bo.a(param3, param6, fl.field_b, param14, -1, param7, ng.field_D, param11, new ve(param2), nm.field_o, uj.field_w, param11, new ve(param4), param12, param7, param5, wa.field_d, param8, param8, bm.field_n);
        je.a(param0, param13, param9, param10, -1381732671);
        if (param1 != 33) {
            field_c = null;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static le a(int param0, hl param1, qa param2, hl param3, hl param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        le[] var12 = null;
        int var13 = 0;
        qa var14_ref_qa = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        j var17 = null;
        int var18 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var18 = TetraLink.field_J;
        if (param2 != null) {
          L0: {
            if (null == param2.field_z) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param2.field_z.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param2.field_t) {
              stackOut_7_0 = param2.field_t.length;
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
            var7 = var6 + var5;
            var8 = new String[var7];
            var11 = 38 % ((-64 - param0) / 50);
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
            var12 = new le[var7];
            if (null != param2.field_z) {
              var13 = 0;
              L3: while (true) {
                if (var13 >= param2.field_z.length) {
                  break L2;
                } else {
                  var14_ref_qa = n.field_U.a(param2.field_z[var13], true);
                  var8[var13] = var14_ref_qa.field_y;
                  var9[var13] = param2.field_D[var13];
                  var12[var13] = gm.a(-128, param1, var14_ref_qa, param3, param4);
                  var13++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != param2.field_t) {
              var13 = var5;
              var14 = 49;
              var15 = 0;
              L5: while (true) {
                if (var15 >= param2.field_t.length) {
                  break L4;
                } else {
                  var16 = param2.field_t[var15];
                  if ((var16 ^ -1) == 0) {
                    var8[var13 - -var15] = vb.field_m;
                    var9[var15 + var13] = param2.field_u[var15];
                    var10[var13 - -var15] = param2.field_t[var15];
                    var15++;
                    continue L5;
                  } else {
                    L6: {
                      var17 = eh.field_p.a(var16, -126);
                      var8[var15 + var13] = var17.h(-68);
                      var9[var13 - -var15] = param2.field_u[var15];
                      if (var9[var13 - -var15] > 0) {
                        break L6;
                      } else {
                        var14 = (char)(var14 + 1);
                        var9[var13 + var15] = (char)var14;
                        break L6;
                      }
                    }
                    var10[var13 + var15] = param2.field_t[var15];
                    var15++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return new le(0L, param3, param1, param4, var12, var25, var8, var26);
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Disruptive behaviour";
        field_f = "Clan";
        field_a = new je();
        field_h = new of(1);
        field_e = "Type your password again to make sure it's correct";
    }
}
