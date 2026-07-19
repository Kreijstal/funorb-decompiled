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
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        java.applet.Applet var7 = null;
        byte[] stackIn_97_0 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_96_0 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
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
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          var5 = param1.charAt(var4);
                          if (var5 <= 0) {
                            break L7;
                          } else {
                            if (128 > var5) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var5 < 160) {
                          break L5;
                        } else {
                          if (var5 > 255) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3[var4] = (byte)var5;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                    L8: {
                      if (8364 != var5) {
                        break L8;
                      } else {
                        var3[var4] = (byte)-128;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var5 == 8218) {
                        break L9;
                      } else {
                        L10: {
                          if (402 != var5) {
                            break L10;
                          } else {
                            var3[var4] = (byte)-125;
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var5 != 8222) {
                            break L11;
                          } else {
                            var3[var4] = (byte)-124;
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var5 == 8230) {
                            break L12;
                          } else {
                            L13: {
                              if (var5 != 8224) {
                                break L13;
                              } else {
                                var3[var4] = (byte)-122;
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              if (var5 != 8225) {
                                break L14;
                              } else {
                                var3[var4] = (byte)-121;
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              if (var5 == 710) {
                                break L15;
                              } else {
                                L16: {
                                  if (var5 != 8240) {
                                    break L16;
                                  } else {
                                    var3[var4] = (byte)-119;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (352 != var5) {
                                    break L17;
                                  } else {
                                    var3[var4] = (byte)-118;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (var5 == 8249) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (var5 != 338) {
                                        break L19;
                                      } else {
                                        var3[var4] = (byte)-116;
                                        if (var6 == 0) {
                                          break L4;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (var5 == 381) {
                                        break L20;
                                      } else {
                                        L21: {
                                          if (var5 == 8216) {
                                            break L21;
                                          } else {
                                            L22: {
                                              if (var5 == 8217) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  if (var5 == 8220) {
                                                    break L23;
                                                  } else {
                                                    L24: {
                                                      if (var5 == 8221) {
                                                        break L24;
                                                      } else {
                                                        L25: {
                                                          if (8226 != var5) {
                                                            break L25;
                                                          } else {
                                                            var3[var4] = (byte)-107;
                                                            if (var6 == 0) {
                                                              break L4;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        L26: {
                                                          if (var5 == 8211) {
                                                            break L26;
                                                          } else {
                                                            L27: {
                                                              if (var5 != 8212) {
                                                                break L27;
                                                              } else {
                                                                var3[var4] = (byte)-105;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            L28: {
                                                              if (var5 != 732) {
                                                                break L28;
                                                              } else {
                                                                var3[var4] = (byte)-104;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                            L29: {
                                                              if (var5 != 8482) {
                                                                break L29;
                                                              } else {
                                                                var3[var4] = (byte)-103;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            L30: {
                                                              if (var5 != 353) {
                                                                break L30;
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L30;
                                                                }
                                                              }
                                                            }
                                                            L31: {
                                                              if (var5 != 8250) {
                                                                break L31;
                                                              } else {
                                                                var3[var4] = (byte)-101;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            L32: {
                                                              if (var5 == 339) {
                                                                break L32;
                                                              } else {
                                                                L33: {
                                                                  if (382 == var5) {
                                                                    break L33;
                                                                  } else {
                                                                    L34: {
                                                                      if (var5 == 376) {
                                                                        break L34;
                                                                      } else {
                                                                        var3[var4] = (byte)63;
                                                                        if (var6 == 0) {
                                                                          break L4;
                                                                        } else {
                                                                          break L34;
                                                                        }
                                                                      }
                                                                    }
                                                                    var3[var4] = (byte)-97;
                                                                    if (var6 == 0) {
                                                                      break L4;
                                                                    } else {
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                                var3[var4] = (byte)-98;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L32;
                                                                }
                                                              }
                                                            }
                                                            var3[var4] = (byte)-100;
                                                            if (var6 == 0) {
                                                              break L4;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        var3[var4] = (byte)-106;
                                                        if (var6 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    var3[var4] = (byte)-108;
                                                    if (var6 == 0) {
                                                      break L4;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                var3[var4] = (byte)-109;
                                                if (var6 == 0) {
                                                  break L4;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            var3[var4] = (byte)-110;
                                            if (var6 == 0) {
                                              break L4;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        var3[var4] = (byte)-111;
                                        if (var6 == 0) {
                                          break L4;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    var3[var4] = (byte)-114;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var3[var4] = (byte)-117;
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var3[var4] = (byte)-120;
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var3[var4] = (byte)-123;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var3[var4] = (byte)-126;
                    break L4;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_96_0 = (byte[]) (var3);
              stackIn_97_0 = stackOut_96_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var2 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var2);
            stackOut_98_1 = new StringBuilder().append("wb.C(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L35;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L35;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
        return stackIn_97_0;
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
