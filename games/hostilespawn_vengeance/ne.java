/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends am {
    static vh field_j;
    int field_l;
    static int field_o;
    int field_h;
    static vl field_q;
    static bd field_n;
    int field_m;
    int field_k;
    int field_i;
    static String field_p;
    int field_r;

    final static bd[] a(int param0, gb param1, int param2, int param3) {
        if (rl.a(param0 + 2840, param1, param3, param2)) {
          if (param0 != 44) {
            return null;
          } else {
            return qa.a(param0 ^ 26671);
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = HostileSpawn.field_I ? 1 : 0;
          var3 = param2;
          var4 = ec.a(bm.field_b, (byte) 19);
          var5 = -1;
          var6 = 0;
          var7 = 0;
          if (param0 == 24) {
            break L0;
          } else {
            ne.a((byte) 63);
            break L0;
          }
        }
        if (0 < var4) {
          L1: {
            var8 = 32;
            if (8 >= var4) {
              break L1;
            } else {
              var8 = 270 / var4;
              break L1;
            }
          }
          L2: {
            param2 = param2 - (-4 + var8 * var4 / 2);
            var9 = 0;
            if (42 <= var9) {
              break L2;
            } else {
              L3: {
                if (!hb.a(var9, bm.field_b, false)) {
                  var9++;
                  break L3;
                } else {
                  L4: {
                    if (ka.a(param1, 0, var8, var8, param2)) {
                      var6 = param2;
                      var7 = param1;
                      var5 = var9;
                      break L4;
                    } else {
                      if (32 <= var8) {
                        fj.field_Kb[var9].b(param2, param1);
                        break L4;
                      } else {
                        fj.field_Kb[var9].a(-6 + param2, -6 + param1, var8, var8);
                        break L4;
                      }
                    }
                  }
                  param2 = param2 + var8;
                  break L3;
                }
              }
              var9++;
              var9++;
              var9++;
              break L2;
            }
          }
          if (var5 >= 0) {
            if (var8 >= 32) {
              fj.field_Kb[var5].a(var6 + -6, var7 - 6, 44, 44);
              al.field_Z.b(il.field_b[var5].toUpperCase(), var3, param1 + -8, 16776960, -1);
              int discarded$2 = al.field_Z.a(bh.field_g[var5].toUpperCase(), var3 - 130, param1 + 24, 260, 100, 16777215, -1, 1, 0, 12);
              return;
            } else {
              fj.field_Kb[var5].a(var6 - 6, var7 + -6, var8, var8);
              al.field_Z.b(il.field_b[var5].toUpperCase(), var3, param1 + -8, 16776960, -1);
              int discarded$3 = al.field_Z.a(bh.field_g[var5].toUpperCase(), var3 - 130, param1 + 24, 260, 100, 16777215, -1, 1, 0, 12);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static bd a(bd param0, byte param1) {
        gk var2 = null;
        gk var3 = null;
        if (param1 > -4) {
            field_j = null;
            if (!(param0 instanceof gk)) {
                return param0.d();
            }
            var2 = (gk) (Object) param0;
            var3 = var2.i();
            var3.g();
            return (bd) (Object) var3;
        }
        if (!(param0 instanceof gk)) {
            return param0.d();
        }
        var2 = (gk) (Object) param0;
        var3 = var2.i();
        var3.g();
        return (bd) (Object) var3;
    }

    public static void a(byte param0) {
        field_n = null;
        int var1 = -38 % ((-58 - param0) / 47);
        field_p = null;
        field_q = null;
        field_j = null;
    }

    final static nf a(gb param0, int param1, int param2) {
        byte[] var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var5 = param0.a(param2, -2);
        var3 = var5;
        if (var5 == null) {
          return null;
        } else {
          var4 = -14 / ((81 - param1) / 38);
          return new nf(var5);
        }
    }

    ne(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ne) this).field_m = param1;
        ((ne) this).field_i = param0;
        ((ne) this).field_l = param3;
        ((ne) this).field_k = param4;
        ((ne) this).field_r = param2;
        ((ne) this).field_h = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
        field_p = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_q = new vl();
    }
}
