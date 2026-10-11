/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends jb {
    kg field_v;
    cp field_E;
    int field_D;
    int field_q;
    int field_o;
    int field_k;
    int field_j;
    int field_i;
    int field_x;
    int field_C;
    static int[] field_n;
    int field_l;
    int field_f;
    int field_m;
    int field_r;
    int field_z;
    static int field_g;
    int field_u;
    int field_y;
    dk field_A;
    int field_p;
    static String field_s;
    ko field_t;
    int field_w;
    static dl[] field_B;
    static ko field_h;

    final void d(int param0) {
        this.field_v = null;
        this.field_E = null;
        if (param0 == 12426) {
          this.field_t = null;
          this.field_A = null;
          return;
        }
        field_B = (dl[]) null;
        this.field_t = null;
        this.field_A = null;
    }

    final static void a(boolean param0, java.awt.Canvas param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (param2 != -59) {
            return;
          }
          if (eq.field_j < 10) {
            var3_int = 0;
            if (al.field_f) {
              var3_int = 1;
              al.field_f = false;
            }
            ud.a(rn.d(-3), param2 + 60, oo.e((byte) -110), cf.field_e, var3_int != 0);
            return;
          }
          if (!ji.f(250)) {
            kh.a();
            bc.a(240, param2 ^ -72, 320);
            bq.a(param1, 0, 0, 4);
            return;
          }
          if (0 != hp.field_s) {
            to.a(0, param1);
            return;
          }
          dc.a(param0, (byte) 107, false);
          bq.a(param1, 0, 0, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void e(int param0) {
        dj.field_t = false;
        ne.field_d = false;
        rc.a(-25537, -1);
        lc.field_c = tl.field_e;
        sg.field_b = tl.field_e;
        if (param0 >= -116) {
          field_s = (String) null;
        }
    }

    public static void a(int param0) {
        if (param0 > -106) {
          return;
        }
        field_s = null;
        field_B = null;
        field_n = null;
        field_h = null;
    }

    final static ef a(int param0, int param1, int param2, db param3, db param4) {
        RuntimeException var5 = null;
        ef stackIn_5_0 = null;
        ef stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gm.a(param3, param1, true, param0)) {
            return null;
          }
          if (param2 == -11) {
            stackIn_7_0 = tn.a(param4.b(param1, 0, param0), 0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ef) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    pl() {
    }

    static {
        field_n = new int[128];
        field_g = -1;
        field_s = "This is a very bored person.";
    }
}
