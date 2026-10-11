/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_a;
    static boolean field_b;
    static String field_h;
    static ln field_c;
    static ck[] field_g;
    static int field_e;
    static String field_i;
    static String field_d;
    static boolean field_f;

    final static boolean a(int param0, int param1, int param2, byte param3) {
        int var4 = -42 / ((-5 - param3) / 35);
        return vm.a(-89, param2, param1, param0);
    }

    final static String a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param3 <= 0) {
          throw new IllegalArgumentException("Can only get ordinal for positive numbers");
        }
        if (param0) {
          gd.a(false, 12, -120, -73);
          if (param1 == 0) {
            var4 = param3 % 100;
            if (var4 >= 11 &&
              var4 <= 13) {
              return param3 + "th";
            }
            var5 = param3 % 10;
            if (var5 == 1) {
              return param3 + "st";
            }
            if (var5 == 2) {
              return param3 + "nd";
            }
            if (var5 == 3) {
              return param3 + "rd";
            }
            return param3 + "th";
          }
          if (param1 == 1) {
            return param3 + ".";
          }
          if (2 == param1) {
            if (param3 != 1) {
              return param3 + "ème";
            }
            if (2 != param2) {
              return param3 + "er";
            }
            return param3 + "ère";
          }
          if (param1 != 3) {
            if (param1 == 4) {
              return param3 + "e";
            }
            throw new IllegalArgumentException("Unsupported language " + param1);
          }
          if (param2 != 2) {
            return param3 + "º";
          }
          return param3 + "ª";
        }
        if (param1 != 0) {
          if (param1 == 1) {
            return param3 + ".";
          }
          if (2 == param1) {
            if (param3 != 1) {
              return param3 + "ème";
            }
            if (2 != param2) {
              return param3 + "er";
            }
            return param3 + "ère";
          }
          if (param1 != 3) {
            if (param1 != 4) {
              throw new IllegalArgumentException("Unsupported language " + param1);
            }
            return param3 + "e";
          }
          if (param2 != 2) {
            return param3 + "º";
          }
          return param3 + "ª";
        }
        var4Lifetime1 = param3 % 100;
        if (var4Lifetime1 < 11) {
          var5Lifetime1 = param3 % 10;
          if (var5Lifetime1 == 1) {
            return param3 + "st";
          }
          if (var5Lifetime1 == 2) {
            return param3 + "nd";
          }
          if (var5Lifetime1 == 3) {
            return param3 + "rd";
          }
          return param3 + "th";
        }
        if (var4Lifetime1 <= 13) {
          return param3 + "th";
        }
        var5Lifetime2 = param3 % 10;
        if (var5Lifetime2 == 1) {
          return param3 + "st";
        }
        if (var5Lifetime2 == 2) {
          return param3 + "nd";
        }
        if (var5Lifetime2 == 3) {
          return param3 + "rd";
        }
        return param3 + "th";
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 == -118) {
          field_i = null;
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        }
        gd.a(90, -20, -14, (byte) 115);
        field_i = null;
        field_g = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    static {
        field_a = "You need a rating of <%1> to play with the current options.";
        field_h = "Spectate";
        field_c = new ln();
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_d = "This game option is not available in rated games.";
    }
}
