/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static am field_g;
    static m field_e;
    static String field_f;
    static String field_a;
    static String field_d;
    static int field_b;
    static String field_c;

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            return;
        }
        field_f = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int[] param0, int param1, int[] param2, int[] param3, byte param4, int[] param5, qb param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (param6 != null) {
          L0: {
            var8 = -24 / ((-43 - param4) / 34);
            param7 = param7 + param6.field_x;
            param1 = param1 + param6.field_o;
            var9 = param7 + de.field_e * param1;
            var10 = 0;
            var11 = param6.field_y;
            var12 = param6.field_q;
            var13 = -var12 + de.field_e;
            if (de.field_c <= param1) {
              break L0;
            } else {
              var15 = -param1 + de.field_c;
              var10 = var10 + var15 * var12;
              var9 = var9 + de.field_e * var15;
              var11 = var11 - var15;
              param1 = de.field_c;
              break L0;
            }
          }
          L1: {
            var14 = 0;
            if (de.field_i > param7) {
              var15 = -param7 + de.field_i;
              var10 = var10 + var15;
              var13 = var13 + var15;
              var14 = var14 + var15;
              var12 = var12 - var15;
              var9 = var9 + var15;
              param7 = de.field_i;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 - -var11 > de.field_k) {
              var11 = var11 - (-de.field_k + var11 + param1);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param7 + var12 <= de.field_h) {
              break L3;
            } else {
              var15 = -de.field_h + param7 - -var12;
              var12 = var12 - var15;
              var14 = var14 + var15;
              var13 = var13 + var15;
              break L3;
            }
          }
          if (0 < var12) {
            if (0 >= var11) {
              return;
            } else {
              uh.a(param0, var10, var13, var11, param6.field_A, param5, 0, 0, (byte) -99, param3, var14, var9, param2, var12, de.field_l, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<shad><col=<%0>>FROST</col></shad>";
        field_d = "More suggestions";
        field_f = "Lesson 3 of 7<br><br>Use of a basic guided spell in a safe and secure environment.<br><br>Use the Arcane Arrows spell to destroy all three targets.<br><br><br>* Targeting with the focus point *<br>* Using the focus point to hit targets behind cover *";
        field_c = "You cannot join this game - it is in progress";
        field_g = new am();
    }
}
