/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static int[] field_b;
    static ci[] field_a;
    static int field_g;
    static long field_f;
    static fa field_d;
    static long field_c;
    static String field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          dm.a((byte) -25);
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static q a(byte param0, String param1) {
        String var2 = null;
        Object var3 = null;
        q var3_ref = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        var3 = null;
        var5 = Terraphoenix.field_V;
        if (param0 == -85) {
          if (ai.field_f != null) {
            L0: {
              var9 = (CharSequence) (Object) param1;
              var2 = hm.a((byte) 126, var9);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (String) (Object) var3_ref;
                break L0;
              }
            }
            var3_ref = (q) (Object) ai.field_f.a(param0 + 203, (long)var2.hashCode());
            L1: while (true) {
              if (var3_ref != null) {
                L2: {
                  var10 = (CharSequence) (Object) var3_ref.field_Lb;
                  var4 = hm.a((byte) 65, var10);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3_ref.field_Lb;
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3_ref;
                } else {
                  var3_ref = (q) (Object) ai.field_f.c((byte) -92);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          var6 = null;
          q discarded$1 = dm.a((byte) 0, (String) null);
          if (ai.field_f != null) {
            L3: {
              var7 = (CharSequence) (Object) param1;
              var2 = hm.a((byte) 126, var7);
              if (var2 != null) {
                break L3;
              } else {
                var2 = (String) (Object) var7;
                break L3;
              }
            }
            var3_ref = (q) (Object) ai.field_f.a(param0 + 203, (long)var2.hashCode());
            L4: while (true) {
              if (var3_ref != null) {
                L5: {
                  var8 = (CharSequence) (Object) var3_ref.field_Lb;
                  var4 = hm.a((byte) 65, var8);
                  if (var4 != null) {
                    break L5;
                  } else {
                    var4 = var3_ref.field_Lb;
                    break L5;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3_ref;
                } else {
                  var3_ref = (q) (Object) ai.field_f.c((byte) -92);
                  continue L4;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static void a(byte param0) {
        if (param0 >= -32) {
            dm.a((byte) 65);
            ke.a(dg.a(false), (byte) -110);
            return;
        }
        ke.a(dg.a(false), (byte) -110);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_f = 20000000L;
        field_b = new int[256];
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            field_e = "HEX-2";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 != (1 & var0 ^ -1)) {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> -1182168031 ^ -306674912;
                  var2++;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
