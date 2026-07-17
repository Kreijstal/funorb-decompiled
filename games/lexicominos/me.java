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

    private final void a(int param0, wf param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                if (param0 == 2) {
                  var4_int = param1.d(true);
                  ((me) this).field_r = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((me) this).field_r[var5] = param1.b(-1698573656);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param0 == 3) {
                    var4_int = param1.d(true);
                    ((me) this).field_s = new int[var4_int];
                    ((me) this).field_q = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param1.b(-1698573656);
                          var7 = gb.a(var6, 2121865922);
                          if (null == var7) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (4 == param0) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                int discarded$1 = -125;
                ((me) this).field_p = dc.a(param1.c(false), '<');
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("me.E(").append(param0).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 10601 + 41);
        }
    }

    final static void e() {
        RuntimeException var1 = null;
        th var1_ref = null;
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
        th stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException decompiledCaughtException = null;
        th stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = ig.field_a;
            stackOut_1_0 = (th) var1_ref;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
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
                var5 = var1_ref;
                var6 = ((wf) (Object) var5).d(true);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var15 = (vi) (Object) ci.field_f.a(true);
                    if (null == var15) {
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
                if (var2 != 1) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "me.F(" + 0 + 41);
        }
    }

    me() {
    }

    public static void d() {
        field_t = null;
        field_u = null;
        field_w = null;
    }

    final String c(int param0) {
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        var5 = new StringBuilder(80);
        var2 = var5;
        if (((me) this).field_p == null) {
          return "";
        } else {
          L0: {
            StringBuilder discarded$3 = var5.append(((me) this).field_p[0]);
            if (param0 < -74) {
              break L0;
            } else {
              field_t = null;
              break L0;
            }
          }
          var3 = 1;
          L1: while (true) {
            if (((me) this).field_p.length <= var3) {
              return var2.toString();
            } else {
              StringBuilder discarded$4 = var2.append("...");
              StringBuilder discarded$5 = var5.append(((me) this).field_p[var3]);
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(wf param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.d(true);
              if (0 != var3_int) {
                int discarded$1 = 10601;
                this.a(var3_int, param0);
                continue L1;
              } else {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    field_u = null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("me.D(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
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
        int var3 = 0;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (null == ((me) this).field_r) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (((me) this).field_r.length <= var2) {
                break L0;
              } else {
                ((me) this).field_r[var2] = tb.a(((me) this).field_r[var2], 32768);
                var2++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param0 <= -66) {
            break L2;
          } else {
            me.c((byte) -21);
            break L2;
          }
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
