/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static int field_b;
    static boolean[][] field_g;
    static String field_c;
    static int[][] field_d;
    static int field_f;
    static int field_a;
    static int field_e;

    public static void b(byte param0) {
        Object var2 = null;
        field_c = null;
        field_g = null;
        if (param0 != -119) {
          var2 = null;
          byte[] discarded$2 = pi.a((CharSequence) null, -85);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static void a(byte param0) {
        mf.field_a = id.field_b.b(false);
        CharSequence var2 = (CharSequence) (Object) mf.field_a;
        td.field_i = il.a(var2, (byte) 21);
    }

    final static byte[] a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new byte[var2_int];
              if (param1 == 353) {
                break L1;
              } else {
                pi.b((byte) 125);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_69_0 = (byte[]) var3;
                stackIn_70_0 = stackOut_69_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
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
                        if (var5 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte) -128;
                      break L3;
                    } else {
                      if (var5 == 8218) {
                        var3[var4] = (byte) -126;
                        break L3;
                      } else {
                        if (var5 == 402) {
                          var3[var4] = (byte) -125;
                          break L3;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L3;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L3;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L3;
                              } else {
                                if (var5 == 8225) {
                                  var3[var4] = (byte) -121;
                                  break L3;
                                } else {
                                  if (710 != var5) {
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
                                          if (var5 != 338) {
                                            if (var5 == 381) {
                                              var3[var4] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (var5 != 8216) {
                                                if (8217 == var5) {
                                                  var3[var4] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var5 != 8221) {
                                                      if (var5 != 8226) {
                                                        if (var5 != 8211) {
                                                          if (8212 == var5) {
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
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (339 != var5) {
                                                                      if (var5 != 382) {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
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
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L3;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  var4++;
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
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("pi.C(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L7;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param1 + ')');
        }
        return stackIn_70_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[3][6];
        field_g = new boolean[][]{new boolean[6], new boolean[4], new boolean[7]};
        field_c = null;
        field_a = 638991360;
        field_f = -8;
    }
}
