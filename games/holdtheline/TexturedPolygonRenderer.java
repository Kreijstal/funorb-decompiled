/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TexturedPolygonRenderer {
    static int[] field_d;
    static float[] field_c;
    static String field_a;
    static String[] field_b;

    final static InputValidationError validateTopLevelDomain(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        InputValidationError stackIn_3_0 = null;
        InputValidationError stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          var2_int = param0.length();
          if (param1 < 34) {
            stackIn_3_0 = (InputValidationError) null;
            return stackIn_3_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_13_0 = DialogLayer.field_F;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qg.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void fillTexturedPolygon(Sprite param0, byte param1, int[] param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          PolygonScanConverter.clearEdges();
          var3_int = 62 / ((69 - param1) / 47);
          PolygonScanConverter.addPolygonEdges(param2, 0, param2.length);
          PolygonScanConverter.beginScan();
          while (true) {
            if (!PolygonScanConverter.nextSpan()) {
              return;
            }
            var4 = PolygonScanConverter.spanStartX;
            stackIn_4_0 = -1;
            stackIn_4_1 = ~var4;
            if (stackIn_4_0 < stackIn_4_1) {
              var4 = 0;
            }
            var5 = PolygonScanConverter.spanEndX;
            if (SoftwareRasterizer.width <= var5) {
              var5 = -1 + SoftwareRasterizer.width;
            }
            var6 = PolygonScanConverter.spanY;
            if (var6 < 0) {
              var6 = 0;
            }
            if (var6 >= SoftwareRasterizer.height) {
              var6 = -1 + SoftwareRasterizer.height;
            }
            var7 = var4 % param0.width;
            var8 = var6 % param0.height;
            var9 = var4 + SoftwareRasterizer.width * var6;
            var10 = var7 + param0.width * var8;
            var11 = param0.width - var7;
            var12 = -var4 + var5;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              incrementValue$0 = var9;
              var9++;
              incrementValue$1 = var10;
              var10++;
              SoftwareRasterizer.pixels[incrementValue$0] = param0.pixels[incrementValue$1];
              var11--;
              if (0 != var11) {
                continue;
              }
              var10 = param0.width * var8;
              var11 = param0.width;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qg.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 >= 51) {
          return;
        }
        field_a = (String) null;
    }

    final static Particle spawnParticle(int param0, int param1, int param2, int param3, int param4, IntrusiveDeque[] param5, int param6, int param7, int param8, int param9, byte param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        Particle stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11_int = -58 % ((-25 - param10) / 57);
          stackIn_1_0 = ArchiveIndex.createParticle(0, param8, param9, param6, 1, param7, param2, param1, param5, param4, 0, param3, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_4_0 = var11;
          stackIn_4_1 = new StringBuilder().append("qg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static boolean decodeArchivedSpriteSheet(int param0, int param1, byte param2, ResourceArchive param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param3.getFile(param0, true, param1);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          MarkerSliderRenderer.decodeSpriteSheet((byte) -97, var5);
          if (param2 == -27) {
            return true;
          }
          field_d = (int[]) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("qg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_d = new int[1024];
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = new float[]{0.6000000238418579f, 0.800000011920929f, 1.0f};
    }
}
