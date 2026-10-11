/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class we {
    int field_f;
    static String field_c;
    static String field_g;
    static String field_e;
    static uf field_b;
    String field_d;
    static String field_a;

    final static void a(byte param0) {
        if (gd.field_f) {
          bb.b(true);
          jd.g(74);
          d.a(true);
          gd.field_f = false;
          if (param0 <= 46) {
            we.a(true);
            return;
          }
          return;
        }
        if (param0 > 46) {
          return;
        }
        we.a(true);
    }

    final static ck[] a(ji param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        ck[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gb.a(param3, param0, param2, 115)) {
            return null;
          }
          if (param1 >= -123) {
            we.a((byte) 55);
          }
          stackIn_6_0 = de.c(false);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("we.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 2) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_d, this.field_f);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 != -37) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          var1_int = param0 ? 1 : 0;
          while (ab.$cfr$intArgs$c$a284cb190b53(114)) {
            wj.field_Jb.a(-38);
            if (!wj.field_Jb.b((byte) 114)) {
              continue;
            }
            var1_int = 1;
          }
          wj.field_Jb.a(pm.a(pm.field_f, -2141435999, bh.field_g), -20563, pm.a(nf.field_h, -2141435999, he.field_S));
          if (wj.field_Jb.b((byte) 114)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            wj.field_Jb.field_h >= 0) {
            var2 = ef.field_T[wj.field_Jb.field_h];
            if (var2 == 2) {
              ek.g(-1209);
            }
          }
          stackIn_14_0 = var2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "we.C(" + param0 + ')');
        }
    }

    static {
        field_e = "<%0> players want to draw. Hold 'F1' for details.";
        field_c = "achievements to collect";
        field_g = "Rematch!";
        field_a = "EXCLUSIVE";
    }
}
