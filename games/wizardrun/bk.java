/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk implements Runnable {
    static oi field_d;
    vh field_c;
    static vd field_a;
    volatile boolean field_e;
    volatile boolean field_g;
    static o field_b;
    volatile c[] field_f;

    public final void run() {
        int var1_int = 0;
        c var2 = null;
        int var4 = wizardrun.field_H;
        this.field_e = true;
        try {
            while (!this.field_g) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_f[var1_int];
                    if (var2 != null) {
                        var2.e();
                    }
                }
                tg.a(10L, false);
                Object var5 = (Object) null;
                bi.a(this.field_c, (byte) -105, (Object) null);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            rg.a((Throwable) ((Object) exception), (String) null, -562);
        } finally {
            this.field_e = false;
        }
    }

    final static void a(byte[] param0, int param1, boolean param2, File param3) throws IOException {
        FileOutputStream var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              var4 = new FileOutputStream(param3);
              var4.write(param0, 0, param1);
              var4.close();
              if (param2) {
                break L1;
              } else {
                field_d = (oi) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4_ref);

            stackIn_5_1 = new StringBuilder().append("bk.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 2) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    bk() {
        this.field_f = new c[2];
        this.field_g = false;
        this.field_e = false;
    }

    final static void b(int param0) {
        vf var1 = (vf) ((Object) r.field_d.b((byte) 72));
        if (var1 == null) {
            ql.a(-82);
            return;
        }
        mg var2 = nk.field_N;
        var2.i(255);
        int var3 = -11 % ((param0 - 84) / 40);
        var2.i(255);
        var2.i(255);
        var2.i(255);
        var1.a(false);
    }

    static {
        field_d = new oi();
    }
}
