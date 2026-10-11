/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends w implements oh {
    static wma field_i;
    static int[] field_o;
    private boolean field_k;
    private vi field_n;
    private vr field_j;
    private int field_l;
    private vr field_m;

    wi(vr param0, vr param1, vr param2, int param3, boolean param4) {
        super(param1, param0, param2);
        this.field_k = false;
        this.field_l = 50;
        try {
          this.field_l = param3;
          this.field_j = param0;
          this.field_k = param4 ? true : false;
          this.field_m = param2;
          this.field_n = new vi(this.field_l);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int[] a(boolean param0, int param1, float param2) {
        cg var4;
        cg stackIn_6_0;
        Object stackIn_6_1;
        vr stackIn_6_2;
        float stackIn_6_3;
        Object stackIn_7_1;
        boolean stackIn_8_4 = false;
        Object stackIn_6_1Lifetime1;
        if (!param0) {
          return (int[]) null;
        }
        var4 = this.d((byte) 97, param1);
        if (var4 == null) {
          return null;
        }
        boolean decompiledFrameRemainder0 = true;
        stackIn_6_0 = var4;
        stackIn_6_1 = this;
        stackIn_6_2 = this.field_m;
        stackIn_6_3 = param2;
        if (!this.field_k) {
          stackIn_7_1 = this;
          if (!this.c(param1, 0).field_d) {
            stackIn_8_4 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_6_1Lifetime1 = this;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_8_4 = true;
        }
        return ((cg) (Object) stackIn_6_0).a((q) (this), stackIn_6_2, stackIn_6_3, stackIn_8_4);
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        lb.field_w = param2;
        if (param3 != -68) {
          return;
        }
        try {
          dk.field_p = param1;
          uv.a(false, oc.field_m, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wi.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final cg d(byte param0, int param1) {
        cg var3 = (cg) (this.field_n.a(126, (long)param1));
        if (var3 != null) {
          return var3;
        }
        byte[] var4 = this.field_j.b(-54, param1, 0);
        if (var4 != null) {
          var3 = new cg(new lu(var4));
          this.field_n.a(var3, (long)param1, 83);
          int var5 = -80 / ((param0 + 37) / 48);
          return var3;
        }
        return null;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_i = null;
        if (!param0) {
          field_i = (wma) null;
        }
    }

    public final int a(int param0, int param1) {
        if (param0 != 6) {
          return 96;
        }
        return this.c(param1, param0 ^ 6).field_b;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (gf.field_k == 13) {
          lc.b(-1);
          return true;
        }
        if (gf.field_k == 102) {
          da.field_d.f((byte) -118);
          return true;
        }
        if (param0 < 71) {
          return false;
        }
        if (null == da.field_d) {
          return false;
        }
        if (da.field_d.b(param2, -19044, param1)) {
          return true;
        }
        return false;
    }

    public final boolean b(byte param0, int param1) {
        if (param0 <= 103) {
          this.d(80, -10);
          if (this.field_k) {
            return true;
          }
          if (!this.c(param1, 0).field_d) {
            return false;
          }
          return true;
        }
        if (this.field_k) {
          return true;
        }
        if (!this.c(param1, 0).field_d) {
          return false;
        }
        return true;
    }

    public final int a(byte param0, int param1) {
        int var3 = -11 % ((param0 - 45) / 57);
        return 65535 & this.c(param1, 0).field_g;
    }

    public final boolean b(int param0, int param1) {
        if (param0 == -23316) {
          return !this.c(param1, 0).field_f ? true : false;
        }
        field_o = (int[]) null;
        return !this.c(param1, 0).field_f ? true : false;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param0.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("D")) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (param0.equals("C")) {
            stackIn_26_0 = Character.TYPE;
            return stackIn_26_0;
          }
          var2_int = -51 / ((35 - param1) / 33);
          stackIn_28_0 = Class.forName(param0);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("wi.O(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final on d(int param0, int param1) {
        cg var3 = null;
        cg var3Lifetime1;
        if (param1 != -23060) {
          String var4 = (String) null;
          wi.a(true, (String) null, (String) null, (byte) 43);
          var3 = this.d((byte) 28, param0);
          if (var3 != null) {
            return var3.field_q;
          }
          return null;
        }
        var3Lifetime1 = this.d((byte) 28, param0);
        if (var3Lifetime1 != null) {
          return var3Lifetime1.field_q;
        }
        return null;
    }

    static {
        field_o = new int[]{2, 20, 21, 6, 5, 9};
    }
}
