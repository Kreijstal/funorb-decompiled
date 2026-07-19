/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qo extends qa {
    static String field_s;
    static int[] field_r;
    static th field_q;
    static int field_u;
    static String field_t;

    final static byte[] a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new byte[var2_int];
              if (param1 == -116) {
                break L1;
              } else {
                field_q = (th) null;
                break L1;
              }
            }
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
                          var5 = param0.charAt(var4);
                          if (var5 <= 0) {
                            break L7;
                          } else {
                            if (var5 < 128) {
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
                      if (var5 != 8364) {
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
                          if (var5 == 8222) {
                            break L11;
                          } else {
                            L12: {
                              if (8230 == var5) {
                                break L12;
                              } else {
                                L13: {
                                  if (var5 == 8224) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (var5 == 8225) {
                                        break L14;
                                      } else {
                                        L15: {
                                          if (710 == var5) {
                                            break L15;
                                          } else {
                                            L16: {
                                              if (8240 != var5) {
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
                                              if (var5 != 352) {
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
                                                  if (var5 == 338) {
                                                    break L19;
                                                  } else {
                                                    L20: {
                                                      if (var5 == 381) {
                                                        break L20;
                                                      } else {
                                                        L21: {
                                                          if (8216 == var5) {
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
                                                                          if (var5 == 8226) {
                                                                            break L25;
                                                                          } else {
                                                                            L26: {
                                                                              if (8211 == var5) {
                                                                                break L26;
                                                                              } else {
                                                                                L27: {
                                                                                  if (8212 == var5) {
                                                                                    break L27;
                                                                                  } else {
                                                                                    L28: {
                                                                                      if (var5 == 732) {
                                                                                        break L28;
                                                                                      } else {
                                                                                        L29: {
                                                                                          if (8482 != var5) {
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
                                                                                          if (8250 != var5) {
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
                                                                                              if (var5 == 382) {
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
                                                                                          break L28;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var3[var4] = (byte)-104;
                                                                                    if (var6 == 0) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      break L27;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var3[var4] = (byte)-105;
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
                                                                              break L25;
                                                                            }
                                                                          }
                                                                        }
                                                                        var3[var4] = (byte)-107;
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
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                var3[var4] = (byte)-116;
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
                                          break L14;
                                        }
                                      }
                                    }
                                    var3[var4] = (byte)-121;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var3[var4] = (byte)-122;
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
                              break L11;
                            }
                          }
                        }
                        var3[var4] = (byte)-124;
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
            stackOut_98_1 = new StringBuilder().append("qo.MA(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param1 + ')');
        }
        return stackIn_97_0;
    }

    final static void b(boolean param0, int param1) {
        ga var2 = null;
        var2 = ma.field_a;
        var2.b((byte) -35, param1);
        var2.a(-50, 1);
        var2.a(123, 2);
        if (!param0) {
          qo.b(true, -60);
          return;
        } else {
          return;
        }
    }

    qo() {
    }

    public static void b(boolean param0) {
        field_q = null;
        field_r = null;
        if (param0) {
            return;
        }
        field_t = null;
        field_s = null;
    }

    static {
        field_s = "Log in";
        field_u = 0;
        field_q = new th();
        field_t = "Menu";
    }
}
