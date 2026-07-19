/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int[] field_k;
    private long[] field_b;
    private int field_c;
    private byte[] field_e;
    private byte[] field_m;
    private long[] field_a;
    private long[] field_j;
    static String field_g;
    private long[] field_d;
    private long[] field_h;
    static String field_i;
    private int field_f;
    static ri field_l;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (32 <= var2) {
            this.field_c = 0;
            this.field_m[0] = (byte) 0;
            if (param0 != 32) {
              var4 = (byte[]) null;
              this.a((byte[]) null, 76, -115);
              this.field_f = 0;
              var2 = 0;
              L1: while (true) {
                if (-9 < (var2 ^ -1)) {
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
              this.field_f = 0;
              var2 = 0;
              L2: while (true) {
                if (-9 < (var2 ^ -1)) {
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
            }
          } else {
            this.field_e[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              if (param0 == 32) {
                this.field_f = 0;
                var2 = 0;
                L3: while (true) {
                  if (-9 < (var2 ^ -1)) {
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
                var4 = (byte[]) null;
                this.a((byte[]) null, 76, -115);
                this.field_f = 0;
                var2 = 0;
                L4: while (true) {
                  if (-9 < (var2 ^ -1)) {
                    this.field_j[var2] = 0L;
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
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                this.field_c = 0;
                this.field_m[0] = (byte) 0;
                if (param0 != 32) {
                  var4 = (byte[]) null;
                  this.a((byte[]) null, 76, -115);
                  this.field_f = 0;
                  var2 = 0;
                  L5: while (true) {
                    if (-9 < (var2 ^ -1)) {
                      this.field_j[var2] = 0L;
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
                } else {
                  this.field_f = 0;
                  var2 = 0;
                  L6: while (true) {
                    if (-9 < (var2 ^ -1)) {
                      this.field_j[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L6;
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

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        dm var9 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], 128 >>> tq.b(this.field_f, 7));
              this.field_c = this.field_c + 1;
              if (this.field_c > 32) {
                L2: while (true) {
                  L3: {
                    L4: {
                      if ((this.field_c ^ -1) <= -65) {
                        break L4;
                      } else {
                        fieldTemp$2 = this.field_c;
                        this.field_c = this.field_c + 1;
                        this.field_m[fieldTemp$2] = (byte) 0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a(param1 + -3);
                    break L3;
                  }
                  this.field_c = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  if ((this.field_c ^ -1) <= -33) {
                    break L7;
                  } else {
                    fieldTemp$3 = this.field_c;
                    this.field_c = this.field_c + 1;
                    this.field_m[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L6;
                    } else {
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                d.a(this.field_e, 0, this.field_m, 32, 32);
                this.a(-2);
                break L6;
              }
              L8: {
                var4_int = 0;
                if (param1 == 1) {
                  break L8;
                } else {
                  var9 = (dm) null;
                  wl.a(-29, (tq) null, -43, 102, (byte) 41, -126, (dm) null);
                  break L8;
                }
              }
              var5 = param2;
              L9: while (true) {
                if ((var4_int ^ -1) <= -9) {
                  break L0;
                } else {
                  var6 = this.field_j[var4_int];
                  param0[var5] = (byte)(int)(var6 >>> -1166254472);
                  param0[1 + var5] = (byte)(int)(var6 >>> 679474672);
                  param0[2 + var5] = (byte)(int)(var6 >>> 1090002664);
                  param0[var5 + 3] = (byte)(int)(var6 >>> 1434736480);
                  param0[4 + var5] = (byte)(int)(var6 >>> 357681880);
                  param0[5 + var5] = (byte)(int)(var6 >>> -414042864);
                  param0[6 + var5] = (byte)(int)(var6 >>> 1378884168);
                  param0[var5 - -7] = (byte)(int)var6;
                  var5 += 8;
                  var4_int++;
                  if (var8 == 0) {
                    continue L9;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("wl.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_159_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_42_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        if (param0 == -2) {
          var3 = 0;
          L0: while (true) {
            L1: {
              if ((var2 ^ -1) <= -9) {
                var2 = 0;
                break L1;
              } else {
                this.field_h[var2] = tq.a(en.a(255L, (long)this.field_m[7 + var3]), tq.a(en.a(255L, (long)this.field_m[6 + var3]) << -1875600760, tq.a(en.a(255L, (long)this.field_m[var3 - -5]) << -123496432, tq.a(tq.a(tq.a(en.a(280375465082880L, (long)this.field_m[var3 - -2] << 1214363432), tq.a((long)this.field_m[var3] << -1784848840, en.a((long)this.field_m[var3 - -1], 255L) << 389801712)), en.a((long)this.field_m[var3 - -3] << -497941920, 1095216660480L)), en.a((long)this.field_m[var3 + 4] << -1172507688, 4278190080L)))));
                var2++;
                var3 += 8;
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
                          if (8 <= var2) {
                            break L4;
                          } else {
                            this.field_d[var2] = this.field_j[var2];
                            this.field_b[var2] = tq.a(this.field_h[var2], this.field_j[var2]);
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
                            stackOut_106_0 = 0;
                            stackIn_107_0 = stackOut_106_0;
                            break L6;
                          } else {
                            stackOut_69_0 = 0;
                            stackIn_107_0 = stackOut_69_0;
                            stackIn_70_0 = stackOut_69_0;
                            if (var6 != 0) {
                              break L6;
                            } else {
                              var3 = stackIn_70_0;
                              L7: while (true) {
                                L8: {
                                  if (var3 >= 8) {
                                    stackOut_80_0 = 0;
                                    stackIn_81_0 = stackOut_80_0;
                                    break L8;
                                  } else {
                                    this.field_a[var3] = 0L;
                                    var4 = 0;
                                    stackOut_72_0 = 56;
                                    stackIn_81_0 = stackOut_72_0;
                                    stackIn_73_0 = stackOut_72_0;
                                    if (var6 != 0) {
                                      break L8;
                                    } else {
                                      var5 = stackIn_73_0;
                                      L9: while (true) {
                                        L10: {
                                          L11: {
                                            if (-9 >= (var4 ^ -1)) {
                                              break L11;
                                            } else {
                                              this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                                              var4++;
                                              var5 -= 8;
                                              if (var6 != 0) {
                                                break L10;
                                              } else {
                                                if (var6 == 0) {
                                                  continue L9;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                          var3++;
                                          break L10;
                                        }
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var3 = stackIn_81_0;
                                L12: while (true) {
                                  L13: {
                                    if (-9 >= (var3 ^ -1)) {
                                      this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                                      break L13;
                                    } else {
                                      this.field_d[var3] = this.field_a[var3];
                                      var3++;
                                      if (var6 != 0) {
                                        break L13;
                                      } else {
                                        if (var6 == 0) {
                                          continue L12;
                                        } else {
                                          this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  var3 = 0;
                                  L14: while (true) {
                                    L15: {
                                      L16: {
                                        if (-9 >= (var3 ^ -1)) {
                                          break L16;
                                        } else {
                                          this.field_a[var3] = this.field_d[var3];
                                          var4 = 0;
                                          stackOut_90_0 = 56;
                                          stackIn_99_0 = stackOut_90_0;
                                          stackIn_91_0 = stackOut_90_0;
                                          if (var6 != 0) {
                                            break L15;
                                          } else {
                                            var5 = stackIn_91_0;
                                            L17: while (true) {
                                              L18: {
                                                L19: {
                                                  if (-9 >= (var4 ^ -1)) {
                                                    break L19;
                                                  } else {
                                                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
                                                    var4++;
                                                    var5 -= 8;
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
                                      stackOut_98_0 = 0;
                                      stackIn_99_0 = stackOut_98_0;
                                      break L15;
                                    }
                                    var3 = stackIn_99_0;
                                    L20: while (true) {
                                      L21: {
                                        L22: {
                                          if (-9 >= (var3 ^ -1)) {
                                            break L22;
                                          } else {
                                            this.field_b[var3] = this.field_a[var3];
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
                        var2 = stackIn_107_0;
                        L23: while (true) {
                          if (8 > var2) {
                            this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
                            var2++;
                            if (var6 == 0) {
                              continue L23;
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
            L24: while (true) {
              L25: {
                if (8 <= var2) {
                  var2 = 1;
                  break L25;
                } else {
                  this.field_d[var2] = this.field_j[var2];
                  this.field_b[var2] = tq.a(this.field_h[var2], this.field_j[var2]);
                  var2++;
                  if (var6 != 0) {
                    break L25;
                  } else {
                    continue L24;
                  }
                }
              }
              L26: while (true) {
                L27: {
                  if (var2 > 10) {
                    stackOut_158_0 = 0;
                    stackIn_159_0 = stackOut_158_0;
                    break L27;
                  } else {
                    stackOut_121_0 = 0;
                    stackIn_159_0 = stackOut_121_0;
                    stackIn_122_0 = stackOut_121_0;
                    if (var6 != 0) {
                      break L27;
                    } else {
                      var3 = stackIn_122_0;
                      L28: while (true) {
                        L29: {
                          if (var3 >= 8) {
                            stackOut_132_0 = 0;
                            stackIn_133_0 = stackOut_132_0;
                            break L29;
                          } else {
                            this.field_a[var3] = 0L;
                            var4 = 0;
                            stackOut_124_0 = 56;
                            stackIn_133_0 = stackOut_124_0;
                            stackIn_125_0 = stackOut_124_0;
                            if (var6 != 0) {
                              break L29;
                            } else {
                              var5 = stackIn_125_0;
                              L30: while (true) {
                                L31: {
                                  if (-9 >= (var4 ^ -1)) {
                                    var3++;
                                    break L31;
                                  } else {
                                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                                    var4++;
                                    var5 -= 8;
                                    if (var6 != 0) {
                                      break L31;
                                    } else {
                                      continue L30;
                                    }
                                  }
                                }
                                continue L28;
                              }
                            }
                          }
                        }
                        var3 = stackIn_133_0;
                        L32: while (true) {
                          L33: {
                            if (-9 >= (var3 ^ -1)) {
                              this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                              break L33;
                            } else {
                              this.field_d[var3] = this.field_a[var3];
                              var3++;
                              if (var6 != 0) {
                                break L33;
                              } else {
                                continue L32;
                              }
                            }
                          }
                          var3 = 0;
                          L34: while (true) {
                            L35: {
                              L36: {
                                if (-9 >= (var3 ^ -1)) {
                                  break L36;
                                } else {
                                  this.field_a[var3] = this.field_d[var3];
                                  var4 = 0;
                                  stackOut_142_0 = 56;
                                  stackIn_151_0 = stackOut_142_0;
                                  stackIn_143_0 = stackOut_142_0;
                                  if (var6 != 0) {
                                    break L35;
                                  } else {
                                    var5 = stackIn_143_0;
                                    L37: while (true) {
                                      L38: {
                                        L39: {
                                          if (-9 >= (var4 ^ -1)) {
                                            break L39;
                                          } else {
                                            this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L38;
                                            } else {
                                              if (var6 == 0) {
                                                continue L37;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L38;
                                      }
                                      if (var6 == 0) {
                                        continue L34;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_150_0 = 0;
                              stackIn_151_0 = stackOut_150_0;
                              break L35;
                            }
                            var3 = stackIn_151_0;
                            L40: while (true) {
                              L41: {
                                L42: {
                                  if (-9 >= (var3 ^ -1)) {
                                    break L42;
                                  } else {
                                    this.field_b[var3] = this.field_a[var3];
                                    var3++;
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
                                var2++;
                                break L41;
                              }
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var2 = stackIn_159_0;
                L43: while (true) {
                  if (8 > var2) {
                    this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L43;
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
        } else {
          field_l = (ri) null;
          var3 = 0;
          L44: while (true) {
            L45: {
              L46: {
                if ((var2 ^ -1) <= -9) {
                  break L46;
                } else {
                  this.field_h[var2] = tq.a(en.a(255L, (long)this.field_m[7 + var3]), tq.a(en.a(255L, (long)this.field_m[6 + var3]) << -1875600760, tq.a(en.a(255L, (long)this.field_m[var3 - -5]) << -123496432, tq.a(tq.a(tq.a(en.a(280375465082880L, (long)this.field_m[var3 - -2] << 1214363432), tq.a((long)this.field_m[var3] << -1784848840, en.a((long)this.field_m[var3 - -1], 255L) << 389801712)), en.a((long)this.field_m[var3 - -3] << -497941920, 1095216660480L)), en.a((long)this.field_m[var3 + 4] << -1172507688, 4278190080L)))));
                  var2++;
                  var3 += 8;
                  if (var6 != 0) {
                    break L45;
                  } else {
                    if (var6 == 0) {
                      continue L44;
                    } else {
                      break L46;
                    }
                  }
                }
              }
              var2 = 0;
              break L45;
            }
            L47: while (true) {
              L48: {
                L49: {
                  if (8 <= var2) {
                    break L49;
                  } else {
                    this.field_d[var2] = this.field_j[var2];
                    this.field_b[var2] = tq.a(this.field_h[var2], this.field_j[var2]);
                    var2++;
                    if (var6 != 0) {
                      break L48;
                    } else {
                      if (var6 == 0) {
                        continue L47;
                      } else {
                        break L49;
                      }
                    }
                  }
                }
                var2 = 1;
                break L48;
              }
              L50: while (true) {
                L51: {
                  if (var2 > 10) {
                    stackOut_50_0 = 0;
                    stackIn_51_0 = stackOut_50_0;
                    break L51;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_51_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var6 != 0) {
                      break L51;
                    } else {
                      var3 = stackIn_14_0;
                      L52: while (true) {
                        L53: {
                          if (var3 >= 8) {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            break L53;
                          } else {
                            this.field_a[var3] = 0L;
                            var4 = 0;
                            stackOut_16_0 = 56;
                            stackIn_25_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (var6 != 0) {
                              break L53;
                            } else {
                              var5 = stackIn_17_0;
                              L54: while (true) {
                                L55: {
                                  L56: {
                                    if (-9 >= (var4 ^ -1)) {
                                      break L56;
                                    } else {
                                      this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                                      var4++;
                                      var5 -= 8;
                                      if (var6 != 0) {
                                        break L55;
                                      } else {
                                        if (var6 == 0) {
                                          continue L54;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                  }
                                  var3++;
                                  break L55;
                                }
                                continue L52;
                              }
                            }
                          }
                        }
                        var3 = stackIn_25_0;
                        L57: while (true) {
                          L58: {
                            if (-9 >= (var3 ^ -1)) {
                              this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                              break L58;
                            } else {
                              this.field_d[var3] = this.field_a[var3];
                              var3++;
                              if (var6 != 0) {
                                break L58;
                              } else {
                                if (var6 == 0) {
                                  continue L57;
                                } else {
                                  this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                                  break L58;
                                }
                              }
                            }
                          }
                          var3 = 0;
                          L59: while (true) {
                            L60: {
                              L61: {
                                if (-9 >= (var3 ^ -1)) {
                                  break L61;
                                } else {
                                  this.field_a[var3] = this.field_d[var3];
                                  var4 = 0;
                                  stackOut_34_0 = 56;
                                  stackIn_43_0 = stackOut_34_0;
                                  stackIn_35_0 = stackOut_34_0;
                                  if (var6 != 0) {
                                    break L60;
                                  } else {
                                    var5 = stackIn_35_0;
                                    L62: while (true) {
                                      L63: {
                                        L64: {
                                          if (-9 >= (var4 ^ -1)) {
                                            break L64;
                                          } else {
                                            this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L63;
                                            } else {
                                              if (var6 == 0) {
                                                continue L62;
                                              } else {
                                                break L64;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L63;
                                      }
                                      if (var6 == 0) {
                                        continue L59;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L60;
                            }
                            var3 = stackIn_43_0;
                            L65: while (true) {
                              L66: {
                                L67: {
                                  if (-9 >= (var3 ^ -1)) {
                                    break L67;
                                  } else {
                                    this.field_b[var3] = this.field_a[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L66;
                                    } else {
                                      if (var6 == 0) {
                                        continue L65;
                                      } else {
                                        break L67;
                                      }
                                    }
                                  }
                                }
                                var2++;
                                break L66;
                              }
                              continue L50;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var2 = stackIn_51_0;
                L68: while (true) {
                  if (8 > var2) {
                    this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L68;
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

    public static void a(boolean param0) {
        field_l = null;
        field_k = null;
        field_g = null;
        if (!param0) {
            wl.a(true);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = -58 / ((-10 - param1) / 50);
            var6 = 0;
            var7 = 8 + -((int)param2 & 7) & 7;
            var8 = 7 & this.field_f;
            var10 = param2;
            var12 = 31;
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if ((var12 ^ -1) > -1) {
                        break L5;
                      } else {
                        var13 = var13 + ((255 & this.field_e[var12]) + (255 & (int)var10));
                        this.field_e[var12] = (byte)var13;
                        var10 = var10 >>> 8;
                        var13 = var13 >>> 8;
                        var12--;
                        if (var14 != 0) {
                          break L4;
                        } else {
                          if (var14 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (-9L <= (param2 ^ -1L)) {
                        break L4;
                      } else {
                        var9 = param0[var6] << var7 & 255 | (param0[1 + var6] & 255) >>> 8 + -var7;
                        stackOut_7_0 = 0;
                        stackOut_7_1 = var9;
                        stackIn_19_0 = stackOut_7_0;
                        stackIn_19_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var14 != 0) {
                          break L3;
                        } else {
                          L7: {
                            if (stackIn_8_0 > stackIn_8_1) {
                              break L7;
                            } else {
                              if (-257 < (var9 ^ -1)) {
                                L8: {
                                  this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], var9 >>> var8);
                                  this.field_c = this.field_c + 1;
                                  this.field_f = this.field_f + (-var8 + 8);
                                  if (512 == this.field_f) {
                                    this.a(-2);
                                    this.field_f = 0;
                                    this.field_c = 0;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                this.field_m[this.field_c] = (byte)tq.b(var9 << 8 + -var8, 255);
                                param2 = param2 - 8L;
                                this.field_f = this.field_f + var8;
                                var6++;
                                if (var14 == 0) {
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          throw new RuntimeException("LOGIC ERROR");
                        }
                      }
                    }
                  }
                  L9: {
                    if ((param2 ^ -1L) < -1L) {
                      break L9;
                    } else {
                      var9 = 0;
                      if (var14 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                  }
                  stackOut_18_0 = 255;
                  stackOut_18_1 = param0[var6] << var7;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L3;
                }
                var9 = stackIn_19_0 & stackIn_19_1;
                this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], var9 >>> var8);
                break L2;
              }
              L10: {
                L11: {
                  if (-9L >= ((long)var8 - -param2 ^ -1L)) {
                    break L11;
                  } else {
                    this.field_f = (int)((long)this.field_f + param2);
                    if (var14 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  param2 = param2 - (long)(-var8 + 8);
                  this.field_c = this.field_c + 1;
                  this.field_f = this.field_f + (8 + -var8);
                  if (this.field_f == 512) {
                    this.a(-2);
                    this.field_c = 0;
                    this.field_f = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                this.field_m[this.field_c] = (byte)tq.b(255, var9 << -var8 + 8);
                this.field_f = this.field_f + (int)param2;
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("wl.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var27 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        Object var33 = null;
        CharSequence var34 = null;
        L0: {
          var33 = null;
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = 1;
          if (sp.field_h) {
            break L0;
          } else {
            if (lj.field_v == null) {
              var3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1 != (va.field_a ^ -1)) {
            break L1;
          } else {
            if (ej.field_n != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((va.field_a ^ -1) != -3) {
            break L2;
          } else {
            if (!tl.d((byte) -20)) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (-85 != (sj.field_p ^ -1)) {
          L3: {
            if (sj.field_p == 85) {
              break L3;
            } else {
              var4 = pn.field_d;
              if (og.a((char) var4, (byte) 123)) {
                if (var3 != 0) {
                  if (80 > rm.field_a.length()) {
                    L4: {
                      L5: {
                        discarded$6 = rm.field_a.append((char) var4);
                        var5 = 485;
                        var17 = ta.field_lb;
                        var16 = nh.a(2, var17);
                        var19 = var16;
                        if (va.field_a != 2) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var34 = (CharSequence) ((Object) qf.field_g);
                              var18 = vl.a(v.field_c, new String[]{ld.a((byte) 0, var34)}, 2);
                              var8 = vl.a(lc.field_n, new String[]{var16}, 2);
                              var7 = var8;
                              var9 = w.field_A.a(var18);
                              var10 = w.field_A.a(var8);
                              if (var10 < var9) {
                                break L7;
                              } else {
                                var5 = var5 - var10;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var5 = var5 - var9;
                            break L6;
                          }
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var7 = "";
                      if (va.field_a == 0) {
                        L8: {
                          if (null != mh.field_c) {
                            break L8;
                          } else {
                            if (!sn.field_Hb) {
                              break L8;
                            } else {
                              var7 = "[" + ne.field_vb + "] ";
                              break L8;
                            }
                          }
                        }
                        if (mh.field_c != null) {
                          L9: {
                            L10: {
                              if (!wa.field_k) {
                                var7 = "[" + vl.a(ae.field_g, new String[]{mh.field_c.field_Nb}, 2) + "] ";
                                if (var11 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              } else {
                                if (bp.field_t != null) {
                                  break L10;
                                } else {
                                  L11: {
                                    var7 = "[" + vl.a(ae.field_g, new String[]{mh.field_c.field_Nb}, 2) + "] ";
                                    if (var11 == 0) {
                                      break L11;
                                    } else {
                                      var7 = "[" + bp.field_t + "] ";
                                      break L11;
                                    }
                                  }
                                  var31 = var7 + var19 + ": ";
                                  var7 = var31;
                                  var7 = var31;
                                  var5 = var5 - w.field_A.a(var31);
                                  if (w.field_A.a(rm.field_a.toString()) > var5) {
                                    discarded$7 = lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                                    return true;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                            var7 = "[" + bp.field_t + "] ";
                            break L9;
                          }
                          var32 = var7 + var19 + ": ";
                          var5 = var5 - w.field_A.a(var32);
                          break L4;
                        } else {
                          var30 = var7 + var19 + ": ";
                          var7 = var30;
                          var7 = var30;
                          var5 = var5 - w.field_A.a(var30);
                          if (w.field_A.a(rm.field_a.toString()) > var5) {
                            discarded$8 = lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                            return true;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        L12: {
                          var27 = var7 + var19 + ": ";
                          var7 = var27;
                          var7 = var27;
                          var5 = var5 - w.field_A.a(var27);
                          if (w.field_A.a(rm.field_a.toString()) <= var5) {
                            break L12;
                          } else {
                            discarded$9 = lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                            break L12;
                          }
                        }
                        return true;
                      }
                    }
                    if (w.field_A.a(rm.field_a.toString()) > var5) {
                      discarded$10 = lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                if (var11 == 0) {
                  if (param1 < 30) {
                    field_i = (String) null;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  break L3;
                }
              }
            }
          }
          if (var3 != 0) {
            if (rm.field_a.length() <= 0) {
              return true;
            } else {
              discarded$11 = lf.a(' ', rm.field_a.length() - 1, 0, rm.field_a);
              return true;
            }
          } else {
            return true;
          }
        } else {
          if (var3 == 0) {
            if (0 != va.field_a) {
              pf.a(48);
              if (var11 == 0) {
                return true;
              } else {
                L13: {
                  if (-1 > (rm.field_a.length() ^ -1)) {
                    L14: {
                      var4_ref_String = rm.field_a.toString();
                      if (!so.a(-115, var4_ref_String)) {
                        break L14;
                      } else {
                        var13 = (String) null;
                        var12 = (String) null;
                        vm.a((String) null, 0, (String) null, iq.field_d, 2, 0);
                        var15 = (String) null;
                        var14 = (String) null;
                        vm.a((String) null, 0, (String) null, o.field_l, 2, 0);
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      var5 = va.field_a;
                      if (-1 != (var5 ^ -1)) {
                        break L15;
                      } else {
                        if (mh.field_c == null) {
                          break L15;
                        } else {
                          var5 = 1;
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (ga.a(var5, true) == 2) {
                        kp.a(var5, param2, 1, true);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    kb.a(-1, qf.field_g, param0, var4_ref_String, va.field_a, 29602);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                pf.a(64);
                return true;
              }
            } else {
              return true;
            }
          } else {
            L17: {
              if (-1 > (rm.field_a.length() ^ -1)) {
                L18: {
                  var4_ref_String = rm.field_a.toString();
                  if (!so.a(-115, var4_ref_String)) {
                    break L18;
                  } else {
                    var13 = (String) null;
                    var12 = (String) null;
                    vm.a((String) null, 0, (String) null, iq.field_d, 2, 0);
                    var15 = (String) null;
                    var14 = (String) null;
                    vm.a((String) null, 0, (String) null, o.field_l, 2, 0);
                    if (var11 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  var5 = va.field_a;
                  if (-1 != (var5 ^ -1)) {
                    break L19;
                  } else {
                    if (mh.field_c == null) {
                      break L19;
                    } else {
                      var5 = 1;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (ga.a(var5, true) == 2) {
                    kp.a(var5, param2, 1, true);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                kb.a(-1, qf.field_g, param0, var4_ref_String, va.field_a, 29602);
                break L17;
              } else {
                break L17;
              }
            }
            pf.a(64);
            return true;
          }
        }
    }

    final static void a(int param0, tq param1, int param2, int param3, byte param4, int param5, dm param6) {
        boolean discarded$0 = false;
        jb var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            ve.a(param6.field_ec, 196, param6.field_Lb, param1, param6.field_Jb, param6, -1, (int[]) null, -1);
            pk.field_b.a(true, (byte) -102);
            pk.field_b.a(0, (int[]) null, (byte) 13);
            pk.field_b.c(param4 ^ -42);
            if (param4 != 81) {
                discarded$0 = wl.a(-56, -95, -27);
            }
            var13 = pk.field_b;
            var8 = param5;
            var9 = param0;
            var10 = param3;
            var11 = param2;
            var13.field_j.b(4542, var8, var11, var9, var10);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    wl() {
        this.field_b = new long[8];
        this.field_m = new byte[64];
        this.field_j = new long[8];
        this.field_d = new long[8];
        this.field_e = new byte[32];
        this.field_a = new long[8];
        this.field_f = 0;
        this.field_h = new long[8];
        this.field_c = 0;
    }

    static {
        field_g = "Powerups with this modifier can be used on enemy zombies, but can only be applied to a few - experiment with it...";
        field_i = "End of Free Game";
    }
}
