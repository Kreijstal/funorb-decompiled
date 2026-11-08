/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends IntrusiveNode {
    static int field_k;
    static int field_r;
    static String field_o;
    byte[] field_n;
    static PairedTextColumns field_q;
    static volatile long field_m;
    static String[] field_l;
    boolean field_p;

    final static void drawCubeFaces(int param0, int param1, Matrix3 param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Vector3[] var11 = null;
        RuntimeException var11_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Vector3[] var17 = null;
        Vector3[] var18 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          var17 = new Vector3[8];
          var18 = var17;
          var11 = var18;
          for (var12 = 0; var12 < 8; var12++) {
            stackIn_8_0 = ((1 & var12) == 0) ? param0 : param8;
            var13 = stackIn_8_0;
            stackIn_11_0 = ((var12 & 2) == 0) ? param7 : param4;
            var14 = stackIn_11_0;
            stackIn_14_0 = ((var12 & 4) != 0) ? param3 : param1;
            var15 = stackIn_14_0;
            var11[var12] = new Vector3(var13 * 2 - 2 << 12, var14 * 2 - 2 << 12, var15 * 2 - 2 << 12);
            var17[var12] = param2.transform(var17[var12], (byte) 83);
          }
          if (param2.field_f[8] > 0) {
            StatefulTextPainter.fillProjectedQuad(param10, param8 - param0, var18[1], param4 - param7, var18[0], var18[2], var18[3], param6, (byte) -43, param9);
          } else {
            StatefulTextPainter.fillProjectedQuad(param10, param8 - param0, var17[4], param4 - param7, var17[5], var17[7], var17[6], param6, (byte) -38, param9);
          }
          if (param5 > -85) {
            um.releaseStatics(-74);
          }
          if (param2.field_f[7] <= 0) {
            StatefulTextPainter.fillProjectedQuad(param10, param3 - param1, var18[7], -param0 + param8, var18[3], var18[2], var18[6], param6, (byte) -104, param9);
          } else {
            StatefulTextPainter.fillProjectedQuad(param10, param3 - param1, var18[4], -param0 + param8, var18[0], var18[1], var18[5], param6, (byte) -125, param9);
          }
          if (param2.field_f[6] > 0) {
            StatefulTextPainter.fillProjectedQuad(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
            return;
          }
          StatefulTextPainter.fillProjectedQuad(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_29_0 = var11_ref;
          stackIn_29_1 = new StringBuilder().append("um.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static BinaryBitmapFont loadBinaryBitmapFont(ResourceArchive param0, ResourceArchive param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 54) {
            field_o = (String) null;
          }
          if (PieceTiming.decodeSpriteSheetFromArchive(param4, false, param0, param2)) {
            stackIn_6_0 = TimerBarDemo.decodeBinaryFont(param1.getFile(param2, param4, true), -17);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (BinaryBitmapFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("um.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        int var1 = -127 / ((param0 - 74) / 32);
        field_q = null;
        field_l = null;
    }

    um() {
    }

    static {
        field_m = 0L;
        field_l = new String[]{"You can also use the '<col=ffff00>W</col>', '<col=ffff00>A</col>', '<col=ffff00>S</col>' and '<col=ffff00>D</col>' keys to move your piece.<br>Press '<col=ffff00>X</col>' to rotate your piece."};
    }
}
