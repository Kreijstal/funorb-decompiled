/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh implements Iterable {
    static w field_c;
    be field_a;
    static boolean field_b;
    static int field_d;

    final static ke a(int[] param0, boolean param1, int param2, int param3) {
        ke stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ec var6 = null;
        ke var7 = null;
        ec var8 = null;
        ec var9 = null;
        ec var10 = null;
        ec var11 = null;
        try {
          L0: {
            L1: {
              var7 = new ke(3);
              var7.field_v = param0;
              var7.field_i = param2;
              if (!ph.n(-30146)) {
                break L1;
              } else {
                var6 = new ec(20, qn.field_rb, a.field_t);
                var6.field_m = 387;
                var6.field_l = 320 + -(var6.field_n / 2);
                var7.a(var6, 100);
                break L1;
              }
            }
            L2: {
              if (mg.field_Zb) {
                var8 = new ec(10, jd.field_Ob, a.field_t);
                var8.field_l = -(var8.field_n / 2) + 320;
                var8.field_m = 387;
                var7.a(var8, 101);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (fm.field_e) {
                var9 = new ec(19, jd.field_Ob, a.field_t);
                var9.field_m = 387;
                var9.field_l = -(var9.field_n / 2) + 320;
                var7.a(var9, 100);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (he.field_db) {
                var10 = new ec(3, oa.field_c, a.field_t);
                var10.field_l = -(var10.field_n / 2) + 320;
                var10.field_m = 387;
                var7.a(var10, 123);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var11 = new ec(13, pc.field_f, a.field_t);
              if (param3 <= -103) {
                break L5;
              } else {
                uh.a(-120);
                break L5;
              }
            }
            L6: {
              var11.field_l = 320 + -(var11.field_n / 2);
              var11.field_m = 415;
              var7.a(var11, 106);
              if (var7.field_b.field_l < 3) {
                break L6;
              } else {
                var7.a(387, 320, true, -118, 24);
                break L6;
              }
            }
            var7.field_y = 520;
            var7.field_q = 215;
            var7.field_z = 166;
            var7.field_w = 62;
            var7.a(0, param1, -129);
            stackIn_16_0 = (ke) (var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("uh.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final be a(byte param0) {
        be var2;
        int[] var3;
        var2 = this.field_a.field_p;
        if (var2 != this.field_a) {
          var2.e((byte) 97);
          if (param0 < 51) {
            var3 = (int[]) null;
            uh.a((int[]) null, true, 58, 67);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        wc var1;
        wc var2;
        wc dupTemp$1 = (wc) ((Object) sn.field_e.d(-89));
        var2 = dupTemp$1;
        var1 = dupTemp$1;
        if (param0 != -9074) {
          return;
        } else {
          L0: {
            if (var2 == null) {
              var1 = new wc();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a((byte) 37, hk.field_i, hk.field_l, hk.field_j, hk.field_g, hk.field_c, hk.field_h, hk.field_b);
          ci.field_a.a(var1, 2777);
          return;
        }
    }

    final static void a(pi[] param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0.length <= var2_int) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param0[var2_int].a();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = -73 / ((param1 - 53) / 55);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (runtimeException);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("uh.D(");
                    stackIn_11_1 = stackIn_12_1;
                    if (param0 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        int stackIn_13_0 = 0;
        String stackIn_13_1 = null;
        int stackIn_14_0 = 0;
        String stackIn_14_1 = null;
        int stackIn_15_0 = 0;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        cc stackIn_20_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        pi[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = -ad.field_a + fb.field_f;
                        ad.field_a = -(var1_int >> -1322795295) + af.field_f;
                        if (param0 == 32659) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var11 = (pi[]) null;
                        uh.a((pi[]) null, (byte) 12);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fb.field_f = ad.field_a - -var1_int;
                        rn.field_d = -(ac.field_A >> 1209881953) + kk.field_e;
                        var2 = rn.field_d;
                        var3 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 >= ef.field_M.length) {
                            statePc = 30;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = ug.field_q[var3];
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var4 ^ -1) <= -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = ie.field_b;
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (wj.field_Jb.field_h == var4) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = i.field_c;
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = hd.field_s;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = ef.field_M[var3];
                        stackIn_14_0 = 0;
                        stackIn_13_0 = stackIn_14_0;
                        stackIn_14_1 = (String) (var6);
                        stackIn_13_1 = stackIn_14_1;
                        if (var4 < 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = stackIn_13_0;
                        stackIn_15_1 = (String) ((Object) stackIn_13_1);
                        stackIn_15_2 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = stackIn_14_0;
                        stackIn_15_1 = (String) ((Object) stackIn_14_1);
                        stackIn_15_2 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = qb.a(stackIn_15_0, stackIn_15_1, stackIn_15_2 != 0);
                        var8 = -(var7 >> -1957955167) + af.field_f;
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2 = var2 + je.field_c;
                        if (var4 != wj.field_Jb.field_h) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = gf.field_b;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = ql.field_b;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = stackIn_20_0;
                        if (var9 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9.a(var7 + (ba.field_d << -878923967), 97, -ba.field_d + var8, var2, (le.field_t << 1939779937) + vb.field_V);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2 = var2 + le.field_t;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        wf.field_q.a(var6, var8, hb.field_Wb + var2, var5, -1);
                        var2 = var2 + ma.field_I;
                        if (var10 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        aj.field_d.a(var6, var8, pa.field_fb + var2, var5, -1);
                        var2 = var2 + (le.field_t + je.field_c + vb.field_V);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3++;
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "uh.A(" + param0 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 <= 44) {
            uh.b(-20);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new dg((uh) (this)));
    }

    final void a(byte param0, be param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_v != null) {
                param1.e((byte) 85);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_v = this.field_a.field_v;
            param1.field_p = this.field_a;
            param1.field_v.field_p = param1;
            param1.field_p.field_v = param1;
            if (param0 == 4) {
              break L0;
            } else {
              field_c = (w) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("uh.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    uh() {
        this.field_a = new be();
        this.field_a.field_p = this.field_a;
        this.field_a.field_v = this.field_a;
    }

    static {
    }
}
