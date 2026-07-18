/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends rm {
    static go field_I;
    static double field_L;
    static String field_J;
    static qi field_G;
    static ah field_H;
    static oa field_K;

    private sj(String param0, tb param1) {
        this(param0, pc.field_b.field_p, param1);
        try {
            ((sj) this).field_l = pc.field_b.field_f;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        ((sj) this).field_B = !((sj) this).field_B ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(boolean param0, String param1, float param2, int param3) {
        try {
            if (!(null != be.field_l)) {
                be.field_l = new ra(ka.field_b, nl.field_c);
                ka.field_b.a((n) (Object) be.field_l, false);
            }
            be.field_l.a(param2, -84, param0, param1);
            tc.c();
            gb.a(0, true);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + -115 + ')');
        }
    }

    private sj(String param0, dh param1, tb param2) {
        super(param0, param1, param2);
        try {
            ((sj) this).field_l = pc.field_b.field_f;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new byte[var2_int];
            bc.a(param0, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sj.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -69 + ')');
        }
        return stackIn_1_0;
    }

    sj(String param0, tb param1, boolean param2) {
        this(param0, param1);
        try {
            ((sj) this).field_B = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            L2: {
              var4 = HoldTheLine.field_D;
              var3 = 96 % ((66 - param0) / 37);
              if (0 >= param1) {
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
            if (param1 == 8364) {
              var2 = -128;
              break L0;
            } else {
              if (8218 != param1) {
                if (402 == param1) {
                  var2 = -125;
                  break L0;
                } else {
                  if (8222 == param1) {
                    var2 = -124;
                    break L0;
                  } else {
                    if (param1 != 8230) {
                      if (param1 == 8224) {
                        var2 = -122;
                        break L0;
                      } else {
                        if (param1 != 8225) {
                          if (param1 == 710) {
                            var2 = -120;
                            break L0;
                          } else {
                            if (param1 != 8240) {
                              if (param1 != 352) {
                                if (param1 != 8249) {
                                  if (param1 == 338) {
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
                                        if (8217 == param1) {
                                          var2 = -110;
                                          break L0;
                                        } else {
                                          if (param1 == 8220) {
                                            var2 = -109;
                                            break L0;
                                          } else {
                                            if (8221 == param1) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param1 != 8226) {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8212) {
                                                    if (param1 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                        break L0;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                          break L0;
                                                        } else {
                                                          if (param1 != 8250) {
                                                            if (param1 != 339) {
                                                              if (382 != param1) {
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
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L0;
                                }
                              } else {
                                var2 = -118;
                                break L0;
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          }
                        } else {
                          var2 = -121;
                          break L0;
                        }
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  }
                }
              } else {
                var2 = -126;
                break L0;
              }
            }
          }
          var2 = (byte)param1;
          break L0;
        }
        return (byte) var2;
    }

    final static tn a(int param0, int param1) {
        tn var2 = new tn(1, false);
        return var2;
    }

    public static void a(byte param0) {
        field_J = null;
        field_H = null;
        field_K = null;
        field_G = null;
        field_I = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_66_0 = (byte[]) var3;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        if (var5 < 128) {
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
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 == 402) {
                          var3[var4] = (byte) -125;
                          break L2;
                        } else {
                          if (var5 != 8222) {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 != 8224) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (710 == var5) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 != 352) {
                                        if (8249 != var5) {
                                          if (var5 != 338) {
                                            if (381 == var5) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8220) {
                                                    if (8221 != var5) {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (8211 != var5) {
                                                          if (8212 == var5) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 8482) {
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (382 != var5) {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
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
                                    }
                                  }
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L2;
                          }
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
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("sj.D(").append(-103).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
        }
        return stackIn_67_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_L = Math.atan2(1.0, 0.0);
    }
}
