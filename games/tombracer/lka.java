/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lka {
    final static bs a(int param0, kh param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param0 < -8) {
          var3 = param1.b((byte) 44, 4);
          var4 = var3;
          if (-1 == (var4 ^ -1)) {
            return (bs) (Object) new gfa(param2, param1);
          } else {
            System.out.println("Event type unrecognised: " + var3);
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        if (param0 >= -33) {
            lka.a((byte) 116);
            sua.r((byte) 63);
            return;
        }
        sua.r((byte) 63);
    }

    static {
    }
}
