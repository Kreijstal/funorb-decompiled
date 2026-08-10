/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    int field_e;
    static int field_b;
    static int field_c;
    static String field_d;
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(java.applet.Applet param0, byte param1) {
        me.field_g = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param1 > -29) {
            return;
        }
        try {
            jd.a(var2, var4, param0, 1000, var3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "wb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        java.applet.Applet var7 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 25) {
                break L1;
              } else {
                var7 = (java.applet.Applet) null;
                wb.a((java.applet.Applet) null, (byte) -30);
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (128 > var5) {
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
                    if (8364 != var5) {
                      if (var5 == 8218) {
                        var3[var4] = (byte)-126;
                        break L3;
                      } else {
                        if (402 != var5) {
                          if (var5 != 8222) {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (var5 == 710) {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (var5 != 8240) {
                                      if (352 != var5) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 != 338) {
                                            if (var5 == 381) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (8226 != var5) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 != 353) {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 == var5) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      }
                                    } else {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte)-122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
                      }
                    } else {
                      var3[var4] = (byte)-128;
                      break L3;
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
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("wb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    public static void a(int param0) {
        int var1 = 115 / ((param0 - 17) / 43);
        field_d = null;
    }

    wb(int param0) {
        this.field_e = param0;
    }

    static {
        field_c = 0;
        field_d = "(Including <%0>)";
    }
}
