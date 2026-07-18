/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class meb implements wwa {
    private int field_a;
    static uja field_d;
    private no field_b;
    private int field_e;
    static float[] field_c;

    public static void a() {
        field_d = null;
        field_c = null;
    }

    final static mm a(int param0, int param1) {
        fh stackIn_4_0 = null;
        fh stackIn_8_0 = null;
        fh stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        fh stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param1 != 1) {
          L0: {
            mm discarded$10 = meb.a(-8, 53);
            if (ks.field_r != null) {
              stackOut_7_0 = ks.field_r.a(-1, (long)param0);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (fh) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (mm) (Object) stackIn_8_0;
        } else {
          L1: {
            if (ks.field_r != null) {
              stackOut_3_0 = ks.field_r.a(-1, (long)param0);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (fh) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (mm) (Object) stackIn_4_0;
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_e) {
                  break L2;
                } else {
                  if (param1.e((byte) -120)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            var6_int = stackIn_5_0;
            var7 = 122 / ((param0 - -27) / 35);
            int discarded$1 = ((meb) this).field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_j + "</u>", param2 + param1.field_g, param3 - -param1.field_r, param1.field_h, param1.field_f, var6_int, -1, ((meb) this).field_e, ((meb) this).field_a, ((meb) this).field_b.field_A + ((meb) this).field_b.field_k);
            if (param1.e((byte) -120)) {
              L3: {
                var8 = ((meb) this).field_b.b(param1.field_j);
                var9 = ((meb) this).field_b.field_A + ((meb) this).field_b.field_k;
                var10 = param2 + param1.field_g;
                if (2 != ((meb) this).field_e) {
                  if (((meb) this).field_e != 1) {
                    break L3;
                  } else {
                    var10 = var10 + (-var8 + param1.field_h >> 1);
                    break L3;
                  }
                } else {
                  var10 = var10 + (-var8 + param1.field_h);
                  break L3;
                }
              }
              L4: {
                var11 = param1.field_r + param3;
                if (((meb) this).field_a == 2) {
                  var11 = var11 + (-var9 + param1.field_f);
                  break L4;
                } else {
                  if (((meb) this).field_a != 1) {
                    break L4;
                  } else {
                    var11 = var11 + (-var9 + param1.field_f >> 1);
                    break L4;
                  }
                }
              }
              aha.a(var11 - -2, var8 + 4, var10 - 2, var9, (byte) -79);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("meb.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public meb() {
        ((meb) this).field_b = loa.field_o;
        ((meb) this).field_e = 1;
        ((meb) this).field_a = 1;
    }

    meb(no param0, int param1, int param2) {
        try {
            ((meb) this).field_a = param2;
            ((meb) this).field_b = param0;
            ((meb) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "meb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new uja();
        field_c = new float[4];
    }
}
