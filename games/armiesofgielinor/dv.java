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
        tc discarded$2 = null;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        je var5 = null;
        int var6 = 0;
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_d.field_Jb.a(this.a(param0, param1, (byte) -68), param2 + 368);
              if ((this.field_d.field_Jb.field_fb.b(false) ^ -1) >= param2) {
                break L1;
              } else {
                discarded$2 = this.field_d.field_Jb.field_fb.a(0);
                break L1;
              }
            }
            var4_int = 5;
            var5 = (je) ((Object) this.field_d.field_Jb.field_fb.e((byte) 107));
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    var5.field_ab = var4_int;
                    var4_int = var4_int + this.field_l;
                    var5 = (je) ((Object) this.field_d.field_Jb.field_fb.a((byte) 123));
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
                this.field_d.field_Jb.field_ob = var4_int;
                this.field_d.field_Jb.field_ab = this.field_d.field_ob + -var4_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("dv.E(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    abstract boolean a(String param0, boolean param1);

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = param0.indexOf(param2);
          if (param1 <= -45) {
            break L0;
          } else {
            field_g = (String) null;
            break L0;
          }
        }
        L1: while (true) {
          if (-1 != var4) {
            param0 = param0.substring(0, var4) + param3 + param0.substring(var4 + param2.length());
            stackOut_4_0 = (String) (param0);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_6_0).indexOf(param2, param3.length() + var4);
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return param0;
          }
        }
    }

    void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        je stackIn_10_0 = null;
        je stackIn_11_0 = null;
        je stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        je stackIn_27_0 = null;
        je stackIn_28_0 = null;
        je stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        je stackOut_26_0 = null;
        je stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        je stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        je stackOut_9_0 = null;
        je stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        je stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (-1 > (this.field_q.field_ob + this.field_q.field_ab ^ -1)) {
              L2: {
                qn.b(this.field_q.field_V, this.field_q.field_D, this.field_d.field_S, this.field_q.field_ob, 5592405, 230);
                qn.b(this.field_d.field_gb + this.field_d.field_V, this.field_q.field_D, this.field_d.field_S, this.field_q.field_ob, 5592405, 230);
                qn.b(this.field_d.field_V, this.field_q.field_D, this.field_d.field_gb, this.field_d.field_ab, 5592405, 230);
                qn.b(this.field_d.field_V, this.field_d.field_ob + this.field_d.field_D, this.field_d.field_gb, this.field_o.field_D + (-this.field_d.field_D + -this.field_d.field_ob), 5592405, 230);
                qn.b(this.field_d.field_V, this.field_o.field_ob + this.field_o.field_D, this.field_d.field_gb, -this.field_o.field_ob + this.field_q.field_ob + -this.field_o.field_ab, 5592405, 230);
                qn.b(this.field_d.field_V, this.field_d.field_D, this.field_d.field_gb, this.field_d.field_ob, 2236962, 240);
                qn.b(this.field_o.field_V, this.field_o.field_D, this.field_o.field_gb, this.field_o.field_ob, 2236962, 240);
                var2 = this.field_q.field_ab + 256;
                if ((var2 ^ -1) > -1) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              qn.b(this.field_q.field_V, this.field_q.field_D - -this.field_q.field_ob, this.field_q.field_gb, -this.field_q.field_ob + (-this.field_q.field_D + dt.field_a), 0, var2 >> 877302241);
              var3 = 5 + this.field_q.field_ab - -this.field_q.field_ob;
              var4 = 0;
              L3: while (true) {
                if ((var4 ^ -1) <= -7) {
                  L4: {
                    stackOut_26_0 = this.field_q;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (0 != (8 & this.field_n)) {
                      stackOut_28_0 = (je) ((Object) stackIn_28_0);
                      stackOut_28_1 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L4;
                    } else {
                      stackOut_27_0 = (je) ((Object) stackIn_27_0);
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L4;
                    }
                  }
                  ((je) (Object) stackIn_29_0).b(stackIn_29_1 != 0, 20);
                  break L1;
                } else {
                  qn.e(0, var3, bn.field_b, 0, var4 << 2124655717);
                  var3--;
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      L5: {
                        stackOut_9_0 = this.field_q;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (0 != (8 & this.field_n)) {
                          stackOut_11_0 = (je) ((Object) stackIn_11_0);
                          stackOut_11_1 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          break L5;
                        } else {
                          stackOut_10_0 = (je) ((Object) stackIn_10_0);
                          stackOut_10_1 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L5;
                        }
                      }
                      ((je) (Object) stackIn_12_0).b(stackIn_12_1 != 0, 20);
                      var2 = 126 / ((13 - param0) / 33);
                      if (this.field_e != null) {
                        if (this.field_f) {
                          var3 = this.field_q.field_ob + this.field_q.field_ab;
                          this.field_s.field_ab = var3;
                          this.field_s.b(false, 20);
                          var3 = var3 + (this.field_l - -5);
                          var4 = 0;
                          L6: while (true) {
                            if (this.field_e.length > var4) {
                              this.field_t.b(this.field_e[var4], 10 + this.field_s.field_V, var3, 13421772, -1);
                              var3 = var3 + this.field_l;
                              var4++;
                              if (var5 == 0) {
                                continue L6;
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
            } else {
              break L1;
            }
          }
          var2 = 126 / ((13 - param0) / 33);
          break L0;
        }
        if (this.field_e != null) {
          if (this.field_f) {
            var3 = this.field_q.field_ob + this.field_q.field_ab;
            this.field_s.field_ab = var3;
            this.field_s.b(false, 20);
            var3 = var3 + (this.field_l - -5);
            var4 = 0;
            L7: while (true) {
              if (this.field_e.length > var4) {
                this.field_t.b(this.field_e[var4], 10 + this.field_s.field_V, var3, 13421772, -1);
                var3 = var3 + this.field_l;
                var4++;
                if (var5 == 0) {
                  continue L7;
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
        tc discarded$2 = null;
        rq var3 = null;
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
                discarded$2 = this.field_j.c((byte) -123);
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
            stackOut_10_1 = new StringBuilder().append("dv.H(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                if (var6 == 0) {
                  break L0;
                } else {
                  break L1;
                }
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
          if (this.field_o.q(0).equals(this.field_h)) {
            if (this.field_o.o(93) == this.field_a) {
              this.field_n = this.field_n + 1;
              if (param0 > -58) {
                return;
              } else {
                this.field_q.a(true, param1);
                this.field_d.a(this.field_l, true, el.field_d * (2 * this.field_l), false);
                this.field_o.m(0);
                return;
              }
            } else {
              this.field_h = this.field_o.q(0);
              this.field_a = this.field_o.o(-29);
              this.field_e = this.b(true);
              if (null == this.field_e) {
                break L2;
              } else {
                if (this.field_e.length != 0) {
                  break L2;
                } else {
                  this.field_e = null;
                  break L2;
                }
              }
            }
          } else {
            this.field_h = this.field_o.q(0);
            this.field_a = this.field_o.o(-29);
            this.field_e = this.b(true);
            if (null == this.field_e) {
              break L2;
            } else {
              if (this.field_e.length != 0) {
                break L2;
              } else {
                this.field_e = null;
                break L2;
              }
            }
          }
        }
        if (null != this.field_e) {
          var3 = 0;
          var4 = 0;
          L3: while (true) {
            L4: {
              if (var4 >= this.field_e.length) {
                break L4;
              } else {
                var5 = this.field_t.a(this.field_e[var4]);
                var8 = var5 ^ -1;
                var7 = var3 ^ -1;
                if (var6 != 0) {
                  if (var7 > var8) {
                    return;
                  } else {
                    this.field_q.a(true, param1);
                    this.field_d.a(this.field_l, true, el.field_d * (2 * this.field_l), false);
                    this.field_o.m(0);
                    return;
                  }
                } else {
                  L5: {
                    if (var7 > var8) {
                      var3 = var5;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
            this.field_s.field_gb = var3 + 20;
            this.field_s.field_ob = 15 - -(this.field_e.length * this.field_l);
            this.field_n = this.field_n + 1;
            if (param0 > -58) {
              return;
            } else {
              this.field_q.a(true, param1);
              this.field_d.a(this.field_l, true, el.field_d * (2 * this.field_l), false);
              this.field_o.m(0);
              return;
            }
          }
        } else {
          this.field_n = this.field_n + 1;
          if (param0 > -58) {
            return;
          } else {
            this.field_q.a(true, param1);
            this.field_d.a(this.field_l, true, el.field_d * (2 * this.field_l), false);
            this.field_o.m(0);
            return;
          }
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((rd.field_j.field_xb.field_C & 1 << rd.field_j.field_q) != 0) {
          il.field_t[10] = np.field_Jb;
          if (param0) {
            return;
          } else {
            field_i = (String) null;
            return;
          }
        } else {
          if (-1 == ((rd.field_j.field_xb.field_e ^ -1) & rd.field_j.field_xb.field_C ^ -1)) {
            il.field_t[10] = uu.field_c;
            if (var2 == 0) {
              if (param0) {
                return;
              } else {
                field_i = (String) null;
                return;
              }
            } else {
              il.field_t[10] = np.field_Jb;
              if (param0) {
                return;
              } else {
                field_i = (String) null;
                return;
              }
            }
          } else {
            il.field_t[10] = dm.field_O;
            if (var2 != 0) {
              il.field_t[10] = uu.field_c;
              if (var2 != 0) {
                il.field_t[10] = np.field_Jb;
                if (param0) {
                  return;
                } else {
                  field_i = (String) null;
                  return;
                }
              } else {
                if (param0) {
                  return;
                } else {
                  field_i = (String) null;
                  return;
                }
              }
            } else {
              if (param0) {
                return;
              } else {
                field_i = (String) null;
                return;
              }
            }
          }
        }
    }

    private final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        at var9 = null;
        rq var10 = null;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                  var8 = var6[var7];
                  if (var11 == 0) {
                    L2: {
                      L3: {
                        L4: {
                          if (var4_int > this.field_t.a(var8)) {
                            break L4;
                          } else {
                            var9 = this.a(var8, var4_int, (byte) -98);
                            var10 = (rq) ((Object) var9.e((byte) 123));
                            L5: while (true) {
                              if (var10 == null) {
                                if (var11 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                this.a(param1, var10.field_l, -257);
                                var10 = (rq) ((Object) var9.a((byte) 123));
                                if (var11 != 0) {
                                  break L2;
                                } else {
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                        this.a(param1, var8, -257);
                        break L3;
                      }
                      var7++;
                      break L2;
                    }
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("dv.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final at a(String param0, int param1, byte param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var4 = null;
        at var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        at stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_25_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
            var4_ref = new at();
            L2: while (true) {
              if (param0 == null) {
                stackOut_25_0 = (at) (var4_ref);
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = this.field_t.a(param0);
                    var6 = param0;
                    if (param1 >= var5) {
                      break L4;
                    } else {
                      var7 = -1 + param0.length();
                      L5: while (true) {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                if (-1 <= (var7 ^ -1)) {
                                  break L9;
                                } else {
                                  stackOut_8_0 = var5 ^ -1;
                                  stackOut_8_1 = param1 ^ -1;
                                  stackIn_16_0 = stackOut_8_0;
                                  stackIn_16_1 = stackOut_8_1;
                                  stackIn_9_0 = stackOut_8_0;
                                  stackIn_9_1 = stackOut_8_1;
                                  if (var8 != 0) {
                                    break L8;
                                  } else {
                                    L10: {
                                      if (stackIn_9_0 < stackIn_9_1) {
                                        break L10;
                                      } else {
                                        if (param0.charAt(var7) == 32) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    incrementValue$2 = var7;
                                    var7--;
                                    var5 = var5 - this.field_t.a(param0.charAt(incrementValue$2));
                                    if (var8 == 0) {
                                      continue L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              if (var7 == 0) {
                                var5 = this.field_t.a(param0);
                                stackOut_15_0 = param0.length();
                                stackOut_15_1 = -1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                            var7 = stackIn_16_0 + stackIn_16_1;
                            L11: while (true) {
                              if (param1 >= var5) {
                                break L7;
                              } else {
                                incrementValue$3 = var7;
                                var7--;
                                var5 = var5 - this.field_t.a(param0.charAt(incrementValue$3));
                                if (var8 != 0) {
                                  break L6;
                                } else {
                                  continue L11;
                                }
                              }
                            }
                          }
                          var6 = param0.substring(0, var7);
                          param0 = param0.substring(1 + var7);
                          break L6;
                        }
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  param0 = null;
                  break L3;
                }
                var4_ref.a((byte) -119, (tc) (new rq(var6)));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("dv.N(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    private final je a(int param0, int param1, int param2) {
        je var4 = null;
        var4 = new je(0L, (je) null);
        var4.field_G = tn.a(true, param1, param2);
        if (param0 != 5592405) {
          this.field_d = (dn) null;
          return var4;
        } else {
          return var4;
        }
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = (je) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("dv.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, 13421772, param0 ^ 90);
              if (param0 == -1) {
                break L1;
              } else {
                this.field_a = 92;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dv.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract String[] b(boolean param0);

    private final void b(byte param0) {
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
          if (this.field_f) {
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
        ((dv) (this)).field_f = stackIn_3_1 != 0;
        if (this.field_f) {
          this.field_p = 15;
          if (this.field_q != null) {
            this.field_q.b(param0 ^ -1, this.field_o);
            if (!ArmiesOfGielinor.field_M) {
              if (param0 == -4) {
                return;
              } else {
                field_r = (String) null;
                return;
              }
            } else {
              if (null != this.field_q) {
                this.field_q.b(3, (je) null);
                if (param0 == -4) {
                  return;
                } else {
                  field_r = (String) null;
                  return;
                }
              } else {
                if (param0 == -4) {
                  return;
                } else {
                  field_r = (String) null;
                  return;
                }
              }
            }
          } else {
            if (param0 == -4) {
              return;
            } else {
              field_r = (String) null;
              return;
            }
          }
        } else {
          if (null != this.field_q) {
            this.field_q.b(3, (je) null);
            if (param0 == -4) {
              return;
            } else {
              field_r = (String) null;
              return;
            }
          } else {
            if (param0 == -4) {
              return;
            } else {
              field_r = (String) null;
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 == -66) {
          if (param15 > param0) {
            if (param8 <= param15) {
              if (param8 > param0) {
                q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                if (var17 != 0) {
                  q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                  return;
                } else {
                  return;
                }
              } else {
                q.a(qn.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
                if (var17 != 0) {
                  q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                  q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                  return;
                } else {
                  return;
                }
              }
            } else {
              q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
              return;
            }
          } else {
            if (param8 > param0) {
              q.a(qn.field_d, param9, param4, param12, param13, param1, param6, param5, param7, param11, param0, param8, param2, true, param14, param15, param10);
              if (var17 != 0) {
                if (param8 > param15) {
                  q.a(qn.field_d, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
                  if (var17 != 0) {
                    L0: {
                      L1: {
                        if (param8 > param15) {
                          break L1;
                        } else {
                          L2: {
                            if (param8 > param0) {
                              break L2;
                            } else {
                              q.a(qn.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
                              break L2;
                            }
                          }
                          q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                          if (var17 == 0) {
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                      break L0;
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    L4: {
                      q.a(qn.field_d, param1, param13, param4, param12, param5, param7, param9, param10, param2, param15, param0, param14, true, param11, param8, param6);
                      q.a(qn.field_d, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
                      if (param8 > param15) {
                        break L4;
                      } else {
                        L5: {
                          if (param8 > param0) {
                            break L5;
                          } else {
                            q.a(qn.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
                            break L5;
                          }
                        }
                        q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                        if (var17 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                    break L3;
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              if (param8 > param15) {
                q.a(qn.field_d, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
                if (var17 != 0) {
                  L6: {
                    L7: {
                      if (param8 > param15) {
                        break L7;
                      } else {
                        L8: {
                          if (param8 > param0) {
                            break L8;
                          } else {
                            q.a(qn.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
                            break L8;
                          }
                        }
                        q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                        if (var17 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                    break L6;
                  }
                  return;
                } else {
                  return;
                }
              } else {
                q.a(qn.field_d, param1, param13, param4, param12, param5, param7, param9, param10, param2, param15, param0, param14, true, param11, param8, param6);
                if (var17 != 0) {
                  L9: {
                    L10: {
                      q.a(qn.field_d, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
                      if (param8 > param15) {
                        break L10;
                      } else {
                        L11: {
                          if (param8 > param0) {
                            break L11;
                          } else {
                            q.a(qn.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
                            break L11;
                          }
                        }
                        q.a(qn.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
                        if (var17 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    q.a(qn.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
                    break L9;
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, char param1, int param2) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        je var5 = null;
        int var6 = 0;
        String var8 = null;
        String var9 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        tc stackIn_37_1 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        tc stackIn_58_1 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        tc stackIn_81_1 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        tc stackIn_88_1 = null;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        tc stackIn_116_1 = null;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        Object stackIn_133_0 = null;
        tc stackIn_133_1 = null;
        Object stackIn_138_0 = null;
        Object stackIn_139_0 = null;
        Object stackIn_140_0 = null;
        tc stackIn_140_1 = null;
        Object stackIn_150_0 = null;
        Object stackIn_151_0 = null;
        Object stackIn_152_0 = null;
        tc stackIn_152_1 = null;
        Object stackIn_157_0 = null;
        Object stackIn_158_0 = null;
        Object stackIn_159_0 = null;
        tc stackIn_159_1 = null;
        Object stackIn_166_0 = null;
        Object stackIn_167_0 = null;
        Object stackIn_168_0 = null;
        tc stackIn_168_1 = null;
        Object stackIn_173_0 = null;
        Object stackIn_174_0 = null;
        Object stackIn_175_0 = null;
        tc stackIn_175_1 = null;
        Object stackOut_85_0 = null;
        Object stackOut_87_0 = null;
        tc stackOut_87_1 = null;
        Object stackOut_86_0 = null;
        tc stackOut_86_1 = null;
        Object stackOut_78_0 = null;
        Object stackOut_80_0 = null;
        tc stackOut_80_1 = null;
        Object stackOut_79_0 = null;
        tc stackOut_79_1 = null;
        Object stackOut_55_0 = null;
        Object stackOut_57_0 = null;
        tc stackOut_57_1 = null;
        Object stackOut_56_0 = null;
        tc stackOut_56_1 = null;
        Object stackOut_172_0 = null;
        Object stackOut_174_0 = null;
        tc stackOut_174_1 = null;
        Object stackOut_173_0 = null;
        tc stackOut_173_1 = null;
        Object stackOut_165_0 = null;
        Object stackOut_167_0 = null;
        tc stackOut_167_1 = null;
        Object stackOut_166_0 = null;
        tc stackOut_166_1 = null;
        Object stackOut_156_0 = null;
        Object stackOut_158_0 = null;
        tc stackOut_158_1 = null;
        Object stackOut_157_0 = null;
        tc stackOut_157_1 = null;
        Object stackOut_149_0 = null;
        Object stackOut_151_0 = null;
        tc stackOut_151_1 = null;
        Object stackOut_150_0 = null;
        tc stackOut_150_1 = null;
        Object stackOut_137_0 = null;
        Object stackOut_139_0 = null;
        tc stackOut_139_1 = null;
        Object stackOut_138_0 = null;
        tc stackOut_138_1 = null;
        Object stackOut_130_0 = null;
        Object stackOut_132_0 = null;
        tc stackOut_132_1 = null;
        Object stackOut_131_0 = null;
        tc stackOut_131_1 = null;
        Object stackOut_113_0 = null;
        Object stackOut_115_0 = null;
        tc stackOut_115_1 = null;
        Object stackOut_114_0 = null;
        tc stackOut_114_1 = null;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        tc stackOut_36_1 = null;
        Object stackOut_35_0 = null;
        tc stackOut_35_1 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -30847) {
          if (96 != param1) {
            if (this.field_f) {
              L0: {
                if (84 != param2) {
                  break L0;
                } else {
                  L1: {
                    var9 = this.field_o.q(0);
                    if ((var9.length() ^ -1) < -1) {
                      this.a(this.field_c + var9, 5635925, param0 + 30734);
                      var5 = (je) ((Object) this.field_d.field_Jb.field_fb.d((byte) -81));
                      if (this.a(var9, true)) {
                        this.field_o.a(true);
                        this.a(var9, param0 + 30943);
                        this.field_b = null;
                        break L1;
                      } else {
                        var5.field_N = 16733525;
                        this.field_o.a(true);
                        this.a(var9, param0 + 30943);
                        this.field_b = null;
                        if (var6 != 0) {
                          if (98 != param2) {
                            L2: {
                              if (-100 == (param2 ^ -1)) {
                                break L2;
                              } else {
                                L3: {
                                  if (80 == param2) {
                                    break L3;
                                  } else {
                                    discarded$3 = this.field_o.a(param2, param0 + 4721, param1);
                                    if (var6 != 0) {
                                      break L3;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                                this.a((byte) 122);
                                if (var6 != 0) {
                                  break L2;
                                } else {
                                  return true;
                                }
                              }
                            }
                            if (this.field_b != null) {
                              if (this.field_j.field_d != this.field_b.field_j) {
                                this.field_b = (rq) ((Object) this.field_b.field_j);
                                this.field_o.a(this.field_b.field_l, (byte) 45);
                                if (var6 != 0) {
                                  if (null == this.field_b) {
                                    L4: {
                                      stackOut_85_0 = this;
                                      stackIn_87_0 = stackOut_85_0;
                                      stackIn_86_0 = stackOut_85_0;
                                      if (this.field_b == null) {
                                        stackOut_87_0 = this;
                                        stackOut_87_1 = this.field_j.e((byte) 119);
                                        stackIn_88_0 = stackOut_87_0;
                                        stackIn_88_1 = stackOut_87_1;
                                        break L4;
                                      } else {
                                        stackOut_86_0 = this;
                                        stackOut_86_1 = this.field_b.field_b;
                                        stackIn_88_0 = stackOut_86_0;
                                        stackIn_88_1 = stackOut_86_1;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      ((dv) (this)).field_b = (rq) ((Object) stackIn_88_1);
                                      if (this.field_b != null) {
                                        this.field_o.a(this.field_b.field_l, (byte) 45);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    return true;
                                  } else {
                                    L6: {
                                      if (this.field_b.field_b == this.field_j.field_d) {
                                        break L6;
                                      } else {
                                        L7: {
                                          stackOut_78_0 = this;
                                          stackIn_80_0 = stackOut_78_0;
                                          stackIn_79_0 = stackOut_78_0;
                                          if (this.field_b == null) {
                                            stackOut_80_0 = this;
                                            stackOut_80_1 = this.field_j.e((byte) 119);
                                            stackIn_81_0 = stackOut_80_0;
                                            stackIn_81_1 = stackOut_80_1;
                                            break L7;
                                          } else {
                                            stackOut_79_0 = this;
                                            stackOut_79_1 = this.field_b.field_b;
                                            stackIn_81_0 = stackOut_79_0;
                                            stackIn_81_1 = stackOut_79_1;
                                            break L7;
                                          }
                                        }
                                        ((dv) (this)).field_b = (rq) ((Object) stackIn_81_1);
                                        if (this.field_b != null) {
                                          this.field_o.a(this.field_b.field_l, (byte) 45);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    return true;
                                  }
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
                            L8: {
                              L9: {
                                if (null == this.field_b) {
                                  break L9;
                                } else {
                                  if (this.field_b.field_b == this.field_j.field_d) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                stackOut_55_0 = this;
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_56_0 = stackOut_55_0;
                                if (this.field_b == null) {
                                  stackOut_57_0 = this;
                                  stackOut_57_1 = this.field_j.e((byte) 119);
                                  stackIn_58_0 = stackOut_57_0;
                                  stackIn_58_1 = stackOut_57_1;
                                  break L10;
                                } else {
                                  stackOut_56_0 = this;
                                  stackOut_56_1 = this.field_b.field_b;
                                  stackIn_58_0 = stackOut_56_0;
                                  stackIn_58_1 = stackOut_56_1;
                                  break L10;
                                }
                              }
                              ((dv) (this)).field_b = (rq) ((Object) stackIn_58_1);
                              if (this.field_b != null) {
                                this.field_o.a(this.field_b.field_l, (byte) 45);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            return true;
                          }
                        } else {
                          return true;
                        }
                      }
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
              L11: {
                if (98 == param2) {
                  if (null == this.field_b) {
                    L12: {
                      stackOut_172_0 = this;
                      stackIn_174_0 = stackOut_172_0;
                      stackIn_173_0 = stackOut_172_0;
                      if (this.field_b == null) {
                        stackOut_174_0 = this;
                        stackOut_174_1 = this.field_j.e((byte) 119);
                        stackIn_175_0 = stackOut_174_0;
                        stackIn_175_1 = stackOut_174_1;
                        break L12;
                      } else {
                        stackOut_173_0 = this;
                        stackOut_173_1 = this.field_b.field_b;
                        stackIn_175_0 = stackOut_173_0;
                        stackIn_175_1 = stackOut_173_1;
                        break L12;
                      }
                    }
                    ((dv) (this)).field_b = (rq) ((Object) stackIn_175_1);
                    if (this.field_b != null) {
                      this.field_o.a(this.field_b.field_l, (byte) 45);
                      break L11;
                    } else {
                      return true;
                    }
                  } else {
                    if (this.field_b.field_b == this.field_j.field_d) {
                      break L11;
                    } else {
                      L13: {
                        stackOut_165_0 = this;
                        stackIn_167_0 = stackOut_165_0;
                        stackIn_166_0 = stackOut_165_0;
                        if (this.field_b == null) {
                          stackOut_167_0 = this;
                          stackOut_167_1 = this.field_j.e((byte) 119);
                          stackIn_168_0 = stackOut_167_0;
                          stackIn_168_1 = stackOut_167_1;
                          break L13;
                        } else {
                          stackOut_166_0 = this;
                          stackOut_166_1 = this.field_b.field_b;
                          stackIn_168_0 = stackOut_166_0;
                          stackIn_168_1 = stackOut_166_1;
                          break L13;
                        }
                      }
                      L14: {
                        ((dv) (this)).field_b = (rq) ((Object) stackIn_168_1);
                        if (this.field_b != null) {
                          this.field_o.a(this.field_b.field_l, (byte) 45);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  if (-100 == (param2 ^ -1)) {
                    if (this.field_b == null) {
                      break L11;
                    } else {
                      if (this.field_j.field_d == this.field_b.field_j) {
                        break L11;
                      } else {
                        this.field_b = (rq) ((Object) this.field_b.field_j);
                        this.field_o.a(this.field_b.field_l, (byte) 45);
                        if (var6 == 0) {
                          break L11;
                        } else {
                          L15: {
                            if (null == this.field_b) {
                              L16: {
                                stackOut_156_0 = this;
                                stackIn_158_0 = stackOut_156_0;
                                stackIn_157_0 = stackOut_156_0;
                                if (this.field_b == null) {
                                  stackOut_158_0 = this;
                                  stackOut_158_1 = this.field_j.e((byte) 119);
                                  stackIn_159_0 = stackOut_158_0;
                                  stackIn_159_1 = stackOut_158_1;
                                  break L16;
                                } else {
                                  stackOut_157_0 = this;
                                  stackOut_157_1 = this.field_b.field_b;
                                  stackIn_159_0 = stackOut_157_0;
                                  stackIn_159_1 = stackOut_157_1;
                                  break L16;
                                }
                              }
                              ((dv) (this)).field_b = (rq) ((Object) stackIn_159_1);
                              if (this.field_b != null) {
                                this.field_o.a(this.field_b.field_l, (byte) 45);
                                break L15;
                              } else {
                                return true;
                              }
                            } else {
                              if (this.field_b.field_b == this.field_j.field_d) {
                                break L15;
                              } else {
                                L17: {
                                  stackOut_149_0 = this;
                                  stackIn_151_0 = stackOut_149_0;
                                  stackIn_150_0 = stackOut_149_0;
                                  if (this.field_b == null) {
                                    stackOut_151_0 = this;
                                    stackOut_151_1 = this.field_j.e((byte) 119);
                                    stackIn_152_0 = stackOut_151_0;
                                    stackIn_152_1 = stackOut_151_1;
                                    break L17;
                                  } else {
                                    stackOut_150_0 = this;
                                    stackOut_150_1 = this.field_b.field_b;
                                    stackIn_152_0 = stackOut_150_0;
                                    stackIn_152_1 = stackOut_150_1;
                                    break L17;
                                  }
                                }
                                L18: {
                                  ((dv) (this)).field_b = (rq) ((Object) stackIn_152_1);
                                  if (this.field_b != null) {
                                    this.field_o.a(this.field_b.field_l, (byte) 45);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                return true;
                              }
                            }
                          }
                          return true;
                        }
                      }
                    }
                  } else {
                    if (80 == param2) {
                      this.a((byte) 122);
                      if (var6 != 0) {
                        if (this.field_b != null) {
                          if (this.field_j.field_d != this.field_b.field_j) {
                            this.field_b = (rq) ((Object) this.field_b.field_j);
                            this.field_o.a(this.field_b.field_l, (byte) 45);
                            if (var6 != 0) {
                              L19: {
                                if (null == this.field_b) {
                                  L20: {
                                    stackOut_137_0 = this;
                                    stackIn_139_0 = stackOut_137_0;
                                    stackIn_138_0 = stackOut_137_0;
                                    if (this.field_b == null) {
                                      stackOut_139_0 = this;
                                      stackOut_139_1 = this.field_j.e((byte) 119);
                                      stackIn_140_0 = stackOut_139_0;
                                      stackIn_140_1 = stackOut_139_1;
                                      break L20;
                                    } else {
                                      stackOut_138_0 = this;
                                      stackOut_138_1 = this.field_b.field_b;
                                      stackIn_140_0 = stackOut_138_0;
                                      stackIn_140_1 = stackOut_138_1;
                                      break L20;
                                    }
                                  }
                                  ((dv) (this)).field_b = (rq) ((Object) stackIn_140_1);
                                  if (this.field_b != null) {
                                    this.field_o.a(this.field_b.field_l, (byte) 45);
                                    break L19;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  if (this.field_b.field_b == this.field_j.field_d) {
                                    break L19;
                                  } else {
                                    L21: {
                                      stackOut_130_0 = this;
                                      stackIn_132_0 = stackOut_130_0;
                                      stackIn_131_0 = stackOut_130_0;
                                      if (this.field_b == null) {
                                        stackOut_132_0 = this;
                                        stackOut_132_1 = this.field_j.e((byte) 119);
                                        stackIn_133_0 = stackOut_132_0;
                                        stackIn_133_1 = stackOut_132_1;
                                        break L21;
                                      } else {
                                        stackOut_131_0 = this;
                                        stackOut_131_1 = this.field_b.field_b;
                                        stackIn_133_0 = stackOut_131_0;
                                        stackIn_133_1 = stackOut_131_1;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      ((dv) (this)).field_b = (rq) ((Object) stackIn_133_1);
                                      if (this.field_b != null) {
                                        this.field_o.a(this.field_b.field_l, (byte) 45);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
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
                        return true;
                      }
                    } else {
                      discarded$4 = this.field_o.a(param2, param0 + 4721, param1);
                      if (var6 != 0) {
                        this.a((byte) 122);
                        if (var6 != 0) {
                          if (this.field_b != null) {
                            if (this.field_j.field_d != this.field_b.field_j) {
                              this.field_b = (rq) ((Object) this.field_b.field_j);
                              this.field_o.a(this.field_b.field_l, (byte) 45);
                              if (var6 != 0) {
                                L23: {
                                  if (null == this.field_b) {
                                    break L23;
                                  } else {
                                    if (this.field_b.field_b != this.field_j.field_d) {
                                      break L23;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                                L24: {
                                  stackOut_113_0 = this;
                                  stackIn_115_0 = stackOut_113_0;
                                  stackIn_114_0 = stackOut_113_0;
                                  if (this.field_b == null) {
                                    stackOut_115_0 = this;
                                    stackOut_115_1 = this.field_j.e((byte) 119);
                                    stackIn_116_0 = stackOut_115_0;
                                    stackIn_116_1 = stackOut_115_1;
                                    break L24;
                                  } else {
                                    stackOut_114_0 = this;
                                    stackOut_114_1 = this.field_b.field_b;
                                    stackIn_116_0 = stackOut_114_0;
                                    stackIn_116_1 = stackOut_114_1;
                                    break L24;
                                  }
                                }
                                ((dv) (this)).field_b = (rq) ((Object) stackIn_116_1);
                                if (this.field_b == null) {
                                  return true;
                                } else {
                                  this.field_o.a(this.field_b.field_l, (byte) 45);
                                  return true;
                                }
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
                          return true;
                        }
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          } else {
            this.b((byte) -4);
            return true;
          }
        } else {
          dv.a(false);
          if (96 != param1) {
            if (this.field_f) {
              L25: {
                if (84 != param2) {
                  break L25;
                } else {
                  L26: {
                    var8 = this.field_o.q(0);
                    if ((var8.length() ^ -1) < -1) {
                      this.a(this.field_c + var8, 5635925, param0 + 30734);
                      var5 = (je) ((Object) this.field_d.field_Jb.field_fb.d((byte) -81));
                      if (this.a(var8, true)) {
                        this.field_o.a(true);
                        this.a(var8, param0 + 30943);
                        this.field_b = null;
                        break L26;
                      } else {
                        var5.field_N = 16733525;
                        this.field_o.a(true);
                        this.a(var8, param0 + 30943);
                        this.field_b = null;
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  if (var6 != 0) {
                    break L25;
                  } else {
                    return true;
                  }
                }
              }
              L27: {
                if (98 == param2) {
                  break L27;
                } else {
                  L28: {
                    if (-100 == (param2 ^ -1)) {
                      break L28;
                    } else {
                      L29: {
                        if (80 == param2) {
                          break L29;
                        } else {
                          discarded$5 = this.field_o.a(param2, param0 + 4721, param1);
                          if (var6 != 0) {
                            break L29;
                          } else {
                            return true;
                          }
                        }
                      }
                      this.a((byte) 122);
                      if (var6 != 0) {
                        break L28;
                      } else {
                        return true;
                      }
                    }
                  }
                  if (this.field_b != null) {
                    if (this.field_j.field_d != this.field_b.field_j) {
                      this.field_b = (rq) ((Object) this.field_b.field_j);
                      this.field_o.a(this.field_b.field_l, (byte) 45);
                      if (var6 != 0) {
                        break L27;
                      } else {
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
              L30: {
                if (null == this.field_b) {
                  break L30;
                } else {
                  if (this.field_b.field_b != this.field_j.field_d) {
                    break L30;
                  } else {
                    return true;
                  }
                }
              }
              L31: {
                stackOut_34_0 = this;
                stackIn_36_0 = stackOut_34_0;
                stackIn_35_0 = stackOut_34_0;
                if (this.field_b == null) {
                  stackOut_36_0 = this;
                  stackOut_36_1 = this.field_j.e((byte) 119);
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  break L31;
                } else {
                  stackOut_35_0 = this;
                  stackOut_35_1 = this.field_b.field_b;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  break L31;
                }
              }
              ((dv) (this)).field_b = (rq) ((Object) stackIn_37_1);
              if (this.field_b != null) {
                this.field_o.a(this.field_b.field_l, (byte) 45);
                return true;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            this.b((byte) -4);
            return true;
          }
        }
    }

    private final je a(boolean param0, int param1) {
        je var3 = new je();
        var3.field_G = tn.a(param0, 0, param1);
        return var3;
    }

    dv(ka param0, hd param1) {
        RuntimeException var3 = null;
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
        this.field_c = "# ";
        this.field_j = new at();
        this.field_e = null;
        this.field_f = false;
        this.field_n = 0;
        this.field_p = 0;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("dv.<init>(");
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_r = "Discard";
        field_i = "Mana";
        field_g = "0.0";
        field_k = null;
    }
}
