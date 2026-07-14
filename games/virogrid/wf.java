/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf {
    static um field_d;
    static il field_j;
    static String field_k;
    static String[] field_e;
    static String field_g;
    int[] field_l;
    int field_c;
    static int[] field_f;
    static String field_a;
    java.awt.Image field_h;
    int field_b;
    static String field_i;
    static java.applet.Applet field_m;

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    final static void a(String param0, int param1) {
        rf.field_a = param0;
        kf.a(param1, -1);
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_g = null;
        field_m = null;
        field_e = null;
        field_j = null;
        field_k = null;
        field_a = null;
        if (param0 != -28608) {
            return;
        }
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        Object var8 = null;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3) {
            break L0;
          } else {
            var8 = null;
            wf.a((String) null, -15);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 > param1) {
              break L2;
            } else {
              if (param1 >= param2 + param0) {
                break L2;
              } else {
                if (param4 > param5) {
                  break L2;
                } else {
                  if (param6 + param4 <= param5) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, e param1, int param2, e param3) {
        ti.field_g = param3;
        if (param2 != 0) {
            boolean discarded$0 = wf.a(83, 51, -93, false, 111, -102, -46);
        }
        j.field_h = param1;
        rf.field_b = param0;
        bj.a(df.field_e / 2, 23, df.field_f / 2);
        vb.a(param1.field_A, (byte) 90, param1.field_A - -param1.field_G, param3.field_G + param3.field_A, param3.field_A);
    }

    abstract void a(byte param0, int param1, java.awt.Graphics param2, int param3);

    final static oj a(km param0, km param1, u param2, int param3, km param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        oj[] var11 = null;
        int var12 = 0;
        u var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        th var16 = null;
        int var17 = 0;
        Object var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int[] var23 = null;
        char[] var24 = null;
        int[] var25 = null;
        char[] var26 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = Virogrid.field_F ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (param2.field_x == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param2.field_x.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param2.field_w) {
              stackOut_7_0 = param2.field_w.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 - -var6;
            var8 = new String[var7];
            var26 = new char[var7];
            var24 = var26;
            var22 = var24;
            var20 = var22;
            var9 = var20;
            if (param3 == 49) {
              break L2;
            } else {
              var18 = null;
              wf.a(96, (e) null, -35, (e) null);
              break L2;
            }
          }
          L3: {
            var25 = new int[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var10 = var19;
            var11 = new oj[var7];
            if (null != param2.field_x) {
              var12 = 0;
              L4: while (true) {
                if (param2.field_x.length <= var12) {
                  break L3;
                } else {
                  var13_ref = dm.field_v.a(param2.field_x[var12], (byte) 61);
                  var8[var12] = var13_ref.field_v;
                  var9[var12] = param2.field_p[var12];
                  var11[var12] = wf.a(param0, param1, var13_ref, 49, param4);
                  var12++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (param2.field_w != null) {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (var14 >= param2.field_w.length) {
                  break L5;
                } else {
                  var15 = param2.field_w[var14];
                  if (-1 == var15) {
                    var8[var12 + var14] = je.field_G;
                    var9[var14 + var12] = param2.field_r[var14];
                    var10[var12 + var14] = param2.field_w[var14];
                    var14++;
                    continue L6;
                  } else {
                    L7: {
                      var16 = cj.field_s.a((byte) 125, var15);
                      var8[var12 + var14] = var16.d(119);
                      var9[var14 + var12] = param2.field_r[var14];
                      if (0 < var9[var14 + var12]) {
                        break L7;
                      } else {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char)var13;
                        break L7;
                      }
                    }
                    var10[var14 + var12] = param2.field_w[var14];
                    var14++;
                    continue L6;
                  }
                }
              }
            } else {
              break L5;
            }
          }
          return new oj(0L, param1, param0, param4, var11, var25, var8, var26);
        } else {
          return null;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var4 = param0.getCodeBase();
              var3 = og.a(-1, param0, var4).getFile();
              if (param1 == 49) {
                Object discarded$6 = q.a(param0, -8582, new Object[2], "updatelinks");
                Object discarded$7 = q.a(param0, -8582, new Object[2], "updatelinks");
                Object discarded$8 = q.a(param0, -8582, new Object[2], "updatelinks");
                Object discarded$9 = q.a(param0, -8582, new Object[2], "updatelinks");
                Object discarded$10 = q.a(param0, param1 + -8631, new Object[2], "updatelinks");
                Object discarded$11 = q.a(param0, param1 + -8631, new Object[2], "updatelinks");
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        df.a(((wf) this).field_l, ((wf) this).field_c, ((wf) this).field_b);
        if (param0 != 29) {
            ((wf) this).a((byte) -120);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Turn duration (seconds)", "Grid width"};
        field_k = "Playing";
        field_a = "Unfortunately we are unable to create an account for you at this time.";
        field_g = "Owner";
        field_i = "Friends";
    }
}
