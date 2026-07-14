/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bt {
    static pt field_a;
    static String field_b;
    static String field_c;

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        int var1 = 0 / ((63 - param0) / 34);
        field_b = null;
    }

    final static String a(boolean param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qs.field_a.setTime(new Date(param1));
        var3 = qs.field_a.get(7);
        var4 = qs.field_a.get(5);
        var5 = qs.field_a.get(2);
        if (param0) {
          return (String) null;
        } else {
          var6 = qs.field_a.get(1);
          var7 = qs.field_a.get(11);
          var8 = qs.field_a.get(12);
          var9 = qs.field_a.get(13);
          return jc.field_Rc[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + fk.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final static void a(int param0) {
        if (null == ml.field_m) {
          fd.field_f = new ep();
          if (param0 != 10) {
            field_a = (pt) null;
            ak.field_d.d((ea) (Object) fd.field_f, -30244);
            return;
          } else {
            ak.field_d.d((ea) (Object) fd.field_f, -30244);
            return;
          }
        } else {
          ml.field_m.h((byte) -23);
          fd.field_f = new ep();
          if (param0 == 10) {
            ak.field_d.d((ea) (Object) fd.field_f, -30244);
            return;
          } else {
            field_a = (pt) null;
            ak.field_d.d((ea) (Object) fd.field_f, -30244);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "INSTRUCTIONS";
        field_a = new pt();
        field_c = "Create a free account to start using this feature";
    }
}
