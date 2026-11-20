/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionCookieWriter {
    static boolean guestMode;
    static Sprite field_c;
    static int field_b;

    final static void writeSessionCookie(String param0, java.applet.Applet param1, int param2) {
        try {
          String var7 = null;
          String var4 = null;
          String var8 = null;
          String var5 = null;
          try {
            DialWidget.field_M = param0;
            var7 = param1.getParameter("cookieprefix");
            var4 = param1.getParameter("cookiehost");
            var8 = var7 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
            var5 = var8;
            if (0 == param0.length()) {
              var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            JavaScriptBridge.evaluateJavaScript(param1, -31645, "document.cookie=\"" + var5 + "\"");
            if (param2 != -1) {
              RoadFillRenderer var6 = (RoadFillRenderer) null;
              SessionCookieWriter.drawVisibleRoadFill((RoadSegment[]) null, (RoadFillRenderer) null, (byte) 41);
            }
            BoundaryLoopTracer.updateNavigationLinks(param1, (byte) 49);
          } catch (RuntimeException runtimeException) {
            throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mn.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        if (param0 >= -102) {
          guestMode = false;
        }
    }

    final static void drawVisibleRoadFill(RoadSegment[] param0, RoadFillRenderer param1, byte param2) {
        int var12 = 0;
        GrowableIntList var3 = null;
        GrowableIntList var4 = null;
        RoadSegment var5 = null;
        Point2i var6 = null;
        Point2i var7 = null;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        RoadSegment var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        GrowableIntList var20 = null;
        Point2i var21 = null;
        GrowableIntList var22 = null;
        Point2i var23 = null;
        Point2i var24 = null;
        Point2i var25 = null;
        GrowableIntList var26 = null;
        GrowableIntList var27 = null;
        Point2i var28 = null;
        Point2i var29 = null;
        GrowableIntList var30 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        Point2i var6Lifetime1;
        Point2i var7Lifetime1;
        var19 = HoldTheLine.field_D;
        try {
          var20 = BackgroundSprites.createGeometryIntList((byte) 80);
          var3 = var20;
          var22 = BackgroundSprites.createGeometryIntList((byte) 7);
          var4 = var22;
          var5 = param0[-1 + param0.length];
          var21 = var5.getLeftRoadStart(true);
          var23 = var5.getRightRoadStart(-14);
          var20.add(var21.x, (byte) 77);
          var20.add(var21.y, (byte) 104);
          var22.add(var23.x, (byte) 85);
          var22.add(var23.y, (byte) 81);
          var8 = OutlinedRoadStripRenderer.totalCurveLength(-1, param0);
          var9 = 1 + (int)(var8 / 40.0f);
          var10 = var8 / (float)var9;
          if (param2 >= -13) {
            return;
          }
          var11 = var10;
          for (var12 = 0; var12 < param0.length; var12++) {
            var13 = param0[var12];
            var14 = var13.length(50);
            var15 = 1 + (int)(var14 / 5.0f);
            var16 = var14 / (float)var15;
            var17 = 1.0f / (float)var15;
            for (var18 = var17; 1.0f > var18; var18 = var18 + var17) {
              var24 = var13.leftRoadEdgeAt(var18, 255);
              var6 = var24;
              var25 = var13.rightRoadEdgeAt(var18, false);
              var7 = var25;
              var3.add(var24.x, (byte) 110);
              var3.add(var24.y, (byte) 122);
              var4.add(var25.x, (byte) 102);
              var11 = var11 - var16;
              var4.add(var25.y, (byte) 110);
              if (var11 < 0.0f) {
                param1.drawRoadFill(FullscreenFocusCanvas.roadSlopeShade(var18, var13, 14, var18 - var17), var4.toArray(-50), var13.layer, var3.toArray(-90), (byte) 49);
                var26 = BackgroundSprites.createGeometryIntList((byte) 51);
                var3 = var26;
                var27 = BackgroundSprites.createGeometryIntList((byte) 21);
                var4 = var27;
                var26.add(var24.x, (byte) 84);
                var26.add(var24.y, (byte) 68);
                var27.add(var25.x, (byte) 67);
                var11 = var11 + var10;
                var27.add(var25.y, (byte) 77);
              }
            }
            var28 = var13.getLeftRoadEnd(7560980);
            var6Lifetime1 = var28;
            var29 = var13.getRightRoadEnd((byte) 29);
            var7Lifetime1 = var29;
            var3.add(var28.x, (byte) 117);
            var3.add(var28.y, (byte) 66);
            var4.add(var29.x, (byte) 95);
            var4.add(var29.y, (byte) 121);
            param1.drawRoadFill(FullscreenFocusCanvas.roadSlopeShade(1.0f, var13, 14, -var17 + var18), var4.toArray(-60), var13.layer, var3.toArray(-127), (byte) 49);
            var3 = BackgroundSprites.createGeometryIntList((byte) 17);
            var30 = BackgroundSprites.createGeometryIntList((byte) -128);
            var3.add(var6Lifetime1.x, (byte) 71);
            var3.add(var6Lifetime1.y, (byte) 123);
            var30.add(var7Lifetime1.x, (byte) 91);
            var30.add(var7Lifetime1.y, (byte) 101);
            var11 = var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("mn.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        guestMode = true;
        field_b = -1;
    }
}
