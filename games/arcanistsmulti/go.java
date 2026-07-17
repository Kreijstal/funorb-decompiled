/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class go {
    static ll[] field_j;
    static String field_f;
    static String field_h;
    String field_e;
    static dj field_k;
    int field_b;
    static kc field_d;
    static am field_c;
    static int field_i;
    static int field_g;
    static String field_a;

    abstract java.net.Socket b(byte param0) throws IOException;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_k = null;
        field_c = null;
        field_j = null;
    }

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = 62 / ((37 - param0) / 52);
        return new java.net.Socket(((go) this).field_e, ((go) this).field_b);
    }

    final static byte[] a(CharSequence param0, byte param1) {
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
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
                        if (255 >= var5) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte) -128;
                      break L2;
                    } else {
                      if (var5 != 8218) {
                        if (402 != var5) {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (8225 != var5) {
                                  if (var5 == 710) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (8240 == var5) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (8249 != var5) {
                                          if (var5 != 338) {
                                            if (var5 == 381) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 != 8217) {
                                                  if (8220 != var5) {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (8212 == var5) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (var5 != 339) {
                                                                      if (382 == var5) {
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
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
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
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                }
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
            stackOut_68_1 = new StringBuilder().append("go.B(");
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
          throw aa.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + -82 + 41);
        }
        return stackIn_67_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<shad><col=<%0>>OVERLIGHT</col></shad>";
        field_h = "Reading Arcane Book";
        field_c = new am();
        field_g = 0;
        field_a = "Only show game chat from my friends";
    }
}
