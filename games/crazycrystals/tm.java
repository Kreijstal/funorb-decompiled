/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static a field_b;
    private jb field_h;
    private wb field_g;
    static am field_f;
    static String field_c;
    static int field_e;
    static f[][] field_d;
    static int[] field_a;

    final jb a(byte param0) {
        jb var2 = ((tm) this).field_g.field_a.field_b;
        if (param0 <= 27) {
            Object var3 = null;
            jb discarded$4 = ((tm) this).a((byte) 51, (jb) null);
            if (!(((tm) this).field_g.field_a != var2)) {
                ((tm) this).field_h = null;
                return null;
            }
            ((tm) this).field_h = var2.field_b;
            return var2;
        }
        if (!(((tm) this).field_g.field_a != var2)) {
            ((tm) this).field_h = null;
            return null;
        }
        ((tm) this).field_h = var2.field_b;
        return var2;
    }

    final jb a(byte param0, jb param1) {
        jb var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((tm) this).field_g.field_a.field_b;
        }
        if (param0 <= 36) {
            tm.a(-1);
            if (!(((tm) this).field_g.field_a != var3)) {
                ((tm) this).field_h = null;
                return null;
            }
            ((tm) this).field_h = var3.field_b;
            return var3;
        }
        if (!(((tm) this).field_g.field_a != var3)) {
            ((tm) this).field_h = null;
            return null;
        }
        ((tm) this).field_h = var3.field_b;
        return var3;
    }

    final jb c(int param0) {
        jb var2 = ((tm) this).field_h;
        if (!(var2 != ((tm) this).field_g.field_a)) {
            ((tm) this).field_h = null;
            return null;
        }
        int var3 = 94 / ((34 - param0) / 47);
        ((tm) this).field_h = var2.field_d;
        return var2;
    }

    final jb a(jb param0, int param1) {
        jb var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((tm) this).field_g.field_a.field_d;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (var3 != ((tm) this).field_g.field_a) {
          ((tm) this).field_h = var3.field_d;
          if (param1 != 200) {
            return null;
          } else {
            return var3;
          }
        } else {
          ((tm) this).field_h = null;
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_a = null;
        if (param0 != -11909) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == 500) {
          param0 = param0 & 8191;
          if ((param0 ^ -1) <= -4097) {
            L0: {
              if (param0 >= 6144) {
                stackOut_18_0 = fe.field_h[-6144 + param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -fe.field_h[6144 + -param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 < 2048) {
                stackOut_14_0 = fe.field_h[-param0 + 2048];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -fe.field_h[param0 - 2048];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = null;
          param0 = param0 & 8191;
          if ((param0 ^ -1) <= -4097) {
            L2: {
              if (param0 >= 6144) {
                stackOut_8_0 = fe.field_h[-6144 + param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -fe.field_h[6144 + -param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 < 2048) {
                stackOut_4_0 = fe.field_h[-param0 + 2048];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -fe.field_h[param0 - 2048];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final jb d(int param0) {
        jb var2 = null;
        var2 = ((tm) this).field_g.field_a.field_d;
        if (param0 > 8) {
          if (var2 == ((tm) this).field_g.field_a) {
            ((tm) this).field_h = null;
            return null;
          } else {
            ((tm) this).field_h = var2.field_d;
            return var2;
          }
        } else {
          field_a = null;
          if (var2 == ((tm) this).field_g.field_a) {
            ((tm) this).field_h = null;
            return null;
          } else {
            ((tm) this).field_h = var2.field_d;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, dl[] param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        if (param5 == 89) {
          if (param3 != null) {
            if (-1 <= (param4 ^ -1)) {
              return;
            } else {
              var6 = param3[0].field_n;
              var7 = param3[2].field_n;
              var8 = param3[1].field_n;
              param3[0].b(param0, param2, param1);
              param3[2].b(-var7 + param4 + param0, param2, param1);
              kh.b(ob.field_b);
              kh.a(var6 + param0, param2, param4 + (param0 + -var7), param3[1].field_o + param2);
              var9 = var6 + param0;
              var10 = -var7 + (param4 + param0);
              param0 = var9;
              L0: while (true) {
                if (var10 <= param0) {
                  kh.a(ob.field_b);
                  return;
                } else {
                  param3[1].b(param0, param2, param1);
                  param0 = param0 + var8;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          tm.a(-52);
          if (param3 != null) {
            if (-1 <= (param4 ^ -1)) {
              return;
            } else {
              var6 = param3[0].field_n;
              var7 = param3[2].field_n;
              var8 = param3[1].field_n;
              param3[0].b(param0, param2, param1);
              param3[2].b(-var7 + param4 + param0, param2, param1);
              kh.b(ob.field_b);
              kh.a(var6 + param0, param2, param4 + (param0 + -var7), param3[1].field_o + param2);
              var9 = var6 + param0;
              var10 = -var7 + (param4 + param0);
              param0 = var9;
              L1: while (true) {
                if (var10 <= param0) {
                  kh.a(ob.field_b);
                  return;
                } else {
                  param3[1].b(param0, param2, param1);
                  param0 = param0 + var8;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final jb b(int param0) {
        int var3 = 109 / ((52 - param0) / 43);
        jb var2 = ((tm) this).field_h;
        if (!(var2 != ((tm) this).field_g.field_a)) {
            ((tm) this).field_h = null;
            return null;
        }
        ((tm) this).field_h = var2.field_b;
        return var2;
    }

    tm(wb param0) {
        ((tm) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new a();
        field_a = new int[]{100, 200, 300, 500, 1000, 100, 300, 500, 100, 200, 500, 1000, 500, 200, 500, 1000, 100};
        field_c = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
