/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac implements gd {
    int field_a;
    static int field_c;
    static int[] field_e;
    static String field_d;
    int field_g;
    static jb field_b;
    static pa[] field_f;

    final static void a(int param0, int param1, oc param2) {
        dl var5 = q.field_p;
        var5.g(43, param0);
        var5.field_g = var5.field_g + 1;
        int var4 = var5.field_g;
        var5.b(-1336879960, 1);
        var5.b(-1336879960, param2.field_k);
        var5.b(-1336879960, param2.field_i);
        var5.a((byte) 97, param2.field_j);
        var5.a((byte) 61, param2.field_l);
        if (param1 != 0) {
          return;
        }
        try {
          var5.a((byte) 90, param2.field_h);
          var5.a((byte) 75, param2.field_f);
          var5.e(var4, 45);
          var5.b(-var4 + var5.field_g, (byte) 76);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ac.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != -28819) {
          field_e = (int[]) null;
        }
    }

    final static mo a(boolean param0, int param1, byte[] param2, jc param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        mo stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (mo) (stackIn_2_0);
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param1, var4_int);
          jaggl.OpenGL.glProgramRawARB(param1, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, ak.field_b, 0);
          if (-1 != ak.field_b[0]) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            stackIn_5_0 = null;
            return (mo) (stackIn_5_0);
          }
          jaggl.OpenGL.glBindProgramARB(param1, 0);
          if (!param0) {
            field_b = (jb) null;
          }
          stackIn_9_0 = new mo(param3, param1, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ac.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ac(int param0, int param1) {
        this.field_g = param1;
        this.field_a = param0;
    }

    final static void a(int param0, int param1, ga param2) {
        dl var7 = null;
        dl var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          var7 = q.field_p;
          var8 = var7;
          var8.g(52, param1);
          var8.field_g = var8.field_g + 1;
          var4 = var8.field_g;
          var8.b(-1336879960, 1);
          var8.a(param2.field_m, 23385);
          var8.a(param2.field_e, 23385);
          var8.a(param2.field_k, 23385);
          var8.a((byte) 34, param2.field_i);
          var8.a((byte) 80, param2.field_g);
          var8.a((byte) 93, param2.field_n);
          var8.a((byte) 113, param2.field_f);
          var8.b(-1336879960, param2.field_h.length);
          for (var5 = param0; param2.field_h.length > var5; var5++) {
            var7.a((byte) 92, param2.field_h[var5]);
          }
          var8.e(var4, param0 + 108);
          var8.b(var8.field_g - var4, (byte) 93);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ac.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[1000];
        field_b = new jb();
    }
}
