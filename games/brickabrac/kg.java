/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg implements Runnable {
    private lq field_f;
    static String field_b;
    static int[] field_i;
    static jp[][] field_a;
    static String field_e;
    static String[] field_h;
    private boolean field_j;
    int field_c;
    static int[] field_d;
    private Thread field_g;

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((kg) this).field_j = true;
        var2 = (Object) (Object) ((kg) this).field_f;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((kg) this).field_f).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((kg) this).field_g.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((kg) this).field_g = null;
        if (param0 < 38) {
          ((kg) this).field_c = -29;
          return;
        } else {
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final kj a(ve param0, int param1, int param2) {
        kj var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        kj var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        kj stackIn_8_0 = null;
        kj stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        kj stackOut_7_0 = null;
        kj stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = new kj();
            var4.field_F = 1;
            var5_ref_Object = (Object) (Object) ((kg) this).field_f;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = (kj) (Object) ((kg) this).field_f.a(true);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~(long)param1 != ~var6.field_j) {
                        break L3;
                      } else {
                        if (var6.field_G != param0) {
                          break L3;
                        } else {
                          if (var6.field_F != 2) {
                            break L3;
                          } else {
                            var4.field_u = false;
                            var4.field_E = var6.field_E;
                            stackOut_7_0 = (kj) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (kj) (Object) ((kg) this).field_f.e(-8394);
                    continue L2;
                  }
                }
              }
            }
            var4.field_E = param0.a(0, param1);
            var4.field_u = false;
            var5 = -57 / ((-77 - param2) / 47);
            var4.field_B = true;
            stackOut_14_0 = (kj) var4;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("kg.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_15_0;
    }

    final static void a(int param0) {
        if (param0 != 21678) {
            kg.a(-67);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 485 + param1 + 8 - (-2 - param4) + 8;
              sh.field_d.a(-6 + gp.field_d.field_cb, 3, 3, -6 + var6_int, (byte) 64);
              var7 = -5 + sh.field_d.field_cb;
              kc.field_n.a(param3, -param3 + var7, 5, param4 + 485 + param1 + 2, (byte) 64);
              g.field_n.a(param3, 0, param1, -ap.field_e.field_Ib + -param1 + kc.field_n.field_Ib, (byte) 64);
              var8 = -3;
              ap.field_e.a(param3, 0, param1 + g.field_n.field_Ib, ap.field_e.field_Ib, (byte) 64);
              var7 = var7 - (param3 - -2);
              i.field_q.a(2, (byte) -110, 2 + (485 + param1) - -param4, 5, 5, param4, var7 - 5);
              if (null == vd.field_a) {
                break L1;
              } else {
                vd.field_a.a(i.field_q.field_cb, i.field_q.field_P, i.field_q.field_zb, (byte) -119, i.field_q.field_Ib);
                break L1;
              }
            }
            var9 = -param1 + (gp.field_d.field_Ib + -var6_int);
            var10 = var9 / 2;
            var11 = param1 + var10 - -param2;
            var12 = 0;
            var13 = 0;
            L2: while (true) {
              if (6 <= var13) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (var13 >= 5) {
                      break L4;
                    } else {
                      if (null == ik.field_i[var13]) {
                        var13++;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = 3 - -((2 + gp.field_d.field_cb - 6) * var12 / (fe.field_pb + 1));
                  var12++;
                  var7 = -var14 + 3 + (var12 * (2 + (gp.field_d.field_cb - 6)) / (fe.field_pb + 1) + -2);
                  if (5 > var13) {
                    ik.field_i[var13].a(var7, var14, var6_int, var9, (byte) 64);
                    dp.field_w[var13].a(var7, 0, param1, -param1 + var10, (byte) 64);
                    vj.field_a[var13].a(-param5 + (var7 + -param5), param5, var10, param2, (byte) 64);
                    wd.field_F[var13].a(-param5 + -param5 + var7, param5, var11, -var11 + var9 + -param1, (byte) 64);
                    var13++;
                    break L3;
                  } else {
                    mj.field_c.a(var7, var14, var6_int, var9, (byte) 64);
                    var13++;
                    break L3;
                  }
                }
                var13++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var6, "kg.I(" + 93 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final kj a(int param0, ve param1, byte param2) {
        kj var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        kj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_2_0 = null;
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
              var4 = new kj();
              var4.field_F = 3;
              var4.field_B = false;
              if (param2 < -51) {
                break L1;
              } else {
                var5 = null;
                kj discarded$4 = ((kg) this).a(26, true, (byte[]) null, (ve) null);
                break L1;
              }
            }
            var4.field_G = param1;
            var4.field_j = (long)param0;
            int discarded$5 = -3;
            this.a(var4);
            stackOut_2_0 = (kj) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("kg.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(kj param0) {
        synchronized (((kg) this).field_f) {
            ((kg) this).field_f.a((tk) (Object) param0, false);
            ((kg) this).field_c = ((kg) this).field_c + 1;
            ((Object) (Object) ((kg) this).field_f).notifyAll();
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            kj var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = BrickABrac.field_J ? 1 : 0;
            L0: while (true) {
              if (((kg) this).field_j) {
                return;
              } else {
                var2 = (Object) (Object) ((kg) this).field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (kj) (Object) ((kg) this).field_f.a(25609);
                    if (var7 != null) {
                      ((kg) this).field_c = ((kg) this).field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((kg) this).field_f).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_F == 2) {
                          boolean discarded$1 = var7.field_G.a((byte) -123, var7.field_E, var7.field_E.length, (int)var7.field_j);
                          var7.field_u = false;
                          break L5;
                        } else {
                          if (var7.field_F == 3) {
                            var7.field_E = var7.field_G.a(0, (int)var7.field_j);
                            var7.field_u = false;
                            break L5;
                          } else {
                            var7.field_u = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      rk.a((String) null, (Throwable) (Object) var2_ref, 35);
                      var7.field_u = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final kj a(int param0, boolean param1, byte[] param2, ve param3) {
        kj var5 = null;
        RuntimeException var5_ref = null;
        kj stackIn_1_0 = null;
        kj stackIn_2_0 = null;
        kj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_0_0 = null;
        kj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        kj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kj stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
              var5 = new kj();
              var5.field_E = param2;
              var5.field_G = param3;
              var5.field_j = (long)param0;
              var5.field_F = 2;
              stackOut_0_0 = (kj) var5;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param1) {
                stackOut_2_0 = (kj) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (kj) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_B = stackIn_3_1 != 0;
            int discarded$2 = -3;
            this.a(var5);
            stackOut_3_0 = (kj) var5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("kg.F(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void b() {
        field_b = null;
        field_i = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_e = null;
    }

    kg(tg param0) {
        ql var2 = null;
        ((kg) this).field_f = new lq();
        ((kg) this).field_j = false;
        ((kg) this).field_c = 0;
        try {
            var2 = param0.a(5, (Runnable) this, (byte) -72);
            while (var2.field_f == 0) {
                wj.a(-124, 10L);
            }
            if (var2.field_f == 2) {
                throw new RuntimeException();
            }
            ((kg) this).field_g = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Hide game chat";
        field_i = new int[]{16494651, 27571, 12658477, 26679, 16711935};
        field_e = "Enter name of player to add to list";
        field_h = new String[16];
        field_d = new int[]{12658477, 22953, 16494651, 26679, 16711935};
    }
}
