/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk implements WidgetPainter, pm {
    BitmapFont field_q;
    int field_m;
    int field_n;
    int field_g;
    static ClientUiComponent field_a;
    static boolean pointerChangedSnapshot;
    private boolean field_c;
    int field_d;
    static String field_r;
    static int field_h;
    static int field_p;
    int field_l;
    static String field_s;
    int field_i;
    static nm field_e;
    int field_j;
    int field_o;
    private int field_b;
    int field_t;
    int field_k;

    lk(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(Widget param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            pointerChangedSnapshot = false;
          }
          stackIn_3_0 = param1 + this.field_g + param0.y + (param3 + param0.field_z);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("lk.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(lk param0, int param1) {
        try {
          param0.field_i = this.field_i;
          param0.field_g = this.field_g;
          param0.field_o = this.field_o;
          param0.field_n = this.field_n;
          param0.field_l = this.field_l;
          param0.field_k = this.field_k;
          param0.field_m = this.field_m;
          param0.field_c = this.field_c;
          param0.field_b = this.field_b;
          param0.field_j = this.field_j;
          param0.field_q = this.field_q;
          param0.field_d = this.field_d;
          param0.field_t = this.field_t;
          if (param1 != 24978) {
            Widget var4 = (Widget) null;
            this.a((Widget) null, -24, 63, -48, 119, -128);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lk.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, Widget param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        ts var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Widget var13 = null;
        ju var14 = null;
        ju var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3.a(false)) {
            var14 = this.a(-75, param3);
            var15 = var14;
            var7 = var15.a(param1 - 1024, param4);
            var8 = var14.field_b[var7];
            var9 = var15.a((byte) -66, param4);
            var10 = this.a(param2, param3, var9, 68);
            var11 = this.a(-18033, param0, param3) + Math.max(0, var8.field_n);
            stackIn_3_0 = this.a(param1 ^ -17009, param0, param3);
            stackIn_3_1 = this.c(-87, param3);
            stackIn_3_2 = var8.field_c;
            if (var15.field_b.length <= 1 + var7) {
              stackIn_4_3 = var8.field_c;
            } else {
              stackIn_4_3 = var14.field_b[1 + var7].field_n;
            }
            var12 = stackIn_3_0 + Math.min(stackIn_3_1, Math.min(stackIn_3_2, stackIn_4_3));
            CampaignUnitOverride.a(param2 + param3.x, param3.x + param2 + param3.width, param3.height + (param3.y + param0), param3.y + param0, (byte) 100);
            t.field_c.a(this.field_o, var12, var10, (byte) 101, var11, var10);
            QuickChatPhraseRepository.b(-18862);
          }
          if (param1 == 1024) {
            return;
          }
          var13 = (Widget) null;
          this.d(35, (Widget) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("lk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int c(int param0, Widget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 16 / ((-48 - param0) / 33);
          stackIn_1_0 = -this.field_m + (param1.height - this.field_g);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("lk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final void b(Widget param0, byte param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0.field_u == null) {
            param0.field_u = (ju) ((Object) new ak());
          }
          var4 = 78 % ((60 - param1) / 38);
          var3_int = this.b(55, param0);
          var5 = this.c(83, param0);
          var7 = this.field_k;
          if (var7 == 0) {
            var6 = this.field_q.field_H;
          } else {
            if (var7 == 2) {
              var6 = -this.field_q.field_L + var5;
            } else {
              if (var7 != 3 &&
                var7 == 1) {
              }
              var6 = this.field_q.field_H + (-this.field_q.field_L + (var5 - this.field_q.field_H) >> 1);
            }
          }
          var7Lifetime1 = this.field_n;
          if (var7Lifetime1 != 0 &&
            3 != var7Lifetime1) {
            if (var7Lifetime1 == 1) {
              if (!(param0.field_u instanceof ak)) {
                return;
              }
              ((ak) (param0.field_u)).a(var6, (byte) 117, this.field_q, this.d(0, param0), var3_int >> 1);
              return;
            }
            if (var7Lifetime1 != 2) {
              return;
            }
            if (!(param0.field_u instanceof ak)) {
              return;
            }
            ((ak) (param0.field_u)).a(var3_int, this.d(0, param0), this.field_q, -31932, var6);
            return;
          }
          if (param0.field_u instanceof ak) {
            ((ak) (param0.field_u)).a(this.d(0, param0), 0, this.field_q, var6, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("lk.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(Widget param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-103, param0);
          if (param1 != -2) {
            field_r = (String) null;
          }
          stackIn_3_0 = param0.field_u.a((byte) 120) - (-this.field_g - this.field_m);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, Widget param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 42 / ((param3 + 63) / 35);
          stackIn_1_0 = param2 + param1.field_r + param0 - (-param1.x - this.field_i);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("lk.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(int param0, int param1, Widget param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -18033) {
            stackIn_4_0 = this.a(param2, 0, 0, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 101;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("lk.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(Widget param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < -108) {
            stackIn_4_0 = this.a(param1, param0, 0, -123);
            return stackIn_4_0;
          }
          stackIn_2_0 = 39;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("lk.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int b(int param0, Widget param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 44) {
            field_p = -118;
          }
          stackIn_3_0 = -this.field_t + param1.width - this.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final ju a(int param0, Widget param1) {
        RuntimeException var3 = null;
        ju stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_u == null) {
            param1.field_u = (ju) ((Object) new ak());
          }
          if (param0 >= -36) {
            this.field_b = 58;
          }
          if (this.field_c) {
            ((ak) (param1.field_u)).a(this.d(0, param1), (byte) 30, this.c(-123, param1), this.field_k, this.field_j, this.field_n, this.b(85, param1), this.field_q);
          } else {
            this.b(param1, (byte) 112);
          }
          stackIn_9_0 = param1.field_u;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("lk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        if (this.field_q == null) {
          return;
        }
        try {
          if (obfuscationGuard >= -79) {
            Widget var7 = (Widget) null;
            this.a((Widget) null, 119, (byte) 95);
          }
          this.a(originX, -251, originY, widget);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lk.C(" + (widget != null ? "{...}" : "null") + ',' + originX + ',' + obfuscationGuard + ',' + renderFlag + ',' + originY + ')');
        }
    }

    String d(int param0, Widget param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_t = -81;
          }
          stackIn_3_0 = param1.field_v;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(Widget param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 79) {
            stackIn_2_0 = -92;
            return stackIn_2_0;
          }
          this.a(-56, param0);
          stackIn_4_0 = param0.field_u.a(-this.a(param0, param5, (byte) -127) + param1, -this.a(-18033, param3, param0) + param4, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("lk.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, Widget param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ts var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ju var17 = null;
        ju var18 = null;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -21259) {
            return;
          }
          if (param2 == param1) {
            return;
          }
          if (!param3.a(false)) {
            return;
          }
          var17 = this.a(-45, param3);
          var18 = var17;
          if (param2 < param1) {
            var9 = param1;
            var8 = param2;
          } else {
            var8 = param1;
            var9 = param2;
          }
          var10 = var18.a(param0 ^ -21259, var8);
          var11 = var18.a(param0 ^ -21259, var9);
          CampaignUnitOverride.a(param5 + param3.x, param3.width + (param5 + param3.x), param3.height + (param4 + param3.y), param3.y + param4, (byte) 116);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var17.field_b[var12];
            if (~var12 != ~var10) {
              stackIn_16_0 = var13.field_i[0];
            } else {
              stackIn_16_0 = var18.a((byte) -66, var8);
            }
            var14 = stackIn_16_0;
            if (var11 != var12) {
              if (var13 == null) {
                stackIn_21_0 = 0;
              } else {
                stackIn_21_0 = var13.field_i[var13.field_i.length - 1];
              }
            } else {
              stackIn_21_0 = var18.a((byte) -66, var9);
            }
            var15 = stackIn_21_0;
            t.field_c.a(this.field_l >>> 24, this.a(param5, param3, var14, -109), this.field_g + param4 + (param3.y + param3.field_z) + var13.field_n, true, var13.field_c, -var14 + var15, this.field_l);
          }
          QuickChatPhraseRepository.b(param0 + 2397);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("lk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        int var1 = -5 / ((-45 - param0) / 50);
        field_s = null;
        field_r = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return ib.field_j > 250 ? true : false;
    }

    private final void a(int param0, int param1, int param2, Widget param3) {
        try {
          this.a(0, param2, param0, this.field_d, 0, this.field_b, param3, 2);
          if (param1 != -251) {
            this.field_m = 1;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lk.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, Widget param6, int param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param7 != 2) {
            this.field_b = -74;
          }
          boolean decompiledFrameRemainder0 = true;
          CampaignUnitOverride.a(param6.x + param2, param6.width + param2 + param6.x, param6.height + (param6.y + param1), param6.y + param1, (byte) 91);
          var9_int = this.b(103, param6);
          var10 = this.c(-99, param6);
          if (!this.field_c) {
            var12 = this.field_k;
            if (0 != var12) {
              if (2 != var12) {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = this.field_q.field_H + (-this.field_q.field_H + var10 - this.field_q.field_L >> 1);
              } else {
                var11 = -this.field_q.field_L + var10;
              }
            } else {
              var11 = this.field_q.field_H;
            }
            var12Lifetime1 = this.field_n;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_q.c(this.d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9_int >> 1), var11 + this.a(param6, param4, 0, param1), param3, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_q.a(this.d(param7 - 2, param6), var9_int + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) + var11, param3, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_q.b(this.d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 - 2, param1), param3, param5);
            }
          } else {
            this.field_q.a(this.d(param7 ^ 2, param6), this.a(param2, param6, param0, 66), this.a(param6, param4, 0, param1), var9_int, var10, param3, param5, this.field_n, this.field_k, this.field_j);
          }
          QuickChatPhraseRepository.b(-18862);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_30_0 = var9;
          stackIn_30_1 = new StringBuilder().append("lk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(Widget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-51, param0);
          var3_int = -62 / ((param1 + 20) / 38);
          stackIn_1_0 = param0.field_u.a(false) - (-this.field_i - this.field_t);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("lk.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
          return -56;
        }
        return this.field_q.field_L + this.field_q.field_H;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 70) {
            return;
          }
          oq.a(27080, (java.awt.Component) ((Object) param1));
          DisplacedUnitMarker.a((java.awt.Component) ((Object) param1), (byte) 74);
          if (CampaignMission.field_I == null) {
            return;
          }
          CampaignMission.field_I.a(0, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("lk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    protected lk() {
    }

    final static void a(PlatformTaskService param0, int param1, nm param2, byte param3, boolean param4, java.awt.Component param5) {
        try {
          int var6_int = -98 / ((param3 + 3) / 46);
          TileMetadata.a(param5, 1024, param0, param4, -115, param2, param1, param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lk.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    lk(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_g = param3;
          this.field_c = param12 ? true : false;
          this.field_d = param5;
          this.field_m = param4;
          this.field_l = param11;
          this.field_b = param6;
          this.field_q = param0;
          this.field_j = param9;
          this.field_n = param7;
          this.field_k = param8;
          this.field_o = param10;
          this.field_t = param2;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        pointerChangedSnapshot = false;
        field_s = "Accept rematch";
    }
}
