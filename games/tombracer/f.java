/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f {
    static int[] field_c;
    static BitSet field_e;
    static int field_b;
    private cva[] field_d;
    private csa[] field_f;
    private int field_a;

    final void a(csa param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        cva var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == this.field_d) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_f = new csa[this.field_d.length];
              if (!param1) {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3_int >= this.field_d.length) {
                        break L3;
                      } else {
                        var4 = this.field_d[var3_int];
                        this.field_f[var3_int] = param0.a(var4.field_d, var4.field_a, 20);
                        var3_int++;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    this.field_d = null;
                    this.a(0);
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("f.A(");
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3_int = 0;
        csa[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3_int = param0;
        L0: while (true) {
          L1: {
            if (this.field_f.length <= var3_int) {
              break L1;
            } else {
              L2: {
                if (null == this.field_f[var3_int]) {
                  this.field_f[var3_int] = null;
                  var2++;
                  break L2;
                } else {
                  if (!this.field_f[var3_int].k((byte) -115)) {
                    this.field_f[var3_int] = null;
                    var2++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var3 = new csa[-var2 + this.field_f.length];
          var2 = 0;
          var4 = 0;
          L3: while (true) {
            L4: {
              L5: {
                if (this.field_f.length <= var4) {
                  break L5;
                } else {
                  stackOut_10_0 = this;
                  stackIn_17_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var5 != 0) {
                    break L4;
                  } else {
                    L6: {
                      L7: {
                        if (((f) (this)).field_f[var4] != null) {
                          break L7;
                        } else {
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3[var2] = this.field_f[var4];
                      var2++;
                      break L6;
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              stackOut_16_0 = this;
              stackIn_17_0 = stackOut_16_0;
              break L4;
            }
            ((f) (this)).field_f = var3;
            return;
          }
        }
    }

    final lj[] a(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        lj[] var3 = null;
        csa var4_ref_csa = null;
        int var4 = 0;
        lj var5 = null;
        csa var5_ref = null;
        lj var6 = null;
        int var7 = 0;
        csa[] stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        csa[] stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        lj[] stackOut_26_0 = null;
        csa[] stackOut_21_0 = null;
        csa[] stackOut_5_0 = null;
        lj[] stackOut_10_0 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (this.field_f.length <= var3_int) {
            if (param0 != -103) {
              return (lj[]) null;
            } else {
              var3 = new lj[var2];
              var2 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (this.field_f.length <= var4) {
                    stackOut_26_0 = (lj[]) (var3);
                    stackIn_27_0 = stackOut_26_0;
                    break L2;
                  } else {
                    stackOut_21_0 = this.field_f;
                    stackIn_27_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L3: {
                        var5_ref = stackIn_22_0[var4];
                        if (var5_ref == null) {
                          break L3;
                        } else {
                          var6 = var5_ref.u(param0 + -24);
                          if (var6 == null) {
                            break L3;
                          } else {
                            var3[var2] = var6;
                            var2++;
                            break L3;
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                }
                return (lj[]) ((Object) stackIn_27_0);
              }
            }
          } else {
            var4_ref_csa = this.field_f[var3_int];
            if (var7 == 0) {
              L4: {
                if (var4_ref_csa == null) {
                  break L4;
                } else {
                  L5: {
                    var5 = var4_ref_csa.u(-91);
                    if (var5 != null) {
                      break L5;
                    } else {
                      if (var7 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2++;
                  break L4;
                }
              }
              var3_int++;
              continue L0;
            } else {
              var3 = new lj[var2];
              var2 = 0;
              var4 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (this.field_f.length <= var4) {
                      break L8;
                    } else {
                      stackOut_5_0 = this.field_f;
                      stackIn_11_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var7 != 0) {
                        break L7;
                      } else {
                        L9: {
                          var5_ref = stackIn_6_0[var4];
                          if (var5_ref == null) {
                            break L9;
                          } else {
                            var6 = var5_ref.u(param0 + -24);
                            if (var6 == null) {
                              break L9;
                            } else {
                              var3[var2] = var6;
                              var2++;
                              break L9;
                            }
                          }
                        }
                        var4++;
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = (lj[]) (var3);
                  stackIn_11_0 = stackOut_10_0;
                  break L7;
                }
                return (lj[]) ((Object) stackIn_11_0);
              }
            }
          }
        }
    }

    final static String a(int param0, boolean param1, int param2, long param3, int param4) {
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        int discarded$27 = 0;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$30 = null;
        StringBuilder discarded$31 = null;
        int discarded$32 = 0;
        StringBuilder discarded$33 = null;
        StringBuilder discarded$34 = null;
        StringBuilder discarded$35 = null;
        StringBuilder discarded$36 = null;
        StringBuilder discarded$37 = null;
        StringBuilder discarded$38 = null;
        StringBuilder discarded$39 = null;
        StringBuilder discarded$40 = null;
        StringBuilder discarded$41 = null;
        int discarded$42 = 0;
        StringBuilder discarded$43 = null;
        StringBuilder discarded$44 = null;
        StringBuilder discarded$45 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          var6 = 44;
          var7 = 46;
          if (0 == param2) {
            var6 = 46;
            var7 = 44;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 == 2) {
            var7 = 160;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var8 = 0;
          if (-1L >= (param3 ^ -1L)) {
            break L2;
          } else {
            var8 = 1;
            param3 = -param3;
            break L2;
          }
        }
        var9 = new StringBuilder(26);
        if (param4 > 0) {
          var10 = 0;
          L3: while (true) {
            if (param4 <= var10) {
              discarded$23 = var9.append((char) var6);
              if (param0 == 2843) {
                var10 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      var11 = (int)param3;
                      param3 = param3 / 10L;
                      discarded$24 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                      if ((param3 ^ -1L) != -1L) {
                        break L6;
                      } else {
                        if (var12 != 0) {
                          break L5;
                        } else {
                          if (var12 == 0) {
                            L7: {
                              if (var8 != 0) {
                                discarded$25 = var9.append('-');
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            return var9.reverse().toString();
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (!param1) {
                      break L5;
                    } else {
                      var10++;
                      if (0 == var10 % 3) {
                        discarded$26 = var9.append((char) var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  continue L4;
                }
              } else {
                discarded$27 = f.a(true);
                var10 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      var11 = (int)param3;
                      param3 = param3 / 10L;
                      discarded$28 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                      if ((param3 ^ -1L) != -1L) {
                        break L10;
                      } else {
                        if (var12 != 0) {
                          break L9;
                        } else {
                          if (var12 == 0) {
                            L11: {
                              if (var8 != 0) {
                                discarded$29 = var9.append('-');
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            return var9.reverse().toString();
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (!param1) {
                      break L9;
                    } else {
                      var10++;
                      if (0 == var10 % 3) {
                        discarded$30 = var9.append((char) var7);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  continue L8;
                }
              }
            } else {
              var11 = (int)param3;
              param3 = param3 / 10L;
              discarded$31 = var9.append((char)(-((int)param3 * 10) + var11 + 48));
              var10++;
              if (var12 != 0) {
                if (param0 != 2843) {
                  discarded$32 = f.a(true);
                  var10 = 0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        var11 = (int)param3;
                        param3 = param3 / 10L;
                        discarded$33 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                        if ((param3 ^ -1L) != -1L) {
                          break L14;
                        } else {
                          if (var12 != 0) {
                            break L13;
                          } else {
                            if (var12 == 0) {
                              L15: {
                                if (var8 != 0) {
                                  discarded$34 = var9.append('-');
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              return var9.reverse().toString();
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      if (!param1) {
                        break L13;
                      } else {
                        var10++;
                        if (0 == var10 % 3) {
                          discarded$35 = var9.append((char) var7);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    continue L12;
                  }
                } else {
                  var10 = 0;
                  L16: while (true) {
                    L17: {
                      L18: {
                        var11 = (int)param3;
                        param3 = param3 / 10L;
                        discarded$36 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                        if ((param3 ^ -1L) != -1L) {
                          break L18;
                        } else {
                          if (var12 != 0) {
                            break L17;
                          } else {
                            if (var12 == 0) {
                              L19: {
                                if (var8 != 0) {
                                  discarded$37 = var9.append('-');
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              return var9.reverse().toString();
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      if (!param1) {
                        break L17;
                      } else {
                        var10++;
                        if (0 == var10 % 3) {
                          discarded$38 = var9.append((char) var7);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    continue L16;
                  }
                }
              } else {
                continue L3;
              }
            }
          }
        } else {
          if (param0 == 2843) {
            var10 = 0;
            L20: while (true) {
              L21: {
                L22: {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  discarded$39 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                  if ((param3 ^ -1L) != -1L) {
                    break L22;
                  } else {
                    if (var12 != 0) {
                      break L21;
                    } else {
                      if (var12 == 0) {
                        L23: {
                          if (var8 != 0) {
                            discarded$40 = var9.append('-');
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        return var9.reverse().toString();
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                if (!param1) {
                  break L21;
                } else {
                  var10++;
                  if (0 == var10 % 3) {
                    discarded$41 = var9.append((char) var7);
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
              continue L20;
            }
          } else {
            discarded$42 = f.a(true);
            var10 = 0;
            L24: while (true) {
              L25: {
                L26: {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  discarded$43 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                  if ((param3 ^ -1L) != -1L) {
                    break L26;
                  } else {
                    if (var12 != 0) {
                      break L25;
                    } else {
                      if (var12 == 0) {
                        L27: {
                          if (var8 != 0) {
                            discarded$44 = var9.append('-');
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        return var9.reverse().toString();
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                if (!param1) {
                  break L25;
                } else {
                  var10++;
                  if (0 == var10 % 3) {
                    discarded$45 = var9.append((char) var7);
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
              continue L24;
            }
          }
        }
    }

    final static void b(int param0) {
        vo.field_b = false;
        if (!(kga.field_n == null)) {
            kga.field_n.a(true);
        }
        int var1 = -18 % ((-10 - param0) / 43);
        if (!(bta.field_q == 0)) {
            ufa.a(true);
        }
        wv.field_j = 0;
    }

    final static void b(byte param0) {
        int incrementValue$1 = 0;
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        byte stackOut_25_0 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != bt.field_h) {
                break L1;
              } else {
                bt.field_h = new int[65536];
                if (var23 == 0) {
                  var1_double = Math.random() * 0.03 - 0.015 + 0.7;
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    stackOut_5_0 = -513;
                    stackOut_5_1 = var4 ^ -1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (stackIn_6_0 >= stackIn_6_1) {
                            break L5;
                          } else {
                            var5 = 360.0f * ((float)(var4 >> 508759011) / 64.0f + 0.0078125f);
                            var6 = 0.0625f + (float)(7 & var4) / 8.0f;
                            stackOut_7_0 = 0;
                            stackIn_26_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var23 != 0) {
                              break L4;
                            } else {
                              var7 = stackIn_8_0;
                              L6: while (true) {
                                if (var7 >= 128) {
                                  var4++;
                                  if (var23 == 0) {
                                    continue L2;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  var8 = (float)var7 / 128.0f;
                                  var9 = 0.0f;
                                  var10 = 0.0f;
                                  var11 = 0.0f;
                                  var12 = var5 / 60.0f;
                                  var13 = (int)var12;
                                  var14 = var13 % 6;
                                  var15 = var12 - (float)var13;
                                  var16 = (-var6 + 1.0f) * var8;
                                  var17 = var8 * (1.0f - var15 * var6);
                                  var18 = var8 * (-(var6 * (1.0f - var15)) + 1.0f);
                                  stackOut_10_0 = 0;
                                  stackOut_10_1 = var14;
                                  stackIn_6_0 = stackOut_10_0;
                                  stackIn_6_1 = stackOut_10_1;
                                  stackIn_11_0 = stackOut_10_0;
                                  stackIn_11_1 = stackOut_10_1;
                                  if (var23 != 0) {
                                    continue L3;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_11_0 != stackIn_11_1) {
                                          break L8;
                                        } else {
                                          var9 = var8;
                                          var11 = var16;
                                          var10 = var18;
                                          if (var23 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (-2 == (var14 ^ -1)) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var14 == 2) {
                                              break L10;
                                            } else {
                                              L11: {
                                                if ((var14 ^ -1) == -4) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    if ((var14 ^ -1) == -5) {
                                                      break L12;
                                                    } else {
                                                      if ((var14 ^ -1) != -6) {
                                                        break L7;
                                                      } else {
                                                        var11 = var17;
                                                        var9 = var8;
                                                        var10 = var16;
                                                        if (var23 == 0) {
                                                          break L7;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var11 = var8;
                                                  var9 = var18;
                                                  var10 = var16;
                                                  if (var23 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              var10 = var17;
                                              var11 = var8;
                                              var9 = var16;
                                              if (var23 == 0) {
                                                break L7;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var9 = var16;
                                          var11 = var18;
                                          var10 = var8;
                                          if (var23 == 0) {
                                            break L7;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var9 = var17;
                                      var10 = var8;
                                      var11 = var16;
                                      break L7;
                                    }
                                    var9 = (float)Math.pow((double)var9, var1_double);
                                    var10 = (float)Math.pow((double)var10, var1_double);
                                    var11 = (float)Math.pow((double)var11, var1_double);
                                    var19 = (int)(256.0f * var9);
                                    var20 = (int)(256.0f * var10);
                                    var21 = (int)(var11 * 256.0f);
                                    var22 = var21 + ((var19 << 1215244016) + -16777216) - -(var20 << -2110225432);
                                    incrementValue$1 = var3;
                                    var3++;
                                    bt.field_h[incrementValue$1] = var22;
                                    var7++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_25_0 = param0;
                        stackIn_26_0 = stackOut_25_0;
                        break L4;
                      }
                      L13: {
                        if (stackIn_26_0 == 58) {
                          break L13;
                        } else {
                          f.b((byte) 1);
                          break L13;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "f.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 24641) {
            field_b = -112;
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
          if (lca.a(param0)) {
            if (null == wu.field_a.a((byte) 127)) {
              return -1;
            } else {
              return wu.field_a.a((byte) -73).field_i;
            }
          } else {
            return -1;
          }
        } else {
          f.b((byte) -68);
          if (lca.a(param0)) {
            if (null == wu.field_a.a((byte) 127)) {
              return -1;
            } else {
              return wu.field_a.a((byte) -73).field_i;
            }
          } else {
            return -1;
          }
        }
    }

    f(int param0, int param1) {
        this.field_a = param0;
        this.field_f = new csa[]{};
    }

    f(int param0, int param1, int param2, kh param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cva[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cva stackIn_6_2 = null;
        cva stackIn_6_3 = null;
        cva[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cva stackIn_7_2 = null;
        cva stackIn_7_3 = null;
        cva[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cva stackIn_8_2 = null;
        cva stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        cva[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cva stackOut_5_2 = null;
        cva stackOut_5_3 = null;
        cva[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cva stackOut_7_2 = null;
        cva stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        cva[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cva stackOut_6_2 = null;
        cva stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_a = param0;
            var5_int = param3.b((byte) 44, iia.d(param0, 22972));
            this.field_f = new csa[var5_int];
            this.field_d = new cva[var5_int];
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_int) {
                break L0;
              } else {
                if (var7 == 0) {
                  L2: {
                    stackOut_5_0 = this.field_d;
                    stackOut_5_1 = var6;
                    stackOut_5_2 = null;
                    stackOut_5_3 = null;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    if (param3.b((byte) 44, 1) != 1) {
                      stackOut_7_0 = (cva[]) ((Object) stackIn_7_0);
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = null;
                      stackOut_7_3 = null;
                      stackOut_7_4 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      stackIn_8_4 = stackOut_7_4;
                      break L2;
                    } else {
                      stackOut_6_0 = (cva[]) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = null;
                      stackOut_6_3 = null;
                      stackOut_6_4 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      break L2;
                    }
                  }
                  stackIn_8_0[stackIn_8_1] = new cva(stackIn_8_4 != 0, param3.b((byte) 44, 8));
                  var6++;
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("f.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(kh param0, int param1, csa param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              if (param1 > 105) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            this.a(0);
            param0.a((byte) 44, this.field_f.length, iia.d(this.field_a, 22972));
            var4_int = 0;
            L2: while (true) {
              if (this.field_f.length <= var4_int) {
                break L0;
              } else {
                if (var5 == 0) {
                  L3: {
                    L4: {
                      if (param2 == this.field_f[var4_int].o((byte) -48)) {
                        break L4;
                      } else {
                        param0.a((byte) 73, 0, 1);
                        param0.a((byte) 111, this.field_f[var4_int].n(31974).a((byte) 62), 8);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param0.a((byte) -127, 1, 1);
                    param0.a((byte) -126, this.field_f[var4_int].i((byte) 84).a((byte) 115), 8);
                    break L3;
                  }
                  var4_int++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("f.B(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
    }
}
