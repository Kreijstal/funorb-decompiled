/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rda {
    static sna field_a;
    static byte[] field_b;

    final static void a(byte param0, int param1, int param2, sga param3, int param4, ema param5, int param6) {
        ik var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mna.a(-1, (int[]) null, param5.field_Eb, param5.field_Nb, param5.field_Hb, -1, -111, param3, (sna) (Object) param5);
        ms.field_u.a(116, true);
        ms.field_u.a((int[]) null, (byte) -117, 0);
        ms.field_u.a(21654);
        try {
            var7 = ms.field_u;
            var8 = param6;
            var9 = param4;
            var10 = 0;
            var11 = 0;
            var7.field_a.a(var10, false, var8, var11, var9);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rda.B(" + -104 + 44 + 0 + 44 + 0 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 41);
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        L0: {
          if (!param2) {
            dg.d();
            dg.d();
            dg.d();
            break L0;
          } else {
            dg.f(0, 0, dg.field_i, dg.field_c, 0, 192);
            break L0;
          }
        }
        pja.a((byte) 111, param2);
        if (param0 != 0) {
          rda.a(125, false, true);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ur.field_d;
        if (5 > var3) {
          L0: {
            var2 = 8192 * var3 * var3 / 1100;
            var4 = 1;
            var5 = 0;
            if (param0 == 1) {
              var5 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 == 3) {
              var4 = -1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (4 != param0) {
              break L2;
            } else {
              var4 = 1;
              var5 = 1;
              break L2;
            }
          }
          L3: {
            if (5 != param0) {
              break L3;
            } else {
              var4 = -1;
              var5 = 1;
              break L3;
            }
          }
          L4: {
            if (param0 == 6) {
              var5 = -1;
              var4 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param0 == 7) {
              var4 = -1;
              var5 = -1;
              break L5;
            } else {
              if (param0 != 8) {
                break L5;
              } else {
                L6: {
                  var4 = -1;
                  var5 = -1;
                  if (param0 != 11) {
                    break L6;
                  } else {
                    var4 = -1;
                    break L6;
                  }
                }
                L7: {
                  if (param0 != 12) {
                    break L7;
                  } else {
                    var5 = -1;
                    var4 = -1;
                    break L7;
                  }
                }
                L8: {
                  if (param0 != 13) {
                    break L8;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L8;
                  }
                }
                L9: {
                  if (param0 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0 == 15) {
                    var5 = 1;
                    var4 = 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                int discarded$8 = 0;
                dl.field_j = ek.a(var4 * var2, var5 * var2);
                return;
              }
            }
          }
          L11: {
            if (param0 != 11) {
              break L11;
            } else {
              var4 = -1;
              break L11;
            }
          }
          L12: {
            if (param0 != 12) {
              break L12;
            } else {
              var5 = -1;
              var4 = -1;
              break L12;
            }
          }
          L13: {
            if (param0 != 13) {
              break L13;
            } else {
              var5 = -1;
              var4 = 1;
              break L13;
            }
          }
          L14: {
            if (param0 == 14) {
              var4 = -1;
              var5 = 1;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (param0 == 15) {
              var5 = 1;
              var4 = 1;
              break L15;
            } else {
              break L15;
            }
          }
          int discarded$9 = 0;
          dl.field_j = ek.a(var4 * var2, var5 * var2);
          return;
        } else {
          if (var3 >= 105) {
            if (var3 < 120) {
              L16: {
                var3 = -var3 + 120;
                var2 = -(8192 * var3 * var3 / 3300) + 8192;
                var4 = 1;
                var5 = 0;
                if (param0 == 1) {
                  var5 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (param0 == 3) {
                  var4 = -1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (4 != param0) {
                  break L18;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L18;
                }
              }
              L19: {
                if (5 != param0) {
                  break L19;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L19;
                }
              }
              L20: {
                if (param0 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (param0 == 7) {
                  var4 = -1;
                  var5 = -1;
                  break L21;
                } else {
                  if (param0 != 8) {
                    break L21;
                  } else {
                    L22: {
                      var4 = -1;
                      var5 = -1;
                      if (param0 != 11) {
                        break L22;
                      } else {
                        var4 = -1;
                        break L22;
                      }
                    }
                    L23: {
                      if (param0 != 12) {
                        break L23;
                      } else {
                        var5 = -1;
                        var4 = -1;
                        break L23;
                      }
                    }
                    L24: {
                      if (param0 != 13) {
                        break L24;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L24;
                      }
                    }
                    L25: {
                      if (param0 == 14) {
                        var4 = -1;
                        var5 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (param0 == 15) {
                        var5 = 1;
                        var4 = 1;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    int discarded$10 = 0;
                    dl.field_j = ek.a(var4 * var2, var5 * var2);
                    return;
                  }
                }
              }
              L27: {
                if (param0 != 11) {
                  break L27;
                } else {
                  var4 = -1;
                  break L27;
                }
              }
              L28: {
                if (param0 != 12) {
                  break L28;
                } else {
                  var5 = -1;
                  var4 = -1;
                  break L28;
                }
              }
              L29: {
                if (param0 != 13) {
                  break L29;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L29;
                }
              }
              L30: {
                if (param0 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (param0 == 15) {
                  var5 = 1;
                  var4 = 1;
                  break L31;
                } else {
                  break L31;
                }
              }
              int discarded$11 = 0;
              dl.field_j = ek.a(var4 * var2, var5 * var2);
              return;
            } else {
              L32: {
                var4 = 1;
                var5 = 0;
                if (param0 == 1) {
                  var5 = 1;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (param0 == 3) {
                  var4 = -1;
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (4 != param0) {
                  break L34;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L34;
                }
              }
              L35: {
                if (5 != param0) {
                  break L35;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L35;
                }
              }
              L36: {
                if (param0 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L36;
                } else {
                  break L36;
                }
              }
              if (param0 != 7) {
                L37: {
                  if (param0 != 8) {
                    break L37;
                  } else {
                    var4 = -1;
                    var5 = -1;
                    break L37;
                  }
                }
                L38: {
                  if (param0 != 11) {
                    break L38;
                  } else {
                    var4 = -1;
                    break L38;
                  }
                }
                L39: {
                  if (param0 != 12) {
                    break L39;
                  } else {
                    var5 = -1;
                    var4 = -1;
                    break L39;
                  }
                }
                L40: {
                  if (param0 != 13) {
                    break L40;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L40;
                  }
                }
                L41: {
                  if (param0 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (param0 == 15) {
                    var5 = 1;
                    var4 = 1;
                    break L42;
                  } else {
                    break L42;
                  }
                }
                int discarded$12 = 0;
                dl.field_j = ek.a(var4 * var2, var5 * var2);
                return;
              } else {
                L43: {
                  var4 = -1;
                  var5 = -1;
                  if (param0 != 11) {
                    break L43;
                  } else {
                    var4 = -1;
                    break L43;
                  }
                }
                L44: {
                  if (param0 != 12) {
                    break L44;
                  } else {
                    var5 = -1;
                    var4 = -1;
                    break L44;
                  }
                }
                L45: {
                  if (param0 != 13) {
                    break L45;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L45;
                  }
                }
                L46: {
                  if (param0 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (param0 == 15) {
                    var5 = 1;
                    var4 = 1;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                int discarded$13 = 0;
                dl.field_j = ek.a(var4 * var2, var5 * var2);
                return;
              }
            }
          } else {
            L48: {
              var2 = (var3 * 16384 - 40960) / 220;
              var4 = 1;
              var5 = 0;
              if (param0 == 1) {
                var5 = 1;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (param0 == 3) {
                var4 = -1;
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              if (4 != param0) {
                break L50;
              } else {
                var4 = 1;
                var5 = 1;
                break L50;
              }
            }
            L51: {
              if (5 != param0) {
                break L51;
              } else {
                var4 = -1;
                var5 = 1;
                break L51;
              }
            }
            L52: {
              if (param0 == 6) {
                var5 = -1;
                var4 = 1;
                break L52;
              } else {
                break L52;
              }
            }
            if (param0 != 7) {
              L53: {
                if (param0 != 8) {
                  break L53;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L53;
                }
              }
              L54: {
                if (param0 != 11) {
                  break L54;
                } else {
                  var4 = -1;
                  break L54;
                }
              }
              L55: {
                if (param0 != 12) {
                  break L55;
                } else {
                  var5 = -1;
                  var4 = -1;
                  break L55;
                }
              }
              L56: {
                if (param0 != 13) {
                  break L56;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L56;
                }
              }
              L57: {
                if (param0 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                if (param0 == 15) {
                  var5 = 1;
                  var4 = 1;
                  break L58;
                } else {
                  break L58;
                }
              }
              int discarded$14 = 0;
              dl.field_j = ek.a(var4 * var2, var5 * var2);
              return;
            } else {
              L59: {
                var4 = -1;
                var5 = -1;
                if (param0 != 11) {
                  break L59;
                } else {
                  var4 = -1;
                  break L59;
                }
              }
              L60: {
                if (param0 != 12) {
                  break L60;
                } else {
                  var5 = -1;
                  var4 = -1;
                  break L60;
                }
              }
              L61: {
                if (param0 != 13) {
                  break L61;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L61;
                }
              }
              L62: {
                if (param0 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L62;
                } else {
                  break L62;
                }
              }
              L63: {
                if (param0 == 15) {
                  var5 = 1;
                  var4 = 1;
                  break L63;
                } else {
                  break L63;
                }
              }
              int discarded$15 = 0;
              dl.field_j = ek.a(var4 * var2, var5 * var2);
              return;
            }
          }
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[520];
    }
}
