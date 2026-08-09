/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static volatile int field_a;
    hj field_b;
    static int[] field_c;
    static String field_d;
    private String field_e;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -29) {
            field_c = (int[]) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 10) {
          L0: {
            this.b((byte) -68);
            if (null == this.field_b) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == this.field_b) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final hj a(int param0) {
        hj dupTemp$2 = null;
        hj dupTemp$3 = null;
        String var3;
        if (this.field_b != null) {
          return this.field_b;
        } else {
          if (param0 != 8192) {
            var3 = (String) null;
            uf.a(-37, (String) null, (byte) 101, true, 47, (String) null, (String) null);
            dupTemp$2 = wd.b(this.field_e, (byte) -63);
            this.field_b = dupTemp$2;
            return dupTemp$2;
          } else {
            dupTemp$3 = wd.b(this.field_e, (byte) -63);
            this.field_b = dupTemp$3;
            return dupTemp$3;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            qk.a(param1, param0, true, true, in.field_h, qf.field_j, r.field_c);
            var2_int = 0;
            L1: while (true) {
              if (in.field_h <= var2_int) {
                qk.a(param1 - -param1, param1, true, false, in.field_h - -param1, we.field_j, dn.field_t);
                if (param1 < in.field_h) {
                  in.field_h = param1;
                  break L0;
                } else {
                  return;
                }
              } else {
                im.field_h[param1 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "uf.E(" + param0 + ',' + param1 + ')');
        }
    }

    uf(String param0) {
        try {
            this.field_e = param0;
            this.field_b = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, String param1, byte param2, boolean param3, int param4, String param5, String param6) {
        io var7 = null;
        RuntimeException var7_ref = null;
        io var8 = null;
        int var9 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = -6 / ((0 - param2) / 52);
            var7 = new io(param5);
            var8 = new io(param1);
            stackIn_1_0 = cc.a(65500, param0, param4, var7, param3, param6, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("uf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_a = 0;
        field_c = new int[8192];
        field_d = "Waiting for fonts";
    }
}
