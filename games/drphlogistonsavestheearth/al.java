/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static he[] field_d;
    static fi field_e;
    static nh field_b;
    static he field_c;
    static he[] field_a;
    static int[] field_g;
    static int field_f;

    final static vj a(int param0, int param1) {
        if (param0 != 3) {
            return (vj) null;
        }
        return na.a(true, param1, false, false, true, 1);
    }

    final static na a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            na var5 = null;
            fa var5_ref = null;
            int var6 = 0;
            na stackIn_1_0 = null;
            fa stackIn_3_0 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var6 = -16 / ((param0 - 42) / 58);
                    var4 = Class.forName("rj");
                    var5 = (na) (var4.newInstance());
                    var5.a(param1, param3, (byte) -49, param2);
                    stackIn_1_0 = (na) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new fa();
                  ((na) ((Object) var5_ref)).a(param1, param3, (byte) -35, param2);
                  stackIn_3_0 = (fa) (var5_ref);
                  return (na) ((Object) stackIn_3_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var4_ref2);

                stackIn_6_1 = new StringBuilder().append("al.F(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
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
              throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            field_e = (fi) null;
        }
        field_a = null;
        field_g = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var1 = 2 != gf.field_b ? 24 : 23;
        ul.field_j[3] = new int[]{6, var1};
        int var2 = th.field_a[3].field_e.field_f;
        th.field_a[3] = new ld(3);
        if (param0 >= -24) {
            field_f = 16;
        }
        th.field_a[3].field_e.field_f = var2;
    }

    final static String a(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        String var6 = "(" + l.field_q + " " + gg.field_l + " " + ek.field_h + ") " + t.field_b;
        String var1 = var6;
        if (param0 > -43) {
            field_d = (he[]) null;
        }
        if (-1 <= (gf.field_C ^ -1)) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < gf.field_C; var2++) {
                var7 = var1 + ' ';
                var3 = dh.field_N.field_h[var2] & 255;
                var4 = var3 >> 1432982212;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                var8 = var7 + (char)var4;
                if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                if (param1 >= 56) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                      param0.getAppletContext().showDocument(kk.a(var2, param0, 4767999), "_top");
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("al.C(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new he[4];
        field_g = new int[20];
    }
}
