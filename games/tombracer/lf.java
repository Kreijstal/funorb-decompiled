/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf implements bo {
    private int field_b;
    static String field_a;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 128) {
          L0: {
            field_a = (String) null;
            if ((2048 & param1) == 0) {
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
            if ((2048 & param1) == 0) {
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

    final void a(qh param0, int param1, v param2) {
        try {
            if (param1 != 0) {
                kh var5 = (kh) null;
                this.a(61, (kh) null);
            }
            param0.i(this.field_b, 110);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 118);
        if (param1 != -19) {
            return;
        }
        try {
            this.field_b = param0.b((byte) 44, 4) + -2;
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, kh param1) {
        int discarded$0 = 0;
        try {
            if (param0 != 200) {
                discarded$0 = lf.a(-117, 42);
            }
            param1.i(8);
            param1.a((byte) 105, 2 + this.field_b, 4);
            param1.k(-1826190686);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 82) {
            field_a = (String) null;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          if (-1 == (1 & param0 ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if ((param0 & 2) == 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if (-1 == (param0 & param1 ^ -1)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          if ((8 & param0) == 0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_12_0;
          if (0 == (16 & param0)) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_15_0;
          if ((param0 & 32) == 0) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_18_0;
          if (0 == (param0 & 128)) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L6;
          } else {
            stackOut_19_0 = 1;
            stackIn_21_0 = stackOut_19_0;
            break L6;
          }
        }
        L7: {
          var8 = stackIn_21_0;
          if (0 == (param0 & 256)) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L7;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L7;
          }
        }
        L8: {
          var9 = stackIn_24_0;
          if (0 == (param0 & 64)) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L8;
          } else {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L8;
          }
        }
        var10 = stackIn_27_0;
        if (var8 != 0) {
          var6 = 0;
          var4 = 0;
          var5 = 0;
          var2 = 0;
          var7 = 0;
          var3 = 0;
          if (TombRacer.field_G) {
            if (var2 != 0) {
              if (var3 == 0) {
                L9: {
                  if (var4 == 0) {
                    break L9;
                  } else {
                    if (var5 == 0) {
                      break L9;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L9;
                    }
                  }
                }
                L10: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L10;
                  } else {
                    var11 = var11 | 1;
                    break L10;
                  }
                }
                L11: {
                  if (var3 == 0) {
                    break L11;
                  } else {
                    var11 = var11 | 2;
                    break L11;
                  }
                }
                L12: {
                  if (var4 == 0) {
                    break L12;
                  } else {
                    var11 = var11 | 4;
                    break L12;
                  }
                }
                L13: {
                  if (var5 == 0) {
                    break L13;
                  } else {
                    var11 = var11 | 8;
                    break L13;
                  }
                }
                L14: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var8 == 0) {
                    break L16;
                  } else {
                    var11 = var11 | 128;
                    break L16;
                  }
                }
                L17: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                return var11;
              } else {
                L19: {
                  var2 = 0;
                  var3 = 0;
                  if (var4 == 0) {
                    break L19;
                  } else {
                    if (var5 == 0) {
                      break L19;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L19;
                    }
                  }
                }
                L20: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L20;
                  } else {
                    var11 = var11 | 1;
                    break L20;
                  }
                }
                L21: {
                  if (var3 == 0) {
                    break L21;
                  } else {
                    var11 = var11 | 2;
                    break L21;
                  }
                }
                L22: {
                  if (var4 == 0) {
                    break L22;
                  } else {
                    var11 = var11 | 4;
                    break L22;
                  }
                }
                L23: {
                  if (var5 == 0) {
                    break L23;
                  } else {
                    var11 = var11 | 8;
                    break L23;
                  }
                }
                L24: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var8 == 0) {
                    break L26;
                  } else {
                    var11 = var11 | 128;
                    break L26;
                  }
                }
                L27: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return var11;
              }
            } else {
              L29: {
                if (var4 == 0) {
                  break L29;
                } else {
                  if (var5 == 0) {
                    break L29;
                  } else {
                    var4 = 0;
                    var5 = 0;
                    break L29;
                  }
                }
              }
              L30: {
                var11 = 0;
                if (var2 == 0) {
                  break L30;
                } else {
                  var11 = var11 | 1;
                  break L30;
                }
              }
              L31: {
                if (var3 == 0) {
                  break L31;
                } else {
                  var11 = var11 | 2;
                  break L31;
                }
              }
              L32: {
                if (var4 == 0) {
                  break L32;
                } else {
                  var11 = var11 | 4;
                  break L32;
                }
              }
              L33: {
                if (var5 == 0) {
                  break L33;
                } else {
                  var11 = var11 | 8;
                  break L33;
                }
              }
              L34: {
                if (var6 != 0) {
                  var11 = var11 | 16;
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                if (var7 != 0) {
                  var11 = var11 | 32;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (var8 == 0) {
                  break L36;
                } else {
                  var11 = var11 | 128;
                  break L36;
                }
              }
              L37: {
                if (var9 != 0) {
                  var11 = var11 | 256;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (var10 != 0) {
                  var11 = var11 | 64;
                  break L38;
                } else {
                  break L38;
                }
              }
              return var11;
            }
          } else {
            L39: {
              var11 = 0;
              if (var2 == 0) {
                break L39;
              } else {
                var11 = var11 | 1;
                break L39;
              }
            }
            L40: {
              if (var3 == 0) {
                break L40;
              } else {
                var11 = var11 | 2;
                break L40;
              }
            }
            L41: {
              if (var4 == 0) {
                break L41;
              } else {
                var11 = var11 | 4;
                break L41;
              }
            }
            L42: {
              if (var5 == 0) {
                break L42;
              } else {
                var11 = var11 | 8;
                break L42;
              }
            }
            L43: {
              if (var6 != 0) {
                var11 = var11 | 16;
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              if (var7 != 0) {
                var11 = var11 | 32;
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              if (var8 == 0) {
                break L45;
              } else {
                var11 = var11 | 128;
                break L45;
              }
            }
            L46: {
              if (var9 != 0) {
                var11 = var11 | 256;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (var10 != 0) {
                var11 = var11 | 64;
                break L47;
              } else {
                break L47;
              }
            }
            return var11;
          }
        } else {
          if (var9 != 0) {
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var2 = 0;
            var7 = 0;
            var3 = 0;
            if (TombRacer.field_G) {
              if (var2 == 0) {
                L48: {
                  if (var4 == 0) {
                    break L48;
                  } else {
                    if (var5 == 0) {
                      break L48;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L48;
                    }
                  }
                }
                L49: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L49;
                  } else {
                    var11 = var11 | 1;
                    break L49;
                  }
                }
                L50: {
                  if (var3 == 0) {
                    break L50;
                  } else {
                    var11 = var11 | 2;
                    break L50;
                  }
                }
                L51: {
                  if (var4 == 0) {
                    break L51;
                  } else {
                    var11 = var11 | 4;
                    break L51;
                  }
                }
                L52: {
                  if (var5 == 0) {
                    break L52;
                  } else {
                    var11 = var11 | 8;
                    break L52;
                  }
                }
                L53: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L53;
                  } else {
                    break L53;
                  }
                }
                L54: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  if (var8 == 0) {
                    break L55;
                  } else {
                    var11 = var11 | 128;
                    break L55;
                  }
                }
                L56: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L57: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L57;
                  } else {
                    break L57;
                  }
                }
                return var11;
              } else {
                L58: {
                  if (var3 != 0) {
                    var2 = 0;
                    var3 = 0;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                L59: {
                  if (var4 == 0) {
                    break L59;
                  } else {
                    if (var5 == 0) {
                      break L59;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L59;
                    }
                  }
                }
                L60: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L60;
                  } else {
                    var11 = var11 | 1;
                    break L60;
                  }
                }
                L61: {
                  if (var3 == 0) {
                    break L61;
                  } else {
                    var11 = var11 | 2;
                    break L61;
                  }
                }
                L62: {
                  if (var4 == 0) {
                    break L62;
                  } else {
                    var11 = var11 | 4;
                    break L62;
                  }
                }
                L63: {
                  if (var5 == 0) {
                    break L63;
                  } else {
                    var11 = var11 | 8;
                    break L63;
                  }
                }
                L64: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L64;
                  } else {
                    break L64;
                  }
                }
                L65: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L65;
                  } else {
                    break L65;
                  }
                }
                L66: {
                  if (var8 == 0) {
                    break L66;
                  } else {
                    var11 = var11 | 128;
                    break L66;
                  }
                }
                L67: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L67;
                  } else {
                    break L67;
                  }
                }
                L68: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L68;
                  } else {
                    break L68;
                  }
                }
                return var11;
              }
            } else {
              L69: {
                var11 = 0;
                if (var2 == 0) {
                  break L69;
                } else {
                  var11 = var11 | 1;
                  break L69;
                }
              }
              L70: {
                if (var3 == 0) {
                  break L70;
                } else {
                  var11 = var11 | 2;
                  break L70;
                }
              }
              L71: {
                if (var4 == 0) {
                  break L71;
                } else {
                  var11 = var11 | 4;
                  break L71;
                }
              }
              L72: {
                if (var5 == 0) {
                  break L72;
                } else {
                  var11 = var11 | 8;
                  break L72;
                }
              }
              L73: {
                if (var6 != 0) {
                  var11 = var11 | 16;
                  break L73;
                } else {
                  break L73;
                }
              }
              L74: {
                if (var7 != 0) {
                  var11 = var11 | 32;
                  break L74;
                } else {
                  break L74;
                }
              }
              L75: {
                if (var8 == 0) {
                  break L75;
                } else {
                  var11 = var11 | 128;
                  break L75;
                }
              }
              L76: {
                if (var9 != 0) {
                  var11 = var11 | 256;
                  break L76;
                } else {
                  break L76;
                }
              }
              L77: {
                if (var10 != 0) {
                  var11 = var11 | 64;
                  break L77;
                } else {
                  break L77;
                }
              }
              return var11;
            }
          } else {
            if (var2 != 0) {
              if (var3 == 0) {
                L78: {
                  if (var4 == 0) {
                    break L78;
                  } else {
                    if (var5 == 0) {
                      break L78;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L78;
                    }
                  }
                }
                L79: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L79;
                  } else {
                    var11 = var11 | 1;
                    break L79;
                  }
                }
                L80: {
                  if (var3 == 0) {
                    break L80;
                  } else {
                    var11 = var11 | 2;
                    break L80;
                  }
                }
                L81: {
                  if (var4 == 0) {
                    break L81;
                  } else {
                    var11 = var11 | 4;
                    break L81;
                  }
                }
                L82: {
                  if (var5 == 0) {
                    break L82;
                  } else {
                    var11 = var11 | 8;
                    break L82;
                  }
                }
                L83: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L83;
                  } else {
                    break L83;
                  }
                }
                L84: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L84;
                  } else {
                    break L84;
                  }
                }
                L85: {
                  if (var8 == 0) {
                    break L85;
                  } else {
                    var11 = var11 | 128;
                    break L85;
                  }
                }
                L86: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L86;
                  } else {
                    break L86;
                  }
                }
                L87: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L87;
                  } else {
                    break L87;
                  }
                }
                return var11;
              } else {
                L88: {
                  var2 = 0;
                  var3 = 0;
                  if (var4 == 0) {
                    break L88;
                  } else {
                    if (var5 == 0) {
                      break L88;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L88;
                    }
                  }
                }
                L89: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L89;
                  } else {
                    var11 = var11 | 1;
                    break L89;
                  }
                }
                L90: {
                  if (var3 == 0) {
                    break L90;
                  } else {
                    var11 = var11 | 2;
                    break L90;
                  }
                }
                L91: {
                  if (var4 == 0) {
                    break L91;
                  } else {
                    var11 = var11 | 4;
                    break L91;
                  }
                }
                L92: {
                  if (var5 == 0) {
                    break L92;
                  } else {
                    var11 = var11 | 8;
                    break L92;
                  }
                }
                L93: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L93;
                  } else {
                    break L93;
                  }
                }
                L94: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L94;
                  } else {
                    break L94;
                  }
                }
                L95: {
                  if (var8 == 0) {
                    break L95;
                  } else {
                    var11 = var11 | 128;
                    break L95;
                  }
                }
                L96: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L96;
                  } else {
                    break L96;
                  }
                }
                L97: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L97;
                  } else {
                    break L97;
                  }
                }
                return var11;
              }
            } else {
              L98: {
                if (var4 == 0) {
                  break L98;
                } else {
                  if (var5 == 0) {
                    break L98;
                  } else {
                    var4 = 0;
                    var5 = 0;
                    break L98;
                  }
                }
              }
              L99: {
                var11 = 0;
                if (var2 == 0) {
                  break L99;
                } else {
                  var11 = var11 | 1;
                  break L99;
                }
              }
              L100: {
                if (var3 == 0) {
                  break L100;
                } else {
                  var11 = var11 | 2;
                  break L100;
                }
              }
              L101: {
                if (var4 == 0) {
                  break L101;
                } else {
                  var11 = var11 | 4;
                  break L101;
                }
              }
              L102: {
                if (var5 == 0) {
                  break L102;
                } else {
                  var11 = var11 | 8;
                  break L102;
                }
              }
              L103: {
                if (var6 != 0) {
                  var11 = var11 | 16;
                  break L103;
                } else {
                  break L103;
                }
              }
              L104: {
                if (var7 != 0) {
                  var11 = var11 | 32;
                  break L104;
                } else {
                  break L104;
                }
              }
              L105: {
                if (var8 == 0) {
                  break L105;
                } else {
                  var11 = var11 | 128;
                  break L105;
                }
              }
              L106: {
                if (var9 != 0) {
                  var11 = var11 | 256;
                  break L106;
                } else {
                  break L106;
                }
              }
              L107: {
                if (var10 != 0) {
                  var11 = var11 | 64;
                  break L107;
                } else {
                  break L107;
                }
              }
              return var11;
            }
          }
        }
    }

    static {
        field_a = "Kick <%0> from this game";
    }
}
