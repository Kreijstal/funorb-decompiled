/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class h {
    static char[] field_e;
    static String field_a;
    static nj field_c;
    static String[] field_b;
    static long field_d;

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 != -31279) {
            h.a((byte) -80, 8);
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(java.awt.Component param0, int param1);

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        if (param0 <= -22) {
          var3 = fb.field_a;
          if (5 > var3) {
            L0: {
              var2 = var3 * (var3 * 8192) / 1100;
              var4 = 1;
              var5 = 0;
              if (param1 == 3) {
                var4 = -1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1 != 1) {
                break L1;
              } else {
                var5 = 1;
                break L1;
              }
            }
            L2: {
              if (param1 != 4) {
                break L2;
              } else {
                var5 = 1;
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (5 != param1) {
                break L3;
              } else {
                var4 = -1;
                var5 = 1;
                break L3;
              }
            }
            L4: {
              if (param1 != 6) {
                break L4;
              } else {
                var4 = 1;
                var5 = -1;
                break L4;
              }
            }
            L5: {
              L6: {
                if (param1 == 7) {
                  break L6;
                } else {
                  if (param1 == 8) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = -1;
              var5 = -1;
              break L5;
            }
            L7: {
              if (11 != param1) {
                break L7;
              } else {
                var4 = -1;
                break L7;
              }
            }
            L8: {
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1 != 13) {
                break L9;
              } else {
                var4 = 1;
                var5 = -1;
                break L9;
              }
            }
            L10: {
              if (param1 == 14) {
                var4 = -1;
                var5 = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param1 != 15) {
                break L11;
              } else {
                var5 = 1;
                var4 = 1;
                break L11;
              }
            }
            ba.field_a = te.a(var5 * var2, 0, var2 * var4);
            return;
          } else {
            if (105 <= var3) {
              if (120 > var3) {
                L12: {
                  var3 = -var3 + 120;
                  var2 = 8192 - var3 * var3 * 8192 / 3300;
                  var4 = 1;
                  var5 = 0;
                  if (param1 == 3) {
                    var4 = -1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param1 != 1) {
                    break L13;
                  } else {
                    var5 = 1;
                    break L13;
                  }
                }
                L14: {
                  if (param1 != 4) {
                    break L14;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L14;
                  }
                }
                L15: {
                  if (5 != param1) {
                    break L15;
                  } else {
                    var4 = -1;
                    var5 = 1;
                    break L15;
                  }
                }
                L16: {
                  if (param1 != 6) {
                    break L16;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (param1 == 7) {
                      break L18;
                    } else {
                      if (param1 == 8) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var4 = -1;
                  var5 = -1;
                  break L17;
                }
                L19: {
                  if (11 != param1) {
                    break L19;
                  } else {
                    var4 = -1;
                    break L19;
                  }
                }
                L20: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param1 != 13) {
                    break L21;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L21;
                  }
                }
                L22: {
                  if (param1 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param1 != 15) {
                    break L23;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L23;
                  }
                }
                ba.field_a = te.a(var5 * var2, 0, var2 * var4);
                return;
              } else {
                L24: {
                  var4 = 1;
                  var5 = 0;
                  if (param1 == 3) {
                    var4 = -1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1 != 1) {
                    break L25;
                  } else {
                    var5 = 1;
                    break L25;
                  }
                }
                L26: {
                  if (param1 != 4) {
                    break L26;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L26;
                  }
                }
                L27: {
                  if (5 != param1) {
                    break L27;
                  } else {
                    var4 = -1;
                    var5 = 1;
                    break L27;
                  }
                }
                L28: {
                  if (param1 != 6) {
                    break L28;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    if (param1 == 7) {
                      break L30;
                    } else {
                      if (param1 == 8) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  var4 = -1;
                  var5 = -1;
                  break L29;
                }
                L31: {
                  if (11 != param1) {
                    break L31;
                  } else {
                    var4 = -1;
                    break L31;
                  }
                }
                L32: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1 != 13) {
                    break L33;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L33;
                  }
                }
                L34: {
                  if (param1 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (param1 != 15) {
                    break L35;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L35;
                  }
                }
                ba.field_a = te.a(var5 * var2, 0, var2 * var4);
                return;
              }
            } else {
              L36: {
                var2 = (-40960 + var3 * 16384) / 220;
                var4 = 1;
                var5 = 0;
                if (param1 == 3) {
                  var4 = -1;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (param1 != 1) {
                  break L37;
                } else {
                  var5 = 1;
                  break L37;
                }
              }
              L38: {
                if (param1 != 4) {
                  break L38;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L38;
                }
              }
              L39: {
                if (5 != param1) {
                  break L39;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L39;
                }
              }
              L40: {
                if (param1 != 6) {
                  break L40;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L40;
                }
              }
              if (param1 != 7) {
                if (param1 != 8) {
                  L41: {
                    if (11 != param1) {
                      break L41;
                    } else {
                      var4 = -1;
                      break L41;
                    }
                  }
                  L42: {
                    if (param1 == 12) {
                      var4 = -1;
                      var5 = -1;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    if (param1 != 13) {
                      break L43;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L43;
                    }
                  }
                  L44: {
                    if (param1 == 14) {
                      var4 = -1;
                      var5 = 1;
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                  L45: {
                    if (param1 != 15) {
                      break L45;
                    } else {
                      var5 = 1;
                      var4 = 1;
                      break L45;
                    }
                  }
                  ba.field_a = te.a(var5 * var2, 0, var2 * var4);
                  return;
                } else {
                  L46: {
                    var4 = -1;
                    var5 = -1;
                    if (11 != param1) {
                      break L46;
                    } else {
                      var4 = -1;
                      break L46;
                    }
                  }
                  L47: {
                    if (param1 == 12) {
                      var4 = -1;
                      var5 = -1;
                      break L47;
                    } else {
                      break L47;
                    }
                  }
                  L48: {
                    if (param1 != 13) {
                      break L48;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L48;
                    }
                  }
                  L49: {
                    if (param1 == 14) {
                      var4 = -1;
                      var5 = 1;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  L50: {
                    if (param1 != 15) {
                      break L50;
                    } else {
                      var5 = 1;
                      var4 = 1;
                      break L50;
                    }
                  }
                  ba.field_a = te.a(var5 * var2, 0, var2 * var4);
                  return;
                }
              } else {
                L51: {
                  var4 = -1;
                  var5 = -1;
                  if (11 != param1) {
                    break L51;
                  } else {
                    var4 = -1;
                    break L51;
                  }
                }
                L52: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L52;
                  } else {
                    break L52;
                  }
                }
                L53: {
                  if (param1 != 13) {
                    break L53;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L53;
                  }
                }
                L54: {
                  if (param1 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  if (param1 != 15) {
                    break L55;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L55;
                  }
                }
                ba.field_a = te.a(var5 * var2, 0, var2 * var4);
                return;
              }
            }
          }
        } else {
          L56: {
            h.b(109);
            var3 = fb.field_a;
            if (5 > var3) {
              var2 = var3 * (var3 * 8192) / 1100;
              break L56;
            } else {
              if (105 <= var3) {
                if (120 > var3) {
                  var3 = -var3 + 120;
                  var2 = 8192 - var3 * var3 * 8192 / 3300;
                  break L56;
                } else {
                  break L56;
                }
              } else {
                var2 = (-40960 + var3 * 16384) / 220;
                break L56;
              }
            }
          }
          L57: {
            var4 = 1;
            var5 = 0;
            if (param1 == 3) {
              var4 = -1;
              break L57;
            } else {
              break L57;
            }
          }
          L58: {
            if (param1 != 1) {
              break L58;
            } else {
              var5 = 1;
              break L58;
            }
          }
          L59: {
            if (param1 != 4) {
              break L59;
            } else {
              var5 = 1;
              var4 = 1;
              break L59;
            }
          }
          L60: {
            if (5 != param1) {
              break L60;
            } else {
              var4 = -1;
              var5 = 1;
              break L60;
            }
          }
          L61: {
            if (param1 != 6) {
              break L61;
            } else {
              var4 = 1;
              var5 = -1;
              break L61;
            }
          }
          if (param1 != 7) {
            if (param1 != 8) {
              L62: {
                if (11 != param1) {
                  break L62;
                } else {
                  var4 = -1;
                  break L62;
                }
              }
              L63: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L63;
                } else {
                  break L63;
                }
              }
              L64: {
                if (param1 != 13) {
                  break L64;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L64;
                }
              }
              L65: {
                if (param1 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L65;
                } else {
                  break L65;
                }
              }
              L66: {
                if (param1 != 15) {
                  break L66;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L66;
                }
              }
              ba.field_a = te.a(var5 * var2, 0, var2 * var4);
              return;
            } else {
              L67: {
                var4 = -1;
                var5 = -1;
                if (11 != param1) {
                  break L67;
                } else {
                  var4 = -1;
                  break L67;
                }
              }
              L68: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L68;
                } else {
                  break L68;
                }
              }
              L69: {
                if (param1 != 13) {
                  break L69;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L69;
                }
              }
              L70: {
                if (param1 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L70;
                } else {
                  break L70;
                }
              }
              L71: {
                if (param1 != 15) {
                  break L71;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L71;
                }
              }
              ba.field_a = te.a(var5 * var2, 0, var2 * var4);
              return;
            }
          } else {
            L72: {
              var4 = -1;
              var5 = -1;
              if (11 != param1) {
                break L72;
              } else {
                var4 = -1;
                break L72;
              }
            }
            L73: {
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              if (param1 != 13) {
                break L74;
              } else {
                var4 = 1;
                var5 = -1;
                break L74;
              }
            }
            L75: {
              if (param1 == 14) {
                var4 = -1;
                var5 = 1;
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              if (param1 != 15) {
                break L76;
              } else {
                var5 = 1;
                var4 = 1;
                break L76;
              }
            }
            ba.field_a = te.a(var5 * var2, 0, var2 * var4);
            return;
          }
        }
    }

    abstract int a(int param0);

    final static int a(byte param0, oh param1, int param2, String param3, String[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param3);
              if (param2 < var5_int) {
                break L1;
              } else {
                if (param3.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = param3;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            var6 = (-1 + (var5_int + param2)) / param2;
            param2 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param3.length();
            var9 = 0;
            L2: while (true) {
              if (var8 <= var9) {
                L3: {
                  if (var7 < var8) {
                    int incrementValue$3 = var6;
                    var6++;
                    param4[incrementValue$3] = param3.substring(var7, var8).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_21_0 = var6;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = param3.charAt(var9);
                    if (var10 == 32) {
                      break L5;
                    } else {
                      if (var10 == 45) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var11 = param3.substring(var7, var9 - -1).trim();
                  var12 = param1.a(var11);
                  if (var12 < param2) {
                    break L4;
                  } else {
                    var7 = var9 - -1;
                    int incrementValue$4 = var6;
                    var6++;
                    param4[incrementValue$4] = var11;
                    break L4;
                  }
                }
                L6: {
                  if (var10 != 62) {
                    break L6;
                  } else {
                    if (!param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      break L6;
                    } else {
                      int incrementValue$5 = var6;
                      var6++;
                      param4[incrementValue$5] = param3.substring(var7, var9 + -3).trim();
                      var7 = var9 - -1;
                      break L6;
                    }
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("h.D(").append(-8).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_22_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains your email address, and would be easy to guess";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_e = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
