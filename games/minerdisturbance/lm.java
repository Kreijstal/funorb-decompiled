/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends kn implements f, sh {
    private hc field_J;
    private hc field_P;
    ei field_K;
    private ke field_N;
    static ae field_M;
    static gh field_O;
    static String field_L;
    static String field_I;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param2 == 14965) {
                break L1;
              } else {
                field_L = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param0 = ke.a('_', (byte) 75, param0, "");
                var3 = re.a(param0, 0);
                if ((param1.indexOf(param0) ^ -1) != 0) {
                  break L3;
                } else {
                  if ((param1.indexOf(var3) ^ -1) == 0) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("lm.J(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static String n(int param0) {
        if (!(ic.field_l != ci.field_e)) {
            return km.field_b;
        }
        if (!(wm.field_f.a(0))) {
            return wm.field_f.a(false);
        }
        int var1 = 104 % ((param0 - 25) / 54);
        if (!(ci.field_e != bd.field_h)) {
            return wm.field_f.a(false);
        }
        return pl.field_a;
    }

    public final void a(byte param0) {
        ((qi) ((Object) this.field_N.a(35))).b((byte) -82);
        if (param0 != 47) {
            String var3 = (String) null;
            lm.a((String) null, (String) null, -67);
        }
    }

    public final void a(String param0, int param1) {
        ke var3 = null;
        String var4 = null;
        try {
            var3 = this.field_N;
            var4 = param0;
            ((ui) ((Object) var3)).a(false, false, var4);
            int var5 = 105 % ((param1 - 22) / 62);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "lm.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 != 98) {
                if (-100 != (param3 ^ -1)) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(param1, (byte) 12);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.b(param1, param2 ^ -79);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("lm.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    public static void f(byte param0) {
        if (param0 > -85) {
            return;
        }
        field_L = null;
        field_O = null;
        field_M = null;
        field_I = null;
    }

    final static String[] a(sb param0, byte param1) {
        ta var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2 = new ta();
            L1: while (true) {
              L2: {
                if (param0.field_u.length <= param0.field_o) {
                  break L2;
                } else {
                  var3_int = af.a(param0, var2, -113);
                  if (!ne.a(var3_int, uf.field_q, param0, (byte) -87)) {
                    continue L1;
                  } else {
                    param0.field_o = param0.field_o + (uf.field_q.length - 1);
                    break L2;
                  }
                }
              }
              var3 = new String[var2.c((byte) -121)];
              var4 = 0;
              L3: while (true) {
                if (var3.length <= var4) {
                  L4: {
                    if (param1 == -101) {
                      break L4;
                    } else {
                      lm.f((byte) -38);
                      break L4;
                    }
                  }
                  stackIn_11_0 = (String[]) (var3);
                  break L0;
                } else {
                  var3[var4] = ((lj) ((Object) var2.e(63854))).field_n;
                  var4++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2_ref);

            stackIn_14_1 = new StringBuilder().append("lm.U(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int discarded$1 = 0;
        fe var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == 6) {
                break L1;
              } else {
                var7 = (fe) null;
                discarded$1 = this.a(false, (String) null, -122, (String) null, -18, (fe) null);
                break L1;
              }
            }
            L2: {
              if (this.field_J != param2) {
                if (this.field_P != param2) {
                  break L2;
                } else {
                  this.g((byte) -93);
                  break L2;
                }
              } else {
                fl.a((byte) 107);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("lm.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public lm() {
        super(0, 0, 496, 0, (ad) null);
        this.field_N = new ke("", (rm) null, 12);
        eg var1 = new eg(sl.field_q, 0, 0, 0, 0, 16777215, -1, 3, 0, bn.field_d.field_I, -1, 2147483647, true);
        fe var2 = new fe(me.field_l, var1, (rm) null);
        this.field_P = new hc(he.field_c, (rm) null);
        this.field_J = new hc(u.field_b, (rm) null);
        this.field_N.field_n = vj.field_l;
        this.field_N.a(new qi(this.field_N), 1048576);
        this.field_P.field_E = false;
        this.field_P.field_A = (ad) ((Object) new wi());
        this.field_J.field_A = (ad) ((Object) new nc());
        this.field_N.field_A = (ad) ((Object) new gk(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, -73, 20, 270, var3);
        var3 += 50;
        this.a(-1, var2);
        var3 = var3 + (5 + this.a(false, wm.field_c, var3, hi.field_w, 170, this.field_N));
        this.field_P.a(40, -39, 496 + -var5 >> 865323745, var5, var3);
        this.field_J.a(40, -54, var4 + 3, 60, var3 - -15);
        this.field_J.field_y = (rm) (this);
        this.field_P.field_y = (rm) (this);
        this.a(-1, this.field_P);
        this.a(-1, this.field_J);
        this.field_K = new ei((f) (this));
        this.field_K.a(150, -44, this.field_N.field_v + this.field_N.field_u - -60, -this.field_N.field_v + (this.field_v + -this.field_N.field_u - 60), 20);
        this.a(-1, this.field_K);
        this.a(55 + (var3 + var4), -101, 0, 496, 0);
    }

    private final void g(byte param0) {
        int var2;
        if (!this.e((byte) -68)) {
          return;
        } else {
          var2 = 51 / ((-18 - param0) / 62);
          gb.a(-126, this.field_N.field_s);
          return;
        }
    }

    private final int a(int param0, fe param1, String param2, boolean param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        w var9 = null;
        am var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new am(20, param0, 120 + param6, 25, param1, param3, 120, 3, bn.field_d, 16777215, param5);
            this.a(-1, var10);
            var9 = new w(((sg) ((Object) param1)).a(35), param2, 126, var10.field_q + param0, param6 + 25, param4);
            var9.field_y = (rm) (this);
            this.a(-1, var9);
            stackIn_1_0 = var9.field_q + var10.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("lm.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(boolean param0, String param1, int param2, String param3, int param4, fe param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.a(param2, param5, param3, false, 35, param1, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 85;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("lm.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean e(byte param0) {
        sb var3;
        if (param0 < -13) {
          if (!this.a(124, (sg) (this.field_N))) {
            return false;
          } else {
            return true;
          }
        } else {
          var3 = (sb) null;
          lm.a((sb) null, (byte) 25);
          if (!this.a(124, (sg) (this.field_N))) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final boolean a(int param0, sg param1) {
        jm var3 = null;
        RuntimeException var3_ref = null;
        ag var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(35);
            if (var3 != null) {
              L1: {
                var4 = var3.b(24595);
                if (param0 >= 25) {
                  break L1;
                } else {
                  field_M = (ae) null;
                  break L1;
                }
              }
              L2: {
                if (var4 != sc.field_a) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("lm.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
            super.a(param0, param1, (byte) 103, param3);
            this.field_P.field_E = this.e((byte) -14);
            if (param2 < 49) {
                field_M = (ae) null;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "lm.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        int stackIn_110_0 = 0;
        int var2;
        int var3;
        var3 = MinerDisturbance.field_ab;
        if (param1 == 98) {
          hk.field_e = hk.field_e + 1;
          if (se.field_K == param0) {
            L0: {
              se.field_K = param0;
              if (fh.field_d) {
                break L0;
              } else {
                if (ld.field_w <= hk.field_e) {
                  break L0;
                } else {
                  if (!k.field_i) {
                    break L0;
                  } else {
                    L1: {
                      hk.field_e = 0;
                      im.field_c = nk.field_w;
                      qd.field_P = gb.field_e;
                      if (!fh.field_d) {
                        break L1;
                      } else {
                        if (hk.field_e == se.field_M) {
                          hk.field_e = 0;
                          fh.field_d = false;
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L2: {
              if (!fh.field_d) {
                break L2;
              } else {
                if (hk.field_e == se.field_M) {
                  hk.field_e = 0;
                  fh.field_d = false;
                  break L2;
                } else {
                  return;
                }
              }
            }
            return;
          } else {
            if (!fh.field_d) {
              if (hk.field_e >= ld.field_w) {
                L3: {
                  if (ld.field_w + qn.field_K <= hk.field_e) {
                    stackIn_110_0 = 0;
                    break L3;
                  } else {
                    stackIn_110_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var2 = stackIn_110_0;
                  if (-1 == param0) {
                    hk.field_e = 0;
                    break L4;
                  } else {
                    if (fh.field_d) {
                      hk.field_e = ld.field_w;
                      break L4;
                    } else {
                      if (var2 == 0) {
                        L5: {
                          hk.field_e = 0;
                          im.field_c = nk.field_w;
                          qd.field_P = gb.field_e;
                          if (0 != (param0 ^ -1)) {
                            fh.field_d = false;
                            break L5;
                          } else {
                            if (var2 != 0) {
                              fh.field_d = true;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          se.field_K = param0;
                          if (fh.field_d) {
                            break L6;
                          } else {
                            if (ld.field_w <= hk.field_e) {
                              break L6;
                            } else {
                              if (!k.field_i) {
                                break L6;
                              } else {
                                hk.field_e = 0;
                                im.field_c = nk.field_w;
                                qd.field_P = gb.field_e;
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          if (!fh.field_d) {
                            break L7;
                          } else {
                            if (hk.field_e == se.field_M) {
                              hk.field_e = 0;
                              fh.field_d = false;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        return;
                      } else {
                        hk.field_e = ld.field_w;
                        break L4;
                      }
                    }
                  }
                }
                im.field_c = nk.field_w;
                qd.field_P = gb.field_e;
                if (0 != (param0 ^ -1)) {
                  L8: {
                    fh.field_d = false;
                    se.field_K = param0;
                    if (fh.field_d) {
                      break L8;
                    } else {
                      if (ld.field_w <= hk.field_e) {
                        break L8;
                      } else {
                        if (!k.field_i) {
                          break L8;
                        } else {
                          hk.field_e = 0;
                          im.field_c = nk.field_w;
                          qd.field_P = gb.field_e;
                          if (fh.field_d) {
                            if (hk.field_e == se.field_M) {
                              hk.field_e = 0;
                              fh.field_d = false;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (fh.field_d) {
                    if (hk.field_e != se.field_M) {
                      return;
                    } else {
                      hk.field_e = 0;
                      fh.field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (var2 != 0) {
                    L9: {
                      fh.field_d = true;
                      se.field_K = param0;
                      if (fh.field_d) {
                        break L9;
                      } else {
                        if (ld.field_w <= hk.field_e) {
                          break L9;
                        } else {
                          if (!k.field_i) {
                            break L9;
                          } else {
                            hk.field_e = 0;
                            im.field_c = nk.field_w;
                            qd.field_P = gb.field_e;
                            if (fh.field_d) {
                              if (hk.field_e != se.field_M) {
                                return;
                              } else {
                                hk.field_e = 0;
                                fh.field_d = false;
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    if (fh.field_d) {
                      if (hk.field_e == se.field_M) {
                        hk.field_e = 0;
                        fh.field_d = false;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L10: {
                      se.field_K = param0;
                      if (fh.field_d) {
                        break L10;
                      } else {
                        if (ld.field_w <= hk.field_e) {
                          break L10;
                        } else {
                          if (!k.field_i) {
                            break L10;
                          } else {
                            hk.field_e = 0;
                            im.field_c = nk.field_w;
                            qd.field_P = gb.field_e;
                            break L10;
                          }
                        }
                      }
                    }
                    if (fh.field_d) {
                      if (hk.field_e != se.field_M) {
                        return;
                      } else {
                        hk.field_e = 0;
                        fh.field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L11: {
                  var2 = 0;
                  if (-1 == param0) {
                    hk.field_e = 0;
                    break L11;
                  } else {
                    if (fh.field_d) {
                      hk.field_e = ld.field_w;
                      break L11;
                    } else {
                      if (var2 == 0) {
                        L12: {
                          hk.field_e = 0;
                          im.field_c = nk.field_w;
                          qd.field_P = gb.field_e;
                          if (0 != (param0 ^ -1)) {
                            fh.field_d = false;
                            break L12;
                          } else {
                            if (var2 != 0) {
                              fh.field_d = true;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          se.field_K = param0;
                          if (fh.field_d) {
                            break L13;
                          } else {
                            if (ld.field_w <= hk.field_e) {
                              break L13;
                            } else {
                              if (!k.field_i) {
                                break L13;
                              } else {
                                hk.field_e = 0;
                                im.field_c = nk.field_w;
                                qd.field_P = gb.field_e;
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          if (!fh.field_d) {
                            break L14;
                          } else {
                            if (hk.field_e == se.field_M) {
                              hk.field_e = 0;
                              fh.field_d = false;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        return;
                      } else {
                        hk.field_e = ld.field_w;
                        break L11;
                      }
                    }
                  }
                }
                im.field_c = nk.field_w;
                qd.field_P = gb.field_e;
                if (0 == (param0 ^ -1)) {
                  if (var2 == 0) {
                    L15: {
                      se.field_K = param0;
                      if (fh.field_d) {
                        break L15;
                      } else {
                        if (ld.field_w <= hk.field_e) {
                          break L15;
                        } else {
                          if (!k.field_i) {
                            break L15;
                          } else {
                            hk.field_e = 0;
                            im.field_c = nk.field_w;
                            qd.field_P = gb.field_e;
                            break L15;
                          }
                        }
                      }
                    }
                    L16: {
                      if (!fh.field_d) {
                        break L16;
                      } else {
                        if (hk.field_e == se.field_M) {
                          hk.field_e = 0;
                          fh.field_d = false;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    return;
                  } else {
                    L17: {
                      fh.field_d = true;
                      se.field_K = param0;
                      if (fh.field_d) {
                        break L17;
                      } else {
                        if (ld.field_w <= hk.field_e) {
                          break L17;
                        } else {
                          if (!k.field_i) {
                            break L17;
                          } else {
                            hk.field_e = 0;
                            im.field_c = nk.field_w;
                            qd.field_P = gb.field_e;
                            break L17;
                          }
                        }
                      }
                    }
                    L18: {
                      if (!fh.field_d) {
                        break L18;
                      } else {
                        if (hk.field_e == se.field_M) {
                          hk.field_e = 0;
                          fh.field_d = false;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L19: {
                    fh.field_d = false;
                    se.field_K = param0;
                    if (fh.field_d) {
                      break L19;
                    } else {
                      if (ld.field_w <= hk.field_e) {
                        break L19;
                      } else {
                        if (!k.field_i) {
                          break L19;
                        } else {
                          hk.field_e = 0;
                          im.field_c = nk.field_w;
                          qd.field_P = gb.field_e;
                          break L19;
                        }
                      }
                    }
                  }
                  L20: {
                    if (!fh.field_d) {
                      break L20;
                    } else {
                      if (hk.field_e == se.field_M) {
                        hk.field_e = 0;
                        fh.field_d = false;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L21: {
                var2 = 0;
                if (-1 == param0) {
                  hk.field_e = 0;
                  break L21;
                } else {
                  if (fh.field_d) {
                    hk.field_e = ld.field_w;
                    break L21;
                  } else {
                    if (var2 == 0) {
                      L22: {
                        hk.field_e = 0;
                        im.field_c = nk.field_w;
                        qd.field_P = gb.field_e;
                        if (0 != (param0 ^ -1)) {
                          fh.field_d = false;
                          break L22;
                        } else {
                          if (var2 != 0) {
                            fh.field_d = true;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        se.field_K = param0;
                        if (fh.field_d) {
                          break L23;
                        } else {
                          if (ld.field_w <= hk.field_e) {
                            break L23;
                          } else {
                            if (!k.field_i) {
                              break L23;
                            } else {
                              hk.field_e = 0;
                              im.field_c = nk.field_w;
                              qd.field_P = gb.field_e;
                              break L23;
                            }
                          }
                        }
                      }
                      L24: {
                        if (!fh.field_d) {
                          break L24;
                        } else {
                          if (hk.field_e == se.field_M) {
                            hk.field_e = 0;
                            fh.field_d = false;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                      return;
                    } else {
                      hk.field_e = ld.field_w;
                      break L21;
                    }
                  }
                }
              }
              im.field_c = nk.field_w;
              qd.field_P = gb.field_e;
              if (0 == (param0 ^ -1)) {
                if (var2 == 0) {
                  L25: {
                    se.field_K = param0;
                    if (fh.field_d) {
                      break L25;
                    } else {
                      if (ld.field_w <= hk.field_e) {
                        break L25;
                      } else {
                        if (!k.field_i) {
                          break L25;
                        } else {
                          hk.field_e = 0;
                          im.field_c = nk.field_w;
                          qd.field_P = gb.field_e;
                          break L25;
                        }
                      }
                    }
                  }
                  L26: {
                    if (!fh.field_d) {
                      break L26;
                    } else {
                      if (hk.field_e == se.field_M) {
                        hk.field_e = 0;
                        fh.field_d = false;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                  return;
                } else {
                  L27: {
                    fh.field_d = true;
                    se.field_K = param0;
                    if (fh.field_d) {
                      break L27;
                    } else {
                      if (ld.field_w <= hk.field_e) {
                        break L27;
                      } else {
                        if (!k.field_i) {
                          break L27;
                        } else {
                          hk.field_e = 0;
                          im.field_c = nk.field_w;
                          qd.field_P = gb.field_e;
                          break L27;
                        }
                      }
                    }
                  }
                  L28: {
                    if (!fh.field_d) {
                      break L28;
                    } else {
                      if (hk.field_e == se.field_M) {
                        hk.field_e = 0;
                        fh.field_d = false;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  fh.field_d = false;
                  se.field_K = param0;
                  if (fh.field_d) {
                    break L29;
                  } else {
                    if (ld.field_w <= hk.field_e) {
                      break L29;
                    } else {
                      if (!k.field_i) {
                        break L29;
                      } else {
                        hk.field_e = 0;
                        im.field_c = nk.field_w;
                        qd.field_P = gb.field_e;
                        break L29;
                      }
                    }
                  }
                }
                L30: {
                  if (!fh.field_d) {
                    break L30;
                  } else {
                    if (hk.field_e == se.field_M) {
                      hk.field_e = 0;
                      fh.field_d = false;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        field_M = new ae();
        field_O = new gh();
        field_I = "Fed up of slip-sliding around? Grab these designer crampons and put the latest footwear craze to a practical use! You'll grip the ice as if it were rock.";
    }
}
