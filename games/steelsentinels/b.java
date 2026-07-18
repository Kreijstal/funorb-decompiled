/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b implements qk {
    static String field_g;
    static wk[] field_q;
    private int field_d;
    static String field_p;
    private int field_s;
    static String field_i;
    static boolean field_f;
    private mi field_o;
    private int field_m;
    private int field_k;
    static wk[] field_n;
    private int field_h;
    static String field_j;
    static int field_c;
    static String field_l;
    static int field_b;
    static gh field_e;
    private int field_r;
    private int field_a;

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nl var14 = null;
        lh stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        lh stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof nl)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (lh) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (lh) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (nl) (Object) stackIn_3_0;
              pb.a(param0 - -param1.field_o, param4 + param1.field_z, param1.field_x, param1.field_E, ((b) this).field_m);
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 == -30) {
              L3: {
                var7 = var14.field_cb + (param1.field_o + param0);
                var8 = var14.field_Y + (param4 - -param1.field_z);
                pb.e(var7, var8, var14.field_ab, ((b) this).field_a);
                if (-1 == var14.field_W) {
                  break L3;
                } else {
                  var9 = (double)var14.field_W * 3.141592653589793 * 2.0 / (double)var14.field_bb;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_ab);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_ab);
                  pb.e(var11 + var7, var12 + var8, 1, ((b) this).field_k);
                  break L3;
                }
              }
              L4: {
                pb.e(var7, var8, 2, 1);
                var9 = (double)var14.field_eb * 3.141592653589793 * 2.0 / (double)var14.field_bb;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_ab);
                var12 = (int)(Math.cos(var9) * (double)var14.field_ab);
                pb.d(var7, var8, var7 + var11, var12 + var8, 1);
                if (null == ((b) this).field_o) {
                  break L4;
                } else {
                  var13 = ((b) this).field_s + var14.field_cb - -var14.field_ab;
                  int discarded$1 = ((b) this).field_o.a(param1.field_y, param0 + param1.field_o + var13, ((b) this).field_h + param4 + param1.field_z, -var13 - ((b) this).field_s + param1.field_x, param1.field_E - (((b) this).field_s << 1), ((b) this).field_r, ((b) this).field_d, 1, 1, 0);
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("b.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(11, (byte) -117);
        var2.field_p = var2.field_p + 1;
        int var3 = var2.field_p;
        var2.a((byte) 113, 2);
        var2.a(rb.field_i.length, (byte) -122, 0, rb.field_i);
        var2.a((byte) 125, fi.field_l);
        var2.a((byte) 110, nb.field_L);
        var2.a(ti.field_s.length, (byte) -122, 0, ti.field_s);
        var2.b((byte) 123, var2.field_p - var3);
    }

    final static void a(int param0, byte param1) {
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 123, 2);
        var2.a((byte) 112, 4);
        int discarded$0 = 56;
        var2.a((byte) 127, nd.a());
        int var3 = -47 % ((param1 - -35) / 61);
    }

    public static void a() {
        field_j = null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_q = null;
        field_n = null;
    }

    final static e a(boolean param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        e stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (jn.field_b != nj.field_ab) {
              L1: {
                if (sn.field_p != jn.field_b) {
                  break L1;
                } else {
                  if (!param1.equals((Object) (Object) kh.field_z)) {
                    break L1;
                  } else {
                    jn.field_b = mm.field_e;
                    stackOut_5_0 = vl.field_x;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              jn.field_b = nj.field_ab;
              vl.field_x = null;
              kh.field_z = param1;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (e) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("b.B(").append(false).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return (e) (Object) stackIn_8_0;
    }

    b(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((b) this).field_m = param7;
            ((b) this).field_h = param2;
            ((b) this).field_s = param1;
            ((b) this).field_o = param0;
            ((b) this).field_r = param3;
            ((b) this).field_k = param6;
            ((b) this).field_d = param4;
            ((b) this).field_a = param5;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new wk[3];
        field_j = "Off";
        field_p = "S";
        field_l = "Complete three training missions to unlock your first sentinel.";
        field_i = "Research into <col=00ffff>energy shields</col> is needed before the <%0> can be engineered.";
        field_c = 500;
        field_f = false;
        field_b = 67;
    }
}
