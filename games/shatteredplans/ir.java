/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends f implements dl, bp {
    static int field_D;
    private fa field_H;
    static int field_E;
    private kg field_G;
    bj field_F;
    private kg field_I;

    private final int a(int param0, int param1, int param2, vg param3, String param4, String param5, boolean param6) {
        RuntimeException var8 = null;
        ah var9 = null;
        pg var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6) {
                break L1;
              } else {
                this.field_I = (kg) null;
                break L1;
              }
            }
            var10 = new pg(20, param1, 120 - -param2, 25, param3, false, 120, 3, gn.field_u, 16777215, param5);
            this.b((byte) -68, var10);
            var9 = new ah(((ki) ((Object) param3)).a((byte) 80), param4, 126, var10.field_n + param1, param2 + 25, param0);
            var9.field_u = (ko) (this);
            this.b((byte) -100, var9);
            stackIn_3_0 = var9.field_n + var10.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ir.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_I.field_y = this.k(-60);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ir.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(int param0) {
        int discarded$1 = 0;
        String var3;
        if (param0 != 2147483647) {
          var3 = (String) null;
          discarded$1 = this.a(-61, -100, -33, (vg) null, (String) null, (String) null, true);
          ((ec) ((Object) this.field_H.a((byte) 63))).d(0);
          return;
        } else {
          ((ec) ((Object) this.field_H.a((byte) 63))).d(0);
          return;
        }
    }

    public final void a(int param0, String param1) {
        fa var3 = null;
        String var4 = null;
        try {
            if (param0 != 15270) {
                field_E = -126;
            }
            var3 = this.field_H;
            var4 = param1;
            ((go) ((Object) var3)).a(63, var4, false);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ir.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        if (param0 != -1) {
            return;
        }
        if (!(this.k(-60))) {
            return;
        }
        he.a(8192, this.field_H.field_s);
    }

    final static void l(int param0) {
        eb.field_f = new String[cb.field_j];
        eb.field_f[11] = wg.field_g;
        eb.field_f[21] = fs.field_j;
        eb.field_f[7] = ls.field_c;
        eb.field_f[16] = ga.field_o;
        eb.field_f[18] = no.field_a;
        eb.field_f[4] = la.field_o;
        eb.field_f[9] = qj.field_a;
        eb.field_f[15] = bc.field_h;
        if (param0 != 1062) {
          ir.l(-42);
          eb.field_f[20] = qh.field_w;
          eb.field_f[19] = pl.field_a;
          eb.field_f[5] = qf.field_b;
          eb.field_f[13] = cg.field_G;
          eb.field_f[17] = ci.field_g;
          eb.field_f[6] = qq.field_x;
          return;
        } else {
          eb.field_f[20] = qh.field_w;
          eb.field_f[19] = pl.field_a;
          eb.field_f[5] = qf.field_b;
          eb.field_f[13] = cg.field_G;
          eb.field_f[17] = ci.field_g;
          eb.field_f[6] = qq.field_x;
          return;
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_G != param0) {
                if (this.field_I == param0) {
                  this.a((byte) -1);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                la.a(false);
                break L1;
              }
            }
            if (param1 == 6) {
              break L0;
            } else {
              this.a(97);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("ir.F(");

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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2, vg param3, String param4, String param5) {
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
            if (param0 < -77) {
              stackIn_4_0 = this.a(35, param2, param1, param3, param4, param5, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -45;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("ir.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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

            if (param4 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean k(int param0) {
        if (param0 == -60) {
          if (!this.a((ki) (this.field_H), (byte) 13)) {
            return false;
          } else {
            return true;
          }
        } else {
          this.field_F = (bj) null;
          if (!this.a((ki) (this.field_H), (byte) 13)) {
            return false;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2 ^ 0, param3)) {
              if (-99 != (param0 ^ -1)) {
                L1: {
                  if (param2 == 13) {
                    break L1;
                  } else {
                    var6 = (vg) null;
                    this.a(59, 66, (vg) null, (byte) 56);
                    break L1;
                  }
                }
                if (99 != param0) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(param3, 92);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param3, true);
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ir.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    private final boolean a(ki param0, byte param1) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        u var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 13) {
              var3 = param0.a((byte) 92);
              if (var3 != null) {
                L1: {
                  var4 = var3.c(param1 ^ 26);
                  if (var4 != p.field_g) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 1;
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ir.J(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    public ir() {
        super(0, 0, 496, 0, (iq) null);
        this.field_H = new fa("", (ko) null, 12);
        o var1 = new o(mf.field_x, 0, 0, 0, 0, 16777215, -1, 3, 0, gn.field_u.field_J, -1, 2147483647, true);
        vg var2 = new vg(rm.field_i, var1, (ko) null);
        this.field_I = new kg(ck.field_c, (ko) null);
        this.field_G = new kg(fb.field_bc, (ko) null);
        this.field_H.field_v = ol.field_i;
        this.field_H.a(new ec(this.field_H), 8945);
        this.field_I.field_y = false;
        this.field_I.field_p = (iq) ((Object) new qp());
        this.field_G.field_p = (iq) ((Object) new rq());
        this.field_H.field_p = (iq) ((Object) new rr(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(var3, 50, (byte) 121, 20, 270);
        this.b((byte) -47, var2);
        var3 += 50;
        var3 = var3 + (this.a((byte) -110, 170, var3, this.field_H, rf.field_m, tr.field_zb) - -5);
        this.field_I.a(var3, 40, (byte) 123, 496 - var5 >> -2016949247, var5);
        this.field_G.a(var3 - -15, 40, (byte) 127, var4 + 3, 60);
        this.field_G.field_u = (ko) (this);
        this.field_I.field_u = (ko) (this);
        this.b((byte) -63, this.field_I);
        this.b((byte) -48, this.field_G);
        this.field_F = new bj((dl) (this));
        this.field_F.a(20, 150, (byte) 115, this.field_H.field_m - (-this.field_H.field_x + -60), this.field_x + -this.field_H.field_m + (-this.field_H.field_x - 60));
        this.b((byte) -98, this.field_F);
        this.a(0, 55 + var3 + var4, (byte) 117, 0, 496);
    }

    static {
    }
}
