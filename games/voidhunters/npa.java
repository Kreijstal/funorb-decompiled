/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npa implements dja {
    static int field_d;
    static byte[][] field_b;
    static int[] field_a;
    static double field_c;

    public final tv a(byte param0) {
        int var2 = -15 / ((-64 - param0) / 50);
        return (tv) (Object) new umb();
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        if (param1 != 115) {
          L0: {
            field_b = null;
            dma.h(param4, param0, param3 + 1, 10000536);
            dma.h(param4, param0 + param2, param3 - -1, 12105912);
            var5 = 1;
            if (param0 - -var5 < dma.field_c) {
              var5 = dma.field_c - param0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var6 = param2;
            if (dma.field_f < var6 + param0) {
              var6 = dma.field_f + -param0;
              break L1;
            } else {
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 48 * var7 / param2 + 152;
              var9 = var8 | (var8 << -61787536 | var8 << -1859139064);
              dma.field_i[dma.field_g * (param0 + var7) - -param4] = var9;
              dma.field_i[(param0 + var7) * dma.field_g - -param4 - -param3] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          L3: {
            dma.h(param4, param0, param3 + 1, 10000536);
            dma.h(param4, param0 + param2, param3 - -1, 12105912);
            var5 = 1;
            if (param0 - -var5 < dma.field_c) {
              var5 = dma.field_c - param0;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var6 = param2;
            if (dma.field_f < var6 + param0) {
              var6 = dma.field_f + -param0;
              break L4;
            } else {
              break L4;
            }
          }
          var7 = var5;
          L5: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 48 * var7 / param2 + 152;
              var9 = var8 | (var8 << -61787536 | var8 << -1859139064);
              dma.field_i[dma.field_g * (param0 + var7) - -param4] = var9;
              dma.field_i[(param0 + var7) * dma.field_g - -param4 - -param3] = var9;
              var7++;
              continue L5;
            }
          }
        }
    }

    final static String a(byte param0, String param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        vu var7 = null;
        vu var8 = null;
        faa var9 = null;
        CharSequence var10 = null;
        var6 = VoidHunters.field_G;
        var10 = (CharSequence) (Object) param1;
        if (!mn.a(var10, (byte) -118)) {
          return tjb.field_Cb;
        } else {
          if (iwa.field_b != 2) {
            return ei.field_e;
          } else {
            var8 = di.a(param1, param0 + -90);
            if (var8 == null) {
              return isa.a(dh.field_q, new String[1], 118);
            } else {
              ksa discarded$1 = mr.field_M.a(3, (ksa) (Object) var8);
              L0: while (true) {
                var7 = (vu) (Object) mr.field_M.a((byte) 72);
                if (var7 == null) {
                  var8.b(-3846);
                  var8.d((byte) -35);
                  vob.field_p = vob.field_p - 1;
                  var9 = dpa.field_p;
                  if (param0 != 90) {
                    field_c = 0.9397013753078566;
                    var9.h(param0 ^ 24405, param2);
                    var9.field_e = var9.field_e + 1;
                    var5 = var9.field_e;
                    var9.c(param0 + -90, 1);
                    var9.a(true, param1);
                    var9.e(var9.field_e - var5, -129);
                    return null;
                  } else {
                    var9.h(param0 ^ 24405, param2);
                    var9.field_e = var9.field_e + 1;
                    var5 = var9.field_e;
                    var9.c(param0 + -90, 1);
                    var9.a(true, param1);
                    var9.e(var9.field_e - var5, -129);
                    return null;
                  }
                } else {
                  var7.field_yb = var7.field_yb - 1;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final static StringBuilder a(int param0, boolean param1, StringBuilder param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = VoidHunters.field_G;
        var4 = param2.length();
        param2.setLength(param0);
        if (param1) {
          var7 = null;
          String discarded$2 = npa.a((byte) -60, (String) null, -96);
          var5 = var4;
          L0: while (true) {
            if (param0 <= var5) {
              return param2;
            } else {
              param2.setCharAt(var5, param3);
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = var4;
          L1: while (true) {
            if (param0 <= var5) {
              return param2;
            } else {
              param2.setCharAt(var5, param3);
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = null;
            return (tv[]) (Object) new umb[param1];
        }
        return (tv[]) (Object) new umb[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[50][];
        field_a = new int[128];
        field_c = 0.0;
    }
}
