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
        if (!(param0 <= 0)) {
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
            if (param0 > 1) {
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
        if (!(param0 >= -256)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(param0 >= -16)) {
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
        L0: {
          L1: {
            if (((nia) this).field_e != 0) {
              break L1;
            } else {
              if (param0 != 35) {
                break L1;
              } else {
                ((nia) this).b(1);
                ((nia) this).c(100);
                sh.field_I = true;
                break L0;
              }
            }
          }
          if (param0 != 11) {
            break L0;
          } else {
            if (0 == ((nia) this).field_e) {
              return;
            } else {
              ((nia) this).b(param1 ^ 72);
              ((nia) this).b((byte) 112);
              if (!um.a(true)) {
                break L0;
              } else {
                if (!((nia) this).c((byte) 95)) {
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
            java.applet.Applet discarded$2 = nia.d(124);
            break L2;
          }
        }
    }

    final static java.applet.Applet d(int param0) {
        if (!(ov.field_f == null)) {
            return ov.field_f;
        }
        if (param0 != -31768) {
            return null;
        }
        return (java.applet.Applet) (Object) re.field_C;
    }

    final void a(byte param0) {
        int var2 = (int)((1.0 - Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0)) * 256.0);
        if (!(((nia) this).field_e != 1)) {
            vg.a(sia.field_j, 9280, 22997, 37000, var2 + 4096, 1760, var2 + 4096, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
        }
        if (param0 < 103) {
            ((nia) this).a(8);
        }
    }

    public static void b() {
        field_l = null;
        field_m = null;
    }

    nia() {
        super(true, new String[2], id.field_j);
        ((nia) this).field_c = new int[][]{new int[2], new int[2]};
    }

    final void a(int param0) {
        ((nia) this).c(109);
        int var2 = -103 / ((59 - param0) / 33);
    }

    final static void e(byte param0) {
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
                int discarded$2 = nia.a(120, true);
                break L1;
              }
            }
            var3 = (lda.a(16777088, (byte) -36) - lda.a(16711680, (byte) -45)) / 50;
            var4 = 0;
            L2: while (true) {
              if (var4 >= 50) {
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
          throw pe.a((Throwable) (Object) var1, "nia.H(" + param0 + 41);
        }
    }

    final static String d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (param0 > -80) {
            return null;
        }
        String var1 = "(" + f.field_b + " " + ef.field_l + " " + bd.field_j + ") " + ri.field_a;
        if (dw.field_f > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < dw.field_f; var2++) {
                var1 = var1 + 32;
                var3 = 255 & ig.field_m.field_h[var2];
                var4 = var3 >> 4;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (10 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    static {
    }
}
