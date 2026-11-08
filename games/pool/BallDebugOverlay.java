/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BallDebugOverlay implements SceneDrawable {
    static byte[][] field_g;
    static Sprite field_d;
    static char[] field_j;
    static int field_f;
    private int field_e;
    static int field_b;
    static String tutorialBreakTryAgain;
    static int field_i;
    private PoolGameModel field_h;
    static int field_c;
    private Ball field_a;

    final static void readAppletParameters(int param0, int param1, int param2, String[] param3, java.applet.Applet param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = Pool.field_O;
        try {
          CollisionContact.field_o = param4.getParameter("overxgames");
          if (CollisionContact.field_o == null) {
            CollisionContact.field_o = "0";
          }
          LinkButtonPainter.field_e = param4.getParameter("overxachievements");
          if (null == LinkButtonPainter.field_e) {
            LinkButtonPainter.field_e = "0";
          }
          var6 = param4.getParameter("currency");
          if (var6 != null &&
            AgeValidator.isFriend(10, (CharSequence) ((Object) var6))) {
            VertexTransformSupport.field_e = GameApplet.a((byte) 63, (CharSequence) ((Object) var6));
          } else {
            VertexTransformSupport.field_e = 2;
          }
          if (param2 != 37) {
            field_j = (char[]) null;
          }
          ModelTableScene.field_L = param1;
          TableScene.field_k = param0;
          DialWidget.field_X = param5;
          TikiBallSkin.field_m = new Sprite[param3.length];
          for (var7 = 0; var7 < param3.length; var7++) {
            TikiBallSkin.field_m[var7] = new Sprite(317, 34);
          }
          SharedWidgetLayoutSupport.field_a = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_19_0 = var6_ref;
          stackIn_19_1 = new StringBuilder().append("ec.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void draw(int[] param0, int param1) {
        BallSkin stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int[] stackIn_2_3;
        int[] stackIn_2_4;
        boolean stackIn_3_5 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_2_0 = TransformRotationSupport.field_a;
          stackIn_2_1 = -1912602369;
          stackIn_2_2 = this.field_e;
          stackIn_2_3 = this.field_a.renderTransform;
          stackIn_2_4 = (int[]) (param0);
          stackIn_3_5 = (this.field_e == this.field_h.currentShot(param1 ^ -32240).field_I);
          ((BallSkin) (Object) stackIn_2_0).drawBallAndShadow(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_2_4, stackIn_3_5);
          if ((LinkButtonPainter.field_i & 4L) != 0L) {
            this.field_a.updateSlipDirection(param1 ^ 32245);
            if (this.field_a.velocityX != 0 ||
              this.field_a.velocityY != 0 ||
              this.field_a.velocityZ != 0) {
              ProjectedLineSupport.drawProjectedLine(16711680, 1, param0, FixedPointVectorSupport.a(new int[]{this.field_a.positionX, this.field_a.positionY, this.field_a.positionZ}, (byte) 1), FixedPointVectorSupport.a(new int[]{this.field_a.positionX + this.field_a.velocityX * 40, this.field_a.positionY + this.field_a.velocityY * 40, this.field_a.positionZ}, (byte) 1));
            }
            if (this.field_a.angularVelocityX != 0 ||
              this.field_a.angularVelocityY != 0 ||
              0 != this.field_a.angularVelocityZ) {
              ProjectedLineSupport.drawProjectedLine(65280, 1, param0, FixedPointVectorSupport.a(new int[]{this.field_a.positionX, this.field_a.positionY, this.field_a.positionZ}, (byte) 1), FixedPointVectorSupport.a(new int[]{40 * this.field_a.angularVelocityX + this.field_a.positionX, this.field_a.positionY + this.field_a.angularVelocityY * 40, this.field_a.angularVelocityZ * 40 + this.field_a.positionZ}, (byte) 1));
            }
            if (0 != this.field_a.field_l ||
              this.field_a.field_h != 0) {
              ProjectedLineSupport.drawProjectedLine(16776960, 1, param0, FixedPointVectorSupport.a(new int[]{this.field_a.positionX, this.field_a.positionY, this.field_a.positionZ}, (byte) 1), FixedPointVectorSupport.a(new int[]{40 * this.field_a.field_l + this.field_a.positionX, this.field_a.positionY + this.field_a.field_h * 40, this.field_a.positionZ}, (byte) 1));
            }
          }
          if (param1 != -32215) {
            field_b = 107;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ec.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int cubicEaseIn(int param0, int param1, int param2, int param3) {
        if (param0 != 32635) {
          BallDebugOverlay.readPacketString(true);
        }
        return param2 * param2 * (param2 * param3) / param1 / param1 / param1;
    }

    public final int viewDepth(int[] param0, int param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -27) {
            var4 = (int[]) null;
            this.viewDepth((int[]) null, -80);
          }
          stackIn_3_0 = param0[11] * (-param0[2] + this.field_a.renderTransform[2]) + (this.field_a.renderTransform[1] - param0[1]) * param0[10] + (this.field_a.renderTransform[0] - param0[0]) * param0[9];
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ec.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String decodeBase37Name(byte param0, long param1) {
        long var8 = 0L;
        StringBuilder discarded$0 = null;
        int var10 = Pool.field_O;
        if (param1 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param1) {
          return null;
        }
        if (param1 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        int var7 = 111 / ((-49 - param0) / 63);
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var8 = param1;
          param1 = param1 / 37L;
          discarded$0 = var6.append(TextureCache.field_d[(int)(-(37L * param1) + var8)]);
        }
        return var6.reverse().toString();
    }

    final static String readPacketString(boolean param0) {
        if (param0) {
          field_j = (char[]) null;
        }
        return PlayerContextMenu.field_e.j(-125);
    }

    public static void releaseStatics(byte param0) {
        field_g = (byte[][]) null;
        field_d = null;
        field_j = null;
        tutorialBreakTryAgain = null;
        if (param0 <= 77) {
          field_c = 92;
        }
    }

    BallDebugOverlay(int param0, PoolGameModel param1) {
        try {
          this.field_e = param0;
          this.field_h = param1;
          this.field_a = this.field_h.balls[this.field_e];
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ec.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new byte[50][];
        tutorialBreakTryAgain = "Try again!";
        field_j = new char[]{(char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112};
        field_b = 256;
    }
}
