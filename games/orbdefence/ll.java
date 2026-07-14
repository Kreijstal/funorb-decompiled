/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static char[] field_b;
    static fj field_a;

    public static void a(int param0) {
        int var1 = -46 % ((param0 - 59) / 40);
        field_b = null;
        field_a = null;
    }

    abstract void a(int param0, byte[] param1);

    final static void a(ed param0, int param1, String param2, kc param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        var5 = 0;
        var6 = -1;
        var7 = 1;
        if (param4 != 404465128) {
          var10 = null;
          ll.a((ed) null, 108, (String) null, (kc) null, 30);
          if (param2.length() > var7) {
            L0: {
              var8 = param2.charAt(var7);
              if (var8 == 60) {
                var6 = (var5 >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                break L0;
              } else {
                break L0;
              }
            }
            if (var6 != -1) {
              L1: {
                param0.field_g[var7] = var6;
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              var7++;
              var7++;
              if (param2.length() > var7) {
                L2: {
                  var8 = param2.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5 >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var6 != -1) {
                    param0.field_g[var7] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (var8 != 32) {
                        break L4;
                      } else {
                        var5 = var5 + param1;
                        break L4;
                      }
                    }
                    param0.field_g[var7] = param0.field_g[0] + ((var5 >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                    break L3;
                  }
                }
                L5: {
                  if (var8 == 62) {
                    var6 = -1;
                    var7++;
                    break L5;
                  } else {
                    var7++;
                    break L5;
                  }
                }
                var7++;
                var7++;
                L6: while (true) {
                  if (param2.length() > var7) {
                    L7: {
                      var8 = param2.charAt(var7);
                      if (var8 == 60) {
                        var6 = (var5 >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var6 != -1) {
                        param0.field_g[var7] = var6;
                        break L8;
                      } else {
                        L9: {
                          if (var8 != 32) {
                            break L9;
                          } else {
                            var5 = var5 + param1;
                            break L9;
                          }
                        }
                        param0.field_g[var7] = param0.field_g[0] + ((var5 >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                        break L8;
                      }
                    }
                    if (var8 == 62) {
                      var6 = -1;
                      var7++;
                      continue L6;
                    } else {
                      var7++;
                      var7++;
                      continue L6;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L10: {
                if (var8 != 32) {
                  break L10;
                } else {
                  var5 = var5 + param1;
                  break L10;
                }
              }
              L11: {
                param0.field_g[var7] = param0.field_g[0] + ((var5 >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              var7++;
              var7++;
              if (param2.length() > var7) {
                L12: {
                  var8 = param2.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5 >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var6 != -1) {
                    param0.field_g[var7] = var6;
                    break L13;
                  } else {
                    L14: {
                      if (var8 != 32) {
                        break L14;
                      } else {
                        var5 = var5 + param1;
                        break L14;
                      }
                    }
                    param0.field_g[var7] = param0.field_g[0] + ((var5 >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                    break L13;
                  }
                }
                L15: {
                  if (var8 == 62) {
                    var6 = -1;
                    var7++;
                    break L15;
                  } else {
                    var7++;
                    break L15;
                  }
                }
                var7++;
                var7++;
                L16: while (true) {
                  if (param2.length() > var7) {
                    L17: {
                      var8 = param2.charAt(var7);
                      if (var8 == 60) {
                        var6 = (var5 >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (var6 != -1) {
                        param0.field_g[var7] = var6;
                        break L18;
                      } else {
                        L19: {
                          if (var8 != 32) {
                            break L19;
                          } else {
                            var5 = var5 + param1;
                            break L19;
                          }
                        }
                        param0.field_g[var7] = param0.field_g[0] + ((var5 >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                        break L18;
                      }
                    }
                    if (var8 == 62) {
                      var6 = -1;
                      var7++;
                      continue L16;
                    } else {
                      var7++;
                      var7++;
                      continue L16;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          L20: while (true) {
            if (param2.length() > var7) {
              L21: {
                var8 = param2.charAt(var7);
                if (var8 == 60) {
                  var6 = (var5 >> -153798488) + (param0.field_g[0] - -param3.a(param2.substring(0, var7)));
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (var6 != -1) {
                  param0.field_g[var7] = var6;
                  break L22;
                } else {
                  L23: {
                    if (var8 != 32) {
                      break L23;
                    } else {
                      var5 = var5 + param1;
                      break L23;
                    }
                  }
                  param0.field_g[var7] = param0.field_g[0] + ((var5 >> 404465128) - -param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
                  break L22;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                var7++;
                continue L20;
              } else {
                var7++;
                var7++;
                continue L20;
              }
            } else {
              return;
            }
          }
        }
    }

    abstract byte[] a(byte param0);

    final static boolean a(String param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -153798488) {
          L0: {
            field_b = null;
            if (gi.a(param0, param1 ^ 153798427) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (gi.a(param0, param1 ^ 153798427) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[128];
    }
}
