/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    private fa field_f;
    private fa field_i;
    private fa[] field_g;
    static String field_d;
    static sb field_c;
    private int field_e;
    static String field_h;
    private int field_a;
    static String field_b;

    final fa a(int param0, long param1) {
        fa var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != -25484) {
          byte[] var7 = (byte[]) null;
          nl.a((pc) null, (byte[]) null, -80, 17);
        }
        fa var4 = this.field_g[(int)(param1 & (long)(this.field_a - 1))];
        this.field_i = var4.field_a;
        while (var4 != this.field_i) {
          if (~this.field_i.field_e == ~param1) {
            var5 = this.field_i;
            this.field_i = this.field_i.field_a;
            return var5;
          }
          this.field_i = this.field_i.field_a;
        }
        this.field_i = null;
        return null;
    }

    final fa a(byte param0) {
        if (param0 > -95) {
          return (fa) null;
        }
        this.field_e = 0;
        return this.a(54);
    }

    final static void a(boolean param0, int param1) {
        nd.field_b = param0 ? new wo(ch.field_H, an.field_a) : new wo(fb.field_Gb, vd.field_a);
        ff.field_h = new ak(0L, (ak) null);
        if (param1 >= -68) {
          nl.b(-102);
        }
        ff.field_h.a(nd.field_b.field_g, (byte) 26);
        ff.field_h.a(gk.field_kb, (byte) 26);
        ra.field_e = new ak(0L, cm.field_o);
        kh.field_a = new ak(0L, (ak) null);
        ra.field_e.a(ih.field_g, (byte) 26);
        ra.field_e.a(kh.field_a, (byte) 26);
        kh.field_a.a(oc.field_O, (byte) 26);
        kh.field_a.a(hb.field_eb, (byte) 26);
        hn.a((byte) 32, param0);
    }

    final static byte[] a(pc param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (param3 < 59) {
            var9 = (byte[]) null;
            nl.a((pc) null, (byte[]) null, 62, -90);
          }
          var4_int = param0.c(param2, (byte) -34);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          var5 = param0.c(3, (byte) -34);
          var6 = (byte)param0.c(8, (byte) -34);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)(param0.c(var5, (byte) -34) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("nl.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, int param1, fa param2) {
        fa var5 = null;
        try {
          if (param1 <= 120) {
            this.a(-40);
          }
          if (param2.field_h != null) {
            param2.c(2779);
          }
          var5 = this.field_g[(int)(param0 & (long)(-1 + this.field_a))];
          param2.field_h = var5.field_h;
          param2.field_a = var5;
          param2.field_h.field_a = param2;
          param2.field_e = param0;
          param2.field_a.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nl.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        rd.a(param1, -17130, false);
        if (param0 != 0) {
          nl.a(-72, false);
        }
    }

    final static int a(boolean param0) {
        if (hf.field_q < 2) {
          return 0;
        }
        if (wo.field_d == 0) {
          if (!wk.field_j.b(-3)) {
            return 20;
          }
          if (!wk.field_j.a("commonui", -1)) {
            return 40;
          }
          if (!io.field_g.b(-3)) {
            return 50;
          }
          if (!io.field_g.a("commonui", -1)) {
            return 60;
          }
          if (!qo.field_u.b(-3)) {
            return 70;
          }
          if (!qo.field_u.a((byte) 92)) {
            return 80;
          }
        } else {
          if (null != hn.field_e) {
            if (!hn.field_e.b(-3)) {
              return 14;
            }
            if (!hn.field_e.b(127, "")) {
              return 29;
            }
            if (!hn.field_e.a("", -1)) {
              return 29;
            }
          }
          if (!wk.field_j.b(-3)) {
            return 43;
          }
          if (!wk.field_j.a("commonui", -1)) {
            return 57;
          }
          if (!io.field_g.b(-3)) {
            return 71;
          }
          if (!io.field_g.a("commonui", -1)) {
            return 80;
          }
          if (!qo.field_u.b(-3)) {
            return 82;
          }
          if (!qo.field_u.a((byte) 92)) {
            return 86;
          }
        }
        if (!param0) {
          return 100;
        }
        return 35;
    }

    nl(int param0) {
        int var2 = 0;
        fa dupTemp$0 = null;
        fa var3 = null;
        this.field_e = 0;
        this.field_g = new fa[param0];
        this.field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new fa();
          var3 = dupTemp$0;
          this.field_g[var2] = dupTemp$0;
          var3.field_h = var3;
          var3.field_a = var3;
        }
    }

    final fa a(int param0) {
        int fieldTemp$0 = 0;
        fa var2_ref_fa;
        int var2;
        int var3;
        fa var4;
        var3 = Pixelate.field_H ? 1 : 0;
        if (this.field_e > 0 &&
          this.field_g[-1 + this.field_e] != this.field_f) {
          var2_ref_fa = this.field_f;
          this.field_f = var2_ref_fa.field_a;
          return var2_ref_fa;
        }
        do {
          if (this.field_a <= this.field_e) {
            var2 = -114 / ((-79 - param0) / 36);
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var4 = this.field_g[fieldTemp$0].field_a;
          var2_ref_fa = var4;
        } while (var4 == this.field_g[-1 + this.field_e]);
        this.field_f = var2_ref_fa.field_a;
        return var2_ref_fa;
    }

    public static void b(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_c = null;
        int var1 = -16 / ((-56 - param0) / 32);
    }

    static {
        field_h = "Asking to join <%0>'s game...";
        field_d = "Auto-respond to <%0>";
        field_b = "This game option is only available to members.";
    }
}
