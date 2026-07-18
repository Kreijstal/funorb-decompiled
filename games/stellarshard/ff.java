/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends nh {
    static int field_k;

    final ua a(int param0) {
        if (param0 != 160) {
            field_k = -55;
            return rg.field_J;
        }
        return rg.field_J;
    }

    final static void a(int param0, int param1) {
        ha var2 = pg.field_fb;
        var2.f(6, 950);
        var2.a(false, 1);
        var2.a(false, 0);
    }

    ff(long param0, String param1) {
        super(param0, param1);
    }

    final static nj a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        ha var9 = null;
        od var10 = null;
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
          var8 = stellarshard.field_B;
          var9 = ae.field_N;
          var3 = var9.f(4);
          ii.field_J = var3 & 127;
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
          eh.field_d = stackIn_3_0 != 0;
          ha.field_t = var9.f(4);
          k.field_d = var9.d(0);
          if (ii.field_J != 2) {
            il.field_w = 0;
            mg.field_y = 0;
            break L1;
          } else {
            mg.field_y = var9.c((byte) 79);
            il.field_w = var9.c(true);
            break L1;
          }
        }
        L2: {
          if (var9.f(4) != 1) {
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
          ld.field_z = var9.e((byte) 122);
          var5 = 0;
          if (var4 == 0) {
            oe.field_d = ld.field_z;
            break L3;
          } else {
            oe.field_d = var9.e((byte) 110);
            break L3;
          }
        }
        L4: {
          if (ii.field_J == 1) {
            int discarded$4 = var9.c((byte) 105);
            String discarded$5 = var9.e((byte) 106);
            break L4;
          } else {
            if (ii.field_J != 4) {
              break L4;
            } else {
              int discarded$6 = var9.c((byte) 105);
              String discarded$7 = var9.e((byte) 106);
              break L4;
            }
          }
        }
        if (param0) {
          var6 = var9.c((byte) 62);
          try {
            L5: {
              L6: {
                var10 = qh.field_e.a(32767, var6);
                ug.field_b = var10.e(0);
                if (!oe.field_d.equals((Object) (Object) wf.field_b)) {
                  stackOut_22_0 = var10.field_y;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              rc.field_k = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = (Exception) (Object) decompiledCaughtException;
            qe.a(-105, "CC1", (Throwable) (Object) var7);
            rc.field_k = null;
            ug.field_b = null;
            return new nj(param0);
          }
          return new nj(param0);
        } else {
          ug.field_b = ni.a(false, 80, (ka) (Object) var9);
          rc.field_k = null;
          return new nj(param0);
        }
    }

    static {
    }
}
