/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShotEvent extends IntrusiveNode {
    int[] field_l;
    static String joinRequestXsGame;
    static int[][] field_m;
    static int[] field_n;
    static Sprite[] field_o;
    int field_q;

    public static void releaseStatics(int param0) {
        if (param0 != -2048) {
          ShotEvent.closeClientSocket(111);
        }
        field_o = null;
        field_m = (int[][]) null;
        joinRequestXsGame = null;
        field_n = null;
    }

    final static int[] scatterByIndex(int[] indices, byte obfuscationGuard, int[] values) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var6 = new int[values.length];
          var3 = var6;
          for (var4 = 0; var4 < values.length; var4++) {
            var6[indices[var4]] = values[var4];
          }
          if (obfuscationGuard >= 2) {
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          stackIn_6_0 = (int[]) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("dn.A(");
          if (indices == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(',');
          if (values == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void releaseAwtLoadingResources(int obfuscationGuard) {
        if (obfuscationGuard != 8192) {
          field_m = (int[][]) null;
        }
        PacketAvailabilitySupport.field_c = null;
        ProjectedLineSupport.field_c = null;
    }

    final static int drawBallEventDebug(int param0, int param1, int param2, BallEvent param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0 * CollisionContact.field_h.baselineHeight;
          var5 = param2 * CollisionContact.field_h.baselineHeight;
          CollisionContact.field_h.d(param3.ballIndex + ": " + param3.describe((byte) 115), var4_int, var5, 16777215, 3355443);
          if (param3.field_i != null) {
            param2++;
            param2 = ShotEvent.drawBallEventDebug(1 + param0, 30409, param2, param3.field_i);
          }
          if (param3.field_d != null) {
            param2++;
            param2 = ShotEvent.drawBallEventDebug(param0 + 1, 30409, param2, param3.field_d);
          }
          if (param1 == 30409) {
            stackIn_10_0 = param2;
            return stackIn_10_0;
          }
          stackIn_8_0 = -95;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("dn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void closeClientSocket(int obfuscationGuard) {
        int var1 = 24 / ((-10 - obfuscationGuard) / 49);
        if (null != Atan2Support.field_c) {
          Atan2Support.field_c.c(-96);
          Atan2Support.field_c = null;
        }
    }

    final static int arcsineFixed16(int value, boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return 77;
        }
        value = value >> 5;
        if (value < 0) {
          if (-2048 <= value) {
            return -ByteArrayNode.field_m[-value];
          }
          return 0;
        }
        if (value <= 2048) {
          return ByteArrayNode.field_m[value];
        }
        return 0;
    }

    final static boolean isNonnegative(boolean param0, int param1) {
        if (!param0) {
          joinRequestXsGame = (String) null;
        }
        return param1 >= 0 ? true : false;
    }

    ShotEvent(int param0, int[] param1) {
        try {
          this.field_q = param0;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new int[8192];
        joinRequestXsGame = "Ask to join <%0>'s game";
    }
}
