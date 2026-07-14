/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static le field_e;
    private int field_b;
    static String field_a;
    private boolean field_f;
    private int field_d;
    private int[] field_c;

    final static String a(int param0) {
        if (!((vh.field_n ^ -1) <= -3)) {
            return nc.field_Z;
        }
        if (!(null == lf.field_a)) {
            if (!(lf.field_a.b(-1))) {
                return de.field_b;
            }
            return mi.field_e;
        }
        if (!(og.field_g.b(-1))) {
            return jj.field_B;
        }
        if (!og.field_g.b((byte) 91, "commonui")) {
            return kj.field_z + " - " + og.field_g.a((byte) -41, "commonui") + "%";
        }
        if (!(am.field_b.b(-1))) {
            return bk.field_a;
        }
        if (!am.field_b.b((byte) -103, "commonui")) {
            return hi.field_e + " - " + am.field_b.a((byte) -97, "commonui") + "%";
        }
        int var1 = 87 % ((param0 - -3) / 57);
        if (!wb.field_b.b(-1)) {
            return ge.field_i;
        }
        if (!(wb.field_b.c(7715))) {
            return fa.field_c + " - " + wb.field_b.a(20147) + "%";
        }
        return ql.field_f;
    }

    final int b(int param0) {
        if (param0 != 1) {
            field_e = null;
        }
        return ((tj) this).field_b + 1;
    }

    private final void a(int param0, int param1, int param2) {
        if (!(param0 <= ((tj) this).field_b)) {
            ((tj) this).field_b = param0;
        }
        if (!(((tj) this).field_c.length > param0)) {
            this.a(param0, true);
        }
        ((tj) this).field_c[param0] = param1;
        if (param2 != -11784) {
            ((tj) this).field_f = true;
        }
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        var3 = ((tj) this).field_c.length;
        L1: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((tj) this).field_f) {
              if (0 == var3) {
                var3 = 1;
                continue L1;
              } else {
                var3 = var3 * ((tj) this).field_d;
                continue L1;
              }
            } else {
              var3 = var3 + ((tj) this).field_d;
              continue L1;
            }
          }
        }
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            ((tj) this).field_b = -70;
        }
        if (((tj) this).field_b < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((tj) this).field_c[param1];
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        if (param0 != -14189) {
            return null;
        }
        if (!(!param3)) {
            var4++;
        }
        return ee.field_d[var4];
    }

    final static void a(be param0, java.awt.Frame param1, int param2) {
        eb var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        L0: while (true) {
          var3 = param0.a((byte) -120, param1);
          L1: while (true) {
            if (-1 != (var3.field_a ^ -1)) {
              if ((var3.field_a ^ -1) != -2) {
                hb.a(100L, 101);
                continue L0;
              } else {
                L2: {
                  param1.setVisible(false);
                  param1.dispose();
                  if (param2 == -23144) {
                    break L2;
                  } else {
                    var5 = null;
                    boolean discarded$1 = tj.a(false, -4, (CharSequence) null);
                    break L2;
                  }
                }
                return;
              }
            } else {
              hb.a(10L, 109);
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        if (!param1) {
            field_a = null;
        }
        int[] var4 = new int[this.c(param0, -1)];
        int[] var3 = var4;
        mk.a(((tj) this).field_c, 0, var4, 0, ((tj) this).field_c.length);
        ((tj) this).field_c = var4;
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != -58) {
            String discarded$0 = tj.a(28);
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        var4 = new char[param0];
        var5 = 0;
        var6 = param2;
        L0: while (true) {
          if (var6 >= param0) {
            return new String(var4, 0, var5);
          } else {
            var7 = 255 & param3[var6 + param1];
            if (-1 != (var7 ^ -1)) {
              L1: {
                if (128 > var7) {
                  break L1;
                } else {
                  if (var7 >= 160) {
                    break L1;
                  } else {
                    L2: {
                      var8 = fe.field_a[var7 - 128];
                      if (var8 == 0) {
                        var8 = 63;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var7 = var8;
                    break L1;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (!vl.a(param0, param2, -125)) {
            return false;
        }
        for (var3 = param1; var3 < param2.length(); var3++) {
            if (!(vg.a(param2.charAt(var3), -22118))) {
                return false;
            }
        }
        return true;
    }

    final void b(int param0, int param1) {
        this.a(((tj) this).field_b + param0, param1, param0 ^ -11783);
    }

    final static hj c(int param0) {
        int var4_int = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        int var1 = wh.field_b[0] * m.field_a[0];
        byte[] var2 = fl.field_a[0];
        int[] var3 = new int[var1];
        if (param0 < 95) {
            field_a = null;
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = vc.field_g[vi.a(255, (int) var2[var4_int])];
        }
        hj var4 = new hj(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], var3);
        md.a((byte) -125);
        return var4;
    }

    private tj() throws Throwable {
        throw new Error();
    }

    final void a(int param0, int param1) {
        if (-1 >= (param0 ^ -1)) {
            // if_icmplt L18
        } else {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 != -3344) {
            String discarded$0 = tj.a(-117);
        }
        if (param0 != ((tj) this).field_b) {
            mk.a(((tj) this).field_c, 1 + param0, ((tj) this).field_c, param0, ((tj) this).field_b + -param0);
        }
        ((tj) this).field_b = ((tj) this).field_b - 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_e = new le();
    }
}
