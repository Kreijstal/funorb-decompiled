/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends vt {
    private ng field_z;
    private boolean field_p;
    static String field_G;
    static int field_B;
    private boolean field_F;
    private wk[] field_H;
    private boolean field_r;
    static boolean field_s;
    private int field_L;
    private wk[] field_D;
    private int field_K;
    private int field_A;
    private int[] field_q;
    static String[] field_E;
    static String field_J;
    private int field_o;
    private boolean field_x;
    private int field_t;
    private boolean field_y;
    static int field_u;
    static String field_I;
    static je field_v;
    private tu field_C;
    static String field_w;

    private final wk k() {
        int var2 = 0;
        if (((r) this).field_p) {
            var2 = 1;
        }
        if (((r) this).field_r) {
            var2 = 2;
        }
        wk var3 = ((r) this).field_H[var2];
        return var3;
    }

    final boolean g(byte param0) {
        if (param0 != 97) {
            return false;
        }
        return ((r) this).field_z.d(false);
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param1 == 2) {
            break L0;
          } else {
            ((r) this).field_A = 9;
            break L0;
          }
        }
        if (!((r) this).field_z.d(false)) {
          return ((r) this).a(param0, param1 ^ 84, param2);
        } else {
          L1: {
            var4 = 0;
            if (!((r) this).c(param2, 0, param0)) {
              if (((r) this).field_z.b(31127, param0, param2)) {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = 0;
                stackIn_9_0 = stackOut_6_0;
                break L1;
              }
            } else {
              stackOut_4_0 = 1;
              stackIn_9_0 = stackOut_4_0;
              break L1;
            }
          }
          var4 = stackIn_9_0;
          return var4 != 0;
        }
    }

    final void e(int param0, int param1, int param2) {
        ((r) this).field_A = param1;
        int var4 = 79 % ((param0 - 15) / 32);
        ((r) this).field_K = param2;
        ((r) this).field_z.a(param1, 112, param2);
    }

    final int e(boolean param0) {
        if (!param0) {
            field_J = null;
        }
        return ((r) this).field_o;
    }

    final boolean g(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 260) {
          L0: {
            L1: {
              if (((r) this).field_F) {
                break L1;
              } else {
                if (!((r) this).field_z.D(85)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void e(int param0) {
        ((r) this).field_F = false;
        if (param0 != 32) {
            return;
        }
        ((r) this).field_z.e(true);
    }

    final static boolean c(int param0, int param1) {
        return 2 <= param0;
    }

    final void f(byte param0) {
        int discarded$0 = 0;
        this.b();
        int discarded$1 = 4;
        this.f();
        int var2 = -124 % ((75 - param0) / 49);
    }

    final void b(int param0, int param1) {
        if (param0 != 0) {
            ((r) this).field_F = true;
        }
        ((r) this).field_L = param1;
    }

    final boolean a(byte param0) {
        if (param0 <= 72) {
            field_w = null;
        }
        return ((r) this).field_x;
    }

    private final void a(int param0, boolean param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 57;
        ((r) this).field_x = false;
        if (((r) this).field_F) {
            if (!param1) {
            } else {
                if (((r) this).field_z.r(-37)) {
                    ((r) this).field_L = ((r) this).field_z.b(78);
                    ((r) this).field_r = false;
                    ((r) this).field_z.l(0);
                    int discarded$0 = 10009;
                    this.m();
                    ((r) this).field_x = true;
                } else {
                    if (!((r) this).field_p) {
                    } else {
                        ((r) this).field_r = !((r) this).field_r ? true : false;
                        if (((r) this).field_r) {
                            ((r) this).field_z.c(56);
                        } else {
                            ((r) this).field_z.l(0);
                        }
                        if (!((r) this).field_r) {
                            ((r) this).field_z.a(0, (byte) 39);
                        }
                        ((r) this).field_x = true;
                    }
                }
            }
        }
        if (!((r) this).field_F) {
            if (((r) this).field_z.d(false)) {
                if (!(!param1)) {
                    ((r) this).field_z.l(0);
                    ((r) this).field_x = true;
                    ((r) this).field_r = false;
                }
            }
            return;
        }
    }

    private final void f() {
        if (!((r) this).field_r) {
            return;
        }
        ((r) this).field_z.e(6815);
    }

    private final void h(byte param0) {
        ((r) this).field_y = true;
        this.i(0);
        this.d(false);
        if (param0 != -120) {
            ((r) this).field_K = 118;
            return;
        }
    }

    final boolean c(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.h((byte) -118);
        }
        return ((r) this).field_z.a(param0, (byte) 113, param2) >= 0 ? true : false;
    }

    final void a(String[] param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param1 == -29799) {
              ((r) this).field_z.a((byte) 126, param0);
              this.i(0);
              this.d(false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("r.V(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    private final void e() {
        int var2 = ((r) this).field_D[3].field_A;
        int var3 = ((r) this).field_C.a(' ');
        int var4 = ((r) this).field_A - (-var2 - var3);
        int var5 = ((r) this).field_D[1].field_x;
        int var6 = 2;
        int var7 = ((r) this).field_C.field_H;
        int var8 = var5 + (((r) this).field_K - (-var6 + -var7));
        int var9 = ((r) this).field_q[0];
        if (!(!((r) this).field_r)) {
            var9 = ((r) this).field_q[2];
        }
        if (((r) this).field_p) {
            var9 = ((r) this).field_q[1];
        }
        String var10 = ((r) this).field_z.a((byte) -96, ((r) this).field_L);
        ((r) this).field_C.b(var10, var4, var8, var9, -1);
    }

    final int h(int param0) {
        if (param0 != 5) {
            field_v = null;
        }
        return ((r) this).field_L;
    }

    final static void c(boolean param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) va.field_w;
            synchronized (var1) {
              L1: {
                L2: {
                  be.field_E = rd.field_d;
                  fc.field_b = fc.field_b + 1;
                  if (us.field_c >= 0) {
                    L3: while (true) {
                      if (cc.field_a == us.field_c) {
                        break L2;
                      } else {
                        var2 = ee.field_x[cc.field_a];
                        cc.field_a = 127 & 1 + cc.field_a;
                        if (0 > var2) {
                          br.field_f[~var2] = false;
                          continue L3;
                        } else {
                          br.field_f[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        us.field_c = cc.field_a;
                        break L2;
                      } else {
                        br.field_f[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                rd.field_d = cr.field_Z;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "r.G(" + 1 + 41);
        }
    }

    public static void d() {
        field_E = null;
        field_J = null;
        field_I = null;
        field_w = null;
        field_G = null;
        field_v = null;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -56 % ((17 - param1) / 60);
        return mo.a(param2, ((r) this).field_A, ((r) this).field_K, param0, ((r) this).field_t, (byte) -99, ((r) this).field_o);
    }

    final void j(int param0) {
        if (param0 != 0) {
            return;
        }
        ((r) this).field_F = true;
        ((r) this).field_z.g(83);
    }

    final int n(int param0) {
        if (param0 != -18332) {
            ((r) this).field_A = -93;
        }
        return ((r) this).field_t;
    }

    private final void d(boolean param0) {
        int discarded$0 = 10009;
        this.m();
    }

    private final void c() {
        int discarded$0 = 3;
        wk var2 = this.k();
        int var3 = ((r) this).field_D[5].field_A;
        int var4 = var2.field_A;
        int var5 = -var3 + ((r) this).field_A - (-((r) this).field_t - -var4);
        int var6 = ((r) this).field_D[1].field_x;
        int var7 = var6 + ((r) this).field_K;
        var2.g(var5, var7);
    }

    private final void d(int param0, int param1) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ((r) this).field_p = false;
        if (!((r) this).field_F) {
          return;
        } else {
          L0: {
            L1: {
              stackOut_3_0 = this;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!((r) this).a(param1, -86, param0)) {
                break L1;
              } else {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((r) this).g((byte) 97)) {
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L0;
                }
              }
            }
            stackOut_6_0 = this;
            stackOut_6_1 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L0;
          }
          ((r) this).field_p = stackIn_7_1 != 0;
          return;
        }
    }

    private final void b() {
        qn.f(((r) this).field_A, ((r) this).field_K, ((r) this).field_t, ((r) this).field_o, 7829367);
        i.a(((r) this).field_D, ((r) this).field_o, ((r) this).field_A, (byte) -47, ((r) this).field_K, ((r) this).field_t);
        int discarded$0 = 108;
        this.e();
        int discarded$1 = -36;
        this.c();
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        if (!(((r) this).field_y)) {
            this.i(param1 ^ -18596);
            return;
        }
        int discarded$0 = 4;
        this.d(param2, param3);
        ((r) this).field_z.a(param2, param4, param0, 0, param3, param5);
        this.a(-34, param0);
        if (param1 != -18596) {
            ((r) this).field_K = -86;
            return;
        }
    }

    private final void i(int param0) {
        ((r) this).field_L = 0;
        ((r) this).field_z.a(param0, (byte) 46);
        ((r) this).field_p = false;
        ((r) this).field_r = false;
    }

    final static Boolean l() {
        Boolean var1 = cv.field_s;
        cv.field_s = null;
        return var1;
    }

    r(wk[] param0, wk[] param1, tu param2, int[] param3, String[] param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
          L0: {
            ((r) this).field_D = param0;
            ((r) this).field_H = param1;
            ((r) this).field_q = param3;
            ((r) this).field_C = param2;
            ((r) this).field_z = new ng(param0, param1, param2, param3, param4, param5, param6);
            ((r) this).e(-20, param5, param6);
            this.h((byte) -120);
            ((r) this).e(32);
            ((r) this).field_x = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var8;
            stackOut_3_1 = new StringBuilder().append("r.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param5 + 44 + param6 + 41);
        }
    }

    private final void m() {
        int var3 = 0;
        String var4_ref_String = null;
        int var5_int = 0;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; ((r) this).field_z.u(117) > var3; var3++) {
            var4_ref_String = ((r) this).field_z.a((byte) -126, var3);
            var5_int = ((r) this).field_C.a(var4_ref_String);
            var2 = var2 < var5_int ? var5_int : var2;
        }
        var3 = ((r) this).field_C.a(' ') << 1;
        int var4 = ((r) this).field_D[3].field_A - -((r) this).field_D[5].field_A;
        int discarded$0 = 3;
        wk var5 = this.k();
        int var6 = var5.field_A;
        ((r) this).field_t = var6 + var4 + var2 - -var3;
        int var7 = ((r) this).field_C.field_L + ((r) this).field_C.field_H;
        int var8 = 4;
        int var9 = var5.field_x;
        ((r) this).field_o = var8 + var7;
        if (!(var9 <= ((r) this).field_o)) {
            ((r) this).field_o = var9;
        }
        int var10 = ((r) this).field_D[7].field_x + ((r) this).field_D[1].field_x;
        ((r) this).field_o = var10 + ((r) this).field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "It's a Draw!";
        field_G = "To configure your coat of arms, please log in or create a free account.";
        field_E = new String[]{"Ah, there you are. After your success at Eastbridge, I thought you could use some training in specialist equipment. Rest assured that the items used in this tutorial or in hotseat mode will not be taken from your stock.", "If you click on the equipment icon beside the game statistics it will open up the equipment menu.", "Please pick your gods before we begin the tutorial.", "So, your first bit of kit is called <%0>. <%1> <%2>", "Next on the roster you have <%0>. <%1> <%2>", "In the middle there you see the icon for <%0>. <%1> <%2>", "Okay, here we have <%0>. <%1> <%2>", "And last but not least, you've got <%0>. <%1> <%2>", "Now that you have selected this item, click on the enemy unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on the allied unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on a village you've captured. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on an enemy-occupied tower or village. Don't click on a portal, though - it's hard to cause civil unrest in a random explosion of magical particles. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the tile you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the area you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click where you want to build a bridge. This should be a tile of water with shore on only one side, so the bridge knows which way to unfurl. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an area containing bones. These bones will become your army of the undead. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the flying unit you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a cyclops. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a Kalphite Queen. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a goblin priest. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an ogre shaman. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an elf songstress. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "You can use this item right now. Just click the icon for <%0> and you'll see.", "You seem to have brought a shrine spell into battle for a god you aren't actually worshipping. Let's move swiftly on, shall we?", "You seem to have left some empty space in your equipment setup. You don't have to purchase equipment to be trained in it, simply equip it and you can try it here for free. Let's move swiftly on, shall we?", "This item can only be used on a unit that follows a god you have not selected. Let's move on to the next item, shall we?", "To activate this, you must first click on the <%0> icon.", "<%0> In a real battle you can only use each of these items once, but for training purposes I've provided an unlimited supply.", "There you go. Feel free to experiment with this item before moving on.", "As you can see, your unit now has a new movement area highlighted. When you order this unit to move within this area, the item will be used.", "Well, that's your equipment training complete. You're always welcome to return here with different equipment for another lesson.", "Ah, I see you brought more than one <%0>. I've already instructed you in how to use it, so we'll move on when you're ready.", "Oops, you seem to have clicked a different piece of equipment. Let's try again. <%0>", "Oops, you seem to have deselected this equipment. Let's try again. <%0>"};
        field_I = "Biggest bully";
        field_B = 2;
        field_w = "Magic robes";
    }
}
