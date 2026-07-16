/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String[] field_d;
    static int field_c;
    static String field_f;
    static int field_a;
    static boolean field_e;
    private tg[] field_b;

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -59) {
          var2 = null;
          oh.a((byte) -47, (String[]) null);
          field_f = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ve.a(param4, param0, ((oh) this).field_b, (byte) -96, param2, param1);
        if (param3 != -21907) {
            field_e = true;
        }
    }

    final static void a(byte param0, String[] param1) {
        if (null == lg.field_b) {
          L0: {
            if (null != il.field_b) {
              il.field_b.field_C.a((byte) -112, param1);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != -29) {
            field_a = 86;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            lg.field_b.field_z.a((byte) -124, param1);
            if (null != il.field_b) {
              il.field_b.field_C.a((byte) -112, param1);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 == -29) {
            return;
          } else {
            field_a = 86;
            return;
          }
        }
    }

    final static void a(boolean param0) {
        ck.field_a = 0;
        if (!param0) {
            field_e = false;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = -56 / ((param0 - 26) / 52);
        m.field_g = param1;
    }

    oh(tg[] param0) {
        ((oh) this).field_b = param0;
    }

    final static void b(boolean param0) {
        ed.field_c.a(10768, (lk) (Object) new k());
        if (!param0) {
            oh.a(true);
        }
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Throwable var3 = null;
            Runtime var3_ref = null;
            Long var4 = null;
            Object var5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  var2 = -12 % ((param0 - -53) / 62);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var3_ref = Runtime.getRuntime();
                        var5 = null;
                        var4 = (Long) var1.invoke((Object) (Object) var3_ref, (Object[]) null);
                        ja.field_d = (int)(var4.longValue() / 1048576L) - -1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var3 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_f = "Achieved";
        field_a = 0;
    }
}
