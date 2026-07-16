/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (rh.field_f != null) {
            var1 = (Object) (Object) rh.field_f;
            synchronized (var1) {
              L1: {
                rh.field_f = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            fm.a(14);
            break L2;
          }
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param1.length()) {
            if (param0) {
              return false;
            } else {
              return false;
            }
          } else {
            var3 = param1.charAt(var2);
            if (!ak.a((char) var3, (byte) 67)) {
              if (!em.a((byte) -65, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
