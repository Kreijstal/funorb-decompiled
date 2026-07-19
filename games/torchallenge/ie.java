/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static sl field_d;
    static int[][][] field_b;
    static qe[] field_e;
    static String field_c;
    static String field_g;
    static ka[][] field_f;
    static sf field_a;

    final static void b(byte param0) {
        kd var1 = (kd) ((Object) rf.field_db.d((byte) -112));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        qg.a(var1.field_j, var1.field_p, var1.field_s);
        qg.f(var1.field_l, var1.field_i, var1.field_n, var1.field_q);
        if (param0 != -9) {
            field_c = (String) null;
        }
        var1.field_j = null;
        mc.field_k.a(var1, param0 + -26);
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        field_a = null;
        field_b = (int[][][]) null;
        field_e = null;
        field_g = null;
        field_f = (ka[][]) null;
        field_c = null;
        if (param0 != 33) {
            discarded$0 = ie.a((byte) 0, 'K');
        }
        field_d = null;
    }

    final static boolean a(byte param0, char param1) {
        boolean discarded$2 = false;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (ea.a(param1, -124)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = eb.field_r;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    L2: {
                      var2 = ne.field_a;
                      var3 = 0;
                      if (param0 == 82) {
                        break L2;
                      } else {
                        discarded$2 = ie.a((byte) 53, '￈');
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 != var4) {
                          var3++;
                          continue L3;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "ie.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_b = new int[][][]{new int[][]{new int[]{-7, 5, 5, 5, -7, -7}, new int[]{0}, new int[]{0}, new int[]{5, 3, 1, 3, 5, -7}, new int[]{0}, new int[]{0}, new int[]{0}}, new int[][]{new int[]{-7, 3, 5, 3, 1, -7}, new int[]{-7, 3, 5, 3, 5}, new int[]{3, -7, -7, -7}, new int[]{0}, new int[]{0}, new int[]{-7, -7, -7, -7, -7, -7, -7}, new int[]{0}}, new int[][]{new int[]{2, 2, 0, 0, 2, 2}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{5, 5, 5, 5, 5, 5}, new int[]{0}, new int[]{-7, -7, -7, 1, 3, -7}}};
        field_g = null;
        field_c = "Loading sound effects";
        field_e = new qe[5];
    }
}
