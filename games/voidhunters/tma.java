/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tma extends rqa {
    static ij field_r;
    static slb field_q;
    static String field_o;
    static uja field_p;

    public static void f(byte param0) {
        tpa discarded$0 = null;
        field_q = null;
        field_r = null;
        field_p = null;
        field_o = null;
        if (param0 != 66) {
            String var2 = (String) null;
            discarded$0 = tma.a(0, (String) null, (byte) -109);
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dnb var5_ref_dnb = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        kob var9 = null;
        faa var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var10 = qga.field_b;
            var2 = var10.e((byte) -113);
            var3 = 44 % ((-49 - param0) / 63);
            if (var2 == 0) {
              var9 = (kob) ((Object) cnb.field_q.d(0));
              if (var9 != null) {
                L1: {
                  var5 = var10.e((byte) -93);
                  if (var5 != 0) {
                    var12 = new byte[var5];
                    var11 = var12;
                    var8 = var11;
                    var6 = var8;
                    var10.a(0, var12, (byte) -59, var5);
                    break L1;
                  } else {
                    var6 = null;
                    break L1;
                  }
                }
                var10.field_e = var10.field_e + 4;
                if (!var10.c(-2780)) {
                  ifb.l(-126);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var9.field_f = var6;
                  var9.field_d = true;
                  var9.b(-3846);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                ifb.l(-126);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if ((var2 ^ -1) == -2) {
                var4 = var10.h(100);
                var5_ref_dnb = (dnb) ((Object) ahb.field_o.d(0));
                L2: while (true) {
                  L3: {
                    if (var5_ref_dnb == null) {
                      break L3;
                    } else {
                      if (var5_ref_dnb.field_d == var4) {
                        break L3;
                      } else {
                        var5_ref_dnb = (dnb) ((Object) ahb.field_o.a((byte) 78));
                        continue L2;
                      }
                    }
                  }
                  if (var5_ref_dnb != null) {
                    var5_ref_dnb.b(-3846);
                    return;
                  } else {
                    ifb.l(-121);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                gna.a((Throwable) null, "A1: " + hm.e(-13514), 0);
                ifb.l(-126);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "tma.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    tma(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tpa a(int param0, String param1, byte param2) {
        tpa var3 = null;
        RuntimeException var3_ref = null;
        tpa stackIn_2_0 = null;
        tpa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tpa stackOut_3_0 = null;
        tpa stackOut_1_0 = null;
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
            var3 = new tpa(false);
            if (param2 == -124) {
              var3.field_f = param1;
              var3.field_d = param0;
              stackOut_3_0 = (tpa) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (tpa) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("tma.C(").append(param0).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_q = (slb) null;
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(62, 97));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("tma.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_r = new ij();
        field_o = "Players: <%0>/<%1>";
        field_q = new slb();
        field_p = new uja();
    }
}
