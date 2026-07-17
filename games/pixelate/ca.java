/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    private long[] field_c;
    private int field_h;
    static String field_m;
    private long[] field_g;
    private int field_i;
    static String field_k;
    private byte[] field_j;
    private long[] field_d;
    static lc field_f;
    private byte[] field_l;
    static int[] field_a;
    private long[] field_b;
    private long[] field_e;

    final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 > 122) {
                break L1;
              } else {
                ca.b(-128);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= 32) {
                    break L4;
                  } else {
                    ((ca) this).field_l[var2_int] = (byte) 0;
                    var2_int++;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((ca) this).field_i = 0;
                ((ca) this).field_h = 0;
                ((ca) this).field_j[0] = (byte) 0;
                break L3;
              }
              var2_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (8 <= var2_int) {
                      break L7;
                    } else {
                      ((ca) this).field_g[var2_int] = 0L;
                      var2_int++;
                      if (var3 != 0) {
                        break L6;
                      } else {
                        if (var3 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "ca.C(" + param0 + 41);
        }
    }

    final static void a(int param0, rl param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_13_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_53_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = aq.a((byte) 32, 3 * (param0 + -param3));
            var6 = 3 * param3;
            L1: {
              var7 = var5_int + -10;
              int discarded$2 = -98;
              da.e();
              if (param1.field_B <= 0) {
                break L1;
              } else {
                if (null == param1.field_n) {
                  break L1;
                } else {
                  int discarded$3 = -37;
                  vf.a();
                  break L1;
                }
              }
            }
            mp.field_b = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var8 >= param1.field_j) {
                    break L4;
                  } else {
                    var9 = param1.field_h[var8];
                    var10 = param1.field_I[var8];
                    var11 = param1.field_o[var8];
                    stackOut_12_0 = 0;
                    stackIn_54_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_13_0 != 0) {
                            var12 = jp.field_a[var9];
                            var13 = al.field_m[var9];
                            var14 = -var12 + jp.field_a[var10];
                            var15 = -var12 + jp.field_a[var11];
                            var16 = -var13 + al.field_m[var10];
                            var17 = al.field_m[var11] + -var13;
                            if (var17 * var14 + -(var15 * var16) < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var12 = qe.field_v[var9];
                          if (var12 != -2147483648) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var13 = qe.field_v[var10];
                        if (-2147483648 == var13) {
                          break L5;
                        } else {
                          L8: {
                            var14 = qe.field_v[var11];
                            if (var14 != -2147483648) {
                              break L8;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var15 = -var6 + var12 - (-var13 + -var14);
                            if (var7 >= 0) {
                              stackOut_33_0 = var15 >> var7;
                              stackIn_34_0 = stackOut_33_0;
                              break L9;
                            } else {
                              stackOut_31_0 = var15 << -var7;
                              stackIn_34_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var16 = -stackIn_34_0 + (-1 + kb.field_N.length);
                          var17 = kb.field_N[var16];
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var17 >> 4 == 0) {
                                  break L12;
                                } else {
                                  var16--;
                                  stackOut_36_0 = ~var16;
                                  stackOut_36_1 = -1;
                                  stackIn_45_0 = stackOut_36_0;
                                  stackIn_45_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (var19 != 0) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (stackIn_37_0 <= stackIn_37_1) {
                                        break L13;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var17 = kb.field_N[var16];
                                    if (var19 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_44_0 = var17;
                              stackOut_44_1 = var16 << 4;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              break L11;
                            }
                            L14: {
                              var18 = stackIn_45_0 + stackIn_45_1;
                              nd.field_c[var18] = var8;
                              kb.field_N[var16] = var17 - -1;
                              if (param1.field_B <= 0) {
                                break L14;
                              } else {
                                if (null == param1.field_n) {
                                  break L14;
                                } else {
                                  sc.field_i[param1.field_n[var8]] = sc.field_i[param1.field_n[var8]] + 1;
                                  break L14;
                                }
                              }
                            }
                            mp.field_b = mp.field_b + 1;
                            break L5;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_53_0 = -1;
                stackIn_54_0 = stackOut_53_0;
                break L3;
              }
              L15: {
                L16: {
                  if (stackIn_54_0 <= ~param1.field_B) {
                    break L16;
                  } else {
                    if (param1.field_n == null) {
                      break L16;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (~sc.field_i.length >= ~var9) {
                          break L16;
                        } else {
                          var10 = sc.field_i[var9];
                          sc.field_i[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var5;
            stackOut_65_1 = new StringBuilder().append("ca.D(").append(param0).append(44);
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + 0 + 44 + param3 + 44 + 0 + 41);
        }
    }

    private final void b() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_59_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 8) {
                    break L3;
                  } else {
                    ((ca) this).field_c[var2_int] = fp.a(fp.a(mk.a(65280L, (long)((ca) this).field_j[var3 - -6] << 8), fp.a(fp.a(mk.a((long)((ca) this).field_j[4 + var3], 255L) << 24, fp.a(fp.a(fp.a(mk.a((long)((ca) this).field_j[1 + var3], 255L) << 48, (long)((ca) this).field_j[var3] << 56), mk.a(280375465082880L, (long)((ca) this).field_j[2 + var3] << 40)), mk.a((long)((ca) this).field_j[3 + var3], 255L) << 32)), mk.a((long)((ca) this).field_j[var3 + 5] << 16, 16711680L))), mk.a((long)((ca) this).field_j[7 + var3], 255L));
                    var2_int++;
                    var3 += 8;
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
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 8) {
                      break L6;
                    } else {
                      ((ca) this).field_d[var2_int] = ((ca) this).field_g[var2_int];
                      ((ca) this).field_e[var2_int] = fp.a(((ca) this).field_c[var2_int], ((ca) this).field_g[var2_int]);
                      var2_int++;
                      if (var6 != 0) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var2_int = 1;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var2_int > 10) {
                        break L9;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_60_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var6 != 0) {
                          break L8;
                        } else {
                          stackOut_18_0 = stackIn_18_0;
                          stackIn_20_0 = stackOut_18_0;
                          var3 = stackIn_20_0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var3 >= 8) {
                                  break L12;
                                } else {
                                  ((ca) this).field_b[var3] = 0L;
                                  var4 = 0;
                                  stackOut_22_0 = 56;
                                  stackIn_32_0 = stackOut_22_0;
                                  stackIn_23_0 = stackOut_22_0;
                                  if (var6 != 0) {
                                    break L11;
                                  } else {
                                    var5 = stackIn_23_0;
                                    L13: while (true) {
                                      L14: {
                                        L15: {
                                          if (var4 >= 8) {
                                            break L15;
                                          } else {
                                            ((ca) this).field_b[var3] = fp.a(((ca) this).field_b[var3], pg.field_b[var4][cm.a(255, (int)(((ca) this).field_d[cm.a(-var4 + var3, 7)] >>> var5))]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L14;
                                            } else {
                                              if (var6 == 0) {
                                                continue L13;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L14;
                                      }
                                      if (var6 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_31_0 = 0;
                              stackIn_32_0 = stackOut_31_0;
                              break L11;
                            }
                            var3 = stackIn_32_0;
                            L16: while (true) {
                              L17: {
                                L18: {
                                  if (var3 >= 8) {
                                    break L18;
                                  } else {
                                    ((ca) this).field_d[var3] = ((ca) this).field_b[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L17;
                                    } else {
                                      if (var6 == 0) {
                                        continue L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                ((ca) this).field_d[0] = fp.a(((ca) this).field_d[0], pg.field_c[var2_int]);
                                break L17;
                              }
                              var3 = 0;
                              L19: while (true) {
                                L20: {
                                  L21: {
                                    if (var3 >= 8) {
                                      break L21;
                                    } else {
                                      ((ca) this).field_b[var3] = ((ca) this).field_d[var3];
                                      var4 = 0;
                                      stackOut_41_0 = 56;
                                      stackIn_51_0 = stackOut_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      if (var6 != 0) {
                                        break L20;
                                      } else {
                                        var5 = stackIn_42_0;
                                        L22: while (true) {
                                          L23: {
                                            L24: {
                                              if (var4 >= 8) {
                                                break L24;
                                              } else {
                                                ((ca) this).field_b[var3] = fp.a(((ca) this).field_b[var3], pg.field_b[var4][cm.a((int)(((ca) this).field_e[cm.a(7, var3 + -var4)] >>> var5), 255)]);
                                                var5 -= 8;
                                                var4++;
                                                if (var6 != 0) {
                                                  break L23;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L23;
                                          }
                                          if (var6 == 0) {
                                            continue L19;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_50_0 = 0;
                                  stackIn_51_0 = stackOut_50_0;
                                  break L20;
                                }
                                var3 = stackIn_51_0;
                                L25: while (true) {
                                  L26: {
                                    L27: {
                                      if (var3 >= 8) {
                                        break L27;
                                      } else {
                                        ((ca) this).field_e[var3] = ((ca) this).field_b[var3];
                                        var3++;
                                        if (var6 != 0) {
                                          break L26;
                                        } else {
                                          if (var6 == 0) {
                                            continue L25;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    break L26;
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
                        }
                      }
                    }
                    var2_int = 0;
                    stackOut_59_0 = 41;
                    stackIn_60_0 = stackOut_59_0;
                    break L8;
                  }
                  if (stackIn_60_0 == 41) {
                    L28: while (true) {
                      L29: {
                        L30: {
                          if (var2_int >= 8) {
                            break L30;
                          } else {
                            ((ca) this).field_g[var2_int] = fp.a(((ca) this).field_g[var2_int], fp.a(((ca) this).field_c[var2_int], ((ca) this).field_e[var2_int]));
                            var2_int++;
                            if (var6 != 0) {
                              break L29;
                            } else {
                              if (var6 == 0) {
                                continue L28;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                        break L29;
                      }
                      break L0;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ca.F(" + 41 + 41);
        }
    }

    final static tf a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        tf var4 = null;
        int var5 = 0;
        tf stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_4_0 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = ge.field_c[0] * gf.field_g[0];
            var2 = wo.field_f[param0];
            var3 = new int[var1_int];
            var4_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int >= var1_int) {
                  break L2;
                } else {
                  var3[var4_int] = fl.field_g[cm.a((int) var2[var4_int], 255)];
                  var4_int++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = new tf(tj.field_y, jb.field_a, fa.field_b[0], e.field_b[0], gf.field_g[0], ge.field_c[0], var3);
              int discarded$2 = 140;
              re.b();
              stackOut_4_0 = (tf) var4;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ca.E(" + param0 + 41);
        }
        return stackIn_5_0;
    }

    final void a(byte[] param0, long param1, byte param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_9_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -(7 & (int)param1) & 7;
            var7 = ((ca) this).field_h & 7;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var11 < 0) {
                      break L4;
                    } else {
                      var12 = var12 + ((255 & ((ca) this).field_l[var11]) - -((int)var9 & 255));
                      ((ca) this).field_l[var11] = (byte)var12;
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
                    if (param1 <= 8L) {
                      break L3;
                    } else {
                      var8 = 255 & param0[var5_int] << var6 | (255 & param0[var5_int - -1]) >>> 8 - var6;
                      stackOut_8_0 = var8;
                      stackIn_24_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_9_0 < 0) {
                            break L6;
                          } else {
                            if (256 <= var8) {
                              break L6;
                            } else {
                              L7: {
                                ((ca) this).field_j[((ca) this).field_i] = (byte)bq.a((int) ((ca) this).field_j[((ca) this).field_i], var8 >>> var7);
                                ((ca) this).field_h = ((ca) this).field_h + (8 + -var7);
                                ((ca) this).field_i = ((ca) this).field_i + 1;
                                if (((ca) this).field_h == 512) {
                                  int discarded$2 = 41;
                                  this.b();
                                  ((ca) this).field_i = 0;
                                  ((ca) this).field_h = 0;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              ((ca) this).field_j[((ca) this).field_i] = (byte)cm.a(var8 << -var7 + 8, 255);
                              param1 = param1 - 8L;
                              ((ca) this).field_h = ((ca) this).field_h + var7;
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
                stackOut_23_0 = (0L < param1 ? -1 : (0L == param1 ? 0 : 1));
                stackIn_24_0 = stackOut_23_0;
                break L2;
              }
              L8: {
                L9: {
                  if (stackIn_24_0 < 0) {
                    break L9;
                  } else {
                    var8 = 0;
                    if (var13 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var8 = param0[var5_int] << var6 & 255;
                ((ca) this).field_j[((ca) this).field_i] = (byte)bq.a((int) ((ca) this).field_j[((ca) this).field_i], var8 >>> var7);
                break L8;
              }
              L10: {
                L11: {
                  var11 = -86 % ((param2 - 39) / 48);
                  if ((long)var7 + param1 >= 8L) {
                    break L11;
                  } else {
                    ((ca) this).field_h = (int)((long)((ca) this).field_h + param1);
                    if (var13 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  param1 = param1 - (long)(8 - var7);
                  ((ca) this).field_i = ((ca) this).field_i + 1;
                  ((ca) this).field_h = ((ca) this).field_h + (-var7 + 8);
                  if (((ca) this).field_h == 512) {
                    int discarded$3 = 41;
                    this.b();
                    ((ca) this).field_h = 0;
                    ((ca) this).field_i = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                ((ca) this).field_j[((ca) this).field_i] = (byte)cm.a(var8 << -var7 + 8, 255);
                ((ca) this).field_h = ((ca) this).field_h + (int)param1;
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("ca.G(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L13;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ca) this).field_j[((ca) this).field_i] = (byte)bq.a((int) ((ca) this).field_j[((ca) this).field_i], 128 >>> cm.a(((ca) this).field_h, 7));
              ((ca) this).field_i = ((ca) this).field_i + 1;
              if (((ca) this).field_i <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (((ca) this).field_i >= 64) {
                        break L4;
                      } else {
                        int fieldTemp$4 = ((ca) this).field_i;
                        ((ca) this).field_i = ((ca) this).field_i + 1;
                        ((ca) this).field_j[fieldTemp$4] = (byte) 0;
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
                    int discarded$5 = 41;
                    this.b();
                    break L3;
                  }
                  ((ca) this).field_i = 0;
                  break L1;
                }
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  if (32 <= ((ca) this).field_i) {
                    break L7;
                  } else {
                    int fieldTemp$6 = ((ca) this).field_i;
                    ((ca) this).field_i = ((ca) this).field_i + 1;
                    ((ca) this).field_j[fieldTemp$6] = (byte) 0;
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
                if (param2 == 16157) {
                  qb.a(((ca) this).field_l, 0, ((ca) this).field_j, 32, 32);
                  int discarded$7 = 41;
                  this.b();
                  break L6;
                } else {
                  return;
                }
              }
              var4_int = 0;
              var5 = param0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var4_int >= 8) {
                      break L10;
                    } else {
                      var6 = ((ca) this).field_g[var4_int];
                      param1[var5] = (byte)(int)(var6 >>> 56);
                      param1[var5 - -1] = (byte)(int)(var6 >>> 48);
                      param1[var5 - -2] = (byte)(int)(var6 >>> 40);
                      param1[var5 - -3] = (byte)(int)(var6 >>> 32);
                      param1[4 + var5] = (byte)(int)(var6 >>> 24);
                      param1[var5 + 5] = (byte)(int)(var6 >>> 16);
                      param1[var5 + 6] = (byte)(int)(var6 >>> 8);
                      param1[var5 + 7] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      if (var8 != 0) {
                        break L9;
                      } else {
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("ca.B(").append(param0).append(44);
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_a = null;
              field_m = null;
              field_k = null;
              if (param0 == 64) {
                break L1;
              } else {
                tf discarded$2 = ca.a(59);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ca.A(" + param0 + 41);
        }
    }

    ca() {
        ((ca) this).field_i = 0;
        ((ca) this).field_g = new long[8];
        ((ca) this).field_c = new long[8];
        ((ca) this).field_d = new long[8];
        ((ca) this).field_h = 0;
        ((ca) this).field_l = new byte[32];
        ((ca) this).field_b = new long[8];
        ((ca) this).field_j = new byte[64];
        ((ca) this).field_e = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Log in";
        field_f = null;
        field_k = "Invite players";
    }
}
