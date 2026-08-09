/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends g implements ec, oi {
    private boolean field_N;
    static th field_O;
    private ig field_E;
    static oj field_I;
    private boolean field_P;
    private ae field_K;
    private boolean field_M;
    private ig field_J;
    private ae field_Q;
    private ig field_D;
    private String field_G;
    static mj field_B;
    static java.awt.Frame field_L;

    la(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (uk) null);
        kg dupTemp$0 = null;
        kg dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        ig stackIn_18_1 = null;
        ig stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ig stackIn_19_1 = null;
        ig stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        b var6 = null;
        RuntimeException var6_ref = null;
        bd var7 = null;
        String var8 = null;
        bh var9 = null;
        kg var12 = null;
        kg var13 = null;
        try {
          L0: {
            L1: {
              this.field_G = param1;
              stackIn_3_0 = this;

              if (!param3) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((la) (this)).field_M = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param4) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((la) (this)).field_N = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((la) (this)).field_P = stackIn_10_1 != 0;
              if (!this.field_P) {
                break L4;
              } else {
                L5: {
                  if (this.field_M) {
                    break L5;
                  } else {
                    if (!this.field_N) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_Q = (ae) ((Object) new pl(param0, (lf) (this), 100));
              this.field_K = (ae) ((Object) new pl("", (lf) (this), 20));
              if (!this.field_P) {
                L7: {
                  this.field_D = new ig(oj.field_a, (lf) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (!this.field_N) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = bk.field_e;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = o.field_c;
                    break L7;
                  }
                }
                ((la) (this)).field_J = new ig(stackIn_19_3, (lf) null);
                if (!this.field_M) {
                  break L6;
                } else {
                  this.field_E = new ig(gk.field_g, (lf) (this));
                  break L6;
                }
              } else {
                this.field_D = new ig(qb.field_l, (lf) null);
                this.field_J = new ig(wc.field_z, (lf) null);
                this.field_Q.field_E = false;
                break L6;
              }
            }
            L8: {
              this.field_Q.field_u = (uk) ((Object) new vg(10000536));
              this.field_K.field_u = (uk) ((Object) new il(10000536));
              var6 = new b();
              this.field_D.field_u = (uk) ((Object) var6);
              if (this.field_J == null) {
                break L8;
              } else {
                this.field_J.field_u = (uk) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (null == this.field_E) {
                break L9;
              } else {
                this.field_E.field_u = (uk) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_Q.field_x = k.field_a;
              if (this.field_E == null) {
                break L10;
              } else {
                this.field_E.field_x = hi.field_c;
                break L10;
              }
            }
            L11: {
              if (!this.field_P) {
                if (this.field_N) {
                  this.field_J.field_x = ua.field_f;
                  this.field_J.field_u = (uk) ((Object) new ll());
                  break L11;
                } else {
                  this.field_J.field_u = (uk) ((Object) new ll());
                  break L11;
                }
              } else {
                this.field_J.field_x = fk.field_q;
                break L11;
              }
            }
            L12: {
              this.field_k = 15;
              var7 = si.field_V;
              if (null == this.field_G) {
                break L12;
              } else {
                this.field_k = this.field_k + (5 + var7.b(this.field_G, -40 + this.field_p, var7.field_N));
                break L12;
              }
            }
            L13: {
              var8 = k.field_c;
              var9 = ml.a(hf.a((byte) -15), (byte) -122);
              if (kk.field_k == var9) {
                var8 = dd.field_h;
                break L13;
              } else {
                if (var9 != ak.field_d) {
                  break L13;
                } else {
                  var8 = al.field_e;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new kg(10, this.field_k, -20 + this.field_p, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b(4, dupTemp$0);
              this.field_k = this.field_k + (5 + ((rj) ((Object) var12)).field_t);
              dupTemp$1 = new kg(10, this.field_k, -20 + this.field_p, 25, this.field_K, false, 80, 3, var7, 16777215, th.field_b);
              var13 = dupTemp$1;
              this.b(4, dupTemp$1);
              this.field_D.field_v = (lf) (this);
              this.field_k = this.field_k + (((rj) ((Object) var13)).field_t - -5);
              if (this.field_E == null) {
                break L14;
              } else {
                this.field_E.field_v = (lf) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_J == null) {
                break L15;
              } else {
                this.field_J.field_v = (lf) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_E == null) {
                this.field_D.b(-10 + (this.field_p + -6), 8, this.field_k, 30, 23987);
                this.field_k = this.field_k + 35;
                break L16;
              } else {
                this.field_D.b(-95 + this.field_p, 85, this.field_k, 30, 23987);
                this.field_k = this.field_k + 60;
                break L16;
              }
            }
            L17: {
              if (this.field_E == null) {
                break L17;
              } else {
                this.field_E.b(-6 + this.field_p - 10, 8, this.field_k, 30, 23987);
                this.field_k = this.field_k + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_J == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_P) {
                    break L19;
                  } else {
                    if (this.field_N) {
                      break L19;
                    } else {
                      this.field_J.b(40, 8, this.field_k, 20, 23987);
                      this.field_k = this.field_k + 25;
                      break L18;
                    }
                  }
                }
                this.field_J.b(-10 + this.field_p + -6, 8, this.field_k, 30, 23987);
                this.field_k = this.field_k + 35;
                break L18;
              }
            }
            L20: {
              this.b(this.field_p, 0, 0, 3 + this.field_k, 23987);
              this.b(4, this.field_D);
              if (this.field_E == null) {
                break L20;
              } else {
                this.b(4, this.field_E);
                break L20;
              }
            }
            L21: {
              if (this.field_J == null) {
                break L21;
              } else {
                this.b(4, this.field_J);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("la.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void e(byte param0) {
        int var2 = 114 / ((param0 - -74) / 33);
        this.field_Q.d(true);
        this.field_K.d(true);
    }

    final String f(byte param0) {
        if (null == this.field_Q.field_m) {
            return "";
        }
        int var2 = -67 % ((param0 - -6) / 54);
        return this.field_Q.field_m;
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = stellarshard.field_B;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param1;
        }
        if (param0 < 64) {
            field_I = (oj) null;
        }
        return new String(var3);
    }

    public final void b(ae param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_Q) {
                break L1;
              } else {
                this.field_K.a(-2147483648, (rj) (this));
                break L1;
              }
            }
            L2: {
              if (this.field_K == param0) {
                this.g((byte) 107);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 0) {
                break L3;
              } else {
                la.a(-12, 'ﾋ', 44);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("la.W(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            var3 = 91 % ((35 - param1) / 34);
            var2_int = param0.length();
            var4 = new char[var2_int];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackIn_5_0 = new String(var4);
                break L0;
              } else {
                var4[-var5 + (var2_int + -1)] = param0.charAt(var5);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("la.FB(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0 ^ 0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 98) {
                stackIn_7_0 = this.a(param3, -8666);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 29657) {
                    break L1;
                  } else {
                    this.f((byte) -128);
                    break L1;
                  }
                }
                if (-100 == (param1 ^ -1)) {
                  stackIn_13_0 = this.a(param3, (byte) -45);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("la.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public final void a(ae param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_O = (th) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("la.S(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != this.field_G) {
            si.field_V.a(this.field_G, param3 + this.field_w + 20, 15 + this.field_k + param2, this.field_p - 40, this.field_t, 16777215, -1, 1, 0, si.field_V.field_N);
        }
        if (!(this.field_E == null)) {
            ti.g(param3 + 10, 134 + param2, -20 + this.field_p, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_L = null;
        field_I = null;
        field_O = null;
        if (param0 <= 82) {
            la.a(-59);
        }
        field_B = null;
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            if (!param3) {
              L1: {
                if (this.field_D != param2) {
                  if (this.field_E == param2) {
                    ta.a((byte) 91);
                    break L1;
                  } else {
                    if (param2 == this.field_J) {
                      if (!this.field_P) {
                        if (!this.field_N) {
                          rk.a(3);
                          break L1;
                        } else {
                          cg.a((byte) 57);
                          break L1;
                        }
                      } else {
                        dg.g(16608);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  this.g((byte) 61);
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("la.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        if (param0 > 50) {
          L0: {
            L1: {
              if (sg.a((byte) 102)) {
                break L1;
              } else {
                if (this.field_Q.field_m.length() <= 0) {
                  break L0;
                } else {
                  if (this.field_K.field_m.length() <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            rc.a(this.field_K.field_m, this.field_Q.field_m, true);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void b(String param0, int param1) {
        ae var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = this.field_Q;
              var4 = param0;
              var3.a((byte) 20, var4, false);
              this.field_K.d(true);
              if (param1 == 15) {
                break L1;
              } else {
                field_L = (java.awt.Frame) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("la.DB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_O = new th();
        oj discarded$0 = new oj();
    }
}
