/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qf {
    static Random field_a;
    static pd field_c;
    static String field_g;
    static String field_d;
    static cj field_b;
    static int field_f;
    static String field_e;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 == 241) {
          field_b = null;
          field_e = null;
          field_g = null;
          return;
        }
        field_b = (cj) null;
        field_b = null;
        field_e = null;
        field_g = null;
    }

    final static void a(Object[] param0, int param1, int param2, int param3, int[] param4) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param2 != 2) {
            qf.a(67, '\026');
          }
          if (param1 < param3) {
            var5_int = (param3 + param1) / 2;
            var6 = param1;
            var7 = param4[var5_int];
            param4[var5_int] = param4[param3];
            param4[param3] = var7;
            var8 = param0[var5_int];
            param0[var5_int] = param0[param3];
            param0[param3] = var8;
            stackIn_8_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_8_0;
            for (var10 = param1; param3 > var10; var10++) {
              if (param4[var10] < (var9 & var10) + var7) {
                var11 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6] = var11;
                var12 = param0[var10];
                param0[var10] = param0[var6];
                incrementValue$0 = var6;
                var6++;
                param0[incrementValue$0] = var12;
              }
            }
            param4[param3] = param4[var6];
            param4[var6] = var7;
            param0[param3] = param0[var6];
            param0[var6] = var8;
            qf.a(param0, param1, 2, var6 - 1, param4);
            qf.a(param0, var6 + 1, 2, param3, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("qf.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, byte param3, String param4) {
        try {
          int var5_int = -7 / ((param3 - 23) / 48);
          b.field_b = param1;
          sc.a(ah.field_e.field_C + ah.field_e.field_r, fh.field_h, param4, true, 320, 240, 15, ah.field_e, 10, (byte) -103, 5, param0, ah.field_e.field_C, param2, rl.field_a);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 28233) {
          var2 = param1;
          if (var2 == 32) {
            return '_';
          }
          if (160 != var2) {
            if (95 == var2) {
              return '_';
            }
            if (var2 != 45) {
              if (var2 != 91) {
                if (var2 == 93) {
                  return param1;
                }
                if (var2 != 35) {
                  if (var2 == 224) {
                    return 'a';
                  }
                  if (225 != var2 &&
                    var2 != 226 &&
                    var2 != 228 &&
                    var2 != 227 &&
                    var2 != 192 &&
                    var2 != 193 &&
                    var2 != 194 &&
                    var2 != 196 &&
                    195 != var2) {
                    if (var2 != 232 &&
                      var2 != 233 &&
                      var2 != 234 &&
                      var2 != 235 &&
                      var2 != 200 &&
                      var2 != 201 &&
                      var2 != 202 &&
                      var2 != 203) {
                      if (237 != var2 &&
                        238 != var2 &&
                        var2 != 239 &&
                        var2 != 205 &&
                        var2 != 206 &&
                        207 != var2) {
                        if (var2 != 242 &&
                          var2 != 243 &&
                          var2 != 244 &&
                          var2 != 246 &&
                          var2 != 245 &&
                          var2 != 210 &&
                          211 != var2 &&
                          212 != var2 &&
                          214 != var2 &&
                          var2 != 213) {
                          if (var2 != 249) {
                            if (var2 == 250) {
                              return 'u';
                            }
                            if (var2 != 251 &&
                              var2 != 252 &&
                              217 != var2 &&
                              var2 != 218 &&
                              var2 != 219) {
                              if (220 == var2) {
                                return 'u';
                              }
                              if (var2 == 231) {
                                return 'c';
                              }
                              if (var2 == 199) {
                                return 'c';
                              }
                              if (255 == var2) {
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
              return param1;
            }
          }
          return '_';
        }
        qf.a(5);
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (160 != var2Lifetime1 &&
          95 != var2Lifetime1 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 != 91 &&
            var2Lifetime1 != 93 &&
            var2Lifetime1 != 35) {
            if (var2Lifetime1 != 224 &&
              225 != var2Lifetime1 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227 &&
              var2Lifetime1 != 192 &&
              var2Lifetime1 != 193 &&
              var2Lifetime1 != 194 &&
              var2Lifetime1 != 196 &&
              195 != var2Lifetime1) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234 &&
                var2Lifetime1 != 235 &&
                var2Lifetime1 != 200 &&
                var2Lifetime1 != 201) {
                if (var2Lifetime1 == 202) {
                  return 'e';
                }
                if (var2Lifetime1 == 203) {
                  return 'e';
                }
                if (237 == var2Lifetime1) {
                  return 'i';
                }
                if (238 == var2Lifetime1) {
                  return 'i';
                }
                if (var2Lifetime1 == 239) {
                  return 'i';
                }
                if (var2Lifetime1 == 205) {
                  return 'i';
                }
                if (var2Lifetime1 == 206) {
                  return 'i';
                }
                if (207 == var2Lifetime1) {
                  return 'i';
                }
                if (var2Lifetime1 == 242) {
                  return 'o';
                }
                if (var2Lifetime1 == 243) {
                  return 'o';
                }
                if (var2Lifetime1 == 244) {
                  return 'o';
                }
                if (var2Lifetime1 == 246) {
                  return 'o';
                }
                if (var2Lifetime1 != 245 &&
                  var2Lifetime1 != 210 &&
                  211 != var2Lifetime1) {
                  if (212 == var2Lifetime1) {
                    return 'o';
                  }
                  if (214 != var2Lifetime1 &&
                    var2Lifetime1 != 213) {
                    if (var2Lifetime1 != 249) {
                      if (var2Lifetime1 == 250) {
                        return 'u';
                      }
                      if (var2Lifetime1 != 251 &&
                        var2Lifetime1 != 252 &&
                        217 != var2Lifetime1 &&
                        var2Lifetime1 != 218 &&
                        var2Lifetime1 != 219) {
                        if (220 == var2Lifetime1) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 231) {
                          return 'c';
                        }
                        if (var2Lifetime1 == 199) {
                          return 'c';
                        }
                        if (255 == var2Lifetime1) {
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
                        if (var2Lifetime1 == 223) {
                          return 'b';
                        }
                        return Character.toLowerCase(param1);
                      }
                    }
                    return 'u';
                  }
                }
                return 'o';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    static {
        field_a = new Random();
        field_e = "This will be an explosive surprise to your enemies.";
        field_d = "End Game";
        field_f = 0;
    }
}
