/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialStep extends IntrusiveNode {
    int field_s;
    private int field_n;
    private Sprite field_z;
    static String ratedGameTipsSetupSingular;
    private IntrusiveDeque field_r;
    int field_l;
    TextHotspotRegion field_q;
    int field_o;
    int field_u;
    private int field_t;
    static NineSliceFrame field_m;
    private String field_p;
    static int[] field_w;
    private int field_y;
    static int field_v;

    final int getHeight(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -101) {
            stackIn_4_0 = 20 + (qa.field_v.height + this.field_t);
            return stackIn_4_0;
          }
          stackIn_2_0 = -65;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "bk.D(" + param0 + ')');
        }
    }

    final void buildOutline(int param0) {
        try {
          this.field_q = ag.findHotspotRegion(-PoolGameModel.field_k.localY + DebouncedValidationProvider.field_f, this.field_r, wn.field_i - PoolGameModel.field_k.localX, 15395);
          int var2_int = 25 % ((param0 - 39) / 62);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "bk.A(" + param0 + ')');
        }
    }

    final void drawOutline(int param0, int param1, int param2) {
        try {
          this.field_q.drawOutline(param0, PoolGameModel.field_k.localX, param1, -1, true, PoolGameModel.field_k.localY);
          if (param2 != 9750) {
            this.field_u = -125;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "bk.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void draw(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            field_w = (int[]) null;
          }
          this.field_z.draw(PoolGameModel.field_k.localX, PoolGameModel.field_k.localY);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "bk.C(" + param0 + ')');
        }
    }

    final void attachToTutorial(TutorialController param0, int param1) {
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.field_n = -20 + PoolGameModel.field_k.width;
          if (param1 <= 36) {
            this.field_l = 75;
          }
          this.field_y = TextLayout.field_f;
          if (this.field_p.indexOf("<img=") == -1) {
            this.field_y = sa.field_h.baselineHeight;
          }
          this.field_t = sa.field_h.measureWrappedHeight(this.field_p, this.field_n, this.field_y);
          if (param0.field_d.field_e != this.next &&
            !pl.field_b.enabled) {
            pl.field_b.enabled = true;
          } else {
            if (this.next == param0.field_d.field_e &&
              pl.field_b.enabled) {
              pl.field_b.pressedButton = 0;
              pl.field_b.enabled = false;
            }
          }
          if ((param0.field_d.field_e != this.previous ||
            param0.field_j != null) &&
            !jq.field_d.enabled) {
            jq.field_d.enabled = true;
          } else {
            if (this.previous == param0.field_d.field_e &&
              null == param0.field_j &&
              jq.field_d.enabled) {
              jq.field_d.enabled = false;
              jq.field_d.pressedButton = 0;
            }
          }
          var3_int = this.field_s;
          if (0 == var3_int) {
            param0.field_a.leaveShotMode(false, (byte) -109);
          } else {
            if (2 != var3_int) {
              if (var3_int == 1) {
                param0.field_a.leaveShotMode(false, (byte) -127);
              }
            } else {
              param0.field_a.leaveShotMode(false, (byte) -122);
            }
          }
          this.field_z = new Sprite(PoolGameModel.field_k.width, this.field_t + 10);
          this.field_z.bindAsRenderTarget();
          sa.field_h.setInlineSprites(AccountCreationForm.field_Z, bi.field_d);
          sa.field_h.drawParagraph(ef.a("</col>", this.field_p, (byte) 4, "<col=ccccff>"), 10, 7, this.field_n, this.field_t, 16777215, 3355443, 0, 1, this.field_y);
          this.field_r = SocketArchiveNetworkClient.a(new int[]{this.field_y}, this.field_n, this.field_p, 7, sa.field_h, true, 10);
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_54_0 = var3;
          stackIn_54_1 = new StringBuilder().append("bk.G(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean advanceProgress(int param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l > this.field_u) {
            this.field_u = this.field_u + param0;
          }
          if (param1 != 127) {
            this.field_y = -57;
          }
          stackIn_11_0 = !(this.field_u < this.field_l);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "bk.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean areAllBallsStopped(Ball[] param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          if (param1 != 57) {
            ratedGameTipsSetupSingular = (String) null;
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= param0.length))) {
            stackIn_15_0 = param0[var2_int].motionState;
            if (var3 == 0) {
              if (stackIn_15_0 != 0) {
                return true;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = 0;
          }
          return stackIn_15_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("bk.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -5917) {
            TutorialStep.releaseStatics(-18);
          }
          field_w = null;
          field_m = null;
          ratedGameTipsSetupSingular = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "bk.H(" + param0 + ')');
        }
    }

    TutorialStep(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_q = null;
        try {
          this.field_p = param0;
          this.field_l = param1;
          this.field_u = 0;
          if (param2 != -1) {
            this.field_s = 1 << param2;
          }
          this.field_o = ~this.field_s;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    TutorialStep(String param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_q = null;
        try {
          this.field_o = param3;
          this.field_p = param0;
          if (param2 != -1) {
            this.field_s = 1 << param2;
          }
          this.field_u = 0;
          this.field_l = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    TutorialStep(String param0, int param1, int param2, IntrusiveDeque param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        TutorialStep var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        this.field_s = 0;
        this.field_q = null;
        try {
          this.field_u = 0;
          this.field_l = param1;
          if (param2 != -1) {
            this.field_s = 1 << param2;
          }
          this.field_p = param0;
          this.field_o = ~this.field_s;
          var5 = new IntrusiveDequeCursor(param3);
          var6 = (TutorialStep) (var5.last((byte) -92));
          while (null != var6) {
            this.field_o = this.field_o & ~var6.field_s;
            var6 = (TutorialStep) (var5.previous(-114));
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_w = new int[4];
        ratedGameTipsSetupSingular = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
