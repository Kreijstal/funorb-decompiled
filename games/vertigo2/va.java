/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va implements ur, qa {
    int field_d;
    private boolean field_q;
    int field_n;
    static java.applet.Applet field_o;
    private int field_g;
    int field_m;
    int field_a;
    static int[] field_b;
    static wn field_s;
    static cr field_f;
    int field_e;
    int field_p;
    static String field_r;
    static cr field_h;
    int field_i;
    int field_j;
    int field_c;
    int field_k;
    cc field_l;

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!wq.field_H) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                bi.b(40, 40, 560, 400, 1, 164);
                bi.e(40, 40, 560, 400, 16777215);
                var1_int = 16;
                var2 = 60;
                var3 = 60;
                if (param0 > 14) {
                  break L1;
                } else {
                  field_o = (java.applet.Applet) null;
                  break L1;
                }
              }
              tk.field_c.b("Press 'H' to close this screen", var3, var2, 16777215, -1);
              var2 = var2 + var1_int;
              var4 = var2;
              var5 = 0;
              L2: while (true) {
                if (al.field_A.length <= var5) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7_int = al.field_x[var5];
                    if ((var7_int ^ -1) == -3) {
                      var6 = al.field_A[var5] + "+ALT";
                      break L3;
                    } else {
                      if (-2 != (var7_int ^ -1)) {
                        if ((var7_int ^ -1) == -4) {
                          var6 = al.field_A[var5] + "+CTRL+ALT";
                          break L3;
                        } else {
                          if (var7_int != 0) {
                            var6 = null;
                            break L3;
                          } else {
                            var6 = al.field_A[var5];
                            break L3;
                          }
                        }
                      } else {
                        var6 = al.field_A[var5] + "+CTRL";
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var9 = var5 / 12;
                      var10 = var5 - var9 * 12;
                      var11 = 0;
                      if (-1 >= (-7 + var10 ^ -1)) {
                        var12 = -7 + (var10 - -(5 * var9));
                        if (-1 < (var12 ^ -1)) {
                          break L4;
                        } else {
                          if (wa.field_h.length > var12) {
                            var7 = wa.field_h[var12];
                            var8 = 14517504;
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        var12 = 7 * var9 + var10;
                        if (jl.field_a.length > var12) {
                          var7 = jl.field_a[var12];
                          var8 = 39168;
                          if (-1 != (1 << var12 & mb.field_s ^ -1)) {
                            var11 = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var11 != 0) {
                        bi.b(-10 + var3, var2 + -10, 50, 20 - -var1_int, var8, 120);
                        break L6;
                      } else {
                        bi.b(var3 + -10, -10 + var2, 50, 20 + var1_int, var8);
                        break L6;
                      }
                    }
                    tk.field_c.a((String) (var6), var3 - 10, -10 + var2, 50, 20 + var1_int, 16777215, 5592405, 1, 1, 0);
                    tk.field_c.a(var7, -10 + (var3 + 60), var2 + -10, 140, var1_int + 20, 16777215, -1, 0, 1, 0);
                    var2 = var2 + (24 + var1_int);
                    if ((var2 ^ -1) < -421) {
                      var2 = var4;
                      var3 += 220;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "va.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 19207) {
              var3_int = 1;
              L1: while (true) {
                if (1 >= param1) {
                  if (1 == param1) {
                    stackIn_14_0 = var3_int * param2;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_16_0 = var3_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L2: {
                    if (-1 == (1 & param1 ^ -1)) {
                      break L2;
                    } else {
                      var3_int = var3_int * param2;
                      break L2;
                    }
                  }
                  param1 = param1 >> 1;
                  param2 = param2 * param2;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "va.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 < 118) {
            va.a(0);
            sl.field_w = 1000000000L / (long)param0;
            return;
        }
        sl.field_w = 1000000000L / (long)param0;
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == -81) {
          if ((hn.field_w ^ -1) <= -11) {
            if (sq.field_c) {
              return false;
            } else {
              L0: {
                if (oe.q(95)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_s = (wn) null;
          if ((hn.field_w ^ -1) <= -11) {
            if (sq.field_c) {
              return false;
            } else {
              L1: {
                if (oe.q(95)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    public final int a(iq param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(param0, param1 + 102);
              if (param1 == -1) {
                break L1;
              } else {
                this.field_k = -38;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_r.b((byte) 116) - -this.field_k + this.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("va.K(");

            if (param0 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(iq param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 1) {
              stackIn_4_0 = this.a(param2, (byte) 110, 0, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 57;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("va.DA(");

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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(int param0, byte param1, iq param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -94) {
              stackIn_4_0 = param3 + (param2.field_u + (param2.field_o + param0 + this.field_i));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 123;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("va.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        if (!param2) {
            this.field_k = 26;
        }
        if (!(this.field_l != null)) {
            return;
        }
        try {
            this.a(0, param1, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "va.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int b(iq param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -14323) {
              stackIn_4_0 = this.a(param1, (byte) -94, param0, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -38;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("va.G(");

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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(iq param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(param0, 46);
              if (param1 > 98) {
                break L1;
              } else {
                this.field_m = -99;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_r.a(8783) - -this.field_i - -this.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("va.F(");

            if (param0 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int c(iq param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_f = (cr) null;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_c + -this.field_k + param0.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("va.AA(");

            if (param0 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, byte param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 110) {
                break L1;
              } else {
                this.a((byte) -120);
                break L1;
              }
            }
            stackIn_3_0 = param0 - (-param3.field_t + (-this.field_k - param3.field_y) - param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("va.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, iq param5, int param6, int param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              jb.a(param0 - -param5.field_t, param5.field_n + (param5.field_o + param3), param5.field_o + param3, -30486, param5.field_s + param5.field_t + param0);
              var9_int = this.a(-1, param5);
              var10 = this.c(param5, 0);
              if (!this.field_q) {
                L2: {
                  var12 = this.field_d;
                  if (var12 == 0) {
                    var11 = this.field_l.field_z;
                    break L2;
                  } else {
                    if (2 != var12) {
                      L3: {
                        if (-4 == (var12 ^ -1)) {
                          break L3;
                        } else {
                          if ((var12 ^ -1) == -2) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var11 = (-this.field_l.field_z + var10 - this.field_l.field_M >> -1962907647) + this.field_l.field_z;
                      break L2;
                    } else {
                      var11 = var10 - this.field_l.field_M;
                      break L2;
                    }
                  }
                }
                L4: {
                  var12 = this.field_m;
                  if (-1 == (var12 ^ -1)) {
                    break L4;
                  } else {
                    if (var12 == 3) {
                      break L4;
                    } else {
                      if (1 != var12) {
                        if (2 == var12) {
                          this.field_l.a(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) - -var9_int, this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        this.field_l.c(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7) + (var9_int >> -1305728895), this.a(param0, (byte) 110, param2, param5) + var11, param6, param1);
                        break L1;
                      }
                    }
                  }
                }
                this.field_l.b(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5) - -var11, param6, param1);
                break L1;
              } else {
                this.field_l.a(this.a((byte) -90, param5), this.a(param3, (byte) -94, param5, param7), this.a(param0, (byte) 110, param2, param5), var9_int, var10, param6, param1, this.field_m, this.field_d, this.field_n);
                break L1;
              }
            }
            ln.d(-28558);
            if (param4 > 64) {
              break L0;
            } else {
              this.field_i = -47;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var9);

            stackIn_26_1 = new StringBuilder().append("va.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, iq param3, int param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        lq var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ro var13 = null;
        ro var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -81) {
              L1: {
                if (!param3.f(48)) {
                  break L1;
                } else {
                  L2: {
                    var13 = this.b(param3, 80);
                    var14 = var13;
                    var7 = var14.a(param1, 22413);
                    var8 = var13.field_c[var7];
                    var9 = var14.b(param1, -61);
                    var10 = this.a(param2, (byte) -94, param3, var9);
                    var11 = this.a(param3, 1, param4) + Math.max(0, var8.field_f);
                    stackIn_5_0 = this.a(param3, 1, param4);

                    stackIn_5_1 = this.c(param3, 0);

                    stackIn_5_2 = var8.field_d;

                    if (var14.field_c.length <= 1 + var7) {
                      stackIn_6_0 = stackIn_5_0;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = stackIn_5_2;
                      stackIn_6_3 = var8.field_d;
                      break L2;
                    } else {
                      stackIn_6_0 = stackIn_5_0;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = stackIn_5_2;
                      stackIn_6_3 = var13.field_c[1 + var7].field_f;
                      break L2;
                    }
                  }
                  var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                  jb.a(param3.field_t + param4, param3.field_o + param2 + param3.field_n, param2 - -param3.field_o, -30486, param4 + (param3.field_t + param3.field_s));
                  eb.field_c.a(var10, var12, this.field_p, var10, var11, 105);
                  ln.d(-28558);
                  break L1;
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("va.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(int param0, int param1, int param2, int param3, iq param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.b(param4, 33);
            if (param2 > 21) {
              stackIn_4_0 = param4.field_r.a(param5 - this.a(param4, 1, param1), (byte) 42, param0 - this.b(param4, param3, -14323));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 114;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("va.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, int param2, iq param3) {
        try {
            this.a(param2, this.field_g, 0, param1, 65, param3, this.field_e, param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "va.R(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, iq param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param1.field_r) {
                param1.field_r = (ro) ((Object) new sl());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = this.a(-1, param1);
              var4 = this.c(param1, 0);
              var6 = this.field_d;
              if (var6 == 0) {
                var5 = this.field_l.field_z;
                break L2;
              } else {
                if (var6 == 2) {
                  var5 = var4 - this.field_l.field_M;
                  break L2;
                } else {
                  L3: {
                    if (-4 != (var6 ^ -1)) {
                      if ((var6 ^ -1) != -2) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = (var4 - (this.field_l.field_z - -this.field_l.field_M) >> -304752639) + this.field_l.field_z;
                  break L2;
                }
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                field_o = (java.applet.Applet) null;
                break L4;
              }
            }
            L5: {
              var6 = this.field_m;
              if (var6 != 0) {
                if ((var6 ^ -1) != -4) {
                  if (var6 == 1) {
                    if (param1.field_r instanceof sl) {
                      ((sl) ((Object) param1.field_r)).a(var5, this.field_l, this.a((byte) -90, param1), -12558, var3_int >> 379657217);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L6: {
                      if (2 != var6) {
                        break L6;
                      } else {
                        if (!(param1.field_r instanceof sl)) {
                          break L6;
                        } else {
                          ((sl) ((Object) param1.field_r)).a(var3_int, (byte) 94, this.field_l, var5, this.a((byte) -90, param1));
                          return;
                        }
                      }
                    }
                    break L0;
                  }
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
            if (param1.field_r instanceof sl) {
              ((sl) ((Object) param1.field_r)).b(-96, this.field_l, this.a((byte) -90, param1), var5, 0);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("va.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final void a(int param0, va param1) {
        try {
            param1.field_g = this.field_g;
            param1.field_d = this.field_d;
            param1.field_n = this.field_n;
            param1.field_p = this.field_p;
            param1.field_l = this.field_l;
            param1.field_i = this.field_i;
            if (param0 != 16777215) {
                this.field_e = 14;
            }
            param1.field_c = this.field_c;
            param1.field_j = this.field_j;
            param1.field_a = this.field_a;
            param1.field_q = this.field_q;
            param1.field_e = this.field_e;
            param1.field_m = this.field_m;
            param1.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "va.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(byte param0) {
        iq var3;
        if (param0 != -91) {
          var3 = (iq) null;
          this.a((iq) null, (byte) 64);
          return this.field_l.field_M + this.field_l.field_z;
        } else {
          return this.field_l.field_M + this.field_l.field_z;
        }
    }

    public final int a(int param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_p = 47;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_j + param1.field_n + -this.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("va.I(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(iq param0, int param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lq var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ro var17 = null;
        ro var18 = null;
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == param3) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.f(24)) {
                  L2: {
                    var17 = this.b(param0, 122);
                    var18 = var17;
                    if (param3 < param1) {
                      var9 = param1;
                      var8 = param3;
                      break L2;
                    } else {
                      var8 = param1;
                      var9 = param3;
                      break L2;
                    }
                  }
                  var10 = var18.a(var8, 22413);
                  var11 = var18.a(var9, 22413);
                  jb.a(param0.field_t + param4, param0.field_n + param0.field_o + param5, param0.field_o + param5, -30486, param0.field_s + (param4 - -param0.field_t));
                  var12 = var10;
                  L3: while (true) {
                    if (var11 < var12) {
                      ln.d(-28558);
                      break L1;
                    } else {
                      L4: {
                        var13 = var17.field_c[var12];
                        if (var12 != var10) {
                          stackIn_14_0 = var13.field_c[0];
                          break L4;
                        } else {
                          stackIn_14_0 = var18.b(var8, -28);
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_14_0;
                        if (var12 != var11) {
                          if (var13 == null) {
                            stackIn_19_0 = 0;
                            break L5;
                          } else {
                            stackIn_19_0 = var13.field_c[var13.field_c.length - 1];
                            break L5;
                          }
                        } else {
                          stackIn_19_0 = var18.b(var9, 126);
                          break L5;
                        }
                      }
                      var15 = stackIn_19_0;
                      eb.field_c.a(var13.field_d, (byte) -101, param4 + param0.field_t + (this.field_k + param0.field_y) - -var13.field_f, this.field_a, this.field_a >>> 1465910872, this.a(param5, (byte) -94, param0, var14), var15 - var14);
                      var12++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (!param2) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_n = -106;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("va.U(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_r = null;
        field_o = null;
        if (param0 != 60) {
            return;
        }
        field_s = null;
        field_f = null;
    }

    String a(byte param0, iq param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -90) {
                break L1;
              } else {
                va.a(-117, 22, 99);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_w;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("va.BA(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final ro b(iq param0, int param1) {
        RuntimeException var3 = null;
        ro stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_r == null) {
                param0.field_r = (ro) ((Object) new sl());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 4) {
                break L2;
              } else {
                this.field_p = -35;
                break L2;
              }
            }
            L3: {
              if (!this.field_q) {
                this.a(false, param0);
                break L3;
              } else {
                ((sl) ((Object) param0.field_r)).a(this.field_d, this.a((byte) -90, param0), 1, this.field_l, this.field_m, this.c(param0, 0), this.a(-1, param0), this.field_n);
                break L3;
              }
            }
            stackIn_9_0 = param0.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("va.S(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    protected va() {
    }

    va(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_g = param6;
            this.field_a = param11;
            this.field_q = param12 ? true : false;
            this.field_j = param2;
            this.field_d = param8;
            this.field_c = param4;
            this.field_k = param3;
            this.field_i = param1;
            this.field_e = param5;
            this.field_m = param7;
            this.field_n = param9;
            this.field_l = param0;
            this.field_p = param10;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_r = "<%0> cannot join; the game is full.";
        field_b = null;
    }
}
