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

    private final int c(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = aw.field_j[this.field_f].length;
        var3 = 0;
        L0: while (true) {
          if (var2 <= var3) {
            if (param0 == 82) {
              return 0;
            } else {
              return 111;
            }
          } else {
            if ((aw.field_j[this.field_f][var3][0] ^ -1) <= -1) {
              return var3;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 >= -106) {
            la.d((byte) -100);
        }
    }

    final static void b(int param0) {
        if (param0 != -26887) {
            return;
        }
        rs.field_t = 0;
        hf.field_c = true;
    }

    final static void d(byte param0) {
        int[] var6 = null;
        int var2 = 0;
        int var3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            var6 = jp.field_g;
            int[] var1 = var6;
            var2 = 0;
            var3 = var6.length;
            while (var3 > var2) {
                incrementValue$0 = var2;
                var2++;
                var6[incrementValue$0] = 0;
                incrementValue$1 = var2;
                var2++;
                var6[incrementValue$1] = 0;
                incrementValue$2 = var2;
                var2++;
                var6[incrementValue$2] = 0;
                incrementValue$3 = var2;
                var2++;
                var6[incrementValue$3] = 0;
                incrementValue$4 = var2;
                var2++;
                var6[incrementValue$4] = 0;
                incrementValue$5 = var2;
                var2++;
                var6[incrementValue$5] = 0;
                incrementValue$6 = var2;
                var2++;
                var6[incrementValue$6] = 0;
                incrementValue$7 = var2;
                var2++;
                var6[incrementValue$7] = 0;
            }
            int var4 = 57 % ((-6 - param0) / 49);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "la.K(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        tg var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        hl var3 = sm.a(param2 + 76, param1, param0);
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
        if (param2 != -1) {
            field_g = (java.applet.Applet) null;
        }
    }

    private final void a(int param0) {
        int var2 = this.field_a.field_i >> -683580368;
        if (param0 < 68) {
            this.a(91);
        }
        wp var3 = we.a(var2, true);
        io.a(var3, (byte) -34);
    }

    private final void a(byte param0, int param1) {
        int var3;
        L0: {
          var3 = 0;
          if (this.field_b != param1) {
            if (-1 == param1) {
              break L0;
            } else {
              if ((param1 ^ -1) > -1) {
                break L0;
              } else {
                if ((param1 ^ -1) <= -10) {
                  break L0;
                } else {
                  var3 = 1;
                  this.field_b = param1;
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
            if (0 == (this.field_b ^ -1)) {
              break L2;
            } else {
              if (this.field_b < 0) {
                break L2;
              } else {
                if ((this.field_b ^ -1) <= -10) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          var3 = 1;
          this.field_b = 0;
          break L1;
        }
        L3: {
          if (var3 == 0) {
            break L3;
          } else {
            L4: {
              if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                this.field_b = this.c((byte) 82);
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
            this.field_f = -111;
            break L5;
          }
        }
    }

    final static void b(byte param0, int param1) {
        if (param0 != 30) {
            la.b(104);
        }
        lk.field_h = 0;
        am.field_D = new int[3];
        an.field_F = new mo[param1 * 15];
        vj.field_g = param1;
    }

    final void a(byte param0) {
        int var3 = -30 / ((-31 - param0) / 54);
        int var2 = 0;
        this.a((byte) -126, var2);
        this.field_a.a(-122);
        this.a(73);
    }

    la(int param0) {
        this.field_a = new vj(1);
        this.field_f = param0;
        if (-44 == (param0 ^ -1)) {
            param0 = 77;
        }
        this.field_c = (gd) ((Object) mn.field_k[param0][0]);
        this.field_h = nh.field_D[param0];
        this.field_b = 0;
        this.c(0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param1 = param1 | param1 << 185101192;
              if (!param5) {
                break L1;
              } else {
                field_g = (java.applet.Applet) null;
                break L1;
              }
            }
            var6_int = param1 ^ param1 >> 2049244769;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                break L0;
              } else {
                L3: {
                  var8 = bm.field_y[var9][1] + (param0 - -(3 & param1) + -64);
                  var7 = -44 + bm.field_y[var9][0] + (param3 + (7 & var6_int));
                  if (var9 != 0) {
                    nr.field_c[param1 % 9 - -25].b(var7, var8, param4, param2);
                    break L3;
                  } else {
                    nr.field_c[16 + param1 % 9].b(var7, var8 + -bm.field_y[var9][1], param4, param2);
                    break L3;
                  }
                }
                param1 = param1 >> 1;
                var6_int = var6_int >> 1;
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "la.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(int param0) {
        L0: {
          L1: {
            if (-1 < (this.field_b ^ -1)) {
              break L1;
            } else {
              if (this.field_b >= 9) {
                break L1;
              } else {
                this.field_a.a(-1, ck.field_e[sf.field_P[this.field_f]][aw.field_j[this.field_f][this.field_b][0]]);
                break L0;
              }
            }
          }
          this.field_a.a(param0 ^ -1, ck.field_e[sf.field_P[this.field_f]][0]);
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
        gd var15 = (gd) ((Object) this.field_a.a(false, true, false, this.field_c));
        if (!(75 != this.field_f)) {
            var15.b(250, 250, 250);
        }
        if (!((this.field_f ^ -1) != -77)) {
            var15.b(512, 512, 512);
        }
        int var8 = 0;
        int var9 = 2044 & param3 << -1502587230;
        if (param4 <= 66) {
            this.field_f = 63;
        }
        int var10 = 0;
        tm.c(param2, param1);
        int var11 = 20;
        int var12 = 0;
        int var13 = 500;
        int var14 = 250 - (this.field_h ? 100 * param0 / 128 : 0);
        var14 = var14 + wv.field_g[this.field_f];
        var15.b(param0, param0, param0);
        if (param5) {
            fh.a(124, var15);
        }
        var15.a(var8, var9, var10, var11, var12, var14, var13);
    }

    static {
        field_e = "Enter multiplayer lobby";
    }
}
