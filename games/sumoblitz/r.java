/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends pj {
    static int[] field_r;

    final static br a(boolean param0, byte param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pl var8 = null;
        oq var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int[] stackIn_28_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_27_0 = null;
        Object stackOut_26_0 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var8 = ig.field_a;
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
            if (var7 == 0) {
              break L1;
            } else {
              eh.field_c = var8.a(255);
              jt.field_w = var8.c((byte) 126);
              break L1;
            }
          }
        }
        L2: {
          if (param1 < -51) {
            break L2;
          } else {
            field_r = (int[]) null;
            break L2;
          }
        }
        L3: {
          if (-2 != (var8.e(-31302) ^ -1)) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_13_0;
          wk.field_f = var8.d(-1);
          if (var4 == 0) {
            fu.field_E = wk.field_f;
            break L4;
          } else {
            fu.field_E = var8.d(-1);
            if (var7 == 0) {
              break L4;
            } else {
              fu.field_E = wk.field_f;
              break L4;
            }
          }
        }
        L5: {
          if ((jb.field_h ^ -1) == -2) {
            discarded$4 = var8.a(255);
            discarded$5 = var8.d(-1);
            break L5;
          } else {
            if (4 != jb.field_h) {
              break L5;
            } else {
              discarded$6 = var8.a(255);
              discarded$7 = var8.d(-1);
              break L5;
            }
          }
        }
        if (!param0) {
          oi.field_c = jb.a(var8, 80, -14832);
          tm.field_c = null;
          return new br(param0);
        } else {
          var5 = var8.a(255);
          try {
            L6: {
              L7: {
                var9 = kb.field_c.a(var5, -32769);
                oi.field_c = var9.f(1118);
                if (!fu.field_E.equals(qv.field_o)) {
                  stackOut_27_0 = var9.field_u;
                  stackIn_28_0 = stackOut_27_0;
                  break L7;
                } else {
                  stackOut_26_0 = null;
                  stackIn_28_0 = (int[]) ((Object) stackOut_26_0);
                  break L7;
                }
              }
              tm.field_c = stackIn_28_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              ms.a("CC1", (Throwable) ((Object) var6), 0);
              tm.field_c = null;
              oi.field_c = null;
              break L8;
            }
          }
          if (var7 != 0) {
            oi.field_c = jb.a(var8, 80, -14832);
            tm.field_c = null;
            return new br(param0);
          } else {
            return new br(param0);
          }
        }
    }

    public static void a(int param0) {
        int var1 = -113 % ((param0 - -31) / 47);
        field_r = null;
    }

    protected r() {
    }

    static {
        field_r = new int[8192];
    }
}
