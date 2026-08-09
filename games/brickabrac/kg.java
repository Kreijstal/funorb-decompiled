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
        try {
            InterruptedException interruptedException = null;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            this.field_j = true;
            var2 = this.field_f;
            synchronized (var2) {
              L0: {
                this.field_f.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_g.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            this.field_g = null;
            if (param0 < 38) {
              this.field_c = -29;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        int var8 = 0;
        kj stackIn_8_0 = null;
        kj stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = new kj();
            var4.field_F = 1;
            var5_ref_Object = this.field_f;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = (kj) ((Object) this.field_f.a(true));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (((long)param1 ^ -1L) != (var6.field_j ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_G != param0) {
                          break L3;
                        } else {
                          if (-3 != (var6.field_F ^ -1)) {
                            break L3;
                          } else {
                            var4.field_u = false;
                            var4.field_E = var6.field_E;
                            stackIn_8_0 = (kj) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (kj) ((Object) this.field_f.e(-8394));
                    continue L2;
                  }
                }
              }
            }
            var4.field_E = param0.a(0, param1);
            var4.field_u = false;
            var5 = -57 / ((-77 - param2) / 47);
            var4.field_B = true;
            stackIn_15_0 = (kj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("kg.E(");

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
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    final static void a(int param0) {
        if (param0 != 21678) {
            kg.a(-67);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
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
        RuntimeException var6 = null;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 485 + param1 + 8 - (-2 - param4) + 8;
              sh.field_d.a(-6 + gp.field_d.field_cb, 3, 3, -6 + var6_int, (byte) 64);
              var7 = -5 + sh.field_d.field_cb;
              kc.field_n.a(param3, -param3 + var7, 5, param4 + 485 + param1 + 2, (byte) 64);
              g.field_n.a(param3, 0, param1, -ap.field_e.field_Ib + -param1 + kc.field_n.field_Ib, (byte) 64);
              var8 = 3 / ((49 - param0) / 40);
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
                    if ((var13 ^ -1) <= -6) {
                      break L4;
                    } else {
                      if (null == ik.field_i[var13]) {
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
                    break L3;
                  } else {
                    mj.field_c.a(var7, var14, var6_int, var9, (byte) 64);
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
          throw qb.a((Throwable) ((Object) var6), "kg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final kj a(int param0, ve param1, byte param2) {
        kj var4 = null;
        RuntimeException var4_ref = null;
        ve var5 = null;
        kj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new kj();
              var4.field_F = 3;
              var4.field_B = false;
              if (param2 < -51) {
                break L1;
              } else {
                var5 = (ve) null;
                this.a(26, true, (byte[]) null, (ve) null);
                break L1;
              }
            }
            var4.field_G = param1;
            var4.field_j = (long)param0;
            this.a(var4, -3);
            stackIn_3_0 = (kj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("kg.A(").append(param0).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(kj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            var3_ref = this.field_f;
            synchronized (var3_ref) {
              L1: {
                this.field_f.a(param0, false);
                this.field_c = this.field_c + 1;
                this.field_f.notifyAll();
                break L1;
              }
            }
            if (param1 == -3) {
              break L0;
            } else {
              kg.a((byte) -81, -120, -50, 43, 109, -99);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("kg.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            kj var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = BrickABrac.field_J ? 1 : 0;
            L0: while (true) {
              if (this.field_j) {
                return;
              } else {
                var2 = this.field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (kj) ((Object) this.field_f.a(25609));
                    if (var7 != null) {
                      this.field_c = this.field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_f.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
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
                        if (-3 == (var7.field_F ^ -1)) {
                          var7.field_G.a((byte) -123, var7.field_E, var7.field_E.length, (int)var7.field_j);
                          var7.field_u = false;
                          break L5;
                        } else {
                          if ((var7.field_F ^ -1) == -4) {
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
                      var6 = (String) null;
                      rk.a((String) null, (Throwable) ((Object) var2_ref), 35);
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
        kj stackIn_2_0 = null;
        kj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = new kj();
              var5.field_E = param2;
              var5.field_G = param3;
              var5.field_j = (long)param0;
              var5.field_F = 2;
              stackIn_2_0 = (kj) (var5);

              if (!param1) {
                stackIn_3_0 = (kj) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (kj) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_B = stackIn_3_1 != 0;
            this.a(var5, -3);
            stackIn_4_0 = (kj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("kg.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        field_b = null;
        field_i = null;
        field_a = (jp[][]) null;
        field_h = null;
        if (param0 != 26679) {
          field_h = (String[]) null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          return;
        }
    }

    kg(tg param0) {
        ql var2 = null;
        this.field_f = new lq();
        this.field_j = false;
        this.field_c = 0;
        try {
            var2 = param0.a(5, (Runnable) (this), (byte) -72);
            while (-1 == (var2.field_f ^ -1)) {
                wj.a(-124, 10L);
            }
            if ((var2.field_f ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Hide game chat";
        field_i = new int[]{16494651, 27571, 12658477, 26679, 16711935};
        field_e = "Enter name of player to add to list";
        field_h = new String[16];
        field_d = new int[]{12658477, 22953, 16494651, 26679, 16711935};
    }
}
