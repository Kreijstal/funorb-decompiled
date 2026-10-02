/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ac {
    static kj field_y;
    static int[] field_x;

    public static void c(int param0) {
        if (param0 != 0) {
            field_x = (int[]) null;
            field_y = null;
            field_x = null;
            return;
        }
        field_y = null;
        field_x = null;
    }

    final String c(int param0, el param1) {
        RuntimeException var3 = null;
        el var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 109) {
            var4 = (el) null;
            this.c(-111, (el) null);
          }
          stackIn_3_0 = ah.a(0, '*', param1.field_s.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);
          stackIn_6_1 = new StringBuilder().append("uh.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    uh(int param0) {
        this(ng.field_F, param0);
    }

    final static int b(int param0) {
        if (param0 == 16) {
            return ee.field_B[el.field_t % ee.field_B.length];
        }
        field_x = (int[]) null;
        return ee.field_B[el.field_t % ee.field_B.length];
    }

    private uh(m param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        oc.b(-96);
        SoftwareRasterizer.intersectClip(param1, param0, param4, param3);
        if (param2 == -14045) {
            return;
        }
        uh.b(-111);
    }

    final static nf a(pk param0, byte param1) {
        int var7 = 0;
        nf stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        nf var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          var2_int = param0.e((byte) -17, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          {
            var3 = ac.a((byte) 81, param0) ? 1 : 0;
            var4 = ac.a((byte) 7, param0) ? 1 : 0;
            var5 = new nf();
            var5.field_o = (short)param0.e((byte) -17, 16);
            var5.field_O = ji.a(var5.field_O, 16, 0, param0);
            var5.field_q = ji.a(var5.field_q, 16, 0, param0);
            var5.field_K = ji.a(var5.field_K, 16, 0, param0);
            var5.field_f = (short)param0.e((byte) -17, 16);
            var5.field_r = ji.a(var5.field_r, 16, 0, param0);
            if (param1 < 111) {
              field_y = (kj) null;
            }
            var5.field_B = ji.a(var5.field_B, 16, 0, param0);
            var5.field_c = ji.a(var5.field_c, 16, 0, param0);
            if (var3 != 0) {
              var5.field_m = (short)param0.e((byte) -17, 16);
              var5.field_M = ji.a(var5.field_M, 16, 0, param0);
              var5.field_t = ji.a(var5.field_t, 16, 0, param0);
              var5.field_i = ji.a(var5.field_i, 16, 0, param0);
              var5.field_P = ji.a(var5.field_P, 16, 0, param0);
              var5.field_u = ji.a(var5.field_u, 16, 0, param0);
              var5.field_e = ji.a(var5.field_e, 16, 0, param0);
            }
            if (var4 != 0) {
              param0.e((byte) -17, 16);
              var5.field_J = ji.a(var5.field_J, 16, 0, param0);
              var5.field_z = ji.a(var5.field_z, 16, 0, param0);
              var5.field_h = ji.a(var5.field_h, 16, 0, param0);
              var5.field_k = ji.a(var5.field_k, 16, 0, param0);
              var5.field_g = ji.a(var5.field_g, 16, 0, param0);
            }
            if (ac.a((byte) 102, param0)) {
              var5.field_G = ji.a(var5.field_G, 16, 0, param0);
            }
            L4: {
              if (ac.a((byte) 37, param0)) {
                var5.field_n = vk.a(var5.field_n, param0, 16, 8);
                var6 = 0;
                for (var7 = 0; var5.field_n.length > var7; var7++) {
                  if (~(255 & var5.field_n[var7]) < ~var6) {
                    var6 = 255 & var5.field_n[var7];
                  }
                }
                if (var6 != 0) {
                  var5.field_v = (byte)(1 + var6);
                  break L4;
                }
                var5.field_n = null;
                break L4;
              }
            }
            stackIn_28_0 = (nf) (var5);
            return stackIn_28_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = (RuntimeException) (var2);
          stackIn_31_1 = new StringBuilder().append("uh.BA(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawSpawnQueueAndHighlight(int methodGuard) {
        float highlightAngleRadians = 0.0f;
        float spawnCenterOffsetX = 0.0f;
        float spawnCenterOffsetY = 0.0f;
        int highlightCenterX = 0;
        int highlightCenterY = 0;
        float highlightAngleStep = 0.0f;
        int highlightRgb = 0;
        float highlightPhaseRadians = 0.0f;
        int highlightDotX = 0;
        int highlightDotY = 0;
        int clientControlFlowGuardSnapshot = 0;
        GameplayEntity spawnEntityToDraw = null;
        GameplayEntity spawnQueueHead = null;
        RuntimeException caughtSpawnDrawFailure = null;
        RuntimeException spawnDrawFailureForContext = null;
        clientControlFlowGuardSnapshot = Geoblox.field_C;
        try {
          if (methodGuard != 4740) {
            return;
          }
          spawnQueueHead = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.firstForIteration(0));
          if (spawnQueueHead == null) {
            return;
          }
          spawnCenterOffsetX = -320.0f + spawnQueueHead.positionX;
          spawnCenterOffsetY = -240.0f + spawnQueueHead.positionY;
          highlightCenterX = (int)((double)spawnCenterOffsetX * Math.cos((double)el.gameplaySession.boardAngleRadians) - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)spawnCenterOffsetY + 320.0);
          highlightCenterY = (int)((double)spawnCenterOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)spawnCenterOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians) + 240.0);
          highlightAngleStep = 0.01666666753590107f;
          highlightRgb = 16764416;
          highlightPhaseRadians = (float)el.gameplaySession.updateTick * 0.03999999910593033f;
          SoftwareRasterizer.fillCircleAlpha(highlightCenterX, highlightCenterY, 16, 16777215, 100);
          SoftwareRasterizer.drawCircle(highlightCenterX, highlightCenterY, 16, 0);
          for (highlightAngleRadians = highlightPhaseRadians + 3.1415927410125732f; highlightPhaseRadians < highlightAngleRadians; highlightAngleRadians = highlightAngleRadians - highlightAngleStep) {
            highlightDotX = (int)((double)highlightCenterX + 16.0 * Math.cos((double)highlightAngleRadians));
            highlightDotY = (int)((double)highlightCenterY + Math.sin((double)highlightAngleRadians) * 16.0);
            SoftwareRasterizer.fillCircle(highlightDotX, highlightDotY, 2, highlightRgb);
            highlightAngleStep = highlightAngleStep + highlightAngleStep * 0.25f;
            highlightRgb += 778;
          }
          spawnEntityToDraw = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.firstForIteration(0));
          L1: while (spawnEntityToDraw != null) {
            spawnEntityToDraw.drawFadingEntity(methodGuard - 4830);
            spawnEntityToDraw = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException spawnQueueDrawFailure) {
          caughtSpawnDrawFailure = spawnQueueDrawFailure;
          spawnDrawFailureForContext = caughtSpawnDrawFailure;
          throw t.a((Throwable) ((Object) spawnDrawFailureForContext), "uh.DA(" + methodGuard + ')');
        }
    }

    static {
        field_x = new int[128];
    }
}
