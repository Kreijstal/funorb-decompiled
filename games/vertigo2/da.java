/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da extends de implements ih {
    static int[] field_k;
    private kp field_h;
    static int field_j;
    static int field_i;

    public final boolean c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == -12211) {
          if (this.field_h.field_w != null) {
            if (this.field_h.field_w.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_j = -18;
          if (this.field_h.field_w == null) {
            return true;
          } else {
            L0: {
              if (this.field_h.field_w.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 >= -97) {
            da.b((byte) -31);
            field_k = null;
            return;
        }
        field_k = null;
    }

    abstract String b(int param0, String param1);

    final ba a(byte param0) {
        if (param0 <= 24) {
          field_i = 123;
          return this.a(-1, this.field_h.field_w);
        } else {
          return this.a(-1, this.field_h.field_w);
        }
    }

    da(kp param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, kp param1) {
        RuntimeException runtimeException = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 16) {
                break L1;
              } else {
                var4 = (String) null;
                this.b(-114, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("da.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final String f(int param0) {
        if (param0 >= -68) {
          this.f(-53);
          return this.b(3614, this.field_h.field_w);
        } else {
          return this.b(3614, this.field_h.field_w);
        }
    }

    public final void a(int param0, kp param1) {
        kp var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 >= -10) {
                var4 = (kp) null;
                this.a((byte) -106, (kp) null);
                this.b(18340);
                break L1;
              } else {
                this.b(18340);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("da.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    abstract ba a(int param0, String param1);

    static {
    }
}
