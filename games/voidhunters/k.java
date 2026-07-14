/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class k extends rqa {
    static String field_p;
    static int field_r;
    static String field_q;
    static String field_o;

    public static void e(byte param0) {
        int var1 = 67 / ((36 - param0) / 39);
        field_q = null;
        field_o = null;
        field_p = null;
    }

    final static int a(byte param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var4 = -1;
        if (param0 != -69) {
            k.e((byte) -96);
        }
        for (var5 = param3; param1 > var5; var5++) {
            var4 = var4 >>> 60832328 ^ coa.field_d[255 & (var4 ^ param2[var5])];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
        }
        return new nc(oq.field_c);
    }

    k(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, boolean param1, String param2, boolean param3, byte param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        String stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        String stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        String stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          wia.field_a = true;
          ft.field_t = param0;
          var11 = param2;
          if (param1) {
            stackOut_2_0 = era.field_q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = kg.field_s;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (-1 != (ft.field_t ^ -1)) {
            if ((ft.field_t ^ -1) != -2) {
              throw new IllegalArgumentException();
            } else {
              var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
              var8 = var7 + 2;
              aka.field_o = new int[var8];
              db.field_o = new String[var8];
              var9 = 0;
              L2: while (true) {
                if (var9 >= var8) {
                  kc.field_e = new int[1];
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var7) {
                      db.field_o[-2 + var8] = "";
                      db.field_o[-1 + var8] = wm.field_b;
                      aka.field_o[-1 + var8] = 0;
                      kc.field_e[0] = 2;
                      break L1;
                    } else {
                      db.field_o[var9] = rea.field_e[var9];
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  aka.field_o[var9] = -1;
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
            var8 = 3 + var7;
            aka.field_o = new int[var8];
            db.field_o = new String[var8];
            var9 = 0;
            L4: while (true) {
              if (var8 <= var9) {
                kc.field_e = new int[2];
                var9 = 0;
                L5: while (true) {
                  if (var9 >= var7) {
                    db.field_o[-3 + var8] = "";
                    db.field_o[var8 + -2] = var6;
                    aka.field_o[var8 + -2] = 0;
                    kc.field_e[0] = 1;
                    db.field_o[var8 + -1] = wm.field_b;
                    aka.field_o[-1 + var8] = 1;
                    kc.field_e[1] = 2;
                    break L1;
                  } else {
                    db.field_o[var9] = rea.field_e[var9];
                    var9++;
                    continue L5;
                  }
                }
              } else {
                aka.field_o[var9] = -1;
                var9++;
                continue L4;
              }
            }
          }
        }
        ei.field_c.field_c = kc.field_e.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (var8 >= db.field_o.length) {
            if (param4 >= 11) {
              mtb.field_p = -(var7 >> -332389919) + var7 + alb.field_b;
              mua.field_d = alb.field_b + -(var7 >> 1753795585);
              ot.field_b = (hwa.field_q - -pva.field_g << -568881151) * ei.field_c.field_c;
              var8 = 0;
              L7: while (true) {
                if (db.field_o.length <= var8) {
                  nl.field_m = -(ot.field_b >> -1571504191) + pba.field_r;
                  ei.field_c.a(param3, -1, 0, rkb.a(uia.field_b, 3841, kc.field_b));
                  return;
                } else {
                  L8: {
                    stackOut_35_0 = ot.field_b;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if ((aka.field_o[var8] ^ -1) <= -1) {
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = tba.field_o;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L8;
                    } else {
                      stackOut_36_0 = stackIn_36_0;
                      stackOut_36_1 = whb.field_a;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      break L8;
                    }
                  }
                  ot.field_b = stackIn_38_0 + stackIn_38_1;
                  var8++;
                  continue L7;
                }
              }
            } else {
              return;
            }
          } else {
            L9: {
              stackOut_22_0 = db.field_o[var8];
              stackOut_22_1 = -42;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              if ((aka.field_o[var8] ^ -1) > -1) {
                stackOut_24_0 = (String) (Object) stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                break L9;
              } else {
                stackOut_23_0 = (String) (Object) stackIn_23_0;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                break L9;
              }
            }
            L10: {
              var9 = lsa.a(stackIn_25_0, stackIn_25_1, stackIn_25_2 != 0);
              if ((aka.field_o[var8] ^ -1) != 0) {
                var9 = var9 + ih.field_e * 2;
                break L10;
              } else {
                break L10;
              }
            }
            if (var7 < var9) {
              var7 = var9;
              var8++;
              continue L6;
            } else {
              var8++;
              continue L6;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Rating";
        field_r = 250;
        field_q = "This game option is not available in rated games.";
        field_o = "Capture and Hold";
    }
}
