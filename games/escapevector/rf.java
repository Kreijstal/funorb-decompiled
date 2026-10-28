/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static boolean field_b;
    static int field_a;

    final static fn a(int param0, int param1) {
        if (dj.field_d == null) {
          return null;
        }
        if (0 == param0) {
          return dj.field_d[0];
        }
        if (param0 == param1) {
          return dj.field_d[1];
        }
        if (param0 == 32768) {
          return dj.field_d[2];
        }
        if (param0 == 49152) {
          return dj.field_d[3];
        }
        return null;
    }

    final static void a(fd param0, int param1, int param2, int param3, fd param4, int param5) {
        hn.field_s = param2;
        gf.field_e = param4;
        fe.field_k = param5;
        en.field_k = param1;
        if (param3 != 3) {
          return;
        }
        try {
          of.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static IndexedSprite a(int param0, IndexedSprite param1, int[] param2) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          IndexedSprite var3 = new IndexedSprite(0, 0, 0);
          if (param0 > -15) {
            field_a = 60;
          }
          var3.field_a = param1.field_a;
          var3.field_k = param1.field_k;
          var3.field_g = param1.field_g;
          var3.field_i = param1.field_i;
          var3.field_l = param2;
          var3.field_h = param1.field_h;
          var3.field_f = param1.field_f;
          var3.field_d = param1.field_d;
          IndexedSprite stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("rf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = true;
        field_a = -1;
    }
}
