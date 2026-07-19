/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_b;
    private int[][] field_g;
    int[] field_e;
    int[] field_l;
    static cn field_c;
    boolean field_h;
    private int[] field_d;
    static String field_k;
    static String field_a;
    boolean field_i;
    int field_j;
    boolean field_f;

    private dk(cn param0, int param1, String param2) {
        this(param0, param1, param0.a(true, param2, param1));
    }

    dk(cn param0, String param1, String param2) {
        this(param0, param0.b(param1, -7768), param2);
    }

    private final void a(int param0, uia param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        dn var5 = null;
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  var3_int = param1.h(255);
                  if (var3_int == 0) {
                    break L3;
                  } else {
                    this.a(var3_int, param1, 16588);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 < -89) {
                  break L2;
                } else {
                  var5 = (dn) null;
                  discarded$2 = dk.a((dn) null, -51);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 104) {
            return;
        }
        field_c = null;
        field_k = null;
    }

    final int a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          var4 = 0;
          if (param1) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 > 82) {
            break L1;
          } else {
            dk.a((byte) -28);
            break L1;
          }
        }
        var6 = 0;
        L2: while (true) {
          if (var6 < var5) {
            stackOut_8_0 = var4;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (var8 == 0) {
              var7 = stackIn_10_0;
              L3: while (true) {
                L4: {
                  if (var7 >= this.field_e.length) {
                    L5: {
                      if (-1 <= (this.field_b ^ -1)) {
                        break L5;
                      } else {
                        var4 = this.field_b;
                        break L5;
                      }
                    }
                    var6++;
                    break L4;
                  } else {
                    var3 = var3 + this.field_e[var7];
                    var7++;
                    if (var8 != 0) {
                      break L4;
                    } else {
                      continue L3;
                    }
                  }
                }
                continue L2;
              }
            } else {
              return stackIn_9_0;
            }
          } else {
            return var3;
          }
        }
    }

    private final void a(int param0, uia param1, int param2) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int[] array$14 = null;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == 16588) {
              L1: {
                L2: {
                  if (param0 != 1) {
                    break L2;
                  } else {
                    var4_int = param1.d(127);
                    this.field_e = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var4_int) {
                          this.field_l = new int[var4_int];
                          break L4;
                        } else {
                          this.field_e[var5] = param1.d(121);
                          var5++;
                          if (var8 != 0) {
                            break L4;
                          } else {
                            continue L3;
                          }
                        }
                      }
                      var5 = 0;
                      L5: while (true) {
                        L6: {
                          if (var4_int <= var5) {
                            var5 = 0;
                            break L6;
                          } else {
                            this.field_l[var5] = param1.d(124);
                            var5++;
                            if (var8 != 0) {
                              break L6;
                            } else {
                              continue L5;
                            }
                          }
                        }
                        L7: while (true) {
                          L8: {
                            if (var4_int <= var5) {
                              break L8;
                            } else {
                              this.field_l[var5] = (param1.d(123) << 1872739824) - -this.field_l[var5];
                              var5++;
                              if (var8 != 0) {
                                break L1;
                              } else {
                                if (var8 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (2 != param0) {
                    break L9;
                  } else {
                    this.field_b = param1.d(122);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (param0 == 3) {
                    break L10;
                  } else {
                    L11: {
                      if (5 == param0) {
                        break L11;
                      } else {
                        L12: {
                          if (6 == param0) {
                            break L12;
                          } else {
                            L13: {
                              if (param0 == 7) {
                                break L13;
                              } else {
                                L14: {
                                  if ((param0 ^ -1) == -9) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (9 != param0) {
                                        break L15;
                                      } else {
                                        discarded$9 = param1.h(255);
                                        if (var8 == 0) {
                                          break L1;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (-11 != (param0 ^ -1)) {
                                        break L16;
                                      } else {
                                        discarded$10 = param1.h(255);
                                        if (var8 == 0) {
                                          break L1;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if ((param0 ^ -1) != -12) {
                                        break L17;
                                      } else {
                                        discarded$11 = param1.h(255);
                                        if (var8 == 0) {
                                          break L1;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if (12 == param0) {
                                      var4_int = param1.h(255);
                                      var5 = 0;
                                      L18: while (true) {
                                        L19: {
                                          if (var5 >= var4_int) {
                                            var5 = 0;
                                            break L19;
                                          } else {
                                            discarded$12 = param1.d(125);
                                            var5++;
                                            if (var8 != 0) {
                                              break L19;
                                            } else {
                                              continue L18;
                                            }
                                          }
                                        }
                                        L20: while (true) {
                                          if (var4_int <= var5) {
                                            if (var8 == 0) {
                                              break L1;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            discarded$13 = param1.d(121);
                                            var5++;
                                            if (var8 != 0) {
                                              break L1;
                                            } else {
                                              continue L20;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L21: {
                                        if (-14 != (param0 ^ -1)) {
                                          break L21;
                                        } else {
                                          var4_int = param1.d(121);
                                          this.field_g = new int[var4_int][];
                                          var5 = 0;
                                          L22: while (true) {
                                            if (var4_int <= var5) {
                                              if (var8 == 0) {
                                                break L1;
                                              } else {
                                                break L21;
                                              }
                                            } else {
                                              var6 = param1.h(255);
                                              if (var8 != 0) {
                                                break L1;
                                              } else {
                                                L23: {
                                                  L24: {
                                                    if (var6 <= 0) {
                                                      break L24;
                                                    } else {
                                                      array$14 = new int[var6];
                                                      this.field_g[var5] = array$14;
                                                      this.field_g[var5][0] = param1.a(-32768);
                                                      var7 = 1;
                                                      L25: while (true) {
                                                        if (var7 >= var6) {
                                                          break L24;
                                                        } else {
                                                          this.field_g[var5][var7] = param1.d(123);
                                                          var7++;
                                                          if (var8 != 0) {
                                                            break L23;
                                                          } else {
                                                            continue L25;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var5++;
                                                  break L23;
                                                }
                                                continue L22;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L26: {
                                        if (-15 != (param0 ^ -1)) {
                                          break L26;
                                        } else {
                                          this.field_h = true;
                                          if (var8 == 0) {
                                            break L1;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      L27: {
                                        if (-16 != (param0 ^ -1)) {
                                          break L27;
                                        } else {
                                          this.field_i = true;
                                          if (var8 == 0) {
                                            break L1;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      if (param0 == 16) {
                                        break L1;
                                      } else {
                                        if (18 == param0) {
                                          break L1;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                                this.field_j = param1.h(255);
                                this.field_f = false;
                                if (var8 == 0) {
                                  break L1;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            discarded$15 = param1.d(126);
                            if (var8 == 0) {
                              break L1;
                            } else {
                              break L12;
                            }
                          }
                        }
                        discarded$16 = param1.d(param2 ^ 16563);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L11;
                        }
                      }
                    }
                    discarded$17 = param1.h(255);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L10;
                    }
                  }
                }
                var4_int = param1.h(param2 ^ 16435);
                this.field_d = new int[var4_int - -1];
                var5 = 0;
                L28: while (true) {
                  if (var4_int <= var5) {
                    this.field_d[var4_int] = 9999999;
                    break L1;
                  } else {
                    this.field_d[var5] = param1.h(255);
                    var5++;
                    if (var8 != 0) {
                      break L1;
                    } else {
                      continue L28;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var4 = decompiledCaughtException;
            stackOut_87_0 = (RuntimeException) (var4);
            stackOut_87_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param1 == null) {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L29;
            } else {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L29;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(dn param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 == lsa.field_c) {
              stackOut_7_0 = 9216;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param0 != gd.field_H) {
                if (gq.field_u != param0) {
                  if (param1 == 0) {
                    throw new IllegalArgumentException();
                  } else {
                    stackOut_10_0 = 21;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_5_0 = 34066;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_2_0 = 34065;
                stackIn_3_0 = stackOut_2_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("dk.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    private dk(cn param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        this.field_j = 0;
        this.field_b = -1;
        try {
          L0: {
            L1: {
              this.field_f = true;
              var11 = param0.a(false, param1, param2);
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(-110, new uia(var11));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 >= this.field_l.length) {
                    break L4;
                  } else {
                    stackOut_5_0 = this.field_l[var6] ^ -1;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 >= (var5 ^ -1)) {
                          break L5;
                        } else {
                          var5 = this.field_l[var6];
                          break L5;
                        }
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6 = 0;
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              }
              var7 = stackIn_10_0;
              L6: while (true) {
                L7: {
                  if (var7 >= this.field_e.length) {
                    break L7;
                  } else {
                    if (var8 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L8: {
                        if (var6 >= this.field_e[var7]) {
                          break L8;
                        } else {
                          var6 = this.field_e[var7];
                          break L8;
                        }
                      }
                      var7++;
                      if (var8 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (runtimeException);
            stackOut_17_1 = new StringBuilder().append("dk.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L9;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_k = "Despite his bank manager's despair, the previous occupant of the temple hid his cash in plain sight. Grab the coins for points.";
        field_a = "Lagoons of lava";
    }
}
