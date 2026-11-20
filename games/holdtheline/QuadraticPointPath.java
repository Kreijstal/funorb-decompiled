/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuadraticPointPath extends PointPath {
    static int[] field_h;
    Point2i field_k;
    Point2i field_l;
    static ResourceArchive field_j;
    Point2i field_m;
    static SpriteSheetAsset field_i;

    final Point2i pointAt(boolean param0, float param1) {
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (!param0) {
          var3 = (int)((float)this.field_m.x * param1 * param1 + (param1 * ((-param1 + 1.0f) * (float)(this.field_l.x * 2)) + (-param1 + 1.0f) * (float)this.field_k.x * (1.0f - param1)));
          var4 = (int)(param1 * ((float)this.field_m.y * param1) + ((1.0f - param1) * (float)(2 * this.field_l.y) * param1 + (-param1 + 1.0f) * ((float)this.field_k.y * (-param1 + 1.0f))));
          return new Point2i(var3, var4);
        }
        QuadraticPointPath.clearSharedReferences(-65);
        var3Lifetime1 = (int)((float)this.field_m.x * param1 * param1 + (param1 * ((-param1 + 1.0f) * (float)(this.field_l.x * 2)) + (-param1 + 1.0f) * (float)this.field_k.x * (1.0f - param1)));
        var4Lifetime1 = (int)(param1 * ((float)this.field_m.y * param1) + ((1.0f - param1) * (float)(2 * this.field_l.y) * param1 + (-param1 + 1.0f) * ((float)this.field_k.y * (-param1 + 1.0f))));
        return new Point2i(var3Lifetime1, var4Lifetime1);
    }

    final static void b(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int var1;
        GrowableObjectList var2;
        var1 = 0;
        if (param0 > 101) {
          if (SecondaryNodeDeque.d(0)) {
            var1 = 1;
          } else {
            if (of.a(-969)) {
              if (!ProxySocketConnector.isFullscreenSupported(wi.field_b, 0)) {
                stackIn_23_0 = (null == MidiPcmStream.field_U) ? 3 : 2;
                var1 = stackIn_23_0;
              } else {
                AgeValidator.a(-29486, true);
                stackIn_27_0 = (null == MidiPcmStream.field_U) ? 3 : 2;
                var1 = stackIn_27_0;
              }
            }
          }
          pe.a(var1, true, (byte) -107);
          return;
        }
        var2 = (GrowableObjectList) null;
        QuadraticPointPath.a(-1.8653900623321533f, -111, (GrowableObjectList) null, (byte) 86, 0.6255527138710022f, (GrowableObjectList) null);
        if (SecondaryNodeDeque.d(0)) {
          var1 = 1;
        } else {
          if (of.a(-969)) {
            if (!ProxySocketConnector.isFullscreenSupported(wi.field_b, 0)) {
              stackIn_13_0 = (null == MidiPcmStream.field_U) ? 3 : 2;
              var1 = stackIn_13_0;
            } else {
              AgeValidator.a(-29486, true);
              stackIn_9_0 = (null == MidiPcmStream.field_U) ? 3 : 2;
              var1 = stackIn_9_0;
            }
          }
        }
        pe.a(var1, true, (byte) -107);
        return;
    }

    final static boolean isAsciiLetter(char param0, int param1) {
        if (param1 > -117) {
          return false;
        }
        if (65 <= param0) {
          if (90 >= param0) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    final static int a(int param0, int param1) {
        if (param1 != 2) {
          field_j = (ResourceArchive) null;
          return TriangleRasterState.field_e[param0 & 2047];
        }
        return TriangleRasterState.field_e[param0 & 2047];
    }

    final static void a(float param0, int param1, GrowableObjectList param2, byte param3, float param4, GrowableObjectList param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        BoundaryIntersection var10 = null;
        BoundaryIntersection var11 = null;
        BoundaryIntersection var12 = null;
        BoundaryIntersection var13 = null;
        BoundaryIntersection var14 = null;
        BoundaryIntersection var15 = null;
        var9 = HoldTheLine.field_D;
        try {
          var8 = param1;
          if (var8 == 0) {
            if (param0 > param4) {
              var11 = new BoundaryIntersection(false, param4);
              var10 = new BoundaryIntersection(false, param0);
              var11.paired = var10;
              var10.paired = var11;
              param5.add(var11, (byte) 6);
              param5.add(var10, (byte) 6);
            }
          } else {
            if (var8 != 1) {
              if (var8 == 2 &&
                param4 < param0) {
                var15 = new BoundaryIntersection(true, param4);
                var14 = new BoundaryIntersection(true, param0);
                var15.paired = var14;
                var14.paired = var15;
                param2.add(var15, (byte) 6);
                param2.add(var14, (byte) 6);
              }
            } else {
              var13 = new BoundaryIntersection(false, param4);
              var12 = new BoundaryIntersection(true, param0);
              var13.paired = var12;
              var12.paired = var13;
              param5.add(var13, (byte) 6);
              param2.add(var12, (byte) 6);
            }
          }
          if (param3 > 40) {
            return;
          }
          field_i = (SpriteSheetAsset) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("oe.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_i = null;
        if (param0 != 0) {
          return;
        }
        field_h = null;
        field_j = null;
    }

    QuadraticPointPath(float param0, int param1, boolean param2) {
        super(param0, param1, param2);
    }

    static {
        field_h = new int[8192];
    }
}
