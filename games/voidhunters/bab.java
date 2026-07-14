/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bab implements dja {
    static String field_a;
    static String field_b;

    public final tv a(byte param0) {
        int var2 = -28 / ((param0 - -64) / 50);
        return (tv) (Object) new dv();
    }

    final static String a(String param0, int param1) {
        tsa[] var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        tsa[] var10 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param1 >= 74) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var10 = dib.a(param0, 127);
        var2 = var10;
        var3 = new StringBuilder();
        var4 = 0;
        L1: while (true) {
          if (var4 >= var10.length) {
            return var3.toString();
          } else {
            L2: {
              var5 = var10[var4];
              var6 = var5.field_g;
              if (-1 + var10.length == var4) {
                stackOut_6_0 = param0.length();
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var2[1 + var4].field_g;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var7 = stackIn_7_0;
            var8 = param0.substring(var6, var7);
            if (var5.field_e != dla.field_d) {
              if (var5.field_e == ek.field_o) {
                StringBuilder discarded$6 = var3.append("<col=33bbff>").append(var8).append("</col>");
                var4++;
                continue L1;
              } else {
                if (hpa.field_p == var5.field_e) {
                  StringBuilder discarded$7 = var3.append("<col=ffff99>").append(var8).append("</col>");
                  var4++;
                  continue L1;
                } else {
                  if (fwa.field_h == var5.field_e) {
                    StringBuilder discarded$8 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                    var4++;
                    continue L1;
                  } else {
                    if (var5.field_e != io.field_p) {
                      StringBuilder discarded$9 = var3.append(var8);
                      var4++;
                      continue L1;
                    } else {
                      StringBuilder discarded$10 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              StringBuilder discarded$11 = var3.append("<col=66ffff>").append(var8).append("</col>");
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            bab.a(false);
        }
        field_a = null;
        field_b = null;
    }

    final static void a(String param0, long param1, int param2) {
        waa.field_x = param0;
        int var4 = -104 / ((-6 - param2) / 42);
        ow.field_b = 2;
        CharSequence var5 = (CharSequence) (Object) param0;
        nkb.field_o = jwa.a(false, var5);
        lsa.field_f = param1;
        oma.a(true);
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new dv[param1];
    }

    final static void a(boolean param0, ml param1) {
        Object var3 = null;
        ml var4 = null;
        ml var5 = null;
        L0: {
          param1.a(1, 0, new ml(13));
          param1.a(1, 1, new ml(13));
          param1.a(1, 3, new ml(13));
          param1.a(1, 23, new ml(13));
          param1.a(1, 25, new ml(13));
          param1.a(1, 13, new ml(16));
          param1.a(1, 2, new ml(43));
          param1.a(1, 24, new ml(43));
          var4 = new ml(31);
          var4.a(1, 1, new ml(13));
          var4.a(1, 3, new ml(13));
          var4.a(1, 2, new ml(16));
          param1.a(1, 6, var4);
          var5 = new ml(31);
          var5.a(1, 0, new ml(13));
          var5.a(1, 2, new ml(13));
          var5.a(1, 3, new ml(16));
          param1.a(1, 20, var5);
          if (param0) {
            break L0;
          } else {
            var3 = null;
            String discarded$1 = bab.a((String) null, 85);
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Scale up map height";
        field_a = "Void Hunters";
    }
}
