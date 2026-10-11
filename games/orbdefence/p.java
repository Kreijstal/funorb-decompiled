/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static long field_a;
    static long field_c;
    static cb field_d;
    static String field_e;
    static String field_b;
    static String field_f;

    final static hj[] a(int param0, String param1, ki param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param1, 0);
          var5 = param2.a(param3, param0 ^ 8804, var4_int);
          if (param0 != 13863) {
            field_a = -63L;
          }
          stackIn_3_0 = fh.a(param2, var5, (byte) -86, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("p.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static char a(char param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param1 >= 0) {
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
          if (var2 == 45) {
            return '_';
          }
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (var2 == 224) {
              return 'a';
            }
            if (var2 != 225 &&
              226 != var2 &&
              var2 != 228 &&
              var2 != 227 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                202 != var2 &&
                var2 != 203) {
                if (237 != var2 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  207 != var2) {
                  if (var2 != 242 &&
                    243 != var2 &&
                    var2 != 244 &&
                    246 != var2 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    var2 != 211 &&
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
                      if (var2 != 219) {
                        if (var2 == 220) {
                          return 'u';
                        }
                        if (var2 == 231) {
                          return 'c';
                        }
                        if (199 == var2) {
                          return 'c';
                        }
                        if (255 == var2) {
                          return 'y';
                        }
                        if (var2 == 376) {
                          return 'y';
                        }
                        if (241 != var2 &&
                          var2 != 209) {
                          if (var2 == 223) {
                            return 'b';
                          }
                          return Character.toLowerCase(param0);
                        }
                        return 'n';
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
        field_f = (String) null;
        var2Lifetime1 = param0;
        if (var2Lifetime1 != 32) {
          if (var2Lifetime1 == 160) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              var2Lifetime1 != 93 &&
              35 != var2Lifetime1) {
              if (var2Lifetime1 != 224 &&
                var2Lifetime1 != 225 &&
                226 != var2Lifetime1 &&
                var2Lifetime1 != 228 &&
                var2Lifetime1 != 227 &&
                var2Lifetime1 != 192 &&
                var2Lifetime1 != 193 &&
                var2Lifetime1 != 194 &&
                var2Lifetime1 != 196 &&
                var2Lifetime1 != 195) {
                if (var2Lifetime1 == 232) {
                  return 'e';
                }
                if (var2Lifetime1 == 233) {
                  return 'e';
                }
                if (var2Lifetime1 != 234) {
                  if (var2Lifetime1 == 235) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 200) {
                    return 'e';
                  }
                  if (var2Lifetime1 != 201) {
                    if (202 == var2Lifetime1) {
                      return 'e';
                    }
                    if (var2Lifetime1 == 203) {
                      return 'e';
                    }
                    if (237 != var2Lifetime1 &&
                      var2Lifetime1 != 238 &&
                      var2Lifetime1 != 239 &&
                      var2Lifetime1 != 205 &&
                      var2Lifetime1 != 206 &&
                      207 != var2Lifetime1) {
                      if (var2Lifetime1 != 242 &&
                        243 != var2Lifetime1) {
                        if (var2Lifetime1 == 244) {
                          return 'o';
                        }
                        if (246 == var2Lifetime1) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 245) {
                          if (var2Lifetime1 == 210) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 211 &&
                            var2Lifetime1 != 212) {
                            if (var2Lifetime1 == 214) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 213) {
                              if (var2Lifetime1 != 249) {
                                if (var2Lifetime1 == 250) {
                                  return 'u';
                                }
                                if (var2Lifetime1 != 251) {
                                  if (var2Lifetime1 == 252) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 == 217) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 == 218) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 != 219) {
                                    if (var2Lifetime1 == 220) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 == 231) {
                                      return 'c';
                                    }
                                    if (199 == var2Lifetime1) {
                                      return 'c';
                                    }
                                    if (255 == var2Lifetime1) {
                                      return 'y';
                                    }
                                    if (var2Lifetime1 == 376) {
                                      return 'y';
                                    }
                                    if (241 != var2Lifetime1 &&
                                      var2Lifetime1 != 209) {
                                      if (var2Lifetime1 == 223) {
                                        return 'b';
                                      }
                                      return Character.toLowerCase(param0);
                                    }
                                    return 'n';
                                  }
                                }
                              }
                              return 'u';
                            }
                          }
                        }
                      }
                      return 'o';
                    }
                    return 'i';
                  }
                }
                return 'e';
              }
              return 'a';
            }
            return param0;
          }
        }
        return '_';
    }

    final static boolean a(int param0) {
        if (param0 != 23236) {
          return true;
        }
        if (null == field_d) {
          return false;
        }
        if (da.field_r != dh.field_bb) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = 98 % ((-29 - param0) / 48);
        field_e = null;
        field_b = null;
        field_f = null;
    }

    static {
        field_f = "Members";
        field_e = "THUNDER SHOT";
        field_b = "<img=2> = next wave";
    }
}
