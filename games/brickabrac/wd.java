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
        if (null != ((wd) this).field_u) {
            for (var2 = 0; var2 < ((wd) this).field_u.length; var2++) {
                ((wd) this).field_u[var2] = ud.d(((wd) this).field_u[var2], 32768);
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
        int var4 = BrickABrac.field_J ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((wd) this).field_y) {
            return "";
        }
        StringBuilder discarded$8 = var5.append(((wd) this).field_y[0]);
        if (param0 != -3) {
            return null;
        }
        for (var3 = 1; var3 < ((wd) this).field_y.length; var3++) {
            StringBuilder discarded$9 = var2.append("...");
            StringBuilder discarded$10 = var5.append(((wd) this).field_y[var3]);
        }
        return var2.toString();
    }

    private final void a(int param0, int param1, wq param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          if (param1 == -3) {
            break L0;
          } else {
            ((wd) this).field_B = null;
            break L0;
          }
        }
        L1: {
          if (-2 != param0) {
            if (-3 == param0) {
              var4 = param2.l(255);
              ((wd) this).field_u = new int[var4];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((wd) this).field_u[var5] = param2.i(65280);
                  var5++;
                  continue L2;
                }
              }
            } else {
              if (param0 == 3) {
                var4 = param2.l(255);
                ((wd) this).field_B = new int[var4];
                ((wd) this).field_A = new int[var4][];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param2.i(65280);
                    var7 = vn.a(var6, (byte) 84);
                    if (var7 != null) {
                      ((wd) this).field_B[var5] = var6;
                      ((wd) this).field_A[var5] = new int[var7.field_g];
                      var8 = 0;
                      L4: while (true) {
                        if (var7.field_g > var8) {
                          ((wd) this).field_A[var5][var8] = param2.i(65280);
                          var8++;
                          continue L4;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                if ((param0 ^ -1) == -5) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            ((wd) this).field_y = qb.a((byte) -63, param2.d(-1), '<');
            break L1;
          }
        }
    }

    final void a(wq param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (param1 == -3) {
            break L0;
          } else {
            ((wd) this).g(-2);
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.l(255);
          if (var3 != 0) {
            this.a(var3, -3, param0);
            continue L1;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, mh param2) {
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
        jp var29_ref = null;
        nn var30 = null;
        String var31 = null;
        jp var32 = null;
        nn var33 = null;
        String var34 = null;
        jp var35 = null;
        nn var36 = null;
        L0: {
          mn.a(param1, param2, (mm) null, (int[]) null, (String) null, -1, (byte) -58, 0L, (String) null);
          if (-1 != (param1 ^ -1)) {
            break L0;
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
            break L0;
          }
        }
        L1: {
          if (1 != param1) {
            break L1;
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
            break L1;
          }
        }
        L2: {
          if ((param1 ^ -1) != -3) {
            break L2;
          } else {
            var27 = bm.field_d;
            var29_ref = ef.field_b[0];
            var28 = ao.field_l;
            var27.field_d.a(var28, param0 + -686, 11, var29_ref);
            var30 = bm.field_d;
            var32 = ef.field_b[1];
            var31 = lg.field_M;
            var30.field_d.a(var31, param0 + -720, 12, var32);
            var33 = bm.field_d;
            var35 = ef.field_b[2];
            var34 = ac.field_b;
            var33.field_d.a(var34, param0 + -708, 13, var35);
            break L2;
          }
        }
        var36 = bm.field_d;
        var4 = param2.field_Eb;
        var5 = param2.field_db;
        if (param0 == 784) {
          var6 = param2.field_Ib;
          var7 = param2.field_cb;
          var36.field_d.a(var5, -124, var7, var6, var4);
          return;
        } else {
          return;
        }
    }

    wd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new vl();
        field_D = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_x = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
