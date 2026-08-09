/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static kc field_a;
    static ri[] field_c;
    static byte[][] field_b;
    static int field_d;

    public static void b(boolean param0) {
        if (!param0) {
            field_a = (kc) null;
            field_c = null;
            field_b = (byte[][]) null;
            return;
        }
        field_c = null;
        field_b = (byte[][]) null;
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 87) {
                break L1;
              } else {
                field_a = (kc) null;
                break L1;
              }
            }
            stackIn_3_0 = ah.field_J.a(param1, "", -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ke.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0) {
        if (!param0) {
          if (null == ku.field_J) {
            return;
          } else {
            if (-1 != oh.field_e) {
              if ((an.field_a ^ -1) == 0) {
                return;
              } else {
                L0: {
                  if (an.field_a >= ku.field_J.length) {
                    break L0;
                  } else {
                    g.field_c = 0;
                    ig.b(120);
                    uc.field_f = iw.field_b;
                    kp.field_a = false;
                    aj.field_C = false;
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_d = -5;
          if (null == ku.field_J) {
            return;
          } else {
            if (-1 != oh.field_e) {
              if ((an.field_a ^ -1) == 0) {
                return;
              } else {
                L1: {
                  if (an.field_a >= ku.field_J.length) {
                    break L1;
                  } else {
                    g.field_c = 0;
                    ig.b(120);
                    uc.field_f = iw.field_b;
                    kp.field_a = false;
                    aj.field_C = false;
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        field_a = null;
        field_b = new byte[50][];
    }
}
