/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cka extends ana {
    static kv field_y;
    private ps field_v;
    static String field_x;
    static String field_w;

    private final void f(byte param0) {
        Object var3 = null;
        pp var3_ref = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        L0: {
          var3 = null;
          var5 = BachelorFridge.field_y;
          var6 = ((cka) this).field_v.field_l.a(9, ((cka) this).field_q.field_h);
          if (param0 < -47) {
            break L0;
          } else {
            cka.d(-41);
            break L0;
          }
        }
        if (var6.i(89)) {
          return;
        } else {
          var3_ref = (pp) (Object) ((cka) this).field_v.field_o.b((byte) 90);
          oha discarded$1 = al.a(-121, ((cka) this).field_v.field_k);
          L1: while (true) {
            if (var3_ref == null) {
              return;
            } else {
              L2: {
                var3_ref.a(var6, ((cka) this).field_q.field_h, 12);
                if (!(var3_ref instanceof iv)) {
                  break L2;
                } else {
                  var7 = var3_ref.field_h.a(-27449, ((cka) this).field_q);
                  ((cka) this).a(27799, (at) (Object) new taa(((cka) this).field_q, var7));
                  ((cka) this).a(27799, (at) (Object) new iu(67, 256));
                  ((cka) this).a(27799, (at) (Object) new cb(var7, 19));
                  ((cka) this).a(27799, (at) (Object) new wn(var7, kna.field_g[35], 24831));
                  break L2;
                }
              }
              var3_ref = (pp) (Object) ((cka) this).field_v.field_o.c(0);
              continue L1;
            }
          }
        }
    }

    cka(gj param0, ps param1) {
        super(param0, (bca) (Object) param1);
        ((cka) this).field_v = param1;
    }

    public static void d(int param0) {
        field_y = null;
        field_w = null;
        field_x = null;
        if (param0 != -26) {
            cka.d(109);
        }
    }

    private final void e(byte param0) {
        if (param0 < 83) {
            boolean discarded$0 = ((cka) this).c((byte) 86);
        }
    }

    final boolean c(byte param0) {
        ((cka) this).field_l = ((cka) this).field_l - 1;
        if (!(-1 < ((cka) this).field_l - 1)) {
            if (-26 == ((cka) this).field_l) {
                this.f((byte) -109);
                return false;
            }
            return false;
        }
        int var2 = 125 % ((71 - param0) / 47);
        this.e((byte) 107);
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
