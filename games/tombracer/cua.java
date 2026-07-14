/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cua {
    static String[] field_b;
    private cka field_a;
    long field_c;

    public static void a(int param0) {
        if (param0 != 3) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        kh var4 = null;
        if (param1 != 3) {
            return;
        }
        if (rda.field_o == param0) {
            return;
        }
        ht var6 = (ht) (Object) jb.field_K.a(-115, (long)rda.field_o);
        ht var7 = var6;
        rda.field_o = param0;
        if (var7 != null) {
            var7.field_Cb = null;
        } else {
            var4 = ql.field_k;
            var4.k(param2, param1 ^ -2985);
            var4.i(3, param1 + -3);
            var4.i(11, 0);
            var4.f(-1477662136, param0);
            return;
        }
        var4 = ql.field_k;
        var4.k(param2, param1 ^ -2985);
        var4.i(3, param1 + -3);
        var4.i(11, 0);
        var4.f(-1477662136, param0);
    }

    final static void a(ht param0, byte param1) {
        ht var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        param0.p(17);
        var2 = (ht) (Object) asa.field_j.f(-80);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a(param0, 71)) {
              var2 = (ht) (Object) asa.field_j.e(113);
              continue L0;
            } else {
              if (var2 != null) {
                ln.a((vg) (Object) var2, (vg) (Object) param0, (byte) -120);
                var3 = 27 % ((-29 - param1) / 55);
                return;
              } else {
                asa.field_j.b((byte) -59, (vg) (Object) param0);
                var3 = 27 % ((-29 - param1) / 55);
                return;
              }
            }
          } else {
            if (var2 != null) {
              ln.a((vg) (Object) var2, (vg) (Object) param0, (byte) -120);
              var3 = 27 % ((-29 - param1) / 55);
              return;
            } else {
              asa.field_j.b((byte) -59, (vg) (Object) param0);
              var3 = 27 % ((-29 - param1) / 55);
              return;
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        cc.a(37, param1, "");
        if (param0 > -16) {
            return;
        }
        nt.a(param1, -1978);
    }

    protected final void finalize() throws Throwable {
        ((cua) this).field_a.a((byte) -105, ((cua) this).field_c);
        super.finalize();
    }

    cua(cka param0, long param1, fca[] param2) {
        ((cua) this).field_c = param1;
        ((cua) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
