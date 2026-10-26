/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu {
    static IntrusiveDeque field_b;
    static int field_a;

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 21) {
            field_a = -115;
          }
          if (bl.field_c >= 10) {
            if (uk.a((byte) -5)) {
              if (SoundCache.field_d != 0) {
                hj.a(param1, -12);
              } else {
                ul.a(param2, false, -7395);
                ArchiveIndex.a(0, false, param1, 0);
              }
            } else {
              vp.a();
              qa.a(240, (byte) -4, 320);
              ArchiveIndex.a(0, false, param1, 0);
            }
          } else {
            var3_int = 0;
            if (AceOfSkies.field_J) {
              AceOfSkies.field_J = false;
              var3_int = 1;
            }
            oj.a(qn.b(-115), g.field_h, param0 ^ 153, MenuScreen.a((byte) 68), var3_int != 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("pu.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 240) {
          field_a = -93;
        }
    }

    final static void a(byte param0, int param1, int param2, byte[] param3, int param4, int param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param6 > 0 &&
            !mg.a(param6, (byte) 32)) {
            throw new IllegalArgumentException("");
          }
          if (param5 > 0 &&
            !mg.a(param5, (byte) 6)) {
            throw new IllegalArgumentException("");
          }
          var7_int = rl.a(param0 + 59, param1);
          if (param0 != -55) {
            field_a = -4;
          }
          var8 = 0;
          stackIn_14_0 = (param5 <= param6) ? param5 : param6;
          var9 = stackIn_14_0;
          var10 = param6 >> 1;
          var11 = param5 >> 1;
          var12 = param3;
          var13 = new byte[var10 * (var11 * var7_int)];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param4, var8, param2, param6, param5, 0, param1, 5121, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = var7_int * param6;
            for (var17 = 0; var17 < var7_int; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var16 + var19;
              for (var21 = 0; var21 < var11; var21++) {
                for (var22 = 0; var22 < var10; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var15 = var15 + var12[var20];
                  var19 = var19 + var7_int;
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var13[var18] = (byte)(var15 >> 2);
                  var20 = var20 + var7_int;
                  var18 = var18 + var7_int;
                }
                var20 = var20 + var16;
                var19 = var19 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            var12 = var14;
            param5 = var11;
            param6 = var10;
            var8++;
            var9 = var9 >> 1;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_30_0 = var7;
          stackIn_30_1 = new StringBuilder().append("pu.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_b = new IntrusiveDeque();
    }
}
