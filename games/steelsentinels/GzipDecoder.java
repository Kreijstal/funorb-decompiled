/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecoder {
    static SceneWidget[] field_a;
    static boolean field_e;
    static boolean field_c;
    static String field_h;
    static int field_g;
    static String field_d;
    static int[] field_b;
    private java.util.zip.Inflater field_f;

    final static void buildSettingsPanelRows(SceneWidget param0, byte param1) {
        int var11 = 0;
        int var9 = 0;
        SceneWidget stackIn_13_0 = null;
        int stackIn_14_1 = 0;
        SceneWidget stackIn_16_0 = null;
        String stackIn_17_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        SceneWidget stackIn_42_0 = null;
        IndexedSprite[] stackIn_42_1 = null;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        SceneWidget var5 = null;
        int var6 = 0;
        SceneWidget var7 = null;
        int var8 = 0;
        SceneWidget var9_ref_gh = null;
        int var10 = 0;
        int var12 = 0;
        SceneWidget var13 = null;
        SceneWidget var14 = null;
        SceneWidget var15 = null;
        SceneWidget var16 = null;
        int var3Lifetime1;
        var12 = SteelSentinels.obfuscationControl;
        try {
          var14 = new SceneWidget();
          var14.field_nb = 0;
          var14.field_ub = 4;
          var14.field_I = TutorialStepTable.field_g;
          var14.field_L = (BitmapFont) ((Object) BoundedUrlRequest.field_d);
          var14.field_Fb = 0;
          var14.field_Ib = 15;
          var14.field_Kb = 1;
          var3 = 0;
          var4 = 20;
          if (null != param0.field_M) {
            param0.field_M.clear(param1 - 13);
          }
          var5 = new SceneWidget("", var14);
          var5.field_S = RequestResendHelpers.field_c;
          var5.setBounds(0, 0, 18, 0, 110);
          param0.addChild(var5, 120);
          var6 = PendingIntArrayRequest.field_v.getTotalModuleSlots(param1 ^ -97);
          var7 = new SceneWidget(-1L, (SceneWidget) null);
          var7.field_I = MatchingTextValidator.field_t;
          var8 = (var6 + 1) / 2 * 51 + 32;
          if (param1 != 19) {
            field_a = (SceneWidget[]) null;
          }
          var7.setBounds(0, var4, var8, 0, 110);
          param0.addChild(var7, 121);
          var4 += 3;
          var9_ref_gh = new SceneWidget("", NameAvailabilityValidator.field_n);
          var10 = 0;
          for (var11 = 0; var6 > var11; var11++) {
            if (ContextMenu.field_bc[var11] == OptionMaskHelpers.field_c[var11]) {
              continue;
            }
            var10 = 1;
            break;
          }
          stackIn_13_0 = var9_ref_gh;
          if (var10 == 0) {
            stackIn_14_1 = 9211020;
          } else {
            stackIn_14_1 = 1021128;
          }
          stackIn_13_0.field_nb = stackIn_14_1;
          stackIn_16_0 = var9_ref_gh;
          if (var10 == 0) {
            stackIn_17_1 = DiskCacheWorker.field_a;
          } else {
            stackIn_17_1 = ReportAbuseDialog.field_Vb;
          }
          stackIn_16_0.field_S = stackIn_17_1;
          if (var10 == 0) {
            var9_ref_gh.field_I = SocialRequestHelpers.field_b;
          }
          var9_ref_gh.setBounds(0, var4, 18, 3, 104);
          var9_ref_gh.field_Kb = 1;
          param0.addChild(var9_ref_gh, 118);
          if (var10 != 0) {
            stackIn_21_0 = param0.field_Rb;
            stackIn_21_1 = LobbySetupHelpers.field_f;
            if (stackIn_21_0 <= stackIn_21_1 &&
              LobbySetupHelpers.field_f < param0.field_Rb + 110 &&
              DelegatingCanvas.field_c >= param0.field_cb + var4 &&
              18 + (var4 + param0.field_cb) > DelegatingCanvas.field_c) {
              TutorialStepTable.field_e = -2;
              var9_ref_gh.field_I = MatchingTextValidator.field_t;
            }
          }
          var4 += 22;
          var3Lifetime1 = 6;
          var4 += 4;
          for (var9 = 0; var6 > var9; var9++) {
            if (var9 != 1) {
            }
            var15 = new SceneWidget("", NameAvailabilityValidator.field_n);
            var15.setBounds(0, var4, 47, var3Lifetime1, 47);
            param0.addChild(var15, param1 ^ 101);
            if (LobbySetupHelpers.field_f >= var3Lifetime1 + param0.field_Rb &&
              LobbySetupHelpers.field_f < 47 + param0.field_Rb + var3Lifetime1 &&
              DelegatingCanvas.field_c >= param0.field_cb + var4 &&
              param0.field_cb - (-var4 - 47) > DelegatingCanvas.field_c) {
              TutorialStepTable.field_e = var9;
              var15.field_I = UrlAndReplyHelpers.field_f;
            } else if (!(NameSuggestionsPanel.field_Y < 0) ||
              !(NameTable.field_h < 0)) {
              var15.field_I = UrlAndReplyHelpers.field_f;
            }
            if (OptionMaskHelpers.field_c[var9] != -1) {
              var13 = new SceneWidget();
              var16 = var13;
              stackIn_42_0 = var13;
              stackIn_42_1 = IsaacRandom.field_d;
              if (NameTable.isBitSet(ArchiveRequest.field_D, OptionMaskHelpers.field_c[var9], -20370)) {
                stackIn_43_2 = OptionMaskHelpers.field_c[var9];
              } else {
                stackIn_43_2 = OptionMaskHelpers.field_c[var9] + 64;
              }
              stackIn_42_0.field_Pb = ((IndexedSprite) (Object) stackIn_42_1[stackIn_43_2]).toRgbSprite();
              var16.setBounds(0, var4 + 3, 40, var3Lifetime1 + 3, 40);
              param0.addChild(var16, 118);
            }
            var3Lifetime1 = 63 - var3Lifetime1;
            if (var3Lifetime1 == 6) {
              var4 += 51;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("vb.A(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    final void decompress(PacketBuffer param0, byte[] param1, boolean param2) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param0.payload[param0.position] == 31 &&
              -117 == param0.payload[param0.position + 1]) {
              if (this.field_f == null) {
                this.field_f = new java.util.zip.Inflater(true);
              }
              try {
                this.field_f.setInput(param0.payload, param0.position + 10, param0.payload.length + (-10 - param0.position) - 8);
                if (!param2) {
                  return;
                }
                this.field_f.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
                this.field_f.reset();
                throw new RuntimeException("");
              }
              this.field_f.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var4_ref;
            stackIn_15_1 = new StringBuilder().append("vb.F(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void layoutSlidingSidePanels(byte param0, int param1) {
        int var2 = (-640 + NumericDateInputWidget.field_Z) / 2;
        int var3 = AudioService.field_h * AudioService.field_h;
        int var4 = -(param1 * param1) + var3;
        SocialListPanel.field_ec.setBounds(0, 90, -210 + (SoftwareRaster.field_j - 4), -(var4 * 199 / var3) + var2, 199);
        NanoTickClock.field_y.setBounds(0, 0, -120 + SoftwareRaster.field_j - 4, var4 * 438 / var3 + (var2 + 202), 438);
        if (param0 > 8) {
          return;
        }
        byte[] var5 = (byte[]) null;
        GzipDecoder.queueByteRequest(-9, (byte[]) null, (byte) 24);
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 != -1) {
          return;
        }
        field_h = null;
    }

    public GzipDecoder() {
        this(-1, 1000000, 1000000);
    }

    final static boolean ownsSpecialPart(int param0) {
        int var1 = 61 % ((24 - param0) / 62);
        return NameTable.isBitSet(PendingAckRequest.field_D, 55, -20370);
    }

    final static PendingDataRequest queueByteRequest(int param0, byte[] param1, byte param2) {
        PendingDataRequest var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        PendingDataRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -30) {
            var4 = (byte[]) null;
            GzipDecoder.queueByteRequest(-34, (byte[]) null, (byte) 32);
          }
          var3 = new PendingDataRequest(param1);
          QuickChatHelpDialog.field_Vb.addLast(3, var3);
          PasswordValidator.sendBlobWithCrc(param0, param2 - 39, var3);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("vb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private GzipDecoder(int param0, int param1, int param2) {
    }

    static {
        field_a = new SceneWidget[4];
        field_e = false;
        field_h = "<%1> couldn't find cover in time";
        field_b = new int[]{2, 20, 21, 6, 37, 45, 5, 12, 13};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void layoutSlidingSidePanels(int param0, int param1) {
        int var2 = (-640 + NumericDateInputWidget.field_Z) / 2;
        int var3 = AudioService.field_h * AudioService.field_h;
        int var4 = -(param1 * param1) + var3;
        SocialListPanel.field_ec.setBounds(0, 90, -210 + (SoftwareRaster.field_j - 4), -(var4 * 199 / var3) + var2, 199);
        NanoTickClock.field_y.setBounds(0, 0, -120 + SoftwareRaster.field_j - 4, var4 * 438 / var3 + (var2 + 202), 438);
        if (param0 > 8) {
          return;
        }
        byte[] var5 = (byte[]) null;
        GzipDecoder.queueByteRequest(-9, (byte[]) null, (byte) 24);
    }
}
