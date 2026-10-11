/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    int field_c;
    int[] field_b;
    static ik[] field_d;
    static String field_a;
    static int[] field_e;
    int field_f;

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param1 == -47) {
          param0 = param0 & 8191;
          if (param0 >= 4096) {
            if (param0 < 6144) {
              stackIn_19_0 = -ta.field_b[param0 - 4096];
            } else {
              stackIn_19_0 = -ta.field_b[-param0 + 8192];
            }
            return stackIn_19_0;
          }
          if (param0 < 2048) {
            stackIn_15_0 = ta.field_b[param0];
          } else {
            stackIn_15_0 = ta.field_b[4096 - param0];
          }
          return stackIn_15_0;
        }
        field_d = (ik[]) null;
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          if (param0 < 6144) {
            stackIn_9_0 = -ta.field_b[param0 - 4096];
          } else {
            stackIn_9_0 = -ta.field_b[-param0 + 8192];
          }
          return stackIn_9_0;
        }
        if (param0 < 2048) {
          stackIn_5_0 = ta.field_b[param0];
        } else {
          stackIn_5_0 = ta.field_b[4096 - param0];
        }
        return stackIn_5_0;
    }

    final int b(int param0) {
        if (param0 != 0) {
          return -61;
        }
        if (null == this.field_b) {
          return 0;
        }
        if (this.field_b.length != 0) {
          return this.field_b[this.field_b.length - 1];
        }
        return 0;
    }

    final int b(int param0, byte param1) {
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (null == this.field_b) {
          return 0;
        }
        if (0 == this.field_b.length) {
          return 0;
        }
        var3 = 1;
        if (param1 != -85) {
          return -105;
        }
        while (this.field_b.length > var3) {
          if (param0 < this.field_b[var3 - 1] + this.field_b[var3] >> 1) {
            return -1 + var3;
          }
          var3++;
        }
        return this.field_b.length - 1;
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 == 20300) {
          field_a = null;
          field_e = null;
          return;
        }
        va.a(92, (byte) -42);
        field_a = null;
        field_e = null;
    }

    va(int param0, int param1, int param2) {
        this.field_f = param1;
        this.field_c = param0;
        this.field_b = new int[param2 + 1];
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = fk.field_e.a("", -1, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("va.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 < 70) {
          field_a = (String) null;
          return 1;
        }
        return 1;
    }

    static {
        field_a = "Move to the indicated square and push the block to the right.";
        field_d = new ik[13];
    }
}
