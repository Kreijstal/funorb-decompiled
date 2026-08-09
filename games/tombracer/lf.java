/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf implements bo {
    private int field_b;
    static String field_a;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param2 != 128) {
          L0: {
            field_a = (String) null;
            if ((2048 & param1) == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((2048 & param1) == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        try {
            if (param0 != 200) {
                lf.a(-117, 42);
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          if (-1 == (1 & param0 ^ -1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if ((param0 & 2) == 0) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if (-1 == (param0 & param1 ^ -1)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          if ((8 & param0) == 0) {
            stackIn_12_0 = 0;
            break L3;
          } else {
            stackIn_12_0 = 1;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_12_0;
          if (0 == (16 & param0)) {
            stackIn_15_0 = 0;
            break L4;
          } else {
            stackIn_15_0 = 1;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_15_0;
          if ((param0 & 32) == 0) {
            stackIn_18_0 = 0;
            break L5;
          } else {
            stackIn_18_0 = 1;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_18_0;
          if (0 == (param0 & 128)) {
            stackIn_21_0 = 0;
            break L6;
          } else {
            stackIn_21_0 = 1;
            break L6;
          }
        }
        L7: {
          var8 = stackIn_21_0;
          if (0 == (param0 & 256)) {
            stackIn_24_0 = 0;
            break L7;
          } else {
            stackIn_24_0 = 1;
            break L7;
          }
        }
        L8: {
          var9 = stackIn_24_0;
          if (0 == (param0 & 64)) {
            stackIn_27_0 = 0;
            break L8;
          } else {
            stackIn_27_0 = 1;
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
              var6 = 0;
              var4 = 0;
              var5 = 0;
              var2 = 0;
              var7 = 0;
              var3 = 0;
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
          L48: {
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var2 = 0;
            var7 = 0;
            var3 = 0;
            var11 = 0;
            if (var2 == 0) {
              break L48;
            } else {
              var11 = var11 | 1;
              break L48;
            }
          }
          L49: {
            if (var3 == 0) {
              break L49;
            } else {
              var11 = var11 | 2;
              break L49;
            }
          }
          L50: {
            if (var4 == 0) {
              break L50;
            } else {
              var11 = var11 | 4;
              break L50;
            }
          }
          L51: {
            if (var5 == 0) {
              break L51;
            } else {
              var11 = var11 | 8;
              break L51;
            }
          }
          L52: {
            if (var6 != 0) {
              var11 = var11 | 16;
              break L52;
            } else {
              break L52;
            }
          }
          L53: {
            if (var7 != 0) {
              var11 = var11 | 32;
              break L53;
            } else {
              break L53;
            }
          }
          L54: {
            if (var8 == 0) {
              break L54;
            } else {
              var11 = var11 | 128;
              break L54;
            }
          }
          L55: {
            if (var9 != 0) {
              var11 = var11 | 256;
              break L55;
            } else {
              break L55;
            }
          }
          L56: {
            if (var10 != 0) {
              var11 = var11 | 64;
              break L56;
            } else {
              break L56;
            }
          }
          return var11;
        }
    }

    static {
        field_a = "Kick <%0> from this game";
    }
}
