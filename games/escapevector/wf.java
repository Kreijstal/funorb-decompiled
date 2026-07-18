/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_b;
    static String[] field_c;
    static ed field_e;
    private cn field_a;
    private hg field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
        if (param0) {
            return;
        }
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wf.E(" + param0 + ')');
        }
    }

    final hg a(byte param0, hg param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        hg stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        hg stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null != param1) {
                  break L2;
                } else {
                  var3 = ((wf) this).field_a.field_d.field_d;
                  if (EscapeVector.field_A == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L1;
            }
            if (((wf) this).field_a.field_d == var3) {
              ((wf) this).field_d = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (hg) (Object) stackIn_7_0;
            } else {
              L3: {
                ((wf) this).field_d = var3.field_d;
                if (param0 >= 33) {
                  break L3;
                } else {
                  hg discarded$2 = ((wf) this).a((byte) 25, (hg) null);
                  break L3;
                }
              }
              stackOut_11_0 = (hg) var3;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("wf.F(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final hg c(int param0) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        hg stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        hg stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var2 = ((wf) this).field_a.field_d.field_b;
            if (((wf) this).field_a.field_d == var2) {
              ((wf) this).field_d = null;
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (hg) (Object) stackIn_4_0;
            } else {
              if (param0 == 15) {
                ((wf) this).field_d = var2.field_b;
                stackOut_8_0 = (hg) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (hg) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "wf.G(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == 24787) {
                if (0 < param0) {
                  L1: {
                    var2_int = 1;
                    if (param0 <= 65535) {
                      break L1;
                    } else {
                      var2_int += 16;
                      param0 = param0 >> 16;
                      break L1;
                    }
                  }
                  L2: {
                    if (255 >= param0) {
                      break L2;
                    } else {
                      param0 = param0 >> 8;
                      var2_int += 8;
                      break L2;
                    }
                  }
                  L3: {
                    if (15 < param0) {
                      var2_int += 4;
                      param0 = param0 >> 4;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (3 >= param0) {
                      break L4;
                    } else {
                      var2_int += 2;
                      param0 = param0 >> 2;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0 <= 1) {
                      break L5;
                    } else {
                      param0 = param0 >> 1;
                      var2_int++;
                      break L5;
                    }
                  }
                  stackOut_23_0 = var2_int;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
                } else {
                  L6: {
                    var2_int = 2;
                    if (param0 >= -65536) {
                      break L6;
                    } else {
                      var2_int += 16;
                      param0 = param0 >> 16;
                      break L6;
                    }
                  }
                  L7: {
                    if (-256 > param0) {
                      param0 = param0 >> 8;
                      var2_int += 8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (param0 < -16) {
                      param0 = param0 >> 4;
                      var2_int += 4;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param0 < -4) {
                      param0 = param0 >> 2;
                      var2_int += 2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param0 < -2) {
                      var2_int++;
                      param0 = param0 >> 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  stackOut_43_0 = var2_int;
                  stackIn_44_0 = stackOut_43_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 37;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "wf.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_44_0;
    }

    final hg a(int param0, hg param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        hg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == param1) {
                  break L2;
                } else {
                  var3 = param1;
                  if (EscapeVector.field_A == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = ((wf) this).field_a.field_d.field_b;
              break L1;
            }
            L3: {
              if (param0 == -12818) {
                break L3;
              } else {
                field_e = null;
                break L3;
              }
            }
            if (var3 != ((wf) this).field_a.field_d) {
              ((wf) this).field_d = var3.field_b;
              stackOut_9_0 = (hg) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              ((wf) this).field_d = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (hg) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("wf.H(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final hg a(byte param0) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        hg stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        hg stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 > 35) {
              var2 = ((wf) this).field_d;
              if (((wf) this).field_a.field_d == var2) {
                ((wf) this).field_d = null;
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (hg) (Object) stackIn_7_0;
              } else {
                ((wf) this).field_d = var2.field_d;
                stackOut_8_0 = (hg) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "wf.B(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final hg a(int param0) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hg stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = ((wf) this).field_d;
            if (var2 != ((wf) this).field_a.field_d) {
              if (param0 > 23) {
                ((wf) this).field_d = var2.field_b;
                stackOut_6_0 = (hg) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (hg) (Object) stackIn_5_0;
              }
            } else {
              ((wf) this).field_d = null;
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "wf.D(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final hg b(int param0) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        hg stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        hg stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -31616) {
                break L1;
              } else {
                hg discarded$2 = ((wf) this).a(-5, (hg) null);
                break L1;
              }
            }
            var2 = ((wf) this).field_a.field_d.field_d;
            if (((wf) this).field_a.field_d == var2) {
              ((wf) this).field_d = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (hg) (Object) stackIn_7_0;
            } else {
              ((wf) this).field_d = var2.field_d;
              stackOut_8_0 = (hg) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "wf.A(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    wf(cn param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((wf) this).field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wf.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
