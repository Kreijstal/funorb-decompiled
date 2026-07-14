/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static vn[] field_c;
    static int[] field_d;
    static String[] field_a;
    static be field_b;

    final static void a(byte param0) {
        dk.field_ac = false;
        if (param0 <= 44) {
            sl.a((byte) 27);
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = ej.field_x;
        if (5 > var3) {
          L0: {
            var2 = 8192 * (var3 * var3) / 1100;
            var4 = 1;
            var5 = 0;
            if (param1 != -2) {
              break L0;
            } else {
              var5 = 1;
              break L0;
            }
          }
          L1: {
            if (param1 == 3) {
              var4 = -1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-5 != param1) {
              break L2;
            } else {
              var5 = 1;
              var4 = 1;
              break L2;
            }
          }
          L3: {
            if (-6 == param1) {
              var4 = -1;
              var5 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (-7 == param1) {
              var5 = -1;
              var4 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (param1 == -8) {
                break L6;
              } else {
                if (param1 == 8) {
                  break L6;
                } else {
                  break L5;
                }
              }
            }
            var5 = -1;
            var4 = -1;
            break L5;
          }
          L7: {
            if (-12 != param1) {
              break L7;
            } else {
              var4 = -1;
              break L7;
            }
          }
          L8: {
            if ((param1 ^ -1) == -13) {
              var5 = -1;
              var4 = -1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if ((param1 ^ -1) == -14) {
              var4 = 1;
              var5 = -1;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (14 != param1) {
              break L10;
            } else {
              var5 = 1;
              var4 = -1;
              break L10;
            }
          }
          if (!param0) {
            L11: {
              sl.a((byte) 45);
              if ((param1 ^ -1) == -16) {
                var4 = 1;
                var5 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            jc.field_n = dl.a(0, var5 * var2, var2 * var4);
            return;
          } else {
            L12: {
              if ((param1 ^ -1) == -16) {
                var4 = 1;
                var5 = 1;
                break L12;
              } else {
                break L12;
              }
            }
            jc.field_n = dl.a(0, var5 * var2, var2 * var4);
            return;
          }
        } else {
          if (-106 < (var3 ^ -1)) {
            L13: {
              var2 = (-40960 + var3 * 16384) / 220;
              var4 = 1;
              var5 = 0;
              if (param1 != -2) {
                break L13;
              } else {
                var5 = 1;
                break L13;
              }
            }
            L14: {
              if (param1 == 3) {
                var4 = -1;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-5 != param1) {
                break L15;
              } else {
                var5 = 1;
                var4 = 1;
                break L15;
              }
            }
            L16: {
              if (-6 == param1) {
                var4 = -1;
                var5 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (-7 == param1) {
                var5 = -1;
                var4 = 1;
                break L17;
              } else {
                break L17;
              }
            }
            if (param1 != -8) {
              if (param1 != 8) {
                L18: {
                  if (-12 != (param1 ^ -1)) {
                    break L18;
                  } else {
                    var4 = -1;
                    break L18;
                  }
                }
                L19: {
                  if ((param1 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if ((param1 ^ -1) == -14) {
                    var4 = 1;
                    var5 = -1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (14 != param1) {
                    break L21;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L21;
                  }
                }
                if (!param0) {
                  L22: {
                    sl.a((byte) 45);
                    if ((param1 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                  return;
                } else {
                  L23: {
                    if ((param1 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                  return;
                }
              } else {
                L24: {
                  var5 = -1;
                  var4 = -1;
                  if (-12 != (param1 ^ -1)) {
                    break L24;
                  } else {
                    var4 = -1;
                    break L24;
                  }
                }
                L25: {
                  if ((param1 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if ((param1 ^ -1) == -14) {
                    var4 = 1;
                    var5 = -1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (14 != param1) {
                    break L27;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L27;
                  }
                }
                if (!param0) {
                  L28: {
                    sl.a((byte) 45);
                    if ((param1 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                  return;
                } else {
                  L29: {
                    if ((param1 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                  return;
                }
              }
            } else {
              L30: {
                var5 = -1;
                var4 = -1;
                if (-12 != param1) {
                  break L30;
                } else {
                  var4 = -1;
                  break L30;
                }
              }
              L31: {
                if ((param1 ^ -1) == -13) {
                  var5 = -1;
                  var4 = -1;
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                if ((param1 ^ -1) == -14) {
                  var4 = 1;
                  var5 = -1;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (14 != param1) {
                  break L33;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L33;
                }
              }
              if (!param0) {
                L34: {
                  sl.a((byte) 45);
                  if ((param1 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                return;
              } else {
                L35: {
                  if ((param1 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                return;
              }
            }
          } else {
            if ((var3 ^ -1) > -121) {
              L36: {
                var3 = 120 - var3;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                var4 = 1;
                var5 = 0;
                if (param1 != -2) {
                  break L36;
                } else {
                  var5 = 1;
                  break L36;
                }
              }
              L37: {
                if (param1 == 3) {
                  var4 = -1;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (-5 != param1) {
                  break L38;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L38;
                }
              }
              L39: {
                if (-6 == param1) {
                  var4 = -1;
                  var5 = 1;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (-7 == param1) {
                  var5 = -1;
                  var4 = 1;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                L42: {
                  if (param1 == -8) {
                    break L42;
                  } else {
                    if (param1 == 8) {
                      break L42;
                    } else {
                      break L41;
                    }
                  }
                }
                var5 = -1;
                var4 = -1;
                break L41;
              }
              L43: {
                if (-12 != param1) {
                  break L43;
                } else {
                  var4 = -1;
                  break L43;
                }
              }
              L44: {
                if ((param1 ^ -1) == -13) {
                  var5 = -1;
                  var4 = -1;
                  break L44;
                } else {
                  break L44;
                }
              }
              L45: {
                if ((param1 ^ -1) == -14) {
                  var4 = 1;
                  var5 = -1;
                  break L45;
                } else {
                  break L45;
                }
              }
              L46: {
                if (14 != param1) {
                  break L46;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L46;
                }
              }
              if (!param0) {
                L47: {
                  sl.a((byte) 45);
                  if ((param1 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                return;
              } else {
                L48: {
                  if ((param1 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                return;
              }
            } else {
              L49: {
                var4 = 1;
                var5 = 0;
                if (param1 != -2) {
                  break L49;
                } else {
                  var5 = 1;
                  break L49;
                }
              }
              L50: {
                if (param1 == 3) {
                  var4 = -1;
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                if (-5 != param1) {
                  break L51;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L51;
                }
              }
              L52: {
                if (-6 == param1) {
                  var4 = -1;
                  var5 = 1;
                  break L52;
                } else {
                  break L52;
                }
              }
              L53: {
                if (-7 == param1) {
                  var5 = -1;
                  var4 = 1;
                  break L53;
                } else {
                  break L53;
                }
              }
              if (param1 != -8) {
                if (param1 != 8) {
                  L54: {
                    if (-12 != (param1 ^ -1)) {
                      break L54;
                    } else {
                      var4 = -1;
                      break L54;
                    }
                  }
                  L55: {
                    if ((param1 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                  L56: {
                    if ((param1 ^ -1) == -14) {
                      var4 = 1;
                      var5 = -1;
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                  L57: {
                    if (14 != param1) {
                      break L57;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L57;
                    }
                  }
                  if (!param0) {
                    L58: {
                      sl.a((byte) 45);
                      if ((param1 ^ -1) == -16) {
                        var4 = 1;
                        var5 = 1;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                    return;
                  } else {
                    L59: {
                      if ((param1 ^ -1) == -16) {
                        var4 = 1;
                        var5 = 1;
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                    return;
                  }
                } else {
                  L60: {
                    var5 = -1;
                    var4 = -1;
                    if (-12 != (param1 ^ -1)) {
                      break L60;
                    } else {
                      var4 = -1;
                      break L60;
                    }
                  }
                  L61: {
                    if ((param1 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  L62: {
                    if ((param1 ^ -1) == -14) {
                      var4 = 1;
                      var5 = -1;
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    if (14 != param1) {
                      break L63;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L63;
                    }
                  }
                  L64: {
                    if (param0) {
                      break L64;
                    } else {
                      sl.a((byte) 45);
                      break L64;
                    }
                  }
                  L65: {
                    if ((param1 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                  return;
                }
              } else {
                L66: {
                  var5 = -1;
                  var4 = -1;
                  if (-12 != param1) {
                    break L66;
                  } else {
                    var4 = -1;
                    break L66;
                  }
                }
                L67: {
                  if ((param1 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L67;
                  } else {
                    break L67;
                  }
                }
                L68: {
                  if ((param1 ^ -1) == -14) {
                    var4 = 1;
                    var5 = -1;
                    break L68;
                  } else {
                    break L68;
                  }
                }
                L69: {
                  if (14 != param1) {
                    break L69;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L69;
                  }
                }
                L70: {
                  if (param0) {
                    break L70;
                  } else {
                    sl.a((byte) 45);
                    break L70;
                  }
                }
                L71: {
                  if ((param1 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L71;
                  } else {
                    break L71;
                  }
                }
                jc.field_n = dl.a(0, var5 * var2, var2 * var4);
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 <= 45) {
            sl.a((byte) 63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
