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
          var7 = TrackController.field_F ? 1 : 0;
          var8 = ne.field_a;
          var2 = var8;
          var3 = var8.h(16383);
          fd.field_e = 127 & var3;
          if (0 == (128 & var3)) {
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
          nl.field_b = stackIn_3_0 != 0;
          id.field_h = var8.h(16383);
          lg.field_a = var8.f((byte) 84);
          if (fd.field_e == 2) {
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
          if (fd.field_e == 1) {
            int discarded$4 = var8.d((byte) -117);
            String discarded$5 = var8.g(0);
            break L4;
          } else {
            if (fd.field_e != 4) {
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
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var9.field_r;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              hi.field_A = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            hb.a((Throwable) (Object) var6, 0, "CC1");
            li.field_l = null;
            hi.field_A = null;
            return new q(param0);
          }
          return new q(param0);
        }
    }

    pj(vl param0, al param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void b(al param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            super.b(param0, -77);
            if (param1 < -61) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pj.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ng a(kk param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        ng stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (sk.a(param1, param0, 1, param3)) {
              if (param2 < -123) {
                stackOut_6_0 = kj.a((byte) 106);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ng) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("pj.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    static {
    }
}
