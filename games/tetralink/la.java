/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends jd {
    static String field_k;
    static ob field_g;
    static String[] field_h;
    static db field_i;
    static String field_f;
    private java.nio.ByteBuffer field_d;
    static String[] field_l;
    static int field_e;
    static String field_j;

    final static void a(String param0, bk param1, jb param2, boolean param3, int param4) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                field_l = (String[]) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (var7 >= param0.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param0.charAt(var7);
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = param1.field_j[0] + (var5_int >> -117301816) + param2.b(param0.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if (-1 == var6) {
                    L5: {
                      if (var8 == 32) {
                        var5_int = var5_int + param4;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param1.field_j[var7] = param1.field_j[0] + ((var5_int >> 275886856) + param2.b(param0.substring(0, 1 + var7))) + -param2.a((char) var8);
                    break L4;
                  } else {
                    param1.field_j[var7] = var6;
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("la.I(");

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
          throw oi.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final byte[] a(int param0) {
        byte[] var4 = new byte[this.field_d.capacity()];
        byte[] var2 = var4;
        this.field_d.position(0);
        this.field_d.get(var4);
        int var3 = -92 % ((29 - param0) / 63);
        return var4;
    }

    final static String a(long param0, boolean param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = TetraLink.field_J;
        if (!param1) {
            String var12 = (String) null;
            la.a((String) null, -122);
        }
        if (param0 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param0) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (-1L != (var4 ^ -1L)) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = nc.field_a[(int)(var7 + -(param0 * 37L))];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(int param0, byte[] param1) {
        try {
            if (param0 != -10543) {
                field_f = (String) null;
            }
            this.field_d = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_d.position(0);
            this.field_d.put(param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static rj a(String param0, int param1) {
        RuntimeException var2 = null;
        rj stackIn_5_0 = null;
        rj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!oa.field_y.c(false)) {
                break L1;
              } else {
                if (param0.equals(oa.field_y.a((byte) 72))) {
                  break L1;
                } else {
                  oa.field_y = il.a(param0, 14781);
                  break L1;
                }
              }
            }
            if (param1 == 0) {
              stackIn_7_0 = oa.field_y;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (rj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("la.H(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void c(int param0) {
        if (param0 != 37) {
            la.c(98);
        }
        field_k = null;
        field_j = null;
        field_l = null;
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = null;
    }

    la() {
    }

    final static void d(int param0) {
        if (cd.field_c != null) {
            return;
        }
        co.field_p = new String[11];
        co.field_p[7] = am.field_d;
        co.field_p[3] = lf.field_c;
        co.field_p[2] = bh.field_o;
        co.field_p[0] = pg.field_b;
        co.field_p[9] = jm.field_e;
        co.field_p[8] = ph.field_x;
        cd.field_c = new String[24];
        co.field_p[6] = fo.field_db;
        co.field_p[4] = lf.field_c;
        co.field_p[1] = lf.field_c;
        cd.field_c[18] = qk.field_a;
        cd.field_c[5] = am.field_d;
        cd.field_c[6] = vd.field_g;
        cd.field_c[15] = tg.field_c;
        cd.field_c[7] = pg.field_b;
        cd.field_c[23] = fa.field_a;
        cd.field_c[0] = gl.field_q;
        cd.field_c[8] = ci.field_A;
        cd.field_c[16] = ec.field_f;
        if (param0 >= -106) {
            la.a(126L, false);
        }
        cd.field_c[2] = lm.field_l;
        cd.field_c[11] = cl.field_a;
        cd.field_c[19] = bo.field_h;
        cd.field_c[9] = kj.field_a;
        cd.field_c[4] = fo.field_db;
        cd.field_c[10] = field_f;
        cd.field_c[14] = en.field_M;
        cd.field_c[1] = dl.field_n;
        cd.field_c[17] = md.field_z;
        cd.field_c[3] = ph.field_x;
        cd.field_c[13] = ng.field_E;
        cd.field_c[12] = sd.field_ob;
        cd.field_c[21] = ka.field_g[1];
        cd.field_c[20] = ka.field_g[0];
        cd.field_c[22] = hl.field_ub;
    }

    static {
        field_h = new String[]{"All scores", "My scores", "Best each"};
        field_k = "Loading models";
        field_f = "Offer draw";
        field_l = new String[]{"Turn time", "Rated game?", "Allow spectators?"};
        field_i = new db(9, 0, 4, 1);
        field_j = "Respect";
    }
}
