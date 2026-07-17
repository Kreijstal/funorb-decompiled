/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm implements Runnable {
    static lc field_i;
    static String field_g;
    static int field_a;
    volatile boolean field_f;
    volatile boolean field_d;
    volatile ua[] field_h;
    pd field_b;
    static on field_e;
    static int field_j;
    static String field_k;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_k = null;
        field_e = null;
        field_i = null;
    }

    final static void a(int param0) {
        qg var1 = (qg) (Object) sg.field_m.b(-109);
        if (var1 == null) {
            var1 = new qg();
        }
        var1.a(df.field_d, df.field_i, df.field_h, (byte) -45, df.field_e, df.field_f, df.field_g, df.field_k);
        if (param0 != 0) {
            return;
        }
        jk.field_a.a((l) (Object) var1, (byte) -37);
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ic stackIn_6_0 = null;
        ic stackIn_7_0 = null;
        ic stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ic stackIn_10_0 = null;
        ic stackIn_11_0 = null;
        ic stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ic stackIn_15_0 = null;
        ic stackIn_16_0 = null;
        ic stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ic stackIn_19_0 = null;
        ic stackIn_20_0 = null;
        ic stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        oi stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        oi stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        oi stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        oi stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        oi stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        ic stackOut_18_0 = null;
        ic stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        ic stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ic stackOut_14_0 = null;
        ic stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ic stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ic stackOut_9_0 = null;
        ic stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ic stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ic stackOut_5_0 = null;
        ic stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ic stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != -1) {
                if (param0 == -2) {
                  throw new RuntimeException();
                } else {
                  L2: {
                    pj.a(c.field_d, param4 + 256);
                    stackOut_23_0 = al.field_j[param0];
                    stackOut_23_1 = param3;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (!ke.field_p.field_d) {
                      stackOut_25_0 = (oi) (Object) stackIn_25_0;
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = 2;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      break L2;
                    } else {
                      stackOut_24_0 = (oi) (Object) stackIn_24_0;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = 0;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      break L2;
                    }
                  }
                  L3: {
                    ((oi) (Object) stackIn_26_0).b(stackIn_26_1, stackIn_26_2, -62);
                    if (param1 == -1) {
                      break L3;
                    } else {
                      ff.a(param1, 0, ff.field_a);
                      break L3;
                    }
                  }
                  ul.b((byte) 124);
                  break L1;
                }
              } else {
                if (vg.field_I != null) {
                  if (ke.field_p.field_d) {
                    L4: {
                      stackOut_18_0 = vg.field_I;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (0.0 <= nk.field_K[11]) {
                        stackOut_20_0 = (ic) (Object) stackIn_20_0;
                        stackOut_20_1 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L4;
                      } else {
                        stackOut_19_0 = (ic) (Object) stackIn_19_0;
                        stackOut_19_1 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L4;
                      }
                    }
                    ((ic) (Object) stackIn_21_0).a(stackIn_21_1 != 0, 85, c.field_d);
                    break L1;
                  } else {
                    L5: {
                      stackOut_14_0 = vg.field_I;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (0.0 <= nk.field_K[11]) {
                        stackOut_16_0 = (ic) (Object) stackIn_16_0;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L5;
                      } else {
                        stackOut_15_0 = (ic) (Object) stackIn_15_0;
                        stackOut_15_1 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L5;
                      }
                    }
                    ((ic) (Object) stackIn_17_0).a(stackIn_17_1 != 0, (byte) 101, we.field_e, c.field_d);
                    break L1;
                  }
                } else {
                  if (ei.field_b == null) {
                    break L1;
                  } else {
                    if (ke.field_p.field_d) {
                      L6: {
                        stackOut_9_0 = ei.field_b;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (nk.field_K[11] >= 0.0) {
                          stackOut_11_0 = (ic) (Object) stackIn_11_0;
                          stackOut_11_1 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          break L6;
                        } else {
                          stackOut_10_0 = (ic) (Object) stackIn_10_0;
                          stackOut_10_1 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L6;
                        }
                      }
                      ((ic) (Object) stackIn_12_0).a(stackIn_12_1 != 0, 99, c.field_d);
                      break L1;
                    } else {
                      L7: {
                        stackOut_5_0 = ei.field_b;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (0.0 <= nk.field_K[11]) {
                          stackOut_7_0 = (ic) (Object) stackIn_7_0;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L7;
                        } else {
                          stackOut_6_0 = (ic) (Object) stackIn_6_0;
                          stackOut_6_1 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          break L7;
                        }
                      }
                      ((ic) (Object) stackIn_8_0).a(stackIn_8_1 != 0, (byte) 58, we.field_e, c.field_d);
                      break L1;
                    }
                  }
                }
              }
            }
            L8: {
              if (!db.b((byte) 13, param4)) {
                break L8;
              } else {
                if (hj.field_h > 0) {
                  L9: {
                    pj.a(c.field_d, param4 + 256);
                    var5_int = 1024 * Math.min(-hj.field_h + id.field_c, hj.field_h) / id.field_c;
                    if (var5_int > 0) {
                      var6 = 0;
                      L10: while (true) {
                        if (c.field_d.field_B.length <= var6) {
                          break L9;
                        } else {
                          L11: {
                            var7 = (var6 * 173 - -(159 * id.field_r)) % var5_int + -(var5_int / 2);
                            var8 = 255 & c.field_d.field_B[var6];
                            var8 = var8 + var7;
                            if (0 <= var8) {
                              if (255 >= var8) {
                                break L11;
                              } else {
                                var8 = 255;
                                break L11;
                              }
                            } else {
                              var8 = 0;
                              break L11;
                            }
                          }
                          c.field_d.field_B[var6] = oh.a(var8, rb.a(c.field_d.field_B[var6], 16776960));
                          var6++;
                          continue L10;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  ul.b((byte) 105);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var5, "lm.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final void run() {
        int var1_int = 0;
        ua var2 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        ((lm) this).field_f = true;
        try {
            while (!((lm) this).field_d) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((lm) this).field_h[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.c();
                    }
                }
                mm.a(-92, 10L);
                Object var5 = null;
                od.a(((lm) this).field_b, (Object) null, (byte) -100);
            }
        } catch (Exception exception) {
            Object var6 = null;
            en.a((String) null, (Throwable) (Object) exception, 1);
        } finally {
            ((lm) this).field_f = false;
        }
    }

    final static mg[] a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        mg var10 = null;
        Object var11 = null;
        Object var12 = null;
        mg var13 = null;
        mg var14 = null;
        int[] var18 = null;
        L0: {
          var6 = 51 / ((34 - param1) / 32);
          var18 = df.field_d;
          var8 = df.field_e;
          var9 = df.field_f;
          var10 = new mg(16, param2);
          var10.b();
          df.a(0, 0, 16, param2, param3, param0);
          var11 = null;
          if (!param5) {
            break L0;
          } else {
            var13 = var10.d();
            var11 = (Object) (Object) var13;
            var13.b();
            df.b(0, 0, 5, 0);
            df.b(0, 1, 3, 0);
            df.b(0, 2, 2, 0);
            df.b(0, 3, 1, 0);
            df.b(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          var12 = null;
          if (!param4) {
            break L1;
          } else {
            var14 = var10.d();
            var12 = (Object) (Object) var14;
            var14.b();
            df.b(11, 0, 5, 0);
            df.b(13, 1, 3, 0);
            df.b(14, 2, 2, 0);
            df.b(15, 3, 1, 0);
            df.b(15, 4, 1, 0);
            break L1;
          }
        }
        df.a(var18, var8, var9);
        return new mg[]{null, null, null, (mg) var11, var10, (mg) var12, null, null, null};
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    lm() {
        ((lm) this).field_h = new ua[2];
        ((lm) this).field_d = false;
        ((lm) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Player Name: ";
        field_a = 500;
        field_i = new lc(10, 2, 2, 0);
        field_k = "Players are <%0> and <%1>.";
        field_e = new on();
        field_c = "To <%0>: ";
    }
}
