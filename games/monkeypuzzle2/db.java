/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db implements ml {
    private int field_f;
    private int field_d;
    private int field_j;
    private int field_h;
    private ta field_a;
    static String field_b;
    static String field_e;
    private int field_g;
    private int field_c;
    private int field_i;

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = we.field_n;
        synchronized (var1) {
          L0: {
            ni.field_a = lf.field_a;
            mg.field_s = mg.field_s + 1;
            ei.field_a = b.field_k;
            p.field_a = dh.field_b;
            oe.field_d = oh.field_b;
            oh.field_b = false;
            kc.field_d = ke.field_g;
            qg.field_c = cj.field_d;
            ab.field_e = ek.field_a;
            ke.field_g = param0;
            break L0;
          }
        }
    }

    final static void a(boolean param0) {
        int var1;
        int var2;
        int stackIn_3_0 = 0;
        L0: {
          var2 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (!param0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        ah.field_h = stackIn_3_0 != 0;
        rc.field_i = null;
        if (!fk.field_a) {
          var1 = ue.field_G;
          if (-1 > (var1 ^ -1)) {
            if (var1 != 1) {
              rc.field_i = gg.a(new String[]{Integer.toString(var1)}, pj.field_d, true);
              rc.field_i = vd.a(new CharSequence[]{(CharSequence) ((Object) rc.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gb.field_n)}, (byte) -125);
              me.field_f.g((byte) -75);
              hl.b(34);
              return;
            } else {
              rc.field_i = mc.field_i;
              if (var2 != 0) {
                rc.field_i = gg.a(new String[]{Integer.toString(var1)}, pj.field_d, true);
                rc.field_i = vd.a(new CharSequence[]{(CharSequence) ((Object) rc.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gb.field_n)}, (byte) -125);
                me.field_f.g((byte) -75);
                hl.b(34);
                return;
              } else {
                rc.field_i = vd.a(new CharSequence[]{(CharSequence) ((Object) rc.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gb.field_n)}, (byte) -125);
                me.field_f.g((byte) -75);
                hl.b(34);
                return;
              }
            }
          } else {
            me.field_f.g((byte) -75);
            hl.b(34);
            return;
          }
        } else {
          me.field_f.q(105);
          if (var2 != 0) {
            var1 = ue.field_G;
            if (-1 > (var1 ^ -1)) {
              if (var1 == 1) {
                rc.field_i = mc.field_i;
                if (var2 == 0) {
                  rc.field_i = vd.a(new CharSequence[]{(CharSequence) ((Object) rc.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gb.field_n)}, (byte) -125);
                  me.field_f.g((byte) -75);
                  hl.b(34);
                  return;
                } else {
                  rc.field_i = gg.a(new String[]{Integer.toString(var1)}, pj.field_d, true);
                  rc.field_i = vd.a(new CharSequence[]{(CharSequence) ((Object) rc.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gb.field_n)}, (byte) -125);
                  me.field_f.g((byte) -75);
                  hl.b(34);
                  return;
                }
              } else {
                rc.field_i = gg.a(new String[]{Integer.toString(var1)}, pj.field_d, true);
                rc.field_i = vd.a(new CharSequence[]{(CharSequence) ((Object) rc.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gb.field_n)}, (byte) -125);
                me.field_f.g((byte) -75);
                hl.b(34);
                return;
              }
            } else {
              me.field_f.g((byte) -75);
              hl.b(34);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        d var3 = null;
        int var4 = 0;
        de var5 = null;
        d stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        d stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -108 % ((param1 - -28) / 61);
                        var3 = (d) ((Object) wk.field_b.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 == null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        pj.a(param0, var3, true);
                        stackOut_3_0 = (d) ((Object) wk.field_b.d((byte) 63));
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var4 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = qa.field_d.a((byte) -117);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = (de) ((Object) stackIn_6_0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == null) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        w.a(-94, param0, var5);
                        var5 = (de) ((Object) qa.field_d.d((byte) 63));
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2), "db.A(" + param0 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fj var14 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof fj) {
                stackIn_3_0 = (we) (param1);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var14 = (fj) ((Object) stackIn_3_0);
              ge.d(param1.field_r + param3, param1.field_e + param2, param1.field_l, param1.field_p, this.field_i);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var14.field_I + (param3 - -param1.field_r);
            var8 = param2 + (param1.field_e + var14.field_C);
            ge.f(var7, var8, var14.field_G, this.field_c);
            if (param4 > 19) {
              L3: {
                if ((var14.field_H ^ -1) == 0) {
                  break L3;
                } else {
                  var9 = 2.0 * ((double)var14.field_H * 3.141592653589793) / (double)var14.field_K;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_G);
                  ge.f(var7 - -var11, var12 + var8, 1, this.field_j);
                  break L3;
                }
              }
              ge.f(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_D) / (double)var14.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
              var12 = (int)(Math.cos(var9) * (double)var14.field_G);
              ge.e(var7, var8, var7 + var11, var12 + var8, 1);
              if (this.field_a != null) {
                var13 = this.field_d + var14.field_I + var14.field_G;
                this.field_a.a(param1.field_s, param1.field_r + (param3 - -var13), this.field_g + param2 - -param1.field_e, -this.field_d - (var13 - param1.field_l), -(this.field_d << 1978096801) + param1.field_p, this.field_f, this.field_h, 1, 1, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("db.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -13) {
            field_b = (String) null;
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var1 = 8;
        ci.a(param0 ^ 30460, 176, 464, var1 + 40 + -2, 0, new int[]{0, 3, 11, 12, 4, 2, 13, 10}, 100);
        ci.a(30380, 176, 464, var1 + 40, 1, new int[]{1, 11, 12, 4, 3, 6}, 145);
        if (param0 != 80) {
            field_e = (String) null;
            ci.a(30380, fe.field_h != 2 ? 75 : 65, 2 == fe.field_h ? 575 : 565, var1 + 40, 2, new int[]{7, 8, 9, 5}, 380);
            ci.a(30380, 255, 385, var1 + 40, 3, new int[]{16, 17, 19}, 380);
            ci.a(30380, 255, 385, var1 + 40, 4, new int[]{16, 17, 18}, 380);
            ci.a(30380, 166, 474, var1 + 40, 5, new int[]{5}, 370);
            ci.a(param0 + 30300, 180, 460, 40 - -var1, 6, new int[]{2, 5}, 370);
            ci.a(param0 + 30300, 164, 476, 40 - -var1, 7, new int[]{14, 15}, 200);
            ci.a(param0 + 30300, 166, 474, 40 - -var1, 8, new int[]{14, 5}, 370);
            ci.a(30380, 166, 474, var1 + 40, 9, new int[]{14, 5}, 380);
            ci.a(param0 + 30300, 180, 460, 40 - -var1, 10, new int[]{5}, 370);
            lh.field_b = pl.field_e.a(ma.field_a[11]);
            var2 = pl.field_e.a(ma.field_a[12]);
            if (!(var2 <= lh.field_b)) {
                lh.field_b = var2;
            }
            var3 = 4 + pl.field_e.field_j - -pl.field_e.field_D;
            i.field_r[7] = pl.field_e.field_D + 200 + (pl.field_e.field_C + var3);
            mc.field_b[7] = 40 + var3;
            return;
        }
        ci.a(30380, fe.field_h != 2 ? 75 : 65, 2 == fe.field_h ? 575 : 565, var1 + 40, 2, new int[]{7, 8, 9, 5}, 380);
        ci.a(30380, 255, 385, var1 + 40, 3, new int[]{16, 17, 19}, 380);
        ci.a(30380, 255, 385, var1 + 40, 4, new int[]{16, 17, 18}, 380);
        ci.a(30380, 166, 474, var1 + 40, 5, new int[]{5}, 370);
        ci.a(param0 + 30300, 180, 460, 40 - -var1, 6, new int[]{2, 5}, 370);
        ci.a(param0 + 30300, 164, 476, 40 - -var1, 7, new int[]{14, 15}, 200);
        ci.a(param0 + 30300, 166, 474, 40 - -var1, 8, new int[]{14, 5}, 370);
        ci.a(30380, 166, 474, var1 + 40, 9, new int[]{14, 5}, 380);
        ci.a(param0 + 30300, 180, 460, 40 - -var1, 10, new int[]{5}, 370);
        lh.field_b = pl.field_e.a(ma.field_a[11]);
        var2 = pl.field_e.a(ma.field_a[12]);
        if (!(var2 <= lh.field_b)) {
            lh.field_b = var2;
        }
        var3 = 4 + pl.field_e.field_j - -pl.field_e.field_D;
        i.field_r[7] = pl.field_e.field_D + 200 + (pl.field_e.field_C + var3);
        mc.field_b[7] = 40 + var3;
    }

    db(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_a = param0;
            this.field_f = param3;
            this.field_j = param6;
            this.field_d = param1;
            this.field_h = param4;
            this.field_i = param7;
            this.field_g = param2;
            this.field_c = param5;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = "Loading extra data";
        field_e = "Close";
    }
}
