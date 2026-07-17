/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends pj {
    static int[] field_r;

    final static br a(boolean param0, byte param1) {
        pl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pl var8 = null;
        oq var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_21_0 = null;
        Object stackOut_20_0 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var8 = ig.field_a;
          var2 = var8;
          var3 = var8.e(-31302);
          jb.field_h = 127 & var3;
          if (0 == (var3 & 128)) {
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
          is.field_a = stackIn_3_0 != 0;
          wn.field_a = var8.e(-31302);
          bb.field_j = var8.a((byte) 113);
          if (2 == jb.field_h) {
            eh.field_c = var8.a(255);
            jt.field_w = var8.c((byte) 126);
            break L1;
          } else {
            jt.field_w = 0;
            eh.field_c = 0;
            break L1;
          }
        }
        L2: {
          if (var8.e(-31302) != 1) {
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
          wk.field_f = var8.d(-1);
          if (var4 == 0) {
            fu.field_E = wk.field_f;
            break L3;
          } else {
            fu.field_E = var8.d(-1);
            break L3;
          }
        }
        L4: {
          if (jb.field_h == 1) {
            int discarded$6 = var8.a(255);
            String discarded$7 = var8.d(-1);
            break L4;
          } else {
            if (4 != jb.field_h) {
              break L4;
            } else {
              int discarded$8 = var8.a(255);
              String discarded$9 = var8.d(-1);
              break L4;
            }
          }
        }
        if (!param0) {
          int discarded$10 = -14832;
          int discarded$11 = 80;
          oi.field_c = jb.a((fs) (Object) var8);
          tm.field_c = null;
          return new br(param0);
        } else {
          var5 = var8.a(255);
          try {
            L5: {
              L6: {
                var9 = kb.field_c.a(var5, -32769);
                oi.field_c = var9.f(1118);
                if (!fu.field_E.equals((Object) (Object) qv.field_o)) {
                  stackOut_21_0 = var9.field_u;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                  break L6;
                }
              }
              tm.field_c = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ms.a("CC1", (Throwable) (Object) var6, 0);
            tm.field_c = null;
            oi.field_c = null;
            return new br(param0);
          }
          return new br(param0);
        }
    }

    public static void a() {
        int var1 = 0;
        field_r = null;
    }

    protected r() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
    }
}
