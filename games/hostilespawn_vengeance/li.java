/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends hi {
    static int[] field_u;
    static nd field_x;
    private ig field_w;
    static int field_s;
    static int field_p;
    static String field_v;
    static bd field_t;
    static boolean field_o;
    static bd field_y;
    static boolean[] field_r;
    static int field_q;

    final static void a(int param0, int param1) {
        int var2 = -40 % ((param1 - 55) / 37);
        ch.field_a = 1000000000L / (long)param0;
    }

    li(ig param0, ig param1) {
        super(param0);
        ((li) this).field_w = param1;
    }

    final bm a(String param0, byte param1) {
        bg var3_ref = null;
        if (!(!(((li) this).field_w instanceof sk))) {
            var3_ref = ((sk) (Object) ((li) this).field_w).a((byte) 111);
            if (var3_ref != null) {
                if (!(var3_ref.b(-71) == nd.field_d)) {
                    return bi.field_d;
                }
            }
        }
        int var3 = 32 % ((param1 - 3) / 42);
        return !param0.equals((Object) (Object) ((li) this).field_w.field_n) ? bi.field_d : nd.field_d;
    }

    final static nc a(byte[] param0, int param1) {
        if (param1 != 5116) {
            return null;
        }
        if (param0 == null) {
            return null;
        }
        nc var2 = new nc(param0, th.field_Jb, nh.field_O, sf.field_X, hd.field_r, bf.field_d, ja.field_e);
        uj.d(-126);
        return var2;
    }

    public static void d(byte param0) {
        field_u = null;
        field_r = null;
        field_y = null;
        if (param0 > -34) {
            li.d((byte) 88);
        }
        field_t = null;
        field_v = null;
        field_x = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          si.g(param4, param2, param7, param0, param6);
          si.g(param7, param0, param5, param3, param6);
          si.g(param5, param3, param4, param2, param6);
          if (param0 < param2) {
            var8 = param4;
            param4 = param7;
            param7 = var8;
            var8 = param2;
            param2 = param0;
            param0 = var8;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 < param2) {
            var8 = param4;
            param4 = param5;
            param5 = var8;
            var8 = param2;
            param2 = param3;
            param3 = var8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 <= param3) {
            break L2;
          } else {
            var8 = param7;
            param7 = param5;
            param5 = var8;
            var8 = param0;
            param0 = param3;
            param3 = var8;
            break L2;
          }
        }
        L3: {
          if (param5 <= param7) {
            var10 = param2;
            L4: while (true) {
              if (var10 >= param0) {
                var10 = param0;
                L5: while (true) {
                  if (var10 >= param3) {
                    break L3;
                  } else {
                    var8 = param4 - -((param5 + -param4) * (var10 + -param2) / (-param2 + param3));
                    var9 = (-param0 + var10) * (-param7 + param5) / (param3 + -param0) + param7;
                    si.a(var8, var10, 1 + (-var8 + var9), param6);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var8 = param4 - -((param5 - param4) * (-param2 + var10) / (-param2 + param3));
                var9 = param4 + (-param4 + param7) * (var10 + -param2) / (param0 + -param2);
                si.a(var8, var10, 1 + -var8 + var9, param6);
                var10++;
                continue L4;
              }
            }
          } else {
            var10 = param2;
            L6: while (true) {
              if (param0 <= var10) {
                var10 = param0;
                L7: while (true) {
                  if (param3 <= var10) {
                    break L3;
                  } else {
                    var9 = param4 + (-param4 + param5) * (-param2 + var10) / (-param2 + param3);
                    var8 = param7 + (var10 + -param0) * (-param7 + param5) / (param3 + -param0);
                    si.a(var8, var10, -var8 + (var9 - -1), param6);
                    var10++;
                    continue L7;
                  }
                }
              } else {
                var9 = param4 + (var10 - param2) * (-param4 + param5) / (-param2 + param3);
                var8 = (-param4 + param7) * (-param2 + var10) / (-param2 + param0) + param4;
                si.a(var8, var10, var9 - (var8 + -1), param6);
                var10++;
                continue L6;
              }
            }
          }
        }
        L8: {
          if (param1 == -1) {
            break L8;
          } else {
            field_v = null;
            break L8;
          }
        }
    }

    final String a(byte param0, String param1) {
        bg var3_ref = null;
        if (((li) this).field_w instanceof sk) {
            var3_ref = ((sk) (Object) ((li) this).field_w).a((byte) 122);
            if (var3_ref != null) {
                if (var3_ref.b(-112) == nd.field_d) {
                    if (!param1.equals((Object) (Object) ((li) this).field_w.field_n)) {
                        return qm.field_Q;
                    }
                }
                return var3_ref.a(-60);
            }
        }
        int var3 = 83 / ((-24 - param0) / 35);
        if (param1.equals((Object) (Object) ((li) this).field_w.field_n)) {
            return null;
        }
        return qm.field_Q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_u = new int[]{0, 0, 64, 192, 128};
        field_x = new nd(4, 1, 1, 1);
        field_v = "Orb coins: ";
        field_p = 0;
        field_r = new boolean[2];
    }
}
