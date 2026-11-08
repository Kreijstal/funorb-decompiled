/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static int field_h;
    static int[][] field_a;
    static String askingToJoinXsGame;
    static java.awt.Frame field_e;
    static int[] field_d;
    TextLineLayout[] field_b;
    static String muChatGameHide;
    static int field_f;

    final int maxRightEdge(int param0) {
        int var4 = 0;
        int var2;
        TextLineLayout[] var3;
        TextLineLayout var5;
        int var7;
        int var6;
        var7 = Pool.field_O;
        var2 = param0;
        if (null != this.field_b) {
          var3 = this.field_b;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.rightEdge(param0 - 56);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int caretX(int param0, byte param1) {
        int var4 = 0;
        TextLineLayout var5 = null;
        TextLineLayout[] var6 = this.field_b;
        TextLineLayout[] var3 = var6;
        if (param1 > -35) {
          return -23;
        }
        for (var4 = 0; var4 < var6.length; var4++) {
          var5 = var6[var4];
          if (var5.caretXs.length > param0) {
            return var5.caretXs[param0];
          }
          param0 = param0 - (-1 + var5.caretXs.length);
        }
        return 0;
    }

    final int totalHeight(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 != 66) {
          this.totalHeight((byte) 123);
        }
        if (null != this.field_b &&
          this.field_b.length > 0) {
          stackIn_6_0 = -this.field_b[0].top + this.field_b[this.field_b.length - 1].bottom;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int lineOfCaret(int param0, int param1) {
        int var3 = 0;
        TextLineLayout var4 = null;
        for (var3 = param1; this.field_b.length > var3; var3++) {
          var4 = this.field_b[var3];
          if (var4.caretXs.length > param0) {
            return var3;
          }
          param0 = param0 - (var4.caretXs.length - 1);
        }
        return this.field_b.length;
    }

    final int a(int param0, byte param1, String param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Pool.field_O;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          if (param1 != 105) {
            stackIn_3_0 = -67;
            return stackIn_3_0;
          }
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (var9 != 60) {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (0 >= var5_int) {
            return 0;
          }
          stackIn_20_0 = (param3 - param0 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("op.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static float[] a(int param0, int[] param1, int param2) {
        int var4 = 0;
        float[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var5 = null;
        float[] var6 = null;
        float[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new float[param1.length];
          var3 = var6;
          if (param2 < 61) {
            var5 = (int[]) null;
            TextLayout.a((int[]) null, -54, (int[]) null, -45, (int[]) null, (byte) 22, 22, (int[]) null, (int[]) null, (byte) 2, (int[]) null);
          }
          for (var4 = 0; param1.length > var4; var4++) {
            var6[var4] = DebugTuningSupport.scaleByPowerOfTwo(-1, param0, param1[var4]);
          }
          stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("op.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, byte param5, int param6, int[] param7, int[] param8, byte param9, int[] param10) {
        int var17 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        Object var13 = null;
        ro var14 = null;
        ro var15 = null;
        int var16 = 0;
        ro var18 = null;
        ro var19 = null;
        ro var20 = null;
        ro var15Lifetime1;
        ro var15Lifetime2;
        ro var15Lifetime3;
        ro var15Lifetime4;
        int var11_intLifetime1;
        int var11_intLifetime2;
        int var12Lifetime1;
        try {
          if (ViewportController.field_c == null ||
            !(param1 <= ViewportController.field_c.length)) {
            kg.a(param1, (byte) 49);
          }
          for (var11_int = 0; param1 > var11_int; var11_int++) {
            ViewportController.field_c[var11_int].a(param8[var11_int], param10[var11_int], param2[var11_int], param0[var11_int], (byte) 120, param4);
          }
          var11_intLifetime1 = 0;
          var12 = 0;
          var13 = null;
          var18 = ViewportController.field_c[0];
          var15 = var18;
          var15Lifetime1 = var18;
          var14 = var18;
          var19 = ViewportController.field_c[1];
          var15Lifetime2 = var19;
          var15Lifetime3 = var19;
          var18.a((byte) 60, var19);
          if (param9 == 0 &&
            param5 == 0) {
            var20 = ViewportController.field_c[-1 + param1];
            var13 = var20;
            var20.a((byte) 60, var18);
            var18.a(var20, -16875);
          }
          if (param9 == 0 &&
            param5 == 0) {
            stackIn_15_0 = param1 + 1;
          } else {
            stackIn_15_0 = param1;
          }
          var16 = stackIn_15_0;
          for (var17 = param3; var17 < var16; var17++) {
            if (param1 > var17) {
              var15Lifetime4 = ViewportController.field_c[var17];
            } else {
              var15Lifetime4 = ViewportController.field_c[var17 % param1];
            }
            if (param1 > 1 + var17) {
              var15Lifetime4.a((byte) 60, ViewportController.field_c[1 + var17]);
              var15Lifetime4.a(var14, -16875);
            } else {
              if (0 == param9 &&
                param5 == 0) {
                var15Lifetime4.a((byte) 60, ViewportController.field_c[0]);
                var15Lifetime4.a(var14, param3 ^ -16876);
              }
            }
            if (!var14.b(var15Lifetime4, 24)) {
              if ((var14.field_r & 240) == 0) {
                if (var15Lifetime4.field_i == 0 &&
                  0 == var15Lifetime4.field_k) {
                  MatchingTextValidator.field_q = var14.field_f;
                  ResourceArchive.field_h = var14.field_m;
                } else {
                  MatchingTextValidator.field_q = var15Lifetime4.field_i;
                  ResourceArchive.field_h = var15Lifetime4.field_k;
                }
                var12Lifetime1 = 0;
              } else {
                var12Lifetime1 = 2;
              }
              if (0 == (15 & var14.field_r)) {
                var11_intLifetime2 = 0;
                if (var13 == null) {
                  ThreeSliceButtonPainter.field_w = var14.field_f;
                  DelayedServerPacket.field_u = var14.field_m;
                } else {
                  DelayedServerPacket.field_u = var14.field_k;
                  ThreeSliceButtonPainter.field_w = var14.field_i;
                }
              } else {
                var11_intLifetime2 = 2;
              }
              FixedAngleSupport.$cfr$intArgs$a$29f688675a86(var14.field_j[0], param6, 19, var14.field_h[1], var14.field_q[1], var14.field_q[0], var14.field_h[0], var11_intLifetime2, var14.field_j[1], param7, var12Lifetime1);
            }
            var13 = var14;
            var14 = var15Lifetime4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_45_0 = var11;
          stackIn_45_1 = new StringBuilder().append("op.H(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param8 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final int caretIndexAtPoint(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        TextLineLayout var6;
        int var7;
        int var8;
        var8 = Pool.field_O;
        if (this.field_b != null &&
          this.field_b.length != 0 &&
          this.field_b[0].top <= param0) {
          if (this.field_b[param2 + this.field_b.length].bottom < param0) {
            return -1;
          }
          if (this.field_b.length == 1) {
            return this.field_b[0].nearestCaret(-109, param1);
          }
          var4 = 0;
          for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (param0 >= var6.top &&
              var6.bottom >= param0) {
              var7 = var6.nearestCaret(-111, param1);
              if (var7 != -1) {
                return var7 + var4;
              }
              return -1;
            }
            var4 = var4 + (-1 + var6.caretXs.length);
          }
          return -1;
        }
        return -1;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        muChatGameHide = null;
        if (param0 != 0) {
          muChatGameHide = (String) null;
        }
        askingToJoinXsGame = null;
        field_a = (int[][]) null;
        field_e = null;
    }

    static {
        muChatGameHide = "Hide game chat";
        askingToJoinXsGame = "Asking to join <%0>'s game...";
        field_h = 0;
        field_d = new int[]{3456, 3456};
    }
}
