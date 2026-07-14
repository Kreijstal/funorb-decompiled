/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ue {
    jh field_b;
    ik[] field_d;
    static int field_a;
    static boolean field_c;

    abstract boolean a(int param0);

    final static dl[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 9) {
            return null;
        }
        dl[] var6 = new dl[9];
        dl[] var5 = var6;
        var6[6] = mc.a(param2, -65, param1);
        var5[3] = mc.a(param2, -65, param1);
        var5[2] = mc.a(param2, -65, param1);
        var5[1] = mc.a(param2, -65, param1);
        var5[0] = mc.a(param2, -65, param1);
        var6[8] = mc.a(param2, -34, param4);
        var5[7] = mc.a(param2, -34, param4);
        var5[5] = mc.a(param2, -34, param4);
        if (!(param3 == 0)) {
            var6[4] = mc.a(64, -55, param3);
        }
        return var5;
    }

    ue(int param0) {
        ((ue) this).field_b = new jh(param0);
    }

    final static void a(int param0, int param1) {
        int var3 = CrazyCrystals.field_B;
        sc var2 = (sc) (Object) hd.field_c.g(32073);
        if (param1 > -81) {
            ue.a(106, 48);
        }
        while (var2 != null) {
            ed.a((byte) 105, param0, var2);
            var2 = (sc) (Object) hd.field_c.a(false);
        }
    }

    void b(int param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        if (param0 != 8) {
            return;
        }
        for (var2 = 0; var2 < ((ue) this).field_d.length; var2++) {
            ((ue) this).field_d[var2].a(((ue) this).field_b.field_c == var2 ? true : false, ((ue) this).field_b.field_c != var2 ? 12640511 : 16777215, 1);
        }
    }

    final static void b(byte param0) {
        int var1 = -92 / ((param0 - -58) / 41);
        no.e((byte) -23);
        if (null != jd.field_D) {
            fq.a(-65, jd.field_D);
        }
        vf.a(-1);
        ub.b(0);
        ug.a((byte) -127);
        if (!(!b.b(0))) {
            tp.field_f.d(8, 1);
            ak.a(0, (byte) -48);
        }
        jj.a(4);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = CrazyCrystals.field_B;
          var3 = -1;
          if (param1 == -13880) {
            break L0;
          } else {
            int discarded$2 = ue.a(-19, 34, 105);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (((ue) this).field_d.length <= var4) {
            ((ue) this).field_b.a(param1 ^ 13879, param0, var3);
            return;
          } else {
            if (null != ((ue) this).field_d[var4]) {
              if (((ue) this).field_d[var4].b(0)) {
                var3 = var4;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -1 + param0 & param1 >> 94991391;
        int var4 = 54 / ((param2 - 42) / 39);
        return ((param1 >>> 1256634879) + param1) % param0 + var3;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var2 = -1;
        var3 = -1;
        var4 = 55 / ((param0 - -10) / 48);
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((ue) this).field_d.length) {
            ((ue) this).field_b.a(0, var3, var2);
            if (!((ue) this).a(121)) {
              return;
            } else {
              return;
            }
          } else {
            if (null != ((ue) this).field_d[var5]) {
              L1: {
                if (!((ue) this).field_d[var5].b(0)) {
                  break L1;
                } else {
                  var2 = var5;
                  break L1;
                }
              }
              if (((ue) this).field_d[var5].a(-94)) {
                var3 = var5;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    void a(boolean param0) {
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        L0: while (true) {
          if (!ge.b(-120)) {
            L1: {
              ((ue) this).a((byte) 62);
              if (!param0) {
                break L1;
              } else {
                ((ue) this).field_d = null;
                break L1;
              }
            }
            return;
          } else {
            ((ue) this).field_b.f(0);
            if (!((ue) this).a(107)) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    static {
    }
}
