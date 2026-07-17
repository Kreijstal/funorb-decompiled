/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends hd {
    static String field_Db;
    int field_Bb;
    static int field_yb;
    static hd field_zb;
    static hd field_Cb;
    static String field_Ab;
    static String[] field_Eb;

    final static void a() {
        int var1 = -1;
    }

    dn(int param0) {
        ((dn) this).field_Bb = param0;
        ut var3 = new ut(qe.field_i[iw.field_e[((dn) this).field_Bb]].field_q >> 2, qe.field_i[iw.field_e[((dn) this).field_Bb]].field_w >> 2);
        ut var2 = var3;
        iw.a(-59, var3);
        qe.field_i[iw.field_e[((dn) this).field_Bb]].g(0, 0);
        ta.e(121);
        ((dn) this).field_N = var2;
        ((dn) this).field_mb = 5 + var2.field_v - -5;
        ((dn) this).field_B = 5;
        ((dn) this).field_D = 5;
        ((dn) this).field_q = 5 + (var2.field_o - -5);
    }

    final static String a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_9_0 = new String(var3);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var5 = param0.charAt(var4);
                  if (var4 == 0) {
                    var5 = ju.b(19805, (char) var5);
                    break L2;
                  } else {
                    var5 = Character.toLowerCase((char) var5);
                    break L2;
                  }
                }
                var3[var4] = (char)var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("dn.E(");
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
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
        }
        return stackIn_10_0;
    }

    final static void b(int param0, int param1) {
        if (param0 != -5) {
            field_Ab = null;
        }
        fw.field_G = (double)param1;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (!(ck.field_b == null)) {
            var3 = ck.field_b.a(param0, 0);
            if (var3 != -2) {
                if (!(-1 == var3)) {
                    var4 = ck.field_b.b(26) ? 1 : 0;
                    nu.a(119, ck.field_b.field_Eb, var3, 14, var4 != 0, ck.field_b.a(-15596));
                }
                ck.field_b = null;
                da.b(108);
            }
        }
    }

    public static void c() {
        field_zb = null;
        field_Db = null;
        field_Ab = null;
        field_Eb = null;
        field_Cb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "Next";
        field_Ab = "slide";
    }
}
