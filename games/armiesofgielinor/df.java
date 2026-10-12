/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends tj implements fb, he {
    private boolean field_H;
    private fw field_O;
    private fn field_Q;
    static int field_E;
    static int field_T;
    private fw field_N;
    static int field_M;
    private fw field_R;
    private boolean field_P;
    private String field_I;
    private fn field_S;
    private boolean field_F;
    static ClientUiComponent field_K;

    final void a(int param0, String param1) {
        fn var3 = null;
        String var4 = null;
        try {
          var3 = this.field_Q;
          var4 = param1;
          var3.a(false, var4, -27934);
          if (param0 != -17376) {
            this.field_O = (fw) null;
          }
          this.field_S.k(110);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "df.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 > -52) {
            df.a(84);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "df.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    df(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        ta dupTemp$0 = null;
        ta dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        fw stackIn_18_1 = null;
        fw stackIn_18_2 = null;
        fw stackIn_19_1 = null;
        fw stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        nu var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        pf var9 = null;
        ta var12 = null;
        ta var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_H = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_F = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_P = stackIn_10_1;
          this.field_I = param1;
          if (this.field_P && (this.field_H ||
            this.field_F)) {
            throw new IllegalStateException();
          }
          this.field_Q = (fn) ((Object) new ma(param0, (qo) (this), 100));
          this.field_S = (fn) ((Object) new ma("", (qo) (this), 20));
          if (!this.field_P) {
            this.field_O = new fw(ResourceRequest.field_v, (qo) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_F) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = fj.field_a;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = pi.field_O;
            }
            this.field_N = new fw(stackIn_19_3, (qo) null);
            if (this.field_H) {
              this.field_R = new fw(li.field_p, (qo) (this));
            }
          } else {
            this.field_O = new fw(RegionAnchor.field_k, (qo) null);
            this.field_N = new fw(dt.field_c, (qo) null);
            this.field_Q.field_I = false;
          }
          this.field_Q.painter = (WidgetPainter) ((Object) new lu(10000536));
          this.field_S.painter = (WidgetPainter) ((Object) new ol(10000536));
          var6 = new nu();
          this.field_O.painter = (WidgetPainter) ((Object) var6);
          if (this.field_N != null) {
            this.field_N.painter = (WidgetPainter) ((Object) var6);
          }
          if (this.field_R != null) {
            this.field_R.painter = (WidgetPainter) ((Object) var6);
          }
          this.field_Q.field_s = de.field_d;
          if (null != this.field_R) {
            this.field_R.field_s = hb.field_b;
          }
          if (!this.field_P) {
            if (this.field_F) {
              this.field_N.field_s = CombatSandbox.field_e;
              this.field_N.painter = (WidgetPainter) ((Object) new td());
            } else {
              this.field_N.painter = (WidgetPainter) ((Object) new td());
            }
          } else {
            this.field_N.field_s = VineGrowthAction.field_v;
          }
          this.y = 15;
          var7 = ArmiesOfGielinor.field_J;
          if (null != this.field_I) {
            this.y = this.y + (5 + var7.getParagraphHeight(this.field_I, this.width - 40, var7.field_H));
          }
          var8 = bh.field_J;
          var9 = ea.a(0, CombatEvent.d((byte) 34));
          if (var9 != CombatSandbox.field_j) {
            if (var9 == ps.field_y) {
              var8 = DualNodeDeque.field_h;
            }
          } else {
            var8 = DeployAction.field_t;
          }
          dupTemp$0 = new ta(10, this.y, this.width - 20, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a((byte) 10, (Widget) (dupTemp$0));
          this.y = this.y + (((Widget) ((Object) var12)).height + 5);
          dupTemp$1 = new ta(10, this.y, -20 + this.width, 25, this.field_S, false, 80, 3, var7, 16777215, jj.field_h);
          var13 = dupTemp$1;
          this.a((byte) 10, (Widget) (dupTemp$1));
          this.field_O.field_x = (qo) (this);
          this.y = this.y + (5 + ((Widget) ((Object) var13)).height);
          if (this.field_R != null) {
            this.field_R.field_x = (qo) (this);
          }
          if (this.field_N != null) {
            this.field_N.field_x = (qo) (this);
          }
          if (null == this.field_R) {
            this.field_O.setBounds(8, -10 + (this.width - 6), this.y, 8192, 30);
            this.y = this.y + 35;
          } else {
            this.field_O.setBounds(85, this.width - 95, this.y, 8192, 30);
            this.y = this.y + 60;
          }
          if (null != this.field_R) {
            this.field_R.setBounds(8, -10 + (this.width - 6), this.y, 8192, 30);
            this.y = this.y + 35;
          }
          if (this.field_N != null) {
            if (!this.field_P &&
              !this.field_F) {
              this.field_N.setBounds(8, 40, this.y, 8192, 20);
              this.y = this.y + 25;
            } else {
              this.field_N.setBounds(8, -16 + this.width, this.y, 8192, 30);
              this.y = this.y + 35;
            }
          }
          this.setBounds(0, this.width, 0, 8192, 3 + this.y);
          this.a((byte) 10, (Widget) (this.field_O));
          if (this.field_R != null) {
            this.a((byte) 10, (Widget) (this.field_R));
          }
          if (this.field_N != null) {
            this.a((byte) 10, (Widget) (this.field_N));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("df.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(fn param0, int param1) {
        fn var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Q == param0) {
            this.field_S.a(11, (Widget) (this));
          }
          if (param1 != 80) {
            var4 = (fn) null;
            this.a((fn) null, -76);
          }
          if (this.field_S == param0) {
            this.c(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("df.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 > -82) {
          df.a(-77);
        }
        if (null != this.field_I) {
          ArmiesOfGielinor.field_J.a(this.field_I, param0 - (-this.x - 20), 15 + param1 + this.y, -40 + this.width, this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
        }
        if (this.field_R != null) {
          SoftwareRaster.e(10 + param0, 134 + param1, -20 + this.width, 4210752);
        }
        super.a(param0, param1, (byte) -104, param3);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 11) {
            this.m(64);
          }
          if (this.field_O != param4) {
            if (this.field_R != param4) {
              if (param4 == this.field_N) {
                if (this.field_P) {
                  IntPair.e(17);
                } else {
                  if (!this.field_F) {
                    QuickChatCommandDefinition.a(param1 ^ 26573);
                  } else {
                    ba.g(89);
                  }
                }
              }
            } else {
              rq.a(false);
            }
          } else {
            this.c(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("df.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_K = null;
    }

    private final static boolean k(int param0) {
        if (param0 != 30) {
          df.k(105);
        }
        return fh.field_i;
    }

    public final void b(fn param0, int param1) {
        try {
          int var3_int = 14 % ((param1 + 80) / 33);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "df.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != -20) {
          String var2 = (String) null;
          df.a((String) null, -20, (ResourceArchive) null, -114, (String) null);
        }
        MoveEvent.campaignMenu = new CampaignMenu();
        EquipmentBattleTutorial.configureTutorialStage(30, 21, 220, 420, 440, 470, new int[]{7}, -121);
        EquipmentBattleTutorial.configureTutorialStage(30, 22, 490, 610, 20, 50, new int[]{47}, param0 - 55);
    }

    final String m(int param0) {
        if (this.field_Q.field_v == null) {
          return "";
        }
        if (param0 != -15056) {
          return (String) null;
        }
        return this.field_Q.field_v;
    }

    private final void c(boolean param0) {
        if (param0) {
          return;
        }
        if (df.k(30) ||
          !(0 >= this.field_Q.field_v.length()) &&
          !(0 >= this.field_S.field_v.length())) {
          CampaignProgress.a(this.field_S.field_v, 0, this.field_Q.field_v);
        }
    }

    final static void l(int param0) {
        hf.field_a = param0;
    }

    final static String a(String param0, int param1, ResourceArchive param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -27638) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param2.ensureIndex((byte) 82)) {
            stackIn_6_0 = (String) (param4);
            return stackIn_6_0;
          }
          stackIn_8_0 = param0 + " - " + param2.getGroupProgress(param1, (byte) 73) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("df.U(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.field_Q.k(104);
        if (param0 >= -2) {
          return;
        }
        this.field_S.k(-79);
    }

    final boolean a(Widget param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_6_0 = this.a(false, param0);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b((byte) -128, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("df.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
