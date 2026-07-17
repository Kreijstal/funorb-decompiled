/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ff extends qa {
    static int field_s;
    static String field_u;
    static ca field_r;
    static String field_q;
    ff field_v;
    ff field_w;
    static String field_t;

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = bl.c(-42);
        if (param0 != -4604) {
          field_t = null;
          var2 = ii.b((byte) -126);
          qf.field_c.a(-ic.field_g + eb.field_M, ch.field_i - e.field_a, (e.field_a << 1) + var1, var2 - -(ic.field_g << 1), 12018);
          up.b(-125);
          return;
        } else {
          var2 = ii.b((byte) -126);
          qf.field_c.a(-ic.field_g + eb.field_M, ch.field_i - e.field_a, (e.field_a << 1) + var1, var2 - -(ic.field_g << 1), 12018);
          up.b(-125);
          return;
        }
    }

    final void c(byte param0) {
        if (null != ((ff) this).field_w) {
          if (param0 != -70) {
            ff.f(-48);
            ((ff) this).field_w.field_v = ((ff) this).field_v;
            ((ff) this).field_v.field_w = ((ff) this).field_w;
            ((ff) this).field_w = null;
            ((ff) this).field_v = null;
            return;
          } else {
            ((ff) this).field_w.field_v = ((ff) this).field_v;
            ((ff) this).field_v.field_w = ((ff) this).field_w;
            ((ff) this).field_w = null;
            ((ff) this).field_v = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        uk.field_S = param0;
        if (wd.field_L != null) {
          L0: {
            wd.field_L.a(param0, (byte) 116);
            var2 = 8 % ((-28 - param1) / 48);
            if (ra.field_m != null) {
              ra.field_m.a(param0, 18813);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var2 = 8 % ((-28 - param1) / 48);
            if (ra.field_m != null) {
              ra.field_m.a(param0, 18813);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    protected ff() {
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        vg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 126) {
                break L1;
              } else {
                ff.a(-116, -3);
                break L1;
              }
            }
            var4 = (vg) (Object) ag.field_i.c(param0 + -74);
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                vi.a(7, var4, (byte) -123);
                var4 = (vg) (Object) ag.field_i.b(6);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ff.IA(" + param0 + 44 + 7 + 41);
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_u = null;
        field_t = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Auto-respond to <%0>";
        field_q = "Extra knowledge is extra power. Get yourself yet another powerup slot with this trait.";
        field_t = "Create unrated game";
    }
}
