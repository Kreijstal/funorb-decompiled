/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static float[] field_b;
    static String field_d;
    static ll field_c;
    static String[] field_a;

    final static StraightRoadSegment a(float param0, byte param1, StraightRoadSegment param2, float param3) {
        Point2i var4 = null;
        RuntimeException var4_ref = null;
        Point2i var5 = null;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        StraightRoadSegment var11 = null;
        Point2i stackIn_3_0 = null;
        Point2i stackIn_6_0 = null;
        StraightRoadSegment stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0.0f) {
            stackIn_3_0 = param2.start;
          } else {
            stackIn_3_0 = param2.pointAt(false, param0);
          }
          var4 = stackIn_3_0;
          if (1.0f == param3) {
            stackIn_6_0 = param2.end;
          } else {
            stackIn_6_0 = param2.pointAt(false, param3);
          }
          var5 = stackIn_6_0;
          var6 = (int)((float)param2.controlPathStartOffset + (float)(param2.controlPathEndOffset - param2.controlPathStartOffset) * param0);
          var7 = (int)((float)(param2.controlPathEndOffset - param2.controlPathStartOffset) * param3 + (float)param2.controlPathStartOffset);
          var8 = param2.blendStartAngle + param0 * (-param2.blendStartAngle + param2.blendEndAngle);
          var10 = 122 / ((-59 - param1) / 49);
          var9 = param2.blendStartAngle + (param2.blendEndAngle - param2.blendStartAngle) * param3;
          var11 = new StraightRoadSegment(var4, var5, param2.layer, param2.leftRoadStartOffset, param2.rightRoadStartOffset, param2.leftRoadEndOffset, param2.rightRoadEndOffset, param2.leftCollisionStartOffset, param2.rightCollisionStartOffset, param2.leftCollisionEndOffset, param2.rightCollisionEndOffset, var6, var7, param2.field_w, param2.field_s, param2.field_m, param2.field_x, param2.field_t, param2.field_q, 0.0f, var8, var9);
          var11.offsetDirectionX = param2.offsetDirectionX;
          var11.offsetDirectionY = param2.offsetDirectionY;
          var11.layerSlope = param2.layerSlope;
          stackIn_7_0 = var11;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("pb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    static {
        field_b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f};
        field_c = new ll();
    }
}
