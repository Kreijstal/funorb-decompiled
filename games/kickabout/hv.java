/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv {
    static boolean[] field_a;
    static String field_b;
    static String field_d;
    static String[][] field_c;

    final static String a(boolean param0, CharSequence param1) {
        String var2 = bg.a((byte) 116, jc.a(param1, param0));
        if (param0) {
            return null;
        }
        if (!(var2 != null)) {
            var2 = "";
        }
        return var2;
    }

    final static void a(boolean param0, nu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        nl var18 = null;
        nl var18_ref = null;
        nl var19 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var17 = Kickabout.field_G;
          var18 = param1.field_P[param2][0];
          var19 = var18;
          if (param2 != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (var4 != 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1344;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_6_0;
          var6 = var19.f(-95);
          var7 = var19.a(param0);
          var8 = param1.field_V.a(true);
          var9 = param1.field_V.c(879306160);
          var10 = param1.field_V.e(-107);
          var11 = 448 + -var8;
          var12 = -var9 + var5;
          if (62500 <= var11 * var11 + var12 * var12) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var13 = stackIn_9_0;
          if ((var19.field_u ^ -1) != -15) {
            if (var19.field_u == 0) {
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = 0;
              stackIn_15_0 = stackOut_12_0;
              break L3;
            }
          } else {
            stackOut_10_0 = 1;
            stackIn_15_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var14 = stackIn_15_0;
          if (3 == var19.field_u) {
            var19.field_G = uv.a(true, var9 + -var7, -var6 + var8);
            if (-1 != param1.field_V.field_m) {
              L5: {
                if (param1.field_V.field_m != param2) {
                  break L5;
                } else {
                  if (param1.field_V.field_s != 0) {
                    break L5;
                  } else {
                    var19.a((byte) -31, 10);
                    break L4;
                  }
                }
              }
              var15 = -448 + var6;
              var16 = -var5 + var7;
              if (62500 >= var15 * var15 + var16 * var16) {
                break L4;
              } else {
                var19.field_L = 0;
                break L4;
              }
            } else {
              var19.a((byte) -31, 0);
              break L4;
            }
          } else {
            if (var14 != 0) {
              L6: {
                if (param1.field_V.field_m != param2) {
                  break L6;
                } else {
                  if (param1.field_V.field_s == -1) {
                    lk.a(param2, param1, -96, var19);
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var13 == 0) {
                  break L7;
                } else {
                  if (-1 != param1.field_V.field_m) {
                    break L7;
                  } else {
                    if (-400001 > var10) {
                      var19.field_u = 0;
                      ue.a(4, var8, var19, var9);
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (!wt.a(param1.field_V, var19, (byte) -75, param2)) {
                L8: {
                  var18_ref = var19;
                  gg.a(param2, 0, param1.field_V);
                  ue.a(4, pu.field_zb[0], var18_ref, pu.field_zb[1]);
                  if (-1 != (var19.field_u ^ -1)) {
                    break L8;
                  } else {
                    if (0 == var19.field_G) {
                      var19.a((byte) -31, 14);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var13 != 0) {
                    es.a(-120, var19, param2, param1.b((byte) -96), param1.field_V);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if ((var19.field_u ^ -1) != -15) {
                  break L4;
                } else {
                  var19.a(uv.a(param0, -var19.a(true) + var9, var8 + -var19.f(-98)), 26214);
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              break L4;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 23) {
            field_b = null;
        }
        field_c = null;
    }

    final static void a(hu param0, int param1) {
        if (param1 != -448) {
            return;
        }
        cq.field_e = param0;
        ae.field_D = h.a(17475);
        js.field_d = new tf();
        bk.field_c = new gv[6];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new boolean[73];
        field_b = "Player's Stats at Max";
        for (var0 = 0; var0 < field_a.length; var0++) {
            field_a[var0] = false;
        }
        field_a[23] = true;
        field_a[66] = true;
        field_a[28] = true;
        field_a[54] = true;
        field_d = "leave";
        field_c = new String[][]{new String[3], new String[3]};
    }
}
