/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends li {
    static String field_w;
    static String field_r;
    private int[] field_q;
    static String field_v;
    static String field_y;
    private int[] field_n;
    int field_z;
    private int[] field_o;
    static r field_s;
    private boolean[] field_t;
    static String field_x;
    private boolean[][] field_p;
    private int[][] field_u;

    public static void e(int param0) {
        field_v = null;
        if (param0 < 75) {
            return;
        }
        field_x = null;
        field_s = null;
        field_y = null;
        field_r = null;
        field_w = null;
    }

    final static cr f(int param0) {
        int var1 = 87 % ((param0 - -53) / 59);
        return h.field_D.field_Mb;
    }

    final boolean a(boolean[] param0, int[] param1, int param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 1;
            if (param2 == 32) {
              var5 = 0;
              L1: while (true) {
                if (this.field_n.length <= var5) {
                  if (var4_int != 0) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5 = 0;
                    L2: while (true) {
                      if (param1.length <= var5) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        dupTemp$0 = this.field_n[var5];
                        this.field_n[var5] = dupTemp$0 + 1;
                        var6 = dupTemp$0;
                        param1[var5] = br.b(this.field_u[var5][var6], (byte) 48);
                        param0[var5] = this.field_p[var5][var6];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    if (10 > this.field_n[var5]) {
                      var4_int = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("pp.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 76) {
            this.field_z = -29;
            return this.field_o[param1];
        }
        return this.field_o[param1];
    }

    final static cr a(byte param0) {
        if (param0 != 116) {
            return (cr) null;
        }
        return ja.field_f.field_Nb;
    }

    final boolean b(boolean param0, int param1) {
        if (param0) {
            pp.a((byte) 19);
            return this.field_t[param1];
        }
        return this.field_t[param1];
    }

    final int b(int param0, int param1) {
        if (param1 > -58) {
            return -97;
        }
        return this.field_q[param0];
    }

    final static cr a(int param0) {
        if (param0 != 12) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            pp.a((java.applet.Applet) null, 100);
            return hi.b(117);
        }
        return hi.b(117);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        er var8 = new er(param3, param6);
        int[] var9 = bi.field_l;
        int var10 = bi.field_e;
        int var11 = bi.field_j;
        var8.d();
        int var12 = -9 % ((11 - param1) / 38);
        bi.a(0, 0, param3, param6, 12, param0, param7);
        bi.a(var9, var10, var11);
        var8.f(param4, param2);
        var8.d(param4, param2, param5);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                if (!tb.field_b) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (je.a(param0, false, "getcookies"));
                      var4 = jr.a((byte) -9, ';', var3);
                      var5 = param1;
                      L2: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L3;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_10_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (null == param0.getParameter("tuhstatbut")) {
                        stackIn_17_0 = 0;
                        break L5;
                      } else {
                        stackIn_17_0 = 1;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref2);

                stackIn_20_1 = new StringBuilder().append("pp.K(");

                if (param0 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, mi param2) {
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            param2.p(0);
            if (param0 == -8) {
              var4_int = 0;
              L1: while (true) {
                if (this.field_u.length <= var4_int) {
                  L2: {
                    this.field_z = param2.c((byte) -122, 32);
                    if (0 <= param1) {
                      L3: {
                        if (param2.c((byte) -101, 1) == 1) {
                          this.field_t[param1] = true;
                          this.field_q[param1] = param2.c((byte) -108, 8);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_o[param1] = param2.c((byte) -110, 4);
                      param2.b((byte) -90);
                      break L2;
                    } else {
                      param2.b((byte) -90);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (-11 >= (var5 ^ -1)) {
                      var4_int++;
                      continue L1;
                    } else {
                      L5: {
                        stackIn_9_0 = this.field_p[var4_int];

                        stackIn_9_1 = var5;

                        if (1 != param2.c((byte) -120, 1)) {
                          stackIn_10_0 = (boolean[]) ((Object) stackIn_9_0);
                          stackIn_10_1 = stackIn_9_1;
                          stackIn_10_2 = 0;
                          break L5;
                        } else {
                          stackIn_10_0 = (boolean[]) ((Object) stackIn_9_0);
                          stackIn_10_1 = stackIn_9_1;
                          stackIn_10_2 = 1;
                          break L5;
                        }
                      }
                      L6: {
                        stackIn_10_0[stackIn_10_1] = stackIn_10_2 != 0;
                        if (this.field_p[var4_int][var5]) {
                          break L6;
                        } else {
                          this.field_u[var4_int][var5] = param2.c((byte) -104, 6);
                          break L6;
                        }
                      }
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("pp.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        int var4;
        L0: {
          if (up.field_z == null) {
            break L0;
          } else {
            var3 = up.field_z.b(13721, param1);
            if (1 == (var3 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (-1 == var3) {
                  break L1;
                } else {
                  var4 = up.field_z.k(22719) ? 1 : 0;
                  qg.a(param2, var3, 0, var4 != 0, up.field_z.l(4), up.field_z.field_Kb);
                  break L1;
                }
              }
              up.field_z = null;
              ql.i(30);
              break L0;
            }
          }
        }
        if (param0 > -46) {
          pp.f(63);
          return;
        } else {
          return;
        }
    }

    pp(int param0) {
        this.field_n = new int[param0];
        this.field_u = new int[param0][10];
        this.field_q = new int[param0];
        this.field_t = new boolean[param0];
        this.field_o = new int[param0];
        this.field_p = new boolean[param0][10];
    }

    static {
        field_r = "Don't mind";
        field_w = "Move left:<br>Move right:<br>Move back:<br>Move forward:<br>Jump:<br><br>Lay dynamite:<br>Use jetpack:<br><br>Pause/Options:<br>Rotate camera left:<br>Rotate camera right:<br>Raise camera up:<br>Time attack quick restart:";
        field_v = "Invite <%0> to this game";
        field_x = "Scamming";
        field_y = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
