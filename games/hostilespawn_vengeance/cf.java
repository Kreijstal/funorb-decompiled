/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cf extends dk {
    static bd[] field_u;
    static String field_r;
    static bd field_t;
    static bd[] field_q;
    static int field_s;

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param0) {
          si.a(0, 0, si.field_e, si.field_k, 0, 192);
          if (param2 <= 5) {
            field_u = (bd[]) null;
            lf.a((byte) 84, param0);
            return;
          }
          lf.a((byte) 84, param0);
          return;
        }
        si.d();
        if (param2 <= 5) {
          field_u = (bd[]) null;
          lf.a((byte) 84, param0);
          return;
        }
        lf.a((byte) 84, param0);
    }

    public static void a(boolean param0) {
        field_r = null;
        field_q = null;
        field_t = null;
        field_u = null;
        if (param0) {
          oc var2 = (oc) null;
          cf.a((oc) null, (byte) 67, -84, (oc) null);
        }
    }

    final static void d(int param0) {
        int var1;
        int var1Lifetime1;
        if (uh.field_m == null) {
          var1 = -33 % ((param0 + 22) / 61);
          ul.field_P = qm.b(1, 1);
          ph.field_F = qm.b(1, 2);
          ej.field_h = qm.b(1, 7);
          tk.field_a = qm.b(1, 3);
          vd.field_C = qm.b(1, 4);
          gi.field_h = qm.b(1, 5);
          bi.field_h = qm.b(1, 6);
          he.field_t = qm.b(1, 12);
          te.field_J = qm.b(1, 8);
          if (nl.field_c == 0) {
            sc.a((byte) 118);
          }
          if (wb.field_S <= 0) {
            ae.a(wd.field_a, 110, gb.field_a);
          }
          return;
        }
        ib.a(uh.field_m, (byte) 35);
        uh.field_m = null;
        ql.f(8036);
        var1Lifetime1 = -33 % ((param0 + 22) / 61);
        ul.field_P = qm.b(1, 1);
        ph.field_F = qm.b(1, 2);
        ej.field_h = qm.b(1, 7);
        tk.field_a = qm.b(1, 3);
        vd.field_C = qm.b(1, 4);
        gi.field_h = qm.b(1, 5);
        bi.field_h = qm.b(1, 6);
        he.field_t = qm.b(1, 12);
        te.field_J = qm.b(1, 8);
        if (nl.field_c == 0) {
          sc.a((byte) 118);
        }
        if (wb.field_S <= 0) {
          ae.a(wd.field_a, 110, gb.field_a);
        }
    }

    cf() {
    }

    final static void b(boolean param0) {
        if (fa.field_c == 10) {
          pf.b((byte) -64);
          fa.field_c = 11;
          tf.field_d = param0;
          return;
        }
        if (!wa.b(0)) {
          pf.b((byte) -64);
          fa.field_c = 11;
          tf.field_d = param0;
          return;
        }
        tf.field_d = param0;
    }

    final static void a(oc param0, byte param1, int param2, oc param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        oj var6 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6 = mm.field_m[param2];
          if (var6.field_w == 5) {
            var6.field_p = var6.field_p + 1;
            if (var6.field_p >= 8) {
              var6.field_p = 0;
              var6.field_z = var6.field_z + 1;
            }
            if (var6.field_z > 2) {
              var6.c((byte) 74);
              bn.a(3, var6);
            }
          } else {
            if (var6.field_I <= 0) {
              var6.field_z = 0;
              var6.field_w = 5;
              var6.e((byte) -49);
            } else {
              var6.field_p = var6.field_p + 2;
              if (var6.field_p >= var6.field_C) {
                var6.field_z = var6.field_z + 1;
                var6.field_p = 0;
              }
            }
          }
          if (param1 >= 42) {
            return;
          }
          field_u = (bd[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("cf.V(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_r = "Waiting for fonts";
        field_s = 0;
    }
}
