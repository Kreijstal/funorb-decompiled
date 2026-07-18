/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends sk {
    static boolean field_h;
    private boolean field_g;
    static String field_f;

    final void a(int param0, int param1, jj param2) {
        ((ta) this).field_b.a(param2, -9135);
        if (param1 < 66) {
            return;
        }
        try {
            ((ta) this).field_b.b(param0, false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ta.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ta(bf param0) {
        super(param0);
        ((ta) this).field_g = false;
    }

    final void a(boolean param0, byte param1) {
        go var3 = null;
        ec var4 = null;
        if (param1 > 2) {
          var3 = ((ta) this).field_b.O(29190);
          if (var3 != null) {
            if (param0) {
              ((ta) this).field_b.a(1, (byte) 47);
              ((ta) this).field_b.a((jj) (Object) var3, -9135);
              ((ta) this).field_b.a(gk.field_g, false);
              ((ta) this).field_b.a(1, (byte) 120);
              ((ta) this).field_b.a(du.field_l, true, bd.field_C);
              ((ta) this).field_b.a(true, 2, true, un.field_i, false);
              ((ta) this).field_b.a(ac.field_b, 0, 0);
              var4 = ((ta) this).field_b.d(12343);
              var4.a((ao) (Object) ((ta) this).field_b.f(false), (byte) -121);
              ((ta) this).field_b.a(qn.field_a, (byte) 117);
              ((ta) this).field_b.a(0, (byte) 64);
              ((ta) this).field_g = true;
              return;
            } else {
              ((ta) this).field_b.a(ac.field_b, 0, 0);
              return;
            }
          } else {
            ((ta) this).field_b.a(ac.field_b, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 < 21) {
          L0: {
            boolean discarded$13 = ta.a(88, -119, (byte) -114);
            if ((2048 & param0) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((2048 & param0) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            field_h = true;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
            ((ta) this).a(true, (byte) -20);
        }
    }

    final void a(boolean param0, boolean param1) {
        Object var4 = null;
        bf stackIn_1_0 = null;
        as stackIn_1_1 = null;
        bf stackIn_2_0 = null;
        as stackIn_2_1 = null;
        bf stackIn_3_0 = null;
        as stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        bf stackOut_0_0 = null;
        as stackOut_0_1 = null;
        bf stackOut_2_0 = null;
        as stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        bf stackOut_1_0 = null;
        as stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        L0: {
          stackOut_0_0 = ((ta) this).field_b;
          stackOut_0_1 = ru.field_a;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param0) {
            stackOut_2_0 = (bf) (Object) stackIn_2_0;
            stackOut_2_1 = (as) (Object) stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (bf) (Object) stackIn_1_0;
            stackOut_1_1 = (as) (Object) stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((bf) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, bd.field_C);
        if (param0) {
          var4 = null;
          ((ta) this).a(-60, 36, (jj) null);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        if (!((ta) this).field_g) {
          ((ta) this).field_b.a(dl.field_p, 0, 0);
          ((ta) this).field_b.a(ru.field_a, param0, ru.field_a);
          return;
        } else {
          ((ta) this).field_b.a(1, (byte) 78);
          ((ta) this).field_b.a(b.field_b, false);
          ((ta) this).field_b.a(ru.field_a, true, ru.field_a);
          ((ta) this).field_b.a((byte) 124, 2, bs.field_a);
          ((ta) this).field_b.a(dl.field_p, 0, 0);
          ((ta) this).field_b.f(-21041);
          ((ta) this).field_b.a((jj) null, -9135);
          ((ta) this).field_b.a(0, (byte) 83);
          ((ta) this).field_g = false;
          ((ta) this).field_b.a(ru.field_a, param0, ru.field_a);
          return;
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            ta.b(false);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
