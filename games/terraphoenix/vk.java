/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String field_a;
    static int field_c;
    static java.security.SecureRandom field_b;
    static ci field_d;

    final static void a(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Terraphoenix.field_V;
        try {
          L0: {
            if (!si.o(param0 + 8187)) {
              L1: {
                if (null == a.field_b) {
                  break L1;
                } else {
                  if (!a.field_b.field_d) {
                    break L1;
                  } else {
                    ga.b((byte) 82);
                    cl.field_J.a((gl) (new hi(cl.field_J, ql.field_e)), (byte) -1);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                cl.field_J.a(true, q.field_Hb, dm.field_g, 120);
                if (param0 == -8177) {
                  break L2;
                } else {
                  vk.a(87);
                  break L2;
                }
              }
              cl.field_J.i((byte) 126);
              L3: while (true) {
                if (!fd.d(1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  cl.field_J.a(lf.field_c, ua.field_g, (byte) -116);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "vk.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static kf a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        kf[] var3 = null;
        int var4 = 0;
        kf var5 = null;
        int var6 = 0;
        kf stackIn_4_0 = null;
        kf stackIn_10_0 = null;
        kf stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var2 = tb.a(-119, "jagex-last-login-method", param1);
            if (var2 == null) {
              stackIn_4_0 = gm.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = fm.a(param0);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackIn_13_0 = gm.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a((byte) -126, var2)) {
                    stackIn_10_0 = (kf) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("vk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 10417) {
          field_b = (java.security.SecureRandom) null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    static {
        field_a = "UFO preparing to launch";
        field_c = 640;
    }
}
