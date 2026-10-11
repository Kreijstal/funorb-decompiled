/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private int field_d;
    private int field_f;
    private wf[] field_e;
    private wf field_b;
    private wf field_a;
    static boolean field_c;

    final wf a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        wf var4;
        wf var5;
        wf var8;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (this.field_f <= 0) {
          do {
            if (this.field_d <= this.field_f) {
              var2 = 6 % ((-26 - param0) / 58);
              return null;
            }
            fieldTemp$1 = this.field_f;
            this.field_f = this.field_f + 1;
            var4 = this.field_e[fieldTemp$1].field_b;
          } while (this.field_e[this.field_f - 1] == var4);
          this.field_a = var4.field_b;
          return var4;
        }
        if (this.field_a != this.field_e[this.field_f - 1]) {
          var8 = this.field_a;
          this.field_a = var8.field_b;
          return var8;
        }
        do {
          if (this.field_d <= this.field_f) {
            var2 = 6 % ((-26 - param0) / 58);
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var5 = this.field_e[fieldTemp$0].field_b;
        } while (this.field_e[this.field_f - 1] == var5);
        this.field_a = var5.field_b;
        return var5;
    }

    final wf a(long param0, int param1) {
        wf var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        wf var4 = this.field_e[(int)((long)(-1 + this.field_d) & param0)];
        this.field_b = var4.field_b;
        while (this.field_b != var4) {
          if (~this.field_b.field_c == ~param0) {
            var5 = this.field_b;
            this.field_b = this.field_b.field_b;
            return var5;
          }
          this.field_b = this.field_b.field_b;
        }
        this.field_b = null;
        if (param1 != 0) {
          wf var7 = (wf) null;
          this.a(28L, (byte) 9, (wf) null);
          return null;
        }
        return null;
    }

    final wf b(int param0) {
        if (param0 == 1000) {
          this.field_f = 0;
          return this.a(71);
        }
        ag var3 = (ag) null;
        fl.a((ag) null, 122, -2);
        this.field_f = 0;
        return this.a(71);
    }

    final void a(long param0, byte param1, wf param2) {
        wf var5 = null;
        try {
          if (null != param2.field_f) {
            param2.c(5);
          }
          var5 = this.field_e[(int)(param0 & (long)(-1 + this.field_d))];
          param2.field_b = var5;
          int var6 = 70 / ((3 - param1) / 58);
          param2.field_f = var5.field_f;
          param2.field_f.field_b = param2;
          param2.field_b.field_f = param2;
          param2.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static nd a(ag param0, int param1, int param2) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -11039) {
            field_c = true;
          }
          stackIn_3_0 = new nd(param0, param2 * qh.field_p / 1000);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fl.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    fl(int param0) {
        int var2 = 0;
        wf dupTemp$1 = null;
        wf var3;
        this.field_f = 0;
        this.field_e = new wf[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new wf();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.field_b = var3;
          var3.field_f = var3;
        }
    }

    static {
    }
}
