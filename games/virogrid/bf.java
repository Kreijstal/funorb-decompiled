/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends l {
    static String field_k;
    int[] field_u;
    static int[] field_m;
    int[] field_l;
    static boolean field_t;
    int field_h;
    static mg[] field_p;
    static int field_o;
    int[] field_g;
    int field_n;
    un[] field_q;
    static int field_i;
    byte[][][] field_j;
    static String field_s;
    un[] field_r;

    final static void a(int param0, int param1, mg param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        var3 = param2.field_p * param2.field_w;
        L0: while (true) {
          if (-1 == (var3 ^ -1)) {
            if (param1 != 25928) {
              field_o = 121;
              return;
            } else {
              return;
            }
          } else {
            var3--;
            param2.field_B[var3] = param0;
            continue L0;
          }
        }
    }

    final static java.awt.Container a(int param0) {
        if (param0 != 0) {
            field_m = null;
            if (!(bj.field_m == null)) {
                return (java.awt.Container) (Object) bj.field_m;
            }
            return (java.awt.Container) (Object) mb.g((byte) 46);
        }
        if (!(bj.field_m == null)) {
            return (java.awt.Container) (Object) bj.field_m;
        }
        return (java.awt.Container) (Object) mb.g((byte) 46);
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        df.b(param2, param3, param1 - -1, 10000536);
        df.b(param2, param4 + param3, 1 + param1, 12105912);
        var5 = 1;
        if (!param0) {
          L0: {
            var11 = null;
            bf.a((fa) null, -34, -7);
            if (df.field_g > param3 - -var5) {
              var5 = df.field_g - param3;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var6 = param4;
            if (var6 + param3 <= df.field_h) {
              break L1;
            } else {
              var6 = df.field_h - param3;
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 + 48 * var7 / param4;
              var9 = var8 << -1101855152 | var8 << -209846072 | var8;
              df.field_d[(param3 + var7) * df.field_e - -param2] = var9;
              df.field_d[param1 + param2 + (var7 + param3) * df.field_e] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          L3: {
            if (df.field_g > param3 - -var5) {
              var5 = df.field_g - param3;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var6 = param4;
            if (var6 + param3 <= df.field_h) {
              break L4;
            } else {
              var6 = df.field_h - param3;
              break L4;
            }
          }
          var7 = var5;
          L5: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 + 48 * var7 / param4;
              var9 = var8 << -1101855152 | var8 << -209846072 | var8;
              df.field_d[(param3 + var7) * df.field_e - -param2] = var9;
              df.field_d[param1 + param2 + (var7 + param3) * df.field_e] = var9;
              var7++;
              continue L5;
            }
          }
        }
    }

    final static void a(fa param0, int param1, int param2) {
        int var4 = 0;
        hg var5 = null;
        var5 = gk.field_g;
        var5.g(param2, 8);
        var5.field_l = var5.field_l + 1;
        var4 = var5.field_l;
        var5.a(1, -109);
        if (param0.field_g == null) {
          var5.a(0, param1 ^ -98);
          int discarded$4 = var5.b((byte) -111, var4);
          var5.field_l = var5.field_l - param1;
          param0.field_i = var5.d((byte) 127);
          var5.b(var5.field_l + -var4, param1 ^ -5);
          return;
        } else {
          var5.a(param0.field_g.length, 76);
          var5.a(param0.field_g, param0.field_g.length, 0, (byte) 94);
          int discarded$5 = var5.b((byte) -111, var4);
          var5.field_l = var5.field_l - param1;
          param0.field_i = var5.d((byte) 127);
          var5.b(var5.field_l + -var4, param1 ^ -5);
          return;
        }
    }

    final static km a(byte param0) {
        if (param0 >= -70) {
            km discarded$0 = bf.a((byte) -57);
            return d.h(0);
        }
        return d.h(0);
    }

    public static void c(int param0) {
        if (param0 != 20391) {
          field_p = null;
          field_s = null;
          field_m = null;
          field_k = null;
          field_p = null;
          return;
        } else {
          field_s = null;
          field_m = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    bf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[16384];
        field_k = "Elapsed time";
        field_o = 0;
        field_s = "Show all private chat";
        field_t = false;
        field_i = 0;
    }
}
