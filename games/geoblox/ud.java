/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static String field_b;
    static String field_a;

    final static void a(byte param0, int param1) {
        int var3 = Geoblox.field_C;
        p var4 = (p) (Object) rh.field_a.g(0);
        while (var4 != null) {
            ol.a(param1, var4, 30175);
            var4 = (p) (Object) rh.field_a.d(1);
        }
        hf var2 = k.field_e.g(0);
        if (param0 > -123) {
            field_a = null;
        }
        while (var2 != null) {
            re.b(-101, param1);
            var2 = k.field_e.d(1);
        }
    }

    final static j a(int param0, String param1) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var5 = Geoblox.field_C;
        if (null != ug.field_a) {
          L0: {
            var7 = (CharSequence) (Object) param1;
            var2 = oe.a(var7, 12);
            if (var2 == null) {
              var2 = (String) (Object) var7;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var3 = (j) (Object) ug.field_a.a((long)var2.hashCode(), -1);
            if (param0 == 0) {
              break L1;
            } else {
              var6 = null;
              j discarded$2 = ud.a(55, (String) null);
              break L1;
            }
          }
          L2: while (true) {
            if (var3 != null) {
              L3: {
                var8 = (CharSequence) (Object) var3.field_hb;
                var4 = oe.a(var8, 12);
                if (var4 != null) {
                  break L3;
                } else {
                  var4 = var3.field_hb;
                  break L3;
                }
              }
              if (var4.equals((Object) (Object) var2)) {
                return var3;
              } else {
                var3 = (j) (Object) ug.field_a.a(param0 ^ -29925);
                continue L2;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        p var11 = null;
        pk var12 = null;
        int[] var13 = null;
        qi var14 = null;
        qi var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = Geoblox.field_C;
          var12 = eh.field_d;
          var2 = var12.c((byte) 34);
          if (0 != var2) {
            if (var2 == 1) {
              var11 = (p) (Object) rh.field_a.g(0);
              if (var11 == null) {
                jl.a((byte) -120);
                return;
              } else {
                var11.a(false);
                break L0;
              }
            } else {
              if ((var2 ^ -1) == -3) {
                var15 = (qi) (Object) k.field_e.g(0);
                if (var15 == null) {
                  jl.a((byte) -115);
                  return;
                } else {
                  var15.field_g = wf.j(86);
                  var15.field_j = var15.field_g[0];
                  var15.field_f = true;
                  var15.a(false);
                  break L0;
                }
              } else {
                gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
                jl.a((byte) -116);
                break L0;
              }
            }
          } else {
            var10 = wf.j(89);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((qc) (Object) var5).c((byte) 34);
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                var14 = (qi) (Object) k.field_e.g(0);
                if (var14 == null) {
                  jl.a((byte) -117);
                  return;
                } else {
                  var14.field_g = var3;
                  var14.field_f = true;
                  var14.field_j = var18[0];
                  var14.a(false);
                  break L0;
                }
              } else {
                var9[var7] = ((qc) (Object) var5).a((byte) -97);
                var7++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param0 > 85) {
            break L2;
          } else {
            ud.a(-63);
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "Loading sound effects";
    }
}
