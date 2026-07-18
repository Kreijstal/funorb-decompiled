/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_b;
    static int field_e;
    static q[] field_c;
    static nh field_d;
    static String field_a;
    static ae field_g;
    static boolean field_f;

    final static int a(int param0, int param1, int param2) {
        if (param0 < -72) {
          if (param1 < param2) {
            return 2048 + -gj.a((param1 << 16) / param2, -111);
          } else {
            return gj.a((param2 << 16) / param1, -106);
          }
        } else {
          int discarded$7 = d.a(48, -124, 86);
          if (param1 < param2) {
            return 2048 + -gj.a((param1 << 16) / param2, -111);
          } else {
            return gj.a((param2 << 16) / param1, -106);
          }
        }
    }

    final static la a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        wj var8 = null;
        nf var9 = null;
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
          var7 = DungeonAssault.field_K;
          var8 = ra.field_c;
          var3 = var8.c(true);
          uk.field_a = 127 & var3;
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
          ac.field_l = stackIn_3_0 != 0;
          wd.field_j = var8.c(true);
          gg.field_d = var8.c((byte) 69);
          if (uk.field_a != 2) {
            di.field_d = 0;
            ce.field_w = 0;
            break L1;
          } else {
            di.field_d = var8.k(0);
            ce.field_w = var8.f(-114);
            break L1;
          }
        }
        L2: {
          if (var8.c(true) != 1) {
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
          ri.field_f = var8.d(-124);
          if (var4 == 0) {
            tk.field_v = ri.field_f;
            break L3;
          } else {
            tk.field_v = var8.d(-96);
            break L3;
          }
        }
        L4: {
          if (uk.field_a == 1) {
            int discarded$4 = var8.k(0);
            String discarded$5 = var8.d(-101);
            break L4;
          } else {
            if (uk.field_a == 4) {
              int discarded$6 = var8.k(0);
              String discarded$7 = var8.d(-101);
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (!param0) {
          sa.field_t = sc.a(80, (ec) (Object) var8, 5);
          kp.field_a = null;
          return new la(param0);
        } else {
          var5 = var8.k(0);
          try {
            L5: {
              L6: {
                var9 = fm.field_f.a(var5, -19256);
                sa.field_t = var9.c((byte) -122);
                if (tk.field_v.equals((Object) (Object) tc.field_u)) {
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var9.field_D;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              kp.field_a = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            sm.a((Throwable) (Object) var6, 1, "CC1");
            kp.field_a = null;
            sa.field_t = null;
            return new la(param0);
          }
          return new la(param0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        ie.a(121);
        gf.a(param0, param3, param2, param1);
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
        field_a = "Goblin Runt";
        field_f = false;
        field_g = new ae(1);
    }
}
