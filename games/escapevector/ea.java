/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private ed field_a;
    private int field_c;
    private gb field_h;
    private int field_e;
    static String field_i;
    private gb field_j;
    static om field_g;
    private gb field_k;
    static ed field_d;
    private int field_b;
    static ed field_f;

    final void a(int param0) {
        if (param0 == 256) {
          this.field_a.d(this.field_j.field_a, this.field_j.field_c, this.field_c);
          return;
        }
        ea.c((byte) -28);
        this.field_a.d(this.field_j.field_a, this.field_j.field_c, this.field_c);
    }

    final static ab a(byte[] param0, int param1) {
        ab var2 = null;
        RuntimeException var2_ref = null;
        ab stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_f = (ed) null;
          }
          if (param0 == null) {
            return null;
          }
          var2 = new ab(param0, gn.field_k, gi.field_e, qh.field_k, bc.field_a, qk.field_f, qe.field_a);
          of.a(false);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ea.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_i = null;
        field_d = null;
        if (param0 <= 114) {
          field_f = (ed) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final static int d(byte param0) {
        if (param0 > -95) {
          ea.b((byte) -6);
          return mh.field_f;
        }
        return mh.field_f;
    }

    final boolean e(byte param0) {
        if (param0 == -7) {
          return this.field_b >= this.field_e ? true : false;
        }
        field_i = (String) null;
        return this.field_b >= this.field_e ? true : false;
    }

    final void a(byte param0) {
        this.field_b = this.field_b + 1;
        if (param0 > 36) {
          if (this.e((byte) -7)) {
            this.field_b = this.field_e;
          }
          this.field_c = dc.a(256, this.field_e, 0, this.field_b, 64);
          this.field_j.field_a = dc.a(this.field_h.field_a, this.field_e, this.field_k.field_a, this.field_b, 64);
          this.field_j.field_c = dc.a(this.field_h.field_c, this.field_e, this.field_k.field_c, this.field_b, 64);
          return;
        }
        this.field_c = -19;
        if (this.e((byte) -7)) {
          this.field_b = this.field_e;
        }
        this.field_c = dc.a(256, this.field_e, 0, this.field_b, 64);
        this.field_j.field_a = dc.a(this.field_h.field_a, this.field_e, this.field_k.field_a, this.field_b, 64);
        this.field_j.field_c = dc.a(this.field_h.field_c, this.field_e, this.field_k.field_c, this.field_b, 64);
    }

    final static boolean c(byte param0) {
        int var2 = 0;
        mn var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        mn var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          var4 = (mn) (je.field_a.a(false));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 > -47) {
            return true;
          }
          for (var2 = 0; var1.field_i > var2; var2++) {
            if (var4.field_r[var2] != null &&
              0 == var4.field_r[var2].field_f) {
              return false;
            }
            if (null != var4.field_p[var2] &&
              var4.field_p[var2].field_f == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ea.D(" + param0 + ')');
        }
    }

    ea(gb param0, gb param1, ed param2, int param3) {
        this.field_c = 0;
        this.field_b = 0;
        try {
          this.field_h = param1;
          this.field_a = param2;
          this.field_k = param0;
          this.field_e = param3;
          this.field_j = this.field_k.a(10);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_i = "M";
        field_g = new om(9, 0, 4, 1);
        field_d = new ed(270, 70);
    }
}
