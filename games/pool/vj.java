/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    int field_i;
    int field_e;
    static ui field_j;
    static int[] field_a;
    static String field_b;
    static int field_d;
    static boolean[] field_c;
    static String field_g;
    int[] field_h;
    static String field_f;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (this.field_h == null) {
          return 0;
        }
        if (this.field_h.length == 0) {
          return 0;
        }
        if (param0 < -108) {
          for (var3 = 1; this.field_h.length > var3; var3++) {
            if (param1 < this.field_h[var3] + this.field_h[var3 - 1] >> 1) {
              return -1 + var3;
            }
          }
          return this.field_h.length - 1;
        }
        var5 = (String) null;
        vj.a((String) null, (byte) -110, (String) null, 52);
        for (var3Lifetime1 = 1; this.field_h.length > var3Lifetime1; var3Lifetime1++) {
          if (param1 < this.field_h[var3Lifetime1] + this.field_h[var3Lifetime1 - 1] >> 1) {
            return -1 + var3Lifetime1;
          }
        }
        return this.field_h.length - 1;
    }

    final static java.awt.Canvas a(byte param0) {
        if (param0 > -34) {
          return (java.awt.Canvas) null;
        }
        return null == ne.field_u ? pa.field_K : (java.awt.Canvas) ((Object) ne.field_u);
    }

    final static void a(ma param0, byte param1, ma param2) {
        try {
          if (null != param0.field_k) {
            param0.a((byte) -117);
          }
          param0.field_k = param2.field_k;
          if (param1 != -119) {
            field_g = (String) null;
          }
          param0.field_d = param2;
          param0.field_k.field_d = param0;
          param0.field_d.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ij a(String param0, byte param1, String param2, int param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_10_0 = null;
        ij stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18) {
            vj.a((byte) -44);
          }
          if (nd.field_i.c(0)) {
            stackIn_12_0 = gi.a(true, param3, param2, param0);
            return stackIn_12_0;
          }
          var4 = (ij) (nd.field_i.c((byte) -88));
          if (param3 == var4.field_m &&
            var4.field_H <= kg.field_m &&
            var4.field_H + var4.field_B > kg.field_m) {
            kg.field_m = var4.field_H;
          }
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("vj.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, di param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param1.a(param3 ^ 44, param2, param0);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          oa.a(true, var5);
          if (param3 == 121) {
            return true;
          }
          field_b = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("vj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static kf a(byte param0, jg param1) {
        RuntimeException var2 = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -27) {
            field_b = (String) null;
          }
          stackIn_3_0 = mn.a(param0 ^ 24317, nb.b(param1, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 > -9) {
          di var3 = (di) null;
          vj.a(-35, (di) null, 64, (byte) 45);
          if (null != this.field_h) {
            return this.field_h.length == 0 ? 0 : this.field_h[this.field_h.length - 1];
          }
          return 0;
        }
        if (null == this.field_h) {
          return 0;
        }
        if (this.field_h.length != 0) {
          return this.field_h[this.field_h.length - 1];
        }
        return 0;
    }

    public static void b(int param0) {
        field_j = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -27731) {
          vj.b(-11);
        }
    }

    vj(int param0, int param1, int param2) {
        this.field_h = new int[1 + param2];
        this.field_e = param0;
        this.field_i = param1;
    }

    static {
        field_a = new int[8192];
        field_b = "Won";
        field_g = "You are out of lives!";
        field_c = new boolean[112];
        field_f = "That concludes the Basics Tutorial. You can now experiment freely some more on your own, click >> to go to the Eight-ball Tutorial, or press <img=3> to go to the options menu to end the tutorial.";
    }
}
