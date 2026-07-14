/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ct {
    static gj field_a;
    static String field_b;

    final static int a(int param0, int param1) {
        if (param0 != 19143) {
            Object var3 = null;
            ct.a((ml) null, 95, (ij) null);
        }
        if (li.field_i) {
            return mmb.field_d[param1].a();
        }
        return 100;
    }

    final static void a(ml param0, int param1, ij param2) {
        int var3 = 0;
        int var4 = 0;
        imb var5 = null;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (param1 > 30) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          param2.b(-10258, (ksa) (Object) new hua(param0.field_j));
          if (null == param0.field_d) {
            break L1;
          } else {
            if (0 < param0.field_d.length) {
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                if (var4 >= param0.field_d.length) {
                  if (var3 == 0) {
                    param2.b(-10258, (ksa) (Object) new hua(-1));
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var5 = param0.field_d[var4];
                  if (0 != (var5.field_c ^ -1)) {
                    param2.b(-10258, (ksa) (Object) new hua(var4));
                    ct.a(param0.field_f[var5.field_c], 108, param2);
                    if (-1 + param0.field_d.length == var4) {
                      var3 = 1;
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 100 % ((param0 - 79) / 38);
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gj();
        field_b = " KEYS";
    }
}
