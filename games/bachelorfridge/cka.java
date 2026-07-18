/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cka extends ana {
    static kv field_y;
    private ps field_v;
    static String field_x;
    static String field_w;

    private final void f() {
        pp var3 = null;
        ad var4 = null;
        int var5 = 0;
        aga var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((cka) this).field_v.field_l.a(9, ((cka) this).field_q.field_h);
        if (var6.i(89)) {
          return;
        } else {
          var3 = (pp) (Object) ((cka) this).field_v.field_o.b((byte) 90);
          oha discarded$1 = al.a(-121, ((cka) this).field_v.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                var3.a(var6, ((cka) this).field_q.field_h, 12);
                if (!(var3 instanceof iv)) {
                  break L1;
                } else {
                  var4 = var3.field_h.a(-27449, ((cka) this).field_q);
                  ((cka) this).a(27799, (at) (Object) new taa(((cka) this).field_q, var4));
                  ((cka) this).a(27799, (at) (Object) new iu(67, 256));
                  ((cka) this).a(27799, (at) (Object) new cb(var4, 19));
                  ((cka) this).a(27799, (at) (Object) new wn(var4, kna.field_g[35], 24831));
                  break L1;
                }
              }
              var3 = (pp) (Object) ((cka) this).field_v.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    cka(gj param0, ps param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((cka) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_y = null;
        field_w = null;
        field_x = null;
        if (param0 != -26) {
            cka.d(109);
        }
    }

    private final void e() {
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = ((cka) this).field_l - 1;
        ((cka) this).field_l = ((cka) this).field_l - 1;
        if (!(-1 < fieldTemp$0)) {
            if (-26 == ((cka) this).field_l) {
                int discarded$1 = -109;
                this.f();
                return false;
            }
            return false;
        }
        int var2 = 125 % ((71 - param0) / 47);
        int discarded$2 = 107;
        this.e();
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_w = "RESIGNED";
    }
}
