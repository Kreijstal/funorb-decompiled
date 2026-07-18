/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_a;

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              if (param0 == -126) {
                break L1;
              } else {
                var7 = null;
                ta.a(126, 40, (nf) null, -29, (String) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_68_0 = (byte[]) var3;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 == var5) {
                      var3[var4] = (byte) -128;
                      break L3;
                    } else {
                      if (var5 != 8218) {
                        if (402 != var5) {
                          if (var5 != 8222) {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L3;
                            } else {
                              if (8224 != var5) {
                                if (8225 != var5) {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L3;
                                      } else {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var5 == 381) {
                                              var3[var4] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (8216 != var5) {
                                                if (var5 != 8217) {
                                                  if (var5 != 8220) {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L3;
                                                    } else {
                                                      if (var5 != 8226) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L3;
                                                          } else {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte) -104;
                                                              break L3;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 != 339) {
                                                                      if (var5 != 382) {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L3;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L3;
                                                  }
                                                } else {
                                                  var3[var4] = (byte) -110;
                                                  break L3;
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L3;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L3;
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("ta.A(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    final static void a(int param0, int param1, nf param2, int param3, String param4) {
        try {
            if (param0 <= 94) {
                Object var6 = null;
                byte[] discarded$0 = ta.a((byte) 99, (CharSequence) null);
            }
            param2.d(param1, param3);
            pn.field_a.b(param4, param2.field_t / 2 + param1, 15 + param3, 0, -1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ta.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OK";
    }
}
