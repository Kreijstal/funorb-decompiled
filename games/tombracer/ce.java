/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends dg {
    static String field_w;
    private int field_s;
    private lpa field_m;
    private int field_q;
    private boolean field_p;
    private static String[] field_n;
    private int field_x;
    private fla field_t;
    static boolean field_B;
    static int[][] field_A;
    private eh[][] field_r;
    private fla field_v;
    private int field_u;
    private fla field_o;
    private int field_y;
    private int field_z;

    final int k(int param0) {
        if (param0 != -13019) {
            ce.l(-70);
        }
        return this.field_u;
    }

    final void b(int param0, uw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_r != null) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            L2: {
              super.b(param0, param1);
              if (this.field_r != null) {
                var3_int = 0;
                L3: while (true) {
                  if (this.field_z <= var3_int) {
                    break L2;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var4 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var4 >= this.field_s) {
                              break L6;
                            } else {
                              this.field_r[var3_int][var4].a(55);
                              var4++;
                              if (var5 != 0) {
                                break L5;
                              } else {
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3_int++;
                          break L5;
                        }
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ce.WA(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final int n(byte param0) {
        if (param0 != 87) {
            return -127;
        }
        return this.field_q;
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(this.field_k instanceof lpa)) {
                break L1;
              } else {
                this.field_m = (lpa) ((Object) this.field_k);
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
            stackOut_3_1 = new StringBuilder().append("ce.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(param2 instanceof im)) {
                break L1;
              } else {
                this.field_q = 1;
                break L1;
              }
            }
            L2: {
              if (!param0.b(true)) {
                break L2;
              } else {
                this.field_q = 3;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("ce.C(");
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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

    public static void l(int param0) {
        field_w = null;
        field_n = null;
        if (param0 != 30389) {
            field_n = (String[]) null;
        }
        field_A = (int[][]) null;
    }

    ce(int param0) {
        super(param0);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    private final void a(boolean param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        eh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        la var17 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        L0: {
          L1: {
            var16 = TombRacer.field_G ? 1 : 0;
            var17 = this.a(18);
            var3 = this.field_h.d(3);
            var4 = this.field_h.e(9648);
            this.field_z = this.field_h.c(-84) / 2097152;
            this.field_s = this.field_h.a((byte) 55) / 2097152;
            if (1 >= this.field_z) {
              break L1;
            } else {
              if (-2 <= (this.field_s ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          if (this.field_q == 2) {
            this.field_q = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.p((byte) 77)) {
          L2: {
            this.field_r = new eh[this.field_z][this.field_s];
            var5 = 1048576 + (-(this.field_h.a((byte) 55) / 2) + var4);
            if (param0) {
              break L2;
            } else {
              this.field_o = (fla) null;
              break L2;
            }
          }
          var6 = 0;
          L3: while (true) {
            L4: {
              if (this.field_s <= var6) {
                break L4;
              } else {
                var7 = -(this.field_h.c(-117) / 2) + (var3 + 1048576);
                if (var16 != 0) {
                  break L4;
                } else {
                  var8 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (this.field_z <= var8) {
                          break L7;
                        } else {
                          var9 = new eh();
                          this.field_r[var8][var6] = var9;
                          stackOut_15_0 = 0;
                          stackOut_15_1 = this.field_q;
                          stackIn_74_0 = stackOut_15_0;
                          stackIn_74_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var16 != 0) {
                            break L6;
                          } else {
                            L8: {
                              L9: {
                                if (stackIn_16_0 != stackIn_16_1) {
                                  break L9;
                                } else {
                                  var9.field_a = 512;
                                  if (var16 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var8 <= 0) {
                                  stackOut_21_0 = 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L10;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L10;
                                }
                              }
                              L11: {
                                var10 = stackIn_22_0;
                                if (var8 >= -1 + this.field_z) {
                                  stackOut_24_0 = 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  break L11;
                                } else {
                                  stackOut_23_0 = 1;
                                  stackIn_25_0 = stackOut_23_0;
                                  break L11;
                                }
                              }
                              L12: {
                                var11 = stackIn_25_0;
                                if ((var6 ^ -1) >= -1) {
                                  stackOut_27_0 = 0;
                                  stackIn_28_0 = stackOut_27_0;
                                  break L12;
                                } else {
                                  stackOut_26_0 = 1;
                                  stackIn_28_0 = stackOut_26_0;
                                  break L12;
                                }
                              }
                              L13: {
                                var12 = stackIn_28_0;
                                if (this.field_s - 1 <= var6) {
                                  stackOut_30_0 = 0;
                                  stackIn_31_0 = stackOut_30_0;
                                  break L13;
                                } else {
                                  stackOut_29_0 = 1;
                                  stackIn_31_0 = stackOut_29_0;
                                  break L13;
                                }
                              }
                              L14: {
                                var13 = stackIn_31_0;
                                var14 = 0;
                                if (var10 == 0) {
                                  break L14;
                                } else {
                                  var14++;
                                  break L14;
                                }
                              }
                              L15: {
                                if (var11 != 0) {
                                  var14++;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              L16: {
                                if (var12 != 0) {
                                  var14++;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              L17: {
                                if (var13 != 0) {
                                  var14++;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                L19: {
                                  var15 = 0;
                                  if ((var14 ^ -1) == -5) {
                                    break L19;
                                  } else {
                                    L20: {
                                      if ((var14 ^ -1) != -4) {
                                        break L20;
                                      } else {
                                        L21: {
                                          L22: {
                                            if (var12 != 0) {
                                              break L22;
                                            } else {
                                              var15 = 1024;
                                              if (var16 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (var13 == 0) {
                                              break L23;
                                            } else {
                                              L24: {
                                                if (var11 != 0) {
                                                  break L24;
                                                } else {
                                                  var15 = -512;
                                                  if (var16 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              var15 = 512;
                                              if (var16 == 0) {
                                                break L21;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var15 = 0;
                                          break L21;
                                        }
                                        var9.field_h = 0;
                                        if (var16 == 0) {
                                          break L18;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    L25: {
                                      if (2 == var14) {
                                        break L25;
                                      } else {
                                        var9.field_h = 2;
                                        if (var16 == 0) {
                                          break L18;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                    L26: {
                                      L27: {
                                        var9.field_h = 1;
                                        if (var10 != 0) {
                                          break L27;
                                        } else {
                                          if (var12 == 0) {
                                            break L26;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      L28: {
                                        if (var10 != 0) {
                                          break L28;
                                        } else {
                                          if (var13 != 0) {
                                            break L28;
                                          } else {
                                            var15 = 0;
                                            if (var16 == 0) {
                                              break L18;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                      L29: {
                                        L30: {
                                          if (var11 != 0) {
                                            break L30;
                                          } else {
                                            if (var12 == 0) {
                                              break L29;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                        if (var11 != 0) {
                                          break L18;
                                        } else {
                                          if (var13 == 0) {
                                            var15 = -512;
                                            if (var16 == 0) {
                                              break L18;
                                            } else {
                                              break L29;
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var15 = 1024;
                                      if (var16 == 0) {
                                        break L18;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    var15 = 512;
                                    if (var16 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                var9.field_h = 2;
                                break L18;
                              }
                              var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                              break L8;
                            }
                            var9.field_e = (ce) (this);
                            var9.field_b = var17.e(true).a(100, 0);
                            var9.field_c = var5 + -var4;
                            var9.field_d = -var3 + var7;
                            var9.field_f = this.a(var9, 2);
                            var7 = var7 + 2097152;
                            var8++;
                            if (var16 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_73_0 = var5;
                      stackOut_73_1 = 2097152;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      break L6;
                    }
                    var5 = stackIn_74_0 + stackIn_74_1;
                    var6++;
                    if (var16 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          this.o((byte) 95);
          return;
        }
    }

    final int i(int param0) {
        if (param0 != 1024) {
            return 21;
        }
        return this.field_x;
    }

    final void a(byte param0, int param1) {
        super.a((byte) 92, param1);
        w var3 = (w) ((Object) this.a(29).field_G);
        int var4 = -57 % ((7 - param0) / 36);
        if (!(var3 != null)) {
            return;
        }
        fla discarded$3 = var3.a(new fm(3, this.b((byte) -93), this.c((byte) 115), this.e((byte) -89)), -58);
        if (this.field_t != null) {
            this.field_t.a(-120, var3);
            this.field_t = null;
        }
        if (null != this.field_o) {
            this.field_o.a(-100, var3);
            this.field_o = null;
        }
    }

    final void d(int param0) {
        fla discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        w var4 = null;
        int var4_int = 0;
        fsa var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        vna var15 = null;
        uja var16 = null;
        int var17 = 0;
        Object var18 = null;
        wda var18_ref = null;
        int var19 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        L0: {
          var18 = null;
          var19 = TombRacer.field_G ? 1 : 0;
          super.d(-1);
          var2 = 0;
          var3 = 0;
          if (this.field_m != null) {
            if (!this.field_m.d(false)) {
              break L0;
            } else {
              this.field_u = -131072 + uca.field_c.a(262144, param0 ^ -1);
              this.field_x = uca.field_c.a(262144, param0 + 1) + -131072;
              var2 = 1;
              if (this.field_m.g((byte) 120)) {
                var2 = 0;
                var4_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (this.field_z <= var4_int) {
                        break L3;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_16_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var19 != 0) {
                          break L2;
                        } else {
                          var5_int = stackIn_8_0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (this.field_s <= var5_int) {
                                  break L6;
                                } else {
                                  this.field_r[var4_int][var5_int].field_g.a(0);
                                  var5_int++;
                                  if (var19 != 0) {
                                    break L5;
                                  } else {
                                    if (var19 == 0) {
                                      continue L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var4_int++;
                              break L5;
                            }
                            if (var19 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  }
                  var3 = stackIn_16_0;
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var4 = (w) ((Object) this.a(94).field_G);
        if (var4 == null) {
          return;
        } else {
          L7: {
            if (param0 == -1) {
              break L7;
            } else {
              this.field_t = (fla) null;
              break L7;
            }
          }
          L8: {
            var5 = (fsa) ((Object) this.field_h);
            var6 = 1;
            var7 = this.b((byte) 84) - var4.field_h >> -934761200;
            var8 = this.c((byte) 126) + -var4.field_c >> -1940922704;
            var9 = (double)ua.a(var7, -118);
            var11 = (double)ua.a(var8, -125);
            var13 = Math.sqrt(var11 * var11 + var9 * var9);
            if (768.0 <= var13) {
              var6 = 0;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            L10: {
              if (1 != this.field_q) {
                break L10;
              } else {
                L11: {
                  L12: {
                    if (this.field_o != null) {
                      break L12;
                    } else {
                      if (var6 != 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (this.field_o == null) {
                    break L9;
                  } else {
                    if (var6 != 0) {
                      break L9;
                    } else {
                      this.field_o.a(param0 + 112, var4);
                      this.field_o = null;
                      if (var19 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                this.field_o = var4.a(new fm(9, this.b((byte) -101), this.c((byte) 99), this.e((byte) -98)), param0 ^ 57);
                if (var19 == 0) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            L13: {
              if (var2 == 0) {
                if (var2 != 0) {
                  break L13;
                } else {
                  if (null == this.field_t) {
                    break L13;
                  } else {
                    this.field_t.a(param0 + -117, var4);
                    this.field_t = null;
                    break L13;
                  }
                }
              } else {
                if (var2 != 0) {
                  break L13;
                } else {
                  if (null == this.field_t) {
                    break L13;
                  } else {
                    this.field_t.a(param0 + -117, var4);
                    this.field_t = null;
                    break L13;
                  }
                }
              }
            }
            L14: {
              if (var3 == 0) {
                break L14;
              } else {
                if (!this.field_p) {
                  discarded$1 = var4.a(new fm(7, this.b((byte) -109), this.c((byte) 125), this.e((byte) -115)), param0 ^ 57);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              stackOut_47_0 = this;
              stackIn_49_0 = stackOut_47_0;
              stackIn_48_0 = stackOut_47_0;
              if (var3 == 0) {
                stackOut_49_0 = this;
                stackOut_49_1 = 0;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                break L15;
              } else {
                stackOut_48_0 = this;
                stackOut_48_1 = 1;
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                break L15;
              }
            }
            ((ce) (this)).field_p = stackIn_50_1 != 0;
            var15 = var5.field_B;
            var16 = new uja(var15);
            var17 = 0;
            var18_ref = (wda) ((Object) var16.a(true));
            if (var18_ref == null) {
              if (var17 != 0) {
                break L9;
              } else {
                if (this.field_v == null) {
                  break L9;
                } else {
                  this.field_v.a(param0 + 15, var4);
                  this.field_v = null;
                  break L9;
                }
              }
            } else {
              if (var17 != 0) {
                break L9;
              } else {
                if (this.field_v == null) {
                  break L9;
                } else {
                  this.field_v.a(param0 + 15, var4);
                  this.field_v = null;
                  break L9;
                }
              }
            }
          }
          L16: {
            if (this.field_o != null) {
              this.field_o.a(this.b((byte) -97), var4.field_c, param0 ^ 127, var4.field_h, this.c((byte) 96));
              break L16;
            } else {
              break L16;
            }
          }
          L17: {
            if (this.field_t != null) {
              this.field_t.a(this.b((byte) 103), var4.field_c, -128, var4.field_h, this.c((byte) 127));
              break L17;
            } else {
              break L17;
            }
          }
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -58, param1);
            int var3_int = -7 % ((param0 - -8) / 40);
            param1.a((byte) -16, this.field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        eh var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.h(119);
        if (this.field_r == null) {
          return;
        } else {
          if (param0 <= 0) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              L1: {
                if (this.field_z <= var2) {
                  break L1;
                } else {
                  if (var6 != 0) {
                    break L1;
                  } else {
                    var3 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (this.field_s <= var3) {
                            break L4;
                          } else {
                            var4 = this.field_r[var2][var3];
                            var5 = mpa.field_W[var4.field_h];
                            var4.field_a = dfa.a(-var4.field_a + var5, 2048, 65);
                            var4.field_d = -var4.field_d;
                            var3++;
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
                        var2++;
                        break L3;
                      }
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void b(int param0, byte param1) {
        if (param1 != 23) {
            field_B = false;
        }
        this.field_q = param0;
    }

    final void a(uw param0, int param1) {
        try {
            if (param1 < 82) {
                uw var4 = (uw) null;
                this.b(-71, (uw) null);
            }
            super.a(param0, 105);
            this.field_r = (eh[][]) null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, uw param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 40) {
                break L1;
              } else {
                this.field_v = (fla) null;
                break L1;
              }
            }
            L2: {
              if (null == this.field_r) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (this.field_z <= var4_int) {
                    break L2;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var5 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (this.field_s <= var5) {
                              break L6;
                            } else {
                              param1.a(param0, this.field_r[var4_int][var5], (byte) -33);
                              var5++;
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
                          var4_int++;
                          break L5;
                        }
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("ce.FA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    private final void o(byte param0) {
        this.field_s = 1;
        this.field_z = 1;
        this.field_r = new eh[1][1];
        if (param0 < 74) {
            this.a((byte) 41, 36);
        }
        eh var3 = new eh();
        eh var2 = var3;
        var2.field_a = 0;
        var2.field_c = 0;
        var2.field_d = 0;
        var2.field_h = 0;
        var2.field_e = (ce) (this);
        var2.field_b = this.a(53).e(true).a(100, 0);
        var2.field_f = this.a(var3, 2);
        this.field_r[0][0] = var3;
    }

    final int k(byte param0) {
        int var2 = 0;
        if (this.field_h.j(-1)) {
          return 2;
        } else {
          L0: {
            if (param0 == -99) {
              break L0;
            } else {
              this.field_r = (eh[][]) null;
              break L0;
            }
          }
          L1: {
            var2 = this.field_q;
            if (-3 != (var2 ^ -1)) {
              break L1;
            } else {
              if (TombRacer.field_G) {
                break L1;
              } else {
                return 2;
              }
            }
          }
          if ((var2 ^ -1) != -2) {
            return 3;
          } else {
            return 5;
          }
        }
    }

    ce(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    final void a(byte param0, int param1, uw param2) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 50) {
                break L1;
              } else {
                discarded$2 = this.n((byte) 0);
                break L1;
              }
            }
            L2: {
              if (null == this.field_r) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (this.field_z <= var4_int) {
                    break L2;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var5 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var5 >= this.field_s) {
                              break L6;
                            } else {
                              param2.a((byte) -111, param1, this.field_r[var4_int][var5]);
                              var5++;
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
                          var4_int++;
                          break L5;
                        }
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("ce.V(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(127, param1, param2);
              this.field_q = param2.b((byte) 44, 4);
              if (param0 > 119) {
                break L1;
              } else {
                this.field_s = -69;
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
            stackOut_3_1 = new StringBuilder().append("ce.G(").append(param0).append(',');
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
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void j(int param0) {
        psa var1 = new psa();
        psa var2 = new psa(var1);
        var1.d(128, 9, param0 + 6);
        var2.d(128, 9, 32460);
        if (param0 != 32454) {
            ce.l(-98);
        }
        ab.field_n = new sq(var1, var2);
        wea.a(22050, 1024, ab.field_n, true, (java.awt.Component) ((Object) nma.field_l), dsa.field_c);
        wra.a(0);
    }

    private final int a(eh param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                L2: {
                  var3_int = this.field_q;
                  if (var3_int != 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((var3_int ^ -1) != -2) {
                    break L3;
                  } else {
                    if (var4 == 0) {
                      stackOut_21_0 = 26;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3_int == 2) {
                  var3_int = param0.field_h;
                  if (-1 == (var3_int ^ -1)) {
                    if (33 <= param0.field_b) {
                      if (-67 >= (param0.field_b ^ -1)) {
                        stackOut_35_0 = 56;
                        stackIn_36_0 = stackOut_35_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackOut_33_0 = 55;
                        stackIn_34_0 = stackOut_33_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackOut_30_0 = 54;
                      stackIn_31_0 = stackOut_30_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    L4: {
                      if (1 != var3_int) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          if (param0.field_b < 33) {
                            stackOut_43_0 = 57;
                            stackIn_44_0 = stackOut_43_0;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            if ((param0.field_b ^ -1) > -67) {
                              stackOut_41_0 = 58;
                              stackIn_42_0 = stackOut_41_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackOut_39_0 = 59;
                              stackIn_40_0 = stackOut_39_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if ((var3_int ^ -1) == -3) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (-51 >= (param0.field_b ^ -1)) {
                      stackOut_48_0 = 61;
                      stackIn_49_0 = stackOut_48_0;
                      decompiledRegionSelector0 = 12;
                      break L0;
                    } else {
                      stackOut_46_0 = 60;
                      stackIn_47_0 = stackOut_46_0;
                      decompiledRegionSelector0 = 11;
                      break L0;
                    }
                  }
                } else {
                  if (4 == var3_int) {
                    if (33 > param0.field_b) {
                      stackOut_56_0 = 110;
                      stackIn_57_0 = stackOut_56_0;
                      decompiledRegionSelector0 = 15;
                      break L0;
                    } else {
                      if (param0.field_b < 66) {
                        stackOut_54_0 = 111;
                        stackIn_55_0 = stackOut_54_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        stackOut_52_0 = 112;
                        stackIn_53_0 = stackOut_52_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (-34 < (param0.field_b ^ -1)) {
                stackOut_19_0 = 51;
                stackIn_20_0 = stackOut_19_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if ((param0.field_b ^ -1) > -67) {
                  stackOut_17_0 = 52;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_15_0 = 53;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = -64;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var3);
            stackOut_58_1 = new StringBuilder().append("ce.H(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L6;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_34_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_36_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_40_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_42_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_44_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_47_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_49_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_53_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_55_0;
                                    } else {
                                      return stackIn_57_0;
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
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 63 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean p(byte param0) {
        if (param0 < 7) {
            uw var3 = (uw) null;
            this.b(-54, (uw) null);
        }
        return (this.field_q ^ -1) != -2 ? true : false;
    }

    static {
        field_n = new String[17];
        field_n[5] = "Path Move";
        field_n[7] = "Face Player";
        field_n[9] = "Circle Movement";
        field_n[15] = "Teleport";
        field_n[2] = "Locomotor Controller";
        field_n[16] = "Sweep Rotate";
        field_n[4] = "Mirror Mover";
        field_n[10] = "Face Point";
        field_n[1] = "Approach Player";
        field_n[13] = "Constrain To Facing Arc";
        field_n[6] = "Rotate";
        field_n[0] = "Simple Move";
        field_n[8] = "Constrain To Circle";
        field_n[12] = "Constrain To Lattice";
        field_n[14] = "Track Player";
        field_n[3] = "Flee";
        field_n[11] = "Constrain To Rectangle";
        field_B = true;
        field_w = "<%0> is already on your friend list.";
    }
}
