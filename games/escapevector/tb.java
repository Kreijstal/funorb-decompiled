/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends r {
    static String[] field_G;
    private cn field_H;
    static String field_E;
    static boolean field_D;

    final bb n(int param0) {
        wf var2 = null;
        bb var3 = null;
        int var4 = 0;
        L0: {
          var4 = EscapeVector.field_A;
          var2 = new wf(((tb) this).field_H);
          if (param0 == 0) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        var3 = (bb) (Object) var2.c(param0 ^ 15);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3;
            } else {
              var3 = (bb) (Object) var2.a(59);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void p(int param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(((tb) this).field_H);
        if (param0 != 0) {
            return;
        }
        bb var3 = (bb) (Object) var2.c(15);
        while (var3 != null) {
            if (!(!var3.a((byte) -60))) {
                var3.c((byte) -47);
            }
            var3 = (bb) (Object) var2.a(30);
        }
    }

    final void l(int param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(((tb) this).field_H);
        bb var3 = (bb) (Object) var2.c(15);
        while (var3 != null) {
            var3.field_G = false;
            var3 = (bb) (Object) var2.a(25);
        }
        ((tb) this).field_C = null;
        if (param0 != 17415) {
            field_D = true;
        }
    }

    final hm j(int param0) {
        wf var2 = null;
        bb var3 = null;
        int var4 = 0;
        L0: {
          var4 = EscapeVector.field_A;
          var2 = new wf(((tb) this).field_H);
          var3 = (bb) (Object) var2.c(param0 ^ 15);
          if (param0 == 0) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_G) {
              var3 = (bb) (Object) var2.a(param0 + 36);
              continue L1;
            } else {
              return var3.a(true);
            }
          } else {
            return null;
          }
        }
    }

    final void b(hm param0, int param1) {
        bb var3 = null;
        try {
            if (!(param0 instanceof bb)) {
                throw new IllegalArgumentException();
            }
            var3 = (bb) (Object) param0;
            ((tb) this).field_H.a((hg) (Object) var3, 8364);
            if (param1 < 36) {
                ((tb) this).a(-45, (byte) -105, -25, -82);
            }
            var3.field_G = true;
            boolean discarded$0 = var3.a(-4659, (hm) this);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "tb.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean a(boolean param0) {
        return km.field_n != null && km.field_n.c(124);
    }

    public static void o(int param0) {
        field_G = null;
        field_E = null;
        if (param0 != 0) {
            tb.o(-104);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = EscapeVector.field_A;
        if (!(((tb) this).field_s == null)) {
            ((tb) this).field_s.a(param3, param0, -43, (hm) this, true);
        }
        wf var5 = new wf(((tb) this).field_H);
        hm var6 = (hm) (Object) var5.b(-31616);
        if (param1 < 85) {
            ((tb) this).field_H = null;
        }
        while (var6 != null) {
            var6.a(((tb) this).field_j + param0, (byte) 124, param2, ((tb) this).field_k + param3);
            var6 = (hm) (Object) var5.a((byte) 57);
        }
    }

    final void m(int param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(((tb) this).field_H);
        bb var3 = (bb) (Object) var2.c(15);
        while (var3 != null) {
            if (var3.j(-13907)) {
                var3.c((byte) -126);
            }
            var3 = (bb) (Object) var2.a(param0 ^ 91);
        }
        ((tb) this).field_C = (hm) (Object) ((tb) this).n(param0);
    }

    public tb() {
        super(0, 0, dm.field_h, r.field_B, (db) null, (wn) null);
        ((tb) this).field_H = new cn();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Please enter your age in years";
        field_D = false;
    }
}
