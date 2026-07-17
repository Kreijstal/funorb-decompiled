/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tj extends mo {
    int field_j;
    int field_i;
    int field_q;
    boolean field_y;
    int field_o;
    int field_h;
    int field_v;
    int field_A;
    static ff field_z;
    int field_l;
    int field_t;
    static boolean field_u;
    static kg[] field_f;
    boolean field_x;
    boolean field_k;
    static String field_g;
    static String[][] field_w;
    int field_r;
    int field_s;
    int field_n;
    int field_m;
    int field_p;

    public static void f(int param0) {
        field_w = null;
        field_f = null;
        field_g = null;
        field_z = null;
    }

    final int d(int param0) {
        int var3 = 18 / ((81 - param0) / 37);
        int var2 = 0;
        var2 = fj.a(-40, var2 ^ ((tj) this).field_t);
        var2 = fj.a(-40, ((tj) this).field_p ^ var2);
        var2 = fj.a(-40, ((tj) this).field_v ^ var2);
        var2 = fj.a(-40, ((tj) this).field_q ^ var2);
        var2 = fj.a(-40, var2 ^ ((tj) this).field_h);
        var2 = fj.a(-40, var2 ^ ((tj) this).field_n);
        var2 = fj.a(-40, ((tj) this).field_m ^ var2);
        var2 = fj.a(-40, ((tj) this).field_s ^ var2);
        var2 = fj.a(-40, var2 ^ ((tj) this).field_r);
        var2 = fj.a(-40, ((tj) this).field_A ^ var2);
        var2 = fj.a(-40, ((tj) this).field_l ^ var2);
        return var2;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 != 26) {
          return;
        } else {
          ((tj) this).field_t = param0;
          ((tj) this).field_n = 0;
          ((tj) this).field_p = param3;
          ((tj) this).field_v = param1;
          ((tj) this).field_q = 0;
          ((tj) this).field_h = 0;
          return;
        }
    }

    public final String toString() {
        StringBuilder var2 = new StringBuilder("AgentBall p=[");
        eh.a(((tj) this).field_t, 100, var2);
        StringBuilder discarded$0 = var2.append(",");
        eh.a(((tj) this).field_p, 100, var2);
        StringBuilder discarded$1 = var2.append(",");
        eh.a(((tj) this).field_v, 100, var2);
        StringBuilder discarded$2 = var2.append("]\tv=[");
        eh.a(((tj) this).field_q, 100, var2);
        StringBuilder discarded$3 = var2.append(",");
        eh.a(((tj) this).field_h, 100, var2);
        StringBuilder discarded$4 = var2.append(",");
        eh.a(((tj) this).field_n, 100, var2);
        StringBuilder discarded$5 = var2.append("]\tposessor=" + ((tj) this).field_m + "/" + ((tj) this).field_s);
        StringBuilder discarded$6 = var2.append("\tuncatchable=" + ((tj) this).field_r);
        StringBuilder discarded$7 = var2.append("\thigh_friction=" + ((tj) this).field_A);
        StringBuilder discarded$8 = var2.append("\tmodel_id=" + ((tj) this).field_l);
        return var2.toString();
    }

    final static void a(String param0, java.applet.Applet param1, byte param2, long param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param1.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param2 == -5) {
                      break L1;
                    } else {
                      field_u = false;
                      break L1;
                    }
                  }
                  L2: {
                    if (param3 < 0L) {
                      var7 = var9 + "; Discard;";
                      break L2;
                    } else {
                      var7 = var9 + "; Expires=" + rj.a(nj.a(-121) + 1000L * param3, -102) + "; Max-Age=" + param3;
                      break L2;
                    }
                  }
                  mm.a("document.cookie=\"" + var7 + "\"", param1, (byte) 24);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var6_ref;
                stackOut_9_1 = new StringBuilder().append("tj.I(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              L5: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int b(boolean param0) {
        if (!param0) {
            return 99;
        }
        return ((tj) this).field_v >> 16;
    }

    final int a(boolean param0) {
        if (!param0) {
            ((tj) this).field_p = 99;
            return ((tj) this).field_t >> 16;
        }
        return ((tj) this).field_t >> 16;
    }

    final int e(int param0) {
        int var2 = ((tj) this).field_q >> 8;
        int var3 = ((tj) this).field_h >> 8;
        int var4 = -84 / ((-60 - param0) / 39);
        return var3 * var3 + var2 * var2;
    }

    final int c(int param0) {
        if (param0 != 879306160) {
            return 87;
        }
        return ((tj) this).field_p >> 16;
    }

    final void c(ml param0, int param1) {
        RuntimeException var3 = null;
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
              if (!mu.a(param0, (byte) -39)) {
                break L1;
              } else {
                ((tj) this).field_m = -1 + param0.l(2, param1 ^ 42);
                ((tj) this).field_s = param0.l(3, 59);
                break L1;
              }
            }
            if (param1 == 17) {
              L2: {
                if (mu.a(param0, (byte) -39)) {
                  ((tj) this).field_t = ((tj) this).field_t + ew.a((byte) 125, 17, param0, 0, 22, 30);
                  ((tj) this).field_p = ((tj) this).field_p + ew.a((byte) 125, 17, param0, 0, 22, 30);
                  ((tj) this).field_v = ((tj) this).field_v + ew.a((byte) 125, 20, param0, 0, 24, 30);
                  ((tj) this).field_q = ((tj) this).field_q + ew.a((byte) 125, 11, param0, 0, 16, 30);
                  ((tj) this).field_h = ((tj) this).field_h + ew.a((byte) 125, 11, param0, 0, 16, 30);
                  ((tj) this).field_n = ((tj) this).field_n + ew.a((byte) 125, 18, param0, 0, 24, 30);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!mu.a(param0, (byte) -39)) {
                break L0;
              } else {
                ((tj) this).field_r = hq.a(22531, 9, param0, 0);
                ((tj) this).field_A = hq.a(22531, 5, param0, 0);
                ((tj) this).field_l = param0.l(4, 59);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("tj.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final void a(ml param0, byte param1) {
        try {
            ((tj) this).field_m = param0.l(2, 59) + -1;
            ((tj) this).field_s = param0.l(3, 59);
            ((tj) this).field_t = param0.l(32, 59);
            ((tj) this).field_p = param0.l(32, 59);
            ((tj) this).field_v = param0.l(32, 59);
            ((tj) this).field_q = param0.l(32, 59);
            ((tj) this).field_h = param0.l(32, 59);
            ((tj) this).field_n = param0.l(32, 59);
            ((tj) this).field_r = param0.l(10, 59);
            ((tj) this).field_A = param0.l(5, 59);
            if (param1 >= -94) {
                int discarded$0 = this.b(false);
            }
            ((tj) this).field_l = param0.l(4, 59);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "tj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean g(int param0) {
        int var2 = 0;
        var2 = 58 / ((param0 - -51) / 54);
        if (((tj) this).field_r == 0) {
          if (this.b(true) < 30) {
            if (0 <= ((tj) this).field_p) {
              if (((tj) this).field_p > 88080384) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, mo param1) {
        tj var5 = null;
        try {
            var5 = (tj) (Object) param1;
            ((tj) this).field_m = var5.field_m;
            ((tj) this).field_n = var5.field_n;
            ((tj) this).field_s = var5.field_s;
            ((tj) this).field_l = var5.field_l;
            ((tj) this).field_o = var5.field_o;
            ((tj) this).field_v = var5.field_v;
            if (param0 > -52) {
                Object var4 = null;
                ((tj) this).c((ml) null, -54);
            }
            ((tj) this).field_t = var5.field_t;
            ((tj) this).field_q = var5.field_q;
            ((tj) this).field_p = var5.field_p;
            ((tj) this).field_A = var5.field_A;
            ((tj) this).field_r = var5.field_r;
            ((tj) this).field_i = var5.field_i;
            ((tj) this).field_h = var5.field_h;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "tj.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(byte param0, int param1, la[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int[] var17 = null;
        int stackIn_13_0 = 0;
        long stackIn_16_0 = 0L;
        long stackIn_37_0 = 0L;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        long stackOut_15_0 = 0L;
        long stackOut_14_0 = 0L;
        long stackOut_36_0 = 0L;
        long stackOut_35_0 = 0L;
        long stackOut_34_0 = 0L;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              ((tj) this).field_x = false;
              if (((tj) this).field_r > 0) {
                ((tj) this).field_r = ((tj) this).field_r - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((tj) this).field_y = false;
              ((tj) this).field_k = false;
              if (((tj) this).field_A > 0) {
                ((tj) this).field_A = ((tj) this).field_A - 1;
                break L2;
              } else {
                break L2;
              }
            }
            var4_int = 90 / ((-3 - param0) / 59);
            ((tj) this).field_j = -1;
            if (((tj) this).field_m == -1) {
              L3: {
                L4: {
                  if (((tj) this).field_p < -65536) {
                    break L4;
                  } else {
                    if (((tj) this).field_p <= 88145920) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
              L5: {
                var5 = stackIn_13_0;
                if (var5 != 0) {
                  stackOut_15_0 = 2000L;
                  stackIn_16_0 = stackOut_15_0;
                  break L5;
                } else {
                  stackOut_14_0 = 58982L;
                  stackIn_16_0 = stackOut_14_0;
                  break L5;
                }
              }
              L6: {
                var6 = stackIn_16_0;
                var8 = jk.field_m[param1];
                var17 = lt.a(((tj) this).field_q, ((tj) this).field_h, param2, -66, ((tj) this).field_v, ((tj) this).field_p, ((tj) this).field_t, ((tj) this).field_n);
                ((tj) this).field_v = var17[2];
                ((tj) this).field_t = var17[0];
                ((tj) this).field_p = var17[1];
                if (~((tj) this).field_q == ~var17[3]) {
                  break L6;
                } else {
                  ((tj) this).field_q = jw.a(var6, var17[3], (byte) 115);
                  ((tj) this).field_y = true;
                  break L6;
                }
              }
              L7: {
                if (((tj) this).field_h == var17[4]) {
                  break L7;
                } else {
                  ((tj) this).field_h = jw.a(var6, var17[4], (byte) 119);
                  ((tj) this).field_y = true;
                  break L7;
                }
              }
              L8: {
                if (~var17[5] != ~((tj) this).field_n) {
                  L9: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var17[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L8;
                } else {
                  break L8;
                }
              }
              L10: {
                if (((tj) this).field_q != 0) {
                  break L10;
                } else {
                  if (((tj) this).field_h != 0) {
                    break L10;
                  } else {
                    if (((tj) this).field_n != 0) {
                      break L10;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L10;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L11: {
                if (((tj) this).field_A > 10) {
                  stackOut_36_0 = 60293L;
                  stackIn_37_0 = stackOut_36_0;
                  break L11;
                } else {
                  if (((tj) this).field_v >= 65536) {
                    stackOut_35_0 = sg.field_d[param1];
                    stackIn_37_0 = stackOut_35_0;
                    break L11;
                  } else {
                    stackOut_34_0 = en.field_q[param1];
                    stackIn_37_0 = stackOut_34_0;
                    break L11;
                  }
                }
              }
              L12: {
                var11 = stackIn_37_0;
                ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 16);
                ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> 16);
                if (((tj) this).field_v > 0) {
                  ((tj) this).field_n = ((tj) this).field_n - 16384;
                  break L12;
                } else {
                  break L12;
                }
              }
              var13 = ((tj) this).e(-128);
              if (4096 <= var13) {
                break L0;
              } else {
                ((tj) this).field_h = 0;
                ((tj) this).field_q = 0;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("tj.JA(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L13;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
    }

    public tj() {
        ((tj) this).field_j = -1;
        ((tj) this).field_o = -1;
        ((tj) this).field_s = 0;
        ((tj) this).field_i = -1;
        ((tj) this).field_m = -1;
        ((tj) this).field_A = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new ff(14, 0, 4, 1);
        field_u = false;
        field_g = "Move";
        field_w = new String[][]{new String[4], new String[2]};
    }
}
