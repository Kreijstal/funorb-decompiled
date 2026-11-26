/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameAssets {
    static MixedSupport014 mixedSupport014State0001;
    static String stringState0501;
    static boolean booleanState0176;
    static String stringState0502;
    static String stringState0503;
    static String stringState0504;
    static PcmStreamMixer pcmStreamMixerState0004;
    static long longState0046;
    static int integerState0747;
    static MixedSupport004 mixedSupport004State0004;

    public static void performAction1493(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (byteArgument1 >= -17) {
            pcmStreamMixerState0004 = (PcmStreamMixer) null;
          }
          mixedSupport004State0004 = null;
          stringState0501 = null;
          stringState0504 = null;
          stringState0503 = null;
          pcmStreamMixerState0004 = null;
          stringState0502 = null;
          mixedSupport014State0001 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "sh.C(" + byteArgument1 + ')');
        }
    }

    final static void performAction1494(int integerArgument1) {
        try {
          MixedSupport066.stringState0295 = null;
          MixedSupport145.booleanState0222 = false;
          UiComponentPart022.integerState0573 = -1;
          ClientException.integerState0142 = -1;
          EmailValidationError.integerState0341 = integerArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "sh.D(" + integerArgument1 + ')');
        }
    }

    final static void performAction1497(byte[] byteArrayArgument1, int integerArgument2, int integerArgument3, int[] integerArrayArgument4, int integerArgument5) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        byte cachedByteLocal3 = 0;
        int cachedIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        int integerLocal12 = 0;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal12 = 0;
          scanLoop1: while (true) {
            if (integerLocal12 < MixedSupport001.integerArrayState0001.length) {
              integerArgument3 = MixedSupport001.integerArrayState0001[integerLocal12];
              stackIntegerLocal5 = integerLocal12 << 4;
              if (integerLocal15 != 0) {
                break scanLoop1;
              }
              integerLocal14 = stackIntegerLocal5;
              while (true) {
                previousIntegerLocal1 = integerArgument3;
                integerArgument3--;
                if (0 != previousIntegerLocal1) {
                  previousIntegerLocal2 = integerLocal14;
                  integerLocal14++;
                  integerArgument5 = SceneWidgetPart004.integerArrayState0053[previousIntegerLocal2];
                  cachedByteLocal3 = byteArrayArgument1[integerArgument5];
                  cachedIntegerLocal4 = integerArrayArgument4[cachedByteLocal3];
                  integerArrayArgument4[cachedByteLocal3] = cachedIntegerLocal4 + 1;
                  SceneWidgetPart004.integerArrayState0053[cachedIntegerLocal4] = integerArgument5;
                  continue;
                }
                break;
              }
              integerLocal12++;
              continue scanLoop1;
            }
            stackIntegerLocal5 = integerArgument2;
            break;
          }
          if (stackIntegerLocal5 != -25724) {
            GameAssets.performAction1494(-65);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal11 = caughtParameterLocal16;
          runtimeExceptionLocal13 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal13;
          stackStringBuilderLocal7 = new StringBuilder().append("sh.E(");
          if (byteArrayArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (integerArrayArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static void performAction1495(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, RgbSprite rgbSpriteArgument8, int integerArgument9) {
        RuntimeException runtimeException = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        int integerLocal9;
        int integerLocal10;
        try {
          integerLocal2 = integerArgument4 + (rgbSpriteArgument8.integerState0259 + integerArgument7 - integerArgument1);
          integerLocal3 = integerArgument5 + (integerArgument4 + rgbSpriteArgument8.integerState0259) + integerArgument7;
          if (integerArgument3 != 25547) {
            GameAssets.performAction1497((byte[]) null, 13, 74, (int[]) null, -77);
          }
          integerLocal4 = integerArgument9 + rgbSpriteArgument8.integerState0256 + (rgbSpriteArgument8.integerState0255 >> 1);
          SoftwareRaster.intersectClip(integerLocal2, 0, integerLocal3, integerLocal4 + integerArgument6);
          rgbSpriteArgument8.performAction0295(-1 + integerArgument4, integerArgument9 - 1, integerArgument2);
          rgbSpriteArgument8.performAction0295(integerArgument4 - 1, integerArgument9 + 1, integerArgument2);
          SoftwareRaster.restoreClip(UiComponentPart013.integerArrayState0055);
          SoftwareRaster.intersectClip(integerLocal2 + 1, 0, integerLocal3 + 1, integerArgument6 + integerLocal4);
          rgbSpriteArgument8.performAction0295(integerArgument4 + 1, -1 + integerArgument9, integerArgument2);
          rgbSpriteArgument8.performAction0295(1 + integerArgument4, integerArgument9 + 1, integerArgument2);
          SoftwareRaster.restoreClip(UiComponentPart013.integerArrayState0055);
          integerLocal10 = -integerArgument1 - integerArgument7 + integerArgument4 + rgbSpriteArgument8.integerState0259 + rgbSpriteArgument8.integerState0258;
          integerLocal9 = -integerArgument5 + (-integerArgument7 + rgbSpriteArgument8.integerState0258 + rgbSpriteArgument8.integerState0259) + integerArgument4;
          SoftwareRaster.intersectClip(integerLocal9, -integerArgument6 + integerLocal4, integerLocal10, 480);
          rgbSpriteArgument8.performAction0295(integerArgument4 - 1, -1 + integerArgument9, integerArgument2);
          rgbSpriteArgument8.performAction0295(integerArgument4 - 1, 1 + integerArgument9, integerArgument2);
          SoftwareRaster.restoreClip(UiComponentPart013.integerArrayState0055);
          SoftwareRaster.intersectClip(1 + integerLocal9, integerLocal4 - integerArgument6, integerLocal10 + 1, 480);
          rgbSpriteArgument8.performAction0295(1 + integerArgument4, -1 + integerArgument9, integerArgument2);
          rgbSpriteArgument8.performAction0295(integerArgument4 + 1, integerArgument9 + 1, integerArgument2);
          SoftwareRaster.restoreClip(UiComponentPart013.integerArrayState0055);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal8 = caughtParameterLocal11;
          runtimeException = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeException;
          stackStringBuilderLocal6 = new StringBuilder().append("sh.A(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (rgbSpriteArgument8 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument9).append(')').toString());
        }
    }

    final static void performAction1496(boolean booleanArgument1, ResourceArchive resourceArchiveArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        byte[] byteArrayLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        byte[] byteArrayLocal7;
        byte[] byteArrayLocal8;
        byte[] byteArrayLocal9;
        byte[] byteArrayLocal10;
        byte[] byteArrayLocal11;
        byte[] byteArrayLocal12;
        byte[] byteArrayLocal13;
        byte[] byteArrayLocal14;
        byte[] byteArrayLocal15;
        byte[] byteArrayLocal16;
        byte[] byteArrayLocal17;
        byte[] byteArrayLocal18;
        byte[] byteArrayLocal19;
        byte[] byteArrayLocal20;
        byte[] byteArrayLocal21;
        byte[] byteArrayLocal22;
        byte[] byteArrayLocal23;
        byte[] byteArrayLocal24;
        byte[] byteArrayLocal25;
        byte[] byteArrayLocal26;
        byte[] byteArrayLocal27;
        byte[] byteArrayLocal28;
        byte[] byteArrayLocal29;
        byte[] byteArrayLocal30;
        byte[] byteArrayLocal31;
        byte[] byteArrayLocal32;
        byte[] byteArrayLocal33;
        byte[] byteArrayLocal34;
        byte[] byteArrayLocal35;
        byte[] byteArrayLocal36;
        byte[] byteArrayLocal37;
        byte[] byteArrayLocal38;
        byte[] byteArrayLocal39;
        byte[] byteArrayLocal40;
        byte[] byteArrayLocal41;
        byte[] byteArrayLocal42;
        byte[] byteArrayLocal43;
        byte[] byteArrayLocal44;
        byte[] byteArrayLocal45;
        byte[] byteArrayLocal46;
        byte[] byteArrayLocal47;
        byte[] byteArrayLocal48;
        byte[] byteArrayLocal49;
        byte[] byteArrayLocal50;
        byte[] byteArrayLocal51;
        byte[] byteArrayLocal52;
        byte[] byteArrayLocal53;
        byte[] byteArrayLocal54;
        byte[] byteArrayLocal55;
        byte[] byteArrayLocal56;
        byte[] byteArrayLocal57;
        byte[] byteArrayLocal58;
        byte[] byteArrayLocal59;
        byte[] byteArrayLocal60;
        byte[] byteArrayLocal61;
        byte[] byteArrayLocal62;
        byte[] byteArrayLocal63;
        byte[] byteArrayLocal64;
        byte[] byteArrayLocal65;
        byte[] byteArrayLocal66;
        byte[] byteArrayLocal67;
        byte[] byteArrayLocal68;
        byte[] byteArrayLocal69;
        byte[] byteArrayLocal70;
        byte[] byteArrayLocal71;
        byte[] byteArrayLocal72;
        byte[] byteArrayLocal73;
        byte[] byteArrayLocal74;
        byte[] byteArrayLocal75;
        byte[] byteArrayLocal76;
        byte[] byteArrayLocal77;
        byte[] byteArrayLocal78;
        byte[] byteArrayLocal79;
        byte[] byteArrayLocal80;
        byte[] byteArrayLocal81;
        byte[] byteArrayLocal82;
        byte[] byteArrayLocal83;
        byte[] byteArrayLocal84;
        byte[] byteArrayLocal85;
        byte[] byteArrayLocal86;
        byte[] byteArrayLocal87;
        byte[] byteArrayLocal88;
        byte[] byteArrayLocal89;
        byte[] byteArrayLocal90;
        byte[] byteArrayLocal91;
        byte[] byteArrayLocal92;
        byte[] byteArrayLocal93;
        byte[] byteArrayLocal94;
        byte[] byteArrayLocal95;
        byte[] byteArrayLocal96;
        byte[] byteArrayLocal97;
        byte[] byteArrayLocal98;
        byte[] byteArrayLocal99;
        byte[] byteArrayLocal100;
        byte[] byteArrayLocal101;
        byte[] byteArrayLocal102;
        byte[] byteArrayLocal103;
        byte[] byteArrayLocal104;
        byte[] byteArrayLocal105;
        byte[] byteArrayLocal106;
        byte[] byteArrayLocal107;
        byte[] byteArrayLocal108;
        byte[] byteArrayLocal109;
        byte[] byteArrayLocal110;
        byte[] byteArrayLocal111;
        byte[] byteArrayLocal112;
        byte[] byteArrayLocal113;
        byte[] byteArrayLocal114;
        byte[] byteArrayLocal115;
        byte[] byteArrayLocal116;
        byte[] byteArrayLocal117;
        byte[] byteArrayLocal118;
        byte[] byteArrayLocal119;
        byte[] byteArrayLocal120;
        byte[] byteArrayLocal121;
        byte[] byteArrayLocal122;
        byte[] byteArrayLocal123;
        byte[] byteArrayLocal124;
        byte[] byteArrayLocal125;
        byte[] byteArrayLocal126;
        byte[] byteArrayLocal127;
        byte[] byteArrayLocal128;
        byte[] byteArrayLocal129;
        byte[] byteArrayLocal130;
        byte[] byteArrayLocal131;
        byte[] byteArrayLocal132;
        byte[] byteArrayLocal133;
        byte[] byteArrayLocal134;
        byte[] byteArrayLocal135;
        byte[] byteArrayLocal136;
        byte[] byteArrayLocal137;
        byte[] byteArrayLocal138;
        byte[] byteArrayLocal139;
        byte[] byteArrayLocal140;
        byte[] byteArrayLocal141;
        byte[] byteArrayLocal142;
        byte[] byteArrayLocal143;
        byte[] byteArrayLocal144;
        byte[] byteArrayLocal145;
        byte[] byteArrayLocal146;
        byte[] byteArrayLocal147;
        byte[] byteArrayLocal148;
        byte[] byteArrayLocal149;
        byte[] byteArrayLocal150;
        byte[] byteArrayLocal151;
        byte[] byteArrayLocal152;
        byte[] byteArrayLocal153;
        byte[] byteArrayLocal154;
        byte[] byteArrayLocal155;
        byte[] byteArrayLocal156;
        byte[] byteArrayLocal157;
        byte[] byteArrayLocal158;
        byte[] byteArrayLocal159;
        byte[] byteArrayLocal160;
        byte[] byteArrayLocal161;
        byte[] byteArrayLocal162;
        byte[] byteArrayLocal163;
        byte[] byteArrayLocal164;
        byte[] byteArrayLocal165;
        byte[] byteArrayLocal166;
        byte[] byteArrayLocal167;
        byte[] byteArrayLocal168;
        byte[] byteArrayLocal169;
        byte[] byteArrayLocal170;
        byte[] byteArrayLocal171;
        byte[] byteArrayLocal172;
        byte[] byteArrayLocal173;
        byte[] byteArrayLocal174;
        byte[] byteArrayLocal175;
        byte[] byteArrayLocal176;
        byte[] byteArrayLocal177;
        byte[] byteArrayLocal178;
        byte[] byteArrayLocal179;
        byte[] byteArrayLocal180;
        byte[] byteArrayLocal181;
        byte[] byteArrayLocal182;
        byte[] byteArrayLocal183;
        byte[] byteArrayLocal184;
        byte[] byteArrayLocal185;
        byte[] byteArrayLocal186;
        byte[] byteArrayLocal187;
        byte[] byteArrayLocal188;
        byte[] byteArrayLocal189;
        byte[] byteArrayLocal190;
        byte[] byteArrayLocal191;
        byte[] byteArrayLocal192;
        byte[] byteArrayLocal193;
        byte[] byteArrayLocal194;
        byte[] byteArrayLocal195;
        byte[] byteArrayLocal196;
        byte[] byteArrayLocal197;
        byte[] byteArrayLocal198;
        byte[] byteArrayLocal199;
        byte[] byteArrayLocal200;
        byte[] byteArrayLocal201;
        byte[] byteArrayLocal202;
        byte[] byteArrayLocal203;
        byte[] byteArrayLocal204;
        byte[] byteArrayLocal205;
        byte[] byteArrayLocal206;
        byte[] byteArrayLocal207;
        byte[] byteArrayLocal208;
        byte[] byteArrayLocal209;
        byte[] byteArrayLocal210;
        byte[] byteArrayLocal211;
        byte[] byteArrayLocal212;
        byte[] byteArrayLocal213;
        byte[] byteArrayLocal214;
        byte[] byteArrayLocal215;
        byte[] byteArrayLocal216;
        byte[] byteArrayLocal217;
        byte[] byteArrayLocal218;
        byte[] byteArrayLocal219;
        byte[] byteArrayLocal220;
        byte[] byteArrayLocal221;
        byte[] byteArrayLocal222;
        byte[] byteArrayLocal223;
        byte[] byteArrayLocal224;
        byte[] byteArrayLocal225;
        byte[] byteArrayLocal226;
        byte[] byteArrayLocal227;
        byte[] byteArrayLocal228;
        byte[] byteArrayLocal229;
        byte[] byteArrayLocal230;
        byte[] byteArrayLocal231;
        byte[] byteArrayLocal232;
        byte[] byteArrayLocal233;
        byte[] byteArrayLocal234;
        byte[] byteArrayLocal235;
        byte[] byteArrayLocal236;
        byte[] byteArrayLocal237;
        byte[] byteArrayLocal238;
        byte[] byteArrayLocal239;
        byte[] byteArrayLocal240;
        byte[] byteArrayLocal241;
        byte[] byteArrayLocal242;
        byte[] byteArrayLocal243;
        byte[] byteArrayLocal244;
        byte[] byteArrayLocal245;
        byte[] byteArrayLocal246;
        byte[] byteArrayLocal247;
        byte[] byteArrayLocal248;
        byte[] byteArrayLocal249;
        byte[] byteArrayLocal250;
        byte[] byteArrayLocal251;
        byte[] byteArrayLocal252;
        byte[] byteArrayLocal253;
        byte[] byteArrayLocal254;
        byte[] byteArrayLocal255;
        byte[] byteArrayLocal256;
        byte[] byteArrayLocal257;
        byte[] byteArrayLocal258;
        byte[] byteArrayLocal259;
        byte[] byteArrayLocal260;
        byte[] byteArrayLocal261;
        byte[] byteArrayLocal262;
        byte[] byteArrayLocal263;
        byte[] byteArrayLocal264;
        byte[] byteArrayLocal265;
        byte[] byteArrayLocal266;
        try {
          MixedSupport096.resourceArchiveState0014 = resourceArchiveArgument2;
          byteArrayLocal5 = MixedSupport067.computeByteArray0840(-24, "gamename");
          if (byteArrayLocal5 != null) {
            UiComponentPart023.stringState0425 = MixedSupport105.computeString1370(byteArrayLocal5, 2);
          }
          byteArrayLocal7 = MixedSupport067.computeByteArray0840(-18, "benefits,0");
          if (null != byteArrayLocal7) {
            MixedSupport003.stringArrayState0001[0] = MixedSupport105.computeString1370(byteArrayLocal7, 2);
          }
          byteArrayLocal8 = MixedSupport067.computeByteArray0840(-116, "benefits,1");
          if (null != byteArrayLocal8) {
            MixedSupport003.stringArrayState0001[1] = MixedSupport105.computeString1370(byteArrayLocal8, 2);
          }
          byteArrayLocal9 = MixedSupport067.computeByteArray0840(-72, "benefits,2");
          if (null != byteArrayLocal9) {
            MixedSupport003.stringArrayState0001[2] = MixedSupport105.computeString1370(byteArrayLocal9, 2);
          }
          byteArrayLocal10 = MixedSupport067.computeByteArray0840(-52, "benefits,3");
          if (byteArrayLocal10 != null) {
            MixedSupport003.stringArrayState0001[3] = MixedSupport105.computeString1370(byteArrayLocal10, 2);
          }
          byteArrayLocal11 = MixedSupport067.computeByteArray0840(-30, "benefits,4");
          if (byteArrayLocal11 != null) {
            MixedSupport003.stringArrayState0001[4] = MixedSupport105.computeString1370(byteArrayLocal11, 2);
          }
          byteArrayLocal12 = MixedSupport067.computeByteArray0840(-29, "benefits,5");
          if (null != byteArrayLocal12) {
            MixedSupport003.stringArrayState0001[5] = MixedSupport105.computeString1370(byteArrayLocal12, 2);
          }
          byteArrayLocal13 = MixedSupport067.computeByteArray0840(-58, "waitingfor_backgrounds");
          if (null != byteArrayLocal13) {
            MixedSupport103.stringState0436 = MixedSupport105.computeString1370(byteArrayLocal13, 2);
          }
          byteArrayLocal14 = MixedSupport067.computeByteArray0840(-68, "loading_backgrounds");
          if (null != byteArrayLocal14) {
            MixedSupport045.stringState0192 = MixedSupport105.computeString1370(byteArrayLocal14, 2);
          }
          byteArrayLocal15 = MixedSupport067.computeByteArray0840(-75, "mp_x_players_wanttodraw");
          if (byteArrayLocal15 != null) {
            SocketFactory.stringState0613 = MixedSupport105.computeString1370(byteArrayLocal15, 2);
          }
          byteArrayLocal16 = MixedSupport067.computeByteArray0840(-77, "press_esc_to_accept");
          if (byteArrayLocal16 != null) {
            RenderingSupport002.stringState0086 = MixedSupport105.computeString1370(byteArrayLocal16, 2);
          }
          byteArrayLocal17 = MixedSupport067.computeByteArray0840(-112, "keycode_rotateleft");
          if (null != byteArrayLocal17) {
            NetworkSupport008.integerState0558 = byteArrayLocal17[0] & 255;
          }
          byteArrayLocal18 = MixedSupport067.computeByteArray0840(-90, "keycode_rotateright");
          if (null != byteArrayLocal18) {
            MixedSupport132.integerState0821 = byteArrayLocal18[0] & 255;
          }
          byteArrayLocal19 = MixedSupport067.computeByteArray0840(-76, "rated_membersonly");
          if (byteArrayLocal19 != null) {
            MixedSupport130.stringState0562 = MixedSupport105.computeString1370(byteArrayLocal19, 2);
          }
          byteArrayLocal20 = MixedSupport067.computeByteArray0840(-97, "staminamode");
          if (null != byteArrayLocal20) {
            NetworkSupport004.stringState0209 = MixedSupport105.computeString1370(byteArrayLocal20, 2);
          }
          byteArrayLocal21 = MixedSupport067.computeByteArray0840(-63, "masterchallenge");
          if (byteArrayLocal21 != null) {
            UiComponentPart002.stringState0037 = MixedSupport105.computeString1370(byteArrayLocal21, 2);
          }
          byteArrayLocal22 = MixedSupport067.computeByteArray0840(-54, "challenge_highscores");
          if (null != byteArrayLocal22) {
            MixedSupport131.stringState0567 = MixedSupport105.computeString1370(byteArrayLocal22, 2);
          }
          byteArrayLocal23 = MixedSupport067.computeByteArray0840(-103, "stamina_highscores");
          if (null != byteArrayLocal23) {
            MixedSupport006.stringState0028 = MixedSupport105.computeString1370(byteArrayLocal23, 2);
          }
          byteArrayLocal24 = MixedSupport067.computeByteArray0840(-125, "multiplayer_rankings");
          if (null != byteArrayLocal24) {
            MixedSupport124.stringState0542 = MixedSupport105.computeString1370(byteArrayLocal24, 2);
          }
          byteArrayLocal25 = MixedSupport067.computeByteArray0840(-113, "player");
          if (null != byteArrayLocal25) {
            MixedSupport126.stringState0550 = MixedSupport105.computeString1370(byteArrayLocal25, 2);
          }
          byteArrayLocal26 = MixedSupport067.computeByteArray0840(-106, "status");
          if (null != byteArrayLocal26) {
            UiComponentPart031.stringState0529 = MixedSupport105.computeString1370(byteArrayLocal26, 2);
          }
          byteArrayLocal27 = MixedSupport067.computeByteArray0840(-46, "position");
          if (byteArrayLocal27 != null) {
            MixedSupport095.stringState0399 = MixedSupport105.computeString1370(byteArrayLocal27, 2);
          }
          byteArrayLocal28 = MixedSupport067.computeByteArray0840(-126, "winner");
          if (null != byteArrayLocal28) {
            ReturnedShapeCache.stringState0385 = MixedSupport105.computeString1370(byteArrayLocal28, 2);
          }
          byteArrayLocal29 = MixedSupport067.computeByteArray0840(-111, "drawn");
          if (byteArrayLocal29 != null) {
            ReturnedShapeCache.stringState0386 = MixedSupport105.computeString1370(byteArrayLocal29, 2);
          }
          byteArrayLocal30 = MixedSupport067.computeByteArray0840(-78, "playing");
          if (null != byteArrayLocal30) {
            MixedSupport031.stringState0151 = MixedSupport105.computeString1370(byteArrayLocal30, 2);
          }
          byteArrayLocal31 = MixedSupport067.computeByteArray0840(-116, "resigned");
          if (null != byteArrayLocal31) {
            MixedSupport134.stringState0578 = MixedSupport105.computeString1370(byteArrayLocal31, 2);
          }
          byteArrayLocal32 = MixedSupport067.computeByteArray0840(-119, "left");
          if (null != byteArrayLocal32) {
            PcmPlayerService.stringState0466 = MixedSupport105.computeString1370(byteArrayLocal32, 2);
          }
          byteArrayLocal33 = MixedSupport067.computeByteArray0840(-108, "defeated");
          if (byteArrayLocal33 != null) {
            PacketBuffer.stringState0631 = MixedSupport105.computeString1370(byteArrayLocal33, 2);
          }
          byteArrayLocal34 = MixedSupport067.computeByteArray0840(-58, "rematch_request");
          if (byteArrayLocal34 != null) {
            SocketFactory.stringState0612 = MixedSupport105.computeString1370(byteArrayLocal34, 2);
          }
          byteArrayLocal35 = MixedSupport067.computeByteArray0840(-95, "draw_request");
          if (byteArrayLocal35 != null) {
            MixedSupport116.stringState0513 = MixedSupport105.computeString1370(byteArrayLocal35, 2);
          }
          byteArrayLocal36 = MixedSupport067.computeByteArray0840(-21, "ready");
          if (null != byteArrayLocal36) {
            MixedSupport126.stringState0551 = MixedSupport105.computeString1370(byteArrayLocal36, 2);
          }
          byteArrayLocal37 = MixedSupport067.computeByteArray0840(-82, "steady");
          if (null != byteArrayLocal37) {
            MusicTrack.stringState0560 = MixedSupport105.computeString1370(byteArrayLocal37, 2);
          }
          byteArrayLocal38 = MixedSupport067.computeByteArray0840(-80, "total");
          if (byteArrayLocal38 != null) {
            KeyboardInputHandler.stringState0357 = MixedSupport105.computeString1370(byteArrayLocal38, 2);
          }
          byteArrayLocal39 = MixedSupport067.computeByteArray0840(-31, "settling_score");
          if (byteArrayLocal39 != null) {
            MixedSupport122.stringState0530 = MixedSupport105.computeString1370(byteArrayLocal39, 2);
          }
          byteArrayLocal40 = MixedSupport067.computeByteArray0840(-44, "matching_score");
          if (byteArrayLocal40 != null) {
            UiComponentPart030.stringState0519 = MixedSupport105.computeString1370(byteArrayLocal40, 2);
          }
          if (booleanArgument1) {
            return;
          }
          byteArrayLocal41 = MixedSupport067.computeByteArray0840(-42, "eliminate_score");
          if (null != byteArrayLocal41) {
            EmailFormatValidator.stringState0256 = MixedSupport105.computeString1370(byteArrayLocal41, 2);
          }
          byteArrayLocal42 = MixedSupport067.computeByteArray0840(-51, "simultaneous_bonus");
          if (null != byteArrayLocal42) {
            EmailValidationError.stringState0272 = MixedSupport105.computeString1370(byteArrayLocal42, 2);
          }
          byteArrayLocal43 = MixedSupport067.computeByteArray0840(-117, "chain_bonus");
          if (byteArrayLocal43 != null) {
            TextFieldValidator.stringState0635 = MixedSupport105.computeString1370(byteArrayLocal43, 2);
          }
          byteArrayLocal44 = MixedSupport067.computeByteArray0840(-105, "special_item_bonus");
          if (byteArrayLocal44 != null) {
            MixedSupport094.stringState0397 = MixedSupport105.computeString1370(byteArrayLocal44, 2);
          }
          byteArrayLocal45 = MixedSupport067.computeByteArray0840(-23, "fast_drop_bonus");
          if (null != byteArrayLocal45) {
            UiComponentPart025.stringState0449 = MixedSupport105.computeString1370(byteArrayLocal45, 2);
          }
          byteArrayLocal46 = MixedSupport067.computeByteArray0840(-21, "press_space_or_enter");
          if (byteArrayLocal46 != null) {
            MixedSupport006.stringState0029 = MixedSupport105.computeString1370(byteArrayLocal46, 2);
          }
          byteArrayLocal47 = MixedSupport067.computeByteArray0840(-102, "shape_feedback");
          if (null != byteArrayLocal47) {
            Framebuffer.stringState0154 = MixedSupport105.computeString1370(byteArrayLocal47, 2);
          }
          byteArrayLocal48 = MixedSupport067.computeByteArray0840(-126, "colours_in_play");
          if (null != byteArrayLocal48) {
            stringState0503 = MixedSupport105.computeString1370(byteArrayLocal48, 2);
          }
          byteArrayLocal49 = MixedSupport067.computeByteArray0840(-17, "specials_enabled");
          if (byteArrayLocal49 != null) {
            UiComponentPart018.stringState0344 = MixedSupport105.computeString1370(byteArrayLocal49, 2);
          }
          byteArrayLocal50 = MixedSupport067.computeByteArray0840(-86, "stage_colon");
          if (null != byteArrayLocal50) {
            MixedSupport103.stringState0437 = MixedSupport105.computeString1370(byteArrayLocal50, 2);
          }
          byteArrayLocal51 = MixedSupport067.computeByteArray0840(-127, "theme_colon");
          if (byteArrayLocal51 != null) {
            MatchingFieldValidator.stringState0469 = MixedSupport105.computeString1370(byteArrayLocal51, 2);
          }
          byteArrayLocal52 = MixedSupport067.computeByteArray0840(-29, "theme_x_strategy");
          if (null != byteArrayLocal52) {
            DekoBlokoClient.stringState0095 = MixedSupport105.computeString1370(byteArrayLocal52, 2);
          }
          byteArrayLocal53 = MixedSupport067.computeByteArray0840(-65, "hs_theme");
          if (byteArrayLocal53 != null) {
            MixedSupport001.stringState0002 = MixedSupport105.computeString1370(byteArrayLocal53, 2);
          }
          byteArrayLocal54 = MixedSupport067.computeByteArray0840(-33, "fruit");
          if (null != byteArrayLocal54) {
            MixedSupport137.stringState0588 = MixedSupport105.computeString1370(byteArrayLocal54, 2);
          }
          byteArrayLocal55 = MixedSupport067.computeByteArray0840(-90, "animals");
          if (null != byteArrayLocal55) {
            UiComponentPart030.stringState0520 = MixedSupport105.computeString1370(byteArrayLocal55, 2);
          }
          byteArrayLocal56 = MixedSupport067.computeByteArray0840(-80, "breakfast");
          if (null != byteArrayLocal56) {
            MixedSupport124.stringState0545 = MixedSupport105.computeString1370(byteArrayLocal56, 2);
          }
          byteArrayLocal57 = MixedSupport067.computeByteArray0840(-111, "bugs");
          if (byteArrayLocal57 != null) {
            MixedSupport071.stringState0317 = MixedSupport105.computeString1370(byteArrayLocal57, 2);
          }
          byteArrayLocal58 = MixedSupport067.computeByteArray0840(-24, "flowers");
          if (byteArrayLocal58 != null) {
            MixedSupport026.stringState0128 = MixedSupport105.computeString1370(byteArrayLocal58, 2);
          }
          byteArrayLocal59 = MixedSupport067.computeByteArray0840(-16, "undersea");
          if (byteArrayLocal59 != null) {
            RichTextLayout.stringState0135 = MixedSupport105.computeString1370(byteArrayLocal59, 2);
          }
          byteArrayLocal60 = MixedSupport067.computeByteArray0840(-21, "city");
          if (byteArrayLocal60 != null) {
            MixedSupport073.stringState0321 = MixedSupport105.computeString1370(byteArrayLocal60, 2);
          }
          byteArrayLocal61 = MixedSupport067.computeByteArray0840(-47, "eightbit");
          if (byteArrayLocal61 != null) {
            UiComponentPart022.stringState0401 = MixedSupport105.computeString1370(byteArrayLocal61, 2);
          }
          byteArrayLocal62 = MixedSupport067.computeByteArray0840(-29, "hs_stage");
          if (null != byteArrayLocal62) {
            MixedSupport086.stringState0362 = MixedSupport105.computeString1370(byteArrayLocal62, 2);
          }
          byteArrayLocal63 = MixedSupport067.computeByteArray0840(-38, "stage_x");
          if (byteArrayLocal63 != null) {
            UiComponentPart009.stringState0126 = MixedSupport105.computeString1370(byteArrayLocal63, 2);
          }
          byteArrayLocal64 = MixedSupport067.computeByteArray0840(-125, "number_colon_name");
          if (null != byteArrayLocal64) {
            UiComponentPart015.stringState0252 = MixedSupport105.computeString1370(byteArrayLocal64, 2);
          }
          byteArrayLocal65 = MixedSupport067.computeByteArray0840(-61, "number_colon");
          if (byteArrayLocal65 != null) {
            MixedSupport070.stringState0315 = MixedSupport105.computeString1370(byteArrayLocal65, 2);
          }
          byteArrayLocal66 = MixedSupport067.computeByteArray0840(-115, "unlock_masterchallenge_free");
          if (byteArrayLocal66 != null) {
            MixedSupport105.computeString1370(byteArrayLocal66, 2);
          }
          byteArrayLocal67 = MixedSupport067.computeByteArray0840(-18, "unlock_masterchallenge_members");
          if (null != byteArrayLocal67) {
            MixedSupport109.stringState0478 = MixedSupport105.computeString1370(byteArrayLocal67, 2);
          }
          byteArrayLocal68 = MixedSupport067.computeByteArray0840(-21, "achievement_names,0");
          if (byteArrayLocal68 != null) {
            BufferedSocket.stringArrayState0035[0] = MixedSupport105.computeString1370(byteArrayLocal68, 2);
          }
          byteArrayLocal69 = MixedSupport067.computeByteArray0840(-30, "achievement_names,1");
          if (byteArrayLocal69 != null) {
            BufferedSocket.stringArrayState0035[1] = MixedSupport105.computeString1370(byteArrayLocal69, 2);
          }
          byteArrayLocal70 = MixedSupport067.computeByteArray0840(-34, "achievement_names,2");
          if (null != byteArrayLocal70) {
            BufferedSocket.stringArrayState0035[2] = MixedSupport105.computeString1370(byteArrayLocal70, 2);
          }
          byteArrayLocal71 = MixedSupport067.computeByteArray0840(-59, "achievement_names,3");
          if (null != byteArrayLocal71) {
            BufferedSocket.stringArrayState0035[3] = MixedSupport105.computeString1370(byteArrayLocal71, 2);
          }
          byteArrayLocal72 = MixedSupport067.computeByteArray0840(-39, "achievement_names,4");
          if (byteArrayLocal72 != null) {
            BufferedSocket.stringArrayState0035[4] = MixedSupport105.computeString1370(byteArrayLocal72, 2);
          }
          byteArrayLocal73 = MixedSupport067.computeByteArray0840(-123, "achievement_names,5");
          if (byteArrayLocal73 != null) {
            BufferedSocket.stringArrayState0035[5] = MixedSupport105.computeString1370(byteArrayLocal73, 2);
          }
          byteArrayLocal74 = MixedSupport067.computeByteArray0840(-105, "achievement_names,6");
          if (null != byteArrayLocal74) {
            BufferedSocket.stringArrayState0035[6] = MixedSupport105.computeString1370(byteArrayLocal74, 2);
          }
          byteArrayLocal75 = MixedSupport067.computeByteArray0840(-119, "achievement_names,7");
          if (null != byteArrayLocal75) {
            BufferedSocket.stringArrayState0035[7] = MixedSupport105.computeString1370(byteArrayLocal75, 2);
          }
          byteArrayLocal76 = MixedSupport067.computeByteArray0840(-68, "achievement_names,8");
          if (byteArrayLocal76 != null) {
            BufferedSocket.stringArrayState0035[8] = MixedSupport105.computeString1370(byteArrayLocal76, 2);
          }
          byteArrayLocal77 = MixedSupport067.computeByteArray0840(-51, "achievement_names,9");
          if (byteArrayLocal77 != null) {
            BufferedSocket.stringArrayState0035[9] = MixedSupport105.computeString1370(byteArrayLocal77, 2);
          }
          byteArrayLocal78 = MixedSupport067.computeByteArray0840(-18, "achievement_names,10");
          if (byteArrayLocal78 != null) {
            BufferedSocket.stringArrayState0035[10] = MixedSupport105.computeString1370(byteArrayLocal78, 2);
          }
          byteArrayLocal79 = MixedSupport067.computeByteArray0840(-25, "achievement_names,11");
          if (null != byteArrayLocal79) {
            BufferedSocket.stringArrayState0035[11] = MixedSupport105.computeString1370(byteArrayLocal79, 2);
          }
          byteArrayLocal80 = MixedSupport067.computeByteArray0840(-60, "achievement_names,12");
          if (null != byteArrayLocal80) {
            BufferedSocket.stringArrayState0035[12] = MixedSupport105.computeString1370(byteArrayLocal80, 2);
          }
          byteArrayLocal81 = MixedSupport067.computeByteArray0840(-105, "achievement_names,13");
          if (null != byteArrayLocal81) {
            BufferedSocket.stringArrayState0035[13] = MixedSupport105.computeString1370(byteArrayLocal81, 2);
          }
          byteArrayLocal82 = MixedSupport067.computeByteArray0840(-21, "achievement_names,14");
          if (byteArrayLocal82 != null) {
            BufferedSocket.stringArrayState0035[14] = MixedSupport105.computeString1370(byteArrayLocal82, 2);
          }
          byteArrayLocal83 = MixedSupport067.computeByteArray0840(-119, "achievement_names,15");
          if (null != byteArrayLocal83) {
            BufferedSocket.stringArrayState0035[15] = MixedSupport105.computeString1370(byteArrayLocal83, 2);
          }
          byteArrayLocal84 = MixedSupport067.computeByteArray0840(-26, "achievement_names,16");
          if (null != byteArrayLocal84) {
            BufferedSocket.stringArrayState0035[16] = MixedSupport105.computeString1370(byteArrayLocal84, 2);
          }
          byteArrayLocal85 = MixedSupport067.computeByteArray0840(-110, "achievement_names,17");
          if (byteArrayLocal85 != null) {
            BufferedSocket.stringArrayState0035[17] = MixedSupport105.computeString1370(byteArrayLocal85, 2);
          }
          byteArrayLocal86 = MixedSupport067.computeByteArray0840(-91, "achievement_names,18");
          if (byteArrayLocal86 != null) {
            BufferedSocket.stringArrayState0035[18] = MixedSupport105.computeString1370(byteArrayLocal86, 2);
          }
          byteArrayLocal87 = MixedSupport067.computeByteArray0840(-30, "achievement_names,19");
          if (null != byteArrayLocal87) {
            BufferedSocket.stringArrayState0035[19] = MixedSupport105.computeString1370(byteArrayLocal87, 2);
          }
          byteArrayLocal88 = MixedSupport067.computeByteArray0840(-49, "achievement_names,20");
          if (byteArrayLocal88 != null) {
            BufferedSocket.stringArrayState0035[20] = MixedSupport105.computeString1370(byteArrayLocal88, 2);
          }
          byteArrayLocal89 = MixedSupport067.computeByteArray0840(-79, "achievement_names,21");
          if (null != byteArrayLocal89) {
            BufferedSocket.stringArrayState0035[21] = MixedSupport105.computeString1370(byteArrayLocal89, 2);
          }
          byteArrayLocal90 = MixedSupport067.computeByteArray0840(-40, "achievement_names,22");
          if (null != byteArrayLocal90) {
            BufferedSocket.stringArrayState0035[22] = MixedSupport105.computeString1370(byteArrayLocal90, 2);
          }
          byteArrayLocal91 = MixedSupport067.computeByteArray0840(-108, "achievement_names,23");
          if (byteArrayLocal91 != null) {
            BufferedSocket.stringArrayState0035[23] = MixedSupport105.computeString1370(byteArrayLocal91, 2);
          }
          byteArrayLocal92 = MixedSupport067.computeByteArray0840(-78, "achievement_names,24");
          if (null != byteArrayLocal92) {
            BufferedSocket.stringArrayState0035[24] = MixedSupport105.computeString1370(byteArrayLocal92, 2);
          }
          byteArrayLocal93 = MixedSupport067.computeByteArray0840(-118, "achievement_names,25");
          if (byteArrayLocal93 != null) {
            BufferedSocket.stringArrayState0035[25] = MixedSupport105.computeString1370(byteArrayLocal93, 2);
          }
          byteArrayLocal94 = MixedSupport067.computeByteArray0840(-76, "achievement_names,26");
          if (null != byteArrayLocal94) {
            BufferedSocket.stringArrayState0035[26] = MixedSupport105.computeString1370(byteArrayLocal94, 2);
          }
          byteArrayLocal95 = MixedSupport067.computeByteArray0840(-57, "achievement_names,27");
          if (null != byteArrayLocal95) {
            BufferedSocket.stringArrayState0035[27] = MixedSupport105.computeString1370(byteArrayLocal95, 2);
          }
          byteArrayLocal96 = MixedSupport067.computeByteArray0840(-118, "achievement_names,28");
          if (byteArrayLocal96 != null) {
            BufferedSocket.stringArrayState0035[28] = MixedSupport105.computeString1370(byteArrayLocal96, 2);
          }
          byteArrayLocal97 = MixedSupport067.computeByteArray0840(-42, "achievement_names,29");
          if (byteArrayLocal97 != null) {
            BufferedSocket.stringArrayState0035[29] = MixedSupport105.computeString1370(byteArrayLocal97, 2);
          }
          byteArrayLocal98 = MixedSupport067.computeByteArray0840(-39, "achievement_names,30");
          if (null != byteArrayLocal98) {
            BufferedSocket.stringArrayState0035[30] = MixedSupport105.computeString1370(byteArrayLocal98, 2);
          }
          byteArrayLocal99 = MixedSupport067.computeByteArray0840(-96, "achievement_criteria,0");
          if (byteArrayLocal99 != null) {
            GameDomainSupport004.stringArrayState0016[0] = MixedSupport105.computeString1370(byteArrayLocal99, 2);
          }
          byteArrayLocal100 = MixedSupport067.computeByteArray0840(-40, "achievement_criteria,1");
          if (byteArrayLocal100 != null) {
            GameDomainSupport004.stringArrayState0016[1] = MixedSupport105.computeString1370(byteArrayLocal100, 2);
          }
          byteArrayLocal101 = MixedSupport067.computeByteArray0840(-18, "achievement_criteria,2");
          if (byteArrayLocal101 != null) {
            GameDomainSupport004.stringArrayState0016[2] = MixedSupport105.computeString1370(byteArrayLocal101, 2);
          }
          byteArrayLocal102 = MixedSupport067.computeByteArray0840(-54, "achievement_criteria,3");
          if (null != byteArrayLocal102) {
            GameDomainSupport004.stringArrayState0016[3] = MixedSupport105.computeString1370(byteArrayLocal102, 2);
          }
          byteArrayLocal103 = MixedSupport067.computeByteArray0840(-85, "achievement_criteria,4");
          if (null != byteArrayLocal103) {
            GameDomainSupport004.stringArrayState0016[4] = MixedSupport105.computeString1370(byteArrayLocal103, 2);
          }
          byteArrayLocal104 = MixedSupport067.computeByteArray0840(-72, "achievement_criteria,5");
          if (null != byteArrayLocal104) {
            GameDomainSupport004.stringArrayState0016[5] = MixedSupport105.computeString1370(byteArrayLocal104, 2);
          }
          byteArrayLocal105 = MixedSupport067.computeByteArray0840(-93, "achievement_criteria,6");
          if (byteArrayLocal105 != null) {
            GameDomainSupport004.stringArrayState0016[6] = MixedSupport105.computeString1370(byteArrayLocal105, 2);
          }
          byteArrayLocal106 = MixedSupport067.computeByteArray0840(-88, "achievement_criteria,7");
          if (null != byteArrayLocal106) {
            GameDomainSupport004.stringArrayState0016[7] = MixedSupport105.computeString1370(byteArrayLocal106, 2);
          }
          byteArrayLocal107 = MixedSupport067.computeByteArray0840(-128, "achievement_criteria,8");
          if (null != byteArrayLocal107) {
            GameDomainSupport004.stringArrayState0016[8] = MixedSupport105.computeString1370(byteArrayLocal107, 2);
          }
          byteArrayLocal108 = MixedSupport067.computeByteArray0840(-117, "achievement_criteria,9");
          if (null != byteArrayLocal108) {
            GameDomainSupport004.stringArrayState0016[9] = MixedSupport105.computeString1370(byteArrayLocal108, 2);
          }
          byteArrayLocal109 = MixedSupport067.computeByteArray0840(-75, "achievement_criteria,10");
          if (null != byteArrayLocal109) {
            GameDomainSupport004.stringArrayState0016[10] = MixedSupport105.computeString1370(byteArrayLocal109, 2);
          }
          byteArrayLocal110 = MixedSupport067.computeByteArray0840(-86, "achievement_criteria,11");
          if (null != byteArrayLocal110) {
            GameDomainSupport004.stringArrayState0016[11] = MixedSupport105.computeString1370(byteArrayLocal110, 2);
          }
          byteArrayLocal111 = MixedSupport067.computeByteArray0840(-94, "achievement_criteria,12");
          if (null != byteArrayLocal111) {
            GameDomainSupport004.stringArrayState0016[12] = MixedSupport105.computeString1370(byteArrayLocal111, 2);
          }
          byteArrayLocal112 = MixedSupport067.computeByteArray0840(-40, "achievement_criteria,13");
          if (byteArrayLocal112 != null) {
            GameDomainSupport004.stringArrayState0016[13] = MixedSupport105.computeString1370(byteArrayLocal112, 2);
          }
          byteArrayLocal113 = MixedSupport067.computeByteArray0840(-28, "achievement_criteria,14");
          if (byteArrayLocal113 != null) {
            GameDomainSupport004.stringArrayState0016[14] = MixedSupport105.computeString1370(byteArrayLocal113, 2);
          }
          byteArrayLocal114 = MixedSupport067.computeByteArray0840(-46, "achievement_criteria,15");
          if (null != byteArrayLocal114) {
            GameDomainSupport004.stringArrayState0016[15] = MixedSupport105.computeString1370(byteArrayLocal114, 2);
          }
          byteArrayLocal115 = MixedSupport067.computeByteArray0840(-82, "achievement_criteria,16");
          if (byteArrayLocal115 != null) {
            GameDomainSupport004.stringArrayState0016[16] = MixedSupport105.computeString1370(byteArrayLocal115, 2);
          }
          byteArrayLocal116 = MixedSupport067.computeByteArray0840(-61, "achievement_criteria,17");
          if (null != byteArrayLocal116) {
            GameDomainSupport004.stringArrayState0016[17] = MixedSupport105.computeString1370(byteArrayLocal116, 2);
          }
          byteArrayLocal117 = MixedSupport067.computeByteArray0840(-87, "achievement_criteria,18");
          if (byteArrayLocal117 != null) {
            GameDomainSupport004.stringArrayState0016[18] = MixedSupport105.computeString1370(byteArrayLocal117, 2);
          }
          byteArrayLocal118 = MixedSupport067.computeByteArray0840(-62, "achievement_criteria,19");
          if (byteArrayLocal118 != null) {
            GameDomainSupport004.stringArrayState0016[19] = MixedSupport105.computeString1370(byteArrayLocal118, 2);
          }
          byteArrayLocal119 = MixedSupport067.computeByteArray0840(-123, "achievement_criteria,20");
          if (byteArrayLocal119 != null) {
            GameDomainSupport004.stringArrayState0016[20] = MixedSupport105.computeString1370(byteArrayLocal119, 2);
          }
          byteArrayLocal120 = MixedSupport067.computeByteArray0840(-97, "achievement_criteria,21");
          if (byteArrayLocal120 != null) {
            GameDomainSupport004.stringArrayState0016[21] = MixedSupport105.computeString1370(byteArrayLocal120, 2);
          }
          byteArrayLocal121 = MixedSupport067.computeByteArray0840(-111, "achievement_criteria,22");
          if (null != byteArrayLocal121) {
            GameDomainSupport004.stringArrayState0016[22] = MixedSupport105.computeString1370(byteArrayLocal121, 2);
          }
          byteArrayLocal122 = MixedSupport067.computeByteArray0840(-38, "achievement_criteria,23");
          if (byteArrayLocal122 != null) {
            GameDomainSupport004.stringArrayState0016[23] = MixedSupport105.computeString1370(byteArrayLocal122, 2);
          }
          byteArrayLocal123 = MixedSupport067.computeByteArray0840(-86, "achievement_criteria,24");
          if (byteArrayLocal123 != null) {
            GameDomainSupport004.stringArrayState0016[24] = MixedSupport105.computeString1370(byteArrayLocal123, 2);
          }
          byteArrayLocal124 = MixedSupport067.computeByteArray0840(-51, "achievement_criteria,25");
          if (byteArrayLocal124 != null) {
            GameDomainSupport004.stringArrayState0016[25] = MixedSupport105.computeString1370(byteArrayLocal124, 2);
          }
          byteArrayLocal125 = MixedSupport067.computeByteArray0840(-117, "achievement_criteria,26");
          if (byteArrayLocal125 != null) {
            GameDomainSupport004.stringArrayState0016[26] = MixedSupport105.computeString1370(byteArrayLocal125, 2);
          }
          byteArrayLocal126 = MixedSupport067.computeByteArray0840(-109, "achievement_criteria,27");
          if (null != byteArrayLocal126) {
            GameDomainSupport004.stringArrayState0016[27] = MixedSupport105.computeString1370(byteArrayLocal126, 2);
          }
          byteArrayLocal127 = MixedSupport067.computeByteArray0840(-21, "achievement_criteria,28");
          if (null != byteArrayLocal127) {
            GameDomainSupport004.stringArrayState0016[28] = MixedSupport105.computeString1370(byteArrayLocal127, 2);
          }
          byteArrayLocal128 = MixedSupport067.computeByteArray0840(-16, "achievement_criteria,29");
          if (null != byteArrayLocal128) {
            GameDomainSupport004.stringArrayState0016[29] = MixedSupport105.computeString1370(byteArrayLocal128, 2);
          }
          byteArrayLocal129 = MixedSupport067.computeByteArray0840(-97, "achievement_criteria,30");
          if (byteArrayLocal129 != null) {
            GameDomainSupport004.stringArrayState0016[30] = MixedSupport105.computeString1370(byteArrayLocal129, 2);
          }
          byteArrayLocal130 = MixedSupport067.computeByteArray0840(-68, "gameoptlabels,0");
          if (byteArrayLocal130 != null) {
            NodeHashTable.stringArrayState0045[0] = MixedSupport105.computeString1370(byteArrayLocal130, 2);
          }
          byteArrayLocal131 = MixedSupport067.computeByteArray0840(-72, "gameoptlabels,1");
          if (null != byteArrayLocal131) {
            NodeHashTable.stringArrayState0045[1] = MixedSupport105.computeString1370(byteArrayLocal131, 2);
          }
          byteArrayLocal132 = MixedSupport067.computeByteArray0840(-25, "gameoptlabels,2");
          if (null != byteArrayLocal132) {
            NodeHashTable.stringArrayState0045[2] = MixedSupport105.computeString1370(byteArrayLocal132, 2);
          }
          byteArrayLocal133 = MixedSupport067.computeByteArray0840(-126, "gameoptlabels,3");
          if (null != byteArrayLocal133) {
            NodeHashTable.stringArrayState0045[3] = MixedSupport105.computeString1370(byteArrayLocal133, 2);
          }
          byteArrayLocal134 = MixedSupport067.computeByteArray0840(-90, "gameoptlabels,4");
          if (byteArrayLocal134 != null) {
            NodeHashTable.stringArrayState0045[4] = MixedSupport105.computeString1370(byteArrayLocal134, 2);
          }
          byteArrayLocal135 = MixedSupport067.computeByteArray0840(-58, "gameopt_buttonnames,0,0");
          if (null != byteArrayLocal135) {
            MixedSupport121.stringArrayArrayState0008[0][0] = MixedSupport105.computeString1370(byteArrayLocal135, 2);
          }
          byteArrayLocal136 = MixedSupport067.computeByteArray0840(-116, "gameopt_buttonnames,0,1");
          if (byteArrayLocal136 != null) {
            MixedSupport121.stringArrayArrayState0008[0][1] = MixedSupport105.computeString1370(byteArrayLocal136, 2);
          }
          byteArrayLocal137 = MixedSupport067.computeByteArray0840(-64, "gameopt_buttonnames,1,0");
          if (null != byteArrayLocal137) {
            MixedSupport121.stringArrayArrayState0008[1][0] = MixedSupport105.computeString1370(byteArrayLocal137, 2);
          }
          byteArrayLocal138 = MixedSupport067.computeByteArray0840(-104, "gameopt_buttonnames,1,1");
          if (null != byteArrayLocal138) {
            MixedSupport121.stringArrayArrayState0008[1][1] = MixedSupport105.computeString1370(byteArrayLocal138, 2);
          }
          byteArrayLocal139 = MixedSupport067.computeByteArray0840(-77, "gameopt_buttonnames,1,2");
          if (null != byteArrayLocal139) {
            MixedSupport121.stringArrayArrayState0008[1][2] = MixedSupport105.computeString1370(byteArrayLocal139, 2);
          }
          byteArrayLocal140 = MixedSupport067.computeByteArray0840(-25, "gameopt_buttonnames,1,3");
          if (null != byteArrayLocal140) {
            MixedSupport121.stringArrayArrayState0008[1][3] = MixedSupport105.computeString1370(byteArrayLocal140, 2);
          }
          byteArrayLocal141 = MixedSupport067.computeByteArray0840(-37, "gameopt_buttonnames,1,4");
          if (byteArrayLocal141 != null) {
            MixedSupport121.stringArrayArrayState0008[1][4] = MixedSupport105.computeString1370(byteArrayLocal141, 2);
          }
          byteArrayLocal142 = MixedSupport067.computeByteArray0840(-105, "gameopt_buttonnames,2,0");
          if (null != byteArrayLocal142) {
            MixedSupport121.stringArrayArrayState0008[2][0] = MixedSupport105.computeString1370(byteArrayLocal142, 2);
          }
          byteArrayLocal143 = MixedSupport067.computeByteArray0840(-37, "gameopt_buttonnames,2,1");
          if (byteArrayLocal143 != null) {
            MixedSupport121.stringArrayArrayState0008[2][1] = MixedSupport105.computeString1370(byteArrayLocal143, 2);
          }
          byteArrayLocal144 = MixedSupport067.computeByteArray0840(-37, "gameopt_buttonnames,2,2");
          if (byteArrayLocal144 != null) {
            MixedSupport121.stringArrayArrayState0008[2][2] = MixedSupport105.computeString1370(byteArrayLocal144, 2);
          }
          byteArrayLocal145 = MixedSupport067.computeByteArray0840(-46, "gameopt_buttonnames,2,3");
          if (null != byteArrayLocal145) {
            MixedSupport121.stringArrayArrayState0008[2][3] = MixedSupport105.computeString1370(byteArrayLocal145, 2);
          }
          byteArrayLocal146 = MixedSupport067.computeByteArray0840(-101, "gameopt_buttonnames,2,4");
          if (null != byteArrayLocal146) {
            MixedSupport121.stringArrayArrayState0008[2][4] = MixedSupport105.computeString1370(byteArrayLocal146, 2);
          }
          byteArrayLocal147 = MixedSupport067.computeByteArray0840(-50, "gameopt_buttonnames,3,0");
          if (byteArrayLocal147 != null) {
            MixedSupport121.stringArrayArrayState0008[3][0] = MixedSupport105.computeString1370(byteArrayLocal147, 2);
          }
          byteArrayLocal148 = MixedSupport067.computeByteArray0840(-106, "gameopt_buttonnames,3,1");
          if (null != byteArrayLocal148) {
            MixedSupport121.stringArrayArrayState0008[3][1] = MixedSupport105.computeString1370(byteArrayLocal148, 2);
          }
          byteArrayLocal149 = MixedSupport067.computeByteArray0840(-63, "gameopt_buttonnames,3,2");
          if (null != byteArrayLocal149) {
            MixedSupport121.stringArrayArrayState0008[3][2] = MixedSupport105.computeString1370(byteArrayLocal149, 2);
          }
          byteArrayLocal150 = MixedSupport067.computeByteArray0840(-49, "gameopt_buttonnames,3,3");
          if (null != byteArrayLocal150) {
            MixedSupport121.stringArrayArrayState0008[3][3] = MixedSupport105.computeString1370(byteArrayLocal150, 2);
          }
          byteArrayLocal151 = MixedSupport067.computeByteArray0840(-79, "gameopt_buttonnames,3,4");
          if (null != byteArrayLocal151) {
            MixedSupport121.stringArrayArrayState0008[3][4] = MixedSupport105.computeString1370(byteArrayLocal151, 2);
          }
          byteArrayLocal152 = MixedSupport067.computeByteArray0840(-89, "gameopt_buttonnames,4,0");
          if (byteArrayLocal152 != null) {
            MixedSupport121.stringArrayArrayState0008[4][0] = MixedSupport105.computeString1370(byteArrayLocal152, 2);
          }
          byteArrayLocal153 = MixedSupport067.computeByteArray0840(-36, "gameopt_buttonnames,4,1");
          if (byteArrayLocal153 != null) {
            MixedSupport121.stringArrayArrayState0008[4][1] = MixedSupport105.computeString1370(byteArrayLocal153, 2);
          }
          byteArrayLocal154 = MixedSupport067.computeByteArray0840(-82, "gameopt_buttonnames,4,2");
          if (null != byteArrayLocal154) {
            MixedSupport121.stringArrayArrayState0008[4][2] = MixedSupport105.computeString1370(byteArrayLocal154, 2);
          }
          byteArrayLocal155 = MixedSupport067.computeByteArray0840(-18, "gameopt_buttonnames,4,3");
          if (null != byteArrayLocal155) {
            MixedSupport121.stringArrayArrayState0008[4][3] = MixedSupport105.computeString1370(byteArrayLocal155, 2);
          }
          byteArrayLocal156 = MixedSupport067.computeByteArray0840(-121, "gameopt_tooltipnames,0,0");
          if (byteArrayLocal156 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[0][0] = MixedSupport105.computeString1370(byteArrayLocal156, 2);
          }
          byteArrayLocal157 = MixedSupport067.computeByteArray0840(-62, "gameopt_tooltipnames,0,1");
          if (null != byteArrayLocal157) {
            SceneWidgetPart009.stringArrayArrayState0007[0][1] = MixedSupport105.computeString1370(byteArrayLocal157, 2);
          }
          byteArrayLocal158 = MixedSupport067.computeByteArray0840(-71, "gameopt_tooltipnames,1,0");
          if (byteArrayLocal158 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[1][0] = MixedSupport105.computeString1370(byteArrayLocal158, 2);
          }
          byteArrayLocal159 = MixedSupport067.computeByteArray0840(-103, "gameopt_tooltipnames,1,1");
          if (byteArrayLocal159 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[1][1] = MixedSupport105.computeString1370(byteArrayLocal159, 2);
          }
          byteArrayLocal160 = MixedSupport067.computeByteArray0840(-38, "gameopt_tooltipnames,1,2");
          if (null != byteArrayLocal160) {
            SceneWidgetPart009.stringArrayArrayState0007[1][2] = MixedSupport105.computeString1370(byteArrayLocal160, 2);
          }
          byteArrayLocal161 = MixedSupport067.computeByteArray0840(-123, "gameopt_tooltipnames,1,3");
          if (byteArrayLocal161 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[1][3] = MixedSupport105.computeString1370(byteArrayLocal161, 2);
          }
          byteArrayLocal162 = MixedSupport067.computeByteArray0840(-128, "gameopt_tooltipnames,1,4");
          if (null != byteArrayLocal162) {
            SceneWidgetPart009.stringArrayArrayState0007[1][4] = MixedSupport105.computeString1370(byteArrayLocal162, 2);
          }
          byteArrayLocal163 = MixedSupport067.computeByteArray0840(-86, "gameopt_tooltipnames,2,0");
          if (byteArrayLocal163 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][0] = MixedSupport105.computeString1370(byteArrayLocal163, 2);
          }
          byteArrayLocal164 = MixedSupport067.computeByteArray0840(-43, "gameopt_tooltipnames,2,1");
          if (byteArrayLocal164 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][1] = MixedSupport105.computeString1370(byteArrayLocal164, 2);
          }
          byteArrayLocal165 = MixedSupport067.computeByteArray0840(-107, "gameopt_tooltipnames,2,2");
          if (byteArrayLocal165 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][2] = MixedSupport105.computeString1370(byteArrayLocal165, 2);
          }
          byteArrayLocal166 = MixedSupport067.computeByteArray0840(-80, "gameopt_tooltipnames,2,3");
          if (byteArrayLocal166 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][3] = MixedSupport105.computeString1370(byteArrayLocal166, 2);
          }
          byteArrayLocal167 = MixedSupport067.computeByteArray0840(-46, "gameopt_tooltipnames,2,4");
          if (null != byteArrayLocal167) {
            SceneWidgetPart009.stringArrayArrayState0007[2][4] = MixedSupport105.computeString1370(byteArrayLocal167, 2);
          }
          byteArrayLocal168 = MixedSupport067.computeByteArray0840(-45, "gameopt_tooltipnames,3,0");
          if (null != byteArrayLocal168) {
            SceneWidgetPart009.stringArrayArrayState0007[3][0] = MixedSupport105.computeString1370(byteArrayLocal168, 2);
          }
          byteArrayLocal169 = MixedSupport067.computeByteArray0840(-17, "gameopt_tooltipnames,3,1");
          if (null != byteArrayLocal169) {
            SceneWidgetPart009.stringArrayArrayState0007[3][1] = MixedSupport105.computeString1370(byteArrayLocal169, 2);
          }
          byteArrayLocal170 = MixedSupport067.computeByteArray0840(-51, "gameopt_tooltipnames,3,2");
          if (byteArrayLocal170 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[3][2] = MixedSupport105.computeString1370(byteArrayLocal170, 2);
          }
          byteArrayLocal171 = MixedSupport067.computeByteArray0840(-83, "gameopt_tooltipnames,3,3");
          if (null != byteArrayLocal171) {
            SceneWidgetPart009.stringArrayArrayState0007[3][3] = MixedSupport105.computeString1370(byteArrayLocal171, 2);
          }
          byteArrayLocal172 = MixedSupport067.computeByteArray0840(-118, "gameopt_tooltipnames,3,4");
          if (null != byteArrayLocal172) {
            SceneWidgetPart009.stringArrayArrayState0007[3][4] = MixedSupport105.computeString1370(byteArrayLocal172, 2);
          }
          byteArrayLocal173 = MixedSupport067.computeByteArray0840(-79, "gameopt_tooltipnames,4,0");
          if (byteArrayLocal173 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[4][0] = MixedSupport105.computeString1370(byteArrayLocal173, 2);
          }
          byteArrayLocal174 = MixedSupport067.computeByteArray0840(-116, "gameopt_tooltipnames,4,1");
          if (byteArrayLocal174 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[4][1] = MixedSupport105.computeString1370(byteArrayLocal174, 2);
          }
          byteArrayLocal175 = MixedSupport067.computeByteArray0840(-63, "gameopt_tooltipnames,4,2");
          if (null != byteArrayLocal175) {
            SceneWidgetPart009.stringArrayArrayState0007[4][2] = MixedSupport105.computeString1370(byteArrayLocal175, 2);
          }
          byteArrayLocal176 = MixedSupport067.computeByteArray0840(-28, "instructions_titles_thebasics");
          if (byteArrayLocal176 != null) {
            MixedSupport068.stringState0302 = MixedSupport105.computeString1370(byteArrayLocal176, 2);
          }
          byteArrayLocal177 = MixedSupport067.computeByteArray0840(-46, "instructions_titles_thecontrols");
          if (null != byteArrayLocal177) {
            MixedSupport129.stringState0559 = MixedSupport105.computeString1370(byteArrayLocal177, 2);
          }
          byteArrayLocal178 = MixedSupport067.computeByteArray0840(-116, "instructions_titles_thetwist");
          if (byteArrayLocal178 != null) {
            MixedSupport011.stringState0054 = MixedSupport105.computeString1370(byteArrayLocal178, 2);
          }
          byteArrayLocal179 = MixedSupport067.computeByteArray0840(-58, "instructions_titles_inmultiplayer");
          if (null != byteArrayLocal179) {
            MixedSupport068.stringState0303 = MixedSupport105.computeString1370(byteArrayLocal179, 2);
          }
          byteArrayLocal180 = MixedSupport067.computeByteArray0840(-94, "instructions_titles_insingleplayer");
          if (null != byteArrayLocal180) {
            MixedSupport043.stringState0185 = MixedSupport105.computeString1370(byteArrayLocal180, 2);
          }
          byteArrayLocal181 = MixedSupport067.computeByteArray0840(-36, "instructions_titles_specialitems");
          if (null != byteArrayLocal181) {
            NetworkSupport006.stringState0339 = MixedSupport105.computeString1370(byteArrayLocal181, 2);
          }
          byteArrayLocal182 = MixedSupport067.computeByteArray0840(-28, "instructions_titles_activatingspecialitems");
          if (byteArrayLocal182 != null) {
            MixedSupport054.stringState0233 = MixedSupport105.computeString1370(byteArrayLocal182, 2);
          }
          byteArrayLocal183 = MixedSupport067.computeByteArray0840(-89, "instructions_piecesarefalling");
          if (null != byteArrayLocal183) {
            MixedSupport015.stringState0072 = MixedSupport105.computeString1370(byteArrayLocal183, 2);
          }
          byteArrayLocal184 = MixedSupport067.computeByteArray0840(-42, "instructions_matchthepieces");
          if (null != byteArrayLocal184) {
            MixedSupport026.stringState0129 = MixedSupport105.computeString1370(byteArrayLocal184, 2);
          }
          byteArrayLocal185 = MixedSupport067.computeByteArray0840(-121, "instructions_machinetransforms");
          if (byteArrayLocal185 != null) {
            ReturnedShape.stringState0474 = MixedSupport105.computeString1370(byteArrayLocal185, 2);
          }
          byteArrayLocal186 = MixedSupport067.computeByteArray0840(-62, "instructions_clearingsolids");
          if (null != byteArrayLocal186) {
            UiComponentPart028.stringState0480 = MixedSupport105.computeString1370(byteArrayLocal186, 2);
          }
          byteArrayLocal187 = MixedSupport067.computeByteArray0840(-52, "instructions_multiplayer_solids");
          if (byteArrayLocal187 != null) {
            MixedSupport024.stringState0116 = MixedSupport105.computeString1370(byteArrayLocal187, 2);
          }
          byteArrayLocal188 = MixedSupport067.computeByteArray0840(-69, "instructions_singleplayer_solids");
          if (null != byteArrayLocal188) {
            MixedSupport005.stringState0019 = MixedSupport105.computeString1370(byteArrayLocal188, 2);
          }
          byteArrayLocal189 = MixedSupport067.computeByteArray0840(-122, "instructions_wildcard");
          if (null != byteArrayLocal189) {
            SecondaryNodeHashTable.stringState0367 = MixedSupport105.computeString1370(byteArrayLocal189, 2);
          }
          byteArrayLocal190 = MixedSupport067.computeByteArray0840(-122, "instructions_gettingspecials");
          if (byteArrayLocal190 != null) {
            MixedSupport067.stringState0301 = MixedSupport105.computeString1370(byteArrayLocal190, 2);
          }
          byteArrayLocal191 = MixedSupport067.computeByteArray0840(-33, "instructions_activatingspecials");
          if (byteArrayLocal191 != null) {
            PlatformSupport002.stringState0123 = MixedSupport105.computeString1370(byteArrayLocal191, 2);
          }
          byteArrayLocal192 = MixedSupport067.computeByteArray0840(-65, "instructions_multiplayer_specials");
          if (null != byteArrayLocal192) {
            NetworkSupport005.stringState0313 = MixedSupport105.computeString1370(byteArrayLocal192, 2);
          }
          byteArrayLocal193 = MixedSupport067.computeByteArray0840(-47, "instructions_itemdescriptions,0,0");
          if (byteArrayLocal193 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[0][0] = MixedSupport105.computeString1370(byteArrayLocal193, 2);
          }
          byteArrayLocal194 = MixedSupport067.computeByteArray0840(-17, "instructions_itemdescriptions,0,1");
          if (byteArrayLocal194 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[0][1] = MixedSupport105.computeString1370(byteArrayLocal194, 2);
          }
          byteArrayLocal195 = MixedSupport067.computeByteArray0840(-98, "instructions_itemdescriptions,1,0");
          if (byteArrayLocal195 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[1][0] = MixedSupport105.computeString1370(byteArrayLocal195, 2);
          }
          byteArrayLocal196 = MixedSupport067.computeByteArray0840(-103, "instructions_itemdescriptions,1,1");
          if (byteArrayLocal196 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[1][1] = MixedSupport105.computeString1370(byteArrayLocal196, 2);
          }
          byteArrayLocal197 = MixedSupport067.computeByteArray0840(-27, "instructions_itemdescriptions,2,0");
          if (null != byteArrayLocal197) {
            SecondaryNodeHashTable.stringArrayArrayState0006[2][0] = MixedSupport105.computeString1370(byteArrayLocal197, 2);
          }
          byteArrayLocal198 = MixedSupport067.computeByteArray0840(-82, "instructions_itemdescriptions,2,1");
          if (byteArrayLocal198 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[2][1] = MixedSupport105.computeString1370(byteArrayLocal198, 2);
          }
          byteArrayLocal199 = MixedSupport067.computeByteArray0840(-53, "instructions_itemdescriptions,3,0");
          if (byteArrayLocal199 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[3][0] = MixedSupport105.computeString1370(byteArrayLocal199, 2);
          }
          byteArrayLocal200 = MixedSupport067.computeByteArray0840(-128, "instructions_itemdescriptions,3,1");
          if (null != byteArrayLocal200) {
            SecondaryNodeHashTable.stringArrayArrayState0006[3][1] = MixedSupport105.computeString1370(byteArrayLocal200, 2);
          }
          byteArrayLocal201 = MixedSupport067.computeByteArray0840(-79, "instructions_itemdescriptions,4,0");
          if (byteArrayLocal201 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[4][0] = MixedSupport105.computeString1370(byteArrayLocal201, 2);
          }
          byteArrayLocal202 = MixedSupport067.computeByteArray0840(-123, "instructions_itemdescriptions,4,1");
          if (null != byteArrayLocal202) {
            SecondaryNodeHashTable.stringArrayArrayState0006[4][1] = MixedSupport105.computeString1370(byteArrayLocal202, 2);
          }
          byteArrayLocal203 = MixedSupport067.computeByteArray0840(-62, "instructions_itemdescriptions,5,0");
          if (byteArrayLocal203 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[5][0] = MixedSupport105.computeString1370(byteArrayLocal203, 2);
          }
          byteArrayLocal204 = MixedSupport067.computeByteArray0840(-60, "instructions_itemdescriptions,5,1");
          if (byteArrayLocal204 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[5][1] = MixedSupport105.computeString1370(byteArrayLocal204, 2);
          }
          byteArrayLocal205 = MixedSupport067.computeByteArray0840(-102, "instructions_itemdescriptions,6,0");
          if (null != byteArrayLocal205) {
            SecondaryNodeHashTable.stringArrayArrayState0006[6][0] = MixedSupport105.computeString1370(byteArrayLocal205, 2);
          }
          byteArrayLocal206 = MixedSupport067.computeByteArray0840(-55, "instructions_itemdescriptions,6,1");
          if (byteArrayLocal206 != null) {
            SecondaryNodeHashTable.stringArrayArrayState0006[6][1] = MixedSupport105.computeString1370(byteArrayLocal206, 2);
          }
          byteArrayLocal207 = MixedSupport067.computeByteArray0840(-124, "instructions_controls,0");
          if (null != byteArrayLocal207) {
            GameplayControls.stringArrayState0056[0] = MixedSupport105.computeString1370(byteArrayLocal207, 2);
          }
          byteArrayLocal208 = MixedSupport067.computeByteArray0840(-92, "instructions_controls,1");
          if (byteArrayLocal208 != null) {
            GameplayControls.stringArrayState0056[1] = MixedSupport105.computeString1370(byteArrayLocal208, 2);
          }
          byteArrayLocal209 = MixedSupport067.computeByteArray0840(-117, "instructions_controls,2");
          if (byteArrayLocal209 != null) {
            GameplayControls.stringArrayState0056[2] = MixedSupport105.computeString1370(byteArrayLocal209, 2);
          }
          byteArrayLocal210 = MixedSupport067.computeByteArray0840(-108, "instructions_controls,3");
          if (byteArrayLocal210 != null) {
            GameplayControls.stringArrayState0056[3] = MixedSupport105.computeString1370(byteArrayLocal210, 2);
          }
          byteArrayLocal211 = MixedSupport067.computeByteArray0840(-61, "instructions_controls,4");
          if (byteArrayLocal211 != null) {
            GameplayControls.stringArrayState0056[4] = MixedSupport105.computeString1370(byteArrayLocal211, 2);
          }
          byteArrayLocal212 = MixedSupport067.computeByteArray0840(-61, "instructions_controls,5");
          if (null != byteArrayLocal212) {
            GameplayControls.stringArrayState0056[5] = MixedSupport105.computeString1370(byteArrayLocal212, 2);
          }
          byteArrayLocal213 = MixedSupport067.computeByteArray0840(-31, "instructions_controls,6");
          if (byteArrayLocal213 != null) {
            GameplayControls.stringArrayState0056[6] = MixedSupport105.computeString1370(byteArrayLocal213, 2);
          }
          byteArrayLocal214 = MixedSupport067.computeByteArray0840(-53, "didyouknow_title");
          if (null != byteArrayLocal214) {
            MixedSupport088.stringState0371 = MixedSupport105.computeString1370(byteArrayLocal214, 2);
          }
          byteArrayLocal215 = MixedSupport067.computeByteArray0840(-87, "didyouknow,0");
          if (null != byteArrayLocal215) {
            LoginCredentials.tutorialTips[0] = MixedSupport105.computeString1370(byteArrayLocal215, 2);
          }
          byteArrayLocal216 = MixedSupport067.computeByteArray0840(-89, "didyouknow,1");
          if (byteArrayLocal216 != null) {
            LoginCredentials.tutorialTips[1] = MixedSupport105.computeString1370(byteArrayLocal216, 2);
          }
          byteArrayLocal217 = MixedSupport067.computeByteArray0840(-112, "didyouknow,2");
          if (null != byteArrayLocal217) {
            LoginCredentials.tutorialTips[2] = MixedSupport105.computeString1370(byteArrayLocal217, 2);
          }
          byteArrayLocal218 = MixedSupport067.computeByteArray0840(-72, "didyouknow,3");
          if (null != byteArrayLocal218) {
            LoginCredentials.tutorialTips[3] = MixedSupport105.computeString1370(byteArrayLocal218, 2);
          }
          byteArrayLocal219 = MixedSupport067.computeByteArray0840(-127, "didyouknow,4");
          if (null != byteArrayLocal219) {
            LoginCredentials.tutorialTips[4] = MixedSupport105.computeString1370(byteArrayLocal219, 2);
          }
          byteArrayLocal220 = MixedSupport067.computeByteArray0840(-32, "didyouknow,5");
          if (byteArrayLocal220 != null) {
            LoginCredentials.tutorialTips[5] = MixedSupport105.computeString1370(byteArrayLocal220, 2);
          }
          byteArrayLocal221 = MixedSupport067.computeByteArray0840(-116, "didyouknow,6");
          if (null != byteArrayLocal221) {
            LoginCredentials.tutorialTips[6] = MixedSupport105.computeString1370(byteArrayLocal221, 2);
          }
          byteArrayLocal222 = MixedSupport067.computeByteArray0840(-97, "didyouknow,7");
          if (null != byteArrayLocal222) {
            LoginCredentials.tutorialTips[7] = MixedSupport105.computeString1370(byteArrayLocal222, 2);
          }
          byteArrayLocal223 = MixedSupport067.computeByteArray0840(-117, "didyouknow,8");
          if (byteArrayLocal223 != null) {
            LoginCredentials.tutorialTips[8] = MixedSupport105.computeString1370(byteArrayLocal223, 2);
          }
          byteArrayLocal224 = MixedSupport067.computeByteArray0840(-112, "didyouknow,9");
          if (null != byteArrayLocal224) {
            LoginCredentials.tutorialTips[9] = MixedSupport105.computeString1370(byteArrayLocal224, 2);
          }
          byteArrayLocal225 = MixedSupport067.computeByteArray0840(-99, "didyouknow,10");
          if (null != byteArrayLocal225) {
            LoginCredentials.tutorialTips[10] = MixedSupport105.computeString1370(byteArrayLocal225, 2);
          }
          byteArrayLocal226 = MixedSupport067.computeByteArray0840(-57, "didyouknow,11");
          if (byteArrayLocal226 != null) {
            LoginCredentials.tutorialTips[11] = MixedSupport105.computeString1370(byteArrayLocal226, 2);
          }
          byteArrayLocal227 = MixedSupport067.computeByteArray0840(-104, "tutorial,0");
          if (byteArrayLocal227 != null) {
            UiComponentPart028.stringArrayState0040[0] = MixedSupport105.computeString1370(byteArrayLocal227, 2);
          }
          byteArrayLocal228 = MixedSupport067.computeByteArray0840(-90, "tutorial,1");
          if (null != byteArrayLocal228) {
            UiComponentPart028.stringArrayState0040[1] = MixedSupport105.computeString1370(byteArrayLocal228, 2);
          }
          byteArrayLocal229 = MixedSupport067.computeByteArray0840(-77, "tutorial,2");
          if (null != byteArrayLocal229) {
            UiComponentPart028.stringArrayState0040[2] = MixedSupport105.computeString1370(byteArrayLocal229, 2);
          }
          byteArrayLocal230 = MixedSupport067.computeByteArray0840(-76, "tutorial,3");
          if (byteArrayLocal230 != null) {
            UiComponentPart028.stringArrayState0040[3] = MixedSupport105.computeString1370(byteArrayLocal230, 2);
          }
          byteArrayLocal231 = MixedSupport067.computeByteArray0840(-97, "to_activate_specials");
          if (null != byteArrayLocal231) {
            RenderingSupport012.stringState0443 = MixedSupport105.computeString1370(byteArrayLocal231, 2);
          }
          byteArrayLocal232 = MixedSupport067.computeByteArray0840(-49, "premultiplayer_tutorial,0");
          if (null != byteArrayLocal232) {
            InputAdapter003.stringArrayState0043[0] = MixedSupport105.computeString1370(byteArrayLocal232, 2);
          }
          byteArrayLocal233 = MixedSupport067.computeByteArray0840(-42, "premultiplayer_tutorial,1");
          if (byteArrayLocal233 != null) {
            InputAdapter003.stringArrayState0043[1] = MixedSupport105.computeString1370(byteArrayLocal233, 2);
          }
          byteArrayLocal234 = MixedSupport067.computeByteArray0840(-36, "masterchallengeintro,0");
          if (null != byteArrayLocal234) {
            MixedSupport130.stringArrayState0050[0] = MixedSupport105.computeString1370(byteArrayLocal234, 2);
          }
          byteArrayLocal235 = MixedSupport067.computeByteArray0840(-52, "masterchallengeintro,1");
          if (byteArrayLocal235 != null) {
            MixedSupport130.stringArrayState0050[1] = MixedSupport105.computeString1370(byteArrayLocal235, 2);
          }
          byteArrayLocal236 = MixedSupport067.computeByteArray0840(-78, "showtutorialagain");
          if (byteArrayLocal236 != null) {
            UiComponentPart032.stringState0581 = MixedSupport105.computeString1370(byteArrayLocal236, 2);
          }
          byteArrayLocal237 = MixedSupport067.computeByteArray0840(-83, "challengestrategy,0");
          if (null != byteArrayLocal237) {
            ThemeTips.themeTips[0] = MixedSupport105.computeString1370(byteArrayLocal237, 2);
          }
          byteArrayLocal238 = MixedSupport067.computeByteArray0840(-39, "challengestrategy,1");
          if (null != byteArrayLocal238) {
            ThemeTips.themeTips[1] = MixedSupport105.computeString1370(byteArrayLocal238, 2);
          }
          byteArrayLocal239 = MixedSupport067.computeByteArray0840(-73, "challengestrategy,2");
          if (null != byteArrayLocal239) {
            ThemeTips.themeTips[2] = MixedSupport105.computeString1370(byteArrayLocal239, 2);
          }
          byteArrayLocal240 = MixedSupport067.computeByteArray0840(-75, "challengestrategy,3");
          if (byteArrayLocal240 != null) {
            ThemeTips.themeTips[3] = MixedSupport105.computeString1370(byteArrayLocal240, 2);
          }
          byteArrayLocal241 = MixedSupport067.computeByteArray0840(-54, "challengestrategy,4");
          if (null != byteArrayLocal241) {
            ThemeTips.themeTips[4] = MixedSupport105.computeString1370(byteArrayLocal241, 2);
          }
          byteArrayLocal242 = MixedSupport067.computeByteArray0840(-96, "challengestrategy,5");
          if (byteArrayLocal242 != null) {
            ThemeTips.themeTips[5] = MixedSupport105.computeString1370(byteArrayLocal242, 2);
          }
          byteArrayLocal243 = MixedSupport067.computeByteArray0840(-67, "challengestrategy,6");
          if (null != byteArrayLocal243) {
            ThemeTips.themeTips[6] = MixedSupport105.computeString1370(byteArrayLocal243, 2);
          }
          byteArrayLocal244 = MixedSupport067.computeByteArray0840(-60, "challengestrategy,7");
          if (null != byteArrayLocal244) {
            ThemeTips.themeTips[7] = MixedSupport105.computeString1370(byteArrayLocal244, 2);
          }
          byteArrayLocal245 = MixedSupport067.computeByteArray0840(-16, "x_at_once");
          if (null != byteArrayLocal245) {
            MixedSupport094.stringState0395 = MixedSupport105.computeString1370(byteArrayLocal245, 2);
          }
          byteArrayLocal246 = MixedSupport067.computeByteArray0840(-59, "x_chain");
          if (byteArrayLocal246 != null) {
            MixedSupport027.stringState0132 = MixedSupport105.computeString1370(byteArrayLocal246, 2);
          }
          byteArrayLocal247 = MixedSupport067.computeByteArray0840(-35, "x_shapes");
          if (null != byteArrayLocal247) {
            MixedSupport130.stringState0564 = MixedSupport105.computeString1370(byteArrayLocal247, 2);
          }
          byteArrayLocal248 = MixedSupport067.computeByteArray0840(-95, "start");
          if (null != byteArrayLocal248) {
            MixedSupport116.stringState0511 = MixedSupport105.computeString1370(byteArrayLocal248, 2);
          }
          byteArrayLocal249 = MixedSupport067.computeByteArray0840(-72, "challenge");
          if (null != byteArrayLocal249) {
            UiComponentPart016.stringState0296 = MixedSupport105.computeString1370(byteArrayLocal249, 2);
          }
          byteArrayLocal250 = MixedSupport067.computeByteArray0840(-89, "new_theme_unlocked");
          if (null != byteArrayLocal250) {
            ValidationStatus.stringState0524 = MixedSupport105.computeString1370(byteArrayLocal250, 2);
          }
          byteArrayLocal251 = MixedSupport067.computeByteArray0840(-110, "speedup");
          if (byteArrayLocal251 != null) {
            MixedSupport028.stringState0140 = MixedSupport105.computeString1370(byteArrayLocal251, 2);
          }
          byteArrayLocal252 = MixedSupport067.computeByteArray0840(-61, "panic");
          if (byteArrayLocal252 != null) {
            MixedSupport013.stringState0062 = MixedSupport105.computeString1370(byteArrayLocal252, 2);
          }
          byteArrayLocal253 = MixedSupport067.computeByteArray0840(-90, "fight");
          if (null != byteArrayLocal253) {
            TextLayout.stringState0083 = MixedSupport105.computeString1370(byteArrayLocal253, 2);
          }
          byteArrayLocal254 = MixedSupport067.computeByteArray0840(-93, "finish_name");
          if (byteArrayLocal254 != null) {
            MixedSupport096.stringState0409 = MixedSupport105.computeString1370(byteArrayLocal254, 2);
          }
          byteArrayLocal255 = MixedSupport067.computeByteArray0840(-60, "you_win");
          if (byteArrayLocal255 != null) {
            UiComponentPart005.stringState0101 = MixedSupport105.computeString1370(byteArrayLocal255, 2);
          }
          byteArrayLocal256 = MixedSupport067.computeByteArray0840(-36, "name_wins");
          if (null != byteArrayLocal256) {
            MixedSupport039.stringState0176 = MixedSupport105.computeString1370(byteArrayLocal256, 2);
          }
          byteArrayLocal257 = MixedSupport067.computeByteArray0840(-107, "draw");
          if (null != byteArrayLocal257) {
            DisplayModeController.stringState0479 = MixedSupport105.computeString1370(byteArrayLocal257, 2);
          }
          byteArrayLocal258 = MixedSupport067.computeByteArray0840(-100, "well_done");
          if (null != byteArrayLocal258) {
            MixedSupport125.stringState0546 = MixedSupport105.computeString1370(byteArrayLocal258, 2);
          }
          byteArrayLocal259 = MixedSupport067.computeByteArray0840(-101, "oh_no");
          if (byteArrayLocal259 != null) {
            MixedSupport014.stringState0070 = MixedSupport105.computeString1370(byteArrayLocal259, 2);
          }
          byteArrayLocal260 = MixedSupport067.computeByteArray0840(-61, "thefinal");
          if (byteArrayLocal260 != null) {
            ResourceArchive.stringState0286 = MixedSupport105.computeString1370(byteArrayLocal260, 2);
          }
          byteArrayLocal261 = MixedSupport067.computeByteArray0840(-70, "name_is_out");
          if (null != byteArrayLocal261) {
            MixedSupport001.stringState0001 = MixedSupport105.computeString1370(byteArrayLocal261, 2);
          }
          byteArrayLocal262 = MixedSupport067.computeByteArray0840(-40, "main_menu_ticker,0");
          if (null != byteArrayLocal262) {
            GameDomainSupport005.stringArrayState0028[0] = MixedSupport105.computeString1370(byteArrayLocal262, 2);
          }
          byteArrayLocal263 = MixedSupport067.computeByteArray0840(-59, "main_menu_ticker,1");
          if (null != byteArrayLocal263) {
            GameDomainSupport005.stringArrayState0028[1] = MixedSupport105.computeString1370(byteArrayLocal263, 2);
          }
          byteArrayLocal264 = MixedSupport067.computeByteArray0840(-34, "main_menu_ticker,2");
          if (null != byteArrayLocal264) {
            GameDomainSupport005.stringArrayState0028[2] = MixedSupport105.computeString1370(byteArrayLocal264, 2);
          }
          byteArrayLocal265 = MixedSupport067.computeByteArray0840(-87, "main_menu_ticker,3");
          if (null != byteArrayLocal265) {
            GameDomainSupport005.stringArrayState0028[3] = MixedSupport105.computeString1370(byteArrayLocal265, 2);
          }
          byteArrayLocal266 = MixedSupport067.computeByteArray0840(-101, "devquote");
          if (byteArrayLocal266 != null) {
            UiComponentPart023.stringState0424 = MixedSupport105.computeString1370(byteArrayLocal266, 2);
          }
          MixedSupport096.resourceArchiveState0014 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal267) {
          caughtExceptionLocal4 = caughtParameterLocal267;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("sh.B(").append(booleanArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    static {
        stringState0501 = "Drawn";
        stringState0503 = "Colours in play:";
        stringState0502 = "<%0> has dropped out.";
        stringState0504 = "Retry";
    }
}
