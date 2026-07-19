/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int[] field_a;
    static int[] field_f;
    static vk field_b;
    static int field_e;
    static String field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 > -40) {
          field_f = (int[]) null;
          field_b = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 >= 7) {
          if (param0) {
            ac.field_m = 0;
            bo.field_i = true;
            oc.field_c = -1.0f;
            i.field_V = 0.0f;
            lg.a(4, (byte) -78);
            wo.field_wb = false;
            return;
          } else {
            bo.field_i = false;
            return;
          }
        } else {
          return;
        }
    }

    static {
        int var5 = 0;
        field_f = new int[61];
        field_a = new int[61];
        double var0 = 0.0;
        double var2 = 0.41887902047863906;
        int var4 = 20;
        for (var5 = 0; 60 > var5; var5++) {
            field_a[var5] = (int)(20.0 * (double)(var4 > var5 ? 2 : 2 * var4 <= var5 ? 8 : 4) * Math.sin(var0));
            field_f[var5] = (int)(Math.cos(var0) * ((double)(var5 >= var4 ? 2 * var4 > var5 ? 4 : 8 : 2) * 20.0));
            var0 = var0 + var2;
        }
        field_a[60] = 0;
        field_f[60] = 0;
        field_d = "Quit to website";
        field_b = new vk();
    }
}
