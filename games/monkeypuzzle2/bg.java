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
        int decompiledRegionSelector0 = 0;
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
              stackOut_3_0 = this.a(35, param4, param3, param1, param2, 3, param5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 54;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7);
            stackOut_5_1 = new StringBuilder().append("bg.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == -21099) {
              L1: {
                L2: {
                  if (-1 != (param0 ^ -1)) {
                    break L2;
                  } else {
                    wc.a("terms.ws", false);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-2 != (param0 ^ -1)) {
                    break L3;
                  } else {
                    wc.a("privacy.ws", false);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (2 == param0) {
                  wc.a("conduct.ws", false);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("bg.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = var4.b(false);
              if (var5 != ol.field_h) {
                if (var5 == ke.field_d) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var5 != uc.field_e) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("bg.G(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                return stackIn_15_0 != 0;
              }
            }
          }
        }
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
        int decompiledRegionSelector0 = 0;
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
              var6 = new mh(20, param4, 120 - -param3, 25, param2, false, 120, 3, t.field_z, 16777215, param1);
              this.b((byte) -78, var6);
              stackOut_3_0 = var6.field_p;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 55;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6_ref);
            stackOut_5_1 = new StringBuilder().append("bg.DA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
        if (5 > var3) {
          var2 = var3 * (var3 * 8192) / 1100;
          if (var6 == 0) {
            if (param1 >= 77) {
              L0: {
                var4 = 1;
                var5 = 0;
                if (-2 != (param0 ^ -1)) {
                  break L0;
                } else {
                  var5 = 1;
                  break L0;
                }
              }
              L1: {
                if (-4 == (param0 ^ -1)) {
                  var4 = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-5 == (param0 ^ -1)) {
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
                if ((param0 ^ -1) == -7) {
                  var5 = -1;
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (7 != param0) {
                if (8 == param0) {
                  L5: {
                    var5 = -1;
                    var4 = -1;
                    if (11 == param0) {
                      var4 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((param0 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((param0 ^ -1) != -14) {
                      break L7;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0 != 14) {
                      break L8;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L8;
                    }
                  }
                  L9: {
                    if ((param0 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                } else {
                  L10: {
                    if (11 == param0) {
                      var4 = -1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((param0 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((param0 ^ -1) != -14) {
                      break L12;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L12;
                    }
                  }
                  L13: {
                    if (param0 != 14) {
                      break L13;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L13;
                    }
                  }
                  L14: {
                    if ((param0 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                }
              } else {
                L15: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param0) {
                    var4 = -1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if ((param0 ^ -1) != -14) {
                    break L17;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L17;
                  }
                }
                L18: {
                  if (param0 != 14) {
                    break L18;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L18;
                  }
                }
                L19: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              return;
            }
          } else {
            L20: {
              if (-106 >= (var3 ^ -1)) {
                break L20;
              } else {
                var2 = (-40960 + 16384 * var3) / 220;
                if (var6 != 0) {
                  break L20;
                } else {
                  if (param1 < 77) {
                    return;
                  } else {
                    L21: {
                      var4 = 1;
                      var5 = 0;
                      if (-2 != (param0 ^ -1)) {
                        break L21;
                      } else {
                        var5 = 1;
                        break L21;
                      }
                    }
                    L22: {
                      if (-4 == (param0 ^ -1)) {
                        var4 = -1;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (-5 == (param0 ^ -1)) {
                        var5 = 1;
                        var4 = 1;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (param0 == 5) {
                        var5 = 1;
                        var4 = -1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if ((param0 ^ -1) == -7) {
                        var5 = -1;
                        var4 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      L27: {
                        if (7 == param0) {
                          break L27;
                        } else {
                          if (8 == param0) {
                            break L27;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var5 = -1;
                      var4 = -1;
                      break L26;
                    }
                    L28: {
                      if (11 == param0) {
                        var4 = -1;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if ((param0 ^ -1) == -13) {
                        var5 = -1;
                        var4 = -1;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if ((param0 ^ -1) != -14) {
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
                      if ((param0 ^ -1) == -16) {
                        var4 = 1;
                        var5 = 1;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                    return;
                  }
                }
              }
            }
            if (-121 < (var3 ^ -1)) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
              if (param1 < 77) {
                return;
              } else {
                L33: {
                  var4 = 1;
                  var5 = 0;
                  if (-2 != (param0 ^ -1)) {
                    break L33;
                  } else {
                    var5 = 1;
                    break L33;
                  }
                }
                L34: {
                  if (-4 == (param0 ^ -1)) {
                    var4 = -1;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (-5 == (param0 ^ -1)) {
                    var5 = 1;
                    var4 = 1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if ((param0 ^ -1) == -7) {
                    var5 = -1;
                    var4 = 1;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  L39: {
                    if (7 == param0) {
                      break L39;
                    } else {
                      if (8 == param0) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L38;
                }
                L40: {
                  if (11 == param0) {
                    var4 = -1;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if ((param0 ^ -1) != -14) {
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
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L44;
                  } else {
                    break L44;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            } else {
              if (param1 < 77) {
                return;
              } else {
                L45: {
                  var4 = 1;
                  var5 = 0;
                  if (-2 != (param0 ^ -1)) {
                    break L45;
                  } else {
                    var5 = 1;
                    break L45;
                  }
                }
                L46: {
                  if (-4 == (param0 ^ -1)) {
                    var4 = -1;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (-5 == (param0 ^ -1)) {
                    var5 = 1;
                    var4 = 1;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (param0 == 5) {
                    var5 = 1;
                    var4 = -1;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                L49: {
                  if ((param0 ^ -1) == -7) {
                    var5 = -1;
                    var4 = 1;
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  L51: {
                    if (7 == param0) {
                      break L51;
                    } else {
                      if (8 == param0) {
                        break L51;
                      } else {
                        break L50;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L50;
                }
                L52: {
                  if (11 == param0) {
                    var4 = -1;
                    break L52;
                  } else {
                    break L52;
                  }
                }
                L53: {
                  if ((param0 ^ -1) == -13) {
                    var5 = -1;
                    var4 = -1;
                    break L53;
                  } else {
                    break L53;
                  }
                }
                L54: {
                  if ((param0 ^ -1) != -14) {
                    break L54;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L54;
                  }
                }
                L55: {
                  if (param0 != 14) {
                    break L55;
                  } else {
                    var5 = 1;
                    var4 = -1;
                    break L55;
                  }
                }
                L56: {
                  if ((param0 ^ -1) == -16) {
                    var4 = 1;
                    var5 = 1;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                return;
              }
            }
          }
        } else {
          L57: {
            if (-106 >= (var3 ^ -1)) {
              break L57;
            } else {
              var2 = (-40960 + 16384 * var3) / 220;
              if (var6 != 0) {
                break L57;
              } else {
                if (param1 < 77) {
                  return;
                } else {
                  L58: {
                    var4 = 1;
                    var5 = 0;
                    if (-2 != (param0 ^ -1)) {
                      break L58;
                    } else {
                      var5 = 1;
                      break L58;
                    }
                  }
                  L59: {
                    if (-4 == (param0 ^ -1)) {
                      var4 = -1;
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  L60: {
                    if (-5 == (param0 ^ -1)) {
                      var5 = 1;
                      var4 = 1;
                      break L60;
                    } else {
                      break L60;
                    }
                  }
                  L61: {
                    if (param0 == 5) {
                      var5 = 1;
                      var4 = -1;
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  L62: {
                    if ((param0 ^ -1) == -7) {
                      var5 = -1;
                      var4 = 1;
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    L64: {
                      if (7 == param0) {
                        break L64;
                      } else {
                        if (8 == param0) {
                          break L64;
                        } else {
                          break L63;
                        }
                      }
                    }
                    var5 = -1;
                    var4 = -1;
                    break L63;
                  }
                  L65: {
                    if (11 == param0) {
                      var4 = -1;
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  L66: {
                    if ((param0 ^ -1) == -13) {
                      var5 = -1;
                      var4 = -1;
                      break L66;
                    } else {
                      break L66;
                    }
                  }
                  L67: {
                    if ((param0 ^ -1) != -14) {
                      break L67;
                    } else {
                      var4 = 1;
                      var5 = -1;
                      break L67;
                    }
                  }
                  L68: {
                    if (param0 != 14) {
                      break L68;
                    } else {
                      var5 = 1;
                      var4 = -1;
                      break L68;
                    }
                  }
                  L69: {
                    if ((param0 ^ -1) == -16) {
                      var4 = 1;
                      var5 = 1;
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
                  return;
                }
              }
            }
          }
          if (-121 < (var3 ^ -1)) {
            var3 = -var3 + 120;
            var2 = 8192 - var3 * var3 * 8192 / 3300;
            if (param1 < 77) {
              return;
            } else {
              L70: {
                var4 = 1;
                var5 = 0;
                if (-2 != (param0 ^ -1)) {
                  break L70;
                } else {
                  var5 = 1;
                  break L70;
                }
              }
              L71: {
                if (-4 == (param0 ^ -1)) {
                  var4 = -1;
                  break L71;
                } else {
                  break L71;
                }
              }
              L72: {
                if (-5 == (param0 ^ -1)) {
                  var5 = 1;
                  var4 = 1;
                  break L72;
                } else {
                  break L72;
                }
              }
              L73: {
                if (param0 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L73;
                } else {
                  break L73;
                }
              }
              L74: {
                if ((param0 ^ -1) == -7) {
                  var5 = -1;
                  var4 = 1;
                  break L74;
                } else {
                  break L74;
                }
              }
              L75: {
                L76: {
                  if (7 == param0) {
                    break L76;
                  } else {
                    if (8 == param0) {
                      break L76;
                    } else {
                      break L75;
                    }
                  }
                }
                var5 = -1;
                var4 = -1;
                break L75;
              }
              L77: {
                if (11 == param0) {
                  var4 = -1;
                  break L77;
                } else {
                  break L77;
                }
              }
              L78: {
                if ((param0 ^ -1) == -13) {
                  var5 = -1;
                  var4 = -1;
                  break L78;
                } else {
                  break L78;
                }
              }
              L79: {
                if ((param0 ^ -1) != -14) {
                  break L79;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L79;
                }
              }
              L80: {
                if (param0 != 14) {
                  break L80;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L80;
                }
              }
              L81: {
                if ((param0 ^ -1) == -16) {
                  var4 = 1;
                  var5 = 1;
                  break L81;
                } else {
                  break L81;
                }
              }
              ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
              return;
            }
          } else {
            if (param1 < 77) {
              return;
            } else {
              L82: {
                var4 = 1;
                var5 = 0;
                if (-2 != (param0 ^ -1)) {
                  break L82;
                } else {
                  var5 = 1;
                  break L82;
                }
              }
              L83: {
                if (-4 == (param0 ^ -1)) {
                  var4 = -1;
                  break L83;
                } else {
                  break L83;
                }
              }
              L84: {
                if (-5 == (param0 ^ -1)) {
                  var5 = 1;
                  var4 = 1;
                  break L84;
                } else {
                  break L84;
                }
              }
              L85: {
                if (param0 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L85;
                } else {
                  break L85;
                }
              }
              L86: {
                if ((param0 ^ -1) == -7) {
                  var5 = -1;
                  var4 = 1;
                  break L86;
                } else {
                  break L86;
                }
              }
              L87: {
                L88: {
                  if (7 == param0) {
                    break L88;
                  } else {
                    if (8 == param0) {
                      break L88;
                    } else {
                      break L87;
                    }
                  }
                }
                var5 = -1;
                var4 = -1;
                break L87;
              }
              L89: {
                if (11 == param0) {
                  var4 = -1;
                  break L89;
                } else {
                  break L89;
                }
              }
              L90: {
                if ((param0 ^ -1) == -13) {
                  var5 = -1;
                  var4 = -1;
                  break L90;
                } else {
                  break L90;
                }
              }
              L91: {
                if ((param0 ^ -1) != -14) {
                  break L91;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L91;
                }
              }
              L92: {
                if (param0 != 14) {
                  break L92;
                } else {
                  var5 = 1;
                  var4 = -1;
                  break L92;
                }
              }
              L93: {
                if ((param0 ^ -1) == -16) {
                  var4 = 1;
                  var5 = 1;
                  break L93;
                } else {
                  break L93;
                }
              }
              ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
              return;
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 4826) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param1.length() <= var2_int) {
                      break L3;
                    } else {
                      var3 = param1.charAt(var2_int);
                      stackOut_6_0 = uc.a((char) var3, false);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0) {
                            break L4;
                          } else {
                            if (re.a(param0 ^ -4843, (char) var3)) {
                              break L4;
                            } else {
                              stackOut_9_0 = 1;
                              stackIn_10_0 = stackOut_9_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("bg.J(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
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
            this.b((byte) -88, var10);
            var9 = new vg(((ag) ((Object) param4)).a(-121), param6, 126, var10.field_p + param1, param3 + 50, param0);
            var9.field_o = (of) (this);
            this.b((byte) -84, var9);
            stackOut_0_0 = var10.field_p - -var9.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var8);
            stackOut_2_1 = new StringBuilder().append("bg.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0) {
        int discarded$2 = 0;
        String var3 = null;
        if (param0 != 200) {
          var3 = (String) null;
          discarded$2 = this.a(-96, -126, (String) null, 71, (we) null, 63, (String) null);
          ((hh) ((Object) this.field_N.a(-114))).f((byte) -82);
          return;
        } else {
          ((hh) ((Object) this.field_N.a(-114))).f((byte) -82);
          return;
        }
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        try {
            var3 = this.field_N;
            var4 = param0;
            if (param1 >= -50) {
                String var5 = (String) null;
                this.a((String) null, -32);
            }
            ((rj) ((Object) var3)).a(false, -5905, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "bg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public bg() {
        super(0, 0, 496, 0, (ml) null);
        this.field_N = new qc("", (of) null, 12);
        this.field_D = new qc("", (of) null, 100);
        this.field_I = new qc("", (of) null, 100);
        this.field_H = new qc("", (of) null, 20);
        this.field_J = new qc("", (of) null, 20);
        this.field_F = new qc("", (of) null, 3);
        int var1 = 1;
        this.field_O = new em("", (of) null, var1 != 0);
        this.field_z = new t(pl.field_b, (of) null);
        this.field_K = new t(aj.field_d, (of) null);
        this.field_N.field_m = oa.field_E;
        this.field_D.field_m = ad.field_f;
        this.field_I.field_m = rf.field_b;
        this.field_H.field_m = kd.field_d;
        this.field_J.field_m = id.field_h;
        this.field_F.field_m = ri.field_d;
        this.field_O.field_m = a.field_j;
        this.field_N.a(new hh(this.field_N), true);
        this.field_D.a(new uk(this.field_D), true);
        this.field_I.a(new fd(this.field_I, this.field_D), true);
        this.field_H.a(new df(this.field_H, this.field_N, this.field_D), true);
        this.field_J.a(new rd(this.field_J, this.field_H), true);
        this.field_F.a(new th(this.field_F), true);
        this.field_z.field_w = false;
        this.field_z.field_h = (ml) ((Object) new hd());
        this.field_K.field_h = (ml) ((Object) new lc());
        this.field_N.field_h = (ml) ((Object) new mg(10000536));
        mg dupTemp$0 = new mg(10000536);
        this.field_I.field_h = (ml) ((Object) dupTemp$0);
        this.field_D.field_h = (ml) ((Object) dupTemp$0);
        this.field_F.field_h = (ml) ((Object) new mg(10000536));
        this.field_O.field_h = (ml) ((Object) new wi());
        ve dupTemp$1 = new ve(10000536);
        this.field_J.field_h = (ml) ((Object) dupTemp$1);
        this.field_H.field_h = (ml) ((Object) dupTemp$1);
        String var2 = gg.a(new String[]{this.e((byte) -95), this.b(false)}, uk.field_p, true);
        int var3 = 20;
        var3 = var3 + this.a(-107, be.field_e, this.field_D, 170, var3);
        var3 = var3 + (5 + this.a(20, var3, ef.field_a, 170, this.field_I, 3, ""));
        var3 = var3 + this.a(-112, ec.field_c, this.field_H, 170, var3);
        var3 = var3 + (5 + this.a((byte) 98, 170, this.field_J, ce.field_a, var3, jj.field_B));
        var3 = var3 + (5 + this.a((byte) 122, 170, this.field_N, ke.field_e, var3, wj.field_l));
        var3 = var3 + this.a(var3, 93, 170, mg.field_v, this.field_F);
        mh var4 = new mh(46, var3, -90 + this.field_l, 25, this.field_O, true, -120 + this.field_l, 5, pf.field_c, 11579568, je.field_f);
        this.b((byte) -52, var4);
        var3 = var3 + var4.field_p;
        a var5 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 0, 0, t.field_z.field_C, -1, 2147483647, true);
        this.field_C = new jj(var2, var5);
        this.field_C.field_m = "";
        this.field_C.a(false, 0, kg.field_a);
        this.field_C.a(false, 1, kg.field_a);
        this.field_C.field_o = (of) (this);
        this.field_C.c(46, var3, -90 + this.field_l, -1);
        var3 = var3 + (15 + this.field_C.field_p);
        this.b((byte) -127, this.field_C);
        int var6 = 4;
        int var7 = 200;
        this.field_z.a(40, 13361, 496 - var7 >> -1435116703, var7, var3);
        this.field_K.a(40, 13361, var6 - -3, 60, 15 + var3);
        this.field_K.field_o = (of) (this);
        this.field_z.field_o = (of) (this);
        this.b((byte) -33, this.field_z);
        this.b((byte) -27, this.field_K);
        this.field_G = new cm((sh) (this));
        this.field_G.a(150, 13361, this.field_N.field_r + this.field_N.field_l - -60, -60 + (-this.field_N.field_l + -this.field_N.field_r) + this.field_l, this.field_N.field_e + 20);
        this.b((byte) -112, this.field_G);
        this.a(var6 + 55 + var3, 13361, 0, 496, 0);
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        boolean discarded$2 = false;
        RuntimeException var6 = null;
        jj var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                var7 = (jj) null;
                this.a(-82, -126, (jj) null, -55);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 != this.field_K) {
                  break L3;
                } else {
                  wg.f(param3 ^ -8);
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param4 == this.field_z) {
                discarded$2 = this.d((byte) 104);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("bg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        int decompiledRegionSelector0 = 0;
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
              if ((param2 ^ -1) != -99) {
                if (-100 == (param2 ^ -1)) {
                  stackOut_8_0 = this.b(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = this.a((byte) 112, param0);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("bg.V(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
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
            var9 = new mh(20, param0, param2 + 120, 25, param4, false, 120, 3, t.field_z, 16777215, param3);
            this.b((byte) -67, var9);
            var7 = new vh(((ag) ((Object) param4)).a(-107));
            this.b((byte) -82, var7);
            var8 = -12 / ((param1 - -16) / 48);
            var7.a(15, 13361, 3 + var9.field_l + var9.field_r, 15, (-15 + var9.field_p >> 1383622113) + var9.field_e);
            stackOut_0_0 = var9.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("bg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean l(int param0) {
        if (param0 == -2706) {
          if (this.a(-59, this.field_N)) {
            if (this.a(-110, this.field_D)) {
              if (this.a(param0 + 2684, this.field_I)) {
                if (this.a(param0 + 2694, this.field_H)) {
                  if (this.a(param0 + 2819, this.field_J)) {
                    if (!this.a(param0 + 2829, this.field_F)) {
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
        } else {
          return true;
        }
    }

    private final boolean d(byte param0) {
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        if (!this.l(param0 + -2810)) {
          return false;
        } else {
          var2 = -1;
          try {
            L0: {
              var2 = Integer.parseInt(this.field_F.field_s);
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          if (param0 != 104) {
            return false;
          } else {
            return kh.a(this.field_H.field_s, 71, this.field_O.field_u, this.field_N.field_s, var2, (bg) (this), this.field_D.field_s);
          }
        }
    }

    private final String b(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = this.d((byte) -104);
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String e(byte param0) {
        int var2 = -60 / ((param0 - -43) / 45);
        return "<u=2164A2><col=2164A2>";
    }

    final void a(we param0, int param1, int param2, byte param3) {
        if (param3 > -13) {
            return;
        }
        try {
            super.a(param0, param1, param2, (byte) -23);
            this.field_z.field_w = this.l(-2706);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "bg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        field_B = new String[]{"All scores", "My scores", "Best each"};
        field_L = new int[8192];
    }
}
