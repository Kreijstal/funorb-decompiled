/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    static mf field_b;
    static int field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var7_ref = null;
        CharSequence var8 = null;
        int var9 = 0;
        Object var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        StringBuilder var13 = null;
        CharSequence var14 = null;
        CharSequence var15 = null;
        StringBuilder var16 = null;
        CharSequence var17 = null;
        var9 = BachelorFridge.field_y;
        if (param2 == -1) {
          return "";
        } else {
          if (-2 != param2) {
            if (!param3) {
              L0: {
                var10 = null;
                String discarded$5 = oq.a((CharSequence[]) null, 104, -45, false);
                var4 = param1 + param2;
                var5 = 0;
                var6 = param1;
                if (var4 <= var6) {
                  break L0;
                } else {
                  L1: {
                    var12 = param0[var6];
                    var7_ref = var12;
                    if (var7_ref != null) {
                      var5 = var5 + var12.length();
                      break L1;
                    } else {
                      var5 += 4;
                      var6++;
                      break L1;
                    }
                  }
                  var6++;
                  var6++;
                  var6++;
                  break L0;
                }
              }
              L2: {
                var13 = new StringBuilder(var5);
                var7 = param1;
                if (var4 <= var7) {
                  break L2;
                } else {
                  L3: {
                    var14 = param0[var7];
                    var8 = var14;
                    if (var8 != null) {
                      StringBuilder discarded$6 = var13.append(var14);
                      var7++;
                      break L3;
                    } else {
                      StringBuilder discarded$7 = var13.append("null");
                      var7++;
                      break L3;
                    }
                  }
                  var7++;
                  var7++;
                  var7++;
                  break L2;
                }
              }
              return var13.toString();
            } else {
              var4 = param1 + param2;
              var5 = 0;
              var6 = param1;
              L4: while (true) {
                if (var4 <= var6) {
                  L5: {
                    var16 = new StringBuilder(var5);
                    var7 = param1;
                    if (var4 <= var7) {
                      break L5;
                    } else {
                      L6: {
                        var17 = param0[var7];
                        var8 = var17;
                        if (var8 != null) {
                          StringBuilder discarded$8 = var16.append(var17);
                          var7++;
                          break L6;
                        } else {
                          StringBuilder discarded$9 = var16.append("null");
                          var7++;
                          break L6;
                        }
                      }
                      var7++;
                      var7++;
                      break L5;
                    }
                  }
                  return var16.toString();
                } else {
                  var15 = param0[var6];
                  var7_ref = var15;
                  if (var7_ref != null) {
                    var5 = var5 + var15.length();
                    var6++;
                    var6++;
                    continue L4;
                  } else {
                    var5 += 4;
                    var6++;
                    var6++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var11 = param0[param1];
            var4_ref = var11;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var11).toString();
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ge.field_L = param1 ? true : false;
        ge.a(320, 8, param0, (po) (Object) aha.field_D, 2, 8, (aha.field_D.field_v + aha.field_D.field_B) * 3 / 2, (kv[]) null, aha.field_D.field_v, (byte) 91, 240, (kv[]) null);
        if (null != kga.field_c) {
            eh discarded$0 = ju.field_r.a((java.awt.Component) (Object) kga.field_c, false, 127);
        }
    }

    public static void a(byte param0) {
        if (param0 > -35) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 48;
    }
}
