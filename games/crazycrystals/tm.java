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
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        jb stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        jb stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((tm) this).field_g.field_a.field_b;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            L2: {
              if (param0 > 36) {
                break L2;
              } else {
                tm.a(-1);
                break L2;
              }
            }
            if (((tm) this).field_g.field_a == var3) {
              ((tm) this).field_h = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (jb) (Object) stackIn_8_0;
            } else {
              ((tm) this).field_h = var3.field_b;
              stackOut_9_0 = (jb) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("tm.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
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
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        jb stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = ((tm) this).field_g.field_a.field_d;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != ((tm) this).field_g.field_a) {
              ((tm) this).field_h = var3.field_d;
              if (param1 == 200) {
                stackOut_9_0 = (jb) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (jb) (Object) stackIn_8_0;
              }
            } else {
              ((tm) this).field_h = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (jb) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("tm.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          L0: {
            if (param0 >= 6144) {
              stackOut_7_0 = fe.field_h[-6144 + param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -fe.field_h[6144 + -param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 2048) {
              stackOut_3_0 = fe.field_h[-param0 + 2048];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -fe.field_h[param0 - 2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
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

    final static void a(int param0, int param1, int param2, dl[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var6_int = param3[0].field_n;
                  var7 = param3[2].field_n;
                  var8 = param3[1].field_n;
                  param3[0].b(param0, param2, param1);
                  param3[2].b(-var7 + param4 + param0, param2, param1);
                  kh.b(ob.field_b);
                  kh.a(var6_int + param0, param2, param4 + (param0 + -var7), param3[1].field_o + param2);
                  var9 = var6_int + param0;
                  var10 = -var7 + (param4 + param0);
                  param0 = var9;
                  L2: while (true) {
                    if (var10 <= param0) {
                      kh.a(ob.field_b);
                      break L0;
                    } else {
                      param3[1].b(param0, param2, param1);
                      param0 = param0 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("tm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ',' + 89 + ')');
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
        try {
            ((tm) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
