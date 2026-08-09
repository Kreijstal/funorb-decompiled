/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends rf {
    static int field_I;
    ua field_F;
    static int field_E;
    static int field_J;
    int field_H;
    byte[] field_G;

    final static boolean a(uc param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 98) {
                break L1;
              } else {
                field_J = 47;
                break L1;
              }
            }
            L2: {
              if ((param0.a(false, 1) ^ -1) != -2) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ma.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final int c(int param0) {
        if (param0 != 0) {
            this.b(true);
        }
        if (!(!this.field_A)) {
            return 0;
        }
        return 100;
    }

    final byte[] b(boolean param0) {
        if (!(!this.field_A)) {
            throw new RuntimeException();
        }
        if (!param0) {
            field_E = -122;
        }
        return this.field_G;
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
        uc var7 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param0 == -32396) {
                break L1;
              } else {
                var7 = (uc) null;
                ma.a((uc) null, (byte) -48);
                break L1;
              }
            }
            var2_int = param1.length();
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
                    if (var5 == 8364) {
                      var3[var4] = (byte)-128;
                      break L3;
                    } else {
                      if (8218 == var5) {
                        var3[var4] = (byte)-126;
                        break L3;
                      } else {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte)-124;
                            break L3;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte)-122;
                                break L3;
                              } else {
                                if (var5 != 8225) {
                                  if (var5 != 710) {
                                    if (8240 != var5) {
                                      if (352 != var5) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (var5 != 8216) {
                                                if (var5 != 8217) {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (8221 != var5) {
                                                      if (var5 != 8226) {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (var5 != 339) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 != 376) {
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
                                                                  } else {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  }
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
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              var3[var4] = (byte)-114;
                                              break L3;
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
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                }
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
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
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("ma.D(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    ma() {
    }

    final static oa a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        oa var7 = null;
        int var8 = 0;
        oa stackIn_4_0 = null;
        oa stackIn_8_0 = null;
        oa stackIn_12_0 = null;
        oa stackIn_18_0 = null;
        oa stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = b.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 < var2_int) {
                stackIn_8_0 = lg.field_j;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = nc.a(14352, param0, (char)param1);
                if (var3.length < 2) {
                  stackIn_12_0 = b.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_21_0 = wf.a(param1 + -46, var3[var3.length - 1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = pj.a(-56, var6);
                      if (var7 != null) {
                        stackIn_18_0 = (oa) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ma.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    static {
        field_I = 0;
    }
}
