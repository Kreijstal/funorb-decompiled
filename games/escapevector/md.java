/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends r {
    static fk field_E;
    static volatile int field_G;
    static vn field_D;
    int field_F;
    static String field_H;

    public md() {
        super(0, 0, 0, 0, (db) null, (wn) null);
        this.field_F = 256;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        if (param0 == 127) {
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        md.l(60);
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException var3_ref = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = sh.a((byte) 95, param0, var3);
              th.a(true, true, param0, var3.toString());
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
              var3_ref2.printStackTrace();
            }
            if (param1 < -91) {
              return;
            }
            field_H = (String) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref;
            stackIn_8_1 = new StringBuilder().append("md.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    md(hm param0) {
        super(param0.field_k, param0.field_j, param0.field_g, param0.field_x, (db) null, (wn) null);
        try {
          param0.a(this.field_g, 0, 0, true, this.field_x);
          this.field_C = param0;
          this.field_F = 256;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void l(int param0) {
        int var1 = -26 / ((param0 + 6) / 58);
        field_D = null;
        field_E = null;
        field_H = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param2 != 0) {
          return;
        }
        if (null == this.field_C) {
          return;
        }
        if (this.field_F == 0) {
          return;
        }
        if (this.field_F == 256) {
          this.field_C.a(this.field_j + param0, (byte) 95, param2, this.field_k + param3);
          return;
        }
        ed var6 = new ed(this.field_C.field_g, this.field_C.field_x);
        eo.a(var6, (byte) -105);
        this.field_C.a(0, (byte) 91, param2, 0);
        if (param1 >= 85) {
          dl.a((byte) 107);
          var6.d(this.field_k + param3, this.field_j + param0, this.field_F);
          return;
        }
        field_H = (String) null;
        dl.a((byte) 107);
        var6.d(this.field_k + param3, this.field_j + param0, this.field_F);
    }

    static {
        field_E = new fk(3);
        field_G = 0;
    }
}
