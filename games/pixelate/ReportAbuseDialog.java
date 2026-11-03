/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportAbuseDialog extends SceneWidget {
    static int field_Sb;
    private SceneWidget field_Tb;
    private SceneWidget field_Eb;
    private SceneWidget field_Fb;
    private PairedTextColumns muteControl;
    private SceneWidget[] offenceButtons;
    private int field_Jb;
    private SceneWidget targetNameComponent;
    long field_Ub;
    static int[] field_Hb;
    private SceneWidget field_Ob;
    static String field_Gb;
    static String field_Mb;
    static String field_Vb;
    private StringBuilder field_Ib;
    static byte[] field_Rb;
    static String field_Kb;
    private SceneWidget field_Qb;

    final boolean j(int param0) {
        if (-2 != this.field_Jb) {
          return false;
        }
        if (ke.field_a == 13) {
          this.field_Jb = -1;
        }
        if (param0 != -1) {
          field_Mb = (String) null;
          return true;
        }
        return true;
    }

    ReportAbuseDialog(int param0, int param1, int param2, int param3, int param4, SceneWidget param5, SceneWidget param6, SceneWidget param7, SceneWidget param8, PairedTextColumns param9, SceneWidget param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        PairedTextColumns stackIn_6_1;
        PairedTextColumns stackIn_6_2;
        long stackIn_6_3;
        PairedTextColumns stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        PairedTextColumns stackIn_8_1;
        PairedTextColumns stackIn_8_2;
        String stackIn_8_5;
        SceneWidget stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
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
        int var15_int = 0;
        SceneWidget[] var15 = null;
        RuntimeException var15_ref = null;
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
        SceneWidget[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        PairedTextColumns stackIn_8_1Lifetime1;
        PairedTextColumns stackIn_8_2Lifetime1;
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
        this.field_Jb = -2;
        try {
          this.field_Ub = param12;
          this.field_Eb = new SceneWidget(0L, param6, MatchingTextValidator.field_m.toUpperCase());
          this.field_Eb.horizontalAlignment = 1;
          this.addChild(this.field_Eb, (byte) 26);
          this.field_Ob = new SceneWidget(0L, param7);
          this.field_Eb.addChild(this.field_Ob, (byte) 26);
          this.field_Qb = new SceneWidget(0L, (SceneWidget) null);
          this.addChild(this.field_Qb, (byte) 26);
          if (param11 != null) {
            this.field_Tb = new SceneWidget(0L, param8, ge.field_d);
            this.field_Tb.field_N = 11184810;
            this.field_Tb.horizontalAlignment = 1;
            this.field_Qb.addChild(this.field_Tb, (byte) 26);
            this.field_Fb = new SceneWidget(0L, param8, CachedTextLayout.field_j);
            this.field_Fb.field_N = 11184810;
            this.field_Fb.horizontalAlignment = 1;
            this.field_Qb.addChild(this.field_Fb, (byte) 26);
            this.targetNameComponent = new SceneWidget(0L, param8);
            this.targetNameComponent.field_N = 16764006;
            this.field_Qb.addChild(this.targetNameComponent, (byte) 26);
            this.targetNameComponent.field_qb = "|";
            if (!(Js5NetworkRequest.field_I < 5) ||
              !(wo.field_h < 2)) {
              regionExit1: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (PairedTextColumns) (param9);
                if (Js5NetworkRequest.field_I < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (wo.field_h < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = ClientContextMenu.field_c;
                    break regionExit1;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = nh.field_d;
              }
              this.muteControl = new PairedTextColumns(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Qb.addChild(this.muteControl, (byte) 26);
            }
            var28 = new SceneWidget[3];
            var15 = var28;
            var28[0] = new SceneWidget(0L, (SceneWidget) null);
            this.field_Qb.addChild(var28[0], (byte) 26);
            var28[1] = new SceneWidget(0L, (SceneWidget) null);
            this.field_Qb.addChild(var28[1], (byte) 26);
            var28[2] = new SceneWidget(0L, (SceneWidget) null);
            this.field_Qb.addChild(var28[2], (byte) 26);
            this.offenceButtons = new SceneWidget[d.field_b];
            for (var16 = 0; d.field_b > var16; var16++) {
              if (null != cd.field_e[var16]) {
                this.offenceButtons[var16] = new SceneWidget(0L, param10, cd.field_e[var16]);
                this.offenceButtons[var16].horizontalAlignment = 0;
                stackIn_14_0 = this.offenceButtons[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_rb = stackIn_15_1;
                this.field_Qb.addChild(this.offenceButtons[var16], (byte) 26);
              }
            }
            this.field_Ib = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Ib.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.font.textWidth(DirectByteStorage.field_l);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.font.textWidth(MusicPatchPcmStream.field_t);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.font.textWidth(IsaacRandom.field_j);
            if (var16Lifetime2 < var17Lifetime3) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; d.field_b > var17Lifetime4; var17Lifetime4++) {
              if (null != this.offenceButtons[var17Lifetime4]) {
                var18 = this.offenceButtons[var17Lifetime4].g(0);
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
            var18Lifetime3 = this.appendReasonHeading((byte) 126, var18Lifetime3, param6, var16Lifetime2, var28[0], DirectByteStorage.field_l);
            var18Lifetime3 = this.appendReasonButton(var28[0], var18Lifetime3, (byte) 110, var16Lifetime2, this.offenceButtons[6]);
            var18Lifetime3 = this.appendReasonButton(var28[0], var18Lifetime3, (byte) 112, var16Lifetime2, this.offenceButtons[9]);
            var18Lifetime3 = this.appendReasonButton(var28[0], var18Lifetime3, (byte) 101, var16Lifetime2, this.offenceButtons[5]);
            var18Lifetime3 = this.appendReasonButton(var28[0], var18Lifetime3, (byte) 126, var16Lifetime2, this.offenceButtons[7]);
            var18Lifetime3 = this.appendReasonButton(var28[0], var18Lifetime3, (byte) 98, var16Lifetime2, this.offenceButtons[15]);
            var18Lifetime3 = this.appendReasonButton(var28[0], var18Lifetime3, (byte) 108, var16Lifetime2, this.offenceButtons[4]);
            if (var17Lifetime5 < var18Lifetime3) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.appendReasonHeading((byte) 112, var18Lifetime4, param6, var16Lifetime2, var28[1], MusicPatchPcmStream.field_t);
            var18Lifetime4 = this.appendReasonButton(var28[1], var18Lifetime4, (byte) 114, var16Lifetime2, this.offenceButtons[16]);
            var18Lifetime4 = this.appendReasonButton(var28[1], var18Lifetime4, (byte) 95, var16Lifetime2, this.offenceButtons[17]);
            var18Lifetime4 = this.appendReasonButton(var28[1], var18Lifetime4, (byte) 95, var16Lifetime2, this.offenceButtons[18]);
            var18Lifetime4 = this.appendReasonButton(var28[1], var18Lifetime4, (byte) 99, var16Lifetime2, this.offenceButtons[19]);
            var18Lifetime4 = this.appendReasonButton(var28[1], var18Lifetime4, (byte) 108, var16Lifetime2, this.offenceButtons[20]);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.appendReasonHeading((byte) 114, var18Lifetime5, param6, var16Lifetime2, var28[2], IsaacRandom.field_j);
            var18Lifetime5 = this.appendReasonButton(var28[2], var18Lifetime5, (byte) 94, var16Lifetime2, this.offenceButtons[13]);
            var18Lifetime5 = this.appendReasonButton(var28[2], var18Lifetime5, (byte) 98, var16Lifetime2, this.offenceButtons[21]);
            var18Lifetime5 = this.appendReasonButton(var28[2], var18Lifetime5, (byte) 120, var16Lifetime2, this.offenceButtons[11]);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + var16Lifetime2 * 3;
            var20 = this.field_Eb.g(0);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.muteControl != null) {
              var20Lifetime2 = this.muteControl.b((byte) 115, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Eb.setBounds(0, 24, 0, 256, 13 + (var19 + 13));
            this.field_Ob.setBounds(5, 15, this.field_Eb.field_K - 20, 256, 15);
            var21 = 10;
            this.field_Tb.setBounds(var21, 2 * fq.field_q, 13, 256, var19);
            var21 = var21 + 2 * fq.field_q;
            this.field_Fb.setBounds(var21, 2 * fq.field_q, 13, 256, var19);
            var21 = var21 + (fq.field_q * 2 + 10);
            this.targetNameComponent.setBounds(var21, fq.field_q, 0, 256, 0);
            var21 = var21 + (fq.field_q + 10);
            if (this.muteControl != null) {
              var20Lifetime3 = this.muteControl.b((byte) 115, 4);
              this.muteControl.a(fq.field_q, (var19 - var20Lifetime3) / 2 + 13, var21, var20Lifetime3, 4, 0);
              var21 = var21 + (fq.field_q + 10);
            }
            var28[0].setBounds(var21, var17Lifetime5, 13, 256, var16Lifetime2);
            var28[1].setBounds(var21, var17Lifetime5, 26 + var16Lifetime2, 256, var16Lifetime2);
            var28[2].setBounds(var21, var17Lifetime5, 39 + 2 * var16Lifetime2, 256, var16Lifetime2);
            var22 = var21;
            this.field_Qb.setBounds(24, var17Lifetime5 + (var22 + 10), 0, 256, 13 + (var19 + 13));
            this.field_Qb.field_zb = OptionsScreen.buildNineSliceSprites(8421504, 16, 11579568, this.field_Qb.height, 2105376, 3);
            var23 = 13 + (var19 + 13);
            var24 = var17Lifetime5 + (24 + var22) + 10;
            var25 = ui.a(param2, param0, var23, (byte) -1);
            var26 = pj.a(var24, param1, param3, (byte) 110);
            this.setBounds(var26, var24, var25, 256, var23);
            return;
          }
          this.field_Tb = new SceneWidget(0L, param8, SocialListEntry.field_Lb);
          this.field_Tb.horizontalAlignment = 1;
          this.field_Tb.field_N = 11184810;
          this.field_Qb.addChild(this.field_Tb, (byte) 26);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Tb.font.wrappedLineCount(this.field_Tb.field_cb, var15_int);
          this.field_Tb.setBounds(var16Lifetime1, var17Lifetime1 * fq.field_q, 13, 256, var15_int);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * fq.field_q;
          this.field_Qb.setBounds(24, var16Lifetime1 + 10, 0, 256, 13 + (var15_int + 13));
          this.field_Qb.field_zb = OptionsScreen.buildNineSliceSprites(8421504, 16, 11579568, this.field_Qb.height, 2105376, 3);
          var18Lifetime1 = 13 - (-var15_int - 13);
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = ui.a(param2, param0, var18Lifetime1, (byte) -1);
          var21Lifetime1 = pj.a(var19Lifetime1, param1, param3, (byte) 32);
          this.setBounds(var21Lifetime1, var19Lifetime1, var20Lifetime1, 256, var18Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("oe.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    private final int appendReasonHeading(byte param0, int param1, SceneWidget param2, int param3, SceneWidget param4, String param5) {
        SceneWidget var7 = null;
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
          var7 = new SceneWidget(0L, param2, 0, param1, param3, 24, param5);
          if (param0 < 111) {
            this.field_Ob = (SceneWidget) null;
          }
          param1 += 32;
          param4.addChild(var7, (byte) 26);
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("oe.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static java.awt.Canvas b(byte param0) {
        if (param0 > -68) {
          ReportAbuseDialog.m(38);
        }
        return ib.field_f == null ? NameAvailabilityValidator.field_u : (java.awt.Canvas) ((Object) ib.field_f);
    }

    final int pollOffence(byte param0, boolean param1) {
        int var3 = 0;
        PairedTextColumns stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        SceneWidget stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        this.a(-28476, param1);
        if (this.targetNameComponent != null) {
          this.targetNameComponent.field_cb = this.field_Ib.toString();
          this.targetNameComponent.field_D = (this.field_K - this.targetNameComponent.font.textWidth(this.targetNameComponent.field_cb)) / 2;
          this.targetNameComponent.field_K = -this.targetNameComponent.field_D + this.field_K;
          if (null != this.muteControl &&
            this.muteControl.field_P != 0) {
            stackIn_7_0 = this.muteControl;
            stackIn_8_1 = !(this.muteControl.field_U);
            stackIn_7_0.field_U = stackIn_8_1;
          }
          for (var3 = 0; d.field_b > var3; var3++) {
            if (this.offenceButtons[var3] != null) {
              stackIn_16_0 = this.offenceButtons[var3];
              stackIn_17_1 = !(0 >= this.field_Ib.length());
              stackIn_16_0.field_rb = stackIn_17_1;
              if (this.offenceButtons[var3].field_rb &&
                this.offenceButtons[var3].field_P != 0) {
                return var3;
              }
            }
          }
        }
        if (param0 <= 30) {
          this.field_Ob = (SceneWidget) null;
        }
        if (this.field_Ob.field_P != 0) {
          return -1;
        }
        if (param1 &&
          IntrusiveDequeCursor.field_c != 0 &&
          this.field_P == 0) {
          return -1;
        }
        return this.field_Jb;
    }

    public static void m(int param0) {
        field_Kb = null;
        field_Gb = null;
        field_Hb = null;
        field_Mb = null;
        if (param0 != 1) {
          ReportAbuseDialog.b((byte) -8);
        }
        field_Rb = null;
        field_Vb = null;
    }

    final static void a(int param0, ResourceArchive param1, IndexedSprite[] param2, int[] param3, ResourceArchive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        SceneWidget var10 = null;
        SceneWidget var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        SceneWidget var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = Pixelate.field_H ? 1 : 0;
        try {
          var20 = NetworkGameClient.a(param1, 47, "lobby", "crowns");
          var5 = var20;
          BoardView.field_s = var20.length;
          if (param2 != null) {
            var6 = new IndexedSprite[param2.length + BoardView.field_s];
            for (var7_int = 0; BoardView.field_s > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param2.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + BoardView.field_s] = param2[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; BoardView.field_s > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param2 != null) {
            if (param3 != null) {
              for (var7_intLifetime2 = 0; param2.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + BoardView.field_s] = param3[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param2.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + BoardView.field_s] = param2[var7_intLifetime2].field_a;
              }
            }
          }
          MouseWheelHandler.field_c = 4;
          fq.field_q = 15;
          TickClock.field_d = 11;
          r.field_c = 2;
          PlayerBoard.field_q = 2;
          var7 = PicturePreview.a(0, param4, "largefont", param1, "lobby");
          ig.field_d = PicturePreview.a(0, param4, "generalfont", param1, "lobby");
          EditableTextWidget.field_Y = PicturePreview.a(0, param4, "chatfont", param1, "lobby");
          var7.setInlineSprites(var5, var24);
          ig.field_d.setInlineSprites(var5, var24);
          EditableTextWidget.field_Y.setInlineSprites(var5, var24);
          var8 = new SceneWidget(0L, (SceneWidget) null);
          var8.field_mb = fq.field_q;
          var8.field_N = 16777215;
          var8.font = (BitmapFont) ((Object) var7);
          var8.verticalAlignment = 1;
          var9 = var8;
          var9.horizontalAlignment = 1;
          var10 = new SceneWidget(0L, (SceneWidget) null);
          var10.font = (BitmapFont) ((Object) ig.field_d);
          var10.field_mb = fq.field_q;
          var10.field_N = 16777215;
          var10.verticalAlignment = 1;
          var11 = var10;
          var11.horizontalAlignment = 1;
          io.field_f = new SceneWidget(0L, var8);
          io.field_f.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("heading", "lobby", (byte) 47, param1));
          ProxySocketConnector.field_k = new SceneWidget(0L, (SceneWidget) null);
          ProxySocketConnector.field_k.field_zb = AccountNamePrompt.a(false, false, 4210752, 120, true, 8421504);
          ConditionalTextValue.field_g = new SceneWidget(0L, (SceneWidget) null);
          ConditionalTextValue.field_g.field_zb = OptionsScreen.buildNineSliceSprites(6316128, 16, 6316128, 114, 1, 3);
          SoundCache.field_c = new SceneWidget(0L, (SceneWidget) null);
          SoundCache.field_c.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("popup", "lobby", (byte) 47, param1));
          var12 = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("popup_mouseover", "lobby", (byte) 47, param1));
          var13 = SocketConnector.loadRgbSpritesByName("button", "lobby", (byte) 47, param1);
          var14 = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("tab_active", "lobby", (byte) 47, param1));
          pj.field_i = new SceneWidget(0L, var8);
          pj.field_i.field_zb = var14;
          Vector3.field_f = new SceneWidget(0L, (SceneWidget) null);
          Vector3.field_f.field_H = bi.loadSprite("lobby", "closebutton", param1, (byte) -127);
          Vector3.field_f.field_B = bi.loadSprite("lobby", "closebutton_mouseover", param1, (byte) -106);
          ff.field_j = new SceneWidget(0L, var8);
          ff.field_j.field_zb = AccountNamePrompt.a(true, true, 2039583, 40, true, 3815994);
          QuickChatPhraseCache.field_l = new SceneWidget(0L, var10);
          QuickChatPhraseCache.field_l.field_C = 2;
          QuickChatPhraseCache.field_l.field_zb = AccountNamePrompt.a(true, false, 2039583, 30, true, 3815994);
          AccountRequestDialog.field_mb = new SceneWidget(0L, var10);
          AccountRequestDialog.field_mb.field_C = 2;
          AccountRequestDialog.field_mb.field_zb = AccountNamePrompt.a(false, false, 2039583, 30, true, 3815994);
          ni.field_s = new SceneWidget(0L, var10);
          ni.field_s.field_C = 2;
          ni.field_s.field_zb = AccountNamePrompt.a(false, true, 2039583, 30, true, 3815994);
          TextFieldValidator.field_h = new SceneWidget(0L, (SceneWidget) null);
          TextFieldValidator.field_h.verticalAlignment = 1;
          TextFieldValidator.field_h.field_N = 13421772;
          TextFieldValidator.field_h.field_mb = fq.field_q;
          TextFieldValidator.field_h.font = (BitmapFont) ((Object) ig.field_d);
          dn.field_c = new SceneWidget(0L, TextFieldValidator.field_h);
          dn.field_c.field_Cb = 16777215;
          dn.field_c.field_pb = 16777215;
          dn.field_c.field_N = 16764006;
          dn.field_c.field_O = 8421504;
          dn.field_c.field_y = 16777215;
          var15 = new SceneWidget(0L, dn.field_c);
          var15.field_N = 16777215;
          var15.field_mb = fq.field_q;
          var15.font = (BitmapFont) ((Object) var7);
          ArchiveIndex.field_l = new SceneWidget(0L, TextFieldValidator.field_h);
          ArchiveIndex.field_l.field_zb = AccountNamePrompt.a(false, false, 2236962, 16, true, 2236962);
          ArchiveIndex.field_l.field_C = 2;
          qk.field_d = new SceneWidget(0L, TextFieldValidator.field_h);
          qk.field_d.field_zb = AccountNamePrompt.a(false, false, 1513239, 16, true, 1513239);
          qk.field_d.field_C = 2;
          if (param0 >= -117) {
            return;
          }
          of.field_i = new SceneWidget(0L, ArchiveIndex.field_l);
          of.field_i.applyStyle(-27813, dn.field_c);
          SceneWidget.field_T = new SceneWidget(0L, qk.field_d);
          SceneWidget.field_T.applyStyle(-27813, dn.field_c);
          var16 = SocketConnector.loadRgbSpritesByName("button_mouseover", "lobby", (byte) 47, param1);
          NameSuggestionsPanel.field_O = new ContextActionMenu(SoundCache.field_c, var12, TextFieldValidator.field_h, dn.field_c, 3, 2, PlayerBoard.field_q, 3, fq.field_q);
          lc.field_q = new SceneWidget(0L, dn.field_c);
          lc.field_q.selectedOffsetX = 1;
          lc.field_q.field_Q = 1;
          lc.field_q.field_hb = 1;
          lc.field_q.field_ab = var16;
          lc.field_q.field_zb = var13;
          lc.field_q.field_V = 1;
          lc.field_q.field_bb = SocketConnector.loadRgbSpritesByName("button_mouseheld", "lobby", (byte) 47, param1);
          lc.field_q.field_eb = SocketConnector.loadRgbSpritesByName("button_active", "lobby", (byte) 47, param1);
          lc.field_q.field_M = SocketConnector.loadRgbSpritesByName("button_disabled", "lobby", (byte) 47, param1);
          lc.field_q.horizontalAlignment = 1;
          ab.field_a = new SceneWidget(0L, dn.field_c);
          ab.field_a.horizontalAlignment = 1;
          ab.field_a.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("tab_inactive", "lobby", (byte) 47, param1));
          ab.field_a.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("tab_mouseover", "lobby", (byte) 47, param1));
          ab.field_a.field_eb = var14;
          AccountMessagePanel.field_J = new SceneWidget(0L, (SceneWidget) null);
          AccountMessagePanel.field_J.field_zb = OptionsScreen.buildNineSliceSprites(1127256, 16, 1856141, 206, -1, 3);
          ff.field_a = new SceneWidget(0L, (SceneWidget) null);
          ff.field_a.field_zb = OptionsScreen.buildNineSliceSprites(6052956, 16, 11579568, 290, -1, 3);
          PicturePreview.field_k = new SceneWidget(0L, var15);
          PicturePreview.field_k.field_V = 1;
          PicturePreview.field_k.selectedOffsetX = 1;
          PicturePreview.field_k.horizontalAlignment = 1;
          PicturePreview.field_k.field_hb = 1;
          PicturePreview.field_k.field_Q = 1;
          nk.field_f = new SceneWidget(0L, PicturePreview.field_k);
          QuickChatPhraseCache.field_a = new SceneWidget(0L, dn.field_c);
          QuickChatPhraseCache.field_a.field_Q = 1;
          QuickChatPhraseCache.field_a.selectedOffsetX = 1;
          QuickChatPhraseCache.field_a.field_V = 1;
          QuickChatPhraseCache.field_a.field_hb = 1;
          QuickChatPhraseCache.field_a.horizontalAlignment = 1;
          TimerBar.field_p = new SceneWidget(0L, QuickChatPhraseCache.field_a);
          ge.field_h = new SceneWidget(0L, QuickChatPhraseCache.field_a);
          LoginForm.field_R = new SceneWidget(0L, PicturePreview.field_k);
          bl.field_d = new SceneWidget(0L, QuickChatPhraseCache.field_a);
          l.field_q = new SceneWidget(0L, QuickChatPhraseCache.field_a);
          EmailValidator.field_o = new SceneWidget(0L, QuickChatPhraseCache.field_a);
          QuickChatPhraseCache.field_a.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("smallbutton", "lobby", (byte) 47, param1));
          QuickChatPhraseCache.field_a.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("smallbutton_mouseover", "lobby", (byte) 47, param1));
          dupTemp$0 = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("smallbutton_active", "lobby", (byte) 47, param1));
          QuickChatPhraseCache.field_a.field_eb = dupTemp$0;
          QuickChatPhraseCache.field_a.field_bb = dupTemp$0;
          QuickChatPhraseCache.field_a.field_M = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("smallbutton_disabled", "lobby", (byte) 47, param1));
          nk.field_f.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("mediumbutton", "lobby", (byte) 47, param1));
          nk.field_f.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("mediumbutton_mouseover", "lobby", (byte) 47, param1));
          nk.field_f.field_bb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("mediumbutton_mouseheld", "lobby", (byte) 47, param1));
          PicturePreview.field_k.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("bigbutton", "lobby", (byte) 47, param1));
          PicturePreview.field_k.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("bigbutton_mouseover", "lobby", (byte) 47, param1));
          PicturePreview.field_k.field_bb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("bigbutton_mouseheld", "lobby", (byte) 47, param1));
          PicturePreview.field_k.field_M = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("bigbutton_disabled", "lobby", (byte) 47, param1));
          TimerBar.field_p.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("greenbutton", "lobby", (byte) 47, param1));
          TimerBar.field_p.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("greenbutton_mouseover", "lobby", (byte) 47, param1));
          TimerBar.field_p.field_bb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("greenbutton_mouseheld", "lobby", (byte) 47, param1));
          ge.field_h.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("redbutton", "lobby", (byte) 47, param1));
          ge.field_h.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("redbutton_mouseover", "lobby", (byte) 47, param1));
          ge.field_h.field_bb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("redbutton_mouseheld", "lobby", (byte) 47, param1));
          LoginForm.field_R.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("backbutton", "lobby", (byte) 47, param1));
          LoginForm.field_R.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("backbutton_mouseover", "lobby", (byte) 47, param1));
          LoginForm.field_R.field_bb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("backbutton_mouseheld", "lobby", (byte) 47, param1));
          LoginForm.field_R.field_M = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("backbutton_disabled", "lobby", (byte) 47, param1));
          EmailValidator.field_o.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("gameoptionbutton", "lobby", (byte) 47, param1));
          EmailValidator.field_o.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("gameoptionbutton_mouseover", "lobby", (byte) 47, param1));
          dupTemp$1 = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("gameoptionbutton_active", "lobby", (byte) 47, param1));
          EmailValidator.field_o.field_eb = dupTemp$1;
          EmailValidator.field_o.field_bb = dupTemp$1;
          EmailValidator.field_o.field_M = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("gameoptionbutton_disabled", "lobby", (byte) 47, param1));
          bl.field_d.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("chatbutton", "lobby", (byte) 47, param1));
          bl.field_d.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("chatbutton_mouseover", "lobby", (byte) 47, param1));
          dupTemp$2 = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("chatbutton_active", "lobby", (byte) 47, param1));
          bl.field_d.field_eb = dupTemp$2;
          bl.field_d.field_bb = dupTemp$2;
          l.field_q.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("chatfilterbutton", "lobby", (byte) 47, param1));
          l.field_q.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("chatfilterbutton_mouseover", "lobby", (byte) 47, param1));
          dupTemp$3 = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("chatfilterbutton_active", "lobby", (byte) 47, param1));
          l.field_q.field_eb = dupTemp$3;
          l.field_q.field_bb = dupTemp$3;
          var17 = SocketConnector.loadRgbSpritesByName("checkbox", "lobby", (byte) 47, param1);
          um.field_q = new PairedTextColumns(0L, var17[1], var17[0], 1, dn.field_c, (String) null);
          LoginDialog.field_mb = new SceneWidget(0L, (SceneWidget) null);
          LoginDialog.field_mb.field_zb = TextHotspotWidget.a(24414, bi.loadSprite("lobby", "slideregion", param1, (byte) -73));
          LoginDialog.field_mb.field_ab = TextHotspotWidget.a(24414, bi.loadSprite("lobby", "slideregion_mouseover", param1, (byte) -123));
          LoginDialog.field_mb.field_bb = TextHotspotWidget.a(24414, bi.loadSprite("lobby", "slideregion_mouseheld", param1, (byte) -64));
          LoginDialog.field_mb.field_M = TextHotspotWidget.a(24414, bi.loadSprite("lobby", "slideregion_disabled", param1, (byte) -50));
          jn.field_p = new SceneWidget(0L, (SceneWidget) null);
          jn.field_p.field_zb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("dragbar", "lobby", (byte) 47, param1));
          jn.field_p.field_ab = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("dragbar_mouseover", "lobby", (byte) 47, param1));
          jn.field_p.field_bb = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("dragbar_mouseheld", "lobby", (byte) 47, param1));
          jn.field_p.field_M = FallingPieceView.a(false, SocketConnector.loadRgbSpritesByName("dragbar_disabled", "lobby", (byte) 47, param1));
          ValidationState.field_a = new SceneWidget(0L, (SceneWidget) null);
          ValidationState.field_a.field_H = bi.loadSprite("lobby", "upbutton", param1, (byte) -78);
          ValidationState.field_a.field_B = bi.loadSprite("lobby", "upbutton_mouseover", param1, (byte) -126);
          ValidationState.field_a.field_ob = bi.loadSprite("lobby", "upbutton_mouseheld", param1, (byte) -43);
          ValidationState.field_a.field_xb = bi.loadSprite("lobby", "upbutton_disabled", param1, (byte) -58);
          ek.field_b = new SceneWidget(0L, (SceneWidget) null);
          ek.field_b.field_H = bi.loadSprite("lobby", "downbutton", param1, (byte) -25);
          ek.field_b.field_B = bi.loadSprite("lobby", "downbutton_mouseover", param1, (byte) -71);
          ek.field_b.field_ob = bi.loadSprite("lobby", "downbutton_mouseheld", param1, (byte) -83);
          ek.field_b.field_xb = bi.loadSprite("lobby", "downbutton_disabled", param1, (byte) -97);
          ug.field_s = new VerticalScrollbar(0L, ValidationState.field_a, ek.field_b, LoginDialog.field_mb, jn.field_p);
          rm.field_a = new ScrollPaneWithFooter(0L, (SceneWidget) null, ff.field_g, ug.field_s, QuickChatPhraseCache.field_a, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("oe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final boolean l(int param0) {
        ResourceArchive var3;
        boolean stackIn_6_0 = false;
        if (param0 != 2) {
          var3 = (ResourceArchive) null;
          ReportAbuseDialog.a(-5, (ResourceArchive) null, (IndexedSprite[]) null, (int[]) null, (ResourceArchive) null);
        }
        stackIn_6_0 = (this.muteControl != null) && (this.muteControl.field_U);
        return stackIn_6_0;
    }

    private final int appendReasonButton(SceneWidget param0, int param1, byte param2, int param3, SceneWidget param4) {
        int discarded$1 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        SceneWidget var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 += 8;
          var6_int = param4.font.paragraphHeight(param4.field_cb, -(param4.field_C * 2) + param3, param4.field_mb);
          param4.setBounds(param1, var6_int, 0, 256, param3);
          if (param2 < 93) {
            var7 = (SceneWidget) null;
            discarded$1 = this.appendReasonButton((SceneWidget) null, 19, (byte) -78, -14, (SceneWidget) null);
          }
          param0.addChild(param4, (byte) 26);
          param1 = param1 + (var6_int - 0);
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("oe.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String k(int param0) {
        int discarded$0 = 0;
        if (param0 <= 102) {
          SceneWidget var3 = (SceneWidget) null;
          discarded$0 = this.appendReasonButton((SceneWidget) null, 8, (byte) 76, -63, (SceneWidget) null);
        }
        return this.field_Ib.toString();
    }

    static {
        field_Sb = 0;
        field_Vb = "Emergent Behaviour";
        field_Gb = "Players: <%0>/<%1>";
        field_Mb = "You must play 1 more rated game before playing with the current options.";
        field_Kb = "Spectate <%0>'s game";
    }
}
