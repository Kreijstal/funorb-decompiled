/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    private me field_i;
    private me field_s;
    private int field_f;
    private me field_k;
    private ij field_y;
    static String field_u;
    private me field_d;
    private me field_l;
    private int field_j;
    private int field_e;
    int field_t;
    private boolean[] field_q;
    int field_o;
    private ik field_b;
    private cn field_n;
    int field_m;
    int field_p;
    private me field_x;
    static String field_a;
    private boolean field_r;
    private int field_h;
    int field_c;
    static String field_g;
    private String field_v;
    private int field_w;

    private final void a(byte param0) {
        me var3 = null;
        int var4 = EscapeVector.field_A;
        hg var2_ref_hg = ((gj) this).field_n.a(false);
        while (var2_ref_hg != null) {
            var3 = (me) (Object) var2_ref_hg;
            this.a(-23672, var3);
            var2_ref_hg = ((gj) this).field_n.b((byte) 70);
        }
        int var2 = -40 % ((15 - param0) / 47);
    }

    private final int[] c(byte param0) {
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var10 = ((gj) this).field_y.field_o[((gj) this).field_p];
        int[] var2 = var10;
        int var3 = jb.a(92, ((gj) this).field_y.field_n);
        if (param0 <= 19) {
            Object var9 = null;
            int[] discarded$0 = this.a(false, (int[]) null, 43);
        }
        int var4 = je.a(false, var3);
        int[] var12 = new int[((gj) this).field_h];
        int[] var11 = var12;
        int[] var5 = var11;
        for (var6 = 0; var10.length > var6; var6++) {
            var7 = this.a(var10[var6], var4, false);
            var12[var6] = var7;
        }
        if (!(!((gj) this).field_r)) {
            var6 = this.a(((gj) this).field_b.field_q[0], var4, false);
            var5[-1 + ((gj) this).field_h] = var6;
        }
        return var5;
    }

    final void c(int param0) {
        if (param0 != 2) {
            String discarded$0 = this.a(-16, -82);
        }
        int discarded$1 = -111;
        this.e();
        int discarded$2 = -85;
        this.d();
    }

    private final int[] b() {
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var9 = ((gj) this).field_y.field_o[((gj) this).field_p];
        int[] var2 = var9;
        int var3 = jb.a(105, ((gj) this).field_y.field_n);
        int var4 = je.a(false, var3);
        int[] var5 = new int[((gj) this).field_h];
        for (var6 = 0; var6 < var9.length; var6++) {
            var7 = this.a(-1, var9[var6], var4);
            var5[var6] = var7;
        }
        if (((gj) this).field_r) {
            var6 = this.a(-1, ((gj) this).field_b.field_q[0], var4);
            var5[-1 + ((gj) this).field_h] = var6;
        }
        return var5;
    }

    private final int[] b(int param0, int param1) {
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int[] var6 = new int[param1];
        int[] var3 = var6;
        for (var4 = 0; var4 < var6.length; var4++) {
            var6[var4] = -1;
        }
        return var3;
    }

    final static void a(byte param0, mf param1, mf param2) {
        RuntimeException var3 = null;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("gj.D(").append(57).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void d() {
        int var2 = 640;
        int var3 = var2 / 2;
        int var4 = ((gj) this).field_f - -((gj) this).field_c + -2;
        ih var5 = fh.field_g;
        int var7 = 0;
        int discarded$0 = 31512;
        int var6 = un.a(var5);
        var4 = var4 - var6;
        int var8 = uc.a(-1, var5);
        var4 = var4 + var8;
        if (!(((gj) this).field_v == null)) {
            var5.c(((gj) this).field_v, var3, var4, ((gj) this).field_j, -1);
        }
    }

    private final void a(int param0, me param1) {
        ih var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param1 == null) {
              return;
            } else {
              var3 = fh.field_g;
              var4 = 10551200;
              var5 = 16777215;
              param1.a(var3, var5, (byte) -107, var4);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("gj.K(").append(-23672).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void b(String[] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
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
        var7 = EscapeVector.field_A;
        try {
          L0: {
            ((gj) this).field_q = new boolean[((gj) this).field_h];
            if (param0 == null) {
              return;
            } else {
              var3_int = 0;
              var4 = param0;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  break L0;
                } else {
                  L2: {
                    var6 = var4[var5];
                    if (var6 == null) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3_int++;
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gj.P(");
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + -117 + 41);
        }
    }

    private final void e() {
        me var4 = null;
        int var5 = EscapeVector.field_A;
        int var2 = 64;
        hg var3 = ((gj) this).field_n.a(false);
        while (var3 != null) {
            var4 = (me) (Object) var3;
            if (((gj) this).field_q != null) {
                var4.a(((gj) this).field_e, ((gj) this).field_q, (byte) 48);
            } else {
                var4.a(-6131, ((gj) this).field_e);
            }
            var3 = ((gj) this).field_n.b((byte) 70);
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_a = null;
        field_g = null;
    }

    private final int d(int param0) {
        int var2 = ((gj) this).field_k.f((byte) 87);
        ih var3 = fh.field_g;
        if (param0 > -33) {
            int discarded$0 = this.a(-73);
        }
        int discarded$1 = 31512;
        int var4 = un.a(var3);
        var2 = var2 + (2 + var4);
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = param1 / 50 % 50;
        if (var4 < 0) {
            var4 = 0;
        }
        if (var4 >= param2) {
            var4 = param2 - 1;
        }
        return 1 + var4;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param1 < 0) {
            return false;
        }
        if (!(q.field_E.length > param1)) {
            return false;
        }
        if (param0 < 0) {
            return false;
        }
        if (!(param0 < q.field_E[param1].length)) {
            return false;
        }
        return q.field_E[param1][param0];
    }

    private final void e(byte param0) {
        me var5 = null;
        int var6 = EscapeVector.field_A;
        int var2 = ((gj) this).field_t;
        int var3 = ((gj) this).field_f;
        if (param0 != 52) {
            return;
        }
        hg var4 = ((gj) this).field_n.a(false);
        while (var4 != null) {
            var5 = (me) (Object) var4;
            var5.a(var2, var3, 0);
            var2 = var2 + var5.e((byte) -127);
            var4 = ((gj) this).field_n.b((byte) 70);
        }
    }

    private final String a(int param0, int param1) {
        if (!(param1 != 1)) {
            return ng.field_lb;
        }
        if (param0 != -17651) {
            ((gj) this).field_b = null;
        }
        if (param1 == 0) {
            return wc.field_b;
        }
        if (!(param1 != 2)) {
            return ng.field_lb;
        }
        if (!(param1 != 3)) {
            return ng.field_lb;
        }
        return ng.field_lb;
    }

    final void a(int param0, String param1, int param2) {
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
              ((gj) this).field_v = param1;
              ((gj) this).field_j = param2;
              if (param0 == 3) {
                break L1;
              } else {
                int[] discarded$2 = this.c((byte) -24);
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
            stackOut_3_1 = new StringBuilder().append("gj.T(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        if (param0 > 123) {
          L0: {
            var2 = ((gj) this).field_y.field_n;
            var3 = this.a(var2, false);
            if (0 > var3) {
              break L0;
            } else {
              if (vn.field_a.length > var3) {
                var4 = vn.field_a[var3];
                var5 = var4;
                var6 = 0;
                L1: while (true) {
                  if (var5.length <= var6) {
                    return -1;
                  } else {
                    var7 = var5[var6];
                    ((gj) this).field_y.field_n = var7;
                    var8 = ld.a(((gj) this).field_b, ((gj) this).field_p, 0, ((gj) this).field_y);
                    if (0 > var8) {
                      var6++;
                      continue L1;
                    } else {
                      ((gj) this).field_y.field_n = var2;
                      return var8;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return -15;
        }
    }

    private final String[] a(int[] param0) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = new String[((gj) this).field_h];
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= param0.length) {
                L2: {
                  if (((gj) this).field_r) {
                    var4 = jb.a(115, ((gj) this).field_b.field_j);
                    var3[((gj) this).field_h + -1] = this.a(-17651, var4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_7_0 = (String[]) var3;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var5 = jb.a(107, param0[var4]);
                var7[var4] = this.a(-17651, var5);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("gj.V(");
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
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 1 + 41);
        }
        return stackIn_8_0;
    }

    private final String[] a(String[] param0) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        String[] var4 = null;
        String[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4 = new String[((gj) this).field_h];
            var3 = var4;
            L1: {
              qg.a((Object[]) (Object) param0, 0, (Object[]) (Object) var3, 0, param0.length);
              if (!((gj) this).field_r) {
                break L1;
              } else {
                var4[-1 + ((gj) this).field_h] = ck.field_r;
                break L1;
              }
            }
            stackOut_4_0 = (String[]) var3;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("gj.M(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -1 + 41);
        }
        return stackIn_5_0;
    }

    private final int[] a(boolean param0, int[] param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var8 = new int[((gj) this).field_h];
            var4 = var8;
            var5 = 0;
            L1: while (true) {
              if (param1.length <= var5) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    this.e((byte) -108);
                    break L2;
                  }
                }
                L3: {
                  if (!((gj) this).field_r) {
                    break L3;
                  } else {
                    var5 = bj.a(-49, param2, ((gj) this).field_b.field_q[0]);
                    var4[-1 + ((gj) this).field_h] = var5;
                    break L3;
                  }
                }
                stackOut_8_0 = (int[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var6 = bj.a(-56, param2, param1[var5]);
                var8[var5] = var6;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("gj.Q(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    private final int f(int param0) {
        me var4 = null;
        int var5 = EscapeVector.field_A;
        int var2 = 0;
        hg var3 = ((gj) this).field_n.a(false);
        if (param0 >= -115) {
            ((gj) this).c(117);
        }
        while (var3 != null) {
            var4 = (me) (Object) var3;
            var2 = var2 + var4.e((byte) -127);
            var3 = ((gj) this).field_n.b((byte) 70);
        }
        return var2;
    }

    private final int a(int param0, int param1, boolean param2) {
        int var4 = this.a(-1, param0, param1);
        int var5 = param0 % 50;
        int var6 = -var5 + var4;
        if (!(var6 >= 1)) {
            var6 = 1;
        }
        if (!(var6 <= param1)) {
            var6 = param1;
        }
        return var6;
    }

    private final int c(int param0, int param1) {
        if (!(param1 != 0)) {
            return 5;
        }
        if (!(1 != param1)) {
            return 5;
        }
        if (param1 == 2) {
            return 6;
        }
        if (param1 == 3) {
            return 7;
        }
        return -1;
    }

    gj(ij param0, int[] param1, ik param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        String[] var9 = null;
        String[] var10 = null;
        int var14 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
        try {
          L0: {
            L1: {
              ((gj) this).field_p = param3;
              ((gj) this).field_y = param0;
              ((gj) this).field_w = param4;
              ((gj) this).field_e = -1;
              ((gj) this).field_b = param2;
              ((gj) this).field_o = 1;
              if (null == ((gj) this).field_b) {
                break L1;
              } else {
                ((gj) this).field_e = this.a(124);
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_3_0 = this;
                stackIn_8_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param6) {
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackIn_8_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (((gj) this).field_e >= 0) {
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (null == ((gj) this).field_b) {
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (this.c(-1, ((gj) this).field_b.field_j) != ((gj) this).field_w) {
                        break L3;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L2;
            }
            L4: {
              ((gj) this).field_r = stackIn_9_1 != 0;
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!((gj) this).field_r) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L4;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L4;
              }
            }
            L5: {
              ((gj) this).field_h = stackIn_12_1 + ((gj) this).field_y.field_m[((gj) this).field_p].length;
              if (!((gj) this).field_r) {
                break L5;
              } else {
                ((gj) this).field_e = ((gj) this).field_h - 1;
                break L5;
              }
            }
            L6: {
              ((gj) this).field_n = new cn();
              var8_int = ((gj) this).field_y.field_m[((gj) this).field_p].length;
              ((gj) this).field_x = new me(var8_int);
              ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_x);
              int discarded$4 = -1;
              var9 = this.a(((gj) this).field_y.field_m[((gj) this).field_p]);
              int discarded$5 = -117;
              this.b(var9);
              ((gj) this).field_k = new me(fi.field_b, var9, 1);
              ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_k);
              var10 = new String[((gj) this).field_h];
              if (5 != ((gj) this).field_w) {
                break L6;
              } else {
                int discarded$6 = 1;
                var10 = this.a(param1);
                break L6;
              }
            }
            ((gj) this).field_l = new me(qf.field_o, var10, 2);
            ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_l);
            var24 = this.c((byte) 39);
            ((gj) this).field_s = new me(bo.field_D, var24);
            ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_s);
            int discarded$7 = 127;
            var25 = this.b();
            ((gj) this).field_i = new me(jd.field_c, var25);
            ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_i);
            var26 = this.a(true, ((gj) this).field_y.field_o[((gj) this).field_p], jb.a(90, ((gj) this).field_y.field_n));
            ((gj) this).field_d = new me(kn.field_f, var26);
            ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_d);
            this.a((byte) -113);
            var14 = 640;
            ((gj) this).field_m = this.f(-128);
            ((gj) this).field_c = this.d(-98);
            ((gj) this).field_f = param5;
            ((gj) this).field_t = (var14 + -((gj) this).field_m) / 2;
            this.e((byte) 52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("gj.<init>(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    gj(int param0, int param1, boolean param2) {
        String[] var5 = null;
        int var9 = 0;
        String[] var10 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((gj) this).field_w = param0;
          ((gj) this).field_o = 0;
          ((gj) this).field_h = 10;
          if (!param2) {
            break L0;
          } else {
            ((gj) this).field_h = ((gj) this).field_h + 1;
            break L0;
          }
        }
        ((gj) this).field_n = new cn();
        ((gj) this).field_x = new me(((gj) this).field_h);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_x);
        var10 = new String[((gj) this).field_h];
        ((gj) this).field_k = new me(fi.field_b, var10, 1);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_k);
        var5 = new String[((gj) this).field_h];
        ((gj) this).field_l = new me(qf.field_o, var5, 2);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_l);
        var20 = this.b(-27531, ((gj) this).field_h);
        ((gj) this).field_s = new me(bo.field_D, var20);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_s);
        var21 = this.b(-27531, ((gj) this).field_h);
        ((gj) this).field_i = new me(jd.field_c, var21);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_i);
        var22 = this.b(-27531, ((gj) this).field_h);
        ((gj) this).field_d = new me(kn.field_f, var22);
        ((gj) this).field_n.a(-12328, (hg) (Object) ((gj) this).field_d);
        this.a((byte) -41);
        var9 = 640;
        ((gj) this).field_m = this.f(-124);
        ((gj) this).field_c = this.d(-102);
        ((gj) this).field_f = param1;
        ((gj) this).field_t = (-((gj) this).field_m + var9) / 2;
        this.e((byte) 52);
    }

    private final int a(int param0, boolean param1) {
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(1 != param0)) {
            return 0;
        }
        if (!(param0 != 2)) {
            return 1;
        }
        if (!(param0 != 3)) {
            return 2;
        }
        int discarded$0 = this.c(-56, 63);
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Return to game";
        field_a = "This game has been updated! Please reload this page.";
    }
}
