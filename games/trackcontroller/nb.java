/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends wh {
    private ha[][] field_n;
    private id field_r;
    private int[] field_t;
    private int[] field_E;
    static String field_A;
    private int field_w;
    private int[] field_J;
    private int[] field_S;
    private int[] field_Q;
    int[] field_M;
    private int field_m;
    static String field_q;
    private int[] field_N;
    int[] field_I;
    private fa field_P;
    private int[] field_y;
    static ff field_v;
    private int[] field_T;
    private int[] field_K;
    private int[] field_x;
    int[] field_R;
    private ha[][] field_L;
    private int[] field_F;
    private int[] field_O;
    private int[] field_U;
    static int[] field_s;
    private long field_C;
    private ol field_G;
    private int field_p;
    private long field_H;
    private boolean field_z;
    private int field_D;
    private boolean field_B;
    private wb field_o;
    private int field_u;

    private final void a(int param0, int param1, int param2) {
        ((nb) this).field_Q[param1] = param2;
    }

    final synchronized int c() {
        return 0;
    }

    final synchronized void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (param2 >= 0) {
            ((nb) this).field_t[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((nb) this).field_t[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param1 <= -88) {
            break L2;
          } else {
            field_s = null;
            break L2;
          }
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = TrackController.field_F ? 1 : 0;
        mh var4 = (mh) (Object) ((nb) this).field_r.b(-48);
        while (var4 != null) {
            var4.f(21645);
            var4 = (mh) (Object) ((nb) this).field_r.a((byte) 91);
        }
        if (!param0) {
            ((nb) this).field_C = -59L;
        }
    }

    private final void e() {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          var2 = ((nb) this).field_D;
          var3 = ((nb) this).field_p;
          var4 = ((nb) this).field_H;
          if (((nb) this).field_o == null) {
            break L0;
          } else {
            if (var3 != ((nb) this).field_u) {
              break L0;
            } else {
              this.a(((nb) this).field_o, 0, ((nb) this).field_B, ((nb) this).field_z);
              int discarded$2 = -17313;
              this.e();
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((nb) this).field_p) {
            L2: {
              ((nb) this).field_H = var4;
              ((nb) this).field_p = var3;
              ((nb) this).field_D = var2;
              if (null == ((nb) this).field_o) {
                break L2;
              } else {
                if (var3 <= ((nb) this).field_u) {
                  break L2;
                } else {
                  ((nb) this).field_D = -1;
                  ((nb) this).field_p = ((nb) this).field_u;
                  ((nb) this).field_H = ((nb) this).field_P.f(((nb) this).field_p);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (var3 != ((nb) this).field_P.field_b[var2]) {
                  break L4;
                } else {
                  ((nb) this).field_P.d(var2);
                  var6 = ((nb) this).field_P.a(var2);
                  if (var6 == 1) {
                    ((nb) this).field_P.f();
                    ((nb) this).field_P.e(var2);
                    if (!((nb) this).field_P.e()) {
                      break L4;
                    } else {
                      if (((nb) this).field_o == null) {
                        L5: {
                          if (!((nb) this).field_z) {
                            break L5;
                          } else {
                            if (var3 == 0) {
                              break L5;
                            } else {
                              ((nb) this).field_P.a(var4);
                              break L4;
                            }
                          }
                        }
                        this.a((byte) 70, true);
                        ((nb) this).field_P.b();
                        return;
                      } else {
                        ((nb) this).a(((nb) this).field_o, 14526, ((nb) this).field_z);
                        int discarded$3 = -17313;
                        this.e();
                        return;
                      }
                    }
                  } else {
                    L6: {
                      if ((var6 & 128) == 0) {
                        break L6;
                      } else {
                        this.e(var6, 88);
                        break L6;
                      }
                    }
                    ((nb) this).field_P.c(var2);
                    ((nb) this).field_P.e(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((nb) this).field_P.g();
              var3 = ((nb) this).field_P.field_b[var2];
              var4 = ((nb) this).field_P.f(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized boolean c(byte param0) {
        if (param0 >= -57) {
            wh discarded$0 = ((nb) this).a();
        }
        return ((nb) this).field_P.a();
    }

    final synchronized void a(int param0, int param1) {
        ((nb) this).field_m = param1;
        if (param0 != 0) {
            ((nb) this).field_E = null;
        }
    }

    private final synchronized void a(wb param0, int param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        try {
            this.a(param2, (byte) -110);
            ((nb) this).field_P.a(param0.field_j);
            ((nb) this).field_C = 0L;
            ((nb) this).field_z = param3 ? true : false;
            var5_int = ((nb) this).field_P.d();
            for (var6 = 0; var5_int > var6; var6++) {
                ((nb) this).field_P.d(var6);
                ((nb) this).field_P.c(var6);
                ((nb) this).field_P.e(var6);
            }
            ((nb) this).field_D = ((nb) this).field_P.g();
            ((nb) this).field_p = ((nb) this).field_P.field_b[((nb) this).field_D];
            ((nb) this).field_H = ((nb) this).field_P.f(((nb) this).field_p);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "nb.QA(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, ha param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -22) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            if (param1.field_l == null) {
              if (param1.field_v >= 0) {
                L2: {
                  param1.a(-35);
                  if (param1.field_F <= 0) {
                    break L2;
                  } else {
                    if (((nb) this).field_n[param1.field_D][param1.field_F] != param1) {
                      break L2;
                    } else {
                      ((nb) this).field_n[param1.field_D][param1.field_F] = null;
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("nb.JA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void d(byte param0) {
        int var1 = 0;
        field_v = null;
        field_s = null;
        field_q = null;
        field_A = null;
    }

    private final void c(int param0, int param1, int param2) {
    }

    private final void c(int param0, int param1) {
        ha var3 = null;
        int var4 = TrackController.field_F ? 1 : 0;
        if ((4 & ((nb) this).field_I[param0]) != 0) {
            var3 = (ha) (Object) ((nb) this).field_G.field_q.b(2);
            while (var3 != null) {
                if (!(var3.field_D != param0)) {
                    var3.field_C = 0;
                }
                var3 = (ha) (Object) ((nb) this).field_G.field_q.a(10);
            }
        }
    }

    private final int a(ha param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        uh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_A + (param0.field_y * param0.field_p >> 12);
              var3_int = var3_int + (((nb) this).field_S[param0.field_D] * (((nb) this).field_Q[param0.field_D] - 8192) >> 12);
              var5 = -73 / ((36 - param1) / 37);
              var4 = param0.field_k;
              if (var4.field_a <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_h > 0) {
                    break L2;
                  } else {
                    if (((nb) this).field_T[param0.field_D] <= 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = var4.field_h << 2;
                  var7 = var4.field_l << 1;
                  if (var7 > param0.field_t) {
                    var6 = var6 * param0.field_t / var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6 = var6 + (((nb) this).field_T[param0.field_D] >> 7);
                var8 = Math.sin((double)(param0.field_r & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var8 * (double)var6);
                break L1;
              }
            }
            L4: {
              var6 = (int)(0.5 + (double)(256 * param0.field_n.field_l) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)oa.field_h);
              if (1 <= var6) {
                stackOut_10_0 = var6;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("nb.KA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param0 < 13) {
            ((nb) this).field_Q = null;
        }
        if (((nb) this).field_N[param1] != param2) {
            ((nb) this).field_N[param1] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                ((nb) this).field_n[param1][var4] = null;
            }
        }
    }

    private final void b(int param0, int param1, int param2) {
        ((nb) this).field_U[param0] = param1;
        ((nb) this).field_M[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
    }

    final synchronized void d(int param0, int param1) {
        if (param0 != 16384) {
            return;
        }
        ((nb) this).field_w = param1;
    }

    private final synchronized void a(boolean param0, byte param1) {
        ((nb) this).field_P.b();
        ((nb) this).field_o = null;
        this.a((byte) 70, param0);
    }

    final synchronized void f(int param0) {
        this.a(true, (byte) -110);
        if (param0 != 11795) {
            this.d(-63, -101, -103);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ha var6 = null;
        int var7 = TrackController.field_F ? 1 : 0;
        ha var8 = ((nb) this).field_L[param3][param0];
        if (!(var8 != null)) {
            return;
        }
        ((nb) this).field_L[param3][param0] = null;
        if ((((nb) this).field_I[param3] & 2) == 0) {
            var8.field_v = 0;
        } else {
            var6 = (ha) (Object) ((nb) this).field_G.field_q.b(2);
            while (var6 != null) {
                if (var8.field_D == var6.field_D) {
                    if (var6.field_v < 0) {
                        if (var8 != var6) {
                            var8.field_v = 0;
                            break;
                        }
                    }
                }
                var6 = (ha) (Object) ((nb) this).field_G.field_q.a(10);
            }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((nb) this).field_P.a()) {
                  var4_int = ((nb) this).field_m * ((nb) this).field_P.field_e / oa.field_h;
                  L3: while (true) {
                    var5 = ((nb) this).field_C - -((long)param2 * (long)var4_int);
                    if (-var5 + ((nb) this).field_H >= 0L) {
                      ((nb) this).field_C = var5;
                      break L2;
                    } else {
                      var7 = (int)((-1L + ((long)var4_int + (-((nb) this).field_C + ((nb) this).field_H))) / (long)var4_int);
                      ((nb) this).field_C = ((nb) this).field_C + (long)var4_int * (long)var7;
                      ((nb) this).field_G.a(param0, param1, var7);
                      int discarded$1 = -17313;
                      this.e();
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      if (((nb) this).field_P.a()) {
                        continue L3;
                      } else {
                        ((nb) this).field_G.a(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((nb) this).field_G.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("nb.HA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (!((nb) this).field_P.a()) {
            break L0;
          } else {
            var2 = ((nb) this).field_m * ((nb) this).field_P.field_e / oa.field_h;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + ((nb) this).field_C;
              if (-var3 + ((nb) this).field_H < 0L) {
                var5 = (int)(((long)var2 + (-((nb) this).field_C + (((nb) this).field_H - 1L))) / (long)var2);
                ((nb) this).field_C = ((nb) this).field_C + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((nb) this).field_G.d(var5);
                int discarded$41 = -17313;
                this.e();
                if (!((nb) this).field_P.a()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((nb) this).field_C = var3;
                break L0;
              }
            }
          }
        }
        ((nb) this).field_G.d(param0);
    }

    final synchronized void a(wb param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param0, 0, true, param2);
              if (param1 == 14526) {
                break L1;
              } else {
                wh discarded$2 = ((nb) this).a();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nb.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = param0 & 15;
          var5 = (32643 & param0) >> 8;
          var6 = (param0 & 8328631) >> 16;
          this.a(var5, -27205, var6, var4);
          return;
        } else {
          if (144 == var3) {
            var4 = param0 & 15;
            var5 = param0 >> 8 & 127;
            var6 = (8378272 & param0) >> 16;
            if (0 < var6) {
              this.a((byte) -43, var6, var5, var4);
              return;
            } else {
              this.a(var5, -27205, 64, var4);
              return;
            }
          } else {
            if (160 == var3) {
              var4 = param0 & 15;
              var5 = param0 >> 8 & 127;
              var6 = param0 >> 16 & 127;
              this.a(var6, var4, (byte) -128, var5);
              return;
            } else {
              if (var3 != 176) {
                if (var3 != 192) {
                  if (var3 != 208) {
                    if (224 == var3) {
                      var4 = 15 & param0;
                      var5 = ((32550 & param0) >> 8) + (param0 >> 9 & 16256);
                      this.a(-1, var4, var5);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 != 255) {
                        return;
                      } else {
                        this.a((byte) 70, true);
                        return;
                      }
                    }
                  } else {
                    var4 = 15 & param0;
                    var5 = (param0 & 32520) >> 8;
                    this.c(var4, -107, var5);
                    return;
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = param0 >> 8 & 127;
                  this.a((byte) 127, var4, ((nb) this).field_O[var4] + var5);
                  return;
                }
              } else {
                L0: {
                  var4 = 15 & param0;
                  var5 = (32723 & param0) >> 8;
                  var6 = (8336064 & param0) >> 16;
                  if (var5 == 0) {
                    ((nb) this).field_O[var4] = tc.a(-2080769, ((nb) this).field_O[var4]) + (var6 << 14);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (var5 == 32) {
                    ((nb) this).field_O[var4] = (var6 << 7) + tc.a(((nb) this).field_O[var4], -16257);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5 == 1) {
                    ((nb) this).field_T[var4] = (var6 << 7) + tc.a(-16257, ((nb) this).field_T[var4]);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (33 == var5) {
                    ((nb) this).field_T[var4] = tc.a(-128, ((nb) this).field_T[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 != 5) {
                    break L4;
                  } else {
                    ((nb) this).field_F[var4] = (var6 << 7) + tc.a(-16257, ((nb) this).field_F[var4]);
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    ((nb) this).field_F[var4] = tc.a(((nb) this).field_F[var4], -128) + var6;
                    break L5;
                  }
                }
                L6: {
                  if (var5 == 7) {
                    ((nb) this).field_J[var4] = (var6 << 7) + tc.a(((nb) this).field_J[var4], -16257);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (39 == var5) {
                    ((nb) this).field_J[var4] = tc.a(((nb) this).field_J[var4], -128) + var6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 != 10) {
                    break L8;
                  } else {
                    ((nb) this).field_E[var4] = (var6 << 7) + tc.a(-16257, ((nb) this).field_E[var4]);
                    break L8;
                  }
                }
                L9: {
                  if (var5 == 42) {
                    ((nb) this).field_E[var4] = tc.a(-128, ((nb) this).field_E[var4]) + var6;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var5 == 11) {
                    ((nb) this).field_K[var4] = (var6 << 7) + tc.a(-16257, ((nb) this).field_K[var4]);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((nb) this).field_K[var4] = tc.a(((nb) this).field_K[var4], -128) + var6;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 64) {
                    if (var6 < 64) {
                      ((nb) this).field_I[var4] = tc.a(((nb) this).field_I[var4], -2);
                      break L12;
                    } else {
                      ((nb) this).field_I[var4] = ok.a(((nb) this).field_I[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 == 65) {
                    if (var6 < 64) {
                      this.b(-22803, var4);
                      ((nb) this).field_I[var4] = tc.a(((nb) this).field_I[var4], -3);
                      break L13;
                    } else {
                      ((nb) this).field_I[var4] = ok.a(((nb) this).field_I[var4], 2);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var5 != 99) {
                    break L14;
                  } else {
                    ((nb) this).field_x[var4] = tc.a(((nb) this).field_x[var4], 127) + (var6 << 7);
                    break L14;
                  }
                }
                L15: {
                  if (var5 != 98) {
                    break L15;
                  } else {
                    ((nb) this).field_x[var4] = tc.a(((nb) this).field_x[var4], 16256) - -var6;
                    break L15;
                  }
                }
                L16: {
                  if (var5 == 101) {
                    ((nb) this).field_x[var4] = (var6 << 7) + (16384 + tc.a(127, ((nb) this).field_x[var4]));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (100 == var5) {
                    ((nb) this).field_x[var4] = var6 + 16384 + tc.a(((nb) this).field_x[var4], 16256);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var5 != 120) {
                    break L18;
                  } else {
                    this.a(var4, true);
                    break L18;
                  }
                }
                L19: {
                  if (var5 == 121) {
                    this.a(var4, (byte) 127);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 123) {
                    this.f(var4, 110);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 == 6) {
                    var7 = ((nb) this).field_x[var4];
                    if (var7 != 16384) {
                      break L21;
                    } else {
                      ((nb) this).field_S[var4] = (var6 << 7) + tc.a(-16257, ((nb) this).field_S[var4]);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (var5 == 38) {
                    var7 = ((nb) this).field_x[var4];
                    if (16384 != var7) {
                      break L22;
                    } else {
                      ((nb) this).field_S[var4] = tc.a(-128, ((nb) this).field_S[var4]) - -var6;
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (var5 != 16) {
                    break L23;
                  } else {
                    ((nb) this).field_R[var4] = (var6 << 7) + tc.a(((nb) this).field_R[var4], -16257);
                    break L23;
                  }
                }
                L24: {
                  if (var5 != 48) {
                    break L24;
                  } else {
                    ((nb) this).field_R[var4] = var6 + tc.a(((nb) this).field_R[var4], -128);
                    break L24;
                  }
                }
                L25: {
                  if (81 == var5) {
                    if (var6 < 64) {
                      this.c(var4, 0);
                      ((nb) this).field_I[var4] = tc.a(((nb) this).field_I[var4], -5);
                      break L25;
                    } else {
                      ((nb) this).field_I[var4] = ok.a(((nb) this).field_I[var4], 4);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 != 17) {
                    break L26;
                  } else {
                    this.b(var4, (var6 << 7) + (-16257 & ((nb) this).field_U[var4]), -131394585);
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.b(var4, var6 + (-128 & ((nb) this).field_U[var4]), -131394585);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        ha var5_ref_ha = null;
        mh var6 = null;
        int var6_int = 0;
        ik var7 = null;
        ha var8 = null;
        ha var9 = null;
        int var10 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          this.a(param2, -27205, 64, param3);
          if ((2 & ((nb) this).field_I[param3]) == 0) {
            break L0;
          } else {
            var5_ref_ha = (ha) (Object) ((nb) this).field_G.field_q.a((byte) 95);
            L1: while (true) {
              if (var5_ref_ha == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5_ref_ha.field_D) {
                    break L2;
                  } else {
                    if (0 <= var5_ref_ha.field_v) {
                      break L2;
                    } else {
                      ((nb) this).field_L[param3][var5_ref_ha.field_i] = null;
                      ((nb) this).field_L[param3][param2] = var5_ref_ha;
                      var6_int = var5_ref_ha.field_A + (var5_ref_ha.field_p * var5_ref_ha.field_y >> 12);
                      var5_ref_ha.field_A = var5_ref_ha.field_A + (param2 - var5_ref_ha.field_i << 8);
                      var5_ref_ha.field_y = 4096;
                      var5_ref_ha.field_i = param2;
                      var5_ref_ha.field_p = var6_int - var5_ref_ha.field_A;
                      return;
                    }
                  }
                }
                var5_ref_ha = (ha) (Object) ((nb) this).field_G.field_q.d(100);
                continue L1;
              }
            }
          }
        }
        var5 = 0;
        var6 = (mh) (Object) ((nb) this).field_r.a(8434, (long)((nb) this).field_N[param3]);
        if (var6 == null) {
          return;
        } else {
          var7 = var6.field_o[param2];
          if (var7 != null) {
            L3: {
              var8 = new ha();
              var8.field_n = var7;
              var8.field_B = var6;
              var8.field_D = param3;
              var8.field_k = var6.field_p[param2];
              var8.field_F = var6.field_l[param2];
              var8.field_i = param2;
              var8.field_u = 1024 + var6.field_j[param2] * var6.field_m * param1 * param1 >> 11;
              var8.field_s = var6.field_r[param2] & 255;
              var8.field_A = (param2 << 8) - (32767 & var6.field_q[param2]);
              var8.field_j = 0;
              var8.field_G = 0;
              var8.field_v = -1;
              var8.field_o = 0;
              var8.field_q = 0;
              if (0 != ((nb) this).field_R[param3]) {
                L4: {
                  int discarded$2 = 105;
                  var8.field_l = bh.a(var7, this.a(var8, (byte) 117), 0, this.b(var8));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (-1 >= var6.field_q[param2]) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((nb) this).a(stackIn_17_1 != 0, stackIn_17_2 != 0, var8);
                break L3;
              } else {
                int discarded$3 = 105;
                var8.field_l = bh.a(var7, this.a(var8, (byte) 119), this.a(var8, 3), this.b(var8));
                break L3;
              }
            }
            L5: {
              if (-1 <= var6.field_q[param2]) {
                break L5;
              } else {
                var8.field_l.f(-1);
                break L5;
              }
            }
            L6: {
              if (-1 >= var8.field_F) {
                L7: {
                  var9 = ((nb) this).field_n[param3][var8.field_F];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (-1 > var9.field_v) {
                      ((nb) this).field_L[param3][var9.field_i] = null;
                      var9.field_v = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((nb) this).field_n[param3][var8.field_F] = var8;
                break L6;
              } else {
                break L6;
              }
            }
            ((nb) this).field_G.field_q.a((byte) -96, (fc) (Object) var8);
            ((nb) this).field_L[param3][param2] = var8;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int[] param1, int param2, int param3, ha param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        uh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.field_w = oa.field_h / 100;
              if (0 > param4.field_v) {
                break L1;
              } else {
                L2: {
                  if (null == param4.field_l) {
                    break L2;
                  } else {
                    if (param4.field_l.j()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param4.e(-95);
                  param4.a(-35);
                  if (param4.field_F <= 0) {
                    break L3;
                  } else {
                    if (param4 == ((nb) this).field_n[param4.field_D][param4.field_F]) {
                      ((nb) this).field_n[param4.field_D][param4.field_F] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param4.field_y;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)((nb) this).field_F[param4.field_D] * 0.0004921259842519685) * 16.0 + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param4.field_y = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param4.field_l.i(this.a(param4, (byte) 122));
              var7 = param4.field_k;
              param4.field_t = param4.field_t + 1;
              param4.field_r = param4.field_r + var7.field_a;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((param4.field_y * param4.field_p >> 12) + (param4.field_i - 60 << 8));
              if (var7.field_j > 0) {
                L7: {
                  if (var7.field_k > 0) {
                    param4.field_q = param4.field_q + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_k) + 0.5);
                    break L7;
                  } else {
                    param4.field_q = param4.field_q + 128;
                    break L7;
                  }
                }
                if (param4.field_q * var7.field_j <= -819201) {
                  var8 = 1;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var7.field_c == null) {
                break L8;
              } else {
                L9: {
                  if (-1 >= var7.field_f) {
                    param4.field_G = param4.field_G + 128;
                    break L9;
                  } else {
                    param4.field_G = param4.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param4.field_o >= -2 + var7.field_c.length) {
                      break L11;
                    } else {
                      if (param4.field_G <= (65280 & var7.field_c[2 + param4.field_o] << 8)) {
                        break L11;
                      } else {
                        param4.field_o = param4.field_o + 2;
                        continue L10;
                      }
                    }
                  }
                  if (-2 + var7.field_c.length != param4.field_o) {
                    break L8;
                  } else {
                    if (var7.field_c[param4.field_o - -1] == 0) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (param4.field_v < 0) {
                break L12;
              } else {
                if (null == var7.field_i) {
                  break L12;
                } else {
                  if (0 == (((nb) this).field_I[param4.field_D] & 1)) {
                    L13: {
                      if (param4.field_F < 0) {
                        break L13;
                      } else {
                        if (((nb) this).field_n[param4.field_D][param4.field_F] != param4) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (0 >= var7.field_g) {
                        param4.field_v = param4.field_v + 128;
                        break L14;
                      } else {
                        param4.field_v = param4.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param4.field_j >= var7.field_i.length - 2) {
                          break L16;
                        } else {
                          if (param4.field_v <= (65280 & var7.field_i[param4.field_j - -2] << 8)) {
                            break L16;
                          } else {
                            param4.field_j = param4.field_j + 2;
                            continue L15;
                          }
                        }
                      }
                      if (var7.field_i.length + -2 != param4.field_j) {
                        break L12;
                      } else {
                        var8 = 1;
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (var8 == 0) {
              L17: {
                int discarded$1 = 105;
                param4.field_l.a(param4.field_w, this.a(param4, param3 ^ 2), this.b(param4));
                if (param3 == 1) {
                  break L17;
                } else {
                  ((nb) this).a(100, (byte) 77, 77);
                  break L17;
                }
              }
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
              break L0;
            } else {
              L18: {
                param4.field_l.h(param4.field_w);
                if (param1 == null) {
                  param4.field_l.d(param0);
                  break L18;
                } else {
                  param4.field_l.a(param1, param2, param0);
                  break L18;
                }
              }
              L19: {
                if (param4.field_l.i()) {
                  ((nb) this).field_G.field_o.a((wh) (Object) param4.field_l);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                param4.e(param3 + -100);
                if (param4.field_v < 0) {
                  break L20;
                } else {
                  param4.a(param3 ^ -62);
                  if (param4.field_F <= 0) {
                    break L20;
                  } else {
                    if (((nb) this).field_n[param4.field_D][param4.field_F] != param4) {
                      break L20;
                    } else {
                      ((nb) this).field_n[param4.field_D][param4.field_F] = null;
                      break L20;
                    }
                  }
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var6;
            stackOut_67_1 = new StringBuilder().append("nb.L(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
        return stackIn_66_0 != 0;
    }

    final synchronized void a(boolean param0, int param1, int param2) {
        if (param0) {
            ((nb) this).d(22, 10);
        }
        this.d(param1, -3, param2);
    }

    private final void a(int param0, boolean param1) {
        ha var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var3 = (ha) (Object) ((nb) this).field_G.field_q.b(2);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (param0 == var3.field_D) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (null != var3.field_l) {
                  L4: {
                    var3.field_l.h(oa.field_h / 100);
                    if (var3.field_l.i()) {
                      ((nb) this).field_G.field_o.a((wh) (Object) var3.field_l);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.e(83);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_v >= 0) {
                  break L5;
                } else {
                  ((nb) this).field_L[var3.field_D][var3.field_i] = null;
                  break L5;
                }
              }
              var3.a(-36);
              break L1;
            }
            var3 = (ha) (Object) ((nb) this).field_G.field_q.a(10);
            continue L0;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 < 0) {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.a(param0, (byte) 123);
              param0++;
              continue L0;
            }
          }
        } else {
          ((nb) this).field_J[param0] = 12800;
          ((nb) this).field_E[param0] = 8192;
          ((nb) this).field_K[param0] = 16383;
          ((nb) this).field_Q[param0] = 8192;
          ((nb) this).field_T[param0] = 0;
          ((nb) this).field_F[param0] = 8192;
          this.b(-22803, param0);
          this.c(param0, 0);
          ((nb) this).field_I[param0] = 0;
          ((nb) this).field_x[param0] = 32767;
          ((nb) this).field_S[param0] = 256;
          ((nb) this).field_R[param0] = 0;
          if (param1 >= 121) {
            this.b(param0, 8192, -131394585);
            return;
          } else {
            return;
          }
        }
    }

    final synchronized wh a() {
        return null;
    }

    final void a(boolean param0, boolean param1, ha param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((nb) this).field_C = -42L;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param2.field_n.field_j.length;
                if (!param1) {
                  break L3;
                } else {
                  if (!param2.field_n.field_k) {
                    break L3;
                  } else {
                    var6 = -param2.field_n.field_m + var4_int + var4_int;
                    var5 = (int)((long)var6 * (long)((nb) this).field_R[param2.field_D] >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      var5 = -var5 + (var4_int + var4_int) - 1;
                      param2.field_l.b(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((nb) this).field_R[param2.field_D] >> 6);
              break L2;
            }
            param2.field_l.j(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("nb.O(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static qj[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        qj[] var1 = new qj[gi.field_o];
        for (var2 = 0; var2 < gi.field_o; var2++) {
            var3 = j.field_f[var2] * cf.field_p[var2];
            var4 = qk.field_M[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = qe.field_z[tc.a((int) var4[var6], 255)];
            }
            var1[var2] = new qj(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var5);
        }
        ff.b(119);
        return var1;
    }

    private final void a(byte param0, boolean param1) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (!param1) {
            this.f(-1, 110);
        } else {
            this.a(-1, true);
            return;
        }
    }

    final static void a(String param0, boolean param1) {
        try {
            gh.field_k = true;
            pc.field_h = param1 ? true : false;
            kb.field_a = new jj(gl.field_E, p.field_a, param0, vg.field_o, pc.field_h);
            gl.field_E.d((byte) -94, (al) (Object) kb.field_a);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "nb.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + -16257 + ')');
        }
    }

    private final void b(int param0, int param1) {
        ha var3 = null;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if ((2 & ((nb) this).field_I[param1]) != 0) {
            var3 = (ha) (Object) ((nb) this).field_G.field_q.b(2);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_D != param1) {
                    break L2;
                  } else {
                    if (null == ((nb) this).field_L[param1][var3.field_i]) {
                      if (var3.field_v < 0) {
                        var3.field_v = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (ha) (Object) ((nb) this).field_G.field_q.a(10);
                      continue L1;
                    }
                  }
                }
                var3 = (ha) (Object) ((nb) this).field_G.field_q.a(10);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final synchronized wh b() {
        return (wh) (Object) ((nb) this).field_G;
    }

    private final int a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        uh var9 = null;
        uh var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (((nb) this).field_t[param0.field_D] != 0) {
              if (param1 == 3) {
                L1: {
                  var9 = param0.field_k;
                  var10 = var9;
                  var4 = 4096 + ((nb) this).field_K[param0.field_D] * ((nb) this).field_J[param0.field_D] >> 13;
                  var4 = 16384 + var4 * var4 >> 15;
                  var4 = 16384 + param0.field_u * var4 >> 15;
                  var4 = 128 + var4 * ((nb) this).field_w >> 8;
                  var4 = ((nb) this).field_t[param0.field_D] * var4 + 128 >> 8;
                  if (var10.field_j > 0) {
                    var4 = (int)((double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_q * (double)var10.field_j) + 0.5);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var10.field_c == null) {
                    break L2;
                  } else {
                    L3: {
                      var5 = param0.field_G;
                      var6 = var10.field_c[param0.field_o - -1];
                      if (var10.field_c.length + -2 > param0.field_o) {
                        var7 = (255 & var9.field_c[param0.field_o]) << 8;
                        var8 = 65280 & var10.field_c[2 + param0.field_o] << 8;
                        var6 = var6 + (-var6 + var10.field_c[3 + param0.field_o]) * (var5 - var7) / (-var7 + var8);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 6;
                    break L2;
                  }
                }
                L4: {
                  if (param0.field_v <= 0) {
                    break L4;
                  } else {
                    if (var10.field_i != null) {
                      L5: {
                        var5 = param0.field_v;
                        var6 = var10.field_i[param0.field_j + 1];
                        if (param0.field_j >= -2 + var10.field_i.length) {
                          break L5;
                        } else {
                          var7 = (255 & var9.field_i[param0.field_j]) << 8;
                          var8 = (var10.field_i[2 + param0.field_j] & 255) << 8;
                          var6 = var6 + (var10.field_i[3 + param0.field_j] - var6) * (-var7 + var5) / (-var7 + var8);
                          break L5;
                        }
                      }
                      var4 = var6 * var4 - -32 >> 6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_20_0 = var4;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                stackOut_4_0 = 41;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("nb.U(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    private final void d(int param0, int param1, int param2) {
        ((nb) this).field_y[param2] = param0;
        ((nb) this).field_O[param2] = tc.a(param0, -128);
        this.a((byte) 83, param2, param0);
        if (param1 != -3) {
            ((nb) this).field_O = null;
        }
    }

    private final int b(ha param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = ((nb) this).field_E[param0.field_D];
            if (var3_int >= 8192) {
              stackOut_5_0 = -((128 + -param0.field_s) * (16384 + -var3_int) + 32 >> 6) + 16384;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 32 + param0.field_s * var3_int >> 6;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("nb.AA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + 105 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized boolean a(kk param0, byte param1, int param2, jc param3, wb param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        wl var8 = null;
        int var9 = 0;
        int var11 = 0;
        mh var12 = null;
        mh var13 = null;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.a();
              if (param1 == -27) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (param2 > 0) {
                var7 = (Object) (Object) new int[]{param2};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (wl) (Object) param4.field_i.b(-35);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param4.b();
                    break L4;
                  }
                }
                stackOut_19_0 = var6_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = (int)var8.field_b;
                    var12 = (mh) (Object) ((nb) this).field_r.a(8434, (long)var9);
                    if (var12 == null) {
                      var13 = kf.a(-97, param0, var9);
                      if (var13 != null) {
                        ((nb) this).field_r.a(false, (long)var9, (fc) (Object) var13);
                        if (!var13.a(var8.field_k, (int[]) var7, (byte) -61, param3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    } else {
                      if (!var12.a(var8.field_k, (int[]) var7, (byte) -61, param3)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6_int = 0;
                  break L5;
                }
                var8 = (wl) (Object) param4.field_i.a((byte) 91);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("nb.MA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void f(int param0, int param1) {
        ha var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var3 = (ha) (Object) ((nb) this).field_G.field_q.b(2);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (var3.field_D != param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_v < 0) {
                ((nb) this).field_L[var3.field_D][var3.field_i] = null;
                var3.field_v = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (ha) (Object) ((nb) this).field_G.field_q.a(10);
            continue L0;
          }
        }
    }

    public nb() {
        ((nb) this).field_t = new int[16];
        ((nb) this).field_n = new ha[16][128];
        ((nb) this).field_S = new int[16];
        ((nb) this).field_y = new int[16];
        ((nb) this).field_E = new int[16];
        ((nb) this).field_w = 256;
        ((nb) this).field_Q = new int[16];
        ((nb) this).field_L = new ha[16][128];
        ((nb) this).field_M = new int[16];
        ((nb) this).field_R = new int[16];
        ((nb) this).field_I = new int[16];
        ((nb) this).field_T = new int[16];
        ((nb) this).field_K = new int[16];
        ((nb) this).field_J = new int[16];
        ((nb) this).field_m = 1000000;
        ((nb) this).field_N = new int[16];
        ((nb) this).field_U = new int[16];
        ((nb) this).field_F = new int[16];
        ((nb) this).field_x = new int[16];
        ((nb) this).field_O = new int[16];
        ((nb) this).field_P = new fa();
        ((nb) this).field_G = new ol((nb) this);
        ((nb) this).field_r = new id(128);
        ((nb) this).a(256, (byte) -119, -1);
        this.a((byte) 70, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Username: ";
        field_s = new int[8192];
    }
}
