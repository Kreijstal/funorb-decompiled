/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class na extends dw implements pw {
    static jj field_c;
    private dh field_d;

    abstract gf a(byte param0, String param1);

    public final void a(dh param0, int param1) {
        try {
          if (param1 >= -41) {
            this.field_d = (dh) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "na.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 != -8003) {
          return true;
        }
        if (null == this.field_d.field_m) {
          return true;
        }
        if (0 != this.field_d.field_m.length()) {
          return false;
        }
        return true;
    }

    final String d(int param0) {
        if (param0 > -93) {
          return (String) null;
        }
        return this.a(0, this.field_d.field_m);
    }

    public final void a(dh param0, byte param1) {
        try {
          this.a((byte) -101);
          if (param1 > -127) {
            ki var4 = (ki) null;
            na.a(-98, -50, (ki) null, -100);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "na.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static wb a(int param0, int param1, ki param2, int param3) {
        RuntimeException var4 = null;
        wb stackIn_5_0 = null;
        wb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param2, param0, param3, param1 ^ 30429)) {
            return null;
          }
          if (param1 == -11481) {
            stackIn_7_0 = tj.c((byte) -8);
            return stackIn_7_0;
          }
          stackIn_5_0 = (wb) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("na.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final gf b(byte param0) {
        if (param0 == 114) {
          return this.a((byte) 26, this.field_d.field_m);
        }
        field_c = (jj) null;
        return this.a((byte) 26, this.field_d.field_m);
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    abstract String a(int param0, String param1);

    na(dh param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new jj("");
    }
}
