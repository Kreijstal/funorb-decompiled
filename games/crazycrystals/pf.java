/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends pn implements Cloneable {
    static String[] field_m;
    transient int field_w;
    private transient boolean field_t;
    transient int field_p;
    transient int field_u;
    private boolean field_y;
    static int field_n;
    private transient int field_o;
    private transient int field_s;
    transient int field_v;
    transient boolean field_r;
    private transient int field_q;
    private transient int field_x;

    final boolean b(byte param0) {
        if (param0 < 43) {
            return false;
        }
        return true;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        ((pf) this).field_l = ((pf) this).field_l.a(param0, param1, param2, param3, (byte) -108, param5, param6);
        if (param4 >= -87) {
            f discarded$0 = ((pf) this).a(52, (byte) 78, 42);
        }
        return super.a(param0, param1, param2, param3, (byte) -108, param5, param6);
    }

    pf(int param0, int param1, f param2) {
        super(param2);
        ((pf) this).field_p = 0;
        ((pf) this).field_t = false;
        ((pf) this).field_r = false;
        ((pf) this).field_q = 0;
        ((pf) this).field_x = 0;
        ((pf) this).field_s = 3 & param1;
        ((pf) this).field_o = param0 & 3;
        ((pf) this).a((byte) 94, param2);
    }

    final void a(f[][] param0, int param1, int param2, boolean param3) {
        ((pf) this).field_p = ((pf) this).field_x;
        ((pf) this).field_r = ((pf) this).field_t;
        ((pf) this).field_t = param3 ? true : false;
        if (((pf) this).field_y) {
            param0[param2][-1 + param1] = param0[param2][-1 + param1].a(param2, (byte) -110, -1 + param1);
            param0[param2][param1 + 1] = param0[param2][1 + param1].a(param2, (byte) -110, 1 + param1);
            param0[param2 - 1][param1] = param0[param2 + -1][param1].a(-1 + param2, (byte) -110, param1);
            param0[param2 + 1][param1] = param0[param2 - -1][param1].a(param2 - -1, (byte) -110, param1);
            ((pf) this).field_y = false;
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            return null;
        }
        if (!(512 <= ((pf) this).field_q)) {
            ((pf) this).field_q = ((pf) this).field_q + 1;
        }
        return (f) this;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            field_m = null;
        }
        return ((pf) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        if (!(param4 != null)) {
            return (f) this;
        }
        fn.field_j = fn.field_j + wd.field_j;
        ob.field_l = ob.field_l - 1;
        fp.field_a = fp.field_a + 32;
        we.field_h = we.field_h + 32;
        je.field_j = je.field_j + 16;
        b.field_a = b.field_a + 16;
        fn.field_j = fn.field_j + 16;
        mb.field_g = mb.field_g + 16;
        if (param5 != -87) {
            ((pf) this).field_x = -110;
        }
        dd.field_c.a(32, param2 * 12, 12 * param1, 0, (byte) -111);
        return (f) (Object) new ig(param0, param4, (f) this, false);
    }

    public static void f(byte param0) {
        field_m = null;
        if (param0 != 33) {
            field_m = null;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 < 92) {
            field_m = null;
        }
        if ((((pf) this).field_q ^ -1) <= -65) {
            if (!(param1 <= ((pf) this).field_x)) {
                ((pf) this).field_x = param1;
                ((pf) this).field_u = param6;
                b.field_a = b.field_a + 20;
                fp.field_a = fp.field_a + 40;
                je.field_j = je.field_j + 20;
                we.field_h = we.field_h + 40;
                ((pf) this).field_t = true;
                ((pf) this).field_v = param2;
                ((pf) this).field_w = param4;
            }
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            return false;
        }
        return ((pf) this).field_l.a(false, param1, param2);
    }

    final void a(fq param0, int param1) {
        if (!(-65 < (((pf) this).field_q ^ -1))) {
            ((pf) this).field_v = 0;
            ((pf) this).field_u = 0;
            ((pf) this).field_t = true;
            ((pf) this).field_x = tm.field_e;
            ((pf) this).field_w = param0.field_u;
        }
        if (param1 <= 126) {
            ((pf) this).field_y = false;
        }
    }

    final void a(f[][] param0, int param1, byte param2, int param3) {
        if (!((pf) this).field_y) {
            if ((((pf) this).field_q ^ -1) <= -257) {
                ((pf) this).field_y = true;
                param0[param3][param1 - 1].a(param0, -1 + param1, (byte) 40, param3);
                param0[param3][param1 + 1].a(param0, param1 - -1, (byte) 40, param3);
                param0[param3 + -1][param1].a(param0, param1, (byte) 40, param3 - 1);
                param0[param3 - -1][param1].a(param0, param1, (byte) 40, 1 + param3);
            }
        }
        if (param2 != 40) {
            f discarded$0 = ((pf) this).a(-67, (ea) null, -94, -97, (byte) 87, 72, (f[][]) null);
        }
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (ja.a(param1, (byte) 0)) {
            return true;
        }
        char[] var6 = ff.field_e;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param1 == var4) {
                return true;
            }
        }
        var2 = s.field_d;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (var4 == param1) {
                return true;
            }
        }
        if (param0 > -93) {
            field_n = 11;
            return false;
        }
        return false;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            ((pf) this).field_r = true;
        }
        return ((pf) this).field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        int var4 = -1;
        for (var5 = param0; param2 > var5; var5++) {
            var4 = oe.field_b[(var4 ^ param1[var5]) & 255] ^ var4 >>> -1824133656;
        }
        var4 = var4 ^ param3;
        return var4;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        pp var4 = null;
        int var4_int = 0;
        we var5_ref_we = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        md var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var8 = CrazyCrystals.field_B;
          var9 = kd.field_n;
          var2 = var9.h(255);
          if (param0 >= 19) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        L1: {
          var3 = var9.h(255);
          if (0 == var2) {
            var4 = (pp) (Object) nh.field_A.g(32073);
            if (var4 == null) {
              jj.a(4);
              return;
            } else {
              L2: {
                var5 = -var9.field_f + rk.field_b;
                var13 = var4.field_g;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var13.length << 1651029858 >= var5) {
                  break L2;
                } else {
                  var5 = var13.length << 116513346;
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                if (var5 <= var7) {
                  var4.field_h = true;
                  var4.a(false);
                  break L1;
                } else {
                  var6[var7 >> -588908382] = var6[var7 >> -588908382] + (var9.h(255) << pf.b(var7 << 2106893544, 768));
                  var7++;
                  continue L3;
                }
              }
            }
          } else {
            if (-2 == (var2 ^ -1)) {
              var4_int = var9.f(0);
              var5_ref_we = (we) (Object) tb.field_b.g(32073);
              L4: while (true) {
                L5: {
                  if (var5_ref_we == null) {
                    break L5;
                  } else {
                    L6: {
                      if (var5_ref_we.field_j != var3) {
                        break L6;
                      } else {
                        if (var5_ref_we.field_g == var4_int) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var5_ref_we = (we) (Object) tb.field_b.a(false);
                    continue L4;
                  }
                }
                if (var5_ref_we != null) {
                  var5_ref_we.a(false);
                  break L1;
                } else {
                  jj.a(4);
                  return;
                }
              }
            } else {
              wp.a((Throwable) null, "LR1: " + ug.a(-1815), 21862);
              jj.a(4);
              break L1;
            }
          }
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        ((pf) this).field_s = param3 & 3;
        if (param0 != -35) {
            return;
        }
        ((pf) this).field_q = 0;
        ((pf) this).field_o = 3 & param2;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        double var8_double = 0.0;
        int var8 = 0;
        double var10 = 0.0;
        int var12 = 0;
        L0: {
          var12 = CrazyCrystals.field_B;
          if (param3) {
            var7 = 64;
            break L0;
          } else {
            var7 = ((pf) this).field_q / 8;
            if (((pf) this).field_r) {
              var8_double = 0.39269908169872414 * (double)(15 & ((pf) this).field_p);
              var10 = 1.0 + (1.0 - Math.cos(var8_double)) * 0.25;
              var7 = (int)(var10 * (double)var7 + 0.5);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) != -25) {
              break L2;
            } else {
              if (param2 != 24) {
                break L2;
              } else {
                wl.field_p[((pf) this).field_s][((pf) this).field_o].d(param4, param5, var7);
                break L1;
              }
            }
          }
          wl.field_p[((pf) this).field_s][((pf) this).field_o].a(param4, param5, 2 * param1, 2 * param2, var7);
          break L1;
        }
        var8 = 76 % ((74 - param0) / 41);
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            return false;
        }
        return ((pf) this).field_l.e(-4128);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return 88;
        }
        return ((pf) this).field_l.a(true, param1);
    }

    final nj a(int param0, nj param1) {
        nj var3 = ((pf) this).field_l.a(param0, param1);
        if (!(var3 == null)) {
            return var3;
        }
        pf var4 = new pf(((pf) this).field_o, ((pf) this).field_s, (f) (Object) new kp(-1));
        var4.field_q = 1024;
        return ng.a(tn.field_m, param1, (f) (Object) var4, (byte) -83, ae.field_C);
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 76 % ((param2 - -43) / 51);
        if (((pf) this).field_r) {
            fn.field_j = fn.field_j + wd.field_j;
            ob.field_l = ob.field_l - 1;
            fp.field_a = fp.field_a + 2;
            je.field_j = je.field_j + 1;
            b.field_a = b.field_a + 1;
            we.field_h = we.field_h + 2;
            param0[param1][param3 + -1].a(120, ((pf) this).field_p, 0, param0, ((pf) this).field_w, param1, 1, param3 - 1);
            param0[param1][param3 - -1].a(95, ((pf) this).field_p, 0, param0, ((pf) this).field_w, param1, -1, 1 + param3);
            param0[param1 - 1][param3].a(115, ((pf) this).field_p, 1, param0, ((pf) this).field_w, -1 + param1, 0, param3);
            param0[param1 - -1][param3].a(94, ((pf) this).field_p, -1, param0, ((pf) this).field_w, param1 + 1, 0, param3);
        }
        return (f) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
