/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi implements dja {
    static int field_a;
    static int field_b;

    public final tv[] a(int param0, int param1) {
        byte[] discarded$0 = null;
        if (param0 != 11995) {
            CharSequence var4 = (CharSequence) null;
            discarded$0 = hi.a((CharSequence) null, 67);
        }
        return (tv[]) ((Object) new vpa[param1]);
    }

    final static byte[] a(CharSequence param0, int param1) {
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new byte[var2_int];
              var4 = 0;
              if (param1 >= 66) {
                break L1;
              } else {
                field_b = -83;
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_67_0 = (byte[]) (var3);
                stackIn_68_0 = stackOut_67_0;
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
                      if (160 > var5) {
                        break L6;
                      } else {
                        if (var5 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 == 8218) {
                        var3[var4] = (byte)-126;
                        break L3;
                      } else {
                        if (var5 == 402) {
                          var3[var4] = (byte)-125;
                          break L3;
                        } else {
                          if (8222 != var5) {
                            if (var5 != 8230) {
                              if (8224 != var5) {
                                if (var5 != 8225) {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 != 8249) {
                                          if (var5 == 338) {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var5 == 381) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var5 != 8217) {
                                                  if (var5 != 8220) {
                                                    if (8221 == var5) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (8226 != var5) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (8212 != var5) {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
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
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
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
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte)-122;
                                break L3;
                              }
                            } else {
                              var3[var4] = (byte)-123;
                              break L3;
                            }
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
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
            stackOut_69_0 = (RuntimeException) (var2);
            stackOut_69_1 = new StringBuilder().append("hi.D(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L7;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ')');
        }
        return stackIn_68_0;
    }

    public final tv a(byte param0) {
        int var2 = 118 % ((param0 - -64) / 50);
        return (tv) ((Object) new vpa());
    }

    final static phb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        phb[] var10 = null;
        phb[] var11_ref_phb__ = null;
        int var11 = 0;
        int var12 = 0;
        phb var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        var9 = param1 - (-param5 + -param6);
        var10 = new phb[]{new phb(var9, var9), new phb(param3, var9), new phb(var9, var9), new phb(var9, param3), new phb(64, 64), new phb(var9, param3), new phb(var9, var9), new phb(param3, var9), new phb(var9, var9)};
        var11_ref_phb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_phb__.length <= var12) {
            L1: {
              if (param0 == -972) {
                break L1;
              } else {
                field_a = -15;
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (param1 <= var11) {
                var11 = 0;
                L3: while (true) {
                  if (param1 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param3) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param3 >> -696006687) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param6) {
                                var10[1].field_r[var11 + param3 * (-1 + var9 + -var12)] = param4;
                                var10[3].field_r[var11 * var9 + (-var12 + -1 + var9)] = param4;
                                var10[7].field_r[var11 + param3 * var12] = param4;
                                var10[5].field_r[var11 * var9 - -var12] = param4;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 < param1) {
                            var10[7].field_r[var11 + (-1 + (var9 - var12)) * param3] = param8;
                            var10[5].field_r[-1 - -var9 + (-var12 + var9 * var11)] = param8;
                            var10[1].field_r[param3 * var12 - -var11] = param7;
                            var10[3].field_r[var12 + var9 * var11] = param7;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_r[var12 + var11 * var9] = param7;
                        var10[0].field_r[var12 * var9 - -var11] = param7;
                        if (var12 < -var11 + var9) {
                          var10[2].field_r[var12 - -(var9 * var11)] = param7;
                          var10[6].field_r[var11 + var9 * var12] = param7;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L2;
                  } else {
                    var10[6].field_r[var12 + (-var11 + (var9 - 1)) * var9] = param8;
                    var10[8].field_r[(var9 + (-var11 - 1)) * var9 + var12] = param8;
                    var10[2].field_r[var9 * var12 - var11 - 1 - -var9] = param8;
                    var10[8].field_r[var9 - (1 + var11 - var9 * var12)] = param8;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_phb__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_r.length) {
                var12++;
                continue L0;
              } else {
                var13.field_r[var14] = param2;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    static {
    }
}
