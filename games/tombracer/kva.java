/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kva extends dg {
    private uh field_u;
    private oia[][] field_q;
    static en field_n;
    static String field_r;
    private dpa[][] field_m;
    static jea[] field_p;
    static kea field_s;
    private int field_t;
    private int field_v;
    private int field_o;

    kva(int param0) {
        super(param0);
    }

    final void a(uw param0, int param1) {
        ev var3 = null;
        sva var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1 >= 82) {
                break L1;
              } else {
                this.field_t = 34;
                break L1;
              }
            }
            L2: {
              super.a(param0, 87);
              this.field_q = (oia[][]) null;
              this.field_m = (dpa[][]) null;
              if (null != this.field_u) {
                L3: {
                  var3 = param0.a((byte) 59);
                  if (var3 instanceof sva) {
                    var4 = (sva) ((Object) var3);
                    var4.b((byte) -105, this.field_u);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_u = null;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("kva.RA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final ka a(int param0, dpa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        ka stackIn_15_0 = null;
        ka stackIn_23_0 = null;
        ka stackIn_25_0 = null;
        ka stackIn_27_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 90) {
                break L1;
              } else {
                var5 = (kh) null;
                this.a((byte) -47, (kh) null);
                break L1;
              }
            }
            L2: {
              var3_int = this.field_v;
              if (var3_int == 0) {
                break L2;
              } else {
                if (var3_int != 1) {
                  break L2;
                } else {
                  L3: {
                    var3_int = param1.field_j;
                    if (0 != var3_int) {
                      if (-2 == (var3_int ^ -1)) {
                        stackIn_25_0 = df.field_J[91];
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((var3_int ^ -1) == -3) {
                          stackIn_27_0 = df.field_J[92];
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (-4 != (var3_int ^ -1)) {
                            break L3;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  stackIn_23_0 = df.field_J[90];
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L4: {
              var3_int = param1.field_j;
              if (var3_int != 0) {
                if ((var3_int ^ -1) != -2) {
                  if ((var3_int ^ -1) != -3) {
                    if (var3_int != 3) {
                      break L4;
                    } else {
                      return null;
                    }
                  } else {
                    return df.field_J[73];
                  }
                } else {
                  return df.field_J[72];
                }
              } else {
                break L4;
              }
            }
            stackIn_15_0 = df.field_J[71];
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("kva.PA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              return stackIn_27_0;
            }
          }
        }
    }

    final ka a(dpa param0, int param1) {
        ka stackIn_10_0 = null;
        ka stackIn_12_0 = null;
        ka stackIn_15_0 = null;
        ka stackIn_18_0 = null;
        ka stackIn_21_0 = null;
        ka stackIn_24_0 = null;
        ka stackIn_27_0 = null;
        ka stackIn_30_0 = null;
        ka stackIn_33_0 = null;
        ka stackIn_36_0 = null;
        ka stackIn_38_0 = null;
        ka stackIn_40_0 = null;
        ka stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kh var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == 44) {
                break L1;
              } else {
                var4 = (kh) null;
                this.a((byte) -87, (kh) null);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_j;
              if (-1 == (var3_int ^ -1)) {
                break L2;
              } else {
                if (1 == var3_int) {
                  stackIn_40_0 = df.field_J[29];
                  decompiledRegionSelector0 = 11;
                  break L0;
                } else {
                  if (-3 == (var3_int ^ -1)) {
                    stackIn_42_0 = df.field_J[30];
                    decompiledRegionSelector0 = 12;
                    break L0;
                  } else {
                    if ((var3_int ^ -1) != -4) {
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
            if (!param0.field_g) {
              if ((param0.field_d ^ -1) <= -12) {
                if (param0.field_d >= 22) {
                  if (33 <= param0.field_d) {
                    if (param0.field_d >= 44) {
                      if (55 <= param0.field_d) {
                        if (-67 >= (param0.field_d ^ -1)) {
                          if (-78 >= (param0.field_d ^ -1)) {
                            if ((param0.field_d ^ -1) <= -89) {
                              stackIn_38_0 = df.field_J[39];
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              stackIn_36_0 = df.field_J[38];
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            stackIn_33_0 = df.field_J[37];
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          stackIn_30_0 = df.field_J[36];
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        stackIn_27_0 = df.field_J[35];
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_24_0 = df.field_J[34];
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackIn_21_0 = df.field_J[33];
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackIn_18_0 = df.field_J[32];
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_15_0 = df.field_J[31];
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              if ((param0.field_d ^ -1) <= -51) {
                stackIn_12_0 = df.field_J[114];
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = df.field_J[113];
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var3);

            stackIn_45_1 = new StringBuilder().append("kva.TA(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L3;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_33_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_36_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_38_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_40_0;
                              } else {
                                return stackIn_42_0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    kva(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    private final void n(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_141_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        dpa var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        dpa var27;
        dpa var28;
        dpa var29;
        la var30;
        dpa var31;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          var30 = this.a(113);
          var3 = var30.m((byte) -86);
          var4 = var30.s(85);
          var5 = this.field_h.d(3);
          var6 = this.field_h.e(param0 + 9758);
          this.field_o = this.field_h.c(-128) / 2097152;
          this.field_t = this.field_h.a((byte) 55) / 2097152;
          this.field_m = new dpa[this.field_o][this.field_t];
          var7 = -(this.field_h.a((byte) 55) / 2) + (var6 + 1048576);
          if (param0 == -110) {
            break L0;
          } else {
            var27 = (dpa) null;
            this.a(-101, (dpa) null);
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (var8 >= this.field_t) {
            return;
          } else {
            var9 = -(this.field_h.c(-53) / 2) + var5 + 1048576;
            var10 = 0;
            L2: while (true) {
              if (var10 >= this.field_o) {
                var7 = var7 + 2097152;
                var8++;
                continue L1;
              } else {
                L3: {
                  var28 = new dpa();
                  var29 = var28;
                  var31 = var29;
                  var11 = var31;
                  this.field_m[var10][var8] = var28;
                  if (0 >= var10) {
                    stackIn_9_0 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var12 = stackIn_9_0;
                  if (-1 + this.field_o <= var10) {
                    stackIn_12_0 = 0;
                    break L4;
                  } else {
                    stackIn_12_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var13 = stackIn_12_0;
                  if ((var8 ^ -1) >= -1) {
                    stackIn_15_0 = 0;
                    break L5;
                  } else {
                    stackIn_15_0 = 1;
                    break L5;
                  }
                }
                L6: {
                  var14 = stackIn_15_0;
                  if (-1 + this.field_t <= var8) {
                    stackIn_18_0 = 0;
                    break L6;
                  } else {
                    stackIn_18_0 = 1;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_18_0;
                  if (var12 == 0) {
                    if (2097152 <= var9) {
                      if (var30.a(var9 + -2097152, 2097152, var7, 2097152, true, 1, (byte) -101)) {
                        stackIn_26_0 = 1;
                        break L7;
                      } else {
                        stackIn_26_0 = 0;
                        break L7;
                      }
                    } else {
                      stackIn_26_0 = 1;
                      break L7;
                    }
                  } else {
                    stackIn_26_0 = 1;
                    break L7;
                  }
                }
                L8: {
                  var16 = stackIn_26_0;
                  if (var13 == 0) {
                    if (var9 <= var3 + -2097152) {
                      if (var30.a(2097152 + var9, 2097152, var7, 2097152, true, 1, (byte) -86)) {
                        stackIn_34_0 = 1;
                        break L8;
                      } else {
                        stackIn_34_0 = 0;
                        break L8;
                      }
                    } else {
                      stackIn_34_0 = 1;
                      break L8;
                    }
                  } else {
                    stackIn_34_0 = 1;
                    break L8;
                  }
                }
                L9: {
                  var17 = stackIn_34_0;
                  if (var14 == 0) {
                    if (var7 >= 2097152) {
                      if (var30.a(var9, 2097152, -2097152 + var7, 2097152, true, 1, (byte) -44)) {
                        stackIn_42_0 = 1;
                        break L9;
                      } else {
                        stackIn_42_0 = 0;
                        break L9;
                      }
                    } else {
                      stackIn_42_0 = 1;
                      break L9;
                    }
                  } else {
                    stackIn_42_0 = 1;
                    break L9;
                  }
                }
                L10: {
                  var18 = stackIn_42_0;
                  if (var15 == 0) {
                    if (var7 <= -2097152 + var4) {
                      if (var30.a(var9, 2097152, 2097152 + var7, 2097152, true, 1, (byte) 92)) {
                        stackIn_50_0 = 1;
                        break L10;
                      } else {
                        stackIn_50_0 = 0;
                        break L10;
                      }
                    } else {
                      stackIn_50_0 = 1;
                      break L10;
                    }
                  } else {
                    stackIn_50_0 = 1;
                    break L10;
                  }
                }
                L11: {
                  var19 = stackIn_50_0;
                  var20 = 0;
                  if (var16 == 0) {
                    break L11;
                  } else {
                    var20++;
                    break L11;
                  }
                }
                L12: {
                  if (var17 == 0) {
                    break L12;
                  } else {
                    var20++;
                    break L12;
                  }
                }
                L13: {
                  if (var18 == 0) {
                    break L13;
                  } else {
                    var20++;
                    break L13;
                  }
                }
                L14: {
                  if (var19 != 0) {
                    var20++;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  var21 = 0;
                  if (var20 == 4) {
                    L16: {
                      L17: {
                        if (var12 == 0) {
                          break L17;
                        } else {
                          if (var14 != 0) {
                            stackIn_105_0 = 1;
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (-2097153 >= (var9 ^ -1)) {
                        if (var7 >= 2097152) {
                          if (var30.a(-2097152 + var9, 2097152, var7 + -2097152, 2097152, true, 1, (byte) -103)) {
                            stackIn_105_0 = 1;
                            break L16;
                          } else {
                            stackIn_105_0 = 0;
                            break L16;
                          }
                        } else {
                          stackIn_105_0 = 1;
                          break L16;
                        }
                      } else {
                        stackIn_105_0 = 1;
                        break L16;
                      }
                    }
                    L18: {
                      L19: {
                        var22 = stackIn_105_0;
                        if (var13 == 0) {
                          break L19;
                        } else {
                          if (var14 != 0) {
                            stackIn_117_0 = 1;
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      if (var9 <= -2097152 + var3) {
                        if ((var7 ^ -1) <= -2097153) {
                          if (var30.a(2097152 + var9, 2097152, var7 - 2097152, 2097152, true, 1, (byte) 114)) {
                            stackIn_117_0 = 1;
                            break L18;
                          } else {
                            stackIn_117_0 = 0;
                            break L18;
                          }
                        } else {
                          stackIn_117_0 = 1;
                          break L18;
                        }
                      } else {
                        stackIn_117_0 = 1;
                        break L18;
                      }
                    }
                    L20: {
                      L21: {
                        var23 = stackIn_117_0;
                        if (var12 == 0) {
                          break L21;
                        } else {
                          if (var15 == 0) {
                            break L21;
                          } else {
                            stackIn_129_0 = 1;
                            break L20;
                          }
                        }
                      }
                      if (-2097153 >= (var9 ^ -1)) {
                        if (var7 <= -2097152 + var4) {
                          if (var30.a(var9 + -2097152, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 126)) {
                            stackIn_129_0 = 1;
                            break L20;
                          } else {
                            stackIn_129_0 = 0;
                            break L20;
                          }
                        } else {
                          stackIn_129_0 = 1;
                          break L20;
                        }
                      } else {
                        stackIn_129_0 = 1;
                        break L20;
                      }
                    }
                    L22: {
                      L23: {
                        var24 = stackIn_129_0;
                        if (var13 == 0) {
                          break L23;
                        } else {
                          if (var15 == 0) {
                            break L23;
                          } else {
                            stackIn_141_0 = 1;
                            break L22;
                          }
                        }
                      }
                      if (var9 <= var3 + -2097152) {
                        if (var7 <= -2097152 + var4) {
                          if (var30.a(2097152 + var9, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 77)) {
                            stackIn_141_0 = 1;
                            break L22;
                          } else {
                            stackIn_141_0 = 0;
                            break L22;
                          }
                        } else {
                          stackIn_141_0 = 1;
                          break L22;
                        }
                      } else {
                        stackIn_141_0 = 1;
                        break L22;
                      }
                    }
                    L24: {
                      var25 = stackIn_141_0;
                      if (var22 == 0) {
                        break L24;
                      } else {
                        if (var23 == 0) {
                          break L24;
                        } else {
                          if (var24 == 0) {
                            break L24;
                          } else {
                            if (var25 == 0) {
                              break L24;
                            } else {
                              var29.field_j = 3;
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      if (var22 != 0) {
                        if (var24 == 0) {
                          var21 = 0;
                          break L25;
                        } else {
                          if (var23 != 0) {
                            var21 = -512;
                            break L25;
                          } else {
                            var21 = 1024;
                            break L25;
                          }
                        }
                      } else {
                        var21 = 512;
                        break L25;
                      }
                    }
                    var31.field_j = 2;
                    break L15;
                  } else {
                    if ((var20 ^ -1) == -4) {
                      var31.field_j = 0;
                      if (var18 != 0) {
                        if (var19 != 0) {
                          if (var17 == 0) {
                            var31.field_g = var30.a(2097152 + var9, 2097152, var7, 2097152, true, 0, (byte) -88);
                            var21 = -512;
                            break L15;
                          } else {
                            var31.field_g = var30.a(var9 - 2097152, 2097152, var7, 2097152, true, 0, (byte) 108);
                            var21 = 512;
                            break L15;
                          }
                        } else {
                          var21 = 0;
                          var31.field_g = var30.a(var9, 2097152, 2097152 + var7, 2097152, true, 0, (byte) -52);
                          break L15;
                        }
                      } else {
                        var31.field_g = var30.a(var9, 2097152, -2097152 + var7, 2097152, true, 0, (byte) -20);
                        var21 = 1024;
                        break L15;
                      }
                    } else {
                      if (-3 == (var20 ^ -1)) {
                        L26: {
                          if (var18 != 0) {
                            break L26;
                          } else {
                            if (var19 == 0) {
                              var31.field_j = 3;
                              break L15;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (var16 != 0) {
                            break L27;
                          } else {
                            if (var17 != 0) {
                              break L27;
                            } else {
                              var31.field_j = 3;
                              break L15;
                            }
                          }
                        }
                        L28: {
                          L29: {
                            var31.field_f = var31.field_f - 512;
                            if (var16 != 0) {
                              break L29;
                            } else {
                              if (var18 == 0) {
                                var21 = 512;
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                          L30: {
                            if (var16 != 0) {
                              break L30;
                            } else {
                              if (var19 == 0) {
                                var21 = 0;
                                var31.field_j = 1;
                                break L15;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (var17 != 0) {
                              break L31;
                            } else {
                              if (var18 == 0) {
                                var21 = 1024;
                                var31.field_j = 1;
                                break L15;
                              } else {
                                break L31;
                              }
                            }
                          }
                          if (var17 != 0) {
                            break L28;
                          } else {
                            if (var19 != 0) {
                              break L28;
                            } else {
                              var21 = -512;
                              var31.field_j = 1;
                              break L15;
                            }
                          }
                        }
                        var31.field_j = 1;
                        break L15;
                      } else {
                        var29.field_j = 3;
                        break L15;
                      }
                    }
                  }
                }
                var31.field_d = var30.e(true).a(100, param0 + 110);
                var31.field_f = dfa.a(var21 + ku.field_j[var31.field_j], 2048, param0 ^ -57);
                var31.field_a = -var6 + var7;
                var31.field_i = -var5 + var9;
                var31.field_e = (kva) (this);
                var22 = 0;
                var23 = 80;
                var24 = 80;
                L32: while (true) {
                  if (var23 <= var22) {
                    var9 = var9 + 2097152;
                    var10++;
                    continue L2;
                  } else {
                    var22 = var22 + var24;
                    var11.field_b = var11.b(53);
                    var11.field_b.field_h = var22;
                    var11 = var11.field_b;
                    continue L32;
                  }
                }
              }
            }
          }
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
            return -93;
        }
        return 0;
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = -114 % ((param0 - -8) / 40);
            super.a((byte) -68, param1);
            param1.a((byte) -127, this.field_v, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        dpa var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 < 0) {
            this.field_o = 122;
        }
        super.h(70);
        if (null == this.field_m) {
            return;
        }
        for (var2 = 0; this.field_o > var2; var2++) {
            for (var3 = 0; var3 < this.field_t; var3++) {
                var4 = this.field_m[var2][var3];
                var5 = ku.field_j[var4.field_j];
                var4.field_f = dfa.a(-var4.field_f + var5, 2048, 93);
                var4.field_i = -var4.field_i;
            }
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
            field_r = (String) null;
        }
        return 2;
    }

    final void a(int param0, uw param1, byte param2) {
        dpa var9 = null;
        dpa var6 = null;
        int var8 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        try {
            if (!(this.field_m == null)) {
                for (var4_int = 0; this.field_o > var4_int; var4_int++) {
                    for (var5 = 0; var5 < this.field_t; var5++) {
                        var9 = this.field_m[var4_int][var5];
                        var6 = var9;
                        if (var9 != null) {
                            if (!(var9.field_j == 3)) {
                                while (var6 != null) {
                                    param1.a(param0, var6, (byte) -33);
                                    var6 = var6.field_b;
                                }
                            }
                        }
                    }
                }
            }
            if (!(this.field_q == null)) {
                for (var4_int = 0; this.field_o > var4_int; var4_int++) {
                    var8 = 0;
                    var5 = var8;
                    while (var8 < this.field_t) {
                        if (this.field_q[var4_int][var8] != null) {
                            param1.a(0, this.field_q[var4_int][var8], (byte) -33);
                        }
                        var8++;
                    }
                }
            }
            if (param2 <= 40) {
                field_s = (kea) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int f(byte param0) {
        int var2 = 89 / ((param0 - 15) / 45);
        return 1;
    }

    public static void i(int param0) {
        field_n = null;
        int var1 = -43 / ((param0 - -84) / 37);
        field_s = null;
        field_p = null;
        field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = -76 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final ka a(byte param0, oia param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 102 / ((param0 - -68) / 49);
            var7 = this.field_v;
            if (-1 != (var7 ^ -1)) {
              if (1 == var7) {
                var4 = param1.b((byte) 111) / 2097152 % 3;
                var5 = param1.c((byte) 102) / 2097152 % 3;
                var6 = 3 * var5 + (80 + var4);
                stackIn_6_0 = df.field_J[var6];
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kva.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                this.f((byte) -126);
                break L1;
              }
            }
            L2: {
              super.a(122, param1, param2);
              if (param1.field_E >= 19) {
                this.field_v = param2.b((byte) 44, 2);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("kva.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    private final void j(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oia var8 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = this.field_h.d(3);
        int var3 = this.field_h.e(param0 + -211);
        if (param0 != 9859) {
            return;
        }
        this.field_q = new oia[this.field_o][this.field_t];
        int var4 = -(this.field_h.a((byte) 55) / 2) + var3 - -1048576;
        for (var5 = 0; this.field_t > var5; var5++) {
            var6 = 1048576 + (var2 - this.field_h.c(-100) / 2);
            for (var7 = 0; var7 < this.field_o; var7++) {
                var8 = new oia();
                this.field_q[var7][var5] = var8;
                var8.field_c = (kva) (this);
                var8.field_b = var4 - var3;
                var8.field_a = var6 + -var2;
                var6 = var6 + 2097152;
            }
            var4 = var4 + 2097152;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_m) {
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (this.field_o <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= this.field_t) {
                        var4_int++;
                        continue L2;
                      } else {
                        L4: {
                          var9 = this.field_m[var4_int][var5];
                          var6 = var9;
                          if (var9 == null) {
                            break L4;
                          } else {
                            if ((var9.field_j ^ -1) == -4) {
                              break L4;
                            } else {
                              L5: while (true) {
                                if (var6 == null) {
                                  break L4;
                                } else {
                                  param2.a((byte) -5, param1, var6);
                                  var6 = var6.field_b;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (null == this.field_q) {
                break L6;
              } else {
                var4_int = 0;
                L7: while (true) {
                  if (var4_int >= this.field_o) {
                    break L6;
                  } else {
                    var8 = 0;
                    var5 = var8;
                    L8: while (true) {
                      if (this.field_t <= var8) {
                        var4_int++;
                        continue L7;
                      } else {
                        L9: {
                          if (null != this.field_q[var4_int][var8]) {
                            param2.a((byte) 17, 0, this.field_q[var4_int][var8]);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
            L10: {
              if (param0 >= 50) {
                break L10;
              } else {
                this.k((byte) 96);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("kva.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final void b(int param0, uw param1) {
        aga var6 = null;
        ev var4 = null;
        sva var5 = null;
        try {
            if (!(null != this.field_m)) {
                this.n((byte) -110);
            }
            if (this.field_q == null) {
                this.j(9859);
            }
            if (!((this.field_v ^ -1) != -2)) {
                var6 = new aga(tga.field_a, 0, 0, 0, 0, 16720418, 200, 8);
                this.field_u = new uh(var6);
                this.field_u.a(-17825792 + this.e((byte) -118) + 4194304, (byte) 95, this.c((byte) 108), this.b((byte) 84));
                var4 = param1.a((byte) 59);
                if (!(!(var4 instanceof sva))) {
                    var5 = (sva) ((Object) var4);
                    var5.a((byte) 45, this.field_u);
                }
            }
            super.b(param0 + param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_v = param1;
        if (param0 != 2097152) {
            this.field_u = (uh) null;
        }
    }

    static {
        field_r = "Wandering walls";
        field_s = new kea();
    }
}
