/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg extends pj {
    byte[] field_s;
    static ki field_r;
    static qr field_t;

    final static boolean a(String param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (me.a(false, param0)) {
            return false;
          }
          if (hp.a(param0, true)) {
            return false;
          }
          if (ao.a(param0, 30996)) {
            return false;
          }
          var3_int = 11 / ((param2 - 63) / 59);
          if (param1.length() == 0) {
            return true;
          }
          if (gt.a(param0, param1, 106)) {
            return false;
          }
          if (jd.a(param0, (byte) 111, param1)) {
            return false;
          }
          if (!wv.a(false, param0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("gg.C(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_r = (ki) null;
        }
        field_t = null;
        field_r = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          ig.field_b.e(122);
          aa.field_a = new ah[100];
          ds.a(85);
          if (param0 <= 81) {
            field_t = (qr) null;
          }
          bj.field_b = new jn();
          is.field_c = new jn();
          if (oh.field_e != -1) {
            is.field_c = dr.field_S[oh.field_e].field_d;
          }
          he.field_o = new Random();
          db.field_l = 1;
          nd.field_F = 3;
          an.field_a = 0;
          ku.field_J = new wc[6];
          var1_int = 0;
          if (-1 != oh.field_e) {
            if (!rh.field_r[oh.field_e]) {
              for (var2 = cj.field_e[oh.field_e]; var2 < 6 + cj.field_e[oh.field_e]; var2++) {
                ku.field_J[var1_int] = cb.field_a[var2];
                var1_int++;
              }
            } else {
              ku.field_J = ((om) (ab.field_a.a(107, (long)oh.field_e))).a(-120);
            }
          }
          in.field_z = 0;
          if (5 >= gj.a((byte) -84, 10)) {
            fb.field_a = fb.field_a + iw.field_b;
          } else {
            ha.field_f = ha.field_f + iw.field_b;
          }
          iw.field_b = 0;
          td.field_m = false;
          ke.a(false);
          oc.field_e = 1000;
          ag.a(0, oh.field_e % 5 + 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "gg.B(" + param0 + ')');
        }
    }

    gg(byte[] param0) {
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new qr();
    }
}
