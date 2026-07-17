/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_e;
    private gn field_d;
    private bi field_c;
    static String field_b;
    private gn field_a;

    final on a(int param0, int param1) {
        on var3 = null;
        byte[] var4 = null;
        var3 = (on) ((ng) this).field_c.a((long)param0, -113);
        if (var3 == null) {
          L0: {
            if (32768 <= param0) {
              var4 = ((ng) this).field_d.a(1, true, param0 & 32767);
              break L0;
            } else {
              var4 = ((ng) this).field_a.a(1, true, param0);
              break L0;
            }
          }
          if (param1 == 1) {
            L1: {
              var3 = new on();
              if (var4 != null) {
                var3.a(120, new th(var4));
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 >= 32768) {
              var3.g(-111);
              ((ng) this).field_c.a((long)param0, (Object) (Object) var3, false);
              return var3;
            } else {
              ((ng) this).field_c.a((long)param0, (Object) (Object) var3, false);
              return var3;
            }
          } else {
            return null;
          }
        } else {
          return var3;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 0;
        field_b = null;
    }

    final static void a(int param0) {
        ci.field_h = false;
        if (param0 >= -2) {
            ng.a(-88);
            int discarded$0 = rd.field_e.f((byte) -55);
            return;
        }
        int discarded$1 = rd.field_e.f((byte) -55);
    }

    private ng() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please wait...";
    }
}
