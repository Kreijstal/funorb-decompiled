/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static wk[] field_f;
    static String field_a;
    static String field_e;
    static wk[] field_d;
    static dn field_h;
    static boolean field_g;
    static int field_c;
    static ml field_b;

    public static void a() {
        field_b = null;
        field_d = null;
        field_f = null;
        field_h = null;
        field_e = null;
        field_a = null;
    }

    final static void a(boolean param0, byte param1, int param2, tg param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        Object var6 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (ja.field_g != null) {
                fn.a(-26907, 1048576, true, param2, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != q.field_f) {
                var4 = (Object) (Object) fc.field_a;
                synchronized (var4) {
                  L3: {
                    q.field_f.a(-1, (byte) 20, param2);
                    if (ml.field_g != param3) {
                      L4: {
                        q.field_f.c((byte) -98);
                        fc.field_a.a();
                        ml.field_g = param3;
                        if (null == ml.field_g) {
                          break L4;
                        } else {
                          q.field_f.a(true, true, ml.field_g);
                          break L4;
                        }
                      }
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 >= 65) {
              break L0;
            } else {
              var6 = null;
              jn.a(true, (byte) -9, -7, (tg) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("jn.B(").append(1).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Menu";
        field_e = "Warning: ";
        field_g = true;
        field_c = 480;
    }
}
