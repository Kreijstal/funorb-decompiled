/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends rqa {
    static String field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              si.a(77, 62, param0[0].a(40));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("fb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    fb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        faa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ea var11 = null;
        iea var12 = null;
        faa var13 = null;
        iea var14 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var13 = qga.field_b;
              var2 = var13.e((byte) -89);
              if (var2 != param0) {
                if ((var2 ^ -1) != -2) {
                  if (var2 != 2) {
                    gna.a((Throwable) null, "A1: " + hm.e(-13514), 0);
                    ifb.l(param0 + -117);
                    break L1;
                  } else {
                    var12 = (iea) ((Object) klb.field_q.d(0));
                    if (var12 == null) {
                      ifb.l(-119);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      oea.f((byte) -80);
                      var12.b(-3846);
                      break L1;
                    }
                  }
                } else {
                  var11 = (ea) ((Object) oaa.field_k.d(0));
                  if (var11 != null) {
                    var11.b(-3846);
                    break L1;
                  } else {
                    ifb.l(-125);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                var10 = oea.f((byte) -85);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((ds) ((Object) var5)).e((byte) -89);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (iea) ((Object) klb.field_q.d(0));
                    if (var14 != null) {
                      var14.b(param0 ^ -3846);
                      break L1;
                    } else {
                      ifb.l(-121);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var9[var7] = ((ds) ((Object) var5)).h(92);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "fb.C(" + param0 + ')');
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

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -116) {
              stackIn_4_0 = ac.a(1, param0.length, 0, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("fb.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void e(byte param0) {
        if (param0 != 42) {
            fb.e((byte) -19);
        }
        field_p = null;
    }

    static {
        field_p = "Spawn asteroid at mouse";
    }
}
