/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ma {
    int field_s;
    static String field_u;
    qa field_l;
    static lr field_t;
    int field_p;
    static String field_m;
    int field_q;
    static vh field_v;
    int field_n;
    int field_w;
    static int field_r;
    static String field_o;

    final static void a(int[][] param0, bf[] param1, pq[] param2, int param3) {
        pq[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pq[] var6 = null;
        pq[] var7 = null;
        int var8 = 0;
        hb.field_s = -1;
        td.field_b = 0;
        or.field_l = 0;
        var6 = param2;
        var4 = var6;
        var5 = 0;
        L0: while (true) {
          if (var6.length <= var5) {
            var4_int = 0;
            L1: while (true) {
              var4_int = oe.a(param1, var4_int, param2, param0, param3 + 0);
              if ((oe.a(param1, var4_int, param2, param0, param3 + 0) ^ -1) == 0) {
                var7 = param2;
                var4 = var7;
                var8 = param3;
                var5 = var8;
                L2: while (true) {
                  if (var8 >= var7.length) {
                    return;
                  } else {
                    if (var7[var8].field_s) {
                      var7[var8].a(false);
                      var8++;
                      continue L2;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              } else {
                continue L1;
              }
            }
          } else {
            var6[var5].field_w = 0;
            var5++;
            continue L0;
          }
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_t = null;
        field_m = null;
        field_u = null;
        field_v = null;
        if (param0 < 4) {
            field_u = null;
        }
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        qo.field_x = param1;
        qg.field_a = param3;
        wf.a(param0, gg.field_a, -126);
        int var4 = -110 % ((param2 - -30) / 57);
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        if (param0 == 1) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= param1.length()) {
              return false;
            } else {
              var3 = param1.charAt(var2);
              if (!vq.a((char) var3, 22987)) {
                if (!kh.a((char) var3, (byte) 120)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, boolean param1) {
        oa.a(param1, (byte) 80);
        if (param0 != 55) {
            Object var3 = null;
            String discarded$0 = qa.a((String) null, 95);
        }
        hm.a(param1, param0 + -19268);
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var2 > var4; var4++) {
            var3[var2 + (-1 + -var4)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    final static void a(byte param0, int param1, lr param2, String param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Pool.field_O;
          var6 = param2.b(param3);
          var7 = param2.field_w + param2.field_C;
          var8 = 1;
          if (var6 > param1) {
            L1: {
              var9 = var6 / param1;
              var10 = 2 * ((-1 + (var6 % param1 + var9)) / var9) + param1;
              if (null == wg.field_Mb) {
                wg.field_Mb = new String[16];
                break L1;
              } else {
                break L1;
              }
            }
            var8 = param2.a(param3, new int[1], wg.field_Mb);
            var7 = var7 * var8;
            var6 = 0;
            var11 = 0;
            L2: while (true) {
              if (var11 >= var8) {
                break L0;
              } else {
                var12 = param2.b(wg.field_Mb[var11]);
                if (var12 > var6) {
                  var6 = var12;
                  var11++;
                  continue L2;
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 == 71) {
          L3: {
            var9 = pa.field_H;
            if (var9 + var6 + 6 <= qh.field_l) {
              break L3;
            } else {
              var9 = -6 + -var6 + qh.field_l;
              break L3;
            }
          }
          L4: {
            var10 = -param2.field_L + (pm.field_p + 32);
            if (qh.field_f < var7 + (var10 + 6)) {
              var10 = pm.field_p + (-var7 + -6);
              break L4;
            } else {
              break L4;
            }
          }
          qh.b(var9, var10, 6 + var6, 6 + var7, param4);
          qh.f(1 + var9, 1 + var10, var6 - -4, 4 + var7, param5);
          int discarded$1 = param2.a(param3, 3 + var9, var10 - -3, var6, var7, param4, -1, 0, 0, param2.field_w + param2.field_C);
          return;
        } else {
          return;
        }
    }

    qa(int param0, int param1, int param2, int param3, int param4) {
        ((qa) this).field_s = param0;
        ((qa) this).field_q = param4;
        ((qa) this).field_p = param2;
        ((qa) this).field_n = param1;
        ((qa) this).field_w = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Reject";
        field_m = "Respect";
        field_o = "Players: <%0>/<%1>";
    }
}
