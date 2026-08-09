/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kpa {
    static boolean field_c;
    static String field_b;
    static String field_d;
    private boolean[] field_a;

    final void a(int[] param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = param0;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                var5 = var7[var4];
                this.field_a[var5] = true;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("kpa.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    kpa(int param0, int param1, kh param2) {
        this(param0);
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            var4_int = param2.b((byte) 44, param0);
            var5 = param0 - 1;
            L1: while (true) {
              if (0 > var5) {
                break L0;
              } else {
                L2: {
                  if (-1 <= (1 & var4_int ^ -1)) {
                    break L2;
                  } else {
                    this.field_a[var5] = true;
                    var4_int--;
                    break L2;
                  }
                }
                var4_int = var4_int >> 1;
                var5--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("kpa.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param1 != -17075) {
            return;
        }
        this.field_a[param0] = param2;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; this.field_a.length > var3; var3++) {
            this.field_a[var3] = param0;
        }
        if (param1 < 62) {
            this.field_a = (boolean[]) null;
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 != 0) {
            kpa.a(116);
        }
        return this.field_a[param1];
    }

    final void a(kh param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        try {
            if (param1 > -113) {
                this.toString();
            }
            var3_int = 0;
            for (var4 = 0; this.field_a.length > var4; var4++) {
                var3_int = var3_int << 1;
                if (this.field_a[var4]) {
                    var3_int++;
                }
            }
            param0.a((byte) 112, var3_int, this.field_a.length);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kpa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        String var1;
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = "flags:";
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_a.length) {
            return var1;
          } else {
            if (!this.field_a[var2]) {
              var1 = var1 + "0";
              var2++;
              continue L0;
            } else {
              var1 = var1 + "1";
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 <= 57) {
            field_b = (String) null;
        }
        field_d = null;
        field_b = null;
    }

    kpa(int param0) {
        this.field_a = new boolean[param0];
    }

    static {
        field_b = "Shortcut Reference";
        field_c = false;
        field_d = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
