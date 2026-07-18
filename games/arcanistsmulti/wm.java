/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends wn {
    static int field_I;
    static String field_G;
    static qb[] field_H;
    static String field_F;
    static String field_J;

    public static void f() {
        field_H = null;
        field_F = null;
        field_G = null;
        field_J = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 < -52) {
          if (0 == param2) {
            if (((wm) this).field_r != null) {
              ((wm) this).field_r.a((qm) this, 5592405, param1, param3, true);
              if (((wm) this).field_v != 0) {
                if (0 == ((wm) this).field_k) {
                  return;
                } else {
                  io.field_n.a(param3 - (-((wm) this).field_j - ((wm) this).field_k), ((wm) this).field_v + ((wm) this).field_n + param1, 3, param3 + ((wm) this).field_j, ((wm) this).field_n + param1);
                  ((wm) this).field_B.a((byte) -99, param1 - -((wm) this).field_n, param2, param3 + ((wm) this).field_j);
                  io.field_n.a(114);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((wm) this).field_v != 0) {
                if (0 == ((wm) this).field_k) {
                  return;
                } else {
                  io.field_n.a(param3 - (-((wm) this).field_j - ((wm) this).field_k), ((wm) this).field_v + ((wm) this).field_n + param1, 3, param3 + ((wm) this).field_j, ((wm) this).field_n + param1);
                  ((wm) this).field_B.a((byte) -99, param1 - -((wm) this).field_n, param2, param3 + ((wm) this).field_j);
                  io.field_n.a(114);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((wm) this).field_v != 0) {
              if (0 == ((wm) this).field_k) {
                return;
              } else {
                io.field_n.a(param3 - (-((wm) this).field_j - ((wm) this).field_k), ((wm) this).field_v + ((wm) this).field_n + param1, 3, param3 + ((wm) this).field_j, ((wm) this).field_n + param1);
                ((wm) this).field_B.a((byte) -99, param1 - -((wm) this).field_n, param2, param3 + ((wm) this).field_j);
                io.field_n.a(114);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0) {
        if (param0 != -75) {
            return;
        }
        ((wm) this).field_B.e((byte) 87);
    }

    final static boolean c() {
        return kg.a(gg.field_e, true, ua.field_S);
    }

    wm(int param0, int param1, int param2, int param3, pf param4, qm param5) {
        super(param0, param1, param2, param3, param4, (wc) null);
        try {
            ((wm) this).field_B = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (!(param0 != 0)) {
            return 5864847;
        }
        if (!(1 != param0)) {
            return 3170895;
        }
        if (!(3 != param0)) {
            return 5142648;
        }
        if (param1 > -107) {
            return -8;
        }
        if (!(param0 != 4)) {
            return 5132354;
        }
        if (param0 == 5) {
            return 2174241;
        }
        if (!(param0 != 6)) {
            return 68;
        }
        if (param0 == 7) {
            return 15663103;
        }
        if (param0 == 8) {
            return 8978431;
        }
        return 3153936;
    }

    final static void g(int param0) {
        int discarded$0 = -123;
        ba.d();
    }

    final static void g() {
        if (-sn.field_G == gi.field_a) {
            return;
        }
        if (-sn.field_G + 250 != gi.field_a) {
            return;
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var8_int = -43 / ((-42 - param4) / 35);
                if (!((wm) this).a((byte) -47, param3, param0, param6, param5)) {
                  break L2;
                } else {
                  if (!super.a(param0, param1, param2, param3, -111, param5, param6)) {
                    break L2;
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    break L1;
                  }
                }
              }
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("wm.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Invite only";
        field_G = "Create";
        field_J = "Overview:";
    }
}
