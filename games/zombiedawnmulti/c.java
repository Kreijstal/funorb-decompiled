/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c {
    private ff field_a;
    static Random field_c;
    private ff field_f;
    static int field_e;
    static boolean field_b;
    static String field_d;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = 0;
          var3 = f.field_a;
          if (-6 >= (var3 ^ -1)) {
            break L0;
          } else {
            var2 = 8192 * var3 * var3 / 1100;
            if (var6 != 0) {
              break L0;
            } else {
              L1: {
                var4 = 1;
                var5 = 0;
                if (1 != param0) {
                  break L1;
                } else {
                  var5 = 1;
                  break L1;
                }
              }
              L2: {
                if (-4 != (param0 ^ -1)) {
                  break L2;
                } else {
                  var4 = -1;
                  break L2;
                }
              }
              L3: {
                if (-5 == (param0 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if ((param0 ^ -1) == -6) {
                  var4 = -1;
                  var5 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (6 == param0) {
                  var4 = 1;
                  var5 = -1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-8 == (param0 ^ -1)) {
                  var5 = -1;
                  var4 = -1;
                  break L6;
                } else {
                  if (8 != param0) {
                    break L6;
                  } else {
                    L7: {
                      var5 = -1;
                      var4 = -1;
                      if (param0 != 11) {
                        break L7;
                      } else {
                        var4 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      if (-13 != (param0 ^ -1)) {
                        break L8;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L8;
                      }
                    }
                    if (param1 < 72) {
                      return;
                    } else {
                      L9: {
                        if (13 == param0) {
                          var5 = -1;
                          var4 = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (14 == param0) {
                          var5 = 1;
                          var4 = -1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if ((param0 ^ -1) != -16) {
                          break L11;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L11;
                        }
                      }
                      hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                      return;
                    }
                  }
                }
              }
              L12: {
                if (param0 != 11) {
                  break L12;
                } else {
                  var4 = -1;
                  break L12;
                }
              }
              L13: {
                if (-13 != (param0 ^ -1)) {
                  break L13;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L13;
                }
              }
              if (param1 < 72) {
                return;
              } else {
                L14: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if ((param0 ^ -1) != -16) {
                    break L16;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L16;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              }
            }
          }
        }
        if (var3 < 105) {
          var2 = (-40960 + var3 * 16384) / 220;
          if (var6 == 0) {
            L17: {
              var4 = 1;
              var5 = 0;
              if (1 != param0) {
                break L17;
              } else {
                var5 = 1;
                break L17;
              }
            }
            L18: {
              if (-4 != (param0 ^ -1)) {
                break L18;
              } else {
                var4 = -1;
                break L18;
              }
            }
            L19: {
              if (-5 == (param0 ^ -1)) {
                var4 = 1;
                var5 = 1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if ((param0 ^ -1) == -6) {
                var4 = -1;
                var5 = 1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (6 == param0) {
                var4 = 1;
                var5 = -1;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (-8 == (param0 ^ -1)) {
                var5 = -1;
                var4 = -1;
                break L22;
              } else {
                if (8 != param0) {
                  break L22;
                } else {
                  L23: {
                    var5 = -1;
                    var4 = -1;
                    if (param0 != 11) {
                      break L23;
                    } else {
                      var4 = -1;
                      break L23;
                    }
                  }
                  L24: {
                    if (-13 != (param0 ^ -1)) {
                      break L24;
                    } else {
                      var4 = -1;
                      var5 = -1;
                      break L24;
                    }
                  }
                  if (param1 >= 72) {
                    L25: {
                      if (13 == param0) {
                        var5 = -1;
                        var4 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (14 == param0) {
                        var5 = 1;
                        var4 = -1;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if ((param0 ^ -1) != -16) {
                        break L27;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L27;
                      }
                    }
                    hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            L28: {
              if (param0 != 11) {
                break L28;
              } else {
                var4 = -1;
                break L28;
              }
            }
            L29: {
              if (-13 != (param0 ^ -1)) {
                break L29;
              } else {
                var4 = -1;
                var5 = -1;
                break L29;
              }
            }
            if (param1 >= 72) {
              L30: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (14 == param0) {
                  var5 = 1;
                  var4 = -1;
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                if ((param0 ^ -1) != -16) {
                  break L32;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L32;
                }
              }
              hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
              return;
            } else {
              return;
            }
          } else {
            if (120 > var3) {
              L33: {
                var3 = 120 - var3;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                var4 = 1;
                var5 = 0;
                if (1 != param0) {
                  break L33;
                } else {
                  var5 = 1;
                  break L33;
                }
              }
              L34: {
                if (-4 != (param0 ^ -1)) {
                  break L34;
                } else {
                  var4 = -1;
                  break L34;
                }
              }
              L35: {
                if (-5 == (param0 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if ((param0 ^ -1) == -6) {
                  var4 = -1;
                  var5 = 1;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (6 == param0) {
                  var4 = 1;
                  var5 = -1;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (-8 == (param0 ^ -1)) {
                  var5 = -1;
                  var4 = -1;
                  break L38;
                } else {
                  if (8 != param0) {
                    break L38;
                  } else {
                    L39: {
                      var5 = -1;
                      var4 = -1;
                      if (param0 != 11) {
                        break L39;
                      } else {
                        var4 = -1;
                        break L39;
                      }
                    }
                    L40: {
                      if (-13 != (param0 ^ -1)) {
                        break L40;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L40;
                      }
                    }
                    if (param1 >= 72) {
                      L41: {
                        if (13 == param0) {
                          var5 = -1;
                          var4 = 1;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L42: {
                        if (14 == param0) {
                          var5 = 1;
                          var4 = -1;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L43: {
                        if ((param0 ^ -1) != -16) {
                          break L43;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L43;
                        }
                      }
                      hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              L44: {
                if (param0 != 11) {
                  break L44;
                } else {
                  var4 = -1;
                  break L44;
                }
              }
              L45: {
                if (-13 != (param0 ^ -1)) {
                  break L45;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L45;
                }
              }
              if (param1 >= 72) {
                L46: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if ((param0 ^ -1) != -16) {
                    break L48;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L48;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              } else {
                return;
              }
            } else {
              L49: {
                var4 = 1;
                var5 = 0;
                if (1 != param0) {
                  break L49;
                } else {
                  var5 = 1;
                  break L49;
                }
              }
              L50: {
                if (-4 != (param0 ^ -1)) {
                  break L50;
                } else {
                  var4 = -1;
                  break L50;
                }
              }
              L51: {
                if (-5 == (param0 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L51;
                } else {
                  break L51;
                }
              }
              L52: {
                if ((param0 ^ -1) == -6) {
                  var4 = -1;
                  var5 = 1;
                  break L52;
                } else {
                  break L52;
                }
              }
              L53: {
                if (6 == param0) {
                  var4 = 1;
                  var5 = -1;
                  break L53;
                } else {
                  break L53;
                }
              }
              L54: {
                if (-8 == (param0 ^ -1)) {
                  var5 = -1;
                  var4 = -1;
                  break L54;
                } else {
                  if (8 != param0) {
                    break L54;
                  } else {
                    L55: {
                      var5 = -1;
                      var4 = -1;
                      if (param0 != 11) {
                        break L55;
                      } else {
                        var4 = -1;
                        break L55;
                      }
                    }
                    L56: {
                      if (-13 != (param0 ^ -1)) {
                        break L56;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L56;
                      }
                    }
                    if (param1 < 72) {
                      return;
                    } else {
                      L57: {
                        if (13 == param0) {
                          var5 = -1;
                          var4 = 1;
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                      L58: {
                        if (14 == param0) {
                          var5 = 1;
                          var4 = -1;
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                      L59: {
                        if ((param0 ^ -1) != -16) {
                          break L59;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L59;
                        }
                      }
                      hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                      return;
                    }
                  }
                }
              }
              L60: {
                if (param0 != 11) {
                  break L60;
                } else {
                  var4 = -1;
                  break L60;
                }
              }
              L61: {
                if (-13 != (param0 ^ -1)) {
                  break L61;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L61;
                }
              }
              if (param1 < 72) {
                return;
              } else {
                L62: {
                  if (13 == param0) {
                    var5 = -1;
                    var4 = 1;
                    break L62;
                  } else {
                    break L62;
                  }
                }
                L63: {
                  if (14 == param0) {
                    var5 = 1;
                    var4 = -1;
                    break L63;
                  } else {
                    break L63;
                  }
                }
                L64: {
                  if ((param0 ^ -1) != -16) {
                    break L64;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L64;
                  }
                }
                hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                return;
              }
            }
          }
        } else {
          if (120 > var3) {
            L65: {
              var3 = 120 - var3;
              var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
              var4 = 1;
              var5 = 0;
              if (1 != param0) {
                break L65;
              } else {
                var5 = 1;
                break L65;
              }
            }
            L66: {
              if (-4 != (param0 ^ -1)) {
                break L66;
              } else {
                var4 = -1;
                break L66;
              }
            }
            L67: {
              if (-5 == (param0 ^ -1)) {
                var4 = 1;
                var5 = 1;
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              if ((param0 ^ -1) == -6) {
                var4 = -1;
                var5 = 1;
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              if (6 == param0) {
                var4 = 1;
                var5 = -1;
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              if (-8 == (param0 ^ -1)) {
                var5 = -1;
                var4 = -1;
                break L70;
              } else {
                if (8 != param0) {
                  break L70;
                } else {
                  L71: {
                    var5 = -1;
                    var4 = -1;
                    if (param0 != 11) {
                      break L71;
                    } else {
                      var4 = -1;
                      break L71;
                    }
                  }
                  L72: {
                    if (-13 != (param0 ^ -1)) {
                      break L72;
                    } else {
                      var4 = -1;
                      var5 = -1;
                      break L72;
                    }
                  }
                  if (param1 < 72) {
                    return;
                  } else {
                    L73: {
                      if (13 == param0) {
                        var5 = -1;
                        var4 = 1;
                        break L73;
                      } else {
                        break L73;
                      }
                    }
                    L74: {
                      if (14 == param0) {
                        var5 = 1;
                        var4 = -1;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    L75: {
                      if ((param0 ^ -1) != -16) {
                        break L75;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L75;
                      }
                    }
                    hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                    return;
                  }
                }
              }
            }
            L76: {
              if (param0 != 11) {
                break L76;
              } else {
                var4 = -1;
                break L76;
              }
            }
            L77: {
              if (-13 != (param0 ^ -1)) {
                break L77;
              } else {
                var4 = -1;
                var5 = -1;
                break L77;
              }
            }
            if (param1 < 72) {
              return;
            } else {
              L78: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L78;
                } else {
                  break L78;
                }
              }
              L79: {
                if (14 == param0) {
                  var5 = 1;
                  var4 = -1;
                  break L79;
                } else {
                  break L79;
                }
              }
              L80: {
                if ((param0 ^ -1) != -16) {
                  break L80;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L80;
                }
              }
              hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
              return;
            }
          } else {
            L81: {
              var4 = 1;
              var5 = 0;
              if (1 != param0) {
                break L81;
              } else {
                var5 = 1;
                break L81;
              }
            }
            L82: {
              if (-4 != (param0 ^ -1)) {
                break L82;
              } else {
                var4 = -1;
                break L82;
              }
            }
            L83: {
              if (-5 == (param0 ^ -1)) {
                var4 = 1;
                var5 = 1;
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              if ((param0 ^ -1) == -6) {
                var4 = -1;
                var5 = 1;
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              if (6 == param0) {
                var4 = 1;
                var5 = -1;
                break L85;
              } else {
                break L85;
              }
            }
            L86: {
              if (-8 == (param0 ^ -1)) {
                var5 = -1;
                var4 = -1;
                break L86;
              } else {
                if (8 != param0) {
                  break L86;
                } else {
                  L87: {
                    var5 = -1;
                    var4 = -1;
                    if (param0 != 11) {
                      break L87;
                    } else {
                      var4 = -1;
                      break L87;
                    }
                  }
                  L88: {
                    if (-13 != (param0 ^ -1)) {
                      break L88;
                    } else {
                      var4 = -1;
                      var5 = -1;
                      break L88;
                    }
                  }
                  if (param1 < 72) {
                    return;
                  } else {
                    L89: {
                      if (13 == param0) {
                        var5 = -1;
                        var4 = 1;
                        break L89;
                      } else {
                        break L89;
                      }
                    }
                    L90: {
                      if (14 == param0) {
                        var5 = 1;
                        var4 = -1;
                        break L90;
                      } else {
                        break L90;
                      }
                    }
                    L91: {
                      if ((param0 ^ -1) != -16) {
                        break L91;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L91;
                      }
                    }
                    hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
                    return;
                  }
                }
              }
            }
            L92: {
              if (param0 != 11) {
                break L92;
              } else {
                var4 = -1;
                break L92;
              }
            }
            L93: {
              if (-13 != (param0 ^ -1)) {
                break L93;
              } else {
                var4 = -1;
                var5 = -1;
                break L93;
              }
            }
            if (param1 < 72) {
              return;
            } else {
              L94: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L94;
                } else {
                  break L94;
                }
              }
              L95: {
                if (14 == param0) {
                  var5 = 1;
                  var4 = -1;
                  break L95;
                } else {
                  break L95;
                }
              }
              L96: {
                if ((param0 ^ -1) != -16) {
                  break L96;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L96;
                }
              }
              hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
              return;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 98) {
            return true;
        }
        return tj.field_a.c(param0 + -224);
    }

    public static void a(int param0) {
        if (param0 != -6) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static int a(byte[] param0, int param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param3;
            L1: while (true) {
              L2: {
                if (param1 <= var5) {
                  L3: {
                    if (param2) {
                      break L3;
                    } else {
                      c.a(104);
                      break L3;
                    }
                  }
                  var4_int = var4_int ^ -1;
                  break L2;
                } else {
                  var4_int = var4_int >>> -874646712 ^ ed.field_a[255 & (param0[var5] ^ var4_int)];
                  var5++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_9_0 = var4_int;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("c.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final ff c(int param0) {
        ff discarded$9 = null;
        ff var2 = this.field_f;
        if (param0 != -1) {
            discarded$9 = this.c(-65);
            if (!(var2 != this.field_a)) {
                this.field_f = null;
                return null;
            }
            this.field_f = var2.field_v;
            return var2;
        }
        if (!(var2 != this.field_a)) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_v;
        return var2;
    }

    final static void a(boolean param0, byte param1, float param2, String param3) {
        try {
            if (null == pj.field_I) {
                pj.field_I = new ta(nb.field_a, pm.field_P);
                nb.field_a.b(3016, pj.field_I);
            }
            pj.field_I.a(param3, param2, 66, param0);
            oo.b();
            int var4_int = 30 % ((param1 - -45) / 37);
            wj.b(true, -114);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "c.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ff param0, boolean param1) {
        if (null != param0.field_w) {
            param0.c((byte) -70);
        }
        param0.field_v = this.field_a.field_v;
        param0.field_w = this.field_a;
        if (!param1) {
            return;
        }
        try {
            param0.field_w.field_v = param0;
            param0.field_v.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "c.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(int param0) {
        int var2 = 0;
        ff var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param0;
        var3 = this.field_a.field_v;
        L0: while (true) {
          L1: {
            if (var3 == this.field_a) {
              break L1;
            } else {
              var2++;
              var3 = var3.field_v;
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
        }
    }

    public c() {
        this.field_a = new ff();
        this.field_a.field_v = this.field_a;
        this.field_a.field_w = this.field_a;
    }

    final ff a(boolean param0) {
        ff var2 = null;
        var2 = this.field_a.field_v;
        if (this.field_a != var2) {
          if (param0) {
            this.field_a = (ff) null;
            this.field_f = var2.field_v;
            return var2;
          } else {
            this.field_f = var2.field_v;
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    static {
        field_c = new Random();
        field_b = true;
        field_d = "Stun a human or an enemy zombie.";
    }
}
