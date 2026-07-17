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
            ((dv) this).field_d.field_Jb.a(this.a(param0, param1, (byte) -68), 111);
            if (((dv) this).field_d.field_Jb.field_fb.b(false) > 256) {
                tc discarded$0 = ((dv) this).field_d.field_Jb.field_fb.a(0);
            }
            var4_int = 5;
            var5 = (je) (Object) ((dv) this).field_d.field_Jb.field_fb.e((byte) 107);
            while (var5 != null) {
                var5.field_ab = var4_int;
                var4_int = var4_int + ((dv) this).field_l;
                var5 = (je) (Object) ((dv) this).field_d.field_Jb.field_fb.a((byte) 123);
            }
            ((dv) this).field_d.field_Jb.field_ob = var4_int;
            ((dv) this).field_d.field_Jb.field_ab = ((dv) this).field_d.field_ob + -var4_int;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "dv.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + -257 + 41);
        }
    }

    abstract boolean a(String param0, boolean param1);

    final static String a(String param0, int param1, String param2, String param3) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = param0.indexOf(param2);
        if (param1 > -45) {
            field_g = null;
        }
        while (-1 != var4) {
            param0 = param0.substring(0, var4) + param3 + param0.substring(var4 + param2.length());
            var4 = param0.indexOf(param2, param3.length() + var4);
        }
        return param0;
    }

    void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        je stackIn_9_0 = null;
        je stackIn_10_0 = null;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackOut_8_0 = null;
        je stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        je stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((dv) this).field_q.field_ob + ((dv) this).field_q.field_ab > 0) {
            L1: {
              qn.b(((dv) this).field_q.field_V, ((dv) this).field_q.field_D, ((dv) this).field_d.field_S, ((dv) this).field_q.field_ob, 5592405, 230);
              qn.b(((dv) this).field_d.field_gb + ((dv) this).field_d.field_V, ((dv) this).field_q.field_D, ((dv) this).field_d.field_S, ((dv) this).field_q.field_ob, 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_q.field_D, ((dv) this).field_d.field_gb, ((dv) this).field_d.field_ab, 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_d.field_ob + ((dv) this).field_d.field_D, ((dv) this).field_d.field_gb, ((dv) this).field_o.field_D + (-((dv) this).field_d.field_D + -((dv) this).field_d.field_ob), 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_o.field_ob + ((dv) this).field_o.field_D, ((dv) this).field_d.field_gb, -((dv) this).field_o.field_ob + ((dv) this).field_q.field_ob + -((dv) this).field_o.field_ab, 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_d.field_D, ((dv) this).field_d.field_gb, ((dv) this).field_d.field_ob, 2236962, 240);
              qn.b(((dv) this).field_o.field_V, ((dv) this).field_o.field_D, ((dv) this).field_o.field_gb, ((dv) this).field_o.field_ob, 2236962, 240);
              var2 = ((dv) this).field_q.field_ab + 256;
              if (var2 < 0) {
                var2 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            qn.b(((dv) this).field_q.field_V, ((dv) this).field_q.field_D - -((dv) this).field_q.field_ob, ((dv) this).field_q.field_gb, -((dv) this).field_q.field_ob + (-((dv) this).field_q.field_D + dt.field_a), 0, var2 >> 1);
            var3 = 5 + ((dv) this).field_q.field_ab - -((dv) this).field_q.field_ob;
            var4 = 0;
            L2: while (true) {
              if (var4 >= 6) {
                L3: {
                  stackOut_8_0 = ((dv) this).field_q;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (0 != (8 & ((dv) this).field_n)) {
                    stackOut_10_0 = (je) (Object) stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = (je) (Object) stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                ((je) (Object) stackIn_11_0).b(stackIn_11_1 != 0, 20);
                break L0;
              } else {
                qn.e(0, var3, bn.field_b, 0, var4 << 5);
                var3--;
                var4++;
                continue L2;
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          var2 = 42;
          if (((dv) this).field_e == null) {
            break L4;
          } else {
            if (!((dv) this).field_f) {
              break L4;
            } else {
              var3 = ((dv) this).field_q.field_ob + ((dv) this).field_q.field_ab;
              ((dv) this).field_s.field_ab = var3;
              ((dv) this).field_s.b(false, 20);
              var3 = var3 + (((dv) this).field_l - -5);
              var6 = 0;
              var4 = var6;
              L5: while (true) {
                if (((dv) this).field_e.length <= var6) {
                  break L4;
                } else {
                  ((dv) this).field_t.b(((dv) this).field_e[var6], 10 + ((dv) this).field_s.field_V, var3, 13421772, -1);
                  var3 = var3 + ((dv) this).field_l;
                  var6++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    abstract void a(byte param0);

    private final je a() {
        int var4 = 0;
        je var3 = new je(0L, (je) null);
        int discarded$0 = 5;
        var3.field_G = ak.b(2263074);
        return var3;
    }

    public static void c() {
        field_k = null;
        field_r = null;
        field_m = null;
        int var1 = -2;
        field_g = null;
        field_i = null;
    }

    private final void a(String param0) {
        rq var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (rq) (Object) ((dv) this).field_j.e((byte) 90);
                if (var3 == null) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) var3.field_l)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((dv) this).field_j.a(750, (tc) (Object) new rq(param0));
              break L1;
            }
            L3: {
              if (((dv) this).field_j.b(false) > 30) {
                tc discarded$2 = ((dv) this).field_j.c((byte) -123);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("dv.H(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 96 + 41);
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!((dv) this).field_f) {
              break L1;
            } else {
              if (((dv) this).field_p <= 0) {
                break L1;
              } else {
                ((dv) this).field_p = ((dv) this).field_p - 1;
                ((dv) this).field_q.field_ab = -200 * (((dv) this).field_p * ((dv) this).field_p) / 225;
                break L0;
              }
            }
          }
          if (((dv) this).field_f) {
            break L0;
          } else {
            if (((dv) this).field_q.field_ab - -200 > 0) {
              ((dv) this).field_q.field_ab = ((dv) this).field_q.field_ab - 28;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (!((dv) this).field_o.q(0).equals((Object) (Object) ((dv) this).field_h)) {
              break L3;
            } else {
              if (((dv) this).field_o.o(93) == ((dv) this).field_a) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            ((dv) this).field_h = ((dv) this).field_o.q(0);
            ((dv) this).field_a = ((dv) this).field_o.o(-29);
            ((dv) this).field_e = ((dv) this).b(true);
            if (null == ((dv) this).field_e) {
              break L4;
            } else {
              if (((dv) this).field_e.length != 0) {
                break L4;
              } else {
                ((dv) this).field_e = null;
                break L4;
              }
            }
          }
          if (null == ((dv) this).field_e) {
            break L2;
          } else {
            var3 = 0;
            var4 = 0;
            L5: while (true) {
              if (var4 >= ((dv) this).field_e.length) {
                ((dv) this).field_s.field_gb = var3 + 20;
                ((dv) this).field_s.field_ob = 15 - -(((dv) this).field_e.length * ((dv) this).field_l);
                break L2;
              } else {
                var5 = ((dv) this).field_t.a(((dv) this).field_e[var4]);
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
        ((dv) this).field_n = ((dv) this).field_n + 1;
        if (param0 <= -58) {
          ((dv) this).field_q.a(true, param1);
          ((dv) this).field_d.a(((dv) this).field_l, true, el.field_d * (2 * ((dv) this).field_l), false);
          ((dv) this).field_o.m(0);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        L0: {
          var2 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((rd.field_j.field_xb.field_C & 1 << rd.field_j.field_q) != 0) {
            il.field_t[10] = np.field_Jb;
            break L0;
          } else {
            if (-1 == (rd.field_j.field_xb.field_e & rd.field_j.field_xb.field_C)) {
              il.field_t[10] = uu.field_c;
              break L0;
            } else {
              il.field_t[10] = dm.field_O;
              break L0;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = -10 + (((dv) this).field_d.field_gb + -15);
            var5 = dj.a(-100, '\n', param0);
            var6 = var5;
            if (param2 <= -25) {
              var7 = 0;
              L1: while (true) {
                if (var6.length <= var7) {
                  break L0;
                } else {
                  L2: {
                    var8 = var6[var7];
                    if (var4_int > ((dv) this).field_t.a(var8)) {
                      this.a(param1, var8, -257);
                      break L2;
                    } else {
                      var9 = this.a(var8, var4_int, (byte) -98);
                      var10 = (rq) (Object) var9.e((byte) 123);
                      L3: while (true) {
                        if (var10 == null) {
                          break L2;
                        } else {
                          this.a(param1, var10.field_l, -257);
                          var10 = (rq) (Object) var9.a((byte) 123);
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("dv.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final at a(String param0, int param1, byte param2) {
        at var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        at stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = new at();
            L1: while (true) {
              if (param0 == null) {
                stackOut_18_0 = (at) var4;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L2: {
                  var5 = ((dv) this).field_t.a(param0);
                  var6 = param0;
                  if (param1 >= var5) {
                    param0 = null;
                    break L2;
                  } else {
                    var7 = -1 + param0.length();
                    L3: while (true) {
                      L4: {
                        if (var7 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            if (var5 > param1) {
                              break L5;
                            } else {
                              if (param0.charAt(var7) == 32) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$4 = var7;
                          var7--;
                          var5 = var5 - ((dv) this).field_t.a(param0.charAt(incrementValue$4));
                          continue L3;
                        }
                      }
                      L6: {
                        if (var7 == 0) {
                          var5 = ((dv) this).field_t.a(param0);
                          var7 = param0.length() + -1;
                          L7: while (true) {
                            if (param1 >= var5) {
                              break L6;
                            } else {
                              int incrementValue$5 = var7;
                              var7--;
                              var5 = var5 - ((dv) this).field_t.a(param0.charAt(incrementValue$5));
                              continue L7;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      var6 = param0.substring(0, var7);
                      param0 = param0.substring(1 + var7);
                      break L2;
                    }
                  }
                }
                var4.a((byte) -119, (tc) (Object) new rq(var6));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4_ref;
            stackOut_20_1 = new StringBuilder().append("dv.N(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + -98 + 41);
        }
        return stackIn_19_0;
    }

    private final je a(int param0, int param1, int param2) {
        je var4 = new je(0L, (je) null);
        var4.field_G = tn.a(true, param1, param2);
        return var4;
    }

    final void a(Object param0, int param1) {
        try {
            int var3_int = 43 % ((45 - param1) / 56);
            ((dv) this).a(-1, param0 == null ? "null" : param0.toString());
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "dv.T(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final je a(int param0, String param1, byte param2) {
        je var4 = null;
        RuntimeException var4_ref = null;
        je stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new je(0L, (je) null, param1);
            var4.field_N = param0;
            var4.field_Z = ((dv) this).field_t;
            var4.a(((dv) this).field_l, -20500, ((dv) this).field_t.a(var4.field_X), 0, 5);
            stackOut_0_0 = (je) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("dv.L(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -68 + 41);
        }
        return stackIn_1_0;
    }

    final boolean a(int param0) {
        if (param0 != -31501) {
            return false;
        }
        return ((dv) this).field_f;
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
                ((dv) this).field_a = 92;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dv.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract String[] b(boolean param0);

    private final void b() {
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
          if (((dv) this).field_f) {
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
        L1: {
          ((dv) this).field_f = stackIn_3_1 != 0;
          if (!((dv) this).field_f) {
            if (null == ((dv) this).field_q) {
              break L1;
            } else {
              ((dv) this).field_q.b(3, (je) null);
              break L1;
            }
          } else {
            ((dv) this).field_p = 15;
            if (((dv) this).field_q != null) {
              ((dv) this).field_q.b(3, (je) (Object) ((dv) this).field_o);
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = ArmiesOfGielinor.field_M ? 1 : 0;
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
    }

    boolean a(int param0, char param1, int param2) {
        je var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        tc stackIn_23_1 = null;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        tc stackOut_22_1 = null;
        Object stackOut_21_0 = null;
        tc stackOut_21_1 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (96 == param1) {
          int discarded$3 = -4;
          this.b();
          return true;
        } else {
          if (((dv) this).field_f) {
            L0: {
              if (84 != param2) {
                if (98 == param2) {
                  L1: {
                    if (null == ((dv) this).field_b) {
                      break L1;
                    } else {
                      if (((dv) this).field_b.field_b == ((dv) this).field_j.field_d) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    stackOut_20_0 = this;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (((dv) this).field_b == null) {
                      stackOut_22_0 = this;
                      stackOut_22_1 = ((dv) this).field_j.e((byte) 119);
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L2;
                    } else {
                      stackOut_21_0 = this;
                      stackOut_21_1 = ((dv) this).field_b.field_b;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      break L2;
                    }
                  }
                  ((dv) this).field_b = (rq) (Object) stackIn_23_1;
                  if (((dv) this).field_b != null) {
                    ((dv) this).field_o.a(((dv) this).field_b.field_l, (byte) 45);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (param2 == 99) {
                    if (((dv) this).field_b == null) {
                      break L0;
                    } else {
                      if (((dv) this).field_j.field_d == ((dv) this).field_b.field_j) {
                        break L0;
                      } else {
                        ((dv) this).field_b = (rq) (Object) ((dv) this).field_b.field_j;
                        ((dv) this).field_o.a(((dv) this).field_b.field_l, (byte) 45);
                        break L0;
                      }
                    }
                  } else {
                    if (80 == param2) {
                      ((dv) this).a((byte) 122);
                      break L0;
                    } else {
                      boolean discarded$4 = ((dv) this).field_o.a(param2, -26126, param1);
                      break L0;
                    }
                  }
                }
              } else {
                var7 = ((dv) this).field_o.q(0);
                if (var7.length() > 0) {
                  L3: {
                    this.a(((dv) this).field_c + var7, 5635925, -113);
                    var5 = (je) (Object) ((dv) this).field_d.field_Jb.field_fb.d((byte) -81);
                    if (((dv) this).a(var7, true)) {
                      break L3;
                    } else {
                      var5.field_N = 16733525;
                      break L3;
                    }
                  }
                  ((dv) this).field_o.a(true);
                  int discarded$5 = 96;
                  this.a(var7);
                  ((dv) this).field_b = null;
                  break L0;
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
        var3.field_G = tn.a(true, 0, 65793);
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
        ((dv) this).field_c = "# ";
        ((dv) this).field_j = new at();
        ((dv) this).field_e = null;
        ((dv) this).field_f = false;
        ((dv) this).field_n = 0;
        ((dv) this).field_p = 0;
        try {
          L0: {
            ((dv) this).field_t = param0;
            ((dv) this).field_l = ((dv) this).field_t.field_H + ((dv) this).field_t.field_L;
            var3_int = ((dv) this).field_l - -4;
            var4 = this.a(true, 65793);
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a(5592405, 7829367, 2236962);
            var9 = this.a(5592405, 65793, 65793);
            var10 = this.a(5592405, 3355443, 65793);
            int discarded$2 = 2263074;
            int discarded$3 = 71;
            var11 = this.a();
            var12 = this.a(5592405, 2236962, 65793);
            ((dv) this).field_q = new je(0L, var5);
            ((dv) this).field_q.a(200, -20500, bn.field_b, -200, 0);
            var13 = new ll(0L, var8, var8, var9, var10);
            var14 = new je();
            var14.field_fb = new at();
            ((dv) this).field_d = new dn(0L, var14, var6, var13);
            ((dv) this).field_d.field_Jb.field_fb = new at();
            ((dv) this).field_d.a(5, false, ((dv) this).field_q.field_gb - 10, 0, 15, 5, 185 - var3_int);
            ((dv) this).field_q.a((je) (Object) ((dv) this).field_d, 71);
            var15 = new je();
            var15.field_Z = ((dv) this).field_t;
            var15.field_N = 13421772;
            var15.field_F = 5;
            var15.field_z = 2;
            ((dv) this).field_o = new dp(0L, var7, var11, var15);
            ((dv) this).field_o.b(((dv) this).field_d.field_ab - (-((dv) this).field_d.field_ob - 5), 0, ((dv) this).field_d.field_gb, var3_int, ((dv) this).field_d.field_S);
            ((dv) this).field_o.a(param1, 176);
            ((dv) this).field_q.a((je) (Object) ((dv) this).field_o, 87);
            ((dv) this).field_s = new je(0L, var12);
            ((dv) this).field_s.field_S = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("dv.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Discard";
        field_i = "Mana";
        field_g = "0.0";
        field_k = null;
    }
}
