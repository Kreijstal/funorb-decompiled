/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa {
    static int field_a;
    static rb field_c;
    static eh field_b;

    final static bo a(ha param0, boolean param1) {
        mq var2 = null;
        bo var3 = null;
        bo stackIn_2_0 = null;
        bo stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            if (ns.field_a != param0) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  fa.a(72);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var2 = (mq) ((Object) ca.field_i.a((byte) 106, (long)param0.field_c));
                  if (var2 == null) {
                    break L3;
                  } else {
                    if (var2.field_f == param0) {
                      var3 = var2.field_j;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    var2.c(-124);
                    break L4;
                  }
                }
                var3 = new bo(param0);
                ca.field_i.a(123, (long)param0.field_c, new mq(param0, var3));
                break L2;
              }
              un.field_f = var3;
              ns.field_a = param0;
              stackIn_13_0 = (bo) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = un.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("fa.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = (eh) null;
        }
        field_b = null;
        field_c = null;
    }

    final static byte[] a(CharSequence param0, int param1) {
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
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 == 8482) {
                break L1;
              } else {
                field_a = -8;
                break L1;
              }
            }
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
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
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte)-124;
                            break L3;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (710 == var5) {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (var5 != 8240) {
                                      if (var5 == 352) {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (8249 == var5) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (381 != var5) {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (8220 == var5) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (339 != var5) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (376 != var5) {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                }
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
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            }
                                          }
                                        }
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
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
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

            stackIn_72_1 = new StringBuilder().append("fa.C(");

            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
        return stackIn_69_0;
    }

    final static java.awt.Canvas a(int param0) {
        if (param0 != -8213) {
            fa.a(false);
        }
        return jf.field_a == null ? ci.field_f : (java.awt.Canvas) ((Object) jf.field_a);
    }

    static {
        field_a = 0;
        field_c = new rb(256);
    }
}
