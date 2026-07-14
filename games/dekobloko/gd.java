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
        int var4 = 0;
        int var5 = 0;
        if (param3 > 0) {
          if (!param0) {
            if (-1 == param1) {
              var4 = param3 % 100;
              if (-12 > var4) {
                var5 = param3 % 10;
                if ((var5 ^ -1) == -2) {
                  return param3 + "st";
                } else {
                  if (var5 == 2) {
                    return param3 + "nd";
                  } else {
                    if ((var5 ^ -1) == -4) {
                      return param3 + "rd";
                    } else {
                      return param3 + "th";
                    }
                  }
                }
              } else {
                if (-14 > (var4 ^ -1)) {
                  var5 = param3 % 10;
                  if ((var5 ^ -1) == -2) {
                    return param3 + "st";
                  } else {
                    if (var5 == 2) {
                      return param3 + "nd";
                    } else {
                      if ((var5 ^ -1) == -4) {
                        return param3 + "rd";
                      } else {
                        return param3 + "th";
                      }
                    }
                  }
                } else {
                  return param3 + "th";
                }
              }
            } else {
              if (param1 == -2) {
                return param3 + ".";
              } else {
                if (2 != param1) {
                  if (-4 != (param1 ^ -1)) {
                    if ((param1 ^ -1) != -5) {
                      throw new IllegalArgumentException("Unsupported language " + param1);
                    } else {
                      return param3 + "e";
                    }
                  } else {
                    if ((param2 ^ -1) != -3) {
                      return param3 + "º";
                    } else {
                      return param3 + "ª";
                    }
                  }
                } else {
                  if (-2 == param3) {
                    if (2 != param2) {
                      return param3 + "er";
                    } else {
                      return param3 + "ère";
                    }
                  } else {
                    return param3 + "ème";
                  }
                }
              }
            }
          } else {
            String discarded$1 = gd.a(false, 12, -120, -73);
            if (-1 == param1) {
              var4 = param3 % 100;
              if (-12 <= var4) {
                if (-14 <= (var4 ^ -1)) {
                  return param3 + "th";
                } else {
                  var5 = param3 % 10;
                  if ((var5 ^ -1) == -2) {
                    return param3 + "st";
                  } else {
                    if (var5 == 2) {
                      return param3 + "nd";
                    } else {
                      if ((var5 ^ -1) == -4) {
                        return param3 + "rd";
                      } else {
                        return param3 + "th";
                      }
                    }
                  }
                }
              } else {
                var5 = param3 % 10;
                if ((var5 ^ -1) == -2) {
                  return param3 + "st";
                } else {
                  if (var5 == 2) {
                    return param3 + "nd";
                  } else {
                    if ((var5 ^ -1) == -4) {
                      return param3 + "rd";
                    } else {
                      return param3 + "th";
                    }
                  }
                }
              }
            } else {
              if (param1 == -2) {
                return param3 + ".";
              } else {
                if (2 != param1) {
                  if (-4 != (param1 ^ -1)) {
                    if ((param1 ^ -1) == -5) {
                      return param3 + "e";
                    } else {
                      throw new IllegalArgumentException("Unsupported language " + param1);
                    }
                  } else {
                    if ((param2 ^ -1) != -3) {
                      return param3 + "º";
                    } else {
                      return param3 + "ª";
                    }
                  }
                } else {
                  if (-2 == param3) {
                    if (2 != param2) {
                      return param3 + "er";
                    } else {
                      return param3 + "ère";
                    }
                  } else {
                    return param3 + "ème";
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException("Can only get ordinal for positive numbers");
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -118) {
          boolean discarded$2 = gd.a(90, -20, -14, (byte) 115);
          field_i = null;
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You need a rating of <%1> to play with the current options.";
        field_h = "Spectate";
        field_c = new ln();
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_d = "This game option is not available in rated games.";
    }
}
