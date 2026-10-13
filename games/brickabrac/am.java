/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends UiComponent {
    private UiComponent field_Xb;
    long field_Wb;
    static String field_cc;
    private UiComponent[] field_Sb;
    private UiComponent field_Ub;
    private StateIconLabel field_bc;
    private UiComponent field_Pb;
    private int field_ac;
    static UiComponent field_Qb;
    private UiComponent field_Vb;
    private UiComponent field_Yb;
    static UiComponent field_Zb;
    private StringBuilder field_Tb;
    private UiComponent field_Rb;

    final static boolean i(int param0) {
        if (param0 != 0) {
          am.i(79);
          return true;
        }
        return true;
    }

    private final int a(int param0, UiComponent param1, int param2, String param3, UiComponent param4, byte param5) {
        UiComponent var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -53) {
            this.b(true, -62);
          }
          var7 = new UiComponent(0L, param1, 0, param0, param2, 24, param3);
          param0 += 32;
          param4.addChild(var7, 0);
          stackIn_3_0 = param0;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("am.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (this.field_ac != -2) {
          return false;
        }
        if (MeshAttributeRecord.currentKeyCode == 13) {
          this.field_ac = -1;
        }
        if (param0 < 61) {
          am.k(105);
        }
        return true;
    }

    private final int a(UiComponent param0, byte param1, int param2, UiComponent param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param2 += 8;
          var6_int = -87 / ((param1 + 73) / 46);
          var7 = param3.font.measureWrappedHeight(param3.text, param4 - param3.textInset * 2, param3.lineSpacing);
          param3.setBounds(var7, param2, 0, param4, (byte) 64);
          param0.addChild(param3, 0);
          param2 = param2 + (0 + var7);
          stackIn_1_0 = param2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("am.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final String h(int param0) {
        if (param0 < 93) {
          this.b(true, -113);
        }
        return this.field_Tb.toString();
    }

    public static void k(int param0) {
        field_Qb = null;
        field_Zb = null;
        field_cc = null;
        if (param0 != 8421504) {
          field_cc = (String) null;
        }
    }

    final boolean j(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 72) {
          this.field_Sb = (UiComponent[]) null;
        }
        stackIn_6_0 = (this.field_bc != null) && (this.field_bc.selected);
        return stackIn_6_0;
    }

    am(int param0, int param1, int param2, int param3, int param4, UiComponent param5, UiComponent param6, UiComponent param7, UiComponent param8, StateIconLabel param9, UiComponent param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        int var15_int = 0;
        UiComponent[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        UiComponent[] var28 = null;
        Object stackIn_8_0;
        StateIconLabel stackIn_8_1;
        StateIconLabel stackIn_8_2;
        long stackIn_8_3;
        StateIconLabel stackIn_8_4;
        Object stackIn_9_0;
        StateIconLabel stackIn_9_1;
        StateIconLabel stackIn_9_2;
        String stackIn_9_5;
        UiComponent stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        Object stackIn_8_0Lifetime1;
        StateIconLabel stackIn_8_1Lifetime1;
        StateIconLabel stackIn_8_2Lifetime1;
        Object stackIn_9_0Lifetime1;
        StateIconLabel stackIn_9_1Lifetime1;
        StateIconLabel stackIn_9_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_ac = -2;
        try {
          this.field_Wb = param12;
          this.field_Ub = new UiComponent(0L, param6, r.field_B.toUpperCase());
          this.field_Ub.horizontalAlignment = 1;
          this.addChild(this.field_Ub, 0);
          this.field_Vb = new UiComponent(0L, param7);
          this.field_Ub.addChild(this.field_Vb, 0);
          this.field_Xb = new UiComponent(0L, (UiComponent) null);
          this.addChild(this.field_Xb, 0);
          if (param11 != null) {
            this.field_Rb = new UiComponent(0L, param8, om.field_rc);
            this.field_Rb.horizontalAlignment = 1;
            this.field_Rb.textColor = 11184810;
            this.field_Xb.addChild(this.field_Rb, 0);
            this.field_Pb = new UiComponent(0L, param8, wd.field_D);
            this.field_Pb.horizontalAlignment = 1;
            this.field_Pb.textColor = 11184810;
            this.field_Xb.addChild(this.field_Pb, 0);
            this.field_Yb = new UiComponent(0L, param8);
            this.field_Yb.textColor = 16764006;
            this.field_Xb.addChild(this.field_Yb, 0);
            this.field_Yb.textSuffix = "|";
            if (!(gh.field_f < 5) ||
              !(kb.field_Yb < 2)) {
              regionExit1: {
                stackIn_8_0 = this;
                stackIn_8_1 = null;
                stackIn_8_2 = null;
                stackIn_8_3 = 0L;
                stackIn_8_4 = (StateIconLabel) (param9);
                if (gh.field_f < 7) {
                  stackIn_8_0Lifetime1 = this;
                  stackIn_8_1Lifetime1 = null;
                  stackIn_8_2Lifetime1 = null;
                  if (2 > kb.field_Yb) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = nk.field_e;
                    break regionExit1;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = ek.field_gb;
              }
              this.field_bc = new StateIconLabel(stackIn_8_3, stackIn_8_4, stackIn_9_5);
              this.field_Xb.addChild(this.field_bc, 0);
            }
            var28 = new UiComponent[3];
            var15 = var28;
            var28[0] = new UiComponent(0L, (UiComponent) null);
            this.field_Xb.addChild(var28[0], 0);
            var28[1] = new UiComponent(0L, (UiComponent) null);
            this.field_Xb.addChild(var28[1], 0);
            var28[2] = new UiComponent(0L, (UiComponent) null);
            this.field_Xb.addChild(var28[2], 0);
            this.field_Sb = new UiComponent[rg.field_a];
            for (var16 = 0; var16 < rg.field_a; var16++) {
              if (kd.field_d[var16] != null) {
                this.field_Sb[var16] = new UiComponent(0L, param10, kd.field_d[var16]);
                this.field_Sb[var16].horizontalAlignment = 0;
                stackIn_15_0 = this.field_Sb[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.enabled = stackIn_16_1;
                this.field_Xb.addChild(this.field_Sb[var16], 0);
              }
            }
            this.field_Tb = new StringBuilder(12);
            if (param11 != null) {
              discarded$1 = this.field_Tb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.font.measureText(DualLinkNode.field_o);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.font.measureText(SaveResultsPromptScreen.field_r);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.font.measureText(nh.field_d);
            if (var16Lifetime2 < var17Lifetime3) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < rg.field_a; var17Lifetime4++) {
              if (null != this.field_Sb[var17Lifetime4]) {
                var18 = this.field_Sb[var17Lifetime4].getContentWidth(95);
                if (var16Lifetime2 < var18) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(var18Lifetime3, param6, var16Lifetime2, DualLinkNode.field_o, var28[0], (byte) -53);
            var18Lifetime3 = this.a(var28[0], (byte) -128, var18Lifetime3, this.field_Sb[6], var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], (byte) -21, var18Lifetime3, this.field_Sb[9], var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], (byte) -119, var18Lifetime3, this.field_Sb[5], var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], (byte) 113, var18Lifetime3, this.field_Sb[7], var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], (byte) -126, var18Lifetime3, this.field_Sb[15], var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], (byte) -125, var18Lifetime3, this.field_Sb[4], var16Lifetime2);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(var18Lifetime4, param6, var16Lifetime2, SaveResultsPromptScreen.field_r, var28[1], (byte) -53);
            var18Lifetime4 = this.a(var28[1], (byte) 117, var18Lifetime4, this.field_Sb[16], var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], (byte) 36, var18Lifetime4, this.field_Sb[17], var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], (byte) -2, var18Lifetime4, this.field_Sb[18], var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], (byte) 2, var18Lifetime4, this.field_Sb[19], var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], (byte) -120, var18Lifetime4, this.field_Sb[20], var16Lifetime2);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(var18Lifetime5, param6, var16Lifetime2, nh.field_d, var28[2], (byte) -53);
            var18Lifetime5 = this.a(var28[2], (byte) -127, var18Lifetime5, this.field_Sb[13], var16Lifetime2);
            var18Lifetime5 = this.a(var28[2], (byte) -119, var18Lifetime5, this.field_Sb[21], var16Lifetime2);
            var18Lifetime5 = this.a(var28[2], (byte) -121, var18Lifetime5, this.field_Sb[11], var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + var16Lifetime2 * 3;
            var20 = this.field_Ub.getContentWidth(87);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.field_bc != null) {
              var20Lifetime2 = this.field_bc.measureIconLabelWidth((byte) 11, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Ub.setBounds(24, 0, 0, var19 + 13 + 13, (byte) 64);
            this.field_Vb.setBounds(15, 5, this.field_Ub.width - 20, 15, (byte) 64);
            var21 = 10;
            this.field_Rb.setBounds(np.field_a * 2, var21, 13, var19, (byte) 64);
            var21 = var21 + np.field_a * 2;
            this.field_Pb.setBounds(2 * np.field_a, var21, 13, var19, (byte) 64);
            var21 = var21 + (np.field_a * 2 + 10);
            this.field_Yb.setBounds(np.field_a, var21, 0, 0, (byte) 64);
            var21 = var21 + (10 + np.field_a);
            if (this.field_bc != null) {
              var20Lifetime3 = this.field_bc.measureIconLabelWidth((byte) 11, 4);
              this.field_bc.setIconLabelBounds(var20Lifetime3, 4, np.field_a, var21, true, (-var20Lifetime3 + var19) / 2 + 13);
              var21 = var21 + (np.field_a + 10);
            }
            var28[0].setBounds(var17Lifetime5, var21, 13, var16Lifetime2, (byte) 64);
            var28[1].setBounds(var17Lifetime5, var21, var16Lifetime2 + 13 + 13, var16Lifetime2, (byte) 64);
            var28[2].setBounds(var17Lifetime5, var21, 39 + var16Lifetime2 * 2, var16Lifetime2, (byte) 64);
            var22 = var21;
            this.field_Xb.setBounds(var22 + var17Lifetime5 + 10, 24, 0, 13 + (var19 + 13), (byte) 64);
            this.field_Xb.frameSprites = na.a(false, 8421504, 3, 11579568, this.field_Xb.height, 2105376);
            var23 = 13 + var19 + 13;
            var24 = 10 + var22 + 24 + var17Lifetime5;
            var25 = OptionsScreen.a(-1, var23, param0, param2);
            var26 = br.a(var24, param1, param3, 120);
            this.setBounds(var24, var26, var25, var23, (byte) 64);
            return;
          }
          this.field_Rb = new UiComponent(0L, param8, br.field_Ub);
          this.field_Rb.textColor = 11184810;
          this.field_Rb.horizontalAlignment = 1;
          this.field_Xb.addChild(this.field_Rb, 0);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Rb.font.countWrappedLines(this.field_Rb.text, var15_int);
          this.field_Rb.setBounds(np.field_a * var17Lifetime1, var16Lifetime1, 13, var15_int, (byte) 64);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * np.field_a;
          this.field_Xb.setBounds(10 + var16Lifetime1, 24, 0, 13 + (var15_int + 13), (byte) 64);
          this.field_Xb.frameSprites = na.a(false, 8421504, 3, 11579568, this.field_Xb.height, 2105376);
          var18Lifetime1 = var15_int + 13 + 13;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = OptionsScreen.a(-1, var18Lifetime1, param0, param2);
          var21Lifetime1 = br.a(var19Lifetime1, param1, param3, -93);
          this.setBounds(var19Lifetime1, var21Lifetime1, var20Lifetime1, var18Lifetime1, (byte) 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("am.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1) {
        try {
          param0[75] = 2;
          param0[79] = -2;
          param0[69] = 4;
          param0[67] = -1;
          param0[77] = 4;
          param0[78] = 5;
          param0[74] = 9;
          param0[70] = param1;
          param0[73] = 5;
          param0[64] = -2;
          param0[71] = 1;
          param0[76] = 6;
          param0[72] = -1;
          param0[65] = -2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "am.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        StateIconLabel stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        UiComponent stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 8421504) {
          field_Qb = (UiComponent) null;
        }
        this.updateRoot(param0, -15211);
        if (this.field_Yb != null) {
          this.field_Yb.text = this.field_Tb.toString();
          this.field_Yb.localX = (this.width - this.field_Yb.font.measureText(this.field_Yb.text)) / 2;
          this.field_Yb.width = -this.field_Yb.localX + this.width;
          if (null != this.field_bc &&
            0 != this.field_bc.pressedButton) {
            stackIn_9_0 = this.field_bc;
            stackIn_10_1 = !(this.field_bc.selected);
            stackIn_9_0.selected = stackIn_10_1;
          }
          for (var3 = 0; var3 < rg.field_a; var3++) {
            if (null != this.field_Sb[var3]) {
              stackIn_18_0 = this.field_Sb[var3];
              stackIn_19_1 = !(this.field_Tb.length() <= 0);
              stackIn_18_0.enabled = stackIn_19_1;
              if (this.field_Sb[var3].enabled &&
                this.field_Sb[var3].pressedButton != 0) {
                return var3;
              }
            }
          }
        }
        if (this.field_Vb.pressedButton != 0) {
          return -1;
        }
        if (param0 &&
          0 != BackgroundScene.pressedButton &&
          this.pressedButton == 0) {
          return -1;
        }
        return this.field_ac;
    }

    static {
    }
}
