/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    private int field_e;
    static ta field_c;
    private al field_b;
    static String[] field_f;
    private al[] field_a;
    static String field_d;
    static int field_g;
    private long field_h;

    final void a(long param0, boolean param1, al param2) {
        al var5 = null;
        try {
            if (!(null == param2.field_q)) {
                param2.a((byte) -105);
            }
            var5 = ((om) this).field_a[(int)(param0 & (long)(-1 + ((om) this).field_e))];
            param2.field_t = var5;
            if (!param1) {
                Object var6 = null;
                ((om) this).a(23L, true, (al) null);
            }
            param2.field_q = var5.field_q;
            param2.field_q.field_t = param2;
            param2.field_t.field_q = param2;
            param2.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "om.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        ik.field_N = null;
        cg.field_C = false;
        ce.field_c = null;
        oe.field_g = null;
        field_f = null;
    }

    final al a(int param0, long param1) {
        al var4 = null;
        al var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        ((om) this).field_h = param1;
        var4 = ((om) this).field_a[(int)((long)(((om) this).field_e + -1) & param1)];
        ((om) this).field_b = var4.field_t;
        if (param0 == -7895) {
          L0: while (true) {
            if (var4 != ((om) this).field_b) {
              if (~((om) this).field_b.field_p != ~param1) {
                ((om) this).field_b = ((om) this).field_b.field_t;
                continue L0;
              } else {
                var5 = ((om) this).field_b;
                ((om) this).field_b = ((om) this).field_b.field_t;
                return var5;
              }
            } else {
              ((om) this).field_b = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        tm var2 = (tm) (Object) ok.field_b.b(94);
        if (!(var2 == null)) {
            var2.b((byte) 94);
        }
        var2 = (tm) (Object) ec.field_c.b(117);
        if (!(var2 == null)) {
            var2.b((byte) 94);
        }
    }

    final al c(int param0) {
        al var2 = null;
        al var3 = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (((om) this).field_b != null) {
          var2 = ((om) this).field_a[(int)(((om) this).field_h & (long)(((om) this).field_e - param0))];
          L0: while (true) {
            if (((om) this).field_b != var2) {
              if (((om) this).field_b.field_p != ((om) this).field_h) {
                ((om) this).field_b = ((om) this).field_b.field_t;
                continue L0;
              } else {
                var3 = ((om) this).field_b;
                ((om) this).field_b = ((om) this).field_b.field_t;
                return var3;
              }
            } else {
              ((om) this).field_b = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 == 0) {
            return;
        }
        field_d = null;
    }

    om(int param0) {
        int var2 = 0;
        al var3 = null;
        ((om) this).field_a = new al[param0];
        ((om) this).field_e = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            al dupTemp$2 = new al();
            var3 = dupTemp$2;
            ((om) this).field_a[var2] = dupTemp$2;
            var3.field_t = var3;
            var3.field_q = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Crampons: Grants grip on ice.";
    }
}
