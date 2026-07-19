/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int[] field_a;
    static db field_u;
    static String field_g;
    static String[] field_p;
    private int[] field_l;
    int[] field_m;
    el field_b;
    int field_i;
    private byte[] field_v;
    static String field_h;
    int[][] field_n;
    int[] field_f;
    el[] field_c;
    static String field_e;
    private int field_k;
    int[] field_r;
    int field_s;
    int[] field_t;
    static int field_q;
    int field_d;
    byte[][] field_o;
    private int[][] field_j;

    public static void a(int param0) {
        if (param0 != 1) {
            field_q = 62;
        }
        field_g = null;
        field_p = null;
        field_e = null;
        field_h = null;
        field_u = null;
    }

    final static tf a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tf var7 = null;
        int var8 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_7_0 = null;
        tf stackIn_10_0 = null;
        tf stackIn_14_0 = null;
        tf stackIn_18_0 = null;
        tf stackIn_21_0 = null;
        tf stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_3_0 = null;
        tf stackOut_13_0 = null;
        tf stackOut_17_0 = null;
        tf stackOut_20_0 = null;
        tf stackOut_23_0 = null;
        tf stackOut_9_0 = null;
        tf stackOut_6_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = w.field_k;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -256) {
                if (param1 < -69) {
                  var3 = dc.a(param0, '.', (byte) -125);
                  if (2 > var3.length) {
                    stackOut_13_0 = w.field_k;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if ((var4.length ^ -1) >= (var5 ^ -1)) {
                            break L3;
                          } else {
                            var6 = var4[var5];
                            stackOut_17_0 = nc.a(63, var6);
                            stackIn_24_0 = stackOut_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var8 != 0) {
                              break L2;
                            } else {
                              var7 = stackIn_18_0;
                              if (var7 != null) {
                                stackOut_20_0 = (tf) (var7);
                                stackIn_21_0 = stackOut_20_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                var5++;
                                if (var8 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        stackOut_23_0 = bg.a(var3[var3.length - 1], -21637);
                        stackIn_24_0 = stackOut_23_0;
                        break L2;
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_9_0 = (tf) null;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = vi.field_l;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("e.A(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0;
                } else {
                  return stackIn_21_0;
                }
              }
            }
          }
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = th.field_u.a((byte) 127, param0, "");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("e.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, byte[] param1) {
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        wf var17 = null;
        wf var18 = null;
        byte[] var22 = null;
        wf stackIn_4_0 = null;
        wf stackIn_5_0 = null;
        wf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_120_0 = 0;
        int[] stackIn_124_0 = null;
        int[] stackIn_134_0 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_143_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wf stackOut_3_0 = null;
        wf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        wf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_119_0 = 0;
        int[] stackOut_123_0 = null;
        int[] stackOut_133_0 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_m = (int[]) null;
                break L1;
              }
            }
            L2: {
              var17 = new wf(qk.a(-121, param1));
              var18 = var17;
              stackOut_3_0 = (wf) (var18);
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param0) {
                stackOut_5_0 = (wf) ((Object) stackIn_5_0);
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (wf) ((Object) stackIn_4_0);
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              var4 = ((wf) (Object) stackIn_6_0).d(stackIn_6_1 != 0);
              if (5 > var4) {
                break L3;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L4: {
                    L5: {
                      if ((var4 ^ -1) > -7) {
                        break L5;
                      } else {
                        this.field_s = var18.d((byte) 19);
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_s = 0;
                    break L4;
                  }
                  L6: {
                    var5 = var18.d(true);
                    if ((var5 & 1) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L6;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L6;
                    }
                  }
                  L7: {
                    var6 = stackIn_17_0;
                    if (0 == (2 & var5)) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L7;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var7 = stackIn_20_0;
                      if (var4 >= 7) {
                        break L9;
                      } else {
                        this.field_k = var18.b(-1698573656);
                        if (var16 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    this.field_k = var18.a((byte) 50);
                    break L8;
                  }
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          L14: {
                            L15: {
                              L16: {
                                var8 = 0;
                                var9 = -1;
                                this.field_f = new int[this.field_k];
                                if (-8 < (var4 ^ -1)) {
                                  break L16;
                                } else {
                                  var10 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                                        break L18;
                                      } else {
                                        dupTemp$7 = var8 + var17.a((byte) 50);
                                        var8 = dupTemp$7;
                                        this.field_f[var10] = dupTemp$7;
                                        stackOut_27_0 = this.field_f[var10];
                                        stackOut_27_1 = var9;
                                        stackIn_44_0 = stackOut_27_0;
                                        stackIn_44_1 = stackOut_27_1;
                                        stackIn_28_0 = stackOut_27_0;
                                        stackIn_28_1 = stackOut_27_1;
                                        if (var16 != 0) {
                                          break L15;
                                        } else {
                                          L19: {
                                            if (stackIn_28_0 <= stackIn_28_1) {
                                              break L19;
                                            } else {
                                              var9 = this.field_f[var10];
                                              break L19;
                                            }
                                          }
                                          var10++;
                                          if (var16 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              L20: while (true) {
                                if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                                  break L14;
                                } else {
                                  dupTemp$8 = var8 + var17.b(-1698573656);
                                  var8 = dupTemp$8;
                                  this.field_f[var10] = dupTemp$8;
                                  stackOut_34_0 = this.field_f[var10];
                                  stackOut_34_1 = var9;
                                  stackIn_44_0 = stackOut_34_0;
                                  stackIn_44_1 = stackOut_34_1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  if (var16 != 0) {
                                    break L15;
                                  } else {
                                    L21: {
                                      if (stackIn_35_0 <= stackIn_35_1) {
                                        break L21;
                                      } else {
                                        var9 = this.field_f[var10];
                                        break L21;
                                      }
                                    }
                                    var10++;
                                    if (var16 == 0) {
                                      continue L20;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                            L22: while (true) {
                              if (stackIn_44_0 <= stackIn_44_1) {
                                break L12;
                              } else {
                                this.field_l[var10] = -1;
                                var10++;
                                if (var16 != 0) {
                                  break L11;
                                } else {
                                  if (var16 == 0) {
                                    stackOut_43_0 = this.field_d;
                                    stackOut_43_1 = var10;
                                    stackIn_44_0 = stackOut_43_0;
                                    stackIn_44_1 = stackOut_43_1;
                                    continue L22;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          L23: {
                            this.field_d = 1 + var9;
                            this.field_n = new int[this.field_d][];
                            this.field_t = new int[this.field_d];
                            if (var7 == 0) {
                              break L23;
                            } else {
                              this.field_o = new byte[this.field_d][];
                              break L23;
                            }
                          }
                          this.field_r = new int[this.field_d];
                          this.field_a = new int[this.field_d];
                          this.field_m = new int[this.field_d];
                          if (var6 != 0) {
                            this.field_l = new int[this.field_d];
                            var10 = 0;
                            L24: while (true) {
                              stackOut_43_0 = this.field_d;
                              stackOut_43_1 = var10;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              if (stackIn_44_0 <= stackIn_44_1) {
                                break L12;
                              } else {
                                this.field_l[var10] = -1;
                                var10++;
                                if (var16 != 0) {
                                  break L11;
                                } else {
                                  if (var16 == 0) {
                                    continue L24;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        break L12;
                      }
                      var10 = 0;
                      break L11;
                    }
                    L25: while (true) {
                      L26: {
                        if (var10 >= this.field_k) {
                          break L26;
                        } else {
                          this.field_l[this.field_f[var10]] = var17.d((byte) 19);
                          var10++;
                          if (var16 != 0) {
                            break L10;
                          } else {
                            if (var16 == 0) {
                              continue L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      this.field_b = new el(this.field_l);
                      break L10;
                    }
                  }
                  var10 = 0;
                  L27: while (true) {
                    L28: {
                      L29: {
                        L30: {
                          L31: {
                            L32: {
                              L33: {
                                if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                                  break L33;
                                } else {
                                  this.field_r[this.field_f[var10]] = var17.d((byte) 19);
                                  var10++;
                                  if (var16 != 0) {
                                    break L32;
                                  } else {
                                    if (var16 == 0) {
                                      continue L27;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                              }
                              if (var7 != 0) {
                                break L32;
                              } else {
                                var10 = 0;
                                L34: while (true) {
                                  if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                                    break L31;
                                  } else {
                                    this.field_t[this.field_f[var10]] = var17.d((byte) 19);
                                    var10++;
                                    if (var16 != 0) {
                                      break L30;
                                    } else {
                                      if (var16 == 0) {
                                        continue L34;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                                    break L37;
                                  } else {
                                    var22 = new byte[64];
                                    var18.a(110, 64, 0, var22);
                                    this.field_o[this.field_f[var10]] = var22;
                                    var10++;
                                    if (var16 != 0) {
                                      break L36;
                                    } else {
                                      if (var16 == 0) {
                                        continue L35;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L36;
                              }
                              L38: while (true) {
                                if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                                  break L31;
                                } else {
                                  this.field_t[this.field_f[var10]] = var17.d((byte) 19);
                                  var10++;
                                  if (var16 != 0) {
                                    break L30;
                                  } else {
                                    if (var16 == 0) {
                                      continue L38;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var4 >= 7) {
                            break L30;
                          } else {
                            var10 = 0;
                            L39: while (true) {
                              L40: {
                                L41: {
                                  if (var10 >= this.field_k) {
                                    break L41;
                                  } else {
                                    this.field_m[this.field_f[var10]] = var17.b(-1698573656);
                                    var10++;
                                    if (var16 != 0) {
                                      break L40;
                                    } else {
                                      if (var16 == 0) {
                                        continue L39;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L40;
                              }
                              L42: while (true) {
                                L43: {
                                  if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                                    break L43;
                                  } else {
                                    var11 = this.field_f[var10];
                                    var8 = 0;
                                    var12 = this.field_m[var11];
                                    var13 = -1;
                                    array$9 = new int[var12];
                                    this.field_n[var11] = array$9;
                                    stackOut_86_0 = 0;
                                    stackIn_120_0 = stackOut_86_0;
                                    stackIn_87_0 = stackOut_86_0;
                                    if (var16 != 0) {
                                      break L28;
                                    } else {
                                      var14 = stackIn_87_0;
                                      L44: while (true) {
                                        L45: {
                                          L46: {
                                            if (var14 >= var12) {
                                              break L46;
                                            } else {
                                              dupTemp$10 = var8 + var17.b(-1698573656);
                                              var8 = dupTemp$10;
                                              this.field_n[var11][var14] = dupTemp$10;
                                              var15 = dupTemp$10;
                                              stackOut_89_0 = var13 ^ -1;
                                              stackOut_89_1 = var15 ^ -1;
                                              stackIn_94_0 = stackOut_89_0;
                                              stackIn_94_1 = stackOut_89_1;
                                              stackIn_90_0 = stackOut_89_0;
                                              stackIn_90_1 = stackOut_89_1;
                                              if (var16 != 0) {
                                                break L45;
                                              } else {
                                                L47: {
                                                  if (stackIn_90_0 <= stackIn_90_1) {
                                                    break L47;
                                                  } else {
                                                    var13 = var15;
                                                    break L47;
                                                  }
                                                }
                                                var14++;
                                                if (var16 == 0) {
                                                  continue L44;
                                                } else {
                                                  break L46;
                                                }
                                              }
                                            }
                                          }
                                          this.field_a[var11] = var13 - -1;
                                          stackOut_93_0 = var12 ^ -1;
                                          stackOut_93_1 = var13 + 1 ^ -1;
                                          stackIn_94_0 = stackOut_93_0;
                                          stackIn_94_1 = stackOut_93_1;
                                          break L45;
                                        }
                                        L48: {
                                          if (stackIn_94_0 == stackIn_94_1) {
                                            this.field_n[var11] = null;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                        var10++;
                                        if (var16 == 0) {
                                          continue L42;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L49: while (true) {
                          L50: {
                            L51: {
                              if (this.field_k <= var10) {
                                break L51;
                              } else {
                                this.field_m[this.field_f[var10]] = var17.a((byte) 50);
                                var10++;
                                if (var16 != 0) {
                                  break L50;
                                } else {
                                  if (var16 == 0) {
                                    continue L49;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            break L50;
                          }
                          L52: while (true) {
                            if (this.field_k <= var10) {
                              break L29;
                            } else {
                              var11 = this.field_f[var10];
                              var8 = 0;
                              var12 = this.field_m[var11];
                              var13 = -1;
                              array$11 = new int[var12];
                              this.field_n[var11] = array$11;
                              stackOut_107_0 = 0;
                              stackIn_120_0 = stackOut_107_0;
                              stackIn_108_0 = stackOut_107_0;
                              if (var16 != 0) {
                                break L28;
                              } else {
                                var14 = stackIn_108_0;
                                L53: while (true) {
                                  L54: {
                                    L55: {
                                      if ((var12 ^ -1) >= (var14 ^ -1)) {
                                        break L55;
                                      } else {
                                        dupTemp$12 = var8 + var17.a((byte) 50);
                                        var8 = dupTemp$12;
                                        this.field_n[var11][var14] = dupTemp$12;
                                        var15 = dupTemp$12;
                                        stackOut_110_0 = var13;
                                        stackOut_110_1 = var15;
                                        stackIn_116_0 = stackOut_110_0;
                                        stackIn_116_1 = stackOut_110_1;
                                        stackIn_111_0 = stackOut_110_0;
                                        stackIn_111_1 = stackOut_110_1;
                                        if (var16 != 0) {
                                          break L54;
                                        } else {
                                          L56: {
                                            if (stackIn_111_0 < stackIn_111_1) {
                                              var13 = var15;
                                              break L56;
                                            } else {
                                              break L56;
                                            }
                                          }
                                          var14++;
                                          if (var16 == 0) {
                                            continue L53;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    this.field_a[var11] = var13 + 1;
                                    stackOut_115_0 = var12 ^ -1;
                                    stackOut_115_1 = var13 + 1 ^ -1;
                                    stackIn_116_0 = stackOut_115_0;
                                    stackIn_116_1 = stackOut_115_1;
                                    break L54;
                                  }
                                  L57: {
                                    if (stackIn_116_0 != stackIn_116_1) {
                                      break L57;
                                    } else {
                                      this.field_n[var11] = null;
                                      break L57;
                                    }
                                  }
                                  var10++;
                                  if (var16 == 0) {
                                    continue L52;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_119_0 = var6;
                      stackIn_120_0 = stackOut_119_0;
                      break L28;
                    }
                    L58: {
                      if (stackIn_120_0 == 0) {
                        break L58;
                      } else {
                        this.field_j = new int[1 + var9][];
                        this.field_c = new el[1 + var9];
                        var10 = 0;
                        L59: while (true) {
                          if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            break L58;
                          } else {
                            var11 = this.field_f[var10];
                            stackOut_123_0 = this.field_m;
                            stackIn_124_0 = stackOut_123_0;
                            L60: while (true) {
                              var12 = stackIn_124_0[var11];
                              array$13 = new int[this.field_a[var11]];
                              this.field_j[var11] = array$13;
                              if (var16 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L0;
                              } else {
                                var13 = 0;
                                L61: while (true) {
                                  L62: {
                                    L63: {
                                      if (this.field_a[var11] <= var13) {
                                        break L63;
                                      } else {
                                        this.field_j[var11][var13] = -1;
                                        var13++;
                                        if (var16 != 0) {
                                          break L62;
                                        } else {
                                          if (var16 == 0) {
                                            continue L61;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                    }
                                    var13 = 0;
                                    break L62;
                                  }
                                  L64: while (true) {
                                    L65: {
                                      if (var13 >= var12) {
                                        break L65;
                                      } else {
                                        stackOut_133_0 = this.field_n[var11];
                                        stackIn_124_0 = stackOut_133_0;
                                        stackIn_134_0 = stackOut_133_0;
                                        if (var16 != 0) {
                                          continue L60;
                                        } else {
                                          L66: {
                                            L67: {
                                              if (stackIn_134_0 != null) {
                                                break L67;
                                              } else {
                                                var14 = var13;
                                                if (var16 == 0) {
                                                  break L66;
                                                } else {
                                                  break L67;
                                                }
                                              }
                                            }
                                            var14 = this.field_n[var11][var13];
                                            break L66;
                                          }
                                          this.field_j[var11][var14] = var17.d((byte) 19);
                                          var13++;
                                          if (var16 == 0) {
                                            continue L64;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                    }
                                    this.field_c[var11] = new el(this.field_j[var11]);
                                    var10++;
                                    if (var16 == 0) {
                                      continue L59;
                                    } else {
                                      break L58;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L3;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L68: {
            var3 = decompiledCaughtException;
            stackOut_140_0 = (RuntimeException) (var3);
            stackOut_140_1 = new StringBuilder().append("e.B(").append(param0).append(',');
            stackIn_142_0 = stackOut_140_0;
            stackIn_142_1 = stackOut_140_1;
            stackIn_141_0 = stackOut_140_0;
            stackIn_141_1 = stackOut_140_1;
            if (param1 == null) {
              stackOut_142_0 = (RuntimeException) ((Object) stackIn_142_0);
              stackOut_142_1 = (StringBuilder) ((Object) stackIn_142_1);
              stackOut_142_2 = "null";
              stackIn_143_0 = stackOut_142_0;
              stackIn_143_1 = stackOut_142_1;
              stackIn_143_2 = stackOut_142_2;
              break L68;
            } else {
              stackOut_141_0 = (RuntimeException) ((Object) stackIn_141_0);
              stackOut_141_1 = (StringBuilder) ((Object) stackIn_141_1);
              stackOut_141_2 = "{...}";
              stackIn_143_0 = stackOut_141_0;
              stackIn_143_1 = stackOut_141_1;
              stackIn_143_2 = stackOut_141_2;
              break L68;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_143_0), stackIn_143_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    e(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_i = oe.a(101, param0, param0.length);
            if ((param1 ^ -1) == (this.field_i ^ -1)) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (64 == param2.length) {
                      this.field_v = si.a(0, param0, -110, param0.length);
                      var4_int = 0;
                      L3: while (true) {
                        if (-65 >= (var4_int ^ -1)) {
                          break L2;
                        } else {
                          stackOut_8_0 = this;
                          stackIn_13_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((e) (this)).field_v[var4_int] == param2[var4_int]) {
                              var4_int++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                stackOut_12_0 = this;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              }
              this.a(false, param0);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("e.<init>(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_p = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = "Waiting for sound effects";
        field_e = "Return to game";
        field_q = 4;
    }
}
