/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends ob implements vb {
    static long[] field_tb;
    private boolean field_nb;
    private ag[] field_vb;
    private uj[] field_V;
    private ag field_kb;
    private ti field_zb;
    static String field_sb;
    private ag field_ub;
    static String field_rb;
    private boolean field_wb;
    private ag field_lb;
    private boolean field_yb;
    private ag field_mb;
    static String field_pb;
    private ag field_xb;
    private ag field_jb;
    static mo field_qb;
    private ua field_ob;

    final void a(qm param0, int param1, int param2, int param3) {
        ag[] var5 = null;
        int var6 = 0;
        ag var7 = null;
        int var8 = 0;
        ag[] var9 = null;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (tl.field_d) {
                param0.d((byte) 29);
                var9 = this.field_vb;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var9.length <= var6) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_w) {
                        break L3;
                      } else {
                        var7.a(0, (qm) (this));
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (this.field_wb) {
                break L4;
              } else {
                if (lc.a((byte) 112)) {
                  break L4;
                } else {
                  this.g(param2 + -171);
                  this.field_H.b(new kn(this.field_H), 15637);
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                if (null == this.field_zb) {
                  break L6;
                } else {
                  L7: {
                    stackIn_14_0 = this.field_zb.j(2);

                    if (this.field_nb) {
                      stackIn_15_0 = stackIn_14_0;
                      stackIn_15_1 = 0;
                      break L7;
                    } else {
                      stackIn_15_0 = stackIn_14_0;
                      stackIn_15_1 = 1;
                      break L7;
                    }
                  }
                  if ((stackIn_15_0 ? 1 : 0) != stackIn_15_1) {
                    break L6;
                  } else {
                    this.a(this.field_lb, 0);
                    this.field_nb = this.field_zb.j(2);
                    break L5;
                  }
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("kn.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static lg a(eg param0, int param1, boolean param2, int param3, eg param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        lg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                kn.h(-104);
                break L1;
              }
            }
            if (fc.a(-123, param0, param1, param3)) {
              stackIn_6_0 = ge.a(param4.b(param3, 26219, param1), 3417);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("kn.J(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lg) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    kn(h param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_51_0;
        ua stackIn_51_1;
        ua stackIn_51_2;
        int stackIn_51_3;
        Object stackIn_52_0 = null;
        ua stackIn_52_1 = null;
        ua stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uj[] var3_ref_uj__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        ag var6_ref = null;
        int var7_int = 0;
        qm var7 = null;
        uj var8 = null;
        String var10 = null;
        try {
          L0: {
            L1: {
              this.field_V = aa.a(fi.field_d, (byte) 77);
              if (-1 <= (this.field_V.length ^ -1)) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= this.field_V.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (this.field_V.length <= var3) {
                        var3_ref_uj__ = this.field_V;
                        this.field_V = new uj[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3_ref_uj__.length) {
                            pm.a(this.field_V, -1);
                            break L1;
                          } else {
                            L5: {
                              if (var3_ref_uj__[var5] == null) {
                                break L5;
                              } else {
                                incrementValue$0 = var4;
                                var4++;
                                this.field_V[incrementValue$0] = var3_ref_uj__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (this.field_V[var3] == null) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (null == this.field_V[var2_int]) {
                        break L7;
                      } else {
                        var3 = 1 + var2_int;
                        L8: while (true) {
                          if (this.field_V.length <= var3) {
                            if (ob.field_Y == null) {
                              break L7;
                            } else {
                              if (null == this.field_V[var2_int]) {
                                break L7;
                              } else {
                                if (ob.field_Y.a(this.field_V[var2_int].field_g, this.field_V[var2_int].field_e, -17969)) {
                                  break L7;
                                } else {
                                  this.field_V[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (this.field_V[var3] == null) {
                                break L9;
                              } else {
                                if (this.field_V[var2_int].field_g != this.field_V[var3].field_g) {
                                  break L9;
                                } else {
                                  if (this.field_V[var2_int].field_e != this.field_V[var3].field_e) {
                                    break L9;
                                  } else {
                                    this.field_V[var3] = null;
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L10: {
              stackIn_30_0 = this;

              if (0 >= this.field_V.length) {
                stackIn_31_0 = this;
                stackIn_31_1 = 0;
                break L10;
              } else {
                stackIn_31_0 = this;
                stackIn_31_1 = 1;
                break L10;
              }
            }
            L11: {
              ((kn) (this)).field_yb = stackIn_31_1 != 0;
              if (!ne.b(-22768)) {
                stackIn_34_0 = 0;
                break L11;
              } else {
                stackIn_34_0 = 1;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              if (var2_int == 0) {
                stackIn_37_0 = 2;
                break L12;
              } else {
                stackIn_37_0 = 3;
                break L12;
              }
            }
            L13: {
              var3 = stackIn_37_0;
              stackIn_39_0 = this;

              if (lc.a((byte) 112)) {
                stackIn_40_0 = this;
                stackIn_40_1 = 0;
                break L13;
              } else {
                stackIn_40_0 = this;
                stackIn_40_1 = 1;
                break L13;
              }
            }
            L14: {
              ((kn) (this)).field_wb = stackIn_40_1 != 0;
              if (var2_int == 0) {
                if (null != ob.field_Y) {
                  if (ob.field_Y.b(false)) {
                    stackIn_48_0 = 1;
                    break L14;
                  } else {
                    stackIn_48_0 = 0;
                    break L14;
                  }
                } else {
                  stackIn_48_0 = 0;
                  break L14;
                }
              } else {
                stackIn_48_0 = 0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackIn_51_0 = this;

                stackIn_51_1 = null;

                stackIn_51_2 = null;

                stackIn_51_3 = 10;

                if (var2_int != 0) {
                  break L16;
                } else {
                  stackIn_51_0 = this;

                  stackIn_51_1 = null;

                  stackIn_51_2 = null;

                  if (var4 != 0) {
                    break L16;
                  } else {
                    stackIn_52_0 = this;
                    stackIn_52_1 = null;
                    stackIn_52_2 = null;
                    stackIn_52_3 = stackIn_51_3;
                    stackIn_52_4 = 75;
                    break L15;
                  }
                }
              }
              stackIn_52_0 = this;
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_3 = stackIn_51_3;
              stackIn_52_4 = 58;
              break L15;
            }
            L17: {
              ((kn) (this)).field_ob = new ua(stackIn_52_3, stackIn_52_4, 410, 105, (pf) null, var3, 1);
              this.field_ob.field_R = 83;
              this.field_ob.d(0, 5, 5);
              this.c(-123, this.field_ob);
              this.field_jb = this.a(-1, ci.field_b, oa.field_d, (wc) (this));
              if (var2_int == 0) {
                break L17;
              } else {
                this.field_mb = this.a(-1, fo.field_f, fg.field_k, (wc) (this));
                break L17;
              }
            }
            L18: {
              this.field_lb = this.a(-1, oj.field_g, qj.field_j, (wc) (this));
              stackIn_56_0 = this;

              if (var2_int != 0) {
                stackIn_57_0 = this;
                stackIn_57_1 = 3;
                break L18;
              } else {
                stackIn_57_0 = this;
                stackIn_57_1 = 2;
                break L18;
              }
            }
            L19: {
              ((kn) (this)).field_vb = new ag[stackIn_57_1];
              this.field_vb[1] = this.field_lb;
              if (var2_int == 0) {
                break L19;
              } else {
                this.field_vb[2] = this.field_mb;
                break L19;
              }
            }
            L20: {
              this.field_vb[0] = this.field_jb;
              if (!this.field_yb) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[this.field_V.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L21: while (true) {
                    if (var7_int >= this.field_V.length) {
                      this.field_zb = new ti(var5_ref_String__, var6_int, 150);
                      this.field_zb.a(18, this.field_lb.field_k + (this.field_lb.field_j + (this.field_ob.field_j - 19)), 126, this.field_ob.field_n - -this.field_lb.field_n, -54);
                      this.field_B.a((pg) (this.field_zb), (byte) -58);
                      break L20;
                    } else {
                      L22: {
                        var8 = this.field_V[var7_int];
                        if (null == ka.field_m) {
                          break L22;
                        } else {
                          if (ob.field_Y.field_m != var8.field_g) {
                            break L22;
                          } else {
                            if (ob.field_Y.field_c != var8.field_e) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_g + "<times>" + var8.field_e;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                this.field_kb = this.a((wc) (this), lm.field_a, 410);
                var5 = this.field_kb.field_v / 2 + this.field_kb.field_n;
                this.field_kb.field_v = 150;
                this.field_kb.field_n = var5 - (20 + this.field_kb.field_v);
                this.field_ub = this.a((wc) (this), hj.field_e, 410);
                this.field_ub.field_B = false;
                this.field_ub.field_v = this.field_kb.field_v;
                this.field_ub.field_n = var5 - -20;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (var4 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                if (var2_int != 0) {
                  stackIn_74_0 = on.field_b;
                  break L25;
                } else {
                  stackIn_74_0 = tm.field_c;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6 = var10;
              var7 = new qm(var10, (wc) null);
              var7.field_j = 163;
              var7.field_k = 80;
              var7.field_v = this.field_v;
              var7.field_n = 0;
              var7.field_r = (pf) ((Object) new jm(ia.field_c, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
              this.c(-96, var7);
              break L23;
            }
            L26: {
              this.field_nb = false;
              var6_ref = this.j(2);
              if (var6_ref == null) {
                break L26;
              } else {
                var6_ref.field_z = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var2);

            stackIn_80_1 = new StringBuilder().append("kn.<init>(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L27;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L27;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        ql.field_a = param2;
        pn.field_d = param0;
        wm.field_I = param1;
        if (param3 != -43) {
            field_tb = (long[]) null;
        }
    }

    public static void h(int param0) {
        if (param0 != 3) {
            return;
        }
        field_tb = null;
        field_qb = null;
        field_sb = null;
        field_rb = null;
        field_pb = null;
    }

    final static void a(java.awt.Canvas param0, byte param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param0.getGraphics();
                ce.field_m.a(param3, var4, 0, param2);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param0.repaint();
                break L2;
              }
            }
            L3: {
              if (param1 < -87) {
                break L3;
              } else {
                field_pb = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref2);

            stackIn_8_1 = new StringBuilder().append("kn.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final ag a(wc param0, String param1, int param2) {
        ag discarded$1 = null;
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 410) {
                break L1;
              } else {
                discarded$1 = this.j(-10);
                break L1;
              }
            }
            var4 = new ag(param1, param0);
            var4.field_r = (pf) ((Object) new mm());
            var5 = -46 + this.field_k;
            var4.a(30, var5, -30 + this.field_v, 15, -92);
            this.c(param2 + -526, var4);
            stackIn_3_0 = (ag) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("kn.T(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        kc var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        jg var9 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (jo.field_e >= ea.field_F) {
                break L1;
              } else {
                jo.field_e = jo.field_e + 1;
                break L1;
              }
            }
            L2: {
              if (vd.field_k == ce.field_m.field_m) {
                break L2;
              } else {
                ma.field_N = ma.field_N + (ce.field_m.field_m + -vd.field_k);
                vd.field_k = ce.field_m.field_m;
                break L2;
              }
            }
            if ((jo.field_e ^ -1) < -1) {
              L3: {
                ed.j(120);
                n.field_g.b(param3, (byte) 60);
                if (!param2) {
                  break L3;
                } else {
                  field_tb = (long[]) null;
                  break L3;
                }
              }
              L4: {
                if (null == ln.field_U) {
                  break L4;
                } else {
                  if (!wh.field_g) {
                    ln.field_U = null;
                    break L4;
                  } else {
                    ln.field_U.a(n.field_g.field_V, n.field_g.field_nb, param3, (byte) -104);
                    break L4;
                  }
                }
              }
              var4_int = 0;
              L5: while (true) {
                if (-6 >= (var4_int ^ -1)) {
                  L6: {
                    if (g.field_g.field_U != 0) {
                      db.field_a = new w(g.field_g.field_V, g.field_g.field_nb, g.field_g.field_x, g.field_g.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, (String) null, 0L);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = f.a(16711422, param1, ga.field_r, dh.field_Gb);
                    if (var9 == null) {
                      break L7;
                    } else {
                      eb.a(0, var9);
                      break L7;
                    }
                  }
                  L8: {
                    var8 = jl.b(0);
                    if (var8 == null) {
                      break L8;
                    } else {
                      kh.field_c = var8;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L9: {
                    var5 = mn.field_s[var4_int];
                    if (var5 != null) {
                      L10: {
                        if (-1 == (var5.field_U ^ -1)) {
                          break L10;
                        } else {
                          ko.a(var4_int, var5, (byte) -86);
                          break L10;
                        }
                      }
                      var6 = oh.a((byte) 119, var4_int);
                      ia.field_b[var4_int].field_W = tl.field_a[var6];
                      oc.field_f[var4_int].field_rb = cf.field_b[var6];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var4_int++;
                  continue L5;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "kn.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void k(int param0) {
        int var2;
        int var3;
        L0: {
          L1: {
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            if (this.field_jb == this.field_xb) {
              u.b(6);
              tl.a(-30267);
              break L1;
            } else {
              if (this.field_xb != this.field_mb) {
                if (this.field_xb == this.field_lb) {
                  L2: {
                    if (this.field_zb == null) {
                      break L2;
                    } else {
                      var2 = this.field_zb.g((byte) 37);
                      if (var2 < 0) {
                        break L2;
                      } else {
                        ob.field_Y.a(this.field_V[var2].field_e, this.field_V[var2].field_g, (byte) -64);
                        break L2;
                      }
                    }
                  }
                  nb.a(true, 5);
                  this.field_H.b(new bj(this.field_H), 15637);
                  break L1;
                } else {
                  this.field_ub.field_B = false;
                  var2 = -94 % ((-8 - param0) / 49);
                  break L0;
                }
              } else {
                u.b(6);
                gm.a((byte) -127);
                break L1;
              }
            }
          }
          this.field_ub.field_B = false;
          var2 = -94 % ((-8 - param0) / 49);
          break L0;
        }
    }

    final static void g(boolean param0) {
        if (param0) {
            eg var2 = (eg) null;
            kn.a((eg) null, -48, false, -99, (eg) null);
        }
        k.field_o = 0;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != this.field_kb) {
                if (param4 == this.field_ub) {
                  this.k(46);
                  break L1;
                } else {
                  if (param4 == this.field_jb) {
                    this.a(param4, 0);
                    break L1;
                  } else {
                    if (this.field_mb == param4) {
                      this.a(param4, 0);
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_zb) {
                          if (this.field_zb.field_w) {
                            stackIn_12_0 = 1;
                            break L2;
                          } else {
                            stackIn_12_0 = 0;
                            break L2;
                          }
                        } else {
                          stackIn_12_0 = 0;
                          break L2;
                        }
                      }
                      var6_int = stackIn_12_0;
                      if (var6_int != 0) {
                        break L1;
                      } else {
                        if (param4 == this.field_lb) {
                          if (!this.field_yb) {
                            this.field_H.b(new qn(this.field_H, oo.field_C), 15637);
                            break L1;
                          } else {
                            if (-1 > (ah.field_c ^ -1)) {
                              this.a(param4, 0);
                              break L1;
                            } else {
                              this.field_H.b(new gf(this.field_H), 15637);
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                this.g(-1);
                break L1;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.field_xb = (ag) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("kn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        ag var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        ag[] var6 = this.field_vb;
        ag[] var2 = var6;
        if (param0 > -95) {
            return;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_z = this.field_xb == var4 ? true : false;
        }
    }

    private final ag a(int param0, String param1, ll[] param2, wc param3) {
        ag var5 = null;
        RuntimeException var5_ref = null;
        ua var6 = null;
        ag var7 = null;
        ag stackIn_2_0 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new ag(param1, param3);
            var5.field_r = (pf) ((Object) new cd(param2));
            if (param0 == -1) {
              var6 = this.field_ob;
              var7 = var5;
              var6.a(var7, param0 ^ -123, var6.field_R);
              this.field_ob.e((byte) 64);
              stackIn_4_0 = (ag) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ag) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("kn.C(").append(param0).append(',');

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final ag j(int param0) {
        if (param0 != 2) {
            return (ag) null;
        }
        if (null != ka.field_m) {
            return this.field_lb;
        }
        if (null != ob.field_Y && ob.field_Y.field_l && this.field_mb != null) {
            return this.field_mb;
        }
        return this.field_jb;
    }

    private final void g(int param0) {
        if (!this.field_G) {
            return;
        }
        this.field_G = false;
        if (param0 != -1) {
            this.field_zb = (ti) null;
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_74_0 = false;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        Object stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (this.field_jb.d(-2116)) {
                var5 = this.field_jb;
                break L1;
              } else {
                L2: {
                  if (this.field_mb == null) {
                    break L2;
                  } else {
                    if (this.field_mb.d(-2116)) {
                      var5 = this.field_mb;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.field_lb.d(-2116)) {
                  var5 = this.field_lb;
                  break L1;
                } else {
                  if (!this.field_kb.d(-2116)) {
                    if (this.field_ub.d(-2116)) {
                      var5 = this.field_ub;
                      break L1;
                    } else {
                      if (this.field_jb.field_z) {
                        var5 = this.field_jb;
                        break L1;
                      } else {
                        L3: {
                          if (null == this.field_mb) {
                            break L3;
                          } else {
                            if (!this.field_mb.field_z) {
                              break L3;
                            } else {
                              var5 = this.field_mb;
                              break L1;
                            }
                          }
                        }
                        if (this.field_lb.field_z) {
                          var5 = this.field_lb;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    var5 = this.field_kb;
                    break L1;
                  }
                }
              }
            }
            L4: {
              if (param1 < -120) {
                break L4;
              } else {
                this.field_xb = (ag) null;
                break L4;
              }
            }
            L5: {
              var6 = param3;
              if (var6 != 96) {
                if (97 == var6) {
                  if (this.field_jb != var5) {
                    if (this.field_mb == var5) {
                      this.field_lb.a(0, (qm) (this));
                      stackIn_49_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (this.field_kb != var5) {
                        break L5;
                      } else {
                        if (!this.field_ub.field_B) {
                          break L5;
                        } else {
                          this.field_ub.a(0, (qm) (this));
                          stackIn_53_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                  } else {
                    L6: {
                      if (null == this.field_mb) {
                        this.field_lb.a(0, (qm) (this));
                        break L6;
                      } else {
                        this.field_mb.a(0, (qm) (this));
                        break L6;
                      }
                    }
                    stackIn_45_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  if (98 == var6) {
                    if (this.field_kb == var5) {
                      this.field_jb.a(0, (qm) (this));
                      stackIn_57_0 = 1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (this.field_ub != var5) {
                        break L5;
                      } else {
                        this.field_lb.a(0, (qm) (this));
                        stackIn_60_0 = 1;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    }
                  } else {
                    if (var6 != 99) {
                      break L5;
                    } else {
                      L7: {
                        if (this.field_jb == var5) {
                          break L7;
                        } else {
                          if (var5 == this.field_mb) {
                            break L7;
                          } else {
                            if (this.field_lb == var5) {
                              L8: {
                                if (!this.field_ub.field_B) {
                                  this.field_kb.a(0, (qm) (this));
                                  break L8;
                                } else {
                                  this.field_ub.a(0, (qm) (this));
                                  break L8;
                                }
                              }
                              stackIn_72_0 = 1;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      this.field_kb.a(0, (qm) (this));
                      stackIn_65_0 = 1;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    }
                  }
                }
              } else {
                if (var5 != this.field_lb) {
                  if (var5 != this.field_mb) {
                    if (this.field_ub != var5) {
                      break L5;
                    } else {
                      this.field_kb.a(0, (qm) (this));
                      stackIn_39_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    this.field_jb.a(0, (qm) (this));
                    stackIn_36_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  if (this.field_mb == null) {
                    this.field_jb.a(0, (qm) (this));
                    stackIn_33_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    this.field_mb.a(0, (qm) (this));
                    return true;
                  }
                }
              }
            }
            stackIn_74_0 = super.a(param0, (byte) -122, param2, param3);
            decompiledRegionSelector0 = 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_77_0 = var5;

            stackIn_77_1 = new StringBuilder().append("kn.N(");

            if (param0 == null) {
              stackIn_78_0 = stackIn_77_0;
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L9;
            } else {
              stackIn_78_0 = stackIn_77_0;
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_33_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_39_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_45_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_49_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_53_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_57_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_60_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_65_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_72_0 != 0;
                          } else {
                            return stackIn_74_0;
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

    private final void a(ag param0, int param1) {
        ag var3 = null;
        int var4 = 0;
        uj var5 = null;
        ag stackIn_2_0 = null;
        ag stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              this.field_xb = param0;
              param0.a(param1, (qm) (this));
              var3 = this.j(2);
              stackIn_2_0 = this.field_ub;

              if (var3 == param0) {
                stackIn_3_0 = (ag) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (ag) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              stackIn_3_0.field_B = stackIn_3_1 != 0;
              if (param0 == this.field_lb) {
                if (param0 == var3) {
                  if (this.field_zb != null) {
                    L3: {
                      var4 = this.field_zb.g((byte) 37);
                      var5 = this.field_V[var4];
                      if (var5.field_g != ob.field_Y.field_m) {
                        break L3;
                      } else {
                        if (var5.field_e != ob.field_Y.field_c) {
                          break L3;
                        } else {
                          this.i(-121);
                          break L2;
                        }
                      }
                    }
                    this.field_ub.field_B = true;
                    this.i(-121);
                    break L2;
                  } else {
                    this.i(-121);
                    break L2;
                  }
                } else {
                  this.i(-121);
                  break L2;
                }
              } else {
                this.i(-121);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("kn.V(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    static {
        field_sb = "Seriously offensive language";
        field_rb = "Go Back";
        field_tb = new long[32];
        field_pb = "Steep slopes and rugged terrain. Stay here too long and the volcanoes will erupt!";
    }
}
