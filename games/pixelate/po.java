/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class po {
    static String field_e;
    static ak field_c;
    static String field_j;
    private nl field_g;
    private fm field_i;
    static po field_d;
    static bb field_b;
    static String field_f;
    private fm field_a;
    private nl field_h;

    private final sp a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sp var8 = null;
        qd var9 = null;
        sp stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        sp stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        sp var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 << 4 & param0 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (sp) (this.field_h.a(-25484, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (qd) (this.field_g.a(-25484, var6));
          if (var9 == null) {
            var9 = qd.a(this.field_i, param3, param2);
            if (var9 == null) {
              return null;
            }
            this.field_g.a(var6, param0 ^ 65420, var9);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            stackIn_14_0 = null;
            return (sp) (stackIn_14_0);
          }
          var9.c(2779);
          this.field_h.a(var6, param0 ^ 65423, var8Lifetime1);
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("po.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final sp a(byte param0, int[] param1, int param2) {
        sp discarded$1 = null;
        RuntimeException var4 = null;
        String var5 = null;
        sp stackIn_3_0 = null;
        sp stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_i.b((byte) -89)) {
            stackIn_3_0 = this.a(65521, param1, param2, 0);
            return stackIn_3_0;
          }
          if (this.field_i.b(param2, (byte) 100) == 1) {
            stackIn_7_0 = this.a(65521, param1, 0, param2);
            return stackIn_7_0;
          }
          if (param0 > -39) {
            var5 = (String) null;
            discarded$1 = this.a((String) null, (int[]) null, (String) null, -73);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("po.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final sp a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sp var8 = null;
        np var9 = null;
        sp var10 = null;
        sp stackIn_5_0 = null;
        sp stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        sp var8Lifetime1;
        try {
          var5_int = param1 ^ ((param3 & -1342173185) << 4 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          if (param0 != 0) {
            field_j = (String) null;
          }
          var6 = (long)var5_int;
          var8 = (sp) (this.field_h.a(param0 - 25484, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var9 = np.a(this.field_a, param3, param1);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_h.a(var6, param0 ^ 127, var8Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var10.field_n.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("po.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final sp a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        sp stackIn_2_0 = null;
        sp stackIn_5_0 = null;
        sp stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a.b((byte) 98) == 1) {
            stackIn_2_0 = this.a(0, param0, param1, 0);
            return stackIn_2_0;
          }
          if (param2 != 106) {
            stackIn_5_0 = (sp) null;
            return stackIn_5_0;
          }
          if (1 != this.field_a.b(param0, (byte) 27)) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(0, 0, param1, param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("po.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final sp a(boolean param0, String param1, String param2) {
        RuntimeException var4 = null;
        sp stackIn_2_0 = null;
        sp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = this.a(param2, (int[]) null, param1, -86);
            return stackIn_4_0;
          }
          stackIn_2_0 = (sp) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("po.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          field_c = (ak) null;
          if (!un.field_l) {
            return;
          }
          mj.a(false);
          return;
        }
        if (un.field_l) {
          mj.a(false);
          return;
        }
    }

    final static String a(int param0, long param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        pe.field_a.setTime(new Date(param1));
        int var3 = pe.field_a.get(7);
        int var4 = pe.field_a.get(5);
        if (param0 == 10) {
          var5 = pe.field_a.get(2);
          var6 = pe.field_a.get(1);
          var7 = pe.field_a.get(11);
          var8 = pe.field_a.get(12);
          var9 = pe.field_a.get(13);
          return eh.field_g[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ib.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        po.a(true);
        var5Lifetime1 = pe.field_a.get(2);
        var6Lifetime1 = pe.field_a.get(1);
        var7Lifetime1 = pe.field_a.get(11);
        var8Lifetime1 = pe.field_a.get(12);
        var9Lifetime1 = pe.field_a.get(13);
        return eh.field_g[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ib.field_c[var5Lifetime1] + "-" + var6Lifetime1 + " " + var7Lifetime1 / 10 + var7Lifetime1 % 10 + ":" + var8Lifetime1 / 10 + var8Lifetime1 % 10 + ":" + var9Lifetime1 / 10 + var9Lifetime1 % 10 + " GMT";
    }

    private final sp a(String param0, int[] param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sp stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        sp stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -4) {
            stackIn_2_0 = (sp) null;
            return stackIn_2_0;
          }
          var5_int = this.field_a.a(118, param0);
          if (var5_int < 0) {
            stackIn_5_0 = null;
            return (sp) (stackIn_5_0);
          }
          var6 = this.field_a.a((byte) -117, param2, var5_int);
          if (var6 < 0) {
            return null;
          }
          stackIn_10_0 = this.a(0, var6, param1, var5_int);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("po.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = -1 % ((param0 + 33) / 41);
        field_e = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_j = null;
        field_c = null;
    }

    po(fm param0, fm param1) {
        this.field_g = new nl(256);
        this.field_h = new nl(256);
        try {
          this.field_i = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "po.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Level: ";
        field_e = "Pixelate";
        field_f = "Reject <%0> from this game";
        field_b = new bb();
    }
}
