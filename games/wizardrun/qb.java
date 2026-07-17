/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb extends ll {
    static String field_q;
    static boolean field_p;
    static kl field_r;
    static String field_s;

    public static void b(int param0) {
        if (param0 != -1) {
          qb.a((byte) 59, 86);
          field_r = null;
          field_s = null;
          field_q = null;
          return;
        } else {
          field_r = null;
          field_s = null;
          field_q = null;
          return;
        }
    }

    qb(vd param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_M, -1, 2147483647, false);
    }

    final static uh a(String param0, boolean param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        uh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        uh stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if (param3.indexOf('@') != -1) {
                var6 = (Object) (Object) param3;
                break L1;
              } else {
                var7 = (CharSequence) (Object) param3;
                var4_long = sb.a((byte) 124, var7);
                break L1;
              }
            }
            stackOut_3_0 = uk.a((String) var6, 8355711, var4_long, false, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("qb.V(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(0).append(44).append(-90).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        try {
            if (!(!param4)) {
                pe.a(param2.field_n, (byte) -14, param1 + param2.field_l, param2.field_r, param0 + param2.field_o);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "qb.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        L0: {
          r.field_e = 3 & param1 >> 4;
          if (2 < r.field_e) {
            r.field_e = 2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 52) {
          L1: {
            ff.field_J = param1 >> 2 & 3;
            if (ff.field_J > 2) {
              ff.field_J = 2;
              break L1;
            } else {
              break L1;
            }
          }
          di.field_e = 3 & param1;
          if (di.field_e > 2) {
            di.field_e = 2;
            return;
          } else {
            return;
          }
        } else {
          L2: {
            qb.b(73);
            ff.field_J = param1 >> 2 & 3;
            if (ff.field_J > 2) {
              ff.field_J = 2;
              break L2;
            } else {
              break L2;
            }
          }
          di.field_e = 3 & param1;
          if (di.field_e <= 2) {
            return;
          } else {
            di.field_e = 2;
            return;
          }
        }
    }

    qb(int param0) {
        this(gh.field_b, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Waiting for graphics";
        field_s = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_p = true;
    }
}
