/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vi implements ib {
    static int field_V;
    static e field_M;
    private ga field_S;
    private int field_T;
    static String field_U;

    final void a(ga param0, int param1) {
        if (param1 <= 21) {
            return;
        }
        try {
            ((oc) this).field_S = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "oc.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void g() {
        vh var1 = (vh) (Object) le.field_a.a((byte) 38);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        ul.a(var1.field_o, var1.field_p, var1.field_f);
        ul.e(var1.field_m, var1.field_l, var1.field_t, var1.field_g);
        var1.field_o = null;
        ml.field_f.a(-128, (ca) (Object) var1);
    }

    final static int a(int param0, int param1, vg param2, gj param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.field_l == null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param2.field_g != param3.field_o) {
                      break L1;
                    } else {
                      var4_int = param2.field_o.length;
                      var5 = param3.field_l[param0].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          L3: {
                            if (~param3.field_p[param0][var6] == ~param2.field_h) {
                              if (fc.a((byte) -16, param3.field_i[param0][var6])) {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackOut_19_0 = var6;
                                    stackIn_20_0 = stackOut_19_0;
                                    return stackIn_20_0;
                                  } else {
                                    if (param3.field_l[param0][var6 * var4_int - -var7] == param2.field_o[var7]) {
                                      var7++;
                                      continue L4;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            } else {
                              break L3;
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("oc.QA(").append(param0).append(',').append(-1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -103) {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 > 255) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 != 8364) {
                if (param1 == 8218) {
                  var2 = -126;
                  break L0;
                } else {
                  if (param1 != 402) {
                    if (8222 != param1) {
                      if (8230 == param1) {
                        var2 = -123;
                        break L0;
                      } else {
                        if (param1 != 8224) {
                          if (param1 == 8225) {
                            var2 = -121;
                            break L0;
                          } else {
                            if (710 != param1) {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  break L0;
                                } else {
                                  if (param1 != 8249) {
                                    if (338 == param1) {
                                      var2 = -116;
                                      break L0;
                                    } else {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        break L0;
                                      } else {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                          break L0;
                                        } else {
                                          if (8217 != param1) {
                                            if (8220 != param1) {
                                              if (param1 == 8221) {
                                                var2 = -108;
                                                break L0;
                                              } else {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8211) {
                                                    if (param1 == 8212) {
                                                      var2 = -105;
                                                      break L0;
                                                    } else {
                                                      if (732 != param1) {
                                                        if (param1 != 8482) {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                            break L0;
                                                          } else {
                                                            if (8250 == param1) {
                                                              var2 = -101;
                                                              break L0;
                                                            } else {
                                                              if (param1 != 339) {
                                                                if (param1 != 382) {
                                                                  if (param1 != 376) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L0;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -109;
                                              break L0;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -119;
                                break L0;
                              }
                            } else {
                              var2 = -120;
                              break L0;
                            }
                          }
                        } else {
                          var2 = -122;
                          break L0;
                        }
                      }
                    } else {
                      var2 = -124;
                      break L0;
                    }
                  } else {
                    var2 = -125;
                    break L0;
                  }
                }
              } else {
                var2 = -128;
                break L0;
              }
            }
            var2 = (byte)param1;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) 79;
        }
    }

    public final ga a(byte param0) {
        int var2 = -126 % ((-54 - param0) / 41);
        return ((oc) this).field_S;
    }

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param0) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                var6 = fe.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_16_0 = 0;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2_ref, "oc.KA(" + param0 + ',' + 0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void c(byte param0) {
        if (param0 > -120) {
            byte discarded$0 = oc.a(93, '￭');
        }
        super.c((byte) -127);
        if (!(((oc) this).field_S == null)) {
            ((oc) this).field_S.b(-20959);
        }
    }

    final String g(int param0) {
        if (param0 != -8235) {
            String discarded$0 = ((oc) this).g(83);
        }
        if (!((oc) this).field_t) {
            return null;
        }
        if (null == ((oc) this).field_i) {
            return null;
        }
        dm.a(1, ((oc) this).field_m - ((oc) this).field_T + ua.field_a, vl.field_d);
        return ((oc) this).field_i;
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((oc) this).field_T = ua.field_a - (((oc) this).field_s + param2);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "oc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    oc(String param0, ag param1, int param2) {
        super(param0, param1, param2);
    }

    public static void q() {
        field_U = null;
        field_M = null;
    }

    final static byte[] a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_67_0 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_67_0 = (byte[]) var3;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (0 >= var5) {
                        break L4;
                      } else {
                        if (128 > var5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var5 < 160) {
                        break L5;
                      } else {
                        if (var5 > 255) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 != 8230) {
                              if (var5 != 8224) {
                                if (8225 != var5) {
                                  if (var5 != 710) {
                                    if (var5 != 8240) {
                                      if (var5 != 352) {
                                        if (var5 != 8249) {
                                          if (var5 != 338) {
                                            if (381 == var5) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 != 8217) {
                                                  if (var5 != 8220) {
                                                    if (var5 != 8221) {
                                                      if (var5 != 8226) {
                                                        if (var5 != 8211) {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (var5 != 8250) {
                                                                    if (var5 != 339) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            } else {
                              var3[var4] = (byte) -123;
                              break L2;
                            }
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L2;
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L2;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var2;
            stackOut_69_1 = new StringBuilder().append("oc.MA(").append(true).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L6;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ')');
        }
        return stackIn_68_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new e();
        field_U = "(Including <%0>)";
    }
}
