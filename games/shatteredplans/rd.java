/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd implements fo {
    private int field_a;
    private ob field_e;
    private int field_b;
    static qr field_h;
    static String field_d;
    static wa field_g;
    private int field_f;
    private int field_c;

    public final l a(byte param0) throws jn {
        hs var3 = null;
        ln[] var4_ref_ln__ = null;
        int var4 = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        l var12 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var12 = new l(pe.a((byte) 34, this.field_f), ls.a(this.field_c, 2), this.field_a, this.field_b);
        var3 = new hs(this.field_f, this.field_c, this.field_a, this.field_b, 1);
        var3.a(false, var12);
        var4_ref_ln__ = var12.field_e;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var4_ref_ln__.length) {
            var12.a(26253);
            var4 = 100 % ((-67 - param0) / 44);
            return var12;
          } else {
            var6 = var4_ref_ln__[var5];
            var7 = this.field_e.j(-117);
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                var8 = 0;
                L2: while (true) {
                  L3: {
                    if (-5 >= (var8 ^ -1)) {
                      break L3;
                    } else {
                      var9 = this.field_e.j(-91);
                      var6.field_G[var8] = we.a(15, var9);
                      var8++;
                      if (4 > var8) {
                        var6.field_G[var8] = we.a(var9, 240) >> -1938807996;
                        var8++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var6.field_x = this.field_e.f(-20976);
                    if (0 == (32768 & var6.field_x)) {
                      break L4;
                    } else {
                      var6.field_u = true;
                      var6.field_x = var6.field_x & 32767;
                      break L4;
                    }
                  }
                  var6.field_B = this.field_e.j(-86);
                  var6.field_L = var6.field_B >>> -538290202;
                  var6.field_B = var6.field_B & 63;
                  var5++;
                  continue L0;
                }
              } else {
                var9 = this.field_e.j(-93);
                var10 = var12.field_e[var9];
                var6.a((byte) -83, var10);
                var10.a((byte) -108, var6);
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -63) {
            rd.a(-45);
        }
        field_g = null;
        field_h = null;
    }

    rd(ob param0, int param1, int param2, int param3, int param4) {
        try {
            this.field_e = param0;
            this.field_a = param1;
            this.field_f = param2;
            this.field_b = param4;
            this.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static qr a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, nq param8, int param9, int param10, int param11, int param12) {
        qr var13 = null;
        RuntimeException var13_ref = null;
        qr stackIn_2_0 = null;
        qr stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_3_0 = null;
        qr stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var13 = new qr(0L, (qr) null);
            var13.field_F = qp.a(param7, -114, param3);
            var13.field_lb = qp.a(param12, -79, param11);
            var13.field_vb = qp.a(param10, param5 ^ 28, param6);
            var13.field_sb = qp.a(param1, -102, param4);
            var13.field_wb = qp.a(param0, param5 + -213, param2);
            var13.field_nb = param8;
            if (param5 == 99) {
              var13.field_x = param9;
              stackOut_3_0 = (qr) (var13);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (qr) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var13_ref);
            stackOut_5_1 = new StringBuilder().append("rd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param8 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_g = null;
    }
}
