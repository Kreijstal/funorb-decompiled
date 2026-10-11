/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gfa extends bs {
    static ur field_l;
    private int field_n;
    private int field_k;
    static iu field_j;
    static String field_i;
    static String field_m;

    final void a(kh param0, int param1) {
        try {
          super.a(param0, param1);
          param0.a((byte) -128, this.field_n, 4);
          param0.a((byte) -125, this.field_k, 6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gfa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_m = null;
        field_l = null;
        if (param0 <= 33) {
          gfa.b(-87);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        int var2 = this.field_n;
        if (var2 == 4) {
          return true;
        }
        if (var2 == 5) {
          return true;
        }
        return false;
    }

    final int b(byte param0) {
        if (param0 != 121) {
          this.field_k = -8;
          return 0;
        }
        return 0;
    }

    gfa(int param0, kh param1) {
        super(param0, param1);
        try {
          this.field_n = param1.b((byte) 44, 4);
          this.field_k = param1.b((byte) 44, 6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gfa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != -28) {
          field_j = (iu) null;
          return this.field_k;
        }
        return this.field_k;
    }

    final boolean a(boolean param0, bs param1) {
        RuntimeException var3 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_j = (iu) null;
          }
          if (!(param1 instanceof gfa)) {
            return false;
          }
          stackIn_9_0 = (((gfa) (param1)).field_n == this.field_n);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gfa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(dt param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 110) {
            field_j = (iu) null;
          }
          if (this.a(false)) {
            param0.a(this.field_n, param3, -121, param2);
            return;
          }
          param0.a(this.field_n, param3, -85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("gfa.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, dt param2) {
        try {
          if (this.a(false)) {
            param2.a((byte) -97, this.field_n, param0);
          } else {
            param2.b(this.field_n, -1);
          }
          int var4_int = 30 % ((param1 - 46) / 46);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gfa.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new ur(3);
        field_i = "This is <%0>'s RuneScape clan if they have one.";
        field_m = "Report abuse";
    }
}
