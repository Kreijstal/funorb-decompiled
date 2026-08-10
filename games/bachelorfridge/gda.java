/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gda extends vd implements uja, lja {
    dd field_E;
    private vn field_G;
    private hf field_F;
    private hf field_C;

    private final void d(byte param0) {
        if (param0 <= 29) {
            return;
        }
        if (!this.j(-111)) {
            return;
        }
        gaa.a(this.field_G.field_w, -123);
    }

    private final boolean j(int param0) {
        if (!this.a((mca) (this.field_G), -1)) {
          return false;
        } else {
          if (param0 >= -94) {
            gda.a(true, 125L);
            return true;
          } else {
            return true;
          }
        }
    }

    public gda() {
        super(0, 0, 496, 0, (qda) null);
        this.field_G = new vn("", (pl) null, 12);
        gha var1 = new gha(oc.field_l, 0, 0, 0, 0, 16777215, -1, 3, 0, jca.field_a.field_u, -1, 2147483647, true);
        wj var2 = new wj(eq.field_f, var1, (pl) null);
        this.field_F = new hf(ne.field_m, (pl) null);
        this.field_C = new hf(bga.field_f, (pl) null);
        this.field_G.field_h = cu.field_z;
        this.field_G.a(7, new tt(this.field_G));
        this.field_F.field_z = false;
        this.field_F.field_f = (qda) ((Object) new ff());
        this.field_C.field_f = (qda) ((Object) new pka());
        this.field_G.field_f = (qda) ((Object) new oka(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 50, (byte) 59, 270, var3);
        var3 += 50;
        this.c(var2, -123);
        var3 = var3 + (5 + this.a(var3, this.field_G, gp.field_v, 170, saa.field_u, false));
        this.field_F.a(-var5 + 496 >> -1871468447, 40, (byte) 59, var5, var3);
        this.field_C.a(var4 - -3, 40, (byte) 59, 60, var3 - -15);
        this.field_C.field_k = (pl) (this);
        this.field_F.field_k = (pl) (this);
        this.c(this.field_F, 91);
        this.c(this.field_C, 27);
        this.field_E = new dd((uja) (this));
        this.field_E.a(60 + this.field_G.field_p + this.field_G.field_s, 150, (byte) 59, -this.field_G.field_p + -this.field_G.field_s + this.field_p - 60, 20);
        this.c(this.field_E, 74);
        this.a(0, 55 + var3 + var4, (byte) 59, 496, 0);
    }

    public final void a(int param0) {
        ((tt) ((Object) this.field_G.a(16728128))).d(-116);
        if (param0 != 14322) {
            this.field_F = (hf) null;
        }
    }

    private final int a(int param0, wj param1, String param2, int param3, String param4, boolean param5) {
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
            if (!param5) {
              stackIn_4_0 = this.a(param2, param4, param3, (byte) 124, param1, param0, 35);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("gda.F(").append(param0).append(',');

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(String param0, byte param1) {
        vn var4 = null;
        String var5 = null;
        try {
            int var3_int = -77 / ((-41 - param1) / 37);
            var4 = this.field_G;
            var5 = param0;
            ((lka) ((Object) var4)).a((byte) 122, var5, false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gda.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, long param1) {
        java.awt.Component var4;
        if (!param0) {
          if (param1 > 0L) {
            if (0L == param1 % 10L) {
              pv.a(20182, param1 - 1L);
              pv.a(20182, 1L);
              return;
            } else {
              pv.a(20182, param1);
              return;
            }
          } else {
            return;
          }
        } else {
          var4 = (java.awt.Component) null;
          gda.a(67, (java.awt.Component) null);
          if (param1 > 0L) {
            if (0L == param1 % 10L) {
              pv.a(20182, param1 - 1L);
              pv.a(20182, 1L);
              return;
            } else {
              pv.a(20182, param1);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_F.field_z = this.j(-117);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gda.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param1) {
                if ((param1 ^ -1) != -100) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(param3, param0 ^ 11);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(-123, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("gda.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    private final int a(String param0, String param1, int param2, byte param3, wj param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        nf var10 = null;
        ge var11 = null;
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
            var11 = new ge(20, param5, param2 + 120, 25, param4, false, 120, 3, jca.field_a, 16777215, param0);
            this.c(var11, 111);
            var9 = -90 / ((param3 - 25) / 34);
            var10 = new nf(((mca) ((Object) param4)).a(16728128), param1, 126, param5 - -var11.field_q, 25 + param2, param6);
            var10.field_k = (pl) (this);
            this.c(var10, 30);
            stackIn_1_0 = var10.field_q + var11.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("gda.N(");

            if (param0 == null) {
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

            if (param1 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(uc.field_m);
            param1.removeMouseMotionListener(uc.field_m);
            param1.removeFocusListener(uc.field_m);
            oga.field_q = 0;
            if (param0 > -14) {
                java.awt.Component var3 = (java.awt.Component) null;
                gda.a(-19, (java.awt.Component) null);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gda.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == this.field_C) {
                dd.d((byte) -83);
                break L1;
              } else {
                if (this.field_F != param1) {
                  break L1;
                } else {
                  this.d((byte) 46);
                  break L1;
                }
              }
            }
            if (param3 >= 50) {
              break L0;
            } else {
              var7 = (String) null;
              discarded$1 = this.a(7, (wj) null, (String) null, 77, (String) null, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("gda.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(mca param0, int param1) {
        qu var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jg var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = 30 % ((-47 - param1) / 37);
            var3 = param0.a(16728128);
            if (var3 != null) {
              L1: {
                var5 = var3.b(-19704);
                if (cm.field_u != var5) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("gda.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    static {
    }
}
