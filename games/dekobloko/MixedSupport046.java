/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport046 {
    static String stringState0195;
    static boolean booleanState0052;
    static String stringState0196;
    static MixedSupport084 mixedSupport084State0001;
    static RgbSprite[] rgbSpriteArrayState0015;
    static int integerState0250;
    static String stringState0197;
    static String stringState0198;
    static boolean booleanState0053;

    final static boolean computeBoolean0626(int integerArgument1, int integerArgument2, int integerArgument3, byte byteArgument4) {
        int integerLocal1 = -42 / ((-5 - byteArgument4) / 35);
        return MixedSupport149.computeBoolean1986(-89, integerArgument3, integerArgument2, integerArgument1);
    }

    final static String computeString0627(boolean booleanArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        if (integerArgument4 <= 0) {
          throw new IllegalArgumentException("Can only get ordinal for positive numbers");
        }
        if (booleanArgument1) {
          MixedSupport046.computeString0627(false, 12, -120, -73);
          if (integerArgument2 == 0) {
            integerLocal1 = integerArgument4 % 100;
            if (integerLocal1 >= 11 &&
              integerLocal1 <= 13) {
              return integerArgument4 + "th";
            }
            integerLocal2 = integerArgument4 % 10;
            if (integerLocal2 == 1) {
              return integerArgument4 + "st";
            }
            if (integerLocal2 == 2) {
              return integerArgument4 + "nd";
            }
            if (integerLocal2 == 3) {
              return integerArgument4 + "rd";
            }
            return integerArgument4 + "th";
          }
          if (integerArgument2 == 1) {
            return integerArgument4 + ".";
          }
          if (2 == integerArgument2) {
            if (integerArgument4 != 1) {
              return integerArgument4 + "ème";
            }
            if (2 != integerArgument3) {
              return integerArgument4 + "er";
            }
            return integerArgument4 + "ère";
          }
          if (integerArgument2 != 3) {
            if (integerArgument2 == 4) {
              return integerArgument4 + "e";
            }
            throw new IllegalArgumentException("Unsupported language " + integerArgument2);
          }
          if (integerArgument3 != 2) {
            return integerArgument4 + "º";
          }
          return integerArgument4 + "ª";
        }
        if (integerArgument2 != 0) {
          if (integerArgument2 == 1) {
            return integerArgument4 + ".";
          }
          if (2 == integerArgument2) {
            if (integerArgument4 != 1) {
              return integerArgument4 + "ème";
            }
            if (2 != integerArgument3) {
              return integerArgument4 + "er";
            }
            return integerArgument4 + "ère";
          }
          if (integerArgument2 != 3) {
            if (integerArgument2 != 4) {
              throw new IllegalArgumentException("Unsupported language " + integerArgument2);
            }
            return integerArgument4 + "e";
          }
          if (integerArgument3 != 2) {
            return integerArgument4 + "º";
          }
          return integerArgument4 + "ª";
        }
        integerLocal3 = integerArgument4 % 100;
        if (integerLocal3 < 11) {
          integerLocal4 = integerArgument4 % 10;
          if (integerLocal4 == 1) {
            return integerArgument4 + "st";
          }
          if (integerLocal4 == 2) {
            return integerArgument4 + "nd";
          }
          if (integerLocal4 == 3) {
            return integerArgument4 + "rd";
          }
          return integerArgument4 + "th";
        }
        if (integerLocal3 <= 13) {
          return integerArgument4 + "th";
        }
        integerLocal5 = integerArgument4 % 10;
        if (integerLocal5 == 1) {
          return integerArgument4 + "st";
        }
        if (integerLocal5 == 2) {
          return integerArgument4 + "nd";
        }
        if (integerLocal5 == 3) {
          return integerArgument4 + "rd";
        }
        return integerArgument4 + "th";
    }

    public static void performAction0625(byte byteArgument1) {
        mixedSupport084State0001 = null;
        if (byteArgument1 == -118) {
          stringState0197 = null;
          rgbSpriteArrayState0015 = null;
          stringState0198 = null;
          stringState0196 = null;
          stringState0195 = null;
          return;
        }
        MixedSupport046.computeBoolean0626(90, -20, -14, (byte) 115);
        stringState0197 = null;
        rgbSpriteArrayState0015 = null;
        stringState0198 = null;
        stringState0196 = null;
        stringState0195 = null;
    }

    static {
        stringState0195 = "You need a rating of <%1> to play with the current options.";
        stringState0196 = "Spectate";
        mixedSupport084State0001 = new MixedSupport084();
        stringState0197 = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        stringState0198 = "This game option is not available in rated games.";
    }
}
