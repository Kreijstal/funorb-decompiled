/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_d;
    ek field_b;
    ek field_c;
    us[] field_a;
    static String field_e;
    static boolean field_h;
    boolean field_g;
    ek field_f;
    us[] field_i;

    public static void a(byte param0) {
        field_e = null;
    }

    final static void a(int param0) {
        iu.a((byte) -128);
        pg.field_a = true;
        mc.field_E = true;
        rf.field_a.a((byte) -64);
        if (param0 != 0) {
            ch.a(20);
        }
        oc.a(qe.field_b, false, (byte) 49);
    }

    ch(fr param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ek var4 = null;
        b var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        ((ch) this).field_b = null;
        ((ch) this).field_a = null;
        ((ch) this).field_c = null;
        ((ch) this).field_f = null;
        ((ch) this).field_i = null;
        try {
          L0: {
            L1: {
              ((ch) this).field_g = param0.field_Ic;
              mq.a(param0, (byte) 123);
              if (!((ch) this).field_g) {
                ((ch) this).field_i = new us[16];
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= 16) {
                    ((ch) this).field_a = new us[16];
                    var2_int = 0;
                    L3: while (true) {
                      if (var2_int >= 16) {
                        break L1;
                      } else {
                        var24 = iq.a(qu.field_j, 14381, 32768, var2_int * 32768);
                        ((ch) this).field_a[var2_int] = new us(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                        var2_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var23 = iq.a(ic.field_b, 14381, 32768, var2_int * 32768);
                    ((ch) this).field_i[var2_int] = new us(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                var20 = ab.a(false, ic.field_b, 0);
                ((ch) this).field_b = new ek(param0, 6410, 128, 128, 16, var20, 6410);
                var21 = ab.a(false, qu.field_j, 0);
                ((ch) this).field_f = new ek(param0, 6410, 128, 128, 16, var21, 6410);
                var10 = param0.field_Sb;
                if (!var10.b((byte) -101)) {
                  break L1;
                } else {
                  L4: {
                    var22 = ab.a(false, dj.field_m, 0);
                    ((ch) this).field_c = new ek(param0, 6408, 128, 128, 16);
                    var4 = new ek(param0, 6409, 128, 128, 16, var22, 6409);
                    if (!var10.a(((ch) this).field_c, 2.0f, false, var4)) {
                      ((ch) this).field_c.b((byte) 106);
                      ((ch) this).field_c = null;
                      break L4;
                    } else {
                      boolean discarded$1 = ((ch) this).field_c.a(false);
                      break L4;
                    }
                  }
                  var4.b((byte) 126);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ch.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Play free version";
    }
}
