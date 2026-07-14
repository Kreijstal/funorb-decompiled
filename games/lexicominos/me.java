/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ca {
    private int[][] field_q;
    static int field_v;
    private int[] field_s;
    int[] field_r;
    private String[] field_p;
    static String field_t;
    static String field_u;
    static boolean[] field_w;

    private final void a(int param0, wf param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Lexicominos.field_L ? 1 : 0;
          if (1 != param0) {
            if (-3 == (param0 ^ -1)) {
              var4 = param1.d(true);
              ((me) this).field_r = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((me) this).field_r[var5] = param1.b(-1698573656);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (param0 == 3) {
                var4 = param1.d(true);
                ((me) this).field_s = new int[var4];
                ((me) this).field_q = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param1.b(param2 + -1698584257);
                    var7 = gb.a(var6, 2121865922);
                    if (var7 != null) {
                      ((me) this).field_s[var5] = var6;
                      ((me) this).field_q[var5] = new int[var7.field_b];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_b > var8) {
                          ((me) this).field_q[var5][var8] = param1.b(-1698573656);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (4 == param0) {
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            ((me) this).field_p = dc.a(param1.c(false), '<', (byte) -125);
            break L0;
          }
        }
        L4: {
          if (param2 == 10601) {
            break L4;
          } else {
            field_w = null;
            break L4;
          }
        }
    }

    final static void e(boolean param0) {
        th var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        th var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        vb var12 = null;
        vi var13 = null;
        int[] var14 = null;
        vi var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        th stackIn_1_0 = null;
        th stackIn_2_0 = null;
        th stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        th stackOut_0_0 = null;
        th stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        th stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          var1 = ig.field_a;
          stackOut_0_0 = (th) var1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_2_0 = (th) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (th) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var2 = ((th) (Object) stackIn_3_0).d(stackIn_3_1 != 0);
          if (var2 == 0) {
            var11 = wj.b(26770);
            var18 = var11;
            var17 = var18;
            var16 = var17;
            var14 = var16;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var1;
            var6 = ((wf) (Object) var5).d(true);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var15 = (vi) (Object) ci.field_f.a(true);
                if (var15 == null) {
                  ck.b((byte) -49);
                  return;
                } else {
                  var15.field_i = var18[0];
                  var15.field_h = true;
                  var15.field_k = var3;
                  var15.b((byte) -128);
                  break L1;
                }
              } else {
                var10[var7] = ((wf) (Object) var5).d((byte) 19);
                var7++;
                continue L2;
              }
            }
          } else {
            if ((var2 ^ -1) != -2) {
              if (var2 == 2) {
                var13 = (vi) (Object) ci.field_f.a(true);
                if (var13 != null) {
                  var13.field_k = wj.b(26770);
                  var13.field_i = var13.field_k[0];
                  var13.field_h = true;
                  var13.b((byte) -116);
                  break L1;
                } else {
                  ck.b((byte) -68);
                  return;
                }
              } else {
                uj.a("A1: " + qj.h(-94), (Throwable) null, 1);
                ck.b((byte) -32);
                break L1;
              }
            } else {
              var12 = (vb) (Object) jl.field_a.a(true);
              if (var12 != null) {
                var12.b((byte) -125);
                break L1;
              } else {
                ck.b((byte) -125);
                return;
              }
            }
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            field_w = null;
            break L3;
          }
        }
    }

    me() {
    }

    public static void d(int param0) {
        if (param0 != 80) {
            field_u = null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    final String c(int param0) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(((me) this).field_p != null)) {
            return "";
        }
        StringBuilder discarded$7 = var5.append(((me) this).field_p[0]);
        if (param0 >= -74) {
            field_t = null;
        }
        for (var3 = 1; ((me) this).field_p.length > var3; var3++) {
            StringBuilder discarded$8 = var2.append("...");
            StringBuilder discarded$9 = var5.append(((me) this).field_p[var3]);
        }
        return var2.toString();
    }

    final void a(wf param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          var3 = param0.d(true);
          if (0 != var3) {
            this.a(var3, param0, 10601);
            continue L0;
          } else {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final static void c(byte param0) {
        sa.a((byte) 88, kk.c(-14047));
        if (param0 >= -4) {
            field_w = null;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (null != ((me) this).field_r) {
            for (var2 = 0; ((me) this).field_r.length > var2; var2++) {
                ((me) this).field_r[var2] = tb.a(((me) this).field_r[var2], 32768);
            }
        }
        if (param0 > -66) {
            me.c((byte) -21);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Email address is unavailable";
        field_u = "You are not currently logged in to the<nbsp>game.";
    }
}
