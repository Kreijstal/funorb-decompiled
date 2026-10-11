/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm extends wb {
    int field_p;
    static int[] field_w;
    static wc field_v;
    static int field_u;
    static km field_r;
    static String field_s;
    static int[] field_x;
    static String field_q;
    static String field_o;
    static String field_t;

    abstract Object b(byte param0);

    public static void e(int param0) {
        field_v = null;
        field_t = null;
        field_o = null;
        int var1 = -57 / ((-8 - param0) / 35);
        field_s = null;
        field_w = null;
        field_x = null;
        field_r = null;
        field_q = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          if (!mi.a(param1 ^ -375, true, param0)) {
            return false;
          }
          if (param1 != -1478) {
            field_o = (String) null;
          }
          var2_int = 0;
          while (true) {
            if (param0.length() <= var2_int) {
              return true;
            }
            if (bn.a(-114, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("dm.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract boolean d(int param0);

    dm(int param0) {
        this.field_p = param0;
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param1 == 4) {
          var2 = param0;
          if (var2 == 32) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 == 95) {
            return '_';
          }
          if (45 == var2) {
            return '_';
          }
          if (91 == var2) {
            return param0;
          }
          if (var2 != 93 &&
            35 != var2) {
            if (224 != var2 &&
              var2 != 225 &&
              var2 != 226 &&
              var2 != 228 &&
              var2 != 227 &&
              var2 != 192 &&
              var2 != 193 &&
              194 != var2 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                233 != var2 &&
                var2 != 234 &&
                var2 != 235 &&
                200 != var2 &&
                var2 != 201 &&
                var2 != 202 &&
                203 != var2) {
                if (237 != var2 &&
                  var2 != 238 &&
                  239 != var2 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    211 != var2 &&
                    var2 != 212 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      var2 != 252) {
                      if (var2 == 217) {
                        return 'u';
                      }
                      if (var2 == 218) {
                        return 'u';
                      }
                      if (var2 != 219 &&
                        var2 != 220) {
                        if (var2 == 231) {
                          return 'c';
                        }
                        if (var2 == 199) {
                          return 'c';
                        }
                        if (var2 == 255) {
                          return 'y';
                        }
                        if (var2 == 376) {
                          return 'y';
                        }
                        if (var2 == 241) {
                          return 'n';
                        }
                        if (var2 == 209) {
                          return 'n';
                        }
                        if (223 == var2) {
                          return 'b';
                        }
                        return Character.toLowerCase(param0);
                      }
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param0;
        }
        field_v = (wc) null;
        var2Lifetime1 = param0;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          45 != var2Lifetime1) {
          if (91 != var2Lifetime1 &&
            var2Lifetime1 != 93 &&
            35 != var2Lifetime1) {
            if (224 != var2Lifetime1 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227) {
              if (var2Lifetime1 == 192) {
                return 'a';
              }
              if (var2Lifetime1 != 193) {
                if (194 == var2Lifetime1) {
                  return 'a';
                }
                if (var2Lifetime1 != 196 &&
                  var2Lifetime1 != 195) {
                  if (var2Lifetime1 == 232) {
                    return 'e';
                  }
                  if (233 != var2Lifetime1 &&
                    var2Lifetime1 != 234 &&
                    var2Lifetime1 != 235 &&
                    200 != var2Lifetime1 &&
                    var2Lifetime1 != 201 &&
                    var2Lifetime1 != 202 &&
                    203 != var2Lifetime1) {
                    if (237 == var2Lifetime1) {
                      return 'i';
                    }
                    if (var2Lifetime1 != 238 &&
                      239 != var2Lifetime1) {
                      if (var2Lifetime1 == 205) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 206) {
                        return 'i';
                      }
                      if (var2Lifetime1 != 207) {
                        if (var2Lifetime1 != 242) {
                          if (var2Lifetime1 == 243) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 244) {
                            if (var2Lifetime1 == 246) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 245) {
                              if (var2Lifetime1 == 210) {
                                return 'o';
                              }
                              if (211 != var2Lifetime1 &&
                                var2Lifetime1 != 212) {
                                if (var2Lifetime1 == 214) {
                                  return 'o';
                                }
                                if (var2Lifetime1 != 213) {
                                  if (var2Lifetime1 != 249) {
                                    if (var2Lifetime1 == 250) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 == 251) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 != 252) {
                                      if (var2Lifetime1 == 217) {
                                        return 'u';
                                      }
                                      if (var2Lifetime1 == 218) {
                                        return 'u';
                                      }
                                      if (var2Lifetime1 != 219 &&
                                        var2Lifetime1 != 220) {
                                        if (var2Lifetime1 == 231) {
                                          return 'c';
                                        }
                                        if (var2Lifetime1 == 199) {
                                          return 'c';
                                        }
                                        if (var2Lifetime1 == 255) {
                                          return 'y';
                                        }
                                        if (var2Lifetime1 == 376) {
                                          return 'y';
                                        }
                                        if (var2Lifetime1 == 241) {
                                          return 'n';
                                        }
                                        if (var2Lifetime1 == 209) {
                                          return 'n';
                                        }
                                        if (223 == var2Lifetime1) {
                                          return 'b';
                                        }
                                        return Character.toLowerCase(param0);
                                      }
                                    }
                                  }
                                  return 'u';
                                }
                              }
                            }
                          }
                        }
                        return 'o';
                      }
                    }
                    return 'i';
                  }
                  return 'e';
                }
              }
            }
            return 'a';
          }
          return param0;
        }
        return '_';
    }

    static {
        field_w = new int[5];
        field_s = "Play rated game";
        field_o = "Try changing the '<%0>' setting.";
        field_q = "<%0> is not a member, and cannot play with the current options.";
        field_t = "That name is not available";
    }
}
