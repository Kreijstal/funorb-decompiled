/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class al {
    int field_a;
    String field_b;

    final static boolean a(ad param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 19) {
            stackIn_4_0 = param0.b(0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("al.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, byte param1) {
        int var2;
        int var4;
        int var5;
        int var3;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = -50 / ((param1 + 40) / 48);
        var4 = aa.field_a;
        if (var4 == 1) {
          ib.field_b.a(0, 0);
          var4 = (int)(20.0f * ia.a(true, (float)param0 * 0.009999999776482582f)) + 70;
          m.field_k.b(0, 0, var4);
          return;
        }
        if (var4 != 2) {
          if (var4 != 3) {
            return;
          }
          tj.field_a.c(0, 0);
          return;
        }
        ne.field_a[1].b(0, 0);
        var3 = 50 + (int)(ia.a(true, 0.14000000059604645f * (float)param0) * 30.0f + 10.0f * ha.a((byte) 51, (float)param0 * 0.11999999731779099f));
        ne.field_a[0].b(0, 0, var3);
        ge.h(80, 0, 560, 480);
        ik.field_p[i.field_n].b(100, 0, 70);
        cl.field_c[sk.field_G].b(0, 0, 100);
        ge.b();
        return;
    }

    final static String a(char param0, int param1, int param2) {
        char[] var6 = null;
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 == 12663) {
          var6 = new char[param1];
          char[] var3 = var6;
          for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = param0;
          }
          return new String(var6);
        }
        return (String) null;
    }

    final static void a(byte param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (param0 != -71) {
            al.a('ﾑ', -120, -100);
          }
          if (null != ol.field_g && (0 > param1 ||
            dk.field_h == wh.field_b)) {
            if (gf.field_c.field_h == 0 &&
              10000L + qg.field_d < pf.a(0)) {
              gf.field_c.b(true, param1);
            }
            if (0 < gf.field_c.field_h) {
              try {
                ol.field_g.a(gf.field_c.field_g, 0, (byte) 122, gf.field_c.field_h);
                qg.field_d = pf.a(param0 + 71);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                gk.a(-1);
              }
              gf.field_c.field_h = 0;
            }
            return;
          }
          gf.field_c.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0) {
        if (param0 != 113) {
          al.a(-92, (byte) 8);
          return fd.field_s;
        }
        return fd.field_s;
    }

    final static void c(byte param0) {
        int var1 = pf.a((byte) -92, 3);
        cj.a((byte) 108, ke.field_h[25 + var1]);
        if (param0 > -80) {
          return;
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 >= 120) {
          return new java.net.Socket(this.field_b, this.field_a);
        }
        this.field_a = 127;
        return new java.net.Socket(this.field_b, this.field_a);
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!param2) {
            stackIn_3_0 = -124;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (param1 > 1) {
            if (0 != (param1 & 1)) {
              var3_int = var3_int * param0;
            }
            param1 = param1 >> 1;
            param0 = param0 * param0;
          }
          if (param1 != 1) {
            stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          stackIn_13_0 = param0 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "al.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
