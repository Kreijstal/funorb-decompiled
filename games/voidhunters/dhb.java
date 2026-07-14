/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dhb extends rqa {
    static String field_o;

    final static void a(float param0, int param1, float param2, byte param3, int param4, int param5, int param6, int param7, float[] param8, int param9, int param10, float[] param11, int param12, float param13) {
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        L0: {
          var20 = VoidHunters.field_G;
          param1 = param1 - param5;
          param4 = param4 - param9;
          param6 = param6 - param12;
          var14 = (float)param4 * param11[0] + (float)param6 * param11[1] + param11[2] * (float)param1;
          var15 = (float)param1 * param11[5] + ((float)param6 * param11[4] + (float)param4 * param11[3]);
          var16 = param11[8] * (float)param1 + (param11[6] * (float)param4 + (float)param6 * param11[7]);
          if (param7 != 0) {
            if (-2 == (param7 ^ -1)) {
              var17 = var14 + param13 + 0.5f;
              var18 = 0.5f + (param0 + var16);
              break L0;
            } else {
              if (param7 == -3) {
                L1: {
                  var18 = 0.5f + (-var15 + param2);
                  var17 = param13 + -var14 + 0.5f;
                  if (param10 == -2) {
                    var19 = var17;
                    var17 = -var18;
                    var18 = var19;
                    break L1;
                  } else {
                    if (-3 == param10) {
                      var18 = -var18;
                      var17 = -var17;
                      break L1;
                    } else {
                      if (3 == param10) {
                        var19 = var17;
                        var17 = var18;
                        var18 = -var19;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                param8[1] = var18;
                if (param3 <= 10) {
                  return;
                } else {
                  param8[0] = var17;
                  return;
                }
              } else {
                if (3 == param7) {
                  L2: {
                    var17 = 0.5f + (var14 + param13);
                    var18 = 0.5f + (-var15 + param2);
                    if (param10 == -2) {
                      var19 = var17;
                      var17 = -var18;
                      var18 = var19;
                      break L2;
                    } else {
                      if (-3 == param10) {
                        var18 = -var18;
                        var17 = -var17;
                        break L2;
                      } else {
                        if (3 == param10) {
                          var19 = var17;
                          var17 = var18;
                          var18 = -var19;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  param8[1] = var18;
                  if (param3 <= 10) {
                    return;
                  } else {
                    param8[0] = var17;
                    return;
                  }
                } else {
                  if (-5 == param7) {
                    L3: {
                      var18 = param2 + -var15 + 0.5f;
                      var17 = 0.5f + (param0 + var16);
                      if (param10 == -2) {
                        var19 = var17;
                        var17 = -var18;
                        var18 = var19;
                        break L3;
                      } else {
                        if (-3 == param10) {
                          var18 = -var18;
                          var17 = -var17;
                          break L3;
                        } else {
                          if (3 == param10) {
                            var19 = var17;
                            var17 = var18;
                            var18 = -var19;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    param8[1] = var18;
                    if (param3 <= 10) {
                      return;
                    } else {
                      param8[0] = var17;
                      return;
                    }
                  } else {
                    var18 = param2 + -var15 + 0.5f;
                    var17 = 0.5f + (param0 + -var16);
                    break L0;
                  }
                }
              }
            }
          } else {
            var17 = var14 + param13 + 0.5f;
            var18 = 0.5f + (-var16 + param0);
            break L0;
          }
        }
        if (param10 == -2) {
          var19 = var17;
          var17 = -var18;
          var18 = var19;
          param8[1] = var18;
          if (param3 <= 10) {
            return;
          } else {
            param8[0] = var17;
            return;
          }
        } else {
          if (-3 == param10) {
            var18 = -var18;
            var17 = -var17;
            param8[1] = var18;
            if (param3 <= 10) {
              return;
            } else {
              param8[0] = var17;
              return;
            }
          } else {
            if (3 == param10) {
              var19 = var17;
              var17 = var18;
              var18 = -var19;
              param8[1] = var18;
              if (param3 <= 10) {
                return;
              } else {
                param8[0] = var17;
                return;
              }
            } else {
              param8[1] = var18;
              if (param3 <= 10) {
                return;
              } else {
                param8[0] = var17;
                return;
              }
            }
          }
        }
    }

    dhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 6) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(79, 62, param0[0].a(106));
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "The game options are not all set.";
    }
}
