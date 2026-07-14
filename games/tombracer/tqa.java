/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tqa implements fo {
    private int field_c;
    private int field_m;
    private int field_h;
    private int field_b;
    private int field_i;
    static char field_o;
    static byte[] field_e;
    static int field_g;
    static String field_k;
    private int field_a;
    private la field_f;
    private int field_d;
    private vna field_p;
    private int field_l;
    private pca[] field_j;
    private int field_n;

    public final int c(byte param0) {
        if (param0 < 91) {
            ((tqa) this).field_h = 23;
        }
        return ((tqa) this).field_f.s(38) / 2;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 55 / ((-30 - param0) / 56);
        return param2 + (-((tqa) this).field_c - -((-((tqa) this).field_l + param1) * ((tqa) this).field_i));
    }

    final static void a(boolean param0, byte param1) {
        int var2 = -75 / ((param1 - -12) / 44);
        ej.field_a.b(-42, 0, 0);
    }

    private final void a(int param0, la param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        ((tqa) this).field_c = 0;
        ((tqa) this).field_l = 0;
        ((tqa) this).field_a = param3 / param0;
        ((tqa) this).field_h = param2 / param0;
        ((tqa) this).field_n = ((tqa) this).field_a + param4;
        ((tqa) this).field_d = 0 + ((tqa) this).field_h;
        ((tqa) this).field_m = param0;
        ((tqa) this).field_f = param1;
        ((tqa) this).field_b = -((tqa) this).field_l + ((tqa) this).field_n;
        ((tqa) this).field_i = -((tqa) this).field_c + ((tqa) this).field_d;
        ((tqa) this).field_j = new pca[((tqa) this).field_b * ((tqa) this).field_i];
        for (var6 = ((tqa) this).field_c; var6 < ((tqa) this).field_d; var6++) {
            for (var7 = ((tqa) this).field_l; var7 < ((tqa) this).field_n; var7++) {
                this.a(var6, new pca(), var7, 10);
            }
        }
    }

    public final int b(byte param0) {
        int var2 = -60 % ((param0 - -23) / 53);
        return ((tqa) this).field_f.m((byte) -86) / 2;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            int discarded$0 = ((tqa) this).c((byte) -59);
        }
    }

    final void a(byte param0, kh param1, la param2) {
        int var4 = 0;
        int var5 = 0;
        lk var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 25) {
            ((tqa) this).field_f = null;
        }
        ((tqa) this).field_p.d(8);
        if (!(param2.field_E >= -9)) {
            if (!(-10 < param2.field_E)) {
                int discarded$0 = param1.b((byte) 44, 8);
                int discarded$1 = param1.b((byte) 44, 8);
            }
            for (var4 = 0; var4 < ((tqa) this).field_a; var4++) {
                for (var5 = 0; ((tqa) this).field_h > var5; var5++) {
                    ((tqa) this).a(param0 + -133, var5, var4).a((byte) 29, param2, param1);
                }
            }
            if (10 <= param2.field_E) {
                var4 = param1.b((byte) 44, 8);
                for (var5 = 0; var5 < var4; var5++) {
                    var6 = new lk(param2, param1);
                    ((tqa) this).field_p.b((byte) -77, (vg) (Object) var6);
                }
            }
        }
    }

    final int c(int param0) {
        if (param0 < 0) {
            ((tqa) this).field_l = 127;
        }
        return ((tqa) this).field_a;
    }

    final void f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        pca var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        pca[] var2 = ((tqa) this).field_j;
        ((tqa) this).a(((tqa) this).field_m, ((tqa) this).field_f, -125);
        if (param0 != 64) {
            ((tqa) this).field_d = -6;
        }
        for (var3 = ((tqa) this).field_c; ((tqa) this).field_d > var3; var3++) {
            for (var4 = ((tqa) this).field_l; ((tqa) this).field_n > var4; var4++) {
                var5 = var2[this.a((byte) 93, var4, -1 + -var3 + ((tqa) this).field_h)];
                this.a(var3, var5, var4, 10);
                var5.e(param0 + -64);
            }
        }
        lk var7 = (lk) (Object) ((tqa) this).field_p.f(param0 ^ -16);
        while (var7 != null) {
            var7.a(((tqa) this).field_f, (byte) 104);
            var7 = (lk) (Object) ((tqa) this).field_p.e(107);
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 == 48) {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if (0 > param0) {
                  break L1;
                } else {
                  if (param2 >= ((tqa) this).field_h) {
                    break L1;
                  } else {
                    if (((tqa) this).field_a <= param0) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        if (param0 < 24) {
            return;
        }
        field_k = null;
        field_e = null;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            ((tqa) this).a(8, 65, true, 67, -80, 46, 77);
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 103) {
            return;
        }
        for (var3 = 0; var3 < ((tqa) this).field_i; var3++) {
            for (var4 = 0; ((tqa) this).field_b > var4; var4++) {
                ((tqa) this).a(-118, var3, var4).a((byte) 117, param1);
            }
        }
        lk var6 = (lk) (Object) ((tqa) this).field_p.f(-80);
        while (var6 != null) {
            var6.a(119, param1);
            var6 = (lk) (Object) ((tqa) this).field_p.e(107);
        }
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((tqa) this).field_d = -124;
            return 0;
        }
        return 0;
    }

    private final void a(int param0, pca param1, int param2, int param3) {
        if (param3 != 10) {
            field_g = -103;
        }
        int var5 = this.a((byte) 113, param2, param0);
        ((tqa) this).field_j[var5] = param1;
        ((tqa) this).field_j[var5].a(param0, 125, param2, (tqa) this);
    }

    final int a(int param0) {
        int var2 = -52 / ((-4 - param0) / 62);
        return ((tqa) this).field_h;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        this.a(param6, param3, -123, param0, param4, param1, param5, -1);
        if (!param2) {
            ((tqa) this).field_j = null;
        }
    }

    final int d(int param0) {
        if (param0 != -30551) {
            int discarded$0 = ((tqa) this).a(1, false);
        }
        return ((tqa) this).field_m;
    }

    final boolean b(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        pca var17 = null;
        int var18 = 0;
        L0: {
          var18 = TombRacer.field_G ? 1 : 0;
          var8 = 1;
          var9 = param5 / 2;
          var10 = param0 / 2;
          if (param3 == 8597) {
            break L0;
          } else {
            ((tqa) this).field_c = -71;
            break L0;
          }
        }
        var11 = ((tqa) this).a(param4 + -var9 - -var8, false);
        var12 = ((tqa) this).a(-var10 + (param1 + var8), false);
        var13 = ((tqa) this).a(-var8 + (param4 - -var9), false);
        var14 = ((tqa) this).a(-var8 + (param1 + var10), false);
        var15 = var11;
        L1: while (true) {
          if (var13 < var15) {
            return false;
          } else {
            var16 = var12;
            L2: while (true) {
              if (var14 < var16) {
                var15++;
                continue L1;
              } else {
                if (!((tqa) this).a(var16, (byte) 48, var15)) {
                  if (param2) {
                    return true;
                  } else {
                    var16++;
                    continue L2;
                  }
                } else {
                  var17 = ((tqa) this).a(-115, var15, var16);
                  if (var17.a(param6, 0)) {
                    return true;
                  } else {
                    var16++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    final la b(int param0) {
        if (param0 != 0) {
            field_g = -85;
        }
        return ((tqa) this).field_f;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
            return -102;
        }
        if (param0 < 0) {
            var3 = (param0 - -1 - ((tqa) this).field_m) / ((tqa) this).field_m;
        } else {
            var3 = param0 / ((tqa) this).field_m;
        }
        return var3;
    }

    final void a(uw param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var3 = param1; var3 < ((tqa) this).field_j.length; var3++) {
            ((tqa) this).field_j[var3].a(param0, (byte) 84);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        if (param1 != 2) {
            ((tqa) this).field_i = -62;
        }
        pca[] var4 = ((tqa) this).field_j;
        int var5 = ((tqa) this).field_i;
        int var6 = ((tqa) this).field_b;
        ((tqa) this).a(param0, ((tqa) this).field_f, 0);
        int var7 = param2 / param0;
        int var8 = param2 / param0;
        for (var9_int = 0; ((tqa) this).field_i > var9_int; var9_int++) {
            for (var10 = 0; ((tqa) this).field_b > var10; var10++) {
                var11 = za.a(0, (byte) 113, var5 + -1, var9_int - var7);
                var12 = za.a(0, (byte) 85, -1 + var6, var10 - var8);
                ((tqa) this).a(param1 + -115, var9_int, var10).a(var4[var12 * var5 + var11], 21324);
            }
        }
        lk var9 = (lk) (Object) ((tqa) this).field_p.f(-80);
        while (var9 != null) {
            var9.a(-6492, var9.a((byte) 124) + param2);
            var9.b(param1 ^ 2, param2 + var9.g((byte) -121));
            var9 = (lk) (Object) ((tqa) this).field_p.e(118);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        pca var18 = null;
        int var19 = 0;
        Object var20 = null;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          var9 = -1 + ((tqa) this).field_m;
          var10 = param6 / 2;
          var11 = param4 / 2;
          if ((param1 ^ -1) != -2) {
            break L0;
          } else {
            var10 = var10 + ((tqa) this).field_m;
            var11 = var11 + ((tqa) this).field_m;
            break L0;
          }
        }
        L1: {
          var12 = iia.d(((tqa) this).field_c, ((tqa) this).a(-var10 + param0 + var9, false), 2);
          var13 = iia.d(((tqa) this).field_l, ((tqa) this).a(var9 + -var11 + param3, false), 2);
          var14 = et.b(((tqa) this).a(-var9 + var10 + param0, false), -1 + ((tqa) this).field_d, 124);
          var15 = et.b(((tqa) this).a(var11 + (param3 - var9), false), ((tqa) this).field_n - 1, 101);
          if (param2 <= -104) {
            break L1;
          } else {
            var20 = null;
            ((tqa) this).a((byte) -39, (kh) null, (la) null);
            break L1;
          }
        }
        var16 = var12;
        L2: while (true) {
          if (var14 < var16) {
            return;
          } else {
            var17 = var13;
            L3: while (true) {
              if (var17 > var15) {
                var16++;
                continue L2;
              } else {
                if (((tqa) this).a(var17, (byte) 48, var16)) {
                  L4: {
                    var18 = ((tqa) this).a(127, var16, var17);
                    if ((param5 ^ -1) != 0) {
                      var18.a(param7, param5, true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param1 != -1) {
                    var18.a((byte) 29, param7);
                    var17++;
                    continue L3;
                  } else {
                    var17++;
                    continue L3;
                  }
                } else {
                  var17++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.a(param3, param0, -110, param5, param1, param4, param2, 1);
        if (!param6) {
            ((tqa) this).field_p = null;
        }
    }

    final void a(int param0, la param1, int param2) {
        this.a(param0, param1, param1.m((byte) -86), param1.s(-125), 0);
        int var4 = 17 / ((-78 - param2) / 43);
    }

    final pca a(int param0, int param1, byte param2) {
        int var4 = ((tqa) this).a(param1, false);
        int var5 = ((tqa) this).a(param0, false);
        if (!((tqa) this).a(var5, (byte) 48, var4)) {
            return null;
        }
        if (param2 != 119) {
            return null;
        }
        return ((tqa) this).a(-116, var4, var5);
    }

    final void a(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        lk var5 = (lk) (Object) ((tqa) this).field_p.f(-80);
        while (var5 != null) {
            if (!(var5.a(param0, false))) {
                var5.p(56);
            }
            var5 = (lk) (Object) ((tqa) this).field_p.e(126);
        }
        if (param1 > -11) {
            ((tqa) this).field_n = 14;
        }
    }

    final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; ((tqa) this).field_a > var3; var3++) {
            for (var4 = 0; ((tqa) this).field_h > var4; var4++) {
                ((tqa) this).a(-98, var4, var3).a(param1, -78);
            }
        }
        param1.a((byte) -128, ((tqa) this).field_p.a((byte) -16), param0);
        lk var6 = (lk) (Object) ((tqa) this).field_p.f(-80);
        while (var6 != null) {
            var6.a((byte) -128, param1);
            var6 = (lk) (Object) ((tqa) this).field_p.e(123);
        }
    }

    final pca a(int param0, int param1, int param2) {
        int var4 = -107 % ((param0 - -36) / 59);
        return ((tqa) this).field_j[this.a((byte) 31, param2, param1)];
    }

    tqa(la param0, int param1) {
        ((tqa) this).field_p = new vna();
        ((tqa) this).a(param1, param0, 107);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = '/';
        field_g = -1;
        field_k = "You need a rating of <%1> to play with the current options.";
    }
}
