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
            field_a = null;
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
        Object var5 = null;
        if (param1 != 0) {
          var5 = null;
          ((lf) this).a(61, (kh) null);
          param0.i(((lf) this).field_b, 110);
          return;
        } else {
          param0.i(((lf) this).field_b, 110);
          return;
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 118);
        if (param1 != -19) {
          return;
        } else {
          ((lf) this).field_b = param0.b((byte) 44, 4) + -2;
          param0.i((byte) 98);
          return;
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
          int discarded$2 = lf.a(-117, 42);
          param1.i(8);
          param1.a((byte) 105, 2 + ((lf) this).field_b, 4);
          param1.k(-1826190686);
          return;
        } else {
          param1.i(8);
          param1.a((byte) 105, 2 + ((lf) this).field_b, 4);
          param1.k(-1826190686);
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 82) {
            field_a = null;
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
          if ((param0 & 2) == -1) {
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
          if (-1 == (param0 & param1)) {
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
        if (var8 == 0) {
          if (var9 == 0) {
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
                  var11 = var11 | 1;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    var11 = var11 | 2;
                    break L10;
                  }
                }
                L11: {
                  if (var4 == 0) {
                    break L11;
                  } else {
                    var11 = var11 | 4;
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 0) {
                    break L12;
                  } else {
                    var11 = var11 | 8;
                    break L12;
                  }
                }
                L13: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var8 == 0) {
                    break L15;
                  } else {
                    var11 = var11 | 128;
                    break L15;
                  }
                }
                L16: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return var11;
              } else {
                L18: {
                  var2 = 0;
                  var3 = 0;
                  if (var4 == 0) {
                    break L18;
                  } else {
                    if (var5 == 0) {
                      break L18;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      break L18;
                    }
                  }
                }
                L19: {
                  var11 = 0;
                  if (var2 == 0) {
                    break L19;
                  } else {
                    var11 = var11 | 1;
                    break L19;
                  }
                }
                L20: {
                  if (var3 == 0) {
                    break L20;
                  } else {
                    var11 = var11 | 2;
                    break L20;
                  }
                }
                L21: {
                  if (var4 == 0) {
                    break L21;
                  } else {
                    var11 = var11 | 4;
                    break L21;
                  }
                }
                L22: {
                  if (var5 == 0) {
                    break L22;
                  } else {
                    var11 = var11 | 8;
                    break L22;
                  }
                }
                L23: {
                  if (var6 != 0) {
                    var11 = var11 | 16;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (var7 != 0) {
                    var11 = var11 | 32;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (var8 == 0) {
                    break L25;
                  } else {
                    var11 = var11 | 128;
                    break L25;
                  }
                }
                L26: {
                  if (var9 != 0) {
                    var11 = var11 | 256;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var10 != 0) {
                    var11 = var11 | 64;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return var11;
              }
            } else {
              L28: {
                if (var4 == 0) {
                  break L28;
                } else {
                  if (var5 == 0) {
                    break L28;
                  } else {
                    var4 = 0;
                    var5 = 0;
                    break L28;
                  }
                }
              }
              L29: {
                var11 = 0;
                if (var2 == 0) {
                  break L29;
                } else {
                  var11 = var11 | 1;
                  break L29;
                }
              }
              L30: {
                if (var3 == 0) {
                  break L30;
                } else {
                  var11 = var11 | 2;
                  break L30;
                }
              }
              L31: {
                if (var4 == 0) {
                  break L31;
                } else {
                  var11 = var11 | 4;
                  break L31;
                }
              }
              L32: {
                if (var5 == 0) {
                  break L32;
                } else {
                  var11 = var11 | 8;
                  break L32;
                }
              }
              L33: {
                if (var6 != 0) {
                  var11 = var11 | 16;
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (var7 != 0) {
                  var11 = var11 | 32;
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                if (var8 == 0) {
                  break L35;
                } else {
                  var11 = var11 | 128;
                  break L35;
                }
              }
              L36: {
                if (var9 != 0) {
                  var11 = var11 | 256;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (var10 != 0) {
                  var11 = var11 | 64;
                  break L37;
                } else {
                  break L37;
                }
              }
              return var11;
            }
          } else {
            L38: {
              var6 = 0;
              var4 = 0;
              var5 = 0;
              var2 = 0;
              var7 = 0;
              var3 = 0;
              var11 = 0;
              if (var2 == 0) {
                break L38;
              } else {
                var11 = var11 | 1;
                break L38;
              }
            }
            L39: {
              if (var3 == 0) {
                break L39;
              } else {
                var11 = var11 | 2;
                break L39;
              }
            }
            L40: {
              if (var4 == 0) {
                break L40;
              } else {
                var11 = var11 | 4;
                break L40;
              }
            }
            L41: {
              if (var5 == 0) {
                break L41;
              } else {
                var11 = var11 | 8;
                break L41;
              }
            }
            L42: {
              if (var6 != 0) {
                var11 = var11 | 16;
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              if (var7 != 0) {
                var11 = var11 | 32;
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              if (var8 == 0) {
                break L44;
              } else {
                var11 = var11 | 128;
                break L44;
              }
            }
            L45: {
              if (var9 != 0) {
                var11 = var11 | 256;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (var10 != 0) {
                var11 = var11 | 64;
                break L46;
              } else {
                break L46;
              }
            }
            return var11;
          }
        } else {
          L47: {
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var2 = 0;
            var7 = 0;
            var3 = 0;
            var11 = 0;
            if (var2 == 0) {
              break L47;
            } else {
              var11 = var11 | 1;
              break L47;
            }
          }
          L48: {
            if (var3 == 0) {
              break L48;
            } else {
              var11 = var11 | 2;
              break L48;
            }
          }
          L49: {
            if (var4 == 0) {
              break L49;
            } else {
              var11 = var11 | 4;
              break L49;
            }
          }
          L50: {
            if (var5 == 0) {
              break L50;
            } else {
              var11 = var11 | 8;
              break L50;
            }
          }
          L51: {
            if (var6 != 0) {
              var11 = var11 | 16;
              break L51;
            } else {
              break L51;
            }
          }
          L52: {
            if (var7 != 0) {
              var11 = var11 | 32;
              break L52;
            } else {
              break L52;
            }
          }
          L53: {
            if (var8 == 0) {
              break L53;
            } else {
              var11 = var11 | 128;
              break L53;
            }
          }
          L54: {
            if (var9 != 0) {
              var11 = var11 | 256;
              break L54;
            } else {
              break L54;
            }
          }
          L55: {
            if (var10 != 0) {
              var11 = var11 | 64;
              break L55;
            } else {
              break L55;
            }
          }
          return var11;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Kick <%0> from this game";
    }
}
