/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ai {
    static mf field_p;
    int[] field_g;
    int field_m;
    int field_s;
    int field_q;
    static ud[] field_n;
    int field_r;
    int field_h;
    int field_j;
    static String field_l;
    int field_t;
    long field_o;
    static int[] field_k;
    static String field_i;

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 != 4) {
            field_p = null;
        }
        if (param2) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        return hc.field_e[var4];
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        qg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ii var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Bounce.field_N;
        try {
          L0: {
            var15 = jc.field_g;
            var2 = var15.d((byte) -77);
            var3 = (qg) (Object) cf.field_b.a((byte) -60);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_h != var2) {
                    var3 = (qg) (Object) cf.field_b.d((byte) -22);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                int discarded$1 = 18;
                kc.a();
                return;
              } else {
                L3: {
                  var4 = var15.d((byte) -127);
                  if (var4 != 0) {
                    var5 = var3.field_i;
                    wh.field_c[0] = ja.field_b;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        ng.a(-15936, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            bj.a((byte) -125, var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = q.field_M;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var8 <= var13) {
                                    var3.c(2);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = w.field_f[var13 + var5];
                                      var6[1][var14] = wh.field_c[var11];
                                      var19[1][4 * var14] = sj.field_j[var11];
                                      var19[1][4 * var14 + 1] = nh.field_S[var11];
                                      var19[1][4 * var14 + 2] = gk.field_i[var11];
                                      var19[1][3 + 4 * var14] = th.field_c[var11];
                                      if (!s.a(wh.field_c[var11], -97)) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = w.field_f[var9];
                                  var6[0][var10] = wh.field_c[var11];
                                  var19[0][4 * var10] = sj.field_j[var11];
                                  var19[0][var10 * 4 - -1] = nh.field_S[var11];
                                  var19[0][var10 * 4 - -2] = gk.field_i[var11];
                                  var19[0][4 * var10 + 3] = th.field_c[var11];
                                  if (!s.a(wh.field_c[var11], -2)) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              vd.a((byte) 72, (wi) (Object) var15);
                              if (var6_int != 0) {
                                ij.a(de.field_b, var6_int, qe.field_i, 0, ed.field_b, kf.field_a);
                                break L10;
                              } else {
                                ij.a(de.field_b, var6_int, qe.field_i, 0, ed.field_b, kf.field_a);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        wh.field_c[var6_int] = var15.b(true);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.c(2);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "he.A(" + 1 + ')');
        }
    }

    public static void b() {
        field_i = null;
        field_n = null;
        field_p = null;
        field_l = null;
        field_k = null;
    }

    he(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((he) this).field_q = param4;
            ((he) this).field_r = param1;
            int fieldTemp$0 = el.field_k;
            el.field_k = el.field_k + 1;
            ((he) this).field_j = 65535 & fieldTemp$0;
            ((he) this).field_t = param5;
            ((he) this).field_h = param3;
            ((he) this).field_g = param6;
            ((he) this).field_s = param2;
            ((he) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "he.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Checking";
        field_n = new ud[3];
        field_p = new mf();
        field_i = "Unpacking graphics";
    }
}
