/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nr {
    static ru[] field_c;
    static d field_e;
    static int[] field_a;
    static String field_d;
    wk[] field_b;
    static String field_f;

    void a(byte param0, int param1, int param2, int param3, int param4) {
        i.a(((nr) this).field_b, param1, param2, (byte) -47, param4, param3);
        if (param0 != -111) {
            field_a = null;
        }
    }

    final static byte[] a(CharSequence param0, boolean param1) {
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
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
                      var5 = param0.charAt(var4);
                      if (0 >= var5) {
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
                      if (160 > var5) {
                        break L5;
                      } else {
                        if (var5 > 255) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte) -128;
                      break L2;
                    } else {
                      if (8218 != var5) {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (8230 != var5) {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (var5 != 8225) {
                                  if (var5 != 710) {
                                    if (var5 != 8240) {
                                      if (352 != var5) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var5 == 381) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (8226 != var5) {
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
                                                                  if (var5 != 8250) {
                                                                    if (339 == var5) {
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
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
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
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          }
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
                    }
                  }
                  var3[var4] = (byte)var5;
                  var4++;
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
            stackOut_69_1 = new StringBuilder().append("nr.C(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + 0 + 41);
        }
        return stackIn_68_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
    }

    nr(wk[] param0) {
        try {
            ((nr) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "nr.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{15, 20, 30, 40, 100};
        field_d = "All games";
        field_f = "Apply";
    }
}
