/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private mc field_a;
    static db field_g;
    private mc field_b;
    static String field_c;
    static float field_h;
    private int field_f;
    private int field_i;
    private mc[] field_e;
    static String field_d;

    public static void a(byte param0) {
        if (param0 != 38) {
          return;
        }
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          if (param0 <= 53) {
            field_d = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-var4 + (var2_int - 1)] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("dj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final mc a(long param0, byte param1) {
        mc var5 = null;
        int var6 = TetraLink.field_J;
        mc var4 = this.field_e[(int)(param0 & (long)(-1 + this.field_f))];
        this.field_a = var4.field_j;
        while (var4 != this.field_a) {
          if (~param0 == ~this.field_a.field_c) {
            var5 = this.field_a;
            this.field_a = this.field_a.field_j;
            return var5;
          }
          this.field_a = this.field_a.field_j;
        }
        if (param1 == -43) {
          this.field_a = null;
          return null;
        }
        return (mc) null;
    }

    final mc b(int param0) {
        this.field_i = 0;
        if (param0 < 21) {
          return (mc) null;
        }
        return this.a(-1);
    }

    final void a(long param0, int param1, mc param2) {
        mc var5 = null;
        try {
          if (param2.field_e != null) {
            param2.b(false);
          }
          var5 = this.field_e[(int)((long)(this.field_f - 1) & param0)];
          if (param1 > -48) {
            this.field_e = (mc[]) null;
          }
          param2.field_j = var5;
          param2.field_e = var5.field_e;
          param2.field_e.field_j = param2;
          param2.field_c = param0;
          param2.field_j.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "dj.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final mc a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        mc var2;
        int var3;
        var3 = TetraLink.field_J;
        if (param0 == -1) {
          if (0 < this.field_i &&
            this.field_e[this.field_i - 1] != this.field_b) {
            var2 = this.field_b;
            this.field_b = var2.field_j;
            return var2;
          }
          do {
            if (this.field_f <= this.field_i) {
              return null;
            }
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            var2 = this.field_e[fieldTemp$0].field_j;
          } while (this.field_e[-1 + this.field_i] == var2);
          this.field_b = var2.field_j;
          return var2;
        }
        field_g = (db) null;
        if (0 >= this.field_i) {
          do {
            if (this.field_f <= this.field_i) {
              return null;
            }
            fieldTemp$2 = this.field_i;
            this.field_i = this.field_i + 1;
            var2 = this.field_e[fieldTemp$2].field_j;
          } while (this.field_e[-1 + this.field_i] == var2);
          this.field_b = var2.field_j;
          return var2;
        }
        if (this.field_e[this.field_i - 1] != this.field_b) {
          var2 = this.field_b;
          this.field_b = var2.field_j;
          return var2;
        }
        do {
          if (this.field_f <= this.field_i) {
            return null;
          }
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          var2 = this.field_e[fieldTemp$1].field_j;
        } while (this.field_e[-1 + this.field_i] == var2);
        this.field_b = var2.field_j;
        return var2;
    }

    dj(int param0) {
        int var2 = 0;
        mc dupTemp$1 = null;
        mc var3;
        this.field_i = 0;
        this.field_e = new mc[param0];
        this.field_f = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new mc();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.field_j = var3;
          var3.field_e = var3;
        }
    }

    final static void a(byte param0, f param1) {
        try {
          int var2_int = 29 / ((-63 - param0) / 49);
          im.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "dj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new db(10, 2, 2, 0);
        field_c = "Create a free account to start using this feature";
        field_d = "Staff impersonation";
    }
}
