/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends sm {
    private float field_k;
    private int field_l;
    static String field_i;
    static String field_m;
    private float field_j;
    static String field_h;

    final static kk b(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != -20849) {
          field_m = (String) null;
        }
        js var8 = new js(pd.field_d, true, false, true, true);
        js var2 = var8;
        int var3 = pe.b(param1 + 20938, param0);
        int var4 = 127;
        for (var5 = 0; var5 < var2.field_i.length; var5++) {
          var6 = (var4 & var8.field_i[var5]) - 16;
          if (var6 < 0) {
            var6 = 0;
          }
          var2.field_i[var5] = (short)oe.c(var6, rn.a(~var4, var3));
        }
        return var2.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
    }

    final static boolean a(int param0, int param1) {
        fd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (bk.field_e == null) {
            return false;
          }
          if (param0 == bk.field_e.b(false)) {
            return false;
          }
          var2 = (fd) (bk.field_e.first((byte) 111));
          while (var2 != null) {
            var3 = var2.field_k;
            if (var3 == param1) {
              return true;
            }
            var2 = (fd) (bk.field_e.next((byte) 123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "ge.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = -4 / ((param0 + 67) / 49);
        super.b((byte) 111);
        this.field_j = 0.0f;
        this.field_k = 3.4028234663852886e+38f;
        this.field_l = 0;
    }

    ge(AiPlanner param0) {
        super(param0);
        this.field_k = 3.4028234663852886e+38f;
        this.field_j = 0.0f;
    }

    final jb a(byte param0) {
        Object var2_ref;
        jb var2_ref_jb;
        float var2;
        jb var3;
        int var4;
        jb var2_ref_jbLifetime1;
        var2_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_a.a(false)) {
          return null;
        }
        this.field_j = 0.0f;
        if (this.field_k < 1.0f) {
          var2_ref_jb = (jb) (this.field_a.first((byte) 102));
          while (var2_ref_jb != null) {
            var2_ref_jb.field_t = var2_ref_jb.field_t + (1.0f - this.field_k);
            var2_ref_jb = (jb) (this.field_a.next((byte) 123));
          }
          this.field_k = 1.0f;
        }
        if (param0 > -28) {
          this.field_j = 0.7643955945968628f;
        }
        var2_ref_jbLifetime1 = (jb) (this.field_a.first((byte) 94));
        while (var2_ref_jbLifetime1 != null) {
          this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jbLifetime1.field_t / this.field_k), 4.0));
          var2_ref_jbLifetime1 = (jb) (this.field_a.next((byte) 123));
        }
        var2 = (float)(Math.random() * (double)this.field_j);
        var3 = (jb) (this.field_a.first((byte) 116));
        while (var3 != null) {
          var2 = (float)((double)var2 - Math.pow((double)(var3.field_t / this.field_k), 4.0));
          if (var2 <= 0.0f) {
            return var3;
          }
          var3 = (jb) (this.field_a.next((byte) 123));
        }
        af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
        return null;
    }

    final void a(int param0, jb param1) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          if (param1.field_t < this.field_k) {
            this.field_k = param1.field_t;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ge.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 > -98) {
          ge.a(39, 60);
        }
        field_h = null;
        field_m = null;
        field_i = null;
    }

    static {
        field_i = "Type your password again to make sure it's correct";
        field_m = "Cancel";
    }
}
