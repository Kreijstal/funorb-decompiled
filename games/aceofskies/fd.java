/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String field_e;
    static al[][] field_b;
    static pt field_a;
    static ep field_f;
    static String field_c;
    static int field_d;

    public static void a(byte param0) {
        int var1 = 16 % ((15 - param0) / 50);
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = (al[][]) null;
        field_f = null;
    }

    final static void a(int param0) {
        lr var1;
        ah var1_ref;
        byte[] var3;
        byte[] var4;
        L0: {
          if (wl.field_r != null) {
            break L0;
          } else {
            var1 = new lr();
            var3 = var1.a(128, 128, (byte) -120, 16);
            wl.field_r = sf.a(false, -137, var3);
            break L0;
          }
        }
        if (param0 > -50) {
          L1: {
            field_e = (String) null;
            if (null != lg.field_l) {
              break L1;
            } else {
              var1_ref = new ah();
              var4 = var1_ref.a(128, 16, 128, (byte) 118);
              lg.field_l = sf.a(false, -137, var4);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != lg.field_l) {
              break L2;
            } else {
              var1_ref = new ah();
              var4 = var1_ref.a(128, 16, 128, (byte) 118);
              lg.field_l = sf.a(false, -137, var4);
              break L2;
            }
          }
          return;
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -6) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackIn_3_0 = cf.field_h.equals(vu.a(127, var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("fd.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (-2 <= (param2 ^ -1)) {
                if (param2 != param0) {
                  stackIn_12_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = var3_int * param1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  if ((param2 & 1 ^ -1) != -1) {
                    var3_int = var3_int * param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 * param1;
                param2 = param2 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "fd.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_e = "Please check if address is correct";
        field_a = new pt();
        field_c = "Score";
    }
}
