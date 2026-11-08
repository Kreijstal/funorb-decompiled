/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrowserCookieWriter {
    static boolean field_d;
    static TableScene[] field_b;
    static int field_c;
    static Sprite[][] field_a;
    static int[][] field_e;

    final static void a(boolean param0, int param1, int param2) {
        ScrollPane.a(param1, (byte) 0, param2);
        AppletUrlSupport.field_e.toRotationMatrix(LookupRetrySupport.field_h, -59);
        if (!param0) {
          return;
        }
        if (null != LoginPayloadKind.field_a.field_a) {
          LoginPayloadKind.field_a.field_j[ReflectionRequestSupport.field_e] = (ModelMesh) (LoginPayloadKind.field_a.field_a[ReflectionRequestSupport.field_e].createModelMeshTransformed(96, 1031, -1024, -1024, -10240, LookupRetrySupport.field_h));
        }
        LoginPayloadKind.field_a.drawBall(LookupRetrySupport.field_h, CushionSegment.field_i, ReflectionRequestSupport.field_e, -3637);
        PoolMatchController var3 = AccountContentDialog.field_ub;
        if (var3 == null) {
          var3 = TextWidgetPainter.field_e;
        }
        if (var3 == null) {
          return;
        }
        if (ReflectionRequestSupport.field_e < var3.gameModel.balls.length) {
          var3.gameModel.balls[ReflectionRequestSupport.field_e].transformDirty = true;
          return;
        }
    }

    final static void a(MeshBuilder param0, boolean param1) {
        int[] var4 = null;
        try {
          if (!param1) {
            String var3 = (String) null;
            BrowserCookieWriter.setBrowserCookie(-76L, (byte) -91, (java.applet.Applet) null, (String) null, (String) null);
          }
          var4 = param0.vertexZ;
          int[] var2 = var4;
          param0.vertexZ = param0.vertexX;
          param0.vertexX = var4;
          ImageProducerRasterBuffer.reverseFaceWinding(param0, (byte) 38);
          param0.clearCaches();
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = (Sprite[][]) null;
        if (param0 != 16006) {
          return;
        }
        field_e = (int[][]) null;
    }

    final static void setBrowserCookie(long param0, byte param1, java.applet.Applet param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            if (param1 != -120) {
              field_e = (int[][]) null;
            }
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param0 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + CookieDateSupport.formatCookieDate(MonotonicClock.monotonicTimeMillis((byte) -120) + param0 * 1000L, false) + "; Max-Age=" + param0;
              }
              JavaScriptBridge.evaluateScript("document.cookie=\"" + var7Lifetime4 + "\"", param2, (byte) 35);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("nn.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static MouseWheelInput createMouseWheelInput(int param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 96) {
            return (MouseWheelInput) null;
          }
          try {
            stackIn_3_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = false;
        field_e = new int[64][3];
        field_a = new Sprite[][]{null, null, null, null};
    }
}
