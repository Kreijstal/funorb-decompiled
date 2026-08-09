/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_v;
    private float field_s;
    private int field_b;
    private boolean field_l;
    private rd field_q;
    private int field_c;
    private int field_e;
    private int field_u;
    private int field_a;
    private int field_h;
    static og[] field_d;
    static int[] field_j;
    private int field_g;
    private int field_n;
    private int field_f;
    private int field_i;
    private int field_p;
    private int field_k;
    static String[] field_r;
    static int[] field_t;
    private int field_m;
    private int field_o;

    final ea c(int param0) {
        this.field_a = th.field_e;
        this.field_h = bd.field_k;
        this.field_q.a((byte) 14, this.field_c, this.field_f);
        int var2 = -96 / ((-34 - param0) / 57);
        vc.field_a = false;
        ea var3 = wd.a(this.field_c, (byte) 77, 0, 0, wc.field_c, this.field_f);
        if (var3 == null) {
            this.c((byte) -91);
        }
        return var3;
    }

    final static void a(int param0) {
        String var1;
        int var2;
        if (!vh.field_j) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (oj.field_q != null) {
              oj.field_q.q(4210752);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = -45 / ((26 - param0) / 52);
          var1 = fe.b((byte) -127);
          ig.field_ib = new pk(var1, (String) null, true, false, false);
          bm.field_d.b((byte) 74, (pj) (kg.field_j));
          kg.field_j.a(false, ig.field_ib);
          kg.field_j.m(0);
          return;
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        ee var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var3 = (ee) null;
                jk.a(91, -71, (ee) null, (String) null, (ee) null, true, -102);
                break L1;
              }
            }
            stackIn_3_0 = md.field_d.a(param1, 1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jk.K(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, ef param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        se var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var5 = uk.field_b;
                var5.i(param0, -98);
                var5.field_i = var5.field_i + 1;
                var4 = var5.field_i;
                var5.a(1, -75);
                if (param1.field_l != null) {
                  break L2;
                } else {
                  var5.a(0, -128);
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5.a(param1.field_l.length, -32);
              var5.a(0, param1.field_l.length, (byte) -11, param1.field_l);
              break L1;
            }
            L3: {
              var5.e(-18951, var4);
              if (!param2) {
                break L3;
              } else {
                field_j = (int[]) null;
                break L3;
              }
            }
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("jk.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        if (null == mg.field_k) {
          L0: {
            if (0 >= tc.field_b) {
              this.field_l = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_l) {
            L1: {
              L2: {
                if (this.field_n <= bd.field_k) {
                  break L2;
                } else {
                  em.field_r = (-bd.field_k + this.field_n) / 2;
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 <= (this.field_n ^ -1)) {
                break L1;
              } else {
                em.field_r = 0;
                break L1;
              }
            }
            L3: {
              L4: {
                if (bd.field_k != this.field_e) {
                  break L4;
                } else {
                  if (this.field_b == th.field_e) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_q.a((byte) 46, this.field_b, this.field_e);
              break L3;
            }
            return;
          } else {
            fieldTemp$1 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if ((fieldTemp$1 ^ -1) >= -1) {
              this.field_m = this.field_v;
              if (this.field_o > mg.field_f) {
                this.field_l = false;
                return;
              } else {
                this.b((byte) 98);
                var2 = -52 / ((22 - param0) / 52);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void b(int param0, int param1, int param2) {
        fd.field_c = param1;
        if (param2 != 249) {
            ef var4 = (ef) null;
            jk.a(-96, (ef) null, false);
        }
        sf.field_T = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 65) {
            return;
        }
        field_t = null;
        field_r = null;
        field_j = null;
    }

    final static int a(int param0, int param1, ee param2, String param3, ee param4, boolean param5, int param6) {
        int stackIn_8_0 = 0;
        mg stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        mg stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mg stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        mg stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        mg stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        mg stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_39_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var14 = param4.a(true);
                        var11_ref_String = var14;
                        var11_ref_String = var14;
                        if (param6 == -23739) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = (og[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = param2.a(true);
                        var11_ref_String = var8;
                        var11_ref_String = var8;
                        if (null == p.field_d) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!fg.a(false, param6 ^ 23694)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = -1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (sk.field_E == dh.field_bb) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        uk.field_b.field_i = 0;
                        ci.field_h = null;
                        if (param3 == null) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = 0;
                        if (param5) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = var9 | 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        pg.field_c.field_i = 0;
                        pg.field_c.b(tl.field_f.nextInt(), param6 ^ 23738);
                        pg.field_c.b(tl.field_f.nextInt(), -1);
                        pg.field_c.a(false, var14);
                        pg.field_c.a(false, var8);
                        var15 = (CharSequence) ((Object) param3);
                        pg.field_c.a(false, wb.a(var15, 122));
                        pg.field_c.b((byte) -60, param1);
                        pg.field_c.a(param0, -60);
                        pg.field_c.a(var9, param6 ^ 23799);
                        uk.field_b.a(18, -126);
                        uk.field_b.field_i = uk.field_b.field_i + 2;
                        var10 = uk.field_b.field_i;
                        var11_ref_String = tc.a((byte) -41, uj.b((byte) -120));
                        if (var11_ref_String != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var11_ref_String = "";
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        uk.field_b.a(var11_ref_String, -6528);
                        cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                        uk.field_b.d(-var10 + uk.field_b.field_i, -2);
                        if (var13 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        pg.field_c.field_i = 0;
                        pg.field_c.b(tl.field_f.nextInt(), -1);
                        pg.field_c.b(tl.field_f.nextInt(), -1);
                        stackIn_20_0 = pg.field_c;
                        stackIn_19_0 = stackIn_20_0;
                        stackIn_20_1 = 0;
                        stackIn_19_1 = stackIn_20_1;
                        if (!param4.b(-125)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = (mg) ((Object) stackIn_19_0);
                        stackIn_21_1 = stackIn_19_1;
                        stackIn_21_2 = (String) (var14);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (mg) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = "";
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((mg) (Object) stackIn_21_0).a(stackIn_21_1 != 0, stackIn_21_2);
                        stackIn_23_0 = pg.field_c;
                        stackIn_22_0 = stackIn_23_0;
                        stackIn_23_1 = 0;
                        stackIn_22_1 = stackIn_23_1;
                        if (!param2.b(-111)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = (mg) ((Object) stackIn_22_0);
                        stackIn_24_1 = stackIn_22_1;
                        stackIn_24_2 = (String) (var8);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (mg) ((Object) stackIn_23_0);
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = "";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((mg) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2);
                        uk.field_b.a(16, -15);
                        uk.field_b.field_i = uk.field_b.field_i + 1;
                        var9 = uk.field_b.field_i;
                        cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                        uk.field_b.c((byte) 123, uk.field_b.field_i + -var9);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        bh.a(-1, -1);
                        dh.field_bb = ea.field_f;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (dh.field_bb != ea.field_f) {
                            statePc = 40;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!va.a(true, 1)) {
                            statePc = 40;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = cd.field_t.b((byte) 90);
                        cd.field_t.field_i = 0;
                        if (-101 < (var9 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var9 > 105) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        vd.field_e = new String[var9 + -100];
                        dh.field_bb = fd.field_h;
                        if (var13 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9 == 248) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var9 ^ -1) != -100) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        va.a(true, ue.b((byte) 123));
                        ci.field_h = new Boolean(af.a(cd.field_t, true));
                        cd.field_t.field_i = 0;
                        if (var13 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        tf.field_c = -1;
                        dh.field_bb = nk.field_w;
                        ab.field_l = var9;
                        if (var13 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        wl.a(uj.b((byte) -120), (byte) 54);
                        kk.field_Y = ob.field_C;
                        th.a(param6 + 23856);
                        ea.field_a = false;
                        stackIn_39_0 = var9;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    try {
                        if (dh.field_bb != fd.field_h) {
                            statePc = 51;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = 2;
                        if (!va.a(true, var9)) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10 = cd.field_t.j(98203176);
                        cd.field_t.field_i = 0;
                        if (!va.a(true, var10)) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = vd.field_e.length;
                        var12 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var11 <= var12) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                        var12++;
                        if (var13 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var13 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        th.a(108);
                        ea.field_a = false;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = 100 + var11;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    return stackIn_50_0;
                }
                case 51: {
                    try {
                        if (dh.field_bb == nk.field_w) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!ce.a(-68)) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (ab.field_l == 255) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        kk.field_Y = cd.field_t.g(2);
                        if (var13 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9_ref_String = cd.field_t.i(-1);
                        if (var9_ref_String != null) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        kb.a(uj.b((byte) -120), false, var9_ref_String);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        th.a(126);
                        ea.field_a = false;
                        stackIn_61_0 = ab.field_l;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    return stackIn_61_0;
                }
                case 62: {
                    try {
                        if (null == p.field_d) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!ea.field_a) {
                            statePc = 71;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (30000L < ed.b(-1)) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        kk.field_Y = dj.field_j;
                        if (var13 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        kk.field_Y = ee.field_c;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ea.field_a = false;
                        stackIn_70_0 = 249;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    return stackIn_70_0;
                }
                case 71: {
                    try {
                        var9 = eg.field_v;
                        eg.field_v = sj.field_x;
                        sj.field_x = var9;
                        ea.field_a = true;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = -1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return stackIn_73_0;
                }
                case 74: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_76_0 = (RuntimeException) (var7);
                    stackIn_75_0 = stackIn_76_0;
                    stackIn_76_1 = new StringBuilder().append("jk.F(").append(param0).append(',').append(param1).append(',');
                    stackIn_75_1 = stackIn_76_1;
                    if (param2 == null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_79_0;
                    stackIn_79_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
                    stackIn_78_1 = stackIn_79_1;
                    if (param3 == null) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_80_2 = "{...}";
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_80_2 = "null";
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_0 = stackIn_82_0;
                    stackIn_82_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
                    stackIn_81_1 = stackIn_82_1;
                    if (param4 == null) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_83_2 = "{...}";
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_83_2 = "null";
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    throw dd.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_u = param1;
        if (param0 != 14592) {
            field_r = (String[]) null;
        }
        this.field_n = param2;
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 28) {
            break L0;
          } else {
            field_r = (String[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (mg.field_f < this.field_o) {
              break L2;
            } else {
              if (0 >= tc.field_b) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          var2 = this.field_n;
          if (param0 >= 50) {
            break L0;
          } else {
            this.field_n = 104;
            break L0;
          }
        }
        var3 = this.field_u;
        if (!this.b(120)) {
          this.field_l = false;
          return;
        } else {
          L1: {
            L2: {
              if (var3 > this.field_i) {
                break L2;
              } else {
                if (var3 < this.field_k) {
                  var3 = this.field_k;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            var3 = this.field_i;
            break L1;
          }
          L3: {
            L4: {
              if (var2 <= this.field_g) {
                break L4;
              } else {
                var2 = this.field_g;
                if (var5 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (var2 >= this.field_p) {
              break L3;
            } else {
              var2 = this.field_p;
              break L3;
            }
          }
          L5: {
            if (0.0f >= this.field_s) {
              break L5;
            } else {
              L6: {
                var4 = (int)(this.field_s * (float)var3 + 0.5f);
                if (var2 >= var4) {
                  break L6;
                } else {
                  var3 = (int)((float)var2 / this.field_s);
                  if (var5 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (var4 >= var2) {
                break L5;
              } else {
                var2 = var4;
                break L5;
              }
            }
          }
          L7: {
            L8: {
              if (bd.field_k != var2) {
                break L8;
              } else {
                if (var3 == th.field_e) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            this.field_q.a((byte) 53, var3, var2);
            break L7;
          }
          L9: {
            if (this.field_n <= 0) {
              break L9;
            } else {
              em.field_r = (this.field_n - bd.field_k) / 2;
              break L9;
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        this.field_q.a((byte) 105, this.field_a, this.field_h);
        if (param0 >= -54) {
            this.field_c = 116;
        }
    }

    private jk() throws Throwable {
        throw new Error();
    }

    static {
        field_t = new int[8192];
        field_r = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
