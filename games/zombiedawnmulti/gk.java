/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gk {
    static int field_c;
    static String field_a;
    static int field_b;

    final static nc a(int param0, int param1) {
        if (param0 != 2) {
            field_c = 127;
        }
        return mj.field_Hb[param1];
    }

    public static void a(int param0) {
        if (param0 <= 38) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        sc.d((byte) 87);
        if (param0 != 16) {
            gk.a(-7);
        }
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          jg.field_a = true;
          ic.field_d = param3;
          var11 = param2;
          if (param4) {
            stackOut_2_0 = wf.field_n;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = p.field_b;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (ic.field_d == 0) {
            var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
            var8 = 3 + var7;
            dn.field_a = new int[var8];
            eo.field_e = new String[var8];
            var9 = 0;
            L2: while (true) {
              if (var9 >= var8) {
                oq.field_x = new int[2];
                var9 = 0;
                L3: while (true) {
                  if (var7 <= var9) {
                    eo.field_e[-3 + var8] = "";
                    eo.field_e[-2 + var8] = var6;
                    dn.field_a[-2 + var8] = 0;
                    oq.field_x[0] = 1;
                    eo.field_e[var8 + -1] = ic.field_f;
                    dn.field_a[-1 + var8] = 1;
                    oq.field_x[1] = 2;
                    break L1;
                  } else {
                    eo.field_e[var9] = lj.field_t[var9];
                    var9++;
                    continue L3;
                  }
                }
              } else {
                dn.field_a[var9] = -1;
                var9++;
                continue L2;
              }
            }
          } else {
            if (1 != ic.field_d) {
              throw new IllegalArgumentException();
            } else {
              var7 = mb.a(e.field_c, false, var11, lj.field_t, 480);
              var8 = var7 + 2;
              dn.field_a = new int[var8];
              eo.field_e = new String[var8];
              var9 = 0;
              L4: while (true) {
                if (var9 >= var8) {
                  oq.field_x = new int[1];
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var7) {
                      eo.field_e[var8 - 2] = "";
                      eo.field_e[-1 + var8] = ic.field_f;
                      dn.field_a[var8 - 1] = 0;
                      oq.field_x[0] = 2;
                      break L1;
                    } else {
                      eo.field_e[var9] = lj.field_t[var9];
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  dn.field_a[var9] = -1;
                  var9++;
                  continue L4;
                }
              }
            }
          }
        }
        mo.field_Jb.field_c = oq.field_x.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (var8 >= eo.field_e.length) {
            pl.field_F = mo.field_Jb.field_c * (ne.field_tb + pb.field_b << 2059566049);
            mc.field_e = aq.field_x - (-var7 + (var7 >> 577309889));
            ch.field_i = -(var7 >> 2026215201) + aq.field_x;
            var8 = 0;
            L7: while (true) {
              if (var8 >= eo.field_e.length) {
                L8: {
                  if (param1 == 2) {
                    break L8;
                  } else {
                    gk.a((byte) -33);
                    break L8;
                  }
                }
                eb.field_M = -(pl.field_F >> -2077899647) + pm.field_Q;
                mo.field_Jb.a(0, param0, -31458, aj.a(bo.field_d, false, bd.field_g));
                return;
              } else {
                L9: {
                  stackOut_32_0 = pl.field_F;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (dn.field_a[var8] < 0) {
                    stackOut_34_0 = stackIn_34_0;
                    stackOut_34_1 = dq.field_l;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L9;
                  } else {
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = po.field_n;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L9;
                  }
                }
                pl.field_F = stackIn_35_0 + stackIn_35_1;
                var8++;
                continue L7;
              }
            }
          } else {
            L10: {
              if (-1 < (dn.field_a[var8] ^ -1)) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L10;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L10;
              }
            }
            L11: {
              var9 = vh.a(stackIn_25_0 != 0, -36, eo.field_e[var8]);
              if (-1 == dn.field_a[var8]) {
                break L11;
              } else {
                var9 = var9 + wb.field_db * 2;
                break L11;
              }
            }
            if (var9 > var7) {
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
        field_a = "Cancel";
    }
}
