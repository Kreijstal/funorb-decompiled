/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplaySettingsDialog extends ofa implements ButtonListener {
    static volatile int field_X;
    private GridWidgetContainer field_T;
    private FocusableWidget field_Z;
    private FocusableWidget[] field_U;
    private FocusableWidget field_N;
    private dh[] field_P;
    private FocusableWidget field_W;
    static String field_Q;
    static String field_R;
    private DropdownList field_ab;
    private boolean field_O;
    private FocusableWidget field_L;
    private FocusableWidget field_V;
    private boolean field_M;
    private boolean field_Y;
    private FocusableWidget field_S;

    final static void j(int param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var1 = nfa.field_n;
          synchronized (var1) {
            if (param0 != 3321) {
              return;
            }
            MotionTrackingModel.field_p = MotionTrackingModel.field_p + 1;
            vha.field_b = nt.field_a;
            if (0 > ita.field_f) {
              var5 = 0;
              var2 = var5;
              while (112 > var5) {
                VerticalScrollbar.field_tb[var5] = false;
                var5++;
              }
              ita.field_f = hka.field_a;
            } else {
              while (hka.field_a != ita.field_f) {
                var2 = cna.field_c[hka.field_a];
                hka.field_a = 127 & hka.field_a + 1;
                if (var2 < 0) {
                  VerticalScrollbar.field_tb[~var2] = false;
                  continue;
                }
                VerticalScrollbar.field_tb[var2] = true;
              }
            }
            nt.field_a = rca.field_n;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "at.J(" + param0 + ')');
        }
    }

    DisplaySettingsDialog(jta param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_37_1 = false;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_51_0;
        GridWidgetContainer stackIn_51_1;
        GridWidgetContainer stackIn_51_2;
        int stackIn_51_3;
        GridWidgetContainer stackIn_52_1 = null;
        GridWidgetContainer stackIn_52_2 = null;
        int stackIn_52_4 = 0;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dh[] var3_ref_dh__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        FocusableWidget var6_ref = null;
        UiWidget var7 = null;
        dh var8 = null;
        String var10 = null;
        Object stackIn_51_0Lifetime1;
        GridWidgetContainer stackIn_51_1Lifetime1;
        GridWidgetContainer stackIn_51_2Lifetime1;
        GridWidgetContainer stackIn_52_1Lifetime1;
        GridWidgetContainer stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_P = SecondaryNodeHashTable.a(99, dsa.field_c);
          if (this.field_P.length > 0) {
            for (var2_int = 0; var2_int < this.field_P.length; var2_int++) {
              if (this.field_P[var2_int] != null) {
                for (var3 = var2_int + 1; var3 < this.field_P.length; var3++) {
                  if (null != this.field_P[var3] &&
                    this.field_P[var3].field_a == this.field_P[var2_int].field_a &&
                    this.field_P[var2_int].field_c == this.field_P[var3].field_c) {
                    this.field_P[var3] = null;
                  }
                }
                if (wba.field_o != null &&
                  null != this.field_P[var2_int] &&
                  !wba.field_o.a(this.field_P[var2_int].field_c, (byte) 43, this.field_P[var2_int].field_a)) {
                  this.field_P[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; this.field_P.length > var3Lifetime2; var3Lifetime2++) {
              if (null != this.field_P[var3Lifetime2]) {
                var2_int++;
              }
            }
            var3_ref_dh__ = this.field_P;
            this.field_P = new dh[var2_int];
            var4 = 0;
            for (var5 = 0; var3_ref_dh__.length > var5; var5++) {
              if (var3_ref_dh__[var5] != null) {
                incrementValue$0 = var4;
                var4++;
                this.field_P[incrementValue$0] = var3_ref_dh__[var5];
              }
            }
            ag.a(-95, this.field_P);
          }
          stackIn_31_1 = !(this.field_P.length <= 0);
          this.field_M = stackIn_31_1;
          stackIn_34_0 = (!GridWidgetContainer.g((byte) 97)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_1 = !(TextWidgetPainter.a(56));
          this.field_Y = stackIn_37_1;
          stackIn_40_0 = (var2_intLifetime1 != 0) ? 3 : 2;
          var3Lifetime1 = stackIn_40_0;
          if (var2_intLifetime1 == 0) {
            if (wba.field_o != null) {
              stackIn_48_0 = (wba.field_o.d(-1)) ? 1 : 0;
            } else {
              stackIn_48_0 = 0;
            }
          } else {
            stackIn_48_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime1 = stackIn_48_0;
          stackIn_51_0 = this;
          stackIn_51_1 = null;
          stackIn_51_2 = null;
          stackIn_51_3 = 10;
          if (var2_intLifetime1 == 0) {
            stackIn_51_0Lifetime1 = this;
            stackIn_51_1Lifetime1 = null;
            stackIn_51_2Lifetime1 = null;
            if (var4Lifetime1 == 0) {
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_4 = 75;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_52_1Lifetime1 = null;
            stackIn_52_2Lifetime1 = null;
            stackIn_52_4 = 58;
          }
          this.field_T = new GridWidgetContainer(stackIn_51_3, stackIn_52_4, 410, 105, (isa) null, var3Lifetime1, 1);
          this.field_T.field_E = 83;
          this.field_T.a(5, 5, (byte) 97);
          this.addChild(this.field_T, -1);
          this.field_W = this.a(-82, ie.field_f, ke.field_a, (WidgetListener) (this));
          if (var2_intLifetime1 != 0) {
            this.field_N = this.a(-87, rra.field_a, kka.field_o, (WidgetListener) (this));
          }
          this.field_V = this.a(-94, ita.field_e, pa.field_c, (WidgetListener) (this));
          if (var2_intLifetime1 != 0) {
            stackIn_57_1 = 3;
          } else {
            stackIn_57_1 = 2;
          }
          this.field_U = new FocusableWidget[stackIn_57_1];
          this.field_U[1] = this.field_V;
          if (var2_intLifetime1 != 0) {
            this.field_U[2] = this.field_N;
          }
          this.field_U[0] = this.field_W;
          if (this.field_M &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_P.length];
            var6_int = -1 + var5_ref_String__.length;
            for (var7_int = 0; this.field_P.length > var7_int; var7_int++) {
              var8 = this.field_P[var7_int];
              if (dq.field_f != null &&
                wba.field_o.field_s == var8.field_a &&
                wba.field_o.field_p == var8.field_c) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_c;
            }
            this.field_ab = new DropdownList(var5_ref_String__, var6_int, 150);
            this.field_ab.setBounds((byte) -31, 126, 18, this.field_V.field_i + this.field_T.field_i, -19 + (this.field_V.field_p + (this.field_V.field_n + this.field_T.field_n)));
            this.children.addFirst((byte) 126, (IntrusiveNode) (this.field_ab));
          }
          this.field_Z = this.a((WidgetListener) (this), CachedTextLayout.field_i, 30815);
          var5Lifetime1 = this.field_Z.field_m / 2 + this.field_Z.field_i;
          this.field_Z.field_m = 150;
          this.field_Z.field_i = -this.field_Z.field_m + (var5Lifetime1 - 20);
          this.field_L = this.a((WidgetListener) (this), wm.field_b, 30815);
          this.field_L.field_y = false;
          this.field_L.field_i = var5Lifetime1 + 20;
          this.field_L.field_m = this.field_Z.field_m;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 == 0) {
              stackIn_74_0 = tla.field_a;
            } else {
              stackIn_74_0 = ab.field_w;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new UiWidget(var10, (WidgetListener) null);
            var7.field_m = this.field_m;
            var7.field_p = 80;
            var7.field_n = 163;
            var7.field_i = 0;
            var7.field_r = (isa) ((Object) new TextWidgetPainter(KeySwitchComponent.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.addChild(var7, -1);
          }
          this.field_O = false;
          var6_ref = this.g(-46);
          if (var6_ref != null) {
            var6_ref.field_w = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("at.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        FocusableWidget stackIn_36_0 = null;
        boolean stackIn_37_2 = false;
        FocusableWidget stackIn_42_0 = null;
        boolean stackIn_43_2 = false;
        FocusableWidget stackIn_51_0 = null;
        boolean stackIn_52_2 = false;
        FocusableWidget stackIn_62_0 = null;
        boolean stackIn_63_2 = false;
        FocusableWidget stackIn_77_0 = null;
        boolean stackIn_78_2 = false;
        FocusableWidget stackIn_86_0 = null;
        boolean stackIn_87_2 = false;
        boolean stackIn_93_0 = false;
        Object stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = null;
          if (!this.field_W.hasKeyboardFocus((byte) -34)) {
            if (this.field_N != null &&
              this.field_N.hasKeyboardFocus((byte) -34)) {
              var5 = this.field_N;
            } else {
              if (!this.field_V.hasKeyboardFocus((byte) -34)) {
                if (this.field_Z.hasKeyboardFocus((byte) -34)) {
                  var5 = this.field_Z;
                } else {
                  if (this.field_L.hasKeyboardFocus((byte) -34)) {
                    var5 = this.field_L;
                  } else {
                    if (!this.field_W.field_w) {
                      if (this.field_N != null &&
                        this.field_N.field_w) {
                        var5 = this.field_N;
                      } else {
                        if (this.field_V.field_w) {
                          var5 = this.field_V;
                        }
                      }
                    } else {
                      var5 = this.field_W;
                    }
                  }
                }
              } else {
                var5 = this.field_V;
              }
            }
          } else {
            var5 = this.field_W;
          }
          var6 = param2;
          switch (var6) {
            case 98:
              if (var5 == this.field_Z) {
                this.field_W.requestKeyboardFocus((UiWidget) (this), false);
                return true;
              }
              if (this.field_L == var5) {
                this.field_V.requestKeyboardFocus((UiWidget) (this), false);
                return true;
              }
              break;
            case 99:
              if (var5 != this.field_W &&
                this.field_N != var5) {
                if (var5 != this.field_V) {
                  break;
                }
                if (!this.field_L.field_y) {
                  stackIn_86_0 = this.field_Z;
                  stackIn_87_2 = !(param3);
                  ((FocusableWidget) (Object) stackIn_86_0).requestKeyboardFocus((UiWidget) (this), stackIn_87_2);
                } else {
                  this.field_L.requestKeyboardFocus((UiWidget) (this), false);
                }
                return true;
              }
              stackIn_77_0 = this.field_Z;
              stackIn_78_2 = !(param3);
              ((FocusableWidget) (Object) stackIn_77_0).requestKeyboardFocus((UiWidget) (this), stackIn_78_2);
              return true;
            case 97:
              if (var5 == this.field_W) {
                if (null == this.field_N) {
                  stackIn_51_0 = this.field_V;
                  stackIn_52_2 = !(param3);
                  ((FocusableWidget) (Object) stackIn_51_0).requestKeyboardFocus((UiWidget) (this), stackIn_52_2);
                } else {
                  this.field_N.requestKeyboardFocus((UiWidget) (this), false);
                }
                return true;
              }
              if (var5 == this.field_N) {
                this.field_V.requestKeyboardFocus((UiWidget) (this), false);
                return true;
              }
              if (this.field_Z == var5 &&
                this.field_L.field_y) {
                stackIn_62_0 = this.field_L;
                stackIn_63_2 = !(param3);
                ((FocusableWidget) (Object) stackIn_62_0).requestKeyboardFocus((UiWidget) (this), stackIn_63_2);
                return true;
              }
              break;
            case 96:
              if (var5 == this.field_V) {
                if (null == this.field_N) {
                  this.field_W.requestKeyboardFocus((UiWidget) (this), false);
                  return true;
                }
                this.field_N.requestKeyboardFocus((UiWidget) (this), false);
                return true;
              }
              if (this.field_N == var5) {
                stackIn_36_0 = this.field_W;
                stackIn_37_2 = !(param3);
                ((FocusableWidget) (Object) stackIn_36_0).requestKeyboardFocus((UiWidget) (this), stackIn_37_2);
                return true;
              }
              if (this.field_L == var5) {
                stackIn_42_0 = this.field_Z;
                stackIn_43_2 = !(param3);
                ((FocusableWidget) (Object) stackIn_42_0).requestKeyboardFocus((UiWidget) (this), stackIn_43_2);
                return true;
              }
              break;
            default:
              break;
          }
          if (!param3) {
            this.field_O = false;
          }
          stackIn_93_0 = super.handleKeyInput(param0, param1, param2, true);
          return stackIn_93_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_96_0 = var5;
          stackIn_96_1 = new StringBuilder().append("at.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_96_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == this.field_Z) {
            this.h(-8266);
          } else {
            if (this.field_L != param2) {
              if (param2 == this.field_W) {
                this.a(20306, param2);
              } else {
                if (param2 != this.field_N) {
                  if (this.field_ab != null) {
                    stackIn_13_0 = (this.field_ab.field_f) ? 1 : 0;
                  } else {
                    stackIn_13_0 = 0;
                  }
                  var6_int = stackIn_13_0;
                  if (var6_int == 0 &&
                    this.field_V == param2) {
                    if (this.field_M) {
                      if (ReportAbuseDialog.field_ub > 0) {
                        this.a(20306, param2);
                      } else {
                        this.field_z.c(new bra(this.field_z), 84);
                      }
                    } else {
                      this.field_z.c(new gga(this.field_z, gj.field_o), 95);
                    }
                  }
                } else {
                  this.a(20306, param2);
                }
              }
            } else {
              this.i(-1);
            }
          }
          if (param4 < 44) {
            this.field_S = (FocusableWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("at.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void h(int param0) {
        FocusableWidget discarded$0 = null;
        if (!this.field_B) {
          return;
        }
        this.field_B = false;
        if (param0 != -8266) {
          WidgetListener var3 = (WidgetListener) null;
          discarded$0 = this.a(-99, (IndexedSprite[]) null, (String) null, (WidgetListener) null);
        }
    }

    private final void a(int param0, FocusableWidget param1) {
        FocusableWidget discarded$1 = null;
        FocusableWidget var3 = null;
        int var4 = 0;
        dh var5 = null;
        WidgetListener var6 = null;
        FocusableWidget stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_S = param1;
          param1.requestKeyboardFocus((UiWidget) (this), false);
          var3 = this.g(-46);
          stackIn_2_0 = this.field_L;
          stackIn_3_1 = (param1 != var3);
          stackIn_2_0.field_y = stackIn_3_1;
          if (param0 != 20306) {
            var6 = (WidgetListener) null;
            discarded$1 = this.a(-82, (IndexedSprite[]) null, (String) null, (WidgetListener) null);
          }
          if (param1 == this.field_V) {
            if (var3 == param1) {
              if (this.field_ab != null) {
                var4 = this.field_ab.i((byte) 126);
                var5 = this.field_P[var4];
                if (wba.field_o.field_s == var5.field_a &&
                  wba.field_o.field_p == var5.field_c) {
                  this.j((byte) -30);
                  return;
                }
                this.field_L.field_y = true;
              }
              this.j((byte) -30);
            } else {
              this.j((byte) -30);
            }
          } else {
            this.j((byte) -30);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("at.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean f(int param0) {
        if (param0 != 24316) {
          field_Q = (String) null;
        }
        return ota.a(ica.field_b, (byte) 13, mn.field_n);
    }

    private final FocusableWidget a(WidgetListener param0, String param1, int param2) {
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
          var4 = new FocusableWidget(param1, param0);
          var4.field_r = (isa) ((Object) new td());
          var5 = -46 + this.field_p;
          if (param2 != 30815) {
            stackIn_2_0 = (FocusableWidget) null;
            return stackIn_2_0;
          }
          var4.setBounds((byte) -31, this.field_m - 30, 30, 15, var5);
          this.addChild(var4, param2 - 30816);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("at.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final FocusableWidget g(int param0) {
        if (dq.field_f != null) {
          return this.field_V;
        }
        if (param0 != -46) {
          return (FocusableWidget) null;
        }
        if (null != wba.field_o && wba.field_o.field_h &&
          this.field_N != null) {
          return this.field_N;
        }
        return this.field_W;
    }

    private final void i(int param0) {
        FocusableWidget discarded$1 = null;
        int var3;
        String var4;
        int var2;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -1) {
          var4 = (String) null;
          discarded$1 = this.a((WidgetListener) null, (String) null, -2);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_W == this.field_S) {
          og.b(param0 + 1);
          kla.b(0);
        } else {
          if (this.field_S == this.field_N) {
            og.b(0);
            cva.a(-117);
          } else {
            if (this.field_S != this.field_V) {
              this.field_L.field_y = false;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null != this.field_ab) {
                var2 = this.field_ab.i((byte) 123);
                if (var2 < 0) {
                  in.a(-30600, true);
                  this.field_z.c(new FullscreenConfirmationDialog(this.field_z), 89);
                } else {
                  wba.field_o.a(this.field_P[var2].field_a, this.field_P[var2].field_c, -1);
                  in.a(-30600, true);
                  this.field_z.c(new FullscreenConfirmationDialog(this.field_z), 89);
                }
              } else {
                in.a(-30600, true);
                this.field_z.c(new FullscreenConfirmationDialog(this.field_z), 89);
              }
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_L.field_y = false;
        }

    }

    private final void j(byte param0) {
        int var3 = 0;
        FocusableWidget var4 = null;
        FocusableWidget discarded$0 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        FocusableWidget[] var7 = this.field_U;
        FocusableWidget[] var2 = var7;
        for (var3 = 0; var3 < var7.length; var3++) {
          var4 = var7[var3];
          var4.field_w = this.field_S == var4 ? true : false;
        }
        if (param0 != -30) {
          WidgetListener var6 = (WidgetListener) null;
          discarded$0 = this.a(-33, (IndexedSprite[]) null, (String) null, (WidgetListener) null);
        }
    }

    public static void releaseStatics(byte param0) {
        field_Q = null;
        field_R = null;
        int var1 = -92 / ((26 - param0) / 46);
    }

    final void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        int var6 = 0;
        FocusableWidget[] var5 = null;
        FocusableWidget var7 = null;
        int var8 = 0;
        FocusableWidget[] var9 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          if (qma.field_c) {
            param2.clearKeyboardFocus((byte) -103);
            var9 = this.field_U;
            var5 = var9;
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7.field_f) {
                var7.requestKeyboardFocus((UiWidget) (this), false);
              }
            }
          }
          if (!this.field_Y &&
            !TextWidgetPainter.a(127)) {
            this.h(-8266);
            this.field_z.c(new DisplaySettingsDialog(this.field_z), 109);
          }
          if (this.field_ab != null) {
            stackIn_14_0 = (this.field_ab.j((byte) -125)) ? 0 : 1;
            if (stackIn_14_0 != (this.field_O ? 1 : 0)) {
              return;
            }
            this.a(20306, this.field_V);
            this.field_O = this.field_ab.j((byte) 76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("at.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final FocusableWidget a(int param0, IndexedSprite[] param1, String param2, WidgetListener param3) {
        FocusableWidget var5 = null;
        RuntimeException var5_ref = null;
        GridWidgetContainer var6 = null;
        FocusableWidget var7 = null;
        FocusableWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new FocusableWidget(param2, param3);
          var5.field_r = (isa) ((Object) new tka(param1));
          if (param0 >= -81) {
            this.field_L = (FocusableWidget) null;
          }
          var6 = this.field_T;
          var7 = var5;
          var6.appendCell(0, var7, var6.field_E);
          this.field_T.refreshLayout((byte) 124);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("at.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_X = 0;
        field_R = "Pressure pads trigger doors or traps, when activated by the weight of an idol, block, body or skeleton.";
        field_Q = "<%0> failed to finish";
    }
}
