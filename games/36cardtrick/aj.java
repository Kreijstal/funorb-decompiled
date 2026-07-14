/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_e;
    int field_f;
    ci field_i;
    int field_j;
    int field_c;
    ci field_n;
    int field_g;
    static bk field_s;
    ci field_r;
    int field_d;
    private int field_k;
    static aj field_a;
    ci field_h;
    int field_l;
    private boolean field_b;
    ee field_o;
    ci field_m;
    static java.awt.Color field_p;
    static td field_q;

    private final void a(int param0, String param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = Main.field_T;
          var5 = ((aj) this).field_j + ((aj) this).field_l;
          var6 = ((aj) this).field_e + ((aj) this).field_f;
          var7 = ((aj) this).field_c;
          if (-1 != var7) {
            break L0;
          } else {
            var7 = ((aj) this).field_o.field_x + ((aj) this).field_o.field_s;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = vj.field_l >> -1389862974;
            var9 = ((aj) this).field_o.a(param1);
            var10 = ((aj) this).field_o.field_x + ((aj) this).field_o.field_s;
            var12 = 53 % ((param3 - 76) / 36);
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (0 != (param1.indexOf("<br>") ^ -1)) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (var9 > var8) {
              var14 = var9 / var8;
              var13 = (var9 % var8 - -var14 - 1) / var14 * 2 + var8;
              break L3;
            } else {
              var13 = var8;
              break L3;
            }
          }
          L4: {
            if (null == ma.field_d) {
              ma.field_d = new String[16];
              break L4;
            } else {
              break L4;
            }
          }
          var11 = ((aj) this).field_o.a(param1, new int[1], ma.field_d);
          var9 = 0;
          var10 = var10 + (var11 - 1) * var7;
          var14 = 0;
          L5: while (true) {
            if (var14 >= var11) {
              break L1;
            } else {
              var15 = ((aj) this).field_o.a(ma.field_d[var14]);
              if (var15 > var9) {
                var9 = var15;
                var14++;
                continue L5;
              } else {
                var14++;
                continue L5;
              }
            }
          }
        }
        L6: {
          var13 = param2;
          if (var5 + var13 + var9 <= vj.field_l) {
            break L6;
          } else {
            var13 = -var5 + -var9 + vj.field_l;
            break L6;
          }
        }
        L7: {
          var14 = 32 + (param0 - ((aj) this).field_o.field_q);
          if (var6 + (var10 + var14) > vj.field_g) {
            var14 = param0 - var10 - var6;
            break L7;
          } else {
            break L7;
          }
        }
        vj.b(var13, var14, var9 + var5, var10 + var6, ((aj) this).field_g);
        vj.c(1 + var13, var14 - -1, -2 + var5 + var9, var10 + var6 + -2, ((aj) this).field_d);
        int discarded$1 = ((aj) this).field_o.a(param1, ((aj) this).field_l + var13, ((aj) this).field_e + var14, var9, var10, ((aj) this).field_k, -1, 0, 0, var7);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        vj.e(param2, param0, param1, param5, param3);
        if (param4 != 0) {
            ee var8 = (ee) null;
            ((aj) this).a(-29, (ee) null);
        }
    }

    public static void a(int param0) {
        if (param0 <= 43) {
            aj.a(42);
        }
        field_p = null;
        field_a = null;
        field_q = null;
        field_s = null;
    }

    final static qk a(int param0, int param1) {
        if (param0 != 1) {
            qk discarded$0 = aj.a(38, 2);
        }
        return lf.a(true, false, 1, param1, (byte) -70, false);
    }

    private final void b(int param0, String param1, int param2, byte param3) {
        int var5 = ((aj) this).field_o.a(param1);
        int var6 = ((aj) this).field_o.field_q - -((aj) this).field_o.field_x;
        int var7 = param2;
        if (!(vj.field_l >= var7 - -var5 - -6)) {
            var7 = vj.field_l + -var5 - 6;
        }
        int var8 = param0 + -((aj) this).field_o.field_q - -32;
        if (6 + (var6 + var8) > vj.field_g) {
            var8 = -6 + vj.field_g + -var6;
        }
        int var9 = 32 / ((-25 - param3) / 44);
        vj.b(var7, var8, 6 + var5, var6 + 6, ((aj) this).field_k);
        vj.c(1 + var7, var8 + 1, var5 + 4, var6 + 4, ((aj) this).field_d);
        ((aj) this).field_o.b(param1, 3 + var7, ((aj) this).field_o.field_q + 3 + var8, ((aj) this).field_k, -1);
    }

    final void a(int param0, ee param1) {
        int var7_int = 0;
        int var15 = Main.field_T;
        ek var3 = new ek(param1, 2, 2, 2236962, 1, 1, 1, ((ee) param1).field_x + ((ee) param1).field_s + 2);
        ((aj) this).field_h = (ci) (Object) var3;
        var3.field_h = 16777215;
        nd var4 = new nd();
        var3.a((ek) (Object) var4, (byte) 113);
        ((aj) this).field_e = 3;
        ((aj) this).field_l = 3;
        ((aj) this).field_k = 15658734;
        var4.field_l = 15658734;
        ((aj) this).field_c = -1;
        ((aj) this).field_g = 15658734;
        ((aj) this).field_j = 3;
        ((aj) this).field_d = 5592405;
        ((aj) this).field_o = param1;
        ((aj) this).field_f = 3;
        var4.field_o = 11711154;
        oc discarded$0 = var4.a((byte) -1, 0).c(15658734, (byte) 52).a(fb.a(18457, 8947848, 10066329, 7829367), true);
        oc discarded$1 = var4.a((byte) -1, 1).a(fb.a(18457, 11184810, 10066329, 13421772), true);
        oc discarded$2 = var4.a((byte) -1, 3).a(fb.a(18457, 8947848, 7829367, 10066329), true).b(1, (byte) -51).a(1, -99);
        kc[] var5 = new kc[9];
        si var16 = new si(32, 32);
        si var6 = var16;
        for (var7_int = 0; ((si) var6).field_r.length > var7_int; var7_int++) {
            ((si) var16).field_r[var7_int] = 1077952576;
        }
        var5[4] = (kc) (Object) var6;
        oc discarded$3 = var4.a((byte) -1, 4).a(true, (byte) -74).a(var5, true);
        oc discarded$4 = var4.a((byte) -1, 5).a(wf.a(0, 1, 0, 0, 65793), true).a(true, (byte) -104).c(-1, (byte) 73);
        ((aj) this).field_i = (ci) (Object) var4;
        var6 = (si) (Object) new nd(var4, true);
        ((nd) (Object) var6).field_i = 0;
        nd var7 = new nd(var4, true);
        var7.field_i = 0;
        var7.a(we.a(102, 8947848), -120);
        oc discarded$5 = var7.a((byte) -1, 1).a(we.a(param0 + 48, 11184810), true).c(2236962, (byte) 48);
        ((aj) this).field_m = (ci) (Object) new db(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        ug discarded$6 = new ug(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        tb discarded$7 = new tb(param1, 16777215, param0, 125269879, 4473924, 3, 268435455);
        nd var8 = new nd();
        var3.a((ek) (Object) var8, (byte) -101);
        oc discarded$8 = var8.a((byte) -1, 0).a(fb.a(18457, 15658734, 7829367, 10066329), true).c(1118481, (byte) 68).a(-1, (byte) -118);
        oc discarded$9 = var8.a((byte) -1, 4).a(true, (byte) -93).a(var5, true);
        ((aj) this).field_r = (ci) (Object) var8;
        kc[] var9 = new kc[9];
        var9[4] = new kc(2, 1);
        kc[] var10 = new kc[9];
        var10[4] = new kc(1, 2);
        var9[4].field_r = new int[]{6710886, 7829367};
        var10[4].field_r = new int[]{6710886, 7829367};
        nd var11 = new nd();
        nd var12 = new nd();
        var11.a(true, 0, var9);
        var12.a(true, 0, var10);
        kc var13 = new kc(7, 4);
        var13.field_r = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        nd var14 = new nd(var4, true);
        var14.a(var13.b(), (byte) -78);
        var13.d();
        var14 = new nd(var4, true);
        var14.a(var13.b(), (byte) -103);
        var13.d();
        var14 = new nd(var4, true);
        var14.a(var13.b(), (byte) -53);
        var13.d();
        var14 = new nd(var4, true);
        var14.a(var13, (byte) 109);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        vj.a(param2, param3, param5, param4, param0, param6);
        if (param1 != 10066329) {
            ((aj) this).field_g = -24;
        }
    }

    final static String a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Main.field_T;
        if (param0 != 92) {
            return (String) null;
        }
        String var1 = "(" + ni.field_d + " " + hc.field_f + " " + sb.field_a + ") " + pd.field_l;
        if (al.field_a <= 0) {
        } else {
            var1 = var1 + ":";
            for (var2 = 0; al.field_a > var2; var2++) {
                var1 = var1 + 32;
                var3 = 255 & rd.field_j.field_g[var2];
                var4 = var3 >> 1535326116;
                if (-11 >= var4) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                if (-11 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    public aj() {
        ((aj) this).field_b = true;
    }

    final void a(int param0, byte param1, String param2, int param3) {
        if (param1 != -53) {
            ee var6 = (ee) null;
            ((aj) this).a(-126, (ee) null);
        }
        if (!((aj) this).field_b) {
            this.b(param3, param2, param0, (byte) -115);
        } else {
            this.a(param3, param2, param0, (byte) 115);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new bk();
        field_p = new java.awt.Color(10040319);
        field_q = new td();
    }
}
