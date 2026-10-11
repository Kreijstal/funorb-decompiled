/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_a;
    static String field_b;

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hb.a(param0, -31654)) {
            return false;
          }
          if (pf.a(param0, (byte) 24)) {
            return false;
          }
          if (cg.a(-92, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (va.a(param2, param1 + 12075, param0)) {
            return false;
          }
          if (param1 != -12076) {
            return true;
          }
          if (ms.a(param0, (byte) -53, param2)) {
            return false;
          }
          if (!na.a(param0, 127, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("gi.B(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        lm[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        sq var2 = null;
        sq var3 = null;
        int var4 = 0;
        lm[] var5 = null;
        int var6 = 0;
        int var2_intLifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (hm.field_q == ol.field_g) {
            if (null != ol.field_g) {
              te.field_c = te.field_c + 16;
              var5 = ol.field_g.field_f;
              var1 = var5;
              if (var1 != null) {
                for (var2_int = 0; var5.length > var2_int; var2_int++) {
                  if (0 == rg.field_f[var2_int] &&
                    sp.a(var5[var2_int].field_c, (byte) -125)) {
                    rg.field_f[var2_int] = 1;
                    vn.a(0);
                  }
                }
              }
            }
          } else {
            fieldTemp$0 = ej.field_m + 1;
            ej.field_m = ej.field_m + 1;
            if (fieldTemp$0 >= 32) {
              js.a((byte) -10);
            }
          }
          if (param0) {
            return;
          }
          if (sr.a(0, "unplaced")) {
            if (qc.a("unplaced", -126)) {
              ac.a(1, n.a("unplaced", -21502));
            }
          } else {
            if (sr.a(0, "losegame")) {
              ac.a(1, n.a("lose", -21502));
            }
          }
          aj.field_a.a(0);
          if (ol.field_g == hm.field_q) {
            ei.field_e = kp.field_j;
            e.field_f = jc.field_r;
            fk.field_k = be.field_h;
            kl.field_o = pc.field_q;
          } else {
            e.field_f = re.a(jc.field_r, 32, ej.field_m, fe.field_B, 0);
            fk.field_k = re.a(be.field_h, 32, ej.field_m, oi.field_a, 0);
            ei.field_e = re.a(kp.field_j, 32, ej.field_m, jb.field_d, 0);
            stackIn_28_0 = pc.field_q;
            stackIn_28_1 = 32;
            kl.field_o = re.a(stackIn_28_0, stackIn_28_1, ej.field_m, tp.field_b, 0);
          }
          if (null != oi.field_i) {
            var1_int = 1;
            var6 = 0;
            var2_intLifetime1 = var6;
            while (var6 < rg.field_f.length) {
              if (rg.field_f[var6] > 0) {
                rg.field_f[var6] = rg.field_f[var6] + 1;
              }
              if (rg.field_f[var6] < 48) {
                var1_int = 0;
              }
              var6++;
            }
            if (var1_int != 0) {
              var2 = ol.field_g.field_l;
              if (var2 == null &&
                ge.field_i > 0) {
                fieldTemp$1 = ge.field_i - 1;
                ge.field_i = ge.field_i - 1;
                var2 = js.field_b[fieldTemp$1];
              }
              if (!is.field_b) {
                lp.a(1546006977, var2);
                return;
              }
              is.field_b = false;
              var3 = js.field_b[ge.field_i];
              if (var3 != null &&
                var3 != ol.field_g) {
                lp.a(1546006977, var3);
                return;
              }
              lp.a(1546006977, var2);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "gi.C(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, ms param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          qn.field_b[0] = na.field_u.nextInt();
          qn.field_b[1] = na.field_u.nextInt();
          eo.field_cb.field_j = 0;
          qn.field_b[3] = (int)w.field_I;
          qn.field_b[2] = (int)(w.field_I >> 32);
          eo.field_cb.e(11135, qn.field_b[0]);
          eo.field_cb.e(11135, qn.field_b[1]);
          eo.field_cb.e(11135, qn.field_b[2]);
          eo.field_cb.e(11135, qn.field_b[3]);
          jo.a(24, eo.field_cb);
          if (param3 > -36) {
            return;
          }
          eo.field_cb.d(param0, 255);
          param4.a(eo.field_cb, (byte) 118);
          js.field_f.field_j = 0;
          if (param1) {
            js.field_f.c(18, (byte) -106);
          } else {
            js.field_f.c(16, (byte) -89);
          }
          js.field_f.field_j = js.field_f.field_j + 2;
          var5_int = js.field_f.field_j;
          js.field_f.e(11135, e.field_b);
          js.field_f.b(-16426, be.field_l);
          var6 = 0;
          if (db.field_b) {
            var6 = var6 | 1;
          }
          if (ka.field_a) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (fr.field_H != null) {
            var6 = var6 | 16;
          }
          js.field_f.c(var6, (byte) -93);
          var7 = ck.a((byte) 70, kq.f((byte) 125));
          if (var7 == null) {
            var7 = "";
          }
          js.field_f.a(var7, (byte) 0);
          if (fr.field_H != null) {
            js.field_f.a((byte) 95, fr.field_H);
          }
          co.a(25050, js.field_f, hr.field_a, eo.field_cb, jl.field_V);
          js.field_f.f(-549342136, js.field_f.field_j - var5_int);
          d.$cfr$intArgs$a$a6964d7afeb1(-1, 82);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("gi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 32) {
          String var2 = (String) null;
          gi.a((String) null, -107, (String) null);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Select destination system in the same territory or connected by hyperspace link.";
    }
}
