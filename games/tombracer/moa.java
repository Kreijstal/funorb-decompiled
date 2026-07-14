/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class moa {
    static int field_b;
    static int field_a;

    final static String a(gqa param0, int param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        Object var6 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var6 = null;
        var2 = (String) var6;
        if (param0.field_g != null) {
          L0: {
            var5 = param0.field_g;
            var2 = var5;
            var2 = var5;
            if ((param0.field_n ^ -1) == -2) {
              var2 = "<img=0>" + var5;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0.field_n != -3) {
              break L1;
            } else {
              var2 = "<img=1>" + var2;
              break L1;
            }
          }
          var3 = "";
          if (-3 == param0.field_d) {
            if (!param0.field_m) {
              if (param0.field_c != 0) {
                var3 = gl.a((byte) 112, li.field_a, new String[1]);
                if (param1 >= 78) {
                  return var3;
                } else {
                  return null;
                }
              } else {
                if (param0.field_o == 0) {
                  var3 = gl.a((byte) 114, wha.field_G, new String[1]);
                  if (param1 >= 78) {
                    return var3;
                  } else {
                    return null;
                  }
                } else {
                  var3 = gl.a((byte) 112, li.field_a, new String[1]);
                  if (param1 >= 78) {
                    return var3;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              if (param1 >= 78) {
                return var3;
              } else {
                return null;
              }
            }
          } else {
            L2: {
              if (param0.field_d != 0) {
                break L2;
              } else {
                if (kq.field_c) {
                  var3 = "[" + cla.field_o + "] ";
                  break L2;
                } else {
                  L3: {
                    if (-2 != (param0.field_d ^ -1)) {
                      break L3;
                    } else {
                      var3 = "[" + gl.a((byte) 96, jea.field_nb, new String[1]) + "] ";
                      break L3;
                    }
                  }
                  L4: {
                    if (4 != param0.field_d) {
                      break L4;
                    } else {
                      if (null == tla.field_f) {
                        break L4;
                      } else {
                        var3 = "[" + tla.field_f + "] ";
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param0.field_d == 3) {
                      var3 = "[#" + param0.field_b + "] ";
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (!param0.field_m) {
                    var3 = var3 + var2 + ": ";
                    if (param1 >= 78) {
                      return var3;
                    } else {
                      return null;
                    }
                  } else {
                    if (param1 < 78) {
                      return null;
                    } else {
                      return var3;
                    }
                  }
                }
              }
            }
            L6: {
              if (-2 != (param0.field_d ^ -1)) {
                break L6;
              } else {
                var3 = "[" + gl.a((byte) 96, jea.field_nb, new String[1]) + "] ";
                break L6;
              }
            }
            L7: {
              if (4 != param0.field_d) {
                break L7;
              } else {
                if (null == tla.field_f) {
                  break L7;
                } else {
                  var3 = "[" + tla.field_f + "] ";
                  break L7;
                }
              }
            }
            L8: {
              if (param0.field_d == 3) {
                var3 = "[#" + param0.field_b + "] ";
                break L8;
              } else {
                break L8;
              }
            }
            if (!param0.field_m) {
              var3 = var3 + var2 + ": ";
              if (param1 >= 78) {
                return var3;
              } else {
                return null;
              }
            } else {
              if (param1 >= 78) {
                return var3;
              } else {
                return null;
              }
            }
          }
        } else {
          var3 = "";
          if (-3 == param0.field_d) {
            if (!param0.field_m) {
              if (param0.field_c != 0) {
                var3 = gl.a((byte) 112, li.field_a, new String[1]);
                if (param1 < 78) {
                  return null;
                } else {
                  return var3;
                }
              } else {
                if (param0.field_o == 0) {
                  var3 = gl.a((byte) 114, wha.field_G, new String[1]);
                  var2 = var3;
                  var2 = var3;
                  if (param1 < 78) {
                    return null;
                  } else {
                    return var3;
                  }
                } else {
                  var3 = gl.a((byte) 112, li.field_a, new String[1]);
                  if (param1 < 78) {
                    return null;
                  } else {
                    return var3;
                  }
                }
              }
            } else {
              if (param1 < 78) {
                return null;
              } else {
                return var3;
              }
            }
          } else {
            L9: {
              if (param0.field_d != 0) {
                break L9;
              } else {
                if (kq.field_c) {
                  var3 = "[" + cla.field_o + "] ";
                  break L9;
                } else {
                  L10: {
                    if (-2 != param0.field_d) {
                      break L10;
                    } else {
                      var3 = "[" + gl.a((byte) 96, jea.field_nb, new String[1]) + "] ";
                      break L10;
                    }
                  }
                  L11: {
                    if (4 != param0.field_d) {
                      break L11;
                    } else {
                      if (null == tla.field_f) {
                        break L11;
                      } else {
                        var3 = "[" + tla.field_f + "] ";
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (param0.field_d == 3) {
                      var3 = "[#" + param0.field_b + "] ";
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (!param0.field_m) {
                      var3 = var3 + var6 + ": ";
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  if (param1 < 78) {
                    return null;
                  } else {
                    return var3;
                  }
                }
              }
            }
            L14: {
              if (-2 != (param0.field_d ^ -1)) {
                break L14;
              } else {
                var3 = "[" + gl.a((byte) 96, jea.field_nb, new String[1]) + "] ";
                break L14;
              }
            }
            L15: {
              if (4 != param0.field_d) {
                break L15;
              } else {
                if (null == tla.field_f) {
                  break L15;
                } else {
                  var3 = "[" + tla.field_f + "] ";
                  break L15;
                }
              }
            }
            L16: {
              if (param0.field_d == 3) {
                var3 = "[#" + param0.field_b + "] ";
                break L16;
              } else {
                break L16;
              }
            }
            if (!param0.field_m) {
              var3 = var3 + var6 + ": ";
              if (param1 < 78) {
                return null;
              } else {
                return var3;
              }
            } else {
              if (param1 < 78) {
                return null;
              } else {
                return var3;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = -1;
    }
}
