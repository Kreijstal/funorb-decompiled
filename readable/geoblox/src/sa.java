/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends RuntimeException {
    static int releasesPerDifficultyStep;
    Throwable field_a;
    String field_d;
    static double specialSpriteKindProbability;

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          if ((-1 == k.field_g) &&
              (gb.field_e == -1)) {
            k.field_g = PrefixCodeDecoder.pointerXSnapshot;
            gb.field_e = ue.pointerYSnapshot;
          }
          L1: {
            oe.field_V = oe.field_V + 1;
            if (param0 != null) {
              if (param0.equals(tc.field_a)) {
                break L1;
              }
            } else {
              if (null != tc.field_a) {
                break L1;
              }
            }
            if (!vl.field_q) {
              if (wg.field_e <= oe.field_V) {
                stackIn_16_0 = (oe.field_V < ue.field_j + wg.field_e) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              oe.field_V = 0;
            } else {
              if (vl.field_q) {
                oe.field_V = wg.field_e;
              } else {
                if (var2_int == 0) {
                  oe.field_V = 0;
                } else {
                  oe.field_V = wg.field_e;
                }
              }
            }
            PendingActionMarker.field_g = gb.field_e;
            bc.field_a = k.field_g;
            if (param0 == null) {
              if (var2_int != 0) {
                vl.field_q = true;
              }
            } else {
              vl.field_q = false;
            }
          }
          if ((!vl.field_q) &&
              (wg.field_e > oe.field_V) &&
              (wb.pointerActivitySnapshot)) {
            oe.field_V = 0;
            bc.field_a = k.field_g;
            PendingActionMarker.field_g = gb.field_e;
          }
          tc.field_a = param0;
          if ((vl.field_q) &&
              (cl.field_a == oe.field_V)) {
            vl.field_q = false;
            oe.field_V = 0;
          }
          gb.field_e = -1;
          k.field_g = -1;
          if (param1 >= 69) {
            return;
          }
          sa.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = (RuntimeException) (var2);
          stackIn_41_1 = new StringBuilder().append("sa.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void recomputeSpawnReleaseInterval(boolean preserveReleaseQuota) {
        int intervalTicks = (int)(201.0f / og.entityMotionSpeed * ij.spawnIntervalScale + 0.5f);
        kb.spawnReleaseIntervalTicks = intervalTicks;
        if (!preserveReleaseQuota) {
            releasesPerDifficultyStep = -10;
            return;
        }
    }

    final static String a(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        if (!(kd.field_b != IntrusiveDeque.field_d)) {
            return oj.field_a;
        }
        return hg.field_d;
    }

    final static boolean a(PlatformTaskDispatcher param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 37) {
            specialSpriteKindProbability = -0.44199917757712387;
          }
          stackIn_3_0 = param0.hasFullscreenSupport(param1 - 26135);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);
          stackIn_6_1 = new StringBuilder().append("sa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    sa(Throwable param0, String param1) {
        this.field_d = param1;
        this.field_a = param0;
    }

    static {
        releasesPerDifficultyStep = 20;
    }
}
