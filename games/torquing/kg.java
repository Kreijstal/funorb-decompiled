/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private sg field_d;
    private int field_b;
    static nh field_c;
    pj field_a;

    final static boolean a(int[] param0, byte param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ai var4_ref_ai = null;
        int var4 = 0;
        ai var5 = null;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          if (ef.field_a != w.field_cb) {
            return false;
          }
          var2_long = km.b(-1);
          if (param1 != 21) {
            return false;
          }
          if (wh.field_x != 0 &&
            im.field_E < 0) {
            var4_ref_ai = (ai) (qe.field_c.b(param1 - 21));
            if (var4_ref_ai != null &&
              var4_ref_ai.field_n < var2_long) {
              var4_ref_ai.f(0);
              oo.field_a = var4_ref_ai.field_k.length;
              kj.field_d.field_n = 0;
              for (var5_int = 0; var5_int < oo.field_a; var5_int++) {
                kj.field_d.field_j[var5_int] = var4_ref_ai.field_k[var5_int];
              }
              mm.field_d = eb.field_f;
              eb.field_f = wk.field_h;
              wk.field_h = fa.field_e;
              fa.field_e = var4_ref_ai.field_j;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("kg.C(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
        stackIn_20_0 = im.field_E;
        try {
          while (true) {
            if (stackIn_20_0 < 0) {
              kj.field_d.field_n = 0;
              if (!no.a(1, param1 - 21)) {
                return false;
              }
              im.field_E = kj.field_d.a(true);
              kj.field_d.field_n = 0;
              oo.field_a = param0[im.field_E];
            }
            if (!ah.a(param1 ^ 23)) {
              return false;
            }
            if (wh.field_x == 0) {
              mm.field_d = eb.field_f;
              eb.field_f = wk.field_h;
              wk.field_h = fa.field_e;
              fa.field_e = im.field_E;
              im.field_E = -1;
              return true;
            }
            var4 = wh.field_x;
            if (0.0 != u.field_s) {
              var4 = (int)((double)var4 + sa.field_d.nextGaussian() * u.field_s);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new ai((long)var4 + var2_long, im.field_E, new byte[oo.field_a]);
            for (var6 = 0; oo.field_a > var6; var6++) {
              var5.field_k[var6] = kj.field_d.field_j[var6];
            }
            qe.field_c.a((byte) 54, var5);
            im.field_E = -1;
            stackIn_20_0 = im.field_E;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("kg.C(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        ul.field_e = new ei();
        if (param0 < 81) {
          field_c = (nh) null;
        }
    }

    final void a(boolean param0) {
        short dupTemp$0 = 0;
        if (this.field_a != null) {
          dupTemp$0 = (short)(this.field_a.field_z[0] + 1);
          this.field_a.field_z[0] = dupTemp$0;
          if (dupTemp$0 % 16 == 0) {
            this.field_a = null;
            this.field_d.d(this.field_b);
          }
        }
        if (!param0) {
          field_c = (nh) null;
        }
    }

    kg(sg param0, int param1, int param2) {
        rm var4 = null;
        kh var5 = null;
        try {
          this.field_b = param1;
          this.field_d = param0;
          var4 = new rm(1, 1, 0);
          var4.a(0, 0, 0);
          var4.a(0, 0, 0, (byte) 0, (byte) 0, (short)param2, (short) -1);
          this.field_a = (pj) (var4.a(80, 1365, -1, -12, 12));
          this.field_a.field_z[0] = (short)param2;
          var5 = new kh();
          var5.field_k = this.field_a;
          param0.a(param1, var5);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0) {
        if (b.field_x < 2) {
          return 0;
        }
        if (0 == sn.field_i) {
          if (!lp.field_a.a(-12749)) {
            return 20;
          }
          if (!lp.field_a.a(true, "commonui")) {
            return 40;
          }
          if (!eg.field_v.a(-12749)) {
            return 50;
          }
          if (!eg.field_v.a(true, "commonui")) {
            return 60;
          }
          if (!kb.field_a.a(-12749)) {
            return 70;
          }
          if (!kb.field_a.c(-19375)) {
            return 80;
          }
        } else {
          if (je.field_f != null) {
            if (!je.field_f.a(-12749)) {
              return 14;
            }
            if (!je.field_f.b((byte) -37, "")) {
              return 29;
            }
            if (!je.field_f.a(true, "")) {
              return 29;
            }
          }
          if (!lp.field_a.a(-12749)) {
            return 43;
          }
          if (!lp.field_a.a(true, "commonui")) {
            return 57;
          }
          if (!eg.field_v.a(-12749)) {
            return 71;
          }
          if (!eg.field_v.a(true, "commonui")) {
            return 80;
          }
          if (!kb.field_a.a(-12749)) {
            return 82;
          }
          if (!kb.field_a.c(param0 - 19424)) {
            return 86;
          }
        }
        if (param0 != 49) {
          kg.a(49);
        }
        return 100;
    }

    public static void b(byte param0) {
        if (param0 != -64) {
          int[] var2 = (int[]) null;
          kg.a((int[]) null, (byte) 104);
        }
        field_c = null;
    }

    static {
    }
}
