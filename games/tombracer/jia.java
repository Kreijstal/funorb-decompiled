/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia implements ms {
    private lw field_b;
    private waa[] field_c;
    static jqa field_a;

    public static void a(byte param0) {
        if (param0 != 31) {
            field_a = null;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2) {
        waa[] var4 = null;
        int var5 = 0;
        waa var6 = null;
        int var7 = 0;
        waa[] var8 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = ((jia) this).field_c;
        var4 = var8;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var8.length) {
            L1: {
              if (!((jia) this).field_b.field_b) {
                stackOut_7_0 = 1348493408;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                if (!oj.field_tb[hra.field_b]) {
                  stackOut_6_0 = 1627324416;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 805371648;
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                qk.a(stackIn_8_0, tga.field_a, param0, param1 ^ 20688, ((jia) this).a(-8660), 20 + ((jia) this).a(false), 16, -10 + param2);
                if (oj.field_tb[hra.field_b]) {
                  break L3;
                } else {
                  if (((jia) this).field_b.field_b) {
                    int discarded$3 = qr.field_v.a((aa) null, ((jia) this).a(false), 0, 0, param0, -1, (int[]) null, 1, -16711423, pg.field_A, (byte) -122, ((jia) this).a(false), 0, (nh[]) null, param2, 1);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!oj.field_tb[hra.field_b]) {
                  break L4;
                } else {
                  if (!((jia) this).field_b.field_b) {
                    break L4;
                  } else {
                    int discarded$4 = qr.field_v.a((aa) null, ((jia) this).a(false), 0, 0, param0, -1, (int[]) null, 1, -16711423, gka.field_f, (byte) 93, ((jia) this).a(false), 0, (nh[]) null, param2, 1);
                    break L2;
                  }
                }
              }
              int discarded$5 = qr.field_v.a((aa) null, ((jia) this).a(false), 0, 0, param0, 553648127, (int[]) null, 1, -2147417855, qqa.field_p, (byte) -38, ((jia) this).a(false), 0, (nh[]) null, param2, 1);
              break L2;
            }
            L5: {
              if (param1 == 20726) {
                break L5;
              } else {
                ((jia) this).field_c = null;
                break L5;
              }
            }
            ((jia) this).field_b.a((byte) 74, param0, param2);
            return;
          } else {
            var6 = var8[var5];
            var6.a(param2, 6, param0);
            var5++;
            continue L0;
          }
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != -18602) {
            ((jia) this).b(114);
        }
        return false;
    }

    public final int a(boolean param0) {
        if (param0) {
            field_a = null;
        }
        return 140;
    }

    public final void b(int param0) {
        waa[] var2_ref_waa__ = null;
        int var2 = 0;
        int var3 = 0;
        waa var4_ref_waa = null;
        int var4 = 0;
        int var5 = 0;
        waa[] var6 = null;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == -7109) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var6 = ((jia) this).field_c;
        var2_ref_waa__ = var6;
        var3 = 0;
        L1: while (true) {
          if (var6.length <= var3) {
            L2: {
              ((jia) this).field_b.c(param0 + 4637);
              var2 = ((jia) this).field_b.a((byte) -120);
              var3 = ((jia) this).field_b.a(param0 ^ -7082);
              var4 = 0;
              if (-1 < (var2 ^ -1)) {
                var2 = 0;
                var4 = 1;
                break L2;
              } else {
                if (var2 > ((jia) this).a(false)) {
                  var2 = ((jia) this).a(false);
                  var4 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var3 >= 0) {
                if (var3 <= ((jia) this).a(-8660)) {
                  break L3;
                } else {
                  var3 = ((jia) this).a(param0 + -1551);
                  var4 = 1;
                  break L3;
                }
              } else {
                var4 = 1;
                var3 = 0;
                break L3;
              }
            }
            L4: {
              if (var4 != 0) {
                ((jia) this).field_b.a(-115, var3, var2);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            var4_ref_waa = var6[var3];
            var4_ref_waa.b(-9310);
            var3++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param5 < 15) {
            jia.a((byte) -91);
        }
        if (ica.field_a) {
            tga.field_a.v(param4 >> -314275922, -param2 >> 1588050638, -param6 >> -2051801074, param0 >> 2090526094, -param8 >> 1559144270, -param7 >> 1600498158, jg.a(param1, (byte) -60, param3), 1);
        } else {
            tga.field_a.ea(param4 >> -1130138354, -param2 >> -465189650, -param6 >> -1995171346, param0 >> 1847811534, -param8 >> -792386290, -param7 >> -714847058, 2048, jg.a(param1, (byte) -107, param3), 1);
        }
    }

    public final int a(int param0) {
        if (param0 != -8660) {
            ((jia) this).field_b = null;
        }
        return 140;
    }

    public jia() {
        int var1 = 0;
        ((jia) this).field_c = new waa[10];
        ((jia) this).field_b = new lw();
        ((jia) this).field_b.a(-112, ((jia) this).a(-8660) / 2, ((jia) this).a(false) / 2);
        for (var1 = 0; ((jia) this).field_c.length > var1; var1++) {
            ((jia) this).field_c[var1] = new waa(((jia) this).a(false), ((jia) this).a(-8660));
        }
    }

    static {
    }
}
