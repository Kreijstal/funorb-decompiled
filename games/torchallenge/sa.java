/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static volatile boolean field_c;
    static String field_b;
    static int field_a;

    final static void a(int param0) {
        if (param0 != 0) {
          sa.a(41);
        }
    }

    final static String a(boolean param0) {
        if (li.field_K < 2) {
          return ta.field_Ab;
        }
        if (null != rj.field_f) {
          if (!rj.field_f.b(-7957)) {
            return ol.field_f;
          }
          return sd.field_g;
        }
        if (!sl.field_a.b(-7957)) {
          return uk.field_K;
        }
        if (!sl.field_a.b(5, "commonui")) {
          return ra.field_m + " - " + sl.field_a.a(112, "commonui") + "%";
        }
        if (!gf.field_p.b(-7957)) {
          return wf.field_a;
        }
        if (!param0) {
          field_b = (String) null;
        }
        if (!gf.field_p.b(5, "commonui")) {
          return ij.field_x + " - " + gf.field_p.a(125, "commonui") + "%";
        }
        if (!jl.field_b.b(-7957)) {
          return wa.field_qb;
        }
        if (!jl.field_b.b((byte) 79)) {
          return bk.field_l + " - " + jl.field_b.c(126) + "%";
        }
        return lh.field_y;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 92) {
          sa.a(40);
        }
    }

    final static void a(byte param0, int param1, eh param2) {
        pa var5 = null;
        int var4 = 0;
        try {
          var5 = dk.field_s;
          var5.d(25, param1);
          var5.field_q = var5.field_q + 1;
          var4 = var5.field_q;
          if (param0 < 11) {
            field_c = false;
          }
          var5.d(1, (byte) 122);
          if (null == param2.field_i) {
            var5.d(0, (byte) 122);
          } else {
            var5.d(param2.field_i.length, (byte) 122);
            var5.a(param2.field_i.length, 0, param2.field_i, -16384);
          }
          var5.b(var4, 14430);
          var5.field_q = var5.field_q - 4;
          param2.field_j = var5.i(67);
          var5.a(var5.field_q - var4, -112);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "sa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          param1 = param1 >>> 16;
          var2 += 16;
        } else {
          if (param1 >= 65536) {
            param1 = param1 >>> 16;
            var2 += 16;
          }
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param0 <= 59) {
          sa.a(true);
        }
        if (4 <= param1) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    static {
        field_c = false;
    }
}
