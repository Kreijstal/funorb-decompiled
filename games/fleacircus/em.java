/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class em extends IOException {
    static int[] field_e;
    static int field_f;
    static String field_a;
    static int field_d;
    static int field_b;
    static String field_h;
    static rh field_c;
    static nd field_g;

    final static void a(int param0) {
        ia.field_p[4] = new int[]{5};
        tk.a(34, 185, new int[]{5}, 455, -119, 4, 383);
        pi.field_b[4] = new t(4);
        tk.a(34, 57, new int[]{8, 9, 10, 5}, 600, -126, 2, 383);
        pi.field_b[2] = new t(2);
        tk.a(34, 165, new int[]{20, 5}, 475, -120, 8, 410);
        pi.field_b[8] = new t(8);
        ia.field_p[6] = new int[]{22};
        tk.a(70, 165, new int[]{22}, 475, -125, 6, 295);
        if (param0 > -51) {
          em.a(19);
        }
        pi.field_b[6] = new t(6);
        rh.field_c.field_d = rh.field_c.field_D.field_N * 11;
        if (wc.field_q > 0 &&
          lf.a(fg.field_q, 31849)) {
          tk.a(34, 155, new int[]{1, 19, 12, 13, 4, 3, 7}, 485, -123, 1, 135);
          pi.field_b[1] = new t(1);
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (df.field_b == null) {
          return -1;
        }
        if (ha.field_l <= param2 &&
          param2 < ha.field_l + df.field_b.field_w &&
          mg.field_e <= param0 &&
          param0 < df.field_b.field_t + mg.field_e) {
          return 0;
        }
        if (param2 >= mh.field_w &&
          param2 < mh.field_w + df.field_b.field_w &&
          rj.field_o <= param0 &&
          df.field_b.field_t + rj.field_o > param0) {
          return 1;
        }
        if (param1) {
          em.b(-117);
        }
        return -1;
    }

    em(String param0) {
        super(param0);
    }

    final static String c(int param0) {
        if (b.field_e == null) {
          return "";
        }
        if (param0 != 10158) {
          field_d = -125;
        }
        return b.field_e;
    }

    final static void a(dd param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        if ((3 & (param0.field_w | param0.field_t | param0.field_q | param0.field_v)) == 0) {
          return;
        }
        int var2_int = (3 & param0.field_q) + param0.field_w;
        var2_int = -(3 & var2_int) - (-4 - var2_int);
        int var3 = param0.field_t + (3 & param0.field_v);
        var3 = 4 - (var3 & 3) + var3;
        int[] var4 = new int[var3 * var2_int];
        if (param1 >= -45) {
          return;
        }
        try {
          var5 = 0;
          var6 = (param0.field_v & 3) * var2_int + (3 & param0.field_q);
          for (var7 = 0; var7 < param0.field_t; var7++) {
            for (var8 = 0; param0.field_w > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_B[incrementValue$1];
            }
            var6 = var6 + (var2_int - param0.field_w);
          }
          param0.field_B = var4;
          param0.field_w = var2_int;
          param0.field_q = param0.field_q & -4;
          param0.field_t = var3;
          param0.field_v = param0.field_v & -4;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "em.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 > -52) {
          field_d = 68;
        }
        stackIn_6_0 = (param1 >= 48) && (param1 <= 57);
        return stackIn_6_0;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 3505) {
          em.b(17);
        }
        field_h = null;
        field_e = null;
        field_g = null;
    }

    static {
        field_f = 0;
        field_a = "Flea Circus is a puzzle game in which you must direct fleas from their starting location to the level exit. You can do this by placing three different types of item into the level: left slopes, right slopes and blocks.";
        field_b = 0;
        field_h = "<%0>Spider:<%1> eats fleas for breakfast, lunch and dinner. Keep your fleas away from them!";
    }
}
