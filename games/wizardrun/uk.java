/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    private kl field_a;
    private di field_d;
    static o field_b;
    private kl field_c;

    final ac b(byte param0, int param1) {
        byte[] var4 = null;
        ac var3 = (ac) ((uk) this).field_d.a((byte) 70, (long)param1);
        if (var3 != null) {
            return var3;
        }
        if (param0 < 27) {
            return null;
        }
        if (-32769 >= (param1 ^ -1)) {
            var4 = ((uk) this).field_a.a(param1 & 32767, 1, 1);
        } else {
            var4 = ((uk) this).field_c.a(param1, 1, 1);
        }
        var3 = new ac();
        if (!(var4 == null)) {
            var3.a(new va(var4), 72);
        }
        if (!(-32769 < (param1 ^ -1))) {
            var3.d((byte) -127);
        }
        ((uk) this).field_d.a((long)param1, 1, (Object) (Object) var3);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = wizardrun.field_H;
        if (!param7) {
            return;
        }
        while (true) {
            param0--;
            if (0 > param0) {
                break;
            }
            var17 = param6;
            var10 = var17;
            var11 = param4;
            var12 = param3;
            var13 = param8;
            var14 = param9;
            var15 = 8355711 & var17[var11] >> 386573729;
            var10[var11] = (kl.b(var13, 33423632) >> -56767927) + ((kl.b(33423361, var12) >> -1072357663) - (-kl.b(255, var14 >> 322571985) - var15));
            param3 = param3 + param1;
            param9 = param9 + param2;
            param4++;
            param8 = param8 + param5;
        }
    }

    final static void a(byte param0, int param1) {
        wj.field_E = 1000000000L / (long)param1;
        if (param0 != 91) {
            field_b = null;
        }
    }

    final static void a(int param0) {
        if (!(wi.field_J)) {
            throw new IllegalStateException();
        }
        if (param0 != 19702) {
            field_b = null;
        }
        if (!(aa.field_lb == null)) {
            aa.field_lb.l(-27697);
        }
        String var1 = qf.c((byte) 77);
        r.field_b = new qc(var1, (String) null, true, false, false);
        u.field_A.b((ub) (Object) td.field_f, (byte) 62);
        td.field_f.c((ub) (Object) r.field_b, -114);
        td.field_f.g((byte) -3);
    }

    final static uh a(String param0, int param1, long param2, boolean param3, String param4) {
        L0: {
          if (param2 != 0L) {
            break L0;
          } else {
            if (param0 != null) {
              return (uh) (Object) new ka(param0, param4);
            } else {
              break L0;
            }
          }
        }
        if (!param3) {
          L1: {
            if (param1 == 8355711) {
              break L1;
            } else {
              field_b = null;
              break L1;
            }
          }
          return (uh) (Object) new bb(param2, param4);
        } else {
          return (uh) (Object) new nh(param2, param4);
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param2) {
            ed.d(0, 0, ed.field_h, ed.field_d, 0, 192);
        } else {
            ed.d();
        }
        od.a(param0 ^ 4, param2);
        if (param0 != -123) {
            field_b = null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -44) {
            uk.a(108);
        }
        field_b = null;
    }

    private uk() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kl param1) {
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int[] var6 = null;
        int var7 = 0;
        mg var8 = null;
        int var9 = 0;
        mg var10 = null;
        var7 = wizardrun.field_H;
        var8 = new mg(param1.a(93, "", "logo.fo3d"));
        var10 = var8;
        var3 = var10.f(255);
        var10.l(19967);
        oh.field_a = ie.a(12, var10);
        cb.field_d = new int[var3][];
        ia.field_f = new le[var3];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            L1: {
              var10.i((byte) -31);
              if (param0 > 115) {
                break L1;
              } else {
                uk.a((byte) -19);
                break L1;
              }
            }
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (var9 >= var3) {
                return;
              } else {
                var5 = ia.field_f[var9];
                var5.a(6, (byte) 108, 6, 6, 1);
                var5.b(-109);
                var6 = new int[]{var5.field_g + var5.field_r >> 735135713, var5.field_D + var5.field_K >> -2086113023, var5.field_E - -var5.field_M >> -770248351};
                cb.field_d[var9] = var6;
                var5.a(-var6[2], -var6[1], -var6[0], 0);
                var9++;
                continue L2;
              }
            }
          } else {
            ia.field_f[var4] = mh.a((byte) -117, var8);
            var4++;
            continue L0;
          }
        }
    }

    static {
    }
}
