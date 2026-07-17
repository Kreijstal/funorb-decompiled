/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends ua implements u, ql, sh {
    private em field_O;
    private t field_z;
    private t field_K;
    private jj field_C;
    static String[] field_B;
    static int[] field_L;
    private qc field_N;
    private qc field_J;
    private qc field_F;
    private qc field_I;
    cm field_G;
    private qc field_D;
    static int field_E;
    private qc field_H;

    private final int a(byte param0, int param1, we param2, String param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 > 96) {
              stackOut_3_0 = this.a(35, param4, param3, 170, param2, 3, param5);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 54;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("bg.BA(").append(param0).append(44).append(170).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param4).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == -21099) {
              L1: {
                if (param0 != 0) {
                  if (param0 != 1) {
                    if (2 == param0) {
                      int discarded$14 = 0;
                      wc.a("conduct.ws");
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    int discarded$15 = 0;
                    wc.a("privacy.ws");
                    break L1;
                  }
                } else {
                  int discarded$16 = 0;
                  wc.a("terms.ws");
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bg.C(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    private final boolean a(int param0, ag param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kf var4 = null;
        na var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3_int = -94 / ((param0 - 51) / 56);
            var4 = param1.a(-118);
            if (var4 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5 = var4.b(false);
              if (var5 != ol.field_h) {
                if (var5 == ke.field_d) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  if (var5 != uc.field_e) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("bg.G(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0 != 0;
    }

    private final int a(int param0, String param1, we param2, int param3, int param4) {
        mh var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 <= -96) {
              var6 = new mh(20, param4, 290, 25, param2, false, 120, 3, t.field_z, 16777215, param1);
              ((bg) this).b((byte) -78, (we) (Object) var6);
              stackOut_3_0 = var6.field_p;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 55;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("bg.DA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 170 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = uj.field_i;
        if (5 <= var3) {
          if (var3 >= 105) {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
              if (param1 >= 77) {
                L0: {
                  var4 = 1;
                  var5 = 0;
                  if (param0 != 1) {
                    break L0;
                  } else {
                    var5 = 1;
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
                  if (param0 == 4) {
                    var5 = 1;
                    var4 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L3;
                  } else {
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
                  L6: {
                    if (7 == param0) {
                      break L6;
                    } else {
                      if (8 == param0) {
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
                  if (11 == param0) {
                    var4 = -1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0 == 12) {
                    var5 = -1;
                    var4 = -1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0 != 13) {
                    break L9;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L9;
                  }
                }
                L10: {
                  if (param0 != 14) {
                    break L10;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L10;
                  }
                }
                L11: {
                  if (param0 == 15) {
                    var4 = 1;
                    var5 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              } else {
                return;
              }
            } else {
              if (param1 >= 77) {
                L12: {
                  var4 = 1;
                  var5 = 0;
                  if (param0 != 1) {
                    break L12;
                  } else {
                    var5 = 1;
                    break L12;
                  }
                }
                L13: {
                  if (param0 == 3) {
                    var4 = -1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0 == 4) {
                    var5 = 1;
                    var4 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param0 == 6) {
                    var5 = -1;
                    var4 = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (7 == param0) {
                      break L18;
                    } else {
                      if (8 == param0) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L17;
                }
                L19: {
                  if (11 == param0) {
                    var4 = -1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param0 == 12) {
                    var5 = -1;
                    var4 = -1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param0 != 13) {
                    break L21;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L21;
                  }
                }
                L22: {
                  if (param0 != 14) {
                    break L22;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L22;
                  }
                }
                L23: {
                  if (param0 == 15) {
                    var4 = 1;
                    var5 = 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              } else {
                return;
              }
            }
          } else {
            var2 = (-40960 + 16384 * var3) / 220;
            if (param1 >= 77) {
              L24: {
                var4 = 1;
                var5 = 0;
                if (param0 != 1) {
                  break L24;
                } else {
                  var5 = 1;
                  break L24;
                }
              }
              L25: {
                if (param0 == 3) {
                  var4 = -1;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (param0 == 4) {
                  var5 = 1;
                  var4 = 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param0 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param0 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L28;
                } else {
                  break L28;
                }
              }
              if (7 != param0) {
                if (8 != param0) {
                  L29: {
                    if (11 == param0) {
                      var4 = -1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (param0 == 12) {
                      var5 = -1;
                      var4 = -1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (param0 != 13) {
                      break L31;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L31;
                    }
                  }
                  L32: {
                    if (param0 != 14) {
                      break L32;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L32;
                    }
                  }
                  L33: {
                    if (param0 == 15) {
                      var4 = 1;
                      var5 = 1;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                } else {
                  L34: {
                    var5 = -1;
                    var4 = -1;
                    if (11 == param0) {
                      var4 = -1;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (param0 == 12) {
                      var5 = -1;
                      var4 = -1;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (param0 != 13) {
                      break L36;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 != 14) {
                      break L37;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L37;
                    }
                  }
                  L38: {
                    if (param0 == 15) {
                      var4 = 1;
                      var5 = 1;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                }
              } else {
                L39: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param0) {
                    var4 = -1;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (param0 == 12) {
                    var5 = -1;
                    var4 = -1;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (param0 != 13) {
                    break L41;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L41;
                  }
                }
                L42: {
                  if (param0 != 14) {
                    break L42;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L42;
                  }
                }
                L43: {
                  if (param0 == 15) {
                    var4 = 1;
                    var5 = 1;
                    break L43;
                  } else {
                    break L43;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var2 = var3 * (var3 * 8192) / 1100;
          if (param1 >= 77) {
            L44: {
              var4 = 1;
              var5 = 0;
              if (param0 != 1) {
                break L44;
              } else {
                var5 = 1;
                break L44;
              }
            }
            L45: {
              if (param0 == 3) {
                var4 = -1;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (param0 == 4) {
                var5 = 1;
                var4 = 1;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (param0 == 5) {
                var5 = 1;
                var4 = -1;
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              if (param0 == 6) {
                var5 = -1;
                var4 = 1;
                break L48;
              } else {
                break L48;
              }
            }
            if (7 != param0) {
              if (8 != param0) {
                L49: {
                  if (11 == param0) {
                    var4 = -1;
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  if (param0 == 12) {
                    var5 = -1;
                    var4 = -1;
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L51: {
                  if (param0 != 13) {
                    break L51;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L51;
                  }
                }
                L52: {
                  if (param0 != 14) {
                    break L52;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L52;
                  }
                }
                L53: {
                  if (param0 == 15) {
                    var4 = 1;
                    var5 = 1;
                    break L53;
                  } else {
                    break L53;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              } else {
                L54: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param0) {
                    var4 = -1;
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  if (param0 == 12) {
                    var5 = -1;
                    var4 = -1;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  if (param0 != 13) {
                    break L56;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L56;
                  }
                }
                L57: {
                  if (param0 != 14) {
                    break L57;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L57;
                  }
                }
                L58: {
                  if (param0 == 15) {
                    var4 = 1;
                    var5 = 1;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              L59: {
                var5 = -1;
                var4 = -1;
                if (11 == param0) {
                  var4 = -1;
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if (param0 == 12) {
                  var5 = -1;
                  var4 = -1;
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                if (param0 != 13) {
                  break L61;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L61;
                }
              }
              L62: {
                if (param0 != 14) {
                  break L62;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L62;
                }
              }
              L63: {
                if (param0 == 15) {
                  var4 = 1;
                  var5 = 1;
                  break L63;
                } else {
                  break L63;
                }
              }
              ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 4826) {
              var2_int = 0;
              L1: while (true) {
                if (param1.length() <= var2_int) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    var3 = param1.charAt(var2_int);
                    int discarded$5 = 0;
                    if (uc.a((char) var3)) {
                      break L2;
                    } else {
                      if (re.a(param0 ^ -4843, (char) var3)) {
                        break L2;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("bg.J(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    private final int a(int param0, int param1, String param2, int param3, we param4, int param5, String param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        mh var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var10 = new mh(20, param1, 120 - -param3, 25, param4, false, 120, param5, t.field_z, 16777215, param2);
            ((bg) this).b((byte) -88, (we) (Object) var10);
            var9 = new vg(((ag) (Object) param4).a(-121), param6, 126, var10.field_p + param1, param3 + 50, param0);
            var9.field_o = (of) this;
            ((bg) this).b((byte) -84, (we) (Object) var9);
            stackOut_0_0 = var10.field_p - -var9.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("bg.EA(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param5).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    public final void a(int param0) {
        Object var3 = null;
        if (param0 != 200) {
          var3 = null;
          int discarded$2 = this.a(-96, -126, (String) null, 71, (we) null, 63, (String) null);
          ((hh) (Object) ((bg) this).field_N.a(-114)).f((byte) -82);
          return;
        } else {
          ((hh) (Object) ((bg) this).field_N.a(-114)).f((byte) -82);
          return;
        }
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        try {
            var3 = ((bg) this).field_N;
            var4 = param0;
            if (param1 >= -50) {
                Object var5 = null;
                ((bg) this).a((String) null, -32);
            }
            ((rj) (Object) var3).a(false, -5905, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "bg.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public bg() {
        super(0, 0, 496, 0, (ml) null);
        ((bg) this).field_N = new qc("", (of) null, 12);
        ((bg) this).field_D = new qc("", (of) null, 100);
        ((bg) this).field_I = new qc("", (of) null, 100);
        ((bg) this).field_H = new qc("", (of) null, 20);
        ((bg) this).field_J = new qc("", (of) null, 20);
        ((bg) this).field_F = new qc("", (of) null, 3);
        int var1 = 1;
        ((bg) this).field_O = new em("", (of) null, var1 != 0);
        ((bg) this).field_z = new t(pl.field_b, (of) null);
        ((bg) this).field_K = new t(aj.field_d, (of) null);
        ((bg) this).field_N.field_m = oa.field_E;
        ((bg) this).field_D.field_m = ad.field_f;
        ((bg) this).field_I.field_m = rf.field_b;
        ((bg) this).field_H.field_m = kd.field_d;
        ((bg) this).field_J.field_m = id.field_h;
        ((bg) this).field_F.field_m = ri.field_d;
        ((bg) this).field_O.field_m = a.field_j;
        ((bg) this).field_N.a((kf) (Object) new hh((rj) (Object) ((bg) this).field_N), true);
        ((bg) this).field_D.a((kf) (Object) new uk((rj) (Object) ((bg) this).field_D), true);
        ((bg) this).field_I.a((kf) (Object) new fd((rj) (Object) ((bg) this).field_I, (rj) (Object) ((bg) this).field_D), true);
        ((bg) this).field_H.a((kf) (Object) new df((rj) (Object) ((bg) this).field_H, (rj) (Object) ((bg) this).field_N, (rj) (Object) ((bg) this).field_D), true);
        ((bg) this).field_J.a((kf) (Object) new rd((rj) (Object) ((bg) this).field_J, (rj) (Object) ((bg) this).field_H), true);
        ((bg) this).field_F.a((kf) (Object) new th((rj) (Object) ((bg) this).field_F), true);
        ((bg) this).field_z.field_w = false;
        ((bg) this).field_z.field_h = (ml) (Object) new hd();
        ((bg) this).field_K.field_h = (ml) (Object) new lc();
        ((bg) this).field_N.field_h = (ml) (Object) new mg(10000536);
        mg dupTemp$0 = new mg(10000536);
        ((bg) this).field_I.field_h = (ml) (Object) dupTemp$0;
        ((bg) this).field_D.field_h = (ml) (Object) dupTemp$0;
        ((bg) this).field_F.field_h = (ml) (Object) new mg(10000536);
        ((bg) this).field_O.field_h = (ml) (Object) new wi();
        ve dupTemp$1 = new ve(10000536);
        ((bg) this).field_J.field_h = (ml) (Object) dupTemp$1;
        ((bg) this).field_H.field_h = (ml) (Object) dupTemp$1;
        int discarded$2 = -95;
        int discarded$3 = 0;
        String var2 = gg.a(new String[2], uk.field_p, true);
        int var3 = 20;
        var3 = var3 + this.a(-107, be.field_e, (we) (Object) ((bg) this).field_D, 170, var3);
        var3 = var3 + (5 + this.a(20, var3, ef.field_a, 170, (we) (Object) ((bg) this).field_I, 3, ""));
        var3 = var3 + this.a(-112, ec.field_c, (we) (Object) ((bg) this).field_H, 170, var3);
        var3 = var3 + (5 + this.a((byte) 98, 170, (we) (Object) ((bg) this).field_J, ce.field_a, var3, jj.field_B));
        var3 = var3 + (5 + this.a((byte) 122, 170, (we) (Object) ((bg) this).field_N, ke.field_e, var3, wj.field_l));
        var3 = var3 + this.a(var3, 93, 170, mg.field_v, (we) (Object) ((bg) this).field_F);
        mh var4 = new mh(46, var3, -90 + ((bg) this).field_l, 25, (we) (Object) ((bg) this).field_O, true, -120 + ((bg) this).field_l, 5, pf.field_c, 11579568, je.field_f);
        ((bg) this).b((byte) -52, (we) (Object) var4);
        var3 = var3 + var4.field_p;
        a var5 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 0, 0, t.field_z.field_C, -1, 2147483647, true);
        ((bg) this).field_C = new jj(var2, (ml) (Object) var5);
        ((bg) this).field_C.field_m = "";
        ((bg) this).field_C.a(false, 0, kg.field_a);
        ((bg) this).field_C.a(false, 1, kg.field_a);
        ((bg) this).field_C.field_o = (of) this;
        ((bg) this).field_C.c(46, var3, -90 + ((bg) this).field_l, -1);
        var3 = var3 + (15 + ((bg) this).field_C.field_p);
        ((bg) this).b((byte) -127, (we) (Object) ((bg) this).field_C);
        int var6 = 4;
        int var7 = 200;
        ((bg) this).field_z.a(40, 13361, 496 - var7 >> 1, var7, var3);
        ((bg) this).field_K.a(40, 13361, var6 - -3, 60, 15 + var3);
        ((bg) this).field_K.field_o = (of) this;
        ((bg) this).field_z.field_o = (of) this;
        ((bg) this).b((byte) -33, (we) (Object) ((bg) this).field_z);
        ((bg) this).b((byte) -27, (we) (Object) ((bg) this).field_K);
        ((bg) this).field_G = new cm((sh) this);
        ((bg) this).field_G.a(150, 13361, ((bg) this).field_N.field_r + ((bg) this).field_N.field_l - -60, -60 + (-((bg) this).field_N.field_l + -((bg) this).field_N.field_r) + ((bg) this).field_l, ((bg) this).field_N.field_e + 20);
        ((bg) this).b((byte) -112, (we) (Object) ((bg) this).field_G);
        ((bg) this).a(var6 + 55 + var3, 13361, 0, 496, 0);
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                var7 = null;
                ((bg) this).a(-82, -126, (jj) null, -55);
                break L1;
              }
            }
            L2: {
              if (param4 != ((bg) this).field_K) {
                if (param4 == ((bg) this).field_z) {
                  int discarded$4 = 104;
                  boolean discarded$5 = this.d();
                  break L2;
                } else {
                  break L2;
                }
              } else {
                wg.f(param3 ^ -8);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("bg.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, 105)) {
              var5_int = -20 % ((37 - param3) / 50);
              if (param2 != 98) {
                if (param2 == 99) {
                  stackOut_8_0 = ((bg) this).b(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((bg) this).a((byte) 112, param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("bg.V(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    private final int a(int param0, int param1, int param2, String param3, we param4) {
        RuntimeException var6 = null;
        vh var7 = null;
        int var8 = 0;
        mh var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var9 = new mh(20, param0, 290, 25, param4, false, 120, 3, t.field_z, 16777215, param3);
            ((bg) this).b((byte) -67, (we) (Object) var9);
            var7 = new vh(((ag) (Object) param4).a(-107));
            ((bg) this).b((byte) -82, (we) (Object) var7);
            var8 = -6;
            var7.a(15, 13361, 3 + var9.field_l + var9.field_r, 15, (-15 + var9.field_p >> 1) + var9.field_e);
            stackOut_0_0 = var9.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("bg.M(").append(param0).append(44).append(93).append(44).append(170).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    private final boolean l() {
        if (this.a(-59, (ag) (Object) ((bg) this).field_N)) {
          if (this.a(-110, (ag) (Object) ((bg) this).field_D)) {
            if (this.a(-22, (ag) (Object) ((bg) this).field_I)) {
              if (this.a(-12, (ag) (Object) ((bg) this).field_H)) {
                if (this.a(113, (ag) (Object) ((bg) this).field_J)) {
                  if (!this.a(123, (ag) (Object) ((bg) this).field_F)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final boolean d() {
        int discarded$0 = -2706;
        if (!(this.l())) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(((bg) this).field_F.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return kh.a(((bg) this).field_H.field_s, 71, ((bg) this).field_O.field_u, ((bg) this).field_N.field_s, var2, (bg) this, ((bg) this).field_D.field_s);
    }

    private final String b() {
        return "</col></u>";
    }

    private final String e() {
        int var2 = 60;
        return "<u=2164A2><col=2164A2>";
    }

    final void a(we param0, int param1, int param2, byte param3) {
        if (param3 > -13) {
            return;
        }
        try {
            super.a(param0, param1, param2, (byte) -23);
            int discarded$0 = -2706;
            ((bg) this).field_z.field_w = this.l();
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "bg.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void k(int param0) {
        field_B = null;
        field_L = null;
        if (param0 != 20660) {
            bg.k(96);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new String[]{"All scores", "My scores", "Best each"};
        field_L = new int[8192];
    }
}
