/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static Sprite field_d;
    long key;
    static BitmapFont field_g;
    static String field_e;
    static String field_c;
    IntrusiveNode next;
    IntrusiveNode previous;
    static boolean field_b;

    final static boolean a(boolean param0, int param1, TrackCurve param2, Point2i param3) {
        boolean stackIn_17_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        CurvedRoadSegment var11 = null;
        StraightRoadSegment var12 = null;
        float var5Lifetime1;
        float var6Lifetime1;
        float var7Lifetime1;
        float var8Lifetime1;
        float var9Lifetime1;
        try {
          if (-param2.layer + param1 <= 1 &&
            param1 - param2.layer >= -1) {
            if (param0) {
              return false;
            }
            if (!(param2 instanceof StraightRoadSegment)) {
              var11 = (CurvedRoadSegment) (param2);
              var5 = (float)(param3.x - var11.center.x);
              var6 = (float)(param3.y - var11.center.y);
              var7 = (float)var11.leftCollisionRadius;
              var8 = (float)var11.rightCollisionRadius;
              if (var11.startAngle > var11.endAngle) {
                var7 = (float)var11.rightCollisionRadius;
                var8 = (float)var11.leftCollisionRadius;
              }
              var9 = var6 * var6 + var5 * var5;
              if (var7 * var7 > var9) {
                return false;
              }
              if (var8 * var8 < var9) {
                return false;
              }
              var10 = BoundaryIntersection.angleBetweenPoints(var11.center, param3, param0);
              stackIn_17_0 = var11.containsAngle((byte) -113, var10);
              return stackIn_17_0;
            }
            var12 = (StraightRoadSegment) (param2);
            var5Lifetime1 = (float)(-var12.start.x + param3.x);
            var6Lifetime1 = (float)(param3.y - var12.start.y);
            var7Lifetime1 = -(var6Lifetime1 * var12.offsetDirectionX) + var5Lifetime1 * var12.offsetDirectionY;
            if (!(0.0f > var7Lifetime1) &&
              !(var12.segmentLength < var7Lifetime1)) {
              var8Lifetime1 = var7Lifetime1 / var12.segmentLength;
              var9Lifetime1 = var12.offsetDirectionX * var5Lifetime1 + var12.offsetDirectionY * var6Lifetime1;
              stackIn_27_0 = ((float)var12.leftCollisionOffsetAt(var8Lifetime1, 0) <= var9Lifetime1) && (var9Lifetime1 <= (float)var12.rightCollisionOffsetAt(95, var8Lifetime1));
              return stackIn_27_0;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("hl.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 == -2) {
          field_e = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        IntrusiveNode.a((String) null, 26, true, (String) null, (AccountCreationForm) null, (String) null, 76);
        field_e = null;
        field_g = null;
        field_c = null;
        field_d = null;
    }

    final void unlink(int param0) {
        if (param0 != 0) {
          IntrusiveNode.clearSharedReferences(47);
          if (null == this.previous) {
            return;
          }
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.previous = null;
          this.next = null;
          return;
        }
        if (null == this.previous) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        this.previous = null;
        this.next = null;
    }

    final boolean isLinked(int param0) {
        if (null == this.previous) {
          return false;
        }
        if (param0 < 38) {
          return true;
        }
        return true;
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, AccountCreationForm param4, String param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        NameCheckProgressDialog var9 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23000) {
            var8 = (String) null;
            IntrusiveNode.a((String) null, 49, true, (String) null, (AccountCreationForm) null, (String) null, 51);
          }
          if (ValidationIndicator.field_M != bb.field_a) {
            return false;
          }
          var9 = new NameCheckProgressDialog(ka.field_b, param4);
          ka.field_b.a(var9, false);
          if (ma.a(0)) {
            var9.q(-124);
            return true;
          }
          ij.field_k = param5;
          TexturedRoadFillRenderer.field_k = param0;
          ArchiveProvider.field_b = param2;
          bb.field_a = ImageProducerRasterBuffer.field_n;
          SecondaryNodeDeque.field_a = param3;
          ResizableDialog.field_V = param6;
          BoundedRandomAccessFile.field_d = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("hl.VB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_e = "To use a <col=1>super powers</col> you must activate it. Doing so will scatter the three used powerups around the course.";
        field_c = "Back";
        field_b = false;
    }
}
