/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends vv {
    static boolean field_y;
    byte field_x;
    static vc[] field_w;
    static boolean field_t;
    iw field_v;
    int field_u;

    final static void a(String param0, byte param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null != rk.field_f) {
                rk.field_f.q(-123);
                break L1;
              } else {
                break L1;
              }
            }
            pb.field_E = new pd(param0, param2, false, true, true);
            we.field_a.a((byte) -122, (fd) (Object) pb.field_E);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ui.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(111).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static v g(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var1 = 2147483647;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          if (var3 >= e.field_n.length) {
            return e.field_n[var2];
          } else {
            var4 = e.field_n[var3].field_a;
            if (var1 > var4) {
              var1 = var4;
              var2 = var3;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void a() {
        field_w = null;
    }

    final static void h(int param0) {
        ol.field_R = true;
        if (param0 != -15396) {
            field_w = null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int discarded$0 = 1;
        mu.a(bw.field_a[param1], true, param0, ad.field_d[param1], param2);
    }

    final int a(int param0) {
        if (param0 != 0) {
            return 103;
        }
        if (!(((ui) this).field_v != null)) {
            return 0;
        }
        return ((ui) this).field_v.field_n * 100 / (-((ui) this).field_x + ((ui) this).field_v.field_f.length);
    }

    final byte[] b(int param0) {
        L0: {
          if (((ui) this).field_p) {
            break L0;
          } else {
            if (((ui) this).field_v.field_n < -((ui) this).field_x + ((ui) this).field_v.field_f.length) {
              break L0;
            } else {
              L1: {
                if (param0 == 12802) {
                  break L1;
                } else {
                  v discarded$2 = ui.g(64);
                  break L1;
                }
              }
              return ((ui) this).field_v.field_f;
            }
          }
        }
        throw new RuntimeException();
    }

    ui() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = true;
        field_y = false;
    }
}
