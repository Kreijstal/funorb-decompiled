/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CollisionGeometry {
    static MenuList[] field_a;
    static boolean field_b;

    final static void drawCourseEdgeStrips(int param0, CourseDefinition param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        GrowableObjectList var3 = null;
        int var4 = 0;
        GrowableObjectList var5 = null;
        GrowableObjectList var6 = null;
        GrowableObjectList var7 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var4 = HoldTheLine.field_D;
        try {
          for (var2_int = 0; var2_int < param1.field_c.size; var2_int++) {
            var5 = (GrowableObjectList) (param1.field_c.elements[var2_int]);
            var3 = var5;
            if (param1.field_p == 0) {
              LeaderboardRequest.drawBoundaryStrip(WhirlpoolTables.field_c, var5, (byte) 92);
            } else {
              if (param1.field_p == 2) {
                LeaderboardRequest.drawBoundaryStrip(DialWidgetRenderer.field_f, var5, (byte) 18);
              } else {
                if (param1.field_p != 3) {
                  LeaderboardRequest.drawBoundaryStrip(new SolidRoadStripRenderer(7, 13941600), var5, (byte) 42);
                } else {
                  LeaderboardRequest.drawBoundaryStrip(new SolidRoadStripRenderer(4, 12566272), var5, (byte) 118);
                }
              }
            }
          }
          if (param0 != 29824) {
            field_a = (MenuList[]) null;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < param1.field_t.size; var2_intLifetime1++) {
            var6 = (GrowableObjectList) (param1.field_t.elements[var2_intLifetime1]);
            LeaderboardRequest.drawBoundaryStrip(new RoadShadowRenderer(7, 20.0f), var6, (byte) 82);
          }
          for (var2_intLifetime2 = 0; param1.field_t.size > var2_intLifetime2; var2_intLifetime2++) {
            var7 = (GrowableObjectList) (param1.field_t.elements[var2_intLifetime2]);
            LeaderboardRequest.drawBoundaryStrip(new OutlinedRoadStripRenderer(7, 20.0f), var7, (byte) 41);
          }
          if (param1.field_p == 3) {
            LeaderboardRequest.drawBoundaryStrip(ClientTextResources.field_c, param1.field_e, (byte) 95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("l.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 17310) {
          field_b = false;
        }
    }

    final static boolean overlapsOrientedRectangles(int param0, int param1, int param2, int param3, Vector2f param4, int param5, Point2i param6, Vector2f param7, Point2i param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9_int = -param8.x + param6.x;
          var10 = -param8.y + param6.y;
          var11 = Math.abs(param4.x * param7.x + param7.y * param4.y);
          var12 = Math.abs(-(param7.x * param4.y) + param7.y * param4.x);
          var13 = var12;
          var14 = var11;
          var15 = param7.x * (float)var9_int + (float)var10 * param7.y;
          var16 = -((float)var10 * param7.x) + param7.y * (float)var9_int;
          var17 = (float)var9_int * param4.x + (float)var10 * param4.y;
          var18 = -((float)var10 * param4.x) + param4.y * (float)var9_int;
          ShadedRoadStripRenderer.field_s[0] = (float)(-param2) + (-((float)param1 * var13) - var11 * (float)param3 + Math.abs(var15));
          if (ShadedRoadStripRenderer.field_s[0] > 0.0f) {
            return false;
          }
          ShadedRoadStripRenderer.field_s[1] = (float)(-param5) + (Math.abs(var16) - (var12 * (float)param3 + var14 * (float)param1));
          if (ShadedRoadStripRenderer.field_s[1] > 0.0f) {
            return false;
          }
          ShadedRoadStripRenderer.field_s[2] = Math.abs(var17) - (var11 * (float)param2 + (float)param5 * var12) - (float)param3;
          if (0.0f < ShadedRoadStripRenderer.field_s[2]) {
            return false;
          }
          ShadedRoadStripRenderer.field_s[3] = (float)(-param1) + (Math.abs(var18) - (var14 * (float)param5 + var13 * (float)param2));
          if (!(ShadedRoadStripRenderer.field_s[3] > (float)param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_18_0 = var9;
          stackIn_18_1 = new StringBuilder().append("l.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param8 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_a = new MenuList[14];
        field_b = false;
    }
}
