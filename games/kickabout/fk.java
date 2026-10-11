/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends hs {
    private boolean field_l;
    static String[] field_j;
    static int[] field_k;

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var3_int = 1;
          while (param2 > 1) {
            if ((1 & param2) != 0) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
          }
          if (param1 != -11934) {
            fk.f(-39);
          }
          if (param2 != 1) {
            return var3_int;
          }
          stackIn_11_0 = var3_int * param0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "fk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void f(int param0, int param1) {
        if (param0 < 98) {
          this.field_l = true;
        }
    }

    final void e(int param0) {
        this.c(112);
        this.a(false, vo.$cfr$intArgs$a$53ce4ab4c593(-18, mc.field_e, new String[]{h.field_b[this.field_a.field_t][this.field_a.field_m]}));
        this.b(param0 - 2352, this.field_a.field_v);
        this.a(150, 17709);
        if (param0 != 1) {
          this.e(-98);
          if (this.field_a.field_f) {
            un.field_d.a("FB", 5, 17, 16777215, -1);
            return;
          }
          return;
        }
        if (!this.field_a.field_f) {
          return;
        }
        un.field_d.a("FB", 5, 17, 16777215, -1);
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != 1) {
          fk.b(76, -73, -121);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -92) {
          return;
        }
        if (!param1) {
          return;
        }
        if (!this.field_l) {
          or.field_d.b(75, (byte) 74);
          or.field_d.a(121, 4);
          this.field_l = true;
          return;
        }
    }

    fk(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        this.field_l = false;
    }

    static {
        field_j = new String[]{"Current Bid:", "Buyout", "Time Left:"};
        field_k = new int[8192];
    }
}
