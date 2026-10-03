/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends ee implements pl {
    private String[] field_C;
    private hk[] field_I;
    private ta field_J;
    static qg field_D;
    static dm[] field_H;
    static dm field_G;
    static String field_E;

    final static na a(int param0, rh param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        rh var5 = null;
        Object stackIn_2_0 = null;
        na stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mf.a(param0, param2, 123, param1)) {
            stackIn_2_0 = null;
            return (na) (stackIn_2_0);
          }
          if (!param3) {
            var5 = (rh) null;
            vh.a(110, (rh) null, -39, true);
          }
          stackIn_6_0 = ab.a(104);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -68) {
          field_G = (dm) null;
        }
        stackIn_6_0 = (oc.field_e != null) && (pk.field_l.a(true));
        return stackIn_6_0;
    }

    final static String f(int param0) {
        if (param0 != 100) {
            vh.f(29);
        }
        if (kd.field_b == tf.field_d) {
            return rh.field_i;
        }
        if (!ih.field_c.a(-113)) {
            return ih.field_c.b(param0 + 19391);
        }
        if (si.field_g == tf.field_d) {
            return ih.field_c.b(19491);
        }
        return b.field_a;
    }

    public static void b(boolean param0) {
        field_H = null;
        field_D = null;
        if (!param0) {
            field_H = (dm[]) null;
        }
        field_E = null;
        field_G = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 88, param3);
        if (!(param3 == 0)) {
            return;
        }
        m var5 = ng.field_F;
        int var6 = -69 / ((1 - param2) / 43);
        if (!(this.field_C == null)) {
            var5.a(ab.field_e, this.field_v + param0, param1 + this.field_m, this.field_r, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_o);
        }
    }

    vh(ta param0) {
        super(0, 0, 0, 0, (dh) null);
        try {
            this.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            field_E = (String) null;
          }
          if (super.a(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_8_0 = this.a(7305, param3);
            return stackIn_8_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_11_0 = this.a(param3, -110);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("vh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Geoblox.field_C;
        try {
          if (param1 != -20) {
            return;
          }
          for (var6_int = 0; this.field_C.length > var6_int; var6_int++) {
            if (this.field_I[var6_int] == param4) {
              this.field_J.a(this.field_C[var6_int], 20);
            }
          }
          if (this.field_I[this.field_C.length] == param4) {
            this.field_J.a((byte) 83);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(byte param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        fh var4 = null;
        int var6 = 0;
        var6 = Geoblox.field_C;
        try {
          this.field_z.c((byte) -98);
          if (param0 != 126) {
            return;
          }
          if ((param1 != null) &&
              (param1.length != 0)) {
            var3_int = param1.length;
            this.field_C = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_C[var4_int] = p.a((CharSequence) ((Object) param1[var4_int]), param0 - 123).replace(' ', ' ');
            }
            var4 = new fh(ng.field_F, 0, 1);
            this.field_I = new hk[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_I[var5] = new hk(this.field_C[var5], (bb) (this));
              this.field_I[var5].field_q = (dh) ((Object) var4);
              this.field_I[var5].field_j = ml.field_u;
              this.field_I[var5].a(15, 80, (byte) -14, var5 * 16 + 20, 0);
              this.b((byte) -126, this.field_I[var5]);
            }
            this.field_I[var3_int] = new hk(ll.field_a, (bb) (this));
            this.field_I[var3_int].field_q = (dh) ((Object) var4);
            this.field_I[var3_int].a(15, 100, (byte) -59, 16 + (var3_int * 16 + 20), 0);
            this.b((byte) -122, this.field_I[var3_int]);
            return;
          }
          this.field_C = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("vh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_D = new qg(0);
        field_E = "Welcome to Geoblox, a game where you earn points for matching geoblox by shape or colour. Just make sure you don't allow your falling geoblox to get out of control and stack outside of the play area!<br><br>To play Geoblox, you need to rotate the play area by pressing and holding the <img=0> or <img=1> arrow keys. Press <img=2> and then experiment with left and right rotation until the next tip comes up. Press <img=2> to continue.";
    }
}
