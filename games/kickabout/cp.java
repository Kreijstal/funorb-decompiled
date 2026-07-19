/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp implements Runnable {
    static r field_h;
    static String field_a;
    static hd field_g;
    volatile boolean field_c;
    volatile boolean field_e;
    bu field_f;
    static long[] field_d;
    volatile uh[] field_b;

    final static wn a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        wn stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wn stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var2_int = 16 / ((param0 - 46) / 47);
            if (mj.field_a != nr.field_f) {
              L1: {
                if (mj.field_a != cr.field_d) {
                  break L1;
                } else {
                  if (param1.equals(pr.field_c)) {
                    mj.field_a = vj.field_a;
                    stackOut_8_0 = u.field_h;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              mj.field_a = nr.field_f;
              pr.field_c = param1;
              u.field_h = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("cp.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wn) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wn) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        int var1 = 20 % ((param0 - -1) / 41);
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        uh var2 = null;
        int var4 = Kickabout.field_G;
        this.field_c = true;
        try {
            while (!this.field_e) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_b[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.d();
                    }
                }
                aj.a(10L, 1);
                Object var5 = (Object) null;
                si.a((byte) 41, this.field_f, (Object) null);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            bd.a((String) null, (Throwable) ((Object) exception), 1);
        } finally {
            this.field_c = false;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (param0 != 21) {
            return 53;
        }
        int var4 = lw.field_c[param1];
        if (param2 == param3) {
            if (!(param1 != 3)) {
                var4 = 522;
            }
        }
        if (!(-1 != (param2 ^ -1))) {
            var4 = 1344 + -var4;
        }
        return var4;
    }

    final static int a(int param0) {
        al.field_Ab.a(0);
        if (!(gt.field_t.a((byte) -46))) {
            return fw.h((byte) 66);
        }
        if (param0 != 522) {
            field_h = (r) null;
            return 0;
        }
        return 0;
    }

    cp() {
        this.field_b = new uh[2];
        this.field_e = false;
        this.field_c = false;
    }

    static {
        field_a = "The Final has begun";
        field_d = new long[32];
        field_h = new r();
    }
}
