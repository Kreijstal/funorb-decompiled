/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static int[] field_c;
    static db field_b;
    static int[] field_e;
    static ug[] field_d;
    static int field_a;
    static int[] field_f;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          var5 = param3 + param1;
          var6 = param0 + param4;
          if (oo.field_f >= param1) {
            stackOut_2_0 = oo.field_f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (oo.field_e < param0) {
            stackOut_5_0 = param0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = oo.field_e;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 < oo.field_g) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = oo.field_g;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (oo.field_d > var6) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = oo.field_d;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (param1 < oo.field_f) {
            break L4;
          } else {
            if (oo.field_g > param1) {
              var11 = param1 + oo.field_b * var8;
              var12 = var10 + 1 - var8 >> -299578431;
              L5: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L4;
                } else {
                  oo.field_i[var11] = 16777215;
                  var11 = var11 + oo.field_b * 2;
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (param0 < oo.field_e) {
            break L6;
          } else {
            if (var6 < oo.field_d) {
              var11 = oo.field_b * param0 - -var7;
              var12 = -var7 + var9 + 1 >> -1726082751;
              L7: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L6;
                } else {
                  oo.field_i[var11] = 16777215;
                  var11 += 2;
                  continue L7;
                }
              }
            } else {
              break L6;
            }
          }
        }
        if (param2 >= 82) {
          L8: {
            if (var5 < oo.field_f) {
              break L8;
            } else {
              if (var5 < oo.field_g) {
                var11 = var5 + ((var5 - param1 & 1) + var8) * oo.field_b;
                var12 = -var8 + var10 + 1 >> -1637771327;
                L9: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L8;
                  } else {
                    oo.field_i[var11] = 16777215;
                    var11 = var11 + oo.field_b * 2;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L10: {
            if (oo.field_e > param0) {
              break L10;
            } else {
              if (oo.field_d <= var6) {
                break L10;
              } else {
                var11 = (1 & var6 + -param0) + (var7 + oo.field_b * var6);
                var12 = var9 + 1 + -var7 >> 938479457;
                L11: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L10;
                  } else {
                    oo.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(byte[] param0, byte param1, cj param2, int param3, cj param4, int param5, int param6, cj param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        ie.field_sb = -1L;
        od.field_Gb = param0;
        qa.field_h = param5;
        kj.field_h = param0.length;
        la.field_k = false;
        fg.field_k = new byte[(qa.field_h + 7) / 8];
        mh.field_c = null;
        ej.field_n = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (var11 >= od.field_Gb.length) {
            L1: {
              var10 = (7 + var10) / 8;
              tg.field_a = new byte[var10];
              if (null != param2.field_Cb) {
                break L1;
              } else {
                param2.field_Cb = new th();
                break L1;
              }
            }
            cg.field_i = param2.field_Cb;
            cg.field_i.e(-30986);
            hq.field_c = new sc(param8);
            ao.field_e = 0;
            if (param1 == 75) {
              L2: {
                dm.field_Zb = -1;
                cb.field_i = 0;
                bc.field_e = -1;
                if (null != param7.field_Cb) {
                  break L2;
                } else {
                  param7.field_Cb = new th();
                  break L2;
                }
              }
              L3: {
                tn.field_C = param7.field_Cb;
                tn.field_C.e(-30986);
                af.field_h = new sc(param9);
                if (param4.field_Cb != null) {
                  break L3;
                } else {
                  param4.field_Cb = new th();
                  break L3;
                }
              }
              nh.field_g = param4.field_Cb;
              nh.field_g.e(param1 + -31061);
              kp.field_o = new sc(param6);
              so.field_r = param3;
              qi.field_c = 0L;
              return;
            } else {
              return;
            }
          } else {
            var10 = var10 + (255 & od.field_Gb[var11]);
            var11++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 16777215) {
            field_e = null;
        }
        field_c = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        return ie.field_sb == mh.field_c.field_nc ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1024];
        field_b = new db();
        field_d = new ug[15];
        field_a = -1;
        field_f = new int[8192];
    }
}
