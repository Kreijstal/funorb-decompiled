/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rb {
    static int field_a;
    static wb field_b;

    final static void a(byte param0) {
        try {
            if (param0 != -114) {
                field_a = 53;
            }
            if (!(ah.field_b == null)) {
                try {
                    ah.field_b.a(0L, (byte) -127);
                    ah.field_b.a(nf.field_l.field_g, 24, (byte) 118, nf.field_l.field_h);
                } catch (Exception exception) {
                }
            }
            nf.field_l.field_h = nf.field_l.field_h + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ng var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ng) ((Object) kf.field_o.a((byte) -95));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    th.a(65536, param0, var4);
                    var4 = (ng) ((Object) kf.field_o.a(true));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 < -77) {
                  break L2;
                } else {
                  rb.a(-91, -27);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "rb.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        byte stackOut_95_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = param3 - param5;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 >= var6_int) {
                    break L3;
                  } else {
                    var8 = param1.charAt(var7 + param5);
                    stackOut_3_0 = var8;
                    stackIn_96_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0 <= 0) {
                              break L6;
                            } else {
                              if (128 > var8) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var8 < 160) {
                              break L7;
                            } else {
                              if (var8 <= 255) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var8 != 8364) {
                              break L8;
                            } else {
                              param2[var7 + param0] = (byte)-128;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (8218 == var8) {
                              break L9;
                            } else {
                              L10: {
                                if (var8 != 402) {
                                  break L10;
                                } else {
                                  param2[param0 - -var7] = (byte)-125;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var8 != 8222) {
                                  break L11;
                                } else {
                                  param2[var7 + param0] = (byte)-124;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var8 == 8230) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (8224 != var8) {
                                      break L13;
                                    } else {
                                      param2[param0 + var7] = (byte)-122;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var8 != 8225) {
                                      break L14;
                                    } else {
                                      param2[var7 + param0] = (byte)-121;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var8 != 710) {
                                      break L15;
                                    } else {
                                      param2[var7 + param0] = (byte)-120;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  L16: {
                                    if (var8 == 8240) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (var8 == 352) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (8249 == var8) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (var8 != 338) {
                                                  break L19;
                                                } else {
                                                  param2[var7 + param0] = (byte)-116;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              L20: {
                                                if (var8 != 381) {
                                                  break L20;
                                                } else {
                                                  param2[param0 + var7] = (byte)-114;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L21: {
                                                if (var8 == 8216) {
                                                  break L21;
                                                } else {
                                                  L22: {
                                                    if (var8 == 8217) {
                                                      break L22;
                                                    } else {
                                                      L23: {
                                                        if (var8 != 8220) {
                                                          break L23;
                                                        } else {
                                                          param2[var7 + param0] = (byte)-109;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      L24: {
                                                        if (var8 == 8221) {
                                                          break L24;
                                                        } else {
                                                          L25: {
                                                            if (8226 != var8) {
                                                              break L25;
                                                            } else {
                                                              param2[param0 - -var7] = (byte)-107;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          L26: {
                                                            if (var8 != 8211) {
                                                              break L26;
                                                            } else {
                                                              param2[var7 + param0] = (byte)-106;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L27: {
                                                            if (var8 == 8212) {
                                                              break L27;
                                                            } else {
                                                              L28: {
                                                                if (var8 != 732) {
                                                                  break L28;
                                                                } else {
                                                                  param2[param0 + var7] = (byte)-104;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              L29: {
                                                                if (8482 == var8) {
                                                                  break L29;
                                                                } else {
                                                                  L30: {
                                                                    if (353 == var8) {
                                                                      break L30;
                                                                    } else {
                                                                      L31: {
                                                                        if (var8 == 8250) {
                                                                          break L31;
                                                                        } else {
                                                                          L32: {
                                                                            if (var8 == 339) {
                                                                              break L32;
                                                                            } else {
                                                                              L33: {
                                                                                if (var8 == 382) {
                                                                                  break L33;
                                                                                } else {
                                                                                  L34: {
                                                                                    if (var8 == 376) {
                                                                                      break L34;
                                                                                    } else {
                                                                                      param2[var7 + param0] = (byte)63;
                                                                                      if (var9 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L34;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  param2[param0 + var7] = (byte)-97;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param2[var7 + param0] = (byte)-98;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          param2[param0 + var7] = (byte)-100;
                                                                          if (var9 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      param2[param0 - -var7] = (byte)-101;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[var7 + param0] = (byte)-102;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              param2[var7 + param0] = (byte)-103;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          param2[param0 + var7] = (byte)-105;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      param2[var7 + param0] = (byte)-108;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  param2[var7 + param0] = (byte)-110;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              param2[var7 + param0] = (byte)-111;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          param2[var7 + param0] = (byte)-117;
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      param2[param0 + var7] = (byte)-118;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  param2[var7 + param0] = (byte)-119;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              param2[var7 + param0] = (byte)-123;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param2[var7 + param0] = (byte)-126;
                          if (var9 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        param2[param0 - -var7] = (byte)var8;
                        break L4;
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_95_0 = param4;
                stackIn_96_0 = stackOut_95_0;
                break L2;
              }
              if (stackIn_96_0 == -116) {
                stackOut_99_0 = var6_int;
                stackIn_100_0 = stackOut_99_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_97_0 = 29;
                stackIn_98_0 = stackOut_97_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var6 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) (var6);
            stackOut_101_1 = new StringBuilder().append("rb.A(").append(param0).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L35;
            } else {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L35;
            }
          }
          L36: {
            stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
            stackOut_104_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');
            stackIn_106_0 = stackOut_104_0;
            stackIn_106_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param2 == null) {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L36;
            } else {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "{...}";
              stackIn_107_0 = stackOut_105_0;
              stackIn_107_1 = stackOut_105_1;
              stackIn_107_2 = stackOut_105_2;
              break L36;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_98_0;
        } else {
          return stackIn_100_0;
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (nk.field_b == null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param0 >= 0) {
                      if (ll.field_Q != lj.field_z) {
                        break L0;
                      } else {
                        if (ff.field_D.field_h != 0) {
                          break L2;
                        } else {
                          if ((10000L + td.field_b ^ -1L) <= (lk.a(0) ^ -1L)) {
                            break L2;
                          } else {
                            ff.field_D.a(false, param0);
                            if (param1 == -377) {
                              break L1;
                            } else {
                              rb.a(81, (byte) 3);
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      if (ff.field_D.field_h != 0) {
                        break L2;
                      } else {
                        if ((10000L + td.field_b ^ -1L) <= (lk.a(0) ^ -1L)) {
                          break L2;
                        } else {
                          ff.field_D.a(false, param0);
                          if (param1 == -377) {
                            break L1;
                          } else {
                            rb.a(81, (byte) 3);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == -377) {
                    break L1;
                  } else {
                    rb.a(81, (byte) 3);
                    break L1;
                  }
                }
                L3: {
                  if (-1 <= (ff.field_D.field_h ^ -1)) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        nk.field_b.a((byte) 9, ff.field_D.field_g, ff.field_D.field_h, 0);
                        td.field_b = lk.a(0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        pc.a(1);
                        break L5;
                      }
                    }
                    ff.field_D.field_h = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            ff.field_D.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        boolean stackIn_24_0 = false;
        String stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        String stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0 = false;
        String stackOut_31_0 = null;
        int stackOut_34_0 = 0;
        String stackOut_37_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (param0 < -63) {
                  break L1;
                } else {
                  rb.a(-55);
                  break L1;
                }
              }
              L2: {
                if (1 > var3_int) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) >= -13) {
                    L3: {
                      var4 = hj.a((byte) -125, param1);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L4: {
                            if (uf.a(var4.charAt(0), (byte) -96)) {
                              break L4;
                            } else {
                              if (!uf.a(var4.charAt(-1 + var4.length()), (byte) -128)) {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    L7: {
                                      if (param1.length() <= var6) {
                                        break L7;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_23_0 = uf.a((char) var7, (byte) -98);
                                        stackIn_35_0 = stackOut_23_0 ? 1 : 0;
                                        stackIn_24_0 = stackOut_23_0;
                                        if (var8 != 0) {
                                          break L6;
                                        } else {
                                          L8: {
                                            if (!stackIn_24_0) {
                                              var5 = 0;
                                              if (var8 == 0) {
                                                break L8;
                                              } else {
                                                var5++;
                                                break L8;
                                              }
                                            } else {
                                              var5++;
                                              break L8;
                                            }
                                          }
                                          L9: {
                                            if (var5 < 2) {
                                              break L9;
                                            } else {
                                              if (!param2) {
                                                stackOut_31_0 = ng.field_g;
                                                stackIn_32_0 = stackOut_31_0;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_34_0 = -1;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L6;
                                  }
                                  if (stackIn_35_0 > (var5 ^ -1)) {
                                    stackOut_37_0 = kd.field_d;
                                    stackIn_38_0 = stackOut_37_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackOut_19_0 = kd.field_d;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_14_0 = se.field_o;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_9_0 = se.field_o;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = se.field_o;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var3);
            stackOut_39_1 = new StringBuilder().append("rb.D(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0;
                } else {
                  return stackIn_38_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -23) {
            field_b = (wb) null;
        }
        field_b = null;
    }

    static {
    }
}
