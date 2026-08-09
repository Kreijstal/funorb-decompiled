/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends pi {
    int[] field_r;
    int field_u;
    int field_v;
    int field_t;
    int field_s;
    static int field_p;
    int field_o;
    int field_n;
    static String field_q;
    int field_w;

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (byte[]) null;
                wb.a(17, -87, (byte[]) null, 80);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if ((param2 ^ -1) >= -1) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << -1810155999;
                param2--;
                param0 = param0 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "wb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 0) {
            field_q = (String) null;
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        qm var5 = null;
        byte[] var6 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (-1 <= (param1 ^ -1)) {
                var4 = param2;
                break L1;
              } else {
                var8 = new byte[param0];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param0) {
                    break L1;
                  } else {
                    var8[var5_int] = param2[param1 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new qm();
            if (param3 == 18738) {
              var5.a((byte) -29);
              var5.a(var4, -21816, (long)(8 * param0));
              var6 = new byte[64];
              var5.a(0, var6, 8);
              stackIn_10_0 = (byte[]) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("wb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    wb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_r = param6;
            this.field_v = param0;
            this.field_o = param3;
            this.field_u = param2;
            fieldTemp$0 = nf.field_c;
            nf.field_c = nf.field_c + 1;
            this.field_w = 65535 & fieldTemp$0;
            this.field_t = param4;
            this.field_s = param1;
            this.field_n = param5;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "wb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "To server list";
    }
}
