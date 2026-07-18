/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_b;
    private boolean field_h;
    static String field_e;
    private gd field_c;
    private vj field_a;
    int field_f;
    static int field_d;
    static java.applet.Applet field_g;

    private final int c() {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = aw.field_j[((la) this).field_f].length;
        for (var3 = 0; var2 > var3; var3++) {
            if (!(aw.field_j[((la) this).field_f][var3][0] < 0)) {
                return var3;
            }
        }
        return 0;
    }

    public static void b() {
        field_g = null;
        field_e = null;
    }

    final static void b(int param0) {
        rs.field_t = 0;
        hf.field_c = true;
    }

    final static void d() {
        int[] var6 = null;
        int var2 = 0;
        int var3 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            var6 = jp.field_g;
            int[] var1 = var6;
            var2 = 0;
            var3 = var6.length;
            while (var3 > var2) {
                int incrementValue$0 = var2;
                var2++;
                var6[incrementValue$0] = 0;
                int incrementValue$1 = var2;
                var2++;
                var6[incrementValue$1] = 0;
                int incrementValue$2 = var2;
                var2++;
                var6[incrementValue$2] = 0;
                int incrementValue$3 = var2;
                var2++;
                var6[incrementValue$3] = 0;
                int incrementValue$4 = var2;
                var2++;
                var6[incrementValue$4] = 0;
                int incrementValue$5 = var2;
                var2++;
                var6[incrementValue$5] = 0;
                int incrementValue$6 = var2;
                var2++;
                var6[incrementValue$6] = 0;
                int incrementValue$7 = var2;
                var2++;
                var6[incrementValue$7] = 0;
            }
            int var4 = 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "la.K(" + 111 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        tg var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        hl var3 = sm.a(75, param1, param0);
        if (var3 != null) {
            tn.field_Z.a(23899, false);
            var4 = tn.field_Z;
            var5_ref_String = wp.field_y;
            var4.field_i.a(5, var5_ref_String, (byte) -109);
            var4 = tn.field_Z;
            var5 = iu.field_t;
            var6 = ur.field_z;
            var4.field_i.a(0, var6, 0, (byte) -118, var5);
        }
        tr.a(-115, param0, param1);
    }

    private final void a(int param0) {
        int var2 = ((la) this).field_a.field_i >> 16;
        if (param0 < 68) {
            this.a(91);
        }
        int discarded$0 = 1;
        wp var3 = we.a(var2);
        int discarded$1 = -34;
        io.a(var3);
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = 0;
          if (((la) this).field_b != param1) {
            if (-1 == param1) {
              break L0;
            } else {
              if (param1 < 0) {
                break L0;
              } else {
                if (param1 >= 9) {
                  break L0;
                } else {
                  var3 = 1;
                  ((la) this).field_b = param1;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (((la) this).field_b == -1) {
              break L2;
            } else {
              if (((la) this).field_b < 0) {
                break L2;
              } else {
                if (((la) this).field_b >= 9) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          var3 = 1;
          ((la) this).field_b = 0;
          break L1;
        }
        L3: {
          if (var3 == 0) {
            break L3;
          } else {
            L4: {
              if (aw.field_j[((la) this).field_f][((la) this).field_b][0] < 0) {
                int discarded$2 = 82;
                ((la) this).field_b = this.c();
                break L4;
              } else {
                break L4;
              }
            }
            this.c(param0 ^ -126);
            break L3;
          }
        }
        L5: {
          if (param0 == -126) {
            break L5;
          } else {
            ((la) this).field_f = -111;
            break L5;
          }
        }
    }

    final static void b(byte param0, int param1) {
        lk.field_h = 0;
        am.field_D = new int[3];
        an.field_F = new mo[3000];
        vj.field_g = 200;
    }

    final void a(byte param0) {
        int var3 = -30 / ((-31 - param0) / 54);
        int var2 = 0;
        this.a((byte) -126, var2);
        boolean discarded$0 = ((la) this).field_a.a(-122);
        this.a(73);
    }

    la(int param0) {
        ((la) this).field_a = new vj(1);
        ((la) this).field_f = param0;
        if (param0 == 43) {
            param0 = 77;
        }
        ((la) this).field_c = (gd) (Object) mn.field_k[param0][0];
        ((la) this).field_h = nh.field_D[param0];
        ((la) this).field_b = 0;
        this.c(0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1 = param1 | param1 << 8;
            var6_int = param1 ^ param1 >> 1;
            var9 = 0;
            L1: while (true) {
              if (var9 >= 4) {
                break L0;
              } else {
                L2: {
                  var8 = bm.field_y[var9][1] + (param0 - -(3 & param1) + -64);
                  var7 = -44 + bm.field_y[var9][0] + (param3 + (7 & var6_int));
                  if (var9 != 0) {
                    nr.field_c[param1 % 9 - -25].b(var7, var8, param4, param2);
                    break L2;
                  } else {
                    nr.field_c[16 + param1 % 9].b(var7, var8 + -bm.field_y[var9][1], param4, param2);
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                var6_int = var6_int >> 1;
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "la.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + false + ')');
        }
    }

    private final void c(int param0) {
        L0: {
          L1: {
            if (((la) this).field_b < 0) {
              break L1;
            } else {
              if (((la) this).field_b >= 9) {
                break L1;
              } else {
                ((la) this).field_a.a(-1, ck.field_e[sf.field_P[((la) this).field_f]][aw.field_j[((la) this).field_f][((la) this).field_b][0]]);
                break L0;
              }
            }
          }
          ((la) this).field_a.a(~param0, ck.field_e[sf.field_P[((la) this).field_f]][0]);
          break L0;
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            this.a((byte) 11, -94);
            break L2;
          }
        }
        this.a(81);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        gd var15 = (gd) (Object) ((la) this).field_a.a(false, true, false, (kk) (Object) ((la) this).field_c);
        if (!(75 != ((la) this).field_f)) {
            var15.b(250, 250, 250);
        }
        if (!(((la) this).field_f != 76)) {
            var15.b(512, 512, 512);
        }
        int var8 = 0;
        int var9 = 2044 & param3 << 2;
        if (param4 <= 66) {
            ((la) this).field_f = 63;
        }
        int var10 = 0;
        tm.c(param2, param1);
        int var11 = 20;
        int var12 = 0;
        int var13 = 500;
        int var14 = 250 - (((la) this).field_h ? 100 * param0 / 128 : 0);
        var14 = var14 + wv.field_g[((la) this).field_f];
        var15.b(param0, param0, param0);
        if (param5) {
            fh.a(124, var15);
        }
        var15.a(var8, var9, var10, var11, var12, var14, var13);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter multiplayer lobby";
    }
}
