/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    byte[] field_e;
    int field_i;
    int field_m;
    static int field_h;
    int field_c;
    int field_b;
    int field_j;
    byte[] field_l;
    static boolean field_f;
    int field_g;
    static String[] field_a;
    int field_k;
    static ri field_d;

    public static void a() {
        field_d = null;
        field_a = null;
    }

    final static ka a(boolean param0) {
        ga var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ga var8 = null;
        tl var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_21_0 = null;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          var8 = s.field_e;
          var2 = var8;
          var3 = var8.g(31365);
          wc.field_N = var3 & 127;
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          fe.field_R = stackIn_3_0 != 0;
          of.field_g = var8.g(31365);
          ek.field_K = var8.a((byte) -30);
          if (2 == wc.field_N) {
            tk.field_m = var8.d((byte) 69);
            ti.field_W = var8.e(128);
            break L1;
          } else {
            tk.field_m = 0;
            ti.field_W = 0;
            break L1;
          }
        }
        L2: {
          if (var8.g(31365) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          kk.field_s = var8.f((byte) -71);
          if (var4 != 0) {
            ch.field_h = var8.f((byte) -121);
            break L3;
          } else {
            ch.field_h = kk.field_s;
            break L3;
          }
        }
        L4: {
          if (wc.field_N == 1) {
            ce.field_r = var8.d((byte) 69);
            sn.field_Ib = var8.f((byte) -62);
            break L4;
          } else {
            if (wc.field_N != 4) {
              ce.field_r = 0;
              sn.field_Ib = null;
              break L4;
            } else {
              ce.field_r = var8.d((byte) 69);
              sn.field_Ib = var8.f((byte) -62);
              break L4;
            }
          }
        }
        if (!param0) {
          int discarded$3 = 3460;
          int discarded$4 = 80;
          pg.field_b = jg.a((k) (Object) var8);
          af.field_g = null;
          return new ka(param0);
        } else {
          var5 = var8.d((byte) 69);
          try {
            L5: {
              L6: {
                var9 = bd.field_c.a(var5, -11452);
                pg.field_b = var9.e(-18572);
                if (!ch.field_h.equals((Object) (Object) ta.field_lb)) {
                  stackOut_22_0 = var9.field_r;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              af.field_g = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            int discarded$5 = 0;
            bd.a("CC1", (Throwable) (Object) var6);
            pg.field_b = null;
            af.field_g = null;
            return new ka(param0);
          }
          return new ka(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
    }
}
