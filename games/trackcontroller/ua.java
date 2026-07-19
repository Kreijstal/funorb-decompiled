/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends rh {
    private eh field_I;
    static ri field_L;
    static String field_K;
    private int field_J;

    final String e(int param0) {
        String discarded$2 = null;
        if (this.field_q) {
          return this.field_I.c(15914);
        } else {
          if (param0 == 0) {
            return null;
          } else {
            discarded$2 = this.e(-5);
            return null;
          }
        }
    }

    final boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 < -104) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ua.QA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public static void j(int param0) {
        if (param0 > -109) {
            ua.j(37);
            field_L = null;
            field_K = null;
            return;
        }
        field_L = null;
        field_K = null;
    }

    final void a(int param0, int param1, byte param2, al param3) {
        try {
            this.field_J = this.field_J + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ua.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ud var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qj var13 = null;
        qj var14 = null;
        qj var15 = null;
        qj var16 = null;
        var11 = TrackController.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        } else {
          var5 = param1 + this.field_p + (this.field_x >> 806708545);
          var6 = (this.field_u >> 595129889) + this.field_m + param2;
          var8 = this.field_I.a((byte) -58);
          if (lh.field_x == var8) {
            var16 = TrackController.field_D[0];
            var9 = var16.field_s << -1197099487;
            var10 = var16.field_v << -1430298495;
            if (bl.field_a != null) {
              if (var9 <= bl.field_a.field_t) {
                if (bl.field_a.field_q >= var10) {
                  mb.a((byte) -103, bl.field_a);
                  ll.a();
                  var16.a(112, 144, var16.field_s << 1674872420, var16.field_v << -1017554108, -this.field_J << 975192618, 4096);
                  ch.m(-74);
                  bl.field_a.a(-var16.field_s + var5, -var16.field_v + var6, 256);
                  return;
                } else {
                  bl.field_a = new qj(var9, var10);
                  mb.a((byte) 122, bl.field_a);
                  var16.a(112, 144, var16.field_s << 1674872420, var16.field_v << -1017554108, -this.field_J << 975192618, 4096);
                  ch.m(-74);
                  bl.field_a.a(-var16.field_s + var5, -var16.field_v + var6, 256);
                  return;
                }
              } else {
                bl.field_a = new qj(var9, var10);
                mb.a((byte) 122, bl.field_a);
                var16.a(112, 144, var16.field_s << 1674872420, var16.field_v << -1017554108, -this.field_J << 975192618, 4096);
                ch.m(-74);
                bl.field_a.a(-var16.field_s + var5, -var16.field_v + var6, 256);
                return;
              }
            } else {
              bl.field_a = new qj(var9, var10);
              mb.a((byte) 122, bl.field_a);
              var16.a(112, 144, var16.field_s << 1674872420, var16.field_v << -1017554108, -this.field_J << 975192618, 4096);
              ch.m(-74);
              bl.field_a.a(-var16.field_s + var5, -var16.field_v + var6, 256);
              return;
            }
          } else {
            if (tk.field_t != var8) {
              if (var8 != ef.field_b) {
                if (TrackController.field_G != var8) {
                  return;
                } else {
                  var14 = TrackController.field_D[1];
                  var14.a(-(var14.field_t >> -1432936543) + var5, -(var14.field_q >> 347300897) + var6, 256);
                  return;
                }
              } else {
                var13 = TrackController.field_D[2];
                var13.a(-(var13.field_t >> 1603413217) + var5, var6 - (var13.field_q >> -1602711263), 256);
                return;
              }
            } else {
              var15 = TrackController.field_D[0];
              var9 = var15.field_s << -1197099487;
              var10 = var15.field_v << -1430298495;
              if (bl.field_a != null) {
                if (var9 <= bl.field_a.field_t) {
                  if (bl.field_a.field_q >= var10) {
                    mb.a((byte) -103, bl.field_a);
                    ll.a();
                    var15.a(112, 144, var15.field_s << 1674872420, var15.field_v << -1017554108, -this.field_J << 975192618, 4096);
                    ch.m(-74);
                    bl.field_a.a(-var15.field_s + var5, -var15.field_v + var6, 256);
                    return;
                  } else {
                    bl.field_a = new qj(var9, var10);
                    mb.a((byte) 122, bl.field_a);
                    var15.a(112, 144, var15.field_s << 1674872420, var15.field_v << -1017554108, -this.field_J << 975192618, 4096);
                    ch.m(-74);
                    bl.field_a.a(-var15.field_s + var5, -var15.field_v + var6, 256);
                    return;
                  }
                } else {
                  bl.field_a = new qj(var9, var10);
                  mb.a((byte) 122, bl.field_a);
                  var15.a(112, 144, var15.field_s << 1674872420, var15.field_v << -1017554108, -this.field_J << 975192618, 4096);
                  ch.m(-74);
                  bl.field_a.a(-var15.field_s + var5, -var15.field_v + var6, 256);
                  return;
                }
              } else {
                bl.field_a = new qj(var9, var10);
                mb.a((byte) 122, bl.field_a);
                var15.a(112, 144, var15.field_s << 1674872420, var15.field_v << -1017554108, -this.field_J << 975192618, 4096);
                ch.m(-74);
                bl.field_a.a(-var15.field_s + var5, -var15.field_v + var6, 256);
                return;
              }
            }
          }
        }
    }

    ua(eh param0) {
        try {
            this.field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Fullscreen";
    }
}
