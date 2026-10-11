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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 16 / ((param0 - 46) / 47);
          if (mj.field_a == nr.field_f) {
            stackIn_2_0 = null;
            return (wn) (stackIn_2_0);
          }
          if (mj.field_a == cr.field_d &&
            param1.equals(pr.field_c)) {
            mj.field_a = vj.field_a;
            stackIn_9_0 = u.field_h;
            return stackIn_9_0;
          }
          mj.field_a = nr.field_f;
          pr.field_c = param1;
          u.field_h = null;
          stackIn_7_0 = null;
          return (wn) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("cp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        int var1 = 20 % ((param0 + 1) / 41);
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        uh var2 = null;
        int var4 = Kickabout.field_G;
        this.field_c = true;
        try {
          while (!this.field_e) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
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
        if (param2 == param3 &&
          param1 == 3) {
          var4 = 522;
        }
        if (param2 == 0) {
          var4 = 1344 - var4;
        }
        return var4;
    }

    final static int a(int param0) {
        al.field_Ab.a(0);
        if (!gt.field_t.a((byte) -46)) {
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
