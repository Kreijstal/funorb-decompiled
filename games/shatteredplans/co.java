/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co extends wf {
    static long field_o;
    static String field_q;
    static String field_t;
    static bi[] field_p;
    static om field_s;
    static String field_r;

    public static void d(byte param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        if (param0 != -99) {
            field_o = -127L;
        }
        field_p = null;
        field_s = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, ob param1, java.math.BigInteger param2, ob param3, java.math.BigInteger param4) {
        try {
            ra.a(param2, param1, 0, 0, param4, param3.field_h, param3.field_j);
            if (param0 != 25050) {
                java.math.BigInteger var6 = (java.math.BigInteger) null;
                co.a(43, (ob) null, (java.math.BigInteger) null, (ob) null, (java.math.BigInteger) null);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "co.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    co(ln param0, boolean param1, boolean[] param2) {
        super(param0);
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        ln[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              this.field_i = param0.field_N;
              if (param1) {
                break L1;
              } else {
                var8 = param0.field_D;
                var4 = var8;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var8.length) {
                    break L1;
                  } else {
                    L3: {
                      var6 = var8[var5];
                      if (!param2[var6.field_p]) {
                        break L3;
                      } else {
                        this.field_i = this.field_i + 1;
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("co.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_t = "Password: ";
        field_q = "Concluded";
        field_r = "Ask to join <%0>'s game";
    }
}
