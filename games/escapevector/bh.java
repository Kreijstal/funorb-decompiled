/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh extends vj {
    private String field_f;
    private String field_g;
    static String field_e;

    final static void a(boolean param0, int param1) {
        if (param1 != -19503) {
            return;
        }
        di.field_g.a((byte) -128, param0);
    }

    final static void c(int param0) {
        int var1 = -59;
        if (!(bk.field_r == null)) {
            bk.field_r.a((byte) 87);
        }
    }

    final void a(n param0, byte param1) {
        try {
            if (param1 >= -15) {
                String discarded$0 = bh.a(29, -33L);
            }
            param0.a((byte) 100, ((bh) this).field_g);
            param0.a(((bh) this).field_f, (byte) 111);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bh.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void d(int param0) {
        field_e = null;
    }

    final fk a(byte param0) {
        if (param0 != 32) {
            bh.a(true, 70);
            return md.field_E;
        }
        return md.field_E;
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (param0 >= -73) {
          return null;
        } else {
          he.field_s.setTime(new Date(param1));
          var3 = he.field_s.get(7);
          var4 = he.field_s.get(5);
          var5 = he.field_s.get(2);
          var6 = he.field_s.get(1);
          var7 = he.field_s.get(11);
          var8 = he.field_s.get(12);
          var9 = he.field_s.get(13);
          return r.field_A[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + bg.field_g[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    bh(String param0, String param1) {
        try {
            ((bh) this).field_f = param1;
            ((bh) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Auto-shield deactivated";
    }
}
