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
        if (param1 < 82) {
            ((kva) this).field_t = 34;
        }
        super.a(param0, 87);
        ((kva) this).field_q = null;
        ((kva) this).field_m = null;
        if (!(null == ((kva) this).field_u)) {
            var3 = param0.a((byte) 59);
            if (!(!(var3 instanceof sva))) {
                var4 = (sva) (Object) var3;
                var4.b((byte) -105, ((kva) this).field_u);
            }
            ((kva) this).field_u = null;
        }
    }

    final ka a(int param0, dpa param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param0 >= 90) {
            break L0;
          } else {
            var5 = null;
            ((kva) this).a((byte) -47, (kh) null);
            break L0;
          }
        }
        L1: {
          var3 = ((kva) this).field_v;
          if (var3 == 0) {
            break L1;
          } else {
            if (var3 != 1) {
              break L1;
            } else {
              L2: {
                var3 = param1.field_j;
                if (0 != var3) {
                  if (-2 == (var3 ^ -1)) {
                    return df.field_J[91];
                  } else {
                    if (var3 == -3) {
                      return df.field_J[92];
                    } else {
                      if (-4 != var3) {
                        break L2;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              return df.field_J[90];
            }
          }
        }
        L3: {
          var3 = param1.field_j;
          if (var3 != 0) {
            if ((var3 ^ -1) != -2) {
              if ((var3 ^ -1) != -3) {
                if (var3 != 3) {
                  break L3;
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
            break L3;
          }
        }
        return df.field_J[71];
    }

    final ka a(dpa param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          if (param1 == 44) {
            break L0;
          } else {
            var4 = null;
            ((kva) this).a((byte) -87, (kh) null);
            break L0;
          }
        }
        L1: {
          var3 = param0.field_j;
          if (-1 == var3) {
            break L1;
          } else {
            if (1 == var3) {
              return df.field_J[29];
            } else {
              if (-3 == var3) {
                return df.field_J[30];
              } else {
                if ((var3 ^ -1) != -4) {
                  break L1;
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
                    if (-67 >= param0.field_d) {
                      if (-78 <= param0.field_d) {
                        if ((param0.field_d ^ -1) <= -89) {
                          return df.field_J[39];
                        } else {
                          return df.field_J[38];
                        }
                      } else {
                        return df.field_J[37];
                      }
                    } else {
                      return df.field_J[36];
                    }
                  } else {
                    return df.field_J[35];
                  }
                } else {
                  return df.field_J[34];
                }
              } else {
                return df.field_J[33];
              }
            } else {
              return df.field_J[32];
            }
          } else {
            return df.field_J[31];
          }
        } else {
          if ((param0.field_d ^ -1) <= -51) {
            return df.field_J[114];
          } else {
            return df.field_J[113];
          }
        }
    }

    kva(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    private final void n(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dpa var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        dpa var28 = null;
        dpa var29 = null;
        la var30 = null;
        dpa var31 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_138_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          var30 = ((kva) this).a(113);
          var3 = var30.m((byte) -86);
          var4 = var30.s(85);
          var5 = ((kva) this).field_h.d(3);
          var6 = ((kva) this).field_h.e(param0 + 9758);
          ((kva) this).field_o = ((kva) this).field_h.c(-128) / 2097152;
          ((kva) this).field_t = ((kva) this).field_h.a((byte) 55) / 2097152;
          ((kva) this).field_m = new dpa[((kva) this).field_o][((kva) this).field_t];
          var7 = -(((kva) this).field_h.a((byte) 55) / 2) + (var6 + 1048576);
          if (param0 == -110) {
            break L0;
          } else {
            var27 = null;
            ka discarded$1 = ((kva) this).a(-101, (dpa) null);
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (var8 >= ((kva) this).field_t) {
            return;
          } else {
            var9 = -(((kva) this).field_h.c(-53) / 2) + var5 + 1048576;
            var10 = 0;
            L2: while (true) {
              if (var10 >= ((kva) this).field_o) {
                var7 = var7 + 2097152;
                var8++;
                continue L1;
              } else {
                L3: {
                  var28 = new dpa();
                  var29 = var28;
                  var31 = var29;
                  var11 = var31;
                  ((kva) this).field_m[var10][var8] = var28;
                  if (0 >= var10) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var12 = stackIn_9_0;
                  if (-1 + ((kva) this).field_o <= var10) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var13 = stackIn_12_0;
                  if ((var8 ^ -1) >= -1) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                L6: {
                  var14 = stackIn_15_0;
                  if (-1 + ((kva) this).field_t <= var8) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L6;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_18_0;
                  if (var12 == 0) {
                    if (2097152 <= var9) {
                      if (var30.a(var9 + -2097152, 2097152, var7, 2097152, true, 1, (byte) -101)) {
                        stackOut_24_0 = 1;
                        stackIn_26_0 = stackOut_24_0;
                        break L7;
                      } else {
                        stackOut_23_0 = 0;
                        stackIn_26_0 = stackOut_23_0;
                        break L7;
                      }
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_26_0 = stackOut_21_0;
                      break L7;
                    }
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_26_0 = stackOut_19_0;
                    break L7;
                  }
                }
                L8: {
                  var16 = stackIn_26_0;
                  if (var13 == 0) {
                    if (var9 <= var3 + -2097152) {
                      if (var30.a(2097152 + var9, 2097152, var7, 2097152, true, 1, (byte) -86)) {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        break L8;
                      } else {
                        stackOut_31_0 = 0;
                        stackIn_34_0 = stackOut_31_0;
                        break L8;
                      }
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_34_0 = stackOut_29_0;
                      break L8;
                    }
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_34_0 = stackOut_27_0;
                    break L8;
                  }
                }
                L9: {
                  var17 = stackIn_34_0;
                  if (var14 == 0) {
                    if (var7 >= 2097152) {
                      if (var30.a(var9, 2097152, -2097152 + var7, 2097152, true, 1, (byte) -44)) {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        break L9;
                      } else {
                        stackOut_39_0 = 0;
                        stackIn_42_0 = stackOut_39_0;
                        break L9;
                      }
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_42_0 = stackOut_37_0;
                      break L9;
                    }
                  } else {
                    stackOut_35_0 = 1;
                    stackIn_42_0 = stackOut_35_0;
                    break L9;
                  }
                }
                L10: {
                  var18 = stackIn_42_0;
                  if (var15 == 0) {
                    if (var7 <= -2097152 + var4) {
                      if (var30.a(var9, 2097152, 2097152 + var7, 2097152, true, 1, (byte) 92)) {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        break L10;
                      } else {
                        stackOut_47_0 = 0;
                        stackIn_50_0 = stackOut_47_0;
                        break L10;
                      }
                    } else {
                      stackOut_45_0 = 1;
                      stackIn_50_0 = stackOut_45_0;
                      break L10;
                    }
                  } else {
                    stackOut_43_0 = 1;
                    stackIn_50_0 = stackOut_43_0;
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
                            stackOut_100_0 = 1;
                            stackIn_102_0 = stackOut_100_0;
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (-2097153 >= (var9 ^ -1)) {
                        if (var7 >= 2097152) {
                          if (var30.a(-2097152 + var9, 2097152, var7 + -2097152, 2097152, true, 1, (byte) -103)) {
                            stackOut_99_0 = 1;
                            stackIn_102_0 = stackOut_99_0;
                            break L16;
                          } else {
                            stackOut_98_0 = 0;
                            stackIn_102_0 = stackOut_98_0;
                            break L16;
                          }
                        } else {
                          stackOut_96_0 = 1;
                          stackIn_102_0 = stackOut_96_0;
                          break L16;
                        }
                      } else {
                        stackOut_94_0 = 1;
                        stackIn_102_0 = stackOut_94_0;
                        break L16;
                      }
                    }
                    L18: {
                      L19: {
                        var22 = stackIn_102_0;
                        if (var13 == 0) {
                          break L19;
                        } else {
                          if (var14 != 0) {
                            stackOut_112_0 = 1;
                            stackIn_114_0 = stackOut_112_0;
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      if (var9 <= -2097152 + var3) {
                        if ((var7 ^ -1) <= -2097153) {
                          if (var30.a(2097152 + var9, 2097152, var7 - 2097152, 2097152, true, 1, (byte) 114)) {
                            stackOut_111_0 = 1;
                            stackIn_114_0 = stackOut_111_0;
                            break L18;
                          } else {
                            stackOut_110_0 = 0;
                            stackIn_114_0 = stackOut_110_0;
                            break L18;
                          }
                        } else {
                          stackOut_108_0 = 1;
                          stackIn_114_0 = stackOut_108_0;
                          break L18;
                        }
                      } else {
                        stackOut_106_0 = 1;
                        stackIn_114_0 = stackOut_106_0;
                        break L18;
                      }
                    }
                    L20: {
                      L21: {
                        var23 = stackIn_114_0;
                        if (var12 == 0) {
                          break L21;
                        } else {
                          if (var15 == 0) {
                            break L21;
                          } else {
                            stackOut_116_0 = 1;
                            stackIn_126_0 = stackOut_116_0;
                            break L20;
                          }
                        }
                      }
                      if (-2097153 >= (var9 ^ -1)) {
                        if (var7 <= -2097152 + var4) {
                          if (var30.a(var9 + -2097152, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 126)) {
                            stackOut_124_0 = 1;
                            stackIn_126_0 = stackOut_124_0;
                            break L20;
                          } else {
                            stackOut_123_0 = 0;
                            stackIn_126_0 = stackOut_123_0;
                            break L20;
                          }
                        } else {
                          stackOut_121_0 = 1;
                          stackIn_126_0 = stackOut_121_0;
                          break L20;
                        }
                      } else {
                        stackOut_119_0 = 1;
                        stackIn_126_0 = stackOut_119_0;
                        break L20;
                      }
                    }
                    L22: {
                      L23: {
                        var24 = stackIn_126_0;
                        if (var13 == 0) {
                          break L23;
                        } else {
                          if (var15 == 0) {
                            break L23;
                          } else {
                            stackOut_128_0 = 1;
                            stackIn_138_0 = stackOut_128_0;
                            break L22;
                          }
                        }
                      }
                      if (var9 <= var3 + -2097152) {
                        if (var7 <= -2097152 + var4) {
                          if (var30.a(2097152 + var9, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 77)) {
                            stackOut_136_0 = 1;
                            stackIn_138_0 = stackOut_136_0;
                            break L22;
                          } else {
                            stackOut_135_0 = 0;
                            stackIn_138_0 = stackOut_135_0;
                            break L22;
                          }
                        } else {
                          stackOut_133_0 = 1;
                          stackIn_138_0 = stackOut_133_0;
                          break L22;
                        }
                      } else {
                        stackOut_131_0 = 1;
                        stackIn_138_0 = stackOut_131_0;
                        break L22;
                      }
                    }
                    L24: {
                      var25 = stackIn_138_0;
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
                    if (var20 == -4) {
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
                      if (-3 == var20) {
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
                              break L30;
                            }
                          }
                          L31: {
                            if (var17 != 0) {
                              break L31;
                            } else {
                              break L31;
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
                var31.field_e = (kva) this;
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
        int var3 = -114 % ((param0 - -8) / 40);
        super.a((byte) -68, param1);
        param1.a((byte) -127, ((kva) this).field_v, 2);
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        dpa var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 < 0) {
            ((kva) this).field_o = 122;
        }
        super.h(70);
        if (null == ((kva) this).field_m) {
            return;
        }
        for (var2 = 0; ((kva) this).field_o > var2; var2++) {
            for (var3 = 0; var3 < ((kva) this).field_t; var3++) {
                var4 = ((kva) this).field_m[var2][var3];
                var5 = ku.field_j[var4.field_j];
                var4.field_f = dfa.a(-var4.field_f + var5, 2048, 93);
                var4.field_i = -var4.field_i;
            }
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
            field_r = null;
        }
        return 2;
    }

    final void a(int param0, uw param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (((kva) this).field_m != null) {
            var4 = 0;
            L1: while (true) {
              if (((kva) this).field_o <= var4) {
                break L0;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((kva) this).field_t) {
                    var4++;
                    continue L1;
                  } else {
                    var9 = ((kva) this).field_m[var4][var5];
                    var6 = var9;
                    if (var9 != null) {
                      if (var9.field_j != 3) {
                        L3: while (true) {
                          if (var6 != null) {
                            param1.a(param0, (fo) (Object) var6, (byte) -33);
                            var6 = var6.field_b;
                            continue L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (((kva) this).field_q != null) {
            var4 = 0;
            L5: while (true) {
              if (((kva) this).field_o <= var4) {
                break L4;
              } else {
                var8 = 0;
                var5 = var8;
                L6: while (true) {
                  if (var8 >= ((kva) this).field_t) {
                    var4++;
                    continue L5;
                  } else {
                    if (((kva) this).field_q[var4][var8] != null) {
                      param1.a(0, (fo) (Object) ((kva) this).field_q[var4][var8], (byte) -33);
                      var8++;
                      continue L6;
                    } else {
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            break L4;
          }
        }
        L7: {
          if (param2 > 40) {
            break L7;
          } else {
            field_s = null;
            break L7;
          }
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
        int var6 = -76 / ((param4 - -38) / 47);
    }

    final ka a(byte param0, oia param1) {
        int var3 = 102 / ((param0 - -68) / 49);
        int var7 = ((kva) this).field_v;
        if (-1 == (var7 ^ -1)) {
            return null;
        }
        if (1 != var7) {
            return null;
        }
        int var4 = param1.b((byte) 111) / 2097152 % 3;
        int var5 = param1.c((byte) 102) / 2097152 % 3;
        int var6 = 3 * var5 + (80 + var4);
        return df.field_J[var6];
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
            int discarded$0 = ((kva) this).f((byte) -126);
        }
        super.a(122, param1, param2);
        if (!(param1.field_E < 19)) {
            ((kva) this).field_v = param2.b((byte) 44, 2);
        }
    }

    private final void j(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oia var8 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = ((kva) this).field_h.d(3);
        int var3 = ((kva) this).field_h.e(param0 + -211);
        if (param0 != 9859) {
            return;
        }
        ((kva) this).field_q = new oia[((kva) this).field_o][((kva) this).field_t];
        int var4 = -(((kva) this).field_h.a((byte) 55) / 2) + var3 - -1048576;
        for (var5 = 0; ((kva) this).field_t > var5; var5++) {
            var6 = 1048576 + (var2 - ((kva) this).field_h.c(-100) / 2);
            for (var7 = 0; var7 < ((kva) this).field_o; var7++) {
                var8 = new oia();
                ((kva) this).field_q[var7][var5] = var8;
                var8.field_c = (kva) this;
                var8.field_b = var4 - var3;
                var8.field_a = var6 + -var2;
                var6 = var6 + 2097152;
            }
            var4 = var4 + 2097152;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int var4 = 0;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (null == ((kva) this).field_m) {
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (((kva) this).field_o <= var4) {
                break L0;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((kva) this).field_t) {
                    var4++;
                    continue L1;
                  } else {
                    var9 = ((kva) this).field_m[var4][var5];
                    var6 = var9;
                    if (var9 != null) {
                      if ((var9.field_j ^ -1) != -4) {
                        L3: while (true) {
                          if (var6 != null) {
                            param2.a((byte) -5, param1, (fo) (Object) var6);
                            var6 = var6.field_b;
                            continue L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
        L4: {
          if (null == ((kva) this).field_q) {
            break L4;
          } else {
            var4 = 0;
            L5: while (true) {
              if (var4 >= ((kva) this).field_o) {
                break L4;
              } else {
                var8 = 0;
                var5 = var8;
                L6: while (true) {
                  if (((kva) this).field_t <= var8) {
                    var4++;
                    continue L5;
                  } else {
                    if (null != ((kva) this).field_q[var4][var8]) {
                      param2.a((byte) 17, 0, (fo) (Object) ((kva) this).field_q[var4][var8]);
                      var8++;
                      continue L6;
                    } else {
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        }
        L7: {
          if (param0 >= 50) {
            break L7;
          } else {
            int discarded$1 = ((kva) this).k((byte) 96);
            break L7;
          }
        }
    }

    final void b(int param0, uw param1) {
        aga var6 = null;
        ev var4 = null;
        sva var5 = null;
        if (!(null != ((kva) this).field_m)) {
            this.n((byte) -110);
        }
        if (((kva) this).field_q == null) {
            this.j(9859);
        }
        if (!((((kva) this).field_v ^ -1) != -2)) {
            var6 = new aga(tga.field_a, 0, 0, 0, 0, 16720418, 200, 8);
            ((kva) this).field_u = new uh(var6);
            ((kva) this).field_u.a(-17825792 + ((kva) this).e((byte) -118) + 4194304, (byte) 95, ((kva) this).c((byte) 108), ((kva) this).b((byte) 84));
            var4 = param1.a((byte) 59);
            if (!(!(var4 instanceof sva))) {
                var5 = (sva) (Object) var4;
                var5.a((byte) 45, ((kva) this).field_u);
            }
        }
        super.b(param0 + param0, param1);
    }

    final void b(int param0, int param1) {
        ((kva) this).field_v = param1;
        if (param0 != 2097152) {
            ((kva) this).field_u = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Wandering walls";
        field_s = new kea();
    }
}
