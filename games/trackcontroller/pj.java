/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends db {
    final static q a(boolean param0, int param1) {
        la var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        la var8 = null;
        ob var9 = null;
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
        var7 = TrackController.field_F ? 1 : 0;
        if (param1 == 21552) {
          L0: {
            var8 = ne.field_a;
            var2 = var8;
            var3 = var8.h(16383);
            fd.field_e = 127 & var3;
            if (0 == (128 & var3)) {
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
            nl.field_b = stackIn_5_0 != 0;
            id.field_h = var8.h(16383);
            lg.field_a = var8.f((byte) 84);
            if ((fd.field_e ^ -1) == -3) {
              jb.field_d = var8.d((byte) -124);
              ka.field_c = var8.e(8);
              break L1;
            } else {
              ka.field_c = 0;
              jb.field_d = 0;
              break L1;
            }
          }
          L2: {
            if (var8.h(16383) != 1) {
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
            ai.field_c = var8.g(0);
            if (var4 != 0) {
              o.field_b = var8.g(0);
              break L3;
            } else {
              o.field_b = ai.field_c;
              break L3;
            }
          }
          L4: {
            if (-2 == (fd.field_e ^ -1)) {
              int discarded$4 = var8.d((byte) -117);
              String discarded$5 = var8.g(0);
              break L4;
            } else {
              if ((fd.field_e ^ -1) != -5) {
                break L4;
              } else {
                int discarded$6 = var8.d((byte) -117);
                String discarded$7 = var8.g(0);
                break L4;
              }
            }
          }
          if (!param0) {
            li.field_l = nd.a(-101, (be) (Object) var8, 80);
            hi.field_A = null;
            return new q(param0);
          } else {
            var5 = var8.d((byte) -67);
            try {
              L5: {
                L6: {
                  var9 = od.field_a.a(98, var5);
                  li.field_l = var9.a((byte) 2);
                  if (o.field_b.equals((Object) (Object) ue.field_a)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                    break L6;
                  } else {
                    stackOut_22_0 = var9.field_r;
                    stackIn_24_0 = stackOut_22_0;
                    break L6;
                  }
                }
                hi.field_A = stackIn_24_0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              hb.a((Throwable) (Object) var6, param1 ^ 21552, "CC1");
              li.field_l = null;
              hi.field_A = null;
              return new q(param0);
            }
            return new q(param0);
          }
        } else {
          return null;
        }
    }

    pj(vl param0, al param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void b(al param0, int param1) {
        super.b(param0, -77);
        if (param1 >= -61) {
            return;
        }
    }

    final static ng a(kk param0, int param1, int param2, int param3) {
        if (!sk.a(param1, param0, 1, param3)) {
            return null;
        }
        if (param2 >= -123) {
            return null;
        }
        return kj.a((byte) 106);
    }

    static {
    }
}
