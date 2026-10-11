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

    public static void performAction1698(byte byteArgument1) {
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "sh.C(" + byteArgument1 + ')');
        }
    }

    final static void performAction1699(int integerArgument1) {
        try {
          MixedSupport070.stringState0295 = null;
          MixedSupport152.booleanState0222 = false;
          UiComponentPart022.integerState0573 = -1;
          ClientException.integerState0142 = -1;
          MixedSupport066.integerState0341 = integerArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "sh.D(" + integerArgument1 + ')');
        }
    }

    final static void performAction1702(byte[] byteArrayArgument1, int integerArgument2, int integerArgument3, int[] integerArrayArgument4, int integerArgument5) {
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
            GameAssets.performAction1699(-65);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static void performAction1700(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, RgbSprite rgbSpriteArgument8, int integerArgument9) {
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
            GameAssets.performAction1702((byte[]) null, 13, 74, (int[]) null, -77);
          }
          integerLocal4 = integerArgument9 + rgbSpriteArgument8.integerState0256 + (rgbSpriteArgument8.integerState0255 >> 1);
          SoftwareRaster.performAction0742(integerLocal2, 0, integerLocal3, integerLocal4 + integerArgument6);
          rgbSpriteArgument8.performAction0317(-1 + integerArgument4, integerArgument9 - 1, integerArgument2);
          rgbSpriteArgument8.performAction0317(integerArgument4 - 1, integerArgument9 + 1, integerArgument2);
          SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
          SoftwareRaster.performAction0742(integerLocal2 + 1, 0, integerLocal3 + 1, integerArgument6 + integerLocal4);
          rgbSpriteArgument8.performAction0317(integerArgument4 + 1, -1 + integerArgument9, integerArgument2);
          rgbSpriteArgument8.performAction0317(1 + integerArgument4, integerArgument9 + 1, integerArgument2);
          SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
          integerLocal10 = -integerArgument1 - integerArgument7 + integerArgument4 + rgbSpriteArgument8.integerState0259 + rgbSpriteArgument8.integerState0258;
          integerLocal9 = -integerArgument5 + (-integerArgument7 + rgbSpriteArgument8.integerState0258 + rgbSpriteArgument8.integerState0259) + integerArgument4;
          SoftwareRaster.performAction0742(integerLocal9, -integerArgument6 + integerLocal4, integerLocal10, 480);
          rgbSpriteArgument8.performAction0317(integerArgument4 - 1, -1 + integerArgument9, integerArgument2);
          rgbSpriteArgument8.performAction0317(integerArgument4 - 1, 1 + integerArgument9, integerArgument2);
          SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
          SoftwareRaster.performAction0742(1 + integerLocal9, integerLocal4 - integerArgument6, integerLocal10 + 1, 480);
          rgbSpriteArgument8.performAction0317(1 + integerArgument4, -1 + integerArgument9, integerArgument2);
          rgbSpriteArgument8.performAction0317(integerArgument4 + 1, integerArgument9 + 1, integerArgument2);
          SoftwareRaster.performAction0723(UiComponentPart013.integerArrayState0055);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument9).append(')').toString());
        }
    }

    final static void performAction1701(boolean booleanArgument1, ResourceArchive resourceArchiveArgument2) {
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
          MixedSupport101.resourceArchiveState0014 = resourceArchiveArgument2;
          byteArrayLocal5 = MixedSupport071.computeByteArray0954(-24, "gamename");
          if (byteArrayLocal5 != null) {
            UiComponentPart023.stringState0425 = MixedSupport110.computeString1552(byteArrayLocal5, 2);
          }
          byteArrayLocal7 = MixedSupport071.computeByteArray0954(-18, "benefits,0");
          if (null != byteArrayLocal7) {
            MixedSupport003.stringArrayState0001[0] = MixedSupport110.computeString1552(byteArrayLocal7, 2);
          }
          byteArrayLocal8 = MixedSupport071.computeByteArray0954(-116, "benefits,1");
          if (null != byteArrayLocal8) {
            MixedSupport003.stringArrayState0001[1] = MixedSupport110.computeString1552(byteArrayLocal8, 2);
          }
          byteArrayLocal9 = MixedSupport071.computeByteArray0954(-72, "benefits,2");
          if (null != byteArrayLocal9) {
            MixedSupport003.stringArrayState0001[2] = MixedSupport110.computeString1552(byteArrayLocal9, 2);
          }
          byteArrayLocal10 = MixedSupport071.computeByteArray0954(-52, "benefits,3");
          if (byteArrayLocal10 != null) {
            MixedSupport003.stringArrayState0001[3] = MixedSupport110.computeString1552(byteArrayLocal10, 2);
          }
          byteArrayLocal11 = MixedSupport071.computeByteArray0954(-30, "benefits,4");
          if (byteArrayLocal11 != null) {
            MixedSupport003.stringArrayState0001[4] = MixedSupport110.computeString1552(byteArrayLocal11, 2);
          }
          byteArrayLocal12 = MixedSupport071.computeByteArray0954(-29, "benefits,5");
          if (null != byteArrayLocal12) {
            MixedSupport003.stringArrayState0001[5] = MixedSupport110.computeString1552(byteArrayLocal12, 2);
          }
          byteArrayLocal13 = MixedSupport071.computeByteArray0954(-58, "waitingfor_backgrounds");
          if (null != byteArrayLocal13) {
            MixedSupport108.stringState0436 = MixedSupport110.computeString1552(byteArrayLocal13, 2);
          }
          byteArrayLocal14 = MixedSupport071.computeByteArray0954(-68, "loading_backgrounds");
          if (null != byteArrayLocal14) {
            MixedSupport045.stringState0192 = MixedSupport110.computeString1552(byteArrayLocal14, 2);
          }
          byteArrayLocal15 = MixedSupport071.computeByteArray0954(-75, "mp_x_players_wanttodraw");
          if (byteArrayLocal15 != null) {
            SocketFactory.stringState0613 = MixedSupport110.computeString1552(byteArrayLocal15, 2);
          }
          byteArrayLocal16 = MixedSupport071.computeByteArray0954(-77, "press_esc_to_accept");
          if (byteArrayLocal16 != null) {
            RenderingSupport002.stringState0086 = MixedSupport110.computeString1552(byteArrayLocal16, 2);
          }
          byteArrayLocal17 = MixedSupport071.computeByteArray0954(-112, "keycode_rotateleft");
          if (null != byteArrayLocal17) {
            NetworkSupport008.integerState0558 = byteArrayLocal17[0] & 255;
          }
          byteArrayLocal18 = MixedSupport071.computeByteArray0954(-90, "keycode_rotateright");
          if (null != byteArrayLocal18) {
            MixedSupport139.integerState0821 = byteArrayLocal18[0] & 255;
          }
          byteArrayLocal19 = MixedSupport071.computeByteArray0954(-76, "rated_membersonly");
          if (byteArrayLocal19 != null) {
            MixedSupport137.stringState0562 = MixedSupport110.computeString1552(byteArrayLocal19, 2);
          }
          byteArrayLocal20 = MixedSupport071.computeByteArray0954(-97, "staminamode");
          if (null != byteArrayLocal20) {
            NetworkSupport004.stringState0209 = MixedSupport110.computeString1552(byteArrayLocal20, 2);
          }
          byteArrayLocal21 = MixedSupport071.computeByteArray0954(-63, "masterchallenge");
          if (byteArrayLocal21 != null) {
            UiComponentPart002.stringState0037 = MixedSupport110.computeString1552(byteArrayLocal21, 2);
          }
          byteArrayLocal22 = MixedSupport071.computeByteArray0954(-54, "challenge_highscores");
          if (null != byteArrayLocal22) {
            MixedSupport138.stringState0567 = MixedSupport110.computeString1552(byteArrayLocal22, 2);
          }
          byteArrayLocal23 = MixedSupport071.computeByteArray0954(-103, "stamina_highscores");
          if (null != byteArrayLocal23) {
            MixedSupport006.stringState0028 = MixedSupport110.computeString1552(byteArrayLocal23, 2);
          }
          byteArrayLocal24 = MixedSupport071.computeByteArray0954(-125, "multiplayer_rankings");
          if (null != byteArrayLocal24) {
            MixedSupport131.stringState0542 = MixedSupport110.computeString1552(byteArrayLocal24, 2);
          }
          byteArrayLocal25 = MixedSupport071.computeByteArray0954(-113, "player");
          if (null != byteArrayLocal25) {
            MixedSupport133.stringState0550 = MixedSupport110.computeString1552(byteArrayLocal25, 2);
          }
          byteArrayLocal26 = MixedSupport071.computeByteArray0954(-106, "status");
          if (null != byteArrayLocal26) {
            UiComponentPart031.stringState0529 = MixedSupport110.computeString1552(byteArrayLocal26, 2);
          }
          byteArrayLocal27 = MixedSupport071.computeByteArray0954(-46, "position");
          if (byteArrayLocal27 != null) {
            MixedSupport100.stringState0399 = MixedSupport110.computeString1552(byteArrayLocal27, 2);
          }
          byteArrayLocal28 = MixedSupport071.computeByteArray0954(-126, "winner");
          if (null != byteArrayLocal28) {
            ReturnedShapeCache.stringState0385 = MixedSupport110.computeString1552(byteArrayLocal28, 2);
          }
          byteArrayLocal29 = MixedSupport071.computeByteArray0954(-111, "drawn");
          if (byteArrayLocal29 != null) {
            ReturnedShapeCache.stringState0386 = MixedSupport110.computeString1552(byteArrayLocal29, 2);
          }
          byteArrayLocal30 = MixedSupport071.computeByteArray0954(-78, "playing");
          if (null != byteArrayLocal30) {
            MixedSupport031.stringState0151 = MixedSupport110.computeString1552(byteArrayLocal30, 2);
          }
          byteArrayLocal31 = MixedSupport071.computeByteArray0954(-116, "resigned");
          if (null != byteArrayLocal31) {
            MixedSupport141.stringState0578 = MixedSupport110.computeString1552(byteArrayLocal31, 2);
          }
          byteArrayLocal32 = MixedSupport071.computeByteArray0954(-119, "left");
          if (null != byteArrayLocal32) {
            AudioSupport004.stringState0466 = MixedSupport110.computeString1552(byteArrayLocal32, 2);
          }
          byteArrayLocal33 = MixedSupport071.computeByteArray0954(-108, "defeated");
          if (byteArrayLocal33 != null) {
            PacketBuffer.stringState0631 = MixedSupport110.computeString1552(byteArrayLocal33, 2);
          }
          byteArrayLocal34 = MixedSupport071.computeByteArray0954(-58, "rematch_request");
          if (byteArrayLocal34 != null) {
            SocketFactory.stringState0612 = MixedSupport110.computeString1552(byteArrayLocal34, 2);
          }
          byteArrayLocal35 = MixedSupport071.computeByteArray0954(-95, "draw_request");
          if (byteArrayLocal35 != null) {
            MixedSupport121.stringState0513 = MixedSupport110.computeString1552(byteArrayLocal35, 2);
          }
          byteArrayLocal36 = MixedSupport071.computeByteArray0954(-21, "ready");
          if (null != byteArrayLocal36) {
            MixedSupport133.stringState0551 = MixedSupport110.computeString1552(byteArrayLocal36, 2);
          }
          byteArrayLocal37 = MixedSupport071.computeByteArray0954(-82, "steady");
          if (null != byteArrayLocal37) {
            MusicTrack.stringState0560 = MixedSupport110.computeString1552(byteArrayLocal37, 2);
          }
          byteArrayLocal38 = MixedSupport071.computeByteArray0954(-80, "total");
          if (byteArrayLocal38 != null) {
            InputAdapter004.stringState0357 = MixedSupport110.computeString1552(byteArrayLocal38, 2);
          }
          byteArrayLocal39 = MixedSupport071.computeByteArray0954(-31, "settling_score");
          if (byteArrayLocal39 != null) {
            MixedSupport128.stringState0530 = MixedSupport110.computeString1552(byteArrayLocal39, 2);
          }
          byteArrayLocal40 = MixedSupport071.computeByteArray0954(-44, "matching_score");
          if (byteArrayLocal40 != null) {
            UiComponentPart030.stringState0519 = MixedSupport110.computeString1552(byteArrayLocal40, 2);
          }
          if (booleanArgument1) {
            return;
          }
          byteArrayLocal41 = MixedSupport071.computeByteArray0954(-42, "eliminate_score");
          if (null != byteArrayLocal41) {
            MixedSupport061.stringState0256 = MixedSupport110.computeString1552(byteArrayLocal41, 2);
          }
          byteArrayLocal42 = MixedSupport071.computeByteArray0954(-51, "simultaneous_bonus");
          if (null != byteArrayLocal42) {
            MixedSupport066.stringState0272 = MixedSupport110.computeString1552(byteArrayLocal42, 2);
          }
          byteArrayLocal43 = MixedSupport071.computeByteArray0954(-117, "chain_bonus");
          if (byteArrayLocal43 != null) {
            MixedSupport155.stringState0635 = MixedSupport110.computeString1552(byteArrayLocal43, 2);
          }
          byteArrayLocal44 = MixedSupport071.computeByteArray0954(-105, "special_item_bonus");
          if (byteArrayLocal44 != null) {
            MixedSupport099.stringState0397 = MixedSupport110.computeString1552(byteArrayLocal44, 2);
          }
          byteArrayLocal45 = MixedSupport071.computeByteArray0954(-23, "fast_drop_bonus");
          if (null != byteArrayLocal45) {
            UiComponentPart025.stringState0449 = MixedSupport110.computeString1552(byteArrayLocal45, 2);
          }
          byteArrayLocal46 = MixedSupport071.computeByteArray0954(-21, "press_space_or_enter");
          if (byteArrayLocal46 != null) {
            MixedSupport006.stringState0029 = MixedSupport110.computeString1552(byteArrayLocal46, 2);
          }
          byteArrayLocal47 = MixedSupport071.computeByteArray0954(-102, "shape_feedback");
          if (null != byteArrayLocal47) {
            Framebuffer.stringState0154 = MixedSupport110.computeString1552(byteArrayLocal47, 2);
          }
          byteArrayLocal48 = MixedSupport071.computeByteArray0954(-126, "colours_in_play");
          if (null != byteArrayLocal48) {
            stringState0503 = MixedSupport110.computeString1552(byteArrayLocal48, 2);
          }
          byteArrayLocal49 = MixedSupport071.computeByteArray0954(-17, "specials_enabled");
          if (byteArrayLocal49 != null) {
            UiComponentPart018.stringState0344 = MixedSupport110.computeString1552(byteArrayLocal49, 2);
          }
          byteArrayLocal50 = MixedSupport071.computeByteArray0954(-86, "stage_colon");
          if (null != byteArrayLocal50) {
            MixedSupport108.stringState0437 = MixedSupport110.computeString1552(byteArrayLocal50, 2);
          }
          byteArrayLocal51 = MixedSupport071.computeByteArray0954(-127, "theme_colon");
          if (byteArrayLocal51 != null) {
            CodecSupport003.stringState0469 = MixedSupport110.computeString1552(byteArrayLocal51, 2);
          }
          byteArrayLocal52 = MixedSupport071.computeByteArray0954(-29, "theme_x_strategy");
          if (null != byteArrayLocal52) {
            DekoBlokoClient.stringState0095 = MixedSupport110.computeString1552(byteArrayLocal52, 2);
          }
          byteArrayLocal53 = MixedSupport071.computeByteArray0954(-65, "hs_theme");
          if (byteArrayLocal53 != null) {
            MixedSupport001.stringState0002 = MixedSupport110.computeString1552(byteArrayLocal53, 2);
          }
          byteArrayLocal54 = MixedSupport071.computeByteArray0954(-33, "fruit");
          if (null != byteArrayLocal54) {
            MixedSupport144.stringState0588 = MixedSupport110.computeString1552(byteArrayLocal54, 2);
          }
          byteArrayLocal55 = MixedSupport071.computeByteArray0954(-90, "animals");
          if (null != byteArrayLocal55) {
            UiComponentPart030.stringState0520 = MixedSupport110.computeString1552(byteArrayLocal55, 2);
          }
          byteArrayLocal56 = MixedSupport071.computeByteArray0954(-80, "breakfast");
          if (null != byteArrayLocal56) {
            MixedSupport131.stringState0545 = MixedSupport110.computeString1552(byteArrayLocal56, 2);
          }
          byteArrayLocal57 = MixedSupport071.computeByteArray0954(-111, "bugs");
          if (byteArrayLocal57 != null) {
            MixedSupport075.stringState0317 = MixedSupport110.computeString1552(byteArrayLocal57, 2);
          }
          byteArrayLocal58 = MixedSupport071.computeByteArray0954(-24, "flowers");
          if (byteArrayLocal58 != null) {
            MixedSupport026.stringState0128 = MixedSupport110.computeString1552(byteArrayLocal58, 2);
          }
          byteArrayLocal59 = MixedSupport071.computeByteArray0954(-16, "undersea");
          if (byteArrayLocal59 != null) {
            RichTextLayout.stringState0135 = MixedSupport110.computeString1552(byteArrayLocal59, 2);
          }
          byteArrayLocal60 = MixedSupport071.computeByteArray0954(-21, "city");
          if (byteArrayLocal60 != null) {
            MixedSupport077.stringState0321 = MixedSupport110.computeString1552(byteArrayLocal60, 2);
          }
          byteArrayLocal61 = MixedSupport071.computeByteArray0954(-47, "eightbit");
          if (byteArrayLocal61 != null) {
            UiComponentPart022.stringState0401 = MixedSupport110.computeString1552(byteArrayLocal61, 2);
          }
          byteArrayLocal62 = MixedSupport071.computeByteArray0954(-29, "hs_stage");
          if (null != byteArrayLocal62) {
            MixedSupport090.stringState0362 = MixedSupport110.computeString1552(byteArrayLocal62, 2);
          }
          byteArrayLocal63 = MixedSupport071.computeByteArray0954(-38, "stage_x");
          if (byteArrayLocal63 != null) {
            UiComponentPart009.stringState0126 = MixedSupport110.computeString1552(byteArrayLocal63, 2);
          }
          byteArrayLocal64 = MixedSupport071.computeByteArray0954(-125, "number_colon_name");
          if (null != byteArrayLocal64) {
            UiComponentPart015.stringState0252 = MixedSupport110.computeString1552(byteArrayLocal64, 2);
          }
          byteArrayLocal65 = MixedSupport071.computeByteArray0954(-61, "number_colon");
          if (byteArrayLocal65 != null) {
            MixedSupport074.stringState0315 = MixedSupport110.computeString1552(byteArrayLocal65, 2);
          }
          byteArrayLocal66 = MixedSupport071.computeByteArray0954(-115, "unlock_masterchallenge_free");
          if (byteArrayLocal66 != null) {
            MixedSupport110.computeString1552(byteArrayLocal66, 2);
          }
          byteArrayLocal67 = MixedSupport071.computeByteArray0954(-18, "unlock_masterchallenge_members");
          if (null != byteArrayLocal67) {
            MixedSupport114.stringState0478 = MixedSupport110.computeString1552(byteArrayLocal67, 2);
          }
          byteArrayLocal68 = MixedSupport071.computeByteArray0954(-21, "achievement_names,0");
          if (byteArrayLocal68 != null) {
            BufferedSocket.stringArrayState0035[0] = MixedSupport110.computeString1552(byteArrayLocal68, 2);
          }
          byteArrayLocal69 = MixedSupport071.computeByteArray0954(-30, "achievement_names,1");
          if (byteArrayLocal69 != null) {
            BufferedSocket.stringArrayState0035[1] = MixedSupport110.computeString1552(byteArrayLocal69, 2);
          }
          byteArrayLocal70 = MixedSupport071.computeByteArray0954(-34, "achievement_names,2");
          if (null != byteArrayLocal70) {
            BufferedSocket.stringArrayState0035[2] = MixedSupport110.computeString1552(byteArrayLocal70, 2);
          }
          byteArrayLocal71 = MixedSupport071.computeByteArray0954(-59, "achievement_names,3");
          if (null != byteArrayLocal71) {
            BufferedSocket.stringArrayState0035[3] = MixedSupport110.computeString1552(byteArrayLocal71, 2);
          }
          byteArrayLocal72 = MixedSupport071.computeByteArray0954(-39, "achievement_names,4");
          if (byteArrayLocal72 != null) {
            BufferedSocket.stringArrayState0035[4] = MixedSupport110.computeString1552(byteArrayLocal72, 2);
          }
          byteArrayLocal73 = MixedSupport071.computeByteArray0954(-123, "achievement_names,5");
          if (byteArrayLocal73 != null) {
            BufferedSocket.stringArrayState0035[5] = MixedSupport110.computeString1552(byteArrayLocal73, 2);
          }
          byteArrayLocal74 = MixedSupport071.computeByteArray0954(-105, "achievement_names,6");
          if (null != byteArrayLocal74) {
            BufferedSocket.stringArrayState0035[6] = MixedSupport110.computeString1552(byteArrayLocal74, 2);
          }
          byteArrayLocal75 = MixedSupport071.computeByteArray0954(-119, "achievement_names,7");
          if (null != byteArrayLocal75) {
            BufferedSocket.stringArrayState0035[7] = MixedSupport110.computeString1552(byteArrayLocal75, 2);
          }
          byteArrayLocal76 = MixedSupport071.computeByteArray0954(-68, "achievement_names,8");
          if (byteArrayLocal76 != null) {
            BufferedSocket.stringArrayState0035[8] = MixedSupport110.computeString1552(byteArrayLocal76, 2);
          }
          byteArrayLocal77 = MixedSupport071.computeByteArray0954(-51, "achievement_names,9");
          if (byteArrayLocal77 != null) {
            BufferedSocket.stringArrayState0035[9] = MixedSupport110.computeString1552(byteArrayLocal77, 2);
          }
          byteArrayLocal78 = MixedSupport071.computeByteArray0954(-18, "achievement_names,10");
          if (byteArrayLocal78 != null) {
            BufferedSocket.stringArrayState0035[10] = MixedSupport110.computeString1552(byteArrayLocal78, 2);
          }
          byteArrayLocal79 = MixedSupport071.computeByteArray0954(-25, "achievement_names,11");
          if (null != byteArrayLocal79) {
            BufferedSocket.stringArrayState0035[11] = MixedSupport110.computeString1552(byteArrayLocal79, 2);
          }
          byteArrayLocal80 = MixedSupport071.computeByteArray0954(-60, "achievement_names,12");
          if (null != byteArrayLocal80) {
            BufferedSocket.stringArrayState0035[12] = MixedSupport110.computeString1552(byteArrayLocal80, 2);
          }
          byteArrayLocal81 = MixedSupport071.computeByteArray0954(-105, "achievement_names,13");
          if (null != byteArrayLocal81) {
            BufferedSocket.stringArrayState0035[13] = MixedSupport110.computeString1552(byteArrayLocal81, 2);
          }
          byteArrayLocal82 = MixedSupport071.computeByteArray0954(-21, "achievement_names,14");
          if (byteArrayLocal82 != null) {
            BufferedSocket.stringArrayState0035[14] = MixedSupport110.computeString1552(byteArrayLocal82, 2);
          }
          byteArrayLocal83 = MixedSupport071.computeByteArray0954(-119, "achievement_names,15");
          if (null != byteArrayLocal83) {
            BufferedSocket.stringArrayState0035[15] = MixedSupport110.computeString1552(byteArrayLocal83, 2);
          }
          byteArrayLocal84 = MixedSupport071.computeByteArray0954(-26, "achievement_names,16");
          if (null != byteArrayLocal84) {
            BufferedSocket.stringArrayState0035[16] = MixedSupport110.computeString1552(byteArrayLocal84, 2);
          }
          byteArrayLocal85 = MixedSupport071.computeByteArray0954(-110, "achievement_names,17");
          if (byteArrayLocal85 != null) {
            BufferedSocket.stringArrayState0035[17] = MixedSupport110.computeString1552(byteArrayLocal85, 2);
          }
          byteArrayLocal86 = MixedSupport071.computeByteArray0954(-91, "achievement_names,18");
          if (byteArrayLocal86 != null) {
            BufferedSocket.stringArrayState0035[18] = MixedSupport110.computeString1552(byteArrayLocal86, 2);
          }
          byteArrayLocal87 = MixedSupport071.computeByteArray0954(-30, "achievement_names,19");
          if (null != byteArrayLocal87) {
            BufferedSocket.stringArrayState0035[19] = MixedSupport110.computeString1552(byteArrayLocal87, 2);
          }
          byteArrayLocal88 = MixedSupport071.computeByteArray0954(-49, "achievement_names,20");
          if (byteArrayLocal88 != null) {
            BufferedSocket.stringArrayState0035[20] = MixedSupport110.computeString1552(byteArrayLocal88, 2);
          }
          byteArrayLocal89 = MixedSupport071.computeByteArray0954(-79, "achievement_names,21");
          if (null != byteArrayLocal89) {
            BufferedSocket.stringArrayState0035[21] = MixedSupport110.computeString1552(byteArrayLocal89, 2);
          }
          byteArrayLocal90 = MixedSupport071.computeByteArray0954(-40, "achievement_names,22");
          if (null != byteArrayLocal90) {
            BufferedSocket.stringArrayState0035[22] = MixedSupport110.computeString1552(byteArrayLocal90, 2);
          }
          byteArrayLocal91 = MixedSupport071.computeByteArray0954(-108, "achievement_names,23");
          if (byteArrayLocal91 != null) {
            BufferedSocket.stringArrayState0035[23] = MixedSupport110.computeString1552(byteArrayLocal91, 2);
          }
          byteArrayLocal92 = MixedSupport071.computeByteArray0954(-78, "achievement_names,24");
          if (null != byteArrayLocal92) {
            BufferedSocket.stringArrayState0035[24] = MixedSupport110.computeString1552(byteArrayLocal92, 2);
          }
          byteArrayLocal93 = MixedSupport071.computeByteArray0954(-118, "achievement_names,25");
          if (byteArrayLocal93 != null) {
            BufferedSocket.stringArrayState0035[25] = MixedSupport110.computeString1552(byteArrayLocal93, 2);
          }
          byteArrayLocal94 = MixedSupport071.computeByteArray0954(-76, "achievement_names,26");
          if (null != byteArrayLocal94) {
            BufferedSocket.stringArrayState0035[26] = MixedSupport110.computeString1552(byteArrayLocal94, 2);
          }
          byteArrayLocal95 = MixedSupport071.computeByteArray0954(-57, "achievement_names,27");
          if (null != byteArrayLocal95) {
            BufferedSocket.stringArrayState0035[27] = MixedSupport110.computeString1552(byteArrayLocal95, 2);
          }
          byteArrayLocal96 = MixedSupport071.computeByteArray0954(-118, "achievement_names,28");
          if (byteArrayLocal96 != null) {
            BufferedSocket.stringArrayState0035[28] = MixedSupport110.computeString1552(byteArrayLocal96, 2);
          }
          byteArrayLocal97 = MixedSupport071.computeByteArray0954(-42, "achievement_names,29");
          if (byteArrayLocal97 != null) {
            BufferedSocket.stringArrayState0035[29] = MixedSupport110.computeString1552(byteArrayLocal97, 2);
          }
          byteArrayLocal98 = MixedSupport071.computeByteArray0954(-39, "achievement_names,30");
          if (null != byteArrayLocal98) {
            BufferedSocket.stringArrayState0035[30] = MixedSupport110.computeString1552(byteArrayLocal98, 2);
          }
          byteArrayLocal99 = MixedSupport071.computeByteArray0954(-96, "achievement_criteria,0");
          if (byteArrayLocal99 != null) {
            GameDomainSupport004.stringArrayState0016[0] = MixedSupport110.computeString1552(byteArrayLocal99, 2);
          }
          byteArrayLocal100 = MixedSupport071.computeByteArray0954(-40, "achievement_criteria,1");
          if (byteArrayLocal100 != null) {
            GameDomainSupport004.stringArrayState0016[1] = MixedSupport110.computeString1552(byteArrayLocal100, 2);
          }
          byteArrayLocal101 = MixedSupport071.computeByteArray0954(-18, "achievement_criteria,2");
          if (byteArrayLocal101 != null) {
            GameDomainSupport004.stringArrayState0016[2] = MixedSupport110.computeString1552(byteArrayLocal101, 2);
          }
          byteArrayLocal102 = MixedSupport071.computeByteArray0954(-54, "achievement_criteria,3");
          if (null != byteArrayLocal102) {
            GameDomainSupport004.stringArrayState0016[3] = MixedSupport110.computeString1552(byteArrayLocal102, 2);
          }
          byteArrayLocal103 = MixedSupport071.computeByteArray0954(-85, "achievement_criteria,4");
          if (null != byteArrayLocal103) {
            GameDomainSupport004.stringArrayState0016[4] = MixedSupport110.computeString1552(byteArrayLocal103, 2);
          }
          byteArrayLocal104 = MixedSupport071.computeByteArray0954(-72, "achievement_criteria,5");
          if (null != byteArrayLocal104) {
            GameDomainSupport004.stringArrayState0016[5] = MixedSupport110.computeString1552(byteArrayLocal104, 2);
          }
          byteArrayLocal105 = MixedSupport071.computeByteArray0954(-93, "achievement_criteria,6");
          if (byteArrayLocal105 != null) {
            GameDomainSupport004.stringArrayState0016[6] = MixedSupport110.computeString1552(byteArrayLocal105, 2);
          }
          byteArrayLocal106 = MixedSupport071.computeByteArray0954(-88, "achievement_criteria,7");
          if (null != byteArrayLocal106) {
            GameDomainSupport004.stringArrayState0016[7] = MixedSupport110.computeString1552(byteArrayLocal106, 2);
          }
          byteArrayLocal107 = MixedSupport071.computeByteArray0954(-128, "achievement_criteria,8");
          if (null != byteArrayLocal107) {
            GameDomainSupport004.stringArrayState0016[8] = MixedSupport110.computeString1552(byteArrayLocal107, 2);
          }
          byteArrayLocal108 = MixedSupport071.computeByteArray0954(-117, "achievement_criteria,9");
          if (null != byteArrayLocal108) {
            GameDomainSupport004.stringArrayState0016[9] = MixedSupport110.computeString1552(byteArrayLocal108, 2);
          }
          byteArrayLocal109 = MixedSupport071.computeByteArray0954(-75, "achievement_criteria,10");
          if (null != byteArrayLocal109) {
            GameDomainSupport004.stringArrayState0016[10] = MixedSupport110.computeString1552(byteArrayLocal109, 2);
          }
          byteArrayLocal110 = MixedSupport071.computeByteArray0954(-86, "achievement_criteria,11");
          if (null != byteArrayLocal110) {
            GameDomainSupport004.stringArrayState0016[11] = MixedSupport110.computeString1552(byteArrayLocal110, 2);
          }
          byteArrayLocal111 = MixedSupport071.computeByteArray0954(-94, "achievement_criteria,12");
          if (null != byteArrayLocal111) {
            GameDomainSupport004.stringArrayState0016[12] = MixedSupport110.computeString1552(byteArrayLocal111, 2);
          }
          byteArrayLocal112 = MixedSupport071.computeByteArray0954(-40, "achievement_criteria,13");
          if (byteArrayLocal112 != null) {
            GameDomainSupport004.stringArrayState0016[13] = MixedSupport110.computeString1552(byteArrayLocal112, 2);
          }
          byteArrayLocal113 = MixedSupport071.computeByteArray0954(-28, "achievement_criteria,14");
          if (byteArrayLocal113 != null) {
            GameDomainSupport004.stringArrayState0016[14] = MixedSupport110.computeString1552(byteArrayLocal113, 2);
          }
          byteArrayLocal114 = MixedSupport071.computeByteArray0954(-46, "achievement_criteria,15");
          if (null != byteArrayLocal114) {
            GameDomainSupport004.stringArrayState0016[15] = MixedSupport110.computeString1552(byteArrayLocal114, 2);
          }
          byteArrayLocal115 = MixedSupport071.computeByteArray0954(-82, "achievement_criteria,16");
          if (byteArrayLocal115 != null) {
            GameDomainSupport004.stringArrayState0016[16] = MixedSupport110.computeString1552(byteArrayLocal115, 2);
          }
          byteArrayLocal116 = MixedSupport071.computeByteArray0954(-61, "achievement_criteria,17");
          if (null != byteArrayLocal116) {
            GameDomainSupport004.stringArrayState0016[17] = MixedSupport110.computeString1552(byteArrayLocal116, 2);
          }
          byteArrayLocal117 = MixedSupport071.computeByteArray0954(-87, "achievement_criteria,18");
          if (byteArrayLocal117 != null) {
            GameDomainSupport004.stringArrayState0016[18] = MixedSupport110.computeString1552(byteArrayLocal117, 2);
          }
          byteArrayLocal118 = MixedSupport071.computeByteArray0954(-62, "achievement_criteria,19");
          if (byteArrayLocal118 != null) {
            GameDomainSupport004.stringArrayState0016[19] = MixedSupport110.computeString1552(byteArrayLocal118, 2);
          }
          byteArrayLocal119 = MixedSupport071.computeByteArray0954(-123, "achievement_criteria,20");
          if (byteArrayLocal119 != null) {
            GameDomainSupport004.stringArrayState0016[20] = MixedSupport110.computeString1552(byteArrayLocal119, 2);
          }
          byteArrayLocal120 = MixedSupport071.computeByteArray0954(-97, "achievement_criteria,21");
          if (byteArrayLocal120 != null) {
            GameDomainSupport004.stringArrayState0016[21] = MixedSupport110.computeString1552(byteArrayLocal120, 2);
          }
          byteArrayLocal121 = MixedSupport071.computeByteArray0954(-111, "achievement_criteria,22");
          if (null != byteArrayLocal121) {
            GameDomainSupport004.stringArrayState0016[22] = MixedSupport110.computeString1552(byteArrayLocal121, 2);
          }
          byteArrayLocal122 = MixedSupport071.computeByteArray0954(-38, "achievement_criteria,23");
          if (byteArrayLocal122 != null) {
            GameDomainSupport004.stringArrayState0016[23] = MixedSupport110.computeString1552(byteArrayLocal122, 2);
          }
          byteArrayLocal123 = MixedSupport071.computeByteArray0954(-86, "achievement_criteria,24");
          if (byteArrayLocal123 != null) {
            GameDomainSupport004.stringArrayState0016[24] = MixedSupport110.computeString1552(byteArrayLocal123, 2);
          }
          byteArrayLocal124 = MixedSupport071.computeByteArray0954(-51, "achievement_criteria,25");
          if (byteArrayLocal124 != null) {
            GameDomainSupport004.stringArrayState0016[25] = MixedSupport110.computeString1552(byteArrayLocal124, 2);
          }
          byteArrayLocal125 = MixedSupport071.computeByteArray0954(-117, "achievement_criteria,26");
          if (byteArrayLocal125 != null) {
            GameDomainSupport004.stringArrayState0016[26] = MixedSupport110.computeString1552(byteArrayLocal125, 2);
          }
          byteArrayLocal126 = MixedSupport071.computeByteArray0954(-109, "achievement_criteria,27");
          if (null != byteArrayLocal126) {
            GameDomainSupport004.stringArrayState0016[27] = MixedSupport110.computeString1552(byteArrayLocal126, 2);
          }
          byteArrayLocal127 = MixedSupport071.computeByteArray0954(-21, "achievement_criteria,28");
          if (null != byteArrayLocal127) {
            GameDomainSupport004.stringArrayState0016[28] = MixedSupport110.computeString1552(byteArrayLocal127, 2);
          }
          byteArrayLocal128 = MixedSupport071.computeByteArray0954(-16, "achievement_criteria,29");
          if (null != byteArrayLocal128) {
            GameDomainSupport004.stringArrayState0016[29] = MixedSupport110.computeString1552(byteArrayLocal128, 2);
          }
          byteArrayLocal129 = MixedSupport071.computeByteArray0954(-97, "achievement_criteria,30");
          if (byteArrayLocal129 != null) {
            GameDomainSupport004.stringArrayState0016[30] = MixedSupport110.computeString1552(byteArrayLocal129, 2);
          }
          byteArrayLocal130 = MixedSupport071.computeByteArray0954(-68, "gameoptlabels,0");
          if (byteArrayLocal130 != null) {
            NodeHashTable.stringArrayState0045[0] = MixedSupport110.computeString1552(byteArrayLocal130, 2);
          }
          byteArrayLocal131 = MixedSupport071.computeByteArray0954(-72, "gameoptlabels,1");
          if (null != byteArrayLocal131) {
            NodeHashTable.stringArrayState0045[1] = MixedSupport110.computeString1552(byteArrayLocal131, 2);
          }
          byteArrayLocal132 = MixedSupport071.computeByteArray0954(-25, "gameoptlabels,2");
          if (null != byteArrayLocal132) {
            NodeHashTable.stringArrayState0045[2] = MixedSupport110.computeString1552(byteArrayLocal132, 2);
          }
          byteArrayLocal133 = MixedSupport071.computeByteArray0954(-126, "gameoptlabels,3");
          if (null != byteArrayLocal133) {
            NodeHashTable.stringArrayState0045[3] = MixedSupport110.computeString1552(byteArrayLocal133, 2);
          }
          byteArrayLocal134 = MixedSupport071.computeByteArray0954(-90, "gameoptlabels,4");
          if (byteArrayLocal134 != null) {
            NodeHashTable.stringArrayState0045[4] = MixedSupport110.computeString1552(byteArrayLocal134, 2);
          }
          byteArrayLocal135 = MixedSupport071.computeByteArray0954(-58, "gameopt_buttonnames,0,0");
          if (null != byteArrayLocal135) {
            MixedSupport127.stringArrayArrayState0008[0][0] = MixedSupport110.computeString1552(byteArrayLocal135, 2);
          }
          byteArrayLocal136 = MixedSupport071.computeByteArray0954(-116, "gameopt_buttonnames,0,1");
          if (byteArrayLocal136 != null) {
            MixedSupport127.stringArrayArrayState0008[0][1] = MixedSupport110.computeString1552(byteArrayLocal136, 2);
          }
          byteArrayLocal137 = MixedSupport071.computeByteArray0954(-64, "gameopt_buttonnames,1,0");
          if (null != byteArrayLocal137) {
            MixedSupport127.stringArrayArrayState0008[1][0] = MixedSupport110.computeString1552(byteArrayLocal137, 2);
          }
          byteArrayLocal138 = MixedSupport071.computeByteArray0954(-104, "gameopt_buttonnames,1,1");
          if (null != byteArrayLocal138) {
            MixedSupport127.stringArrayArrayState0008[1][1] = MixedSupport110.computeString1552(byteArrayLocal138, 2);
          }
          byteArrayLocal139 = MixedSupport071.computeByteArray0954(-77, "gameopt_buttonnames,1,2");
          if (null != byteArrayLocal139) {
            MixedSupport127.stringArrayArrayState0008[1][2] = MixedSupport110.computeString1552(byteArrayLocal139, 2);
          }
          byteArrayLocal140 = MixedSupport071.computeByteArray0954(-25, "gameopt_buttonnames,1,3");
          if (null != byteArrayLocal140) {
            MixedSupport127.stringArrayArrayState0008[1][3] = MixedSupport110.computeString1552(byteArrayLocal140, 2);
          }
          byteArrayLocal141 = MixedSupport071.computeByteArray0954(-37, "gameopt_buttonnames,1,4");
          if (byteArrayLocal141 != null) {
            MixedSupport127.stringArrayArrayState0008[1][4] = MixedSupport110.computeString1552(byteArrayLocal141, 2);
          }
          byteArrayLocal142 = MixedSupport071.computeByteArray0954(-105, "gameopt_buttonnames,2,0");
          if (null != byteArrayLocal142) {
            MixedSupport127.stringArrayArrayState0008[2][0] = MixedSupport110.computeString1552(byteArrayLocal142, 2);
          }
          byteArrayLocal143 = MixedSupport071.computeByteArray0954(-37, "gameopt_buttonnames,2,1");
          if (byteArrayLocal143 != null) {
            MixedSupport127.stringArrayArrayState0008[2][1] = MixedSupport110.computeString1552(byteArrayLocal143, 2);
          }
          byteArrayLocal144 = MixedSupport071.computeByteArray0954(-37, "gameopt_buttonnames,2,2");
          if (byteArrayLocal144 != null) {
            MixedSupport127.stringArrayArrayState0008[2][2] = MixedSupport110.computeString1552(byteArrayLocal144, 2);
          }
          byteArrayLocal145 = MixedSupport071.computeByteArray0954(-46, "gameopt_buttonnames,2,3");
          if (null != byteArrayLocal145) {
            MixedSupport127.stringArrayArrayState0008[2][3] = MixedSupport110.computeString1552(byteArrayLocal145, 2);
          }
          byteArrayLocal146 = MixedSupport071.computeByteArray0954(-101, "gameopt_buttonnames,2,4");
          if (null != byteArrayLocal146) {
            MixedSupport127.stringArrayArrayState0008[2][4] = MixedSupport110.computeString1552(byteArrayLocal146, 2);
          }
          byteArrayLocal147 = MixedSupport071.computeByteArray0954(-50, "gameopt_buttonnames,3,0");
          if (byteArrayLocal147 != null) {
            MixedSupport127.stringArrayArrayState0008[3][0] = MixedSupport110.computeString1552(byteArrayLocal147, 2);
          }
          byteArrayLocal148 = MixedSupport071.computeByteArray0954(-106, "gameopt_buttonnames,3,1");
          if (null != byteArrayLocal148) {
            MixedSupport127.stringArrayArrayState0008[3][1] = MixedSupport110.computeString1552(byteArrayLocal148, 2);
          }
          byteArrayLocal149 = MixedSupport071.computeByteArray0954(-63, "gameopt_buttonnames,3,2");
          if (null != byteArrayLocal149) {
            MixedSupport127.stringArrayArrayState0008[3][2] = MixedSupport110.computeString1552(byteArrayLocal149, 2);
          }
          byteArrayLocal150 = MixedSupport071.computeByteArray0954(-49, "gameopt_buttonnames,3,3");
          if (null != byteArrayLocal150) {
            MixedSupport127.stringArrayArrayState0008[3][3] = MixedSupport110.computeString1552(byteArrayLocal150, 2);
          }
          byteArrayLocal151 = MixedSupport071.computeByteArray0954(-79, "gameopt_buttonnames,3,4");
          if (null != byteArrayLocal151) {
            MixedSupport127.stringArrayArrayState0008[3][4] = MixedSupport110.computeString1552(byteArrayLocal151, 2);
          }
          byteArrayLocal152 = MixedSupport071.computeByteArray0954(-89, "gameopt_buttonnames,4,0");
          if (byteArrayLocal152 != null) {
            MixedSupport127.stringArrayArrayState0008[4][0] = MixedSupport110.computeString1552(byteArrayLocal152, 2);
          }
          byteArrayLocal153 = MixedSupport071.computeByteArray0954(-36, "gameopt_buttonnames,4,1");
          if (byteArrayLocal153 != null) {
            MixedSupport127.stringArrayArrayState0008[4][1] = MixedSupport110.computeString1552(byteArrayLocal153, 2);
          }
          byteArrayLocal154 = MixedSupport071.computeByteArray0954(-82, "gameopt_buttonnames,4,2");
          if (null != byteArrayLocal154) {
            MixedSupport127.stringArrayArrayState0008[4][2] = MixedSupport110.computeString1552(byteArrayLocal154, 2);
          }
          byteArrayLocal155 = MixedSupport071.computeByteArray0954(-18, "gameopt_buttonnames,4,3");
          if (null != byteArrayLocal155) {
            MixedSupport127.stringArrayArrayState0008[4][3] = MixedSupport110.computeString1552(byteArrayLocal155, 2);
          }
          byteArrayLocal156 = MixedSupport071.computeByteArray0954(-121, "gameopt_tooltipnames,0,0");
          if (byteArrayLocal156 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[0][0] = MixedSupport110.computeString1552(byteArrayLocal156, 2);
          }
          byteArrayLocal157 = MixedSupport071.computeByteArray0954(-62, "gameopt_tooltipnames,0,1");
          if (null != byteArrayLocal157) {
            SceneWidgetPart009.stringArrayArrayState0007[0][1] = MixedSupport110.computeString1552(byteArrayLocal157, 2);
          }
          byteArrayLocal158 = MixedSupport071.computeByteArray0954(-71, "gameopt_tooltipnames,1,0");
          if (byteArrayLocal158 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[1][0] = MixedSupport110.computeString1552(byteArrayLocal158, 2);
          }
          byteArrayLocal159 = MixedSupport071.computeByteArray0954(-103, "gameopt_tooltipnames,1,1");
          if (byteArrayLocal159 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[1][1] = MixedSupport110.computeString1552(byteArrayLocal159, 2);
          }
          byteArrayLocal160 = MixedSupport071.computeByteArray0954(-38, "gameopt_tooltipnames,1,2");
          if (null != byteArrayLocal160) {
            SceneWidgetPart009.stringArrayArrayState0007[1][2] = MixedSupport110.computeString1552(byteArrayLocal160, 2);
          }
          byteArrayLocal161 = MixedSupport071.computeByteArray0954(-123, "gameopt_tooltipnames,1,3");
          if (byteArrayLocal161 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[1][3] = MixedSupport110.computeString1552(byteArrayLocal161, 2);
          }
          byteArrayLocal162 = MixedSupport071.computeByteArray0954(-128, "gameopt_tooltipnames,1,4");
          if (null != byteArrayLocal162) {
            SceneWidgetPart009.stringArrayArrayState0007[1][4] = MixedSupport110.computeString1552(byteArrayLocal162, 2);
          }
          byteArrayLocal163 = MixedSupport071.computeByteArray0954(-86, "gameopt_tooltipnames,2,0");
          if (byteArrayLocal163 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][0] = MixedSupport110.computeString1552(byteArrayLocal163, 2);
          }
          byteArrayLocal164 = MixedSupport071.computeByteArray0954(-43, "gameopt_tooltipnames,2,1");
          if (byteArrayLocal164 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][1] = MixedSupport110.computeString1552(byteArrayLocal164, 2);
          }
          byteArrayLocal165 = MixedSupport071.computeByteArray0954(-107, "gameopt_tooltipnames,2,2");
          if (byteArrayLocal165 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][2] = MixedSupport110.computeString1552(byteArrayLocal165, 2);
          }
          byteArrayLocal166 = MixedSupport071.computeByteArray0954(-80, "gameopt_tooltipnames,2,3");
          if (byteArrayLocal166 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[2][3] = MixedSupport110.computeString1552(byteArrayLocal166, 2);
          }
          byteArrayLocal167 = MixedSupport071.computeByteArray0954(-46, "gameopt_tooltipnames,2,4");
          if (null != byteArrayLocal167) {
            SceneWidgetPart009.stringArrayArrayState0007[2][4] = MixedSupport110.computeString1552(byteArrayLocal167, 2);
          }
          byteArrayLocal168 = MixedSupport071.computeByteArray0954(-45, "gameopt_tooltipnames,3,0");
          if (null != byteArrayLocal168) {
            SceneWidgetPart009.stringArrayArrayState0007[3][0] = MixedSupport110.computeString1552(byteArrayLocal168, 2);
          }
          byteArrayLocal169 = MixedSupport071.computeByteArray0954(-17, "gameopt_tooltipnames,3,1");
          if (null != byteArrayLocal169) {
            SceneWidgetPart009.stringArrayArrayState0007[3][1] = MixedSupport110.computeString1552(byteArrayLocal169, 2);
          }
          byteArrayLocal170 = MixedSupport071.computeByteArray0954(-51, "gameopt_tooltipnames,3,2");
          if (byteArrayLocal170 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[3][2] = MixedSupport110.computeString1552(byteArrayLocal170, 2);
          }
          byteArrayLocal171 = MixedSupport071.computeByteArray0954(-83, "gameopt_tooltipnames,3,3");
          if (null != byteArrayLocal171) {
            SceneWidgetPart009.stringArrayArrayState0007[3][3] = MixedSupport110.computeString1552(byteArrayLocal171, 2);
          }
          byteArrayLocal172 = MixedSupport071.computeByteArray0954(-118, "gameopt_tooltipnames,3,4");
          if (null != byteArrayLocal172) {
            SceneWidgetPart009.stringArrayArrayState0007[3][4] = MixedSupport110.computeString1552(byteArrayLocal172, 2);
          }
          byteArrayLocal173 = MixedSupport071.computeByteArray0954(-79, "gameopt_tooltipnames,4,0");
          if (byteArrayLocal173 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[4][0] = MixedSupport110.computeString1552(byteArrayLocal173, 2);
          }
          byteArrayLocal174 = MixedSupport071.computeByteArray0954(-116, "gameopt_tooltipnames,4,1");
          if (byteArrayLocal174 != null) {
            SceneWidgetPart009.stringArrayArrayState0007[4][1] = MixedSupport110.computeString1552(byteArrayLocal174, 2);
          }
          byteArrayLocal175 = MixedSupport071.computeByteArray0954(-63, "gameopt_tooltipnames,4,2");
          if (null != byteArrayLocal175) {
            SceneWidgetPart009.stringArrayArrayState0007[4][2] = MixedSupport110.computeString1552(byteArrayLocal175, 2);
          }
          byteArrayLocal176 = MixedSupport071.computeByteArray0954(-28, "instructions_titles_thebasics");
          if (byteArrayLocal176 != null) {
            MixedSupport072.stringState0302 = MixedSupport110.computeString1552(byteArrayLocal176, 2);
          }
          byteArrayLocal177 = MixedSupport071.computeByteArray0954(-46, "instructions_titles_thecontrols");
          if (null != byteArrayLocal177) {
            MixedSupport136.stringState0559 = MixedSupport110.computeString1552(byteArrayLocal177, 2);
          }
          byteArrayLocal178 = MixedSupport071.computeByteArray0954(-116, "instructions_titles_thetwist");
          if (byteArrayLocal178 != null) {
            MixedSupport011.stringState0054 = MixedSupport110.computeString1552(byteArrayLocal178, 2);
          }
          byteArrayLocal179 = MixedSupport071.computeByteArray0954(-58, "instructions_titles_inmultiplayer");
          if (null != byteArrayLocal179) {
            MixedSupport072.stringState0303 = MixedSupport110.computeString1552(byteArrayLocal179, 2);
          }
          byteArrayLocal180 = MixedSupport071.computeByteArray0954(-94, "instructions_titles_insingleplayer");
          if (null != byteArrayLocal180) {
            MixedSupport043.stringState0185 = MixedSupport110.computeString1552(byteArrayLocal180, 2);
          }
          byteArrayLocal181 = MixedSupport071.computeByteArray0954(-36, "instructions_titles_specialitems");
          if (null != byteArrayLocal181) {
            NetworkSupport006.stringState0339 = MixedSupport110.computeString1552(byteArrayLocal181, 2);
          }
          byteArrayLocal182 = MixedSupport071.computeByteArray0954(-28, "instructions_titles_activatingspecialitems");
          if (byteArrayLocal182 != null) {
            MixedSupport054.stringState0233 = MixedSupport110.computeString1552(byteArrayLocal182, 2);
          }
          byteArrayLocal183 = MixedSupport071.computeByteArray0954(-89, "instructions_piecesarefalling");
          if (null != byteArrayLocal183) {
            MixedSupport015.stringState0072 = MixedSupport110.computeString1552(byteArrayLocal183, 2);
          }
          byteArrayLocal184 = MixedSupport071.computeByteArray0954(-42, "instructions_matchthepieces");
          if (null != byteArrayLocal184) {
            MixedSupport026.stringState0129 = MixedSupport110.computeString1552(byteArrayLocal184, 2);
          }
          byteArrayLocal185 = MixedSupport071.computeByteArray0954(-121, "instructions_machinetransforms");
          if (byteArrayLocal185 != null) {
            ReturnedShape.stringState0474 = MixedSupport110.computeString1552(byteArrayLocal185, 2);
          }
          byteArrayLocal186 = MixedSupport071.computeByteArray0954(-62, "instructions_clearingsolids");
          if (null != byteArrayLocal186) {
            UiComponentPart028.stringState0480 = MixedSupport110.computeString1552(byteArrayLocal186, 2);
          }
          byteArrayLocal187 = MixedSupport071.computeByteArray0954(-52, "instructions_multiplayer_solids");
          if (byteArrayLocal187 != null) {
            MixedSupport024.stringState0116 = MixedSupport110.computeString1552(byteArrayLocal187, 2);
          }
          byteArrayLocal188 = MixedSupport071.computeByteArray0954(-69, "instructions_singleplayer_solids");
          if (null != byteArrayLocal188) {
            MixedSupport005.stringState0019 = MixedSupport110.computeString1552(byteArrayLocal188, 2);
          }
          byteArrayLocal189 = MixedSupport071.computeByteArray0954(-122, "instructions_wildcard");
          if (null != byteArrayLocal189) {
            CollectionSupport003.stringState0367 = MixedSupport110.computeString1552(byteArrayLocal189, 2);
          }
          byteArrayLocal190 = MixedSupport071.computeByteArray0954(-122, "instructions_gettingspecials");
          if (byteArrayLocal190 != null) {
            MixedSupport071.stringState0301 = MixedSupport110.computeString1552(byteArrayLocal190, 2);
          }
          byteArrayLocal191 = MixedSupport071.computeByteArray0954(-33, "instructions_activatingspecials");
          if (byteArrayLocal191 != null) {
            PlatformSupport002.stringState0123 = MixedSupport110.computeString1552(byteArrayLocal191, 2);
          }
          byteArrayLocal192 = MixedSupport071.computeByteArray0954(-65, "instructions_multiplayer_specials");
          if (null != byteArrayLocal192) {
            NetworkSupport005.stringState0313 = MixedSupport110.computeString1552(byteArrayLocal192, 2);
          }
          byteArrayLocal193 = MixedSupport071.computeByteArray0954(-47, "instructions_itemdescriptions,0,0");
          if (byteArrayLocal193 != null) {
            CollectionSupport003.stringArrayArrayState0006[0][0] = MixedSupport110.computeString1552(byteArrayLocal193, 2);
          }
          byteArrayLocal194 = MixedSupport071.computeByteArray0954(-17, "instructions_itemdescriptions,0,1");
          if (byteArrayLocal194 != null) {
            CollectionSupport003.stringArrayArrayState0006[0][1] = MixedSupport110.computeString1552(byteArrayLocal194, 2);
          }
          byteArrayLocal195 = MixedSupport071.computeByteArray0954(-98, "instructions_itemdescriptions,1,0");
          if (byteArrayLocal195 != null) {
            CollectionSupport003.stringArrayArrayState0006[1][0] = MixedSupport110.computeString1552(byteArrayLocal195, 2);
          }
          byteArrayLocal196 = MixedSupport071.computeByteArray0954(-103, "instructions_itemdescriptions,1,1");
          if (byteArrayLocal196 != null) {
            CollectionSupport003.stringArrayArrayState0006[1][1] = MixedSupport110.computeString1552(byteArrayLocal196, 2);
          }
          byteArrayLocal197 = MixedSupport071.computeByteArray0954(-27, "instructions_itemdescriptions,2,0");
          if (null != byteArrayLocal197) {
            CollectionSupport003.stringArrayArrayState0006[2][0] = MixedSupport110.computeString1552(byteArrayLocal197, 2);
          }
          byteArrayLocal198 = MixedSupport071.computeByteArray0954(-82, "instructions_itemdescriptions,2,1");
          if (byteArrayLocal198 != null) {
            CollectionSupport003.stringArrayArrayState0006[2][1] = MixedSupport110.computeString1552(byteArrayLocal198, 2);
          }
          byteArrayLocal199 = MixedSupport071.computeByteArray0954(-53, "instructions_itemdescriptions,3,0");
          if (byteArrayLocal199 != null) {
            CollectionSupport003.stringArrayArrayState0006[3][0] = MixedSupport110.computeString1552(byteArrayLocal199, 2);
          }
          byteArrayLocal200 = MixedSupport071.computeByteArray0954(-128, "instructions_itemdescriptions,3,1");
          if (null != byteArrayLocal200) {
            CollectionSupport003.stringArrayArrayState0006[3][1] = MixedSupport110.computeString1552(byteArrayLocal200, 2);
          }
          byteArrayLocal201 = MixedSupport071.computeByteArray0954(-79, "instructions_itemdescriptions,4,0");
          if (byteArrayLocal201 != null) {
            CollectionSupport003.stringArrayArrayState0006[4][0] = MixedSupport110.computeString1552(byteArrayLocal201, 2);
          }
          byteArrayLocal202 = MixedSupport071.computeByteArray0954(-123, "instructions_itemdescriptions,4,1");
          if (null != byteArrayLocal202) {
            CollectionSupport003.stringArrayArrayState0006[4][1] = MixedSupport110.computeString1552(byteArrayLocal202, 2);
          }
          byteArrayLocal203 = MixedSupport071.computeByteArray0954(-62, "instructions_itemdescriptions,5,0");
          if (byteArrayLocal203 != null) {
            CollectionSupport003.stringArrayArrayState0006[5][0] = MixedSupport110.computeString1552(byteArrayLocal203, 2);
          }
          byteArrayLocal204 = MixedSupport071.computeByteArray0954(-60, "instructions_itemdescriptions,5,1");
          if (byteArrayLocal204 != null) {
            CollectionSupport003.stringArrayArrayState0006[5][1] = MixedSupport110.computeString1552(byteArrayLocal204, 2);
          }
          byteArrayLocal205 = MixedSupport071.computeByteArray0954(-102, "instructions_itemdescriptions,6,0");
          if (null != byteArrayLocal205) {
            CollectionSupport003.stringArrayArrayState0006[6][0] = MixedSupport110.computeString1552(byteArrayLocal205, 2);
          }
          byteArrayLocal206 = MixedSupport071.computeByteArray0954(-55, "instructions_itemdescriptions,6,1");
          if (byteArrayLocal206 != null) {
            CollectionSupport003.stringArrayArrayState0006[6][1] = MixedSupport110.computeString1552(byteArrayLocal206, 2);
          }
          byteArrayLocal207 = MixedSupport071.computeByteArray0954(-124, "instructions_controls,0");
          if (null != byteArrayLocal207) {
            GameplayControls.stringArrayState0056[0] = MixedSupport110.computeString1552(byteArrayLocal207, 2);
          }
          byteArrayLocal208 = MixedSupport071.computeByteArray0954(-92, "instructions_controls,1");
          if (byteArrayLocal208 != null) {
            GameplayControls.stringArrayState0056[1] = MixedSupport110.computeString1552(byteArrayLocal208, 2);
          }
          byteArrayLocal209 = MixedSupport071.computeByteArray0954(-117, "instructions_controls,2");
          if (byteArrayLocal209 != null) {
            GameplayControls.stringArrayState0056[2] = MixedSupport110.computeString1552(byteArrayLocal209, 2);
          }
          byteArrayLocal210 = MixedSupport071.computeByteArray0954(-108, "instructions_controls,3");
          if (byteArrayLocal210 != null) {
            GameplayControls.stringArrayState0056[3] = MixedSupport110.computeString1552(byteArrayLocal210, 2);
          }
          byteArrayLocal211 = MixedSupport071.computeByteArray0954(-61, "instructions_controls,4");
          if (byteArrayLocal211 != null) {
            GameplayControls.stringArrayState0056[4] = MixedSupport110.computeString1552(byteArrayLocal211, 2);
          }
          byteArrayLocal212 = MixedSupport071.computeByteArray0954(-61, "instructions_controls,5");
          if (null != byteArrayLocal212) {
            GameplayControls.stringArrayState0056[5] = MixedSupport110.computeString1552(byteArrayLocal212, 2);
          }
          byteArrayLocal213 = MixedSupport071.computeByteArray0954(-31, "instructions_controls,6");
          if (byteArrayLocal213 != null) {
            GameplayControls.stringArrayState0056[6] = MixedSupport110.computeString1552(byteArrayLocal213, 2);
          }
          byteArrayLocal214 = MixedSupport071.computeByteArray0954(-53, "didyouknow_title");
          if (null != byteArrayLocal214) {
            MixedSupport093.stringState0371 = MixedSupport110.computeString1552(byteArrayLocal214, 2);
          }
          byteArrayLocal215 = MixedSupport071.computeByteArray0954(-87, "didyouknow,0");
          if (null != byteArrayLocal215) {
            LoginCredentials.tutorialTips[0] = MixedSupport110.computeString1552(byteArrayLocal215, 2);
          }
          byteArrayLocal216 = MixedSupport071.computeByteArray0954(-89, "didyouknow,1");
          if (byteArrayLocal216 != null) {
            LoginCredentials.tutorialTips[1] = MixedSupport110.computeString1552(byteArrayLocal216, 2);
          }
          byteArrayLocal217 = MixedSupport071.computeByteArray0954(-112, "didyouknow,2");
          if (null != byteArrayLocal217) {
            LoginCredentials.tutorialTips[2] = MixedSupport110.computeString1552(byteArrayLocal217, 2);
          }
          byteArrayLocal218 = MixedSupport071.computeByteArray0954(-72, "didyouknow,3");
          if (null != byteArrayLocal218) {
            LoginCredentials.tutorialTips[3] = MixedSupport110.computeString1552(byteArrayLocal218, 2);
          }
          byteArrayLocal219 = MixedSupport071.computeByteArray0954(-127, "didyouknow,4");
          if (null != byteArrayLocal219) {
            LoginCredentials.tutorialTips[4] = MixedSupport110.computeString1552(byteArrayLocal219, 2);
          }
          byteArrayLocal220 = MixedSupport071.computeByteArray0954(-32, "didyouknow,5");
          if (byteArrayLocal220 != null) {
            LoginCredentials.tutorialTips[5] = MixedSupport110.computeString1552(byteArrayLocal220, 2);
          }
          byteArrayLocal221 = MixedSupport071.computeByteArray0954(-116, "didyouknow,6");
          if (null != byteArrayLocal221) {
            LoginCredentials.tutorialTips[6] = MixedSupport110.computeString1552(byteArrayLocal221, 2);
          }
          byteArrayLocal222 = MixedSupport071.computeByteArray0954(-97, "didyouknow,7");
          if (null != byteArrayLocal222) {
            LoginCredentials.tutorialTips[7] = MixedSupport110.computeString1552(byteArrayLocal222, 2);
          }
          byteArrayLocal223 = MixedSupport071.computeByteArray0954(-117, "didyouknow,8");
          if (byteArrayLocal223 != null) {
            LoginCredentials.tutorialTips[8] = MixedSupport110.computeString1552(byteArrayLocal223, 2);
          }
          byteArrayLocal224 = MixedSupport071.computeByteArray0954(-112, "didyouknow,9");
          if (null != byteArrayLocal224) {
            LoginCredentials.tutorialTips[9] = MixedSupport110.computeString1552(byteArrayLocal224, 2);
          }
          byteArrayLocal225 = MixedSupport071.computeByteArray0954(-99, "didyouknow,10");
          if (null != byteArrayLocal225) {
            LoginCredentials.tutorialTips[10] = MixedSupport110.computeString1552(byteArrayLocal225, 2);
          }
          byteArrayLocal226 = MixedSupport071.computeByteArray0954(-57, "didyouknow,11");
          if (byteArrayLocal226 != null) {
            LoginCredentials.tutorialTips[11] = MixedSupport110.computeString1552(byteArrayLocal226, 2);
          }
          byteArrayLocal227 = MixedSupport071.computeByteArray0954(-104, "tutorial,0");
          if (byteArrayLocal227 != null) {
            UiComponentPart028.stringArrayState0040[0] = MixedSupport110.computeString1552(byteArrayLocal227, 2);
          }
          byteArrayLocal228 = MixedSupport071.computeByteArray0954(-90, "tutorial,1");
          if (null != byteArrayLocal228) {
            UiComponentPart028.stringArrayState0040[1] = MixedSupport110.computeString1552(byteArrayLocal228, 2);
          }
          byteArrayLocal229 = MixedSupport071.computeByteArray0954(-77, "tutorial,2");
          if (null != byteArrayLocal229) {
            UiComponentPart028.stringArrayState0040[2] = MixedSupport110.computeString1552(byteArrayLocal229, 2);
          }
          byteArrayLocal230 = MixedSupport071.computeByteArray0954(-76, "tutorial,3");
          if (byteArrayLocal230 != null) {
            UiComponentPart028.stringArrayState0040[3] = MixedSupport110.computeString1552(byteArrayLocal230, 2);
          }
          byteArrayLocal231 = MixedSupport071.computeByteArray0954(-97, "to_activate_specials");
          if (null != byteArrayLocal231) {
            RenderingSupport013.stringState0443 = MixedSupport110.computeString1552(byteArrayLocal231, 2);
          }
          byteArrayLocal232 = MixedSupport071.computeByteArray0954(-49, "premultiplayer_tutorial,0");
          if (null != byteArrayLocal232) {
            InputAdapter006.stringArrayState0043[0] = MixedSupport110.computeString1552(byteArrayLocal232, 2);
          }
          byteArrayLocal233 = MixedSupport071.computeByteArray0954(-42, "premultiplayer_tutorial,1");
          if (byteArrayLocal233 != null) {
            InputAdapter006.stringArrayState0043[1] = MixedSupport110.computeString1552(byteArrayLocal233, 2);
          }
          byteArrayLocal234 = MixedSupport071.computeByteArray0954(-36, "masterchallengeintro,0");
          if (null != byteArrayLocal234) {
            MixedSupport137.stringArrayState0050[0] = MixedSupport110.computeString1552(byteArrayLocal234, 2);
          }
          byteArrayLocal235 = MixedSupport071.computeByteArray0954(-52, "masterchallengeintro,1");
          if (byteArrayLocal235 != null) {
            MixedSupport137.stringArrayState0050[1] = MixedSupport110.computeString1552(byteArrayLocal235, 2);
          }
          byteArrayLocal236 = MixedSupport071.computeByteArray0954(-78, "showtutorialagain");
          if (byteArrayLocal236 != null) {
            UiComponentPart032.stringState0581 = MixedSupport110.computeString1552(byteArrayLocal236, 2);
          }
          byteArrayLocal237 = MixedSupport071.computeByteArray0954(-83, "challengestrategy,0");
          if (null != byteArrayLocal237) {
            ThemeTips.themeTips[0] = MixedSupport110.computeString1552(byteArrayLocal237, 2);
          }
          byteArrayLocal238 = MixedSupport071.computeByteArray0954(-39, "challengestrategy,1");
          if (null != byteArrayLocal238) {
            ThemeTips.themeTips[1] = MixedSupport110.computeString1552(byteArrayLocal238, 2);
          }
          byteArrayLocal239 = MixedSupport071.computeByteArray0954(-73, "challengestrategy,2");
          if (null != byteArrayLocal239) {
            ThemeTips.themeTips[2] = MixedSupport110.computeString1552(byteArrayLocal239, 2);
          }
          byteArrayLocal240 = MixedSupport071.computeByteArray0954(-75, "challengestrategy,3");
          if (byteArrayLocal240 != null) {
            ThemeTips.themeTips[3] = MixedSupport110.computeString1552(byteArrayLocal240, 2);
          }
          byteArrayLocal241 = MixedSupport071.computeByteArray0954(-54, "challengestrategy,4");
          if (null != byteArrayLocal241) {
            ThemeTips.themeTips[4] = MixedSupport110.computeString1552(byteArrayLocal241, 2);
          }
          byteArrayLocal242 = MixedSupport071.computeByteArray0954(-96, "challengestrategy,5");
          if (byteArrayLocal242 != null) {
            ThemeTips.themeTips[5] = MixedSupport110.computeString1552(byteArrayLocal242, 2);
          }
          byteArrayLocal243 = MixedSupport071.computeByteArray0954(-67, "challengestrategy,6");
          if (null != byteArrayLocal243) {
            ThemeTips.themeTips[6] = MixedSupport110.computeString1552(byteArrayLocal243, 2);
          }
          byteArrayLocal244 = MixedSupport071.computeByteArray0954(-60, "challengestrategy,7");
          if (null != byteArrayLocal244) {
            ThemeTips.themeTips[7] = MixedSupport110.computeString1552(byteArrayLocal244, 2);
          }
          byteArrayLocal245 = MixedSupport071.computeByteArray0954(-16, "x_at_once");
          if (null != byteArrayLocal245) {
            MixedSupport099.stringState0395 = MixedSupport110.computeString1552(byteArrayLocal245, 2);
          }
          byteArrayLocal246 = MixedSupport071.computeByteArray0954(-59, "x_chain");
          if (byteArrayLocal246 != null) {
            MixedSupport027.stringState0132 = MixedSupport110.computeString1552(byteArrayLocal246, 2);
          }
          byteArrayLocal247 = MixedSupport071.computeByteArray0954(-35, "x_shapes");
          if (null != byteArrayLocal247) {
            MixedSupport137.stringState0564 = MixedSupport110.computeString1552(byteArrayLocal247, 2);
          }
          byteArrayLocal248 = MixedSupport071.computeByteArray0954(-95, "start");
          if (null != byteArrayLocal248) {
            MixedSupport121.stringState0511 = MixedSupport110.computeString1552(byteArrayLocal248, 2);
          }
          byteArrayLocal249 = MixedSupport071.computeByteArray0954(-72, "challenge");
          if (null != byteArrayLocal249) {
            UiComponentPart016.stringState0296 = MixedSupport110.computeString1552(byteArrayLocal249, 2);
          }
          byteArrayLocal250 = MixedSupport071.computeByteArray0954(-89, "new_theme_unlocked");
          if (null != byteArrayLocal250) {
            RenderingSupport015.stringState0524 = MixedSupport110.computeString1552(byteArrayLocal250, 2);
          }
          byteArrayLocal251 = MixedSupport071.computeByteArray0954(-110, "speedup");
          if (byteArrayLocal251 != null) {
            MixedSupport028.stringState0140 = MixedSupport110.computeString1552(byteArrayLocal251, 2);
          }
          byteArrayLocal252 = MixedSupport071.computeByteArray0954(-61, "panic");
          if (byteArrayLocal252 != null) {
            MixedSupport013.stringState0062 = MixedSupport110.computeString1552(byteArrayLocal252, 2);
          }
          byteArrayLocal253 = MixedSupport071.computeByteArray0954(-90, "fight");
          if (null != byteArrayLocal253) {
            TextLayout.stringState0083 = MixedSupport110.computeString1552(byteArrayLocal253, 2);
          }
          byteArrayLocal254 = MixedSupport071.computeByteArray0954(-93, "finish_name");
          if (byteArrayLocal254 != null) {
            MixedSupport101.stringState0409 = MixedSupport110.computeString1552(byteArrayLocal254, 2);
          }
          byteArrayLocal255 = MixedSupport071.computeByteArray0954(-60, "you_win");
          if (byteArrayLocal255 != null) {
            UiComponentPart005.stringState0101 = MixedSupport110.computeString1552(byteArrayLocal255, 2);
          }
          byteArrayLocal256 = MixedSupport071.computeByteArray0954(-36, "name_wins");
          if (null != byteArrayLocal256) {
            MixedSupport039.stringState0176 = MixedSupport110.computeString1552(byteArrayLocal256, 2);
          }
          byteArrayLocal257 = MixedSupport071.computeByteArray0954(-107, "draw");
          if (null != byteArrayLocal257) {
            CodecSupport004.stringState0479 = MixedSupport110.computeString1552(byteArrayLocal257, 2);
          }
          byteArrayLocal258 = MixedSupport071.computeByteArray0954(-100, "well_done");
          if (null != byteArrayLocal258) {
            MixedSupport132.stringState0546 = MixedSupport110.computeString1552(byteArrayLocal258, 2);
          }
          byteArrayLocal259 = MixedSupport071.computeByteArray0954(-101, "oh_no");
          if (byteArrayLocal259 != null) {
            MixedSupport014.stringState0070 = MixedSupport110.computeString1552(byteArrayLocal259, 2);
          }
          byteArrayLocal260 = MixedSupport071.computeByteArray0954(-61, "thefinal");
          if (byteArrayLocal260 != null) {
            ResourceArchive.stringState0286 = MixedSupport110.computeString1552(byteArrayLocal260, 2);
          }
          byteArrayLocal261 = MixedSupport071.computeByteArray0954(-70, "name_is_out");
          if (null != byteArrayLocal261) {
            MixedSupport001.stringState0001 = MixedSupport110.computeString1552(byteArrayLocal261, 2);
          }
          byteArrayLocal262 = MixedSupport071.computeByteArray0954(-40, "main_menu_ticker,0");
          if (null != byteArrayLocal262) {
            GameDomainSupport005.stringArrayState0028[0] = MixedSupport110.computeString1552(byteArrayLocal262, 2);
          }
          byteArrayLocal263 = MixedSupport071.computeByteArray0954(-59, "main_menu_ticker,1");
          if (null != byteArrayLocal263) {
            GameDomainSupport005.stringArrayState0028[1] = MixedSupport110.computeString1552(byteArrayLocal263, 2);
          }
          byteArrayLocal264 = MixedSupport071.computeByteArray0954(-34, "main_menu_ticker,2");
          if (null != byteArrayLocal264) {
            GameDomainSupport005.stringArrayState0028[2] = MixedSupport110.computeString1552(byteArrayLocal264, 2);
          }
          byteArrayLocal265 = MixedSupport071.computeByteArray0954(-87, "main_menu_ticker,3");
          if (null != byteArrayLocal265) {
            GameDomainSupport005.stringArrayState0028[3] = MixedSupport110.computeString1552(byteArrayLocal265, 2);
          }
          byteArrayLocal266 = MixedSupport071.computeByteArray0954(-101, "devquote");
          if (byteArrayLocal266 != null) {
            UiComponentPart023.stringState0424 = MixedSupport110.computeString1552(byteArrayLocal266, 2);
          }
          MixedSupport101.resourceArchiveState0014 = null;
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    static {
        stringState0501 = "Drawn";
        stringState0503 = "Colours in play:";
        stringState0502 = "<%0> has dropped out.";
        stringState0504 = "Retry";
    }
}
