/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static aj field_b;
    static int field_j;
    static String field_h;
    static int field_i;
    static kc[] field_f;
    static String field_d;
    private vn field_e;
    private pg field_c;
    static boolean field_g;
    static char[] field_a;

    final pg d(int param0) {
        pg var2 = ((oc) this).field_c;
        if (((oc) this).field_e.field_e == var2) {
            ((oc) this).field_c = null;
            return null;
        }
        ((oc) this).field_c = var2.field_b;
        if (param0 != -18502) {
            ((oc) this).field_e = null;
        }
        return var2;
    }

    final pg a(boolean param0, pg param1) {
        pg var3 = null;
        if (param0) {
            return null;
        }
        if (param1 == null) {
            var3 = ((oc) this).field_e.field_e.field_b;
        } else {
            var3 = param1;
        }
        if (var3 == ((oc) this).field_e.field_e) {
            ((oc) this).field_c = null;
            return null;
        }
        ((oc) this).field_c = var3.field_b;
        return var3;
    }

    final static boolean a(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -15576) {
            break L0;
          } else {
            oc.a(-109, -10, 3, -53, 6, 89);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ih.field_f < 20) {
              break L2;
            } else {
              if (!ue.a(125)) {
                break L2;
              } else {
                L3: {
                  if (0 >= dd.field_j) {
                    break L3;
                  } else {
                    if (ke.g(param0 ^ 15587)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final pg c(boolean param0) {
        if (!param0) {
            ((oc) this).field_e = null;
        }
        pg var2 = ((oc) this).field_c;
        if (var2 == ((oc) this).field_e.field_e) {
            ((oc) this).field_c = null;
            return null;
        }
        ((oc) this).field_c = var2.field_a;
        return var2;
    }

    final void a(byte param0, vn param1) {
        if (param0 < 24) {
            field_d = null;
        }
        ((oc) this).field_e = param1;
    }

    final pg c(int param0) {
        int var3 = -11 / ((param0 - 41) / 60);
        pg var2 = ((oc) this).field_e.field_e.field_a;
        if (!(((oc) this).field_e.field_e != var2)) {
            ((oc) this).field_c = null;
            return null;
        }
        ((oc) this).field_c = var2.field_a;
        return var2;
    }

    public static void b(boolean param0) {
        field_a = null;
        field_h = null;
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0) {
            oc.a(-17, -79, -45, -100, -45, 122);
        }
    }

    final static void a(boolean param0) {
        if (eo.field_c != null) {
            if (!(eo.field_c.field_c == null)) {
                eo.field_c.field_c.field_ab = false;
            }
        }
        dd.field_h = null;
        eo.field_c = null;
        if (param0) {
            boolean discarded$0 = oc.a(-89);
        }
    }

    final pg b(int param0) {
        if (param0 > -30) {
            boolean discarded$0 = oc.a(-35);
        }
        pg var2 = ((oc) this).field_e.field_e.field_b;
        if (((oc) this).field_e.field_e == var2) {
            ((oc) this).field_c = null;
            return null;
        }
        ((oc) this).field_c = var2.field_b;
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = ArcanistsMulti.field_G ? 1 : 0;
          var6 = 16 - (-param3 + -485 - (2 + param1));
          lj.field_t.a(var6 - 6, 3, 3, n.field_g.field_I - 6, (byte) -120);
          var7 = -5 + lj.field_t.field_I;
          ch.field_d.a(2 + (485 + param3) + param1, 5, -param4 + var7, param4, (byte) -120);
          wn.field_D.a(-sa.field_Cb.field_x + -param3 + ch.field_d.field_x, param3, 0, param4, (byte) -120);
          sa.field_Cb.a(sa.field_Cb.field_x, param3 + wn.field_D.field_x, 0, param4, (byte) -120);
          var7 = var7 - (2 + param4);
          qo.field_f.a(5, param1, param1 + param3 - -487, false, 5, var7 + -5, 2);
          if (ln.field_U == null) {
            break L0;
          } else {
            ln.field_U.a(qo.field_f.field_I, qo.field_f.field_db, qo.field_f.field_x, qo.field_f.field_T, -104);
            break L0;
          }
        }
        var8 = -param3 + (n.field_g.field_x + -var6);
        var9 = var8 / 2;
        var10 = var9 - (-param2 + -param3);
        var11 = 0;
        var12 = 0;
        L1: while (true) {
          if ((var12 ^ -1) <= -7) {
            L2: {
              if (param0 > 79) {
                break L2;
              } else {
                oc.a(true);
                break L2;
              }
            }
            return;
          } else {
            L3: {
              if ((var12 ^ -1) <= -6) {
                break L3;
              } else {
                if (null != mn.field_s[var12]) {
                  break L3;
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
            var13 = (2 + (n.field_g.field_I + -6)) * var11 / (1 + lf.field_g) + 3;
            var11++;
            var7 = (-6 + n.field_g.field_I - -2) * var11 / (lf.field_g + 1) + 3 + -2 + -var13;
            if (-6 >= (var12 ^ -1)) {
              g.field_g.a(var8, var6, var13, var7, (byte) -120);
              var12++;
              continue L1;
            } else {
              mn.field_s[var12].a(var8, var6, var13, var7, (byte) -120);
              ta.field_i[var12].a(-param3 + var9, param3, 0, var7, (byte) -120);
              ia.field_b[var12].a(param2, var9, param5, -param5 + var7 - param5, (byte) -120);
              field_f[var12].a(-var10 + (-param3 + var8), var10, param5, -param5 + var7 - param5, (byte) -120);
              var12++;
              continue L1;
            }
          }
        }
    }

    final pg a(int param0, pg param1) {
        pg var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((oc) this).field_e.field_e.field_a;
        }
        if (!(((oc) this).field_e.field_e != var3)) {
            ((oc) this).field_c = null;
            return null;
        }
        ((oc) this).field_c = var3.field_a;
        if (param0 != 402) {
            field_j = -125;
        }
        return var3;
    }

    public oc() {
    }

    oc(vn param0) {
        ((oc) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new aj(2, 4, 4, 0);
        field_d = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_h = "Press 'ESC' to open the menu";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
