/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wkb implements dja {
    static int field_c;
    static int field_b;
    static String[] field_e;
    static int field_a;
    static String[] field_d;

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1) {
            field_c = 115;
        }
        field_d = null;
    }

    final static void b(byte param0) {
        if (param0 != 6) {
            field_a = 79;
        }
        if (nd.field_r != -tha.field_p + 0) {
            if (nd.field_r == -tha.field_p + 250) {
            }
        }
        nd.field_r = nd.field_r + 1;
    }

    public final tv a(byte param0) {
        int var2 = 73 % ((-64 - param0) / 50);
        return (tv) (Object) new pob();
    }

    final static void a(tjb param0, int param1) {
        tra.field_o.b(-561, (llb) (Object) param0);
        if (param1 != 6) {
            field_e = null;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            Object var4 = null;
            int[] discarded$0 = wkb.a((byte) -44, (int[]) null, (faa) null, -49);
        }
        return (tv[]) (Object) new pob[param1];
    }

    final static int[] a(byte param0, int[] param1, faa param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        var8 = VoidHunters.field_G;
        var4 = param2.i(param0 ^ 37, param3);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var11 = new int[var4];
            var10 = var11;
            param1 = var10;
            break L0;
          }
          L2: {
            var5 = param2.i(param0 ^ 37, 6);
            var6 = param2.i(0, 32);
            if (param0 == 37) {
              break L2;
            } else {
              field_b = -18;
              break L2;
            }
          }
          L3: {
            if ((var5 ^ -1) >= -1) {
              var9 = 0;
              var7 = var9;
              L4: while (true) {
                if (var9 >= var4) {
                  break L3;
                } else {
                  param1[var9] = var6;
                  var9++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = param2.i(0, var5) - -var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Name", "Size", "Kills", "Assists", "Deaths", "Ping"};
        field_c = 1;
        field_b = 0;
        field_a = 60;
    }
}
