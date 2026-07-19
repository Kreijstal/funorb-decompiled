/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends tc implements uo {
    int field_k;
    int field_l;
    static String field_s;
    static long[] field_r;
    int field_z;
    int field_q;
    private lo field_C;
    static String field_p;
    private int field_A;
    String field_n;
    int[] field_D;
    int field_m;
    int field_u;
    int[] field_B;
    int[] field_y;
    static el field_I;
    int field_o;
    int field_v;
    cf field_G;
    kl field_H;
    int field_E;
    int field_w;
    int field_F;
    private int[] field_x;
    String field_J;
    private int field_t;

    public final void a(int param0, bv param1, String param2, byte param3) {
        fu discarded$2 = null;
        String discarded$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 37) {
                break L1;
              } else {
                discarded$2 = this.g(-112);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!param2.equals("id")) {
                    break L4;
                  } else {
                    if (-1 <= (param0 ^ -1)) {
                      break L3;
                    } else {
                      this.field_v = (int)tn.a(false, param0, param1);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (param2.equals("flg")) {
                    break L5;
                  } else {
                    L6: {
                      if (!param2.equals("name")) {
                        break L6;
                      } else {
                        if (-1 > (param0 ^ -1)) {
                          this.field_J = up.a(param1, param0, (byte) -82);
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L7: {
                      if (!param2.equals("key")) {
                        break L7;
                      } else {
                        if (param0 <= 0) {
                          break L3;
                        } else {
                          discarded$3 = up.a(param1, param0, (byte) -82);
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      if (param2.equals("pos")) {
                        break L8;
                      } else {
                        L9: {
                          if (!param2.equals("w")) {
                            break L9;
                          } else {
                            if (param0 <= 0) {
                              break L3;
                            } else {
                              this.field_A = (int)tn.a(false, param0, param1);
                              if (var7 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          if (param2.equals("h")) {
                            break L10;
                          } else {
                            L11: {
                              if (!param2.equals("mid")) {
                                break L11;
                              } else {
                                if (0 >= param0) {
                                  break L3;
                                } else {
                                  this.field_t = (int)tn.a(false, param0, param1);
                                  if (var7 == 0) {
                                    break L3;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            L12: {
                              if (param2.equals("ngb")) {
                                break L12;
                              } else {
                                L13: {
                                  if (param2.equals("mpsz")) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (!param2.equals("mpt")) {
                                        break L14;
                                      } else {
                                        if (-1 <= (param0 ^ -1)) {
                                          break L3;
                                        } else {
                                          this.field_z = (int)tn.a(false, param0, param1);
                                          if (var7 == 0) {
                                            break L3;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                    L15: {
                                      if (!param2.equals("ptc")) {
                                        break L15;
                                      } else {
                                        if (-1 > (param0 ^ -1)) {
                                          var5_int = ai.a(param1, true);
                                          this.field_B = new int[var5_int];
                                          var6 = 0;
                                          L16: while (true) {
                                            L17: {
                                              if (var5_int <= var6) {
                                                break L17;
                                              } else {
                                                this.field_B[var6] = (int)tn.a(false, 2, param1);
                                                var6++;
                                                if (var7 != 0) {
                                                  break L3;
                                                } else {
                                                  if (var7 == 0) {
                                                    continue L16;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                            }
                                            if (var7 == 0) {
                                              break L3;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L18: {
                                      if (!param2.equals("rwd")) {
                                        break L18;
                                      } else {
                                        if (-1 <= (param0 ^ -1)) {
                                          break L3;
                                        } else {
                                          var5_int = ai.a(param1, true);
                                          this.field_D = new int[var5_int];
                                          var6 = 0;
                                          L19: while (true) {
                                            L20: {
                                              if ((var6 ^ -1) <= (var5_int ^ -1)) {
                                                break L20;
                                              } else {
                                                this.field_D[var6] = (int)tn.a(false, 2, param1);
                                                var6++;
                                                if (var7 != 0) {
                                                  break L3;
                                                } else {
                                                  if (var7 == 0) {
                                                    continue L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                            if (var7 == 0) {
                                              break L3;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L21: {
                                      if (param2.equals("mbr")) {
                                        break L21;
                                      } else {
                                        L22: {
                                          if (!param2.equals("tr")) {
                                            break L22;
                                          } else {
                                            if (param0 > 0) {
                                              this.field_l = (int)tn.a(false, param0, param1);
                                              if (var7 == 0) {
                                                break L3;
                                              } else {
                                                break L22;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                        L23: {
                                          if (!param2.equals("df")) {
                                            break L23;
                                          } else {
                                            if (0 >= param0) {
                                              break L3;
                                            } else {
                                              this.field_E = (int)tn.a(false, param0, param1);
                                              if (var7 == 0) {
                                                break L3;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        L24: {
                                          if (!param2.equals("dsc")) {
                                            break L24;
                                          } else {
                                            if (0 < param0) {
                                              this.field_n = up.a(param1, param0, (byte) -119);
                                              if (var7 == 0) {
                                                break L3;
                                              } else {
                                                break L24;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                        L25: {
                                          if (param2.equals("gt")) {
                                            break L25;
                                          } else {
                                            L26: {
                                              if (param2.equals("gd")) {
                                                break L26;
                                              } else {
                                                L27: {
                                                  if (!param2.equals("ach")) {
                                                    break L27;
                                                  } else {
                                                    if (0 < param0) {
                                                      if (var7 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L27;
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                }
                                                L28: {
                                                  if (param2.equals("song")) {
                                                    break L28;
                                                  } else {
                                                    if (param2.equals("team")) {
                                                      if (param0 <= 0) {
                                                        break L3;
                                                      } else {
                                                        var5_int = ai.a(param1, true);
                                                        this.field_x = new int[var5_int];
                                                        var6 = 0;
                                                        L29: while (true) {
                                                          L30: {
                                                            if ((var5_int ^ -1) >= (var6 ^ -1)) {
                                                              break L30;
                                                            } else {
                                                              this.field_x[var6] = (int)tn.a(false, 2, param1);
                                                              var6++;
                                                              if (var7 != 0) {
                                                                break L3;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  continue L29;
                                                                } else {
                                                                  break L30;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (var7 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                }
                                                if (param0 <= 0) {
                                                  break L3;
                                                } else {
                                                  this.field_q = (int)tn.a(false, param0, param1);
                                                  if (var7 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                            }
                                            if ((param0 ^ -1) >= -1) {
                                              break L3;
                                            } else {
                                              this.field_F = (int)tn.a(false, param0, param1);
                                              if (var7 == 0) {
                                                break L3;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                        if (0 < param0) {
                                          this.field_m = (int)tn.a(false, param0, param1);
                                          if (var7 == 0) {
                                            break L3;
                                          } else {
                                            break L21;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    if (0 < param0) {
                                      this.field_u = (int)tn.a(false, param0, param1);
                                      if (var7 == 0) {
                                        break L3;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                if (0 >= param0) {
                                  break L3;
                                } else {
                                  this.field_o = (int)tn.a(false, param0, param1);
                                  if (var7 == 0) {
                                    break L3;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            if ((param0 ^ -1) < -1) {
                              var5_int = ai.a(param1, true);
                              this.field_y = new int[var5_int];
                              var6 = 0;
                              L31: while (true) {
                                L32: {
                                  if ((var6 ^ -1) <= (var5_int ^ -1)) {
                                    break L32;
                                  } else {
                                    this.field_y[var6] = (int)tn.a(false, 2, param1);
                                    var6++;
                                    if (var7 != 0) {
                                      break L3;
                                    } else {
                                      if (var7 == 0) {
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        if (0 < param0) {
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (-1 <= (param0 ^ -1)) {
                      break L3;
                    } else {
                      this.field_w = (int)tn.a(false, param0, param1);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (param0 > 0) {
                  this.field_k = (int)tn.a(false, param0, param1);
                  break L3;
                } else {
                  break L2;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var5 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) (var5);
            stackOut_111_1 = new StringBuilder().append("om.B(").append(param0).append(',');
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param1 == null) {
              stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L33;
            } else {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L33;
            }
          }
          L34: {
            stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',');
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param2 == null) {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L34;
            } else {
              stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L34;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_117_0), stackIn_117_2 + ',' + param3 + ')');
        }
    }

    final lo a(int param0) {
        if (null == this.field_C) {
            this.field_C = this.d((byte) 92);
        }
        if (param0 > -88) {
            this.field_q = 10;
        }
        return this.field_C;
    }

    public static void f(int param0) {
        field_r = null;
        field_I = null;
        field_s = null;
        field_p = null;
        if (param0 != 0) {
            field_r = (long[]) null;
        }
    }

    private final lo d(byte param0) {
        gl discarded$0 = null;
        if (param0 < 86) {
            discarded$0 = om.c((byte) 8);
        }
        byte[] var3 = this.field_H.a((byte) 76, this.field_t, this.field_H.a(gk.field_O[this.field_G.field_r], 102));
        byte[] var2 = var3;
        return new lo(this.field_v, var3);
    }

    final String[] e(int param0) {
        String[] var2 = null;
        int var3 = 0;
        sd var4 = null;
        int var5 = 0;
        String[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -23209) {
          var6 = new String[this.field_B.length];
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            L1: {
              if (var6.length <= var3) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (var3 == this.field_w) {
                      break L3;
                    } else {
                      var4 = this.field_G.field_q[this.field_B[var3]];
                      var6[var3] = var4.field_u;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var6[var3] = this.field_G.field_l;
                  break L2;
                }
                var3++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          return (String[]) null;
        }
    }

    final int[] a(byte param0) {
        int var2 = -73 % ((param0 - 13) / 33);
        return this.field_x;
    }

    final boolean e(byte param0) {
        if (param0 <= 56) {
            return true;
        }
        return (this.field_k & 2) != 0 ? true : false;
    }

    final fu g(int param0) {
        fu discarded$0 = null;
        if (param0 != -1) {
            discarded$0 = this.g(-55);
        }
        return new fu(this.field_D, this.field_l, this.field_u);
    }

    final static wk[] a(byte param0, String param1, String param2, kl param3) {
        wk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        wk[] var7 = null;
        wk[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = fk.a(param1, (byte) -126, param3, param2);
            var4 = var7;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-10 >= (var5 ^ -1)) {
                    break L3;
                  } else {
                    var7[var5].i();
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
                var5 = -30 % ((2 - param0) / 55);
                break L2;
              }
              stackOut_7_0 = (wk[]) (var4);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4_ref);
            stackOut_9_1 = new StringBuilder().append("om.H(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(boolean param0) {
        int[] discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_8_1 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= hs.field_G.length) {
                break L2;
              } else {
                stackOut_2_0 = hs.field_G[var2];
                stackOut_2_1 = this.field_A;
                stackIn_9_0 = stackOut_2_0;
                stackIn_9_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                      this.field_o = var2;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_8_0 = param0;
            stackOut_8_1 = 1;
            stackIn_9_0 = stackOut_8_0 ? 1 : 0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          }
          L4: {
            if (stackIn_9_0 == stackIn_9_1) {
              break L4;
            } else {
              discarded$2 = this.a((byte) 40);
              break L4;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -22696) {
            field_s = (String) null;
        }
        ij.field_x = param0;
        te.field_l = param2;
        if (null != ee.field_v) {
            ee.field_v.a(param2, param0, (byte) -14);
        }
    }

    final static gl c(byte param0) {
        wk[] discarded$0 = null;
        if (param0 >= -11) {
            discarded$0 = om.a((byte) -102, (String) null, (String) null, (kl) null);
        }
        return new gl(cn.e(488997228), rf.c(-104));
    }

    om() {
        this.field_q = -1;
        this.field_l = -1;
        this.field_E = 1;
    }

    static {
        field_s = "Unfortunately we are unable to create an account for you at this time.";
        field_p = "Blue_Team";
        field_r = new long[32];
    }
}
