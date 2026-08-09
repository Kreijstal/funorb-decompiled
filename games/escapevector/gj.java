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
        hg var2_ref_hg = this.field_n.a(false);
        while (var2_ref_hg != null) {
            var3 = (me) ((Object) var2_ref_hg);
            this.a(-23672, var3);
            var2_ref_hg = this.field_n.b((byte) 70);
        }
        int var2 = -40 % ((15 - param0) / 47);
    }

    private final int[] c(byte param0) {
        int[] discarded$0 = null;
        int var7 = 0;
        int var6 = 0;
        int var8 = EscapeVector.field_A;
        int[] var10 = this.field_y.field_o[this.field_p];
        int[] var2 = var10;
        int var3 = jb.a(92, this.field_y.field_n);
        if (param0 <= 19) {
            int[] var9 = (int[]) null;
            discarded$0 = this.a(false, (int[]) null, 43);
        }
        int var4 = je.a(false, var3);
        int[] var12 = new int[this.field_h];
        int[] var11 = var12;
        int[] var5 = var11;
        for (var6 = 0; var10.length > var6; var6++) {
            var7 = this.a(var10[var6], var4, false);
            var12[var6] = var7;
        }
        if (!(!this.field_r)) {
            var6 = this.a(this.field_b.field_q[0], var4, false);
            var5[-1 + this.field_h] = var6;
        }
        return var5;
    }

    final void c(int param0) {
        String discarded$0 = null;
        if (param0 != 2) {
            discarded$0 = this.a(-16, -82);
        }
        this.e(-111);
        this.d((byte) -85);
    }

    private final int[] b(byte param0) {
        int[] discarded$0 = null;
        int var7 = 0;
        int var6 = 0;
        int var8 = EscapeVector.field_A;
        int[] var10 = this.field_y.field_o[this.field_p];
        int[] var2 = var10;
        int var3 = jb.a(105, this.field_y.field_n);
        if (param0 <= 120) {
            int[] var9 = (int[]) null;
            discarded$0 = this.a(true, (int[]) null, -69);
        }
        int var4 = je.a(false, var3);
        int[] var12 = new int[this.field_h];
        int[] var11 = var12;
        int[] var5 = var11;
        for (var6 = 0; var6 < var10.length; var6++) {
            var7 = this.a(-1, var10[var6], var4);
            var12[var6] = var7;
        }
        if (this.field_r) {
            var6 = this.a(-1, this.field_b.field_q[0], var4);
            var5[-1 + this.field_h] = var6;
        }
        return var5;
    }

    private final int[] b(int param0, int param1) {
        String[] discarded$0 = null;
        int var5 = EscapeVector.field_A;
        int[] var3 = new int[param1];
        int var4 = 0;
        if (param0 != -27531) {
            String[] var6 = (String[]) null;
            discarded$0 = this.a((String[]) null, -110);
        }
        while (var4 < var3.length) {
            var3[var4] = -1;
            var4++;
        }
        return var3;
    }

    final static void a(byte param0, mf param1, mf param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 55) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    private final void d(byte param0) {
        int var2 = 640;
        int var3 = var2 / 2;
        int var4 = this.field_f - -this.field_c + -2;
        ih var5 = fh.field_g;
        int var7 = -42 % ((45 - param0) / 61);
        int var6 = un.a(var5, 31512);
        var4 = var4 - var6;
        int var8 = uc.a(-1, var5);
        var4 = var4 + var8;
        if (!(this.field_v == null)) {
            var5.c(this.field_v, var3, var4, this.field_j, -1);
        }
    }

    private final void a(int param0, me param1) {
        int[] discarded$1 = null;
        ih var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param1 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3 = fh.field_g;
                var4 = 10551200;
                var5 = 16777215;
                param1.a(var3, var5, (byte) -107, var4);
                if (param0 == -23672) {
                  break L1;
                } else {
                  discarded$1 = this.b(58, -116);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("gj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(String[] param0, int param1) {
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 < -105) {
                break L1;
              } else {
                this.field_l = (me) null;
                break L1;
              }
            }
            this.field_q = new boolean[this.field_h];
            if (param0 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              var4 = param0;
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (var6 != null) {
                    if (this.field_q.length <= var3_int) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      this.field_q[var3_int] = true;
                      var3_int++;
                      var5++;
                      continue L2;
                    }
                  } else {
                    var3_int++;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("gj.P(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void e(int param0) {
        me var4 = null;
        int var5 = EscapeVector.field_A;
        int var2 = -64 / ((param0 - -50) / 50);
        hg var3 = this.field_n.a(false);
        while (var3 != null) {
            var4 = (me) ((Object) var3);
            if (this.field_q != null) {
                var4.a(this.field_e, this.field_q, (byte) 48);
            } else {
                var4.a(-6131, this.field_e);
            }
            var3 = this.field_n.b((byte) 70);
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_a = null;
        if (param0 != 3355) {
            return;
        }
        field_g = null;
    }

    private final int d(int param0) {
        int discarded$0 = 0;
        int var2 = this.field_k.f((byte) 87);
        ih var3 = fh.field_g;
        if (param0 > -33) {
            discarded$0 = this.a(-73);
        }
        int var4 = un.a(var3, 31512);
        var2 = var2 + (2 + var4);
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = param1 / 50 % 50;
        if (param0 < (var4 ^ -1)) {
            var4 = 0;
        }
        if (var4 >= param2) {
            var4 = param2 - 1;
        }
        return 1 + var4;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if ((param1 ^ -1) > -1) {
            return false;
        }
        if (!(q.field_E.length > param1)) {
            return false;
        }
        if (-1 < (param0 ^ -1)) {
            return false;
        }
        if (param2 < 23) {
            return true;
        }
        if (!(param0 < q.field_E[param1].length)) {
            return false;
        }
        return q.field_E[param1][param0];
    }

    private final void e(byte param0) {
        me var5 = null;
        int var6 = EscapeVector.field_A;
        int var2 = this.field_t;
        int var3 = this.field_f;
        if (param0 != 52) {
            return;
        }
        hg var4 = this.field_n.a(false);
        while (var4 != null) {
            var5 = (me) ((Object) var4);
            var5.a(var2, var3, 0);
            var2 = var2 + var5.e((byte) -127);
            var4 = this.field_n.b((byte) 70);
        }
    }

    private final String a(int param0, int param1) {
        if (!((param1 ^ -1) != -2)) {
            return ng.field_lb;
        }
        if (param0 != -17651) {
            this.field_b = (ik) null;
        }
        if (param1 == 0) {
            return wc.field_b;
        }
        if (!((param1 ^ -1) != -3)) {
            return ng.field_lb;
        }
        if (!((param1 ^ -1) != -4)) {
            return ng.field_lb;
        }
        return ng.field_lb;
    }

    final void a(int param0, String param1, int param2) {
        int[] discarded$1 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_v = param1;
              this.field_j = param2;
              if (param0 == 3) {
                break L1;
              } else {
                discarded$1 = this.c((byte) -24);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gj.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final int a(int param0) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        if (param0 <= 123) {
            return -15;
        }
        int var2 = this.field_y.field_n;
        int var3 = this.a(var2, false);
        if (0 > var3 || vn.field_a.length <= var3) {
            return -1;
        }
        int[] var4 = vn.field_a[var3];
        int[] var5 = var4;
        for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            this.field_y.field_n = var7;
            var8 = ld.a(this.field_b, this.field_p, 0, this.field_y);
            if (0 <= var8) {
                this.field_y.field_n = var2;
                return var8;
            }
        }
        return -1;
    }

    private final String[] a(int[] param0, boolean param1) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_k = (me) null;
                break L1;
              }
            }
            var7 = new String[this.field_h];
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= param0.length) {
                L3: {
                  if (this.field_r) {
                    var4 = jb.a(115, this.field_b.field_j);
                    var3[this.field_h + -1] = this.a(-17651, var4);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_10_0 = (String[]) (var3);
                break L0;
              } else {
                var5 = jb.a(107, param0[var4]);
                var7[var4] = this.a(-17651, var5);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("gj.V(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    private final String[] a(String[] param0, int param1) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        String[] var4 = null;
        String[] stackIn_2_0 = null;
        String[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new String[this.field_h];
            var3 = var4;
            if (param1 == -1) {
              L1: {
                qg.a(param0, 0, var3, 0, param0.length);
                if (!this.field_r) {
                  break L1;
                } else {
                  var4[-1 + this.field_h] = ck.field_r;
                  break L1;
                }
              }
              stackIn_6_0 = (String[]) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("gj.M(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final int[] a(boolean param0, int[] param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var8 = new int[this.field_h];
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
                  if (!this.field_r) {
                    break L3;
                  } else {
                    var5 = bj.a(-49, param2, this.field_b.field_q[0]);
                    var4[-1 + this.field_h] = var5;
                    break L3;
                  }
                }
                stackIn_9_0 = (int[]) (var4);
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
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("gj.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    private final int f(int param0) {
        me var4 = null;
        int var5 = EscapeVector.field_A;
        int var2 = 0;
        hg var3 = this.field_n.a(false);
        if (param0 >= -115) {
            this.c(117);
        }
        while (var3 != null) {
            var4 = (me) ((Object) var3);
            var2 = var2 + var4.e((byte) -127);
            var3 = this.field_n.b((byte) 70);
        }
        return var2;
    }

    private final int a(int param0, int param1, boolean param2) {
        if (param2) {
            mf var7 = (mf) null;
            gj.a((byte) -44, (mf) null, (mf) null);
        }
        int var4 = this.a(-1, param0, param1);
        int var5 = param0 % 50;
        int var6 = -var5 + var4;
        if (!(-2 >= (var6 ^ -1))) {
            var6 = 1;
        }
        if (!(var6 <= param1)) {
            var6 = param1;
        }
        return var6;
    }

    private final int c(int param0, int param1) {
        if (param0 != -1) {
            return 0;
        }
        if (!(param1 != 0)) {
            return 5;
        }
        if (!(1 != param1)) {
            return 5;
        }
        if (-3 == (param1 ^ -1)) {
            return 6;
        }
        if (param1 == 3) {
            return 7;
        }
        return -1;
    }

    gj(ij param0, int[] param1, ik param2, int param3, int param4, int param5, boolean param6) {
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        String[] var9 = null;
        String[] var10 = null;
        int var14 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        try {
          L0: {
            L1: {
              this.field_p = param3;
              this.field_y = param0;
              this.field_w = param4;
              this.field_e = -1;
              this.field_b = param2;
              this.field_o = 1;
              if (null == this.field_b) {
                break L1;
              } else {
                this.field_e = this.a(124);
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_8_0 = this;

                if (!param6) {
                  break L3;
                } else {
                  stackIn_8_0 = this;

                  if (this.field_e >= 0) {
                    break L3;
                  } else {
                    stackIn_8_0 = this;

                    if (null == this.field_b) {
                      break L3;
                    } else {
                      stackIn_8_0 = this;

                      if (this.c(-1, this.field_b.field_j) != this.field_w) {
                        break L3;
                      } else {
                        stackIn_9_0 = this;
                        stackIn_9_1 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = this;
              stackIn_9_1 = 0;
              break L2;
            }
            L4: {
              ((gj) (this)).field_r = stackIn_9_1 != 0;
              stackIn_11_0 = this;

              if (!this.field_r) {
                stackIn_12_0 = this;
                stackIn_12_1 = 0;
                break L4;
              } else {
                stackIn_12_0 = this;
                stackIn_12_1 = 1;
                break L4;
              }
            }
            L5: {
              ((gj) (this)).field_h = stackIn_12_1 + this.field_y.field_m[this.field_p].length;
              if (!this.field_r) {
                break L5;
              } else {
                this.field_e = this.field_h - 1;
                break L5;
              }
            }
            L6: {
              this.field_n = new cn();
              var8_int = this.field_y.field_m[this.field_p].length;
              this.field_x = new me(var8_int);
              this.field_n.a(-12328, this.field_x);
              var9 = this.a(this.field_y.field_m[this.field_p], -1);
              this.b(var9, -117);
              this.field_k = new me(fi.field_b, var9, 1);
              this.field_n.a(-12328, this.field_k);
              var10 = new String[this.field_h];
              if (5 != this.field_w) {
                break L6;
              } else {
                var10 = this.a(param1, true);
                break L6;
              }
            }
            this.field_l = new me(qf.field_o, var10, 2);
            this.field_n.a(-12328, this.field_l);
            var24 = this.c((byte) 39);
            this.field_s = new me(bo.field_D, var24);
            this.field_n.a(-12328, this.field_s);
            var25 = this.b((byte) 127);
            this.field_i = new me(jd.field_c, var25);
            this.field_n.a(-12328, this.field_i);
            var26 = this.a(true, this.field_y.field_o[this.field_p], jb.a(90, this.field_y.field_n));
            this.field_d = new me(kn.field_f, var26);
            this.field_n.a(-12328, this.field_d);
            this.a((byte) -113);
            var14 = 640;
            this.field_m = this.f(-128);
            this.field_c = this.d(-98);
            this.field_f = param5;
            this.field_t = (var14 + -this.field_m) / 2;
            this.e((byte) 52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("gj.<init>(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    gj(int param0, int param1, boolean param2) {
        this.field_w = param0;
        this.field_o = 0;
        this.field_h = 10;
        if (param2) {
            this.field_h = this.field_h + 1;
        }
        this.field_n = new cn();
        this.field_x = new me(this.field_h);
        this.field_n.a(-12328, this.field_x);
        String[] var10 = new String[this.field_h];
        this.field_k = new me(fi.field_b, var10, 1);
        this.field_n.a(-12328, this.field_k);
        String[] var5 = new String[this.field_h];
        this.field_l = new me(qf.field_o, var5, 2);
        this.field_n.a(-12328, this.field_l);
        int[] var20 = this.b(-27531, this.field_h);
        this.field_s = new me(bo.field_D, var20);
        this.field_n.a(-12328, this.field_s);
        int[] var21 = this.b(-27531, this.field_h);
        this.field_i = new me(jd.field_c, var21);
        this.field_n.a(-12328, this.field_i);
        int[] var22 = this.b(-27531, this.field_h);
        this.field_d = new me(kn.field_f, var22);
        this.field_n.a(-12328, this.field_d);
        this.a((byte) -41);
        int var9 = 640;
        this.field_m = this.f(-124);
        this.field_c = this.d(-102);
        this.field_f = param1;
        this.field_t = (-this.field_m + var9) / 2;
        this.e((byte) 52);
    }

    private final int a(int param0, boolean param1) {
        int discarded$0 = 0;
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
        if (param1) {
            discarded$0 = this.c(-56, 63);
        }
        return -1;
    }

    static {
        field_u = "Return to game";
        field_a = "This game has been updated! Please reload this page.";
    }
}
