/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends lw {
    static kv[] field_l;
    static pb field_m;

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (!(0 != param0)) {
            return 0;
        }
        if (!(-1 <= (param0 ^ -1))) {
            var2 = 1;
            if (!(65535 >= param0)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (param0 > 255) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(param0 <= 15)) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (param0 > 3) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (-2 > (param0 ^ -1)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (-65536 > param0) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(255 >= (param0 ^ -1))) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!((param0 ^ -1) <= 15)) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (param1) {
            return 49;
        }
        if (!(-2 <= param0)) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    final void a(int param0, byte param1) {
        java.applet.Applet discarded$2 = null;
        L0: {
          L1: {
            if (-1 != (this.field_e ^ -1)) {
              break L1;
            } else {
              if (param0 != 35) {
                break L1;
              } else {
                this.b(1);
                this.c(100);
                sh.field_I = true;
                break L0;
              }
            }
          }
          if (-12 != (param0 ^ -1)) {
            break L0;
          } else {
            if (0 == this.field_e) {
              return;
            } else {
              this.b(param1 ^ 72);
              this.b((byte) 112);
              if (!um.a(true)) {
                break L0;
              } else {
                if (!this.c((byte) 95)) {
                  break L0;
                } else {
                  fla.b(param1 + 23548);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (param1 == 73) {
            break L2;
          } else {
            discarded$2 = nia.d(124);
            break L2;
          }
        }
    }

    final static java.applet.Applet d(int param0) {
        if (!(ov.field_f == null)) {
            return ov.field_f;
        }
        if (param0 != -31768) {
            return (java.applet.Applet) null;
        }
        return (java.applet.Applet) ((Object) re.field_C);
    }

    final void a(byte param0) {
        int var2 = (int)((1.0 - Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0)) * 256.0);
        if (!((this.field_e ^ -1) != -2)) {
            vg.a(sia.field_j, 9280, 22997, 37000, var2 + 4096, 1760, var2 + 4096, sia.field_j.field_o << 1113301731, sia.field_j.field_n << -1351324413);
        }
        if (param0 < 103) {
            this.a(8);
        }
    }

    public static void b(boolean param0) {
        int discarded$0 = 0;
        field_l = null;
        field_m = null;
        if (param0) {
            discarded$0 = nia.a(-47, true);
        }
    }

    nia() {
        super(true, new String[]{md.field_m, fq.field_p}, id.field_j);
        this.field_c = new int[][]{new int[]{320, 400}, new int[]{320, 390}};
    }

    final void a(int param0) {
        this.c(109);
        int var2 = -103 / ((59 - param0) / 33);
    }

    final static void e(byte param0) {
        int discarded$2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              sd.field_b = new int[50];
              var1_int = (rla.a(false, 16777088) + -rla.a(false, 16711680)) / 50;
              var2 = (tf.a(-6, 16777088) + -tf.a(-127, 16711680)) / 50;
              if (param0 >= 16) {
                break L1;
              } else {
                discarded$2 = nia.a(120, true);
                break L1;
              }
            }
            var3 = (lda.a(16777088, (byte) -36) - lda.a(16711680, (byte) -45)) / 50;
            var4 = 0;
            L2: while (true) {
              if (-51 >= (var4 ^ -1)) {
                break L0;
              } else {
                sd.field_b[var4] = gna.a(rla.a(false, 16711680) - -(var4 * var1_int), (byte) -64, var4 * var3 + lda.a(16711680, (byte) -21), tf.a(-127, 16711680) - -(var4 * var2));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "nia.H(" + param0 + ')');
        }
    }

    final static String d(byte param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = BachelorFridge.field_y;
        if (param0 > -80) {
            return (String) null;
        }
        String var6 = "(" + f.field_b + " " + ef.field_l + " " + bd.field_j + ") " + ri.field_a;
        String var1 = var6;
        if ((dw.field_f ^ -1) < -1) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < dw.field_f; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & ig.field_m.field_h[var2];
                var4 = var3 >> -1121663804;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                var8 = var7 + (char)var4;
                if (10 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    static {
    }
}
