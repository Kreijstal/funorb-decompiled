/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private boolean field_o;
    int field_f;
    m field_m;
    dh field_j;
    int field_h;
    int field_p;
    dh field_g;
    static int field_a;
    dh field_c;
    dh field_l;
    int field_d;
    private int field_k;
    dh field_b;
    int field_e;
    int field_i;
    int field_n;

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5 = ((wa) this).field_m.a(param2);
        int var6 = ((wa) this).field_m.field_q + ((wa) this).field_m.field_y;
        int var7 = param1;
        if (!(vb.field_f >= 6 + var7 - -var5)) {
            var7 = -6 + vb.field_f - var5;
        }
        int var8 = -((wa) this).field_m.field_y + (param3 + 32);
        if (!(vb.field_b >= 6 + (var8 - -var6))) {
            var8 = vb.field_b - var6 + -6;
        }
        vb.d(var7, var8, 6 + var5, var6 - -6, ((wa) this).field_k);
        if (param0 != 69) {
            Object var9 = null;
            ((wa) this).a(-83, false, 61, (String) null);
        }
        vb.a(1 + var7, var8 - -1, var5 - -4, 4 + var6, ((wa) this).field_f);
        ((wa) this).field_m.a(param2, 3 + var7, ((wa) this).field_m.field_y + 3 + var8, ((wa) this).field_k, -1);
    }

    final void a(int param0, m param1) {
        int var7_int = 0;
        int var15 = Geoblox.field_C;
        ff var17 = new ff(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_o + param1.field_q));
        ((wa) this).field_b = (dh) (Object) var17;
        var17.field_o = 16777215;
        rd var4 = new rd();
        var17.a((ff) (Object) var4, true);
        ((wa) this).field_n = 15658734;
        var4.field_h = 11711154;
        var4.field_c = 15658734;
        ((wa) this).field_f = 5592405;
        ((wa) this).field_e = 3;
        ((wa) this).field_p = 3;
        ((wa) this).field_k = 15658734;
        ((wa) this).field_h = -1;
        ((wa) this).field_d = 3;
        ((wa) this).field_i = 3;
        ((wa) this).field_m = param1;
        si discarded$0 = var4.a(param0 + -126, 0).b(256, 15658734).a(wa.a(10066329, 8947848, 7829367, 1), true);
        si discarded$1 = var4.a(-106, 1).a(wa.a(10066329, 11184810, 13421772, 1), true);
        si discarded$2 = var4.a(param0 ^ -100, 3).a(wa.a(7829367, 8947848, 10066329, param0 + -8), true).b((byte) -53, 1).a(param0 + -9, 1);
        dm[] var5 = new dm[9];
        il var16 = new il(32, 32);
        il var18 = var16;
        for (var7_int = 0; var18.field_v.length > var7_int; var7_int++) {
            var16.field_v[var7_int] = 1077952576;
        }
        var5[4] = (dm) (Object) var18;
        si discarded$3 = var4.a(-127, 4).a(true, (byte) 73).a(var5, true);
        si discarded$4 = var4.a(-101, 5).a(tf.a(0, 0, 116, 0, 65793), true).a(true, (byte) 73).b(256, -1);
        ((wa) this).field_j = (dh) (Object) var4;
        rd var6 = new rd(var4, true);
        var6.field_g = 0;
        rd var7 = new rd(var4, true);
        var7.field_g = 0;
        var7.a((byte) 124, va.a(8947848, (byte) -112));
        si discarded$5 = var7.a(-116, 1).a(va.a(11184810, (byte) -112), true).b(256, 2236962);
        ((wa) this).field_c = (dh) (Object) new bi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        hb discarded$6 = new hb(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        jf discarded$7 = new jf(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        rd var8 = new rd();
        var17.a((ff) (Object) var8, true);
        si discarded$8 = var8.a(-124, 0).a(wa.a(7829367, 15658734, 10066329, 1), true).b(256, 1118481).a((byte) 16, -1);
        si discarded$9 = var8.a(-105, 4).a(true, (byte) 73).a(var5, true);
        ((wa) this).field_g = (dh) (Object) var8;
        dm[] var9 = new dm[param0];
        dm[] var10 = new dm[9];
        var9[4] = new dm(2, 1);
        var10[4] = new dm(1, 2);
        var9[4].field_v = new int[]{6710886, 7829367};
        var10[4].field_v = new int[]{6710886, 7829367};
        rd var11 = new rd();
        rd var12 = new rd();
        var11.a(var9, 0, (byte) 57);
        var12.a(var10, 0, (byte) 108);
        dm var13 = new dm(7, 4);
        var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        rd var14 = new rd(var4, true);
        var14.a(0, var13.b());
        var13.a();
        var14 = new rd(var4, true);
        var14.a(param0 ^ 9, var13.b());
        var13.a();
        var14 = new rd(var4, true);
        var14.a(0, var13.b());
        var13.a();
        rd var19 = new rd(var4, true);
        var19.a(param0 ^ 9, var13);
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
        var15 = Geoblox.field_C;
        var5 = ((wa) this).field_e + ((wa) this).field_d;
        var6 = ((wa) this).field_p + ((wa) this).field_i;
        var7 = ((wa) this).field_h;
        if (param3 == -3140) {
          L0: {
            if (-1 != var7) {
              break L0;
            } else {
              var7 = ((wa) this).field_m.field_q + ((wa) this).field_m.field_o;
              break L0;
            }
          }
          L1: {
            L2: {
              var8 = vb.field_f >> 994128514;
              var9 = ((wa) this).field_m.a(param1);
              var10 = ((wa) this).field_m.field_q + ((wa) this).field_m.field_o;
              var11 = 1;
              if (var8 < var9) {
                break L2;
              } else {
                if (-1 != param1.indexOf("<br>")) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (dd.field_E != null) {
                break L3;
              } else {
                dd.field_E = new String[16];
                break L3;
              }
            }
            L4: {
              if (var8 >= var9) {
                var12 = var8;
                break L4;
              } else {
                var13 = var9 / var8;
                var12 = (var9 % var8 - -var13 - 1) / var13 * 2 + var8;
                break L4;
              }
            }
            var11 = ((wa) this).field_m.a(param1, new int[1], dd.field_E);
            var9 = 0;
            var10 = var10 + (var11 + -1) * var7;
            var13 = 0;
            L5: while (true) {
              if (var13 >= var11) {
                break L1;
              } else {
                var14 = ((wa) this).field_m.a(dd.field_E[var13]);
                if (var14 > var9) {
                  var9 = var14;
                  var13++;
                  continue L5;
                } else {
                  var13++;
                  continue L5;
                }
              }
            }
          }
          L6: {
            var12 = param2;
            if (var5 + var9 + var12 > vb.field_f) {
              var12 = -var5 + (vb.field_f + -var9);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var13 = 32 + (-((wa) this).field_m.field_y + param0);
            if (vb.field_b >= var10 + (var13 - -var6)) {
              break L7;
            } else {
              var13 = param0 - var10 - var6;
              break L7;
            }
          }
          vb.d(var12, var13, var5 + var9, var10 + var6, ((wa) this).field_n);
          vb.a(1 + var12, 1 + var13, var9 + (var5 - 2), -2 + (var10 + var6), ((wa) this).field_f);
          int discarded$1 = ((wa) this).field_m.a(param1, ((wa) this).field_d + var12, ((wa) this).field_i + var13, var9, var10, ((wa) this).field_k, -1, 0, 0, var7);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, String param3) {
        if (((wa) this).field_o) {
            this.a(param0, param3, param2, -3140);
        } else {
            this.a((byte) 69, param2, param3, param0);
        }
        if (!param1) {
            ((wa) this).field_c = null;
        }
    }

    private final static dm[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            dm[] discarded$0 = wa.a(-34, 65, 52, 47);
        }
        return dj.a(param0, (byte) -70, param2, param1, 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 15658734) {
            return;
        }
        vb.b(param6, param0, param2, param1, param5, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        vb.g(param4, param3, param1, param0, param2);
        if (param5 != 8947848) {
            ((wa) this).field_p = 22;
        }
    }

    public wa() {
        ((wa) this).field_o = true;
    }

    final static int a(int param0) {
        int var3 = Geoblox.field_C;
        int var1 = 0;
        if (param0 != -25866) {
            dm[] discarded$0 = wa.a(53, -56, 122, 126);
        }
        me var2 = (me) (Object) md.field_a.b((byte) -121);
        while (var2 != null) {
            var1 = var1 + var2.field_f;
            var2 = (me) (Object) md.field_a.b((byte) -99);
        }
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
