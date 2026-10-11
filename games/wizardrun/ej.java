/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ga field_b;
    static java.applet.Applet field_a;
    static String field_e;
    static int field_d;
    static int field_c;

    public static void a(byte param0) {
        if (param0 == -43) {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
        field_d = -126;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$11 = 0;
        byte[][] fieldTemp$12 = null;
        int fieldTemp$13 = 0;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$10 = 0;
        int fieldTemp$3 = 0;
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime3;
        if (param0 != 100) {
          if (param0 == 5000 &&
            dj.field_d > 0) {
            fieldTemp$11 = dj.field_d - 1;
            dj.field_d = dj.field_d - 1;
            var2_ref_byte__ = wl.field_g[fieldTemp$11];
            wl.field_g[dj.field_d] = null;
            return var2_ref_byte__;
          }
          if (param0 == 30000 &&
            id.field_a > 0) {
            fieldTemp$12 = qh.field_a;
            fieldTemp$13 = id.field_a - 1;
            id.field_a = id.field_a - 1;
            var2_ref_byte__Lifetime4 = fieldTemp$12[fieldTemp$13];
            qh.field_a[id.field_a] = null;
            return var2_ref_byte__Lifetime4;
          }
          if (param1 == 1) {
            if (th.field_a == null) {
              return new byte[param0];
            }
            for (var2 = 0; mj.field_a.length > var2; var2++) {
              if (param0 == mj.field_a[var2] &&
                0 < pe.field_C[var2]) {
                dupTemp$14 = pe.field_C[var2] - 1;
                arrayValue$15 = th.field_a[var2];
                pe.field_C[var2] = dupTemp$14;
                var3 = arrayValue$15[dupTemp$14];
                th.field_a[var2][pe.field_C[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          field_e = (String) null;
          if (th.field_a == null) {
            return new byte[param0];
          }
          for (var2Lifetime3 = 0; mj.field_a.length > var2Lifetime3; var2Lifetime3++) {
            if (param0 == mj.field_a[var2Lifetime3] &&
              0 < pe.field_C[var2Lifetime3]) {
              dupTemp$16 = pe.field_C[var2Lifetime3] - 1;
              arrayValue$17 = th.field_a[var2Lifetime3];
              pe.field_C[var2Lifetime3] = dupTemp$16;
              var3Lifetime3 = arrayValue$17[dupTemp$16];
              th.field_a[var2Lifetime3][pe.field_C[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
          return new byte[param0];
        }
        if (0 < p.field_U) {
          fieldTemp$10 = p.field_U - 1;
          p.field_U = p.field_U - 1;
          var2_ref_byte__Lifetime1 = ec.field_f[fieldTemp$10];
          ec.field_f[p.field_U] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 5000 &&
          dj.field_d > 0) {
          fieldTemp$3 = dj.field_d - 1;
          dj.field_d = dj.field_d - 1;
          var2_ref_byte__Lifetime2 = wl.field_g[fieldTemp$3];
          wl.field_g[dj.field_d] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param0 == 30000 &&
          id.field_a > 0) {
          fieldTemp$4 = qh.field_a;
          fieldTemp$5 = id.field_a - 1;
          id.field_a = id.field_a - 1;
          var2_ref_byte__Lifetime3 = fieldTemp$4[fieldTemp$5];
          qh.field_a[id.field_a] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param1 == 1) {
          if (th.field_a == null) {
            return new byte[param0];
          }
          for (var2Lifetime1 = 0; mj.field_a.length > var2Lifetime1; var2Lifetime1++) {
            if (param0 == mj.field_a[var2Lifetime1] &&
              0 < pe.field_C[var2Lifetime1]) {
              dupTemp$6 = pe.field_C[var2Lifetime1] - 1;
              arrayValue$7 = th.field_a[var2Lifetime1];
              pe.field_C[var2Lifetime1] = dupTemp$6;
              var3Lifetime1 = arrayValue$7[dupTemp$6];
              th.field_a[var2Lifetime1][pe.field_C[var2Lifetime1]] = null;
              return var3Lifetime1;
            }
          }
          return new byte[param0];
        }
        field_e = (String) null;
        if (th.field_a == null) {
          return new byte[param0];
        }
        for (var2Lifetime2 = 0; mj.field_a.length > var2Lifetime2; var2Lifetime2++) {
          if (param0 == mj.field_a[var2Lifetime2] &&
            0 < pe.field_C[var2Lifetime2]) {
            dupTemp$8 = pe.field_C[var2Lifetime2] - 1;
            arrayValue$9 = th.field_a[var2Lifetime2];
            pe.field_C[var2Lifetime2] = dupTemp$8;
            var3Lifetime2 = arrayValue$9[dupTemp$8];
            th.field_a[var2Lifetime2][pe.field_C[var2Lifetime2]] = null;
            return var3Lifetime2;
          }
        }
        return new byte[param0];
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = wizardrun.field_H;
        try {
          var3_int = 1;
          while (param2 > 1) {
            if ((param2 & 1) != 0) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
          }
          if (param2 == 1) {
            stackIn_11_0 = param0 * var3_int;
            return stackIn_11_0;
          }
          if (param1 == -1) {
            stackIn_16_0 = var3_int;
            return stackIn_16_0;
          }
          stackIn_14_0 = -47;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "ej.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new ga();
        field_e = "Loading music";
    }
}
