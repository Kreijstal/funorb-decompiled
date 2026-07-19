/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends nc {
    private int[] field_y;
    private int field_x;
    private int field_v;
    private int field_m;
    private int[] field_r;
    private int field_E;
    private int field_n;
    private int[] field_A;
    private int field_p;
    private int field_w;
    static double field_C;
    static String field_D;
    private cb[] field_u;
    private int field_s;
    private String field_l;
    private kb field_z;
    private int field_t;
    private int field_B;
    private int field_q;
    private boolean field_o;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -118) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = this.field_j.length;
                  if (var4 == 1) {
                    break L3;
                  } else {
                    if (-3 != (var4 ^ -1)) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = 1;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (0 == param1) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = 2;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              var3 = stackIn_10_0;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            var3 = param1;
            break L0;
          }
          L5: {
            var4 = var3;
            if (0 == var4) {
              break L5;
            } else {
              L6: {
                if (1 != var4) {
                  break L6;
                } else {
                  if (var5 == 0) {
                    return 240;
                  } else {
                    break L6;
                  }
                }
              }
              if (-3 != (var4 ^ -1)) {
                return super.a((byte) -118, param1);
              } else {
                if (var5 == 0) {
                  return 430;
                } else {
                  break L5;
                }
              }
            }
          }
          return 50;
        } else {
          return 5;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, kb param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rp var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int[] stackIn_16_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        int[] stackOut_14_1 = null;
        Object stackOut_15_0 = null;
        int[] stackOut_15_1 = null;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_t = param0;
              this.field_B = param1;
              this.field_x = 50;
              this.field_z = param4;
              we.field_g[42] = u.field_j;
              this.field_q = param2;
              we.field_g[43] = ec.field_a;
              this.field_n = 0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 >= (fb.field_e.field_M ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((si) (this)).field_o = stackIn_4_1 != 0;
                if ((fb.field_e.field_M ^ -1) != (this.field_q ^ -1)) {
                  break L3;
                } else {
                  this.field_l = nh.field_h;
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!this.field_o) {
                  break L4;
                } else {
                  this.field_l = "";
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_l = gf.field_c;
              break L2;
            }
            L5: {
              L6: {
                gj.a(6962);
                if (this.field_o) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      stackOut_12_0 = this;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (!this.field_z.field_i) {
                        break L8;
                      } else {
                        stackOut_13_0 = this;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (this.field_t <= 0) {
                          break L8;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = ga.field_s;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          break L7;
                        }
                      }
                    }
                    stackOut_15_0 = this;
                    stackOut_15_1 = wk.field_L;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L7;
                  }
                  ((si) (this)).field_j = stackIn_16_1;
                  if (var12 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              this.field_j = cq.field_c;
              break L5;
            }
            this.field_g.a(-9049, true, this.a(-6003, bo.field_d, bd.field_g));
            this.field_g.field_c = this.field_j.length;
            this.field_y = (int[]) ((Object) param3.clone());
            var6_int = 0;
            L9: while (true) {
              L10: {
                L11: {
                  L12: {
                    if ((this.field_y.length ^ -1) >= (var6_int ^ -1)) {
                      break L12;
                    } else {
                      stackOut_20_0 = -1;
                      stackOut_20_1 = 1 << var6_int & this.field_z.field_F ^ -1;
                      stackIn_30_0 = stackOut_20_0;
                      stackIn_30_1 = stackOut_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (var12 != 0) {
                        L13: while (true) {
                          if (stackIn_30_0 >= stackIn_30_1) {
                            break L11;
                          } else {
                            var7 = this.field_y[var6_int];
                            stackOut_31_0 = this;
                            stackOut_31_1 = var7;
                            stackIn_43_0 = stackOut_31_0;
                            stackIn_43_1 = stackOut_31_1;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            if (var12 != 0) {
                              break L10;
                            } else {
                              L14: {
                                stackOut_32_0 = this;
                                stackIn_34_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if (stackIn_32_1 < this.field_w) {
                                  stackOut_34_0 = this;
                                  stackOut_34_1 = this.field_w;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  break L14;
                                } else {
                                  stackOut_33_0 = this;
                                  stackOut_33_1 = var7;
                                  stackIn_35_0 = stackOut_33_0;
                                  stackIn_35_1 = stackOut_33_1;
                                  break L14;
                                }
                              }
                              ((si) (this)).field_w = stackIn_35_1;
                              this.field_A[var6_int] = var6_int;
                              var8 = -1 + var6_int;
                              L15: while (true) {
                                L16: {
                                  if ((var8 ^ -1) > -1) {
                                    break L16;
                                  } else {
                                    stackOut_37_0 = this.field_y[var6_int];
                                    stackOut_37_1 = this.field_y[this.field_A[var8]];
                                    stackIn_30_0 = stackOut_37_0;
                                    stackIn_30_1 = stackOut_37_1;
                                    stackIn_38_0 = stackOut_37_0;
                                    stackIn_38_1 = stackOut_37_1;
                                    if (var12 != 0) {
                                      continue L13;
                                    } else {
                                      if (stackIn_38_0 < stackIn_38_1) {
                                        break L16;
                                      } else {
                                        this.field_A[var8 + 1] = this.field_A[var8];
                                        var8--;
                                        if (var12 == 0) {
                                          continue L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                }
                                this.field_A[var8 - -1] = var6_int;
                                var6_int++;
                                if (var12 == 0) {
                                  stackOut_29_0 = var6_int;
                                  stackOut_29_1 = param3.length;
                                  stackIn_30_0 = stackOut_29_0;
                                  stackIn_30_1 = stackOut_29_1;
                                  continue L13;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L17: {
                          if (stackIn_21_0 == stackIn_21_1) {
                            stackOut_23_0 = 0;
                            stackIn_24_0 = stackOut_23_0;
                            break L17;
                          } else {
                            stackOut_22_0 = 1;
                            stackIn_24_0 = stackOut_22_0;
                            break L17;
                          }
                        }
                        L18: {
                          var7 = stackIn_24_0;
                          if (var7 != 0) {
                            this.field_y[var6_int] = 0;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var6_int++;
                        if (var12 == 0) {
                          continue L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  this.field_w = 1;
                  this.field_p = this.field_z.field_H * 20 / 1000;
                  this.field_A = new int[this.field_y.length];
                  var6_int = 0;
                  L19: while (true) {
                    stackOut_29_0 = var6_int;
                    stackOut_29_1 = param3.length;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    L20: while (true) {
                      if (stackIn_30_0 >= stackIn_30_1) {
                        break L11;
                      } else {
                        var7 = this.field_y[var6_int];
                        stackOut_31_0 = this;
                        stackOut_31_1 = var7;
                        stackIn_43_0 = stackOut_31_0;
                        stackIn_43_1 = stackOut_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        if (var12 != 0) {
                          break L10;
                        } else {
                          L21: {
                            stackOut_32_0 = this;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_33_0 = stackOut_32_0;
                            if (stackIn_32_1 < this.field_w) {
                              stackOut_34_0 = this;
                              stackOut_34_1 = this.field_w;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              break L21;
                            } else {
                              stackOut_33_0 = this;
                              stackOut_33_1 = var7;
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_35_1 = stackOut_33_1;
                              break L21;
                            }
                          }
                          ((si) (this)).field_w = stackIn_35_1;
                          this.field_A[var6_int] = var6_int;
                          var8 = -1 + var6_int;
                          L22: while (true) {
                            L23: {
                              if ((var8 ^ -1) > -1) {
                                break L23;
                              } else {
                                stackOut_37_0 = this.field_y[var6_int];
                                stackOut_37_1 = this.field_y[this.field_A[var8]];
                                stackIn_30_0 = stackOut_37_0;
                                stackIn_30_1 = stackOut_37_1;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                if (var12 != 0) {
                                  continue L20;
                                } else {
                                  if (stackIn_38_0 < stackIn_38_1) {
                                    break L23;
                                  } else {
                                    this.field_A[var8 + 1] = this.field_A[var8];
                                    var8--;
                                    if (var12 == 0) {
                                      continue L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                            }
                            this.field_A[var8 - -1] = var6_int;
                            var6_int++;
                            if (var12 == 0) {
                              continue L19;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_42_0 = this;
                stackOut_42_1 = 0;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                break L10;
              }
              L24: {
                ((si) (this)).field_v = stackIn_43_1;
                if (!gf.field_h) {
                  var13 = ll.field_k;
                  var7 = var13.g((byte) -32);
                  var8 = 0;
                  L25: while (true) {
                    L26: {
                      L27: {
                        L28: {
                          if ((var7 ^ -1) >= (var8 ^ -1)) {
                            break L28;
                          } else {
                            stackOut_47_0 = ll.field_k.field_m[var8];
                            stackOut_47_1 = 255;
                            stackIn_56_0 = stackOut_47_0;
                            stackIn_56_1 = stackOut_47_1;
                            stackIn_48_0 = stackOut_47_0;
                            stackIn_48_1 = stackOut_47_1;
                            if (var12 != 0) {
                              L29: while (true) {
                                if (stackIn_56_0 >= stackIn_56_1) {
                                  break L27;
                                } else {
                                  stackOut_57_0 = 255;
                                  stackOut_57_1 = ll.field_k.field_s[var8];
                                  stackIn_63_0 = stackOut_57_0;
                                  stackIn_63_1 = stackOut_57_1;
                                  stackIn_58_0 = stackOut_57_0;
                                  stackIn_58_1 = stackOut_57_1;
                                  if (var12 != 0) {
                                    break L26;
                                  } else {
                                    L30: {
                                      if (stackIn_58_0 != stackIn_58_1) {
                                        this.e(ll.field_k.field_s[var8], 4);
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                    var8++;
                                    if (var12 == 0) {
                                      stackOut_55_0 = var8;
                                      stackOut_55_1 = 3;
                                      stackIn_56_0 = stackOut_55_0;
                                      stackIn_56_1 = stackOut_55_1;
                                      continue L29;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                            } else {
                              L31: {
                                if (stackIn_48_0 != stackIn_48_1) {
                                  this.e(ll.field_k.field_m[var8], param1 + 4);
                                  if (255 != ll.field_k.field_g[var8]) {
                                    this.e(ll.field_k.field_g[var8], 4);
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                } else {
                                  break L31;
                                }
                              }
                              var8++;
                              if (var12 == 0) {
                                continue L25;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        var8 = 0;
                        L32: while (true) {
                          stackOut_55_0 = var8;
                          stackOut_55_1 = 3;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          if (stackIn_56_0 >= stackIn_56_1) {
                            break L27;
                          } else {
                            stackOut_57_0 = 255;
                            stackOut_57_1 = ll.field_k.field_s[var8];
                            stackIn_63_0 = stackOut_57_0;
                            stackIn_63_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (var12 != 0) {
                              break L26;
                            } else {
                              L33: {
                                if (stackIn_58_0 != stackIn_58_1) {
                                  this.e(ll.field_k.field_s[var8], 4);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              var8++;
                              if (var12 == 0) {
                                continue L32;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                      }
                      stackOut_62_0 = 0;
                      stackOut_62_1 = this.field_v;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      break L26;
                    }
                    if (stackIn_63_0 < stackIn_63_1) {
                      this.field_r = new int[this.field_v];
                      var8 = this.field_t;
                      var9 = 0;
                      L34: while (true) {
                        L35: {
                          L36: {
                            if (var9 >= this.field_v) {
                              break L36;
                            } else {
                              var10 = var8 / (this.field_v - var9);
                              var11 = this.field_u[var9].field_m;
                              ll.field_k.a(-126, var10, var11);
                              this.field_u[var9].a(0, var10);
                              var8 = var8 - var10;
                              this.field_r[var9] = var10;
                              var9++;
                              if (var12 != 0) {
                                break L35;
                              } else {
                                if (var12 == 0) {
                                  continue L34;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                          th.b((byte) -61);
                          break L35;
                        }
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                } else {
                  break L24;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var6 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) (var6);
            stackOut_72_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L37;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L37;
            }
          }
          L38: {
            stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param4 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L38;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L38;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
        }
    }

    private final String e(int param0) {
        if (param0 >= -85) {
            return (String) null;
        }
        int var2 = this.field_p / 60;
        int var3 = this.field_p % 60;
        return var2 + ":" + (10 > var3 ? "0" : "") + var3;
    }

    final static void a(boolean param0, boolean param1, ul param2, ul param3, ul param4) {
        try {
            tg.field_g = tg.a("", !param0 ? true : false);
            tg.field_g.a(-17853, param0);
            qe.a(param4, -8995, param3, param2);
            dg.i(4);
            id.field_B = mp.field_b;
            ta.field_hb = mp.field_b;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "si.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 23697) {
            return 127;
        }
        return 430;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -64) {
            break L0;
          } else {
            this.field_v = -63;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                var4 = this.field_j[param2];
                var5 = var4;
                if ((var5 ^ -1) == -44) {
                  if (this.field_g.c(-85)) {
                    if (!this.field_o) {
                      L5: {
                        if (this.field_B != 0) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L5;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L5;
                        }
                      }
                      L6: {
                        stackOut_12_0 = stackIn_12_0;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if ((this.field_n ^ -1) >= -1) {
                          stackOut_14_0 = stackIn_14_0;
                          stackOut_14_1 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L6;
                        } else {
                          stackOut_13_0 = stackIn_13_0;
                          stackOut_13_1 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          break L6;
                        }
                      }
                      L7: {
                        if ((stackIn_15_0 ^ stackIn_15_1) != 0) {
                          break L7;
                        } else {
                          this.b(false, 0);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.b(false, 1);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  if ((var5 ^ -1) == -43) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_g.c(-85)) {
                ma.field_a.b((byte) -35, 61);
                if (var6 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                break L1;
              }
            }
            super.b(-110, param1, param2);
            break L1;
          }
          break L1;
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                field_C = 1.243267543236342;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                if (hl.field_e.length <= var5_int) {
                  break L3;
                } else {
                  param4 = hl.field_e[var5_int];
                  if (var7 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var6 = var5_int << -179841596;
                    L4: while (true) {
                      L5: {
                        L6: {
                          incrementValue$4 = param4;
                          param4--;
                          if (0 == incrementValue$4) {
                            break L6;
                          } else {
                            incrementValue$5 = var6;
                            var6++;
                            param0 = ah.field_f[incrementValue$5];
                            param3[param2[param0]] = param3[param2[param0]] + 1;
                            ah.field_f[param3[param2[param0]]] = param0;
                            if (var7 != 0) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var5_int++;
                        break L5;
                      }
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("si.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          L8: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    si(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, wk.field_L);
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_B = 0;
        try {
          L0: {
            this.field_u = new cb[13];
            var8_int = 0;
            L1: while (true) {
              L2: {
                if (var8_int >= this.field_u.length) {
                  break L2;
                } else {
                  this.field_u[var8_int] = new cb();
                  var8_int++;
                  if (var9 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var9 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var8);
            stackOut_7_1 = new StringBuilder().append("si.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        ja var25 = null;
        int var26 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        sl stackIn_33_0 = null;
        String stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        sl stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        sl stackIn_35_0 = null;
        String stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        sl stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        sl stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        sl stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_60_0 = 0;
        ef stackIn_64_0 = null;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        ef stackIn_65_0 = null;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        ef stackIn_66_0 = null;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        ef stackIn_124_0 = null;
        String stackIn_124_1 = null;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        ef stackIn_125_0 = null;
        String stackIn_125_1 = null;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        ef stackIn_126_0 = null;
        String stackIn_126_1 = null;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int stackIn_126_4 = 0;
        ef stackIn_130_0 = null;
        String stackIn_130_1 = null;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        ef stackIn_131_0 = null;
        String stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        ef stackIn_132_0 = null;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_132_3 = 0;
        int stackIn_132_4 = 0;
        ef stackIn_155_0 = null;
        String stackIn_155_1 = null;
        int stackIn_155_2 = 0;
        int stackIn_155_3 = 0;
        ef stackIn_156_0 = null;
        String stackIn_156_1 = null;
        int stackIn_156_2 = 0;
        int stackIn_156_3 = 0;
        ef stackIn_157_0 = null;
        String stackIn_157_1 = null;
        int stackIn_157_2 = 0;
        int stackIn_157_3 = 0;
        int stackIn_157_4 = 0;
        ef stackIn_175_0 = null;
        String stackIn_175_1 = null;
        int stackIn_175_2 = 0;
        int stackIn_175_3 = 0;
        ef stackIn_178_0 = null;
        String stackIn_178_1 = null;
        int stackIn_178_2 = 0;
        int stackIn_178_3 = 0;
        int stackIn_178_4 = 0;
        ef stackIn_179_0 = null;
        String stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        int stackIn_179_3 = 0;
        ef stackIn_181_0 = null;
        String stackIn_181_1 = null;
        int stackIn_181_2 = 0;
        int stackIn_181_3 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        sl stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        sl stackOut_34_0 = null;
        String stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        sl stackOut_33_0 = null;
        String stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        sl stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        sl stackOut_41_0 = null;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        sl stackOut_40_0 = null;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        boolean stackOut_59_0 = false;
        ef stackOut_63_0 = null;
        String stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        ef stackOut_65_0 = null;
        String stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        ef stackOut_64_0 = null;
        String stackOut_64_1 = null;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        int stackOut_208_0 = 0;
        int stackOut_208_1 = 0;
        int stackOut_202_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_211_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        ef stackOut_180_0 = null;
        String stackOut_180_1 = null;
        int stackOut_180_2 = 0;
        int stackOut_180_3 = 0;
        ef stackOut_179_0 = null;
        String stackOut_179_1 = null;
        int stackOut_179_2 = 0;
        int stackOut_179_3 = 0;
        int stackOut_179_4 = 0;
        ef stackOut_181_0 = null;
        String stackOut_181_1 = null;
        int stackOut_181_2 = 0;
        int stackOut_181_3 = 0;
        ef stackOut_175_0 = null;
        String stackOut_175_1 = null;
        int stackOut_175_2 = 0;
        int stackOut_175_3 = 0;
        int stackOut_175_4 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        ef stackOut_123_0 = null;
        String stackOut_123_1 = null;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        ef stackOut_125_0 = null;
        String stackOut_125_1 = null;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int stackOut_125_4 = 0;
        ef stackOut_124_0 = null;
        String stackOut_124_1 = null;
        int stackOut_124_2 = 0;
        int stackOut_124_3 = 0;
        int stackOut_124_4 = 0;
        ef stackOut_129_0 = null;
        String stackOut_129_1 = null;
        int stackOut_129_2 = 0;
        int stackOut_129_3 = 0;
        ef stackOut_131_0 = null;
        String stackOut_131_1 = null;
        int stackOut_131_2 = 0;
        int stackOut_131_3 = 0;
        int stackOut_131_4 = 0;
        ef stackOut_130_0 = null;
        String stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        int stackOut_130_3 = 0;
        int stackOut_130_4 = 0;
        ef stackOut_154_0 = null;
        String stackOut_154_1 = null;
        int stackOut_154_2 = 0;
        int stackOut_154_3 = 0;
        ef stackOut_156_0 = null;
        String stackOut_156_1 = null;
        int stackOut_156_2 = 0;
        int stackOut_156_3 = 0;
        int stackOut_156_4 = 0;
        ef stackOut_155_0 = null;
        String stackOut_155_1 = null;
        int stackOut_155_2 = 0;
        int stackOut_155_3 = 0;
        int stackOut_155_4 = 0;
        L0: {
          var26 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var2 = 378;
          var3 = 0;
          var4 = ah.field_e.field_C + ah.field_e.field_r;
          this.field_E = 255;
          if (this.field_n == 0) {
            stackOut_2_0 = 255;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_n * 255 / 33;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = stackIn_3_0;
            if (0 == this.field_B) {
              break L2;
            } else {
              if (this.field_n <= 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if ((this.field_B ^ -1) == -1) {
              stackOut_8_0 = var5;
              stackIn_9_0 = stackOut_8_0;
              break L3;
            } else {
              stackOut_7_0 = 255 - var5;
              stackIn_9_0 = stackOut_7_0;
              break L3;
            }
          }
          var6 = stackIn_9_0;
          var7 = 94;
          if (null == this.field_l) {
            return;
          } else {
            L4: {
              qp.field_w.a(dj.field_o, 90, 134, 16777215, 1, var6);
              qp.field_w.a(qm.field_N, 478, 134, 16777215, 1, var6);
              var8_int = 555;
              if (this.field_z.field_i) {
                qp.field_w.a(th.field_d, var8_int, 122, 16777215, 1, var6);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              qp.field_w.a(bo.field_c, var8_int, 134, 16777215, 1, var6);
              var7 = var7 + (-5 + (1 - -pb.field_e.a(this.field_l, 0, 90, 640, 240, 65280, var3, var6, 1, 0, 30)) * var4);
              if (205 <= var7) {
                break L5;
              } else {
                var7 = 205;
                break L5;
              }
            }
            var9 = qb.field_h.field_e;
            var10 = 150;
            var11 = 0;
            var12 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if ((var12 ^ -1) <= (this.field_z.field_t ^ -1)) {
                    break L8;
                  } else {
                    var13 = this.field_A[var12];
                    stackOut_19_0 = wp.field_h.field_M;
                    stackOut_19_1 = var13;
                    stackIn_71_0 = stackOut_19_0;
                    stackIn_71_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (var26 != 0) {
                      break L7;
                    } else {
                      L9: {
                        if (stackIn_20_0 != stackIn_20_1) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L9;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L9;
                        }
                      }
                      L10: {
                        var14 = stackIn_23_0;
                        var15 = var9 * this.field_y[var13] / this.field_w;
                        if (-1 == (this.field_z.field_F & 1 << var13 ^ -1)) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L10;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L10;
                        }
                      }
                      L11: {
                        var16 = stackIn_26_0;
                        if (-1 == (op.field_m.field_j & 1 << var13 ^ -1)) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          break L11;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L11;
                        }
                      }
                      L12: {
                        var17 = stackIn_29_0;
                        if (var9 >= var15) {
                          stackOut_31_0 = var15;
                          stackIn_32_0 = stackOut_31_0;
                          break L12;
                        } else {
                          stackOut_30_0 = var9;
                          stackIn_32_0 = stackOut_30_0;
                          break L12;
                        }
                      }
                      L13: {
                        var15 = stackIn_32_0;
                        stackOut_32_0 = ah.field_e;
                        stackOut_32_1 = this.field_z.field_b[var13];
                        stackOut_32_2 = 280;
                        stackOut_32_3 = var10;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_34_2 = stackOut_32_2;
                        stackIn_34_3 = stackOut_32_3;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        stackIn_33_2 = stackOut_32_2;
                        stackIn_33_3 = stackOut_32_3;
                        if (var14 == 0) {
                          stackOut_34_0 = (sl) ((Object) stackIn_34_0);
                          stackOut_34_1 = (String) ((Object) stackIn_34_1);
                          stackOut_34_2 = stackIn_34_2;
                          stackOut_34_3 = stackIn_34_3;
                          stackOut_34_4 = 6;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          stackIn_35_3 = stackOut_34_3;
                          stackIn_35_4 = stackOut_34_4;
                          break L13;
                        } else {
                          stackOut_33_0 = (sl) ((Object) stackIn_33_0);
                          stackOut_33_1 = (String) ((Object) stackIn_33_1);
                          stackOut_33_2 = stackIn_33_2;
                          stackOut_33_3 = stackIn_33_3;
                          stackOut_33_4 = 0;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          stackIn_35_3 = stackOut_33_3;
                          stackIn_35_4 = stackOut_33_4;
                          break L13;
                        }
                      }
                      L14: {
                        ((sl) (Object) stackIn_35_0).a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4, var3, var6);
                        if (var17 != 0) {
                          oo.e(33, var10 - 14, qp.field_w.a(ak.field_d) - -14, 15, 7, 16777215);
                          oo.b(33, -15 + var10, qp.field_w.a(ak.field_d) + 16, 17, 7, 65793);
                          qp.field_w.b(ak.field_d, 40, var10 + -2, 65793, -1, var6);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        L16: {
                          if (var16 != 0) {
                            break L16;
                          } else {
                            L17: {
                              stackOut_39_0 = ah.field_e;
                              stackOut_39_1 = Integer.toString(this.field_y[var13]);
                              stackOut_39_2 = 90;
                              stackOut_39_3 = var10 + 28;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              stackIn_41_3 = stackOut_39_3;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              stackIn_40_2 = stackOut_39_2;
                              stackIn_40_3 = stackOut_39_3;
                              if (var14 == 0) {
                                stackOut_41_0 = (sl) ((Object) stackIn_41_0);
                                stackOut_41_1 = (String) ((Object) stackIn_41_1);
                                stackOut_41_2 = stackIn_41_2;
                                stackOut_41_3 = stackIn_41_3;
                                stackOut_41_4 = 6;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                stackIn_42_3 = stackOut_41_3;
                                stackIn_42_4 = stackOut_41_4;
                                break L17;
                              } else {
                                stackOut_40_0 = (sl) ((Object) stackIn_40_0);
                                stackOut_40_1 = (String) ((Object) stackIn_40_1);
                                stackOut_40_2 = stackIn_40_2;
                                stackOut_40_3 = stackIn_40_3;
                                stackOut_40_4 = 0;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_42_1 = stackOut_40_1;
                                stackIn_42_2 = stackOut_40_2;
                                stackIn_42_3 = stackOut_40_3;
                                stackIn_42_4 = stackOut_40_4;
                                break L17;
                              }
                            }
                            ((sl) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, var3, var6);
                            if (var26 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        qp.field_w.a(io.field_d, 90, var10 - -24, 11184810, 1, var6);
                        break L15;
                      }
                      L18: {
                        qb.field_h.a(135, 4 + var10, var6);
                        oo.h(138, 0, var15 + 138, 480);
                        stackOut_44_0 = 140;
                        stackOut_44_1 = 9 + var10;
                        stackOut_44_2 = qb.field_h.field_e - 10;
                        stackOut_44_3 = 16;
                        stackOut_44_4 = 7;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        stackIn_46_3 = stackOut_44_3;
                        stackIn_46_4 = stackOut_44_4;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        stackIn_45_3 = stackOut_44_3;
                        stackIn_45_4 = stackOut_44_4;
                        if (var14 != 0) {
                          stackOut_46_0 = stackIn_46_0;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = stackIn_46_2;
                          stackOut_46_3 = stackIn_46_3;
                          stackOut_46_4 = stackIn_46_4;
                          stackOut_46_5 = 16711680;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          stackIn_47_3 = stackOut_46_3;
                          stackIn_47_4 = stackOut_46_4;
                          stackIn_47_5 = stackOut_46_5;
                          break L18;
                        } else {
                          stackOut_45_0 = stackIn_45_0;
                          stackOut_45_1 = stackIn_45_1;
                          stackOut_45_2 = stackIn_45_2;
                          stackOut_45_3 = stackIn_45_3;
                          stackOut_45_4 = stackIn_45_4;
                          stackOut_45_5 = 65535;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          stackIn_47_2 = stackOut_45_2;
                          stackIn_47_3 = stackOut_45_3;
                          stackIn_47_4 = stackOut_45_4;
                          stackIn_47_5 = stackOut_45_5;
                          break L18;
                        }
                      }
                      oo.b(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, var6 / 2);
                      oo.h(0, 0, 640, 480);
                      var18 = 436;
                      var19 = 0;
                      L19: while (true) {
                        L20: {
                          L21: {
                            if ((var19 ^ -1) <= -64) {
                              break L21;
                            } else {
                              L22: {
                                if (!this.field_z.b((byte) -121, var19, var13)) {
                                  stackOut_51_0 = 0;
                                  stackIn_52_0 = stackOut_51_0;
                                  break L22;
                                } else {
                                  stackOut_50_0 = 1;
                                  stackIn_52_0 = stackOut_50_0;
                                  break L22;
                                }
                              }
                              var20 = stackIn_52_0;
                              stackOut_52_0 = var20;
                              stackIn_60_0 = stackOut_52_0;
                              stackIn_53_0 = stackOut_52_0;
                              if (var26 != 0) {
                                break L20;
                              } else {
                                L23: {
                                  if (stackIn_53_0 != 0) {
                                    L24: {
                                      wa.field_b[-18 + var19].c(var18, var10 + 5, var6);
                                      if (!wa.field_b[var19 - 18].b(var18, 5 + var10, bd.field_g, bo.field_d)) {
                                        break L24;
                                      } else {
                                        this.field_E = var19;
                                        break L24;
                                      }
                                    }
                                    var18 += 28;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                var19++;
                                if (var26 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          var19 = op.field_m.field_o[var13];
                          var20 = op.field_m.field_v[var13];
                          stackOut_59_0 = this.field_z.field_i;
                          stackIn_60_0 = stackOut_59_0 ? 1 : 0;
                          break L20;
                        }
                        L25: {
                          L26: {
                            if (stackIn_60_0 != 0) {
                              break L26;
                            } else {
                              qp.field_w.a(Integer.toString(var20), var8_int, var10 + 22, 16777215, 1, var6);
                              if (var26 == 0) {
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          L27: {
                            qp.field_w.a(Integer.toString(var20), var8_int, 15 + var10, 16777215, 1, var6);
                            stackOut_63_0 = qp.field_w;
                            stackOut_63_1 = eb.a(var20 - var19, true, param0);
                            stackOut_63_2 = var8_int - 2;
                            stackOut_63_3 = 30 + var10;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_65_1 = stackOut_63_1;
                            stackIn_65_2 = stackOut_63_2;
                            stackIn_65_3 = stackOut_63_3;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            stackIn_64_2 = stackOut_63_2;
                            stackIn_64_3 = stackOut_63_3;
                            if ((var19 ^ -1) > (var20 ^ -1)) {
                              stackOut_65_0 = (ef) ((Object) stackIn_65_0);
                              stackOut_65_1 = (String) ((Object) stackIn_65_1);
                              stackOut_65_2 = stackIn_65_2;
                              stackOut_65_3 = stackIn_65_3;
                              stackOut_65_4 = 65280;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              stackIn_66_2 = stackOut_65_2;
                              stackIn_66_3 = stackOut_65_3;
                              stackIn_66_4 = stackOut_65_4;
                              break L27;
                            } else {
                              stackOut_64_0 = (ef) ((Object) stackIn_64_0);
                              stackOut_64_1 = (String) ((Object) stackIn_64_1);
                              stackOut_64_2 = stackIn_64_2;
                              stackOut_64_3 = stackIn_64_3;
                              stackOut_64_4 = 16711680;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              stackIn_66_2 = stackOut_64_2;
                              stackIn_66_3 = stackOut_64_3;
                              stackIn_66_4 = stackOut_64_4;
                              break L27;
                            }
                          }
                          ((ef) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4, 1, var6);
                          break L25;
                        }
                        L28: {
                          var21 = op.field_m.field_D[var13][0];
                          var22 = op.field_m.field_D[var13][1];
                          var23 = 4;
                          var24 = wf.field_m / gg.field_b[var23];
                          var24 = var24 % gg.field_j[var23];
                          var24 = var24 + gg.field_l[var23];
                          am.a(var24, var22, var11, 1, var21).c(8, var10 - 11, var6);
                          var25 = am.a(var24, var22, -var11 + 1, 1, var21);
                          var25.e();
                          var11 = -var11 + 1;
                          var25.c(575, -11 + var10, var6);
                          if (var17 == 0) {
                            break L28;
                          } else {
                            oo.g(44, 4 + var10, 47, var10 + 1, 16777215);
                            oo.g(43, 4 + var10, 46, var10 - -1, 16777215);
                            oo.g(45, var10 - -4, 48, var10 + 1, 16777215);
                            oo.g(42, var10 - -4, 45, var10 - -1, 65793);
                            oo.g(46, var10 - -4, 49, var10 - -1, 65793);
                            break L28;
                          }
                        }
                        var7 = var7 + (var4 + 1);
                        var10 += 58;
                        var12++;
                        if (var26 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                stackOut_70_0 = var7;
                stackOut_70_1 = 1 + var4;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                break L7;
              }
              L29: {
                var7 = stackIn_71_0 + stackIn_71_1;
                if (!this.field_o) {
                  pb.field_e.a(vl.a(wi.field_o, new String[]{this.e(-95)}, 2), 320, 380, 16556032, var3, var6);
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                L31: {
                  if (-1 <= (this.field_n ^ -1)) {
                    break L31;
                  } else {
                    var7 = (255 - var6) * 120 / 256 + var6 * var2 / 256;
                    if (var26 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                var7 = var2;
                break L30;
              }
              L32: {
                if (this.field_o) {
                  break L32;
                } else {
                  L33: {
                    if (this.field_z.field_i) {
                      break L33;
                    } else {
                      pb.field_e.a(aa.field_p, 320, 410, 16777096, var3, var6);
                      if (var26 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  pb.field_e.a(vl.a(ig.field_g, new String[]{Integer.toString(this.field_t)}, 2), 320, 365, 16776960, var3, var6);
                  break L32;
                }
              }
              this.f(var6, 96);
              break L1;
            }
          }
        }
        L34: {
          L35: {
            if (this.field_B == 1) {
              break L35;
            } else {
              if (-1 <= (this.field_n ^ -1)) {
                break L34;
              } else {
                break L35;
              }
            }
          }
          L36: {
            if (-2 == (this.field_B ^ -1)) {
              stackOut_88_0 = var5;
              stackIn_89_0 = stackOut_88_0;
              break L36;
            } else {
              stackOut_87_0 = 255 - var5;
              stackIn_89_0 = stackOut_87_0;
              break L36;
            }
          }
          var6 = stackIn_89_0;
          rg.field_C.a(-40, 233, var6);
          var7 = 0;
          var8 = new int[]{30, 239, 448};
          var9 = 0;
          L37: while (true) {
            L38: {
              L39: {
                L40: {
                  if (5 <= var9) {
                    break L40;
                  } else {
                    var10 = ll.field_k.field_m[var9];
                    stackOut_91_0 = 255;
                    stackOut_91_1 = var10;
                    stackIn_209_0 = stackOut_91_0;
                    stackIn_209_1 = stackOut_91_1;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    if (var26 != 0) {
                      L41: while (true) {
                        if (stackIn_209_0 >= stackIn_209_1) {
                          break L39;
                        } else {
                          var10 = ll.field_k.field_s[var9];
                          stackOut_207_0 = 255;
                          stackOut_207_1 = var10;
                          stackIn_106_0 = stackOut_207_0;
                          stackIn_106_1 = stackOut_207_1;
                          stackIn_208_0 = stackOut_207_0;
                          stackIn_208_1 = stackOut_207_1;
                          if (var26 != 0) {
                            break L38;
                          } else {
                            stackOut_208_0 = stackIn_208_0;
                            stackOut_208_1 = stackIn_208_1;
                            stackIn_205_0 = stackOut_208_0;
                            stackIn_205_1 = stackOut_208_1;
                            L42: {
                              if (stackIn_205_0 != stackIn_205_1) {
                                L43: {
                                  if ((var7 ^ -1) >= (var8[var9] ^ -1)) {
                                    stackOut_202_0 = var8[var9];
                                    stackIn_201_0 = stackOut_202_0;
                                    break L43;
                                  } else {
                                    stackOut_198_0 = var7;
                                    stackIn_201_0 = stackOut_198_0;
                                    break L43;
                                  }
                                }
                                var7 = stackIn_201_0;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            var9++;
                            if (var26 == 0) {
                              stackOut_211_0 = var9;
                              stackOut_211_1 = 3;
                              stackIn_209_0 = stackOut_211_0;
                              stackIn_209_1 = stackOut_211_1;
                              continue L41;
                            } else {
                              break L39;
                            }
                          }
                        }
                      }
                    } else {
                      L44: {
                        if (stackIn_92_0 == stackIn_92_1) {
                          break L44;
                        } else {
                          var7 = ga.field_v[var9];
                          break L44;
                        }
                      }
                      var9++;
                      if (var26 == 0) {
                        continue L37;
                      } else {
                        break L40;
                      }
                    }
                  }
                }
                var9 = 0;
                L45: while (true) {
                  if (var9 >= 3) {
                    break L39;
                  } else {
                    var10 = ll.field_k.field_s[var9];
                    stackOut_97_0 = 255;
                    stackOut_97_1 = var10;
                    stackIn_106_0 = stackOut_97_0;
                    stackIn_106_1 = stackOut_97_1;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    if (var26 != 0) {
                      break L38;
                    } else {
                      L46: {
                        if (stackIn_98_0 != stackIn_98_1) {
                          L47: {
                            if ((var7 ^ -1) >= (var8[var9] ^ -1)) {
                              stackOut_102_0 = var8[var9];
                              stackIn_103_0 = stackOut_102_0;
                              break L47;
                            } else {
                              stackOut_101_0 = var7;
                              stackIn_103_0 = stackOut_101_0;
                              break L47;
                            }
                          }
                          var7 = stackIn_103_0;
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                      var9++;
                      if (var26 == 0) {
                        continue L45;
                      } else {
                        break L39;
                      }
                    }
                  }
                }
              }
              stackOut_105_0 = 0;
              stackOut_105_1 = 0;
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              break L38;
            }
            oo.h(stackIn_106_0, stackIn_106_1, var7, 480);
            var9 = 0;
            L48: while (true) {
              L49: {
                L50: {
                  if (var9 >= 64) {
                    break L50;
                  } else {
                    oo.a(-176 + ((var9 / 11 + 25) * wf.field_m + 1000 * var9) % 10560, 3952, 176, var6 * 125 >> -97135736, wp.field_f);
                    var9++;
                    if (var26 != 0) {
                      break L49;
                    } else {
                      if (var26 == 0) {
                        continue L48;
                      } else {
                        break L50;
                      }
                    }
                  }
                }
                oo.c();
                rq.field_l.a(30, 231, var6);
                rq.field_l.a(239, 231, var6);
                rq.field_l.a(448, 231, var6);
                var9 = 0;
                break L49;
              }
              var10 = ll.field_k.g((byte) 125);
              var11 = 0;
              L51: while (true) {
                L52: {
                  L53: {
                    L54: {
                      if (var11 >= var10) {
                        break L54;
                      } else {
                        var12 = ll.field_k.field_m[var11];
                        var13 = ll.field_k.field_g[var11];
                        na.field_I.a(-32 + ga.field_v[var11], 126, var6);
                        stackOut_114_0 = 255;
                        stackOut_114_1 = var12;
                        stackIn_194_0 = stackOut_114_0;
                        stackIn_194_1 = stackOut_114_1;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        if (var26 != 0) {
                          L55: while (true) {
                            if (stackIn_194_0 >= stackIn_194_1) {
                              break L53;
                            } else {
                              var12 = ll.field_k.field_s[var11];
                              if (var26 != 0) {
                                break L52;
                              } else {
                                L56: {
                                  L57: {
                                    if ((var12 ^ -1) != -256) {
                                      break L57;
                                    } else {
                                      wk.field_J.a(38 - -(209 * var11), 244, var6);
                                      hn.field_i.a(var11 * 209 + 91, 280, var6);
                                      if (var26 == 0) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  qj.field_m.a(38 + 209 * var11, 244, var6);
                                  oo.h(0, 0, 640, 366);
                                  var13 = 0;
                                  L58: while (true) {
                                    L59: {
                                      L60: {
                                        if (16 <= var13) {
                                          break L60;
                                        } else {
                                          oo.a((48 + 209 * var11 << -1224495516) + 8, 4000 + (wf.field_m * (var13 / 5 + 19) + 300 * var13) % 1920, 112, 125 * var6 >> 46580680, wp.field_f);
                                          var13++;
                                          if (var26 != 0) {
                                            break L59;
                                          } else {
                                            if (var26 == 0) {
                                              continue L58;
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                      }
                                      var13 = 0;
                                      break L59;
                                    }
                                    L61: while (true) {
                                      L62: {
                                        L63: {
                                          if (-9 >= (var13 ^ -1)) {
                                            break L63;
                                          } else {
                                            oo.a(((var13 / 5 + 19) * wf.field_m + var13 * 300) % 720 + 8 + (209 * var11 + 48 << 1302155300), 5744, 112, var6 * 125 >> -379242520, wp.field_f);
                                            var13++;
                                            if (var26 != 0) {
                                              break L62;
                                            } else {
                                              if (var26 == 0) {
                                                continue L61;
                                              } else {
                                                break L63;
                                              }
                                            }
                                          }
                                        }
                                        pm.field_N.a(var11 * 209 + 38, 244, var6);
                                        oo.c();
                                        qh.a(var12, -29990, ll.field_k, 280, var11 * 209 + 91, var6);
                                        var13 = ll.field_k.field_t[var12];
                                        break L62;
                                      }
                                      L64: {
                                        var14 = cr.a(var12, -95);
                                        incrementValue$4 = var9;
                                        var9++;
                                        stackOut_180_0 = qp.field_w;
                                        stackOut_180_1 = eb.a(this.field_r[incrementValue$4], true, true);
                                        stackOut_180_2 = 209 * var11 + 166;
                                        stackOut_180_3 = 295;
                                        stackIn_179_0 = stackOut_180_0;
                                        stackIn_179_1 = stackOut_180_1;
                                        stackIn_179_2 = stackOut_180_2;
                                        stackIn_179_3 = stackOut_180_3;
                                        stackIn_181_0 = stackOut_180_0;
                                        stackIn_181_1 = stackOut_180_1;
                                        stackIn_181_2 = stackOut_180_2;
                                        stackIn_181_3 = stackOut_180_3;
                                        if (var13 < var14) {
                                          stackOut_179_0 = (ef) ((Object) stackIn_179_0);
                                          stackOut_179_1 = (String) ((Object) stackIn_179_1);
                                          stackOut_179_2 = stackIn_179_2;
                                          stackOut_179_3 = stackIn_179_3;
                                          stackOut_179_4 = 16777215;
                                          stackIn_178_0 = stackOut_179_0;
                                          stackIn_178_1 = stackOut_179_1;
                                          stackIn_178_2 = stackOut_179_2;
                                          stackIn_178_3 = stackOut_179_3;
                                          stackIn_178_4 = stackOut_179_4;
                                          break L64;
                                        } else {
                                          stackOut_181_0 = (ef) ((Object) stackIn_181_0);
                                          stackOut_181_1 = (String) ((Object) stackIn_181_1);
                                          stackOut_181_2 = stackIn_181_2;
                                          stackOut_181_3 = stackIn_181_3;
                                          stackIn_175_0 = stackOut_181_0;
                                          stackIn_175_1 = stackOut_181_1;
                                          stackIn_175_2 = stackOut_181_2;
                                          stackIn_175_3 = stackOut_181_3;
                                          stackOut_175_0 = (ef) ((Object) stackIn_175_0);
                                          stackOut_175_1 = (String) ((Object) stackIn_175_1);
                                          stackOut_175_2 = stackIn_175_2;
                                          stackOut_175_3 = stackIn_175_3;
                                          stackOut_175_4 = 16711680;
                                          stackIn_178_0 = stackOut_175_0;
                                          stackIn_178_1 = stackOut_175_1;
                                          stackIn_178_2 = stackOut_175_2;
                                          stackIn_178_3 = stackOut_175_3;
                                          stackIn_178_4 = stackOut_175_4;
                                          break L64;
                                        }
                                      }
                                      ((ef) (Object) stackIn_178_0).b(stackIn_178_1, stackIn_178_2, stackIn_178_3, stackIn_178_4, 1, var6);
                                      break L56;
                                    }
                                  }
                                }
                                var11++;
                                if (var26 == 0) {
                                  stackOut_196_0 = var11;
                                  stackOut_196_1 = 3;
                                  stackIn_194_0 = stackOut_196_0;
                                  stackIn_194_1 = stackOut_196_1;
                                  continue L55;
                                } else {
                                  break L53;
                                }
                              }
                            }
                          }
                        } else {
                          L65: {
                            L66: {
                              if (stackIn_115_0 == stackIn_115_1) {
                                break L66;
                              } else {
                                if (63 <= var12) {
                                  break L66;
                                } else {
                                  pq.field_o.a(ga.field_v[var11], 166, var6);
                                  var14 = 0;
                                  L67: while (true) {
                                    L68: {
                                      L69: {
                                        if (-9 >= (var14 ^ -1)) {
                                          break L69;
                                        } else {
                                          oo.a(10 + ga.field_v[var11] << 471656292, -(((var14 / 5 + 19) * wf.field_m - -(var14 * 300)) % 960) + 3728, 96, 125 * var6 >> -1958180312, wp.field_f);
                                          var14++;
                                          if (var26 != 0) {
                                            break L68;
                                          } else {
                                            if (var26 == 0) {
                                              continue L67;
                                            } else {
                                              break L69;
                                            }
                                          }
                                        }
                                      }
                                      w.field_z.a(ga.field_v[var11], 166, var6);
                                      mg.a(var12, var13, (byte) 46, 106, ll.field_k, var6, -28 + ga.field_v[var11]);
                                      var14 = ll.field_k.field_t[var12];
                                      break L68;
                                    }
                                    L70: {
                                      var15 = cr.a(var12, -107);
                                      incrementValue$5 = var9;
                                      var9++;
                                      stackOut_123_0 = qp.field_w;
                                      stackOut_123_1 = eb.a(this.field_r[incrementValue$5], true, true);
                                      stackOut_123_2 = ga.field_v[var11] - 50;
                                      stackOut_123_3 = 123;
                                      stackIn_125_0 = stackOut_123_0;
                                      stackIn_125_1 = stackOut_123_1;
                                      stackIn_125_2 = stackOut_123_2;
                                      stackIn_125_3 = stackOut_123_3;
                                      stackIn_124_0 = stackOut_123_0;
                                      stackIn_124_1 = stackOut_123_1;
                                      stackIn_124_2 = stackOut_123_2;
                                      stackIn_124_3 = stackOut_123_3;
                                      if ((var14 ^ -1) > (var15 ^ -1)) {
                                        stackOut_125_0 = (ef) ((Object) stackIn_125_0);
                                        stackOut_125_1 = (String) ((Object) stackIn_125_1);
                                        stackOut_125_2 = stackIn_125_2;
                                        stackOut_125_3 = stackIn_125_3;
                                        stackOut_125_4 = 16777215;
                                        stackIn_126_0 = stackOut_125_0;
                                        stackIn_126_1 = stackOut_125_1;
                                        stackIn_126_2 = stackOut_125_2;
                                        stackIn_126_3 = stackOut_125_3;
                                        stackIn_126_4 = stackOut_125_4;
                                        break L70;
                                      } else {
                                        stackOut_124_0 = (ef) ((Object) stackIn_124_0);
                                        stackOut_124_1 = (String) ((Object) stackIn_124_1);
                                        stackOut_124_2 = stackIn_124_2;
                                        stackOut_124_3 = stackIn_124_3;
                                        stackOut_124_4 = 16711680;
                                        stackIn_126_0 = stackOut_124_0;
                                        stackIn_126_1 = stackOut_124_1;
                                        stackIn_126_2 = stackOut_124_2;
                                        stackIn_126_3 = stackOut_124_3;
                                        stackIn_126_4 = stackOut_124_4;
                                        break L70;
                                      }
                                    }
                                    L71: {
                                      ((ef) (Object) stackIn_126_0).b(stackIn_126_1, stackIn_126_2, stackIn_126_3, stackIn_126_4, 1, var6);
                                      if (255 == var13) {
                                        break L71;
                                      } else {
                                        if ((var13 ^ -1) > -64) {
                                          L72: {
                                            var14 = ll.field_k.field_t[var13];
                                            var15 = cr.a(var13, -101);
                                            incrementValue$6 = var9;
                                            var9++;
                                            stackOut_129_0 = qp.field_w;
                                            stackOut_129_1 = eb.a(this.field_r[incrementValue$6], true, true);
                                            stackOut_129_2 = -73 + ga.field_v[var11];
                                            stackOut_129_3 = 111;
                                            stackIn_131_0 = stackOut_129_0;
                                            stackIn_131_1 = stackOut_129_1;
                                            stackIn_131_2 = stackOut_129_2;
                                            stackIn_131_3 = stackOut_129_3;
                                            stackIn_130_0 = stackOut_129_0;
                                            stackIn_130_1 = stackOut_129_1;
                                            stackIn_130_2 = stackOut_129_2;
                                            stackIn_130_3 = stackOut_129_3;
                                            if (var14 >= var15) {
                                              stackOut_131_0 = (ef) ((Object) stackIn_131_0);
                                              stackOut_131_1 = (String) ((Object) stackIn_131_1);
                                              stackOut_131_2 = stackIn_131_2;
                                              stackOut_131_3 = stackIn_131_3;
                                              stackOut_131_4 = 16711680;
                                              stackIn_132_0 = stackOut_131_0;
                                              stackIn_132_1 = stackOut_131_1;
                                              stackIn_132_2 = stackOut_131_2;
                                              stackIn_132_3 = stackOut_131_3;
                                              stackIn_132_4 = stackOut_131_4;
                                              break L72;
                                            } else {
                                              stackOut_130_0 = (ef) ((Object) stackIn_130_0);
                                              stackOut_130_1 = (String) ((Object) stackIn_130_1);
                                              stackOut_130_2 = stackIn_130_2;
                                              stackOut_130_3 = stackIn_130_3;
                                              stackOut_130_4 = 16777215;
                                              stackIn_132_0 = stackOut_130_0;
                                              stackIn_132_1 = stackOut_130_1;
                                              stackIn_132_2 = stackOut_130_2;
                                              stackIn_132_3 = stackOut_130_3;
                                              stackIn_132_4 = stackOut_130_4;
                                              break L72;
                                            }
                                          }
                                          ((ef) (Object) stackIn_132_0).b(stackIn_132_1, stackIn_132_2, stackIn_132_3, stackIn_132_4, 1, var6);
                                          break L71;
                                        } else {
                                          break L71;
                                        }
                                      }
                                    }
                                    if (var26 == 0) {
                                      break L65;
                                    } else {
                                      break L66;
                                    }
                                  }
                                }
                              }
                            }
                            tm.field_f.a(ga.field_v[var11], 166, var6);
                            break L65;
                          }
                          var11++;
                          if (var26 == 0) {
                            continue L51;
                          } else {
                            break L54;
                          }
                        }
                      }
                    }
                    var11 = 0;
                    L73: while (true) {
                      if (var11 >= 3) {
                        break L53;
                      } else {
                        var12 = ll.field_k.field_s[var11];
                        if (var26 != 0) {
                          break L52;
                        } else {
                          L74: {
                            L75: {
                              if ((var12 ^ -1) != -256) {
                                break L75;
                              } else {
                                wk.field_J.a(38 - -(209 * var11), 244, var6);
                                hn.field_i.a(var11 * 209 + 91, 280, var6);
                                if (var26 == 0) {
                                  break L74;
                                } else {
                                  break L75;
                                }
                              }
                            }
                            qj.field_m.a(38 + 209 * var11, 244, var6);
                            oo.h(0, 0, 640, 366);
                            var13 = 0;
                            L76: while (true) {
                              L77: {
                                L78: {
                                  if (16 <= var13) {
                                    break L78;
                                  } else {
                                    oo.a((48 + 209 * var11 << -1224495516) + 8, 4000 + (wf.field_m * (var13 / 5 + 19) + 300 * var13) % 1920, 112, 125 * var6 >> 46580680, wp.field_f);
                                    var13++;
                                    if (var26 != 0) {
                                      break L77;
                                    } else {
                                      if (var26 == 0) {
                                        continue L76;
                                      } else {
                                        break L78;
                                      }
                                    }
                                  }
                                }
                                var13 = 0;
                                break L77;
                              }
                              L79: while (true) {
                                L80: {
                                  L81: {
                                    if (-9 >= (var13 ^ -1)) {
                                      break L81;
                                    } else {
                                      oo.a(((var13 / 5 + 19) * wf.field_m + var13 * 300) % 720 + 8 + (209 * var11 + 48 << 1302155300), 5744, 112, var6 * 125 >> -379242520, wp.field_f);
                                      var13++;
                                      if (var26 != 0) {
                                        break L80;
                                      } else {
                                        if (var26 == 0) {
                                          continue L79;
                                        } else {
                                          break L81;
                                        }
                                      }
                                    }
                                  }
                                  pm.field_N.a(var11 * 209 + 38, 244, var6);
                                  oo.c();
                                  qh.a(var12, -29990, ll.field_k, 280, var11 * 209 + 91, var6);
                                  var13 = ll.field_k.field_t[var12];
                                  break L80;
                                }
                                L82: {
                                  var14 = cr.a(var12, -95);
                                  incrementValue$7 = var9;
                                  var9++;
                                  stackOut_154_0 = qp.field_w;
                                  stackOut_154_1 = eb.a(this.field_r[incrementValue$7], true, true);
                                  stackOut_154_2 = 209 * var11 + 166;
                                  stackOut_154_3 = 295;
                                  stackIn_156_0 = stackOut_154_0;
                                  stackIn_156_1 = stackOut_154_1;
                                  stackIn_156_2 = stackOut_154_2;
                                  stackIn_156_3 = stackOut_154_3;
                                  stackIn_155_0 = stackOut_154_0;
                                  stackIn_155_1 = stackOut_154_1;
                                  stackIn_155_2 = stackOut_154_2;
                                  stackIn_155_3 = stackOut_154_3;
                                  if (var13 < var14) {
                                    stackOut_156_0 = (ef) ((Object) stackIn_156_0);
                                    stackOut_156_1 = (String) ((Object) stackIn_156_1);
                                    stackOut_156_2 = stackIn_156_2;
                                    stackOut_156_3 = stackIn_156_3;
                                    stackOut_156_4 = 16777215;
                                    stackIn_157_0 = stackOut_156_0;
                                    stackIn_157_1 = stackOut_156_1;
                                    stackIn_157_2 = stackOut_156_2;
                                    stackIn_157_3 = stackOut_156_3;
                                    stackIn_157_4 = stackOut_156_4;
                                    break L82;
                                  } else {
                                    stackOut_155_0 = (ef) ((Object) stackIn_155_0);
                                    stackOut_155_1 = (String) ((Object) stackIn_155_1);
                                    stackOut_155_2 = stackIn_155_2;
                                    stackOut_155_3 = stackIn_155_3;
                                    stackOut_155_4 = 16711680;
                                    stackIn_157_0 = stackOut_155_0;
                                    stackIn_157_1 = stackOut_155_1;
                                    stackIn_157_2 = stackOut_155_2;
                                    stackIn_157_3 = stackOut_155_3;
                                    stackIn_157_4 = stackOut_155_4;
                                    break L82;
                                  }
                                }
                                ((ef) (Object) stackIn_157_0).b(stackIn_157_1, stackIn_157_2, stackIn_157_3, stackIn_157_4, 1, var6);
                                break L74;
                              }
                            }
                          }
                          var11++;
                          if (var26 == 0) {
                            continue L73;
                          } else {
                            break L53;
                          }
                        }
                      }
                    }
                  }
                  ul.field_f.a(93, 231, var6);
                  ul.field_f.a(209, 231, var6);
                  ul.field_f.a(329, 231, var6);
                  break L52;
                }
                ul.field_f.a(573, 231, var6);
                break L34;
              }
            }
          }
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_C = 0.5614934243533339;
        }
        field_D = null;
    }

    private final void f(int param0, int param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 > 2) {
            break L0;
          } else {
            si.d(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-256 != (this.field_E ^ -1)) {
              break L2;
            } else {
              this.field_m = 0;
              if (var10 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if ((this.field_m ^ -1) != -1) {
              break L3;
            } else {
              if (10 >= b.a(true)) {
                break L3;
              } else {
                this.field_m = this.field_m + 1;
                break L3;
              }
            }
          }
          if (this.field_m > 0) {
            L4: {
              this.field_m = this.field_m + 2;
              if (-256 > (this.field_m ^ -1)) {
                this.field_m = 255;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var7 = gh.field_f[this.field_E];
              var8 = qp.field_w.a(var7);
              var9 = param0 * (this.field_m * 8) >> 1447045448;
              var5 = qp.field_w.field_w;
              if (255 < var9) {
                var9 = 255;
                break L5;
              } else {
                break L5;
              }
            }
            L6: while (true) {
              L7: {
                L8: {
                  if (var8 <= 300) {
                    break L8;
                  } else {
                    var5 = var5 + qp.field_w.field_w;
                    var8 = var8 / 2;
                    if (var10 != 0) {
                      break L7;
                    } else {
                      if (var10 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  L10: {
                    var6 = var8 - -16;
                    var3 = bd.field_g;
                    var5 += 16;
                    if (0 > var3) {
                      break L10;
                    } else {
                      if ((var3 - -var6 ^ -1) >= -636) {
                        break L9;
                      } else {
                        var3 = 640 + -var6 - 5;
                        if (var10 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L9;
                }
                L11: {
                  var4 = 32 + bo.field_d;
                  if ((var9 ^ -1) < -251) {
                    oo.b(var3 - -2, var4 + 2, var6, var5, 4, 0, var9 / 2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                oo.b(var3, var4, var6, var5, 4, 10061892, var9);
                discarded$1 = qp.field_w.a(var7, var3, var4, var6, var5, 16777215, 0, var9, 1, 1, 0);
                break L7;
              }
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    private final void e(int param0, int param1) {
        this.field_u[this.field_v].a(this.field_v / 4 * 75 + 130, 35 - -(640 * (this.field_v % param1) / 5), param0, 70);
        this.field_v = this.field_v + 1;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            if ((this.field_n ^ -1) < -1) {
              break L1;
            } else {
              this.field_n = 33;
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_n = 33 + -this.field_n;
          this.field_B = this.field_s;
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            this.field_l = (String) null;
            break L2;
          }
        }
        L3: {
          L4: {
            L5: {
              L6: {
                this.field_s = param1;
                var3 = this.field_s;
                if (var3 != 1) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((var3 ^ -1) != -1) {
                break L3;
              } else {
                if (var4 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            we.field_g[43] = ip.field_c;
            if (var4 == 0) {
              break L3;
            } else {
              break L4;
            }
          }
          we.field_g[43] = ec.field_a;
          break L3;
        }
    }

    final int d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= -65) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = this.field_j.length;
                  if (-2 != (var4 ^ -1)) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      var3 = 1;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (-3 == (var4 ^ -1)) {
                  break L2;
                } else {
                  break L1;
                }
              }
              L4: {
                if ((param1 ^ -1) != -1) {
                  stackOut_10_0 = 2;
                  stackIn_11_0 = stackOut_10_0;
                  break L4;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  break L4;
                }
              }
              var3 = stackIn_11_0;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            var3 = param1;
            break L0;
          }
          L5: {
            L6: {
              var4 = var3;
              if (0 != var4) {
                break L6;
              } else {
                if (var5 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if ((var4 ^ -1) == -2) {
              return 400;
            } else {
              if (var4 != 2) {
                return super.d(-93, param1);
              } else {
                if (var5 == 0) {
                  return 560;
                } else {
                  break L5;
                }
              }
            }
          }
          return 210;
        } else {
          return -1;
        }
    }

    final void f(int param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            if (0 == (op.field_m.field_j & 1 << fb.field_e.field_M)) {
              break L1;
            } else {
              we.field_g[42] = ih.field_c;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-1 <= (cm.a(op.field_m.field_j, true) ^ -1)) {
              break L2;
            } else {
              we.field_g[42] = ih.field_c;
              if (var3 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          we.field_g[42] = u.field_j;
          break L0;
        }
        L3: {
          if (param0 > 123) {
            break L3;
          } else {
            this.field_w = -88;
            break L3;
          }
        }
    }

    final void a(int param0) {
        cb[] var2 = null;
        int var3 = 0;
        int var5 = 0;
        cb[] var6 = null;
        cb[] var7 = null;
        cb var8 = null;
        cb var10 = null;
        cb var11 = null;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            super.a(0);
            if (this.field_n > param0) {
              this.field_n = this.field_n - 1;
              if (-1 <= (this.field_n ^ -1)) {
                this.field_B = this.field_s;
                if (this.field_B == 0) {
                  var7 = this.field_u;
                  var2 = var7;
                  var3 = 0;
                  L2: while (true) {
                    if ((var7.length ^ -1) >= (var3 ^ -1)) {
                      break L1;
                    } else {
                      var10 = var7[var3];
                      var11 = var10;
                      var11 = var10;
                      var10.c((byte) 99);
                      var3++;
                      if (var5 != 0) {
                        break L0;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              if ((this.field_B ^ -1) != -2) {
                break L1;
              } else {
                if (0 == wf.field_m % 2) {
                  var6 = this.field_u;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      if ((var6.length ^ -1) >= (var3 ^ -1)) {
                        break L4;
                      } else {
                        var8 = var6[var3];
                        var10 = var8;
                        var11 = var10;
                        var10 = var8;
                        var8.d((byte) -102);
                        var3++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      this.field_n = this.field_n - 1;
                      if (-1 <= (this.field_n ^ -1)) {
                        this.field_B = this.field_s;
                        if (this.field_B == 0) {
                          var7 = this.field_u;
                          var2 = var7;
                          var3 = 0;
                          L5: while (true) {
                            if ((var7.length ^ -1) >= (var3 ^ -1)) {
                              break L1;
                            } else {
                              var11 = var7[var3];
                              var11.c((byte) 99);
                              var3++;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                if (var5 == 0) {
                                  continue L5;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          if (this.field_g.field_d != 0) {
            break L0;
          } else {
            if (39 != this.field_j[0]) {
              break L0;
            } else {
              this.field_g.a(1, param0 ^ -1);
              break L0;
            }
          }
        }
        int fieldTemp$1 = this.field_x - 1;
        this.field_x = this.field_x - 1;
        if (fieldTemp$1 <= 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_C = 0.0;
        field_D = "Advertising websites";
    }
}
