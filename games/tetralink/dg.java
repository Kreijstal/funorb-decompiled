/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static String field_d;
    static kd field_g;
    static String field_m;
    private int field_i;
    private int field_f;
    private int field_b;
    private boolean field_a;
    static float field_j;
    oh[] field_k;
    private int field_c;
    static int field_e;
    static String field_l;
    private int field_h;
    oh field_n;

    final static boolean c(int param0) {
        int var1 = -62 % ((param0 - -11) / 57);
        return ma.field_g;
    }

    public static void b(int param0) {
        if (param0 != -5549) {
            return;
        }
        field_g = null;
        field_l = null;
        field_d = null;
        field_m = null;
    }

    final dg a(oh[] param0, boolean param1) {
        RuntimeException var3 = null;
        oh[] var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_k = param0;
              if (param1) {
                break L1;
              } else {
                var4 = (oh[]) null;
                this.a((oh[]) null, true);
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dg.H(");

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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (dg) (this);
    }

    final void a(int param0, int param1, int param2, qn param3, na param4) {
        jb stackIn_17_0;
        String stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        jb stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        na var8 = null;
        try {
          L0: {
            L1: {
              qj.a(param4.field_F, (byte) -36, this.field_k, param2 + param4.field_t, param4.field_u, param1 + param4.field_w);
              if (this.field_n == null) {
                break L1;
              } else {
                L2: {
                  var6_int = param4.field_t + param2 + this.field_b;
                  if (-2 != (param3.field_k ^ -1)) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param4.field_F - this.field_n.field_t) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param4.field_w + (param1 + this.field_f);
                  if (1 != param3.field_d) {
                    break L3;
                  } else {
                    var7 = var7 + (-this.field_n.field_F + param4.field_u) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (-3 != (param3.field_k ^ -1)) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param4.field_F - this.field_n.field_t);
                    break L4;
                  }
                }
                L5: {
                  if (2 != param3.field_d) {
                    break L5;
                  } else {
                    var7 = var7 + (-this.field_n.field_F + param4.field_u);
                    break L5;
                  }
                }
                this.field_n.c(var6_int, var7);
                break L1;
              }
            }
            L6: {
              var6 = param3.c(param4, 4373);
              if (param0 == 46) {
                break L6;
              } else {
                var8 = (na) null;
                this.a(-111, 99, -82, (qn) null, (na) null);
                break L6;
              }
            }
            L7: {
              if (var6 == null) {
                break L7;
              } else {
                if (null == param3.field_b) {
                  break L7;
                } else {
                  if (this.field_i < 0) {
                    break L7;
                  } else {
                    L8: {
                      stackIn_17_0 = param3.field_b;

                      stackIn_17_1 = (String) (var6);

                      stackIn_17_2 = param3.field_f + param2;

                      stackIn_17_3 = -param4.field_t;

                      if (2147483647 == (this.field_b ^ -1)) {
                        stackIn_18_0 = (jb) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) ((Object) stackIn_17_1);
                        stackIn_18_2 = stackIn_17_2;
                        stackIn_18_3 = stackIn_17_3;
                        stackIn_18_4 = 0;
                        break L8;
                      } else {
                        stackIn_18_0 = (jb) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) ((Object) stackIn_17_1);
                        stackIn_18_2 = stackIn_17_2;
                        stackIn_18_3 = stackIn_17_3;
                        stackIn_18_4 = this.field_b;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_20_2 = stackIn_18_2 - (stackIn_18_3 + -stackIn_18_4);

                      if (this.field_f != -2147483648) {
                        stackIn_18_0 = (jb) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = this.field_f;
                        break L9;
                      } else {
                        stackIn_18_0 = (jb) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_23_3 = stackIn_21_3 + (param1 + param4.field_w + param3.field_j);

                      stackIn_23_4 = -param3.field_g + param4.field_F - param3.field_f;

                      stackIn_23_5 = -param3.field_h + (-param3.field_j + param4.field_u);

                      stackIn_23_6 = this.field_i;

                      stackIn_23_7 = this.field_c;

                      if ((this.field_h ^ -1) == 2147483647) {
                        stackIn_18_0 = (jb) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);

                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = stackIn_23_6;
                        stackIn_24_7 = stackIn_23_7;
                        stackIn_24_8 = 256;
                        break L10;
                      } else {
                        stackIn_18_0 = (jb) ((Object) stackIn_18_0);
                        stackIn_18_1 = (String) ((Object) stackIn_18_1);

                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = stackIn_23_6;
                        stackIn_24_7 = stackIn_23_7;
                        stackIn_24_8 = this.field_h;
                        break L10;
                      }
                    }
                    ((jb) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, param3.field_k, param3.field_d, param3.field_c);
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6_ref);

            stackIn_28_1 = new StringBuilder().append("dg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L12;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L12;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
    }

    final dg b(int param0, int param1) {
        if (param1 != 2) {
            this.a((byte) 106, false);
        }
        this.field_c = param0;
        return (dg) (this);
    }

    final dg a(int param0, int param1) {
        if (param0 != 2) {
            field_l = (String) null;
        }
        this.field_i = param1;
        return (dg) (this);
    }

    final static void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        bc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        eh var11 = null;
        bc var12 = null;
        int[] var13 = null;
        cf var14 = null;
        cf var15 = null;
        int[] var16 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var12 = kb.field_q;
              var2 = var12.d((byte) -99);
              if (param0 != (var2 ^ -1)) {
                if (-2 != (var2 ^ -1)) {
                  if (2 != var2) {
                    fk.a(-93, (Throwable) null, "A1: " + hc.a(false));
                    mk.a(false);
                    break L1;
                  } else {
                    var15 = (cf) ((Object) sf.field_a.c(false));
                    if (var15 == null) {
                      mk.a(false);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var15.field_u = lh.h(param0 + -7989);
                      var15.field_t = var15.field_u[0];
                      var15.field_s = true;
                      var15.b(false);
                      break L1;
                    }
                  }
                } else {
                  var11 = (eh) ((Object) qn.field_t.c(false));
                  if (var11 != null) {
                    var11.b(false);
                    break L1;
                  } else {
                    mk.a(false);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                var10 = lh.h(-7990);
                var16 = var10;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((bh) ((Object) var5)).d((byte) -99);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (cf) ((Object) sf.field_a.c(false));
                    if (var14 != null) {
                      var14.field_u = var3;
                      var14.field_s = true;
                      var14.field_t = var16[0];
                      var14.b(false);
                      break L1;
                    } else {
                      mk.a(false);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var9[var7] = ((bh) ((Object) var5)).f(122);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "dg.E(" + param0 + ')');
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

    final dg a(byte param0, int param1) {
        this.field_b = param1;
        if (param0 != -128) {
            return (dg) null;
        }
        return (dg) (this);
    }

    final void a(int param0, na param1, dg param2, boolean param3, int param4, qn param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        wf var8 = null;
        try {
          L0: {
            L1: {
              if (!this.field_a) {
                break L1;
              } else {
                param2.a(46, param0, param4, param5, param1);
                param2.a(30033);
                break L1;
              }
            }
            L2: {
              if (0 >= (this.field_c ^ -1)) {
                param2.field_c = this.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_f != -2147483648) {
                param2.field_f = this.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_k) {
                param2.field_k = this.field_k;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 > this.field_i) {
                break L5;
              } else {
                param2.field_i = this.field_i;
                break L5;
              }
            }
            L6: {
              if (-2147483648 == this.field_h) {
                break L6;
              } else {
                param2.field_h = this.field_h;
                break L6;
              }
            }
            L7: {
              if (null == this.field_n) {
                break L7;
              } else {
                param2.field_n = this.field_n;
                break L7;
              }
            }
            L8: {
              if (param3) {
                break L8;
              } else {
                var8 = (wf) null;
                dg.a(-102, (byte) 68, (wf) null);
                break L8;
              }
            }
            L9: {
              if ((this.field_b ^ -1) == 2147483647) {
                break L9;
              } else {
                param2.field_b = this.field_b;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("dg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
    }

    final void a(int param0) {
        this.field_h = 256;
        if (param0 != 30033) {
            this.b(6, -45);
        }
        this.field_b = 0;
        this.field_n = null;
        this.field_i = 0;
        this.field_k = null;
        this.field_f = 0;
        this.field_c = -1;
    }

    final static void a(boolean param0, byte param1) {
        if (!(!ak.a(3058))) {
            param0 = false;
        }
        vd.b(param0, 0);
        if (wl.field_d) {
            ra.e(we.field_e.field_g.field_M, we.field_e.field_g.field_yb, we.field_e.field_g.field_Hb, we.field_e.field_g.field_R);
            we.field_e.field_g.a(param0, param1 + 344);
        }
        if (param1 != -88) {
            dg.c(-86);
        }
        h.a((byte) -89, param0);
    }

    final dg a(byte param0, boolean param1) {
        if (param0 != -77) {
            oh[] var4 = (oh[]) null;
            this.a((oh[]) null, true);
        }
        this.field_a = param1 ? true : false;
        return (dg) (this);
    }

    final void a(dg param0, int param1) {
        try {
            param0.field_c = this.field_c;
            param0.field_a = this.field_a;
            param0.field_f = this.field_f;
            param0.field_b = this.field_b;
            param0.field_i = this.field_i;
            param0.field_n = this.field_n;
            param0.field_k = this.field_k;
            int var3_int = -14 / ((param1 - 6) / 54);
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "dg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        hl stackIn_24_0 = null;
        hl stackIn_25_0 = null;
        String stackIn_25_1 = null;
        hl stackIn_27_0 = null;
        String[] stackIn_27_1 = null;
        hl stackIn_28_0 = null;
        String[] stackIn_28_1 = null;
        String stackIn_28_2 = null;
        String stackIn_56_0 = null;
        hl stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        hl stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        hl stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        hl stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        hl stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        hl stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        hl var5 = null;
        hl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        hl var15 = null;
        String var16 = null;
        hl var17 = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              nb.a(ng.field_t, (byte) 89);
              if (null != qe.field_a) {
                L2: {
                  L3: {
                    var15 = nm.field_n;
                    var17 = var15;
                    nm.field_n.field_R = 0;
                    var17.field_Hb = 0;
                    var5 = rn.field_c;
                    rn.field_c.field_R = 0;
                    var5.field_Hb = 0;
                    tn.field_a.field_R = 0;
                    var6 = tn.field_a;
                    var6.field_Hb = 0;
                    ua.field_d.field_jb = lh.field_u.toUpperCase();
                    var7 = (2 + fk.field_V.field_Hb) / 2;
                    tn.field_a.a((byte) -99, var7 + -2, fk.field_V.field_R - 40, 40, 0);
                    rn.field_c.a((byte) -124, fk.field_V.field_Hb - var7, -40 + fk.field_V.field_R, 40, var7);
                    if (cl.field_f.length != 1) {
                      break L3;
                    } else {
                      if (2 != cl.field_f[0]) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (cl.field_f.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 == (km.field_o[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                            stackIn_11_0 = 0;
                            break L6;
                          } else {
                            stackIn_11_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (cl.field_f[var10] != 2) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (-1 == (var9_int ^ -1)) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                rn.field_c.field_S = true;
                if (kl.field_a) {
                  L9: {
                    eh.field_q.field_jb = kk.field_R;
                    qi.field_n.field_S = false;
                    if (var8 != 0) {
                      stackIn_56_0 = md.field_I;
                      break L9;
                    } else {
                      stackIn_56_0 = ni.field_i;
                      break L9;
                    }
                  }
                  L10: {
                    var16 = stackIn_56_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = tn.field_a.field_Ib.b(var16) - -(3 * tn.field_a.field_Ib.a('.'));
                    tn.field_a.field_V = (tn.field_a.field_Hb - var10) / 2;
                    if ((cb.field_u & 48) != 16) {
                      break L10;
                    } else {
                      var9 = var16 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    tn.field_a.field_xb = 0;
                    if (32 != (48 & cb.field_u)) {
                      break L11;
                    } else {
                      var9 = (String) (var9) + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if ((48 & cb.field_u ^ -1) == -49) {
                      var9 = (String) (var9) + "...";
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  tn.field_a.field_jb = (String) (var9);
                  rn.field_c.field_jb = rj.field_c.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackIn_24_0 = rn.field_c;

                    if (var8 == 0) {
                      stackIn_25_0 = (hl) ((Object) stackIn_24_0);
                      stackIn_25_1 = el.field_Ob;
                      break L13;
                    } else {
                      stackIn_25_0 = (hl) ((Object) stackIn_24_0);
                      stackIn_25_1 = cb.field_q;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_25_0.field_jb = ((String) (Object) stackIn_25_1).toUpperCase();
                    stackIn_27_0 = eh.field_q;

                    stackIn_27_1 = new String[]{rn.field_c.field_jb};

                    if (var8 == 0) {
                      stackIn_28_0 = (hl) ((Object) stackIn_27_0);
                      stackIn_28_1 = (String[]) ((Object) stackIn_27_1);
                      stackIn_28_2 = ib.field_c;
                      break L14;
                    } else {
                      stackIn_28_0 = (hl) ((Object) stackIn_27_0);
                      stackIn_28_1 = (String[]) ((Object) stackIn_27_1);
                      stackIn_28_2 = ml.field_cb;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_28_0.field_jb = sk.a(stackIn_28_1, stackIn_28_2, 122);
                    nn.field_R = true;
                    tn.field_a.field_jb = ei.field_o;
                    qi.field_n.field_S = true;
                    if (null != uj.field_s) {
                      L16: {
                        if (eg.field_K != null) {
                          break L16;
                        } else {
                          rh.field_G = new boolean[hg.field_k];
                          eg.field_K = new byte[hg.field_k];
                          break L16;
                        }
                      }
                      nn.field_R = false;
                      n.field_P = false;
                      var13 = 0;
                      var9_int = var13;
                      L17: while (true) {
                        if (hg.field_k <= var13) {
                          lk.a(true, (byte) -119, -1, qe.field_a, 0, -1, hg.field_k, -1);
                          if (dd.field_c < 2) {
                            break L15;
                          } else {
                            if (sn.field_a[12]) {
                              nn.field_R = true;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        } else {
                          rh.field_G[var13] = false;
                          var13++;
                          continue L17;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  if (nn.field_R) {
                    break L1;
                  } else {
                    rn.field_c.field_S = false;
                    if (rn.field_c.field_rb) {
                      L18: {
                        var9 = null;
                        if (!n.field_P) {
                          break L18;
                        } else {
                          var9 = "<col=A00000>" + fi.field_zb + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L18;
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (hg.field_k <= var10) {
                          re.field_P = "<col=A00000>" + vg.field_Nb + "<br>" + da.field_a + (String) (var9);
                          break L1;
                        } else {
                          if (rh.field_G[var10]) {
                            L20: {
                              var11_ref = "<col=A00000>" + ll.field_y[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 != null) {
                                var9 = (String) (var9) + ", " + var11_ref;
                                break L20;
                              } else {
                                var9 = var11_ref;
                                break L20;
                              }
                            }
                            var10++;
                            continue L19;
                          } else {
                            var10++;
                            continue L19;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L21: {
              if (!param1) {
                break L21;
              } else {
                field_e = -1;
                break L21;
              }
            }
            L22: {
              L23: {
                stackIn_70_0 = tl.field_P;

                stackIn_70_1 = 0;

                if (!param0) {
                  break L23;
                } else {
                  stackIn_70_0 = (hl) ((Object) stackIn_70_0);

                  if (param2) {
                    break L23;
                  } else {
                    stackIn_70_0 = (hl) ((Object) stackIn_70_0);

                    if (lg.field_S) {
                      break L23;
                    } else {
                      stackIn_71_0 = (hl) ((Object) stackIn_70_0);
                      stackIn_71_1 = stackIn_70_1;
                      stackIn_71_2 = 1;
                      break L22;
                    }
                  }
                }
              }
              stackIn_71_0 = (hl) ((Object) stackIn_70_0);
              stackIn_71_1 = stackIn_70_1;
              stackIn_71_2 = 0;
              break L22;
            }
            L24: {
              L25: {
                ((hl) (Object) stackIn_71_0).a(stackIn_71_1, stackIn_71_2 != 0);
                stackIn_75_0 = fk.field_V;

                stackIn_75_1 = 0;

                if (!param0) {
                  break L25;
                } else {
                  stackIn_75_0 = (hl) ((Object) stackIn_75_0);

                  if (param2) {
                    break L25;
                  } else {
                    stackIn_75_0 = (hl) ((Object) stackIn_75_0);

                    if (lg.field_S) {
                      break L25;
                    } else {
                      stackIn_76_0 = (hl) ((Object) stackIn_75_0);
                      stackIn_76_1 = stackIn_75_1;
                      stackIn_76_2 = 1;
                      break L24;
                    }
                  }
                }
              }
              stackIn_76_0 = (hl) ((Object) stackIn_75_0);
              stackIn_76_1 = stackIn_75_1;
              stackIn_76_2 = 0;
              break L24;
            }
            L26: {
              L27: {
                ((hl) (Object) stackIn_76_0).a(stackIn_76_1, stackIn_76_2 != 0);
                stackIn_80_0 = fj.field_b;

                stackIn_80_1 = 0;

                if (!param0) {
                  break L27;
                } else {
                  stackIn_80_0 = (hl) ((Object) stackIn_80_0);

                  if (param2) {
                    break L27;
                  } else {
                    stackIn_80_0 = (hl) ((Object) stackIn_80_0);

                    if (!lg.field_S) {
                      break L27;
                    } else {
                      stackIn_81_0 = (hl) ((Object) stackIn_80_0);
                      stackIn_81_1 = stackIn_80_1;
                      stackIn_81_2 = 1;
                      break L26;
                    }
                  }
                }
              }
              stackIn_81_0 = (hl) ((Object) stackIn_80_0);
              stackIn_81_1 = stackIn_80_1;
              stackIn_81_2 = 0;
              break L26;
            }
            L28: {
              ((hl) (Object) stackIn_81_0).a(stackIn_81_1, stackIn_81_2 != 0);
              we.field_e.field_g.c(true);
              if (qe.field_a == null) {
                break L28;
              } else {
                L29: {
                  if (qi.field_n.field_F != 0) {
                    tb.a(param3, -15289);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (rn.field_c.field_F == 0) {
                    break L30;
                  } else {
                    if (!kl.field_a) {
                      l.a(0, param3);
                      break L30;
                    } else {
                      oi.a((byte) 126, param3);
                      break L30;
                    }
                  }
                }
                hg.a(param3, qe.field_a, 30544, true);
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "dg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    dg() {
        this.field_b = -2147483648;
        this.field_f = -2147483648;
        this.field_a = false;
        this.field_i = -2;
        this.field_k = null;
        this.field_h = -2147483648;
        this.field_n = null;
        this.field_c = -2;
    }

    final static bf a(int param0, byte param1, wf param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bf stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -58 / ((param1 - 71) / 52);
            stackIn_1_0 = we.a(-11040, ee.a(param2, 100, param0));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final dg a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 12) {
            field_m = (String) null;
        }
        return (dg) (this);
    }

    static {
        field_m = "Please wait...";
        field_d = "<%0> has resigned and is offering a rematch.";
        field_l = "Chat is currently disabled.";
    }
}
