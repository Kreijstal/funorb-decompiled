/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jg extends bg {
    wg field_n;
    int field_g;
    int field_o;
    int field_p;
    int field_h;
    short field_k;
    static int[][] field_j;
    int field_l;
    int field_f;
    int field_s;
    static cr field_q;
    static String field_m;
    boolean field_i;
    int field_r;

    void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 < -121) {
                break L1;
              } else {
                jg.a(-60L, -116);
                break L1;
              }
            }
            this.a((byte) -101, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "jg.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (0 != param1) {
              L1: {
                L2: {
                  this.field_p = param1;
                  this.field_k = (short) 0;
                  stackIn_23_0 = this;

                  if (this.field_p == 11) {
                    break L2;
                  } else {
                    stackIn_23_0 = this;

                    if (this.field_p == 17) {
                      break L2;
                    } else {
                      stackIn_8_0 = this;
                      stackIn_23_0 = this;

                      if (20 == this.field_p) {
                        break L2;
                      } else {
                        stackIn_11_0 = this;
                        stackIn_23_0 = this;

                        if (-13 == (this.field_p ^ -1)) {
                          break L2;
                        } else {
                          stackIn_14_0 = this;
                          stackIn_23_0 = this;

                          if ((this.field_p ^ -1) == -19) {
                            break L2;
                          } else {
                            stackIn_17_0 = this;
                            stackIn_23_0 = this;

                            if (-20 == (this.field_p ^ -1)) {
                              break L2;
                            } else {
                              stackIn_20_0 = this;
                              stackIn_25_0 = this;

                              if (9 != this.field_p) {
                                stackIn_26_0 = this;
                                stackIn_26_1 = 0;
                                break L1;
                              } else {
                                stackIn_23_0 = this;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_26_0 = this;
                stackIn_26_1 = 1;
                break L1;
              }
              L3: {
                ((jg) (this)).field_i = stackIn_26_1 != 0;
                this.field_f = -1;
                if (!tj.field_c) {
                  L4: {
                    if ((this.field_p ^ -1) == -8) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (this.field_p == 26) {
                            break L6;
                          } else {
                            if (25 != this.field_p) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.field_n.a(wi.field_d[4], (byte) 100);
                        this.field_f = 4;
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      if (-29 != (this.field_p ^ -1)) {
                        break L3;
                      } else {
                        this.field_n.a(wi.field_d[5], (byte) 103);
                        this.field_f = 5;
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.field_n.a(wi.field_d[3], (byte) 126);
                  this.field_f = 3;
                  break L3;
                } else {
                  break L3;
                }
              }
              L7: {
                if (param0 < -26) {
                  break L7;
                } else {
                  this.a(true, (int[]) null, false, false);
                  break L7;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException("Can't pass 0 in");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "jg.U(" + param0 + ',' + param1 + ')');
        }
    }

    void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(-30, param1, param2, (byte[]) null, param3);
              if (!param0) {
                break L1;
              } else {
                this.c(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("jg.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_r = -76;
                break L1;
              }
            }
            stackIn_4_0 = this.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.N(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -97) {
                break L1;
              } else {
                this.a((lg) null, -11, -63, (byte) 4);
                break L1;
              }
            }
            var5_int = 64 + this.field_l - param2;
            var6 = 64 + (this.field_g - param0);
            var7 = this.field_s - -23 - param3;
            stackIn_4_0 = var7 * var7 + var5_int * var5_int - -(var6 * var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "jg.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        int stackIn_19_0 = 0;
        fc[][] stackIn_44_0 = null;
        fc[][] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        fc[][] stackIn_49_0 = null;
        fc[][] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_99_1 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fc var8 = null;
        Object var9 = null;
        byte[] var10 = null;
        fc var10_ref = null;
        byte[] var11 = null;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -30) {
                break L1;
              } else {
                this.c(34);
                break L1;
              }
            }
            var6_int = this.field_p;
            if (wi.field_j.length <= var6_int) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_p != 22) {
                  break L2;
                } else {
                  if (this.field_k % 20 < 10) {
                    var6_int = 8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (!param4) {
                  stackIn_19_0 = pl.field_n;
                  break L3;
                } else {
                  stackIn_19_0 = pn.field_L;
                  break L3;
                }
              }
              var7 = stackIn_19_0;
              var8 = wi.field_j[var6_int][var7];
              if (null != var8) {
                L4: {
                  vq.field_q[0] = this.field_l + 64;
                  vq.field_q[1] = this.field_s;
                  vq.field_q[2] = this.field_g - -64;
                  if ((this.field_p ^ -1) != -24) {
                    break L4;
                  } else {
                    if ((15 & this.field_k ^ -1) != -1) {
                      break L4;
                    } else {
                      vq.field_q[0] = vq.field_q[0] + (-4 + be.a(9, (byte) 83));
                      vq.field_q[1] = vq.field_q[1] + (-4 + be.a(9, (byte) 83));
                      vq.field_q[2] = vq.field_q[2] + (-4 + be.a(9, (byte) 83));
                      break L4;
                    }
                  }
                }
                L5: {
                  var9 = null;
                  if (!this.field_i) {
                    if ((this.field_p ^ -1) == -11) {
                      L6: {
                        stackIn_49_0 = wi.field_j;

                        if (param2) {
                          stackIn_50_0 = (fc[][]) ((Object) stackIn_49_0);
                          stackIn_50_1 = 27;
                          break L6;
                        } else {
                          stackIn_50_0 = (fc[][]) ((Object) stackIn_49_0);
                          stackIn_50_1 = 3;
                          break L6;
                        }
                      }
                      var9 = stackIn_50_0[stackIn_50_1][var7];
                      break L5;
                    } else {
                      if (5 == this.field_p) {
                        L7: {
                          stackIn_44_0 = wi.field_j;

                          if (!param2) {
                            stackIn_45_0 = (fc[][]) ((Object) stackIn_44_0);
                            stackIn_45_1 = 4;
                            break L7;
                          } else {
                            stackIn_45_0 = (fc[][]) ((Object) stackIn_44_0);
                            stackIn_45_1 = 27;
                            break L7;
                          }
                        }
                        var9 = stackIn_45_0[stackIn_45_1][var7];
                        break L5;
                      } else {
                        if (-31 != (this.field_p ^ -1)) {
                          if (-30 == (this.field_p ^ -1)) {
                            var9 = wi.field_j[4][var7];
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          var9 = wi.field_j[3][var7];
                          break L5;
                        }
                      }
                    }
                  } else {
                    var9 = wi.field_j[27][var7];
                    break L5;
                  }
                }
                L8: {
                  if (null == var9) {
                    break L8;
                  } else {
                    if (param1[1] < this.field_s) {
                      var10 = ((fc) (var9)).field_R;
                      ((fc) (var9)).field_R = param3;
                      ((fc) (var9)).a(param1, vq.field_q);
                      ((fc) (var9)).field_R = var10;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  L10: {
                    if (var6_int == 12) {
                      break L10;
                    } else {
                      if (var6_int == 18) {
                        break L10;
                      } else {
                        if (19 == var6_int) {
                          break L10;
                        } else {
                          if (-21 == (var6_int ^ -1)) {
                            break L10;
                          } else {
                            if (var6_int == 9) {
                              break L10;
                            } else {
                              if ((var6_int ^ -1) == -12) {
                                break L10;
                              } else {
                                if (-31 == (var6_int ^ -1)) {
                                  break L10;
                                } else {
                                  if (-30 == (var6_int ^ -1)) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (this.field_f < 0) {
                                        break L11;
                                      } else {
                                        var10_ref = (fc) ((Object) this.field_n.a(true, true, false, var8));
                                        var11 = var10_ref.field_R;
                                        var10_ref.field_R = param3;
                                        var10_ref.a(param1, vq.field_q);
                                        var10_ref.field_R = var11;
                                        if (var12 == 0) {
                                          break L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var10 = var8.field_R;
                                    var8.field_R = param3;
                                    var8.a(param1, vq.field_q);
                                    var8.field_R = var10;
                                    if (var12 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
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
                  ke.field_e[2] = vq.field_q[2];
                  ke.field_e[0] = vq.field_q[0];
                  ke.field_e[1] = vq.field_q[1];
                  var10 = var8.field_R;
                  var8.field_R = param3;
                  var8.a(param1, ke.field_e);
                  var8.field_R = var10;
                  break L9;
                }
                L12: {
                  if (null == var9) {
                    break L12;
                  } else {
                    if ((this.field_s ^ -1) < (param1[1] ^ -1)) {
                      break L12;
                    } else {
                      var10 = ((fc) (var9)).field_R;
                      ((fc) (var9)).field_R = param3;
                      ((fc) (var9)).a(param1, vq.field_q);
                      ((fc) (var9)).field_R = var10;
                      break L12;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackIn_95_0 = (RuntimeException) (var6);

            stackIn_95_1 = new StringBuilder().append("jg.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L13;
            } else {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_99_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "null";
              break L14;
            } else {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "{...}";
              break L14;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_96_0), stackIn_100_2 + ',' + param4 + ')');
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

    public static void b(boolean param0) {
        try {
            field_j = (int[][]) null;
            field_m = null;
            field_q = null;
            if (param0) {
                field_j = (int[][]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "jg.V(" + param0 + ')');
        }
    }

    final static bs a(long param0, int param1) {
        bs stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = 42 % ((-65 - param1) / 51);
            stackIn_1_0 = (bs) ((Object) kd.field_l.a(3661, param0));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "jg.CA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final fc a(lg param0, int param1, int param2, byte param3) {
        Object stackIn_8_0 = null;
        fc stackIn_11_0 = null;
        fc stackIn_37_0 = null;
        fc stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        fc var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fc var9 = null;
        fc var10 = null;
        fc var11 = null;
        fc var12 = null;
        fc var13 = null;
        fc var14 = null;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.field_G >= 4066) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (4096 <= param0.field_z) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (fc) ((Object) stackIn_8_0);
                }
                case 9: {
                    try {
                        if (param3 < -85) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (fc) null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        var5 = new fc(param0, 110, 1560, 10, -10, -5);
                        var6 = param1 - this.field_l;
                        var7 = param2 + -this.field_g;
                        var8 = var5.f();
                        var9 = en.field_a;
                        var10 = en.field_a;
                        en.field_a.field_L = 0;
                        var9.field_T = 0;
                        var10.field_w = 0;
                        var11 = on.field_a;
                        var12 = on.field_a;
                        on.field_a.field_L = 0;
                        var11.field_T = 0;
                        var12.field_w = 0;
                        var13 = ch.field_c;
                        var14 = ch.field_c;
                        ch.field_c.field_L = 0;
                        var13.field_T = 0;
                        var14.field_w = 0;
                        if (-129 <= (var8 + var6 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ia.a(en.field_a, (byte) -25, var5, 0, 0, 128 - var6 - (var8 - var8), 0, -1, 0, on.field_a);
                        ch.field_c.a(en.field_a);
                        if (var16 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var6 + -var8 ^ -1) <= -1) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ia.a(en.field_a, (byte) -113, var5, 0, 0, -var8 + (var8 + -var6), 0, 1, 0, on.field_a);
                        ch.field_c.a(en.field_a);
                        if (var16 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ch.field_c.a(var5);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-129 > (var8 + var7 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((-var8 + var7 ^ -1) > -1) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ia.a(en.field_a, (byte) -93, ch.field_c, 0, -var8 - -var8 - var7, 0, 0, 0, 1, on.field_a);
                        if (var16 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ia.a(en.field_a, (byte) -66, ch.field_c, 0, var8 + -var8 + -var7 - -128, 0, 0, 0, -1, on.field_a);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!be.field_q) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var15 = -1 + en.field_a.field_bb.length;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var15 < 0) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        en.field_a.field_i[var15] = 0;
                        stackIn_41_0 = en.field_a;
                        stackIn_37_0 = stackIn_41_0;
                        if (var16 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_37_0.field_bb[var15] = -1;
                        var15--;
                        if (var16 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = en.field_a;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0;
                }
                case 42: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var5_ref);
                    stackIn_43_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("jg.O(");
                    stackIn_43_1 = stackIn_45_1;
                    if (param0 == null) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw wn.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(jg param0, int param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h = param0.field_h;
              this.field_r = param0.field_r;
              this.field_s = param0.field_s;
              this.field_l = param0.field_l;
              this.field_o = param0.field_o;
              this.field_g = param0.field_g;
              var3_int = this.field_p;
              this.field_p = param0.field_p;
              if (tj.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_n.a(param0.field_n, (byte) 64);
                    if (7 != this.field_p) {
                      break L3;
                    } else {
                      if (-8 != (var3_int ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (this.field_p == 26) {
                        break L5;
                      } else {
                        if (25 != this.field_p) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var3_int == 26) {
                      break L4;
                    } else {
                      if (var3_int == 25) {
                        break L4;
                      } else {
                        this.field_n.a(wi.field_d[4], (byte) 120);
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (28 != this.field_p) {
                    break L1;
                  } else {
                    if (28 != var3_int) {
                      this.field_n.a(wi.field_d[5], (byte) 55);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_n.a(wi.field_d[3], (byte) 70);
                break L1;
              }
            }
            L6: {
              this.field_d = param0.field_d;
              this.field_k = param0.field_k;
              this.field_i = param0.field_i;
              this.field_f = param0.field_f;
              if (param1 < -22) {
                break L6;
              } else {
                field_j = (int[][]) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var3);

            stackIn_41_1 = new StringBuilder().append("jg.W(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param5 == 0) {
                break L1;
              } else {
                this.a(-87, -8, -4, -87);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_l >= param4) {
                  break L3;
                } else {
                  if ((this.field_l + 128 ^ -1) >= (param0 ^ -1)) {
                    break L3;
                  } else {
                    if ((param3 ^ -1) >= (this.field_g ^ -1)) {
                      break L3;
                    } else {
                      if (128 + this.field_g <= param1) {
                        break L3;
                      } else {
                        if ((param2 ^ -1) > (-10 + this.field_s ^ -1)) {
                          break L3;
                        } else {
                          if ((param2 ^ -1) <= (this.field_s - -47 ^ -1)) {
                            break L3;
                          } else {
                            stackIn_22_0 = 1;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_22_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (tj.field_c) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  this.a(70, (int[]) null, true, (byte[]) null, false);
                  break L1;
                }
              }
              L2: {
                if (-3 == (this.field_f ^ -1)) {
                  this.field_f = 1;
                  this.field_n.a(wi.field_d[1], (byte) 86);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_k = (short)(this.field_k + 1);
              if (param0 == 7579) {
                break L1;
              } else {
                this.b(126, -52, 91, 79, 50, 36);
                break L1;
              }
            }
            L2: {
              if (this.field_k > 255) {
                this.field_k = (short) 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (tj.field_c) {
                break L3;
              } else {
                this.field_n.c(-660903963);
                if (!this.field_n.a(param0 ^ -7643)) {
                  break L3;
                } else {
                  L4: {
                    if ((this.field_f ^ -1) == -1) {
                      break L4;
                    } else {
                      if (-3 == (this.field_f ^ -1)) {
                        break L4;
                      } else {
                        if ((this.field_f ^ -1) == -2) {
                          this.field_f = -1;
                          if (!Vertigo2.field_L) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.field_f = 2;
                  this.field_n.a(wi.field_d[2], (byte) 67);
                  break L3;
                }
              }
            }
            L5: {
              if (-29 != (this.field_p ^ -1)) {
                break L5;
              } else {
                if ((this.field_k ^ -1) >= -35) {
                  break L5;
                } else {
                  stackIn_30_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_32_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_30_0 != 0;
        } else {
          return stackIn_32_0 != 0;
        }
    }

    final void c(boolean param0) {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_g = 61;
                break L1;
              }
            }
            if (tj.field_c) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((this.field_f ^ -1) != 0) {
                  break L2;
                } else {
                  this.field_f = 0;
                  this.field_n.a(wi.field_d[0], (byte) 76);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "jg.BA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                this.field_s = -79;
                break L1;
              }
            }
            stackIn_4_0 = this.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.R(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    jg(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_g = param2;
              if (ke.field_e == null) {
                ke.field_e = new int[]{0, 0, 0, oo.field_h[0], 0, -oo.field_j[0], 0, 65536, 0, oo.field_j[0], 0, oo.field_h[0]};
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_l = param1;
              this.field_s = param3;
              this.field_h = lj.a(this.field_l, false, 128);
              this.field_r = lj.a(this.field_g, false, 128);
              this.field_o = lj.a(this.field_s, false, 240);
              if (tj.field_c) {
                break L2;
              } else {
                this.field_n = new wg();
                break L2;
              }
            }
            this.a((byte) -122, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "jg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    jg(jg param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!tj.field_c) {
                this.field_n = new wg();
                break L1;
              } else {
                break L1;
              }
            }
            this.a(param0, -106);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("jg.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_m = "Player names can be up to 12 letters, numbers and underscores";
    }
}
