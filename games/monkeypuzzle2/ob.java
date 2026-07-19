/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fb {
    gk field_o;
    int field_p;
    static pj field_s;
    byte field_q;
    static int field_r;

    public static void f(int param0) {
        if (param0 != 8364) {
            field_s = (pj) null;
        }
        field_s = null;
    }

    final static void b(byte param0) {
        if (null != tj.field_d) {
          if (!tj.field_d.h()) {
            return;
          } else {
            L0: {
              if (param0 == -19) {
                break L0;
              } else {
                ob.f(119);
                break L0;
              }
            }
            tj.field_d = li.a(ke.field_h[7], 100, 96);
            na.a((byte) 85, tj.field_d);
            return;
          }
        } else {
          L1: {
            if (param0 == -19) {
              break L1;
            } else {
              ob.f(119);
              break L1;
            }
          }
          tj.field_d = li.a(ke.field_h[7], 100, 96);
          na.a((byte) 85, tj.field_d);
          return;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -73;
        }
        if (!(null != this.field_o)) {
            return 0;
        }
        return this.field_o.field_h * 100 / (-this.field_q + this.field_o.field_g.length);
    }

    ob() {
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int stackIn_6_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_97_0 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param5 + -param3;
              if (param0 < -71) {
                break L1;
              } else {
                var10 = (byte[]) null;
                discarded$1 = ob.a(-46, (CharSequence) null, (byte[]) null, 83, 110, -101);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6_int <= var7) {
                    break L4;
                  } else {
                    var8 = param1.charAt(param3 + var7);
                    stackOut_5_0 = 0;
                    stackIn_98_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (stackIn_6_0 >= var8) {
                              break L7;
                            } else {
                              if (128 > var8) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var8 < 160) {
                              break L8;
                            } else {
                              if (255 >= var8) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var8 != 8364) {
                              break L9;
                            } else {
                              param2[param4 - -var7] = (byte)-128;
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var8 == 8218) {
                              break L10;
                            } else {
                              L11: {
                                if (var8 == 402) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var8 == 8222) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var8 != 8230) {
                                          break L13;
                                        } else {
                                          param2[var7 + param4] = (byte)-123;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      L14: {
                                        if (var8 == 8224) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (8225 != var8) {
                                              break L15;
                                            } else {
                                              param2[param4 + var7] = (byte)-121;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var8 != 710) {
                                              break L16;
                                            } else {
                                              param2[param4 + var7] = (byte)-120;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (8240 != var8) {
                                              break L17;
                                            } else {
                                              param2[param4 - -var7] = (byte)-119;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (352 != var8) {
                                              break L18;
                                            } else {
                                              param2[param4 - -var7] = (byte)-118;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var8 != 8249) {
                                              break L19;
                                            } else {
                                              param2[param4 + var7] = (byte)-117;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            if (338 == var8) {
                                              break L20;
                                            } else {
                                              L21: {
                                                if (var8 != 381) {
                                                  break L21;
                                                } else {
                                                  param2[var7 + param4] = (byte)-114;
                                                  if (var9 == 0) {
                                                    break L5;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (var8 == 8216) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (var8 != 8217) {
                                                      break L23;
                                                    } else {
                                                      param2[var7 + param4] = (byte)-110;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  L24: {
                                                    if (var8 != 8220) {
                                                      break L24;
                                                    } else {
                                                      param2[var7 + param4] = (byte)-109;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                  L25: {
                                                    if (var8 != 8221) {
                                                      break L25;
                                                    } else {
                                                      param2[var7 + param4] = (byte)-108;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  L26: {
                                                    if (var8 != 8226) {
                                                      break L26;
                                                    } else {
                                                      param2[var7 + param4] = (byte)-107;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  L27: {
                                                    if (8211 == var8) {
                                                      break L27;
                                                    } else {
                                                      L28: {
                                                        if (8212 == var8) {
                                                          break L28;
                                                        } else {
                                                          L29: {
                                                            if (var8 != 732) {
                                                              break L29;
                                                            } else {
                                                              param2[param4 + var7] = (byte)-104;
                                                              if (var9 == 0) {
                                                                break L5;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          L30: {
                                                            if (var8 == 8482) {
                                                              break L30;
                                                            } else {
                                                              L31: {
                                                                if (var8 == 353) {
                                                                  break L31;
                                                                } else {
                                                                  L32: {
                                                                    if (var8 == 8250) {
                                                                      break L32;
                                                                    } else {
                                                                      L33: {
                                                                        if (var8 == 339) {
                                                                          break L33;
                                                                        } else {
                                                                          L34: {
                                                                            if (var8 == 382) {
                                                                              break L34;
                                                                            } else {
                                                                              L35: {
                                                                                if (var8 == 376) {
                                                                                  break L35;
                                                                                } else {
                                                                                  param2[var7 + param4] = (byte)63;
                                                                                  if (var9 == 0) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    break L35;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param2[var7 + param4] = (byte)-97;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          param2[param4 - -var7] = (byte)-98;
                                                                          if (var9 == 0) {
                                                                            break L5;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      param2[param4 - -var7] = (byte)-100;
                                                                      if (var9 == 0) {
                                                                        break L5;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[var7 + param4] = (byte)-101;
                                                                  if (var9 == 0) {
                                                                    break L5;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                              param2[param4 + var7] = (byte)-102;
                                                              if (var9 == 0) {
                                                                break L5;
                                                              } else {
                                                                break L30;
                                                              }
                                                            }
                                                          }
                                                          param2[var7 + param4] = (byte)-103;
                                                          if (var9 == 0) {
                                                            break L5;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      param2[var7 + param4] = (byte)-105;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  param2[var7 + param4] = (byte)-106;
                                                  if (var9 == 0) {
                                                    break L5;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              param2[param4 - -var7] = (byte)-111;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          param2[param4 - -var7] = (byte)-116;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      param2[param4 - -var7] = (byte)-122;
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  param2[var7 + param4] = (byte)-124;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              param2[param4 + var7] = (byte)-125;
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2[param4 - -var7] = (byte)-126;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        param2[param4 + var7] = (byte)var8;
                        break L5;
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_97_0 = var6_int;
                stackIn_98_0 = stackOut_97_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var6 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) (var6);
            stackOut_99_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param1 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L36;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L36;
            }
          }
          L37: {
            stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
            stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param2 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L37;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L37;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_98_0;
    }

    final byte[] e(int param0) {
        int var2 = 0;
        if (!this.field_j) {
          if (this.field_o.field_h < -this.field_q + this.field_o.field_g.length) {
            throw new RuntimeException();
          } else {
            var2 = 38 % ((25 - param0) / 41);
            return this.field_o.field_g;
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        field_s = new pj();
        field_r = 0;
    }
}
