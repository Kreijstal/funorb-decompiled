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
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((dv) this).field_d.field_Jb.a(this.a(param0, param1, (byte) -68), param2 + 368);
        if ((((dv) this).field_d.field_Jb.field_fb.b(false) ^ -1) < param2) {
            tc discarded$0 = ((dv) this).field_d.field_Jb.field_fb.a(0);
        }
        int var4 = 5;
        je var5 = (je) (Object) ((dv) this).field_d.field_Jb.field_fb.e((byte) 107);
        while (var5 != null) {
            var5.field_ab = var4;
            var4 = var4 + ((dv) this).field_l;
            var5 = (je) (Object) ((dv) this).field_d.field_Jb.field_fb.a((byte) 123);
        }
        ((dv) this).field_d.field_Jb.field_ob = var4;
        ((dv) this).field_d.field_Jb.field_ab = ((dv) this).field_d.field_ob + -var4;
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
          if (-1 > (((dv) this).field_q.field_ob + ((dv) this).field_q.field_ab ^ -1)) {
            L1: {
              qn.b(((dv) this).field_q.field_V, ((dv) this).field_q.field_D, ((dv) this).field_d.field_S, ((dv) this).field_q.field_ob, 5592405, 230);
              qn.b(((dv) this).field_d.field_gb + ((dv) this).field_d.field_V, ((dv) this).field_q.field_D, ((dv) this).field_d.field_S, ((dv) this).field_q.field_ob, 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_q.field_D, ((dv) this).field_d.field_gb, ((dv) this).field_d.field_ab, 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_d.field_ob + ((dv) this).field_d.field_D, ((dv) this).field_d.field_gb, ((dv) this).field_o.field_D + (-((dv) this).field_d.field_D + -((dv) this).field_d.field_ob), 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_o.field_ob + ((dv) this).field_o.field_D, ((dv) this).field_d.field_gb, -((dv) this).field_o.field_ob + ((dv) this).field_q.field_ob + -((dv) this).field_o.field_ab, 5592405, 230);
              qn.b(((dv) this).field_d.field_V, ((dv) this).field_d.field_D, ((dv) this).field_d.field_gb, ((dv) this).field_d.field_ob, 2236962, 240);
              qn.b(((dv) this).field_o.field_V, ((dv) this).field_o.field_D, ((dv) this).field_o.field_gb, ((dv) this).field_o.field_ob, 2236962, 240);
              var2 = ((dv) this).field_q.field_ab + 256;
              if ((var2 ^ -1) > -1) {
                var2 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            qn.b(((dv) this).field_q.field_V, ((dv) this).field_q.field_D - -((dv) this).field_q.field_ob, ((dv) this).field_q.field_gb, -((dv) this).field_q.field_ob + (-((dv) this).field_q.field_D + dt.field_a), 0, var2 >> 877302241);
            var3 = 5 + ((dv) this).field_q.field_ab - -((dv) this).field_q.field_ob;
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -7) {
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
                qn.e(0, var3, bn.field_b, 0, var4 << 2124655717);
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
          var2 = 126 / ((13 - param0) / 33);
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
        rq var3 = (rq) (Object) ((dv) this).field_j.e((byte) 90);
        if (var3 != null) {
            // ifne L55
        }
        ((dv) this).field_j.a(750, (tc) (Object) new rq(param0));
        if (param1 < 37) {
            ((dv) this).field_d = null;
        }
        if (!(((dv) this).field_j.b(false) <= 30)) {
            tc discarded$0 = ((dv) this).field_j.c((byte) -123);
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
              if (-1 <= (((dv) this).field_p ^ -1)) {
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
            if (-1 > (((dv) this).field_q.field_ab - -200 ^ -1)) {
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
        L1: {
          if (param0) {
            break L1;
          } else {
            field_i = null;
            break L1;
          }
        }
    }

    private final void a(String param0, int param1, int param2) {
        int var4 = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        at var9 = null;
        rq var10 = null;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = -10 + (((dv) this).field_d.field_gb + -15);
        var5 = dj.a(-100, '\n', param0);
        var6 = var5;
        if (param2 <= -25) {
          var7 = 0;
          L0: while (true) {
            if (var6.length <= var7) {
              return;
            } else {
              var8 = var6[var7];
              if (var4 > ((dv) this).field_t.a(var8)) {
                this.a(param1, var8, -257);
                var7++;
                continue L0;
              } else {
                var9 = this.a(var8, var4, (byte) -98);
                var10 = (rq) (Object) var9.e((byte) 123);
                L1: while (true) {
                  if (var10 != null) {
                    this.a(param1, var10.field_l, -257);
                    var10 = (rq) (Object) var9.a((byte) 123);
                    continue L1;
                  } else {
                    var7++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final at a(String param0, int param1, byte param2) {
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 != -98) {
            ((dv) this).field_h = null;
        }
        at var4 = new at();
        while (param0 != null) {
            var5 = ((dv) this).field_t.a(param0);
            var6 = param0;
            if (param1 < var5) {
                var7 = -1 + param0.length();
                while (-1 > (var7 ^ -1)) {
                    if (var5 <= param1) {
                        // if_icmpeq L114
                    }
                    var7--;
                    var5 = var5 - ((dv) this).field_t.a(param0.charAt(var7));
                }
                if (!(var7 != 0)) {
                    var5 = ((dv) this).field_t.a(param0);
                    var7 = param0.length() + -1;
                    while (param1 < var5) {
                        var7--;
                        var5 = var5 - ((dv) this).field_t.a(param0.charAt(var7));
                    }
                }
                var6 = param0.substring(0, var7);
                param0 = param0.substring(1 + var7);
            } else {
                param0 = null;
            }
            var4.a((byte) -119, (tc) (Object) new rq(var6));
        }
        return var4;
    }

    private final je a(int param0, int param1, int param2) {
        je var4 = new je(0L, (je) null);
        var4.field_G = tn.a(true, param1, param2);
        if (param0 != 5592405) {
            ((dv) this).field_d = null;
        }
        return var4;
    }

    final void a(Object param0, int param1) {
        int var3 = 43 % ((45 - param1) / 56);
        ((dv) this).a(-1, param0 == null ? "null" : param0.toString());
    }

    private final je a(int param0, String param1, byte param2) {
        if (param2 != -68) {
            field_k = null;
        }
        je var4 = new je(0L, (je) null, param1);
        var4.field_N = param0;
        var4.field_Z = ((dv) this).field_t;
        var4.a(((dv) this).field_l, -20500, ((dv) this).field_t.a(var4.field_X), 0, 5);
        return var4;
    }

    final boolean a(int param0) {
        if (param0 != -31501) {
            return false;
        }
        return ((dv) this).field_f;
    }

    final void a(int param0, String param1) {
        this.a(param1, 13421772, param0 ^ 90);
        if (param0 != -1) {
            ((dv) this).field_a = 92;
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
              ((dv) this).field_q.b(param0 ^ -1, (je) (Object) ((dv) this).field_o);
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
            field_r = null;
            break L2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
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
        je var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        tc stackIn_25_1 = null;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        tc stackOut_24_1 = null;
        Object stackOut_23_0 = null;
        tc stackOut_23_1 = null;
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
          if (((dv) this).field_f) {
            L1: {
              if (84 != param2) {
                if (98 == param2) {
                  L2: {
                    if (null == ((dv) this).field_b) {
                      break L2;
                    } else {
                      if (((dv) this).field_b.field_b == ((dv) this).field_j.field_d) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (((dv) this).field_b == null) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = ((dv) this).field_j.e((byte) 119);
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L3;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = ((dv) this).field_b.field_b;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L3;
                    }
                  }
                  ((dv) this).field_b = (rq) (Object) stackIn_25_1;
                  if (((dv) this).field_b != null) {
                    ((dv) this).field_o.a(((dv) this).field_b.field_l, (byte) 45);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (-100 == (param2 ^ -1)) {
                    if (((dv) this).field_b == null) {
                      break L1;
                    } else {
                      if (((dv) this).field_j.field_d == ((dv) this).field_b.field_j) {
                        break L1;
                      } else {
                        ((dv) this).field_b = (rq) (Object) ((dv) this).field_b.field_j;
                        ((dv) this).field_o.a(((dv) this).field_b.field_l, (byte) 45);
                        break L1;
                      }
                    }
                  } else {
                    if (80 == param2) {
                      ((dv) this).a((byte) 122);
                      break L1;
                    } else {
                      boolean discarded$1 = ((dv) this).field_o.a(param2, param0 + 4721, param1);
                      break L1;
                    }
                  }
                }
              } else {
                var7 = ((dv) this).field_o.q(0);
                if ((var7.length() ^ -1) < -1) {
                  L4: {
                    this.a(((dv) this).field_c + var7, 5635925, param0 + 30734);
                    var5 = (je) (Object) ((dv) this).field_d.field_Jb.field_fb.d((byte) -81);
                    if (((dv) this).a(var7, true)) {
                      break L4;
                    } else {
                      var5.field_N = 16733525;
                      break L4;
                    }
                  }
                  ((dv) this).field_o.a(true);
                  this.a(var7, param0 + 30943);
                  ((dv) this).field_b = null;
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
        ((dv) this).field_c = "# ";
        ((dv) this).field_j = new at();
        ((dv) this).field_e = null;
        ((dv) this).field_f = false;
        ((dv) this).field_n = 0;
        ((dv) this).field_p = 0;
        ((dv) this).field_t = param0;
        ((dv) this).field_l = ((dv) this).field_t.field_H + ((dv) this).field_t.field_L;
        int var3 = ((dv) this).field_l - -4;
        je var4 = this.a(true, 65793);
        je var5 = var4;
        je var6 = var4;
        je var7 = var4;
        je var8 = this.a(5592405, 7829367, 2236962);
        je var9 = this.a(5592405, 65793, 65793);
        je var10 = this.a(5592405, 3355443, 65793);
        je var11 = this.a((byte) 71, 2263074);
        je var12 = this.a(5592405, 2236962, 65793);
        ((dv) this).field_q = new je(0L, var5);
        ((dv) this).field_q.a(200, -20500, bn.field_b, -200, 0);
        ll var13 = new ll(0L, var8, var8, var9, var10);
        je var14 = new je();
        var14.field_fb = new at();
        ((dv) this).field_d = new dn(0L, var14, var6, var13);
        ((dv) this).field_d.field_Jb.field_fb = new at();
        ((dv) this).field_d.a(5, false, ((dv) this).field_q.field_gb - 10, 0, 15, 5, 185 - var3);
        ((dv) this).field_q.a((je) (Object) ((dv) this).field_d, 71);
        je var15 = new je();
        var15.field_Z = ((dv) this).field_t;
        var15.field_N = 13421772;
        var15.field_F = 5;
        var15.field_z = 2;
        ((dv) this).field_o = new dp(0L, var7, var11, var15);
        ((dv) this).field_o.b(((dv) this).field_d.field_ab - (-((dv) this).field_d.field_ob - 5), 0, ((dv) this).field_d.field_gb, var3, ((dv) this).field_d.field_S);
        ((dv) this).field_o.a(param1, 176);
        ((dv) this).field_q.a((je) (Object) ((dv) this).field_o, 87);
        ((dv) this).field_s = new je(0L, var12);
        ((dv) this).field_s.field_S = 0;
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
