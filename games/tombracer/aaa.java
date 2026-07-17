/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aaa {
    lha field_c;
    rt[] field_i;
    lha field_h;
    rt[] field_f;
    static hla field_d;
    lha field_a;
    static int field_b;
    static String field_e;
    boolean field_g;

    public static void a(byte param0) {
        int var1 = 0;
        field_d = null;
        field_e = null;
    }

    final static int a(boolean param0) {
        if (param0) {
            field_d = null;
            return mma.field_a;
        }
        return mma.field_a;
    }

    aaa(cka param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        lha var4 = null;
        mq var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((aaa) this).field_i = null;
        ((aaa) this).field_h = null;
        ((aaa) this).field_f = null;
        ((aaa) this).field_c = null;
        ((aaa) this).field_a = null;
        try {
          L0: {
            L1: {
              ((aaa) this).field_g = param0.field_V;
              kga.a(param0, 121);
              if (!((aaa) this).field_g) {
                ((aaa) this).field_f = new rt[16];
                var2_int = 0;
                L2: while (true) {
                  if (16 <= var2_int) {
                    ((aaa) this).field_i = new rt[16];
                    var2_int = 0;
                    L3: while (true) {
                      if (var2_int >= 16) {
                        break L1;
                      } else {
                        var24 = ua.a(gu.field_l, 32768, var2_int * 32768, false);
                        ((aaa) this).field_i[var2_int] = new rt(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                        var2_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var23 = ua.a(hna.field_e, 32768, 32768 * var2_int, false);
                    ((aaa) this).field_f[var2_int] = new rt(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                var20 = ir.a(hna.field_e, 13588, false);
                ((aaa) this).field_h = new lha(param0, 6410, 128, 128, 16, var20, 6410);
                var21 = ir.a(gu.field_l, 13588, false);
                ((aaa) this).field_a = new lha(param0, 6410, 128, 128, 16, var21, 6410);
                var10 = param0.field_zc;
                if (!var10.a((byte) 11)) {
                  break L1;
                } else {
                  var22 = ir.a(uga.field_m, 13588, false);
                  ((aaa) this).field_c = new lha(param0, 6408, 128, 128, 16);
                  var4 = new lha(param0, 6409, 128, 128, 16, var22, 6409);
                  if (!var10.a(-112, 2.0f, var4, ((aaa) this).field_c)) {
                    ((aaa) this).field_c.b(0);
                    ((aaa) this).field_c = null;
                    var4.b(0);
                    return;
                  } else {
                    boolean discarded$1 = ((aaa) this).field_c.e(9729);
                    var4.b(0);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("aaa.<init>(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "To play a multiplayer game, please log in or create a free account.";
    }
}
