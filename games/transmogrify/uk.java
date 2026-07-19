/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends bj {
    int field_hb;
    static boolean field_gb;
    String field_eb;
    String field_fb;

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_98_0 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_97_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 14122) {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var2_int <= var4) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          var5 = param1.charAt(var4);
                          if (0 >= var5) {
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
                            if (var5 <= 255) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (8364 != var5) {
                            break L7;
                          } else {
                            var3[var4] = (byte)-128;
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var5 == 8218) {
                            break L8;
                          } else {
                            L9: {
                              if (402 != var5) {
                                break L9;
                              } else {
                                var3[var4] = (byte)-125;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var5 != 8222) {
                                break L10;
                              } else {
                                var3[var4] = (byte)-124;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var5 == 8230) {
                                break L11;
                              } else {
                                L12: {
                                  if (var5 == 8224) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (var5 == 8225) {
                                        break L13;
                                      } else {
                                        L14: {
                                          if (710 == var5) {
                                            break L14;
                                          } else {
                                            L15: {
                                              if (8240 != var5) {
                                                break L15;
                                              } else {
                                                var3[var4] = (byte)-119;
                                                if (var6 == 0) {
                                                  break L3;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L16: {
                                              if (var5 == 352) {
                                                break L16;
                                              } else {
                                                L17: {
                                                  if (8249 != var5) {
                                                    break L17;
                                                  } else {
                                                    var3[var4] = (byte)-117;
                                                    if (var6 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                }
                                                L18: {
                                                  if (var5 == 338) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      if (381 != var5) {
                                                        break L19;
                                                      } else {
                                                        var3[var4] = (byte)-114;
                                                        if (var6 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    L20: {
                                                      if (8216 == var5) {
                                                        break L20;
                                                      } else {
                                                        L21: {
                                                          if (var5 != 8217) {
                                                            break L21;
                                                          } else {
                                                            var3[var4] = (byte)-110;
                                                            if (var6 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                        L22: {
                                                          if (var5 == 8220) {
                                                            break L22;
                                                          } else {
                                                            L23: {
                                                              if (8221 == var5) {
                                                                break L23;
                                                              } else {
                                                                L24: {
                                                                  if (var5 == 8226) {
                                                                    break L24;
                                                                  } else {
                                                                    L25: {
                                                                      if (var5 == 8211) {
                                                                        break L25;
                                                                      } else {
                                                                        L26: {
                                                                          if (var5 == 8212) {
                                                                            break L26;
                                                                          } else {
                                                                            L27: {
                                                                              if (var5 != 732) {
                                                                                break L27;
                                                                              } else {
                                                                                var3[var4] = (byte)-104;
                                                                                if (var6 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L27;
                                                                                }
                                                                              }
                                                                            }
                                                                            L28: {
                                                                              if (var5 == 8482) {
                                                                                break L28;
                                                                              } else {
                                                                                L29: {
                                                                                  if (var5 != 353) {
                                                                                    break L29;
                                                                                  } else {
                                                                                    var3[var4] = (byte)-102;
                                                                                    if (var6 == 0) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L29;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L30: {
                                                                                  if (var5 != 8250) {
                                                                                    break L30;
                                                                                  } else {
                                                                                    var3[var4] = (byte)-101;
                                                                                    if (var6 == 0) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L30;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L31: {
                                                                                  if (339 != var5) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    var3[var4] = (byte)-100;
                                                                                    if (var6 == 0) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L31;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L32: {
                                                                                  if (var5 == 382) {
                                                                                    break L32;
                                                                                  } else {
                                                                                    L33: {
                                                                                      if (var5 != 376) {
                                                                                        break L33;
                                                                                      } else {
                                                                                        var3[var4] = (byte)-97;
                                                                                        if (var6 == 0) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          break L33;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var3[var4] = (byte)63;
                                                                                    if (var6 == 0) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L32;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var3[var4] = (byte)-98;
                                                                                if (var6 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L28;
                                                                                }
                                                                              }
                                                                            }
                                                                            var3[var4] = (byte)-103;
                                                                            if (var6 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L26;
                                                                            }
                                                                          }
                                                                        }
                                                                        var3[var4] = (byte)-105;
                                                                        if (var6 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L25;
                                                                        }
                                                                      }
                                                                    }
                                                                    var3[var4] = (byte)-106;
                                                                    if (var6 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L24;
                                                                    }
                                                                  }
                                                                }
                                                                var3[var4] = (byte)-107;
                                                                if (var6 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L23;
                                                                }
                                                              }
                                                            }
                                                            var3[var4] = (byte)-108;
                                                            if (var6 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        var3[var4] = (byte)-109;
                                                        if (var6 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    var3[var4] = (byte)-111;
                                                    if (var6 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                var3[var4] = (byte)-116;
                                                if (var6 == 0) {
                                                  break L3;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            var3[var4] = (byte)-118;
                                            if (var6 == 0) {
                                              break L3;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        var3[var4] = (byte)-120;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var3[var4] = (byte)-121;
                                    if (var6 == 0) {
                                      break L3;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                var3[var4] = (byte)-122;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var3[var4] = (byte)-123;
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3[var4] = (byte)-126;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      var3[var4] = (byte)var5;
                      break L3;
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_97_0 = (byte[]) (var3);
                stackIn_98_0 = stackOut_97_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var2 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) (var2);
            stackOut_99_1 = new StringBuilder().append("uk.I(").append(param0).append(',');
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
              break L34;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L34;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_98_0;
        }
    }

    final static long b(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long stackIn_25_0 = 0L;
        long stackIn_28_0 = 0L;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_24_0 = 0L;
        long stackOut_27_0 = 0L;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var5 >= var4) {
                      break L4;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      var9 = var6 ^ -1;
                      var8 = -66;
                      if (var7 != 0) {
                        if (var8 > var9) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          L6: {
                            if (var8 < var9) {
                              break L6;
                            } else {
                              if (var6 > 90) {
                                break L6;
                              } else {
                                var2_long = var2_long + (long)(1 + (var6 + -65));
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (var6 < 97) {
                              break L7;
                            } else {
                              if (var6 > 122) {
                                break L7;
                              } else {
                                var2_long = var2_long + (long)(1 + var6 + -97);
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (48 > var6) {
                            break L5;
                          } else {
                            if (var6 <= 57) {
                              var2_long = var2_long + (long)(var6 + -21);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (177917621779460413L <= var2_long) {
                          break L4;
                        } else {
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (param0 > 72) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_gb = true;
                break L2;
              }
              L8: while (true) {
                L9: {
                  L10: {
                    if ((var2_long % 37L ^ -1L) != -1L) {
                      break L10;
                    } else {
                      stackOut_24_0 = -1L;
                      stackIn_28_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (var7 != 0) {
                        break L9;
                      } else {
                        if (stackIn_25_0 == (var2_long ^ -1L)) {
                          break L10;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_27_0 = var2_long;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("uk.H(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_28_0;
    }

    uk() {
        super(0L, (bj) null);
    }

    static {
        field_gb = false;
    }
}
