/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerOfTwoHelpers {
    static String field_a;

    final static int nextPowerOfTwo(int param0, boolean param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        if (!param1) {
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        field_a = (String) null;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    final static void addRankingEntry(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        MidiNoteMixer.field_m[FullscreenFailureKind.rankingCount] = param0;
        EmailAddressValidator.field_m[FullscreenFailureKind.rankingCount] = FullscreenFailureKind.rankingCount;
        if (param3 > -77) {
          PowerOfTwoHelpers.addRankingEntry(58, -125, 62, 83, 51, -33);
          RadialSelectorWidget.field_I[FullscreenFailureKind.rankingCount] = param4;
          if (param4 <= DisplayModeInfo.field_e) {
            if (param4 < ArchiveContainerHelpers.field_d) {
              ContentTransitionDialog.field_W = param4;
            }
            DiskCacheRequest.field_B[FullscreenFailureKind.rankingCount] = param1;
            MouseInputHandler.field_c[FullscreenFailureKind.rankingCount] = param2;
            AccountValidationHelpers.field_c[FullscreenFailureKind.rankingCount] = param5;
            var6 = param2 + param1 + param5;
            if (var6 == 0) {
              stackIn_21_0 = 0;
            } else {
              stackIn_21_0 = param1 * 1000 / var6;
            }
            var7 = stackIn_21_0;
          } else {
            ByteStorage.field_b = param4;
            if (param4 < ArchiveContainerHelpers.field_d) {
              ContentTransitionDialog.field_W = param4;
            }
            DiskCacheRequest.field_B[FullscreenFailureKind.rankingCount] = param1;
            MouseInputHandler.field_c[FullscreenFailureKind.rankingCount] = param2;
            AccountValidationHelpers.field_c[FullscreenFailureKind.rankingCount] = param5;
            var6 = param2 + param1 + param5;
            if (var6 == 0) {
              stackIn_8_0 = 0;
            } else {
              stackIn_8_0 = param1 * 1000 / var6;
            }
            var7 = stackIn_8_0;
          }
          KeyboardShutdownHelpers.field_c[FullscreenFailureKind.rankingCount] = var7;
          if (ContentTransitionDialog.field_W > var7) {
            ContentTransitionDialog.field_W = var7;
          }
          if (ByteStorage.field_b < var7) {
            ByteStorage.field_b = var7;
          }
          FullscreenFailureKind.rankingCount = FullscreenFailureKind.rankingCount + 1;
          return;
        }
        RadialSelectorWidget.field_I[FullscreenFailureKind.rankingCount] = param4;
        if (param4 <= DisplayModeInfo.field_e) {
          if (param4 < ArchiveContainerHelpers.field_d) {
            ContentTransitionDialog.field_W = param4;
          }
          DiskCacheRequest.field_B[FullscreenFailureKind.rankingCount] = param1;
          MouseInputHandler.field_c[FullscreenFailureKind.rankingCount] = param2;
          AccountValidationHelpers.field_c[FullscreenFailureKind.rankingCount] = param5;
          var6Lifetime1 = param2 + param1 + param5;
          if (var6Lifetime1 == 0) {
            stackIn_36_0 = 0;
          } else {
            stackIn_36_0 = param1 * 1000 / var6Lifetime1;
          }
          var7Lifetime1 = stackIn_36_0;
          KeyboardShutdownHelpers.field_c[FullscreenFailureKind.rankingCount] = var7Lifetime1;
          if (ContentTransitionDialog.field_W > var7Lifetime1) {
            ContentTransitionDialog.field_W = var7Lifetime1;
          }
          if (ByteStorage.field_b < var7Lifetime1) {
            ByteStorage.field_b = var7Lifetime1;
          }
          FullscreenFailureKind.rankingCount = FullscreenFailureKind.rankingCount + 1;
          return;
        }
        ByteStorage.field_b = param4;
        if (param4 < ArchiveContainerHelpers.field_d) {
          ContentTransitionDialog.field_W = param4;
        }
        DiskCacheRequest.field_B[FullscreenFailureKind.rankingCount] = param1;
        MouseInputHandler.field_c[FullscreenFailureKind.rankingCount] = param2;
        AccountValidationHelpers.field_c[FullscreenFailureKind.rankingCount] = param5;
        var6Lifetime2 = param2 + param1 + param5;
        if (var6Lifetime2 == 0) {
          stackIn_49_0 = 0;
        } else {
          stackIn_49_0 = param1 * 1000 / var6Lifetime2;
        }
        var7Lifetime2 = stackIn_49_0;
        KeyboardShutdownHelpers.field_c[FullscreenFailureKind.rankingCount] = var7Lifetime2;
        if (ContentTransitionDialog.field_W > var7Lifetime2) {
          ContentTransitionDialog.field_W = var7Lifetime2;
        }
        if (ByteStorage.field_b < var7Lifetime2) {
          ByteStorage.field_b = var7Lifetime2;
        }
        FullscreenFailureKind.rankingCount = FullscreenFailureKind.rankingCount + 1;
        return;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -63) {
          PowerOfTwoHelpers.nextPowerOfTwo(-6, false);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "High score service unavailable";
    }
}
