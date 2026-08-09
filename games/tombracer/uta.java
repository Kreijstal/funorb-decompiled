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
        gka var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                this.field_s.c((byte) 22);
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
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("uta.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        vna var9 = null;
        gka var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -10 + this.field_a.field_G - 15;
              var5 = rga.a(32287, param1, '\n');
              if (param0 == 24219) {
                break L1;
              } else {
                this.a(-59);
                break L1;
              }
            }
            var6 = var5;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6.length) {
                break L0;
              } else {
                L3: {
                  var8 = var6[var7];
                  if (var4_int <= this.field_m.b(var8)) {
                    var9 = this.a(var4_int, true, var8);
                    var10 = (gka) ((Object) var9.f(param0 ^ -24277));
                    L4: while (true) {
                      if (var10 == null) {
                        break L3;
                      } else {
                        this.b(var10.field_h, param2, 230);
                        var10 = (gka) ((Object) var9.e(param0 ^ 24289));
                        continue L4;
                      }
                    }
                  } else {
                    this.b(var8, param2, param0 + -23989);
                    break L3;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("uta.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    private final vna a(int param0, boolean param1, String param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        vna stackIn_25_0 = null;
        vna stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vna var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = new vna();
            L1: while (true) {
              if (param2 == null) {
                if (param1) {
                  stackIn_27_0 = (vna) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_25_0 = (vna) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var5 = this.field_m.b(param2);
                  var6 = param2;
                  if (var5 > param0) {
                    var7 = -1 + param2.length();
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (var7 <= 0) {
                              break L6;
                            } else {
                              stackIn_12_0 = var5;

                              stackIn_12_1 = param0;

                              L7: {
                                if (stackIn_12_0 > stackIn_12_1) {
                                  break L7;
                                } else {
                                  if (32 == param2.charAt(var7)) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              incrementValue$0 = var7;
                              var7--;
                              var5 = var5 - this.field_m.a(param2.charAt(incrementValue$0));
                              continue L3;
                            }
                          }
                          if (var7 == 0) {
                            break L5;
                          } else {
                            var9 = param2.substring(0, var7);
                            param2 = param2.substring(var7 + 1);
                            var4.b((byte) -128, new gka(var9));
                            continue L1;
                          }
                        }
                        var5 = this.field_m.b(param2);
                        var7 = param2.length() + -1;
                        L8: while (true) {
                          if (var5 <= param0) {
                            break L4;
                          } else {
                            incrementValue$1 = var7;
                            var7--;
                            var5 = var5 - this.field_m.a(param2.charAt(incrementValue$1));
                            continue L8;
                          }
                        }
                      }
                      var6 = param2.substring(0, var7);
                      param2 = param2.substring(var7 + 1);
                      break L2;
                    }
                  } else {
                    param2 = null;
                    break L2;
                  }
                }
                var4.b((byte) -128, new gka(var6));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("uta.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0;
        } else {
          return stackIn_27_0;
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
        jea stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jea stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            uta.c(24);
            break L0;
          }
        }
        L1: {
          if ((this.field_i.field_t + this.field_i.field_T ^ -1) < -1) {
            L2: {
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
                break L2;
              } else {
                break L2;
              }
            }
            bea.c(this.field_i.field_q, this.field_i.field_t + this.field_i.field_A, this.field_i.field_G, -this.field_i.field_t + qf.field_i + -this.field_i.field_A, 0, var2 >> -859749791);
            var3 = this.field_i.field_t + (this.field_i.field_T - -5);
            var4 = 0;
            L3: while (true) {
              if (6 <= var4) {
                L4: {
                  stackIn_12_0 = this.field_i;

                  stackIn_12_1 = 100;

                  if ((this.field_h & 8) != 0) {
                    stackIn_13_0 = (jea) ((Object) stackIn_12_0);
                    stackIn_13_1 = stackIn_12_1;
                    stackIn_13_2 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = (jea) ((Object) stackIn_12_0);
                    stackIn_13_1 = stackIn_12_1;
                    stackIn_13_2 = 1;
                    break L4;
                  }
                }
                ((jea) (Object) stackIn_13_0).b(stackIn_13_1, stackIn_13_2 != 0);
                break L1;
              } else {
                bea.c(0, var3, mma.field_a, 0, var4 << -173144219);
                var3--;
                var4++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        L5: {
          if (this.field_b == null) {
            break L5;
          } else {
            if (this.field_j) {
              var2 = this.field_i.field_t + this.field_i.field_T;
              this.field_p.field_T = var2;
              this.field_p.b(74, false);
              var2 = var2 + (5 + this.field_k);
              var3 = 0;
              L6: while (true) {
                if (this.field_b.length <= var3) {
                  break L5;
                } else {
                  this.field_m.c(this.field_b[var3], this.field_p.field_q + 10, var2, 13421772, -1);
                  var2 = var2 + this.field_k;
                  var3++;
                  continue L6;
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param2 != ns.field_g) {
            ht.field_Fb = new int[param2];
            for (var3_int = 0; var3_int < param2; var3_int++) {
                ht.field_Fb[var3_int] = (var3_int << -1794479700) / param2;
            }
            ooa.field_g = 32 * param2;
            una.field_b = -1 + param2;
            ns.field_g = param2;
        }
        if (param0 != 0) {
            return;
        }
        try {
            if (param1 != qda.field_i) {
                if (param1 == ns.field_g) {
                    sj.field_b = ht.field_Fb;
                } else {
                    sj.field_b = new int[param1];
                    for (var3_int = 0; param1 > var3_int; var3_int++) {
                        sj.field_b[var3_int] = (var3_int << -1499956788) / param1;
                    }
                }
                hba.field_b = -1 + param1;
                qda.field_i = param1;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uta.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final jea a(byte param0, int param1) {
        jea var3 = new jea();
        if (param0 <= 80) {
            String var4 = (String) null;
            this.a(true, (String) null);
        }
        var3.field_w = sva.a(param1, 0, 4);
        return var3;
    }

    private final jea a(String param0, int param1, int param2) {
        jea var4 = null;
        RuntimeException var4_ref = null;
        jea stackIn_2_0 = null;
        jea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new jea(0L, (jea) null, param0);
            if (param1 == 16733525) {
              var4.field_H = this.field_m;
              var4.field_ib = param2;
              var4.a(this.field_m.b(var4.field_r), this.field_k, -23776, 0, 5);
              stackIn_4_0 = (jea) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jea) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("uta.J(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public boolean a(byte param0, char param1, int param2) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        vg stackIn_19_1 = null;
        jea var5;
        int var6;
        String var7;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 == -72) {
            break L0;
          } else {
            field_l = (String[]) null;
            break L0;
          }
        }
        if (96 == param1) {
          this.d(2);
          return true;
        } else {
          if (this.field_j) {
            L1: {
              if (84 != param2) {
                if (param2 != 98) {
                  if (99 == param2) {
                    if (this.field_g == null) {
                      break L1;
                    } else {
                      if (this.field_s.field_e != this.field_g.field_e) {
                        this.field_g = (gka) ((Object) this.field_g.field_e);
                        this.field_o.a((byte) 74, this.field_g.field_h);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    if (param2 != 80) {
                      this.field_o.a(param2, param0 + -19624, param1);
                      break L1;
                    } else {
                      this.e(param0 + 21375);
                      break L1;
                    }
                  }
                } else {
                  L2: {
                    if (this.field_g == null) {
                      break L2;
                    } else {
                      if (this.field_g.field_a != this.field_s.field_e) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    stackIn_18_0 = this;

                    if (null != this.field_g) {
                      stackIn_19_0 = this;
                      stackIn_19_1 = this.field_g.field_a;
                      break L3;
                    } else {
                      stackIn_19_0 = this;
                      stackIn_19_1 = this.field_s.f(-80);
                      break L3;
                    }
                  }
                  ((uta) (this)).field_g = (gka) ((Object) stackIn_19_1);
                  if (this.field_g == null) {
                    break L1;
                  } else {
                    this.field_o.a((byte) 12, this.field_g.field_h);
                    break L1;
                  }
                }
              } else {
                var7 = this.field_o.e((byte) -124);
                if ((var7.length() ^ -1) < -1) {
                  L4: {
                    this.a(24219, this.field_t + var7, 5635925);
                    var5 = (jea) ((Object) this.field_a.field_tb.field_J.b(3));
                    if (!this.a(var7, (byte) -112)) {
                      var5.field_ib = 16733525;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_o.d((byte) -113);
                  this.a(true, var7);
                  this.field_g = null;
                  break L1;
                } else {
                  return true;
                }
              }
            }
            return true;
          } else {
            return false;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (this.field_j) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          ((uta) (this)).field_j = stackIn_3_1 != 0;
          if (param0 == 2) {
            break L1;
          } else {
            this.a(false, false);
            break L1;
          }
        }
        L2: {
          if (!this.field_j) {
            if (null != this.field_i) {
              this.field_i.a(param0 ^ -125, (jea) null);
              break L2;
            } else {
              break L2;
            }
          } else {
            this.field_q = 15;
            if (null == this.field_i) {
              break L2;
            } else {
              this.field_i.a(param0 ^ -112, this.field_o);
              break L2;
            }
          }
        }
    }

    public final void a(boolean param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            if (!this.field_j) {
              break L1;
            } else {
              if ((this.field_q ^ -1) < -1) {
                this.field_q = this.field_q - 1;
                this.field_i.field_T = this.field_q * (this.field_q * -200) / 225;
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.field_j) {
            break L0;
          } else {
            if ((this.field_i.field_T - -200 ^ -1) < -1) {
              this.field_i.field_T = this.field_i.field_T - 28;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (!this.field_o.e((byte) -117).equals(this.field_r)) {
              break L3;
            } else {
              if (this.field_o.j(-1320) != this.field_c) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          L4: {
            this.field_r = this.field_o.e((byte) -121);
            this.field_c = this.field_o.j(-1320);
            this.field_b = this.a(false);
            if (this.field_b == null) {
              break L4;
            } else {
              if (-1 == (this.field_b.length ^ -1)) {
                this.field_b = null;
                break L4;
              } else {
                break L4;
              }
            }
          }
          if (null == this.field_b) {
            break L2;
          } else {
            var3 = 0;
            var4 = 0;
            L5: while (true) {
              if (var4 >= this.field_b.length) {
                this.field_p.field_G = 20 + var3;
                this.field_p.field_t = this.field_b.length * this.field_k + 15;
                break L2;
              } else {
                var5 = this.field_m.b(this.field_b[var4]);
                if (var3 < var5) {
                  var3 = var5;
                  var4++;
                  continue L5;
                } else {
                  var4++;
                  continue L5;
                }
              }
            }
          }
        }
        this.field_h = this.field_h + 1;
        this.field_i.c(83, param1);
        this.field_a.b(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
        this.field_o.h((byte) 87);
    }

    final static bb a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param2 != 0) {
            field_f = (String[]) null;
        }
        bb var5 = (bb) ((Object) mg.field_b.f(-80));
        while (var5 != null) {
            if (!(param1 != var5.field_n)) {
                return var5;
            }
            var5 = (bb) ((Object) mg.field_b.e(126));
        }
        var5 = new bb();
        var5.field_j = param3;
        var5.field_i = param4;
        var5.field_n = param1;
        mg.field_b.b((byte) -48, var5);
        pc.a(false, param0, var5);
        return var5;
    }

    private final void b(String param0, int param1, int param2) {
        int var4_int = 0;
        jea var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
            this.field_a.field_tb.b(param2 ^ -155, this.a(param0, 16733525, param1));
            if ((this.field_a.field_tb.field_J.a((byte) -16) ^ -1) < -257) {
                this.field_a.field_tb.field_J.c(-106);
            }
            var4_int = 5;
            var5 = (jea) ((Object) this.field_a.field_tb.field_J.f(-80));
            while (var5 != null) {
                var5.field_T = var4_int;
                var4_int = var4_int + this.field_k;
                var5 = (jea) ((Object) this.field_a.field_tb.field_J.e(116));
            }
            if (param2 != 230) {
                this.field_i = (jea) null;
            }
            this.field_a.field_tb.field_t = var4_int;
            this.field_a.field_tb.field_T = -var4_int + this.field_a.field_t;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uta.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    uta(il param0, fia param1) {
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
        this.field_t = "# ";
        this.field_s = new vna();
        this.field_j = false;
        this.field_h = 0;
        this.field_b = null;
        this.field_q = 0;
        try {
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
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
