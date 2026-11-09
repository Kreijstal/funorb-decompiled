/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedInputValidator implements InputValidator {
    private long lastChangedAt;
    static int field_b;

    public final void markChanged(byte guard) {
        this.lastChangedAt = wq.monotonicTimeMillis(-100);
        if (guard > -14) {
          this.getMessage(31);
        }
    }

    abstract String evaluateMessage(int guard);

    abstract ValidationStatus evaluateStatus(byte guard);

    final static void a(ResourceArchive param0, int param1) {
        PcmSample[] var3 = null;
        PcmSample[] var2 = null;
        PcmSample[] var4 = null;
        PcmSample[] var5 = null;
        PcmSample[] var6 = null;
        PcmSample[] var7 = null;
        PcmSample[] var8 = null;
        PcmSample[] var9 = null;
        PcmSample[] var10 = null;
        PcmSample[] var11 = null;
        PcmSample[] var12 = null;
        PcmSample[] var13 = null;
        PcmSample[] var14 = null;
        PcmSample[] var15 = null;
        PcmSample[] var16 = null;
        PcmSample[] var17 = null;
        PcmSample[] var18 = null;
        PcmSample[] var19 = null;
        PcmSample[] var20 = null;
        PcmSample[] var2Lifetime1;
        PcmSample[] var2Lifetime2;
        PcmSample[] var2Lifetime3;
        PcmSample[] var2Lifetime4;
        PcmSample[] var2Lifetime5;
        PcmSample[] var2Lifetime6;
        PcmSample[] var2Lifetime7;
        PcmSample[] var2Lifetime8;
        PcmSample[] var2Lifetime9;
        PcmSample[] var2Lifetime10;
        PcmSample[] var2Lifetime11;
        PcmSample[] var2Lifetime12;
        PcmSample[] var2Lifetime13;
        PcmSample[] var2Lifetime14;
        PcmSample[] var2Lifetime15;
        PcmSample[] var2Lifetime16;
        PcmSample[] var2Lifetime17;
        try {
          var3 = new PcmSample[6];
          var2 = var3;
          var2[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-89, "large red ball hit1");
          var2[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(29, "large red ball hit2");
          var2[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-126, "large red ball hit3");
          var2[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(64, "large red ball hit4");
          var2[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-117, "large red ball hit5");
          var2[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-119, "large red ball hit6");
          ResetStatsConfirmationOverlay.field_d[1][0] = var3;
          var4 = new PcmSample[5];
          var2Lifetime1 = var4;
          var2Lifetime1[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(66, "medium red hit1");
          var2Lifetime1[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(89, "medium red hit2");
          var2Lifetime1[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(40, "medium red hit3");
          var2Lifetime1[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(73, "medium red hit4");
          var2Lifetime1[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-102, "medium red hit5");
          ResetStatsConfirmationOverlay.field_d[1][1] = var4;
          var5 = new PcmSample[7];
          var2Lifetime2 = var5;
          var2Lifetime2[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(29, "small red ball hit1");
          var2Lifetime2[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-89, "small red ball hit2");
          var2Lifetime2[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-111, "small red ball hit3");
          var2Lifetime2[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-113, "small red ball hit4");
          var2Lifetime2[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(119, "small red ball hit5");
          var2Lifetime2[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(118, "small red ball hit6");
          var2Lifetime2[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-101, "small red ball hit7");
          ResetStatsConfirmationOverlay.field_d[1][2] = var5;
          var6 = new PcmSample[6];
          var2Lifetime3 = var6;
          var2Lifetime3[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(36, "large orange ball hit1");
          var2Lifetime3[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(127, "large orange ball hit2");
          var2Lifetime3[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-108, "large orange ball hit3");
          var2Lifetime3[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(101, "large orange ball hit4");
          var2Lifetime3[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-123, "large orange ball hit5");
          var2Lifetime3[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-126, "large orange ball hit6");
          ResetStatsConfirmationOverlay.field_d[2][0] = var6;
          var7 = new PcmSample[6];
          var2Lifetime4 = var7;
          var2Lifetime4[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(51, "medium orange ball hit1");
          var2Lifetime4[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-120, "medium orange ball hit2");
          var2Lifetime4[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-94, "medium orange ball hit3");
          var2Lifetime4[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-98, "medium orange ball hit4");
          var2Lifetime4[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(69, "medium orange ball hit5");
          var2Lifetime4[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(41, "medium orange ball hit6");
          ResetStatsConfirmationOverlay.field_d[2][1] = var7;
          var8 = new PcmSample[7];
          var2Lifetime5 = var8;
          var2Lifetime5[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(111, "small orange ball hit1");
          var2Lifetime5[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(31, "small orange ball hit2");
          var2Lifetime5[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-120, "small orange ball hit3");
          var2Lifetime5[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-119, "small orange ball hit4");
          var2Lifetime5[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(96, "small orange ball hit5");
          var2Lifetime5[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-124, "small orange ball hit6");
          var2Lifetime5[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-103, "small orange ball hit7");
          ResetStatsConfirmationOverlay.field_d[2][2] = var8;
          var9 = new PcmSample[7];
          var2Lifetime6 = var9;
          var2Lifetime6[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-122, "large blue ball hit1");
          var2Lifetime6[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(109, "large blue ball hit2");
          var2Lifetime6[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-97, "large blue ball hit3");
          var2Lifetime6[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-111, "large blue ball hit4");
          var2Lifetime6[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(87, "large blue ball hit5");
          var2Lifetime6[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(73, "large blue ball hit6");
          var2Lifetime6[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(124, "large blue ball hit7");
          ResetStatsConfirmationOverlay.field_d[5][0] = var9;
          var10 = new PcmSample[6];
          var2Lifetime7 = var10;
          var2Lifetime7[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(95, "medium blue ball hit1");
          var2Lifetime7[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-109, "medium blue ball hit2");
          var2Lifetime7[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(111, "medium blue ball hit3");
          var2Lifetime7[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-124, "medium blue ball hit4");
          var2Lifetime7[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(69, "medium blue ball hit5");
          var2Lifetime7[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-111, "medium blue ball hit6");
          ResetStatsConfirmationOverlay.field_d[5][1] = var10;
          var11 = new PcmSample[7];
          var2Lifetime8 = var11;
          var2Lifetime8[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(90, "small blue ball hit1");
          var2Lifetime8[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-122, "small blue ball hit2");
          var2Lifetime8[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(94, "small blue ball hit3");
          var2Lifetime8[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(27, "small blue ball hit4");
          var2Lifetime8[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-120, "small blue ball hit5");
          var2Lifetime8[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-98, "small blue ball hit6");
          var2Lifetime8[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-97, "small blue ball hit7");
          ResetStatsConfirmationOverlay.field_d[5][2] = var11;
          var12 = new PcmSample[7];
          var2Lifetime9 = var12;
          var2Lifetime9[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-106, "large yellow ball hit1");
          var2Lifetime9[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-126, "large yellow ball hit2");
          var2Lifetime9[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-127, "large yellow ball hit3");
          var2Lifetime9[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(126, "large yellow ball hit4");
          var2Lifetime9[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(78, "large yellow ball hit5");
          var2Lifetime9[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(80, "large yellow ball hit6");
          var2Lifetime9[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-95, "large yellow ball hit7");
          ResetStatsConfirmationOverlay.field_d[3][0] = var12;
          var13 = new PcmSample[6];
          var2Lifetime10 = var13;
          var2Lifetime10[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(86, "medium yellow ball hit1");
          var2Lifetime10[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-118, "medium yellow ball hit2");
          var2Lifetime10[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(81, "medium yellow ball hit3");
          var2Lifetime10[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(89, "medium yellow ball hit4");
          var2Lifetime10[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-121, "medium yellow ball hit5");
          var2Lifetime10[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(91, "medium yellow ball hit6");
          ResetStatsConfirmationOverlay.field_d[3][1] = var13;
          var14 = new PcmSample[6];
          var2Lifetime11 = var14;
          var2Lifetime11[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(44, "small yellow ball hit1");
          var2Lifetime11[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(55, "small yellow ball hit2");
          var2Lifetime11[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-89, "small yellow ball hit3");
          var2Lifetime11[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(98, "small yellow ball hit4");
          var2Lifetime11[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-127, "small yellow ball hit5");
          var2Lifetime11[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(56, "small yellow ball hit6");
          ResetStatsConfirmationOverlay.field_d[3][2] = var14;
          var15 = new PcmSample[7];
          var2Lifetime12 = var15;
          var2Lifetime12[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(63, "large purple ball hit1");
          var2Lifetime12[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-115, "large purple ball hit2");
          var2Lifetime12[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(98, "large purple ball hit3");
          var2Lifetime12[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-98, "large purple ball hit4");
          var2Lifetime12[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(54, "large purple ball hit5");
          var2Lifetime12[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-91, "large purple ball hit6");
          var2Lifetime12[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-111, "large purple ball hit7");
          ResetStatsConfirmationOverlay.field_d[4][0] = var15;
          var16 = new PcmSample[6];
          var2Lifetime13 = var16;
          var2Lifetime13[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-94, "medium purple ball hit1");
          var2Lifetime13[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(102, "medium purple ball hit2");
          var2Lifetime13[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-113, "medium purple ball hit3");
          var2Lifetime13[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(46, "medium purple ball hit4");
          var2Lifetime13[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-91, "medium purple ball hit5");
          var2Lifetime13[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-111, "medium purple ball hit6");
          ResetStatsConfirmationOverlay.field_d[4][1] = var16;
          var17 = new PcmSample[7];
          var2Lifetime14 = var17;
          var2Lifetime14[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-126, "small purple ball hit1");
          var2Lifetime14[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-98, "small purple ball hit2");
          var2Lifetime14[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(66, "small purple ball hit3");
          var2Lifetime14[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-105, "small purple ball hit4");
          var2Lifetime14[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-101, "small purple ball hit5");
          var2Lifetime14[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(98, "small purple ball hit6");
          var2Lifetime14[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-127, "small purple ball hit7");
          ResetStatsConfirmationOverlay.field_d[4][2] = var17;
          var18 = new PcmSample[8];
          var2Lifetime15 = var18;
          var2Lifetime15[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(37, "large explosion1");
          var2Lifetime15[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(113, "large explosion 1_1");
          var2Lifetime15[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-126, "large explosion2");
          var2Lifetime15[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(82, "large explosion2_1");
          var2Lifetime15[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(85, "large explosion3");
          var2Lifetime15[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(121, "large explosion3_1");
          var2Lifetime15[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-95, "large explosion4");
          var2Lifetime15[7] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(92, "large explosion4_1");
          TimedSceneEffect.field_n[0] = var18;
          var19 = new PcmSample[8];
          var2Lifetime16 = var19;
          var2Lifetime16[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(121, "medium explosion1");
          var2Lifetime16[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(83, "medium explosion1_shorter");
          var2Lifetime16[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-96, "medium explosion2");
          var2Lifetime16[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(121, "medium explosion2_shorter");
          var2Lifetime16[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(52, "medium explosion3");
          var2Lifetime16[5] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(111, "medium explosion3_shorter");
          var2Lifetime16[6] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-104, "medium explosion4");
          var2Lifetime16[7] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(118, "medium explosion4_shorter");
          TimedSceneEffect.field_n[1] = var19;
          var20 = new PcmSample[5];
          var2Lifetime17 = var20;
          var2Lifetime17[0] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-89, "small explosion1");
          var2Lifetime17[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(33, "small explosion2");
          var2Lifetime17[2] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-93, "small explosion3");
          var2Lifetime17[3] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(103, "small explosion4");
          var2Lifetime17[4] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-96, "small explosion 5");
          TimedSceneEffect.field_n[2] = var20;
          OpenGlCubeTexture.field_l[31] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(53, "sleepy open1");
          OpenGlCubeTexture.field_l[13] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(106, "pinball bumper v4");
          OpenGlCubeTexture.field_l[1] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(89, "ice slide fin2");
          OpenGlCubeTexture.field_l[10] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-116, "level complete1");
          OpenGlCubeTexture.field_l[14] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-123, "wave start1");
          OpenGlCubeTexture.field_l[16] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-113, "menu select1");
          OpenGlCubeTexture.field_l[15] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(75, "menu back1");
          OpenGlCubeTexture.field_l[22] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(34, "ball armoured hit 1");
          OpenGlCubeTexture.field_l[23] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(67, "ball armoured hit 2");
          OpenGlCubeTexture.field_l[24] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(112, "ball armoured hit 3");
          if (param1 <= 4) {
            field_b = -118;
          }
          OpenGlCubeTexture.field_l[25] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(63, "ball armoured hit 4");
          OpenGlCubeTexture.field_l[26] = LegacyOpenGlPostProcessManager.field_b.getVorbisByName(-120, "ball armoured hit5");
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dw.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final ValidationStatus getStatus(int guard) {
        if (this.isEmpty(-8003)) {
          return LegacyOpenGlGraphicsHeap.EMPTY;
        }
        if (wq.monotonicTimeMillis(-89) >= this.lastChangedAt + 350L) {
          int var2 = -1 % ((guard + 19) / 46);
          return this.evaluateStatus((byte) 114);
        }
        return GameInstructions.DEBOUNCING;
    }

    public final String getMessage(int guard) {
        if (guard != 3690) {
          return (String) null;
        }
        if (this.isEmpty(-8003)) {
          return null;
        }
        if (wq.monotonicTimeMillis(guard - 3706) >= (350L + this.lastChangedAt)) {
          return this.evaluateMessage(-98);
        }
        return null;
    }

    static {
    }
}
