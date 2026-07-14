/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static String field_b;
    static String field_a;
    static int field_c;
    private kl field_d;

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        if ((kd.field_X ^ -1) <= -1) {
          if (param0 == -61) {
            L0: {
              var1 = 352;
              stackOut_10_0 = bc.field_j[kd.field_X].length;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (od.field_c[kd.field_X]) {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            var2 = stackIn_13_0 - -stackIn_13_1;
            var2 = (var2 / 2 - -(var2 % 2)) * 80;
            if (-80 + (var1 - -8) >= var2) {
              uk.field_q = -1;
              return;
            } else {
              uk.field_q = 8 + (var2 + -var1 - -80);
              return;
            }
          } else {
            L1: {
              String discarded$1 = dg.a(38);
              var1 = 352;
              stackOut_3_0 = bc.field_j[kd.field_X].length;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (od.field_c[kd.field_X]) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            var2 = stackIn_6_0 - -stackIn_6_1;
            var2 = (var2 / 2 - -(var2 % 2)) * 80;
            if (-80 + (var1 - -8) >= var2) {
              uk.field_q = -1;
              return;
            } else {
              uk.field_q = 8 + (var2 + -var1 - -80);
              return;
            }
          }
        } else {
          uk.field_q = -1;
          return;
        }
    }

    final static String a(int param0) {
        String var1 = null;
        var1 = "";
        if (param0 > -69) {
          L0: {
            field_a = null;
            if (null == np.field_Qb) {
              break L0;
            } else {
              var1 = np.field_Qb.m(-15056);
              break L0;
            }
          }
          L1: {
            if (var1.length() == 0) {
              var1 = rn.b(true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = ko.field_a;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (null == np.field_Qb) {
              break L3;
            } else {
              var1 = np.field_Qb.m(-15056);
              break L3;
            }
          }
          L4: {
            if (var1.length() == 0) {
              var1 = rn.b(true);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var1.length() == 0) {
              var1 = ko.field_a;
              break L5;
            } else {
              break L5;
            }
          }
          return var1;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -12) {
            field_a = null;
        }
    }

    final void a(int param0, int param1) {
        co var3 = null;
        co var4 = null;
        co var5 = null;
        if (param0 == mk.field_e) {
          return;
        } else {
          L0: {
            if (param1 <= mk.field_e) {
              var4 = mc.field_d[mk.field_e];
              var3 = var4;
              var4.a(0);
              break L0;
            } else {
              break L0;
            }
          }
          var5 = mc.field_d[param0];
          var3 = var5;
          var3.b((byte) -118);
          ac.field_k = var3.field_w;
          tn.field_eb = var3.field_u;
          nr.field_c = var3.field_m;
          mk.field_e = param0;
          l.field_b = var3.field_g;
          oq.field_l = var5.field_b;
          dd.field_k = ac.field_k[1].a();
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        of.field_Mb = lo.a("cantmove", -28106, "basic", ((dg) this).field_d);
        bk.field_d = lo.a("attacktargets", -28106, "basic", ((dg) this).field_d);
        hq.field_a = lo.a("surround_tiles", -28106, "basic", ((dg) this).field_d);
        vf.field_j = fk.a("smoke", (byte) -124, ((dg) this).field_d, "basic");
        jq.field_G = fk.a("kalphites", (byte) -124, ((dg) this).field_d, "basic");
        for (var2 = param0; jq.field_G.length > var2; var2++) {
            jq.field_G[var2].i();
        }
        es.field_d = lo.a("bones", param0 + -28106, "basic", ((dg) this).field_d);
        wf.field_B = fk.a("boneshadows", (byte) -124, ((dg) this).field_d, "basic");
        go.field_g = nh.a("player_ring", "basic", ((dg) this).field_d, false);
        wl.field_N = fk.a("shadows", (byte) -128, ((dg) this).field_d, "basic")[0];
    }

    dg(kl param0) {
        ((dg) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Temple";
        field_c = 0;
    }
}
