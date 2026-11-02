/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static rc field_b;
    static IntrusiveDeque field_a;
    static o[] field_c;

    final static ClientException a(Throwable param0, String param1) {
        ClientException var2 = null;
        if (!(param0 instanceof ClientException)) {
          var2 = new ClientException(param0, param1);
        } else {
          var2 = (ClientException) ((Object) param0);
          var2.field_b = var2.field_b + ' ' + param1;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 < 20) {
          return true;
        }
        if (DelegatingCanvas.field_c == -1) {
          if (!hc.a(1, -28266)) {
            return false;
          }
          DelegatingCanvas.field_c = nk.field_N.f(255);
          nk.field_N.position = 0;
        }
        if (DelegatingCanvas.field_c == -2) {
          if (hc.a(2, -28266)) {
            DelegatingCanvas.field_c = nk.field_N.j(-14477);
            nk.field_N.position = 0;
            return hc.a(DelegatingCanvas.field_c, -28266);
          }
          return false;
        }
        return hc.a(DelegatingCanvas.field_c, -28266);
    }

    public static void c(int param0) {
        if (param0 == 1) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        String var2 = (String) null;
        bd.a((Throwable) null, (String) null);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        kc.field_H = jl.c(4);
        u.field_A = new wi();
        if (param0 <= -26) {
          di.a(true, true, 117);
          return;
        }
        field_b = (rc) null;
        di.a(true, true, 117);
    }

    static {
        field_b = new rc();
    }
}
