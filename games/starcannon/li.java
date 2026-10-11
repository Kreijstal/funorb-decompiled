/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static byte[][] field_a;
    static ue field_b;

    final static void a(hl param0, byte param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = StarCannon.field_A;
        try {
          if ((3 & (param0.field_u | param0.field_v | param0.field_w | param0.field_y)) == 0) {
            return;
          }
          var2_int = (param0.field_w & 3) + param0.field_u;
          var3 = param0.field_v + (3 & param0.field_y);
          var2_int = 4 - ((3 & var2_int) - var2_int);
          var3 = var3 - ((var3 & 3) - 4);
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = (param0.field_w & 3) + var2_int * (param0.field_y & 3);
          for (var7 = 0; param0.field_v > var7; var7++) {
            for (var8 = 0; param0.field_u > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_B[incrementValue$1];
            }
            var6 = var6 + (var2_int - param0.field_u);
          }
          param0.field_y = param0.field_y & -4;
          param0.field_v = var3;
          if (param1 != -100) {
            return;
          }
          param0.field_w = param0.field_w & -4;
          param0.field_B = var4;
          param0.field_u = var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("li.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = (byte[][]) null;
        if (param0 != -23) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0, bf param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        bf var2 = null;
        RuntimeException var2_ref = null;
        bf var3 = null;
        int var4 = 0;
        var4 = StarCannon.field_A;
        try {
          if (param1.field_q != 6 &&
            7 != param1.field_q &&
            param1.field_q != 14 &&
            param1.field_q != 8 &&
            param1.field_q != 9) {
            if (param0 >= -110) {
              field_b = (ue) null;
            }
            if (param1.field_q != 22) {
              kh.field_y.b(63, param1);
              return;
            }
            var2 = fi.field_e;
            while (true) {
              if (var2.field_a instanceof bf) {
                var3 = (bf) (var2.field_a);
                if (var3.field_q == 6 ||
                  var3.field_q == 7 ||
                  var3.field_q == 14 ||
                  var3.field_q == 8 ||
                  var3.field_q == 9) {
                  var2 = var3;
                  continue;
                }
              }
              break;
            }
            ia.a(param1, var2, (byte) 57);
            return;
          }
          ia.a(param1, fi.field_e, (byte) 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_28_0 = var2_ref;
          stackIn_28_1 = new StringBuilder().append("li.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 1392) {
          field_a = (byte[][]) null;
        }
        if (rc.field_d == null) {
          return;
        }
        var1 = rc.field_d;
        synchronized (var1) {
          rc.field_d = null;
        }
    }

    static {
        field_a = new byte[1000][];
    }
}
