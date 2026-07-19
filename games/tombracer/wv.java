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
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        fna var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        fna stackIn_8_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_8_2 = false;
        int stackIn_8_3 = 0;
        fna stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_10_2 = false;
        int stackIn_10_3 = 0;
        fna stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_12_2 = false;
        int stackIn_12_3 = 0;
        fna stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        boolean stackIn_13_2 = false;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        fna stackOut_7_0 = null;
        boolean stackOut_7_1 = false;
        boolean stackOut_7_2 = false;
        int stackOut_7_3 = 0;
        fna stackOut_12_0 = null;
        boolean stackOut_12_1 = false;
        boolean stackOut_12_2 = false;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        fna stackOut_8_0 = null;
        boolean stackOut_8_1 = false;
        boolean stackOut_8_2 = false;
        int stackOut_8_3 = 0;
        fna stackOut_10_0 = null;
        boolean stackOut_10_1 = false;
        boolean stackOut_10_2 = false;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        byte stackOut_15_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_k.field_i ^ -1) >= (var3_int ^ -1)) {
                    break L3;
                  } else {
                    var4 = this.field_m[var3_int];
                    stackOut_3_0 = this.c(var3_int, param0 + 28);
                    stackIn_16_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          L5: {
                            stackOut_7_0 = (fna) (var4);
                            stackOut_7_1 = this.a(param0 + 15, var3_int);
                            stackOut_7_2 = this.b(var4.field_g, -30487);
                            stackOut_7_3 = 1;
                            stackIn_12_0 = stackOut_7_0;
                            stackIn_12_1 = stackOut_7_1;
                            stackIn_12_2 = stackOut_7_2;
                            stackIn_12_3 = stackOut_7_3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            stackIn_8_3 = stackOut_7_3;
                            if (this.field_k.field_h != var3_int) {
                              stackOut_12_0 = (fna) ((Object) stackIn_12_0);
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = stackIn_12_2;
                              stackOut_12_3 = stackIn_12_3;
                              stackOut_12_4 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              stackIn_13_3 = stackOut_12_3;
                              stackIn_13_4 = stackOut_12_4;
                              break L5;
                            } else {
                              stackOut_8_0 = (fna) ((Object) stackIn_8_0);
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = stackIn_8_2;
                              stackOut_8_3 = stackIn_8_3;
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              stackIn_10_2 = stackOut_8_2;
                              stackIn_10_3 = stackOut_8_3;
                              stackOut_10_0 = (fna) ((Object) stackIn_10_0);
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = stackIn_10_2;
                              stackOut_10_3 = stackIn_10_3;
                              stackOut_10_4 = 1;
                              stackIn_13_0 = stackOut_10_0;
                              stackIn_13_1 = stackOut_10_1;
                              stackIn_13_2 = stackOut_10_2;
                              stackIn_13_3 = stackOut_10_3;
                              stackIn_13_4 = stackOut_10_4;
                              break L5;
                            }
                          }
                          ((fna) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4 != 0);
                          break L4;
                        }
                      }
                      var3_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = param0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              L6: {
                if (stackIn_16_0 == -28) {
                  break L6;
                } else {
                  discarded$2 = this.f(-3, -5);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "wv.I(" + param0 + ',' + param1 + ')');
        }
    }

    void b(boolean param0, boolean param1, int param2) {
        vb discarded$3 = null;
        boolean discarded$4 = false;
        vb discarded$5 = null;
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
        int decompiledRegionSelector0 = 0;
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
                if (this.field_m.length <= param2) {
                  break L1;
                } else {
                  L2: {
                    var4_int = this.field_m[param2].field_g;
                    var5 = this.field_k.a(param0) ? 1 : 0;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      discarded$3 = dsa.a(-80);
                      discarded$4 = this.a(var4_int, param1, (byte) 119);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          var8 = var4_int;
                          if (5 != var8) {
                            break L6;
                          } else {
                            if (var11 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (-7 != (var8 ^ -1)) {
                          break L3;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L7: {
                        var6 = 0;
                        if (!this.field_k.a(0)) {
                          break L7;
                        } else {
                          if (-1 <= (tk.a(-22636) ^ -1)) {
                            break L7;
                          } else {
                            qfa.a(0, 20815);
                            var6 = 1;
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (!this.field_k.f(75)) {
                          break L8;
                        } else {
                          if ((tk.a(-22636) ^ -1) > (uha.e((byte) 71) ^ -1)) {
                            var6 = 1;
                            qfa.a(uha.e((byte) 126), 20815);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (!this.field_k.a((byte) -128)) {
                          break L9;
                        } else {
                          L10: {
                            L11: {
                              var8 = -24 + (aaa.a(false) >> 170903489);
                              var9 = -var8 + jba.field_j;
                              var10 = var9 << 631622689;
                              if ((var10 ^ -1) >= -1) {
                                break L11;
                              } else {
                                if (uha.e((byte) 68) > var10) {
                                  break L10;
                                } else {
                                  var10 = uha.e((byte) 61);
                                  if (var11 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            break L10;
                          }
                          L12: {
                            if ((tk.a(-22636) ^ -1) == (var10 ^ -1)) {
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
                          break L9;
                        }
                      }
                      L13: {
                        if (!this.field_k.d(96)) {
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
                        if (!this.field_k.e(94)) {
                          break L14;
                        } else {
                          if ((tk.a(-22636) ^ -1) <= (uha.e((byte) 87) ^ -1)) {
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
                          if (!this.field_k.a((byte) -127)) {
                            break L15;
                          } else {
                            if (-1 != (jba.field_j % 5 ^ -1)) {
                              break L3;
                            } else {
                              break L15;
                            }
                          }
                        }
                        discarded$5 = it.a(255, 198);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L16: {
                      var7 = uha.e((byte) 124);
                      if (this.field_k.a(0)) {
                        mqa.a(0, (byte) -118);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (this.field_k.f(-6)) {
                        mqa.a(var7, (byte) 124);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (!this.field_k.a((byte) -128)) {
                        break L18;
                      } else {
                        L19: {
                          var8 = -24 + (aaa.a(false) >> -1977773567);
                          var9 = -var8 + jba.field_j;
                          var10 = var9 << -1087021439;
                          if (-1 > (var10 ^ -1)) {
                            break L19;
                          } else {
                            mqa.a(0, (byte) 121);
                            if (var11 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (var10 >= var7) {
                            break L20;
                          } else {
                            mqa.a(var10, (byte) -48);
                            if (var11 == 0) {
                              break L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                        mqa.a(var7, (byte) 85);
                        break L18;
                      }
                    }
                    L21: {
                      if (this.field_k.d(96)) {
                        bv.d((byte) -55);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    if (this.field_k.e(97)) {
                      ila.a(true);
                      break L3;
                    } else {
                      break L3;
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
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean b(int param0, int param1) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_4_0 = false;
        try {
          L0: {
            L1: {
              if (param1 == -30487) {
                break L1;
              } else {
                discarded$2 = this.b(-53, false, -31);
                break L1;
              }
            }
            if (param0 != 28) {
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = vpa.a(param1 ^ -30555);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0 != 0;
        }
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
        this.field_o = true;
        try {
          L0: {
            L1: {
              this.field_g = param1;
              this.field_i = param4;
              this.field_f = param2;
              if (null != param5) {
                break L1;
              } else {
                param5 = new int[]{};
                break L1;
              }
            }
            this.field_n = param3;
            this.a(22174, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("wv.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    int a(byte param0, int param1) {
        boolean discarded$2 = false;
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
                discarded$2 = this.b(61);
                break L1;
              }
            }
            stackOut_3_0 = this.field_g;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    void a(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        w var4_ref = null;
        int var5 = 0;
        Object stackIn_6_0 = null;
        fna stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        fna stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        fna stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        fna stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        Object stackIn_28_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        fna stackOut_6_0 = null;
        boolean stackOut_6_1 = false;
        fna stackOut_11_0 = null;
        boolean stackOut_11_1 = false;
        int stackOut_11_2 = 0;
        fna stackOut_7_0 = null;
        boolean stackOut_7_1 = false;
        fna stackOut_9_0 = null;
        boolean stackOut_9_1 = false;
        int stackOut_9_2 = 0;
        Object stackOut_26_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!lca.a(false)) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (this.field_k.field_i <= var4_int) {
                        break L4;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_28_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          L5: {
                            stackOut_6_0 = ((wv) (this)).field_m[var4_int];
                            stackOut_6_1 = param0;
                            stackIn_11_0 = stackOut_6_0;
                            stackIn_11_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if ((this.field_k.field_h ^ -1) != (var4_int ^ -1)) {
                              stackOut_11_0 = (fna) ((Object) stackIn_11_0);
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              break L5;
                            } else {
                              stackOut_7_0 = (fna) ((Object) stackIn_7_0);
                              stackOut_7_1 = stackIn_7_1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              stackOut_9_0 = (fna) ((Object) stackIn_9_0);
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = 1;
                              stackIn_12_0 = stackOut_9_0;
                              stackIn_12_1 = stackOut_9_1;
                              stackIn_12_2 = stackOut_9_2;
                              break L5;
                            }
                          }
                          L6: {
                            ((fna) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 != 0, param1, 6);
                            if (6 != this.field_m[var4_int].field_g) {
                              break L6;
                            } else {
                              this.field_m[var4_int].field_i = this.field_m[var4_int + -1].field_i + 33;
                              break L6;
                            }
                          }
                          var4_int++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param2 == 15283) {
                        break L7;
                      } else {
                        this.c(34);
                        break L7;
                      }
                    }
                    if (!param1) {
                      break L2;
                    } else {
                      if (rpa.field_d) {
                        break L2;
                      } else {
                        if (vda.field_q) {
                          break L2;
                        } else {
                          this.field_k.a(this.b(lba.field_p, true, jm.field_m), 71, this.b(sta.field_B, true, jba.field_j));
                          stackOut_26_0 = this;
                          stackIn_28_0 = stackOut_26_0;
                          break L3;
                        }
                      }
                    }
                  }
                  if (((wv) (this)).field_k.field_h == -1) {
                    break L2;
                  } else {
                    this.b(false, true, this.field_k.field_h);
                    break L2;
                  }
                }
                L8: {
                  if (!param1) {
                    break L8;
                  } else {
                    if (!param0) {
                      break L8;
                    } else {
                      L9: {
                        if (-8 == (this.field_c ^ -1)) {
                          break L9;
                        } else {
                          if (8 != this.field_c) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (rba.field_a == null) {
                        break L8;
                      } else {
                        if (null == rba.field_a.field_k) {
                          break L8;
                        } else {
                          if (rba.field_a.field_k.a(param2 ^ 15283, rba.field_a.l(param2 ^ 15336)) == null) {
                            break L8;
                          } else {
                            var4_ref = (w) ((Object) rba.field_a.field_k.a(0, rba.field_a.l(param2 ^ 15326)).field_G);
                            if (var4_ref == null) {
                              break L8;
                            } else {
                              var4_ref.a(108, true);
                              break L8;
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                this.field_m = (fna[]) null;
                break L1;
              }
            }
            stackOut_3_0 = this.field_f;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final boolean b(int param0) {
        int discarded$2 = 0;
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
                discarded$2 = this.g(-42, 120);
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
          throw tba.a((Throwable) ((Object) var2), "wv.L(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
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
                if (-14 == (param1 ^ -1)) {
                  break L1;
                } else {
                  if (14 == param1) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) == -7) {
                      break L1;
                    } else {
                      if (30 == param1) {
                        break L1;
                      } else {
                        if (param1 != 41) {
                          if (param0 <= -64) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.U(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
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
                this.field_i = 44;
                break L1;
              }
            }
            L2: {
              if ((this.field_p ^ -1) <= (param1.field_p ^ -1)) {
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("wv.R(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_263_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_304_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_311_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_317_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_318_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_321_0 = 0;
        int stackOut_324_0 = 0;
        int stackOut_328_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_2_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 > 117) {
              if (!this.b(param0, -30487)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  L2: {
                    var7 = param0;
                    if ((var7 ^ -1) != -23) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (-2 == (var7 ^ -1)) {
                    ira.a(param1, 9, (byte) -16);
                    stackOut_195_0 = 1;
                    stackIn_196_0 = stackOut_195_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L3: {
                      if (2 != var7) {
                        break L3;
                      } else {
                        if (var8 == 0) {
                          stackOut_197_0 = 1;
                          stackIn_198_0 = stackOut_197_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (3 != var7) {
                        break L4;
                      } else {
                        if (var8 == 0) {
                          L5: {
                            L6: {
                              if (vpa.a(27)) {
                                break L6;
                              } else {
                                uv.d(30785);
                                if (var8 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ira.a(param1, 11, (byte) 106);
                            jm.field_n = -2;
                            break L5;
                          }
                          stackOut_205_0 = 1;
                          stackIn_206_0 = stackOut_205_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if ((var7 ^ -1) == -13) {
                      L7: {
                        L8: {
                          if (this.field_c == 7) {
                            break L8;
                          } else {
                            ira.a(param1, 4, (byte) -11);
                            if (var8 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ira.a(param1, 12, (byte) -113);
                        break L7;
                      }
                      stackOut_213_0 = 1;
                      stackIn_214_0 = stackOut_213_0;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      L9: {
                        if (35 != var7) {
                          break L9;
                        } else {
                          if (var8 == 0) {
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
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_225_0 = 1;
                            stackIn_226_0 = stackOut_225_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (var7 == 33) {
                        L11: {
                          if (null == rba.field_a) {
                            break L11;
                          } else {
                            rba.field_a.b(param1, true, 0);
                            r.a(0, rba.field_a.d((byte) 86));
                            break L11;
                          }
                        }
                        stackOut_232_0 = 1;
                        stackIn_233_0 = stackOut_232_0;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        L12: {
                          if (13 != var7) {
                            break L12;
                          } else {
                            if (var8 == 0) {
                              ira.a(param1, 5, (byte) -112);
                              stackOut_234_0 = 1;
                              stackIn_235_0 = stackOut_234_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (14 == var7) {
                          ira.a(param1, 6, (byte) 82);
                          stackOut_236_0 = 1;
                          stackIn_237_0 = stackOut_236_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        } else {
                          L13: {
                            if (var7 != 0) {
                              break L13;
                            } else {
                              if (var8 == 0) {
                                ira.a(param1, 0, (byte) -17);
                                stackOut_238_0 = 1;
                                stackIn_239_0 = stackOut_238_0;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (-5 != (var7 ^ -1)) {
                              break L14;
                            } else {
                              if (var8 == 0) {
                                ira.a(param1, 2, (byte) 85);
                                stackOut_240_0 = 1;
                                stackIn_241_0 = stackOut_240_0;
                                decompiledRegionSelector0 = 13;
                                break L0;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (-9 == (var7 ^ -1)) {
                            ira.a(param1, 3, (byte) -101);
                            stackOut_242_0 = 1;
                            stackIn_243_0 = stackOut_242_0;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          } else {
                            L15: {
                              if ((var7 ^ -1) == -6) {
                                break L15;
                              } else {
                                if (var7 == 6) {
                                  break L15;
                                } else {
                                  if (-8 == (var7 ^ -1)) {
                                    tfa.e((byte) -122);
                                    stackOut_246_0 = 1;
                                    stackIn_247_0 = stackOut_246_0;
                                    decompiledRegionSelector0 = 16;
                                    break L0;
                                  } else {
                                    if (var7 == 9) {
                                      hha.a(di.a(94), (byte) -112);
                                      stackOut_248_0 = 1;
                                      stackIn_249_0 = stackOut_248_0;
                                      decompiledRegionSelector0 = 17;
                                      break L0;
                                    } else {
                                      if ((var7 ^ -1) == -17) {
                                        rba.field_a.b(param1, true, 0);
                                        stackOut_250_0 = 1;
                                        stackIn_251_0 = stackOut_250_0;
                                        decompiledRegionSelector0 = 18;
                                        break L0;
                                      } else {
                                        L16: {
                                          if (41 != var7) {
                                            break L16;
                                          } else {
                                            if (var8 == 0) {
                                              L17: {
                                                var4_int = rba.field_a.m(-1);
                                                var5 = rba.field_a.h(0, 9);
                                                var6 = rba.field_a.field_k.field_K;
                                                bja.a(var4_int, (byte) 101, var6);
                                                rba.field_a.b(var5, 50, 0);
                                                rba.field_a.j((byte) -49);
                                                rba.field_a.c(125);
                                                if (3 != var6) {
                                                  break L17;
                                                } else {
                                                  rba.field_a.e((byte) 110);
                                                  break L17;
                                                }
                                              }
                                              stackOut_255_0 = 1;
                                              stackIn_256_0 = stackOut_255_0;
                                              decompiledRegionSelector0 = 19;
                                              break L0;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        if (-16 == (var7 ^ -1)) {
                                          ira.a(param1, -1, (byte) 107);
                                          stackOut_257_0 = 1;
                                          stackIn_258_0 = stackOut_257_0;
                                          decompiledRegionSelector0 = 20;
                                          break L0;
                                        } else {
                                          L18: {
                                            if (17 != var7) {
                                              break L18;
                                            } else {
                                              if (var8 == 0) {
                                                ira.a(param1, 7, (byte) -101);
                                                stackOut_259_0 = 1;
                                                stackIn_260_0 = stackOut_259_0;
                                                decompiledRegionSelector0 = 21;
                                                break L0;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (18 != var7) {
                                              break L19;
                                            } else {
                                              if (var8 == 0) {
                                                ira.a(param1, 8, (byte) -109);
                                                stackOut_261_0 = 1;
                                                stackIn_262_0 = stackOut_261_0;
                                                decompiledRegionSelector0 = 22;
                                                break L0;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            if ((var7 ^ -1) != -24) {
                                              break L20;
                                            } else {
                                              if (var8 == 0) {
                                                ((pk) ((Object) uw.field_g[3])).b((byte) 94, 0);
                                                stackOut_263_0 = 1;
                                                stackIn_264_0 = stackOut_263_0;
                                                decompiledRegionSelector0 = 23;
                                                break L0;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          if (-25 == (var7 ^ -1)) {
                                            ((pk) ((Object) uw.field_g[3])).b((byte) 84, 1);
                                            stackOut_265_0 = 1;
                                            stackIn_266_0 = stackOut_265_0;
                                            decompiledRegionSelector0 = 24;
                                            break L0;
                                          } else {
                                            L21: {
                                              if ((var7 ^ -1) != -26) {
                                                break L21;
                                              } else {
                                                if (var8 == 0) {
                                                  ((pk) ((Object) uw.field_g[3])).b((byte) 126, 2);
                                                  stackOut_267_0 = 1;
                                                  stackIn_268_0 = stackOut_267_0;
                                                  decompiledRegionSelector0 = 25;
                                                  break L0;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L22: {
                                              if ((var7 ^ -1) != -27) {
                                                break L22;
                                              } else {
                                                if (var8 == 0) {
                                                  ((qp) ((Object) uw.field_g[5])).h(18608, 0);
                                                  stackOut_269_0 = 1;
                                                  stackIn_270_0 = stackOut_269_0;
                                                  decompiledRegionSelector0 = 26;
                                                  break L0;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            L23: {
                                              if (27 != var7) {
                                                break L23;
                                              } else {
                                                if (var8 == 0) {
                                                  ((qp) ((Object) uw.field_g[5])).h(18608, 1);
                                                  stackOut_271_0 = 1;
                                                  stackIn_272_0 = stackOut_271_0;
                                                  decompiledRegionSelector0 = 27;
                                                  break L0;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            L24: {
                                              if (var7 != 28) {
                                                break L24;
                                              } else {
                                                if (var8 == 0) {
                                                  L25: {
                                                    if (2147483647 != jm.field_n) {
                                                      break L25;
                                                    } else {
                                                      L26: {
                                                        if ((this.field_c ^ -1) == -11) {
                                                          break L26;
                                                        } else {
                                                          jm.field_n = this.field_c;
                                                          if (var8 == 0) {
                                                            break L25;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      L27: {
                                                        if (ip.field_b) {
                                                          break L27;
                                                        } else {
                                                          L28: {
                                                            if (!uma.field_c) {
                                                              break L28;
                                                            } else {
                                                              jm.field_n = 3;
                                                              if (var8 == 0) {
                                                                break L25;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          jm.field_n = 9;
                                                          if (var8 == 0) {
                                                            break L25;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      jm.field_n = 6;
                                                      break L25;
                                                    }
                                                  }
                                                  ts.a((byte) -63, ura.field_a, true);
                                                  stackOut_294_0 = 1;
                                                  stackIn_295_0 = stackOut_294_0;
                                                  decompiledRegionSelector0 = 28;
                                                  break L0;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                            L29: {
                                              if (var7 != 32) {
                                                break L29;
                                              } else {
                                                if (var8 == 0) {
                                                  mpa.field_X = true;
                                                  ira.a(param1, 0, (byte) -107);
                                                  stackOut_296_0 = 1;
                                                  stackIn_297_0 = stackOut_296_0;
                                                  decompiledRegionSelector0 = 29;
                                                  break L0;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            if (var7 == 36) {
                                              fsa.a(0, baa.field_e);
                                              stackOut_298_0 = 1;
                                              stackIn_299_0 = stackOut_298_0;
                                              decompiledRegionSelector0 = 30;
                                              break L0;
                                            } else {
                                              if (37 == var7) {
                                                fsa.a(0, tia.field_d);
                                                stackOut_300_0 = 1;
                                                stackIn_301_0 = stackOut_300_0;
                                                decompiledRegionSelector0 = 31;
                                                break L0;
                                              } else {
                                                if (-39 == (var7 ^ -1)) {
                                                  fsa.a(0, kva.field_s);
                                                  stackOut_302_0 = 1;
                                                  stackIn_303_0 = stackOut_302_0;
                                                  decompiledRegionSelector0 = 32;
                                                  break L0;
                                                } else {
                                                  L30: {
                                                    if (-40 != (var7 ^ -1)) {
                                                      break L30;
                                                    } else {
                                                      if (var8 == 0) {
                                                        ksa.a(true, ska.field_r);
                                                        stackOut_304_0 = 1;
                                                        stackIn_305_0 = stackOut_304_0;
                                                        decompiledRegionSelector0 = 33;
                                                        break L0;
                                                      } else {
                                                        break L30;
                                                      }
                                                    }
                                                  }
                                                  if ((var7 ^ -1) == -41) {
                                                    ksa.a(true, vk.field_d);
                                                    stackOut_306_0 = 1;
                                                    stackIn_307_0 = stackOut_306_0;
                                                    decompiledRegionSelector0 = 34;
                                                    break L0;
                                                  } else {
                                                    if (-30 == (var7 ^ -1)) {
                                                      L31: {
                                                        if (jc.field_M) {
                                                          stackOut_311_0 = 0;
                                                          stackIn_312_0 = stackOut_311_0;
                                                          break L31;
                                                        } else {
                                                          stackOut_309_0 = 1;
                                                          stackIn_312_0 = stackOut_309_0;
                                                          break L31;
                                                        }
                                                      }
                                                      jc.field_M = stackIn_312_0 != 0;
                                                      stackOut_312_0 = 1;
                                                      stackIn_313_0 = stackOut_312_0;
                                                      decompiledRegionSelector0 = 35;
                                                      break L0;
                                                    } else {
                                                      L32: {
                                                        if (30 != var7) {
                                                          break L32;
                                                        } else {
                                                          if (var8 == 0) {
                                                            L33: {
                                                              if (rsa.field_s) {
                                                                stackOut_317_0 = 0;
                                                                stackIn_318_0 = stackOut_317_0;
                                                                break L33;
                                                              } else {
                                                                stackOut_315_0 = 1;
                                                                stackIn_318_0 = stackOut_315_0;
                                                                break L33;
                                                              }
                                                            }
                                                            rsa.field_s = stackIn_318_0 != 0;
                                                            stackOut_318_0 = 1;
                                                            stackIn_319_0 = stackOut_318_0;
                                                            decompiledRegionSelector0 = 36;
                                                            break L0;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                      if ((var7 ^ -1) == -32) {
                                                        L34: {
                                                          if (ara.field_wb) {
                                                            stackOut_323_0 = 0;
                                                            stackIn_324_0 = stackOut_323_0;
                                                            break L34;
                                                          } else {
                                                            stackOut_321_0 = 1;
                                                            stackIn_324_0 = stackOut_321_0;
                                                            break L34;
                                                          }
                                                        }
                                                        ara.field_wb = stackIn_324_0 != 0;
                                                        stackOut_324_0 = 1;
                                                        stackIn_325_0 = stackOut_324_0;
                                                        decompiledRegionSelector0 = 37;
                                                        break L0;
                                                      } else {
                                                        L35: {
                                                          L36: {
                                                            if (19 != var7) {
                                                              break L36;
                                                            } else {
                                                              if (var8 == 0) {
                                                                break L35;
                                                              } else {
                                                                break L36;
                                                              }
                                                            }
                                                          }
                                                          L37: {
                                                            if (var7 != 20) {
                                                              break L37;
                                                            } else {
                                                              if (var8 == 0) {
                                                                break L35;
                                                              } else {
                                                                break L37;
                                                              }
                                                            }
                                                          }
                                                          if (21 == var7) {
                                                            break L35;
                                                          } else {
                                                            if (10 == var7) {
                                                              break L35;
                                                            } else {
                                                              if ((var7 ^ -1) != -12) {
                                                                stackOut_328_0 = 0;
                                                                stackIn_329_0 = stackOut_328_0;
                                                                decompiledRegionSelector0 = 39;
                                                                break L0;
                                                              } else {
                                                                if (var8 == 0) {
                                                                  break L35;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        stackOut_326_0 = 1;
                                                        stackIn_327_0 = stackOut_326_0;
                                                        decompiledRegionSelector0 = 38;
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
                            stackOut_244_0 = 1;
                            stackIn_245_0 = stackOut_244_0;
                            decompiledRegionSelector0 = 15;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                caa.a((byte) 105);
                stackOut_193_0 = 1;
                stackIn_194_0 = stackOut_193_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_194_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_196_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_198_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_206_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_214_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_226_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_228_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_233_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_235_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_237_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_239_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_241_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_243_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_245_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_247_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_249_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_251_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_256_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_258_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_260_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_262_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_264_0 != 0;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return stackIn_266_0 != 0;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return stackIn_268_0 != 0;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return stackIn_270_0 != 0;
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return stackIn_272_0 != 0;
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return stackIn_295_0 != 0;
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return stackIn_297_0 != 0;
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return stackIn_299_0 != 0;
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return stackIn_301_0 != 0;
                                                                      } else {
                                                                        if (decompiledRegionSelector0 == 32) {
                                                                          return stackIn_303_0 != 0;
                                                                        } else {
                                                                          if (decompiledRegionSelector0 == 33) {
                                                                            return stackIn_305_0 != 0;
                                                                          } else {
                                                                            if (decompiledRegionSelector0 == 34) {
                                                                              return stackIn_307_0 != 0;
                                                                            } else {
                                                                              if (decompiledRegionSelector0 == 35) {
                                                                                return stackIn_313_0 != 0;
                                                                              } else {
                                                                                if (decompiledRegionSelector0 == 36) {
                                                                                  return stackIn_319_0 != 0;
                                                                                } else {
                                                                                  if (decompiledRegionSelector0 == 37) {
                                                                                    return stackIn_325_0 != 0;
                                                                                  } else {
                                                                                    if (decompiledRegionSelector0 == 38) {
                                                                                      return stackIn_327_0 != 0;
                                                                                    } else {
                                                                                      return stackIn_329_0 != 0;
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
        }
    }

    private final int f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int decompiledRegionSelector0 = 0;
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
                this.b(false, false, 19);
                break L1;
              }
            }
            L2: {
              if ((this.field_c ^ -1) == -1) {
                if (3 == param1) {
                  break L2;
                } else {
                  if (param1 == 21) {
                    break L2;
                  } else {
                    if (-10 != (param1 ^ -1)) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
                    if (-2 == (param1 ^ -1)) {
                      break L4;
                    } else {
                      if (4 == param1) {
                        break L4;
                      } else {
                        if (-9 == (param1 ^ -1)) {
                          break L4;
                        } else {
                          if (param1 == 13) {
                            break L4;
                          } else {
                            if (-13 == (param1 ^ -1)) {
                              break L4;
                            } else {
                              if (-31 == (param1 ^ -1)) {
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
                                      if ((param1 ^ -1) == -21) {
                                        break L4;
                                      } else {
                                        if (-7 == (param1 ^ -1)) {
                                          break L4;
                                        } else {
                                          if ((param1 ^ -1) == -6) {
                                            break L4;
                                          } else {
                                            if (-16 == (param1 ^ -1)) {
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
                                                    if (-36 == (param1 ^ -1)) {
                                                      break L4;
                                                    } else {
                                                      if ((param1 ^ -1) == -42) {
                                                        break L4;
                                                      } else {
                                                        stackOut_79_0 = 0;
                                                        stackIn_80_0 = stackOut_79_0;
                                                        decompiledRegionSelector0 = 3;
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
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            stackOut_21_0 = 3;
            stackIn_22_0 = stackOut_21_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.M(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_78_0;
            } else {
              return stackIn_80_0;
            }
          }
        }
    }

    void a(int param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_k.a(param2, param0 + 29954, param1, this.b(sta.field_B, true, jba.field_j));
            var4_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= this.field_m.length) {
                    break L3;
                  } else {
                    this.field_m[var4_int].c(1701110401);
                    var4_int++;
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
                pt.field_p = null;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "wv.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void a(byte param0) {
        try {
            if (param0 <= 78) {
                this.field_n = 36;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wv.B(" + param0 + ')');
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
          throw tba.a((Throwable) ((Object) var1), "wv.S(" + param0 + ')');
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
              L2: {
                if (13 == param0) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_o) {
                      break L3;
                    } else {
                      this.field_k.a(0, param2 ^ -123);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_k.c(117);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.c(-6);
              break L1;
            }
            L4: {
              if (param2 == 1) {
                break L4;
              } else {
                this.field_n = 76;
                break L4;
              }
            }
            L5: {
              if (!rda.d(20125)) {
                break L5;
              } else {
                if (39 != param0) {
                  break L5;
                } else {
                  bla.a(cq.field_d, (byte) -128);
                  break L5;
                }
              }
            }
            this.b(false, false, this.field_k.field_h);
            stackOut_22_0 = 1;
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    String b(int param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_3_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_11_0 = null;
        StringBuilder stackOut_16_0 = null;
        String stackOut_16_1 = null;
        StringBuilder stackOut_12_0 = null;
        StringBuilder stackOut_14_0 = null;
        String stackOut_14_1 = null;
        StringBuilder stackOut_18_0 = null;
        StringBuilder stackOut_23_0 = null;
        String stackOut_23_1 = null;
        StringBuilder stackOut_19_0 = null;
        StringBuilder stackOut_21_0 = null;
        String stackOut_21_1 = null;
        StringBuilder stackOut_25_0 = null;
        StringBuilder stackOut_30_0 = null;
        String stackOut_30_1 = null;
        StringBuilder stackOut_26_0 = null;
        StringBuilder stackOut_28_0 = null;
        String stackOut_28_1 = null;
        String stackOut_32_0 = null;
        String stackOut_2_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 >= 111) {
              L1: {
                L2: {
                  var3 = wba.field_q[param0];
                  if (param0 == 29) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == 30) {
                        break L3;
                      } else {
                        if (param0 != 31) {
                          break L1;
                        } else {
                          L4: {
                            stackOut_11_0 = new StringBuilder().append(var3).append(" ");
                            stackIn_16_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (!ara.field_wb) {
                              stackOut_16_0 = (StringBuilder) ((Object) stackIn_16_0);
                              stackOut_16_1 = nv.field_h.toLowerCase();
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L4;
                            } else {
                              stackOut_12_0 = (StringBuilder) ((Object) stackIn_12_0);
                              stackIn_14_0 = stackOut_12_0;
                              stackOut_14_0 = (StringBuilder) ((Object) stackIn_14_0);
                              stackOut_14_1 = ra.field_H.toLowerCase();
                              stackIn_17_0 = stackOut_14_0;
                              stackIn_17_1 = stackOut_14_1;
                              break L4;
                            }
                          }
                          var3 = stackIn_17_1;
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      stackOut_18_0 = new StringBuilder().append(var3).append(" ");
                      stackIn_23_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (rsa.field_s) {
                        stackOut_23_0 = (StringBuilder) ((Object) stackIn_23_0);
                        stackOut_23_1 = ra.field_H.toLowerCase();
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        break L5;
                      } else {
                        stackOut_19_0 = (StringBuilder) ((Object) stackIn_19_0);
                        stackIn_21_0 = stackOut_19_0;
                        stackOut_21_0 = (StringBuilder) ((Object) stackIn_21_0);
                        stackOut_21_1 = nv.field_h.toLowerCase();
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        break L5;
                      }
                    }
                    var3 = stackIn_24_1;
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L6: {
                  stackOut_25_0 = new StringBuilder().append(var3).append(" ");
                  stackIn_30_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (jc.field_M) {
                    stackOut_30_0 = (StringBuilder) ((Object) stackIn_30_0);
                    stackOut_30_1 = ra.field_H.toLowerCase();
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L6;
                  } else {
                    stackOut_26_0 = (StringBuilder) ((Object) stackIn_26_0);
                    stackIn_28_0 = stackOut_26_0;
                    stackOut_28_0 = (StringBuilder) ((Object) stackIn_28_0);
                    stackOut_28_1 = nv.field_h.toLowerCase();
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_31_1 = stackOut_28_1;
                    break L6;
                  }
                }
                var3 = stackIn_31_1;
                break L1;
              }
              stackOut_32_0 = (String) (var3);
              stackIn_33_0 = stackOut_32_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "wv.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_33_0;
        }
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
                this.b(false, false, 75);
                break L1;
              }
            }
            stackOut_3_0 = this.field_m[param0].d(11919);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -13) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0) {
        try {
            if (param0 >= -102) {
                field_h = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wv.Q(" + param0 + ')');
        }
    }

    boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                if ((param0 ^ -1) > -1) {
                  break L1;
                } else {
                  if ((param0 ^ -1) <= (this.field_m.length ^ -1)) {
                    break L1;
                  } else {
                    if (28 == this.field_m[param0].field_g) {
                      stackOut_12_0 = vpa.a(83);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
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
                this.field_g = -17;
                break L1;
              }
            }
            stackOut_3_0 = this.field_n - -(this.field_i * param0) + -this.e(param0, 126);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.D(" + param0 + ',' + param1 + ')');
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
          throw tba.a((Throwable) ((Object) var2), "wv.K(" + param0 + ')');
        }
    }

    private final int b(int param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_11_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_k.field_h < 0) {
                break L1;
              } else {
                if (!this.c(this.field_k.field_h, 0)) {
                  break L1;
                } else {
                  if (!this.field_m[this.field_k.field_h].a(-30323, param2, param0)) {
                    break L1;
                  } else {
                    stackOut_8_0 = this.field_k.field_h;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var4_int = 0;
            if (param1) {
              L2: while (true) {
                L3: {
                  L4: {
                    if ((this.field_m.length ^ -1) >= (var4_int ^ -1)) {
                      break L4;
                    } else {
                      stackOut_14_0 = this.c(var4_int, 0);
                      stackIn_25_0 = stackOut_14_0 ? 1 : 0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (!stackIn_15_0) {
                            break L5;
                          } else {
                            if (!this.field_m[var4_int].a(-30323, param2, param0)) {
                              break L5;
                            } else {
                              stackOut_21_0 = var4_int;
                              stackIn_22_0 = stackOut_21_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        var4_int++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_24_0 = -1;
                  stackIn_25_0 = stackOut_24_0;
                  break L3;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_11_0 = -7;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    final void a(int param0, int[] param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        Object var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_m = new fna[param1.length];
            var3_int = 0;
            if (param0 == 22174) {
              var4 = null;
              var5 = 0;
              var6 = null;
              var7 = 0;
              var8 = null;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          if ((param1.length ^ -1) >= (var9 ^ -1)) {
                            break L6;
                          } else {
                            this.field_m[var9] = new fna(param1[var9], this.b(param1[var9], (byte) 125), this.f(0, param1[var9]), this.d(-72, param1[var9]));
                            this.field_m[var9].field_b = this.a((byte) 119, var9) - -this.a(var9, (byte) -48) >> -738345023;
                            this.field_m[var9].c(1701110401);
                            stackOut_5_0 = -38;
                            stackOut_5_1 = param1[var9] ^ -1;
                            stackIn_43_0 = stackOut_5_0;
                            stackIn_43_1 = stackOut_5_1;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            if (var10 != 0) {
                              L7: while (true) {
                                if (stackIn_43_0 >= stackIn_43_1) {
                                  break L4;
                                } else {
                                  this.field_m[var9].field_i = this.g(var9, param0 ^ 22144);
                                  var9++;
                                  if (var10 != 0) {
                                    break L3;
                                  } else {
                                    if (var10 == 0) {
                                      stackOut_42_0 = var9;
                                      stackOut_42_1 = param1.length;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackIn_43_1 = stackOut_42_1;
                                      continue L7;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              L8: {
                                L9: {
                                  if (stackIn_6_0 == stackIn_6_1) {
                                    break L9;
                                  } else {
                                    if (36 == param1[var9]) {
                                      break L9;
                                    } else {
                                      if ((param1[var9] ^ -1) == -39) {
                                        break L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (null != var6) {
                                    break L10;
                                  } else {
                                    var6 = new int[3];
                                    break L10;
                                  }
                                }
                                incrementValue$3 = var5;
                                var5++;
                                ((int[]) (var6))[incrementValue$3] = var9;
                                break L8;
                              }
                              L11: {
                                L12: {
                                  if ((param1[var9] ^ -1) == -40) {
                                    break L12;
                                  } else {
                                    if ((param1[var9] ^ -1) == -41) {
                                      break L12;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L13: {
                                  if (var8 != null) {
                                    break L13;
                                  } else {
                                    var8 = new int[2];
                                    break L13;
                                  }
                                }
                                incrementValue$4 = var7;
                                var7++;
                                ((int[]) (var8))[incrementValue$4] = var9;
                                break L11;
                              }
                              L14: {
                                L15: {
                                  if (param1[var9] == 5) {
                                    break L15;
                                  } else {
                                    if (6 == param1[var9]) {
                                      break L15;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L16: {
                                  if (null == var4) {
                                    var4 = new int[2];
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                incrementValue$5 = var3_int;
                                var3_int++;
                                ((int[]) (var4))[incrementValue$5] = var9;
                                break L14;
                              }
                              var9++;
                              if (var10 == 0) {
                                continue L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var9 = 0;
                        L17: while (true) {
                          stackOut_42_0 = var9;
                          stackOut_42_1 = param1.length;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          if (stackIn_43_0 >= stackIn_43_1) {
                            break L4;
                          } else {
                            this.field_m[var9].field_i = this.g(var9, param0 ^ 22144);
                            var9++;
                            if (var10 != 0) {
                              break L3;
                            } else {
                              if (var10 == 0) {
                                continue L17;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      break L4;
                    }
                    if (var6 != null) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  oh.a((byte) -91, new fna[]{this.field_m[((int[]) (var6))[0]], this.field_m[((int[]) (var6))[1]], this.field_m[((int[]) (var6))[2]]});
                  break L2;
                }
                L18: {
                  if (var8 != null) {
                    oh.a((byte) -91, new fna[]{this.field_m[((int[]) (var8))[0]], this.field_m[((int[]) (var8))[1]]});
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (null == var4) {
                    break L19;
                  } else {
                    oh.a((byte) -91, new fna[]{this.field_m[((int[]) (var4))[0]], this.field_m[((int[]) (var4))[1]]});
                    break L19;
                  }
                }
                this.field_k = new ko(this.field_m.length);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var3);
            stackOut_63_1 = new StringBuilder().append("wv.W(").append(param0).append(',');
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L20;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_j = 0;
        field_h = "The previous occupant of the temple put too much money in the Spinning Disc of Death vending machines, and now they won't stop.";
    }
}
