/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    int field_k;
    static ja[] field_r;
    static String field_b;
    private int field_a;
    static cj field_l;
    int field_i;
    private int field_v;
    int[] field_t;
    private byte[] field_o;
    private int field_u;
    private int field_h;
    long field_f;
    long field_n;
    static int field_q;
    int[] field_p;
    int[] field_c;
    static int field_d;
    static int field_j;
    int[] field_s;
    int[] field_m;
    int[] field_g;
    static String field_e;

    public static void a(int param0) {
        if (param0 != 5) {
            return;
        }
        try {
            field_b = null;
            field_l = null;
            field_e = null;
            field_r = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rp.I(" + param0 + ')');
        }
    }

    private final int b(int param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              fieldTemp$6 = this.field_u;
              this.field_u = this.field_u + 1;
              var2_int = 255 & this.field_o[fieldTemp$6];
              if (param0 == -1458) {
                break L1;
              } else {
                this.field_a = 15;
                break L1;
              }
            }
            fieldTemp$7 = this.field_u;
            this.field_u = this.field_u + 1;
            var3 = 255 & this.field_o[fieldTemp$7];
            fieldTemp$8 = this.field_u;
            this.field_u = this.field_u + 1;
            var4 = this.field_o[fieldTemp$8] & 255;
            stackOut_3_0 = var4 | (var2_int << 323106608 | var3 << 999010088);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void e(int param0, int param1) {
        RuntimeException var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if ((param1 ^ -1) > (this.field_t.length ^ -1)) {
                  L2: {
                    if (param0 == -6821) {
                      break L2;
                    } else {
                      field_l = (cj) null;
                      break L2;
                    }
                  }
                  this.field_f = this.field_f | 1L << param1;
                  this.field_t[param1] = cr.a(param1, -107);
                  this.c((byte) -103);
                  decompiledRegionSelector0 = 1;
                  break L0;
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
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.S(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) <= (this.field_t.length ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    this.field_t[param2] = this.field_t[param2] + param1;
                    var4_int = -102 / ((param0 - -43) / 40);
                    if ((this.field_t[param2] ^ -1) > (cr.a(param2, -94) ^ -1)) {
                      break L2;
                    } else {
                      this.e(-6821, param2);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rp.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        boolean[] var2_array = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_21_0 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        byte stackOut_38_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_array = new boolean[63];
            var3 = 0;
            L1: while (true) {
              stackOut_2_0 = var3 ^ -1;
              stackOut_2_1 = -64;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      var4 = em.field_ab[var3];
                      stackOut_4_0 = 0;
                      stackIn_22_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        var5 = stackIn_5_0;
                        L5: while (true) {
                          L6: {
                            if (var4.length <= var5) {
                              break L6;
                            } else {
                              var6 = var4[var5];
                              stackOut_7_0 = -256;
                              stackOut_7_1 = var6 ^ -1;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_3_1 = stackOut_7_1;
                              stackIn_8_0 = stackOut_7_0;
                              stackIn_8_1 = stackOut_7_1;
                              if (var7 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_8_0 != stackIn_8_1) {
                                    L8: {
                                      if (this.c(127, var3)) {
                                        this.field_f = this.field_f | 1L << var6;
                                        this.field_t[var6] = cr.a(var6, -117);
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if ((this.field_t[var3] ^ -1) <= (cr.a(var3, -81) ^ -1)) {
                                        this.field_f = this.field_f | 1L << var3;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var2_array[var6] = true;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L3;
                }
                var3 = stackIn_22_0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (-64 >= (var3 ^ -1)) {
                        break L12;
                      } else {
                        stackOut_24_0 = var2_array[var3];
                        stackIn_39_0 = stackOut_24_0 ? 1 : 0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var7 != 0) {
                          break L11;
                        } else {
                          L13: {
                            if (stackIn_25_0) {
                              stackOut_30_0 = 0;
                              stackIn_31_0 = stackOut_30_0;
                              break L13;
                            } else {
                              stackOut_28_0 = 1;
                              stackIn_31_0 = stackOut_28_0;
                              break L13;
                            }
                          }
                          L14: {
                            if (stackIn_31_0 == 0 & this.c(127, var3)) {
                              break L14;
                            } else {
                              if ((this.field_t[var3] ^ -1) > (cr.a(var3, -112) ^ -1)) {
                                break L14;
                              } else {
                                this.field_f = this.field_f | 1L << var3;
                                break L14;
                              }
                            }
                          }
                          var3++;
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    stackOut_38_0 = param0;
                    stackIn_39_0 = stackOut_38_0;
                    break L11;
                  }
                  L15: {
                    if (stackIn_39_0 >= 22) {
                      break L15;
                    } else {
                      field_j = -28;
                      break L15;
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.H(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_32_0 = null;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_43_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        Object stackOut_31_0 = null;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_42_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_o = param1;
                this.field_u = param0;
                this.field_a = this.d((byte) 45);
                if (this.field_a < 4) {
                  break L2;
                } else {
                  this.field_i = this.d((byte) 97);
                  this.field_k = (12 & this.field_i) >> 23545570;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_c[0] = this.b(-1458);
              this.field_p[0] = this.b(param0 + -1458);
              this.field_c[1] = this.b(-1458);
              this.field_p[1] = this.b(-1458);
              break L1;
            }
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      if (-6 >= (var3_int ^ -1)) {
                        break L7;
                      } else {
                        this.field_m[var3_int] = this.d((byte) 69);
                        stackOut_9_0 = this.field_a ^ -1;
                        stackOut_9_1 = -4;
                        stackIn_21_0 = stackOut_9_0;
                        stackIn_21_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var6 != 0) {
                          L8: while (true) {
                            if (stackIn_21_0 <= stackIn_21_1) {
                              break L5;
                            } else {
                              this.field_s[var3_int] = this.d((byte) 97);
                              var3_int++;
                              if (var6 != 0) {
                                break L4;
                              } else {
                                if (var6 == 0) {
                                  stackOut_20_0 = var3_int ^ -1;
                                  stackOut_20_1 = -4;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackIn_21_1 = stackOut_20_1;
                                  continue L8;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_10_0 > stackIn_10_1) {
                                break L10;
                              } else {
                                this.field_g[var3_int] = this.d((byte) 83);
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            this.field_g[var3_int] = 255;
                            break L9;
                          }
                          var3_int++;
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var3_int = 0;
                    L11: while (true) {
                      stackOut_20_0 = var3_int ^ -1;
                      stackOut_20_1 = -4;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (stackIn_21_0 <= stackIn_21_1) {
                        break L5;
                      } else {
                        this.field_s[var3_int] = this.d((byte) 97);
                        var3_int++;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          if (var6 == 0) {
                            continue L11;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  break L5;
                }
                if (1 > this.field_a) {
                  break L4;
                } else {
                  this.field_v = this.d(-16777216);
                  this.field_h = this.d((byte) 84);
                  this.field_n = this.c(param0 ^ 16741);
                  this.a((byte) 62);
                  var3_int = 0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (var3_int >= 63) {
                          break L14;
                        } else {
                          stackOut_31_0 = this;
                          stackIn_43_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var6 != 0) {
                            break L13;
                          } else {
                            L15: {
                              stackOut_32_0 = ((rp) (this)).field_t;
                              stackOut_32_1 = var3_int;
                              stackIn_37_0 = stackOut_32_0;
                              stackIn_37_1 = stackOut_32_1;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              if (this.d(var3_int, 53)) {
                                stackOut_37_0 = (int[]) ((Object) stackIn_37_0);
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = cr.a(var3_int, -95);
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                break L15;
                              } else {
                                stackOut_33_0 = (int[]) ((Object) stackIn_33_0);
                                stackOut_33_1 = stackIn_33_1;
                                stackIn_35_0 = stackOut_33_0;
                                stackIn_35_1 = stackOut_33_1;
                                stackOut_35_0 = (int[]) ((Object) stackIn_35_0);
                                stackOut_35_1 = stackIn_35_1;
                                stackOut_35_2 = 0;
                                stackIn_38_0 = stackOut_35_0;
                                stackIn_38_1 = stackOut_35_1;
                                stackIn_38_2 = stackOut_35_2;
                                break L15;
                              }
                            }
                            stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                            var3_int++;
                            if (var6 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      if (-5 >= (this.field_a ^ -1)) {
                        stackOut_42_0 = this;
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                    var3_int = this.d((byte) 79);
                    var4 = 0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (var4 >= var3_int) {
                            break L18;
                          } else {
                            var5 = this.d((byte) 85);
                            this.field_t[var5] = this.f((byte) -53);
                            var4++;
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
                        this.a((byte) 106);
                        break L17;
                      }
                      if (this.field_a < 5) {
                        break L4;
                      } else {
                        this.field_f = this.c(16741);
                        break L4;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var3);
            stackOut_54_1 = new StringBuilder().append("rp.R(").append(param0).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param1 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L19;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L19;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
        }
    }

    final boolean g(int param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                discarded$2 = this.d(-106, -13);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, (byte) 6, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        byte stackOut_22_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              stackOut_2_0 = 63;
              stackOut_2_1 = var2_int;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      stackOut_4_0 = this.c(127, var2_int);
                      stackIn_23_0 = stackOut_4_0 ? 1 : 0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_5_0) {
                            break L5;
                          } else {
                            var3 = 1;
                            var4 = em.field_ab[var2_int];
                            var5 = 0;
                            L6: while (true) {
                              L7: {
                                if ((var4.length ^ -1) >= (var5 ^ -1)) {
                                  break L7;
                                } else {
                                  var6 = var4[var5];
                                  stackOut_10_0 = var6;
                                  stackOut_10_1 = 255;
                                  stackIn_3_0 = stackOut_10_0;
                                  stackIn_3_1 = stackOut_10_1;
                                  stackIn_11_0 = stackOut_10_0;
                                  stackIn_11_1 = stackOut_10_1;
                                  if (var7 != 0) {
                                    continue L2;
                                  } else {
                                    L8: {
                                      if (stackIn_11_0 == stackIn_11_1) {
                                        break L8;
                                      } else {
                                        if (this.d(var6, 53)) {
                                          break L8;
                                        } else {
                                          var3 = 0;
                                          break L8;
                                        }
                                      }
                                    }
                                    var5++;
                                    if (var7 == 0) {
                                      continue L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (var3 != 0) {
                                this.field_n = this.field_n | 1L << var2_int;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_22_0 = param0;
                  stackIn_23_0 = stackOut_22_0;
                  break L3;
                }
                L9: {
                  if (stackIn_23_0 <= -90) {
                    break L9;
                  } else {
                    this.field_a = 70;
                    break L9;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rp.T(" + param0 + ')');
        }
    }

    final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_19_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 3;
            var3 = 0;
            var4 = -88 % ((param0 - 68) / 53);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= 3) {
                    break L3;
                  } else {
                    stackOut_3_0 = -49;
                    stackOut_3_1 = this.field_s[var3] ^ -1;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 == stackIn_4_1) {
                            break L5;
                          } else {
                            if (-45 == (this.field_s[var3] ^ -1)) {
                              var2_int++;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int++;
                        break L4;
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = 5;
                stackOut_16_1 = var2_int;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L6: {
                if (stackIn_17_0 >= stackIn_17_1) {
                  break L6;
                } else {
                  var2_int = 5;
                  break L6;
                }
              }
              stackOut_19_0 = var2_int;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.D(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (-1 != (this.field_i & 1 ^ -1)) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            this.field_u = this.field_u + 2;
            if (param0 == -53) {
              stackOut_3_0 = (255 & this.field_o[-1 + this.field_u]) + ((255 & this.field_o[this.field_u + -2]) << -1038881944);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 116;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void e(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var1 = null;
        ga var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        String var3_ref_String = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ml var6 = null;
        String var7 = null;
        ml var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_12_0 = 0;
        ml stackIn_50_0 = null;
        ml stackIn_55_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        ml stackOut_49_0 = null;
        ml stackOut_54_0 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_ref = s.field_e;
            var2 = var1_ref.g(31365);
            if (-1 == (var2 ^ -1)) {
              L1: {
                if (bh.field_f == null) {
                  bh.field_f = new sc(128);
                  fn.field_d = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((var1_ref.g(31365) ^ -1) != -2) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3 = stackIn_12_0;
                  var4_ref_String = var1_ref.f((byte) -29);
                  if (var3 != 0) {
                    break L4;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var1_ref.f((byte) -19);
                break L3;
              }
              L5: {
                var6 = md.a((byte) -55, var4_ref_String);
                var7 = var1_ref.f((byte) -89);
                var8 = tg.a((CharSequence) ((Object) var4_ref_String), false);
                if (var8 != null) {
                  break L5;
                } else {
                  var8 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (var6 != null) {
                  break L6;
                } else {
                  var6 = md.a((byte) 105, var7);
                  if (null != var6) {
                    bh.field_f.a(-1, var6, (long)var8.hashCode());
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var6 != null) {
                  break L7;
                } else {
                  var6 = new ml();
                  bh.field_f.a(-1, var6, (long)var8.hashCode());
                  fieldTemp$2 = fn.field_d;
                  fn.field_d = fn.field_d + 1;
                  var6.field_Mb = fieldTemp$2;
                  jf.field_d.a(var6, false);
                  break L7;
                }
              }
              var6.field_Hb = var4_ref_String;
              var6.field_Pb = var5;
              var6.field_Kb = var7;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (-3 == (var2 ^ -1)) {
                  L8: {
                    if (1 == ge.field_zb) {
                      ge.field_zb = 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var2) {
                    L9: {
                      if (2 != ge.field_zb) {
                        break L9;
                      } else {
                        ge.field_zb = 1;
                        break L9;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-5 != (var2 ^ -1)) {
                      bd.a("F1: " + ci.a(0), (Throwable) null, false);
                      ak.a((byte) -119);
                      var3 = 67 % ((-12 - param0) / 48);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ge.field_zb = 1;
                      var3_ref_String = var1_ref.f((byte) -119);
                      ta.field_ob = var3_ref_String.intern();
                      var4 = var1_ref.g(31365);
                      gi.a((byte) -97, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                L10: {
                  if (ol.field_o == null) {
                    ol.field_o = new sc(128);
                    dc.field_Fb = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var3_ref_String = var1_ref.f((byte) -49);
                  if (var3_ref_String.equals("")) {
                    var3_ref_String = null;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1_ref.f((byte) -14);
                  var5 = var1_ref.f((byte) -45);
                  var6 = dn.a(var4_ref_String, false);
                  if (null != var6) {
                    break L12;
                  } else {
                    var6 = dn.a(var5, false);
                    if (var6 == null) {
                      break L12;
                    } else {
                      ol.field_o.a(-1, var6, (long)tg.a((CharSequence) ((Object) var4_ref_String), false).hashCode());
                      break L12;
                    }
                  }
                }
                L13: {
                  if (var6 == null) {
                    var6 = new ml();
                    ol.field_o.a(-1, var6, (long)tg.a((CharSequence) ((Object) var4_ref_String), false).hashCode());
                    fieldTemp$3 = dc.field_Fb;
                    dc.field_Fb = dc.field_Fb + 1;
                    var6.field_Mb = fieldTemp$3;
                    ro.field_M.a(var6, false);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null == var3_ref_String) {
                    break L14;
                  } else {
                    var3_ref_String = var3_ref_String.intern();
                    break L14;
                  }
                }
                var6.field_Nb = var3_ref_String;
                var6.field_Kb = var5;
                var6.field_Hb = var4_ref_String;
                var6.a(true);
                var7_ref = (ml) ((Object) ro.field_M.c(116));
                L15: while (true) {
                  L16: {
                    L17: {
                      if (var7_ref == null) {
                        break L17;
                      } else {
                        stackOut_49_0 = (ml) (var6);
                        stackIn_55_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (var9 != 0) {
                          break L16;
                        } else {
                          if (!md.a(stackIn_50_0, (byte) -49, var7_ref)) {
                            break L17;
                          } else {
                            var7_ref = (ml) ((Object) ro.field_M.b(6));
                            if (var9 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_54_0 = (ml) (var7_ref);
                    stackIn_55_0 = stackOut_54_0;
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (stackIn_55_0 != null) {
                        break L19;
                      } else {
                        ro.field_M.a(var6, false);
                        if (var9 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    vc.a(var7_ref, var6, true);
                    break L18;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rp.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fieldTemp$8 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$8] = (byte)(int)(param0 >> -860013896);
              fieldTemp$9 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$9] = (byte)(int)(param0 >> -825813136);
              fieldTemp$10 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$10] = (byte)(int)(param0 >> 548135208);
              fieldTemp$11 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$11] = (byte)(int)(param0 >> 1962754144);
              fieldTemp$12 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$12] = (byte)(int)(param0 >> 28332504);
              fieldTemp$13 = this.field_u;
              this.field_u = this.field_u + 1;
              this.field_o[fieldTemp$13] = (byte)(int)(param0 >> 564278032);
              if (param1 == -30502) {
                break L1;
              } else {
                this.e(13, 118);
                break L1;
              }
            }
            fieldTemp$14 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$14] = (byte)(int)(param0 >> -661373240);
            fieldTemp$15 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$15] = (byte)(int)param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "rp.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            this.field_u = this.field_u + 4;
            if (param0 == -16777216) {
              stackOut_3_0 = (255 & this.field_o[-1 + this.field_u]) + (((this.field_o[-3 + this.field_u] & 255) << 136379792) + (-16777216 & this.field_o[this.field_u + -4] << 47607704)) - -((this.field_o[this.field_u + -2] & 255) << 1979869096);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 34;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 53) {
                break L1;
              } else {
                field_j = 53;
                break L1;
              }
            }
            L2: {
              if (0L == (1L << param0 & this.field_f)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_i = this.field_i ^ 1;
            if (param0 < -102) {
              L1: {
                if (fb.field_e == null) {
                  break L1;
                } else {
                  fb.field_e.b((byte) 37);
                  break L1;
                }
              }
              we.field_g[47] = vn.field_d[ll.field_k.b((byte) -1)];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                this.field_a = -48;
                break L1;
              }
            }
            fieldTemp$2 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$2] = (byte)tq.b(255, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.B(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] f(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_33_0 = 0;
        byte[] stackIn_37_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_18_0 = false;
        int stackOut_32_0 = 0;
        byte[] stackOut_36_0 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_a = 5;
            this.field_o = new byte[hd.field_u];
            this.field_u = 0;
            this.b(this.field_a, -1);
            this.field_i = this.field_i & -13;
            this.field_i = this.field_i | this.field_k << -553171358;
            this.b(this.field_i, -1);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-6 >= (var2_int ^ -1)) {
                    break L3;
                  } else {
                    this.b((int) (byte)this.field_m[var2_int], -1);
                    this.b((int) (byte)this.field_g[var2_int], param0 ^ 16612);
                    var2_int++;
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
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var2_int ^ -1) <= -4) {
                      break L6;
                    } else {
                      this.b((int) (byte)this.field_s[var2_int], -1);
                      var2_int++;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.f(79, this.field_v);
                  this.b(this.field_h, -1);
                  this.a(this.field_n, -30502);
                  fieldTemp$1 = this.field_u;
                  this.field_u = this.field_u + 1;
                  var2_int = fieldTemp$1;
                  break L5;
                }
                var3 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if ((var3 ^ -1) <= -64) {
                        break L9;
                      } else {
                        stackOut_18_0 = this.c(param0 + 16740, var3);
                        stackIn_33_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var4 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (!stackIn_19_0) {
                              break L10;
                            } else {
                              if ((this.field_t[var3] ^ -1) == -1) {
                                break L10;
                              } else {
                                if (!this.d(var3, 53)) {
                                  this.b(var3, -1);
                                  this.a((byte) -23, this.field_t[var3]);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_32_0 = param0;
                    stackIn_33_0 = stackOut_32_0;
                    break L8;
                  }
                  L11: {
                    if (stackIn_33_0 == -16613) {
                      break L11;
                    } else {
                      field_l = (cj) null;
                      break L11;
                    }
                  }
                  this.field_o[var2_int] = (byte)((this.field_u + -var2_int) / 3);
                  this.a(this.field_f, param0 ^ 14273);
                  stackOut_36_0 = this.field_o;
                  stackIn_37_0 = stackOut_36_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.M(" + param0 + ')');
        }
        return stackIn_37_0;
    }

    private final boolean a(int param0, byte param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_18_0 = 0;
        byte stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_7_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_4_0 = this.c(127, param0);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.c(127, param0)) {
                var4 = em.field_ab[param0];
                var5 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if ((var5 ^ -1) <= (var4.length ^ -1)) {
                        break L3;
                      } else {
                        var6 = var4[var5];
                        stackOut_11_0 = var6 ^ -1;
                        stackOut_11_1 = -256;
                        stackIn_22_0 = stackOut_11_0;
                        stackIn_22_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_12_0 == stackIn_12_1) {
                              break L4;
                            } else {
                              if (!this.a(var6, (byte) 6, -1 + param2)) {
                                break L4;
                              } else {
                                stackOut_18_0 = 1;
                                stackIn_19_0 = stackOut_18_0;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_21_0 = param1;
                    stackOut_21_1 = 6;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L2;
                  }
                  L5: {
                    if (stackIn_22_0 == stackIn_22_1) {
                      break L5;
                    } else {
                      this.a(-101, 43, 112);
                      break L5;
                    }
                  }
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "rp.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    final boolean a(int param0, int param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) <= -4) {
                    break L3;
                  } else {
                    stackOut_3_0 = param0;
                    stackOut_3_1 = this.field_s[var3_int];
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_11_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 != stackIn_4_1) {
                        var3_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_10_0 = param1;
                stackOut_10_1 = -125;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              }
              L4: {
                if (stackIn_11_0 < stackIn_11_1) {
                  break L4;
                } else {
                  discarded$2 = this.b((byte) -42);
                  break L4;
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    private final void f(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$0] = (byte)tq.b(255, param1 >> -421851432);
        int fieldTemp$1 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$1] = (byte)tq.b(param1 >> 1460651856, 255);
        int fieldTemp$2 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$2] = (byte)tq.b(255, param1 >> -226529592);
        if (param0 < 8) {
            return;
        }
        try {
            fieldTemp$3 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$3] = (byte)tq.b(255, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rp.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final int d(byte param0) {
        int fieldTemp$2 = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 44) {
              fieldTemp$2 = this.field_u;
              this.field_u = this.field_u + 1;
              stackOut_3_0 = this.field_o[fieldTemp$2] & 255;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 120;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.BA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        try {
            fieldTemp$0 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$0] = (byte)tq.b(param1 >> -1461475064, 255);
            fieldTemp$1 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_o[fieldTemp$1] = (byte)(tq.b(param1, 255) >> -1807972640);
            if (param0 != -23) {
                this.field_c = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rp.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final long c(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        try {
          L0: {
            L1: {
              var2_long = (long)this.d(-16777216) & 4294967295L;
              if (param0 == 16741) {
                break L1;
              } else {
                this.field_u = 18;
                break L1;
              }
            }
            var4 = (long)this.d(-16777216) & 4294967295L;
            stackOut_3_0 = var4 + (var2_long << -429062112);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.U(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean c(int param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 126) {
                break L1;
              } else {
                discarded$2 = this.g(-39, 66);
                break L1;
              }
            }
            if ((param1 ^ -1) == -256) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((1L << param1 & this.field_n) == 0L) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    rp() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_a = 1;
        this.field_t = new int[63];
        this.field_p = new int[2];
        this.field_c = new int[2];
        this.field_s = new int[3];
        this.field_m = new int[5];
        this.field_g = new int[5];
        try {
          L0: {
            this.field_a = 1;
            this.field_c[0] = pd.a(-27486);
            this.field_c[1] = pd.a(-27486);
            this.field_p[0] = pd.a(-27486);
            this.field_p[1] = pd.a(-27486);
            this.field_i = 0;
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var1_int ^ -1) <= (this.field_m.length ^ -1)) {
                    break L3;
                  } else {
                    this.field_m[var1_int] = 255;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if ((this.field_g.length ^ -1) >= (var1_int ^ -1)) {
                      break L6;
                    } else {
                      this.field_g[var1_int] = 255;
                      var1_int++;
                      if (var2 != 0) {
                        break L5;
                      } else {
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var1_int = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var1_int >= this.field_s.length) {
                        break L9;
                      } else {
                        this.field_s[var1_int] = 255;
                        var1_int++;
                        if (var2 != 0) {
                          break L8;
                        } else {
                          if (var2 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    this.field_n = ej.a((byte) -66);
                    this.field_m[1] = 3;
                    this.field_m[2] = 8;
                    this.field_f = 0L;
                    this.field_m[0] = 0;
                    this.field_k = 0;
                    this.field_s[0] = 58;
                    this.field_s[2] = 53;
                    this.field_s[1] = 59;
                    break L8;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rp.<init>()");
        }
    }

    static {
        field_b = "Meltdown";
        field_j = 5;
        field_d = 33;
        field_e = "You have 1 unread message!";
    }
}
