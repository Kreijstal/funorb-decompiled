/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    int field_h;
    String field_n;
    int field_a;
    static te field_i;
    private static int field_d;
    int[] field_k;
    static te field_c;
    private long field_b;
    private int field_m;
    private String field_j;
    private boolean field_g;
    static int[] field_e;
    int field_f;
    static int field_l;

    final int b(int param0) {
        L0: {
          if (((gi) this).field_g) {
            break L0;
          } else {
            L1: {
              if (2 != ((gi) this).field_a) {
                break L1;
              } else {
                if (((gi) this).field_m >= -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (((gi) this).field_b != en.field_l) {
              L2: {
                if (-3 != mi.field_g) {
                  break L2;
                } else {
                  if (kl.a(((gi) this).field_j, 0)) {
                    return 1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 >= 40) {
                return 0;
              } else {
                return 89;
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jk var6 = null;
        int var1 = jb.field_u.length;
        jb.field_k = new jk[var1];
        for (var2 = param0; var2 < var1; var2++) {
            var3 = jb.field_u[var2];
            var4 = jb.field_h[var2];
            var5 = jb.field_v[var2];
            var6 = new jk(var3, var4, var5);
            jb.field_k[var2] = var6;
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var13 = EscapeVector.field_A;
          if (param2 == 1) {
            break L0;
          } else {
            var14 = null;
            gi.a(-43, (int[]) null, -42, 84, (int[]) null);
            break L0;
          }
        }
        L1: {
          if (param3 >= param0) {
            break L1;
          } else {
            L2: {
              var5 = (param0 + param3) / 2;
              var6 = param3;
              var7 = param4[var5];
              param4[var5] = param4[param0];
              param4[param0] = var7;
              var8 = param1[var5];
              param1[var5] = param1[param0];
              param1[param0] = var8;
              if (-2147483648 != (var7 ^ -1)) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var9 = stackIn_6_0;
            var10 = param3;
            L3: while (true) {
              if (var10 >= param0) {
                param4[param0] = param4[var6];
                param4[var6] = var7;
                param1[param0] = param1[var6];
                param1[var6] = var8;
                gi.a(-1 + var6, param1, param2 ^ 0, param3, param4);
                gi.a(param0, param1, param2 ^ 0, var6 - -1, param4);
                break L1;
              } else {
                if (param4[var10] < var7 + (var9 & var10)) {
                  var11 = param4[var10];
                  param4[var10] = param4[var6];
                  param4[var6] = var11;
                  var12 = param1[var10];
                  param1[var10] = param1[var6];
                  var6++;
                  param1[var6] = var12;
                  var10++;
                  continue L3;
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static int a(byte param0, ih param1) {
        int var2 = co.a(param1, (byte) -127);
        String var3 = mn.a(param0 ^ 16, (char) var2, 20);
        if (param0 != -96) {
            return 21;
        }
        return param1.b(var3);
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != -13885) {
            return;
        }
        field_i = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = EscapeVector.field_A;
        if (param0 >= -49) {
            return;
        }
        for (var1 = 0; var1 < mh.field_a.length; var1++) {
            mh.field_a[var1] = 0;
        }
    }

    gi(boolean param0) {
        ((gi) this).field_j = rm.field_g;
        ((gi) this).field_g = rm.field_c;
        ((gi) this).field_h = im.field_a;
        ((gi) this).field_f = jn.field_d;
        ((gi) this).field_m = ve.field_g;
        ((gi) this).field_n = od.field_d;
        ((gi) this).field_a = fl.field_o;
        ((gi) this).field_b = ah.field_e;
        if (param0) {
            ((gi) this).field_k = bo.field_H;
        } else {
            ((gi) this).field_k = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = 398339;
        field_c = new te(1, 1, 256);
        for (var0 = 0; var0 < 256; var0++) {
            field_c.field_l[var0] = field_d;
        }
        field_c.field_l[0] = 0;
        field_i = new te(3, 3, 256);
        field_i.field_l[1] = 2917671;
    }
}
