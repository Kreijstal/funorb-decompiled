/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int field_a;
    static long field_d;
    static String field_c;
    static int[] field_b;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            Object var2 = null;
            String discarded$0 = bl.a(24, (CharSequence) null);
        }
    }

    final static int a(byte param0, vd param1, String[] param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        var14 = wizardrun.field_H;
        var5 = param1.b(param4);
        if (var5 <= param3) {
          if (-1 != param4.indexOf("<br>")) {
            var6 = (param3 + (var5 + -1)) / param3;
            param3 = var5 / var6;
            var6 = 0;
            var9 = 82 % ((-41 - param0) / 56);
            var7 = 0;
            var8 = param4.length();
            var10 = 0;
            if (var8 > var10) {
              var11 = param4.charAt(var10);
              if (var11 != 32) {
                if (45 == var11) {
                  var12 = param4.substring(var7, var10 - -1).trim();
                  var13 = param1.b(var12);
                  if (var13 < param3) {
                    L0: {
                      if (62 != var11) {
                        var10++;
                        break L0;
                      } else {
                        L1: {
                          if (!param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                            var10++;
                            break L1;
                          } else {
                            int incrementValue$16 = var6;
                            var6++;
                            param2[incrementValue$16] = param4.substring(var7, var10 - 3).trim();
                            var7 = var10 + 1;
                            break L1;
                          }
                        }
                        var10++;
                        break L0;
                      }
                    }
                    L2: {
                      var10++;
                      var10++;
                      if (var7 < var8) {
                        int incrementValue$17 = var6;
                        var6++;
                        param2[incrementValue$17] = param4.substring(var7, var8).trim();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return var6;
                  } else {
                    L3: {
                      int incrementValue$18 = var6;
                      var6++;
                      param2[incrementValue$18] = var12;
                      var7 = var10 + 1;
                      if (62 != var11) {
                        var10++;
                        break L3;
                      } else {
                        L4: {
                          if (!param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                            var10++;
                            break L4;
                          } else {
                            int incrementValue$19 = var6;
                            var6++;
                            param2[incrementValue$19] = param4.substring(var7, var10 - 3).trim();
                            var7 = var10 + 1;
                            break L4;
                          }
                        }
                        var10++;
                        break L3;
                      }
                    }
                    L5: {
                      var10++;
                      var10++;
                      if (var7 < var8) {
                        int incrementValue$20 = var6;
                        var6++;
                        param2[incrementValue$20] = param4.substring(var7, var8).trim();
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return var6;
                  }
                } else {
                  L6: {
                    if (62 != var11) {
                      var10++;
                      break L6;
                    } else {
                      L7: {
                        if (!param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                          var10++;
                          break L7;
                        } else {
                          int incrementValue$21 = var6;
                          var6++;
                          param2[incrementValue$21] = param4.substring(var7, var10 - 3).trim();
                          var7 = var10 + 1;
                          break L7;
                        }
                      }
                      var10++;
                      break L6;
                    }
                  }
                  L8: {
                    var10++;
                    var10++;
                    if (var7 < var8) {
                      int incrementValue$22 = var6;
                      var6++;
                      param2[incrementValue$22] = param4.substring(var7, var8).trim();
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return var6;
                }
              } else {
                var12 = param4.substring(var7, var10 - -1).trim();
                var13 = param1.b(var12);
                if (var13 < param3) {
                  L9: {
                    if (62 != var11) {
                      var10++;
                      break L9;
                    } else {
                      L10: {
                        if (!param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                          var10++;
                          break L10;
                        } else {
                          int incrementValue$23 = var6;
                          var6++;
                          param2[incrementValue$23] = param4.substring(var7, var10 - 3).trim();
                          var7 = var10 + 1;
                          break L10;
                        }
                      }
                      var10++;
                      break L9;
                    }
                  }
                  L11: {
                    var10++;
                    var10++;
                    if (var7 < var8) {
                      int incrementValue$24 = var6;
                      var6++;
                      param2[incrementValue$24] = param4.substring(var7, var8).trim();
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return var6;
                } else {
                  L12: {
                    int incrementValue$25 = var6;
                    var6++;
                    param2[incrementValue$25] = var12;
                    var7 = var10 + 1;
                    if (62 != var11) {
                      var10++;
                      break L12;
                    } else {
                      L13: {
                        if (!param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                          var10++;
                          break L13;
                        } else {
                          int incrementValue$26 = var6;
                          var6++;
                          param2[incrementValue$26] = param4.substring(var7, var10 - 3).trim();
                          var7 = var10 + 1;
                          break L13;
                        }
                      }
                      var10++;
                      break L12;
                    }
                  }
                  L14: {
                    var10++;
                    var10++;
                    if (var7 < var8) {
                      int incrementValue$27 = var6;
                      var6++;
                      param2[incrementValue$27] = param4.substring(var7, var8).trim();
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  return var6;
                }
              }
            } else {
              L15: {
                if (var7 < var8) {
                  int incrementValue$28 = var6;
                  var6++;
                  param2[incrementValue$28] = param4.substring(var7, var8).trim();
                  break L15;
                } else {
                  break L15;
                }
              }
              return var6;
            }
          } else {
            param2[0] = (String) (Object) param2;
            return 1;
          }
        } else {
          var6 = (param3 + (var5 + -1)) / param3;
          param3 = var5 / var6;
          var6 = 0;
          var9 = 82 % ((-41 - param0) / 56);
          var7 = 0;
          var8 = param4.length();
          var10 = 0;
          L16: while (true) {
            if (var8 <= var10) {
              L17: {
                if (var7 < var8) {
                  int incrementValue$29 = var6;
                  var6++;
                  param2[incrementValue$29] = param4.substring(var7, var8).trim();
                  break L17;
                } else {
                  break L17;
                }
              }
              return var6;
            } else {
              L18: {
                L19: {
                  var11 = param4.charAt(var10);
                  if (var11 == 32) {
                    break L19;
                  } else {
                    if (45 == var11) {
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                var12 = param4.substring(var7, var10 - -1).trim();
                var13 = param1.b(var12);
                if (var13 >= param3) {
                  int incrementValue$30 = var6;
                  var6++;
                  param2[incrementValue$30] = var12;
                  var7 = var10 + 1;
                  break L18;
                } else {
                  break L18;
                }
              }
              if (62 == var11) {
                if (param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                  int incrementValue$31 = var6;
                  var6++;
                  param2[incrementValue$31] = param4.substring(var7, var10 - 3).trim();
                  var7 = var10 + 1;
                  var10++;
                  continue L16;
                } else {
                  var10++;
                  var10++;
                  continue L16;
                }
              } else {
                var10++;
                var10++;
                continue L16;
              }
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 != 4) {
            return null;
        }
        return bb.a(param1, 0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
