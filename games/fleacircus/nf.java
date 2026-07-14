/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends gj implements pe, da {
    static int field_K;
    static jd field_M;
    private bc field_I;
    ij field_H;
    static byte[] field_G;
    private bb field_J;
    private bb field_L;
    static ej field_F;

    private final boolean e(byte param0) {
        if (param0 > -46) {
            return true;
        }
        if (this.a(10000536, (nh) (Object) ((nf) this).field_I)) {
            return true;
        }
        return false;
    }

    private final int a(String param0, String param1, int param2, byte param3, int param4, int param5, qa param6) {
        v var9 = null;
        ml var10 = null;
        var10 = new ml(20, param2, 120 - -param4, 25, param6, false, 120, 3, ug.field_e, 16777215, param1);
        ((nf) this).a((qa) (Object) var10, (byte) -107);
        if (param3 != 109) {
          return 12;
        } else {
          var9 = new v(((nh) (Object) param6).a((byte) 55), param0, 126, param2 + var10.field_j, 25 + param4, param5);
          var9.field_s = (kd) this;
          ((nf) this).a((qa) (Object) var9, (byte) -124);
          return var9.field_j + var10.field_j;
        }
    }

    private final void j(int param0) {
        if (!this.e((byte) -113)) {
          return;
        } else {
          if (param0 != 3) {
            nf.f((byte) 10);
            el.a(((nf) this).field_I.field_i, (byte) 126);
            return;
          } else {
            el.a(((nf) this).field_I.field_i, (byte) 126);
            return;
          }
        }
    }

    public final void a(int param0) {
        ((vf) (Object) ((nf) this).field_I.a((byte) 76)).d(true);
        if (param0 > -66) {
            Object var3 = null;
            boolean discarded$0 = ((nf) this).a(26, 17, (qa) null, '﾿');
        }
    }

    public final void a(String param0, byte param1) {
        bc var3 = null;
        String var4 = null;
        if (param1 != -96) {
          nf.f((byte) 39);
          var3 = ((nf) this).field_I;
          var4 = param0;
          ((c) (Object) var3).a(false, (byte) -69, var4);
          return;
        } else {
          var3 = ((nf) this).field_I;
          var4 = param0;
          ((c) (Object) var3).a(false, (byte) -69, var4);
          return;
        }
    }

    public nf() {
        super(0, 0, 496, 0, (ch) null);
        ((nf) this).field_I = new bc("", (kd) null, 12);
        e var1 = new e(nb.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, ug.field_e.field_H, -1, 2147483647, true);
        qa var2 = new qa(t.field_c, (ch) (Object) var1, (kd) null);
        ((nf) this).field_J = new bb(e.field_g, (kd) null);
        ((nf) this).field_L = new bb(gd.field_d, (kd) null);
        ((nf) this).field_I.field_m = df.field_c;
        ((nf) this).field_I.a(true, (jb) (Object) new vf((c) (Object) ((nf) this).field_I));
        ((nf) this).field_J.field_D = false;
        ((nf) this).field_J.field_p = (ch) (Object) new ri();
        ((nf) this).field_L.field_p = (ch) (Object) new me();
        ((nf) this).field_I.field_p = (ch) (Object) new aa(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, var3, 50, 80);
        ((nf) this).a(var2, (byte) -50);
        var3 += 50;
        var3 = var3 + (5 + this.a(me.field_a, 98, bb.field_J, var3, 170, (qa) (Object) ((nf) this).field_I));
        ((nf) this).field_J.a(-var5 + 496 >> -913501599, var5, var3, 40, 80);
        ((nf) this).field_L.a(3 + var4, 60, var3 - -15, 40, 80);
        ((nf) this).field_L.field_s = (kd) this;
        ((nf) this).field_J.field_s = (kd) this;
        ((nf) this).a((qa) (Object) ((nf) this).field_J, (byte) -45);
        ((nf) this).a((qa) (Object) ((nf) this).field_L, (byte) -126);
        ((nf) this).field_H = new ij((pe) this);
        ((nf) this).field_H.a(60 + ((nf) this).field_I.field_y + ((nf) this).field_I.field_u, -((nf) this).field_I.field_u + (-((nf) this).field_I.field_y + ((nf) this).field_u - 60), 20, 150, 80);
        ((nf) this).a((qa) (Object) ((nf) this).field_H, (byte) -38);
        ((nf) this).a(0, 496, 0, var4 + (55 + var3), 80);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        if (param3 > -85) {
          ((nf) this).field_J = null;
          super.a(param0, param1, param2, (byte) -96);
          ((nf) this).field_J.field_D = this.e((byte) -74);
          return;
        } else {
          super.a(param0, param1, param2, (byte) -96);
          ((nf) this).field_J.field_D = this.e((byte) -74);
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        if (param3 == 248) {
          if (((nf) this).field_L != param4) {
            if (((nf) this).field_J != param4) {
              return;
            } else {
              this.j(3);
              return;
            }
          } else {
            na.a((byte) -121);
            return;
          }
        } else {
          this.j(115);
          if (((nf) this).field_L != param4) {
            if (((nf) this).field_J != param4) {
              return;
            } else {
              this.j(3);
              return;
            }
          } else {
            na.a((byte) -121);
            return;
          }
        }
    }

    private final boolean a(int param0, nh param1) {
        jb var3 = null;
        wd var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 10000536) {
          var3 = param1.a((byte) -100);
          if (var3 == null) {
            return true;
          } else {
            L0: {
              var4 = var3.a(false);
              if (var4 != hm.field_b) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            }
            return stackIn_12_0 != 0;
          }
        } else {
          this.j(121);
          var3 = param1.a((byte) -100);
          if (var3 == null) {
            return true;
          } else {
            L1: {
              var4 = var3.a(false);
              if (var4 != hm.field_b) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param1) {
            return ((nf) this).b(param2, -28533);
          } else {
            if (-100 == (param1 ^ -1)) {
              return ((nf) this).a(32, param2);
            } else {
              return false;
            }
          }
        }
    }

    private final int a(String param0, int param1, String param2, int param3, int param4, qa param5) {
        if (param1 != 98) {
            return -126;
        }
        return this.a(param2, param0, param3, (byte) 109, param4, 35, param5);
    }

    public static void f(byte param0) {
        field_M = null;
        field_F = null;
        if (param0 >= -40) {
            return;
        }
        field_G = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new byte[520];
    }
}
