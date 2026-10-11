/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends li {
    int field_n;
    static int[] field_q;
    static volatile long field_x;
    int field_r;
    int field_p;
    static String field_w;
    static String field_o;
    int field_t;
    int field_y;
    int field_s;
    static int field_v;
    static int[] field_u;

    final static void a(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (!param0) {
              field_o = (String) null;
            }
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var4 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              ci.field_a = 1 + (int)(var3.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (-param5 + param3 < ap.field_e) {
          og.a(param4, param1, -1, param3, param5, param6, param0);
        } else {
          if (ib.field_a < param3 + param5) {
            og.a(param4, param1, -1, param3, param5, param6, param0);
          } else {
            if (ua.field_e > param6 - param5) {
              og.a(param4, param1, -1, param3, param5, param6, param0);
            } else {
              if (cj.field_D >= param6 + param5) {
                cl.a(param1, param3, param4, param6, (byte) -40, param5, param0);
              } else {
                og.a(param4, param1, -1, param3, param5, param6, param0);
              }
            }
          }
        }
        if (param2 >= 96) {
          return;
        }
        field_q = (int[]) null;
    }

    public static void a(byte param0) {
        field_u = null;
        field_w = null;
        if (param0 < -63) {
          field_o = null;
          field_q = null;
          return;
        }
        nf.a(-9, 105, (byte) -96, 28, 93, 4, 42);
        field_o = null;
        field_q = null;
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -28) {
          if (param1 >= 4096) {
            if (param1 >= 6144) {
              stackIn_19_0 = -jc.field_b[-param1 + 8192];
            } else {
              stackIn_19_0 = -jc.field_b[param1 - 4096];
            }
            return stackIn_19_0;
          }
          if (param1 < 2048) {
            stackIn_15_0 = jc.field_b[param1];
          } else {
            stackIn_15_0 = jc.field_b[-param1 + 4096];
          }
          return stackIn_15_0;
        }
        field_u = (int[]) null;
        if (param1 >= 4096) {
          if (param1 >= 6144) {
            stackIn_9_0 = -jc.field_b[-param1 + 8192];
          } else {
            stackIn_9_0 = -jc.field_b[param1 - 4096];
          }
          return stackIn_9_0;
        }
        if (param1 < 2048) {
          stackIn_5_0 = jc.field_b[param1];
        } else {
          stackIn_5_0 = jc.field_b[-param1 + 4096];
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 73) {
          nf.a((byte) -33);
          if (param2 >= 2) {
            return 2;
          }
          if (param1 < 5) {
            return 0;
          }
          return 1;
        }
        if (param2 >= 2) {
          return 2;
        }
        if (param1 < 5) {
          return 0;
        }
        return 1;
    }

    nf(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_r = param2;
        this.field_s = param3;
        this.field_p = param0;
        this.field_n = param5;
        this.field_t = param1;
        this.field_y = param4;
    }

    static {
        field_w = "No";
        field_o = "Remove friend";
        field_q = new int[12];
        field_x = 0L;
        field_u = new int[8192];
    }
}
