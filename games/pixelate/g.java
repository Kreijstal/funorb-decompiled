/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class g extends mg {
    static kk field_r;
    static ak field_o;
    static byte[] field_s;
    private c field_n;
    static int field_m;
    static String field_q;
    private c field_p;

    final dj a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_2_0 = null;
        dj stackIn_5_0 = null;
        dj stackIn_8_0 = null;
        dj stackIn_11_0 = null;
        dj stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_12_0 = null;
        dj stackOut_10_0 = null;
        dj stackOut_7_0 = null;
        dj stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3 = ((g) this).field_n.field_q.toLowerCase();
            var4 = param0.toLowerCase();
            if (param1) {
              if (var4.length() != 0) {
                if (wg.a(var4, var3, (byte) -4)) {
                  if (!this.b(126, param0)) {
                    stackOut_12_0 = qk.field_g;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = sk.field_a;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = sk.field_a;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = sk.field_a;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("g.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_26_0 = null;
        String stackOut_30_0 = null;
        String stackOut_22_0 = null;
        String stackOut_19_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        String stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var6 = ((g) this).field_n.field_q.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (param0 < -76) {
                  break L1;
                } else {
                  field_m = 16;
                  break L1;
                }
              }
              var5 = var4;
              if (!ep.a((byte) 34, var5)) {
                if (nm.a(var5, 64)) {
                  stackOut_10_0 = ka.field_R;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (!cm.a(var5, 73)) {
                    if (!this.b(125, param1)) {
                      if (var6.length() > 0) {
                        if (!kb.a(var5, var6, (byte) 78)) {
                          if (pc.a(var5, (byte) -47, var6)) {
                            stackOut_26_0 = pk.field_b;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            if (gb.a(var5, var6, 95)) {
                              stackOut_30_0 = tj.field_w;
                              stackIn_31_0 = stackOut_30_0;
                              break L0;
                            } else {
                              return vi.field_y;
                            }
                          }
                        } else {
                          stackOut_22_0 = tj.field_w;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      } else {
                        stackOut_19_0 = cd.field_a;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      stackOut_16_0 = ki.field_c;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = ag.field_n;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              } else {
                stackOut_6_0 = vi.field_y;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("g.E(").append(param0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_31_0;
    }

    final static ak b(boolean param0) {
        return ma.field_z.field_Fb;
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 124) {
                break L1;
              } else {
                g.a(-44, -114);
                break L1;
              }
            }
            L2: {
              var3 = ((g) this).field_p.field_q.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if (var4.length() <= 0) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L2;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (var4.indexOf(var6) < 0) {
                        if (var4.indexOf(var7) >= 0) {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("g.B(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          var3 = ga.field_f;
          if (var3 < 5) {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          } else {
            if (var3 < 105) {
              var2 = (var3 * 16384 + -40960) / 220;
              if (param1 <= 29) {
                return;
              } else {
                L1: {
                  var4 = 1;
                  var5 = 0;
                  if (param0 == 1) {
                    var5 = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 != 3) {
                    break L2;
                  } else {
                    var4 = -1;
                    break L2;
                  }
                }
                L3: {
                  if (4 != param0) {
                    break L3;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L3;
                  }
                }
                L4: {
                  if (param0 == 5) {
                    var4 = -1;
                    var5 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 != 6) {
                    break L5;
                  } else {
                    var4 = 1;
                    var5 = -1;
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
                  if (12 != param0) {
                    break L9;
                  } else {
                    var4 = -1;
                    var5 = -1;
                    break L9;
                  }
                }
                L10: {
                  if (13 != param0) {
                    break L10;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L10;
                  }
                }
                L11: {
                  if (param0 != 14) {
                    break L11;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L11;
                  }
                }
                L12: {
                  if (param0 != 15) {
                    break L12;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L12;
                  }
                }
                oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                return;
              }
            } else {
              if (120 <= var3) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = 8192 - 8192 * var3 * var3 / 3300;
                if (param1 > 29) {
                  L13: {
                    var4 = 1;
                    var5 = 0;
                    if (param0 == 1) {
                      var5 = 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (param0 != 3) {
                      break L14;
                    } else {
                      var4 = -1;
                      break L14;
                    }
                  }
                  L15: {
                    if (4 != param0) {
                      break L15;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L15;
                    }
                  }
                  L16: {
                    if (param0 == 5) {
                      var4 = -1;
                      var5 = 1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param0 != 6) {
                      break L17;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L17;
                    }
                  }
                  if (param0 != 7) {
                    if (param0 == 8) {
                      L18: {
                        var4 = -1;
                        var5 = -1;
                        if (param0 == 11) {
                          var4 = -1;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (12 != param0) {
                          break L19;
                        } else {
                          var4 = -1;
                          var5 = -1;
                          break L19;
                        }
                      }
                      L20: {
                        if (13 != param0) {
                          break L20;
                        } else {
                          var4 = 1;
                          var5 = -1;
                          break L20;
                        }
                      }
                      L21: {
                        if (param0 != 14) {
                          break L21;
                        } else {
                          var5 = 1;
                          var4 = -1;
                          break L21;
                        }
                      }
                      L22: {
                        if (param0 != 15) {
                          break L22;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L22;
                        }
                      }
                      oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                      return;
                    } else {
                      L23: {
                        if (param0 == 11) {
                          var4 = -1;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (12 != param0) {
                          break L24;
                        } else {
                          var4 = -1;
                          var5 = -1;
                          break L24;
                        }
                      }
                      L25: {
                        if (13 != param0) {
                          break L25;
                        } else {
                          var4 = 1;
                          var5 = -1;
                          break L25;
                        }
                      }
                      L26: {
                        if (param0 != 14) {
                          break L26;
                        } else {
                          var5 = 1;
                          var4 = -1;
                          break L26;
                        }
                      }
                      L27: {
                        if (param0 != 15) {
                          break L27;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L27;
                        }
                      }
                      oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
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
                      if (12 != param0) {
                        break L29;
                      } else {
                        var4 = -1;
                        var5 = -1;
                        break L29;
                      }
                    }
                    L30: {
                      if (13 != param0) {
                        break L30;
                      } else {
                        var4 = 1;
                        var5 = -1;
                        break L30;
                      }
                    }
                    L31: {
                      if (param0 != 14) {
                        break L31;
                      } else {
                        var5 = 1;
                        var4 = -1;
                        break L31;
                      }
                    }
                    L32: {
                      if (param0 != 15) {
                        break L32;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L32;
                      }
                    }
                    oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param1 <= 29) {
          return;
        } else {
          L33: {
            var4 = 1;
            var5 = 0;
            if (param0 == 1) {
              var5 = 1;
              break L33;
            } else {
              break L33;
            }
          }
          L34: {
            if (param0 != 3) {
              break L34;
            } else {
              var4 = -1;
              break L34;
            }
          }
          L35: {
            if (4 != param0) {
              break L35;
            } else {
              var4 = 1;
              var5 = 1;
              break L35;
            }
          }
          L36: {
            if (param0 == 5) {
              var4 = -1;
              var5 = 1;
              break L36;
            } else {
              break L36;
            }
          }
          L37: {
            if (param0 != 6) {
              break L37;
            } else {
              var4 = 1;
              var5 = -1;
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
            if (12 != param0) {
              break L41;
            } else {
              var4 = -1;
              var5 = -1;
              break L41;
            }
          }
          L42: {
            if (13 != param0) {
              break L42;
            } else {
              var4 = 1;
              var5 = -1;
              break L42;
            }
          }
          L43: {
            if (param0 != 14) {
              break L43;
            } else {
              var5 = 1;
              var4 = -1;
              break L43;
            }
          }
          L44: {
            if (param0 != 15) {
              break L44;
            } else {
              var4 = 1;
              var5 = 1;
              break L44;
            }
          }
          oe.field_Hb = qm.a(var5 * var2, var4 * var2, (byte) 7);
          return;
        }
    }

    g(c param0, c param1, c param2) {
        super(param0);
        try {
            ((g) this).field_p = param2;
            ((g) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static ue a(int param0, byte param1, int param2, int param3, int param4) {
        ue var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var6 = 27 % ((param1 - 25) / 44);
        var5 = (ue) (Object) f.field_c.c(1504642273);
        L0: while (true) {
          if (var5 != null) {
            if (0 != var5.field_o) {
              var5 = (ue) (Object) f.field_c.f(1504642273);
              continue L0;
            } else {
              return var5;
            }
          } else {
            var5 = new ue();
            var5.field_s = param2;
            var5.field_m = param3;
            var5.field_o = 0;
            f.field_c.a(22125, (fa) (Object) var5);
            uj.a(param0, var5, 65536);
            return var5;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 2;
        field_q = "Loading graphics";
    }
}
