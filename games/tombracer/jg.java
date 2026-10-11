/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jg {
    static uia field_a;

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qda.a((byte) -72, param2)) {
            return false;
          }
          if (eba.a(param2, 6912)) {
            return false;
          }
          if (ld.a(false, param2)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (ne.a(true, param2, param1)) {
            return false;
          }
          if (kv.a((byte) 36, param2, param1)) {
            return false;
          }
          if (jea.a(true, param2, param1)) {
            return false;
          }
          if (param0 < -69) {
            return true;
          }
          var4 = (String) null;
          jg.a(104, (String) null, (String) null);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param2 < 0) {
          return 0;
        }
        if (0 == param0) {
          return 0;
        }
        if (param1 < -41) {
          return param2 + (param0 << 24);
        }
        jg.b((byte) 86);
        return param2 + (param0 << 24);
    }

    abstract void a(float param0, float param1, float param2, int param3, float[] param4, float param5, int param6, int param7, int param8, int param9, int param10);

    final static int a(byte param0) {
        int var1 = 16 / ((73 - param0) / 52);
        return ff.field_w;
    }

    public static void b(byte param0) {
        if (param0 < 125) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = new uia(256);
    }
}
