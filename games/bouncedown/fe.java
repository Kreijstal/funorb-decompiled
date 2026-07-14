/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    fc field_l;
    int field_m;
    fc field_e;
    fc field_c;
    int field_o;
    int field_k;
    fc field_a;
    private boolean field_j;
    static int field_i;
    private int field_p;
    static boolean field_g;
    int field_h;
    fc field_b;
    int field_q;
    int field_n;
    int field_f;
    tj field_d;

    private final void a(String param0, int param1, int param2, boolean param3) {
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
        Object var16 = null;
        L0: {
          var15 = Bounce.field_N;
          var5 = ((fe) this).field_f + ((fe) this).field_k;
          var6 = ((fe) this).field_h + ((fe) this).field_o;
          var7 = ((fe) this).field_n;
          if (var7 == -1) {
            var7 = ((fe) this).field_d.field_s + ((fe) this).field_d.field_x;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = na.field_e >> -1351593918;
        var9 = ((fe) this).field_d.b(param0);
        var10 = ((fe) this).field_d.field_x + ((fe) this).field_d.field_s;
        var11 = 1;
        if (var8 >= var9) {
          if ((param0.indexOf("<br>") ^ -1) == 0) {
            L1: {
              var12 = param2;
              if (na.field_e >= var9 + (var12 + var5)) {
                break L1;
              } else {
                var12 = -var9 + na.field_e - var5;
                break L1;
              }
            }
            L2: {
              var13 = param1 - ((fe) this).field_d.field_F + 32;
              if (var6 + (var10 + var13) <= na.field_k) {
                break L2;
              } else {
                var13 = param1 - (var10 - -var6);
                break L2;
              }
            }
            if (!param3) {
              var16 = null;
              this.a((byte) 90, (String) null, -77, 113);
              na.b(var12, var13, var5 + var9, var10 + var6, ((fe) this).field_q);
              na.e(var12 + 1, 1 + var13, -2 + var5 + var9, -2 + (var10 + var6), ((fe) this).field_m);
              int discarded$6 = ((fe) this).field_d.a(param0, ((fe) this).field_k + var12, ((fe) this).field_o + var13, var9, var10, ((fe) this).field_p, -1, 0, 0, var7);
              return;
            } else {
              na.b(var12, var13, var5 + var9, var10 + var6, ((fe) this).field_q);
              na.e(var12 + 1, 1 + var13, -2 + var5 + var9, -2 + (var10 + var6), ((fe) this).field_m);
              int discarded$7 = ((fe) this).field_d.a(param0, ((fe) this).field_k + var12, ((fe) this).field_o + var13, var9, var10, ((fe) this).field_p, -1, 0, 0, var7);
              return;
            }
          } else {
            L3: {
              if (ai.field_a == null) {
                ai.field_a = new String[16];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var9 <= var8) {
                var12 = var8;
                break L4;
              } else {
                var13 = var9 / var8;
                var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
                break L4;
              }
            }
            L5: {
              var11 = ((fe) this).field_d.a(param0, new int[1], ai.field_a);
              var10 = var10 + var7 * (var11 - 1);
              var9 = 0;
              var13 = 0;
              if (var11 <= var13) {
                break L5;
              } else {
                L6: {
                  var14 = ((fe) this).field_d.b(ai.field_a[var13]);
                  if (var14 > var9) {
                    var9 = var14;
                    break L6;
                  } else {
                    var13++;
                    break L6;
                  }
                }
                var13++;
                var13++;
                var13++;
                break L5;
              }
            }
            L7: {
              var12 = param2;
              if (na.field_e >= var9 + (var12 + var5)) {
                break L7;
              } else {
                var12 = -var9 + na.field_e - var5;
                break L7;
              }
            }
            L8: {
              var13 = param1 - ((fe) this).field_d.field_F + 32;
              if (var6 + (var10 + var13) <= na.field_k) {
                break L8;
              } else {
                var13 = param1 - (var10 - -var6);
                break L8;
              }
            }
            if (!param3) {
              var16 = null;
              this.a((byte) 90, (String) null, -77, 113);
              na.b(var12, var13, var5 + var9, var10 + var6, ((fe) this).field_q);
              na.e(var12 + 1, 1 + var13, -2 + var5 + var9, -2 + (var10 + var6), ((fe) this).field_m);
              int discarded$8 = ((fe) this).field_d.a(param0, ((fe) this).field_k + var12, ((fe) this).field_o + var13, var9, var10, ((fe) this).field_p, -1, 0, 0, var7);
              return;
            } else {
              na.b(var12, var13, var5 + var9, var10 + var6, ((fe) this).field_q);
              na.e(var12 + 1, 1 + var13, -2 + var5 + var9, -2 + (var10 + var6), ((fe) this).field_m);
              int discarded$9 = ((fe) this).field_d.a(param0, ((fe) this).field_k + var12, ((fe) this).field_o + var13, var9, var10, ((fe) this).field_p, -1, 0, 0, var7);
              return;
            }
          }
        } else {
          L9: {
            if (ai.field_a == null) {
              ai.field_a = new String[16];
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (var9 <= var8) {
              var12 = var8;
              break L10;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
              break L10;
            }
          }
          L11: {
            var11 = ((fe) this).field_d.a(param0, new int[1], ai.field_a);
            var10 = var10 + var7 * (var11 - 1);
            var9 = 0;
            var13 = 0;
            if (var11 <= var13) {
              break L11;
            } else {
              L12: {
                var14 = ((fe) this).field_d.b(ai.field_a[var13]);
                if (var14 > var9) {
                  var9 = var14;
                  break L12;
                } else {
                  var13++;
                  break L12;
                }
              }
              var13++;
              var13++;
              var13++;
              break L11;
            }
          }
          L13: {
            var12 = param2;
            if (na.field_e >= var9 + (var12 + var5)) {
              break L13;
            } else {
              var12 = -var9 + na.field_e - var5;
              break L13;
            }
          }
          L14: {
            var13 = param1 - ((fe) this).field_d.field_F + 32;
            if (var6 + (var10 + var13) <= na.field_k) {
              break L14;
            } else {
              var13 = param1 - (var10 - -var6);
              break L14;
            }
          }
          if (!param3) {
            var16 = null;
            this.a((byte) 90, (String) null, -77, 113);
            na.b(var12, var13, var5 + var9, var10 + var6, ((fe) this).field_q);
            na.e(var12 + 1, 1 + var13, -2 + var5 + var9, -2 + (var10 + var6), ((fe) this).field_m);
            int discarded$10 = ((fe) this).field_d.a(param0, ((fe) this).field_k + var12, ((fe) this).field_o + var13, var9, var10, ((fe) this).field_p, -1, 0, 0, var7);
            return;
          } else {
            na.b(var12, var13, var5 + var9, var10 + var6, ((fe) this).field_q);
            na.e(var12 + 1, 1 + var13, -2 + var5 + var9, -2 + (var10 + var6), ((fe) this).field_m);
            int discarded$11 = ((fe) this).field_d.a(param0, ((fe) this).field_k + var12, ((fe) this).field_o + var13, var9, var10, ((fe) this).field_p, -1, 0, 0, var7);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        na.a(param0, param1, param4, param5, param2);
        if (param3) {
            ((fe) this).field_e = null;
        }
    }

    final void a(int param0, String param1, int param2, boolean param3) {
        Object var6 = null;
        if (!((fe) this).field_j) {
          this.a((byte) 121, param1, param2, param0);
          if (param3) {
            return;
          } else {
            var6 = null;
            ((fe) this).a(87, (tj) null);
            return;
          }
        } else {
          this.a(param1, param0, param2, param3);
          if (param3) {
            return;
          } else {
            var6 = null;
            ((fe) this).a(87, (tj) null);
            return;
          }
        }
    }

    private final void a(byte param0, String param1, int param2, int param3) {
        int var5 = ((fe) this).field_d.b(param1);
        int var6 = ((fe) this).field_d.field_F - -((fe) this).field_d.field_x;
        int var7 = param2;
        if (!(na.field_e >= var5 + var7 - -6)) {
            var7 = -6 + na.field_e + -var5;
        }
        int var9 = -45 % ((-17 - param0) / 47);
        int var8 = 32 + (param3 + -((fe) this).field_d.field_F);
        if (!(var8 + var6 - -6 <= na.field_k)) {
            var8 = na.field_k - var6 + -6;
        }
        na.b(var7, var8, var5 - -6, 6 + var6, ((fe) this).field_p);
        na.e(var7 - -1, 1 + var8, var5 + 4, var6 - -4, ((fe) this).field_m);
        ((fe) this).field_d.b(param1, 3 + var7, ((fe) this).field_d.field_F + (3 + var8), ((fe) this).field_p, -1);
    }

    final void a(int param0, tj param1) {
        int var7_int = 0;
        int var15 = Bounce.field_N;
        jd var17 = new jd(param1, 2, 2, 2236962, 1, 1, 1, param1.field_s + (param1.field_x - -2));
        ((fe) this).field_c = (fc) (Object) var17;
        var17.field_h = 16777215;
        qi var4 = new qi();
        var17.a((jd) (Object) var4, (byte) -122);
        ((fe) this).field_d = param1;
        ((fe) this).field_h = 3;
        ((fe) this).field_m = 5592405;
        ((fe) this).field_o = 3;
        var4.field_j = 15658734;
        ((fe) this).field_p = 15658734;
        ((fe) this).field_q = 15658734;
        ((fe) this).field_n = -1;
        ((fe) this).field_k = 3;
        var4.field_i = 11711154;
        ((fe) this).field_f = 3;
        kg discarded$0 = var4.b(-1, 0).a(15658734, -2).a(ed.a(8947848, 7829367, 78, 10066329), -1);
        kg discarded$1 = var4.b(-1, 1).a(ed.a(11184810, 13421772, 73, 10066329), -1);
        kg discarded$2 = var4.b(param0 + -33, 3).a(ed.a(8947848, 10066329, param0 ^ 78, 7829367), param0 + -33).a((byte) 74, 1).b(1, (byte) -54);
        tg[] var5 = new tg[9];
        bg var16 = new bg(32, param0);
        bg var18 = var16;
        for (var7_int = 0; var18.field_v.length > var7_int; var7_int++) {
            var16.field_v[var7_int] = 1077952576;
        }
        var5[4] = (tg) (Object) var18;
        kg discarded$3 = var4.b(-1, 4).a(true, (byte) -118).a(var5, -1);
        kg discarded$4 = var4.b(-1, 5).a(ok.a(param0 ^ 18906, 0, 0, 0, 65793), -1).a(true, (byte) -46).a(-1, param0 + -34);
        ((fe) this).field_b = (fc) (Object) var4;
        qi var6 = new qi(var4, true);
        var6.field_d = 0;
        qi var7 = new qi(var4, true);
        var7.field_d = 0;
        var7.a(param0 + -25, wj.a((byte) -67, 8947848));
        kg discarded$5 = var7.b(-1, 1).a(wj.a((byte) -63, 11184810), param0 ^ -33).a(2236962, param0 ^ -34);
        ((fe) this).field_a = (fc) (Object) new vb(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        sj discarded$6 = new sj(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        vg discarded$7 = new vg(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        qi var8 = new qi();
        var17.a((jd) (Object) var8, (byte) -122);
        kg discarded$8 = var8.b(-1, 0).a(ed.a(15658734, 10066329, 67, 7829367), -1).a(1118481, param0 ^ -34).a(-1, (byte) -49);
        kg discarded$9 = var8.b(param0 ^ -33, 4).a(true, (byte) -61).a(var5, -1);
        ((fe) this).field_e = (fc) (Object) var8;
        tg[] var9 = new tg[9];
        var9[4] = new tg(2, 1);
        tg[] var10 = new tg[9];
        var10[4] = new tg(1, 2);
        var9[4].field_v = new int[]{6710886, 7829367};
        var10[4].field_v = new int[]{6710886, 7829367};
        qi var11 = new qi();
        qi var12 = new qi();
        var11.a(param0 + -25058, 0, var9);
        var12.a(-25026, 0, var10);
        tg var13 = new tg(7, 4);
        var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        qi var14 = new qi(var4, true);
        var14.a(true, var13.b());
        var13.c();
        var14 = new qi(var4, true);
        var14.a(true, var13.b());
        var13.c();
        var14 = new qi(var4, true);
        var14.a(true, var13.b());
        var13.c();
        qi var19 = new qi(var4, true);
        var19.a(true, var13);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        na.a(param5, param6, param4, param1, param2, param3);
        if (param0 != -1) {
            Object var9 = null;
            boolean discarded$0 = fe.a((String) null, (byte) 2);
        }
    }

    public fe() {
        ((fe) this).field_j = true;
    }

    final static boolean a(String param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 < 123) {
          L0: {
            field_i = 109;
            if (hf.a(param0, true) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (hf.a(param0, true) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
    }
}
