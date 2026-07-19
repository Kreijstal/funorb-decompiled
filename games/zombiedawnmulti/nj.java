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

    public static void a(byte param0) {
        ka discarded$0 = null;
        if (param0 != 78) {
            discarded$0 = nj.a(false, (byte) -38);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static ka a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ga var8 = null;
        tl var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int[] stackIn_30_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_29_0 = null;
        Object stackOut_28_0 = null;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          var8 = s.field_e;
          var3 = var8.g(31365);
          if (param1 > 69) {
            break L0;
          } else {
            field_a = (String[]) null;
            break L0;
          }
        }
        L1: {
          wc.field_N = var3 & 127;
          if (-1 == (var3 & 128 ^ -1)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          fe.field_R = stackIn_5_0 != 0;
          of.field_g = var8.g(31365);
          ek.field_K = var8.a((byte) -30);
          if (2 == wc.field_N) {
            tk.field_m = var8.d((byte) 69);
            ti.field_W = var8.e(128);
            break L2;
          } else {
            tk.field_m = 0;
            ti.field_W = 0;
            if (var7 == 0) {
              break L2;
            } else {
              tk.field_m = var8.d((byte) 69);
              ti.field_W = var8.e(128);
              break L2;
            }
          }
        }
        L3: {
          if (var8.g(31365) != 1) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_13_0;
          kk.field_s = var8.f((byte) -71);
          if (var4 != 0) {
            ch.field_h = var8.f((byte) -121);
            break L4;
          } else {
            ch.field_h = kk.field_s;
            if (var7 == 0) {
              break L4;
            } else {
              ch.field_h = var8.f((byte) -121);
              break L4;
            }
          }
        }
        L5: {
          L6: {
            if (-2 == (wc.field_N ^ -1)) {
              break L6;
            } else {
              if (-5 != (wc.field_N ^ -1)) {
                ce.field_r = 0;
                sn.field_Ib = null;
                break L5;
              } else {
                break L6;
              }
            }
          }
          ce.field_r = var8.d((byte) 69);
          sn.field_Ib = var8.f((byte) -62);
          if (var7 == 0) {
            break L5;
          } else {
            ce.field_r = 0;
            sn.field_Ib = null;
            break L5;
          }
        }
        if (!param0) {
          pg.field_b = jg.a(var8, 80, 3460);
          af.field_g = null;
          return new ka(param0);
        } else {
          var5 = var8.d((byte) 69);
          try {
            L7: {
              L8: {
                var9 = bd.field_c.a(var5, -11452);
                pg.field_b = var9.e(-18572);
                if (!ch.field_h.equals(ta.field_lb)) {
                  stackOut_29_0 = var9.field_r;
                  stackIn_30_0 = stackOut_29_0;
                  break L8;
                } else {
                  stackOut_28_0 = null;
                  stackIn_30_0 = (int[]) ((Object) stackOut_28_0);
                  break L8;
                }
              }
              af.field_g = stackIn_30_0;
              break L7;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L9: {
              var6 = (Exception) (Object) decompiledCaughtException;
              bd.a("CC1", (Throwable) ((Object) var6), false);
              pg.field_b = null;
              af.field_g = null;
              break L9;
            }
          }
          if (var7 != 0) {
            pg.field_b = jg.a(var8, 80, 3460);
            af.field_g = null;
            return new ka(param0);
          } else {
            return new ka(param0);
          }
        }
    }

    static {
        field_f = false;
    }
}
