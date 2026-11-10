/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ReportAbuseDialog extends UiComponent {
    private StateIconLabel field_Hb;
    static String field_Ib;
    private UiComponent[] field_Jb;
    static Sprite[][] field_Qb;
    private UiComponent field_Rb;
    static String field_Ob;
    private UiComponent field_Pb;
    static Sprite field_Tb;
    private UiComponent field_Sb;
    private UiComponent field_Kb;
    long field_Fb;
    private int field_Lb;
    private StringBuilder field_Nb;
    static String field_Gb;
    private UiComponent field_Vb;
    static String field_Ub;
    private UiComponent field_Mb;

    final boolean handleCancelKey(int param0) {
        if (param0 < 99) {
          field_Ub = (String) null;
        }
        if (-2 != this.field_Lb) {
          return false;
        }
        if (InfectionEvent.field_p == 13) {
          this.field_Lb = -1;
          return true;
        }
        return true;
    }

    final int updateAndPollReason(byte param0, boolean param1) {
        int var3 = 0;
        StateIconLabel stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        UiComponent stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -58) {
          this.field_Mb = (UiComponent) null;
        }
        this.a(-11838, param1);
        if (null != this.field_Sb) {
          this.field_Sb.field_wb = this.field_Nb.toString();
          this.field_Sb.field_x = (this.field_zb - this.field_Sb.field_yb.textWidth(this.field_Sb.field_wb)) / 2;
          this.field_Sb.field_zb = this.field_zb - this.field_Sb.field_x;
          if (this.field_Hb != null &&
            this.field_Hb.field_T != 0) {
            stackIn_8_0 = this.field_Hb;
            stackIn_9_1 = !(this.field_Hb.field_Ab);
            stackIn_8_0.field_Ab = stackIn_9_1;
          }
          for (var3 = 0; var3 < AlignedIconLabel.field_Kb; var3++) {
            if (this.field_Jb[var3] != null) {
              stackIn_17_0 = this.field_Jb[var3];
              stackIn_18_1 = !(this.field_Nb.length() <= 0);
              stackIn_17_0.field_Z = stackIn_18_1;
              if (this.field_Jb[var3].field_Z &&
                this.field_Jb[var3].field_T != 0) {
                return var3;
              }
            }
          }
        }
        if (this.field_Mb.field_T != 0) {
          return -1;
        }
        if (param1 &&
          kd.field_b != 0 &&
          this.field_T == 0) {
          return -1;
        }
        return this.field_Lb;
    }

    final static int d(boolean param0) {
        if (param0) {
          return -111;
        }
        return fl.field_a - ZombieDawnMulti.field_H;
    }

    final String getReportedName(int param0) {
        if (param0 != -26895) {
          return (String) null;
        }
        return this.field_Nb.toString();
    }

    final boolean isMuteRequested(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -23217) {
          this.field_Nb = (StringBuilder) null;
        }
        stackIn_6_0 = (null != this.field_Hb) && (this.field_Hb.field_Ab);
        return stackIn_6_0;
    }

    private final int appendReasonHeading(String param0, int param1, int param2, UiComponent param3, UiComponent param4, int param5) {
        UiComponent var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 <= 95) {
            stackIn_2_0 = 20;
            return stackIn_2_0;
          }
          var7 = new UiComponent(0L, param4, 0, param1, param2, 24, param0);
          param1 += 32;
          param3.a((byte) 50, var7);
          stackIn_4_0 = param1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("fa.CA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    final static ClientException addExceptionContext(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_k = var2.field_k + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    final static boolean b(int param0, int param1) {
        try {
          if (param1 <= s.field_e.position) {
            return true;
          }
          if (null == ki.field_h) {
            return false;
          }
          int var2_int = ki.field_h.a(124);
          if (0 < var2_int) {
            if (!(var2_int <= -s.field_e.position + param1)) {
              var2_int = param1 - s.field_e.position;
            }
            ki.field_h.a(var2_int, s.field_e.position, s.field_e.payload, 120);
            AlignedIconLabel.field_Gb = bl.monotonicMillis((byte) 80);
            s.field_e.position = s.field_e.position + var2_int;
            if (s.field_e.position < param1) {
              return false;
            }
            s.field_e.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (param0 != 10) {
              field_Gb = (String) null;
            }
            if (var2_int >= 0 &&
              LinkButtonPainter.millisSinceLastReceive((byte) -22) <= 30000L) {
              return false;
            }
            ak.closeGameSocket((byte) -124);
          } catch (IOException iOException) {
            ak.closeGameSocket((byte) -111);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_Qb = (Sprite[][]) null;
        field_Gb = null;
        int var1 = -52 % ((-4 - param0) / 45);
        field_Tb = null;
        field_Ub = null;
        field_Ob = null;
        field_Ib = null;
    }

    final static String a(int param0, int param1, int param2) {
        int var3 = -124 % ((55 - param0) / 63);
        return param2 + "/" + param1;
    }

    ReportAbuseDialog(int param0, int param1, int param2, int param3, int param4, UiComponent param5, UiComponent param6, UiComponent param7, UiComponent param8, StateIconLabel param9, UiComponent param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object stackIn_7_0;
        StateIconLabel stackIn_7_1;
        StateIconLabel stackIn_7_2;
        long stackIn_7_3;
        StateIconLabel stackIn_7_4;
        Object stackIn_8_0;
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
        UiComponent[] var15 = null;
        RuntimeException var15_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        UiComponent[] var28 = null;
        Object stackIn_7_0Lifetime1;
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
        this.field_Lb = -2;
        try {
          this.field_Fb = param12;
          this.field_Kb = new UiComponent(0L, param6, vc.field_g.toUpperCase());
          this.field_Kb.field_R = 1;
          this.a((byte) 50, this.field_Kb);
          this.field_Mb = new UiComponent(0L, param7);
          this.field_Kb.a((byte) 50, this.field_Mb);
          this.field_Rb = new UiComponent(0L, (UiComponent) null);
          this.a((byte) 50, this.field_Rb);
          if (param11 != null) {
            this.field_Vb = new UiComponent(0L, param8, wg.field_a);
            this.field_Vb.field_M = 11184810;
            this.field_Vb.field_R = 1;
            this.field_Rb.a((byte) 50, this.field_Vb);
            this.field_Pb = new UiComponent(0L, param8, bf.field_q);
            this.field_Pb.field_M = 11184810;
            this.field_Pb.field_R = 1;
            this.field_Rb.a((byte) 50, this.field_Pb);
            this.field_Sb = new UiComponent(0L, param8);
            this.field_Sb.field_M = 16764006;
            this.field_Rb.a((byte) 50, this.field_Sb);
            this.field_Sb.field_vb = "|";
            if (!(5 > am.field_b) ||
              !(kj.field_q < 2)) {
              regionExit1: {
                stackIn_7_0 = this;
                stackIn_7_1 = null;
                stackIn_7_2 = null;
                stackIn_7_3 = 0L;
                stackIn_7_4 = (StateIconLabel) (param9);
                if (am.field_b < 7) {
                  stackIn_8_0 = this;
                  stackIn_7_0Lifetime1 = stackIn_8_0;
                  if (kj.field_q < 2) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = NameEntryPopup.field_Kb;
                    break regionExit1;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = jj.field_I;
              }
              this.field_Hb = new StateIconLabel(stackIn_7_3, stackIn_7_4, stackIn_9_5);
              this.field_Rb.a((byte) 50, this.field_Hb);
            }
            var28 = new UiComponent[3];
            var15 = var28;
            var28[0] = new UiComponent(0L, (UiComponent) null);
            this.field_Rb.a((byte) 50, var28[0]);
            var28[1] = new UiComponent(0L, (UiComponent) null);
            this.field_Rb.a((byte) 50, var28[1]);
            var28[2] = new UiComponent(0L, (UiComponent) null);
            this.field_Rb.a((byte) 50, var28[2]);
            this.field_Jb = new UiComponent[AlignedIconLabel.field_Kb];
            for (var16 = 0; AlignedIconLabel.field_Kb > var16; var16++) {
              if (nk.field_n[var16] != null) {
                this.field_Jb[var16] = new UiComponent(0L, param10, nk.field_n[var16]);
                this.field_Jb[var16].field_R = 0;
                stackIn_15_0 = this.field_Jb[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.field_Z = stackIn_16_1;
                this.field_Rb.a((byte) 50, this.field_Jb[var16]);
              }
            }
            this.field_Nb = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Nb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_yb.textWidth(mn.field_q);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_yb.textWidth(ho.field_p);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_yb.textWidth(ki.field_p);
            if (var16Lifetime2 < var17Lifetime3) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < AlignedIconLabel.field_Kb; var17Lifetime4++) {
              if (null != this.field_Jb[var17Lifetime4]) {
                var18 = this.field_Jb[var17Lifetime4].e(0);
                if (var16Lifetime2 < var18) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (140 < var16Lifetime2) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.appendReasonHeading(mn.field_q, var18Lifetime3, var16Lifetime2, var28[0], param6, 113);
            var18Lifetime3 = this.a(var28[0], var16Lifetime2, this.field_Jb[6], var18Lifetime3, (byte) -55);
            var18Lifetime3 = this.a(var28[0], var16Lifetime2, this.field_Jb[9], var18Lifetime3, (byte) -55);
            var18Lifetime3 = this.a(var28[0], var16Lifetime2, this.field_Jb[5], var18Lifetime3, (byte) -55);
            var18Lifetime3 = this.a(var28[0], var16Lifetime2, this.field_Jb[7], var18Lifetime3, (byte) -55);
            var18Lifetime3 = this.a(var28[0], var16Lifetime2, this.field_Jb[15], var18Lifetime3, (byte) -55);
            var18Lifetime3 = this.a(var28[0], var16Lifetime2, this.field_Jb[4], var18Lifetime3, (byte) -55);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.appendReasonHeading(ho.field_p, var18Lifetime4, var16Lifetime2, var28[1], param6, 114);
            var18Lifetime4 = this.a(var28[1], var16Lifetime2, this.field_Jb[16], var18Lifetime4, (byte) -55);
            var18Lifetime4 = this.a(var28[1], var16Lifetime2, this.field_Jb[17], var18Lifetime4, (byte) -55);
            var18Lifetime4 = this.a(var28[1], var16Lifetime2, this.field_Jb[18], var18Lifetime4, (byte) -55);
            var18Lifetime4 = this.a(var28[1], var16Lifetime2, this.field_Jb[19], var18Lifetime4, (byte) -55);
            var18Lifetime4 = this.a(var28[1], var16Lifetime2, this.field_Jb[20], var18Lifetime4, (byte) -55);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.appendReasonHeading(ki.field_p, var18Lifetime5, var16Lifetime2, var28[2], param6, 119);
            var18Lifetime5 = this.a(var28[2], var16Lifetime2, this.field_Jb[13], var18Lifetime5, (byte) -55);
            var18Lifetime5 = this.a(var28[2], var16Lifetime2, this.field_Jb[21], var18Lifetime5, (byte) -55);
            var18Lifetime5 = this.a(var28[2], var16Lifetime2, this.field_Jb[11], var18Lifetime5, (byte) -55);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 3 * var16Lifetime2 + 26;
            var20 = this.field_Kb.e(0);
            if (var20 > var19) {
              var19 = var20;
            }
            if (null != this.field_Hb) {
              var20Lifetime2 = this.field_Hb.measureLabelWidth((byte) 122, 4);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Kb.setBounds(24, 0, 13 + var19 + 13, 0, -3344);
            this.field_Mb.setBounds(15, 5, 15, this.field_Kb.field_zb - 20, -3344);
            var21 = 10;
            this.field_Vb.setBounds(jk.field_f * 2, var21, var19, 13, -3344);
            var21 = var21 + 2 * jk.field_f;
            this.field_Pb.setBounds(jk.field_f * 2, var21, var19, 13, -3344);
            var21 = var21 + (10 + 2 * jk.field_f);
            this.field_Sb.setBounds(jk.field_f, var21, 0, 0, -3344);
            var21 = var21 + (10 + jk.field_f);
            if (null != this.field_Hb) {
              var20Lifetime3 = this.field_Hb.measureLabelWidth((byte) 102, 4);
              this.field_Hb.setIconLabelBounds(var21, (byte) -96, 4, var20Lifetime3, 13 + (-var20Lifetime3 + var19) / 2, jk.field_f);
              var21 = var21 + (10 + jk.field_f);
            }
            var28[0].setBounds(var17Lifetime5, var21, var16Lifetime2, 13, -3344);
            var28[1].setBounds(var17Lifetime5, var21, var16Lifetime2, 13 + (13 + var16Lifetime2), -3344);
            var28[2].setBounds(var17Lifetime5, var21, var16Lifetime2, 2 * var16Lifetime2 + 13 + 26, -3344);
            var22 = var21;
            this.field_Rb.setBounds(var22 + var17Lifetime5 + 10, 24, 13 + (var19 + 13), 0, -3344);
            this.field_Rb.field_ab = tg.createGradientFrameSprites(2105376, this.field_Rb.field_z, 8421504, 3, 11579568, 30);
            var23 = 13 + (13 + var19);
            var24 = var22 + 24 + var17Lifetime5 + 10;
            var25 = MatchingTextValidator.a(param0, (byte) 109, var23, param2);
            var26 = IntrusiveNode.placePopupVertically(true, param1, param3, var24);
            this.setBounds(var24, var26, var23, var25, -3344);
            return;
          }
          this.field_Vb = new UiComponent(0L, param8, ng.field_f);
          this.field_Vb.field_R = 1;
          this.field_Vb.field_M = 11184810;
          this.field_Rb.a((byte) 50, this.field_Vb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Vb.field_yb.countWrappedLines(this.field_Vb.field_wb, var15_int);
          this.field_Vb.setBounds(var17Lifetime1 * jk.field_f, var16Lifetime1, var15_int, 13, -3344);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * jk.field_f;
          this.field_Rb.setBounds(10 + var16Lifetime1, 24, 13 + (var15_int + 13), 0, -3344);
          this.field_Rb.field_ab = tg.createGradientFrameSprites(2105376, this.field_Rb.field_z, 8421504, 3, 11579568, 92);
          var18Lifetime1 = 13 - (-var15_int - 13);
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = MatchingTextValidator.a(param0, (byte) 25, var18Lifetime1, param2);
          var21Lifetime1 = IntrusiveNode.placePopupVertically(true, param1, param3, var19Lifetime1);
          this.setBounds(var19Lifetime1, var21Lifetime1, var18Lifetime1, var20Lifetime1, -3344);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("fa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    private final int a(UiComponent param0, int param1, UiComponent param2, int param3, byte param4) {
        int discarded$1 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        UiComponent var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3 += 8;
          var6_int = param2.field_yb.measureWrappedHeight(param2.field_wb, -(2 * param2.field_V) + param1, param2.field_J);
          param2.setBounds(var6_int, param3, param1, 0, -3344);
          param3 = param3 + (0 + var6_int);
          if (param4 != -55) {
            var7 = (UiComponent) null;
            discarded$1 = this.a((UiComponent) null, 103, (UiComponent) null, -43, (byte) -6);
          }
          param0.a((byte) 50, param2);
          stackIn_3_0 = param3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("fa.EA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_Qb = new Sprite[5][];
        field_Ob = "Stunning is not enough.";
        field_Gb = "Email: ";
        field_Ub = "This game option is only available to members.";
    }
}
