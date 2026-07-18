/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static volatile int field_a;
    private int field_d;
    private w[] field_i;
    private long field_e;
    static ka[] field_k;
    static String field_c;
    static int field_f;
    static String[][] field_h;
    private w field_j;
    static String field_b;
    static int field_g;

    final w a(boolean param0, long param1) {
        w var4 = null;
        w var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        ((aa) this).field_e = param1;
        var4 = ((aa) this).field_i[(int)((long)(((aa) this).field_d - 1) & param1)];
        ((aa) this).field_j = var4.field_k;
        L0: while (true) {
          if (((aa) this).field_j == var4) {
            ((aa) this).field_j = null;
            if (param0) {
              return null;
            } else {
              aa.a(-111);
              return null;
            }
          } else {
            if (param1 != ((aa) this).field_j.field_l) {
              ((aa) this).field_j = ((aa) this).field_j.field_k;
              continue L0;
            } else {
              var5 = ((aa) this).field_j;
              ((aa) this).field_j = ((aa) this).field_j.field_k;
              return var5;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_b = null;
        field_k = null;
        if (param0 != 2432) {
            aa.a(-83, -115, 30, -114, -9, 120, 10, -28);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        if (param5 != 0) {
          field_a = 117;
          if (param7 <= param6) {
            if (param6 >= param4) {
              if (param4 <= param7) {
                ni.a(param4, (byte) -83, param6, param3, param0, param7, qg.field_i, param2, param1);
                return;
              } else {
                ni.a(param7, (byte) 91, param6, param3, param2, param4, qg.field_i, param0, param1);
                return;
              }
            } else {
              ni.a(param7, (byte) 111, param4, param3, param1, param6, qg.field_i, param0, param2);
              return;
            }
          } else {
            if (param7 >= param4) {
              if (param6 >= param4) {
                ni.a(param4, (byte) -126, param7, param3, param1, param6, qg.field_i, param2, param0);
                return;
              } else {
                ni.a(param6, (byte) -75, param7, param3, param2, param4, qg.field_i, param1, param0);
                return;
              }
            } else {
              ni.a(param6, (byte) -55, param4, param3, param0, param7, qg.field_i, param1, param2);
              return;
            }
          }
        } else {
          if (param7 <= param6) {
            if (param6 >= param4) {
              if (param4 <= param7) {
                ni.a(param4, (byte) -83, param6, param3, param0, param7, qg.field_i, param2, param1);
                return;
              } else {
                ni.a(param7, (byte) 91, param6, param3, param2, param4, qg.field_i, param0, param1);
                return;
              }
            } else {
              ni.a(param7, (byte) 111, param4, param3, param1, param6, qg.field_i, param0, param2);
              return;
            }
          } else {
            if (param7 >= param4) {
              if (param6 >= param4) {
                ni.a(param4, (byte) -126, param7, param3, param1, param6, qg.field_i, param2, param0);
                return;
              } else {
                ni.a(param6, (byte) -75, param7, param3, param2, param4, qg.field_i, param1, param0);
                return;
              }
            } else {
              ni.a(param6, (byte) -55, param4, param3, param0, param7, qg.field_i, param1, param2);
              return;
            }
          }
        }
    }

    final w a(byte param0) {
        w var2 = null;
        w var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null != ((aa) this).field_j) {
          if (param0 > 122) {
            var2 = ((aa) this).field_i[(int)((long)(((aa) this).field_d - 1) & ((aa) this).field_e)];
            L0: while (true) {
              if (((aa) this).field_j != var2) {
                if (~((aa) this).field_e != ~((aa) this).field_j.field_l) {
                  ((aa) this).field_j = ((aa) this).field_j.field_k;
                  continue L0;
                } else {
                  var3 = ((aa) this).field_j;
                  ((aa) this).field_j = ((aa) this).field_j.field_k;
                  return var3;
                }
              } else {
                ((aa) this).field_j = null;
                return null;
              }
            }
          } else {
            ((aa) this).field_e = 17L;
            var2 = ((aa) this).field_i[(int)((long)(((aa) this).field_d - 1) & ((aa) this).field_e)];
            L1: while (true) {
              if (((aa) this).field_j != var2) {
                if (~((aa) this).field_e != ~((aa) this).field_j.field_l) {
                  ((aa) this).field_j = ((aa) this).field_j.field_k;
                  continue L1;
                } else {
                  var3 = ((aa) this).field_j;
                  ((aa) this).field_j = ((aa) this).field_j.field_k;
                  return var3;
                }
              } else {
                ((aa) this).field_j = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    aa(int param0) {
        int var2 = 0;
        w var3 = null;
        ((aa) this).field_i = new w[param0];
        ((aa) this).field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            w dupTemp$0 = new w();
            var3 = dupTemp$0;
            ((aa) this).field_i[var2] = dupTemp$0;
            var3.field_i = var3;
            var3.field_k = var3;
        }
    }

    final void a(long param0, w param1, int param2) {
        w var5 = null;
        try {
            if (param1.field_i != null) {
                param1.a(12695);
            }
            var5 = ((aa) this).field_i[(int)(param0 & (long)(((aa) this).field_d + -1))];
            param1.field_k = var5;
            param1.field_i = var5.field_i;
            param1.field_i.field_k = param1;
            param1.field_l = param0;
            param1.field_k.field_i = param1;
            int var6 = 87 / ((35 - param2) / 63);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = "Use this alternative as your account name";
        field_h = new String[][]{new String[18], new String[12], new String[7], new String[14], new String[9], new String[1]};
        field_b = "Discard";
    }
}
