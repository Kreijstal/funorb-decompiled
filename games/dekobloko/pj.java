/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends sf {
    int field_K;
    static String field_G;
    static String field_F;
    static String[] field_N;
    static String field_L;
    static ck field_I;
    wl field_J;
    byte field_M;

    final int a(boolean param0) {
        if (param0) {
            return -110;
        }
        if (!(((pj) this).field_J != null)) {
            return 0;
        }
        return 100 * ((pj) this).field_J.field_n / (-((pj) this).field_M + ((pj) this).field_J.field_r.length);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void h() {
        field_N = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
    }

    final byte[] g(byte param0) {
        if (!((pj) this).field_z) {
          if (((pj) this).field_J.field_r.length - ((pj) this).field_M <= ((pj) this).field_J.field_n) {
            if (param0 <= 65) {
              int discarded$2 = pj.d(9);
              return ((pj) this).field_J.field_r;
            } else {
              return ((pj) this).field_J.field_r;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static int d(int param0) {
        int var1 = -62 % ((param0 - 81) / 40);
        return ac.field_A;
    }

    final static void a(ve param0) {
        ve var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            param0.b((byte) 108);
            var2 = (ve) (Object) h.field_b.c((byte) -99);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param0, false)) {
                    break L2;
                  } else {
                    var2 = (ve) (Object) h.field_b.d(true);
                    continue L1;
                  }
                }
              }
              if (var2 != null) {
                fm.a((byte) 114, (bh) (Object) param0, (bh) (Object) var2);
                break L0;
              } else {
                h.field_b.a((bh) (Object) param0, 2777);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("pj.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -50 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        ul.field_d = param2;
        qk.field_d = param1;
    }

    pj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "This game option is only available to members.";
        field_G = "Add <%0> to ignore list";
        field_N = new String[16];
        field_L = "Enter name of player to add to list";
    }
}
