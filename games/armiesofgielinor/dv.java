/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dv implements ap {
    dn field_d;
    static je field_m;
    String field_c;
    static wk field_k;
    static String field_i;
    static String field_g;
    je field_s;
    static String field_r;
    private at field_j;
    ka field_t;
    private int field_l;
    dp field_o;
    private je field_q;
    private String[] field_e;
    private boolean field_f;
    private int field_n;
    private rq field_b;
    private String field_h;
    private int field_p;
    private int field_a;

    private final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        je var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            this.field_d.field_Jb.a(this.a(param0, param1, (byte) -68), param2 + 368);
            if ((this.field_d.field_Jb.field_fb.b(false) ^ -1) < param2) {
                this.field_d.field_Jb.field_fb.a(0);
            }
            var4_int = 5;
            var5 = (je) ((Object) this.field_d.field_Jb.field_fb.e((byte) 107));
            while (var5 != null) {
                var5.field_ab = var4_int;
                var4_int = var4_int + this.field_l;
                var5 = (je) ((Object) this.field_d.field_Jb.field_fb.a((byte) 123));
            }
            this.field_d.field_Jb.field_ob = var4_int;
            this.field_d.field_Jb.field_ab = this.field_d.field_ob + -var4_int;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dv.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    abstract boolean a(String param0, boolean param1);

    final static String a(String param0, int param1, String param2, String param3) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = param0.indexOf(param2);
        if (param1 > -45) {
            field_g = (String) null;
        }
        while (-1 != var4) {
            param0 = param0.substring(0, var4) + param3 + param0.substring(var4 + param2.length());
            var4 = param0.indexOf(param2, param3.length() + var4);
        }
        return param0;
    }

    void b(int param0) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(-1 <= (this.field_q.field_ob + this.field_q.field_ab ^ -1))) {
            qn.b(this.field_q.field_V, this.field_q.field_D, this.field_d.field_S, this.field_q.field_ob, 5592405, 230);
            qn.b(this.field_d.field_gb + this.field_d.field_V, this.field_q.field_D, this.field_d.field_S, this.field_q.field_ob, 5592405, 230);
            qn.b(this.field_d.field_V, this.field_q.field_D, this.field_d.field_gb, this.field_d.field_ab, 5592405, 230);
            qn.b(this.field_d.field_V, this.field_d.field_ob + this.field_d.field_D, this.field_d.field_gb, this.field_o.field_D + (-this.field_d.field_D + -this.field_d.field_ob), 5592405, 230);
            qn.b(this.field_d.field_V, this.field_o.field_ob + this.field_o.field_D, this.field_d.field_gb, -this.field_o.field_ob + this.field_q.field_ob + -this.field_o.field_ab, 5592405, 230);
            qn.b(this.field_d.field_V, this.field_d.field_D, this.field_d.field_gb, this.field_d.field_ob, 2236962, 240);
            qn.b(this.field_o.field_V, this.field_o.field_D, this.field_o.field_gb, this.field_o.field_ob, 2236962, 240);
            var2 = this.field_q.field_ab + 256;
            if (!((var2 ^ -1) <= -1)) {
                var2 = 0;
            }
            qn.b(this.field_q.field_V, this.field_q.field_D - -this.field_q.field_ob, this.field_q.field_gb, -this.field_q.field_ob + (-this.field_q.field_D + dt.field_a), 0, var2 >> 877302241);
            var3 = 5 + this.field_q.field_ab - -this.field_q.field_ob;
            for (var4 = 0; (var4 ^ -1) > -7; var4++) {
                qn.e(0, var3, bn.field_b, 0, var4 << 2124655717);
                var3--;
            }
            this.field_q.b(0 == (8 & this.field_n) ? true : false, 20);
        }
        var2 = 126 / ((13 - param0) / 33);
        if (this.field_e != null) {
            if (this.field_f) {
                var3 = this.field_q.field_ob + this.field_q.field_ab;
                this.field_s.field_ab = var3;
                this.field_s.b(false, 20);
                var3 = var3 + (this.field_l - -5);
                var6 = 0;
                var4 = var6;
                while (this.field_e.length > var6) {
                    this.field_t.b(this.field_e[var6], 10 + this.field_s.field_V, var3, 13421772, -1);
                    var3 = var3 + this.field_l;
                    var6++;
                }
            }
        }
    }

    abstract void a(byte param0);

    private final je a(byte param0, int param1) {
        int var4 = -63 % ((param0 - -36) / 61);
        je var3 = new je(0L, (je) null);
        var3.field_G = ak.b(param1, 5);
        return var3;
    }

    public static void c(byte param0) {
        field_k = null;
        field_r = null;
        field_m = null;
        int var1 = -8 % ((-2 - param0) / 34);
        field_g = null;
        field_i = null;
    }

    private final void a(String param0, int param1) {
        rq var3 = null;
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
              L2: {
                var3 = (rq) ((Object) this.field_j.e((byte) 90));
                if (var3 == null) {
                  break L2;
                } else {
                  if (param0.equals(var3.field_l)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_j.a(750, new rq(param0));
              break L1;
            }
            L3: {
              if (param1 >= 37) {
                break L3;
              } else {
                this.field_d = (dn) null;
                break L3;
              }
            }
            L4: {
              if (this.field_j.b(false) > 30) {
                this.field_j.c((byte) -123);
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

            stackIn_12_1 = new StringBuilder().append("dv.H(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          L1: {
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!this.field_f) {
              break L1;
            } else {
              if (-1 <= (this.field_p ^ -1)) {
                break L1;
              } else {
                this.field_p = this.field_p - 1;
                this.field_q.field_ab = -200 * (this.field_p * this.field_p) / 225;
                break L0;
              }
            }
          }
          if (this.field_f) {
            break L0;
          } else {
            if (-1 > (this.field_q.field_ab - -200 ^ -1)) {
              this.field_q.field_ab = this.field_q.field_ab - 28;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (!this.field_o.q(0).equals(this.field_h)) {
              break L3;
            } else {
              if (this.field_o.o(93) == this.field_a) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            this.field_h = this.field_o.q(0);
            this.field_a = this.field_o.o(-29);
            this.field_e = this.b(true);
            if (null == this.field_e) {
              break L4;
            } else {
              if (this.field_e.length != 0) {
                break L4;
              } else {
                this.field_e = null;
                break L4;
              }
            }
          }
          if (null == this.field_e) {
            break L2;
          } else {
            var3 = 0;
            var4 = 0;
            L5: while (true) {
              if (var4 >= this.field_e.length) {
                this.field_s.field_gb = var3 + 20;
                this.field_s.field_ob = 15 - -(this.field_e.length * this.field_l);
                break L2;
              } else {
                var5 = this.field_t.a(this.field_e[var4]);
                if ((var3 ^ -1) > (var5 ^ -1)) {
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
        this.field_n = this.field_n + 1;
        if (param0 <= -58) {
          this.field_q.a(true, param1);
          this.field_d.a(this.field_l, true, el.field_d * (2 * this.field_l), false);
          this.field_o.m(0);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        int var2;
        L0: {
          var2 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((rd.field_j.field_xb.field_C & 1 << rd.field_j.field_q) != 0) {
            il.field_t[10] = np.field_Jb;
            break L0;
          } else {
            if (-1 == ((rd.field_j.field_xb.field_e ^ -1) & rd.field_j.field_xb.field_C ^ -1)) {
              il.field_t[10] = uu.field_c;
              break L0;
            } else {
              il.field_t[10] = dm.field_O;
              break L0;
            }
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            field_i = (String) null;
            break L1;
          }
        }
    }

    private final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        at var9 = null;
        rq var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = -10 + (this.field_d.field_gb + -15);
            var5 = dj.a(-100, '\n', param0);
            var6 = var5;
            if (param2 <= -25) {
              var7 = 0;
              L1: while (true) {
                if (var6.length <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = var6[var7];
                    if (var4_int > this.field_t.a(var8)) {
                      this.a(param1, var8, -257);
                      break L2;
                    } else {
                      var9 = this.a(var8, var4_int, (byte) -98);
                      var10 = (rq) ((Object) var9.e((byte) 123));
                      L3: while (true) {
                        if (var10 == null) {
                          break L2;
                        } else {
                          this.a(param1, var10.field_l, -257);
                          var10 = (rq) ((Object) var9.a((byte) 123));
                          continue L3;
                        }
                      }
                    }
                  }
                  var7++;
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
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("dv.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final at a(String param0, int param1, byte param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        at stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        at var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -98) {
                break L1;
              } else {
                this.field_h = (String) null;
                break L1;
              }
            }
            var4 = new at();
            L2: while (true) {
              if (param0 == null) {
                stackIn_21_0 = (at) (var4);
                break L0;
              } else {
                L3: {
                  var5 = this.field_t.a(param0);
                  var6 = param0;
                  if (param1 >= var5) {
                    param0 = null;
                    break L3;
                  } else {
                    var7 = -1 + param0.length();
                    L4: while (true) {
                      L5: {
                        if (-1 <= (var7 ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            if ((var5 ^ -1) < (param1 ^ -1)) {
                              break L6;
                            } else {
                              if (param0.charAt(var7) == 32) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          incrementValue$0 = var7;
                          var7--;
                          var5 = var5 - this.field_t.a(param0.charAt(incrementValue$0));
                          continue L4;
                        }
                      }
                      L7: {
                        if (var7 == 0) {
                          var5 = this.field_t.a(param0);
                          var7 = param0.length() + -1;
                          L8: while (true) {
                            if (param1 >= var5) {
                              break L7;
                            } else {
                              incrementValue$1 = var7;
                              var7--;
                              var5 = var5 - this.field_t.a(param0.charAt(incrementValue$1));
                              continue L8;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      var6 = param0.substring(0, var7);
                      param0 = param0.substring(1 + var7);
                      break L3;
                    }
                  }
                }
                var4.a((byte) -119, (tc) (new rq(var6)));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4_ref);

            stackIn_24_1 = new StringBuilder().append("dv.N(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0;
    }

    private final je a(int param0, int param1, int param2) {
        je var4 = new je(0L, (je) null);
        var4.field_G = tn.a(true, param1, param2);
        if (param0 != 5592405) {
            this.field_d = (dn) null;
        }
        return var4;
    }

    final void a(Object param0, int param1) {
        try {
            int var3_int = 43 % ((45 - param1) / 56);
            this.a(-1, param0 == null ? "null" : param0.toString());
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dv.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final je a(int param0, String param1, byte param2) {
        je var4 = null;
        RuntimeException var4_ref = null;
        je stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -68) {
                break L1;
              } else {
                field_k = (wk) null;
                break L1;
              }
            }
            var4 = new je(0L, (je) null, param1);
            var4.field_N = param0;
            var4.field_Z = this.field_t;
            var4.a(this.field_l, -20500, this.field_t.a(var4.field_X), 0, 5);
            stackIn_3_0 = (je) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("dv.L(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0) {
        if (param0 != -31501) {
            return false;
        }
        return this.field_f;
    }

    final void a(int param0, String param1) {
        try {
            this.a(param1, 13421772, param0 ^ 90);
            if (param0 != -1) {
                this.field_a = 92;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dv.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String[] b(boolean param0);

    private final void b(byte param0) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (this.field_f) {
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
          ((dv) (this)).field_f = stackIn_3_1 != 0;
          if (!this.field_f) {
            if (null == this.field_q) {
              break L1;
            } else {
              this.field_q.b(3, (je) null);
              break L1;
            }
          } else {
            this.field_p = 15;
            if (this.field_q != null) {
              this.field_q.b(param0 ^ -1, this.field_o);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 == -4) {
            break L2;
          } else {
            field_r = (String) null;
            break L2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 == -66) {
          L0: {
            if (param15 > param0) {
              if (param8 > param15) {
                q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                break L0;
              } else {
                if (param8 > param0) {
                  q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                  break L0;
                } else {
                  q.a(qn.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
                  break L0;
                }
              }
            } else {
              if (param8 <= param0) {
                if (param8 > param15) {
                  q.a(qn.field_d, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
                  break L0;
                } else {
                  q.a(qn.field_d, param1, param13, param4, param12, param5, param7, param9, param10, param2, param15, param0, param14, true, param11, param8, param6);
                  break L0;
                }
              } else {
                q.a(qn.field_d, param9, param4, param12, param13, param1, param6, param5, param7, param11, param0, param8, param2, true, param14, param15, param10);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, char param1, int param2) {
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        tc stackIn_25_1 = null;
        je var5;
        int var6;
        String var7;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -30847) {
            break L0;
          } else {
            dv.a(false);
            break L0;
          }
        }
        if (96 == param1) {
          this.b((byte) -4);
          return true;
        } else {
          if (this.field_f) {
            L1: {
              if (84 != param2) {
                if (98 == param2) {
                  L2: {
                    if (null == this.field_b) {
                      break L2;
                    } else {
                      if (this.field_b.field_b == this.field_j.field_d) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    stackIn_24_0 = this;

                    if (this.field_b == null) {
                      stackIn_25_0 = this;
                      stackIn_25_1 = this.field_j.e((byte) 119);
                      break L3;
                    } else {
                      stackIn_25_0 = this;
                      stackIn_25_1 = this.field_b.field_b;
                      break L3;
                    }
                  }
                  ((dv) (this)).field_b = (rq) ((Object) stackIn_25_1);
                  if (this.field_b != null) {
                    this.field_o.a(this.field_b.field_l, (byte) 45);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (-100 == (param2 ^ -1)) {
                    if (this.field_b == null) {
                      break L1;
                    } else {
                      if (this.field_j.field_d == this.field_b.field_j) {
                        break L1;
                      } else {
                        this.field_b = (rq) ((Object) this.field_b.field_j);
                        this.field_o.a(this.field_b.field_l, (byte) 45);
                        break L1;
                      }
                    }
                  } else {
                    if (80 == param2) {
                      this.a((byte) 122);
                      break L1;
                    } else {
                      this.field_o.a(param2, param0 + 4721, param1);
                      break L1;
                    }
                  }
                }
              } else {
                var7 = this.field_o.q(0);
                if ((var7.length() ^ -1) < -1) {
                  L4: {
                    this.a(this.field_c + var7, 5635925, param0 + 30734);
                    var5 = (je) ((Object) this.field_d.field_Jb.field_fb.d((byte) -81));
                    if (this.a(var7, true)) {
                      break L4;
                    } else {
                      var5.field_N = 16733525;
                      break L4;
                    }
                  }
                  this.field_o.a(true);
                  this.a(var7, param0 + 30943);
                  this.field_b = null;
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

    private final je a(boolean param0, int param1) {
        je var3 = new je();
        var3.field_G = tn.a(param0, 0, param1);
        return var3;
    }

    dv(ka param0, hd param1) {
        int var3_int = 0;
        je var4 = null;
        je var5 = null;
        je var6 = null;
        je var7 = null;
        je var8 = null;
        je var9 = null;
        je var10 = null;
        je var11 = null;
        je var12 = null;
        ll var13 = null;
        je var14 = null;
        je var15 = null;
        this.field_c = "# ";
        this.field_j = new at();
        this.field_e = null;
        this.field_f = false;
        this.field_n = 0;
        this.field_p = 0;
        try {
            this.field_t = param0;
            this.field_l = this.field_t.field_H + this.field_t.field_L;
            var3_int = this.field_l - -4;
            var4 = this.a(true, 65793);
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a(5592405, 7829367, 2236962);
            var9 = this.a(5592405, 65793, 65793);
            var10 = this.a(5592405, 3355443, 65793);
            var11 = this.a((byte) 71, 2263074);
            var12 = this.a(5592405, 2236962, 65793);
            this.field_q = new je(0L, var5);
            this.field_q.a(200, -20500, bn.field_b, -200, 0);
            var13 = new ll(0L, var8, var8, var9, var10);
            var14 = new je();
            var14.field_fb = new at();
            this.field_d = new dn(0L, var14, var6, var13);
            this.field_d.field_Jb.field_fb = new at();
            this.field_d.a(5, false, this.field_q.field_gb - 10, 0, 15, 5, 185 - var3_int);
            this.field_q.a(this.field_d, 71);
            var15 = new je();
            var15.field_Z = this.field_t;
            var15.field_N = 13421772;
            var15.field_F = 5;
            var15.field_z = 2;
            this.field_o = new dp(0L, var7, var11, var15);
            this.field_o.b(this.field_d.field_ab - (-this.field_d.field_ob - 5), 0, this.field_d.field_gb, var3_int, this.field_d.field_S);
            this.field_o.a(param1, 176);
            this.field_q.a(this.field_o, 87);
            this.field_s = new je(0L, var12);
            this.field_s.field_S = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Discard";
        field_i = "Mana";
        field_g = "0.0";
        field_k = null;
    }
}
