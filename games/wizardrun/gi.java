/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_d;
    static String field_e;
    static bh field_a;
    static int field_c;
    static boolean field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
    }

    final static void a(boolean param0, uh param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              uh.field_d[0] = oi.field_c.nextInt();
              uh.field_d[1] = oi.field_c.nextInt();
              uh.field_d[2] = (int)(tg.field_g >> 32);
              uh.field_d[3] = (int)tg.field_g;
              re.field_G.field_m = 0;
              re.field_G.f(uh.field_d[0], 613003928);
              re.field_G.f(uh.field_d[1], 613003928);
              re.field_G.f(uh.field_d[2], 613003928);
              re.field_G.f(uh.field_d[3], 613003928);
              u.a(re.field_G, -18);
              re.field_G.b(-1947079288, param4);
              param1.a(4, re.field_G);
              n.field_b.field_m = 0;
              if (!param3) {
                n.field_b.b((byte) 11, 16);
                break L1;
              } else {
                n.field_b.b((byte) 11, 18);
                break L1;
              }
            }
            L2: {
              n.field_b.field_m = n.field_b.field_m + 2;
              var5_int = n.field_b.field_m;
              n.field_b.f(vk.field_G, 613003928);
              n.field_b.b(1290648728, bl.field_d);
              var6 = 0;
              if (pf.field_g) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (cb.field_g) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (sf.field_b == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              n.field_b.b((byte) 11, var6);
              if (param2) {
                break L6;
              } else {
                field_c = -6;
                break L6;
              }
            }
            L7: {
              var7 = fb.a(jg.f(1), (byte) 102);
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              n.field_b.a(var7, false);
              if (null != sf.field_b) {
                n.field_b.b(0, sf.field_b);
                break L8;
              } else {
                break L8;
              }
            }
            pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
            n.field_b.a(n.field_b.field_m + -var5_int, (byte) -67);
            id.a((byte) -67, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("gi.B(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This password is part of your Player Name, and would be easy to guess";
        field_e = null;
        field_a = new bh(11, 0, 1, 2);
    }
}
