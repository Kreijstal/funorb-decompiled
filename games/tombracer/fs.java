/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs extends ci {
    static cn field_p;
    private int field_r;
    private int[] field_q;
    private int[] field_o;
    private short[] field_m;
    private int[][] field_n;

    public static void c(int param0) {
        if (param0 >= -91) {
            field_p = (cn) null;
        }
        field_p = null;
    }

    private final int[] d(int param0, int param1) {
        if (param0 <= param1) {
          if (this.field_n.length <= param1) {
            return this.field_q;
          } else {
            return this.field_n[param1];
          }
        } else {
          return this.field_o;
        }
    }

    public fs() {
        super(1, true);
        this.field_r = 0;
        this.field_m = new short[257];
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            wp.field_a = param2;
            int var4_int = 93 / ((param0 - -33) / 53);
            bta.field_q = 2;
            var5 = (CharSequence) ((Object) param2);
            mn.field_n = jd.a(1, var5);
            ica.field_b = param1;
            bb.a(-21844);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fs.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_59_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        byte stackOut_58_0 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  var21 = TombRacer.field_G ? 1 : 0;
                  var2 = this.field_r;
                  if (2 != var2) {
                    break L4;
                  } else {
                    if (var21 == 0) {
                      var2 = 0;
                      L5: while (true) {
                        stackOut_6_0 = -258;
                        stackOut_6_1 = var2 ^ -1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        L6: while (true) {
                          L7: {
                            if (stackIn_7_0 >= stackIn_7_1) {
                              break L7;
                            } else {
                              var4 = var2 << 782254020;
                              stackOut_8_0 = 1;
                              stackIn_59_0 = stackOut_8_0;
                              stackIn_9_0 = stackOut_8_0;
                              if (var21 != 0) {
                                break L0;
                              } else {
                                var3 = stackIn_9_0;
                                L8: while (true) {
                                  L9: {
                                    if (var3 >= -1 + this.field_n.length) {
                                      break L9;
                                    } else {
                                      stackOut_11_0 = this.field_n[var3][0];
                                      stackOut_11_1 = var4;
                                      stackIn_7_0 = stackOut_11_0;
                                      stackIn_7_1 = stackOut_11_1;
                                      stackIn_12_0 = stackOut_11_0;
                                      stackIn_12_1 = stackOut_11_1;
                                      if (var21 != 0) {
                                        continue L6;
                                      } else {
                                        if (stackIn_12_0 > stackIn_12_1) {
                                          break L9;
                                        } else {
                                          var3++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  L10: {
                                    var22 = this.field_n[var3 - 1];
                                    var34 = this.field_n[var3];
                                    var7 = this.d(0, -2 + var3)[1];
                                    var8 = var22[1];
                                    var9 = var34[1];
                                    var10 = this.d(0, var3 + 1)[1];
                                    var11 = (-var22[0] + var4 << 1398147340) / (var34[0] + -var22[0]);
                                    var12 = var11 * var11 >> 260446764;
                                    var13 = var8 + -var7 + (-var9 + var10);
                                    var14 = -var13 + (var7 - var8);
                                    var15 = var9 - var7;
                                    var16 = var8;
                                    var17 = var12 * (var11 * var13 >> -223934260) >> 2111480108;
                                    var18 = var12 * var14 >> 1658844204;
                                    var19 = var11 * var15 >> 1198129004;
                                    var20 = var16 + (var19 + (var17 - -var18));
                                    if (-32768 >= var20) {
                                      var20 = -32767;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (var20 >= 32768) {
                                      var20 = 32767;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  this.field_m[var2] = (short)var20;
                                  var2++;
                                  if (var21 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          if (var21 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                if (1 == var2) {
                  break L3;
                } else {
                  break L2;
                }
              }
              var2 = 0;
              L12: while (true) {
                stackOut_24_0 = 257;
                stackOut_24_1 = var2;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                L13: while (true) {
                  L14: {
                    if (stackIn_25_0 <= stackIn_25_1) {
                      break L14;
                    } else {
                      var4 = var2 << -2038277884;
                      stackOut_26_0 = 1;
                      stackIn_59_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var21 != 0) {
                        break L0;
                      } else {
                        var3 = stackIn_27_0;
                        L15: while (true) {
                          L16: {
                            if (-1 + this.field_n.length <= var3) {
                              break L16;
                            } else {
                              stackOut_29_0 = var4 ^ -1;
                              stackOut_29_1 = this.field_n[var3][0] ^ -1;
                              stackIn_25_0 = stackOut_29_0;
                              stackIn_25_1 = stackOut_29_1;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (var21 != 0) {
                                continue L13;
                              } else {
                                if (stackIn_30_0 > stackIn_30_1) {
                                  break L16;
                                } else {
                                  var3++;
                                  if (var21 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            var24 = this.field_n[-1 + var3];
                            var35 = this.field_n[var3];
                            var7 = (-var24[0] + var4 << -76075860) / (-var24[0] + var35[0]);
                            var8 = 4096 - lm.field_r[var7 >> -1557130555 & 255] >> 463104865;
                            var9 = -var8 + 4096;
                            var10 = var8 * var35[1] + var9 * var24[1] >> 947813388;
                            if (32767 > (var10 ^ -1)) {
                              break L17;
                            } else {
                              var10 = -32767;
                              break L17;
                            }
                          }
                          L18: {
                            if (-32769 < (var10 ^ -1)) {
                              break L18;
                            } else {
                              var10 = 32767;
                              break L18;
                            }
                          }
                          this.field_m[var2] = (short)var10;
                          var2++;
                          if (var21 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  if (var21 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = 0;
            L19: while (true) {
              stackOut_40_0 = 257;
              stackOut_40_1 = var2;
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              L20: while (true) {
                if (stackIn_41_0 <= stackIn_41_1) {
                  break L1;
                } else {
                  var4 = var2 << 516201444;
                  stackOut_42_0 = 1;
                  stackIn_59_0 = stackOut_42_0;
                  stackIn_43_0 = stackOut_42_0;
                  if (var21 != 0) {
                    break L0;
                  } else {
                    var3 = stackIn_43_0;
                    L21: while (true) {
                      L22: {
                        if (var3 >= -1 + this.field_n.length) {
                          break L22;
                        } else {
                          stackOut_45_0 = var4;
                          stackOut_45_1 = this.field_n[var3][0];
                          stackIn_41_0 = stackOut_45_0;
                          stackIn_41_1 = stackOut_45_1;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          if (var21 != 0) {
                            continue L20;
                          } else {
                            L23: {
                              if (stackIn_46_0 >= stackIn_46_1) {
                                break L23;
                              } else {
                                if (var21 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            var3++;
                            if (var21 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      L24: {
                        var26 = this.field_n[var3 - 1];
                        var36 = this.field_n[var3];
                        var7 = (var4 - var26[0] << 204886124) / (var36[0] - var26[0]);
                        var8 = -var7 + 4096;
                        var9 = var36[1] * var7 + var8 * var26[1] >> 2067492076;
                        if ((var9 ^ -1) >= 32767) {
                          var9 = -32767;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (var9 >= 32768) {
                          var9 = 32767;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      this.field_m[var2] = (short)var9;
                      var2++;
                      if (var21 == 0) {
                        continue L19;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_58_0 = param0;
          stackIn_59_0 = stackOut_58_0;
          break L0;
        }
        L26: {
          if (stackIn_59_0 >= 104) {
            break L26;
          } else {
            this.field_m = (short[]) null;
            break L26;
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_11_0 = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_10_0 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          return (int[]) null;
        } else {
          L0: {
            L1: {
              var8 = this.field_i.a((byte) 50, param1);
              var3 = var8;
              if (!this.field_i.field_d) {
                break L1;
              } else {
                var5 = this.c(0, param0 ^ -33, param1);
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ns.field_g) {
                    break L1;
                  } else {
                    stackOut_4_0 = (int[]) (var5);
                    stackIn_11_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var7 != 0) {
                      break L0;
                    } else {
                      L3: {
                        var4 = stackIn_5_0[var6] >> -2005568540;
                        if (0 <= var4) {
                          break L3;
                        } else {
                          var4 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        if ((var4 ^ -1) >= -257) {
                          break L4;
                        } else {
                          var4 = 256;
                          break L4;
                        }
                      }
                      var8[var6] = this.field_m[var4];
                      var6++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            stackOut_10_0 = (int[]) (var8);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          return stackIn_11_0;
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 < 21) {
            return -58;
        }
        return 7459 * param1 + param2;
    }

    final void b(byte param0) {
        L0: {
          if (param0 == 116) {
            break L0;
          } else {
            this.field_n = (int[][]) null;
            break L0;
          }
        }
        L1: {
          if (null == this.field_n) {
            this.field_n = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
            break L1;
          } else {
            break L1;
          }
        }
        if (2 > this.field_n.length) {
          throw new RuntimeException("Curve operation requires at least two markers");
        } else {
          L2: {
            if (-3 != (this.field_r ^ -1)) {
              break L2;
            } else {
              this.a(false);
              break L2;
            }
          }
          tka.b((byte) 59);
          this.d((byte) 119);
          return;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 != 0) {
                  break L2;
                } else {
                  this.field_r = param1.h(255);
                  this.field_n = new int[param1.h(255)][2];
                  var4_int = 0;
                  L3: while (true) {
                    if (this.field_n.length <= var4_int) {
                      break L2;
                    } else {
                      this.field_n[var4_int][0] = param1.d(126);
                      this.field_n[var4_int][1] = param1.d(126);
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 == 107) {
                break L1;
              } else {
                this.field_r = -36;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("fs.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!ej.a(false, param0, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= param1.length()) {
                      break L3;
                    } else {
                      stackOut_7_0 = ov.a(16, param1.charAt(var2_int));
                      stackIn_13_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (stackIn_8_0) {
                          var2_int++;
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("fs.E(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final void a(boolean param0) {
        int[] var9 = this.field_n[0];
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var2 = var6;
        if (param0) {
            this.d((byte) -128);
        }
        int[] var12 = this.field_n[1];
        int[] var4 = this.field_n[this.field_n.length - 2];
        int[] var5 = this.field_n[this.field_n.length - 1];
        this.field_o = new int[]{var9[0] - var12[0] + var9[0], var9[1] - -var9[1] + -var12[1]};
        this.field_q = new int[]{var4[0] - -var4[0] + -var5[0], var4[1] + var4[1] + -var5[1]};
    }

    static {
    }
}
