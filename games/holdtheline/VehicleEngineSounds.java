/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VehicleEngineSounds {
    static CourseDefinition[][] field_c;
    NamedSoundEffect decelerate;
    NamedSoundEffect accelerateLoop;
    static String field_b;
    static BitmapFont field_a;

    final static void orPolygonMask(int[] param0, byte param1, byte param2, IndexedSprite param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var9 = HoldTheLine.field_D;
        try {
          if (param1 != -92) {
            return;
          }
          PolygonScanConverter.clearEdges();
          PolygonScanConverter.addPolygonEdges(param0, 0, param0.length);
          PolygonScanConverter.beginScan();
          while (true) {
            if (!PolygonScanConverter.nextSpan()) {
              return;
            }
            var4_int = PolygonScanConverter.spanStartX;
            if (0 > var4_int) {
              var4_int = 0;
            }
            var5 = PolygonScanConverter.spanEndX;
            if (param3.width <= var5) {
              var5 = -1 + param3.width;
            }
            var6 = PolygonScanConverter.spanY;
            if (0 > var6) {
              continue;
            }
            if (var6 >= param3.height) {
              continue;
            }
            var7 = var4_int + var6 * param3.width;
            var8 = -var4_int + var5;
            while (true) {
              var8--;
              if (var8 < 0) {
                break;
              }
              param3.pixels[var7] = (byte)kc.a((int) param3.pixels[var7], (int) param2);
              var7++;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("tk.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void clearDecodedSpriteSheet(boolean param0) {
        IterableSecondaryNodeDeque.field_e = (byte[][]) null;
        if (param0) {
          return;
        }
        EditableTextField.field_K = null;
        ad.field_d = null;
        Vector2i.field_g = null;
        DirectByteStorage.field_j = null;
        StraightRoadSegment.field_E = null;
    }

    public static void clearSharedReferences(int param0) {
        field_c = (CourseDefinition[][]) null;
        field_a = null;
        field_b = null;
        if (param0 != -7689) {
          field_c = (CourseDefinition[][]) null;
        }
    }

    VehicleEngineSounds(NamedSoundEffect param0, NamedSoundEffect param1) {
        try {
          this.accelerateLoop = param0;
          this.decelerate = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Suggested names: ";
    }
}
