/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends pi {
    int field_n;
    static int field_p;
    int field_o;
    static int field_q;

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        if (!ok.a(111, param2, param1)) {
            return false;
        }
        if (param0) {
            field_p = -19;
        }
        for (var3 = 0; param2.length() > var3; var3++) {
            if (!(rb.a((byte) 124, param2.charAt(var3)))) {
                return false;
            }
        }
        return true;
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        var2 = param0;
        L0: while (true) {
          if (var2 >= param1.length()) {
            return false;
          } else {
            var3 = param1.charAt(var2);
            if (!ra.a((byte) 121, (char) var3)) {
              if (!g.a((char) var3, (byte) -68)) {
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

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -11) {
            break L0;
          } else {
            var2 = null;
            boolean discarded$2 = bi.a(false, true, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (fh.field_b ^ -1)) {
              break L2;
            } else {
              if (13 > af.field_u) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private bi() throws Throwable {
        throw new Error();
    }

    final static String a(int[] param0, boolean param1) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        StringBuilder var5 = new StringBuilder("[");
        StringBuilder var2 = var5;
        for (var3 = 0; var3 < param0.length; var3++) {
            if (0 != var3) {
                StringBuilder discarded$0 = var2.append(44);
            }
            StringBuilder discarded$1 = var5.append("0x").append(Integer.toHexString(param0[var3]));
        }
        if (!param1) {
            return null;
        }
        return String.valueOf(93);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 4;
    }
}
