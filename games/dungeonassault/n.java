/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static q field_e;
    static cn field_b;
    static int[] field_f;
    static se field_c;
    static int field_d;
    static String field_a;
    static int[] field_g;

    final static boolean a(byte param0) {
        int var1 = 6 / ((param0 - 54) / 57);
        return qc.field_t;
    }

    public static void a(int param0) {
        if (param0 != 3554) {
          field_b = (cn) null;
          field_b = null;
          field_e = null;
          field_c = null;
          field_f = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_c = null;
          field_f = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final static byte[] a(CharSequence param0, int param1) {
        byte[] stackIn_70_0 = null;
        byte[] stackIn_72_0 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                if (param1 == -14553) {
                  stackIn_72_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_70_0 = (byte[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (-1 <= (var5 ^ -1)) {
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
                        if (var5 > 255) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 == 402) {
                          var3[var4] = (byte)-125;
                          break L2;
                        } else {
                          if (8222 != var5) {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L2;
                            } else {
                              if (var5 != 8224) {
                                if (8225 != var5) {
                                  if (710 == var5) {
                                    var3[var4] = (byte)-120;
                                    break L2;
                                  } else {
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
                                          if (338 == var5) {
                                            var3[var4] = (byte)-116;
                                            break L2;
                                          } else {
                                            if (381 == var5) {
                                              var3[var4] = (byte)-114;
                                              break L2;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8220) {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L2;
                                                    } else {
                                                      if (8226 != var5) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte)-106;
                                                          break L2;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L2;
                                                                  } else {
                                                                    if (339 != var5) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte)63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte)-97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-100;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L2;
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
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-107;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-121;
                                  break L2;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var2);

            stackIn_75_1 = new StringBuilder().append("n.C(");

            if (param0 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L6;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_70_0;
        } else {
          return stackIn_72_0;
        }
    }

    static {
        field_f = new int[4];
        field_a = "<%0> <img=0><img=0><img=0>";
    }
}
