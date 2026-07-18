/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends jtb {
    ds field_p;
    int field_r;
    static int field_o;
    byte field_q;
    static String field_s;

    public static void g(byte param0) {
        field_s = null;
        if (param0 != 114) {
            km.g((byte) -103);
        }
    }

    final byte[] a(int param0) {
        int var2 = 0;
        if (((km) this).field_n) {
          throw new RuntimeException();
        } else {
          if (((km) this).field_p.field_e >= ((km) this).field_p.field_h.length - ((km) this).field_q) {
            var2 = 9 / ((17 - param0) / 58);
            return ((km) this).field_p.field_h;
          } else {
            throw new RuntimeException();
          }
        }
    }

    final static void e(int param0) {
        fva.field_p = true;
        ow.field_b = 0;
    }

    final static void a(asb param0, byte param1) {
        RuntimeException var2 = null;
        faa var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        wma var5 = null;
        int[] var6 = null;
        int var7 = 0;
        faa var8 = null;
        faa var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var8 = new faa(param0.a("", true, "logo.fo3d"));
            var9 = var8;
            var2_ref = var9;
            var3 = var9.e((byte) -87);
            var9.p(-23497);
            gs.field_a = bh.a(var9, (byte) -122);
            raa.field_p = new int[var3][];
            eha.field_o = new wma[var3];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var9.f((byte) -79);
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var3) {
                    break L0;
                  } else {
                    var5 = eha.field_o[var4];
                    var5.a(-21227, 6, 6, 6, 1);
                    var5.a(119);
                    var6 = new int[]{var5.field_B + var5.field_d >> 1, var5.field_a + var5.field_u >> 1, var5.field_s + var5.field_q >> 1};
                    raa.field_p[var4] = var6;
                    var5.a(-9, -var6[2], -var6[0], -var6[1]);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                eha.field_o[var4] = ur.a(var8, (byte) -105);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("km.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 36 + ')');
        }
    }

    final static void f(byte param0) {
        if (qmb.field_q == 10) {
          twa.b(29);
          qmb.field_q = 11;
          dga.field_a = true;
          return;
        } else {
          if (!nua.b(true)) {
            twa.b(29);
            qmb.field_q = 11;
            dga.field_a = true;
            return;
          } else {
            dga.field_a = true;
            return;
          }
        }
    }

    km() {
    }

    final int e(byte param0) {
        if (null == ((km) this).field_p) {
            return 0;
        }
        if (param0 != -4) {
            return -96;
        }
        return ((km) this).field_p.field_e * 100 / (((km) this).field_p.field_h.length - ((km) this).field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 5;
        field_s = "External ship design loaded";
    }
}
