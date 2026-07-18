/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static ge field_a;

    final static void b(int param0) {
        int var1 = -66 % ((param0 - -11) / 59);
        sb.field_g = new kh();
        t.field_h.c(20317, (uj) (Object) sb.field_g);
    }

    final static fb a(int param0, boolean param1) {
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ia var8 = null;
        ff var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var7 = StarCannon.field_A;
          var8 = se.field_p;
          var2 = var8;
          var3 = var8.j(7909);
          pf.field_e = var3 & 127;
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
          cf.field_r = stackIn_3_0 != 0;
          lj.field_i = var8.j(7909);
          ne.field_d = var8.c((byte) 5);
          if (pf.field_e == 2) {
            wc.field_f = var8.i(-1174051992);
            tk.field_e = var8.g(127);
            break L1;
          } else {
            wc.field_f = 0;
            tk.field_e = 0;
            break L1;
          }
        }
        L2: {
          if (1 != var8.j(7909)) {
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
          ee.field_d = var8.a(-117);
          if (var4 != 0) {
            fb.field_e = var8.a(-72);
            break L3;
          } else {
            fb.field_e = ee.field_d;
            break L3;
          }
        }
        L4: {
          if (1 == pf.field_e) {
            int discarded$4 = var8.i(-1174051992);
            String discarded$5 = var8.a(-95);
            break L4;
          } else {
            if (pf.field_e == 4) {
              int discarded$6 = var8.i(-1174051992);
              String discarded$7 = var8.a(-95);
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (!param1) {
          vd.field_e = ha.a((rb) (Object) var8, 80, 0);
          se.field_o = null;
          return new fb(param1);
        } else {
          var5 = var8.i(-1174051992);
          try {
            L5: {
              L6: {
                var9 = ad.field_C.a(var5, -32769);
                vd.field_e = var9.e(-95);
                if (fb.field_e.equals((Object) (Object) we.field_i)) {
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var9.field_s;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              se.field_o = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            hc.a((Throwable) (Object) var6, "CC1", (byte) 81);
            se.field_o = null;
            vd.field_e = null;
            return new fb(param1);
          }
          return new fb(param1);
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ge();
    }
}
