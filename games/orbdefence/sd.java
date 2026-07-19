/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static im field_a;
    static hj[] field_f;
    static int field_h;
    static String field_d;
    static int field_g;
    static volatile int field_c;
    static l field_b;
    static int[] field_e;

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        String discarded$28 = null;
        String discarded$29 = null;
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param2) {
          if (param3 != 30775) {
            L1: {
              discarded$28 = sd.a(false, false, false, -6);
              if (param0) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return s.field_E[var4];
          } else {
            L2: {
              if (param0) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return s.field_E[var4];
          }
        } else {
          var4 += 2;
          if (param3 == 30775) {
            L3: {
              if (param0) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return s.field_E[var4];
          } else {
            L4: {
              discarded$29 = sd.a(false, false, false, -6);
              if (param0) {
                var4++;
                break L4;
              } else {
                break L4;
              }
            }
            return s.field_E[var4];
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 != -30) {
          field_c = 11;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0) {
        mb.field_a = gd.a(0);
        bm.field_d = new sk();
        int var1 = 113 / ((param0 - 25) / 55);
        wj.a(-118, true, true);
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              var4_int = -1;
              var5 = param0;
              L1: while (true) {
                L2: {
                  if (var5 >= param2) {
                    var4_int = var4_int ^ -1;
                    break L2;
                  } else {
                    var4_int = var4_int >>> -297926712 ^ vi.field_O[255 & (var4_int ^ param1[var5])];
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                stackOut_10_0 = var4_int;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 4;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("sd.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void a(boolean param0, int param1) {
        bd.field_u.a(param0, (byte) -89);
        if (param1 <= 15) {
            sd.a((byte) 74);
        }
    }

    static {
        field_a = new im();
        field_d = "Damage";
        field_g = 0;
        field_e = new int[8192];
        field_c = 0;
    }
}
