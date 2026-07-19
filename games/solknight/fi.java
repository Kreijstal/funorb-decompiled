/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private long[] field_d;
    private byte[] field_g;
    private long[] field_h;
    private long[] field_b;
    static String field_j;
    static o[] field_a;
    private byte[] field_e;
    private long[] field_i;
    private long[] field_k;
    private int field_f;
    private int field_c;

    final static void a(sd param0, int param1, int param2) {
        o[] discarded$0 = null;
        jd var3 = null;
        try {
            if (param2 != -24045) {
                discarded$0 = fi.b(101);
            }
            var3 = id.field_c;
            var3.e(param1, param2 + -2147459603);
            var3.c(1, 5);
            var3.c(-113, 0);
            var3.a(true, param0.field_o);
            var3.c(50, param0.field_k);
            var3.c(param2 ^ -24018, param0.field_l);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "fi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        uj.a(param4, param5, param2, h.field_d, param6, 2);
        uj.a(param3, param0, (param4 - param3 >> -309134335) + param2, of.field_b, param6 - (param0 + -18 >> 2135951233), 2);
        th.field_H.d((param4 + -param3 >> -277449695) + param2 + -20, -10 + param6);
        uk.field_k.d(-18 + param3 + ((-param3 + param4 >> -1231169183) + param2), param6 - 10);
        if (param1) {
          return;
        } else {
          fi.a(-46);
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void c(int param0) {
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
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_102_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) <= -9) {
              var2 = 0;
              break L1;
            } else {
              this.field_k[var2] = ke.a(tk.a((long)this.field_g[var3 + 7], 255L), ke.a(tk.a((long)this.field_g[6 + var3] << -1358238136, 65280L), ke.a(tk.a((long)this.field_g[5 + var3], 255L) << -1353661168, ke.a(ke.a(tk.a(255L, (long)this.field_g[3 + var3]) << -1446647392, ke.a(ke.a((long)this.field_g[var3] << -795572616, tk.a((long)this.field_g[1 + var3], 255L) << 1743967536), tk.a((long)this.field_g[var3 - -2] << 350230440, 280375465082880L))), tk.a(255L, (long)this.field_g[4 + var3]) << 1456127320))));
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
                        if (-9 >= (var2 ^ -1)) {
                          break L4;
                        } else {
                          this.field_b[var2] = this.field_d[var2];
                          this.field_i[var2] = ke.a(this.field_k[var2], this.field_d[var2]);
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
                        L7: {
                          if ((var2 ^ -1) < -11) {
                            break L7;
                          } else {
                            stackOut_171_0 = 0;
                            stackIn_49_0 = stackOut_171_0;
                            stackIn_172_0 = stackOut_171_0;
                            if (var6 != 0) {
                              break L6;
                            } else {
                              stackOut_172_0 = stackIn_172_0;
                              stackIn_170_0 = stackOut_172_0;
                              var3 = stackIn_170_0;
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if (-9 >= (var3 ^ -1)) {
                                      break L10;
                                    } else {
                                      this.field_h[var3] = 0L;
                                      var4 = 0;
                                      stackOut_129_0 = 56;
                                      stackIn_166_0 = stackOut_129_0;
                                      stackIn_130_0 = stackOut_129_0;
                                      if (var6 != 0) {
                                        break L9;
                                      } else {
                                        stackOut_130_0 = stackIn_130_0;
                                        stackIn_128_0 = stackOut_130_0;
                                        var5 = stackIn_128_0;
                                        L11: while (true) {
                                          L12: {
                                            L13: {
                                              if (-9 >= (var4 ^ -1)) {
                                                break L13;
                                              } else {
                                                this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_b[fi.a(7, var3 + -var4)] >>> var5))]);
                                                var5 -= 8;
                                                var4++;
                                                if (var6 != 0) {
                                                  break L12;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L11;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L12;
                                          }
                                          if (var6 == 0) {
                                            continue L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_167_0 = 0;
                                  stackIn_166_0 = stackOut_167_0;
                                  break L9;
                                }
                                var3 = stackIn_166_0;
                                L14: while (true) {
                                  L15: {
                                    if ((var3 ^ -1) <= -9) {
                                      this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                                      break L15;
                                    } else {
                                      this.field_b[var3] = this.field_h[var3];
                                      var3++;
                                      if (var6 != 0) {
                                        break L15;
                                      } else {
                                        if (var6 == 0) {
                                          continue L14;
                                        } else {
                                          this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  var3 = 0;
                                  L16: while (true) {
                                    L17: {
                                      L18: {
                                        if ((var3 ^ -1) <= -9) {
                                          break L18;
                                        } else {
                                          this.field_h[var3] = this.field_b[var3];
                                          var4 = 0;
                                          stackOut_148_0 = 56;
                                          stackIn_158_0 = stackOut_148_0;
                                          stackIn_149_0 = stackOut_148_0;
                                          if (var6 != 0) {
                                            break L17;
                                          } else {
                                            stackOut_149_0 = stackIn_149_0;
                                            stackIn_147_0 = stackOut_149_0;
                                            var5 = stackIn_147_0;
                                            L19: while (true) {
                                              L20: {
                                                L21: {
                                                  if (8 <= var4) {
                                                    break L21;
                                                  } else {
                                                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_i[fi.a(7, -var4 + var3)] >>> var5))]);
                                                    var5 -= 8;
                                                    var4++;
                                                    if (var6 != 0) {
                                                      break L20;
                                                    } else {
                                                      if (var6 == 0) {
                                                        continue L19;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                }
                                                var3++;
                                                break L20;
                                              }
                                              if (var6 == 0) {
                                                continue L16;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_159_0 = 0;
                                      stackIn_158_0 = stackOut_159_0;
                                      break L17;
                                    }
                                    var3 = stackIn_158_0;
                                    L22: while (true) {
                                      L23: {
                                        if (var3 >= 8) {
                                          var2++;
                                          break L23;
                                        } else {
                                          this.field_i[var3] = this.field_h[var3];
                                          var3++;
                                          if (var6 != 0) {
                                            break L23;
                                          } else {
                                            continue L22;
                                          }
                                        }
                                      }
                                      if (var6 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_48_0 = param0;
                        stackIn_49_0 = stackOut_48_0;
                        break L6;
                      }
                      L24: {
                        if (stackIn_49_0 == 24843) {
                          break L24;
                        } else {
                          field_j = (String) null;
                          break L24;
                        }
                      }
                      var2 = 0;
                      L25: while (true) {
                        if ((var2 ^ -1) > -9) {
                          this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
                          var2++;
                          if (var6 == 0) {
                            continue L25;
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
          L26: while (true) {
            L27: {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                break L27;
              } else {
                this.field_b[var2] = this.field_d[var2];
                this.field_i[var2] = ke.a(this.field_k[var2], this.field_d[var2]);
                var2++;
                if (var6 != 0) {
                  break L27;
                } else {
                  continue L26;
                }
              }
            }
            L28: while (true) {
              L29: {
                L30: {
                  if ((var2 ^ -1) < -11) {
                    break L30;
                  } else {
                    stackOut_65_0 = 0;
                    stackIn_103_0 = stackOut_65_0;
                    stackIn_66_0 = stackOut_65_0;
                    if (var6 != 0) {
                      break L29;
                    } else {
                      var3 = stackIn_66_0;
                      L31: while (true) {
                        L32: {
                          if (-9 >= (var3 ^ -1)) {
                            stackOut_76_0 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            break L32;
                          } else {
                            this.field_h[var3] = 0L;
                            var4 = 0;
                            stackOut_68_0 = 56;
                            stackIn_77_0 = stackOut_68_0;
                            stackIn_69_0 = stackOut_68_0;
                            if (var6 != 0) {
                              break L32;
                            } else {
                              var5 = stackIn_69_0;
                              L33: while (true) {
                                L34: {
                                  if (-9 >= (var4 ^ -1)) {
                                    var3++;
                                    break L34;
                                  } else {
                                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_b[fi.a(7, var3 + -var4)] >>> var5))]);
                                    var5 -= 8;
                                    var4++;
                                    if (var6 != 0) {
                                      break L34;
                                    } else {
                                      continue L33;
                                    }
                                  }
                                }
                                continue L31;
                              }
                            }
                          }
                        }
                        var3 = stackIn_77_0;
                        L35: while (true) {
                          L36: {
                            if ((var3 ^ -1) <= -9) {
                              this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                              break L36;
                            } else {
                              this.field_b[var3] = this.field_h[var3];
                              var3++;
                              if (var6 != 0) {
                                break L36;
                              } else {
                                if (var6 == 0) {
                                  continue L35;
                                } else {
                                  this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                                  break L36;
                                }
                              }
                            }
                          }
                          var3 = 0;
                          L37: while (true) {
                            L38: {
                              L39: {
                                if ((var3 ^ -1) <= -9) {
                                  break L39;
                                } else {
                                  this.field_h[var3] = this.field_b[var3];
                                  var4 = 0;
                                  stackOut_86_0 = 56;
                                  stackIn_95_0 = stackOut_86_0;
                                  stackIn_87_0 = stackOut_86_0;
                                  if (var6 != 0) {
                                    break L38;
                                  } else {
                                    var5 = stackIn_87_0;
                                    L40: while (true) {
                                      L41: {
                                        L42: {
                                          if (8 <= var4) {
                                            break L42;
                                          } else {
                                            this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_i[fi.a(7, -var4 + var3)] >>> var5))]);
                                            var5 -= 8;
                                            var4++;
                                            if (var6 != 0) {
                                              break L41;
                                            } else {
                                              if (var6 == 0) {
                                                continue L40;
                                              } else {
                                                break L42;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L41;
                                      }
                                      if (var6 == 0) {
                                        continue L37;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_94_0 = 0;
                              stackIn_95_0 = stackOut_94_0;
                              break L38;
                            }
                            var3 = stackIn_95_0;
                            L43: while (true) {
                              L44: {
                                if (var3 >= 8) {
                                  var2++;
                                  break L44;
                                } else {
                                  this.field_i[var3] = this.field_h[var3];
                                  var3++;
                                  if (var6 != 0) {
                                    break L44;
                                  } else {
                                    continue L43;
                                  }
                                }
                              }
                              if (var6 == 0) {
                                continue L28;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_102_0 = param0;
                stackIn_103_0 = stackOut_102_0;
                break L29;
              }
              if (stackIn_103_0 == 24843) {
                var2 = 0;
                L45: while (true) {
                  if ((var2 ^ -1) > -9) {
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
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
              } else {
                field_j = (String) null;
                var2 = 0;
                L46: while (true) {
                  if ((var2 ^ -1) > -9) {
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L46;
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

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        if (param0 == -18120) {
            return;
        }
        field_a = (o[]) null;
    }

    final static String a(byte param0) {
        if (param0 != 84) {
            return (String) null;
        }
        if (!(gf.field_Z != ma.field_o)) {
            return lf.field_e;
        }
        return ec.field_j;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-33 >= (var2 ^ -1)) {
            if (param0 >= 95) {
              this.field_f = 0;
              this.field_c = 0;
              this.field_g[0] = (byte) 0;
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) > -9) {
                  this.field_d[var2] = 0L;
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
              fi.a(-125);
              this.field_f = 0;
              this.field_c = 0;
              this.field_g[0] = (byte) 0;
              var2 = 0;
              L2: while (true) {
                if ((var2 ^ -1) > -9) {
                  this.field_d[var2] = 0L;
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
            }
          } else {
            this.field_e[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              var2 = 0;
              L3: while (true) {
                if ((var2 ^ -1) > -9) {
                  this.field_d[var2] = 0L;
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
              if (var3 == 0) {
                continue L0;
              } else {
                if (param0 >= 95) {
                  this.field_f = 0;
                  this.field_c = 0;
                  this.field_g[0] = (byte) 0;
                  var2 = 0;
                  L4: while (true) {
                    if ((var2 ^ -1) > -9) {
                      this.field_d[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L4;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  fi.a(-125);
                  this.field_f = 0;
                  this.field_c = 0;
                  this.field_g[0] = (byte) 0;
                  var2 = 0;
                  L5: while (true) {
                    if ((var2 ^ -1) > -9) {
                      this.field_d[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L5;
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

    final void a(long param0, byte[] param1, int param2) {
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
        int stackIn_16_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -((int)param0 & 7) + 8 & 7;
            var7 = this.field_f & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var11 < 0) {
                      break L4;
                    } else {
                      var12 = var12 + ((255 & (int)var9) + (this.field_e[var11] & 255));
                      this.field_e[var11] = (byte)var12;
                      var9 = var9 >>> 8;
                      var12 = var12 >>> 8;
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
                    if (8L >= param0) {
                      break L3;
                    } else {
                      var8 = 255 & param1[var5_int] << var6 | (param1[var5_int - -1] & 255) >>> 8 - var6;
                      stackOut_7_0 = var8;
                      stackIn_16_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_8_0 < 0) {
                            break L6;
                          } else {
                            if (-257 < (var8 ^ -1)) {
                              L7: {
                                this.field_g[this.field_c] = (byte)qk.a((int) this.field_g[this.field_c], var8 >>> var7);
                                this.field_c = this.field_c + 1;
                                this.field_f = this.field_f + (8 - var7);
                                if (this.field_f != 512) {
                                  break L7;
                                } else {
                                  this.c(24843);
                                  this.field_c = 0;
                                  this.field_f = 0;
                                  break L7;
                                }
                              }
                              this.field_g[this.field_c] = (byte)fi.a(255, var8 << -var7 + 8);
                              var5_int++;
                              this.field_f = this.field_f + var7;
                              param0 = param0 - 8L;
                              if (var13 == 0) {
                                continue L5;
                              } else {
                                break L3;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        throw new RuntimeException("LOGIC ERROR");
                      }
                    }
                  }
                }
                stackOut_15_0 = ((long)param2 < param0 ? -1 : ((long)param2 == param0 ? 0 : 1));
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              L8: {
                L9: {
                  if (stackIn_16_0 >= 0) {
                    break L9;
                  } else {
                    var8 = 255 & param1[var5_int] << var6;
                    this.field_g[this.field_c] = (byte)qk.a((int) this.field_g[this.field_c], var8 >>> var7);
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
                  if ((param0 + (long)var7 ^ -1L) <= -9L) {
                    break L11;
                  } else {
                    this.field_f = (int)((long)this.field_f + param0);
                    if (var13 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  this.field_f = this.field_f + (8 + -var7);
                  this.field_c = this.field_c + 1;
                  param0 = param0 - (long)(8 + -var7);
                  if (512 != this.field_f) {
                    break L12;
                  } else {
                    this.c(24843);
                    this.field_c = 0;
                    this.field_f = 0;
                    break L12;
                  }
                }
                this.field_g[this.field_c] = (byte)fi.a(var8 << -var7 + 8, 255);
                this.field_f = this.field_f + (int)param0;
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var5);
            stackOut_26_1 = new StringBuilder().append("fi.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final static o[] b(int param0) {
        o[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        if (param0 != 255) {
          return (o[]) null;
        } else {
          var1 = new o[nb.field_c];
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (nb.field_c <= var2) {
                  break L2;
                } else {
                  var3 = uj.field_b[var2] * sa.field_l[var2];
                  var13 = jc.field_c[var2];
                  var11 = new int[var3];
                  var9 = var11;
                  var5 = var9;
                  stackOut_3_0 = 0;
                  stackIn_13_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    var6 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        if (var3 <= var6) {
                          var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var11);
                          var2++;
                          break L4;
                        } else {
                          var5[var6] = ig.field_H[fi.a((int) var13[var6], 255)];
                          var6++;
                          if (var7 != 0) {
                            break L4;
                          } else {
                            continue L3;
                          }
                        }
                      }
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = -97;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            og.a((byte) stackIn_13_0);
            return var1;
          }
        }
    }

    fi() {
        this.field_b = new long[8];
        this.field_e = new byte[32];
        this.field_i = new long[8];
        this.field_k = new long[8];
        this.field_g = new byte[64];
        this.field_f = 0;
        this.field_h = new long[8];
        this.field_d = new long[8];
        this.field_c = 0;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        byte[] var9 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_g[this.field_c] = (byte)qk.a((int) this.field_g[this.field_c], 128 >>> fi.a(7, this.field_f));
              this.field_c = this.field_c + 1;
              if (param2 >= 106) {
                break L1;
              } else {
                var9 = (byte[]) null;
                this.a((byte[]) null, 111, (byte) -30);
                break L1;
              }
            }
            L2: {
              if (this.field_c > 32) {
                L3: while (true) {
                  if (64 <= this.field_c) {
                    this.c(24843);
                    this.field_c = 0;
                    break L2;
                  } else {
                    fieldTemp$2 = this.field_c;
                    this.field_c = this.field_c + 1;
                    this.field_g[fieldTemp$2] = (byte) 0;
                    if (var8 != 0) {
                      this.field_c = 0;
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        this.c(24843);
                        this.field_c = 0;
                        break L2;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              L5: {
                L6: {
                  if (this.field_c >= 32) {
                    break L6;
                  } else {
                    fieldTemp$3 = this.field_c;
                    this.field_c = this.field_c + 1;
                    this.field_g[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L5;
                    } else {
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                fk.a(this.field_e, 0, this.field_g, 32, 32);
                this.c(24843);
                break L5;
              }
              var4_int = 0;
              var5 = param1;
              L7: while (true) {
                if ((var4_int ^ -1) <= -9) {
                  break L0;
                } else {
                  var6 = this.field_d[var4_int];
                  param0[var5] = (byte)(int)(var6 >>> -2093644040);
                  param0[1 + var5] = (byte)(int)(var6 >>> -629523920);
                  param0[2 + var5] = (byte)(int)(var6 >>> -1022155480);
                  param0[3 + var5] = (byte)(int)(var6 >>> -1125435552);
                  param0[var5 + 4] = (byte)(int)(var6 >>> -1744101736);
                  param0[5 + var5] = (byte)(int)(var6 >>> 369595344);
                  param0[6 + var5] = (byte)(int)(var6 >>> 298427400);
                  param0[var5 + 7] = (byte)(int)var6;
                  var5 += 8;
                  var4_int++;
                  if (var8 == 0) {
                    continue L7;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("fi.H(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_j = "Unfortunately we are unable to create an account for you at this time.";
    }
}
