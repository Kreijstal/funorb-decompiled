/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa {
    static int field_a;
    static rb field_c;
    static eh field_b;

    final static bo a(ha param0, boolean param1) {
        mq var2 = null;
        RuntimeException var2_ref = null;
        bo var3 = null;
        bo stackIn_2_0 = null;
        bo stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        bo stackOut_10_0 = null;
        bo stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (ns.field_a != param0) {
              L1: {
                L2: {
                  var2 = (mq) (Object) ca.field_i.a((byte) 106, (long)param0.field_c);
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (var2.field_f == param0) {
                      var3 = var2.field_j;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.c(-124);
                    break L3;
                  }
                }
                var3 = new bo(param0);
                ca.field_i.a(123, (long)param0.field_c, (wf) (Object) new mq(param0, var3));
                break L1;
              }
              un.field_f = var3;
              ns.field_a = param0;
              stackOut_10_0 = (bo) var3;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = un.field_f;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("fa.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 1 + 41);
        }
        return stackIn_11_0;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
    }

    final static byte[] a(CharSequence param0, int param1) {
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
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
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
                      var5 = param0.charAt(var4);
                      if (var5 <= 0) {
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
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
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
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (710 == var5) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var5 != 8240) {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (8249 == var5) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (381 != var5) {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 == var5) {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  } else {
                                                                    if (339 != var5) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (376 != var5) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  }
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
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
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
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("fa.C(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + 8482 + 41);
        }
        return stackIn_67_0;
    }

    final static java.awt.Canvas a(int param0) {
        if (param0 != -8213) {
            fa.a(false);
        }
        return jf.field_a == null ? ci.field_f : (java.awt.Canvas) (Object) jf.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = new rb(256);
    }
}
