/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends pp {
    private int field_j;
    static kv field_k;
    static String field_i;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 <= -118) {
                break L1;
              } else {
                field_k = (kv) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = ql.field_s;
            L2: while (true) {
              if (mj.field_h.length <= var3_int) {
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = fr.field_l[var3_int];
                  if (0 > var5) {
                    var4 = var4 + mm.field_z;
                    break L3;
                  } else {
                    var6 = gg.a(true, -103, mj.field_h[var3_int]);
                    var7 = mg.field_k + -(var6 >> -636813407);
                    var4 = var4 + cba.field_d;
                    if (!hha.a((um.field_d << -31205567) + hc.field_D, param1, (vt.field_k << -1710690751) + var6, 1, var7 - vt.field_k, var4, param0)) {
                      var4 = var4 + (cba.field_d + (um.field_d << 219053985) + hc.field_D);
                      break L3;
                    } else {
                      stackIn_8_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "rla.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_14_0;
        }
    }

    rla(nq param0, int param1) {
        try {
            this.field_j = param1;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) -123);
            er.a(this.field_h, 117, param0);
            param0.d(this.field_j, 0);
            int var3_int = -78 / ((34 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rla.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_k = null;
        if (param0 != 29) {
            field_k = (kv) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void a(aga param0, op param1, int param2) {
        aga var6 = this.field_h.a(74, param1);
        aga var4 = var6;
        if (var6 == null) {
            return;
        }
        try {
            var6.field_E = this.field_j;
            if (param2 != 12) {
                lu var5 = (lu) null;
                this.a((lu) null, (byte) -61);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rla.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
            field_k = (kv) null;
            return 255 & param1 >> 658235760;
        }
        return 255 & param1 >> 658235760;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != -1) {
          rla.a(-108, -62, 102);
          rda.a(param0 + 1, param1, true);
          return;
        } else {
          rda.a(param0 + 1, param1, true);
          return;
        }
    }

    static {
        field_i = "Loading extra data";
    }
}
