/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends v {
    private qj field_H;
    private int field_G;
    boolean field_F;
    static int field_I;
    static go[] field_K;
    static ah field_J;

    private final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -21) {
          return 15;
        } else {
          L0: {
            if (((rl) this).field_F) {
              if (this == (Object) (Object) ((rl) this).field_H.i((byte) -75)) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    final static bm a(int[] param0, int param1, bm param2) {
        bm var3 = null;
        RuntimeException var3_ref = null;
        bm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new bm(0, 0, 0);
            var3.field_i = param2.field_i;
            var3.field_k = param2.field_k;
            var3.field_d = param2.field_d;
            var3.field_e = param2.field_e;
            var3.field_c = param2.field_c;
            var3.field_n = param0;
            var3.field_l = param2.field_l;
            var3.field_m = param2.field_m;
            stackOut_0_0 = (bm) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("rl.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(-116).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 != 39) {
          L0: {
            ((rl) this).field_G = -97;
            var2 = this.a((byte) -57);
            var3 = var2 - ((rl) this).field_G;
            if (0 < var3) {
              ((rl) this).field_G = ((rl) this).field_G + (7 + var3) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var3 < 0) {
              ((rl) this).field_G = ((rl) this).field_G + (-16 + var3 + 1) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (0 == ((rl) this).field_G) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (((rl) this).field_F) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              return stackIn_25_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L3: {
            var2 = this.a((byte) -57);
            var3 = var2 - ((rl) this).field_G;
            if (0 < var3) {
              ((rl) this).field_G = ((rl) this).field_G + (7 + var3) / 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var3 < 0) {
              ((rl) this).field_G = ((rl) this).field_G + (-16 + var3 + 1) / 16;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (0 != ((rl) this).field_G) {
                break L6;
              } else {
                if (0 != var2) {
                  break L6;
                } else {
                  if (((rl) this).field_F) {
                    break L6;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L5;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L5;
          }
          return stackIn_12_0 != 0;
        }
    }

    final static hj a(int param0, int param1, hj param2, int param3, hj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hj var7 = null;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = Math.max(param4.field_s, 10 + param2.field_s);
            var6 = Math.max(param4.field_y, param2.field_y);
            var7 = new hj(var5_int, var6);
            int discarded$2 = 32381;
            ok.a();
            var7.f();
            param4.b(0, 0);
            pa.a(0, 10, 107, param2);
            ug.b(-1);
            stackOut_0_0 = (hj) var7;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("rl.Q(").append(-5936).append(44).append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(10).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != ((rl) this).field_G) {
          if (256 <= ((rl) this).field_G) {
            if (param3 != 0) {
              return;
            } else {
              ((rl) this).a(param2 - -((rl) this).field_k, ((rl) this).field_o + param1, (byte) 20);
              super.a(-9532, param1, param2, param3);
              return;
            }
          } else {
            if (jh.field_c != null) {
              if (jh.field_c.field_s >= ((rl) this).field_x) {
                if (((rl) this).field_u <= jh.field_c.field_y) {
                  hf.a(jh.field_c, -1);
                  tc.c();
                  ((rl) this).a(0, 0, (byte) 20);
                  super.a(param0, -param1 - ((rl) this).field_o, -((rl) this).field_k + -param2, param3);
                  int discarded$4 = -10;
                  dm.b();
                  jh.field_c.d(param2 + ((rl) this).field_k, param1 + ((rl) this).field_o, ((rl) this).field_G);
                  return;
                } else {
                  jh.field_c = new hj(((rl) this).field_x, ((rl) this).field_u);
                  hf.a(jh.field_c, -1);
                  tc.c();
                  ((rl) this).a(0, 0, (byte) 20);
                  super.a(param0, -param1 - ((rl) this).field_o, -((rl) this).field_k + -param2, param3);
                  int discarded$5 = -10;
                  dm.b();
                  jh.field_c.d(param2 + ((rl) this).field_k, param1 + ((rl) this).field_o, ((rl) this).field_G);
                  return;
                }
              } else {
                jh.field_c = new hj(((rl) this).field_x, ((rl) this).field_u);
                hf.a(jh.field_c, -1);
                tc.c();
                ((rl) this).a(0, 0, (byte) 20);
                super.a(param0, -param1 - ((rl) this).field_o, -((rl) this).field_k + -param2, param3);
                int discarded$6 = -10;
                dm.b();
                jh.field_c.d(param2 + ((rl) this).field_k, param1 + ((rl) this).field_o, ((rl) this).field_G);
                return;
              }
            } else {
              jh.field_c = new hj(((rl) this).field_x, ((rl) this).field_u);
              hf.a(jh.field_c, -1);
              tc.c();
              ((rl) this).a(0, 0, (byte) 20);
              super.a(param0, -param1 - ((rl) this).field_o, -((rl) this).field_k + -param2, param3);
              int discarded$7 = -10;
              dm.b();
              jh.field_c.d(param2 + ((rl) this).field_k, param1 + ((rl) this).field_o, ((rl) this).field_G);
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1, byte param2);

    rl(qj param0, int param1, int param2) {
        super(-param1 + ho.field_i >> 1, -param2 + pe.field_e >> 1, param1, param2, (dh) null);
        try {
            ((rl) this).field_F = false;
            ((rl) this).field_H = param0;
            ((rl) this).field_G = 0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "rl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        wg.field_a[in.field_h] = param4;
        im.field_h[in.field_h] = in.field_h;
        if (param3 < 82) {
          return;
        } else {
          L0: {
            va.field_j[in.field_h] = param0;
            if (param0 > r.field_c) {
              dn.field_t = param0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 < qf.field_j) {
              we.field_j = param0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            da.field_u[in.field_h] = param5;
            ua.field_c[in.field_h] = param1;
            fj.field_q[in.field_h] = param2;
            var6 = param2 + (param1 + param5);
            if (var6 == 0) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            } else {
              stackOut_8_0 = 1000 * param5 / var6;
              stackIn_10_0 = stackOut_8_0;
              break L2;
            }
          }
          L3: {
            var7 = stackIn_10_0;
            oh.field_s[in.field_h] = var7;
            in.field_h = in.field_h + 1;
            if (we.field_j > var7) {
              we.field_j = var7;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var7 > dn.field_t) {
              dn.field_t = var7;
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public static void i() {
        field_J = null;
        field_K = null;
    }

    final static void h(int param0) {
        ji.a((byte) -126);
        go.a(0, 4);
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 537342017) {
          return;
        } else {
          ((rl) this).a(ho.field_i - param1 >> 1, (byte) 122, pe.field_e + -param2 >> 1, param2, param1);
          return;
        }
    }

    final n f(byte param0) {
        n var2 = null;
        var2 = super.f((byte) 83);
        if (var2 != null) {
          return var2;
        } else {
          if (param0 <= 73) {
            ((rl) this).a(-24, 85, 88, -106);
            return (n) this;
          } else {
            return (n) this;
          }
        }
    }

    boolean a(boolean param0) {
        if (param0) {
          ((rl) this).field_G = this.a((byte) -31);
          if (((rl) this).field_G == 0) {
            if (((rl) this).field_F) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_K = null;
          ((rl) this).field_G = this.a((byte) -31);
          if (((rl) this).field_G == 0) {
            if (((rl) this).field_F) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 65;
    }
}
