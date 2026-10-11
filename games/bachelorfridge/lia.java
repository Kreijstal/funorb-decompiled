/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lia extends pp {
    int field_k;
    static lm field_j;
    static boolean field_i;

    final void a(aga param0, op param1, int param2) {
        String var5 = null;
        aga var6 = null;
        aga var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var6 = this.field_h.a(29, param1);
          var7 = var6;
          if (var7.g(param2 + 83, this.field_f)) {
            return;
          }
          if (-1 != this.field_k) {
            var7.b((byte) 117, this.field_k);
          }
          if (od.field_w[param1.field_a[var6.field_x][var6.field_J].field_n].field_b) {
            param1.field_a[var6.field_x][var6.field_J].field_m = false;
            param1.field_a[var6.field_x][var6.field_J].field_j = 5;
          }
          if (param2 != 12) {
            var5 = (String) null;
            lia.a(1, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("lia.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    lia(nq param0, int param1, int param2) {
        try {
          this.field_h = param0;
          this.field_k = param2;
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 <= 22) {
          return;
        }
        field_j = null;
    }

    final static qh a(int param0) {
        if (param0 != 5) {
          field_j = (lm) null;
        }
        if (null == go.field_s) {
          go.field_s = new qh();
          go.field_s.a(jca.field_a, true);
          go.field_s.field_k = 0;
          go.field_s.field_f = 2763306;
          go.field_s.field_n = 14;
          go.field_s.field_d = 4;
          go.field_s.field_p = 6;
          go.field_s.field_e = 7697781;
          go.field_s.field_m = oc.field_l;
          go.field_s.field_c = 5;
        }
        return go.field_s;
    }

    final void a(lu param0, byte param1) {
        try {
          er.a(this.field_h, 125, param0);
          param0.b(this.field_f, -113);
          param0.d(this.field_k, 0);
          int var3_int = 126 % ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lia.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static rga a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        rga stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param1.length();
          if (param0 != -58) {
            lia.a(114);
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_12_0 = cha.field_m;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("lia.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
