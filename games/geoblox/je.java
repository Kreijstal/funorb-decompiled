/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends hf {
    kl field_g;
    int field_i;
    static wl field_j;
    hf field_f;
    static sk[] field_h;

    final static void c() {
        p var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (hj.field_c) {
                break L1;
              } else {
                if (null == vk.field_b) {
                  break L1;
                } else {
                  if (vk.field_b.field_f) {
                    ra.field_d = vk.field_b.field_j;
                    hj.field_c = true;
                    ug.field_c = ug.field_c & ~ra.field_d;
                    vl.field_p = vl.field_p | ra.field_d;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (fh.c(-91)) {
                break L2;
              } else {
                L3: while (true) {
                  var1 = (p) (Object) ja.field_A.b((byte) -118);
                  if (var1 == null) {
                    break L2;
                  } else {
                    int discarded$26 = 4;
                    int discarded$27 = -56;
                    sj.a(var1);
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "je.C(" + -122 + ')');
        }
    }

    final static rh a(int param0, boolean param1, boolean param2) {
        int var5 = -55;
        int discarded$0 = 0;
        int discarded$1 = 1;
        int discarded$2 = 1;
        return am.a(-128, 1, param2);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    param1.getAppletContext().showDocument(wf.a(var2, -84, param1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                var2_int = 0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("je.D(").append(114).append(',');
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param1 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L3;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L3;
                }
              }
              throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_j = null;
        field_h = null;
    }

    je(kl param0, hf param1) {
        try {
            ((je) this).field_g = param0;
            ((je) this).field_i = param0.i();
            ((je) this).field_f = param1;
            ((je) this).field_g.f(((je) this).field_i * j.field_gb / 80);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new wl();
    }
}
