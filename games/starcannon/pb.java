/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static ge field_a;

    final static void b(int param0) {
        int var1 = -66 % ((param0 - -11) / 59);
        sb.field_g = new kh();
        t.field_h.c(20317, sb.field_g);
    }

    final static fb a(int param0, boolean param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ia var8 = null;
        ff var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        var7 = StarCannon.field_A;
        var8 = se.field_p;
        var2 = var8;
        var3 = var8.j(7909);
        if (param0 == 13607) {
          L0: {
            pf.field_e = var3 & 127;
            if (-1 == (var3 & 128 ^ -1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            cf.field_r = stackIn_5_0 != 0;
            lj.field_i = var8.j(7909);
            ne.field_d = var8.c((byte) 5);
            if ((pf.field_e ^ -1) == -3) {
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
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_11_0;
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
              discarded$4 = var8.i(-1174051992);
              discarded$5 = var8.a(-95);
              break L4;
            } else {
              if ((pf.field_e ^ -1) == -5) {
                discarded$6 = var8.i(-1174051992);
                discarded$7 = var8.a(-95);
                break L4;
              } else {
                break L4;
              }
            }
          }
          if (!param1) {
            vd.field_e = ha.a(var8, 80, 0);
            se.field_o = null;
            return new fb(param1);
          } else {
            var5 = var8.i(param0 + -1174065599);
            try {
              L5: {
                L6: {
                  var9 = ad.field_C.a(var5, -32769);
                  vd.field_e = var9.e(-95);
                  if (fb.field_e.equals(we.field_i)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) ((Object) stackOut_23_0);
                    break L6;
                  } else {
                    stackOut_22_0 = var9.field_s;
                    stackIn_24_0 = stackOut_22_0;
                    break L6;
                  }
                }
                se.field_o = stackIn_24_0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              hc.a((Throwable) ((Object) var6), "CC1", (byte) 81);
              se.field_o = null;
              vd.field_e = null;
              return new fb(param1);
            }
            return new fb(param1);
          }
        } else {
          return (fb) null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 70) {
            field_a = (ge) null;
        }
    }

    static {
        field_a = new ge();
    }
}
