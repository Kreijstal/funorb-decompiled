/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w extends f {
    static long field_I;
    boolean field_E;
    static String[][] field_J;
    private tc field_F;
    static bi field_D;
    private int field_G;
    static String field_H;

    final static void a(String[] args, int param1, sq param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param2.field_t = bg.a(args[0], 107);
              param2.field_b = bg.a(args[1], 108);
              param2.field_j = bg.a(args[2], 120);
              param2.field_q = bg.a(args[3], 100);
              param2.field_n = param1;
              if (param3 <= -11) {
                break L1;
              } else {
                w.a(-61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("w.BA(");

            if (args == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        String var6 = "(" + rm.field_e + " " + tp.field_g + " " + kp.field_n + ") " + ej.field_e;
        String var1 = var6;
        if (param0 != 16738) {
            return (String) null;
        }
        if (0 >= rr.field_t) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; rr.field_t > var2; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & sa.field_a.field_h[var2];
                var4 = var3 >> -1915117916;
                var3 = var3 & 15;
                if (10 <= var4) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (10 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 == (this.field_G ^ -1)) {
          return;
        } else {
          if (this.field_G >= 256) {
            if (-1 != (param0 ^ -1)) {
              return;
            } else {
              this.a(param3 - -this.field_m, 103, this.field_q + param2);
              super.a(param0, -11857, param2, param3);
              return;
            }
          } else {
            L0: {
              L1: {
                if (ci.field_r == null) {
                  break L1;
                } else {
                  if (ci.field_r.field_z < this.field_x) {
                    break L1;
                  } else {
                    if (ci.field_r.field_w >= this.field_n) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ci.field_r = new bi(this.field_x, this.field_n);
              break L0;
            }
            aq.a((byte) 110, ci.field_r);
            gf.b();
            this.a(0, 103, 0);
            super.a(param0, param1, -param2 - this.field_q, -param3 - this.field_m);
            ln.f((byte) -50);
            ci.field_r.a(this.field_m + param3, this.field_q + param2, this.field_G);
            return;
          }
        }
    }

    boolean k(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_D = (bi) null;
            break L0;
          }
        }
        L1: {
          L2: {
            this.field_G = this.e(false);
            if (this.field_G != 0) {
              break L2;
            } else {
              if (this.field_E) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final vg i(int param0) {
        vg var2 = super.i(param0);
        if (var2 != null) {
            return var2;
        }
        return (vg) (this);
    }

    boolean a(byte param0) {
        int var2;
        int var3;
        int stackIn_10_0 = 0;
        L0: {
          var3 = -91 % ((param0 - -23) / 52);
          var2 = this.e(false);
          var3 = var2 - this.field_G;
          if (0 < var3) {
            this.field_G = this.field_G + (8 + (var3 - 1)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var3 >= 0) {
            break L1;
          } else {
            this.field_G = this.field_G + (-16 + var3 - -1) / 16;
            break L1;
          }
        }
        L2: {
          L3: {
            if (this.field_G != 0) {
              break L3;
            } else {
              if (0 != var2) {
                break L3;
              } else {
                if (this.field_E) {
                  break L3;
                } else {
                  stackIn_10_0 = 1;
                  break L2;
                }
              }
            }
          }
          stackIn_10_0 = 0;
          break L2;
        }
        return stackIn_10_0 != 0;
    }

    final void b(int param0, int param1, byte param2) {
        if (param2 >= -103) {
            w.m(11);
        }
        this.a(ec.field_q - param0 >> -923776095, param0, (byte) 122, ep.field_a - param1 >> -1276650719, param1);
    }

    final static ro a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_17_0 = null;
        ro stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = fg.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -64) {
                var3 = 121 % ((param0 - -23) / 41);
                var4 = 0;
                L1: while (true) {
                  if (var4 < var2_int) {
                    L2: {
                      var5 = param1.charAt(var4);
                      if (var5 == 45) {
                        L3: {
                          if (-1 == (var4 ^ -1)) {
                            break L3;
                          } else {
                            if (var2_int - 1 == var4) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = as.field_t;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (ma.field_q.indexOf(var5) == -1) {
                          stackIn_21_0 = as.field_t;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_7_0 = cm.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("w.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    w(tc param0, int param1, int param2) {
        super(ep.field_a - param1 >> 193364289, -param2 + ec.field_q >> 764213633, param1, param2, (iq) null);
        try {
            this.field_E = false;
            this.field_F = param0;
            this.field_G = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void f(byte param0) {
        ej.c(0);
        if (!(tm.field_i == null)) {
            hs.a(tm.field_i, (byte) -101);
        }
        rs.g(-96);
        og.a(false);
        oa.a(0);
        if (!(!oh.b(true))) {
            js.field_f.h(1, 255);
            d.a(0, (byte) 82);
        }
        q.g(-107);
        if (param0 < 56) {
            field_J = (String[][]) null;
        }
    }

    public static void m(int param0) {
        if (param0 != -1) {
            w.a(56);
        }
        field_D = null;
        field_H = null;
        field_J = (String[][]) null;
    }

    private final int e(boolean param0) {
        if (param0) {
            this.a(-109, -11, -57, 34);
        }
        return this.field_E ? this != this.field_F.g((byte) 119) ? 0 : 256 : 0;
    }

    abstract void a(int param0, int param1, int param2);

    final static String l(int param0) {
        String var1 = "";
        if (null != no.field_e) {
            var1 = no.field_e.d(false);
        }
        if (param0 == var1.length()) {
            var1 = id.a(-106);
        }
        if (-1 == (var1.length() ^ -1)) {
            var1 = hb.field_c;
        }
        return var1;
    }

    final static boolean d(boolean param0) {
        if (!param0) {
            w.m(-66);
        }
        return eh.field_P;
    }

    static {
        field_H = "Successful defences";
        field_J = new String[][]{new String[]{}, new String[]{"300", "180", "120", "90", "60", "45", "30"}, new String[]{"Conquest", "Sol", "Points", "Derelicts"}, new String[]{"Huge", "Large", "Medium", "Small", "Tiny"}, new String[]{"Streamlined", "Classic"}};
    }
}
