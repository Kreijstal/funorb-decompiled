/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static md field_g;
    static vd field_a;
    static kc field_b;
    static ta field_c;
    ug field_f;
    static float field_h;
    static String field_d;
    private ug field_e;

    final void b(byte param0) {
        ug var2 = null;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                var2 = this.field_f.field_d;
                if (this.field_f != var2) {
                  break L3;
                } else {
                  if (var3 != 0) {
                    break L2;
                  } else {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2.c(param0 + -19943);
              break L2;
            }
            if (var3 == 0) {
              continue L0;
            } else {
              break L1;
            }
          }
          if (param0 != 121) {
            field_b = (kc) null;
            this.field_e = null;
            return;
          } else {
            this.field_e = null;
            return;
          }
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_96_0 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_95_0 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              var4 = 0;
              if (param0 == 3231) {
                break L1;
              } else {
                field_a = (vd) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        var5 = param1.charAt(var4);
                        if (0 >= var5) {
                          break L6;
                        } else {
                          if (128 > var5) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var5 < 160) {
                          break L7;
                        } else {
                          if (var5 <= 255) {
                            break L5;
                          } else {
                            break L7;
                          }
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
                            if (var5 != 402) {
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
                                if (var5 == 8230) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (8224 != var5) {
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
                                    if (var5 == 8225) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (var5 != 710) {
                                          break L15;
                                        } else {
                                          var3[var4] = (byte)-120;
                                          if (var6 == 0) {
                                            break L4;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var5 == 8240) {
                                          break L16;
                                        } else {
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
                                                if (338 == var5) {
                                                  break L19;
                                                } else {
                                                  L20: {
                                                    if (381 != var5) {
                                                      break L20;
                                                    } else {
                                                      var3[var4] = (byte)-114;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (8216 != var5) {
                                                      break L21;
                                                    } else {
                                                      var3[var4] = (byte)-111;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  L22: {
                                                    if (var5 != 8217) {
                                                      break L22;
                                                    } else {
                                                      var3[var4] = (byte)-110;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  L23: {
                                                    if (8220 != var5) {
                                                      break L23;
                                                    } else {
                                                      var3[var4] = (byte)-109;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  L24: {
                                                    if (var5 != 8221) {
                                                      break L24;
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
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
                                                        if (var5 == 732) {
                                                          break L28;
                                                        } else {
                                                          L29: {
                                                            if (var5 == 8482) {
                                                              break L29;
                                                            } else {
                                                              L30: {
                                                                if (353 == var5) {
                                                                  break L30;
                                                                } else {
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
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              var3[var4] = (byte)-102;
                                                              if (var6 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          var3[var4] = (byte)-103;
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
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  var3[var4] = (byte)-106;
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
                                            break L16;
                                          }
                                        }
                                      }
                                      var3[var4] = (byte)-119;
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
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                    var3[var4] = (byte)var5;
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
              stackOut_95_0 = (byte[]) (var3);
              stackIn_96_0 = stackOut_95_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var2 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) (var2);
            stackOut_97_1 = new StringBuilder().append("pj.K(").append(param0).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param1 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L35;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L35;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ')');
        }
        return stackIn_96_0;
    }

    final static void a(int param0, d param1, boolean param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        hb var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = gf.field_c;
            var8 = var7;
            var8.b(param2, param0);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.b(1, -49152);
            var8.c(param1.field_n, 121);
            var8.c(param1.field_m, 88);
            var8.c(param1.field_p, 62);
            var8.a(-803539344, param1.field_o);
            var8.a(-803539344, param1.field_i);
            var8.a(-803539344, param1.field_j);
            var8.a(-803539344, param1.field_l);
            var8.b(param1.field_f.length, -49152);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.field_f.length <= var5) {
                    break L3;
                  } else {
                    var7.a(-803539344, param1.field_f[var5]);
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                discarded$1 = var8.a((byte) -108, var4);
                var8.a(var8.field_h + -var4, (byte) -124);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("pj.E(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(ug param0, byte param1) {
        ug discarded$2 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_c) {
                param0.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_d = this.field_f.field_d;
            param0.field_c = this.field_f;
            param0.field_c.field_d = param0;
            param0.field_d.field_c = param0;
            if (param1 == 13) {
              break L0;
            } else {
              discarded$2 = this.a((byte) -120);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("pj.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final ug c(byte param0) {
        ug var2 = null;
        var2 = this.field_f.field_c;
        if (var2 != this.field_f) {
          var2.c(-19822);
          if (param0 != -66) {
            field_h = -1.0866156816482544f;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final ug d(int param0) {
        ug var2 = null;
        if (param0 == 4011) {
          var2 = this.field_f.field_d;
          if (var2 == this.field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        } else {
          field_c = (ta) null;
          var2 = this.field_f.field_d;
          if (var2 == this.field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        }
    }

    final static vk a(byte param0, byte[] param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vk stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_6_0 = null;
        vk stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param0 > 9) {
                var2 = new vk(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, cb.field_b);
                gb.a(-63);
                stackOut_6_0 = (vk) (var2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (vk) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("pj.N(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vk) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 < 37) {
          field_h = 1.3061877489089966f;
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final int b(int param0) {
        int var2 = 0;
        ug var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = this.field_f.field_d;
        L0: while (true) {
          L1: {
            if (this.field_f == var3) {
              break L1;
            } else {
              var3 = var3.field_d;
              var2++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 61 / ((param0 - 78) / 46);
          return var2;
        }
    }

    final ug a(boolean param0) {
        ug var2 = null;
        var2 = this.field_e;
        if (this.field_f != var2) {
          this.field_e = var2.field_c;
          if (!param0) {
            field_h = -0.11541689187288284f;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final ug d(byte param0) {
        ug var2 = null;
        var2 = this.field_e;
        if (this.field_f == var2) {
          this.field_e = null;
          return null;
        } else {
          if (param0 != 63) {
            return (ug) null;
          } else {
            this.field_e = var2.field_d;
            return var2;
          }
        }
    }

    final ug c(int param0) {
        ug var2 = null;
        var2 = this.field_f.field_c;
        if (var2 != this.field_f) {
          if (param0 != -1) {
            return (ug) null;
          } else {
            this.field_e = var2.field_c;
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 11253) {
          L0: {
            this.field_f = (ug) null;
            if (this.field_f != this.field_f.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_f != this.field_f.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final ug a(byte param0) {
        ug var2 = null;
        if (param0 != -117) {
            pj.a(false, 11);
            var2 = this.field_f.field_d;
            if (!(this.field_f != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_d;
            return var2;
        }
        var2 = this.field_f.field_d;
        if (!(this.field_f != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_d;
        return var2;
    }

    private final void a(int param0, pj param1, ug param2) {
        ug var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -16293) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var4 = this.field_f.field_c;
            this.field_f.field_c = param2.field_c;
            param2.field_c.field_d = this.field_f;
            if (param2 != this.field_f) {
              param2.field_c = param1.field_f.field_c;
              param2.field_c.field_d = param2;
              param1.field_f.field_c = var4;
              var4.field_d = param1.field_f;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref);
            stackOut_6_1 = new StringBuilder().append("pj.I(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(pj param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            this.a(-16293, param0, this.field_f.field_d);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pj.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b(boolean param0) {
        if (!param0) {
            field_d = (String) null;
            return hf.field_b;
        }
        return hf.field_b;
    }

    final static String a(byte param0, CharSequence param1) {
        vk discarded$2 = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = mk.a(sd.a(37, param1), 480);
              if (param0 >= 78) {
                break L1;
              } else {
                var3 = (byte[]) null;
                discarded$2 = pj.a((byte) -73, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) (var2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("pj.Q(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_32_0 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 31645) {
                break L1;
              } else {
                field_b = (kc) null;
                break L1;
              }
            }
            L2: {
              jk.field_B = jk.field_B + 1;
              if (kc.field_d != 0) {
                L3: {
                  var2_int = -116 + qg.field_c;
                  var3 = ab.field_e + -90;
                  var4 = ee.field_F;
                  var5 = 0;
                  if (!param0) {
                    stackOut_7_0 = kg.field_c;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = fg.field_b;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var6 = stackIn_8_0;
                    var7 = 0;
                    if (!param0) {
                      break L5;
                    } else {
                      var8 = 9;
                      L6: while (true) {
                        if ((var8 ^ -1) > -1) {
                          break L5;
                        } else {
                          stackOut_11_0 = 0;
                          stackOut_11_1 = var6 & 1 << var8;
                          stackIn_17_0 = stackOut_11_0;
                          stackIn_17_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (var10 != 0) {
                            break L4;
                          } else {
                            L7: {
                              if (stackIn_12_0 == stackIn_12_1) {
                                var7 += 20;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var8--;
                            if (var10 == 0) {
                              continue L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = var7;
                  stackOut_16_1 = 10;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L4;
                }
                var8 = stackIn_17_0 + stackIn_17_1;
                var9 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (-11 >= (var9 ^ -1)) {
                        break L10;
                      } else {
                        stackOut_19_0 = param0;
                        stackIn_33_0 = stackOut_19_0 ? 1 : 0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var10 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  if (!stackIn_20_0) {
                                    break L14;
                                  } else {
                                    if ((1 << var9 & var6) == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (lf.a(-19864, var2_int, var3, 40, 40, var8, 10)) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                              L15: {
                                if (!param0) {
                                  break L15;
                                } else {
                                  if ((var6 & 1 << var9) != 0) {
                                    break L15;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var8 += 40;
                              if (var10 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                            ee.field_F = var9;
                            var5 = 1;
                            if (var10 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                          var9++;
                          if (var10 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_32_0 = var5;
                    stackIn_33_0 = stackOut_32_0;
                    break L9;
                  }
                  if (stackIn_33_0 == 0) {
                    break L2;
                  } else {
                    if (ee.field_F != var4) {
                      break L2;
                    } else {
                      jk.field_B = 0;
                      ee.field_F = -1;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L16: {
              if ((uk.field_r ^ -1) <= -1) {
                break L16;
              } else {
                if (fj.field_E == null) {
                  break L16;
                } else {
                  if (!fj.field_E.field_j) {
                    break L16;
                  } else {
                    uk.field_r = fj.field_E.field_e;
                    fg.field_b = fg.field_b & (uk.field_r ^ -1);
                    fj.field_E = null;
                    k.field_i = true;
                    kg.field_c = kg.field_c | uk.field_r;
                    break L16;
                  }
                }
              }
            }
            if (!ok.a(false)) {
              L17: while (true) {
                var11 = (vl) ((Object) em.field_C.d(4011));
                if (var11 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  mh.a(var11, param1 + -31645, 4);
                  if (var10 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var10 == 0) {
                      continue L17;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "pj.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, ug param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_c) {
                param1.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_c = this.field_f.field_c;
            param1.field_d = this.field_f;
            param1.field_c.field_d = param1;
            param1.field_d.field_c = param1;
            if (param0 == -8212) {
              break L0;
            } else {
              field_b = (kc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("pj.M(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public pj() {
        this.field_f = new ug();
        this.field_f.field_c = this.field_f;
        this.field_f.field_d = this.field_f;
    }

    static {
        field_b = null;
        field_d = "You have <%0> unread messages!";
    }
}
