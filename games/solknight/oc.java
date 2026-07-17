/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        ba var3 = null;
        byte[] var4 = null;
        var3 = (ba) ((oc) this).field_d.a(0, (long)param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 >= 32768) {
              var4 = ((oc) this).field_b.b(1, 12257, param1 & 32767);
              break L0;
            } else {
              var4 = ((oc) this).field_c.b(1, param0 + 12366, param1);
              break L0;
            }
          }
          var3 = new ba();
          if (param0 == -109) {
            if (var4 == null) {
              if (32768 <= param1) {
                var3.g(39);
                ((oc) this).field_d.a(87, (Object) (Object) var3, (long)param1);
                return var3;
              } else {
                ((oc) this).field_d.a(87, (Object) (Object) var3, (long)param1);
                return var3;
              }
            } else {
              var3.a(new gb(var4), false);
              if (32768 > param1) {
                ((oc) this).field_d.a(87, (Object) (Object) var3, (long)param1);
                return var3;
              } else {
                var3.g(39);
                ((oc) this).field_d.a(87, (Object) (Object) var3, (long)param1);
                return var3;
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var1 = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
        if (!param0) {
          if (te.field_O <= 0) {
            return var1;
          } else {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (te.field_O <= var2) {
                return var1;
              } else {
                L1: {
                  var1 = var1 + 32;
                  var3 = te.field_N.field_l[var2] & 255;
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  if (10 <= var4) {
                    var4 += 55;
                    break L1;
                  } else {
                    var4 += 48;
                    break L1;
                  }
                }
                L2: {
                  var1 = var1 + (char)var4;
                  if (var3 >= 10) {
                    var3 += 55;
                    break L2;
                  } else {
                    var3 += 48;
                    break L2;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          field_a = null;
          if (te.field_O > 0) {
            var1 = var1 + ":";
            var2 = 0;
            L3: while (true) {
              if (te.field_O > var2) {
                L4: {
                  var1 = var1 + 32;
                  var3 = te.field_N.field_l[var2] & 255;
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  if (10 <= var4) {
                    var4 += 55;
                    break L4;
                  } else {
                    var4 += 48;
                    break L4;
                  }
                }
                L5: {
                  var1 = var1 + (char)var4;
                  if (var3 >= 10) {
                    var3 += 55;
                    break L5;
                  } else {
                    var3 += 48;
                    break L5;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
