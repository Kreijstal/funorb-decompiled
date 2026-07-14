/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends ofa implements tsa {
    private rj field_N;
    static jpa[] field_O;
    static ur field_M;
    static String field_L;

    public static void f(int param0) {
        field_M = null;
        field_O = null;
        field_L = null;
        if (param0 != 0) {
            field_L = null;
        }
    }

    private final rj a(String param0, qc param1, int param2) {
        rj var4 = null;
        int var5 = 0;
        var4 = new rj(param0, param1);
        var4.field_r = (isa) (Object) new td();
        var5 = ((gga) this).field_p - 6;
        ((gga) this).field_p = ((gga) this).field_p + 38;
        if (param2 >= -82) {
          gga.f(16);
          var4.a((byte) -31, -16 + (((gga) this).field_m - 14), 30, 15, var5);
          ((gga) this).a((ae) (Object) var4, -1);
          ((gga) this).c((byte) -75);
          return var4;
        } else {
          var4.a((byte) -31, -16 + (((gga) this).field_m - 14), 30, 15, var5);
          ((gga) this).a((ae) (Object) var4, -1);
          ((gga) this).c((byte) -75);
          return var4;
        }
    }

    final static void b(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if ((tl.field_r ^ -1) > -1) {
          return;
        } else {
          L0: {
            var3 = -135 + param0;
            var4 = -35 + param1;
            if (param2 > 81) {
              break L0;
            } else {
              gga.f(45);
              break L0;
            }
          }
          L1: {
            var5 = 256;
            if ((tl.field_r ^ -1) <= -76) {
              break L1;
            } else {
              var5 = (tl.field_r << 487563080) / 75;
              break L1;
            }
          }
          L2: {
            if ((tl.field_r ^ -1) >= -201) {
              break L2;
            } else {
              var5 = (250 + -tl.field_r << -1908163160) / 50;
              break L2;
            }
          }
          L3: {
            nm.a(vha.field_a, (byte) 108);
            uoa.b();
            bea.a();
            uw.a(false);
            if (-257 >= (var5 ^ -1)) {
              break L3;
            } else {
              bea.c(0, 0, bea.field_g, bea.field_a, 0, 256 + -var5);
              break L3;
            }
          }
          L4: {
            pfa.a(1);
            if ((tl.field_r ^ -1) <= -151) {
              bra.field_O.c(var3 + 15, var4 + 10, var5);
              break L4;
            } else {
              vha.field_a.c(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = -125 + tl.field_r;
            if (-1 <= (var6 ^ -1)) {
              break L5;
            } else {
              if (50 <= var6) {
                break L5;
              } else {
                if ((var6 ^ -1) > -21) {
                  var7 = var6 * 256 / 20;
                  bw.field_a.a(var3, var4, var7);
                  break L5;
                } else {
                  if (var6 < 30) {
                    bw.field_a.a(var3, var4, 256);
                    break L5;
                  } else {
                    var7 = (50 + -var6) * 256 / 20;
                    bw.field_a.a(var3, var4, var7);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = -140 + tl.field_r;
            if (0 >= var6) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if (-21 >= (var6 ^ -1)) {
                  break L7;
                } else {
                  var7 = var6 * 256 / 20;
                  break L7;
                }
              }
              hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 2037813160);
              break L6;
            }
          }
          return;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param2 != ((gga) this).field_N) {
          if (param4 < 44) {
            gga.f(-123);
            return;
          } else {
            return;
          }
        } else {
          this.g(256);
          if (param4 >= 44) {
            return;
          } else {
            gga.f(-123);
            return;
          }
        }
    }

    gga(jta param0, nt param1) {
        super(param0, 200, 150);
        Object var5 = null;
        ae var6 = null;
        String var7 = null;
        ae var8 = null;
        String var9 = null;
        ae var10 = null;
        String var11 = null;
        ae var12 = null;
        String var13 = null;
        ae var14 = null;
        var5 = null;
        if (gj.field_o == param1) {
          var13 = jma.field_o;
          var14 = new ae(var13, (qc) null);
          var14.field_p = 80;
          var14.field_m = ((gga) this).field_m;
          var14.field_n = 50;
          var14.field_i = 0;
          var14.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((gga) this).a(var14, -1);
          ((gga) this).field_N = this.a(kh.field_j, (qc) this, -93);
        } else {
          if (or.field_j == param1) {
            ((gga) this).field_p = ((gga) this).field_p + 10;
            var9 = vca.field_b;
            if (sta.g((byte) 97)) {
              var11 = tj.field_h;
              ((gga) this).field_p = ((gga) this).field_p + 20;
              var12 = new ae(var11, (qc) null);
              var12.field_p = 80;
              var12.field_m = ((gga) this).field_m;
              var12.field_n = 50;
              var12.field_i = 0;
              var12.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gga) this).a(var12, -1);
              ((gga) this).field_N = this.a(kh.field_j, (qc) this, -93);
            } else {
              var10 = new ae(var9, (qc) null);
              var10.field_p = 80;
              var10.field_m = ((gga) this).field_m;
              var10.field_n = 50;
              var10.field_i = 0;
              var10.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gga) this).a(var10, -1);
              ((gga) this).field_N = this.a(kh.field_j, (qc) this, -93);
            }
          } else {
            if (param1 == uq.field_b) {
              var7 = th.field_s;
              ((gga) this).field_p = ((gga) this).field_p + 30;
              var8 = new ae(var7, (qc) null);
              var8.field_p = 80;
              var8.field_m = ((gga) this).field_m;
              var8.field_n = 50;
              var8.field_i = 0;
              var8.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gga) this).a(var8, -1);
              ((gga) this).field_N = this.a(kh.field_j, (qc) this, -93);
            } else {
              var6 = new ae((String) var5, (qc) null);
              var6.field_p = 80;
              var6.field_m = ((gga) this).field_m;
              var6.field_n = 50;
              var6.field_i = 0;
              var6.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gga) this).a(var6, -1);
              ((gga) this).field_N = this.a(kh.field_j, (qc) this, -93);
            }
          }
        }
    }

    private final void g(int param0) {
        Object var3 = null;
        if (((gga) this).field_B) {
          if (param0 != 256) {
            var3 = null;
            ((gga) this).a(14, -50, (rj) null, -113, (byte) -27);
            ((gga) this).field_B = false;
            return;
          } else {
            ((gga) this).field_B = false;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new ur(8);
        field_L = "Perpetually spinning discs";
    }
}
