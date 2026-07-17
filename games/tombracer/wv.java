/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wv extends dfa {
    static int field_j;
    int field_i;
    int field_p;
    int field_g;
    fna[] field_m;
    int field_n;
    ko field_k;
    int field_f;
    static vna field_l;
    static String field_h;
    boolean field_o;

    void a(byte param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        fna var4 = null;
        int var5 = 0;
        fna stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_7_2 = false;
        int stackIn_7_3 = 0;
        fna stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        boolean stackIn_9_2 = false;
        int stackIn_9_3 = 0;
        fna stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_11_2 = false;
        int stackIn_11_3 = 0;
        fna stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_12_2 = false;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        RuntimeException decompiledCaughtException = null;
        fna stackOut_6_0 = null;
        boolean stackOut_6_1 = false;
        boolean stackOut_6_2 = false;
        int stackOut_6_3 = 0;
        fna stackOut_11_0 = null;
        boolean stackOut_11_1 = false;
        boolean stackOut_11_2 = false;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        fna stackOut_7_0 = null;
        boolean stackOut_7_1 = false;
        boolean stackOut_7_2 = false;
        int stackOut_7_3 = 0;
        fna stackOut_9_0 = null;
        boolean stackOut_9_1 = false;
        boolean stackOut_9_2 = false;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (~((wv) this).field_k.field_i >= ~var3_int) {
                L2: {
                  if (param0 == -28) {
                    break L2;
                  } else {
                    int discarded$2 = this.f(-3, -5);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var4 = ((wv) this).field_m[var3_int];
                  if (!((wv) this).c(var3_int, param0 + 28)) {
                    break L3;
                  } else {
                    L4: {
                      stackOut_6_0 = (fna) var4;
                      stackOut_6_1 = ((wv) this).a(param0 + 15, var3_int);
                      stackOut_6_2 = ((wv) this).b(var4.field_g, -30487);
                      stackOut_6_3 = 1;
                      stackIn_11_0 = stackOut_6_0;
                      stackIn_11_1 = stackOut_6_1;
                      stackIn_11_2 = stackOut_6_2;
                      stackIn_11_3 = stackOut_6_3;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      if (((wv) this).field_k.field_h != var3_int) {
                        stackOut_11_0 = (fna) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        break L4;
                      } else {
                        stackOut_7_0 = (fna) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = stackIn_7_3;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackOut_9_0 = (fna) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = stackIn_9_2;
                        stackOut_9_3 = stackIn_9_3;
                        stackOut_9_4 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        stackIn_12_3 = stackOut_9_3;
                        stackIn_12_4 = stackOut_9_4;
                        break L4;
                      }
                    }
                    ((fna) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4 != 0);
                    break L3;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "wv.I(" + param0 + 44 + param1 + 41);
        }
    }

    void b(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (((wv) this).field_m.length <= param2) {
                  break L1;
                } else {
                  L2: {
                    var4_int = ((wv) this).field_m[param2].field_g;
                    var5 = ((wv) this).field_k.a(param0) ? 1 : 0;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      vb discarded$3 = dsa.a(-80);
                      boolean discarded$4 = this.a(var4_int, param1, (byte) 119);
                      break L2;
                    }
                  }
                  L3: {
                    var8 = var4_int;
                    if (5 != var8) {
                      if (var8 != 6) {
                        break L3;
                      } else {
                        L4: {
                          var7 = uha.e((byte) 124);
                          if (((wv) this).field_k.a(0)) {
                            mqa.a(0, (byte) -118);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (((wv) this).field_k.f(-6)) {
                            mqa.a(var7, (byte) 124);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (!((wv) this).field_k.a((byte) -128)) {
                            break L6;
                          } else {
                            var8 = -24 + (aaa.a(false) >> 1);
                            var9 = -var8 + jba.field_j;
                            var10 = var9 << 1;
                            if (var10 > 0) {
                              if (var10 >= var7) {
                                mqa.a(var7, (byte) 85);
                                break L6;
                              } else {
                                mqa.a(var10, (byte) -48);
                                break L6;
                              }
                            } else {
                              mqa.a(0, (byte) 121);
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (((wv) this).field_k.d(96)) {
                            bv.d((byte) -55);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (((wv) this).field_k.e(97)) {
                          ila.a(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      L8: {
                        var6 = 0;
                        if (!((wv) this).field_k.a(0)) {
                          break L8;
                        } else {
                          if (tk.a(-22636) <= 0) {
                            break L8;
                          } else {
                            qfa.a(0, 20815);
                            var6 = 1;
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (!((wv) this).field_k.f(75)) {
                          break L9;
                        } else {
                          if (~tk.a(-22636) > ~uha.e((byte) 71)) {
                            var6 = 1;
                            qfa.a(uha.e((byte) 126), 20815);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (!((wv) this).field_k.a((byte) -128)) {
                          break L10;
                        } else {
                          L11: {
                            var8 = -24 + (aaa.a(false) >> 1);
                            var9 = -var8 + jba.field_j;
                            var10 = var9 << 1;
                            if (var10 <= 0) {
                              var10 = 0;
                              break L11;
                            } else {
                              if (uha.e((byte) 68) > var10) {
                                break L11;
                              } else {
                                var10 = uha.e((byte) 61);
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (~tk.a(-22636) == ~var10) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L12;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_44_0 = stackOut_41_0;
                              break L12;
                            }
                          }
                          var6 = stackIn_44_0;
                          qfa.a(var10, 20815);
                          break L10;
                        }
                      }
                      L13: {
                        if (!((wv) this).field_k.d(96)) {
                          break L13;
                        } else {
                          if (0 >= tk.a(-22636)) {
                            break L13;
                          } else {
                            var6 = 1;
                            to.b(11);
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (!((wv) this).field_k.e(94)) {
                          break L14;
                        } else {
                          if (~tk.a(-22636) <= ~uha.e((byte) 87)) {
                            break L14;
                          } else {
                            var6 = 1;
                            lka.a((byte) -117);
                            break L14;
                          }
                        }
                      }
                      if (var6 == 0) {
                        break L3;
                      } else {
                        L15: {
                          if (!((wv) this).field_k.a((byte) -127)) {
                            break L15;
                          } else {
                            if (jba.field_j % 5 != 0) {
                              break L3;
                            } else {
                              break L15;
                            }
                          }
                        }
                        vb discarded$5 = it.a(255, 198);
                        break L3;
                      }
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
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "wv.V(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_4_0 = false;
        try {
          L0: {
            L1: {
              if (param1 == -30487) {
                break L1;
              } else {
                int discarded$2 = this.b(-53, false, -31);
                break L1;
              }
            }
            if (param0 != 28) {
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = vpa.a(param1 ^ -30555);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.T(" + param0 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    wv(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((wv) this).field_o = true;
        try {
          L0: {
            L1: {
              ((wv) this).field_g = param1;
              ((wv) this).field_i = param4;
              ((wv) this).field_f = param2;
              if (null != param5) {
                break L1;
              } else {
                param5 = new int[]{};
                break L1;
              }
            }
            ((wv) this).field_n = param3;
            ((wv) this).a(22174, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("wv.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 111) {
                break L1;
              } else {
                boolean discarded$2 = ((wv) this).b(61);
                break L1;
              }
            }
            stackOut_3_0 = ((wv) this).field_g;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.F(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    void a(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        w var4_ref = null;
        int var5 = 0;
        fna stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        fna stackIn_8_0 = null;
        boolean stackIn_8_1 = false;
        fna stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        fna stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        Object stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        fna stackOut_5_0 = null;
        boolean stackOut_5_1 = false;
        fna stackOut_10_0 = null;
        boolean stackOut_10_1 = false;
        int stackOut_10_2 = 0;
        fna stackOut_6_0 = null;
        boolean stackOut_6_1 = false;
        fna stackOut_8_0 = null;
        boolean stackOut_8_1 = false;
        int stackOut_8_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!lca.a(false)) {
              var4_int = 0;
              L1: while (true) {
                if (((wv) this).field_k.field_i <= var4_int) {
                  L2: {
                    if (param2 == 15283) {
                      break L2;
                    } else {
                      ((wv) this).c(34);
                      break L2;
                    }
                  }
                  L3: {
                    if (!param1) {
                      break L3;
                    } else {
                      if (rpa.field_d) {
                        break L3;
                      } else {
                        if (vda.field_q) {
                          break L3;
                        } else {
                          ((wv) this).field_k.a(this.b(lba.field_p, true, jm.field_m), 71, this.b(sta.field_B, true, jba.field_j));
                          stackOut_25_0 = this;
                          stackIn_27_0 = stackOut_25_0;
                          if (((wv) this).field_k.field_h == -1) {
                            break L3;
                          } else {
                            ((wv) this).b(false, true, ((wv) this).field_k.field_h);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (!param1) {
                      break L4;
                    } else {
                      if (!param0) {
                        break L4;
                      } else {
                        L5: {
                          if (((wv) this).field_c == 7) {
                            break L5;
                          } else {
                            if (8 != ((wv) this).field_c) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (rba.field_a == null) {
                          break L4;
                        } else {
                          if (null == rba.field_a.field_k) {
                            break L4;
                          } else {
                            if (rba.field_a.field_k.a(param2 ^ 15283, rba.field_a.l(param2 ^ 15336)) == null) {
                              break L4;
                            } else {
                              var4_ref = (w) (Object) rba.field_a.field_k.a(0, rba.field_a.l(param2 ^ 15326)).field_G;
                              if (var4_ref == null) {
                                break L4;
                              } else {
                                var4_ref.a(108, true);
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  L6: {
                    stackOut_5_0 = ((wv) this).field_m[var4_int];
                    stackOut_5_1 = param0;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_10_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (~((wv) this).field_k.field_h != ~var4_int) {
                      stackOut_10_0 = (fna) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L6;
                    } else {
                      stackOut_6_0 = (fna) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackOut_8_0 = (fna) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      stackIn_11_1 = stackOut_8_1;
                      stackIn_11_2 = stackOut_8_2;
                      break L6;
                    }
                  }
                  L7: {
                    ((fna) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0, param1, 6);
                    if (6 != ((wv) this).field_m[var4_int].field_g) {
                      break L7;
                    } else {
                      ((wv) this).field_m[var4_int].field_i = ((wv) this).field_m[var4_int + -1].field_i + 33;
                      break L7;
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "wv.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -48) {
                break L1;
              } else {
                ((wv) this).field_m = null;
                break L1;
              }
            }
            stackOut_3_0 = ((wv) this).field_f;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.O(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 31923) {
                break L1;
              } else {
                int discarded$2 = ((wv) this).g(-42, 120);
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "wv.L(" + param0 + 41);
        }
        return stackIn_4_0 != 0;
    }

    private final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              if (4 == param1) {
                break L1;
              } else {
                if (param1 == 13) {
                  break L1;
                } else {
                  if (14 == param1) {
                    break L1;
                  } else {
                    if (param1 == 6) {
                      break L1;
                    } else {
                      if (30 == param1) {
                        break L1;
                      } else {
                        if (param1 != 41) {
                          if (param0 <= -64) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L0;
                          } else {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            return stackIn_20_0 != 0;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_16_0 = 1;
            stackIn_17_0 = stackOut_16_0;
            return stackIn_17_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.U(" + param0 + 44 + param1 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final boolean a(boolean param0, wv param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((wv) this).field_i = 44;
                break L1;
              }
            }
            L2: {
              if (~((wv) this).field_p <= ~param1.field_p) {
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("wv.R(").append(param0).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(int param0, boolean param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_235_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_264_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_299_0 = 0;
        int stackIn_301_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_305_0 = 0;
        int stackIn_307_0 = 0;
        int stackIn_312_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_319_0 = 0;
        int stackIn_324_0 = 0;
        int stackIn_325_0 = 0;
        int stackIn_327_0 = 0;
        int stackIn_329_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_311_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_321_0 = 0;
        int stackOut_324_0 = 0;
        int stackOut_328_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_317_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_318_0 = 0;
        int stackOut_304_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_263_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_2_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 > 117) {
              if (!((wv) this).b(param0, -30487)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var7 = param0;
                if (var7 != 22) {
                  if (var7 == 1) {
                    ira.a(param1, 9, (byte) -16);
                    stackOut_195_0 = 1;
                    stackIn_196_0 = stackOut_195_0;
                    return stackIn_196_0 != 0;
                  } else {
                    if (2 != var7) {
                      if (3 != var7) {
                        if (var7 == 12) {
                          L1: {
                            if (((wv) this).field_c == 7) {
                              ira.a(param1, 12, (byte) -113);
                              break L1;
                            } else {
                              ira.a(param1, 4, (byte) -11);
                              break L1;
                            }
                          }
                          stackOut_213_0 = 1;
                          stackIn_214_0 = stackOut_213_0;
                          return stackIn_214_0 != 0;
                        } else {
                          if (35 != var7) {
                            if (var7 == 33) {
                              L2: {
                                if (null == rba.field_a) {
                                  break L2;
                                } else {
                                  rba.field_a.b(param1, true, 0);
                                  r.a(0, rba.field_a.d((byte) 86));
                                  break L2;
                                }
                              }
                              stackOut_232_0 = 1;
                              stackIn_233_0 = stackOut_232_0;
                              return stackIn_233_0 != 0;
                            } else {
                              if (13 != var7) {
                                if (14 == var7) {
                                  ira.a(param1, 6, (byte) 82);
                                  stackOut_236_0 = 1;
                                  stackIn_237_0 = stackOut_236_0;
                                  return stackIn_237_0 != 0;
                                } else {
                                  if (var7 != 0) {
                                    if (var7 != 4) {
                                      if (var7 == 8) {
                                        ira.a(param1, 3, (byte) -101);
                                        stackOut_242_0 = 1;
                                        stackIn_243_0 = stackOut_242_0;
                                        return stackIn_243_0 != 0;
                                      } else {
                                        L3: {
                                          if (var7 == 5) {
                                            break L3;
                                          } else {
                                            if (var7 == 6) {
                                              break L3;
                                            } else {
                                              if (var7 == 7) {
                                                tfa.e((byte) -122);
                                                stackOut_246_0 = 1;
                                                stackIn_247_0 = stackOut_246_0;
                                                return stackIn_247_0 != 0;
                                              } else {
                                                if (var7 == 9) {
                                                  hha.a(di.a(94), (byte) -112);
                                                  stackOut_248_0 = 1;
                                                  stackIn_249_0 = stackOut_248_0;
                                                  return stackIn_249_0 != 0;
                                                } else {
                                                  if (var7 == 16) {
                                                    rba.field_a.b(param1, true, 0);
                                                    stackOut_250_0 = 1;
                                                    stackIn_251_0 = stackOut_250_0;
                                                    return stackIn_251_0 != 0;
                                                  } else {
                                                    if (41 != var7) {
                                                      if (var7 == 15) {
                                                        ira.a(param1, -1, (byte) 107);
                                                        stackOut_257_0 = 1;
                                                        stackIn_258_0 = stackOut_257_0;
                                                        return stackIn_258_0 != 0;
                                                      } else {
                                                        if (17 != var7) {
                                                          if (18 != var7) {
                                                            if (var7 != 23) {
                                                              if (var7 == 24) {
                                                                ((pk) (Object) uw.field_g[3]).b((byte) 84, 1);
                                                                stackOut_265_0 = 1;
                                                                stackIn_266_0 = stackOut_265_0;
                                                                return stackIn_266_0 != 0;
                                                              } else {
                                                                if (var7 != 25) {
                                                                  if (var7 != 26) {
                                                                    if (27 != var7) {
                                                                      if (var7 != 28) {
                                                                        if (var7 != 32) {
                                                                          if (var7 == 36) {
                                                                            fsa.a(0, baa.field_e);
                                                                            stackOut_298_0 = 1;
                                                                            stackIn_299_0 = stackOut_298_0;
                                                                            return stackIn_299_0 != 0;
                                                                          } else {
                                                                            if (37 == var7) {
                                                                              fsa.a(0, tia.field_d);
                                                                              stackOut_300_0 = 1;
                                                                              stackIn_301_0 = stackOut_300_0;
                                                                              return stackIn_301_0 != 0;
                                                                            } else {
                                                                              if (var7 == 38) {
                                                                                fsa.a(0, kva.field_s);
                                                                                stackOut_302_0 = 1;
                                                                                stackIn_303_0 = stackOut_302_0;
                                                                                return stackIn_303_0 != 0;
                                                                              } else {
                                                                                if (var7 != 39) {
                                                                                  if (var7 == 40) {
                                                                                    ksa.a(true, vk.field_d);
                                                                                    stackOut_306_0 = 1;
                                                                                    stackIn_307_0 = stackOut_306_0;
                                                                                    return stackIn_307_0 != 0;
                                                                                  } else {
                                                                                    if (var7 == 29) {
                                                                                      L4: {
                                                                                        if (jc.field_M) {
                                                                                          stackOut_311_0 = 0;
                                                                                          stackIn_312_0 = stackOut_311_0;
                                                                                          break L4;
                                                                                        } else {
                                                                                          stackOut_309_0 = 1;
                                                                                          stackIn_312_0 = stackOut_309_0;
                                                                                          break L4;
                                                                                        }
                                                                                      }
                                                                                      jc.field_M = stackIn_312_0 != 0;
                                                                                      stackOut_312_0 = 1;
                                                                                      stackIn_313_0 = stackOut_312_0;
                                                                                      return stackIn_313_0 != 0;
                                                                                    } else {
                                                                                      if (30 != var7) {
                                                                                        if (var7 == 31) {
                                                                                          L5: {
                                                                                            if (ara.field_wb) {
                                                                                              stackOut_323_0 = 0;
                                                                                              stackIn_324_0 = stackOut_323_0;
                                                                                              break L5;
                                                                                            } else {
                                                                                              stackOut_321_0 = 1;
                                                                                              stackIn_324_0 = stackOut_321_0;
                                                                                              break L5;
                                                                                            }
                                                                                          }
                                                                                          ara.field_wb = stackIn_324_0 != 0;
                                                                                          stackOut_324_0 = 1;
                                                                                          stackIn_325_0 = stackOut_324_0;
                                                                                          return stackIn_325_0 != 0;
                                                                                        } else {
                                                                                          L6: {
                                                                                            if (19 != var7) {
                                                                                              if (var7 != 20) {
                                                                                                if (21 == var7) {
                                                                                                  break L6;
                                                                                                } else {
                                                                                                  if (10 == var7) {
                                                                                                    break L6;
                                                                                                  } else {
                                                                                                    if (var7 != 11) {
                                                                                                      stackOut_328_0 = 0;
                                                                                                      stackIn_329_0 = stackOut_328_0;
                                                                                                      break L0;
                                                                                                    } else {
                                                                                                      break L6;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L6;
                                                                                              }
                                                                                            } else {
                                                                                              break L6;
                                                                                            }
                                                                                          }
                                                                                          stackOut_326_0 = 1;
                                                                                          stackIn_327_0 = stackOut_326_0;
                                                                                          return stackIn_327_0 != 0;
                                                                                        }
                                                                                      } else {
                                                                                        L7: {
                                                                                          if (rsa.field_s) {
                                                                                            stackOut_317_0 = 0;
                                                                                            stackIn_318_0 = stackOut_317_0;
                                                                                            break L7;
                                                                                          } else {
                                                                                            stackOut_315_0 = 1;
                                                                                            stackIn_318_0 = stackOut_315_0;
                                                                                            break L7;
                                                                                          }
                                                                                        }
                                                                                        rsa.field_s = stackIn_318_0 != 0;
                                                                                        stackOut_318_0 = 1;
                                                                                        stackIn_319_0 = stackOut_318_0;
                                                                                        return stackIn_319_0 != 0;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  ksa.a(true, ska.field_r);
                                                                                  stackOut_304_0 = 1;
                                                                                  stackIn_305_0 = stackOut_304_0;
                                                                                  return stackIn_305_0 != 0;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          mpa.field_X = true;
                                                                          ira.a(param1, 0, (byte) -107);
                                                                          stackOut_296_0 = 1;
                                                                          stackIn_297_0 = stackOut_296_0;
                                                                          return stackIn_297_0 != 0;
                                                                        }
                                                                      } else {
                                                                        L8: {
                                                                          if (2147483647 != jm.field_n) {
                                                                            break L8;
                                                                          } else {
                                                                            if (((wv) this).field_c == 10) {
                                                                              if (ip.field_b) {
                                                                                jm.field_n = 6;
                                                                                break L8;
                                                                              } else {
                                                                                if (!uma.field_c) {
                                                                                  jm.field_n = 9;
                                                                                  break L8;
                                                                                } else {
                                                                                  jm.field_n = 3;
                                                                                  break L8;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              jm.field_n = ((wv) this).field_c;
                                                                              break L8;
                                                                            }
                                                                          }
                                                                        }
                                                                        ts.a((byte) -63, ura.field_a, true);
                                                                        stackOut_294_0 = 1;
                                                                        stackIn_295_0 = stackOut_294_0;
                                                                        return stackIn_295_0 != 0;
                                                                      }
                                                                    } else {
                                                                      ((qp) (Object) uw.field_g[5]).h(18608, 1);
                                                                      stackOut_271_0 = 1;
                                                                      stackIn_272_0 = stackOut_271_0;
                                                                      return stackIn_272_0 != 0;
                                                                    }
                                                                  } else {
                                                                    ((qp) (Object) uw.field_g[5]).h(18608, 0);
                                                                    stackOut_269_0 = 1;
                                                                    stackIn_270_0 = stackOut_269_0;
                                                                    return stackIn_270_0 != 0;
                                                                  }
                                                                } else {
                                                                  ((pk) (Object) uw.field_g[3]).b((byte) 126, 2);
                                                                  stackOut_267_0 = 1;
                                                                  stackIn_268_0 = stackOut_267_0;
                                                                  return stackIn_268_0 != 0;
                                                                }
                                                              }
                                                            } else {
                                                              ((pk) (Object) uw.field_g[3]).b((byte) 94, 0);
                                                              stackOut_263_0 = 1;
                                                              stackIn_264_0 = stackOut_263_0;
                                                              return stackIn_264_0 != 0;
                                                            }
                                                          } else {
                                                            ira.a(param1, 8, (byte) -109);
                                                            stackOut_261_0 = 1;
                                                            stackIn_262_0 = stackOut_261_0;
                                                            return stackIn_262_0 != 0;
                                                          }
                                                        } else {
                                                          ira.a(param1, 7, (byte) -101);
                                                          stackOut_259_0 = 1;
                                                          stackIn_260_0 = stackOut_259_0;
                                                          return stackIn_260_0 != 0;
                                                        }
                                                      }
                                                    } else {
                                                      L9: {
                                                        var4_int = rba.field_a.m(-1);
                                                        var5 = rba.field_a.h(0, 9);
                                                        var6 = rba.field_a.field_k.field_K;
                                                        bja.a(var4_int, (byte) 101, var6);
                                                        rba.field_a.b(var5, 50, 0);
                                                        rba.field_a.j((byte) -49);
                                                        rba.field_a.c(125);
                                                        if (3 != var6) {
                                                          break L9;
                                                        } else {
                                                          rba.field_a.e((byte) 110);
                                                          break L9;
                                                        }
                                                      }
                                                      stackOut_255_0 = 1;
                                                      stackIn_256_0 = stackOut_255_0;
                                                      return stackIn_256_0 != 0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_244_0 = 1;
                                        stackIn_245_0 = stackOut_244_0;
                                        return stackIn_245_0 != 0;
                                      }
                                    } else {
                                      ira.a(param1, 2, (byte) 85);
                                      stackOut_240_0 = 1;
                                      stackIn_241_0 = stackOut_240_0;
                                      return stackIn_241_0 != 0;
                                    }
                                  } else {
                                    ira.a(param1, 0, (byte) -17);
                                    stackOut_238_0 = 1;
                                    stackIn_239_0 = stackOut_238_0;
                                    return stackIn_239_0 != 0;
                                  }
                                }
                              } else {
                                ira.a(param1, 5, (byte) -112);
                                stackOut_234_0 = 1;
                                stackIn_235_0 = stackOut_234_0;
                                return stackIn_235_0 != 0;
                              }
                            }
                          } else {
                            L10: {
                              if (rba.field_a == null) {
                                break L10;
                              } else {
                                if (null == rba.field_a.field_k) {
                                  break L10;
                                } else {
                                  if (!rba.field_a.field_D) {
                                    break L10;
                                  } else {
                                    if (!rba.field_a.d((byte) 90)) {
                                      ql.field_k.k(65, -2988);
                                      ira.a(param1, -1, (byte) 105);
                                      stackOut_227_0 = 1;
                                      stackIn_228_0 = stackOut_227_0;
                                      return stackIn_228_0 != 0;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_225_0 = 1;
                            stackIn_226_0 = stackOut_225_0;
                            return stackIn_226_0 != 0;
                          }
                        }
                      } else {
                        L11: {
                          if (vpa.a(27)) {
                            ira.a(param1, 11, (byte) 106);
                            jm.field_n = -2;
                            break L11;
                          } else {
                            uv.d(30785);
                            break L11;
                          }
                        }
                        stackOut_205_0 = 1;
                        stackIn_206_0 = stackOut_205_0;
                        return stackIn_206_0 != 0;
                      }
                    } else {
                      stackOut_197_0 = 1;
                      stackIn_198_0 = stackOut_197_0;
                      return stackIn_198_0 != 0;
                    }
                  }
                } else {
                  caa.a((byte) 105);
                  stackOut_193_0 = 1;
                  stackIn_194_0 = stackOut_193_0;
                  return stackIn_194_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "wv.J(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_329_0 != 0;
    }

    private final int f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_21_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((wv) this).b(false, false, 19);
                break L1;
              }
            }
            L2: {
              if (((wv) this).field_c == 0) {
                if (3 == param1) {
                  break L2;
                } else {
                  if (param1 == 21) {
                    break L2;
                  } else {
                    if (param1 != 9) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 14) {
                break L3;
              } else {
                if (27 != param1) {
                  L4: {
                    if (param1 == 1) {
                      break L4;
                    } else {
                      if (4 == param1) {
                        break L4;
                      } else {
                        if (param1 == 8) {
                          break L4;
                        } else {
                          if (param1 == 13) {
                            break L4;
                          } else {
                            if (param1 == 12) {
                              break L4;
                            } else {
                              if (param1 == 30) {
                                break L4;
                              } else {
                                if (31 == param1) {
                                  break L4;
                                } else {
                                  if (29 == param1) {
                                    break L4;
                                  } else {
                                    if (param1 == 7) {
                                      break L4;
                                    } else {
                                      if (param1 == 20) {
                                        break L4;
                                      } else {
                                        if (param1 == 6) {
                                          break L4;
                                        } else {
                                          if (param1 == 5) {
                                            break L4;
                                          } else {
                                            if (param1 == 15) {
                                              break L4;
                                            } else {
                                              if (18 == param1) {
                                                break L4;
                                              } else {
                                                if (param1 == 16) {
                                                  break L4;
                                                } else {
                                                  if (33 == param1) {
                                                    break L4;
                                                  } else {
                                                    if (param1 == 35) {
                                                      break L4;
                                                    } else {
                                                      if (param1 == 41) {
                                                        break L4;
                                                      } else {
                                                        stackOut_79_0 = 0;
                                                        stackIn_80_0 = stackOut_79_0;
                                                        break L0;
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
                      }
                    }
                  }
                  stackOut_77_0 = 2;
                  stackIn_78_0 = stackOut_77_0;
                  return stackIn_78_0;
                } else {
                  break L3;
                }
              }
            }
            stackOut_21_0 = 3;
            stackIn_22_0 = stackOut_21_0;
            return stackIn_22_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.M(" + param0 + 44 + param1 + 41);
        }
        return stackIn_80_0;
    }

    void a(int param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((wv) this).field_k.a(param2, param0 + 29954, param1, this.b(sta.field_B, true, jba.field_j));
            var4_int = param0;
            L1: while (true) {
              if (var4_int >= ((wv) this).field_m.length) {
                pt.field_p = null;
                break L0;
              } else {
                ((wv) this).field_m[var4_int].c(1701110401);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "wv.H(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    void a(byte param0) {
        try {
            if (param0 <= 78) {
                ((wv) this).field_n = 36;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wv.B(" + param0 + 41);
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_l = null;
              if (!param0) {
                break L1;
              } else {
                wv.a(false);
                break L1;
              }
            }
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "wv.S(" + param0 + 41);
        }
    }

    boolean a(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (13 == param0) {
                ((wv) this).c(-6);
                break L1;
              } else {
                if (((wv) this).field_o) {
                  ((wv) this).field_k.c(117);
                  break L1;
                } else {
                  ((wv) this).field_k.a(0, param2 ^ -123);
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == 1) {
                break L2;
              } else {
                ((wv) this).field_n = 76;
                break L2;
              }
            }
            L3: {
              if (!rda.d(20125)) {
                break L3;
              } else {
                if (39 != param0) {
                  break L3;
                } else {
                  bla.a(cq.field_d, (byte) -128);
                  break L3;
                }
              }
            }
            ((wv) this).b(false, false, ((wv) this).field_k.field_h);
            stackOut_22_0 = 1;
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "wv.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    String b(int param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_19_0 = null;
        StringBuilder stackIn_21_0 = null;
        StringBuilder stackIn_23_0 = null;
        StringBuilder stackIn_24_0 = null;
        String stackIn_24_1 = null;
        StringBuilder stackIn_26_0 = null;
        StringBuilder stackIn_28_0 = null;
        StringBuilder stackIn_30_0 = null;
        StringBuilder stackIn_31_0 = null;
        String stackIn_31_1 = null;
        String stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_25_0 = null;
        StringBuilder stackOut_30_0 = null;
        String stackOut_30_1 = null;
        StringBuilder stackOut_26_0 = null;
        StringBuilder stackOut_28_0 = null;
        String stackOut_28_1 = null;
        StringBuilder stackOut_18_0 = null;
        StringBuilder stackOut_23_0 = null;
        String stackOut_23_1 = null;
        StringBuilder stackOut_19_0 = null;
        StringBuilder stackOut_21_0 = null;
        String stackOut_21_1 = null;
        StringBuilder stackOut_11_0 = null;
        StringBuilder stackOut_16_0 = null;
        String stackOut_16_1 = null;
        StringBuilder stackOut_12_0 = null;
        StringBuilder stackOut_14_0 = null;
        String stackOut_14_1 = null;
        String stackOut_32_0 = null;
        Object stackOut_2_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 >= 111) {
              L1: {
                var3 = wba.field_q[param0];
                if (param0 == 29) {
                  L2: {
                    stackOut_25_0 = new StringBuilder().append(var3).append(" ");
                    stackIn_30_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (jc.field_M) {
                      stackOut_30_0 = (StringBuilder) (Object) stackIn_30_0;
                      stackOut_30_1 = ra.field_H.toLowerCase();
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L2;
                    } else {
                      stackOut_26_0 = (StringBuilder) (Object) stackIn_26_0;
                      stackIn_28_0 = stackOut_26_0;
                      stackOut_28_0 = (StringBuilder) (Object) stackIn_28_0;
                      stackOut_28_1 = nv.field_h.toLowerCase();
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_31_1 = stackOut_28_1;
                      break L2;
                    }
                  }
                  var3 = stackIn_31_1;
                  break L1;
                } else {
                  if (param0 == 30) {
                    L3: {
                      stackOut_18_0 = new StringBuilder().append(var3).append(" ");
                      stackIn_23_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (rsa.field_s) {
                        stackOut_23_0 = (StringBuilder) (Object) stackIn_23_0;
                        stackOut_23_1 = ra.field_H.toLowerCase();
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        break L3;
                      } else {
                        stackOut_19_0 = (StringBuilder) (Object) stackIn_19_0;
                        stackIn_21_0 = stackOut_19_0;
                        stackOut_21_0 = (StringBuilder) (Object) stackIn_21_0;
                        stackOut_21_1 = nv.field_h.toLowerCase();
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        break L3;
                      }
                    }
                    var3 = stackIn_24_1;
                    break L1;
                  } else {
                    if (param0 != 31) {
                      break L1;
                    } else {
                      L4: {
                        stackOut_11_0 = new StringBuilder().append(var3).append(" ");
                        stackIn_16_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (!ara.field_wb) {
                          stackOut_16_0 = (StringBuilder) (Object) stackIn_16_0;
                          stackOut_16_1 = nv.field_h.toLowerCase();
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          break L4;
                        } else {
                          stackOut_12_0 = (StringBuilder) (Object) stackIn_12_0;
                          stackIn_14_0 = stackOut_12_0;
                          stackOut_14_0 = (StringBuilder) (Object) stackIn_14_0;
                          stackOut_14_1 = ra.field_H.toLowerCase();
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          break L4;
                        }
                      }
                      var3 = stackIn_17_1;
                      break L1;
                    }
                  }
                }
              }
              stackOut_32_0 = (String) var3;
              stackIn_33_0 = stackOut_32_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "wv.G(" + param0 + 44 + param1 + 41);
        }
        return stackIn_33_0;
    }

    int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 >= 121) {
                break L1;
              } else {
                ((wv) this).b(false, false, 75);
                break L1;
              }
            }
            stackOut_3_0 = ((wv) this).field_m[param0].d(11919);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.P(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -13) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.E(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0) {
        try {
            if (param0 >= -102) {
                field_h = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wv.Q(" + param0 + 41);
        }
    }

    boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (~param0 <= ~((wv) this).field_m.length) {
                    break L1;
                  } else {
                    if (28 == ((wv) this).field_m[param0].field_g) {
                      stackOut_12_0 = vpa.a(83);
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.N(" + param0 + 44 + param1 + 41);
        }
        return stackIn_15_0 != 0;
    }

    int g(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 30) {
                break L1;
              } else {
                ((wv) this).field_g = -17;
                break L1;
              }
            }
            stackOut_3_0 = ((wv) this).field_n - -(((wv) this).field_i * param0) + -((wv) this).e(param0, 126);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "wv.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -6) {
                break L1;
              } else {
                field_j = 79;
                break L1;
              }
            }
            cda.a(0, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "wv.K(" + param0 + 41);
        }
    }

    private final int b(int param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((wv) this).field_k.field_h < 0) {
                break L1;
              } else {
                if (!((wv) this).c(((wv) this).field_k.field_h, 0)) {
                  break L1;
                } else {
                  if (!((wv) this).field_m[((wv) this).field_k.field_h].a(-30323, param2, param0)) {
                    break L1;
                  } else {
                    stackOut_8_0 = ((wv) this).field_k.field_h;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
            var4_int = 0;
            if (param1) {
              L2: while (true) {
                if (~((wv) this).field_m.length >= ~var4_int) {
                  stackOut_23_0 = -1;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                } else {
                  L3: {
                    if (!((wv) this).c(var4_int, 0)) {
                      break L3;
                    } else {
                      if (!((wv) this).field_m[var4_int].a(-30323, param2, param0)) {
                        break L3;
                      } else {
                        stackOut_20_0 = var4_int;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    }
                  }
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              stackOut_11_0 = -7;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "wv.AA(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_24_0;
    }

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        Object var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((wv) this).field_m = new fna[param1.length];
            var3_int = 0;
            if (param0 == 22174) {
              var4 = null;
              var5 = 0;
              var6 = null;
              var7 = 0;
              var8 = null;
              var9 = 0;
              L1: while (true) {
                if (~param1.length >= ~var9) {
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= param1.length) {
                      L3: {
                        if (var6 != null) {
                          oh.a((byte) -91, new fna[3]);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var8 != null) {
                          oh.a((byte) -91, new fna[2]);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (null == var4) {
                          break L5;
                        } else {
                          oh.a((byte) -91, new fna[2]);
                          break L5;
                        }
                      }
                      ((wv) this).field_k = new ko(((wv) this).field_m.length);
                      break L0;
                    } else {
                      ((wv) this).field_m[var9].field_i = ((wv) this).g(var9, param0 ^ 22144);
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  L6: {
                    L7: {
                      ((wv) this).field_m[var9] = new fna(param1[var9], ((wv) this).b(param1[var9], (byte) 125), this.f(0, param1[var9]), this.d(-72, param1[var9]));
                      ((wv) this).field_m[var9].field_b = ((wv) this).a((byte) 119, var9) - -((wv) this).a(var9, (byte) -48) >> 1;
                      ((wv) this).field_m[var9].c(1701110401);
                      if (param1[var9] == 37) {
                        break L7;
                      } else {
                        if (36 == param1[var9]) {
                          break L7;
                        } else {
                          if (param1[var9] == 38) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L8: {
                      if (null != var6) {
                        break L8;
                      } else {
                        var6 = (Object) (Object) new int[3];
                        break L8;
                      }
                    }
                    int incrementValue$3 = var5;
                    var5++;
                    ((int[]) var6)[incrementValue$3] = var9;
                    break L6;
                  }
                  L9: {
                    L10: {
                      if (param1[var9] == 39) {
                        break L10;
                      } else {
                        if (param1[var9] == 40) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (var8 != null) {
                        break L11;
                      } else {
                        var8 = (Object) (Object) new int[2];
                        break L11;
                      }
                    }
                    int incrementValue$4 = var7;
                    var7++;
                    ((int[]) var8)[incrementValue$4] = var9;
                    break L9;
                  }
                  L12: {
                    L13: {
                      if (param1[var9] == 5) {
                        break L13;
                      } else {
                        if (6 == param1[var9]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == var4) {
                        var4 = (Object) (Object) new int[2];
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    int incrementValue$5 = var3_int;
                    var3_int++;
                    ((int[]) var4)[incrementValue$5] = var9;
                    break L12;
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var3;
            stackOut_60_1 = new StringBuilder().append("wv.W(").append(param0).append(44);
            stackIn_63_0 = stackOut_60_0;
            stackIn_63_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L15;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_64_0 = stackOut_61_0;
              stackIn_64_1 = stackOut_61_1;
              stackIn_64_2 = stackOut_61_2;
              break L15;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_h = "The previous occupant of the temple put too much money in the Spinning Disc of Death vending machines, and now they won't stop.";
    }
}
