/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vcb extends UiArrayContainer implements UiActionListener {
    private UiFocusableComponent field_A;
    private boolean field_G;
    private boolean field_y;
    private UiFocusableComponent field_N;
    private int field_J;
    int field_K;
    private UiFocusableComponent field_C;
    private int field_F;
    private int field_x;
    private boolean field_w;
    private int field_B;
    int field_L;
    private ef field_P;
    private int field_H;
    private UiFocusableComponent field_D;
    static byte[][] field_E;
    static GameStateFactory field_z;
    int field_M;
    private UiFocusableComponent field_v;

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 == 1 &&
            this.field_y) {
            if (this.field_G &&
              this.field_A == param3) {
              this.a((byte) -17, -this.field_K + this.field_L);
            } else {
              if (this.field_G &&
                this.field_v == param3) {
                this.a((byte) -17, this.field_K + this.field_L);
              } else {
                if (this.field_w &&
                  this.field_D == param3) {
                  this.a(-51, this.field_M - this.field_H);
                } else {
                  if (this.field_w &&
                    this.field_C == param3) {
                    this.a(-23, this.field_M + this.field_H);
                  }
                }
              }
            }
          }
          if (param0 != 11) {
            this.field_G = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = VoidHunters.field_G;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if ((!(this.field_P.child instanceof UiFocusableComponent) ||
            ((UiFocusableComponent) (this.field_P.child)).enabled) && this.field_P.pressedButton == 1) {
            if (this.field_w) {
              var5_int = this.field_M;
              this.h((byte) 79);
              if (var5_int != this.field_M &&
                this.listener instanceof lt) {
                ((lt) (this.listener)).a(this, this.field_M, this.field_M, true);
              }
            } else {
              this.i((byte) -8);
            }
            if (!this.field_G) {
              this.e(param2 ^ -981);
            } else {
              var5_intLifetime2 = this.field_L;
              this.g(127);
              if (var5_intLifetime2 != this.field_L &&
                this.listener instanceof lt) {
                ((lt) (this.listener)).a(this, this.field_L, this.field_M, true);
              }
            }
          }
          if (this.field_N.enabled &&
            1 == this.field_N.activatedButton) {
            if (this.field_G) {
              if (!this.field_w) {
                if (uia.field_b <= param0 - (-this.field_P.y - (this.field_P.height >> 1))) {
                  this.a((byte) -17, this.field_L - this.field_F);
                  return;
                }
                this.a((byte) -17, this.field_L + this.field_F);
                return;
              }
              var5_intLifetime1 = -this.field_P.x - (this.field_P.width >> 1) + (-param1 + PlayerGameData.field_b) - this.x;
              var6 = uia.field_b - param0 + (-this.y - (this.field_P.y + (this.field_P.height >> 1)));
              if (Math.abs(var6) <= Math.abs(var5_intLifetime1)) {
                if (var5_intLifetime1 <= 0) {
                  this.a(-116, this.field_M - this.field_x);
                  return;
                }
                this.a(-15, this.field_x + this.field_M);
                return;
              }
              if (0 < var6) {
                this.a((byte) -17, this.field_L + this.field_F);
                return;
              }
              this.a((byte) -17, -this.field_F + this.field_L);
              return;
            }
            if (this.field_w) {
              if ((this.field_P.width >> 1) + (this.field_P.x + param1) >= PlayerGameData.field_b) {
                this.a(107, -this.field_x + this.field_M);
                return;
              }
              this.a(-102, this.field_M + this.field_x);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_39_0 = var5;
          stackIn_39_1 = new StringBuilder().append("vcb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 != 21944) {
          UiComponent var5 = (UiComponent) null;
          this.handleKey(-20, -95, (UiComponent) null, 'J');
        }
        if (param0 < param2) {
          var4 = this.field_N.width * param0 / param2;
          if (var4 < this.field_J) {
            var4 = this.field_J;
          }
          this.field_P.setBounds(this.field_P.x, var4, this.field_P.height, 1, this.field_P.y);
          this.a((byte) -63, true);
        } else {
          this.field_P.setBounds(this.field_P.x, this.field_N.width, this.field_P.height, param1 ^ 21945, this.field_P.y);
          this.a((byte) -110, false);
        }
        this.i((byte) -8);
    }

    final void c(int param0, int param1) {
        int var4;
        rn var5;
        var4 = VoidHunters.field_G;
        if (param1 < 0) {
          this.field_L = 0;
        } else {
          if (param1 > 65536) {
            this.field_L = 65536;
          } else {
            this.field_L = param1;
          }
        }
        this.e(0);
        if (param0 != -3393) {
          var5 = (rn) null;
          vcb.a(33, (Widget) null, (Widget) null, (Widget) null, (rn) null);
        }
    }

    private final void g(int param0) {
        int var2 = this.field_A == null ? this.field_N.y : this.field_A.height + this.field_A.y;
        int var3 = null != this.field_v ? -this.field_P.height + this.field_v.y : this.field_N.height + this.field_N.y - this.field_P.height;
        int var4 = 68 / ((9 - param0) / 59);
        this.c(-3393, var3 <= var2 ? 0 : (this.field_P.y - var2 << 16) / (var3 - var2));
    }

    private final void a(int param0, int param1) {
        this.b(param1, 65536);
        int var3 = -73 % ((param0 - 35) / 49);
        if (this.listener instanceof lt) {
          ((lt) (this.listener)).a(this.field_M, this.field_L, this, -125);
        }
    }

    private final void a(int param0, boolean param1) {
        UiFocusableComponent stackIn_5_0 = null;
        boolean stackIn_7_1 = false;
        UiFocusableComponent stackIn_12_0 = null;
        boolean stackIn_14_1 = false;
        UiFocusableComponent stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        UiFocusableComponent stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        if (param0 != 0) {
          this.h((byte) -20);
        }
        stackIn_5_0 = this.field_N;
        stackIn_7_1 = (param1) || (this.field_w);
        stackIn_5_0.enabled = stackIn_7_1;
        if (this.field_P.child instanceof UiFocusableComponent) {
          stackIn_12_0 = (UiFocusableComponent) (this.field_P.child);
          stackIn_14_1 = (param1) || (this.field_w);
          stackIn_12_0.enabled = stackIn_14_1;
        }
        if (this.field_A != null) {
          stackIn_18_0 = this.field_A;
          stackIn_19_1 = (!param1) ? false : true;
          stackIn_18_0.enabled = stackIn_19_1;
        }
        if (null != this.field_v) {
          stackIn_23_0 = this.field_v;
          stackIn_24_1 = (!param1) ? false : true;
          stackIn_23_0.enabled = stackIn_24_1;
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param0) {
          var4 = this.field_N.height * param0 / param1;
          if (this.field_B > var4) {
            var4 = this.field_B;
          }
          this.field_P.setBounds(this.field_P.x, this.field_P.width, var4, 1, this.field_P.y);
          this.a(0, true);
        } else {
          this.field_P.setBounds(this.field_P.x, this.field_P.width, this.field_N.height, 1, this.field_P.y);
          this.a(0, false);
        }
        this.e(0);
        if (param2 < 126) {
          rn var5 = (rn) null;
          vcb.a(-91, (Widget) null, (Widget) null, (Widget) null, (rn) null);
        }
    }

    private final void h(byte param0) {
        if (param0 <= 49) {
          this.c(17, -59, -81);
        }
        int var2 = null != this.field_D ? this.field_D.x + this.field_D.width : this.field_N.x;
        int var3 = this.field_C != null ? this.field_C.x - this.field_P.width : this.field_N.width + this.field_N.x - this.field_P.width;
        this.b(var3 <= var2 ? 0 : (this.field_P.x - var2 << 16) / (var3 - var2), 65536);
    }

    vcb(int param0, int param1, int param2, int param3, UiRenderer param4, UiRenderer param5, UiRenderer param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ef dupTemp$0 = null;
        UiFocusableComponent dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_F = 8192;
        this.field_x = 8192;
        this.field_B = 0;
        this.field_y = true;
        this.field_L = 32768;
        this.field_H = 1024;
        this.field_J = 0;
        this.field_K = 1024;
        this.field_M = 32768;
        try {
          this.children = new UiComponent[6];
          dupTemp$0 = new ef(param0, param1, param7, param8, (UiRenderer) null, (UiListener) null, new UiFocusableComponent(0, 0, param7, param8, param6, (UiListener) null), false, false);
          this.field_P = dupTemp$0;
          this.children[0] = (UiComponent) ((Object) dupTemp$0);
          dupTemp$1 = new UiFocusableComponent(param0, param1, param7, param8, param5, (UiListener) null);
          this.field_N = dupTemp$1;
          this.children[1] = (UiComponent) ((Object) dupTemp$1);
          stackIn_4_1 = (param11);
          this.field_w = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.field_G = stackIn_7_1;
          this.field_J = param9;
          this.field_B = param10;
          this.b(param13, 65536);
          this.c(-3393, param14);
          this.setBounds(param0, param2, param3, 1, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("vcb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -7) {
          field_E = (byte[][]) null;
        }
        field_E = (byte[][]) null;
        field_z = null;
    }

    private final int k(byte param0) {
        if (param0 != 110) {
          this.field_M = 17;
        }
        return (this.field_P.height << 16) / this.field_N.height;
    }

    private final void a(byte param0, boolean param1) {
        UiFocusableComponent stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        UiFocusableComponent stackIn_11_0 = null;
        boolean stackIn_13_1 = false;
        UiFocusableComponent stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        UiFocusableComponent stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        stackIn_3_0 = this.field_N;
        stackIn_5_1 = (param1) || (this.field_G);
        stackIn_3_0.enabled = stackIn_5_1;
        if (param0 > -34) {
          return;
        }
        if (this.field_P.child instanceof UiFocusableComponent) {
          stackIn_11_0 = (UiFocusableComponent) (this.field_P.child);
          stackIn_13_1 = (param1) || (this.field_G);
          stackIn_11_0.enabled = stackIn_13_1;
        }
        if (this.field_D != null) {
          stackIn_17_0 = this.field_D;
          stackIn_18_1 = (!param1) ? false : true;
          stackIn_17_0.enabled = stackIn_18_1;
        }
        if (this.field_C != null) {
          stackIn_22_0 = this.field_C;
          stackIn_23_1 = (!param1) ? false : true;
          stackIn_22_0.enabled = stackIn_23_1;
        }
    }

    private final void e(int param0) {
        int var2 = null == this.field_A ? this.field_N.y : this.field_A.height + this.field_A.y;
        int var3 = null == this.field_v ? this.field_N.y + (this.field_N.height - this.field_P.height) : this.field_v.y - this.field_P.height;
        this.field_P.y = (this.field_L * (-var2 + var3) >> 16) + var2;
        if (param0 != 0) {
          vcb.f(-79);
        }
    }

    private final void i(byte param0) {
        if (param0 != -8) {
          this.d(116);
        }
        int var2 = null == this.field_D ? this.field_N.x : this.field_D.width + this.field_D.x;
        int var3 = null != this.field_C ? -this.field_P.width + this.field_C.x : this.field_N.width + (this.field_N.x - this.field_P.width);
        this.field_P.x = ((var3 - var2) * this.field_M >> 16) + var2;
    }

    final static QuickChatMenuWidget a(int param0, Widget param1, Widget param2, Widget param3, rn param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        QuickChatMenuWidget stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        QuickChatMenuWidget[] var11 = null;
        int var12 = 0;
        rn var13_ref_rn = null;
        int var13 = 0;
        int var15 = 0;
        QuickChatPhraseDefinition var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          if (param4 == null) {
            stackIn_3_0 = null;
            return (QuickChatMenuWidget) (stackIn_3_0);
          }
          if (param4.field_l != null) {
            stackIn_7_0 = param4.field_l.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (null == param4.field_n) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = param4.field_n.length;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          if (param0 != 0) {
            vcb.clearSharedReferences((byte) 98);
          }
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new QuickChatMenuWidget[var7];
          if (null != param4.field_l) {
            for (var12 = 0; var12 < param4.field_l.length; var12++) {
              var13_ref_rn = lnb.field_i.a((byte) -72, param4.field_l[var12]);
              var8[var12] = var13_ref_rn.field_p;
              var9[var12] = param4.field_q[var12];
              var11[var12] = vcb.a(0, param1, param2, param3, var13_ref_rn);
            }
          }
          if (param4.field_n != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; var14 < param4.field_n.length; var14++) {
              var15 = param4.field_n[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = SetPhasedEnergyBeamEnergyUsed.field_p;
                var9[var14 + var12Lifetime1] = param4.field_m[var14];
                var10[var12Lifetime1 + var14] = param4.field_n[var14];
              } else {
                var16 = GetTorpedoAimarc.field_o.getPhrase(var15, -118);
                var8[var14 + var12Lifetime1] = var16.getPreviewText(80);
                var9[var14 + var12Lifetime1] = param4.field_m[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param4.field_n[var14];
              }
            }
          }
          stackIn_27_0 = new QuickChatMenuWidget(0L, param1, param2, param3, var11, var20, var8, var21);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("vcb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void d(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (null != this.field_D) {
          this.field_D.x = 0;
          this.field_D.y = this.height - this.field_D.height >> 1;
          this.field_N.x = this.field_D.x + this.field_D.width;
        } else {
          this.field_N.x = 0;
        }
        if (this.field_C != null) {
          this.field_C.x = this.width - this.field_C.width;
          this.field_C.y = this.height - this.field_C.height >> 1;
          this.field_N.width = this.width + (-this.field_N.x - this.field_C.width);
        } else {
          this.field_N.width = -this.field_N.x + this.width;
        }
        this.i((byte) -8);
        if (this.field_A == null) {
          this.field_N.y = 0;
        } else {
          this.field_A.y = 0;
          this.field_A.x = this.width - this.field_A.width >> 1;
          this.field_N.y = this.field_A.y + this.field_A.height;
        }
        if (this.field_v != null) {
          this.field_v.y = this.height - this.field_v.height;
          this.field_v.x = -this.field_v.width + this.width >> 1;
          this.field_N.height = -this.field_N.y + (this.height - this.field_v.height);
        } else {
          this.field_N.height = this.height - this.field_N.y;
        }
        this.e(param0 ^ param0);
        if (!this.field_G) {
          this.field_P.height = this.field_N.height;
          this.field_P.y = 0;
        }
        if (!this.field_w) {
          this.field_P.width = this.field_N.width;
          this.field_P.x = 0;
        }
        this.field_P.refreshLayout(false);
    }

    final boolean requestFocus(int param0, UiComponent param1) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_L = -9;
          }
          var3 = this.field_P;
          if (var3 != null &&
            ((UiComponent) ((Object) var3)).requestFocus(param0 ^ 0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vcb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 < 0) {
          this.field_M = 0;
        } else {
          if (param0 <= 65536) {
            this.field_M = param0;
          } else {
            this.field_M = 65536;
          }
        }
        if (param1 != 65536) {
          return;
        }
        this.i((byte) -8);
    }

    final static void f(int param0) {
        int var1 = 0;
        if (param0 != 32) {
          vcb.clearSharedReferences((byte) -101);
        }
        if (GetMutatorVotes.field_p < 224) {
          var1 = GetMutatorVotes.field_p % 32;
          re.a(-var1 + GetMutatorVotes.field_p + 32, (byte) -100);
        } else {
          re.a(256, (byte) -126);
        }
    }

    private final void a(byte param0, int param1) {
        this.c(-3393, param1);
        if (this.listener instanceof lt) {
          ((lt) (this.listener)).a(this.field_L, this.field_L, this, param0 ^ 106);
        }
        if (param0 != -17) {
          this.i((byte) 62);
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_y &&
            this.field_P.hasFocus((byte) -120)) {
            if (98 == param1) {
              this.a((byte) -17, this.field_L - this.field_K);
              return true;
            }
            if (param1 == 99) {
              this.a((byte) -17, this.field_K + this.field_L);
              return true;
            }
            if (96 == param1) {
              this.a(param0 + 15923, this.field_M - this.field_H);
              return true;
            }
            if (param1 == 97) {
              this.a(116, this.field_M + this.field_H);
              return true;
            }
            if (param1 == 104) {
              this.a((byte) -17, this.field_L - this.k((byte) 110));
              return true;
            }
            if (param1 == 105) {
              this.a((byte) -17, this.field_L + this.k((byte) 110));
              return true;
            }
            if (102 == param1) {
              if (this.field_G &&
                SetMachineGunEnergyUsed.field_o[82]) {
                this.a((byte) -17, 0);
                return true;
              }
              if (!this.field_w) {
                return false;
              }
              this.a(-119, 0);
              return true;
            }
            if (103 == param1) {
              if (this.field_G &&
                SetMachineGunEnergyUsed.field_o[82]) {
                this.a((byte) -17, 65536);
                return true;
              }
              if (this.field_w) {
                this.a(param0 + 15790, 65536);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_44_0 = var5;
          stackIn_44_1 = new StringBuilder().append("vcb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_E = new byte[250][];
        field_z = (GameStateFactory) ((Object) new DebrisFactory());
    }
}
