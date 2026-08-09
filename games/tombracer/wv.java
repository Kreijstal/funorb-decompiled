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
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        fna var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        fna stackIn_12_0;
        boolean stackIn_12_1;
        boolean stackIn_12_2;
        int stackIn_12_3;
        fna stackIn_13_0;
        boolean stackIn_13_1;
        boolean stackIn_13_2;
        int stackIn_13_3;
        int stackIn_13_4;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if ((this.field_k.field_i ^ -1) >= (var3_int ^ -1)) {
                  stackIn_16_0 = param0;
                  break L2;
                } else {
                  var4 = this.field_m[var3_int];
                  stackOut_3_0 = this.c(var3_int, param0 + 28);
                  stackIn_16_0 = stackOut_3_0 ? 1 : 0;
                  stackIn_4_0 = stackOut_3_0;
                  L3: {
                    if (!stackIn_4_0) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_12_0 = (fna) (var4);

                        stackIn_12_1 = this.a(param0 + 15, var3_int);

                        stackIn_12_2 = this.b(var4.field_g, -30487);

                        stackIn_12_3 = 1;

                        if (this.field_k.field_h != var3_int) {
                          stackIn_13_0 = (fna) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = stackIn_12_2;
                          stackIn_13_3 = stackIn_12_3;
                          stackIn_13_4 = 0;
                          break L4;
                        } else {




                          stackIn_13_0 = (fna) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = stackIn_12_2;
                          stackIn_13_3 = stackIn_12_3;
                          stackIn_13_4 = 1;
                          break L4;
                        }
                      }
                      ((fna) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4 != 0);
                      break L3;
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
              L5: {
                if (stackIn_16_0 == -28) {
                  break L5;
                } else {
                  discarded$1 = this.f(-3, -5);
                  break L5;
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
        boolean discarded$0 = false;
        int stackIn_44_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                      dsa.a(-80);
                      discarded$0 = this.a(var4_int, param1, (byte) 119);
                      break L2;
                    }
                  }
                  L3: {
                    var8 = var4_int;
                    if (5 != var8) {
                      if (-7 != (var8 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          var7 = uha.e((byte) 124);
                          if (this.field_k.a(0)) {
                            mqa.a(0, (byte) -118);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (this.field_k.f(-6)) {
                            mqa.a(var7, (byte) 124);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (!this.field_k.a((byte) -128)) {
                            break L6;
                          } else {
                            var8 = -24 + (aaa.a(false) >> -1977773567);
                            var9 = -var8 + jba.field_j;
                            var10 = var9 << -1087021439;
                            if (-1 > (var10 ^ -1)) {
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
                          if (this.field_k.d(96)) {
                            bv.d((byte) -55);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (this.field_k.e(97)) {
                          ila.a(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      L8: {
                        var6 = 0;
                        if (!this.field_k.a(0)) {
                          break L8;
                        } else {
                          if (-1 <= (tk.a(-22636) ^ -1)) {
                            break L8;
                          } else {
                            qfa.a(0, 20815);
                            var6 = 1;
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (!this.field_k.f(75)) {
                          break L9;
                        } else {
                          if ((tk.a(-22636) ^ -1) > (uha.e((byte) 71) ^ -1)) {
                            var6 = 1;
                            qfa.a(uha.e((byte) 126), 20815);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (!this.field_k.a((byte) -128)) {
                          break L10;
                        } else {
                          L11: {
                            var8 = -24 + (aaa.a(false) >> 170903489);
                            var9 = -var8 + jba.field_j;
                            var10 = var9 << 631622689;
                            if ((var10 ^ -1) >= -1) {
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
                            if ((tk.a(-22636) ^ -1) == (var10 ^ -1)) {
                              stackIn_44_0 = 0;
                              break L12;
                            } else {
                              stackIn_44_0 = 1;
                              break L12;
                            }
                          }
                          var6 = stackIn_44_0;
                          qfa.a(var10, 20815);
                          break L10;
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
                        it.a(255, 198);
                        break L3;
                      }
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
        int discarded$1 = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -30487) {
                break L1;
              } else {
                discarded$1 = this.b(-53, false, -31);
                break L1;
              }
            }
            if (param0 != 28) {
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = vpa.a(param1 ^ -30555);
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("wv.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 111) {
                break L1;
              } else {
                this.b(61);
                break L1;
              }
            }
            stackIn_4_0 = this.field_g;
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
        fna stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        fna stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        Object stackIn_27_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        w var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!lca.a(false)) {
              var4_int = 0;
              L1: while (true) {
                if (this.field_k.field_i <= var4_int) {
                  L2: {
                    if (param2 == 15283) {
                      break L2;
                    } else {
                      this.c(34);
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
                          this.field_k.a(this.b(lba.field_p, true, jm.field_m), 71, this.b(sta.field_B, true, jba.field_j));
                          stackIn_27_0 = this;
                          if (((wv) (this)).field_k.field_h == -1) {
                            break L3;
                          } else {
                            this.b(false, true, this.field_k.field_h);
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
                          if (-8 == (this.field_c ^ -1)) {
                            break L5;
                          } else {
                            if (8 != this.field_c) {
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
                              var4 = (w) ((Object) rba.field_a.field_k.a(0, rba.field_a.l(param2 ^ 15326)).field_G);
                              if (var4 == null) {
                                break L4;
                              } else {
                                var4.a(108, true);
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L6: {
                    stackIn_10_0 = this.field_m[var4_int];

                    stackIn_10_1 = param0;

                    if ((this.field_k.field_h ^ -1) != (var4_int ^ -1)) {
                      stackIn_11_0 = (fna) ((Object) stackIn_10_0);
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = 0;
                      break L6;
                    } else {


                      stackIn_11_0 = (fna) ((Object) stackIn_10_0);
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    ((fna) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0, param1, 6);
                    if (6 != this.field_m[var4_int].field_g) {
                      break L7;
                    } else {
                      this.field_m[var4_int].field_i = this.field_m[var4_int + -1].field_i + 33;
                      break L7;
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "wv.A(" + param0 + ',' + param1 + ',' + param2 + ')');
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
            stackIn_4_0 = this.field_f;
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
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 31923) {
                break L1;
              } else {
                this.g(-42, 120);
                break L1;
              }
            }
            stackIn_4_0 = 0;
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
                            stackIn_22_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            stackIn_20_0 = 0;
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
            stackIn_17_0 = 1;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("wv.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(int param0, boolean param1, byte param2) {
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 > 117) {
              if (!this.b(param0, -30487)) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = param0;
                if ((var7 ^ -1) != -23) {
                  if (-2 == (var7 ^ -1)) {
                    ira.a(param1, 9, (byte) -16);
                    stackIn_196_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (2 != var7) {
                      if (3 != var7) {
                        if ((var7 ^ -1) == -13) {
                          L1: {
                            if (this.field_c == 7) {
                              ira.a(param1, 12, (byte) -113);
                              break L1;
                            } else {
                              ira.a(param1, 4, (byte) -11);
                              break L1;
                            }
                          }
                          stackIn_214_0 = 1;
                          decompiledRegionSelector0 = 6;
                          break L0;
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
                              stackIn_233_0 = 1;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              if (13 != var7) {
                                if (14 == var7) {
                                  ira.a(param1, 6, (byte) 82);
                                  stackIn_237_0 = 1;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (var7 != 0) {
                                    if (-5 != (var7 ^ -1)) {
                                      if (-9 == (var7 ^ -1)) {
                                        ira.a(param1, 3, (byte) -101);
                                        stackIn_243_0 = 1;
                                        decompiledRegionSelector0 = 14;
                                        break L0;
                                      } else {
                                        L3: {
                                          if ((var7 ^ -1) == -6) {
                                            break L3;
                                          } else {
                                            if (var7 == 6) {
                                              break L3;
                                            } else {
                                              if (-8 == (var7 ^ -1)) {
                                                tfa.e((byte) -122);
                                                stackIn_247_0 = 1;
                                                decompiledRegionSelector0 = 16;
                                                break L0;
                                              } else {
                                                if (var7 == 9) {
                                                  hha.a(di.a(94), (byte) -112);
                                                  stackIn_249_0 = 1;
                                                  decompiledRegionSelector0 = 17;
                                                  break L0;
                                                } else {
                                                  if ((var7 ^ -1) == -17) {
                                                    rba.field_a.b(param1, true, 0);
                                                    stackIn_251_0 = 1;
                                                    decompiledRegionSelector0 = 18;
                                                    break L0;
                                                  } else {
                                                    if (41 != var7) {
                                                      if (-16 == (var7 ^ -1)) {
                                                        ira.a(param1, -1, (byte) 107);
                                                        stackIn_258_0 = 1;
                                                        decompiledRegionSelector0 = 20;
                                                        break L0;
                                                      } else {
                                                        if (17 != var7) {
                                                          if (18 != var7) {
                                                            if ((var7 ^ -1) != -24) {
                                                              if (-25 == (var7 ^ -1)) {
                                                                ((pk) ((Object) uw.field_g[3])).b((byte) 84, 1);
                                                                stackIn_266_0 = 1;
                                                                decompiledRegionSelector0 = 24;
                                                                break L0;
                                                              } else {
                                                                if ((var7 ^ -1) != -26) {
                                                                  if ((var7 ^ -1) != -27) {
                                                                    if (27 != var7) {
                                                                      if (var7 != 28) {
                                                                        if (var7 != 32) {
                                                                          if (var7 == 36) {
                                                                            fsa.a(0, baa.field_e);
                                                                            stackIn_299_0 = 1;
                                                                            decompiledRegionSelector0 = 30;
                                                                            break L0;
                                                                          } else {
                                                                            if (37 == var7) {
                                                                              fsa.a(0, tia.field_d);
                                                                              stackIn_301_0 = 1;
                                                                              decompiledRegionSelector0 = 31;
                                                                              break L0;
                                                                            } else {
                                                                              if (-39 == (var7 ^ -1)) {
                                                                                fsa.a(0, kva.field_s);
                                                                                stackIn_303_0 = 1;
                                                                                decompiledRegionSelector0 = 32;
                                                                                break L0;
                                                                              } else {
                                                                                if (-40 != (var7 ^ -1)) {
                                                                                  if ((var7 ^ -1) == -41) {
                                                                                    ksa.a(true, vk.field_d);
                                                                                    stackIn_307_0 = 1;
                                                                                    decompiledRegionSelector0 = 34;
                                                                                    break L0;
                                                                                  } else {
                                                                                    if (-30 == (var7 ^ -1)) {
                                                                                      L4: {
                                                                                        if (jc.field_M) {
                                                                                          stackIn_312_0 = 0;
                                                                                          break L4;
                                                                                        } else {
                                                                                          stackIn_312_0 = 1;
                                                                                          break L4;
                                                                                        }
                                                                                      }
                                                                                      jc.field_M = stackIn_312_0 != 0;
                                                                                      stackIn_313_0 = 1;
                                                                                      decompiledRegionSelector0 = 35;
                                                                                      break L0;
                                                                                    } else {
                                                                                      if (30 != var7) {
                                                                                        if ((var7 ^ -1) == -32) {
                                                                                          L5: {
                                                                                            if (ara.field_wb) {
                                                                                              stackIn_324_0 = 0;
                                                                                              break L5;
                                                                                            } else {
                                                                                              stackIn_324_0 = 1;
                                                                                              break L5;
                                                                                            }
                                                                                          }
                                                                                          ara.field_wb = stackIn_324_0 != 0;
                                                                                          stackIn_325_0 = 1;
                                                                                          decompiledRegionSelector0 = 37;
                                                                                          break L0;
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
                                                                                                    if ((var7 ^ -1) != -12) {
                                                                                                      stackIn_329_0 = 0;
                                                                                                      decompiledRegionSelector0 = 39;
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
                                                                                          stackIn_327_0 = 1;
                                                                                          decompiledRegionSelector0 = 38;
                                                                                          break L0;
                                                                                        }
                                                                                      } else {
                                                                                        L7: {
                                                                                          if (rsa.field_s) {
                                                                                            stackIn_318_0 = 0;
                                                                                            break L7;
                                                                                          } else {
                                                                                            stackIn_318_0 = 1;
                                                                                            break L7;
                                                                                          }
                                                                                        }
                                                                                        rsa.field_s = stackIn_318_0 != 0;
                                                                                        stackIn_319_0 = 1;
                                                                                        decompiledRegionSelector0 = 36;
                                                                                        break L0;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  ksa.a(true, ska.field_r);
                                                                                  stackIn_305_0 = 1;
                                                                                  decompiledRegionSelector0 = 33;
                                                                                  break L0;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          mpa.field_X = true;
                                                                          ira.a(param1, 0, (byte) -107);
                                                                          stackIn_297_0 = 1;
                                                                          decompiledRegionSelector0 = 29;
                                                                          break L0;
                                                                        }
                                                                      } else {
                                                                        L8: {
                                                                          if (2147483647 != jm.field_n) {
                                                                            break L8;
                                                                          } else {
                                                                            if ((this.field_c ^ -1) == -11) {
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
                                                                              jm.field_n = this.field_c;
                                                                              break L8;
                                                                            }
                                                                          }
                                                                        }
                                                                        ts.a((byte) -63, ura.field_a, true);
                                                                        stackIn_295_0 = 1;
                                                                        decompiledRegionSelector0 = 28;
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      ((qp) ((Object) uw.field_g[5])).h(18608, 1);
                                                                      stackIn_272_0 = 1;
                                                                      decompiledRegionSelector0 = 27;
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    ((qp) ((Object) uw.field_g[5])).h(18608, 0);
                                                                    stackIn_270_0 = 1;
                                                                    decompiledRegionSelector0 = 26;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  ((pk) ((Object) uw.field_g[3])).b((byte) 126, 2);
                                                                  stackIn_268_0 = 1;
                                                                  decompiledRegionSelector0 = 25;
                                                                  break L0;
                                                                }
                                                              }
                                                            } else {
                                                              ((pk) ((Object) uw.field_g[3])).b((byte) 94, 0);
                                                              stackIn_264_0 = 1;
                                                              decompiledRegionSelector0 = 23;
                                                              break L0;
                                                            }
                                                          } else {
                                                            ira.a(param1, 8, (byte) -109);
                                                            stackIn_262_0 = 1;
                                                            decompiledRegionSelector0 = 22;
                                                            break L0;
                                                          }
                                                        } else {
                                                          ira.a(param1, 7, (byte) -101);
                                                          stackIn_260_0 = 1;
                                                          decompiledRegionSelector0 = 21;
                                                          break L0;
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
                                                      stackIn_256_0 = 1;
                                                      decompiledRegionSelector0 = 19;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackIn_245_0 = 1;
                                        decompiledRegionSelector0 = 15;
                                        break L0;
                                      }
                                    } else {
                                      ira.a(param1, 2, (byte) 85);
                                      stackIn_241_0 = 1;
                                      decompiledRegionSelector0 = 13;
                                      break L0;
                                    }
                                  } else {
                                    ira.a(param1, 0, (byte) -17);
                                    stackIn_239_0 = 1;
                                    decompiledRegionSelector0 = 12;
                                    break L0;
                                  }
                                }
                              } else {
                                ira.a(param1, 5, (byte) -112);
                                stackIn_235_0 = 1;
                                decompiledRegionSelector0 = 10;
                                break L0;
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
                                      stackIn_228_0 = 1;
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            stackIn_226_0 = 1;
                            decompiledRegionSelector0 = 7;
                            break L0;
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
                        stackIn_206_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_198_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  caa.a((byte) 105);
                  stackIn_194_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
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
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                      stackIn_16_0 = 1;
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
                                                        stackIn_80_0 = 0;
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
                  stackIn_78_0 = 2;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            stackIn_22_0 = 3;
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
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_k.a(param2, param0 + 29954, param1, this.b(sta.field_B, true, jba.field_j));
            var4_int = param0;
            L1: while (true) {
              if (var4_int >= this.field_m.length) {
                pt.field_p = null;
                break L0;
              } else {
                this.field_m[var4_int].c(1701110401);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.H(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        int var5 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (13 == param0) {
                this.c(-6);
                break L1;
              } else {
                if (this.field_o) {
                  this.field_k.c(117);
                  break L1;
                } else {
                  this.field_k.a(0, param2 ^ -123);
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == 1) {
                break L2;
              } else {
                this.field_n = 76;
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
            this.b(false, false, this.field_k.field_h);
            stackIn_23_0 = 1;
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
        int var4 = 0;
        String stackIn_3_0 = null;
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_23_0 = null;
        StringBuilder stackIn_24_0 = null;
        String stackIn_24_1 = null;
        StringBuilder stackIn_30_0 = null;
        StringBuilder stackIn_31_0 = null;
        String stackIn_31_1 = null;
        String stackIn_33_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 >= 111) {
              L1: {
                var3 = wba.field_q[param0];
                if (param0 == 29) {
                  L2: {
                    stackIn_30_0 = new StringBuilder().append(var3).append(" ");

                    if (jc.field_M) {
                      stackIn_31_0 = (StringBuilder) ((Object) stackIn_30_0);
                      stackIn_31_1 = ra.field_H.toLowerCase();
                      break L2;
                    } else {

                      stackIn_31_0 = (StringBuilder) ((Object) stackIn_30_0);
                      stackIn_31_1 = nv.field_h.toLowerCase();
                      break L2;
                    }
                  }
                  var3 = stackIn_31_1;
                  break L1;
                } else {
                  if (param0 == 30) {
                    L3: {
                      stackIn_23_0 = new StringBuilder().append(var3).append(" ");

                      if (rsa.field_s) {
                        stackIn_24_0 = (StringBuilder) ((Object) stackIn_23_0);
                        stackIn_24_1 = ra.field_H.toLowerCase();
                        break L3;
                      } else {

                        stackIn_24_0 = (StringBuilder) ((Object) stackIn_23_0);
                        stackIn_24_1 = nv.field_h.toLowerCase();
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
                        stackIn_16_0 = new StringBuilder().append(var3).append(" ");

                        if (!ara.field_wb) {
                          stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
                          stackIn_17_1 = nv.field_h.toLowerCase();
                          break L4;
                        } else {

                          stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
                          stackIn_17_1 = ra.field_H.toLowerCase();
                          break L4;
                        }
                      }
                      var3 = stackIn_17_1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_33_0 = (String) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (String) null;
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
            stackIn_4_0 = this.field_m[param0].d(11919);
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
        try {
          L0: {
            if (param0 == -13) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
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
                      stackIn_13_0 = vpa.a(83);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackIn_15_0 = 1;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 0;
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
            stackIn_4_0 = this.field_n - -(this.field_i * param0) + -this.e(param0, 126);
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        boolean stackOut_14_0;
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
                    stackIn_9_0 = this.field_k.field_h;
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
                  if ((this.field_m.length ^ -1) >= (var4_int ^ -1)) {
                    stackIn_25_0 = -1;
                    break L3;
                  } else {
                    stackOut_14_0 = this.c(var4_int, 0);
                    stackIn_25_0 = stackOut_14_0 ? 1 : 0;
                    stackIn_15_0 = stackOut_14_0;
                    L4: {
                      if (!stackIn_15_0) {
                        break L4;
                      } else {
                        if (!this.field_m[var4_int].a(-30323, param2, param0)) {
                          break L4;
                        } else {
                          stackIn_22_0 = var4_int;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_12_0 = -7;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
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
                  if ((param1.length ^ -1) >= (var9 ^ -1)) {
                    var9 = 0;
                    L3: while (true) {
                      stackIn_43_0 = var9;
                      stackIn_43_1 = param1.length;
                      if (stackIn_43_0 >= stackIn_43_1) {
                        break L2;
                      } else {
                        this.field_m[var9].field_i = this.g(var9, param0 ^ 22144);
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_m[var9] = new fna(param1[var9], this.b(param1[var9], (byte) 125), this.f(0, param1[var9]), this.d(-72, param1[var9]));
                    this.field_m[var9].field_b = this.a((byte) 119, var9) - -this.a(var9, (byte) -48) >> -738345023;
                    this.field_m[var9].c(1701110401);
                    stackIn_43_0 = -38;

                    stackIn_43_1 = param1[var9] ^ -1;

                    L5: {
                      L6: {
                        if (stackIn_43_0 == stackIn_43_1) {
                          break L6;
                        } else {
                          if (36 == param1[var9]) {
                            break L6;
                          } else {
                            if ((param1[var9] ^ -1) == -39) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L7: {
                        if (null != var6) {
                          break L7;
                        } else {
                          var6 = new int[3];
                          break L7;
                        }
                      }
                      incrementValue$0 = var5;
                      var5++;
                      ((int[]) (var6))[incrementValue$0] = var9;
                      break L5;
                    }
                    L8: {
                      L9: {
                        if ((param1[var9] ^ -1) == -40) {
                          break L9;
                        } else {
                          if ((param1[var9] ^ -1) == -41) {
                            break L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L10: {
                        if (var8 != null) {
                          break L10;
                        } else {
                          var8 = new int[2];
                          break L10;
                        }
                      }
                      incrementValue$1 = var7;
                      var7++;
                      ((int[]) (var8))[incrementValue$1] = var9;
                      break L8;
                    }
                    L11: {
                      L12: {
                        if (param1[var9] == 5) {
                          break L12;
                        } else {
                          if (6 == param1[var9]) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        if (null == var4) {
                          var4 = new int[2];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      incrementValue$2 = var3_int;
                      var3_int++;
                      ((int[]) (var4))[incrementValue$2] = var9;
                      break L11;
                    }
                    var9++;
                    continue L1;
                  }
                }
                L14: {
                  if (var6 != null) {
                    oh.a((byte) -91, new fna[]{this.field_m[((int[]) (var6))[0]], this.field_m[((int[]) (var6))[1]], this.field_m[((int[]) (var6))[2]]});
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var8 != null) {
                    oh.a((byte) -91, new fna[]{this.field_m[((int[]) (var8))[0]], this.field_m[((int[]) (var8))[1]]});
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null == var4) {
                    break L16;
                  } else {
                    oh.a((byte) -91, new fna[]{this.field_m[((int[]) (var4))[0]], this.field_m[((int[]) (var4))[1]]});
                    break L16;
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
          L17: {
            var3 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var3);

            stackIn_65_1 = new StringBuilder().append("wv.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L17;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
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
