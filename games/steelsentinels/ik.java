/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static wk field_g;
    private boolean field_d;
    static int field_e;
    static boolean field_h;
    static int field_b;
    private String field_f;
    static String field_i;
    static int field_c;
    static boolean field_a;

    final String a(int param0) {
        if (param0 != 2134230754) {
            field_i = null;
            return ((ik) this).field_f;
        }
        return ((ik) this).field_f;
    }

    public static void b(int param0) {
        int var1 = 4 / ((param0 - -28) / 39);
        field_g = null;
        field_i = null;
    }

    final static void a(boolean param0) {
        ad.field_j = ck.a(125);
        ag.field_p = new ka();
        ok.a(true, true, -73);
    }

    ik(String param0) {
        this(param0, false);
    }

    final static void a(long param0, int param1, boolean param2) {
        kj var4 = mm.field_g;
        var4.a(param1, (byte) -117);
        var4.field_p = var4.field_p + 1;
        int var5 = var4.field_p;
        var4.a((byte) 115, 6);
        var4.b(-28875, param0);
        var4.b((byte) -92, -var5 + var4.field_p);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = -124 % ((param1 - -65) / 50);
        if ((long)param0 >= 65536L) {
          if (16777216L <= (long)param0) {
            if ((long)param0 >= 268435456L) {
              if ((long)param0 < 1073741824L) {
                return td.field_Xb[param0 >> 22] >> 1;
              } else {
                return td.field_Xb[param0 >> 24];
              }
            } else {
              if ((long)param0 < 67108864L) {
                return td.field_Xb[param0 >> 18] >> 3;
              } else {
                return td.field_Xb[param0 >> 20] >> 2;
              }
            }
          } else {
            if ((long)param0 >= 1048576L) {
              if ((long)param0 < 4194304L) {
                return td.field_Xb[param0 >> 14] >> 5;
              } else {
                return td.field_Xb[param0 >> 16] >> 4;
              }
            } else {
              if ((long)param0 < 262144L) {
                return td.field_Xb[param0 >> 10] >> 7;
              } else {
                return td.field_Xb[param0 >> 12] >> 6;
              }
            }
          }
        } else {
          if ((long)param0 >= 256L) {
            if (4096L <= (long)param0) {
              if ((long)param0 >= 16384L) {
                return td.field_Xb[param0 >> 8] >> 8;
              } else {
                return td.field_Xb[param0 >> 6] >> 9;
              }
            } else {
              if ((long)param0 < 1024L) {
                return td.field_Xb[param0 >> 2] >> 11;
              } else {
                return td.field_Xb[param0 >> 4] >> 10;
              }
            }
          } else {
            if (param0 >= 0) {
              return td.field_Xb[param0] >> 12;
            } else {
              return -1;
            }
          }
        }
    }

    ik(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((ik) this).field_f = param0;
              if (((ik) this).field_f != null) {
                break L1;
              } else {
                ((ik) this).field_f = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((ik) this).field_d = stackIn_6_1 != 0;
            if (((ik) this).field_f.length() != 0) {
              break L0;
            } else {
              ((ik) this).field_d = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ik.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 51) {
            return true;
        }
        return ((ik) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = false;
        field_c = 50;
        field_i = "The invitation has been withdrawn.";
        field_a = false;
        field_b = 3;
    }
}
