/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends pl {
    static String field_G;
    static o field_H;
    static String field_F;

    public static void d(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != 19291) {
            ef.d(61);
            field_H = null;
            return;
        }
        field_H = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((ef) this).field_z) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ef) this).field_z = stackIn_3_1 != 0;
        super.b(-108, param1, param2, param3);
        if (param0 > -45) {
          ((ef) this).b(-80, 25, -112, 4);
          return;
        } else {
          return;
        }
    }

    ef(String param0, ce param1, boolean param2) {
        this(param0, param1);
        ((ef) this).field_z = param2 ? true : false;
    }

    private ef(String param0, ce param1) {
        this(param0, kc.field_H.field_c, param1);
        ((ef) this).field_w = kc.field_H.field_a;
    }

    private ef(String param0, bf param1, ce param2) {
        super(param0, param1, param2);
        ((ef) this).field_w = kc.field_H.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "yet submitted scores in this game.";
        field_F = "Intro";
    }
}
