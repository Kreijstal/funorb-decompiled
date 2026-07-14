/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends mk {
    static wd field_k;
    static int field_j;
    static String field_o;
    static bv field_n;
    static String field_l;
    static String field_p;
    static String[] field_m;

    final static String a(kl param0, int param1, String param2, String param3, String param4) {
        if (param1 != 0) {
            return null;
        }
        if (!(param0.a((byte) 82))) {
            return param4;
        }
        return param2 + " - " + param0.a(param3, (byte) 87) + "%";
    }

    final gu a(int param0, String param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 == -3137) {
          L0: {
            if (null != gt.b(param1, (byte) -24)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var3 = stackIn_11_0;
          if (var3 == 0) {
            return rn.field_e;
          } else {
            return oo.field_g;
          }
        } else {
          L1: {
            field_l = null;
            if (null != gt.b(param1, (byte) -24)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          if (var3 == 0) {
            return rn.field_e;
          } else {
            return oo.field_g;
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_n = null;
        field_m = null;
        field_p = null;
        field_o = null;
        field_l = null;
        field_k = null;
    }

    vl(fn param0) {
        super(param0);
    }

    final static void c(byte param0) {
        if (param0 != 91) {
          return;
        } else {
          ro.field_vb = c.field_d + " <b>" + ui.field_e + "</b> " + od.field_e + " <b>" + ge.field_m + "</b> " + ts.field_f + "<br>" + "<br>" + ls.field_d;
          return;
        }
    }

    final String a(byte param0, String param1) {
        if (param0 >= 89) {
          if (((vl) this).a(-3137, param1) == rn.field_e) {
            return ArmiesOfGielinor.field_H;
          } else {
            return fu.field_a;
          }
        } else {
          vl.c((byte) -118);
          if (((vl) this).a(-3137, param1) == rn.field_e) {
            return ArmiesOfGielinor.field_H;
          } else {
            return fu.field_a;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_o = "Show all lobby chat";
        field_l = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4> (<%5>-<%6>)</col>  Cost:<nbsp><col=ff0000><%7></col>";
    }
}
