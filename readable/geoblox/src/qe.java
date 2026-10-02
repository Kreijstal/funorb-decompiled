/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_b;
    static int[] field_c;
    static int field_a;

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, PlatformTaskDispatcher param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        rj[] var10 = null;
        PlatformTask var11 = null;
        var9 = Geoblox.field_C;
        try {
          if (!param4.hasFullscreenSupport(-26098)) {
            return null;
          }
          {
            L0: {
              if (param1 == ~param0) {
                var10 = vi.a(param1 ^ -112, param4);
                var6 = var10;
                if (var6 == null) {
                  stackIn_7_0 = null;
                  return (java.awt.Frame) ((Object) stackIn_7_0);
                }
                {
                  var7_int = 0;
                  L1: for (var8 = 0; var8 < var10.length; var8++) {
                    if (param3 != var10[var8].field_d) {
                      continue L1;
                    }
                    if (var10[var8].field_f == param2) {
                      if (param5 != 0) {
                        if (param5 != var10[var8].field_a) {
                          continue L1;
                        }
                      }
                      if (var7_int != 0) {
                        if (param0 >= var10[var8].field_h) {
                          continue L1;
                        }
                      }
                      var7_int = 1;
                      param0 = var10[var8].field_h;
                    }
                  }
                  if (var7_int != 0) {
                    break L0;
                  }
                  return null;
                }
              }
            }
            var11 = param4.requestEnterFullscreen(param2, param1 ^ 1743550127, param5, param0, param3);
            L5: while (var11.status == 0) {
              bc.sleepMillis(0, 10L);
            }
            var7 = (java.awt.Frame) (var11.result);
            if (var7 == null) {
              return null;
            }
            if (var11.status != 2) {
              stackIn_37_0 = (java.awt.Frame) (var7);
              return stackIn_37_0;
            }
            jk.a(var7, 10, param4);
            stackIn_35_0 = null;
            return (java.awt.Frame) ((Object) stackIn_35_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = (RuntimeException) (var6_ref);
          stackIn_40_1 = new StringBuilder().append("qe.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -8616) {
            qe.a(87);
        }
        field_c = null;
    }

    final static void adjustThemeReleaseQuota(int additionalReleases) {
        int clientControlFlowGuard = 0;
        RuntimeException caughtQuotaUpdateFailure = null;
        RuntimeException quotaUpdateFailureForContext = null;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          if (ArchiveNetworkClient.difficultyStep != 0) {
            if (ArchiveNetworkClient.difficultyStep < 21) {
              fa.releasesPerTheme = fa.releasesPerTheme + 10;
            }
          }
          fa.releasesPerTheme = fa.releasesPerTheme + additionalReleases;
          sa.releasesPerDifficultyStep = fa.releasesPerTheme / 3;
          L1: while (fa.releasesPerTheme > 3 * sa.releasesPerDifficultyStep) {
            sa.releasesPerDifficultyStep = sa.releasesPerDifficultyStep + 1;
          }
          return;
        } catch (java.lang.RuntimeException quotaUpdateFailure) {
          caughtQuotaUpdateFailure = quotaUpdateFailure;
          quotaUpdateFailureForContext = caughtQuotaUpdateFailure;
          throw t.a((Throwable) ((Object) quotaUpdateFailureForContext), "qe.B(" + additionalReleases + ')');
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2) {
        try {
            if (param2 > -66) {
                PlatformTaskDispatcher var4 = (PlatformTaskDispatcher) null;
                qe.a(91, -118, 58, -45, (PlatformTaskDispatcher) null, -79);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qe.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
