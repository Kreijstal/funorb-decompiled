/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vu extends pv {
    private boolean field_n;
    int[][] field_m;
    static String field_o;
    static ee[] field_k;
    private int field_j;
    static sna field_p;
    static String field_l;

    private final int c(boolean param0) {
        if (param0) {
          return 86;
        }
        return 100;
    }

    final boolean b(boolean param0) {
        int var2 = 0;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int[] dupTemp$4 = null;
        int var3;
        var3 = BachelorFridge.field_y;
        if (!param0) {
          this.b(false);
        }
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$0 > this.c(false)) {
          this.d((byte) -125);
          return true;
        }
        if (this.field_g == 1) {
          this.field_f.field_v.a((byte) 57, this.field_f.field_g.field_o.field_b, 0);
          if (this.field_n) {
            qm.a(29, 7758);
          } else {
            qm.a(30, 7758);
          }
        }
        if (40 >= this.field_g &&
          0 == this.field_g % 8) {
          this.field_m[this.field_j][0] = kla.a(15, m.field_a, -2147483648);
          this.field_m[this.field_j][1] = kla.a(15, m.field_a, -2147483648);
          this.field_m[this.field_j][2] = kla.a(10, m.field_a, -2147483648) + 20;
          this.field_m[this.field_j][3] = 2;
          this.field_j = this.field_j + 1;
        }
        for (var2 = 0; this.field_m.length > var2; var2++) {
          if (this.field_j >= var2 &&
            this.field_g % 2 != 0) {
            dupTemp$1 = this.field_m[var2];
            dupTemp$1[0] = dupTemp$1[0] + 1;
            dupTemp$2 = this.field_m[var2];
            dupTemp$2[1] = dupTemp$2[1] + 1;
            dupTemp$3 = this.field_m[var2];
            dupTemp$3[2] = dupTemp$3[2] - 1;
            if (this.field_m[var2][3] < 6) {
              dupTemp$4 = this.field_m[var2];
              dupTemp$4[3] = dupTemp$4[3] + 1;
            }
          }
        }
        if (this.field_g >= 40) {
          return false;
        }
        this.field_f.field_k = this.field_f.field_k + (this.field_g % 3 - 1);
        return false;
    }

    final static boolean a(byte param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (hm.a((byte) 121, param1)) {
          return true;
        }
        if (45 == param1) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (95 == param1) {
          return true;
        }
        if (param0 > 116) {
          return false;
        }
        vu.c((byte) 125);
        return false;
    }

    private final void d(byte param0) {
        if (param0 <= -3) {
          this.field_f.field_n = this.field_f.c((byte) -115);
          this.field_f.field_k = this.field_f.b(true);
          return;
        }
        vu.a((byte) 18, '￨');
        this.field_f.field_n = this.field_f.c((byte) -115);
        this.field_f.field_k = this.field_f.b(true);
    }

    vu(jfa param0, boolean param1) {
        try {
          this.field_f = param0;
          this.field_n = param1 ? true : false;
          this.field_m = new int[5][4];
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_l = null;
        field_p = null;
        field_k = null;
        field_o = null;
        if (param0 != 106) {
          field_l = (String) null;
        }
    }

    static {
        field_o = "You must have at least one creature in your fridge to enter the arena.";
        field_l = " <%0>/<%1>";
    }
}
