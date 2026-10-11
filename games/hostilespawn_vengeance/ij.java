/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends vd implements kn, qk {
    private ph field_H;
    static vl field_J;
    private ph field_E;
    private sf field_G;
    static int field_F;
    mc field_I;

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          if (this.field_H == param3) {
            fa.a(5109);
          } else {
            if (this.field_E == param3) {
              this.j(496);
            }
          }
          var6_int = -57 % ((-63 - param4) / 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ij.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_J = null;
        if (param0 != 75) {
          field_J = (vl) null;
        }
    }

    private final boolean l(int param0) {
        if (!this.a((sk) (this.field_G), (byte) -99)) {
          return false;
        }
        if (param0 == -6790) {
          return true;
        }
        this.field_H = (ph) null;
        return true;
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        String var6 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.a(param1, (byte) 113);
            return stackIn_5_0;
          }
          if (param2 == 99) {
            stackIn_8_0 = this.b((byte) 115, param1);
            return stackIn_8_0;
          }
          if (param0 != 274) {
            var6 = (String) null;
            this.a(true, (String) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ij.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          si.a(param3, param2, param1 + 1, 10000536);
          si.a(param3, param2 + param0, param1 + 1, 12105912);
          var5_int = 1;
          if (si.field_j > param2 + var5_int) {
            var5_int = si.field_j - param2;
          }
          if (param4) {
            field_J = (vl) null;
          }
          var6 = param0;
          if (si.field_a < var6 + param2) {
            var6 = si.field_a - param2;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + var7 * 48 / param0;
            var9 = var8 | (var8 << 8 | var8 << 16);
            si.field_i[si.field_e * (param2 + var7) + param3] = var9;
            si.field_i[param1 + (param3 + si.field_e * (param2 + var7))] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "ij.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_E.field_D = this.l(param2 ^ -6790);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ij.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int k(int param0) {
        int var1;
        int var2;
        var1 = w.field_r;
        if (sg.field_i > 0) {
          var1 = var1 + w.field_r * 5000 / sg.field_i;
        }
        vj.field_s = var1;
        var2 = fl.d(-64);
        if (n.field_s >= var2) {
          if (var2 < n.field_s) {
            return 0;
          }
        } else {
          if (um.field_e > 0) {
            if (var2 < n.field_s) {
              return 0;
            }
          } else {
            if (eh.field_g < 0) {
              if (var2 < n.field_s) {
                return 0;
              }
            } else {
              if (mc.field_I == 4) {
                if (var2 < n.field_s) {
                  return 0;
                }
              } else {
                um.field_e = 100;
                n.field_s = n.field_s + 1;
                if (n.field_s == 10) {
                  ti.a(252, (byte) -110, 3);
                }
                if (n.field_s == 17) {
                  ti.a(251, (byte) -126, 4);
                }
                eh.field_c.a(fg.field_b[18], 100, uh.field_i);
              }
            }
          }
        }
        if (19 == var2) {
          return 0;
        }
        if (param0 > -6) {
          return -74;
        }
        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
    }

    public final void a(boolean param0, String param1) {
        sf var3 = this.field_G;
        String var4 = param1;
        if (!param0) {
          return;
        }
        try {
          ((ig) ((Object) var3)).a((byte) 91, false, var4);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ij.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(sk param0, byte param1) {
        bg var3 = null;
        RuntimeException var3_ref = null;
        bm var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a((byte) -51);
          if (var3 == null) {
            return true;
          }
          if (param1 > -30) {
            return false;
          }
          var4 = var3.b(-86);
          stackIn_9_0 = (nd.field_d == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ij.R(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(String param0, String param1, byte param2, int param3, int param4, ag param5, int param6) {
        RuntimeException var8 = null;
        al var9 = null;
        int var10 = 0;
        nh var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new nh(20, param3, param4 + 120, 25, param5, false, 120, 3, jd.field_s, 16777215, param1);
          this.a(51448, var11);
          var10 = -125 % ((-75 - param2) / 51);
          var9 = new al(((sk) ((Object) param5)).a((byte) -106), param0, 126, param3 + var11.field_x, 25 + param4, param6);
          var9.field_p = (mh) (this);
          this.a(51448, var9);
          stackIn_1_0 = var9.field_x + var11.field_x;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ij.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, ji param1) {
        try {
          db.a(true, 256, param1);
          if (param0 != -17) {
            ij.k(-120);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ij.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public ij() {
        super(0, 0, 496, 0, (nn) null);
        this.field_G = new sf("", (mh) null, 12);
        cn var1 = new cn(jn.field_G, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
        ag var2 = new ag(bl.field_d, var1, (mh) null);
        this.field_E = new ph(fh.field_h, (mh) null);
        this.field_H = new ph(qc.field_C, (mh) null);
        this.field_G.field_i = u.field_g;
        this.field_G.a(new n(this.field_G), (byte) -105);
        this.field_E.field_D = false;
        this.field_E.field_h = (nn) ((Object) new ke());
        this.field_H.field_h = (nn) ((Object) new ti());
        this.field_G.field_h = (nn) ((Object) new sd(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, var3, 0, 20, 50);
        this.a(51448, var2);
        var3 += 50;
        var3 = var3 + (this.a(170, this.field_G, vg.field_f, (byte) 31, var3, ua.field_a) + 5);
        this.field_E.a(var5, var3, 0, -var5 + 496 >> 1, 40);
        this.field_H.a(60, var3 + 15, 0, var4 + 3, 40);
        this.field_H.field_p = (mh) (this);
        this.field_E.field_p = (mh) (this);
        this.a(51448, this.field_E);
        this.a(51448, this.field_H);
        this.field_I = new mc((kn) (this));
        this.field_I.a(-60 + (-this.field_G.field_s + (this.field_s - this.field_G.field_v)), 20, 0, 60 + this.field_G.field_s + this.field_G.field_v, 150);
        this.a(51448, this.field_I);
        this.a(496, 0, 0, 0, var4 + (var3 + 55));
    }

    private final void j(int param0) {
        if (!this.l(-6790)) {
          return;
        }
        if (param0 != 496) {
          return;
        }
        ha.a((byte) 126, this.field_G.field_n);
    }

    public final void a(boolean param0) {
        if (param0) {
          return;
        }
        ((n) (this.field_G.a((byte) 124))).f(-2);
    }

    private final int a(int param0, ag param1, String param2, byte param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 31) {
            this.field_G = (sf) null;
          }
          stackIn_3_0 = this.a(param2, param5, (byte) 71, param4, param0, param1, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ij.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_J = new vl();
        og discarded$0 = new og();
    }
}
