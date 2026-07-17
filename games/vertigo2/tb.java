/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb implements ka {
    private int field_f;
    private r field_i;
    static String field_c;
    private la field_h;
    private ui[] field_g;
    static boolean field_b;
    private r field_e;
    static cr field_a;
    static er field_d;

    public final ui e(int param0, int param1) {
        if (param1 != -1) {
            tb.a(12);
        }
        return ((tb) this).field_g[param0];
    }

    public final int[] a(int param0, float param1, int param2, boolean param3, int param4, int param5) {
        if (param0 != -9718) {
            tb.a(26);
        }
        return ((tb) this).g(param0 ^ -28760, param2).a(((tb) this).field_e, (double)param1, param3, ((tb) this).field_g[param2].field_i, param5, 27127, param4, (ka) this);
    }

    he g(int param0, int param1) {
        gp var3 = ((tb) this).field_h.a((long)param1, false);
        if (!(var3 == null)) {
            return (he) (Object) var3;
        }
        byte[] var4 = ((tb) this).field_i.a(true, param1);
        if (param0 != 21922) {
            ui discarded$0 = ((tb) this).e(-77, -84);
        }
        if (var4 == null) {
            return null;
        }
        he var5 = new he(new ed(var4));
        ((tb) this).field_h.a(-1, (gp) (Object) var5, (long)param1);
        return var5;
    }

    public final boolean f(int param0, int param1) {
        he var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var3 = ((tb) this).g(21922, param1);
          if (param0 == 0) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (!var3.a(((tb) this).field_e, (ka) this, param0)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(byte param0) {
        if (param0 <= 112) {
            boolean discarded$0 = tb.a((byte) 109);
        }
        return ha.field_a != null ? true : false;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 30272) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    tb(r param0, r param1, r param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        ed var7 = null;
        ui stackIn_10_0 = null;
        ui stackIn_11_0 = null;
        ui stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ui stackIn_18_0 = null;
        ui stackIn_19_0 = null;
        ui stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ui stackIn_71_0 = null;
        ui stackIn_72_0 = null;
        ui stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        ui stackOut_70_0 = null;
        ui stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ui stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        ui stackOut_17_0 = null;
        ui stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ui stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ui stackOut_9_0 = null;
        ui stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ui stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        ((tb) this).field_h = new la(256);
        try {
          L0: {
            ((tb) this).field_e = param2;
            ((tb) this).field_i = param1;
            var7 = new ed(param0.a(0, 0, (byte) -74));
            ((tb) this).field_f = var7.a((byte) -11);
            ((tb) this).field_g = new ui[((tb) this).field_f];
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((tb) this).field_f) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((tb) this).field_f) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((tb) this).field_f) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= ((tb) this).field_f) {
                            var5 = 0;
                            L5: while (true) {
                              if (((tb) this).field_f <= var5) {
                                var5 = 0;
                                L6: while (true) {
                                  if (((tb) this).field_f <= var5) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (var5 >= ((tb) this).field_f) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (((tb) this).field_f <= var5) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (((tb) this).field_f <= var5) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (var5 >= ((tb) this).field_f) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (((tb) this).field_f <= var5) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (var5 >= ((tb) this).field_f) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (((tb) this).field_f <= var5) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (var5 >= ((tb) this).field_f) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (((tb) this).field_f <= var5) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (var5 >= ((tb) this).field_f) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (((tb) this).field_f <= var5) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (((tb) this).field_f <= var5) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (((tb) this).field_f <= var5) {
                                                                                        var5 = 0;
                                                                                        L20: while (true) {
                                                                                          if (var5 >= ((tb) this).field_f) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L21: {
                                                                                              if (((tb) this).field_g[var5] == null) {
                                                                                                break L21;
                                                                                              } else {
                                                                                                ((tb) this).field_g[var5].field_h = var7.h(-11);
                                                                                                break L21;
                                                                                              }
                                                                                            }
                                                                                            var5++;
                                                                                            continue L20;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (null == ((tb) this).field_g[var5]) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            int discarded$14 = var7.b(true);
                                                                                            break L22;
                                                                                          }
                                                                                        }
                                                                                        var5++;
                                                                                        continue L19;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L23: {
                                                                                      if (((tb) this).field_g[var5] == null) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        int discarded$15 = var7.h(-11);
                                                                                        break L23;
                                                                                      }
                                                                                    }
                                                                                    var5++;
                                                                                    continue L18;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L24: {
                                                                                  if (null == ((tb) this).field_g[var5]) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    int discarded$16 = var7.h(-11);
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                var5++;
                                                                                continue L17;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L25: {
                                                                              if (((tb) this).field_g[var5] == null) {
                                                                                break L25;
                                                                              } else {
                                                                                int discarded$17 = var7.h(-11);
                                                                                break L25;
                                                                              }
                                                                            }
                                                                            var5++;
                                                                            continue L16;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L26: {
                                                                          if (((tb) this).field_g[var5] == null) {
                                                                            break L26;
                                                                          } else {
                                                                            int discarded$18 = var7.h(-11);
                                                                            break L26;
                                                                          }
                                                                        }
                                                                        var5++;
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L27: {
                                                                      if (null == ((tb) this).field_g[var5]) {
                                                                        break L27;
                                                                      } else {
                                                                        byte discarded$19 = var7.g(84);
                                                                        break L27;
                                                                      }
                                                                    }
                                                                    var5++;
                                                                    continue L14;
                                                                  }
                                                                }
                                                              } else {
                                                                L28: {
                                                                  if (((tb) this).field_g[var5] == null) {
                                                                    break L28;
                                                                  } else {
                                                                    L29: {
                                                                      stackOut_70_0 = ((tb) this).field_g[var5];
                                                                      stackIn_72_0 = stackOut_70_0;
                                                                      stackIn_71_0 = stackOut_70_0;
                                                                      if (1 != var7.h(-11)) {
                                                                        stackOut_72_0 = (ui) (Object) stackIn_72_0;
                                                                        stackOut_72_1 = 0;
                                                                        stackIn_73_0 = stackOut_72_0;
                                                                        stackIn_73_1 = stackOut_72_1;
                                                                        break L29;
                                                                      } else {
                                                                        stackOut_71_0 = (ui) (Object) stackIn_71_0;
                                                                        stackOut_71_1 = 1;
                                                                        stackIn_73_0 = stackOut_71_0;
                                                                        stackIn_73_1 = stackOut_71_1;
                                                                        break L29;
                                                                      }
                                                                    }
                                                                    stackIn_73_0.field_i = stackIn_73_1 != 0;
                                                                    break L28;
                                                                  }
                                                                }
                                                                var5++;
                                                                continue L13;
                                                              }
                                                            }
                                                          } else {
                                                            L30: {
                                                              if (null == ((tb) this).field_g[var5]) {
                                                                break L30;
                                                              } else {
                                                                int discarded$20 = var7.h(-11);
                                                                break L30;
                                                              }
                                                            }
                                                            var5++;
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        L31: {
                                                          if (null == ((tb) this).field_g[var5]) {
                                                            break L31;
                                                          } else {
                                                            byte discarded$21 = var7.g(93);
                                                            break L31;
                                                          }
                                                        }
                                                        var5++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    L32: {
                                                      if (null == ((tb) this).field_g[var5]) {
                                                        break L32;
                                                      } else {
                                                        byte discarded$22 = var7.g(110);
                                                        break L32;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                L33: {
                                                  if (null == ((tb) this).field_g[var5]) {
                                                    break L33;
                                                  } else {
                                                    ((tb) this).field_g[var5].field_f = (short)var7.a((byte) -11);
                                                    break L33;
                                                  }
                                                }
                                                var5++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            L34: {
                                              if (null == ((tb) this).field_g[var5]) {
                                                break L34;
                                              } else {
                                                byte discarded$23 = var7.g(105);
                                                break L34;
                                              }
                                            }
                                            var5++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L35: {
                                          if (((tb) this).field_g[var5] == null) {
                                            break L35;
                                          } else {
                                            byte discarded$24 = var7.g(101);
                                            break L35;
                                          }
                                        }
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    L36: {
                                      if (null == ((tb) this).field_g[var5]) {
                                        break L36;
                                      } else {
                                        byte discarded$25 = var7.g(87);
                                        break L36;
                                      }
                                    }
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L37: {
                                  if (null == ((tb) this).field_g[var5]) {
                                    break L37;
                                  } else {
                                    byte discarded$26 = var7.g(111);
                                    break L37;
                                  }
                                }
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            L38: {
                              if (((tb) this).field_g[var5] == null) {
                                break L38;
                              } else {
                                int discarded$27 = var7.h(-11);
                                break L38;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L39: {
                          if (null == ((tb) this).field_g[var5]) {
                            break L39;
                          } else {
                            L40: {
                              stackOut_17_0 = ((tb) this).field_g[var5];
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var7.h(-11) != 1) {
                                stackOut_19_0 = (ui) (Object) stackIn_19_0;
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L40;
                              } else {
                                stackOut_18_0 = (ui) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L40;
                              }
                            }
                            stackIn_20_0.field_c = stackIn_20_1 != 0;
                            break L39;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L41: {
                      if (null == ((tb) this).field_g[var5]) {
                        break L41;
                      } else {
                        L42: {
                          stackOut_9_0 = ((tb) this).field_g[var5];
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var7.h(-11) != 0) {
                            stackOut_11_0 = (ui) (Object) stackIn_11_0;
                            stackOut_11_1 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L42;
                          } else {
                            stackOut_10_0 = (ui) (Object) stackIn_10_0;
                            stackOut_10_1 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L42;
                          }
                        }
                        stackIn_12_0.field_a = stackIn_12_1 != 0;
                        break L41;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L43: {
                  if (var7.h(-11) != 1) {
                    break L43;
                  } else {
                    ((tb) this).field_g[var5] = new ui();
                    break L43;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L44: {
            var4 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) var4;
            stackOut_111_1 = new StringBuilder().append("tb.<init>(");
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param0 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L44;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L44;
            }
          }
          L45: {
            stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(44);
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param1 == null) {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L45;
            } else {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L45;
            }
          }
          L46: {
            stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(44);
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param2 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L46;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L46;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Mute this player for 48 hours";
    }
}
