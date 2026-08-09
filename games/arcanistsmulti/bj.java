/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ob implements vb {
    static String field_jb;
    private long field_V;
    static String field_sb;
    static String field_pb;
    private ag field_lb;
    private qm field_rb;
    static boolean field_mb;
    private ag field_nb;
    static int field_tb;
    static String field_kb;
    static ll[] field_ob;
    static String field_qb;
    static boolean field_ub;

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param3;
              if ((var5_int ^ -1) != -100) {
                break L1;
              } else {
                if (!ArcanistsMulti.field_G) {
                  this.field_lb.a(0, (qm) (this));
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (-99 == (var5_int ^ -1)) {
              this.field_nb.a(0, (qm) (this));
              stackIn_12_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param1 <= -120) {
                  break L2;
                } else {
                  bj.a(-60, 57, 53, -57, -90, -4, -1);
                  break L2;
                }
              }
              stackIn_17_0 = super.a(param0, (byte) -125, param2, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("bj.N(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    bj(h param0) {
        super(param0, 200, 200);
        RuntimeException runtimeException = null;
        qm var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_V = qj.b(-26572);
            var2 = new qm(qj.field_i, (wc) null);
            var2.field_k = 100;
            var2.field_v = this.field_v;
            var2.field_n = 0;
            var2.field_j = 50;
            var2.field_r = (pf) ((Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.c(-67, var2);
            this.field_rb = new qm(qj.field_i, (wc) null);
            this.field_rb.field_j = 20 + var2.field_k + var2.field_j;
            this.field_rb.field_v = this.field_v;
            this.field_rb.field_n = 0;
            this.field_rb.field_k = 80;
            this.field_rb.field_r = (pf) ((Object) new jm(go.field_k, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.c(-108, this.field_rb);
            this.field_nb = this.a((wc) (this), ln.field_R, true);
            this.field_lb = this.a((wc) (this), ki.field_t, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("bj.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void l(byte param0) {
        try {
            field_jb = null;
            field_kb = null;
            field_qb = null;
            field_ob = null;
            field_pb = null;
            field_sb = null;
            if (param0 != -46) {
                field_mb = false;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bj.G(" + param0 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0 >>> 815219553;
              var2_int = var2_int | var2_int >>> -1130748511;
              var2_int = var2_int | var2_int >>> 1036276002;
              var2_int = var2_int | var2_int >>> 957654340;
              var2_int = var2_int | var2_int >>> 1297043752;
              if (param1 >= 87) {
                break L1;
              } else {
                field_kb = (String) null;
                break L1;
              }
            }
            var2_int = var2_int | var2_int >>> 1347697520;
            stackIn_4_0 = param0 & (var2_int ^ -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "bj.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 24) {
                break L1;
              } else {
                field_sb = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param6 ^ -1) < (param5 ^ -1)) {
                  break L3;
                } else {
                  if (param5 >= param3 + param6) {
                    break L3;
                  } else {
                    if (param2 > param0) {
                      break L3;
                    } else {
                      if (param0 >= param2 + param4) {
                        break L3;
                      } else {
                        stackIn_16_0 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_16_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "bj.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (!tl.field_d) {
                break L1;
              } else {
                param0.d((byte) 29);
                break L1;
              }
            }
            L2: {
              L3: {
                var5_long = qj.b(-26572) + -this.field_V;
                var7 = (int)((-var5_long + 10999L) / 1000L);
                if (var7 > 0) {
                  break L3;
                } else {
                  u.b(6);
                  this.k((byte) 119);
                  this.field_H.b(new qn(this.field_H, bh.field_c), param2 ^ 15807);
                  if (!ArcanistsMulti.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_rb.field_g = "" + var7;
              break L2;
            }
            L4: {
              if (!this.field_G) {
                break L4;
              } else {
                if (ka.field_m == null) {
                  this.k((byte) 116);
                  this.field_H.b(new qn(this.field_H, vi.field_C), 15637);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (ka.field_m == null) {
                break L5;
              } else {
                if (!ka.field_m.field_e) {
                  break L5;
                } else {
                  this.k((byte) 122);
                  this.field_H.b(new qn(this.field_H, vi.field_C), 15637);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("bj.E(");

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
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static wa a(boolean param0, int param1, int param2) {
        dn stackIn_2_0 = null;
        dn stackIn_4_0 = null;
        dn stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kc stackIn_30_0 = null;
        kc stackIn_32_0 = null;
        kc stackIn_33_0 = null;
        String stackIn_33_1 = null;
        kc stackIn_34_0 = null;
        kc stackIn_36_0 = null;
        kc stackIn_37_0 = null;
        String stackIn_37_1 = null;
        int stackIn_41_0 = 0;
        Object stackIn_98_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vn var4 = null;
        Object var5 = null;
        Object var6 = null;
        wa var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ne var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = nl.field_Gb.field_Db;
                        stackIn_2_0 = stackIn_4_0;
                        if (dd.field_h != nl.field_Gb.field_Db) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (dn) ((Object) stackIn_2_0);
                        stackIn_5_1 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (dn) ((Object) stackIn_4_0);
                        stackIn_5_1 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((dn) (Object) stackIn_5_0).a(stackIn_5_1 != 0, (byte) 98, ga.field_r - -2, 2, (3 * ga.field_r + 6) * param2, param0) ? 1 : 0;
                        var4 = nl.field_Gb.field_Eb.field_G;
                        var5 = null;
                        if (param1 != (jb.field_t ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ec.field_d.field_ub = true;
                        lj.field_j.field_rb = tj.a(param1 + -94, new String[]{ie.field_Nb}, e.field_C);
                        nl.field_Gb.field_Db.field_Hb.field_rb = null;
                        var6 = null;
                        var7 = (wa) ((Object) var4.b(param1 ^ -12622));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == null) {
                            statePc = 81;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == var7.field_G) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7.field_Jb = new kc(0L, qa.field_j);
                        var7.a(var7.field_Jb, 117);
                        var7.field_Fb = new kc(0L, le.field_E);
                        var7.a(var7.field_Fb, 26);
                        var7.field_Mb = new kc(0L, qa.field_j);
                        var7.a(var7.field_Mb, 71);
                        var7.field_Fb.field_X = 2;
                        var8 = 1;
                        var7.e((byte) 20);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7.field_x = nl.field_Gb.field_Eb.field_x;
                        var9 = 0;
                        if (null != var7.field_Lb) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (ie.field_Nb == var7.field_Lb) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = 52224;
                        var11 = 6750054;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = 0;
                        if (var7.field_Gb == null) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var7.field_Gb.equals("")) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7.field_Mb.field_eb = var11;
                        var7.field_Mb.field_W = eb.field_d;
                        var7.field_Mb.a(eb.field_d.field_n + 3, 0, var9, ga.field_r, (byte) -120);
                        var12 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7.field_Fb.field_eb = var11;
                        var7.field_Jb.field_eb = var11;
                        var7.field_Fb.field_ob = var10;
                        var7.field_Jb.field_ob = var10;
                        var7.field_Fb.field_J = var11;
                        var7.field_Jb.field_J = var11;
                        var7.field_Fb.field_zb = var11;
                        var7.field_Jb.field_zb = var11;
                        var13 = 0;
                        var14 = -82 + var7.field_x;
                        if (var12 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var13 = eb.field_d.field_n - -3;
                        var14 = var14 - var13;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_32_0 = var7.field_Jb;
                        stackIn_30_0 = stackIn_32_0;
                        if (var14 <= 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_33_0 = (kc) ((Object) stackIn_30_0);
                        stackIn_33_1 = dj.a(var7.field_Jb.field_Z, var7.field_Cb, var14);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = (kc) ((Object) stackIn_32_0);
                        stackIn_33_1 = var7.field_Cb;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_33_0.field_rb = stackIn_33_1;
                        var7.field_Jb.a(var14, var13, var9, ga.field_r, (byte) -120);
                        stackIn_36_0 = var7.field_Fb;
                        stackIn_34_0 = stackIn_36_0;
                        if (var7.field_Lb == null) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = (kc) ((Object) stackIn_34_0);
                        stackIn_37_1 = var7.field_Lb;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = (kc) ((Object) stackIn_36_0);
                        stackIn_37_1 = nk.field_o;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_37_0.field_rb = stackIn_37_1;
                        var7.field_Fb.a(80, -80 + var7.field_x, var9, ga.field_r, (byte) -120);
                        if (var7.field_Jb.field_rb.equals(var7.field_Cb)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_41_0 = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15 = stackIn_41_0;
                        var9 = var9 + ga.field_r;
                        if (var3_int == 0) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7.field_B = var9 - var7.field_I;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var8 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        nl.field_Gb.field_Eb.a((byte) 123, (kc) (var6), var7, 2);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6 = var7;
                        if (var7.field_Mb == null) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var7.field_Mb.field_C) {
                            statePc = 78;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var7.field_U != 0) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!var7.field_Jb.field_C) {
                            statePc = 80;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var15 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        kh.field_c = var7.field_Cb;
                        if (var19 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var16 = var7.field_Cb;
                        ArcanistsMulti.a(-26335, (int[]) null, nl.field_Gb.field_Db, var16, 0L, -1, -1, (String) null, var7);
                        if (var7.field_Lb == null) {
                            statePc = 77;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (tc.a(eo.field_c.field_h, -31046)) {
                            statePc = 77;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (!wh.field_g) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (ld.field_p) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var17 = eo.field_c;
                        var18 = tj.a(param1 ^ -125, new String[]{var16}, mb.field_S);
                        var17.field_l.a(8, var18, (byte) -26);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var17 = eo.field_c;
                        var18 = tj.a(-73, new String[]{var16}, bh.field_b);
                        var17.field_l.a(18, var18, (byte) -26);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        kh.field_c = var7.field_Gb;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var7 = (wa) ((Object) var4.a(0));
                        if (var19 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (0 != nl.field_Gb.field_Jb.field_U) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        tc.field_A = new dh(nl.field_Gb.field_Jb.field_V, nl.field_Gb.field_Jb.field_nb, nl.field_Gb.field_Jb.field_x, nl.field_Gb.field_Jb.field_I, dg.field_v, ck.field_a, pg.field_c, pg.field_c);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        vd.field_h = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (nl.field_Gb.field_Lb.field_U == 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        tc.field_A = new dh(nl.field_Gb.field_Lb.field_V, nl.field_Gb.field_Lb.field_nb, nl.field_Gb.field_Lb.field_x, nl.field_Gb.field_Lb.field_I, af.field_Gb, ck.field_a, pg.field_c, pg.field_c);
                        vd.field_h = 1;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        lj.field_j.field_rb = ba.field_f;
                        ec.field_d.field_ub = false;
                        if ((jb.field_t ^ -1) != -2) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        nl.field_Gb.field_Db.field_Hb.field_rb = le.field_db;
                        if (var19 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        nl.field_Gb.field_Db.field_Hb.field_rb = hn.field_l;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        fc.a((byte) -77, nl.field_Gb.field_Eb);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_98_0 = var5;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    return (wa) ((Object) stackIn_98_0);
                }
                case 99: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var3), "bj.J(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_nb == param4) {
                  break L2;
                } else {
                  if (this.field_lb != param4) {
                    break L1;
                  } else {
                    u.b(6);
                    this.k((byte) 104);
                    if (!ArcanistsMulti.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.k((byte) 86);
              break L1;
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.a((qm) null, (byte) 73, 'ﾻ', -7);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("bj.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static boolean g(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                bj.a(121, (byte) -115);
                break L1;
              }
            }
            L2: {
              L3: {
                if (pm.field_e == null) {
                  break L3;
                } else {
                  if (pm.field_e.g(7213) == null) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "bj.H(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int[] param0, int param1) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1;
                        var3 = -7 + param0.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) >= (var2_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$9 = var2_int;
                        var2_int++;
                        param0[incrementValue$9] = 0;
                        incrementValue$10 = var2_int;
                        var2_int++;
                        param0[incrementValue$10] = 0;
                        incrementValue$11 = var2_int;
                        var2_int++;
                        param0[incrementValue$11] = 0;
                        incrementValue$12 = var2_int;
                        var2_int++;
                        param0[incrementValue$12] = 0;
                        incrementValue$13 = var2_int;
                        var2_int++;
                        param0[incrementValue$13] = 0;
                        incrementValue$14 = var2_int;
                        var2_int++;
                        param0[incrementValue$14] = 0;
                        incrementValue$15 = var2_int;
                        var2_int++;
                        param0[incrementValue$15] = 0;
                        incrementValue$16 = var2_int;
                        var2_int++;
                        param0[incrementValue$16] = 0;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 += 7;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var2_int ^ -1) <= (var3 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        incrementValue$17 = var2_int;
                        var2_int++;
                        param0[incrementValue$17] = 0;
                        if (var4 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("bj.R(");
                    stackIn_17_1 = stackIn_19_1;
                    if (param0 == null) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ag a(wc param0, String param1, boolean param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new ag(param1, param0);
              var4.field_r = (pf) ((Object) new mm());
              if (param2) {
                break L1;
              } else {
                field_mb = true;
                break L1;
              }
            }
            var5 = -6 + this.field_k;
            this.field_k = this.field_k + 38;
            var4.a(30, var5, this.field_v + -30, 15, -76);
            this.c(-96, var4);
            this.e((byte) 84);
            stackIn_4_0 = (ag) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("bj.C(");

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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -71) {
                break L1;
              } else {
                field_ub = false;
                break L1;
              }
            }
            if (qo.a(param0, param2 + 71)) {
              if (param1 == null) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = param1.length();
                if ((var3_int ^ -1) > -13) {
                  L2: {
                    if (rk.a((byte) -51, param0)) {
                      if (var3_int != 0) {
                        break L2;
                      } else {
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  stackIn_21_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("bj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    private final void k(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_G) {
              L1: {
                if (param0 >= 85) {
                  break L1;
                } else {
                  field_ob = (ll[]) null;
                  break L1;
                }
              }
              this.field_G = false;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "bj.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_pb = "Lesson 6 of 7<br><br>Use of basic minions in a safe and secure environment.<br><br>Use your imps to destroy all three targets.<br><br><br>* Summoning minions *<br>* Minion selection *<br>* Selection of a minion's spells *";
        field_jb = "This spell can only be cast from within the water.";
        field_qb = "Logging in...";
        field_sb = "You cannot use this spell as an angel";
        field_kb = "Player names can be up to 12 letters, numbers and underscores";
    }
}
