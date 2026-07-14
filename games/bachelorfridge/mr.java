/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends kj {
    static kv field_f;
    private ns field_i;
    static String field_h;
    private int field_g;

    mr(gj param0, ns param1, int param2, int param3) {
        super(param0, param2, param3);
        ((mr) this).field_i = param1;
        ((mr) this).field_g = -25;
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ee var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if ((((mr) this).field_g ^ -1) > -1) {
            stackOut_4_0 = ((mr) this).field_g * -20;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (((mr) this).field_g <= 30) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 16 * ((mr) this).field_g + -480;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var4 = stackIn_5_0;
          if (-1 < (((mr) this).field_g ^ -1)) {
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          } else {
            if ((((mr) this).field_g ^ -1) <= -16) {
              stackOut_8_0 = 2;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
          }
        }
        var5 = stackIn_10_0;
        var6 = ou.field_d[var5];
        var7 = 64 + (param0 - var4) + -var6.field_b;
        var6.a(param2, var7);
        if (!param1) {
          field_f = null;
          L2: while (true) {
            if ((var7 ^ -1) < -1) {
              var7 -= 64;
              vi.field_f.a(param2, var7);
              continue L2;
            } else {
              return;
            }
          }
        } else {
          L3: while (true) {
            if ((var7 ^ -1) < -1) {
              var7 -= 64;
              vi.field_f.a(param2, var7);
              continue L3;
            } else {
              return;
            }
          }
        }
    }

    final boolean b(int param0) {
        ((mr) this).field_g = ((mr) this).field_g + 1;
        if (((mr) this).field_g + 1 < 65) {
          L0: {
            if (-36 == (((mr) this).field_g ^ -1)) {
              wf.a(44, (byte) 20);
              ((mr) this).field_e.a(((mr) this).field_c, false, ((mr) this).field_d).field_j = 0;
              ((mr) this).field_i.a(false, ((mr) this).field_e.field_h);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 < 21) {
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Checking";
    }
}
