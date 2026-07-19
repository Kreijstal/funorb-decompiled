/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    private int field_b;
    private long[] field_k;
    private long[] field_a;
    private long[] field_i;
    private long[] field_j;
    private byte[] field_e;
    private int field_f;
    static ck field_h;
    private long[] field_d;
    private byte[] field_g;
    static char field_c;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-33 >= (var2 ^ -1)) {
            this.field_e[0] = (byte) 0;
            this.field_b = 0;
            if (param0 == -9) {
              this.field_f = 0;
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) > -9) {
                  this.field_j[var2] = 0L;
                  var2++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            this.field_g[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              if (param0 == -9) {
                this.field_f = 0;
                var2 = 0;
                L2: while (true) {
                  if ((var2 ^ -1) > -9) {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                this.field_e[0] = (byte) 0;
                this.field_b = 0;
                if (param0 == -9) {
                  this.field_f = 0;
                  var2 = 0;
                  L3: while (true) {
                    if ((var2 ^ -1) > -9) {
                      this.field_j[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 == -58) {
            return;
        }
        field_c = '￲';
    }

    final void a(int param0, byte[] param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], 128 >>> eb.a(7, this.field_b));
              this.field_f = this.field_f + 1;
              if ((this.field_f ^ -1) < -33) {
                L2: while (true) {
                  if (this.field_f >= 64) {
                    this.b((byte) 99);
                    this.field_f = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_f;
                    this.field_f = this.field_f + 1;
                    this.field_e[fieldTemp$2] = (byte) 0;
                    if (var8 != 0) {
                      this.field_f = 0;
                      break L1;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        this.b((byte) 99);
                        this.field_f = 0;
                        break L1;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if ((this.field_f ^ -1) <= -33) {
                    break L5;
                  } else {
                    fieldTemp$3 = this.field_f;
                    this.field_f = this.field_f + 1;
                    this.field_e[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L4;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (param2 < -2) {
                  la.a(this.field_g, 0, this.field_e, 32, 32);
                  this.b((byte) 99);
                  break L4;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              var4_int = 0;
              var5 = param0;
              L6: while (true) {
                if (-9 >= (var4_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = this.field_j[var4_int];
                  param1[var5] = (byte)(int)(var6 >>> 1449837624);
                  param1[1 + var5] = (byte)(int)(var6 >>> 1194434160);
                  param1[var5 - -2] = (byte)(int)(var6 >>> 1672497704);
                  param1[3 + var5] = (byte)(int)(var6 >>> -548643744);
                  param1[var5 - -4] = (byte)(int)(var6 >>> -1921042472);
                  param1[5 + var5] = (byte)(int)(var6 >>> 1046807184);
                  param1[var5 - -6] = (byte)(int)(var6 >>> 1050795400);
                  param1[var5 - -7] = (byte)(int)var6;
                  var4_int++;
                  var5 += 8;
                  if (var8 == 0) {
                    continue L6;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("np.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_49_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_171_0 = 0;
        byte stackOut_48_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_158_0 = 0;
        byte stackOut_102_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_94_0 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (-9 >= (var2 ^ -1)) {
              var2 = 0;
              break L1;
            } else {
              this.field_d[var2] = bi.a(bi.a(sd.a(65280L, (long)this.field_e[6 + var3] << 1990143048), bi.a(bi.a(bi.a(bi.a(bi.a((long)this.field_e[var3] << -1192695688, sd.a((long)this.field_e[var3 + 1], 255L) << 1413837040), sd.a(255L, (long)this.field_e[2 + var3]) << -540941784), sd.a(255L, (long)this.field_e[var3 + 3]) << 121436704), sd.a(255L, (long)this.field_e[4 + var3]) << -38668776), sd.a(16711680L, (long)this.field_e[5 + var3] << 1195979920))), sd.a((long)this.field_e[7 + var3], 255L));
              var3 += 8;
              var2++;
              if (var6 != 0) {
                break L1;
              } else {
                if (var6 == 0) {
                  continue L0;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if ((var2 ^ -1) <= -9) {
                          break L4;
                        } else {
                          this.field_i[var2] = this.field_j[var2];
                          this.field_k[var2] = bi.a(this.field_d[var2], this.field_j[var2]);
                          var2++;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2 = 1;
                      break L3;
                    }
                    L5: while (true) {
                      L6: {
                        if (var2 > 10) {
                          stackOut_48_0 = param0;
                          stackIn_49_0 = stackOut_48_0;
                          break L6;
                        } else {
                          stackOut_170_0 = 0;
                          stackIn_49_0 = stackOut_170_0;
                          stackIn_171_0 = stackOut_170_0;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            stackOut_171_0 = stackIn_171_0;
                            stackIn_169_0 = stackOut_171_0;
                            var3 = stackIn_169_0;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (8 <= var3) {
                                    break L9;
                                  } else {
                                    this.field_a[var3] = 0L;
                                    var4 = 0;
                                    stackOut_127_0 = 56;
                                    stackIn_165_0 = stackOut_127_0;
                                    stackIn_128_0 = stackOut_127_0;
                                    if (var6 != 0) {
                                      break L8;
                                    } else {
                                      stackOut_128_0 = stackIn_128_0;
                                      stackIn_126_0 = stackOut_128_0;
                                      var5 = stackIn_126_0;
                                      L10: while (true) {
                                        L11: {
                                          if (var4 >= 8) {
                                            var3++;
                                            break L11;
                                          } else {
                                            this.field_a[var3] = bi.a(this.field_a[var3], ll.field_a[var4][eb.a(255, (int)(this.field_i[eb.a(var3 - var4, 7)] >>> var5))]);
                                            var5 -= 8;
                                            var4++;
                                            if (var6 != 0) {
                                              break L11;
                                            } else {
                                              continue L10;
                                            }
                                          }
                                        }
                                        if (var6 == 0) {
                                          continue L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_166_0 = 0;
                                stackIn_165_0 = stackOut_166_0;
                                break L8;
                              }
                              var3 = stackIn_165_0;
                              L12: while (true) {
                                L13: {
                                  if (8 <= var3) {
                                    this.field_i[0] = bi.a(this.field_i[0], ll.field_b[var2]);
                                    break L13;
                                  } else {
                                    this.field_i[var3] = this.field_a[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L13;
                                    } else {
                                      if (var6 == 0) {
                                        continue L12;
                                      } else {
                                        this.field_i[0] = bi.a(this.field_i[0], ll.field_b[var2]);
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                var3 = 0;
                                L14: while (true) {
                                  L15: {
                                    L16: {
                                      if ((var3 ^ -1) <= -9) {
                                        break L16;
                                      } else {
                                        this.field_a[var3] = this.field_i[var3];
                                        var4 = 0;
                                        stackOut_146_0 = 56;
                                        stackIn_157_0 = stackOut_146_0;
                                        stackIn_147_0 = stackOut_146_0;
                                        if (var6 != 0) {
                                          break L15;
                                        } else {
                                          stackOut_147_0 = stackIn_147_0;
                                          stackIn_145_0 = stackOut_147_0;
                                          var5 = stackIn_145_0;
                                          L17: while (true) {
                                            L18: {
                                              L19: {
                                                if (-9 >= (var4 ^ -1)) {
                                                  break L19;
                                                } else {
                                                  this.field_a[var3] = bi.a(this.field_a[var3], ll.field_a[var4][eb.a((int)(this.field_k[eb.a(7, var3 + -var4)] >>> var5), 255)]);
                                                  var5 -= 8;
                                                  var4++;
                                                  if (var6 != 0) {
                                                    break L18;
                                                  } else {
                                                    if (var6 == 0) {
                                                      continue L17;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                              var3++;
                                              break L18;
                                            }
                                            if (var6 == 0) {
                                              continue L14;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_158_0 = 0;
                                    stackIn_157_0 = stackOut_158_0;
                                    break L15;
                                  }
                                  var3 = stackIn_157_0;
                                  L20: while (true) {
                                    L21: {
                                      L22: {
                                        if (8 <= var3) {
                                          break L22;
                                        } else {
                                          this.field_k[var3] = this.field_a[var3];
                                          var3++;
                                          if (var6 != 0) {
                                            break L21;
                                          } else {
                                            if (var6 == 0) {
                                              continue L20;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                      var2++;
                                      break L21;
                                    }
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L23: {
                        if (stackIn_49_0 == 99) {
                          break L23;
                        } else {
                          discarded$2 = np.a(-88);
                          break L23;
                        }
                      }
                      var2 = 0;
                      L24: while (true) {
                        if (-9 < (var2 ^ -1)) {
                          this.field_j[var2] = bi.a(this.field_j[var2], bi.a(this.field_d[var2], this.field_k[var2]));
                          var2++;
                          if (var6 == 0) {
                            continue L24;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L25: while (true) {
            L26: {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                break L26;
              } else {
                this.field_i[var2] = this.field_j[var2];
                this.field_k[var2] = bi.a(this.field_d[var2], this.field_j[var2]);
                var2++;
                if (var6 != 0) {
                  break L26;
                } else {
                  continue L25;
                }
              }
            }
            L27: while (true) {
              L28: {
                if (var2 > 10) {
                  stackOut_102_0 = param0;
                  stackIn_103_0 = stackOut_102_0;
                  break L28;
                } else {
                  stackOut_65_0 = 0;
                  stackIn_103_0 = stackOut_65_0;
                  stackIn_66_0 = stackOut_65_0;
                  if (var6 != 0) {
                    break L28;
                  } else {
                    var3 = stackIn_66_0;
                    L29: while (true) {
                      L30: {
                        if (8 <= var3) {
                          stackOut_76_0 = 0;
                          stackIn_77_0 = stackOut_76_0;
                          break L30;
                        } else {
                          this.field_a[var3] = 0L;
                          var4 = 0;
                          stackOut_68_0 = 56;
                          stackIn_77_0 = stackOut_68_0;
                          stackIn_69_0 = stackOut_68_0;
                          if (var6 != 0) {
                            break L30;
                          } else {
                            var5 = stackIn_69_0;
                            L31: while (true) {
                              L32: {
                                if (var4 >= 8) {
                                  var3++;
                                  break L32;
                                } else {
                                  this.field_a[var3] = bi.a(this.field_a[var3], ll.field_a[var4][eb.a(255, (int)(this.field_i[eb.a(var3 - var4, 7)] >>> var5))]);
                                  var5 -= 8;
                                  var4++;
                                  if (var6 != 0) {
                                    break L32;
                                  } else {
                                    continue L31;
                                  }
                                }
                              }
                              continue L29;
                            }
                          }
                        }
                      }
                      var3 = stackIn_77_0;
                      L33: while (true) {
                        L34: {
                          if (8 <= var3) {
                            this.field_i[0] = bi.a(this.field_i[0], ll.field_b[var2]);
                            break L34;
                          } else {
                            this.field_i[var3] = this.field_a[var3];
                            var3++;
                            if (var6 != 0) {
                              break L34;
                            } else {
                              continue L33;
                            }
                          }
                        }
                        var3 = 0;
                        L35: while (true) {
                          L36: {
                            L37: {
                              if ((var3 ^ -1) <= -9) {
                                break L37;
                              } else {
                                this.field_a[var3] = this.field_i[var3];
                                var4 = 0;
                                stackOut_86_0 = 56;
                                stackIn_95_0 = stackOut_86_0;
                                stackIn_87_0 = stackOut_86_0;
                                if (var6 != 0) {
                                  break L36;
                                } else {
                                  var5 = stackIn_87_0;
                                  L38: while (true) {
                                    L39: {
                                      L40: {
                                        if (-9 >= (var4 ^ -1)) {
                                          break L40;
                                        } else {
                                          this.field_a[var3] = bi.a(this.field_a[var3], ll.field_a[var4][eb.a((int)(this.field_k[eb.a(7, var3 + -var4)] >>> var5), 255)]);
                                          var5 -= 8;
                                          var4++;
                                          if (var6 != 0) {
                                            break L39;
                                          } else {
                                            if (var6 == 0) {
                                              continue L38;
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                      }
                                      var3++;
                                      break L39;
                                    }
                                    if (var6 == 0) {
                                      continue L35;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_94_0 = 0;
                            stackIn_95_0 = stackOut_94_0;
                            break L36;
                          }
                          var3 = stackIn_95_0;
                          L41: while (true) {
                            L42: {
                              L43: {
                                if (8 <= var3) {
                                  break L43;
                                } else {
                                  this.field_k[var3] = this.field_a[var3];
                                  var3++;
                                  if (var6 != 0) {
                                    break L42;
                                  } else {
                                    if (var6 == 0) {
                                      continue L41;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                              }
                              var2++;
                              break L42;
                            }
                            continue L27;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (stackIn_103_0 == 99) {
                var2 = 0;
                L44: while (true) {
                  if (-9 < (var2 ^ -1)) {
                    this.field_j[var2] = bi.a(this.field_j[var2], bi.a(this.field_d[var2], this.field_k[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L44;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                discarded$3 = np.a(-88);
                var2 = 0;
                L45: while (true) {
                  if (-9 < (var2 ^ -1)) {
                    this.field_j[var2] = bi.a(this.field_j[var2], bi.a(this.field_d[var2], this.field_k[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L45;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != 7) {
          L0: {
            field_c = 'ￃ';
            if (null != gk.field_o) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ii.field_a;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != gk.field_o) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ii.field_a;
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -(7 & (int)param2) & param1;
            var7 = this.field_b & 7;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (0 > var11) {
                      break L4;
                    } else {
                      var12 = var12 + ((255 & this.field_g[var11]) - -((int)var9 & 255));
                      this.field_g[var11] = (byte)var12;
                      var12 = var12 >>> 8;
                      var9 = var9 >>> 8;
                      var11--;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: while (true) {
                    if (-9L <= (param2 ^ -1L)) {
                      break L3;
                    } else {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      stackOut_7_0 = var8;
                      stackIn_17_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_8_0 < 0) {
                            break L6;
                          } else {
                            if (256 <= var8) {
                              break L6;
                            } else {
                              L7: {
                                this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], var8 >>> var7);
                                this.field_f = this.field_f + 1;
                                this.field_b = this.field_b + (-var7 + 8);
                                if (512 == this.field_b) {
                                  this.b((byte) 99);
                                  this.field_b = 0;
                                  this.field_f = 0;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              this.field_e[this.field_f] = (byte)eb.a(var8 << -var7 + 8, 255);
                              param2 = param2 - 8L;
                              this.field_b = this.field_b + var7;
                              var5_int++;
                              if (var13 == 0) {
                                continue L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        throw new RuntimeException("LOGIC ERROR");
                      }
                    }
                  }
                }
                stackOut_16_0 = ((param2 ^ -1L) < -1L ? -1 : ((param2 ^ -1L) == -1L ? 0 : 1));
                stackIn_17_0 = stackOut_16_0;
                break L2;
              }
              L8: {
                L9: {
                  if (stackIn_17_0 >= 0) {
                    break L9;
                  } else {
                    var8 = 255 & param0[var5_int] << var6;
                    this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], var8 >>> var7);
                    if (var13 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var8 = 0;
                break L8;
              }
              L10: {
                L11: {
                  if (param2 + (long)var7 < 8L) {
                    break L11;
                  } else {
                    L12: {
                      this.field_f = this.field_f + 1;
                      this.field_b = this.field_b + (-var7 + 8);
                      param2 = param2 - (long)(-var7 + 8);
                      if (-513 == (this.field_b ^ -1)) {
                        this.b((byte) 99);
                        this.field_b = 0;
                        this.field_f = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    this.field_e[this.field_f] = (byte)eb.a(255, var8 << 8 + -var7);
                    this.field_b = this.field_b + (int)param2;
                    if (var13 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                this.field_b = (int)((long)this.field_b + param2);
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("np.F(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L13;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    np() {
        this.field_b = 0;
        this.field_a = new long[8];
        this.field_i = new long[8];
        this.field_k = new long[8];
        this.field_j = new long[8];
        this.field_f = 0;
        this.field_e = new byte[64];
        this.field_d = new long[8];
        this.field_g = new byte[32];
    }

    static {
        field_h = new ck();
    }
}
