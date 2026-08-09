/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ae extends dk {
    static volatile int field_s;
    static int[] field_q;
    volatile boolean field_v;
    static String field_r;
    boolean field_t;
    boolean field_w;
    static int field_u;

    abstract byte[] c(byte param0);

    public static void a(boolean param0) {
        field_r = null;
        if (!param0) {
            field_u = 115;
        }
        field_q = null;
    }

    abstract int d(int param0);

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_6_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (a.a("getcookies", param0, -120));
                    var4 = cj.a(var3, -84, ';');
                    var5 = param2;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var6 = var4[var5].indexOf('=');
                          if (0 > var6) {
                            break L3;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param1)) {
                              break L3;
                            } else {
                              stackIn_6_0 = var4[var5].substring(1 + var6).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_11_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var3_ref2);

                stackIn_14_1 = new StringBuilder().append("ae.B(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_11_0);
            } else {
              return stackIn_6_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ae() {
        this.field_v = true;
    }

    final static void a(gb param0, int param1, gb param2) {
        cl.field_i = param2;
        if (param1 < 27) {
            return;
        }
        try {
            jk.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ae.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = 0;
        field_q = new int[8192];
        field_r = "Completed";
        field_u = -1;
    }
}
