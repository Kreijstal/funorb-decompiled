/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends gi {
    il[] field_o;
    static he field_s;
    il[] field_n;
    static int field_v;
    static int[] field_u;
    int field_l;
    static he[] field_q;
    int field_r;
    int[] field_p;
    static int field_m;
    int[] field_j;
    static he[] field_i;
    int[] field_w;
    static String field_k;
    static qb field_h;
    byte[][][] field_t;

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == 249) {
          var2 = param1;
          if (var2 != 32) {
            if (160 == var2) {
              return '_';
            }
            if (var2 != 95 &&
              var2 != 45) {
              if (var2 == 91) {
                return param1;
              }
              if (var2 == 93) {
                return param1;
              }
              if (var2 == 35) {
                return param1;
              }
              if (224 == var2) {
                return 'a';
              }
              if (var2 != 225 &&
                var2 != 226 &&
                var2 != 228 &&
                var2 != 227 &&
                var2 != 192 &&
                var2 != 193 &&
                var2 != 194 &&
                var2 != 196 &&
                var2 != 195) {
                if (232 != var2 &&
                  233 != var2 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  200 != var2 &&
                  201 != var2 &&
                  var2 != 202 &&
                  var2 != 203) {
                  if (237 != var2 &&
                    var2 != 238 &&
                    var2 != 239 &&
                    var2 != 205 &&
                    206 != var2 &&
                    var2 != 207) {
                    if (242 != var2 &&
                      var2 != 243 &&
                      244 != var2 &&
                      var2 != 246 &&
                      var2 != 245 &&
                      var2 != 210 &&
                      var2 != 211 &&
                      var2 != 212 &&
                      var2 != 214 &&
                      var2 != 213) {
                      if (249 != var2 &&
                        250 != var2 &&
                        var2 != 251 &&
                        var2 != 252 &&
                        var2 != 217 &&
                        var2 != 218) {
                        if (var2 == 219) {
                          return 'u';
                        }
                        if (var2 != 220) {
                          if (var2 == 231) {
                            return 'c';
                          }
                          if (var2 == 199) {
                            return 'c';
                          }
                          if (255 == var2) {
                            return 'y';
                          }
                          if (376 == var2) {
                            return 'y';
                          }
                          if (var2 == 241) {
                            return 'n';
                          }
                          if (209 == var2) {
                            return 'n';
                          }
                          if (var2 == 223) {
                            return 'b';
                          }
                          return Character.toLowerCase(param1);
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
          }
          return '_';
        }
        field_s = (he) null;
        var2Lifetime1 = param1;
        if (var2Lifetime1 != 32) {
          if (160 == var2Lifetime1) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              var2Lifetime1 != 93 &&
              var2Lifetime1 != 35) {
              if (224 != var2Lifetime1 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226 &&
                var2Lifetime1 != 228 &&
                var2Lifetime1 != 227 &&
                var2Lifetime1 != 192 &&
                var2Lifetime1 != 193 &&
                var2Lifetime1 != 194 &&
                var2Lifetime1 != 196 &&
                var2Lifetime1 != 195) {
                if (232 != var2Lifetime1 &&
                  233 != var2Lifetime1 &&
                  var2Lifetime1 != 234 &&
                  var2Lifetime1 != 235 &&
                  200 != var2Lifetime1 &&
                  201 != var2Lifetime1) {
                  if (var2Lifetime1 == 202) {
                    return 'e';
                  }
                  if (var2Lifetime1 != 203) {
                    if (237 != var2Lifetime1) {
                      if (var2Lifetime1 == 238) {
                        return 'i';
                      }
                      if (var2Lifetime1 != 239) {
                        if (var2Lifetime1 == 205) {
                          return 'i';
                        }
                        if (206 != var2Lifetime1 &&
                          var2Lifetime1 != 207) {
                          if (242 != var2Lifetime1 &&
                            var2Lifetime1 != 243 &&
                            244 != var2Lifetime1 &&
                            var2Lifetime1 != 246) {
                            if (var2Lifetime1 == 245) {
                              return 'o';
                            }
                            if (var2Lifetime1 == 210) {
                              return 'o';
                            }
                            if (var2Lifetime1 == 211) {
                              return 'o';
                            }
                            if (var2Lifetime1 == 212) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 214) {
                              if (var2Lifetime1 == 213) {
                                return 'o';
                              }
                              if (249 != var2Lifetime1) {
                                if (250 == var2Lifetime1) {
                                  return 'u';
                                }
                                if (var2Lifetime1 == 251) {
                                  return 'u';
                                }
                                if (var2Lifetime1 == 252) {
                                  return 'u';
                                }
                                if (var2Lifetime1 == 217) {
                                  return 'u';
                                }
                                if (var2Lifetime1 != 218) {
                                  if (var2Lifetime1 == 219) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 != 220) {
                                    if (var2Lifetime1 == 231) {
                                      return 'c';
                                    }
                                    if (var2Lifetime1 == 199) {
                                      return 'c';
                                    }
                                    if (255 == var2Lifetime1) {
                                      return 'y';
                                    }
                                    if (376 == var2Lifetime1) {
                                      return 'y';
                                    }
                                    if (var2Lifetime1 == 241) {
                                      return 'n';
                                    }
                                    if (209 == var2Lifetime1) {
                                      return 'n';
                                    }
                                    if (var2Lifetime1 == 223) {
                                      return 'b';
                                    }
                                    return Character.toLowerCase(param1);
                                  }
                                }
                              }
                              return 'u';
                            }
                          }
                          return 'o';
                        }
                      }
                    }
                    return 'i';
                  }
                }
                return 'e';
              }
              return 'a';
            }
            return param1;
          }
        }
        return '_';
    }

    public static void b(byte param0) {
        field_k = null;
        if (param0 == 111) {
          field_s = null;
          field_i = null;
          field_u = null;
          field_h = null;
          field_q = null;
          return;
        }
        field_m = 76;
        field_s = null;
        field_i = null;
        field_u = null;
        field_h = null;
        field_q = null;
    }

    final static void c(byte param0) {
        ja.field_Q = fg.a(1);
        ng.field_c = new k();
        int var1 = -73 % ((param0 - 47) / 52);
        q.a((byte) -29, true, true);
    }

    final static void a(int param0, byte param1) {
        ml var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          dg.field_e = param0;
          if (param1 != 24) {
            return;
          }
          var2 = (ml) (ff.field_O.h(-11151));
          while (var2 != null) {
            if (var2.field_o.c(-1387)) {
              var2.field_i.e(var2.field_k * dg.field_e / 80);
            } else {
              var2.a(-16175);
            }
            var2 = (ml) (ff.field_O.e(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "lc.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        fl.field_i = false;
        int var1 = 51 % ((-60 - param0) / 37);
        dh.field_N.l(31760);
    }

    lc() {
    }

    static {
        field_v = 0;
        field_k = "EXCLUSIVE";
    }
}
