/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uta implements sia {
    private static String[] field_l;
    private static String[] field_f;
    il field_m;
    static String field_n;
    String field_t;
    private int field_k;
    iv field_a;
    jea field_p;
    sw field_o;
    static nh field_d;
    static String field_e;
    private jea field_i;
    private vna field_s;
    private int field_h;
    private boolean field_j;
    private int field_c;
    private String[] field_b;
    private gka field_g;
    private String field_r;
    private int field_q;

    private final void a(boolean param0, String param1) {
        vg discarded$2 = null;
        gka var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_h = -36;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = (gka) ((Object) this.field_s.f(-80));
                if (var3 == null) {
                  break L3;
                } else {
                  if (param1.equals(var3.field_h)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_s.a((byte) 88, (vg) (new gka(param1)));
              break L2;
            }
            L4: {
              if (this.field_s.a((byte) -16) > 30) {
                discarded$2 = this.field_s.c((byte) 22);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("uta.W(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(int param0, String param1, int param2) {
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        vna var9 = null;
        gka var10 = null;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -10 + this.field_a.field_G - 15;
              var5 = rga.a(32287, param1, '\n');
              if (param0 == 24219) {
                break L1;
              } else {
                discarded$2 = this.a(-59);
                break L1;
              }
            }
            var6 = var5;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6.length) {
                break L0;
              } else {
                var8 = var6[var7];
                if (var11 == 0) {
                  L3: {
                    L4: {
                      L5: {
                        if (var4_int <= this.field_m.b(var8)) {
                          break L5;
                        } else {
                          this.b(var8, param2, param0 + -23989);
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9 = this.a(var4_int, true, var8);
                      var10 = (gka) ((Object) var9.f(param0 ^ -24277));
                      L6: while (true) {
                        if (var10 == null) {
                          break L4;
                        } else {
                          this.b(var10.field_h, param2, 230);
                          var10 = (gka) ((Object) var9.e(param0 ^ 24289));
                          if (var11 != 0) {
                            break L3;
                          } else {
                            continue L6;
                          }
                        }
                      }
                    }
                    var7++;
                    break L3;
                  }
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("uta.Q(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final vna a(int param0, boolean param1, String param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var4 = null;
        vna var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vna stackIn_31_0 = null;
        vna stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vna stackOut_30_0 = null;
        vna stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_ref = new vna();
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param2 == null) {
                      break L4;
                    } else {
                      var5 = this.field_m.b(param2);
                      var6 = param2;
                      var12 = param0;
                      var11 = var5;
                      if (var8 != 0) {
                        if (var11 == var12) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var11 > var12) {
                            var7 = -1 + param2.length();
                            L6: while (true) {
                              L7: {
                                L8: {
                                  L9: {
                                    L10: {
                                      if (var7 <= 0) {
                                        break L10;
                                      } else {
                                        var10 = param0;
                                        var9 = var5;
                                        if (var8 != 0) {
                                          if (var9 == var10) {
                                            break L9;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          L11: {
                                            if (var9 > var10) {
                                              break L11;
                                            } else {
                                              if (32 == param2.charAt(var7)) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          incrementValue$2 = var7;
                                          var7--;
                                          var5 = var5 - this.field_m.a(param2.charAt(incrementValue$2));
                                          if (var8 == 0) {
                                            continue L6;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    if (var7 == 0) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var5 = this.field_m.b(param2);
                                  var7 = param2.length() + -1;
                                  L12: while (true) {
                                    if (var5 <= param0) {
                                      break L8;
                                    } else {
                                      incrementValue$3 = var7;
                                      var7--;
                                      var5 = var5 - this.field_m.a(param2.charAt(incrementValue$3));
                                      if (var8 != 0) {
                                        break L7;
                                      } else {
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                                var6 = param2.substring(0, var7);
                                break L7;
                              }
                              param2 = param2.substring(var7 + 1);
                              break L5;
                            }
                          } else {
                            param2 = null;
                            break L5;
                          }
                        }
                        var4_ref.b((byte) -128, new gka(var6));
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                stackOut_30_0 = (vna) null;
                stackIn_31_0 = stackOut_30_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_32_0 = (vna) (var4_ref);
              stackIn_33_0 = stackOut_32_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var4);
            stackOut_34_1 = new StringBuilder().append("uta.M(").append(param0).append(',').append(param1).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L13;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_31_0;
        } else {
          return stackIn_33_0;
        }
    }

    abstract String[] a(boolean param0);

    public static void c(int param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_n = null;
        field_l = null;
        if (param0 != 0) {
            field_n = (String) null;
        }
    }

    private final jea a(int param0, byte param1, int param2) {
        jea var4 = new jea(0L, (jea) null);
        int var5 = 39 / ((-89 - param1) / 36);
        var4.field_w = sva.a(param2, param0, 4);
        return var4;
    }

    private final jea a(int param0, int param1) {
        int var4 = -128 / ((-18 - param0) / 61);
        jea var3 = new jea(0L, (jea) null);
        var3.field_w = eca.a(4, param1);
        return var3;
    }

    public final boolean a(int param0) {
        if (param0 != -2) {
            return true;
        }
        return this.field_j;
    }

    public void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jea stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jea stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jea stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        jea stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        jea stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        jea stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        jea stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        jea stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        jea stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        jea stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        jea stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        jea stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        jea stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        jea stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        jea stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        jea stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jea stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        jea stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          if ((this.field_i.field_t + this.field_i.field_T ^ -1) < -1) {
            L0: {
              bea.c(this.field_i.field_q, this.field_i.field_A, this.field_a.field_qb, this.field_i.field_t, 5592405, 230);
              bea.c(this.field_a.field_q + this.field_a.field_G, this.field_i.field_A, this.field_a.field_qb, this.field_i.field_t, 5592405, 230);
              bea.c(this.field_a.field_q, this.field_i.field_A, this.field_a.field_G, this.field_a.field_T, 5592405, 230);
              bea.c(this.field_a.field_q, this.field_a.field_A - -this.field_a.field_t, this.field_a.field_G, -this.field_a.field_t + -this.field_a.field_A + this.field_o.field_A, 5592405, 230);
              bea.c(this.field_a.field_q, this.field_o.field_t + this.field_o.field_A, this.field_a.field_G, this.field_i.field_t - this.field_o.field_T - this.field_o.field_t, 5592405, 230);
              bea.c(this.field_a.field_q, this.field_a.field_A, this.field_a.field_G, this.field_a.field_t, 2236962, 240);
              bea.c(this.field_o.field_q, this.field_o.field_A, this.field_o.field_G, this.field_o.field_t, 2236962, 240);
              var2 = this.field_i.field_T + 256;
              if ((var2 ^ -1) > -1) {
                var2 = 0;
                break L0;
              } else {
                break L0;
              }
            }
            bea.c(this.field_i.field_q, this.field_i.field_t + this.field_i.field_A, this.field_i.field_G, -this.field_i.field_t + qf.field_i + -this.field_i.field_A, 0, var2 >> -859749791);
            var3 = this.field_i.field_t + (this.field_i.field_T - -5);
            var4 = 0;
            L1: while (true) {
              L2: {
                if (6 <= var4) {
                  L3: {
                    stackOut_75_0 = this.field_i;
                    stackOut_75_1 = 100;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    if ((this.field_h & 8) != 0) {
                      stackOut_77_0 = (jea) ((Object) stackIn_77_0);
                      stackOut_77_1 = stackIn_77_1;
                      stackOut_77_2 = 0;
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      stackIn_78_2 = stackOut_77_2;
                      break L3;
                    } else {
                      stackOut_76_0 = (jea) ((Object) stackIn_76_0);
                      stackOut_76_1 = stackIn_76_1;
                      stackOut_76_2 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      stackIn_78_2 = stackOut_76_2;
                      break L3;
                    }
                  }
                  ((jea) (Object) stackIn_78_0).b(stackIn_78_1, stackIn_78_2 != 0);
                  break L2;
                } else {
                  bea.c(0, var3, mma.field_a, 0, var4 << -173144219);
                  var3--;
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      L4: {
                        stackOut_59_0 = this.field_i;
                        stackOut_59_1 = 100;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        if ((this.field_h & 8) != 0) {
                          stackOut_61_0 = (jea) ((Object) stackIn_61_0);
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = 0;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          break L4;
                        } else {
                          stackOut_60_0 = (jea) ((Object) stackIn_60_0);
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = 1;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          stackIn_62_2 = stackOut_60_2;
                          break L4;
                        }
                      }
                      ((jea) (Object) stackIn_62_0).b(stackIn_62_1, stackIn_62_2 != 0);
                      if (this.field_b != null) {
                        if (this.field_j) {
                          var2 = this.field_i.field_t + this.field_i.field_T;
                          this.field_p.field_T = var2;
                          this.field_p.b(74, false);
                          var2 = var2 + (5 + this.field_k);
                          var3 = 0;
                          L5: while (true) {
                            if (this.field_b.length > var3) {
                              this.field_m.c(this.field_b[var3], this.field_p.field_q + 10, var2, 13421772, -1);
                              var2 = var2 + this.field_k;
                              var3++;
                              if (var5 == 0) {
                                continue L5;
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L6: {
                if (this.field_b == null) {
                  break L6;
                } else {
                  if (this.field_j) {
                    var2 = this.field_i.field_t + this.field_i.field_T;
                    this.field_p.field_T = var2;
                    this.field_p.b(74, false);
                    var2 = var2 + (5 + this.field_k);
                    var3 = 0;
                    L7: while (true) {
                      if (this.field_b.length <= var3) {
                        break L6;
                      } else {
                        this.field_m.c(this.field_b[var3], this.field_p.field_q + 10, var2, 13421772, -1);
                        var2 = var2 + this.field_k;
                        var3++;
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (this.field_b != null) {
              if (this.field_j) {
                var2 = this.field_i.field_t + this.field_i.field_T;
                this.field_p.field_T = var2;
                this.field_p.b(74, false);
                var2 = var2 + (5 + this.field_k);
                var3 = 0;
                L8: while (true) {
                  if (this.field_b.length > var3) {
                    this.field_m.c(this.field_b[var3], this.field_p.field_q + 10, var2, 13421772, -1);
                    var2 = var2 + this.field_k;
                    var3++;
                    if (var5 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L9: {
            uta.c(24);
            if ((this.field_i.field_t + this.field_i.field_T ^ -1) < -1) {
              L10: {
                bea.c(this.field_i.field_q, this.field_i.field_A, this.field_a.field_qb, this.field_i.field_t, 5592405, 230);
                bea.c(this.field_a.field_q + this.field_a.field_G, this.field_i.field_A, this.field_a.field_qb, this.field_i.field_t, 5592405, 230);
                bea.c(this.field_a.field_q, this.field_i.field_A, this.field_a.field_G, this.field_a.field_T, 5592405, 230);
                bea.c(this.field_a.field_q, this.field_a.field_A - -this.field_a.field_t, this.field_a.field_G, -this.field_a.field_t + -this.field_a.field_A + this.field_o.field_A, 5592405, 230);
                bea.c(this.field_a.field_q, this.field_o.field_t + this.field_o.field_A, this.field_a.field_G, this.field_i.field_t - this.field_o.field_T - this.field_o.field_t, 5592405, 230);
                bea.c(this.field_a.field_q, this.field_a.field_A, this.field_a.field_G, this.field_a.field_t, 2236962, 240);
                bea.c(this.field_o.field_q, this.field_o.field_A, this.field_o.field_G, this.field_o.field_t, 2236962, 240);
                var2 = this.field_i.field_T + 256;
                if ((var2 ^ -1) > -1) {
                  var2 = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              bea.c(this.field_i.field_q, this.field_i.field_t + this.field_i.field_A, this.field_i.field_G, -this.field_i.field_t + qf.field_i + -this.field_i.field_A, 0, var2 >> -859749791);
              var3 = this.field_i.field_t + (this.field_i.field_T - -5);
              var4 = 0;
              L11: while (true) {
                if (6 > var4) {
                  bea.c(0, var3, mma.field_a, 0, var4 << -173144219);
                  var3--;
                  var4++;
                  if (var5 != 0) {
                    break L9;
                  } else {
                    continue L11;
                  }
                } else {
                  L12: {
                    stackOut_8_0 = this.field_i;
                    stackOut_8_1 = 100;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if ((this.field_h & 8) != 0) {
                      stackOut_10_0 = (jea) ((Object) stackIn_10_0);
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L12;
                    } else {
                      stackOut_9_0 = (jea) ((Object) stackIn_9_0);
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L12;
                    }
                  }
                  ((jea) (Object) stackIn_11_0).b(stackIn_11_1, stackIn_11_2 != 0);
                  if (this.field_b != null) {
                    if (this.field_j) {
                      var2 = this.field_i.field_t + this.field_i.field_T;
                      this.field_p.field_T = var2;
                      this.field_p.b(74, false);
                      var2 = var2 + (5 + this.field_k);
                      var3 = 0;
                      L13: while (true) {
                        if (this.field_b.length > var3) {
                          this.field_m.c(this.field_b[var3], this.field_p.field_q + 10, var2, 13421772, -1);
                          var2 = var2 + this.field_k;
                          var3++;
                          if (var5 == 0) {
                            continue L13;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L9;
            }
          }
          if (this.field_b != null) {
            if (this.field_j) {
              var2 = this.field_i.field_t + this.field_i.field_T;
              this.field_p.field_T = var2;
              this.field_p.b(74, false);
              var2 = var2 + (5 + this.field_k);
              var3 = 0;
              L14: while (true) {
                if (this.field_b.length > var3) {
                  this.field_m.c(this.field_b[var3], this.field_p.field_q + 10, var2, 13421772, -1);
                  var2 = var2 + this.field_k;
                  var3++;
                  if (var5 == 0) {
                    continue L14;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == ns.field_g) {
                break L1;
              } else {
                ht.field_Fb = new int[param2];
                var3_int = 0;
                L2: while (true) {
                  L3: {
                    if (var3_int >= param2) {
                      ooa.field_g = 32 * param2;
                      una.field_b = -1 + param2;
                      break L3;
                    } else {
                      ht.field_Fb[var3_int] = (var3_int << -1794479700) / param2;
                      var3_int++;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    }
                  }
                  ns.field_g = param2;
                  break L1;
                }
              }
            }
            if (param0 == 0) {
              L4: {
                if (param1 == qda.field_i) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      L7: {
                        if (param1 != ns.field_g) {
                          break L7;
                        } else {
                          sj.field_b = ht.field_Fb;
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      sj.field_b = new int[param1];
                      var3_int = 0;
                      L8: while (true) {
                        if (param1 <= var3_int) {
                          break L6;
                        } else {
                          sj.field_b[var3_int] = (var3_int << -1499956788) / param1;
                          var3_int++;
                          if (var4 != 0) {
                            break L5;
                          } else {
                            continue L8;
                          }
                        }
                      }
                    }
                    hba.field_b = -1 + param1;
                    break L5;
                  }
                  qda.field_i = param1;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "uta.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final jea a(byte param0, int param1) {
        jea var3 = null;
        String var4 = null;
        var3 = new jea();
        if (param0 <= 80) {
          var4 = (String) null;
          this.a(true, (String) null);
          var3.field_w = sva.a(param1, 0, 4);
          return var3;
        } else {
          var3.field_w = sva.a(param1, 0, 4);
          return var3;
        }
    }

    private final jea a(String param0, int param1, int param2) {
        jea var4 = null;
        RuntimeException var4_ref = null;
        jea stackIn_2_0 = null;
        jea stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jea stackOut_3_0 = null;
        jea stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new jea(0L, (jea) null, param0);
            if (param1 == 16733525) {
              var4.field_H = this.field_m;
              var4.field_ib = param2;
              var4.a(this.field_m.b(var4.field_r), this.field_k, -23776, 0, 5);
              stackOut_3_0 = (jea) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (jea) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("uta.J(");
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public boolean a(byte param0, char param1, int param2) {
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        jea var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        vg stackIn_19_1 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        vg stackIn_35_1 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        vg stackIn_83_1 = null;
        Object stackOut_80_0 = null;
        Object stackOut_82_0 = null;
        vg stackOut_82_1 = null;
        Object stackOut_81_0 = null;
        vg stackOut_81_1 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        vg stackOut_34_1 = null;
        Object stackOut_33_0 = null;
        vg stackOut_33_1 = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        vg stackOut_18_1 = null;
        Object stackOut_17_0 = null;
        vg stackOut_17_1 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == -72) {
          if (96 != param1) {
            if (this.field_j) {
              L0: {
                if (84 != param2) {
                  break L0;
                } else {
                  L1: {
                    var9 = this.field_o.e((byte) -124);
                    if ((var9.length() ^ -1) < -1) {
                      L2: {
                        this.a(24219, this.field_t + var9, 5635925);
                        var5 = (jea) ((Object) this.field_a.field_tb.field_J.b(3));
                        if (!this.a(var9, (byte) -112)) {
                          var5.field_ib = 16733525;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      this.field_o.d((byte) -113);
                      this.a(true, var9);
                      this.field_g = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (var6 != 0) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              if (param2 != 98) {
                L3: {
                  if (99 == param2) {
                    if (this.field_g == null) {
                      break L3;
                    } else {
                      if (this.field_s.field_e != this.field_g.field_e) {
                        this.field_g = (gka) ((Object) this.field_g.field_e);
                        this.field_o.a((byte) 74, this.field_g.field_h);
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    if (param2 != 80) {
                      discarded$7 = this.field_o.a(param2, param0 + -19624, param1);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_g == null) {
                            break L4;
                          } else {
                            if (this.field_s.field_e != this.field_g.field_e) {
                              this.field_g = (gka) ((Object) this.field_g.field_e);
                              this.field_o.a((byte) 74, this.field_g.field_h);
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        return true;
                      }
                    } else {
                      this.e(param0 + 21375);
                      if (var6 != 0) {
                        discarded$8 = this.field_o.a(param2, param0 + -19624, param1);
                        if (this.field_g != null) {
                          if (this.field_s.field_e == this.field_g.field_e) {
                            return true;
                          } else {
                            this.field_g = (gka) ((Object) this.field_g.field_e);
                            this.field_o.a((byte) 74, this.field_g.field_h);
                            return true;
                          }
                        } else {
                          return true;
                        }
                      } else {
                        return true;
                      }
                    }
                  }
                }
                return true;
              } else {
                L5: {
                  if (this.field_g == null) {
                    break L5;
                  } else {
                    if (this.field_g.field_a != this.field_s.field_e) {
                      break L5;
                    } else {
                      return true;
                    }
                  }
                }
                L6: {
                  stackOut_80_0 = this;
                  stackIn_82_0 = stackOut_80_0;
                  stackIn_81_0 = stackOut_80_0;
                  if (null != this.field_g) {
                    stackOut_82_0 = this;
                    stackOut_82_1 = this.field_g.field_a;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    break L6;
                  } else {
                    stackOut_81_0 = this;
                    stackOut_81_1 = this.field_s.f(-80);
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_83_1 = stackOut_81_1;
                    break L6;
                  }
                }
                ((uta) (this)).field_g = (gka) ((Object) stackIn_83_1);
                if (this.field_g != null) {
                  this.field_o.a((byte) 12, this.field_g.field_h);
                  if (var6 != 0) {
                    if (99 == param2) {
                      if (this.field_g != null) {
                        if (this.field_s.field_e == this.field_g.field_e) {
                          return true;
                        } else {
                          this.field_g = (gka) ((Object) this.field_g.field_e);
                          this.field_o.a((byte) 74, this.field_g.field_h);
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      if (param2 != 80) {
                        discarded$9 = this.field_o.a(param2, param0 + -19624, param1);
                        if (var6 != 0) {
                          if (this.field_g != null) {
                            if (this.field_s.field_e != this.field_g.field_e) {
                              this.field_g = (gka) ((Object) this.field_g.field_e);
                              this.field_o.a((byte) 74, this.field_g.field_h);
                              return true;
                            } else {
                              return true;
                            }
                          } else {
                            return true;
                          }
                        } else {
                          return true;
                        }
                      } else {
                        this.e(param0 + 21375);
                        discarded$10 = this.field_o.a(param2, param0 + -19624, param1);
                        if (this.field_g != null) {
                          if (this.field_s.field_e != this.field_g.field_e) {
                            this.field_g = (gka) ((Object) this.field_g.field_e);
                            this.field_o.a((byte) 74, this.field_g.field_h);
                            return true;
                          } else {
                            return true;
                          }
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            this.d(2);
            return true;
          }
        } else {
          field_l = (String[]) null;
          if (96 != param1) {
            if (this.field_j) {
              L7: {
                if (84 != param2) {
                  break L7;
                } else {
                  L8: {
                    var8 = this.field_o.e((byte) -124);
                    var7 = var8;
                    if ((var8.length() ^ -1) < -1) {
                      L9: {
                        this.a(24219, this.field_t + var8, 5635925);
                        var5 = (jea) ((Object) this.field_a.field_tb.field_J.b(3));
                        if (!this.a(var8, (byte) -112)) {
                          var5.field_ib = 16733525;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      this.field_o.d((byte) -113);
                      this.a(true, var8);
                      this.field_g = null;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (var6 != 0) {
                    break L7;
                  } else {
                    return true;
                  }
                }
              }
              if (param2 != 98) {
                L10: {
                  if (99 == param2) {
                    break L10;
                  } else {
                    L11: {
                      if (param2 != 80) {
                        break L11;
                      } else {
                        this.e(param0 + 21375);
                        if (var6 != 0) {
                          break L11;
                        } else {
                          return true;
                        }
                      }
                    }
                    discarded$11 = this.field_o.a(param2, param0 + -19624, param1);
                    if (var6 != 0) {
                      break L10;
                    } else {
                      return true;
                    }
                  }
                }
                if (this.field_g != null) {
                  if (this.field_s.field_e == this.field_g.field_e) {
                    return true;
                  } else {
                    this.field_g = (gka) ((Object) this.field_g.field_e);
                    this.field_o.a((byte) 74, this.field_g.field_h);
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                if (this.field_g != null) {
                  if (this.field_g.field_a == this.field_s.field_e) {
                    return true;
                  } else {
                    L12: {
                      stackOut_32_0 = this;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (null != this.field_g) {
                        stackOut_34_0 = this;
                        stackOut_34_1 = this.field_g.field_a;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L12;
                      } else {
                        stackOut_33_0 = this;
                        stackOut_33_1 = this.field_s.f(-80);
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        break L12;
                      }
                    }
                    L13: {
                      ((uta) (this)).field_g = (gka) ((Object) stackIn_35_1);
                      if (this.field_g == null) {
                        break L13;
                      } else {
                        this.field_o.a((byte) 12, this.field_g.field_h);
                        if (var6 == 0) {
                          break L13;
                        } else {
                          L14: {
                            if (99 == param2) {
                              break L14;
                            } else {
                              L15: {
                                if (param2 != 80) {
                                  break L15;
                                } else {
                                  this.e(param0 + 21375);
                                  break L15;
                                }
                              }
                              discarded$12 = this.field_o.a(param2, param0 + -19624, param1);
                              if (var6 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (this.field_g == null) {
                            break L13;
                          } else {
                            if (this.field_s.field_e != this.field_g.field_e) {
                              this.field_g = (gka) ((Object) this.field_g.field_e);
                              this.field_o.a((byte) 74, this.field_g.field_h);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    return true;
                  }
                } else {
                  L16: {
                    stackOut_16_0 = this;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (null != this.field_g) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = this.field_g.field_a;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L16;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = this.field_s.f(-80);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L16;
                    }
                  }
                  L17: {
                    ((uta) (this)).field_g = (gka) ((Object) stackIn_19_1);
                    if (this.field_g == null) {
                      break L17;
                    } else {
                      this.field_o.a((byte) 12, this.field_g.field_h);
                      if (var6 == 0) {
                        break L17;
                      } else {
                        L18: {
                          if (99 == param2) {
                            break L18;
                          } else {
                            L19: {
                              if (param2 != 80) {
                                break L19;
                              } else {
                                this.e(param0 + 21375);
                                break L19;
                              }
                            }
                            discarded$13 = this.field_o.a(param2, param0 + -19624, param1);
                            if (var6 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (this.field_g == null) {
                          break L17;
                        } else {
                          if (this.field_s.field_e != this.field_g.field_e) {
                            this.field_g = (gka) ((Object) this.field_g.field_e);
                            this.field_o.a((byte) 74, this.field_g.field_h);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            this.d(2);
            return true;
          }
        }
    }

    final void a(int param0, String param1) {
        try {
            this.a(24219, param1, 13421772);
            int var3_int = 22 / ((param0 - 82) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uta.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, Object param1) {
        try {
            if (param0 > -15) {
                field_f = (String[]) null;
            }
            this.a(126, param1 != null ? param1.toString() : "null");
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uta.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void e(int param0);

    abstract boolean a(String param0, byte param1);

    private final void d(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (this.field_j) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((uta) (this)).field_j = stackIn_3_1 != 0;
        if (param0 == 2) {
          if (!this.field_j) {
            if (null == this.field_i) {
              return;
            } else {
              this.field_i.a(param0 ^ -125, (jea) null);
              return;
            }
          } else {
            this.field_q = 15;
            if (null != this.field_i) {
              this.field_i.a(param0 ^ -112, this.field_o);
              if (!TombRacer.field_G) {
                return;
              } else {
                L1: {
                  if (null != this.field_i) {
                    this.field_i.a(param0 ^ -125, (jea) null);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.a(false, false);
          if (this.field_j) {
            this.field_q = 15;
            if (null != this.field_i) {
              this.field_i.a(param0 ^ -112, this.field_o);
              if (TombRacer.field_G) {
                if (null == this.field_i) {
                  return;
                } else {
                  this.field_i.a(param0 ^ -125, (jea) null);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L2: {
              if (null != this.field_i) {
                this.field_i.a(param0 ^ -125, (jea) null);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    public final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (!this.field_j) {
            if (!this.field_j) {
              if ((this.field_i.field_T - -200 ^ -1) < -1) {
                this.field_i.field_T = this.field_i.field_T - 28;
                if (var6 == 0) {
                  L1: {
                    if (!this.field_o.e((byte) -117).equals(this.field_r)) {
                      break L1;
                    } else {
                      if (this.field_o.j(-1320) != this.field_c) {
                        break L1;
                      } else {
                        this.field_h = this.field_h + 1;
                        this.field_i.c(83, param1);
                        this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                        this.field_o.h((byte) 87);
                        return;
                      }
                    }
                  }
                  this.field_r = this.field_o.e((byte) -121);
                  this.field_c = this.field_o.j(-1320);
                  this.field_b = this.a(false);
                  if (this.field_b != null) {
                    if (-1 != (this.field_b.length ^ -1)) {
                      L2: {
                        if (null == this.field_b) {
                          break L2;
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L3: while (true) {
                            L4: {
                              L5: {
                                if (var4 >= this.field_b.length) {
                                  break L5;
                                } else {
                                  var5 = this.field_m.b(this.field_b[var4]);
                                  if (var6 != 0) {
                                    break L4;
                                  } else {
                                    L6: {
                                      if (var3 >= var5) {
                                        break L6;
                                      } else {
                                        var3 = var5;
                                        break L6;
                                      }
                                    }
                                    var4++;
                                    if (var6 == 0) {
                                      continue L3;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              this.field_p.field_G = 20 + var3;
                              break L4;
                            }
                            this.field_p.field_t = this.field_b.length * this.field_k + 15;
                            break L2;
                          }
                        }
                      }
                      this.field_h = this.field_h + 1;
                      this.field_i.c(83, param1);
                      this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                      this.field_o.h((byte) 87);
                      return;
                    } else {
                      L7: {
                        this.field_b = null;
                        if (null == this.field_b) {
                          break L7;
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L8: while (true) {
                            L9: {
                              L10: {
                                if (var4 >= this.field_b.length) {
                                  break L10;
                                } else {
                                  var5 = this.field_m.b(this.field_b[var4]);
                                  if (var6 != 0) {
                                    break L9;
                                  } else {
                                    L11: {
                                      if (var3 >= var5) {
                                        break L11;
                                      } else {
                                        var3 = var5;
                                        break L11;
                                      }
                                    }
                                    var4++;
                                    if (var6 == 0) {
                                      continue L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              this.field_p.field_G = 20 + var3;
                              break L9;
                            }
                            this.field_p.field_t = this.field_b.length * this.field_k + 15;
                            break L7;
                          }
                        }
                      }
                      this.field_h = this.field_h + 1;
                      this.field_i.c(83, param1);
                      this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                      this.field_o.h((byte) 87);
                      return;
                    }
                  } else {
                    L12: {
                      if (null == this.field_b) {
                        break L12;
                      } else {
                        var3 = 0;
                        var4 = 0;
                        L13: while (true) {
                          L14: {
                            L15: {
                              if (var4 >= this.field_b.length) {
                                break L15;
                              } else {
                                var5 = this.field_m.b(this.field_b[var4]);
                                if (var6 != 0) {
                                  break L14;
                                } else {
                                  L16: {
                                    if (var3 >= var5) {
                                      break L16;
                                    } else {
                                      var3 = var5;
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  if (var6 == 0) {
                                    continue L13;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            this.field_p.field_G = 20 + var3;
                            break L14;
                          }
                          this.field_p.field_t = this.field_b.length * this.field_k + 15;
                          break L12;
                        }
                      }
                    }
                    this.field_h = this.field_h + 1;
                    this.field_i.c(83, param1);
                    this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                    this.field_o.h((byte) 87);
                    return;
                  }
                } else {
                  break L0;
                }
              } else {
                if (this.field_o.e((byte) -117).equals(this.field_r)) {
                  if (this.field_o.j(-1320) != this.field_c) {
                    this.field_r = this.field_o.e((byte) -121);
                    this.field_c = this.field_o.j(-1320);
                    this.field_b = this.a(false);
                    if (this.field_b != null) {
                      if (-1 != (this.field_b.length ^ -1)) {
                        L17: {
                          if (null == this.field_b) {
                            break L17;
                          } else {
                            var3 = 0;
                            var4 = 0;
                            L18: while (true) {
                              L19: {
                                L20: {
                                  if (var4 >= this.field_b.length) {
                                    break L20;
                                  } else {
                                    var5 = this.field_m.b(this.field_b[var4]);
                                    if (var6 != 0) {
                                      break L19;
                                    } else {
                                      L21: {
                                        if (var3 >= var5) {
                                          break L21;
                                        } else {
                                          var3 = var5;
                                          break L21;
                                        }
                                      }
                                      var4++;
                                      if (var6 == 0) {
                                        continue L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                this.field_p.field_G = 20 + var3;
                                break L19;
                              }
                              this.field_p.field_t = this.field_b.length * this.field_k + 15;
                              break L17;
                            }
                          }
                        }
                        this.field_h = this.field_h + 1;
                        this.field_i.c(83, param1);
                        this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                        this.field_o.h((byte) 87);
                        return;
                      } else {
                        L22: {
                          this.field_b = null;
                          if (null == this.field_b) {
                            break L22;
                          } else {
                            var3 = 0;
                            var4 = 0;
                            L23: while (true) {
                              L24: {
                                L25: {
                                  if (var4 >= this.field_b.length) {
                                    break L25;
                                  } else {
                                    var5 = this.field_m.b(this.field_b[var4]);
                                    if (var6 != 0) {
                                      break L24;
                                    } else {
                                      L26: {
                                        if (var3 >= var5) {
                                          break L26;
                                        } else {
                                          var3 = var5;
                                          break L26;
                                        }
                                      }
                                      var4++;
                                      if (var6 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                                this.field_p.field_G = 20 + var3;
                                break L24;
                              }
                              this.field_p.field_t = this.field_b.length * this.field_k + 15;
                              break L22;
                            }
                          }
                        }
                        this.field_h = this.field_h + 1;
                        this.field_i.c(83, param1);
                        this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                        this.field_o.h((byte) 87);
                        return;
                      }
                    } else {
                      L27: {
                        if (null == this.field_b) {
                          break L27;
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L28: while (true) {
                            L29: {
                              L30: {
                                if (var4 >= this.field_b.length) {
                                  break L30;
                                } else {
                                  var5 = this.field_m.b(this.field_b[var4]);
                                  if (var6 != 0) {
                                    break L29;
                                  } else {
                                    L31: {
                                      if (var3 >= var5) {
                                        break L31;
                                      } else {
                                        var3 = var5;
                                        break L31;
                                      }
                                    }
                                    var4++;
                                    if (var6 == 0) {
                                      continue L28;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                              this.field_p.field_G = 20 + var3;
                              break L29;
                            }
                            this.field_p.field_t = this.field_b.length * this.field_k + 15;
                            break L27;
                          }
                        }
                      }
                      this.field_h = this.field_h + 1;
                      this.field_i.c(83, param1);
                      this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                      this.field_o.h((byte) 87);
                      return;
                    }
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_i.c(83, param1);
                    this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                    this.field_o.h((byte) 87);
                    return;
                  }
                } else {
                  L32: {
                    this.field_r = this.field_o.e((byte) -121);
                    this.field_c = this.field_o.j(-1320);
                    this.field_b = this.a(false);
                    if (this.field_b == null) {
                      break L32;
                    } else {
                      if (-1 == (this.field_b.length ^ -1)) {
                        this.field_b = null;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L33: {
                    if (null == this.field_b) {
                      break L33;
                    } else {
                      var3 = 0;
                      var4 = 0;
                      L34: while (true) {
                        L35: {
                          L36: {
                            if (var4 >= this.field_b.length) {
                              break L36;
                            } else {
                              var5 = this.field_m.b(this.field_b[var4]);
                              if (var6 != 0) {
                                break L35;
                              } else {
                                L37: {
                                  if (var3 >= var5) {
                                    break L37;
                                  } else {
                                    var3 = var5;
                                    break L37;
                                  }
                                }
                                var4++;
                                if (var6 == 0) {
                                  continue L34;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                          this.field_p.field_G = 20 + var3;
                          break L35;
                        }
                        this.field_p.field_t = this.field_b.length * this.field_k + 15;
                        break L33;
                      }
                    }
                  }
                  this.field_h = this.field_h + 1;
                  this.field_i.c(83, param1);
                  this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                  this.field_o.h((byte) 87);
                  return;
                }
              }
            } else {
              L38: {
                if (!this.field_o.e((byte) -117).equals(this.field_r)) {
                  break L38;
                } else {
                  if (this.field_o.j(-1320) != this.field_c) {
                    break L38;
                  } else {
                    this.field_h = this.field_h + 1;
                    this.field_i.c(83, param1);
                    this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                    this.field_o.h((byte) 87);
                    return;
                  }
                }
              }
              this.field_r = this.field_o.e((byte) -121);
              this.field_c = this.field_o.j(-1320);
              this.field_b = this.a(false);
              if (this.field_b != null) {
                if (-1 != (this.field_b.length ^ -1)) {
                  L39: {
                    if (null == this.field_b) {
                      break L39;
                    } else {
                      var3 = 0;
                      var4 = 0;
                      L40: while (true) {
                        L41: {
                          L42: {
                            if (var4 >= this.field_b.length) {
                              break L42;
                            } else {
                              var5 = this.field_m.b(this.field_b[var4]);
                              if (var6 != 0) {
                                break L41;
                              } else {
                                L43: {
                                  if (var3 >= var5) {
                                    break L43;
                                  } else {
                                    var3 = var5;
                                    break L43;
                                  }
                                }
                                var4++;
                                if (var6 == 0) {
                                  continue L40;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                          this.field_p.field_G = 20 + var3;
                          break L41;
                        }
                        this.field_p.field_t = this.field_b.length * this.field_k + 15;
                        break L39;
                      }
                    }
                  }
                  this.field_h = this.field_h + 1;
                  this.field_i.c(83, param1);
                  this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                  this.field_o.h((byte) 87);
                  return;
                } else {
                  L44: {
                    this.field_b = null;
                    if (null == this.field_b) {
                      break L44;
                    } else {
                      var3 = 0;
                      var4 = 0;
                      L45: while (true) {
                        L46: {
                          L47: {
                            if (var4 >= this.field_b.length) {
                              break L47;
                            } else {
                              var5 = this.field_m.b(this.field_b[var4]);
                              if (var6 != 0) {
                                break L46;
                              } else {
                                L48: {
                                  if (var3 >= var5) {
                                    break L48;
                                  } else {
                                    var3 = var5;
                                    break L48;
                                  }
                                }
                                var4++;
                                if (var6 == 0) {
                                  continue L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          this.field_p.field_G = 20 + var3;
                          break L46;
                        }
                        this.field_p.field_t = this.field_b.length * this.field_k + 15;
                        break L44;
                      }
                    }
                  }
                  this.field_h = this.field_h + 1;
                  this.field_i.c(83, param1);
                  this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                  this.field_o.h((byte) 87);
                  return;
                }
              } else {
                L49: {
                  if (null == this.field_b) {
                    break L49;
                  } else {
                    var3 = 0;
                    var4 = 0;
                    L50: while (true) {
                      L51: {
                        L52: {
                          if (var4 >= this.field_b.length) {
                            break L52;
                          } else {
                            var5 = this.field_m.b(this.field_b[var4]);
                            if (var6 != 0) {
                              break L51;
                            } else {
                              L53: {
                                if (var3 >= var5) {
                                  break L53;
                                } else {
                                  var3 = var5;
                                  break L53;
                                }
                              }
                              var4++;
                              if (var6 == 0) {
                                continue L50;
                              } else {
                                break L52;
                              }
                            }
                          }
                        }
                        this.field_p.field_G = 20 + var3;
                        break L51;
                      }
                      this.field_p.field_t = this.field_b.length * this.field_k + 15;
                      break L49;
                    }
                  }
                }
                this.field_h = this.field_h + 1;
                this.field_i.c(83, param1);
                this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
                this.field_o.h((byte) 87);
                return;
              }
            }
          } else {
            if ((this.field_q ^ -1) < -1) {
              break L0;
            } else {
              L54: {
                if (this.field_j) {
                  break L54;
                } else {
                  if ((this.field_i.field_T - -200 ^ -1) < -1) {
                    this.field_i.field_T = this.field_i.field_T - 28;
                    if (var6 == 0) {
                      break L54;
                    } else {
                      this.field_q = this.field_q - 1;
                      this.field_i.field_T = this.field_q * (this.field_q * -200) / 225;
                      break L54;
                    }
                  } else {
                    break L54;
                  }
                }
              }
              L55: {
                L56: {
                  if (!this.field_o.e((byte) -117).equals(this.field_r)) {
                    break L56;
                  } else {
                    if (this.field_o.j(-1320) != this.field_c) {
                      break L56;
                    } else {
                      break L55;
                    }
                  }
                }
                L57: {
                  this.field_r = this.field_o.e((byte) -121);
                  this.field_c = this.field_o.j(-1320);
                  this.field_b = this.a(false);
                  if (this.field_b == null) {
                    break L57;
                  } else {
                    if (-1 == (this.field_b.length ^ -1)) {
                      this.field_b = null;
                      break L57;
                    } else {
                      break L57;
                    }
                  }
                }
                if (null == this.field_b) {
                  break L55;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L58: while (true) {
                    L59: {
                      L60: {
                        if (var4 >= this.field_b.length) {
                          break L60;
                        } else {
                          var5 = this.field_m.b(this.field_b[var4]);
                          if (var6 != 0) {
                            break L59;
                          } else {
                            L61: {
                              if (var3 >= var5) {
                                break L61;
                              } else {
                                var3 = var5;
                                break L61;
                              }
                            }
                            var4++;
                            if (var6 == 0) {
                              continue L58;
                            } else {
                              break L60;
                            }
                          }
                        }
                      }
                      this.field_p.field_G = 20 + var3;
                      break L59;
                    }
                    this.field_p.field_t = this.field_b.length * this.field_k + 15;
                    break L55;
                  }
                }
              }
              this.field_h = this.field_h + 1;
              this.field_i.c(83, param1);
              this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
              this.field_o.h((byte) 87);
              return;
            }
          }
        }
        L62: {
          this.field_q = this.field_q - 1;
          this.field_i.field_T = this.field_q * (this.field_q * -200) / 225;
          if (!this.field_o.e((byte) -117).equals(this.field_r)) {
            break L62;
          } else {
            if (this.field_o.j(-1320) != this.field_c) {
              break L62;
            } else {
              this.field_h = this.field_h + 1;
              this.field_i.c(83, param1);
              this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
              this.field_o.h((byte) 87);
              return;
            }
          }
        }
        this.field_r = this.field_o.e((byte) -121);
        this.field_c = this.field_o.j(-1320);
        this.field_b = this.a(false);
        if (this.field_b != null) {
          if (-1 != (this.field_b.length ^ -1)) {
            L63: {
              if (null == this.field_b) {
                break L63;
              } else {
                var3 = 0;
                var4 = 0;
                L64: while (true) {
                  L65: {
                    L66: {
                      if (var4 >= this.field_b.length) {
                        break L66;
                      } else {
                        var5 = this.field_m.b(this.field_b[var4]);
                        if (var6 != 0) {
                          break L65;
                        } else {
                          L67: {
                            if (var3 >= var5) {
                              break L67;
                            } else {
                              var3 = var5;
                              break L67;
                            }
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L64;
                          } else {
                            break L66;
                          }
                        }
                      }
                    }
                    this.field_p.field_G = 20 + var3;
                    break L65;
                  }
                  this.field_p.field_t = this.field_b.length * this.field_k + 15;
                  break L63;
                }
              }
            }
            this.field_h = this.field_h + 1;
            this.field_i.c(83, param1);
            this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
            this.field_o.h((byte) 87);
            return;
          } else {
            L68: {
              this.field_b = null;
              if (null == this.field_b) {
                break L68;
              } else {
                var3 = 0;
                var4 = 0;
                L69: while (true) {
                  L70: {
                    L71: {
                      if (var4 >= this.field_b.length) {
                        break L71;
                      } else {
                        var5 = this.field_m.b(this.field_b[var4]);
                        if (var6 != 0) {
                          break L70;
                        } else {
                          L72: {
                            if (var3 >= var5) {
                              break L72;
                            } else {
                              var3 = var5;
                              break L72;
                            }
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L69;
                          } else {
                            break L71;
                          }
                        }
                      }
                    }
                    this.field_p.field_G = 20 + var3;
                    break L70;
                  }
                  this.field_p.field_t = this.field_b.length * this.field_k + 15;
                  break L68;
                }
              }
            }
            this.field_h = this.field_h + 1;
            this.field_i.c(83, param1);
            this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
            this.field_o.h((byte) 87);
            return;
          }
        } else {
          L73: {
            if (null == this.field_b) {
              break L73;
            } else {
              var3 = 0;
              var4 = 0;
              L74: while (true) {
                L75: {
                  L76: {
                    if (var4 >= this.field_b.length) {
                      break L76;
                    } else {
                      var5 = this.field_m.b(this.field_b[var4]);
                      if (var6 != 0) {
                        break L75;
                      } else {
                        L77: {
                          if (var3 >= var5) {
                            break L77;
                          } else {
                            var3 = var5;
                            break L77;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L74;
                        } else {
                          break L76;
                        }
                      }
                    }
                  }
                  this.field_p.field_G = 20 + var3;
                  break L75;
                }
                this.field_p.field_t = this.field_b.length * this.field_k + 15;
                break L73;
              }
            }
          }
          this.field_h = this.field_h + 1;
          this.field_i.c(83, param1);
          this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
          this.field_o.h((byte) 87);
          return;
        }
    }

    final static bb a(int param0, int param1, int param2, int param3, int param4) {
        Object var5 = null;
        bb var5_ref = null;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param2 == 0) {
          var5_ref = (bb) ((Object) mg.field_b.f(-80));
          L0: while (true) {
            if (var5_ref != null) {
              stackOut_5_0 = param1;
              stackOut_5_1 = var5_ref.field_n;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (var6 == 0) {
                if (stackIn_7_0 == stackIn_7_1) {
                  return var5_ref;
                } else {
                  var5_ref = (bb) ((Object) mg.field_b.e(126));
                  continue L0;
                }
              } else {
                pc.a(stackIn_6_0 != 0, stackIn_6_1, var5_ref);
                return var5_ref;
              }
            } else {
              var5_ref = new bb();
              var5_ref.field_j = param3;
              var5_ref.field_i = param4;
              var5_ref.field_n = param1;
              mg.field_b.b((byte) -48, var5_ref);
              pc.a(false, param0, var5_ref);
              return var5_ref;
            }
          }
        } else {
          field_f = (String[]) null;
          var5_ref = (bb) ((Object) mg.field_b.f(-80));
          L1: while (true) {
            if (var5_ref != null) {
              stackOut_15_0 = param1;
              stackOut_15_1 = var5_ref.field_n;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              if (var6 == 0) {
                if (stackIn_17_0 == stackIn_17_1) {
                  return var5_ref;
                } else {
                  var5_ref = (bb) ((Object) mg.field_b.e(126));
                  continue L1;
                }
              } else {
                pc.a(stackIn_16_0 != 0, stackIn_16_1, var5_ref);
                return var5_ref;
              }
            } else {
              var5_ref = new bb();
              var5_ref.field_j = param3;
              var5_ref.field_i = param4;
              var5_ref.field_n = param1;
              mg.field_b.b((byte) -48, var5_ref);
              pc.a(false, param0, var5_ref);
              return var5_ref;
            }
          }
        }
    }

    private final void b(String param0, int param1, int param2) {
        vg discarded$2 = null;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        jea var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_a.field_tb.b(param2 ^ -155, this.a(param0, 16733525, param1));
              if ((this.field_a.field_tb.field_J.a((byte) -16) ^ -1) >= -257) {
                break L1;
              } else {
                discarded$2 = this.field_a.field_tb.field_J.c(-106);
                break L1;
              }
            }
            var4_int = 5;
            var5 = (jea) ((Object) this.field_a.field_tb.field_J.f(-80));
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    var5.field_T = var4_int;
                    var4_int = var4_int + this.field_k;
                    var5 = (jea) ((Object) this.field_a.field_tb.field_J.e(116));
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
                L5: {
                  if (param2 == 230) {
                    break L5;
                  } else {
                    this.field_i = (jea) null;
                    break L5;
                  }
                }
                this.field_a.field_tb.field_t = var4_int;
                this.field_a.field_tb.field_T = -var4_int + this.field_a.field_t;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("uta.U(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    uta(il param0, fia param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        jea var4 = null;
        jea var5 = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
        jea var9 = null;
        jea var10 = null;
        jea var11 = null;
        jea var12 = null;
        oj var13 = null;
        jea var14 = null;
        jea var15 = null;
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
        this.field_t = "# ";
        this.field_s = new vna();
        this.field_j = false;
        this.field_h = 0;
        this.field_b = null;
        this.field_q = 0;
        try {
          L0: {
            this.field_m = param0;
            this.field_k = this.field_m.field_w + this.field_m.field_k;
            var3_int = 4 + this.field_k;
            var4 = this.a((byte) 104, 65793);
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a(7829367, (byte) 31, 2236962);
            var9 = this.a(65793, (byte) 21, 65793);
            var10 = this.a(3355443, (byte) -126, 65793);
            var11 = this.a(-91, 2263074);
            var12 = this.a(2236962, (byte) -125, 65793);
            this.field_i = new jea(0L, var5);
            this.field_i.a(mma.field_a, 200, -23776, -200, 0);
            var13 = new oj(0L, var8, var8, var9, var10);
            var14 = new jea();
            var14.field_J = new vna();
            this.field_a = new iv(0L, var14, var6, var13);
            this.field_a.field_tb.field_J = new vna();
            this.field_a.a(this.field_i.field_G + -10, 0, (byte) 127, 5, 15, -var3_int + 185, 5);
            this.field_i.b(-128, this.field_a);
            var15 = new jea();
            var15.field_H = this.field_m;
            var15.field_ib = 13421772;
            var15.field_S = 5;
            var15.field_V = 2;
            this.field_o = new sw(0L, var7, var11, var15);
            this.field_o.b(this.field_a.field_G, 127, this.field_a.field_T + this.field_a.field_t + 5, var3_int, this.field_a.field_qb);
            this.field_o.a(param1, (byte) -127);
            this.field_i.b(-126, this.field_o);
            this.field_p = new jea(0L, var12);
            this.field_p.field_qb = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("uta.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_l = new String[2];
        field_l[1] = "Lava";
        field_l[0] = "Normal";
        field_n = "Death penalty <%0>";
        field_f = new String[9];
        field_f[4] = "Room: Windy";
        field_f[5] = "Room: Lights Out";
        field_f[7] = "Flip";
        field_f[2] = "Weapon Jammed";
        field_f[8] = "Tremors";
        field_f[6] = "Monsters";
        field_f[0] = "Slow Player";
        field_f[3] = "Difficulty Up";
        field_f[1] = "Invert Controls";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
