/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uk {
    private int field_b;
    int[] field_f;
    static String field_a;
    byte[] field_i;
    private boolean[] field_n;
    static boolean field_e;
    int field_l;
    static ci field_c;
    int field_k;
    byte[] field_g;
    int field_m;
    int field_j;
    boolean[] field_d;
    int field_o;
    oj[] field_h;

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        qk.field_h = param3;
        pg.field_s = param0;
        nc.field_T = 0;
        if (param2 != 28333) {
            uk.c(-83);
        }
        if (!(qk.field_h != 0)) {
            pg.field_s = qk.field_h;
            ma.field_D = false;
        }
        if (!(!da.a(qk.field_h, true))) {
            var4 = 0;
            ae.field_e[qk.field_h].a((byte) 123, param1, var4);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        oj[] var5 = null;
        if (this.field_h.length <= this.field_o) {
            var5 = new oj[this.field_o + 8];
            ne.a(this.field_h, 0, var5, 0, this.field_h.length);
            this.field_h = var5;
        }
        this.field_h[this.field_o] = new oj(param2, param0, param3);
        this.field_o = this.field_o + 1;
        if (param1 != 0) {
            this.d(-125, 44);
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_e = true;
        }
        field_c = null;
    }

    final int b(int param0) {
        if (param0 != 0) {
            this.field_j = 58;
        }
        return this.field_m;
    }

    final static void a(boolean param0, int param1) {
        rn.field_a = param1;
        if (param0) {
            uk.a(83, false, 26, 15);
        }
    }

    final void a(un param0, p param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            var4_int = param1.i(-124);
            if (3 < var4_int) {
              throw new RuntimeException("Version number too recent");
            } else {
              if (param2) {
                if (var4_int == 0) {
                  throw new RuntimeException("Version number too old");
                } else {
                  if ((var4_int ^ -1) != -2) {
                    L1: {
                      if (var4_int == 2) {
                        break L1;
                      } else {
                        L2: {
                          if (-4 != (var4_int ^ -1)) {
                            break L2;
                          } else {
                            L3: {
                              var5 = param1.c(param2);
                              var6 = param1.d((byte) 118);
                              var8 = param1.d((byte) 118);
                              var10 = param1.g(0);
                              if (param0 == null) {
                                break L3;
                              } else {
                                param0.field_e = (int)(50L * (var6 / 1000L));
                                param0.field_B.field_f = var10;
                                param0.field_v = (int)(var8 / 1000L * 50L);
                                break L3;
                              }
                            }
                            var11 = 0;
                            L4: while (true) {
                              if (var11 >= var5) {
                                if (var15 == 0) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              } else {
                                var12 = param1.i(-123);
                                var13 = param1.i(-103);
                                var14 = param1.i(-97);
                                this.a((byte) 19, var14, var12, var13);
                                var11++;
                                if (var15 != 0) {
                                  break L2;
                                } else {
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                    throw new RuntimeException("Version number too old");
                  } else {
                    throw new RuntimeException("Version number too old");
                  }
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("uk.IA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[] var11 = null;
        boolean[] var12 = null;
        boolean stackIn_9_0 = false;
        int stackIn_14_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_13_0 = 0;
        var10 = Chess.field_G;
        var4 = this.field_m;
        if (param2 == -12) {
          L0: {
            var12 = new boolean[this.field_d.length];
            var11 = var12;
            var5 = var11;
            ne.a(this.field_d, 0, var5, 0, var12.length);
            var6 = this.field_f[param1];
            if (var6 != 0) {
              var7 = var6 & 16773120;
              if (param0 == var7) {
                this.a(param1, true, -1);
                var8 = 0;
                var9 = 63;
                L1: while (true) {
                  L2: {
                    L3: {
                      if ((var9 ^ -1) > -1) {
                        break L3;
                      } else {
                        stackOut_8_0 = this.field_d[var9];
                        stackIn_14_0 = stackOut_8_0 ? 1 : 0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var10 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (!stackIn_9_0) {
                              break L4;
                            } else {
                              var8 = 1;
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var9--;
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_13_0 = var8;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  }
                  if (stackIn_14_0 != 0) {
                    this.a(2, var12, var4);
                    return true;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          this.a(2, var12, var4);
          return false;
        } else {
          return true;
        }
    }

    final boolean e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean[] var12 = null;
        boolean[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_19_0 = 0;
        var11 = Chess.field_G;
        var3 = -1;
        var4 = 63;
        L0: while (true) {
          L1: {
            L2: {
              if (-1 < (var4 ^ -1)) {
                break L2;
              } else {
                var5_int = this.field_f[var4];
                stackOut_2_0 = 0;
                stackOut_2_1 = var5_int;
                stackIn_12_0 = stackOut_2_0;
                stackIn_12_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var11 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                      var6 = 16773120 & var5_int;
                      var7 = -16773121 & var5_int;
                      if (param0 != var6) {
                        break L3;
                      } else {
                        if (6 == var7) {
                          var3 = var4;
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4--;
                  if (var11 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_11_0 = var3;
            stackOut_11_1 = -1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L1;
          }
          if ((stackIn_12_0 ^ stackIn_12_1) != 0) {
            var4 = this.field_m;
            if (param1 >= 49) {
              var13 = new boolean[this.field_d.length];
              var12 = var13;
              var5 = var12;
              ne.a(this.field_d, 0, var5, 0, var13.length);
              var6 = 0;
              var7 = 63;
              L4: while (true) {
                if ((var7 ^ -1) <= -1) {
                  stackOut_19_0 = var6;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (var11 == 0) {
                    if (stackIn_21_0 != 0) {
                      this.a(2, var13, var4);
                      return var6 != 0;
                    } else {
                      var8 = this.field_f[var7];
                      if (-1 != (var8 ^ -1)) {
                        var9 = 16773120 & var8;
                        if (param0 != var9) {
                          L5: {
                            this.a(var7, false, -1);
                            var10 = this.field_d[var3] ? 1 : 0;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              var6 = 1;
                              break L5;
                            }
                          }
                          var7--;
                          continue L4;
                        } else {
                          var7--;
                          continue L4;
                        }
                      } else {
                        var7--;
                        continue L4;
                      }
                    }
                  } else {
                    return stackIn_20_0 != 0;
                  }
                } else {
                  this.a(2, var13, var4);
                  return var6 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
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
        int var17 = 0;
        var17 = Chess.field_G;
        var5 = this.field_f[param2];
        var6 = 16773120 & var5;
        var7 = var5 & -16773121;
        var8 = param2 / 8;
        var9 = param2 % 8;
        var10 = param3 / 8;
        var11 = param3 % 8;
        var12 = var9 + -var11;
        var13 = this.field_f[param3];
        if (param0 == 19) {
          L0: {
            L1: {
              var14 = var13 & 16773120;
              if (var7 == 1) {
                break L1;
              } else {
                if (var13 != 0) {
                  break L1;
                } else {
                  if (var6 != 0) {
                    if ((var6 ^ -1) != -4097) {
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (var6 == 0) {
              break L0;
            } else {
              if (var6 != 4096) {
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var15 = -16773121 & var13;
            if ((var15 ^ -1) == -5) {
              L3: {
                if (var14 == 4096) {
                  break L3;
                } else {
                  L4: {
                    if (7 != var11) {
                      break L4;
                    } else {
                      this.field_n[0] = false;
                      break L4;
                    }
                  }
                  if (var11 != 0) {
                    break L2;
                  } else {
                    this.field_n[1] = false;
                    if (var17 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (var11 == 0) {
                  this.field_n[3] = false;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 == 7) {
                this.field_n[2] = false;
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          L6: {
            if (-4097 != (var6 ^ -1)) {
              break L6;
            } else {
              L7: {
                this.field_k = -1;
                if ((var7 ^ -1) == -2) {
                  L8: {
                    if (-7 != (var8 ^ -1)) {
                      break L8;
                    } else {
                      if (var10 == 4) {
                        this.field_l = var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var10 != 0) {
                      break L9;
                    } else {
                      var5 = var6 | param1;
                      break L9;
                    }
                  }
                  if (this.field_b == param3) {
                    var16 = 8 + param3;
                    var13 = this.field_f[var16];
                    this.field_f[var16] = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                if (-5 != (var7 ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    if (var9 != 0) {
                      break L11;
                    } else {
                      this.field_n[3] = false;
                      break L11;
                    }
                  }
                  if (-8 != (var9 ^ -1)) {
                    break L10;
                  } else {
                    this.field_n[2] = false;
                    break L10;
                  }
                }
              }
              if (var7 != 6) {
                break L6;
              } else {
                L12: {
                  this.field_n[2] = false;
                  this.field_n[3] = false;
                  if ((var12 ^ -1) != -3) {
                    break L12;
                  } else {
                    this.field_f[(param2 - -param3) / 2] = this.field_f[56];
                    this.field_f[56] = 0;
                    if (var17 == 0) {
                      break L6;
                    } else {
                      break L12;
                    }
                  }
                }
                if ((var12 ^ -1) == 1) {
                  this.field_f[(param2 - -param3) / 2] = this.field_f[63];
                  this.field_f[63] = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
          }
          L13: {
            if (0 == var6) {
              L14: {
                this.field_l = -1;
                if ((var7 ^ -1) != -2) {
                  break L14;
                } else {
                  L15: {
                    if (7 == var10) {
                      var5 = param1 | var6;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var8 != 1) {
                      break L16;
                    } else {
                      if (var10 != 3) {
                        break L16;
                      } else {
                        this.field_k = var9;
                        break L16;
                      }
                    }
                  }
                  if (this.field_b != param3) {
                    break L14;
                  } else {
                    var16 = param3 + -8;
                    var13 = this.field_f[var16];
                    this.field_f[var16] = 0;
                    break L14;
                  }
                }
              }
              L17: {
                if (4 == var7) {
                  L18: {
                    if (var9 != 7) {
                      break L18;
                    } else {
                      this.field_n[0] = false;
                      break L18;
                    }
                  }
                  if (-1 == (var9 ^ -1)) {
                    this.field_n[1] = false;
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              if (-7 == (var7 ^ -1)) {
                L19: {
                  this.field_n[1] = false;
                  this.field_n[0] = false;
                  if (2 == var12) {
                    break L19;
                  } else {
                    L20: {
                      if (1 != (var12 ^ -1)) {
                        break L20;
                      } else {
                        this.field_f[(param3 + param2) / 2] = this.field_f[7];
                        this.field_f[7] = 0;
                        if (var17 == 0) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    this.field_b = -1;
                    this.field_f[param3] = var5;
                    this.field_f[param2] = 0;
                    this.d(3, var13);
                    this.a(param3, 0, param2, param1);
                    this.a(-1, false, -1);
                    t.field_Q = true;
                    break L13;
                  }
                }
                this.field_f[(param2 - -param3) / 2] = this.field_f[0];
                this.field_f[0] = 0;
                this.field_b = -1;
                this.field_f[param3] = var5;
                this.field_f[param2] = 0;
                this.d(3, var13);
                this.a(param3, 0, param2, param1);
                this.a(-1, false, -1);
                t.field_Q = true;
                break L13;
              } else {
                this.field_b = -1;
                this.field_f[param3] = var5;
                this.field_f[param2] = 0;
                this.d(3, var13);
                this.a(param3, 0, param2, param1);
                this.a(-1, false, -1);
                t.field_Q = true;
                break L13;
              }
            } else {
              this.field_b = -1;
              this.field_f[param3] = var5;
              this.field_f[param2] = 0;
              this.d(3, var13);
              this.a(param3, 0, param2, param1);
              this.a(-1, false, -1);
              t.field_Q = true;
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
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
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_264_0 = 0;
        int stackIn_264_1 = 0;
        int stackIn_293_0 = 0;
        int stackIn_293_1 = 0;
        int stackIn_296_0 = 0;
        int stackIn_296_1 = 0;
        int stackIn_303_0 = 0;
        int stackIn_303_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        int stackIn_335_0 = 0;
        int stackIn_335_1 = 0;
        int stackIn_342_0 = 0;
        int stackIn_342_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int stackOut_170_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_172_1 = 0;
        int stackOut_176_0 = 0;
        int stackOut_176_1 = 0;
        int stackOut_182_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_256_1 = 0;
        int stackOut_257_0 = 0;
        int stackOut_257_1 = 0;
        int stackOut_266_0 = 0;
        int stackOut_266_1 = 0;
        int stackOut_295_0 = 0;
        int stackOut_295_1 = 0;
        int stackOut_296_0 = 0;
        int stackOut_296_1 = 0;
        int stackOut_305_0 = 0;
        int stackOut_305_1 = 0;
        int stackOut_334_0 = 0;
        int stackOut_334_1 = 0;
        int stackOut_335_0 = 0;
        int stackOut_335_1 = 0;
        int stackOut_344_0 = 0;
        int stackOut_344_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var29 = Chess.field_G;
                    var4 = -1 + this.field_d.length;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (0 > var4) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_d[var4] = false;
                    var4--;
                    if (var29 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var29 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_m = param0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_m >= 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (this.field_m > this.field_f.length) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    var4 = this.field_f[this.field_m];
                    if (-1 == (var4 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var5 = var4 & 16773120;
                    var6 = -16773121 & var4;
                    var7 = this.field_m % 8;
                    var8 = this.field_m / 8;
                    var15 = 1;
                    var16 = new int[]{1, 1, -1, -1};
                    var17 = new int[]{var8, var7, var8, var7};
                    var18 = new int[]{1, 1, -1, -1};
                    var19 = new int[]{1, -1, 1, -1};
                    var20 = new int[]{2, 2, 1, -1, -2, -2, -1, 1};
                    var21 = new int[]{param2, 1, 2, 2, 1, -1, -2, -2};
                    var27 = var6;
                    if (var27 == 1) {
                        statePc = 24;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (4 == var27) {
                        statePc = 89;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var27 == 2) {
                        statePc = 116;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-4 == (var27 ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var27 != 5) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var29 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var27 ^ -1) != -7) {
                        statePc = 226;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var29 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var5 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = -1;
                    stackIn_27_0 = stackOut_25_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = 1;
                    stackIn_27_0 = stackOut_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var22 = stackIn_27_0;
                    var11 = var8 + var22;
                    var23 = 1;
                    var27 = -1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (-2 > (var27 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10 = var7 - -var27;
                    stackOut_29_0 = -1;
                    stackOut_29_1 = var10 ^ -1;
                    stackIn_67_0 = stackOut_29_0;
                    stackIn_67_1 = stackOut_29_1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    if (var29 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 < stackIn_30_1) {
                        statePc = 40;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var10 >= 8) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9 = var10 - -(var11 * 8);
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (var27 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-1 == (var12 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var13 == var5) {
                        statePc = 40;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.a(-1, var9, param1);
                    if (var29 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (0 == var12) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var23 = 0;
                    if (var29 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var23 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var24 = -1;
                    if (0 != var5) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var24 = this.field_l;
                    if (var29 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var24 = this.field_k;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-1 == var24) {
                        statePc = 226;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var27 = var7 + -var24;
                    if (1 == var27) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var27 == -1) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var5 != 4096) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (3 != var8) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var11 = var8 - 1;
                    var9 = 8 * var11 + var24;
                    this.field_b = var9;
                    this.a(param2 + 0, var9, param1);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var5 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (4 != var8) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var11 = var8 + 1;
                    var9 = var11 * 8 + var24;
                    this.field_b = var9;
                    this.a(-1, var9, param1);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var29 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var27 = 0;
                    if (4 <= var27) {
                        statePc = 115;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var28 = var17[var27];
                    if (0 <= var28) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var27++;
                    statePc = 90;
                    continue stateLoop;
                }
                case 60: {
                    if ((var28 ^ -1) > -9) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var27++;
                    statePc = 90;
                    continue stateLoop;
                }
                case 62: {
                    if (var15 == 0) {
                        statePc = 336;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var27 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (2 != var27) {
                        statePc = 231;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = var8;
                    stackOut_66_1 = 1;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 != stackIn_67_1) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var5 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if ((var8 ^ -1) != -7) {
                        statePc = 75;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (4096 != var5) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var11 = 2 * var22 + var8;
                    var9 = var11 * 8 + var7;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (0 != var12) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    this.a(param2 ^ 0, var9, param1);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var24 = -1;
                    if (0 != var5) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var24 = this.field_l;
                    if (var29 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var24 = this.field_k;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (-1 == var24) {
                        statePc = 226;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var27 = var7 + -var24;
                    if (1 == var27) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var27 == -1) {
                        statePc = 82;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var5 != 4096) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (3 != var8) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var11 = var8 - 1;
                    var9 = 8 * var11 + var24;
                    this.field_b = var9;
                    this.a(param2 + 0, var9, param1);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var5 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (4 != var8) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var11 = var8 + 1;
                    var9 = var11 * 8 + var24;
                    this.field_b = var9;
                    this.a(-1, var9, param1);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var29 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var27 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = 4;
                    stackOut_90_1 = var27;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 <= stackIn_91_1) {
                        statePc = 115;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var28 = var17[var27];
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (0 > var28) {
                        statePc = 114;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = var28 ^ -1;
                    stackOut_95_1 = -9;
                    stackIn_91_0 = stackOut_95_0;
                    stackIn_91_1 = stackOut_95_1;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    if (var29 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (stackIn_96_0 <= stackIn_96_1) {
                        statePc = 114;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var15 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var27 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (2 != var27) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var9 = var28 + 8 * var8;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (var9 != this.field_m) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var29 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var13 != var5) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var29 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var15 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var28 = var28 + var16[var27];
                    statePc = 94;
                    continue stateLoop;
                }
                case 114: {
                    var27++;
                    statePc = 90;
                    continue stateLoop;
                }
                case 115: {
                    if (var29 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var27 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (8 <= var27) {
                        statePc = 128;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var11 = var20[var27] + var8;
                    var10 = var7 + var21[var27];
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if ((var11 ^ -1) > -1) {
                        statePc = 127;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (8 <= var11) {
                        statePc = 127;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 127;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (8 <= var10) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var9 = 8 * var11 + var10;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = 16773120 & var12;
                    if (var14 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var5 != var13) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var27++;
                    statePc = 117;
                    continue stateLoop;
                }
                case 128: {
                    if (var29 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var27 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = 4;
                    stackIn_131_0 = stackOut_130_0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 <= var27) {
                        statePc = 147;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var11 = var18[var27] + var8;
                    var10 = var7 + var19[var27];
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var15 = 1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (var15 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = var11;
                    stackIn_131_0 = stackOut_135_0;
                    stackIn_136_0 = stackOut_135_0;
                    if (var29 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (stackIn_136_0 < 0) {
                        statePc = 146;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if ((var11 ^ -1) <= -9) {
                        statePc = 146;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 146;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (8 <= var10) {
                        statePc = 146;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var9 = var11 * 8 + var10;
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 == (var12 ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var5 != var13) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var29 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var15 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    this.a(-1, var9, param1);
                    var10 = var10 + var19[var27];
                    var11 = var11 + var18[var27];
                    if (var29 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var29 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var27 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    stackOut_149_0 = var27 ^ -1;
                    stackOut_149_1 = -5;
                    stackIn_150_0 = stackOut_149_0;
                    stackIn_150_1 = stackOut_149_1;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (stackIn_150_0 <= stackIn_150_1) {
                        statePc = 170;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var15 = 1;
                    stackOut_151_0 = var17[var27];
                    stackIn_171_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (var29 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var28 = stackIn_152_0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var28 < 0) {
                        statePc = 169;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackOut_154_0 = var28 ^ -1;
                    stackOut_154_1 = -9;
                    stackIn_150_0 = stackOut_154_0;
                    stackIn_150_1 = stackOut_154_1;
                    stackIn_155_0 = stackOut_154_0;
                    stackIn_155_1 = stackOut_154_1;
                    if (var29 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0 <= stackIn_155_1) {
                        statePc = 169;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (var15 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (0 == var27) {
                        statePc = 160;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var27 != 2) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var9 = var7 + var28 * 8;
                    if (var29 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var9 = 8 * var8 + var28;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (this.field_m == var9) {
                        statePc = 168;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var12 = this.field_f[var9];
                    var13 = 16773120 & var12;
                    var14 = var12 & -16773121;
                    if (var12 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (var5 == var13) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var15 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    this.a(-1, var9, param1);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var28 = var28 + var16[var27];
                    statePc = 153;
                    continue stateLoop;
                }
                case 169: {
                    var27++;
                    statePc = 149;
                    continue stateLoop;
                }
                case 170: {
                    stackOut_170_0 = 0;
                    stackIn_171_0 = stackOut_170_0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    var27 = stackIn_171_0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    stackOut_172_0 = var27 ^ -1;
                    stackOut_172_1 = -5;
                    stackIn_173_0 = stackOut_172_0;
                    stackIn_173_1 = stackOut_172_1;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 <= stackIn_173_1) {
                        statePc = 179;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var10 = var19[var27] + var7;
                    var11 = var18[var27] + var8;
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var15 = 1;
                    if (var15 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackOut_176_0 = var11 ^ -1;
                    stackOut_176_1 = -1;
                    stackIn_173_0 = stackOut_176_0;
                    stackIn_173_1 = stackOut_176_1;
                    statePc = 173;
                    continue stateLoop;
                }
                case 178: {
                    var27++;
                    if (var29 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var29 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var26 = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
                    var25 = new int[]{1, 1, 1, 0, -1, -1, -1, 0};
                    var27 = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var27 >= 8) {
                        statePc = 192;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var10 = var26[var27] + var7;
                    var11 = var25[var27] + var8;
                    stackOut_182_0 = var11;
                    stackIn_193_0 = stackOut_182_0;
                    stackIn_183_0 = stackOut_182_0;
                    if (var29 != 0) {
                        statePc = 193;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (stackIn_183_0 < 0) {
                        statePc = 191;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var11 >= 8) {
                        statePc = 191;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (var10 < 0) {
                        statePc = 191;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (var10 >= 8) {
                        statePc = 191;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var9 = var10 + var11 * 8;
                    var12 = this.field_f[var9];
                    var14 = var12 & -16773121;
                    var13 = 16773120 & var12;
                    if (var14 == 0) {
                        statePc = 190;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var13 == var5) {
                        statePc = 191;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    this.a(-1, var9, param1);
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    var27++;
                    statePc = 181;
                    continue stateLoop;
                }
                case 192: {
                    stackOut_192_0 = 4096;
                    stackIn_193_0 = stackOut_192_0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (stackIn_193_0 != var5) {
                        statePc = 209;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (!param1) {
                        statePc = 209;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (!this.e(4096, 52)) {
                        statePc = 197;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (!this.field_n[3]) {
                        statePc = 204;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (this.field_d[-1 + this.field_m]) {
                        statePc = 200;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_f[this.field_m + -2] != 0) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (0 == this.field_f[this.field_m - 3]) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    this.a(param2 + 0, -2 + this.field_m, param1);
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (!this.field_n[2]) {
                        statePc = 209;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (this.field_d[this.field_m + 1]) {
                        statePc = 207;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (this.field_f[this.field_m + 2] != 0) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    this.a(-1, 2 + this.field_m, param1);
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (0 != var5) {
                        statePc = 226;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (!param1) {
                        statePc = 226;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (!this.e(0, 82)) {
                        statePc = 213;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (!this.field_n[1]) {
                        statePc = 220;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (this.field_d[-1 + this.field_m]) {
                        statePc = 216;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (-1 != (this.field_f[this.field_m + -2] ^ -1)) {
                        statePc = 220;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (-1 == (this.field_f[this.field_m - 3] ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 219: {
                    this.a(-1, this.field_m + -2, param1);
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (!this.field_n[0]) {
                        statePc = 226;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (this.field_d[this.field_m + 1]) {
                        statePc = 223;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (this.field_f[this.field_m - -2] == 0) {
                        statePc = 225;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 225: {
                    this.a(-1, 2 + this.field_m, param1);
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    return;
                }
                case 229: {
                    if (2 != var27) {
                        statePc = 231;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var9 = var28 + 8 * var8;
                    statePc = 246;
                    continue stateLoop;
                }
                case 233: {
                    if (var29 == 0) {
                        statePc = 239;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (var29 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var28 = var28 + var16[var27];
                    statePc = 259;
                    continue stateLoop;
                }
                case 240: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 239;
                    continue stateLoop;
                }
                case 241: {
                    var15 = 0;
                    statePc = 240;
                    continue stateLoop;
                }
                case 242: {
                    if (var13 != var5) {
                        statePc = 241;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var9 != this.field_m) {
                        statePc = 244;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 246;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (var27 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (var15 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (stackIn_254_0 <= stackIn_254_1) {
                        statePc = 258;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 256: {
                    stackOut_256_0 = var28 ^ -1;
                    stackOut_256_1 = -9;
                    stackIn_264_0 = stackOut_256_0;
                    stackIn_264_1 = stackOut_256_1;
                    stackIn_257_0 = stackOut_256_0;
                    stackIn_257_1 = stackOut_256_1;
                    if (var29 != 0) {
                        statePc = 264;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    stackOut_257_0 = stackIn_257_0;
                    stackOut_257_1 = stackIn_257_1;
                    stackIn_254_0 = stackOut_257_0;
                    stackIn_254_1 = stackOut_257_1;
                    statePc = 254;
                    continue stateLoop;
                }
                case 258: {
                    var27++;
                    statePc = 266;
                    continue stateLoop;
                }
                case 259: {
                    if (0 > var28) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var28 = var17[var27];
                    statePc = 259;
                    continue stateLoop;
                }
                case 262: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (stackIn_264_0 <= stackIn_264_1) {
                        statePc = 115;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 266: {
                    stackOut_266_0 = 4;
                    stackOut_266_1 = var27;
                    stackIn_264_0 = stackOut_266_0;
                    stackIn_264_1 = stackOut_266_1;
                    statePc = 264;
                    continue stateLoop;
                }
                case 268: {
                    if (2 != var27) {
                        statePc = 270;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var9 = var28 + 8 * var8;
                    statePc = 285;
                    continue stateLoop;
                }
                case 272: {
                    if (var29 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (var29 == 0) {
                        statePc = 297;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var28 = var28 + var16[var27];
                    statePc = 298;
                    continue stateLoop;
                }
                case 279: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 278;
                    continue stateLoop;
                }
                case 280: {
                    var15 = 0;
                    statePc = 279;
                    continue stateLoop;
                }
                case 281: {
                    if (var13 != var5) {
                        statePc = 280;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 281;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (var9 != this.field_m) {
                        statePc = 283;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (var27 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (var15 == 0) {
                        statePc = 297;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (stackIn_293_0 <= stackIn_293_1) {
                        statePc = 297;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = var28 ^ -1;
                    stackOut_295_1 = -9;
                    stackIn_303_0 = stackOut_295_0;
                    stackIn_303_1 = stackOut_295_1;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    if (var29 != 0) {
                        statePc = 303;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = stackIn_296_0;
                    stackOut_296_1 = stackIn_296_1;
                    stackIn_293_0 = stackOut_296_0;
                    stackIn_293_1 = stackOut_296_1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 297: {
                    var27++;
                    statePc = 305;
                    continue stateLoop;
                }
                case 298: {
                    if (0 > var28) {
                        statePc = 297;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var28 = var17[var27];
                    statePc = 298;
                    continue stateLoop;
                }
                case 301: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (stackIn_303_0 <= stackIn_303_1) {
                        statePc = 115;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = 4;
                    stackOut_305_1 = var27;
                    stackIn_303_0 = stackOut_305_0;
                    stackIn_303_1 = stackOut_305_1;
                    statePc = 303;
                    continue stateLoop;
                }
                case 307: {
                    if (2 != var27) {
                        statePc = 309;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var9 = var28 + 8 * var8;
                    statePc = 324;
                    continue stateLoop;
                }
                case 311: {
                    if (var29 == 0) {
                        statePc = 317;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (var29 == 0) {
                        statePc = 336;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var28 = var28 + var16[var27];
                    statePc = 337;
                    continue stateLoop;
                }
                case 318: {
                    this.a(param2 + 0, var9, param1);
                    statePc = 317;
                    continue stateLoop;
                }
                case 319: {
                    var15 = 0;
                    statePc = 318;
                    continue stateLoop;
                }
                case 320: {
                    if (var13 != var5) {
                        statePc = 319;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var12 = this.field_f[var9];
                    var14 = -16773121 & var12;
                    var13 = var12 & 16773120;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 320;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (var9 != this.field_m) {
                        statePc = 322;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 326: {
                    var9 = var7 - -(var28 * 8);
                    if (var29 == 0) {
                        statePc = 324;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (var27 == 0) {
                        statePc = 326;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if (var15 == 0) {
                        statePc = 336;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if (stackIn_332_0 <= stackIn_332_1) {
                        statePc = 336;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 334: {
                    stackOut_334_0 = var28 ^ -1;
                    stackOut_334_1 = -9;
                    stackIn_342_0 = stackOut_334_0;
                    stackIn_342_1 = stackOut_334_1;
                    stackIn_335_0 = stackOut_334_0;
                    stackIn_335_1 = stackOut_334_1;
                    if (var29 != 0) {
                        statePc = 342;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    stackOut_335_0 = stackIn_335_0;
                    stackOut_335_1 = stackIn_335_1;
                    stackIn_332_0 = stackOut_335_0;
                    stackIn_332_1 = stackOut_335_1;
                    statePc = 332;
                    continue stateLoop;
                }
                case 336: {
                    var27++;
                    statePc = 344;
                    continue stateLoop;
                }
                case 337: {
                    if (0 > var28) {
                        statePc = 336;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 339: {
                    var28 = var17[var27];
                    statePc = 337;
                    continue stateLoop;
                }
                case 340: {
                    var15 = 1;
                    if (var29 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if (stackIn_342_0 <= stackIn_342_1) {
                        statePc = 115;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 344: {
                    stackOut_344_0 = 4;
                    stackOut_344_1 = var27;
                    stackIn_342_0 = stackOut_344_0;
                    stackIn_342_1 = stackOut_344_1;
                    statePc = 342;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.a(94, -75, 79, -71);
            break L0;
          }
        }
        var4 = this.field_m;
        if (var4 >= 0) {
          L1: {
            if (-65 >= (var4 ^ -1)) {
              break L1;
            } else {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if ((param1 ^ -1) <= -65) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (!param2) {
                        break L3;
                      } else {
                        L4: {
                          var5 = 16773120 & this.field_f[var4];
                          var6 = this.field_f[param1];
                          this.field_f[param1] = this.field_f[var4];
                          this.field_f[var4] = 0;
                          var7 = this.e(var5, param0 + 105) ? 1 : 0;
                          this.field_f[var4] = this.field_f[param1];
                          this.field_f[param1] = var6;
                          stackOut_10_0 = this.field_d;
                          stackOut_10_1 = param1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          if (var7 != 0) {
                            stackOut_12_0 = (boolean[]) ((Object) stackIn_12_0);
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            break L4;
                          } else {
                            stackOut_11_0 = (boolean[]) ((Object) stackIn_11_0);
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            break L4;
                          }
                        }
                        stackIn_13_0[stackIn_13_1] = stackIn_13_2 != 0;
                        if (Chess.field_G == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_d[param1] = true;
                    break L2;
                  }
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        byte[] stackIn_4_0 = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_2_0 = null;
        var7 = Chess.field_G;
        if (-1 == (param1 ^ -1)) {
          return;
        } else {
          L0: {
            var3 = 16773120 & param1;
            var4 = param1 & -16773121;
            if ((var3 ^ -1) == -4097) {
              stackOut_3_0 = this.field_g;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_i;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var5 = stackIn_4_0;
          var6 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var5[var6] == 0) {
                  break L3;
                } else {
                  var6++;
                  if (var7 != 0) {
                    break L2;
                  } else {
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (param0 == 3) {
                  break L4;
                } else {
                  this.a(-43, 1, false);
                  break L4;
                }
              }
              var5[var6] = (byte)var4;
              break L2;
            }
            return;
          }
        }
    }

    private final void a(int param0, boolean[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_m = param2;
              this.field_d = param1;
              if (param0 == 2) {
                break L1;
              } else {
                uk.a(true, 82);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("uk.KA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 < -105) {
          if (!this.e(param1, 97)) {
            if (!this.c(param1, -105)) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 9550) {
            field_a = (String) null;
        }
        return this.field_f[param0];
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        L0: {
          var6 = Chess.field_G;
          var3 = this.field_m;
          var4 = new boolean[this.field_d.length];
          ne.a(this.field_d, 0, var4, 0, var4.length);
          var5 = 63;
          if (param1 <= -103) {
            break L0;
          } else {
            uk.c(-10);
            break L0;
          }
        }
        L1: while (true) {
          if (-1 >= (var5 ^ -1)) {
            stackOut_4_0 = this.a(param0, var5, (byte) -12);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var6 == 0) {
              if (stackIn_6_0) {
                return true;
              } else {
                var5--;
                continue L1;
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            this.a(2, var4, var3);
            return false;
          }
        }
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_29_0 = 0;
        var11 = Chess.field_G;
        if (0 <= this.field_m) {
          if ((this.field_m ^ -1) > -65) {
            var2 = this.field_f[this.field_m];
            var3 = 16773120 & var2;
            var4 = var2 & -16773121;
            var5 = this.field_m % 8;
            var6 = this.field_m / param0;
            if ((var4 ^ -1) == -2) {
              L0: {
                if (0 != var3) {
                  break L0;
                } else {
                  if (var6 != 6) {
                    break L0;
                  } else {
                    var7 = -1;
                    L1: while (true) {
                      if (var7 > 1) {
                        if (var11 != 0) {
                          break L0;
                        } else {
                          return false;
                        }
                      } else {
                        var8 = var6 - -1;
                        var9 = var5 + var7;
                        stackOut_11_0 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var11 == 0) {
                          L2: {
                            if (stackIn_13_0 > var9) {
                              break L2;
                            } else {
                              L3: {
                                if (8 > var9) {
                                  break L3;
                                } else {
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var10 = var8 * 8 + var9;
                              if (!this.field_d[var10]) {
                                break L2;
                              } else {
                                return true;
                              }
                            }
                          }
                          var7++;
                          continue L1;
                        } else {
                          return stackIn_12_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
              if (-4097 == (var3 ^ -1)) {
                if ((var6 ^ -1) == -2) {
                  var7 = -1;
                  L4: while (true) {
                    if (-2 <= (var7 ^ -1)) {
                      var8 = -1 + var6;
                      var9 = var5 + var7;
                      stackOut_29_0 = var9 ^ -1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (var11 == 0) {
                        L5: {
                          if (stackIn_31_0 > -1) {
                            break L5;
                          } else {
                            L6: {
                              if (var9 < 8) {
                                break L6;
                              } else {
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10 = var8 * 8 + var9;
                            if (!this.field_d[var10]) {
                              break L5;
                            } else {
                              return true;
                            }
                          }
                        }
                        var7++;
                        continue L4;
                      } else {
                        return stackIn_30_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Chess.field_G;
        if (param0 < -89) {
          var2 = 0;
          if (this.field_h.length == 0) {
            return -1;
          } else {
            L0: while (true) {
              L1: {
                if (var2 >= this.field_h.length) {
                  break L1;
                } else {
                  if (null == this.field_h[var2]) {
                    break L1;
                  } else {
                    var2++;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return -120;
        }
    }

    final boolean a(byte param0, int param1) {
        L0: {
          if (param0 == 61) {
            break L0;
          } else {
            uk.a(true, -111);
            break L0;
          }
        }
        if (this.e(param1, 97)) {
          if (!this.c(param1, -111)) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    uk() {
        this.field_b = -1;
        this.field_i = new byte[16];
        this.field_l = -1;
        this.field_k = -1;
        this.field_n = new boolean[]{true, true, true, true};
        this.field_g = new byte[16];
        this.field_f = new int[df.field_i.length];
        this.field_m = -1;
        this.field_d = new boolean[64];
        this.field_j = -1;
        this.field_o = 0;
        this.field_h = new oj[]{};
        ne.a(df.field_i, 0, this.field_f, 0, df.field_i.length);
    }

    static {
        field_e = false;
    }
}
