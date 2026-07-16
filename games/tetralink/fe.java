/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static String field_a;
    static int[] field_b;

    final static void a(ri param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null != bn.field_c) {
            qh.a(param2, (byte) -56, 1048576, param0, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (ic.field_b == null) {
          if (param3 <= 20) {
            field_b = null;
            return;
          } else {
            return;
          }
        } else {
          var4 = (Object) (Object) ch.field_q;
          synchronized (var4) {
            L1: {
              ic.field_b.b(param1, -1, 94);
              if (param0 != oa.field_B) {
                L2: {
                  ic.field_b.d(19);
                  ch.field_q.c();
                  oa.field_B = param0;
                  if (null != oa.field_B) {
                    ic.field_b.a(param2, oa.field_B, (byte) 23);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L1;
              } else {
                return;
              }
            }
          }
          L3: {
            if (param3 > 20) {
              break L3;
            } else {
              field_b = null;
              break L3;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Accept <%0> into this game";
    }
}
