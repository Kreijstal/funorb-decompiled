/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static mj field_c;
    static String field_d;
    static am field_a;
    static boolean field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 203) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        hk var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          re.field_e = param1;
          var2 = (hk) (bd.field_c.a((byte) -117));
          while (var2 != null) {
            if (!var2.field_h.d(-3548)) {
              var2.c(param0 - 20078);
            } else {
              var2.field_g.g(re.field_e * var2.field_j / 256);
            }
            var2 = (hk) (bd.field_c.d((byte) 63));
          }
          if (param0 != 256) {
            field_a = (am) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "qb.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, le[] param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != null &&
            param4 > 0) {
            var5_int = param1[0].field_m;
            var6 = param1[2].field_m;
            var7 = param1[1].field_m;
            param1[0].c(param3, param0);
            param1[2].c(param4 + (param3 - var6), param0);
            ge.b(si.field_u);
            ge.c(param3 + var5_int, param0, -var6 + param3 + param4, param0 + param1[1].field_n);
            var10 = 29 % ((param2 - 22) / 48);
            var8 = param3 + var5_int;
            var9 = param4 + (param3 - var6);
            for (param3 = var8; var9 > param3; param3 = param3 + var7) {
              param1[1].c(param3, param0);
            }
            ge.a(si.field_u);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("qb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static char a(char param0, int param1) {
        int var2;
        int var3;
        le[] var4;
        int var2Lifetime1;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == -201) {
          var2 = param0;
          if (32 == var2) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (95 == var2) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (var2 != 224 &&
              var2 != 225 &&
              var2 != 226 &&
              var2 != 228 &&
              var2 != 227 &&
              192 != var2 &&
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
                203 != var2) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  205 != var2 &&
                  var2 != 206 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    244 != var2 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    var2 != 210) {
                    if (var2 == 211) {
                      return 'o';
                    }
                    if (var2 != 212 &&
                      var2 != 214 &&
                      var2 != 213) {
                      if (var2 != 249) {
                        if (var2 == 250) {
                          return 'u';
                        }
                        if (var2 != 251) {
                          if (var2 == 252) {
                            return 'u';
                          }
                          if (var2 != 217 &&
                            218 != var2) {
                            if (var2 == 219) {
                              return 'u';
                            }
                            if (var2 == 220) {
                              return 'u';
                            }
                            if (var2 != 231 &&
                              var2 != 199) {
                              if (var2 == 255) {
                                return 'y';
                              }
                              if (376 == var2) {
                                return 'y';
                              }
                              if (var2 != 241 &&
                                var2 != 209) {
                                if (var2 != 223) {
                                  return Character.toLowerCase(param0);
                                }
                                return 'b';
                              }
                              return 'n';
                            }
                            return 'c';
                          }
                        }
                      }
                      return 'u';
                    }
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
        var4 = (le[]) null;
        qb.a(-124, (le[]) null, (byte) -91, -104, 94);
        var2Lifetime1 = param0;
        if (32 == var2Lifetime1) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          95 != var2Lifetime1 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 != 91 &&
            var2Lifetime1 != 93 &&
            35 != var2Lifetime1) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227) {
              if (192 == var2Lifetime1) {
                return 'a';
              }
              if (var2Lifetime1 != 193 &&
                var2Lifetime1 != 194 &&
                var2Lifetime1 != 196 &&
                var2Lifetime1 != 195) {
                if (var2Lifetime1 == 232) {
                  return 'e';
                }
                if (var2Lifetime1 != 233 &&
                  var2Lifetime1 != 234 &&
                  var2Lifetime1 != 235) {
                  if (var2Lifetime1 == 200) {
                    return 'e';
                  }
                  if (var2Lifetime1 == 201) {
                    return 'e';
                  }
                  if (202 != var2Lifetime1) {
                    if (203 == var2Lifetime1) {
                      return 'e';
                    }
                    if (var2Lifetime1 == 237) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 238) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 239) {
                      return 'i';
                    }
                    if (205 == var2Lifetime1) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 206) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 207) {
                      return 'i';
                    }
                    if (var2Lifetime1 != 242) {
                      if (var2Lifetime1 == 243) {
                        return 'o';
                      }
                      if (244 != var2Lifetime1 &&
                        var2Lifetime1 != 246 &&
                        var2Lifetime1 != 245) {
                        if (var2Lifetime1 == 210) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 211) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 212 &&
                          var2Lifetime1 != 214 &&
                          var2Lifetime1 != 213) {
                          if (var2Lifetime1 != 249) {
                            if (var2Lifetime1 == 250) {
                              return 'u';
                            }
                            if (var2Lifetime1 != 251) {
                              if (var2Lifetime1 == 252) {
                                return 'u';
                              }
                              if (var2Lifetime1 != 217 &&
                                218 != var2Lifetime1) {
                                if (var2Lifetime1 == 219) {
                                  return 'u';
                                }
                                if (var2Lifetime1 == 220) {
                                  return 'u';
                                }
                                if (var2Lifetime1 != 231 &&
                                  var2Lifetime1 != 199) {
                                  if (var2Lifetime1 == 255) {
                                    return 'y';
                                  }
                                  if (376 == var2Lifetime1) {
                                    return 'y';
                                  }
                                  if (var2Lifetime1 != 241 &&
                                    var2Lifetime1 != 209) {
                                    if (var2Lifetime1 != 223) {
                                      return Character.toLowerCase(param0);
                                    }
                                    return 'b';
                                  }
                                  return 'n';
                                }
                                return 'c';
                              }
                            }
                          }
                          return 'u';
                        }
                      }
                    }
                    return 'o';
                  }
                }
                return 'e';
              }
            }
            return 'a';
          }
          return param0;
        }
        return '_';
    }

    static {
        field_d = "Click";
        pj discarded$0 = new pj();
        field_a = new am();
        field_b = false;
    }
}
