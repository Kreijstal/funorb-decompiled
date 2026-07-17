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
            throw fa.a((Throwable) (Object) runtimeException, "rp.I(" + param0 + 41);
        }
    }

    private final int b(int param0) {
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
              int fieldTemp$6 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              var2_int = 255 & ((rp) this).field_o[fieldTemp$6];
              if (param0 == -1458) {
                break L1;
              } else {
                ((rp) this).field_a = 15;
                break L1;
              }
            }
            int fieldTemp$7 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            var3 = 255 & ((rp) this).field_o[fieldTemp$7];
            int fieldTemp$8 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            var4 = ((rp) this).field_o[fieldTemp$8] & 255;
            stackOut_3_0 = var4 | (var2_int << 16 | var3 << 8);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.J(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void e(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (~param1 > ~((rp) this).field_t.length) {
                  L2: {
                    if (param0 == -6821) {
                      break L2;
                    } else {
                      field_l = null;
                      break L2;
                    }
                  }
                  ((rp) this).field_f = ((rp) this).field_f | 1L << param1;
                  ((rp) this).field_t[param1] = cr.a(param1, -107);
                  ((rp) this).c((byte) -103);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "rp.S(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (~param2 <= ~((rp) this).field_t.length) {
                  break L1;
                } else {
                  L2: {
                    ((rp) this).field_t[param2] = ((rp) this).field_t[param2] + param1;
                    var4_int = -102 / ((param0 - -43) / 40);
                    if (~((rp) this).field_t[param2] > ~cr.a(param2, -94)) {
                      break L2;
                    } else {
                      ((rp) this).e(-6821, param2);
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "rp.F(" + param0 + 44 + param1 + 44 + param2 + 41);
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
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_array = new boolean[63];
            var3 = 0;
            L1: while (true) {
              if (var3 >= 63) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 63) {
                    L3: {
                      if (param0 >= 22) {
                        break L3;
                      } else {
                        field_j = -28;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    L4: {
                      if (var2_array[var3]) {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        break L4;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        break L4;
                      }
                    }
                    L5: {
                      if (stackIn_26_0 == 0 & ((rp) this).c(127, var3)) {
                        break L5;
                      } else {
                        if (~((rp) this).field_t[var3] > ~cr.a(var3, -112)) {
                          break L5;
                        } else {
                          ((rp) this).field_f = ((rp) this).field_f | 1L << var3;
                          break L5;
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = em.field_ab[var3];
                var5 = 0;
                L6: while (true) {
                  if (var4.length <= var5) {
                    var3++;
                    continue L1;
                  } else {
                    L7: {
                      var6 = var4[var5];
                      if (var6 != 255) {
                        L8: {
                          if (((rp) this).c(127, var3)) {
                            ((rp) this).field_f = ((rp) this).field_f | 1L << var6;
                            ((rp) this).field_t[var6] = cr.a(var6, -117);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (~((rp) this).field_t[var3] <= ~cr.a(var3, -81)) {
                            ((rp) this).field_f = ((rp) this).field_f | 1L << var3;
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
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.H(" + param0 + 41);
        }
    }

    final void a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ((rp) this).field_o = param1;
              ((rp) this).field_u = param0;
              ((rp) this).field_a = this.d((byte) 45);
              if (((rp) this).field_a < 4) {
                ((rp) this).field_c[0] = this.b(-1458);
                ((rp) this).field_p[0] = this.b(param0 + -1458);
                ((rp) this).field_c[1] = this.b(-1458);
                ((rp) this).field_p[1] = this.b(-1458);
                break L1;
              } else {
                ((rp) this).field_i = this.d((byte) 97);
                ((rp) this).field_k = (12 & ((rp) this).field_i) >> 2;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= 5) {
                var3_int = 0;
                L3: while (true) {
                  if (var3_int >= 3) {
                    L4: {
                      if (1 > ((rp) this).field_a) {
                        break L4;
                      } else {
                        ((rp) this).field_v = this.d(-16777216);
                        ((rp) this).field_h = this.d((byte) 84);
                        ((rp) this).field_n = this.c(param0 ^ 16741);
                        this.a((byte) 62);
                        var3_int = 0;
                        L5: while (true) {
                          if (var3_int >= 63) {
                            if (((rp) this).field_a >= 4) {
                              var3_int = this.d((byte) 79);
                              var4 = 0;
                              L6: while (true) {
                                if (var4 >= var3_int) {
                                  this.a((byte) 106);
                                  if (((rp) this).field_a < 5) {
                                    break L4;
                                  } else {
                                    ((rp) this).field_f = this.c(16741);
                                    break L4;
                                  }
                                } else {
                                  var5 = this.d((byte) 85);
                                  ((rp) this).field_t[var5] = this.f((byte) -53);
                                  var4++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            L7: {
                              stackOut_28_0 = ((rp) this).field_t;
                              stackOut_28_1 = var3_int;
                              stackIn_33_0 = stackOut_28_0;
                              stackIn_33_1 = stackOut_28_1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if (((rp) this).d(var3_int, 53)) {
                                stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                                stackOut_33_1 = stackIn_33_1;
                                stackOut_33_2 = cr.a(var3_int, -95);
                                stackIn_34_0 = stackOut_33_0;
                                stackIn_34_1 = stackOut_33_1;
                                stackIn_34_2 = stackOut_33_2;
                                break L7;
                              } else {
                                stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                                stackOut_29_1 = stackIn_29_1;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                                stackOut_31_1 = stackIn_31_1;
                                stackOut_31_2 = 0;
                                stackIn_34_0 = stackOut_31_0;
                                stackIn_34_1 = stackOut_31_1;
                                stackIn_34_2 = stackOut_31_2;
                                break L7;
                              }
                            }
                            stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                            var3_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    ((rp) this).field_s[var3_int] = this.d((byte) 97);
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                L8: {
                  ((rp) this).field_m[var3_int] = this.d((byte) 69);
                  if (((rp) this).field_a < 3) {
                    ((rp) this).field_g[var3_int] = 255;
                    break L8;
                  } else {
                    ((rp) this).field_g[var3_int] = this.d((byte) 83);
                    break L8;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var3;
            stackOut_47_1 = new StringBuilder().append("rp.R(").append(param0).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L9;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
    }

    final boolean g(int param0, int param1) {
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
                boolean discarded$2 = ((rp) this).d(-106, -13);
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
          throw fa.a((Throwable) (Object) var3, "rp.W(" + param0 + 44 + param1 + 41);
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
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (63 <= var2_int) {
                L2: {
                  if (param0 <= -90) {
                    break L2;
                  } else {
                    ((rp) this).field_a = 70;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (((rp) this).c(127, var2_int)) {
                    break L3;
                  } else {
                    var3 = 1;
                    var4 = em.field_ab[var2_int];
                    var5 = 0;
                    L4: while (true) {
                      if (~var4.length >= ~var5) {
                        if (var3 != 0) {
                          ((rp) this).field_n = ((rp) this).field_n | 1L << var2_int;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          var6 = var4[var5];
                          if (var6 == 255) {
                            break L5;
                          } else {
                            if (((rp) this).d(var6, 53)) {
                              break L5;
                            } else {
                              var3 = 0;
                              break L5;
                            }
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "rp.T(" + param0 + 41);
        }
    }

    final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 3;
            var3 = 0;
            var4 = -88 % ((param0 - 68) / 53);
            L1: while (true) {
              if (var3 >= 3) {
                L2: {
                  if (5 >= var2_int) {
                    break L2;
                  } else {
                    var2_int = 5;
                    break L2;
                  }
                }
                stackOut_17_0 = var2_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  if (((rp) this).field_s[var3] == 48) {
                    var2_int++;
                    break L3;
                  } else {
                    if (((rp) this).field_s[var3] == 44) {
                      var2_int++;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.D(" + param0 + 41);
        }
        return stackIn_18_0;
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if ((((rp) this).field_i & 1) != 0) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.C(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            ((rp) this).field_u = ((rp) this).field_u + 2;
            if (param0 == -53) {
              stackOut_3_0 = (255 & ((rp) this).field_o[-1 + ((rp) this).field_u]) + ((255 & ((rp) this).field_o[((rp) this).field_u + -2]) << 8);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 116;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.V(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final static void e(byte param0) {
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_ref = s.field_e;
            var2 = var1_ref.g(31365);
            if (var2 == 0) {
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
                if (var1_ref.g(31365) != 1) {
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
                var3 = stackIn_12_0;
                var4_ref_String = var1_ref.f((byte) -29);
                if (var3 != 0) {
                  var5 = var1_ref.f((byte) -19);
                  break L3;
                } else {
                  var5 = var4_ref_String;
                  break L3;
                }
              }
              L4: {
                var6 = md.a((byte) -55, var4_ref_String);
                var7 = var1_ref.f((byte) -89);
                var8 = tg.a((CharSequence) (Object) var4_ref_String, false);
                if (var8 != null) {
                  break L4;
                } else {
                  var8 = var4_ref_String;
                  break L4;
                }
              }
              L5: {
                if (var6 != null) {
                  break L5;
                } else {
                  var6 = md.a((byte) 105, var7);
                  if (null != var6) {
                    bh.field_f.a(-1, (qa) (Object) var6, (long)var8.hashCode());
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var6 != null) {
                  break L6;
                } else {
                  var6 = new ml();
                  bh.field_f.a(-1, (qa) (Object) var6, (long)var8.hashCode());
                  int fieldTemp$2 = fn.field_d;
                  fn.field_d = fn.field_d + 1;
                  var6.field_Mb = fieldTemp$2;
                  jf.field_d.a((br) (Object) var6, false);
                  break L6;
                }
              }
              var6.field_Hb = var4_ref_String;
              var6.field_Pb = var5;
              var6.field_Kb = var7;
              return;
            } else {
              if (var2 != 1) {
                if (var2 == 2) {
                  L7: {
                    if (1 == ge.field_zb) {
                      ge.field_zb = 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                } else {
                  if (3 == var2) {
                    L8: {
                      if (2 != ge.field_zb) {
                        break L8;
                      } else {
                        ge.field_zb = 1;
                        break L8;
                      }
                    }
                    return;
                  } else {
                    if (var2 != 4) {
                      bd.a("F1: " + ci.a(0), (Throwable) null, false);
                      ak.a((byte) -119);
                      var3 = 67 % ((-12 - param0) / 48);
                      break L0;
                    } else {
                      ge.field_zb = 1;
                      var3_ref_String = var1_ref.f((byte) -119);
                      ta.field_ob = var3_ref_String.intern();
                      var4 = var1_ref.g(31365);
                      gi.a((byte) -97, var4);
                      return;
                    }
                  }
                }
              } else {
                L9: {
                  if (ol.field_o == null) {
                    ol.field_o = new sc(128);
                    dc.field_Fb = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var3_ref_String = var1_ref.f((byte) -49);
                  if (var3_ref_String.equals((Object) (Object) "")) {
                    var3_ref_String = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1_ref.f((byte) -14);
                  var5 = var1_ref.f((byte) -45);
                  var6 = dn.a(var4_ref_String, false);
                  if (null != var6) {
                    break L11;
                  } else {
                    var6 = dn.a(var5, false);
                    if (var6 == null) {
                      break L11;
                    } else {
                      ol.field_o.a(-1, (qa) (Object) var6, (long)tg.a((CharSequence) (Object) var4_ref_String, false).hashCode());
                      break L11;
                    }
                  }
                }
                L12: {
                  if (var6 == null) {
                    var6 = new ml();
                    ol.field_o.a(-1, (qa) (Object) var6, (long)tg.a((CharSequence) (Object) var4_ref_String, false).hashCode());
                    int fieldTemp$3 = dc.field_Fb;
                    dc.field_Fb = dc.field_Fb + 1;
                    var6.field_Mb = fieldTemp$3;
                    ro.field_M.a((br) (Object) var6, false);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (null == var3_ref_String) {
                    break L13;
                  } else {
                    var3_ref_String = var3_ref_String.intern();
                    break L13;
                  }
                }
                var6.field_Nb = var3_ref_String;
                var6.field_Kb = var5;
                var6.field_Hb = var4_ref_String;
                var6.a(true);
                var7_ref = (ml) (Object) ro.field_M.c(116);
                L14: while (true) {
                  L15: {
                    if (var7_ref == null) {
                      break L15;
                    } else {
                      if (!md.a(var6, (byte) -49, var7_ref)) {
                        break L15;
                      } else {
                        var7_ref = (ml) (Object) ro.field_M.b(6);
                        continue L14;
                      }
                    }
                  }
                  L16: {
                    if (var7_ref != null) {
                      vc.a((br) (Object) var7_ref, (br) (Object) var6, true);
                      break L16;
                    } else {
                      ro.field_M.a((br) (Object) var6, false);
                      break L16;
                    }
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "rp.K(" + param0 + 41);
        }
    }

    private final void a(long param0, int param1) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int fieldTemp$8 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              ((rp) this).field_o[fieldTemp$8] = (byte)(int)(param0 >> 56);
              int fieldTemp$9 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              ((rp) this).field_o[fieldTemp$9] = (byte)(int)(param0 >> 48);
              int fieldTemp$10 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              ((rp) this).field_o[fieldTemp$10] = (byte)(int)(param0 >> 40);
              int fieldTemp$11 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              ((rp) this).field_o[fieldTemp$11] = (byte)(int)(param0 >> 32);
              int fieldTemp$12 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              ((rp) this).field_o[fieldTemp$12] = (byte)(int)(param0 >> 24);
              int fieldTemp$13 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              ((rp) this).field_o[fieldTemp$13] = (byte)(int)(param0 >> 16);
              if (param1 == -30502) {
                break L1;
              } else {
                ((rp) this).e(13, 118);
                break L1;
              }
            }
            int fieldTemp$14 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            ((rp) this).field_o[fieldTemp$14] = (byte)(int)(param0 >> 8);
            int fieldTemp$15 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            ((rp) this).field_o[fieldTemp$15] = (byte)(int)param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "rp.P(" + param0 + 44 + param1 + 41);
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            ((rp) this).field_u = ((rp) this).field_u + 4;
            if (param0 == -16777216) {
              stackOut_3_0 = (255 & ((rp) this).field_o[-1 + ((rp) this).field_u]) + (((((rp) this).field_o[-3 + ((rp) this).field_u] & 255) << 16) + (-16777216 & ((rp) this).field_o[((rp) this).field_u + -4] << 24)) - -((((rp) this).field_o[((rp) this).field_u + -2] & 255) << 8);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 34;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.G(" + param0 + 41);
        }
        return stackIn_4_0;
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
              if (0L == (1L << param0 & ((rp) this).field_f)) {
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
          throw fa.a((Throwable) (Object) var3, "rp.Q(" + param0 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((rp) this).field_i = ((rp) this).field_i ^ 1;
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.O(" + param0 + 41);
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((rp) this).field_a = -48;
                break L1;
              }
            }
            int fieldTemp$2 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            ((rp) this).field_o[fieldTemp$2] = (byte)tq.b(255, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "rp.B(" + param0 + 44 + param1 + 41);
        }
    }

    final byte[] f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_31_0 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            ((rp) this).field_a = 5;
            ((rp) this).field_o = new byte[hd.field_u];
            ((rp) this).field_u = 0;
            this.b(((rp) this).field_a, -1);
            ((rp) this).field_i = ((rp) this).field_i & -13;
            ((rp) this).field_i = ((rp) this).field_i | ((rp) this).field_k << 2;
            this.b(((rp) this).field_i, -1);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 5) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= 3) {
                    this.f(79, ((rp) this).field_v);
                    this.b(((rp) this).field_h, -1);
                    this.a(((rp) this).field_n, -30502);
                    int fieldTemp$1 = ((rp) this).field_u;
                    ((rp) this).field_u = ((rp) this).field_u + 1;
                    var2_int = fieldTemp$1;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= 63) {
                        L4: {
                          if (param0 == -16613) {
                            break L4;
                          } else {
                            field_l = null;
                            break L4;
                          }
                        }
                        ((rp) this).field_o[var2_int] = (byte)((((rp) this).field_u + -var2_int) / 3);
                        this.a(((rp) this).field_f, param0 ^ 14273);
                        stackOut_31_0 = ((rp) this).field_o;
                        stackIn_32_0 = stackOut_31_0;
                        break L0;
                      } else {
                        L5: {
                          if (!((rp) this).c(param0 + 16740, var3)) {
                            break L5;
                          } else {
                            if (((rp) this).field_t[var3] == 0) {
                              break L5;
                            } else {
                              if (!((rp) this).d(var3, 53)) {
                                this.b(var3, -1);
                                this.a((byte) -23, ((rp) this).field_t[var3]);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    this.b((int) (byte)((rp) this).field_s[var2_int], -1);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                this.b((int) (byte)((rp) this).field_m[var2_int], -1);
                this.b((int) (byte)((rp) this).field_g[var2_int], param0 ^ 16612);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.M(" + param0 + 41);
        }
        return stackIn_32_0;
    }

    private final boolean a(int param0, byte param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_4_0 = ((rp) this).c(127, param0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (!((rp) this).c(127, param0)) {
                var4 = em.field_ab[param0];
                var5 = 0;
                L1: while (true) {
                  if (~var5 <= ~var4.length) {
                    L2: {
                      if (param1 == 6) {
                        break L2;
                      } else {
                        ((rp) this).a(-101, 43, 112);
                        break L2;
                      }
                    }
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    L3: {
                      var6 = var4[var5];
                      if (var6 == 255) {
                        break L3;
                      } else {
                        if (!this.a(var6, (byte) 6, -1 + param2)) {
                          break L3;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4_ref, "rp.E(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    final boolean a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 3) {
                L2: {
                  if (param1 < -125) {
                    break L2;
                  } else {
                    int discarded$2 = ((rp) this).b((byte) -42);
                    break L2;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                if (param0 != ((rp) this).field_s[var3_int]) {
                  var3_int++;
                  continue L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "rp.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    private final void f(int param0, int param1) {
        int fieldTemp$0 = ((rp) this).field_u;
        ((rp) this).field_u = ((rp) this).field_u + 1;
        ((rp) this).field_o[fieldTemp$0] = (byte)tq.b(255, param1 >> 24);
        int fieldTemp$1 = ((rp) this).field_u;
        ((rp) this).field_u = ((rp) this).field_u + 1;
        ((rp) this).field_o[fieldTemp$1] = (byte)tq.b(param1 >> 16, 255);
        int fieldTemp$2 = ((rp) this).field_u;
        ((rp) this).field_u = ((rp) this).field_u + 1;
        ((rp) this).field_o[fieldTemp$2] = (byte)tq.b(255, param1 >> 8);
        if (param0 < 8) {
            return;
        }
        try {
            int fieldTemp$3 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            ((rp) this).field_o[fieldTemp$3] = (byte)tq.b(255, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rp.N(" + param0 + 44 + param1 + 41);
        }
    }

    private final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 44) {
              int fieldTemp$2 = ((rp) this).field_u;
              ((rp) this).field_u = ((rp) this).field_u + 1;
              stackOut_3_0 = ((rp) this).field_o[fieldTemp$2] & 255;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 120;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.BA(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(byte param0, int param1) {
        try {
            int fieldTemp$0 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            ((rp) this).field_o[fieldTemp$0] = (byte)tq.b(param1 >> 8, 255);
            int fieldTemp$1 = ((rp) this).field_u;
            ((rp) this).field_u = ((rp) this).field_u + 1;
            ((rp) this).field_o[fieldTemp$1] = (byte)tq.b(param1, 255);
            if (param0 != -23) {
                ((rp) this).field_c = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rp.AA(" + param0 + 44 + param1 + 41);
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
                ((rp) this).field_u = 18;
                break L1;
              }
            }
            var4 = (long)this.d(-16777216) & 4294967295L;
            stackOut_3_0 = var4 + (var2_long << 32);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "rp.U(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
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
                boolean discarded$2 = ((rp) this).g(-39, 66);
                break L1;
              }
            }
            if (param1 == 255) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              L2: {
                if ((1L << param1 & ((rp) this).field_n) == 0L) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "rp.L(" + param0 + 44 + param1 + 41);
        }
        return stackIn_12_0 != 0;
    }

    rp() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        ((rp) this).field_a = 1;
        ((rp) this).field_t = new int[63];
        ((rp) this).field_p = new int[2];
        ((rp) this).field_c = new int[2];
        ((rp) this).field_s = new int[3];
        ((rp) this).field_m = new int[5];
        ((rp) this).field_g = new int[5];
        try {
          L0: {
            ((rp) this).field_a = 1;
            ((rp) this).field_c[0] = pd.a(-27486);
            ((rp) this).field_c[1] = pd.a(-27486);
            ((rp) this).field_p[0] = pd.a(-27486);
            ((rp) this).field_p[1] = pd.a(-27486);
            ((rp) this).field_i = 0;
            var1_int = 0;
            L1: while (true) {
              if (~var1_int <= ~((rp) this).field_m.length) {
                var1_int = 0;
                L2: while (true) {
                  if (~((rp) this).field_g.length >= ~var1_int) {
                    var1_int = 0;
                    L3: while (true) {
                      if (var1_int >= ((rp) this).field_s.length) {
                        ((rp) this).field_n = ej.a((byte) -66);
                        ((rp) this).field_m[1] = 3;
                        ((rp) this).field_m[2] = 8;
                        ((rp) this).field_f = 0L;
                        ((rp) this).field_m[0] = 0;
                        ((rp) this).field_k = 0;
                        ((rp) this).field_s[0] = 58;
                        ((rp) this).field_s[2] = 53;
                        ((rp) this).field_s[1] = 59;
                        break L0;
                      } else {
                        ((rp) this).field_s[var1_int] = 255;
                        var1_int++;
                        continue L3;
                      }
                    }
                  } else {
                    ((rp) this).field_g[var1_int] = 255;
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                ((rp) this).field_m[var1_int] = 255;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "rp.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Meltdown";
        field_j = 5;
        field_d = 33;
        field_e = "You have 1 unread message!";
    }
}
