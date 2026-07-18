/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements cj {
    static ci field_b;
    static int[] field_c;
    private int field_f;
    static int field_d;
    private int field_a;
    private pk field_e;

    final static gd a(boolean param0) {
        String var1 = null;
        int discarded$12 = -47;
        var1 = pb.a();
        if (param0) {
          if (var1 != null) {
            if (var1.indexOf('@') < 0) {
              int discarded$13 = -47;
              int discarded$14 = 105;
              return new gd(pb.a(), dd.f());
            } else {
              var1 = "";
              int discarded$15 = -47;
              int discarded$16 = 105;
              return new gd(pb.a(), dd.f());
            }
          } else {
            int discarded$17 = -47;
            int discarded$18 = 105;
            return new gd(pb.a(), dd.f());
          }
        } else {
          gd discarded$19 = qh.a(false);
          if (var1 == null) {
            int discarded$20 = -47;
            int discarded$21 = 105;
            return new gd(pb.a(), dd.f());
          } else {
            L0: {
              if (var1.indexOf('@') >= 0) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
            int discarded$22 = -47;
            int discarded$23 = 105;
            return new gd(pb.a(), dd.f());
          }
        }
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param3 == -24381) {
                break L1;
              } else {
                ((qh) this).field_a = -110;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_s) {
                  break L3;
                } else {
                  if (!param1.d(-110)) {
                    stackOut_7_0 = 2188450;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_8_0 = stackOut_6_0;
              break L2;
            }
            var6_int = stackIn_8_0;
            int discarded$1 = ((qh) this).field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_o + "</u>", param2 - -param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, var6_int, -1, ((qh) this).field_a, ((qh) this).field_f, ((qh) this).field_e.field_p + ((qh) this).field_e.field_s);
            if (param1.d(param3 ^ 24395)) {
              L4: {
                var7 = ((qh) this).field_e.b(param1.field_o);
                var8 = ((qh) this).field_e.field_p + ((qh) this).field_e.field_s;
                var9 = param2 - -param1.field_w;
                if (2 == ((qh) this).field_a) {
                  var9 = var9 + (param1.field_p - var7);
                  break L4;
                } else {
                  if (((qh) this).field_a == 1) {
                    var9 = var9 + (param1.field_p - var7 >> 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var10 = param0 - -param1.field_u;
                if (((qh) this).field_f == 2) {
                  var10 = var10 + (param1.field_n - var8);
                  break L5;
                } else {
                  if (1 == ((qh) this).field_f) {
                    var10 = var10 + (param1.field_n - var8 >> 1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6;
            stackOut_22_1 = new StringBuilder().append("qh.E(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public qh() {
        ((qh) this).field_e = qk.field_e;
        ((qh) this).field_a = 1;
        ((qh) this).field_f = 1;
    }

    public static void a() {
        field_b = null;
        field_c = null;
    }

    qh(pk param0, int param1, int param2) {
        try {
            ((qh) this).field_a = param1;
            ((qh) this).field_f = param2;
            ((qh) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[16384];
    }
}
