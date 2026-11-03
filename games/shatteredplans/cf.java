/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends WidgetContainer implements ButtonListener {
    static String field_M;
    private ns field_K;
    static int field_D;
    static Sprite field_F;
    private nq field_J;
    private String field_L;
    private int[] field_N;
    static int[] field_H;
    private int field_G;
    private FocusableWidget[] field_E;
    static String field_I;

    final static hh a(Archive param0, int param1, Archive param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        hh stackIn_5_0 = null;
        hh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vd.a(param3, param2, param4, param1 ^ 3)) {
            stackIn_2_0 = null;
            return (hh) (stackIn_2_0);
          }
          if (param1 == 1) {
            stackIn_7_0 = uc.a(param0.getFile(param3, -1, param4), 0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (hh) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cf.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(IntrusiveDeque param0, byte param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          ds.field_c = rr.a(param0, bb.field_b, pd.field_k, 2);
          if (param1 != 39) {
            field_D = -63;
          }
          if (je.field_d != 1) {
            if (AllianceExpiredEvent.field_n != 1) {
              if (null != il.field_bb &&
                uq.field_i >= 5) {
                PlayerEliminatedEvent.field_h = null;
              } else {
                PlayerEliminatedEvent.field_h = BattleSnapshot.field_s;
                if (null != PlayerEliminatedEvent.field_h) {
                  PlayerEliminatedEvent.field_h.d(-PlayerEliminatedEvent.field_h.field_l + pd.field_k, -PlayerEliminatedEvent.field_h.field_h + bb.field_b, -30872);
                }
              }
              BattleSnapshot.field_s = null;
              il.field_bb = null;
            } else {
              uq.field_i = uq.field_i + 1;
              if (il.field_bb == null) {
                var2_int = (ba.field_c - bb.field_b) * (ba.field_c - bb.field_b) + (-pd.field_k + ck.field_e) * (-pd.field_k + ck.field_e);
                if (5 < var2_int &&
                  uq.field_i > 5) {
                  il.field_bb = BattleSnapshot.field_s;
                }
              }
              if (il.field_bb != null) {
                il.field_bb.c(bb.field_b - il.field_bb.field_h, 2, -il.field_bb.field_l + pd.field_k);
              }
            }
          } else {
            ba.field_c = SliderWidget.field_P;
            ck.field_e = PointsVictoryChecker.field_p;
            uq.field_i = 0;
            BattleSnapshot.field_s = rr.a(param0, SliderWidget.field_P, PointsVictoryChecker.field_p, param1 - 37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("cf.J(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_9_1 = false;
        int stackIn_12_2;
        boolean stackIn_12_3;
        int stackIn_12_4;
        int stackIn_12_5;
        int stackIn_12_6;
        int stackIn_12_7;
        boolean stackIn_12_8;
        int stackIn_12_9;
        int stackIn_12_10;
        boolean stackIn_14_11 = false;
        EmailValidator.d(58);
        if (np.field_a != null) {
          stackIn_6_0 = (CheckboxPainter.a(true, np.field_a.field_Lb)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        stackIn_8_0 = 14;
        stackIn_9_1 = (GalaxyMap.field_f <= 50) ? false : true;
        stackIn_12_2 = param0 ^ 16777213;
        stackIn_12_3 = param1;
        stackIn_12_4 = 13;
        stackIn_12_5 = 0;
        stackIn_12_6 = 15;
        stackIn_12_7 = so.field_o;
        stackIn_12_8 = true;
        stackIn_12_9 = var2;
        stackIn_12_10 = 11;
        stackIn_14_11 = (v.field_b) || (MusicEnvelope.field_d);
        IsolationistAi.a(stackIn_8_0, stackIn_9_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_12_5, stackIn_12_6, stackIn_12_7, stackIn_12_8, stackIn_12_9 != 0, stackIn_12_10, stackIn_14_11);
        if (sm.field_e &&
          cl.field_n % 50 == 0) {
          js.field_f.h(58, 255);
        }
        if (DefendTask.field_u) {
          js.field_f.h(58, 255);
          DefendTask.field_u = false;
        }
        if (param0 != 2) {
          field_F = (Sprite) null;
        }
        if (GzipInflater.field_d) {
          js.field_f.h(10, param0 + 253);
          GzipInflater.field_d = false;
        }
        if (uc.field_B) {
          uc.a(320, mp.field_b.field_K, mp.field_b.field_q + mp.field_b.field_K, 240, 8, nd.field_i, true, DerelictMapReader.field_i, (byte) -87, 2, DerelictMapReader.field_i, mp.field_b, false, 8, 1);
          uc.field_B = false;
        }
    }

    final FocusableWidget a(WidgetListener param0, int param1, String param2) {
        FocusableWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        FocusableWidget stackIn_2_0 = null;
        FocusableWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new FocusableWidget(param2, param0);
          var4.field_p = (WidgetPainter) ((Object) new qp());
          var5 = -2 + this.field_n;
          this.a(0, this.field_n + 34, (byte) 127, 0, this.field_x);
          if (param1 <= 119) {
            stackIn_2_0 = (FocusableWidget) null;
            return stackIn_2_0;
          }
          var4.a(var5, 30, (byte) 103, 7, -14 + this.field_x);
          this.b((byte) -82, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("cf.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        if (param0 != 240) {
          cf.a(119, 101, 48, true);
        }
        field_M = null;
        field_F = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        NanoFrameTimer.a(param0, param3, param2, -77, cr.field_c, MusicVoiceMixer.field_l, tg.field_a);
        if (param1 != 8) {
          Archive var5 = (Archive) null;
          cf.a((Archive) null, -64, (Archive) null, 13, 77);
        }
    }

    cf(ns param0, nq param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int var4_int = 0;
        this.field_G = 0;
        try {
          this.field_J = param1;
          this.field_K = param0;
          this.field_L = param2;
          var4_int = this.field_L != null ? this.field_J.textHeight(this.field_L, 260, this.field_J.field_J) : 0;
          this.a(0, 22 + var4_int, (byte) 121, 0, 288);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_G;
          this.b(1 + var4_int, true);
          this.field_E[var4_int] = this.a((WidgetListener) (this), 122, param0);
          if (param1 < 99) {
            this.b(105, true);
          }
          this.field_N[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "cf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1 ^ 0, param2, param3);
        this.field_J.a(this.field_L, param3 + (this.field_m + 14), 10 + this.field_q + param2, this.field_x - 28, this.field_n, 16777215, -1, 0, 0, this.field_J.field_J);
        if (param1 != -11857) {
          field_D = 28;
        }
    }

    public final void a(FocusableWidget param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 6) {
            return;
          }
          for (var6_int = 0; var6_int < this.field_G; var6_int++) {
            if (param0 != this.field_E[var6_int]) {
              continue;
            }
            var7 = this.field_N[var6_int];
            if (var7 == -1) {
              this.field_K.i((byte) -104);
            } else {
              qj.a((byte) -127, this.field_N[var6_int]);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("cf.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= this.field_G) {
          return;
        }
        FocusableWidget[] var7 = new FocusableWidget[param0];
        FocusableWidget[] var3 = var7;
        int[] var4 = new int[param0];
        if (!param1) {
          this.field_K = (ns) null;
        }
        for (var5 = 0; var5 < this.field_G; var5++) {
          var7[var5] = this.field_E[var5];
          var4[var5] = this.field_N[var5];
        }
        this.field_N = var4;
        this.field_G = param0;
        this.field_E = var3;
    }

    static {
        field_M = "From <%0>: ";
        field_I = "Game Type: Derelicts";
    }
}
