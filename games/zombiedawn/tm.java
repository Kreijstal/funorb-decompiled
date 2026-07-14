/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends le {
    static int[] field_n;
    static vn field_m;
    static int[] field_i;
    static int[] field_l;
    static vn[] field_h;
    fn field_j;
    static int[] field_k;
    static String field_o;

    final static void a(int param0, int param1, int param2, vn[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawn.field_J;
          if (param3 == null) {
            break L0;
          } else {
            if (param5 > 0) {
              var6 = param3[0].field_r;
              var7 = param3[2].field_r;
              var8 = param3[1].field_r;
              param3[0].c(param0, param2, param4);
              param3[2].c(-var7 + (param5 + param0), param2, param4);
              bi.b(eo.field_c);
              bi.c(param0 + var6, param2, param5 + param0 + -var7, param3[1].field_q + param2);
              var9 = param0 + var6;
              var10 = param0 + param5 + -var7;
              param0 = var9;
              L1: while (true) {
                if (param0 >= var10) {
                  if (param1 == 32421) {
                    bi.a(eo.field_c);
                    return;
                  } else {
                    tm.a(-59, (byte) 126, false, -69);
                    bi.a(eo.field_c);
                    return;
                  }
                } else {
                  param3[1].c(param0, param2, param4);
                  param0 = param0 + var8;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static Class b(byte param0, String param1) throws ClassNotFoundException {
        if (param1.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (!param1.equals((Object) (Object) "S")) {
              if (!param1.equals((Object) (Object) "J")) {
                if (!param1.equals((Object) (Object) "Z")) {
                  if (param1.equals((Object) (Object) "F")) {
                    return Float.TYPE;
                  } else {
                    if (param1.equals((Object) (Object) "D")) {
                      return Double.TYPE;
                    } else {
                      if (param0 > 64) {
                        if (param1.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param1);
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  return Boolean.TYPE;
                }
              } else {
                return Long.TYPE;
              }
            } else {
              return Short.TYPE;
            }
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -5364) {
          return;
        } else {
          field_m = null;
          field_l = null;
          field_i = null;
          field_n = null;
          field_k = null;
          field_h = null;
          return;
        }
    }

    final static eo a(byte param0, String param1) {
        if (vh.field_c != tk.field_a) {
          if (param0 == 51) {
            if (tk.field_a == hm.field_H) {
              if (!param1.equals((Object) (Object) kk.field_k)) {
                r.field_G = null;
                tk.field_a = vh.field_c;
                kk.field_k = param1;
                return null;
              } else {
                tk.field_a = ic.field_S;
                return r.field_G;
              }
            } else {
              r.field_G = null;
              tk.field_a = vh.field_c;
              kk.field_k = param1;
              return null;
            }
          } else {
            field_n = null;
            if (tk.field_a == hm.field_H) {
              if (!param1.equals((Object) (Object) kk.field_k)) {
                r.field_G = null;
                tk.field_a = vh.field_c;
                kk.field_k = param1;
                return null;
              } else {
                tk.field_a = ic.field_S;
                return r.field_G;
              }
            } else {
              r.field_G = null;
              tk.field_a = vh.field_c;
              kk.field_k = param1;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    tm(int param0) {
        ((tm) this).field_j = fn.a(vb.field_D[param0], 100, 256);
        hn discarded$0 = aa.a(120, ((tm) this).field_j);
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int[] var4 = null;
        int[] var5 = null;
        boolean[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        boolean[] var15 = null;
        var8 = ZombieDawn.field_J;
        var9 = new int[1 + tl.field_g.length];
        var13 = var9;
        var10 = var13;
        var4 = var10;
        var14 = new int[tl.field_g.length + 1];
        var11 = var14;
        var5 = var11;
        var15 = new boolean[1 + tl.field_g.length];
        var12 = var15;
        var6 = var12;
        var7 = 0;
        L0: while (true) {
          if (tl.field_g.length <= var7) {
            var4[-1 + var13.length] = param0;
            var5[var14.length + -1] = param3;
            var6[-1 + var15.length] = param2;
            oo.field_U = var5;
            ka.field_h = var6;
            tl.field_g = var4;
            if (param1 != -77) {
              field_m = null;
              return;
            } else {
              return;
            }
          } else {
            var9[var7] = tl.field_g[var7];
            var5[var7] = oo.field_U[var7];
            var6[var7] = ka.field_h[var7];
            var7++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[9];
        field_n = new int[9];
        field_k = new int[9];
        field_i = new int[9];
        field_n[0] = 320;
        field_i[0] = 5;
        field_l[0] = 3;
        field_k[0] = 47;
        field_n[1] = 344;
        field_i[1] = 5;
        field_l[1] = 4;
        field_n[2] = 376;
        field_k[1] = 50;
        field_i[2] = 5;
        field_l[2] = 3;
        field_n[3] = 400;
        field_k[2] = 47;
        field_i[3] = 5;
        field_l[3] = 3;
        field_k[3] = 47;
        field_n[4] = 424;
        field_i[4] = 5;
        field_l[4] = 3;
        field_k[4] = 47;
        field_n[5] = 296;
        field_i[5] = 6;
        field_l[5] = 3;
        field_k[5] = 44;
        field_n[6] = 272;
        field_i[6] = 6;
        field_l[6] = 3;
        field_n[7] = 216;
        field_k[6] = 44;
        field_i[7] = 5;
        field_l[7] = 4;
        field_n[8] = 192;
        field_k[7] = 55;
        field_i[8] = 5;
        field_l[8] = 3;
        field_k[8] = 47;
    }
}
