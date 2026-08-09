/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends o {
    static String field_m;
    int field_p;
    int field_o;
    static int field_n;
    int field_l;
    int[] field_q;
    int field_j;
    int field_k;
    static lb field_s;
    int field_r;

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        this.field_l = param5;
        this.field_j = param0;
        this.field_k = param6;
        this.field_o = param7;
        this.field_r = param1;
        this.field_q = param3;
        if (param2 != 0) {
            return;
        }
        try {
            this.field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "h.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_s = null;
        if (param0 != 1187598372) {
            int[] var2 = (int[]) null;
            h.a((byte[]) null, -55, 110, (int[]) null, 44);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        pg var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Chess.field_G;
        try {
          L0: {
            if (param1 == 0) {
              var4 = (pg) ((Object) nd.field_h.g(-18110));
              L1: while (true) {
                if (var4 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  tm.a(false, var4, param0);
                  var4 = (pg) ((Object) nd.field_h.a((byte) -122));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "h.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ge.field_eb.length) {
                L2: {
                  if (param2 == 1187598372) {
                    break L2;
                  } else {
                    h.a(104);
                    break L2;
                  }
                }
                break L0;
              } else {
                param1 = ge.field_eb[var5_int];
                var6 = var5_int << 1187598372;
                L3: while (true) {
                  incrementValue$4 = param1;
                  param1--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$5 = var6;
                    var6++;
                    param4 = ve.field_Hb[incrementValue$5];
                    dupTemp$6 = param0[param4];
                    dupTemp$7 = param3[dupTemp$6];
                    param3[dupTemp$6] = dupTemp$7 + 1;
                    ve.field_Hb[dupTemp$7] = param4;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("h.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    h() {
    }

    static {
        field_m = "Mute this player for 48 hours";
    }
}
