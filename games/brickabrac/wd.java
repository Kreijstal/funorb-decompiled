/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends tk {
    int[] field_u;
    private int[][] field_A;
    private int[] field_B;
    private String[] field_y;
    static vl field_v;
    static mh field_E;
    static mh[] field_F;
    static String field_D;
    static String field_x;
    static int field_z;
    static mh field_w;
    static mf field_C;

    final void g(int param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (null != this.field_u) {
            for (var2 = 0; var2 < this.field_u.length; var2++) {
                this.field_u[var2] = ud.d(this.field_u[var2], 32768);
            }
        }
        var2 = 122 % ((param0 - -60) / 61);
    }

    public static void f(int param0) {
        field_F = null;
        field_E = null;
        field_x = null;
        field_v = null;
        field_C = null;
        field_D = null;
        field_w = null;
        if (param0 != 32463) {
            wd.f(-119);
        }
    }

    final String h(int param0) {
        int var3 = 0;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_y) {
            return "";
        }
        StringBuilder discarded$8 = var5.append(this.field_y[0]);
        if (param0 != -3) {
            return (String) null;
        }
        for (var3 = 1; var3 < this.field_y.length; var3++) {
            discarded$9 = var2.append("...");
            discarded$10 = var5.append(this.field_y[var3]);
        }
        return var2.toString();
    }

    private final void a(int param0, int param1, wq param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                this.field_B = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (param0 ^ -1)) {
                if (-3 == (param0 ^ -1)) {
                  var4_int = param2.l(255);
                  this.field_u = new int[var4_int];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var4_int) {
                      break L2;
                    } else {
                      this.field_u[var5] = param2.i(65280);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  if (param0 == 3) {
                    var4_int = param2.l(255);
                    this.field_B = new int[var4_int];
                    this.field_A = new int[var4_int][];
                    var5 = 0;
                    L4: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L5: {
                          var6 = param2.i(65280);
                          var7 = vn.a(var6, (byte) 84);
                          if (var7 == null) {
                            break L5;
                          } else {
                            this.field_B[var5] = var6;
                            array$1 = new int[var7.field_g];
                            this.field_A[var5] = array$1;
                            var8 = 0;
                            L6: while (true) {
                              if (var7.field_g <= var8) {
                                break L5;
                              } else {
                                this.field_A[var5][var8] = param2.i(65280);
                                var8++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if ((param0 ^ -1) == -5) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                this.field_y = qb.a((byte) -63, param2.d(-1), '<');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("wd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final void a(wq param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                this.g(-2);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.l(255);
              if (var3_int != 0) {
                this.a(var3_int, -3, param0);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("wd.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, mh param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        nn var9 = null;
        String var10 = null;
        jp var11 = null;
        nn var12 = null;
        String var13 = null;
        jp var14 = null;
        nn var15 = null;
        String var16 = null;
        jp var17 = null;
        nn var18 = null;
        String var19 = null;
        jp var20 = null;
        nn var21 = null;
        String var22 = null;
        jp var23 = null;
        nn var24 = null;
        String var25 = null;
        jp var26 = null;
        nn var27 = null;
        String var28 = null;
        jp var29 = null;
        nn var30 = null;
        String var31 = null;
        jp var32 = null;
        nn var33 = null;
        String var34 = null;
        jp var35 = null;
        nn var36 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
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
              mn.a(param1, param2, (mm) null, (int[]) null, (String) null, -1, (byte) -58, 0L, (String) null);
              if (-1 != (param1 ^ -1)) {
                break L1;
              } else {
                var9 = bm.field_d;
                var11 = ef.field_b[0];
                var29 = var11;
                var29 = var11;
                var10 = ro.field_m;
                var9.field_d.a(var10, 108, 11, var11);
                var12 = bm.field_d;
                var14 = ef.field_b[1];
                var29 = var14;
                var29 = var14;
                var13 = eo.field_l;
                var12.field_d.a(var13, 105, 12, var14);
                var15 = bm.field_d;
                var17 = ef.field_b[2];
                var29 = var17;
                var29 = var17;
                var16 = co.field_e;
                var15.field_d.a(var16, 112, 13, var17);
                break L1;
              }
            }
            L2: {
              if (1 != param1) {
                break L2;
              } else {
                var18 = bm.field_d;
                var20 = ef.field_b[0];
                var19 = mj.field_a;
                var18.field_d.a(var19, param0 ^ 864, 11, var20);
                var21 = bm.field_d;
                var23 = ef.field_b[1];
                var22 = tk.field_m;
                var21.field_d.a(var22, 123, 12, var23);
                var24 = bm.field_d;
                var26 = ef.field_b[2];
                var25 = kg.field_b;
                var24.field_d.a(var25, param0 ^ 843, 13, var26);
                break L2;
              }
            }
            L3: {
              if ((param1 ^ -1) != -3) {
                break L3;
              } else {
                var27 = bm.field_d;
                var29 = ef.field_b[0];
                var28 = ao.field_l;
                var27.field_d.a(var28, param0 + -686, 11, var29);
                var30 = bm.field_d;
                var32 = ef.field_b[1];
                var31 = lg.field_M;
                var30.field_d.a(var31, param0 + -720, 12, var32);
                var33 = bm.field_d;
                var35 = ef.field_b[2];
                var34 = ac.field_b;
                var33.field_d.a(var34, param0 + -708, 13, var35);
                break L3;
              }
            }
            var36 = bm.field_d;
            var4 = param2.field_Eb;
            var5 = param2.field_db;
            if (param0 == 784) {
              var6 = param2.field_Ib;
              var7 = param2.field_cb;
              var36.field_d.a(var5, -124, var7, var6, var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("wd.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wd() {
    }

    static {
        field_v = new vl();
        field_D = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_x = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
