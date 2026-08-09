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
        int stackIn_5_0 = 0;
        if (param0 == -8003) {
          if (null != this.field_d.field_m) {
            if (0 == this.field_d.field_m.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_5_0 = 1;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (k.a(param2, param0, param3, param1 ^ 30429)) {
              if (param1 == -11481) {
                stackIn_7_0 = tj.c((byte) -8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (wb) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("na.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final gf b(byte param0) {
        if (param0 != 114) {
          field_c = (jj) null;
          return this.a((byte) 26, this.field_d.field_m);
        } else {
          return this.a((byte) 26, this.field_d.field_m);
        }
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
