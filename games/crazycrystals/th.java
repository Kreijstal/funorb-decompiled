/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends om {
    static String[] field_A;
    static volatile int field_y;
    int field_z;

    public th() {
        super(0, 0, 0, 0, (wo) null, (bi) null);
        ((th) this).field_z = 256;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        dl var6 = null;
        if (param3 == 0) {
          if (((th) this).field_w == null) {
            return;
          } else {
            if (((th) this).field_z == 0) {
              return;
            } else {
              if (((th) this).field_z != 256) {
                var6 = new dl(((th) this).field_w.field_g, ((th) this).field_w.field_f);
                if (param1 > -12) {
                  ((th) this).a(75, (byte) 112, 48, 106);
                  em.a((byte) 38, var6);
                  ((th) this).field_w.a(0, (byte) -121, 0, param3);
                  lg.a(1);
                  var6.f(((th) this).field_r + param2, param0 + ((th) this).field_j, ((th) this).field_z);
                  return;
                } else {
                  em.a((byte) 38, var6);
                  ((th) this).field_w.a(0, (byte) -121, 0, param3);
                  lg.a(1);
                  var6.f(((th) this).field_r + param2, param0 + ((th) this).field_j, ((th) this).field_z);
                  return;
                }
              } else {
                ((th) this).field_w.a(param0 + ((th) this).field_j, (byte) -45, ((th) this).field_r + param2, param3);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        hd.field_b = kb.field_f[param0];
        jg.field_h = ck.field_fb[param0];
        ge.field_a = gk.field_k[param0];
    }

    th(qm param0) {
        super(param0.field_r, param0.field_j, param0.field_g, param0.field_f, (wo) null, (bi) null);
        try {
            param0.a(((th) this).field_f, 0, 0, ((th) this).field_g, (byte) -52);
            ((th) this).field_w = param0;
            ((th) this).field_z = 256;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "th.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void h(int param0) {
        field_A = null;
        if (param0 != -13117) {
            field_y = -61;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[255];
        field_y = 0;
    }
}
