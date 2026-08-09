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
        jb var2 = this.field_g.field_a.field_b;
        if (param0 <= 27) {
            jb var3 = (jb) null;
            this.a((byte) 51, (jb) null);
            if (!(this.field_g.field_a != var2)) {
                this.field_h = null;
                return null;
            }
            this.field_h = var2.field_b;
            return var2;
        }
        if (!(this.field_g.field_a != var2)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    final jb a(byte param0, jb param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        jb stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_g.field_a.field_b;
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
            if (this.field_g.field_a == var3) {
              this.field_h = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_h = var3.field_b;
              stackIn_10_0 = (jb) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("tm.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jb) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final jb c(int param0) {
        jb var2 = this.field_h;
        if (!(var2 != this.field_g.field_a)) {
            this.field_h = null;
            return null;
        }
        int var3 = 94 / ((34 - param0) / 47);
        this.field_h = var2.field_d;
        return var2;
    }

    final jb a(jb param0, int param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        jb stackIn_8_0 = null;
        jb stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = this.field_g.field_a.field_d;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != this.field_g.field_a) {
              this.field_h = var3.field_d;
              if (param1 == 200) {
                stackIn_10_0 = (jb) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = (jb) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_h = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("tm.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jb) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = (f[][]) null;
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
        if (param1 == 500) {
          param0 = param0 & 8191;
          if ((param0 ^ -1) <= -4097) {
            L0: {
              if (param0 >= 6144) {
                stackIn_19_0 = fe.field_h[-6144 + param0];
                break L0;
              } else {
                stackIn_19_0 = -fe.field_h[6144 + -param0];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 < 2048) {
                stackIn_15_0 = fe.field_h[-param0 + 2048];
                break L1;
              } else {
                stackIn_15_0 = -fe.field_h[param0 - 2048];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = (a) null;
          param0 = param0 & 8191;
          if ((param0 ^ -1) <= -4097) {
            L2: {
              if (param0 >= 6144) {
                stackIn_9_0 = fe.field_h[-6144 + param0];
                break L2;
              } else {
                stackIn_9_0 = -fe.field_h[6144 + -param0];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 < 2048) {
                stackIn_5_0 = fe.field_h[-param0 + 2048];
                break L3;
              } else {
                stackIn_5_0 = -fe.field_h[param0 - 2048];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final jb d(int param0) {
        jb var2;
        var2 = this.field_g.field_a.field_d;
        if (param0 > 8) {
          if (var2 == this.field_g.field_a) {
            this.field_h = null;
            return null;
          } else {
            this.field_h = var2.field_d;
            return var2;
          }
        } else {
          field_a = (int[]) null;
          if (var2 == this.field_g.field_a) {
            this.field_h = null;
            return null;
          } else {
            this.field_h = var2.field_d;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, dl[] param3, int param4, byte param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param5 == 89) {
                break L1;
              } else {
                tm.a(-52);
                break L1;
              }
            }
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (-1 <= (param4 ^ -1)) {
                  break L2;
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
                  L3: while (true) {
                    if (var10 <= param0) {
                      kh.a(ob.field_b);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param3[1].b(param0, param2, param1);
                      param0 = param0 + var8;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("tm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final jb b(int param0) {
        int var3 = 109 / ((52 - param0) / 43);
        jb var2 = this.field_h;
        if (!(var2 != this.field_g.field_a)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    tm(wb param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new a();
        field_a = new int[]{100, 200, 300, 500, 1000, 100, 300, 500, 100, 200, 500, 1000, 500, 200, 500, 1000, 100};
        field_c = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
