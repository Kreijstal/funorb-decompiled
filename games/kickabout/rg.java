/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg {
    static hd field_a;
    static hd field_e;
    static boolean field_b;
    static String field_d;
    static long[] field_c;
    static boolean field_f;

    public static void a() {
        field_a = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        L0: {
          if (eq.a(false)) {
            param1 = false;
            break L0;
          } else {
            break L0;
          }
        }
        ji.a((byte) 123, param1);
        int discarded$7 = 1;
        ma.k();
        if (param0 >= -115) {
          rg.a((byte) 9, true);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          var2 = 0;
          var3 = up.field_p;
          if (var3 < 5) {
            var2 = 8192 * (var3 * var3) / 1100;
            break L0;
          } else {
            if (var3 < 105) {
              L1: {
                var2 = (-40960 + 16384 * var3) / 220;
                var4 = 1;
                var5 = 0;
                if (param0 == 3) {
                  var4 = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 1) {
                  var5 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 != 4) {
                  break L3;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L3;
                }
              }
              L4: {
                if (param0 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param0 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (param0 == 7) {
                    break L7;
                  } else {
                    if (param0 == 8) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                var4 = -1;
                var5 = -1;
                break L6;
              }
              L8: {
                if (param0 == 11) {
                  var4 = -1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0 != 12) {
                  break L9;
                } else {
                  var5 = -1;
                  var4 = -1;
                  break L9;
                }
              }
              L10: {
                if (param0 == 13) {
                  var4 = 1;
                  var5 = -1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param0 != 14) {
                  break L11;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L11;
                }
              }
              L12: {
                if (15 == param0) {
                  var5 = 1;
                  var4 = 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              hh.field_g = rf.a(var4 * var2, -125, var5 * var2);
              return;
            } else {
              if (var3 >= 120) {
                break L0;
              } else {
                L13: {
                  var3 = 120 - var3;
                  var2 = -(var3 * var3 * 8192 / 3300) + 8192;
                  var4 = 1;
                  var5 = 0;
                  if (param0 == 3) {
                    var4 = -1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0 == 1) {
                    var5 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0 != 4) {
                    break L15;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L15;
                  }
                }
                L16: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param0 == 6) {
                    var5 = -1;
                    var4 = 1;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if (param0 != 7) {
                  if (param0 != 8) {
                    L18: {
                      if (param0 == 11) {
                        var4 = -1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (param0 != 12) {
                        break L19;
                      } else {
                        var5 = -1;
                        var4 = -1;
                        break L19;
                      }
                    }
                    L20: {
                      if (param0 == 13) {
                        var4 = 1;
                        var5 = -1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (param0 != 14) {
                        break L21;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L21;
                      }
                    }
                    L22: {
                      if (15 == param0) {
                        var5 = 1;
                        var4 = 1;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    hh.field_g = rf.a(var4 * var2, -125, var5 * var2);
                    return;
                  } else {
                    L23: {
                      var4 = -1;
                      var5 = -1;
                      if (param0 == 11) {
                        var4 = -1;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (param0 != 12) {
                        break L24;
                      } else {
                        var5 = -1;
                        var4 = -1;
                        break L24;
                      }
                    }
                    L25: {
                      if (param0 == 13) {
                        var4 = 1;
                        var5 = -1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (param0 != 14) {
                        break L26;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L26;
                      }
                    }
                    L27: {
                      if (15 == param0) {
                        var5 = 1;
                        var4 = 1;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    hh.field_g = rf.a(var4 * var2, -125, var5 * var2);
                    return;
                  }
                } else {
                  L28: {
                    var4 = -1;
                    var5 = -1;
                    if (param0 == 11) {
                      var4 = -1;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (param0 != 12) {
                      break L29;
                    } else {
                      var5 = -1;
                      var4 = -1;
                      break L29;
                    }
                  }
                  L30: {
                    if (param0 == 13) {
                      var4 = 1;
                      var5 = -1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (param0 != 14) {
                      break L31;
                    } else {
                      var4 = -1;
                      var5 = 1;
                      break L31;
                    }
                  }
                  L32: {
                    if (15 == param0) {
                      var5 = 1;
                      var4 = 1;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  hh.field_g = rf.a(var4 * var2, -125, var5 * var2);
                  return;
                }
              }
            }
          }
        }
        L33: {
          var4 = 1;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          if (param0 == 1) {
            var5 = 1;
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          if (param0 != 4) {
            break L35;
          } else {
            var5 = 1;
            var4 = 1;
            break L35;
          }
        }
        L36: {
          if (param0 == 5) {
            var5 = 1;
            var4 = -1;
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          L39: {
            if (param0 == 7) {
              break L39;
            } else {
              if (param0 == 8) {
                break L39;
              } else {
                break L38;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L38;
        }
        L40: {
          if (param0 == 11) {
            var4 = -1;
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          if (param0 != 12) {
            break L41;
          } else {
            var5 = -1;
            var4 = -1;
            break L41;
          }
        }
        L42: {
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          if (param0 != 14) {
            break L43;
          } else {
            var4 = -1;
            var5 = 1;
            break L43;
          }
        }
        L44: {
          if (15 == param0) {
            var5 = 1;
            var4 = 1;
            break L44;
          } else {
            break L44;
          }
        }
        hh.field_g = rf.a(var4 * var2, -125, var5 * var2);
    }

    final static void a(int param0) {
        or.field_d.b(9, (byte) -52);
        ec.field_e = true;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void b(byte param0, java.awt.Component param1);

    abstract int b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = true;
        field_c = new long[1000];
        field_d = "Exp: <%0>";
    }
}
