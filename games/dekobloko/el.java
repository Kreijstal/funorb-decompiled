/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends sf {
    byte[] field_H;
    static char field_G;
    static String[] field_L;
    static long field_J;
    static String field_I;
    int field_F;
    kh field_K;

    final byte[] g(byte param0) {
        if (this.field_z) {
          throw new RuntimeException();
        } else {
          if (param0 < 65) {
            this.a(true);
            return this.field_H;
          } else {
            return this.field_H;
          }
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        field_I = null;
        if (!param0) {
            java.awt.Component var2 = (java.awt.Component) null;
            el.a(-15, (byte) 51, -90, (java.awt.Component) null);
        }
    }

    final static eh a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            eh var5 = null;
            wf var5_ref = null;
            eh stackIn_2_0 = null;
            eh stackIn_4_0 = null;
            wf stackIn_6_0 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param1 >= 5) {
                      var4 = Class.forName("rj");
                      var5 = (eh) (var4.newInstance());
                      var5.a(param2, (byte) 83, param0, param3);
                      stackIn_4_0 = (eh) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (eh) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new wf();
                  ((eh) ((Object) var5_ref)).a(param2, (byte) 83, param0, param3);
                  stackIn_6_0 = (wf) (var5_ref);
                  return (eh) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var4_ref2);

                stackIn_9_1 = new StringBuilder().append("el.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    el() {
    }

    final int a(boolean param0) {
        if (this.field_z) {
            return 0;
        }
        if (param0) {
            field_I = (String) null;
            return 100;
        }
        return 100;
    }

    static {
        field_I = "The invitation has been withdrawn.";
    }
}
