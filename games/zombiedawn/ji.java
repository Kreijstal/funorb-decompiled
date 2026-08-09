/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String[] field_f;
    static long[] field_c;
    private boolean field_e;
    private String field_b;
    static String field_d;
    static String field_a;

    ji(String param0) {
        this(param0, false);
    }

    final boolean b(int param0) {
        if (param0 != 32) {
            this.a(-113);
            return this.field_e;
        }
        return this.field_e;
    }

    ji(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ji) (this)).field_e = stackIn_4_1 != 0;
              if (this.field_b != null) {
                break L2;
              } else {
                this.field_b = "";
                break L2;
              }
            }
            if (this.field_b.length() == 0) {
              this.field_e = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ji.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        return this.field_b;
    }

    public static void c(int param0) {
        field_a = null;
        int var1 = 78 % ((-75 - param0) / 36);
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static vn[] a(dj param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        vn[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vn[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              if (ph.a(param2, 31043, param3, param0)) {
                stackIn_7_0 = ro.a((byte) 110);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (vn[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ji.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vn[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = new long[32];
        field_a = "Unpacking levels";
    }
}
