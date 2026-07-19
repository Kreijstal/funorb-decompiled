/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends ca {
    String field_gb;
    int field_hb;
    String field_kb;
    static boolean field_ib;
    static String field_jb;
    static int field_fb;

    ld() {
        super(0L, (ca) null);
    }

    public static void g(int param0) {
        if (param0 != 8240) {
            field_jb = (String) null;
        }
        field_jb = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 == -101) {
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackOut_68_0 = (byte[]) (var3);
                  stackIn_69_0 = stackOut_68_0;
                  decompiledRegionSelector0 = 1;
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
                        if (160 > var5) {
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
                            if (var5 != 8222) {
                              if (var5 == 8230) {
                                var3[var4] = (byte)-123;
                                break L2;
                              } else {
                                if (var5 != 8224) {
                                  if (var5 == 8225) {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (var5 != 710) {
                                      if (8240 == var5) {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (var5 == 352) {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var5 == 8249) {
                                            var3[var4] = (byte)-117;
                                            break L2;
                                          } else {
                                            if (var5 != 338) {
                                              if (var5 == 381) {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var5 == 8216) {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (8217 == var5) {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8220) {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    } else {
                                                      if (var5 != 8221) {
                                                        if (var5 == 8226) {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        } else {
                                                          if (8211 != var5) {
                                                            if (var5 != 8212) {
                                                              if (var5 != 732) {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (353 == var5) {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 != 8250) {
                                                                      if (var5 == 339) {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (376 == var5) {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                }
                              }
                            } else {
                              var3[var4] = (byte)-124;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-125;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte)-126;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte)-128;
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
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) (var2);
            stackOut_70_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_69_0;
        }
    }

    static {
        field_jb = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
