/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gh extends uc {
    static int[] field_q;
    static int field_t;
    static ak field_u;
    static wm field_s;
    static int[] field_r;
    static String[] field_w;
    static int field_v;

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        try {
            if (param4) {
                kk.a(param3 - -param0.field_z, param0.field_C, param0.field_p + param2, param0.field_E, (byte) -51);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$5 = 0;
        pc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = aa.field_f;
              if (param0 == 8) {
                break L1;
              } else {
                gh.d(110);
                break L1;
              }
            }
            L2: while (true) {
              if (!lf.a((byte) -91)) {
                break L0;
              } else {
                var1.g(8, 15514);
                fieldTemp$5 = var1.field_m + 1;
                var1.field_m = var1.field_m + 1;
                var2 = fieldTemp$5;
                ao.a(var1, -20);
                aa.field_f.f(var1.field_m + -var2, param0 ^ -9);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "gh.B(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_s = null;
        if (param0 >= -72) {
            return;
        }
        field_w = null;
        field_u = null;
        field_r = null;
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
                        ri.field_h = (int)(var3.longValue() / 1048576L) + 1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      if (param0 != 90) {
                        gh.d(-108);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            if (param0 == 90) {
              return;
            } else {
              gh.d(-108);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    gh(int param0) {
        this(he.field_d, param0);
    }

    gh(jl param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_w, -1, 2147483647, false);
    }

    static {
        field_r = new int[8192];
        field_s = new wm(14, 0, 4, 1);
        field_w = new String[]{"Welcome to Pixelate!", null, "Alternate Controls", null, null, null};
    }
}
