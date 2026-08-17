/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String[] field_h;
    boolean field_l;
    private hk[] field_d;
    th field_q;
    private int[] field_i;
    private int[] field_j;
    private int[] field_k;
    private c[][] field_s;
    private int[] field_g;
    static of[] field_r;
    private th field_n;
    static byte[] field_v;
    private boolean field_t;
    private th field_e;
    int[] field_p;
    fh field_b;
    private boolean field_o;
    kb field_m;
    static String field_c;
    private th field_f;
    static ja[] field_a;
    th field_u;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hk var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        qj var9 = null;
        try {
          L0: {
            if (param1 == -11513) {
              L1: {
                var6 = this.field_d[param2];
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if (var6.field_d.length <= param3) {
                    break L1;
                  } else {
                    if (255 == var6.field_d[param3]) {
                      break L1;
                    } else {
                      if ((var6.field_b[param3] ^ -1) < (this.field_m.field_H ^ -1)) {
                        L2: {
                          if (1000 + this.field_m.field_H < var6.field_b[param3]) {
                            this.a((byte) -118, "powerup not ready", this.field_m.field_H + ": " + param2 + " tried to use a powerup slot that's not ready yet: " + param3 + " is due " + var6.field_b[param3]);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var7 = var6.field_d[param3];
                        var8 = var6.field_f[param3];
                        var9 = new qj(this.field_m.field_H + 50, param2, var7, var8, param4, param0);
                        this.field_e.a(var9, false);
                        this.a(-7737, rm.a(this.field_m.field_H, param4, param0, var7, var8, param2, param1 ^ -13113, param4));
                        var6.field_b[param3] = this.field_m.field_H + this.field_m.a(var8, var7, param2, false);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
              this.a((byte) 95, "invalid powerup slot", param2 + " tried to use invalid powerup slot: " + param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "rl.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
              return;
            }
          }
        }
    }

    final static void b(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (nb.field_a == null) {
                break L1;
              } else {
                nb.field_a.g((byte) 118);
                break L1;
              }
            }
            if (param0 < -125) {
              L2: {
                if (null == pj.field_I) {
                  break L2;
                } else {
                  pj.field_I.l(124);
                  break L2;
                }
              }
              qe.d(0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rl.N(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, ge param1, int param2, lm param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        ge var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3.e((byte) -112);
            var6 = param3.g(param2 + 1829980022);
            var7 = new ge(var5_int, var6, param3.k((byte) 121));
            if (param2 == -32422) {
              var7.field_A = (rl) (this);
              var7.field_x = this.field_m.a(param2 + -16744794);
              var7.field_gb = param0;
              this.field_m.field_d[var7.field_gb] = this.field_m.field_d[var7.field_gb] + param3.o(-116);
              this.field_u.a(var7, false);
              this.a(param3, var7, param1, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("rl.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        this.d(-32724);
        if (param0 != -198) {
            return;
        }
        try {
            this.a(120);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.G(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_a = null;
              field_c = null;
              field_h = null;
              field_r = null;
              if (param0 >= 59) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            field_v = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rl.S(" + param0 + ')');
        }
    }

    private final void a(int param0, ge param1) {
        RuntimeException runtimeException = null;
        pc var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                this.field_j = (int[]) null;
                break L1;
              }
            }
            param1.field_eb = false;
            if (!param1.field_Z) {
              var3 = aq.a(this.field_m.field_H, false, param1.field_tb.field_x, param1.field_x);
              this.a(param0 + -7735, var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("rl.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, ek param1) {
        c var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1.c((byte) -70);
              if (param0 < -21) {
                break L1;
              } else {
                rl.a((byte) 90);
                break L1;
              }
            }
            L2: {
              var3 = this.a(true, param1.field_C, param1.field_B);
              if (null == var3) {
                break L2;
              } else {
                var3.a(param1, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rl.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final c a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        c stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        c stackIn_20_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (this.field_s[0].length < param1) {
                  break L1;
                } else {
                  if ((param2 ^ -1) < (this.field_s.length ^ -1)) {
                    break L1;
                  } else {
                    if (param2 < 0) {
                      break L1;
                    } else {
                      if (0 <= param1) {
                        L2: {
                          if (null == this.field_s[param2][param1]) {
                            this.field_s[param2][param1] = new c();
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        stackIn_20_0 = this.field_s[param2][param1];
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              stackIn_14_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (c) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "rl.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (c) ((Object) stackIn_14_0);
          } else {
            return stackIn_20_0;
          }
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        ge var3 = null;
        pa var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lm var5 = null;
        try {
          L0: {
            var4 = this.a((byte) -125, param1);
            if (var4 != null) {
              var4.b(false);
              if (param0 == 4) {
                L1: {
                  L2: {
                    if (!(var4 instanceof ge)) {
                      break L2;
                    } else {
                      var3 = (ge) ((Object) var4);
                      var3.f(true);
                      var3.t(4);
                      var3.r((byte) -111);
                      if (-30 == (var3.field_Q ^ -1)) {
                        var3.a(4, (byte) -89);
                        if (!ZombieDawnMulti.field_E) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (!(var4 instanceof lm)) {
                    break L1;
                  } else {
                    var5 = (lm) ((Object) var4);
                    var5.n((byte) -100);
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
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
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rl.U(" + param0 + ',' + param1 + ')');
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

    final void a(byte param0, ge param1, boolean param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == 65) {
                break L1;
              } else {
                this.field_l = false;
                break L1;
              }
            }
            this.field_n.a(new nk(param1, param1.e((byte) -112), param1.g(1829947600), param2), false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("rl.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, pa param1) {
        so var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            param1.field_S = false;
            if (!param1.field_Z) {
              L1: {
                if (param0 == -2) {
                  break L1;
                } else {
                  this.field_s = (c[][]) null;
                  break L1;
                }
              }
              var3 = ng.a(param1.field_N, param0 ^ -101, param1.field_Q, param1.field_x, param1.field_G, this.field_m.field_H, param1.field_E, param1.field_db, param1.field_ab);
              this.a(-7737, var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rl.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final pa a(byte param0, int param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        pa stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.c(param1, -117);
            if (null != var3) {
              if (var3 instanceof pa) {
                L1: {
                  if (param0 <= -119) {
                    break L1;
                  } else {
                    field_v = (byte[]) null;
                    break L1;
                  }
                }
                stackIn_10_0 = (pa) ((Object) var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new IllegalArgumentException("oid " + param1 + " is not a character");
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.MA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pa) ((Object) stackIn_2_0);
        } else {
          return stackIn_10_0;
        }
    }

    private final void a(int param0) {
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        kb stackIn_77_0 = null;
        kb stackIn_87_0 = null;
        kb stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        kb stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        kb stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ge var3_ref_ge = null;
        int[] var3_ref_int__ = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 100) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var3 = this.field_m.field_l;
                        if (-1 == (var3 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-2 == (var3 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == 2) {
                            statePc = 61;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((this.field_m.field_H ^ -1) <= -401) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-2 != (this.field_m.field_t ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.a(false, 1);
                        if (var7 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (df.field_I) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 == (this.field_m.field_m[0] ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!pp.field_n) {
                            statePc = 94;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (11 != hg.field_rb) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_ref_ge = new ge(hc.field_c, gk.field_c, 0);
                        var3_ref_ge.a(-9019, (rl) (this));
                        var3_ref_ge.field_gb = 0;
                        var3_ref_ge.field_x = this.field_m.a(-16777216);
                        this.field_m.field_K.a(-25612, var3_ref_ge);
                        var3_ref_ge.field_S = true;
                        op.field_m.field_f = var3_ref_ge.field_x;
                        var3_ref_ge = new ge(hc.field_c, -30 + gk.field_c, 1);
                        var3_ref_ge.a(-9019, (rl) (this));
                        var3_ref_ge.field_gb = 0;
                        var3_ref_ge.field_x = this.field_m.a(-16777216);
                        this.field_m.field_K.a(-25612, var3_ref_ge);
                        var3_ref_ge.field_S = true;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((this.field_m.field_H % 32 ^ -1) != -1) {
                            statePc = 94;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3 = this.field_m.field_t;
                        var4_ref_int__ = this.field_m.field_m;
                        var5 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var5 ^ -1) <= (var4_ref_int__.length ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6 = var4_ref_int__[var5];
                        stackIn_44_0 = 0;
                        stackIn_38_0 = stackIn_44_0;
                        stackIn_44_1 = var6;
                        stackIn_38_1 = stackIn_44_1;
                        if (var7 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 != stackIn_38_1) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3--;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = -1;
                        stackIn_44_1 = var3 ^ -1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == stackIn_44_1) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (4500 >= this.field_m.field_H) {
                            statePc = 60;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((this.field_m.field_I / 8 ^ -1) <= (this.field_m.field_g ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((this.field_m.field_H ^ -1) <= (this.field_m.field_C + -3000 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (1 >= var3) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.a(false, 2);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var2_int = this.field_m.field_t;
                        var3_ref_int__ = this.field_m.field_m;
                        var4 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var4 ^ -1) <= (var3_ref_int__.length ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var5 = var3_ref_int__[var4];
                        stackIn_70_0 = var5 ^ -1;
                        stackIn_64_0 = stackIn_70_0;
                        stackIn_70_1 = -1;
                        stackIn_64_1 = stackIn_70_1;
                        if (var7 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != stackIn_64_1) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var2_int--;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_70_0 = var2_int ^ -1;
                        stackIn_70_1 = -1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (stackIn_70_0 == stackIn_70_1) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((this.field_m.field_C ^ -1) < (this.field_m.field_H ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var3 = 0;
                        var4 = 0;
                        var5 = 1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var5 ^ -1) <= (this.field_m.field_d.length ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_87_0 = this.field_m;
                        stackIn_77_0 = stackIn_87_0;
                        if (var7 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (stackIn_77_0.field_d[var5] != this.field_m.field_d[var3]) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var4 = 1;
                        if (var7 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (this.field_m.field_d[var5] <= this.field_m.field_d[var3]) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var3 = var5;
                        var4 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_87_0 = this.field_m;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_90_0 = (kb) ((Object) stackIn_87_0);
                        stackIn_88_0 = stackIn_90_0;
                        stackIn_90_1 = -110;
                        stackIn_88_1 = stackIn_90_1;
                        if (var4 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_91_0 = (kb) ((Object) stackIn_88_0);
                        stackIn_91_1 = stackIn_88_1;
                        stackIn_91_2 = -1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_91_0 = (kb) ((Object) stackIn_90_0);
                        stackIn_91_1 = stackIn_90_1;
                        stackIn_91_2 = var3;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        ((kb) (Object) stackIn_91_0).a((byte) stackIn_91_1, stackIn_91_2);
                        this.a(false, 3);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "rl.B(" + param0 + ')');
                }
                case 94: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        md var4_ref_md = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        md var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ak.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = vn.field_c.length;
                        if (param0 >= 101) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_h = (String[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = new int[var1_int];
                        var3 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 >= var1_int) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_ref_md = vn.field_c[var3];
                        var4_ref_md.a((byte) -81);
                        c.a(var3, (byte) 75);
                        var5 = var4_ref_md.field_D + var4_ref_md.field_C >> 1546541409;
                        var6 = var4_ref_md.field_G + var4_ref_md.field_l >> 417600865;
                        var7 = var4_ref_md.field_j + var4_ref_md.field_r >> 1797707969;
                        var8 = ak.field_a[9] >> 498310498;
                        var9 = ak.field_a[10] >> 557478690;
                        var10_int = ak.field_a[11] >> 2097945858;
                        var11 = hl.field_c[4] * var9 + var8 * hl.field_c[3] - -(var10_int * hl.field_c[5]) >> 1591623950;
                        var12 = var9 * hl.field_c[7] + hl.field_c[6] * var8 - -(hl.field_c[8] * var10_int) >> 1119527310;
                        var13 = var10_int * hl.field_c[11] + hl.field_c[10] * var9 + hl.field_c[9] * var8 >> 1934932974;
                        var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 1113028080;
                        var3++;
                        if (var19 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var19 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = ak.field_a[9] >> 792557224;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = ak.field_a[10] >> 714580008;
                        var5 = ak.field_a[11] >> -1926026872;
                        var6 = f.field_a << -287271580;
                        var7 = 0;
                        var8 = on.a(var6, -18924) >> -587800440;
                        var9 = wn.a(-126, var6) >> -228522648;
                        if (0 == (bd.field_g ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((bo.field_d ^ -1) != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = -128;
                        var7 = bd.field_g - 320;
                        var8 = -bo.field_d + 240;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 + var9 * var9)));
                        var8 = (int)((double)var8 * var10);
                        var9 = (int)((double)var9 * var10);
                        var7 = (int)((double)var7 * var10);
                        var12 = -var3 + var7;
                        var13 = var8 + -var4;
                        var14 = -var5 + var9;
                        var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
                        var12 = (int)((double)var12 * var10);
                        var14 = (int)((double)var14 * var10);
                        var13 = (int)((double)var13 * var10);
                        var15 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = var15;
                        stackIn_20_1 = vn.field_c.length;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= stackIn_20_1) {
                            statePc = 38;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var16 = 0;
                        if (var19 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17_int = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var17_int >= vn.field_c.length) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_20_0 = var2[var16] ^ -1;
                        stackIn_25_0 = stackIn_20_0;
                        stackIn_20_1 = var2[var17_int] ^ -1;
                        stackIn_25_1 = stackIn_20_1;
                        if (var19 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = var17_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var17_int++;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2[var16] = -2147483648;
                        var17 = vn.field_c[var16];
                        c.a(var16, (byte) 106);
                        var18 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var18 >= 3) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        hl.field_c[var18] = hl.field_c[var18] + lk.field_G[var15][var18];
                        var18++;
                        if (var19 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var19 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        sa.a(var17, ak.field_a, true, hl.field_c, (byte) -121, false, false);
                        gh.a(var17, var7, (byte) 116, var12, var14, var9, var13, var8);
                        var15++;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "rl.T(" + param0 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, ae param1) {
        ae var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_q.f(param0 + 35850)) {
              var3 = (ae) ((Object) this.field_q.a((byte) 76));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackIn_15_0 = param1.field_f ^ -1;

                      stackIn_15_1 = var3.field_f ^ -1;

                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_15_0 <= stackIn_15_1) {
                          qc.a(param1, var3, 0);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (ae) ((Object) this.field_q.c((byte) 123));
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  this.field_q.a(-25612, param1);
                  stackIn_15_0 = param0;
                  stackIn_15_1 = -7737;
                  break L2;
                }
                L4: {
                  if (stackIn_15_0 == stackIn_15_1) {
                    break L4;
                  } else {
                    this.field_d = (hk[]) null;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_q.a(param0 ^ 31283, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("rl.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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

    private final void a(boolean param0, byte param1, fc param2) {
        boolean stackIn_4_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        boolean stackIn_52_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        th var4 = null;
        RuntimeException var4_ref = null;
        ek var5_ref_ek = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        ek var8_ref_ek = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_b = new fh(param2);
                        this.field_s = new c[(this.field_b.field_c >> -1771110265) + 1][1 + (this.field_b.field_r >> -1092212313)];
                        this.field_m.field_H = 0;
                        ip.b((byte) 97);
                        this.field_n = new th();
                        this.field_f = new th();
                        this.field_e = new th();
                        var4 = param2.a(91);
                        var5_ref_ek = (ek) ((Object) var4.c(78));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_ref_ek == null) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var5_ref_ek instanceof sh;
                        stackIn_13_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var14 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = (sh) ((Object) var5_ref_ek);
                        if ((((sh) (var6)).field_O ^ -1) <= (this.field_m.field_t ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((sh) (var6)).a(-9019, (rl) (this));
                        ((sh) (var6)).field_O = this.field_m.field_y[((sh) (var6)).field_O];
                        this.field_f.a(var5_ref_ek, false);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_ref_ek = (ek) ((Object) var4.b(6));
                        if (var14 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_m.field_I = 0;
                        stackIn_13_0 = 2 * this.field_m.field_t;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = stackIn_13_0;
                        var6 = null;
                        var7 = null;
                        if (!param0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = new ek[var5];
                        var6 = new int[var5];
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param1 == -6) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var8_ref_ek = (ek) ((Object) this.field_u.c(123));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null == var8_ref_ek) {
                            statePc = 51;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_52_0 = var8_ref_ek instanceof lm;
                        stackIn_20_0 = stackIn_52_0;
                        if (var14 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!stackIn_20_0) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_m.field_I = this.field_m.field_I + 1;
                        if (!param0) {
                            statePc = 50;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = 2147483647;
                        var10 = (sh) ((Object) this.field_f.c(73));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var10 == null) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11 = ((sh) (var10)).e((byte) -112) - var8_ref_ek.e((byte) -112);
                        var12_int = ((sh) (var10)).g(1829947600) - var8_ref_ek.g(1829947600);
                        var13 = var11 * var11 + var12_int * var12_int;
                        stackIn_36_0 = var13;
                        stackIn_29_0 = stackIn_36_0;
                        stackIn_36_1 = var9;
                        stackIn_29_1 = stackIn_36_1;
                        if (var14 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 >= stackIn_29_1) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = var13;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10 = (sh) ((Object) this.field_f.b(6));
                        if (var14 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = var8_ref_ek;
                        var11 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var11;
                        stackIn_36_1 = java.lang.reflect.Array.getLength(var6);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 >= stackIn_36_1) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_64_0 = var9 ^ -1;
                        stackIn_38_0 = stackIn_64_0;
                        stackIn_64_1 = ((int[]) (var6))[var11] ^ -1;
                        stackIn_38_1 = stackIn_64_1;
                        if (var14 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = stackIn_38_0;
                        stackIn_40_1 = stackIn_38_1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 < stackIn_40_1) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = ((Object[]) (var7))[var11];
                        var13 = ((int[]) (var6))[var11];
                        ((int[]) (var6))[var11] = var9;
                        var9 = var13;
                        ((Object[]) (var7))[var11] = var10;
                        var10 = var12;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var14 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (!(var8_ref_ek instanceof ge)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var8_ref_ek = (ek) ((Object) this.field_u.b(6));
                        if (var14 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = param0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!stackIn_52_0) {
                            statePc = 62;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (java.lang.reflect.Array.getLength(var7) <= var8) {
                            statePc = 62;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var14 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (null == ((Object[]) (var7))[var8]) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((lm) (((Object[]) (var7))[var8])).p(95);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_m.field_g = this.field_m.field_I;
                        this.field_m.field_C = 9000 + 250 * this.field_m.field_I;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = this.field_m.field_t ^ -1;
                        stackIn_64_1 = -2;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != stackIn_64_1) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_m.field_C = 64512;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (64512 >= this.field_m.field_C) {
                            statePc = 76;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.field_m.field_C = 64512;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_74_0 = (RuntimeException) (var4_ref);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = new StringBuilder().append("rl.K(").append(param0).append(',').append(param1).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param2 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    throw fa.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
                }
                case 76: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final lm a(int param0, int param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        lm stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.c(param1, param0 + -417600939);
              if (param0 == 417600865) {
                break L1;
              } else {
                this.a(-39, (pa) null);
                break L1;
              }
            }
            if (null == var3) {
              throw new IllegalArgumentException("oid " + param1 + " invalid");
            } else {
              if (!(var3 instanceof lm)) {
                throw new IllegalArgumentException("oid " + param1 + " is not a human");
              } else {
                stackIn_12_0 = (lm) ((Object) var3);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.DA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
        try {
            this.field_n.a(new nk((rl) (this), param2, param0, param1), false);
            if (param3 >= -44) {
                this.a((byte) -68, (ge) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_m.field_l = param1;
              if (!param0) {
                break L1;
              } else {
                discarded$1 = this.b(-90, 117, 86, 71, -86, 91);
                break L1;
              }
            }
            L2: {
              var3_int = this.field_m.field_l;
              if (var3_int == 2) {
                this.field_m.field_C = this.field_m.field_H + 3000;
                break L2;
              } else {
                break L2;
              }
            }
            this.a(-7737, new fq(this.field_m.field_H, this.field_m.field_l, this.field_m.field_C));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rl.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final ek c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ek var4 = null;
        int var5 = 0;
        ek stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 101 / ((31 - param1) / 58);
            var4 = (ek) ((Object) this.field_u.c(101));
            L1: while (true) {
              L2: {
                if (null == var4) {
                  break L2;
                } else {
                  if (var4.field_x == param0) {
                    stackIn_7_0 = (ek) (var4);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var4 = (ek) ((Object) this.field_u.b(6));
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rl.LA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return (ek) ((Object) stackIn_10_0);
        }
    }

    private final void a(byte param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 46 / ((param0 - -53) / 59);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rl.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ')');
        }
    }

    final void a(byte param0, ge param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.field_Z) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.a(-7737, new aj(this.field_m.field_H, param1.field_x));
              param1.field_eb = false;
              var3_int = -89 / ((param0 - -48) / 48);
              param1.field_S = false;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("rl.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ek a(int param0, boolean param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ek stackIn_3_0 = null;
        ek stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = (ek) ((Object) this.field_m.field_u.c(104));
            if (param1) {
              L1: while (true) {
                L2: {
                  if (null == var3) {
                    break L2;
                  } else {
                    if (param0 == var3.field_x) {
                      stackIn_9_0 = (ek) (var3);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3 = (ek) ((Object) this.field_m.field_u.b(6));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackIn_12_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = (ek) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.GA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return (ek) ((Object) stackIn_12_0);
          }
        }
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_169_0 = 0;
        ge stackIn_173_0 = null;
        ge stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        int stackIn_175_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_216_0 = 0;
        ge stackIn_220_0 = null;
        ge stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        int stackIn_222_0 = 0;
        int stackIn_224_0 = 0;
        Object stackIn_228_0 = null;
        int stackIn_228_1 = 0;
        Object stackIn_229_0 = null;
        int stackIn_229_1 = 0;
        int stackIn_229_2 = 0;
        int stackIn_230_0 = 0;
        int stackIn_235_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_240_0 = 0;
        ge stackIn_244_0 = null;
        ge stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_246_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_261_0 = 0;
        ge stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        ge stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        int stackIn_266_2 = 0;
        int stackIn_267_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_274_0 = 0;
        int stackIn_279_0 = 0;
        int stackIn_281_0 = 0;
        Object stackIn_285_0 = null;
        Object stackIn_286_0 = null;
        int stackIn_286_1 = 0;
        int stackIn_287_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_324_0 = 0;
        int stackIn_326_0 = 0;
        int stackIn_328_0 = 0;
        int stackIn_333_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        ge var8 = null;
        pa var9 = null;
        lm var10 = null;
        int var11 = 0;
        int var12_int = 0;
        ek var12 = null;
        int var13 = 0;
        og var13_ref_og = null;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = param2;
              if (!this.field_o) {
                break L1;
              } else {
                System.out.println(this.field_m.field_H + ": executing powerup " + param1 + " with modifier " + param0);
                break L1;
              }
            }
            L2: {
              if (!this.field_m.b((byte) -105, 45, param5)) {
                break L2;
              } else {
                if (param1 != 17) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (-17 == (param1 ^ -1)) {
                  break L4;
                } else {
                  if (7 == param1) {
                    break L4;
                  } else {
                    if ((param1 ^ -1) == -5) {
                      break L4;
                    } else {
                      if (3 == param1) {
                        break L4;
                      } else {
                        if (-15 == (param1 ^ -1)) {
                          break L4;
                        } else {
                          if (param1 == 8) {
                            break L4;
                          } else {
                            if (-2 == (param1 ^ -1)) {
                              break L4;
                            } else {
                              if (param1 == 2) {
                                break L4;
                              } else {
                                if (5 == param1) {
                                  break L4;
                                } else {
                                  if (-1 == (param1 ^ -1)) {
                                    break L4;
                                  } else {
                                    if ((param1 ^ -1) == -19) {
                                      break L4;
                                    } else {
                                      if (param1 != 6) {
                                        break L3;
                                      } else {
                                        break L4;
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
              var8 = this.b((byte) 87, var7_int);
              var12_int = 0;
              if (null != var8) {
                L5: {
                  var13 = var8.field_gb;
                  var12_int = this.field_m.b(0, var13) ? 1 : 0;
                  if (var12_int == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (param1 == 12) {
                        break L6;
                      } else {
                        if (11 == param1) {
                          break L6;
                        } else {
                          if (-18 == (param1 ^ -1)) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var12_int = 0;
                    break L5;
                  }
                }
                if (var12_int == 0) {
                  break L3;
                } else {
                  this.a((byte) 23, var8);
                  stackIn_64_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L3;
              }
            }
            L7: {
              var12 = this.c(var7_int, -69);
              if (null == var12) {
                break L7;
              } else {
                if (var12 instanceof og) {
                  L8: {
                    var13_ref_og = (og) ((Object) var12);
                    if ((var13_ref_og.field_O ^ -1) != (param5 ^ -1)) {
                      this.field_k[var13_ref_og.field_O] = cr.b(this.field_k[var13_ref_og.field_O], 1);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  stackIn_76_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L7;
                }
              }
            }
            L9: {
              var13 = param1;
              if (3 != var13) {
                break L9;
              } else {
                if (var14 == 0) {
                  var8 = this.b((byte) 32, var7_int);
                  if (var8 != null) {
                    if ((var8.field_gb ^ -1) == (param5 ^ -1)) {
                      L10: {
                        stackIn_173_0 = (ge) (var8);

                        if (38 == param0) {
                          stackIn_174_0 = (ge) ((Object) stackIn_173_0);
                          stackIn_174_1 = 24;
                          break L10;
                        } else {
                          stackIn_174_0 = (ge) ((Object) stackIn_173_0);
                          stackIn_174_1 = 19;
                          break L10;
                        }
                      }
                      ((ge) (Object) stackIn_174_0).a(stackIn_174_1, (byte) -89);
                      var8.field_S = true;
                      stackIn_175_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_169_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_166_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  break L9;
                }
              }
            }
            if (-8 == (var13 ^ -1)) {
              var9 = this.a((byte) -120, var7_int);
              if (var9 == null) {
                stackIn_180_0 = 0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                L11: {
                  L12: {
                    L13: {
                      if (!(var9 instanceof lm)) {
                        break L13;
                      } else {
                        if (!var9.field_Z) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (!(var9 instanceof ge)) {
                      break L11;
                    } else {
                      if (param0 == 37) {
                        L14: {
                          var8 = (ge) ((Object) var9);
                          if (this.field_o) {
                            System.out.println("cursing, owner " + var8.field_gb + ", prev 0 " + var8.d((byte) 61, 0) + " 1 " + var8.d((byte) 61, 1));
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (var8.field_gb == param5) {
                            break L15;
                          } else {
                            if (!var8.d((byte) 61, param5)) {
                              break L15;
                            } else {
                              this.field_k[param5] = cr.b(this.field_k[param5], 2);
                              break L15;
                            }
                          }
                        }
                        var8.e(93, param5);
                        if (var14 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  var10 = this.a(417600865, var7_int);
                  if (-21 == (var10.field_Q ^ -1)) {
                    break L11;
                  } else {
                    if (18 == var10.field_Q) {
                      break L11;
                    } else {
                      this.a(param5, (ge) null, -32422, var10);
                      var10.j(18);
                      break L11;
                    }
                  }
                }
                stackIn_211_0 = 1;
                decompiledRegionSelector0 = 7;
                break L0;
              }
            } else {
              if ((var13 ^ -1) == -5) {
                var8 = this.b((byte) 124, var7_int);
                if (null == var8) {
                  stackIn_216_0 = 0;
                  decompiledRegionSelector0 = 8;
                  break L0;
                } else {
                  L16: {
                    stackIn_220_0 = (ge) (var8);

                    if (param0 != 34) {
                      stackIn_221_0 = (ge) ((Object) stackIn_220_0);
                      stackIn_221_1 = 0;
                      break L16;
                    } else {
                      stackIn_221_0 = (ge) ((Object) stackIn_220_0);
                      stackIn_221_1 = 1;
                      break L16;
                    }
                  }
                  ((ge) (Object) stackIn_221_0).a(stackIn_221_1 != 0, (byte) 100);
                  stackIn_222_0 = 1;
                  decompiledRegionSelector0 = 9;
                  break L0;
                }
              } else {
                L17: {
                  L18: {
                    if (-11 != (var13 ^ -1)) {
                      break L18;
                    } else {
                      if (var14 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (-10 != (var13 ^ -1)) {
                      break L19;
                    } else {
                      if (var14 == 0) {
                        break L17;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (-14 == (var13 ^ -1)) {
                    L20: {
                      stackIn_228_0 = this;

                      stackIn_228_1 = param4;

                      if (-37 != (param0 ^ -1)) {
                        stackIn_229_0 = this;
                        stackIn_229_1 = stackIn_228_1;
                        stackIn_229_2 = 0;
                        break L20;
                      } else {
                        stackIn_229_0 = this;
                        stackIn_229_1 = stackIn_228_1;
                        stackIn_229_2 = 1;
                        break L20;
                      }
                    }
                    this.a(stackIn_229_1, stackIn_229_2 != 0, param2, (byte) -52);
                    stackIn_230_0 = 1;
                    decompiledRegionSelector0 = 11;
                    break L0;
                  } else {
                    if (-2 == (var13 ^ -1)) {
                      var8 = this.b((byte) 25, var7_int);
                      if (var8 == null) {
                        stackIn_235_0 = 0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      } else {
                        var8.l((byte) -52);
                        stackIn_237_0 = 1;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      L21: {
                        if (var13 != 2) {
                          break L21;
                        } else {
                          if (var14 == 0) {
                            var8 = this.b((byte) 32, var7_int);
                            if (null != var8) {
                              L22: {
                                stackIn_244_0 = (ge) (var8);

                                if (param0 != 38) {
                                  stackIn_245_0 = (ge) ((Object) stackIn_244_0);
                                  stackIn_245_1 = 0;
                                  break L22;
                                } else {
                                  stackIn_245_0 = (ge) ((Object) stackIn_244_0);
                                  stackIn_245_1 = 1;
                                  break L22;
                                }
                              }
                              ((ge) (Object) stackIn_245_0).b(stackIn_245_1 != 0, (byte) -127);
                              stackIn_246_0 = 1;
                              decompiledRegionSelector0 = 15;
                              break L0;
                            } else {
                              stackIn_240_0 = 0;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (var13 == 16) {
                        var8 = this.b((byte) 100, var7_int);
                        if (var8 == null) {
                          stackIn_251_0 = 0;
                          decompiledRegionSelector0 = 16;
                          break L0;
                        } else {
                          var8.m(-6556);
                          stackIn_253_0 = 1;
                          decompiledRegionSelector0 = 17;
                          break L0;
                        }
                      } else {
                        L23: {
                          if (-15 != (var13 ^ -1)) {
                            break L23;
                          } else {
                            if (var14 == 0) {
                              var8 = this.b((byte) 86, var7_int);
                              if (var8 != null) {
                                var8.l(34);
                                stackIn_258_0 = 1;
                                decompiledRegionSelector0 = 19;
                                break L0;
                              } else {
                                stackIn_256_0 = 0;
                                decompiledRegionSelector0 = 18;
                                break L0;
                              }
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          if (5 != var13) {
                            break L24;
                          } else {
                            if (var14 == 0) {
                              var8 = this.b((byte) 68, var7_int);
                              if (var8 != null) {
                                L25: {
                                  stackIn_265_0 = (ge) (var8);

                                  stackIn_265_1 = 47;

                                  if (param0 != 35) {
                                    stackIn_266_0 = (ge) ((Object) stackIn_265_0);
                                    stackIn_266_1 = stackIn_265_1;
                                    stackIn_266_2 = 0;
                                    break L25;
                                  } else {
                                    stackIn_266_0 = (ge) ((Object) stackIn_265_0);
                                    stackIn_266_1 = stackIn_265_1;
                                    stackIn_266_2 = 1;
                                    break L25;
                                  }
                                }
                                ((ge) (Object) stackIn_266_0).a(stackIn_266_1, stackIn_266_2 != 0);
                                stackIn_267_0 = 1;
                                decompiledRegionSelector0 = 21;
                                break L0;
                              } else {
                                stackIn_261_0 = 0;
                                decompiledRegionSelector0 = 20;
                                break L0;
                              }
                            } else {
                              break L24;
                            }
                          }
                        }
                        L26: {
                          if (-1 != (var13 ^ -1)) {
                            break L26;
                          } else {
                            if (var14 == 0) {
                              var9 = this.a((byte) -121, var7_int);
                              if (var9 == null) {
                                stackIn_272_0 = 0;
                                decompiledRegionSelector0 = 22;
                                break L0;
                              } else {
                                var9.c((byte) -68, param5);
                                stackIn_274_0 = 1;
                                decompiledRegionSelector0 = 23;
                                break L0;
                              }
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (18 != var13) {
                            break L27;
                          } else {
                            if (var14 == 0) {
                              var8 = this.b((byte) 40, var7_int);
                              if (null == var8) {
                                stackIn_279_0 = 0;
                                decompiledRegionSelector0 = 24;
                                break L0;
                              } else {
                                var8.e(false);
                                stackIn_281_0 = 1;
                                decompiledRegionSelector0 = 25;
                                break L0;
                              }
                            } else {
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if (15 != var13) {
                            break L28;
                          } else {
                            if (var14 == 0) {
                              L29: {
                                stackIn_285_0 = this;

                                if ((param0 ^ -1) != -33) {
                                  stackIn_286_0 = this;
                                  stackIn_286_1 = 0;
                                  break L29;
                                } else {
                                  stackIn_286_0 = this;
                                  stackIn_286_1 = 1;
                                  break L29;
                                }
                              }
                              this.a(stackIn_286_1 != 0, (byte) -108, param5, param2, param4);
                              stackIn_287_0 = 1;
                              decompiledRegionSelector0 = 26;
                              break L0;
                            } else {
                              break L28;
                            }
                          }
                        }
                        if (8 == var13) {
                          var9 = this.a((byte) -125, var7_int);
                          if (null != var9) {
                            L30: {
                              L31: {
                                var11 = this.field_m.a((byte) 32, param5, 400);
                                if (var9 instanceof ge) {
                                  break L31;
                                } else {
                                  if (!(var9 instanceof lm)) {
                                    break L30;
                                  } else {
                                    L32: {
                                      if ((param0 ^ -1) == -35) {
                                        break L32;
                                      } else {
                                        ((lm) ((Object) var9)).a(var11 * 3 / 4, true);
                                        if (var14 == 0) {
                                          break L30;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                    ((lm) ((Object) var9)).c(false);
                                    if (var14 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              L33: {
                                if (34 != param0) {
                                  break L33;
                                } else {
                                  ((ge) ((Object) var9)).m((byte) 124);
                                  if (var14 == 0) {
                                    break L30;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              ((ge) ((Object) var9)).d(var11, -96);
                              break L30;
                            }
                            stackIn_313_0 = 1;
                            decompiledRegionSelector0 = 28;
                            break L0;
                          } else {
                            stackIn_290_0 = 0;
                            decompiledRegionSelector0 = 27;
                            break L0;
                          }
                        } else {
                          L34: {
                            if (17 != var13) {
                              break L34;
                            } else {
                              if (var14 == 0) {
                                L35: {
                                  L36: {
                                    if (param4 == 65535) {
                                      break L36;
                                    } else {
                                      if (-1 == param4) {
                                        break L36;
                                      } else {
                                        this.b(2, param5, param4, param2);
                                        if (var14 == 0) {
                                          break L35;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                  this.b(4, var7_int);
                                  break L35;
                                }
                                stackIn_324_0 = 1;
                                decompiledRegionSelector0 = 29;
                                break L0;
                              } else {
                                break L34;
                              }
                            }
                          }
                          L37: {
                            if ((var13 ^ -1) != -12) {
                              break L37;
                            } else {
                              if (var14 == 0) {
                                this.field_m.field_a[param5] = this.field_m.a((byte) 32, param5, 500);
                                stackIn_326_0 = 1;
                                decompiledRegionSelector0 = 30;
                                break L0;
                              } else {
                                break L37;
                              }
                            }
                          }
                          if (-13 == (var13 ^ -1)) {
                            this.field_m.field_z[param5] = this.field_m.a((byte) 32, param5, 750);
                            stackIn_328_0 = 1;
                            decompiledRegionSelector0 = 31;
                            break L0;
                          } else {
                            L38: {
                              if (param3 <= -44) {
                                break L38;
                              } else {
                                this.b(19, 25, -67, 7);
                                break L38;
                              }
                            }
                            stackIn_333_0 = 0;
                            decompiledRegionSelector0 = 32;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                var11 = this.field_m.a((byte) 32, param5, 1000);
                this.b(param1, param2, var11, 11564, param4);
                stackIn_224_0 = 1;
                decompiledRegionSelector0 = 10;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var7), "rl.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_64_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_76_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_166_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_169_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_175_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_180_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_211_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_216_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_222_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_224_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_230_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_235_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_237_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_240_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_246_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_251_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_253_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_256_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_258_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_261_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_267_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_272_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_274_0 != 0;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return stackIn_279_0 != 0;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return stackIn_281_0 != 0;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return stackIn_287_0 != 0;
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return stackIn_290_0 != 0;
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return stackIn_313_0 != 0;
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return stackIn_324_0 != 0;
                                                                  } else {
                                                                    if (decompiledRegionSelector0 == 30) {
                                                                      return stackIn_326_0 != 0;
                                                                    } else {
                                                                      if (decompiledRegionSelector0 == 31) {
                                                                        return stackIn_328_0 != 0;
                                                                      } else {
                                                                        return stackIn_333_0 != 0;
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

    private final ge b(byte param0, int param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        ge stackIn_17_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 19) {
                break L1;
              } else {
                this.b(101, -68, 16, -57, 121);
                break L1;
              }
            }
            var3 = this.c(param1, -40);
            if (var3 == null) {
              if (this.a(param1, true) == null) {
                stackIn_10_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_8_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              if (!(var3 instanceof ge)) {
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_17_0 = (ge) ((Object) var3);
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.O(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ge) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ge) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ge) ((Object) stackIn_15_0);
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    private final void d(int param0) {
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        br stackIn_56_0 = null;
        br stackIn_84_0 = null;
        nk stackIn_87_0 = null;
        Object stackIn_89_0 = null;
        bf stackIn_92_0 = null;
        Object stackIn_94_0 = null;
        boolean stackIn_104_0 = false;
        int stackIn_111_0 = 0;
        boolean stackIn_122_0 = false;
        boolean stackIn_129_0 = false;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_6_0;
        nk stackOut_86_0;
        bf stackOut_91_0;
        boolean stackOut_103_0;
        int statePc = 0;
        Throwable caughtException = null;
        br var2 = null;
        int var2_int = 0;
        nk var2_ref = null;
        bf var2_ref2 = null;
        sa var2_ref3 = null;
        RuntimeException var2_ref4 = null;
        br var3 = null;
        Object var3_ref = null;
        ce var3_ref2 = null;
        pa var4 = null;
        ce var4_ref = null;
        br var4_ref2 = null;
        qj var4_ref3 = null;
        ge var5_ref_ge = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-4 == (this.field_m.field_l ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        this.field_m.field_H = this.field_m.field_H + 1;
                        this.field_l = false;
                        var2 = this.field_u.c(86);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!(var2 instanceof ek)) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var2 instanceof ge;
                        stackIn_17_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!stackIn_7_0) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!((ge) ((Object) var2)).p((byte) 53)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_l = true;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2 = this.field_u.b(param0 ^ -32726);
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = stackIn_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((this.field_m.field_a.length ^ -1) >= (var2_int ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_31_0 = -1;
                        stackIn_20_0 = stackIn_31_0;
                        stackIn_31_1 = this.field_m.field_a[var2_int] ^ -1;
                        stackIn_20_1 = stackIn_31_1;
                        if (var6 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 <= stackIn_20_1) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_m.field_a[var2_int] = this.field_m.field_a[var2_int] - 1;
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_m.field_a[var2_int] = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2_int++;
                        if (var6 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2_int = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var2_int ^ -1;
                        stackIn_31_1 = this.field_m.field_z.length ^ -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 <= stackIn_31_1) {
                            statePc = 44;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_45_0 = this.field_m.field_z[var2_int];
                        stackIn_33_0 = stackIn_45_0;
                        if (var6 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_35_0 = stackIn_33_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= 0) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_m.field_z[var2_int] = this.field_m.field_z[var2_int] - 1;
                        if (var6 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_m.field_z[var2_int] = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var2_int++;
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 != this.field_m.field_l) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return;
                }
                case 47: {
                    try {
                        var2_int = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var2_int >= this.field_m.field_m.length) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_m.field_m[var2_int] = 0;
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var6 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var2 = this.field_u.c(75);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!(var2 instanceof ek)) {
                            statePc = 83;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var3 = var2.field_d;
                        ((ek) ((Object) var2)).h(param0 ^ -32763);
                        stackIn_84_0 = (br) (var2);
                        stackIn_56_0 = stackIn_84_0;
                        if (var6 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!(stackIn_56_0 instanceof pa)) {
                            statePc = 82;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var4 = (pa) ((Object) var2);
                        if (!(var4 instanceof ge)) {
                            statePc = 72;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var4.field_Z) {
                            statePc = 72;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (9 == var4.field_Q) {
                            statePc = 72;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var4.field_Q ^ -1) != -22) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.field_m.field_m[((ge) ((Object) var4)).field_gb] = this.field_m.field_m[((ge) ((Object) var4)).field_gb] + 1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var4.field_S) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var4 instanceof ge) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var5_ref_ge = (ge) ((Object) var4);
                        if (!var5_ref_ge.field_eb) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        this.a(-2, var5_ref_ge);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.a(-2, var4);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var2 = var3;
                        if (var6 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = this.field_n.c(127);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var2_ref = (nk) ((Object) stackIn_84_0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var2_ref == null) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var2_ref.a(param0 + 32843);
                        stackOut_86_0 = (nk) ((Object) this.field_n.b(param0 ^ -32726));
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_87_0 = stackOut_86_0;
                        if (var6 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var2_ref = stackIn_87_0;
                        if (var6 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = this.field_m.field_A.c(param0 + 32810);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_ref2 = (bf) ((Object) stackIn_89_0);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var2_ref2 == null) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var2_ref2.c(0);
                        stackOut_91_0 = (bf) ((Object) this.field_m.field_A.b(6));
                        stackIn_94_0 = stackOut_91_0;
                        stackIn_92_0 = stackOut_91_0;
                        if (var6 != 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var2_ref2 = stackIn_92_0;
                        if (var6 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_94_0 = this.field_m.field_G.c(46);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var2_ref3 = (sa) ((Object) stackIn_94_0);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var2_ref3 == null) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var2_ref3.c(-21);
                        var2_ref3 = (sa) ((Object) this.field_m.field_G.b(6));
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var2_int = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var3_ref = null;
                        if (param0 == -32724) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        field_v = (byte[]) null;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var4_ref = (ce) ((Object) this.field_m.field_s.c(param0 ^ -32670));
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var4_ref == null) {
                            statePc = 110;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var3_ref2 = (ce) ((Object) this.field_m.field_s.b(6));
                        stackOut_103_0 = var4_ref.d(-20232);
                        stackIn_111_0 = stackOut_103_0 ? 1 : 0;
                        stackIn_104_0 = stackOut_103_0;
                        if (var6 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (stackIn_104_0) {
                            statePc = 108;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var2_int = 1;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var4_ref = var3_ref2;
                        if (var6 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_111_0 = var2_int;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var4_ref = (ce) ((Object) this.field_m.field_s.c(45));
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (null == var4_ref) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var4_ref.a((byte) -60);
                        var4_ref = (ce) ((Object) this.field_m.field_s.b(param0 ^ -32726));
                        if (var6 != 0) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var6 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.field_b.a(48);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var4_ref2 = this.field_u.c(99);
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (!(var4_ref2 instanceof ek)) {
                            statePc = 128;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackIn_129_0 = var4_ref2 instanceof ge;
                        stackIn_122_0 = stackIn_129_0;
                        if (var6 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (stackIn_122_0) {
                            statePc = 126;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ((ge) ((Object) var4_ref2)).j((byte) 82);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var4_ref2 = this.field_u.b(6);
                        if (var6 == 0) {
                            statePc = 120;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackIn_129_0 = this.field_e.f(28113);
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (stackIn_129_0) {
                            statePc = 152;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var4_ref3 = (qj) ((Object) this.field_e.g(50));
                        if (var6 != 0) {
                            statePc = 152;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var4_ref3.field_g > this.field_m.field_H) {
                            statePc = 147;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var5 = this.b(var4_ref3.field_h, var4_ref3.field_q, var4_ref3.field_f, -84, var4_ref3.field_k, var4_ref3.field_n) ? 1 : 0;
                        if (var5 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if ((this.field_j[var4_ref3.field_n] ^ -1) != -256) {
                            statePc = 141;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.field_j[var4_ref3.field_n] = var4_ref3.field_q;
                        if (var6 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if ((this.field_j[var4_ref3.field_n] ^ -1) == (var4_ref3.field_q ^ -1)) {
                            statePc = 146;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        this.field_j[var4_ref3.field_n] = -2;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (var6 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        this.field_e.a(-25612, var4_ref3);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (var6 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 151: {
                    var2_ref4 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2_ref4), "rl.EA(" + param0 + ')');
                }
                case 152: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        ce stackIn_4_0 = null;
        ce stackIn_4_1 = null;
        fh stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        ce stackIn_6_0 = null;
        ce stackIn_6_1 = null;
        fh stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        ce stackIn_7_0 = null;
        ce stackIn_7_1 = null;
        fh stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ce var6 = null;
        RuntimeException var6_ref = null;
        ek var7 = null;
        ge var8 = null;
        lm var8_ref = null;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 11564) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        stackIn_6_0 = null;
                        stackIn_4_0 = stackIn_6_0;
                        stackIn_6_1 = null;
                        stackIn_4_1 = stackIn_6_1;
                        stackIn_6_2 = this.field_b;
                        stackIn_4_2 = stackIn_6_2;
                        stackIn_6_3 = param1;
                        stackIn_4_3 = stackIn_6_3;
                        stackIn_6_4 = param4;
                        stackIn_4_4 = stackIn_6_4;
                        stackIn_6_5 = param2;
                        stackIn_4_5 = stackIn_6_5;
                        if (9 != param0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_7_0 = null;
                        stackIn_7_1 = null;
                        stackIn_7_2 = (fh) ((Object) stackIn_4_2);
                        stackIn_7_3 = stackIn_4_3;
                        stackIn_7_4 = stackIn_4_4;
                        stackIn_7_5 = stackIn_4_5;
                        stackIn_7_6 = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = null;
                        stackIn_7_1 = null;
                        stackIn_7_2 = (fh) ((Object) stackIn_6_2);
                        stackIn_7_3 = stackIn_6_3;
                        stackIn_7_4 = stackIn_6_4;
                        stackIn_7_5 = stackIn_6_5;
                        stackIn_7_6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = new ce(stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6);
                        this.field_m.field_s.a(var6, false);
                        if (param0 == 9) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = (ek) ((Object) this.field_u.c(60));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == var7) {
                            statePc = 33;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!(var7 instanceof ge)) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = (ge) ((Object) var7);
                        if (var6.a(var8.e((byte) -112), var8.g(1829947600), -1)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8.d(200, -124);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var9 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var7 instanceof lm) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8_ref = (lm) ((Object) var7);
                        if (var6.a(var8_ref.e((byte) -112), var8_ref.g(1829947600), -1)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8_ref.a(200, true);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = (ek) ((Object) this.field_u.b(6));
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var6_ref), "rl.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(pa param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!param0.field_Z) {
              if (param1 == 105) {
                var3 = (sh) ((Object) this.field_f.c(64));
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 == null) {
                        break L3;
                      } else {
                        var4 = var3.field_C - param0.field_C;
                        stackIn_40_0 = -1;

                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_40_0 > var4) {
                              break L4;
                            } else {
                              if (1 < var4) {
                                break L4;
                              } else {
                                var4 = -param0.field_B + var3.field_B;
                                if (0 < (var4 ^ -1)) {
                                  break L4;
                                } else {
                                  if (1 < var4) {
                                    break L4;
                                  } else {
                                    if (var3.a(param0, param1 + -84)) {
                                      L5: {
                                        L6: {
                                          this.a(-7737, ak.a(var3.field_O, (byte) -111, this.field_m.field_H, param0.field_x));
                                          if (param0 instanceof lm) {
                                            break L6;
                                          } else {
                                            L7: {
                                              var6 = (ge) ((Object) param0);
                                              var5 = 4;
                                              var6.t(4);
                                              this.field_i[var3.field_O] = this.field_i[var3.field_O] + 1;
                                              this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 1;
                                              if (this.field_m.b((byte) -122, 53, var3.field_O)) {
                                                var5 = var5 + var5 / 2;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                            if (var7 == 0) {
                                              break L5;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        L8: {
                                          this.field_m.c(-118);
                                          var5 = 10;
                                          this.field_g[var3.field_O] = this.field_g[var3.field_O] + 1;
                                          if (!((lm) ((Object) param0)).field_hb) {
                                            break L8;
                                          } else {
                                            this.field_k[var3.field_O] = cr.b(this.field_k[var3.field_O], 4);
                                            break L8;
                                          }
                                        }
                                        this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 3;
                                        if (!this.field_m.b((byte) -99, 60, var3.field_O)) {
                                          break L5;
                                        } else {
                                          var5 = var5 + var5 / 2;
                                          break L5;
                                        }
                                      }
                                      this.field_m.field_d[var3.field_O] = this.field_m.field_d[var3.field_O] + var5;
                                      this.field_m.a(param1 + -233, param0);
                                      stackIn_37_0 = 1;
                                      decompiledRegionSelector0 = 3;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3 = (sh) ((Object) this.field_f.b(6));
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackIn_40_0 = 0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3_ref);

            stackIn_44_1 = new StringBuilder().append("rl.AA(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L9;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_40_0 != 0;
            } else {
              return stackIn_37_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        try {
            this.field_m.field_A.a(new bf(this.field_b, param2, param0, param3), false);
            if (param1 != -22930) {
                this.a(-17, false, -101, (byte) 121);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(lm param0, ge param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (param1.field_Z) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(-7737, fn.a(param3, param0.field_x, param1.field_x, (byte) 116, this.field_m.field_H, param2));
                param1.field_S = false;
                if (param4 == -63) {
                  break L1;
                } else {
                  this.field_b = (fh) null;
                  break L1;
                }
              }
              param1.field_eb = false;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("rl.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(lm param0, ge param1, ge param2, boolean param3) {
        sj var5 = null;
        sj stackIn_3_0 = null;
        sj stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        sj stackIn_4_0 = null;
        sj stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = null;

              stackIn_3_1 = null;

              stackIn_3_2 = this.field_m.field_H;

              if (null == param2) {
                stackIn_4_0 = null;
                stackIn_4_1 = null;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = -1;
                break L1;
              } else {
                stackIn_4_0 = null;
                stackIn_4_1 = null;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = param2.field_x;
                break L1;
              }
            }
            L2: {
              var5 = new sj(stackIn_4_2, stackIn_4_3, param0.field_x, param1.field_x, param0.field_G, param0.field_E, param1.field_gb);
              if (!param3) {
                break L2;
              } else {
                this.field_d = (hk[]) null;
                break L2;
              }
            }
            this.a(-7737, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("rl.JA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_7_0 = false;
        int stackIn_37_0 = 0;
        boolean stackOut_6_0;
        int statePc = 0;
        Throwable caughtException = null;
        pa[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        pa var10 = null;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        g.field_a.setSeed((long)((param4 << -161772635) + param3 + param2));
                        var6 = new pa[this.field_u.a(0)];
                        var7 = new int[this.field_u.a(0)];
                        d.a(var7, 0, var7.length, 32767);
                        if (param1 <= -36) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_r = (of[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = 0;
                        var9_ref_br = this.field_u.c(111);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!(var9_ref_br instanceof ek)) {
                            statePc = 36;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var9_ref_br instanceof pa;
                        stackIn_37_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var14 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = (pa) ((Object) var9_ref_br);
                        var11 = var10.e((byte) -112) + -param3;
                        var12 = -param4 + var10.g(1829947600);
                        if (-14401 <= (var11 * var11 - -(var12 * var12) ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!param0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var10 instanceof ge) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!(var10 instanceof lm)) {
                            statePc = 35;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6[var8] = var10;
                        var7[var8] = var10.field_x;
                        var8++;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var13 = (ge) ((Object) var10);
                        if (var13.field_gb != param2) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6[var8] = (pa) ((Object) var13);
                        var7[var8] = var13.field_x;
                        var8++;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_ref_br = this.field_u.b(6);
                        if (var14 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        vh.a(-7255, var7, var6);
                        stackIn_37_0 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 <= var9) {
                            statePc = 54;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10 = var6[var9];
                        if (var14 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!(var10 instanceof ge)) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_m.b(0, ((ge) ((Object) var10)).field_gb)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.a((byte) 100, (ge) ((Object) var10));
                        if (var14 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6[var9].b(param2, -50);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var9++;
                        if (var14 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var6_ref), "rl.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        bf stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        boolean stackIn_14_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_3_0;
        boolean stackOut_13_0;
        boolean stackOut_23_0;
        boolean stackOut_33_0;
        Object var5 = null;
        br var5_ref = null;
        RuntimeException var5_ref2 = null;
        bf var6_ref_bf = null;
        sa var6_ref_sa = null;
        ce var6_ref_ce = null;
        br var6_ref_br = null;
        int var6 = 0;
        og var7_ref_og = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = null;
            var6_ref_bf = (bf) ((Object) this.field_m.field_A.c(64));
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_ref_bf == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = (bf) (var6_ref_bf);
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!((bf) (Object) stackIn_4_0).a(param3, param2, (byte) 29)) {
                        var6_ref_bf = (bf) ((Object) this.field_m.field_A.b(6));
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        var6_ref_bf.a(-98);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = this.field_m.field_G.c(109);
                break L2;
              }
              var6_ref_sa = (sa) ((Object) stackIn_11_0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var6_ref_sa) {
                      break L6;
                    } else {
                      var5_ref = this.field_m.field_G.b(6);
                      stackOut_13_0 = var6_ref_sa.a(param3, param0 + 17308, param2);
                      stackIn_44_0 = stackOut_13_0 ? 1 : 0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var9 != 0) {
                        break L5;
                      } else {
                        if (stackIn_14_0) {
                          var6_ref_sa.d(-110);
                          var6_ref_sa.a(true);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var6_ref_sa = (sa) ((Object) var5_ref);
                          if (var9 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var6_ref_ce = (ce) ((Object) this.field_m.field_s.c(98));
                  L7: while (true) {
                    L8: {
                      if (null == var6_ref_ce) {
                        break L8;
                      } else {
                        var5_ref = this.field_m.field_s.b(6);
                        stackOut_23_0 = var6_ref_ce.a(param3, param2, -1);
                        stackIn_44_0 = stackOut_23_0 ? 1 : 0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          L9: {
                            if (!stackIn_24_0) {
                              break L9;
                            } else {
                              var6_ref_ce.c(param0 + -28190);
                              if (var9 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var6_ref_ce = (ce) ((Object) var5_ref);
                          if (var9 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var6_ref_br = this.field_m.field_K.c(85);
                    L10: while (true) {
                      L11: {
                        if (null == var6_ref_br) {
                          break L11;
                        } else {
                          stackOut_33_0 = var6_ref_br instanceof og;
                          stackIn_44_0 = stackOut_33_0 ? 1 : 0;
                          stackIn_34_0 = stackOut_33_0;
                          if (var9 != 0) {
                            break L5;
                          } else {
                            L12: {
                              if (stackIn_34_0) {
                                var7_ref_og = (og) ((Object) var6_ref_br);
                                if (var7_ref_og.b(param2, param3, param0 + -120)) {
                                  var7_ref_og.field_R = 1;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                            var6_ref_br = this.field_m.field_K.b(param0 + 4);
                            if (var9 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      stackIn_44_0 = 0;
                      break L5;
                    }
                  }
                }
                var6 = stackIn_44_0;
                var7 = 0;
                L13: while (true) {
                  L14: {
                    L15: {
                      if ((var7 ^ -1) <= (this.field_m.field_a.length ^ -1)) {
                        break L15;
                      } else {
                        stackIn_58_0 = var6;

                        if (var9 != 0) {
                          break L14;
                        } else {
                          L16: {
                            L17: {
                              if (stackIn_58_0 != 0) {
                                break L17;
                              } else {
                                if (-1 <= (this.field_m.field_a[var7] ^ -1)) {
                                  stackIn_56_0 = 0;
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            stackIn_56_0 = 1;
                            break L16;
                          }
                          var6 = stackIn_56_0;
                          this.field_m.field_a[var7] = 0;
                          var7++;
                          if (var9 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    stackIn_58_0 = var6;
                    break L14;
                  }
                  if (stackIn_58_0 != 0) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L18: {
                      var7 = 0;
                      if (param0 == 2) {
                        break L18;
                      } else {
                        this.a((lm) null, (ge) null, -111, -126, (byte) -27);
                        break L18;
                      }
                    }
                    var8 = 0;
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (this.field_m.field_z.length <= var8) {
                            break L21;
                          } else {
                            stackIn_78_0 = var7;

                            if (var9 != 0) {
                              break L20;
                            } else {
                              L22: {
                                L23: {
                                  if (stackIn_78_0 != 0) {
                                    break L23;
                                  } else {
                                    if (0 >= this.field_m.field_z[var8]) {
                                      stackIn_76_0 = 0;
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                stackIn_76_0 = 1;
                                break L22;
                              }
                              var7 = stackIn_76_0;
                              this.field_m.field_z[var8] = 0;
                              var8++;
                              if (var9 == 0) {
                                continue L19;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        stackIn_78_0 = var7;
                        break L20;
                      }
                      if (stackIn_78_0 == 0) {
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5_ref2), "rl.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
                return;
              }
            }
          }
        }
    }

    final void a(int param0, ge param1, ge param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2.field_Z) {
                break L1;
              } else {
                if (param1.field_Z) {
                  break L1;
                } else {
                  this.a(-7737, td.a(param2.g(1829947600), this.field_m.field_H, param2.e((byte) -112), (byte) 41, param1.g(1829947600), param1.field_x, param1.e((byte) -112), param2.field_x));
                  var4_int = -87 % ((param0 - -35) / 36);
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("rl.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        hk var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        br var8_ref_br = null;
        lm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_t) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((byte) 52, "cheat disabled!", "player [" + param2 + "] attempted to cheat: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        System.out.println("player [" + param2 + "] cheating: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
                        if (param4 == 3) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(102, false, -116, (byte) 100);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = param1;
                        if ((var8 ^ -1) == -1) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == 1) {
                            statePc = 43;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 != 3) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var12 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (2 == var8) {
                            statePc = 47;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8_ref_br = this.field_u.c(85);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null == var8_ref_br) {
                            statePc = 42;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var12 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var8_ref_br instanceof lm) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 = (lm) ((Object) var8_ref_br);
                        if (!var9.field_Z) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var12 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = -param5 + var9.e((byte) -112);
                        var11 = -param3 + var9.g(1829947600);
                        if ((var10 * var10 + var11 * var11 ^ -1) <= -4001) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var12 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9.field_G = param5 << 68571088;
                        var9.field_E = param3 << -956133712;
                        var9.field_S = true;
                        System.out.println("moving human oid " + var9.field_x);
                        if (var12 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8_ref_br = this.field_u.b(6);
                        if (var12 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_m.field_d[param0] = 100;
                        this.field_m.field_d[(param0 - -1) % this.field_m.field_t] = 25;
                        this.field_m.field_H = 6000;
                        this.a(false, 2);
                        this.field_m.field_C = this.field_m.field_H - -1;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.a(false, param5);
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7 = this.field_d[param2];
                        var8 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var7.field_b.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var7.field_b[var8] = 0;
                        var8++;
                        if (var12 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var12 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var7_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var7_ref), "rl.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        ge var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        ge stackIn_22_0 = null;
        ge stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.b((byte) 117, param3);
            if (var6 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == var6.field_gb) {
                if (21 == var6.field_Q) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param4) {
                    L1: {
                      L2: {
                        if (var6.field_lb) {
                          break L2;
                        } else {
                          L3: {
                            stackIn_22_0 = (ge) (var6);

                            if (param4) {
                              stackIn_23_0 = (ge) ((Object) stackIn_22_0);
                              stackIn_23_1 = 0;
                              break L3;
                            } else {

                              stackIn_23_0 = (ge) ((Object) stackIn_22_0);
                              stackIn_23_1 = 1;
                              break L3;
                            }
                          }
                          ((ge) (Object) stackIn_23_0).a(stackIn_23_1 != 0, this.field_b.b(var6.e((byte) -112), param2, var6.g(1829947600), param1, 8760));
                          if (!ZombieDawnMulti.field_E) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var6.field_G = param1 << 1544547728;
                      var6.field_E = param2 << -477061392;
                      var6.a(33, (byte) -89);
                      var6.field_ab = param2;
                      var6.field_N = param1;
                      break L1;
                    }
                    this.a(-2, (pa) (var6));
                    stackIn_27_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "rl.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    rl(kb param0, hk[] param1, boolean param2, boolean param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ek var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_i = new int[4];
                    this.field_o = false;
                    this.field_j = new int[4];
                    this.field_p = new int[4];
                    this.field_k = new int[4];
                    this.field_g = new int[4];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_d = param1;
                        this.field_t = param2;
                        this.field_m = param0;
                        this.field_q = new th();
                        this.field_u = this.field_m.a((byte) 125);
                        this.a(param3, (byte) -6, this.field_m.field_h);
                        var5 = (ek) ((Object) this.field_u.c(126));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5.a(-9019, (rl) (this));
                        var5 = (ek) ((Object) this.field_u.b(6));
                        if (var6 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_m.field_l = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var5_int ^ -1) <= (this.field_j.length ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_j[var5_int] = 255;
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var5_ref);
                    stackIn_16_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("rl.<init>(");
                    stackIn_16_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_22_0;
                    stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
                    stackIn_20_1 = stackIn_22_1;
                    if (param1 == null) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = "Real-life threats";
    }
}
