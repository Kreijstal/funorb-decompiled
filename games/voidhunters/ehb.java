/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ehb {
    static Boolean field_f;
    static int field_g;
    static int field_e;
    private fh field_b;
    private vga field_c;
    private gnb field_d;
    private int field_a;

    final void a(long param0, byte param1, fh param2) {
        fh var5 = null;
        RuntimeException var5_ref = null;
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
        try {
          L0: {
            L1: {
              if (param1 <= -9) {
                break L1;
              } else {
                ((ehb) this).field_a = 91;
                break L1;
              }
            }
            L2: {
              if (0 != ((ehb) this).field_a) {
                ((ehb) this).field_a = ((ehb) this).field_a - 1;
                break L2;
              } else {
                var5 = ((ehb) this).field_c.b((byte) 77);
                var5.b(-3846);
                var5.d((byte) -35);
                if (var5 == ((ehb) this).field_b) {
                  var5 = ((ehb) this).field_c.b((byte) -128);
                  var5.b(-3846);
                  var5.d((byte) -35);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
            ((ehb) this).field_c.a(param2, -94);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("ehb.A(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final fh a(long param0, int param1) {
        fh var4 = null;
        int var5 = 0;
        var4 = (fh) (Object) ((ehb) this).field_d.a(param0, 117);
        if (var4 != null) {
          ((ehb) this).field_c.a(var4, -74);
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        } else {
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        }
    }

    public static void a() {
        field_f = null;
    }

    ehb(int param0) {
        ((ehb) this).field_b = new fh();
        ((ehb) this).field_c = new vga();
        ((ehb) this).field_a = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((ehb) this).field_d = new gnb(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 5;
    }
}
