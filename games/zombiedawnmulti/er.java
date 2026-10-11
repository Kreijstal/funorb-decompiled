/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends br {
    int field_g;
    static ma field_f;
    static int field_k;
    static int field_i;
    static int field_h;
    static ja field_j;

    er(int param0) {
        this.field_g = param0;
    }

    public static void c(int param0) {
        field_j = null;
        if (param0 != 4) {
          return;
        }
        field_f = null;
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        boolean stackIn_51_0 = false;
        int var1;
        int var2;
        int var1Lifetime1;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (ai.field_b != ma.field_d) {
          se.field_E = se.field_E - 40;
          if (se.field_E <= 0) {
            se.field_E = 0;
            ml.field_Jb = gn.field_I[hg.field_rb];
            ma.field_d = ai.field_b;
            stackIn_51_0 = !(hg.field_rb >= -1 + lm.field_pb);
            dg.field_J = stackIn_51_0;
            if (0 <= ai.field_b &&
              ml.field_Jb >= 0) {
              var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
              hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
              if (!pp.field_n) {
                hj.field_g = hj.field_g + 20;
              }
            }
          }
          if (ai.field_b == 21 &&
            10 == hg.field_rb &&
            !fb.field_e.field_I.a(true)) {
            df.a(param0 - 16504, 9);
            w.field_m = w.field_m & -1025;
          }
          if (param0 == -802) {
            return false;
          }
          field_k = -56;
          return false;
        }
        if (hg.field_rb != ml.field_Jb) {
          se.field_E = se.field_E - 40;
          if (se.field_E <= 0) {
            se.field_E = 0;
            ml.field_Jb = gn.field_I[hg.field_rb];
            ma.field_d = ai.field_b;
            stackIn_7_0 = !(hg.field_rb >= -1 + lm.field_pb);
            dg.field_J = stackIn_7_0;
            if (0 > ai.field_b) {
              if (ai.field_b == 21 &&
                10 == hg.field_rb &&
                !fb.field_e.field_I.a(true)) {
                df.a(param0 - 16504, 9);
                w.field_m = w.field_m & -1025;
              }
              if (param0 == -802) {
                return false;
              }
              field_k = -56;
              return false;
            }
            if (ml.field_Jb >= 0) {
              var1Lifetime1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
              hj.field_g = 4 + (20 + var1Lifetime1 * (pb.field_e.field_C + pb.field_e.field_r));
              if (!pp.field_n) {
                hj.field_g = hj.field_g + 20;
              }
            }
          }
        } else {
          if (!io.field_g) {
            if (io.field_g) {
              if (ai.field_b == 21 &&
                10 == hg.field_rb &&
                !fb.field_e.field_I.a(true)) {
                df.a(param0 - 16504, 9);
                w.field_m = w.field_m & -1025;
              }
            } else {
              if (se.field_E <= 0) {
                if (ai.field_b == 21 &&
                  10 == hg.field_rb &&
                  !fb.field_e.field_I.a(true)) {
                  df.a(param0 - 16504, 9);
                  w.field_m = w.field_m & -1025;
                }
              } else {
                se.field_E = se.field_E - 40;
                if (se.field_E <= 0) {
                  se.field_E = 0;
                }
                if (ai.field_b == 21 &&
                  10 == hg.field_rb &&
                  !fb.field_e.field_I.a(true)) {
                  df.a(param0 - 16504, 9);
                  w.field_m = w.field_m & -1025;
                }
              }
            }
            if (param0 == -802) {
              return false;
            }
            field_k = -56;
            return false;
          }
          if (se.field_E < 400) {
            se.field_E = se.field_E + 40;
            if (se.field_E > 400) {
              se.field_E = 400;
            }
            if (ai.field_b == 21 &&
              10 == hg.field_rb &&
              !fb.field_e.field_I.a(true)) {
              df.a(param0 - 16504, 9);
              w.field_m = w.field_m & -1025;
            }
            if (param0 == -802) {
              return false;
            }
            field_k = -56;
            return false;
          }
          if (!io.field_g &&
            se.field_E > 0) {
            se.field_E = se.field_E - 40;
            if (se.field_E <= 0) {
              se.field_E = 0;
            }
          }
        }
        if (ai.field_b == 21 &&
          10 == hg.field_rb &&
          !fb.field_e.field_I.a(true)) {
          df.a(param0 - 16504, 9);
          w.field_m = w.field_m & -1025;
        }
        if (param0 != -802) {
          field_k = -56;
        }
        return false;
    }

    final static ef a(ul param0, int param1, int param2, int param3, ul param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ef stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ud.a(param1, param4, param3, (byte) -42)) {
            stackIn_2_0 = null;
            return (ef) (stackIn_2_0);
          }
          if (param2 != 0) {
            er.a(5);
          }
          stackIn_6_0 = rb.a(103, param0.a(param1, true, param3));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("er.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_f = new ma();
        field_h = 0;
        field_i = field_h;
        field_k = 0;
    }
}
