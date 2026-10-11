/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends ca {
    static int field_j;
    o field_f;
    o field_g;
    long field_h;
    static String field_i;

    final static void d(int param0) {
        bm.field_d.n(7920);
        if (na.field_c == null) {
          na.field_c = new ve(bm.field_d, bm.field_a);
        }
        if (param0 == -1) {
          bm.field_d.b((byte) 74, (pj) (na.field_c));
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 107 % ((param0 - 8) / 51);
    }

    final void c(int param0) {
        if (this.field_g == null) {
          return;
        }
        this.field_g.field_f = this.field_f;
        this.field_f.field_g = this.field_g;
        this.field_f = null;
        if (param0 == -1) {
          this.field_g = null;
          return;
        }
        String[] var3 = (String[]) null;
        o.a(5, (byte) -99, (java.applet.Applet) null, (String[]) null, 44, -56);
        this.field_g = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        te.field_O = 0;
        kk.field_S = param3;
        bk.field_e = param0;
        if (!b.a((byte) 112, kk.field_S)) {
          if (param1 != 2) {
            field_j = -61;
            return;
          }
          return;
        }
        int var4 = 0;
        if (kk.field_S == 7) {
          var4 = -1;
        }
        nc.field_cb[kk.field_S].a((byte) -108, var4, param2);
        if (kk.field_S != 7) {
          if (param1 != 2) {
            field_j = -61;
            return;
          }
          return;
        }
        vk.a(0, param2);
        if (param1 == 2) {
          return;
        }
        field_j = -61;
    }

    final static void a(int param0, byte param1, java.applet.Applet param2, String[] param3, int param4, int param5) {
        int var8 = 0;
        String var6 = null;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          lf.field_c = param2.getParameter("overxgames");
          if (lf.field_c == null) {
            lf.field_c = "0";
          }
          pl.field_a = param2.getParameter("overxachievements");
          if (pl.field_a == null) {
            pl.field_a = "0";
          }
          var6 = param2.getParameter("currency");
          if (var6 == null) {
            ml.field_j = 2;
          } else {
            if (!tk.a(10, (CharSequence) ((Object) var6))) {
              ml.field_j = 2;
            } else {
              ml.field_j = th.a(103, (CharSequence) ((Object) var6));
            }
          }
          hd.field_t = param0;
          var7 = -51 / ((param1 - 18) / 56);
          pl.field_d = param5;
          uh.field_a = param4;
          il.field_e = new hj[param3.length];
          for (var8 = 0; param3.length > var8; var8++) {
            il.field_e[var8] = new hj(317, 34);
          }
          tb.field_c = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_18_0 = var6_ref;
          stackIn_18_1 = new StringBuilder().append("o.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    protected o() {
    }

    static {
        field_i = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
