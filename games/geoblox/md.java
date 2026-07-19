/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md {
    static String[] field_d;
    static int[] field_e;
    static tf field_a;
    static float field_b;
    static int field_c;

    final static String a(byte param0, long param1) {
        String discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ul.field_c.setTime(new Date(param1));
        var3 = ul.field_c.get(7);
        if (param0 > -43) {
          discarded$1 = md.a((byte) -70, -99L);
          var4 = ul.field_c.get(5);
          var5 = ul.field_c.get(2);
          var6 = ul.field_c.get(1);
          var7 = ul.field_c.get(11);
          var8 = ul.field_c.get(12);
          var9 = ul.field_c.get(13);
          return ji.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + mb.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var4 = ul.field_c.get(5);
          var5 = ul.field_c.get(2);
          var6 = ul.field_c.get(1);
          var7 = ul.field_c.get(11);
          var8 = ul.field_c.get(12);
          var9 = ul.field_c.get(13);
          return ji.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + mb.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != 40) {
            md.a((byte) 23);
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new tf();
    }
}
