/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_b;
    static int[] field_a;

    public static void b(boolean param0) {
        field_a = null;
    }

    final static gb a(boolean param0) {
        String var1 = dg.a(false);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new gb(dg.a(false), ca.a((byte) 81));
    }

    final static vb a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        vb var8 = new vb(param5, param4, param7, param3, param2, param0);
        jl.field_a.b(123, (kd) (Object) var8);
        vi.a(4, var8, 1);
        return var8;
    }

    final static df a(int param0, boolean param1) {
        th var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        th var8 = null;
        me var9 = null;
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
          var7 = Lexicominos.field_L ? 1 : 0;
          var8 = ig.field_a;
          var2 = var8;
          var3 = var8.d(true);
          if ((128 & var3) == 0) {
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
          tf.field_a = stackIn_3_0 != 0;
          kb.field_a = var3 & 127;
          rl.field_E = var8.d(true);
          jf.field_P = var8.f((byte) 8);
          if (2 != kb.field_a) {
            kc.field_c = 0;
            fd.field_g = 0;
            break L1;
          } else {
            fd.field_g = var8.b(-1698573656);
            kc.field_c = var8.a(86);
            break L1;
          }
        }
        L2: {
          if (1 != var8.d(true)) {
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
          ik.field_k = var8.c(false);
          if (var4 != 0) {
            gk.field_c = var8.c(false);
            break L3;
          } else {
            gk.field_c = ik.field_k;
            break L3;
          }
        }
        L4: {
          if (1 == kb.field_a) {
            int discarded$4 = var8.b(-1698573656);
            String discarded$5 = var8.c(false);
            break L4;
          } else {
            if (kb.field_a == 4) {
              int discarded$6 = var8.b(-1698573656);
              String discarded$7 = var8.c(false);
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (!param1) {
          oe.field_b = ij.a(80, -22651, (wf) (Object) var8);
          eb.field_d = null;
          return new df(param1);
        } else {
          var5 = var8.b(-1698573656);
          try {
            L5: {
              L6: {
                var9 = hi.field_d.a(27467, var5);
                oe.field_b = var9.c(-97);
                if (gk.field_c.equals((Object) (Object) og.field_c)) {
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var9.field_r;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              eb.field_d = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            uj.a("CC1", (Throwable) (Object) var6, 1);
            eb.field_d = null;
            oe.field_b = null;
            return new df(param1);
          }
          return new df(param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
