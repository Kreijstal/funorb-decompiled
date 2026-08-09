/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo implements Runnable {
    static String field_h;
    static String field_e;
    static String[] field_f;
    static wk field_d;
    private ui field_g;
    private boolean field_a;
    int field_b;
    private Thread field_c;

    final static int a(byte param0, String param1, String param2, boolean param3, int param4, int param5, String param6) {
        gl var7 = null;
        RuntimeException var7_ref = null;
        gl var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
            if (param0 == -46) {
              var7 = new gl(param1);
              var8 = new gl(param2);
              stackIn_4_0 = uq.a(param6, var7, -20032, param5, param4, var8, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -51;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("vo.G(").append(param0).append(',');

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            nh var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            L0: while (true) {
              if (this.field_a) {
                return;
              } else {
                var2 = this.field_g;
                synchronized (var2) {
                  L1: {
                    var7 = (nh) ((Object) this.field_g.b(11));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_g.wait();
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
                    } else {
                      this.field_b = this.field_b - 1;
                      decompiledRegionSelector0 = 1;
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
                        if ((var7.field_L ^ -1) != -3) {
                          if (var7.field_L == 3) {
                            var7.field_F = var7.field_C.a(0, (int)var7.field_q);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_x = false;
                            break L5;
                          }
                        } else {
                          var7.field_C.a(83, var7.field_F.length, var7.field_F, (int)var7.field_q);
                          var7.field_x = false;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      af.a((Throwable) ((Object) var2_ref), -98, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_x = false;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final nh a(byte param0, int param1, bc param2) {
        nh var4 = null;
        RuntimeException var4_ref = null;
        nh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new nh();
              if (param0 == 56) {
                break L1;
              } else {
                vo.a(50, 66, -33, 75, 23, -84, true);
                break L1;
              }
            }
            var4.field_z = false;
            var4.field_C = param2;
            var4.field_L = 3;
            var4.field_q = (long)param1;
            this.a((byte) -105, var4);
            stackIn_3_0 = (nh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("vo.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 33 / ((19 - param0) / 63);
            var4 = 0;
            var5 = rk.field_r;
            L1: while (true) {
              if (var4 >= nb.field_h.length) {
                stackIn_11_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var6 = cj.field_k[var4];
                  if (var6 < 0) {
                    var5 = var5 + cn.field_o;
                    break L2;
                  } else {
                    var7 = lp.a(nb.field_h[var4], true, false);
                    var5 = var5 + ar.field_w;
                    var8 = bt.field_g - (var7 >> 16959969);
                    if (!mu.a(param2, jg.field_k + (rd.field_b << -324593727), param1, -df.field_E + var8, 5138823, (df.field_E << -1400102559) + var7, var5)) {
                      var5 = var5 + (ar.field_w + ((rd.field_b << -1360482783) + jg.field_k));
                      break L2;
                    } else {
                      stackIn_6_0 = var6;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "vo.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    private final void a(byte param0, nh param1) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.field_g;
            synchronized (var3) {
              L1: {
                this.field_g.a(param1, false);
                this.field_b = this.field_b + 1;
                this.field_g.notifyAll();
                break L1;
              }
            }
            var3_int = -58 % ((param0 - 50) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("vo.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (rs.field_t == param1) {
            var7 = eb.field_d;
        } else {
            var7 = cv.field_q;
        }
        ef.a(param2, (byte) 46, param3, param6, param4, param0, param5, var7);
    }

    final static void a(boolean param0, int param1, int param2, om param3) {
        int var6 = 0;
        int var4_int = param3.field_G.field_r;
        int var5 = param3.field_v;
        if (param1 != 1) {
            field_e = (String) null;
        }
        if (nw.g(76)) {
            return;
        }
        try {
            var6 = param0 ? 1 : 0;
            qq.a((byte) 6, var5 + var4_int * 1000, var6, param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vo.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final nh a(int param0, bc param1, boolean param2, byte[] param3) {
        nh var5 = null;
        RuntimeException var5_ref = null;
        nh stackIn_2_0 = null;
        nh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        nh stackIn_4_0 = null;
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
              var5 = new nh();
              var5.field_q = (long)param0;
              var5.field_L = 2;
              stackIn_2_0 = (nh) (var5);

              if (!param2) {
                stackIn_3_0 = (nh) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (nh) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_z = stackIn_3_1 != 0;
            var5.field_F = param3;
            var5.field_C = param1;
            this.a((byte) 117, var5);
            stackIn_4_0 = (nh) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("vo.D(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        try {
            this.field_a = true;
            synchronized (this.field_g) {
                this.field_g.notifyAll();
            }
            try {
                this.field_c.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_c = null;
            int var2 = 41 % ((-67 - param0) / 33);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (!(sj.field_d <= 0)) {
            sj.field_d = sj.field_d - 1;
        }
        if (param0 != -10232) {
            vo.a(-87, -49, 69, -51, 90, -121, false);
        }
        if (!(so.field_b.field_g == gb.field_y)) {
            sh.field_l = sh.field_l + (so.field_b.field_g - gb.field_y);
            gb.field_y = so.field_b.field_g;
        }
        if (!(-1 <= (sj.field_d ^ -1))) {
            vi.a(-67);
        }
    }

    final nh a(int param0, bc param1, int param2) {
        nh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nh var6 = null;
        int var8 = 0;
        nh stackIn_8_0 = null;
        nh stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = new nh();
            var4.field_L = 1;
            var5 = this.field_g;
            synchronized (var5) {
              L1: {
                var6 = (nh) ((Object) this.field_g.a((byte) 82));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var6.field_q != (long)param0) {
                        break L3;
                      } else {
                        if (param1 != var6.field_C) {
                          break L3;
                        } else {
                          if (-3 != (var6.field_L ^ -1)) {
                            break L3;
                          } else {
                            var4.field_F = var6.field_F;
                            var4.field_x = false;
                            stackIn_8_0 = (nh) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (nh) ((Object) this.field_g.c(24));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_F = param1.a(0, param0);
              var4.field_z = true;
              var4.field_x = false;
              if (param2 > 69) {
                break L4;
              } else {
                vo.a(76);
                break L4;
              }
            }
            stackIn_17_0 = (nh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("vo.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_f = null;
        field_h = null;
        field_e = null;
    }

    vo(hd param0) {
        wo var2 = null;
        this.field_g = new ui();
        this.field_b = 0;
        this.field_a = false;
        try {
            var2 = param0.a(5, 0, (Runnable) (this));
            while (0 == var2.field_g) {
                nu.a(10L, 0);
            }
            if ((var2.field_g ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_c = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_e = "Orb coins: ";
        field_f = new String[]{"turn <%0> of <%1>", "<%0> of <%1> portals captured", "<%0> of <%1> towers captured", "<%0> of <%1> villages captured", null, "<%0> of <%1> portals captured by <%2>", "<%0> of <%1> towers captured by <%2>", "<%0> of <%1> villages captured by <%2>", "<%0> / <%1>"};
    }
}
