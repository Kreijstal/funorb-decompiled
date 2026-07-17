/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends fb {
    byte[] field_p;
    gf field_t;
    static am field_s;
    static int[] field_u;
    int field_q;
    static int[] field_v;
    static kj field_o;
    static int field_r;

    final byte[] e(int param0) {
        if (((si) this).field_j) {
            throw new RuntimeException();
        }
        int var2 = -15 / ((25 - param0) / 41);
        return ((si) this).field_p;
    }

    final static hl a(boolean param0, int param1) {
        hb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hb var8 = null;
        pi var9 = null;
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
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          var8 = MonkeyPuzzle2.field_D;
          var2 = var8;
          var3 = var8.a((byte) 114);
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
          eg.field_j = stackIn_3_0 != 0;
          lf.field_c = var3 & 127;
          o.field_c = var8.a((byte) 114);
          bi.field_z = var8.i(66);
          if (2 == lf.field_c) {
            sd.field_b = var8.j(17277);
            c.field_b = var8.c((byte) 115);
            break L1;
          } else {
            sd.field_b = 0;
            c.field_b = 0;
            break L1;
          }
        }
        L2: {
          if (var8.a((byte) 114) != 1) {
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
          lc.field_h = var8.f(-1);
          if (var4 != 0) {
            i.field_h = var8.f(-1);
            break L3;
          } else {
            i.field_h = lc.field_h;
            break L3;
          }
        }
        L4: {
          if (lf.field_c == 1) {
            int discarded$5 = var8.j(17277);
            String discarded$6 = var8.f(-1);
            break L4;
          } else {
            if (lf.field_c != 4) {
              break L4;
            } else {
              int discarded$7 = var8.j(17277);
              String discarded$8 = var8.f(-1);
              break L4;
            }
          }
        }
        if (param0) {
          var5 = var8.j(17277);
          try {
            L5: {
              L6: {
                var9 = hi.field_a.a(var5, -32769);
                ba.field_h = var9.b((byte) -54);
                if (!i.field_h.equals((Object) (Object) cl.field_e)) {
                  stackOut_22_0 = var9.field_q;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              wh.field_e = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            kk.a("CC1", (byte) 123, (Throwable) (Object) var6);
            ba.field_h = null;
            wh.field_e = null;
            return new hl(param0);
          }
          return new hl(param0);
        } else {
          int discarded$9 = 80;
          ba.field_h = ea.a((byte) 90, (gk) (Object) var8);
          wh.field_e = null;
          return new hl(param0);
        }
    }

    final static cd[] f(int param0) {
        if (param0 != 0) {
          field_v = null;
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        } else {
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        }
    }

    public static void b() {
        field_v = null;
        field_s = null;
        field_o = null;
        field_u = null;
    }

    final int a(boolean param0) {
        if (param0) {
          if (((si) this).field_j) {
            return 0;
          } else {
            return 100;
          }
        } else {
          cd[] discarded$5 = si.f(-82);
          if (((si) this).field_j) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[4];
        field_v = new int[5];
        field_s = new am();
        field_r = 0;
    }
}
