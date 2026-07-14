/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bb extends uh {
    static String field_g;
    private long field_m;
    static kl field_h;
    static String field_j;
    static int field_k;
    static String field_l;
    private String field_i;

    sd a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ud.field_c;
    }

    public static void c(int param0) {
        field_g = null;
        field_j = null;
        if (param0 != 24957) {
            return;
        }
        field_l = null;
        field_h = null;
    }

    final static void a(int param0, int param1, byte param2, qj param3) {
        ii.field_c = param0;
        if (param2 != -13) {
            field_k = 125;
            ic.field_c = param1;
            tl.field_c = param3;
            return;
        }
        ic.field_c = param1;
        tl.field_c = param3;
    }

    final static void b(byte param0) {
        if (!oa.a(param0 ^ 25325)) {
            return;
        }
        le.a(false, 4, 15991);
        if (param0 != -100) {
            bb.b((byte) 126);
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        var3 = hg.a(param0, (byte) -118, param2);
        if (var3 != null) {
          return var3;
        } else {
          var4 = param1;
          L0: while (true) {
            if (param0.length() > var4) {
              if (df.a(param0.charAt(var4), true)) {
                var4++;
                continue L0;
              } else {
                return nk.field_Q;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void b(int param0) {
        ei var1 = null;
        var1 = (ei) (Object) lh.field_b.c(8192);
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          ed.a(var1.field_q, var1.field_v, var1.field_o);
          ed.c(var1.field_r, var1.field_u, var1.field_s, var1.field_p);
          var1.field_q = null;
          qa.field_q.a((wl) (Object) var1, false);
          if (param0 != 4) {
            bb.b((byte) -18);
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, va param1) {
        param1.b(param0 + 1290648724, ((bb) this).field_m);
        param1.a(((bb) this).field_i, -66);
        if (param0 != 4) {
            Object var4 = null;
            ((bb) this).a(-43, (va) null);
        }
    }

    bb(long param0, String param1) {
        ((bb) this).field_m = param0;
        ((bb) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "STARPOWER";
        field_l = "Name";
    }
}
