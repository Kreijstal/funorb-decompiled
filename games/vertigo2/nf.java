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
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1 != null) {
                try {
                  L0: {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                    ci.field_a = 1 + (int)(var3.longValue() / 1048576L);
                    break L0;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                return;
              } else {
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
          if (param2 >= 96) {
            return;
          } else {
            field_q = null;
            return;
          }
        } else {
          if (ib.field_a < param3 + param5) {
            og.a(param4, param1, -1, param3, param5, param6, param0);
            if (param2 >= 96) {
              return;
            } else {
              field_q = null;
              return;
            }
          } else {
            if (ua.field_e > param6 + -param5) {
              og.a(param4, param1, -1, param3, param5, param6, param0);
              if (param2 < 96) {
                field_q = null;
                return;
              } else {
                return;
              }
            } else {
              if (cj.field_D >= param6 - -param5) {
                cl.a(param1, param3, param4, param6, (byte) -40, param5, param0);
                if (param2 < 96) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              } else {
                og.a(param4, param1, -1, param3, param5, param6, param0);
                if (param2 < 96) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_u = null;
        field_w = null;
        if (param0 >= -63) {
          nf.a(-9, 105, (byte) -96, 28, 93, 4, 42);
          field_o = null;
          field_q = null;
          return;
        } else {
          field_o = null;
          field_q = null;
          return;
        }
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -28) {
          if (param1 >= 4096) {
            L0: {
              if (param1 >= 6144) {
                stackOut_18_0 = -jc.field_b[-param1 + 8192];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -jc.field_b[param1 - 4096];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 < 2048) {
                stackOut_14_0 = jc.field_b[param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = jc.field_b[-param1 + 4096];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_u = null;
          if (param1 >= 4096) {
            L2: {
              if (param1 >= 6144) {
                stackOut_8_0 = -jc.field_b[-param1 + 8192];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -jc.field_b[param1 - 4096];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 < 2048) {
                stackOut_4_0 = jc.field_b[param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = jc.field_b[-param1 + 4096];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 >= 73) {
          if (param2 < 2) {
            if (param1 >= 5) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          nf.a((byte) -33);
          if (param2 < 2) {
            if (param1 >= 5) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    nf(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((nf) this).field_r = param2;
        ((nf) this).field_s = param3;
        ((nf) this).field_p = param0;
        ((nf) this).field_n = param5;
        ((nf) this).field_t = param1;
        ((nf) this).field_y = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "No";
        field_o = "Remove friend";
        field_q = new int[12];
        field_x = 0L;
        field_u = new int[8192];
    }
}
